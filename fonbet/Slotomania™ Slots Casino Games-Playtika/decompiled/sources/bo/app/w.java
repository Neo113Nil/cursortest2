package bo.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\f"}, d2 = {"Lbo/app/w;", "", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "Landroid/net/ConnectivityManager;", "connectivityManager", "Lbo/app/q3;", Constants.BRAZE_PUSH_CONTENT_KEY, "Landroid/net/NetworkCapabilities;", "networkCapabilities", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class w {
    public static final w a = new w();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unexpected system broadcast received [" + ((Object) this.b) + AbstractJsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
        }
    }

    private w() {
    }

    @JvmStatic
    public static final q3 a(Intent intent, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        String action = intent.getAction();
        if (!Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, new a(action), 2, (Object) null);
            return q3.NONE;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return q3.NONE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return (type == 1 || type == 6) ? q3.GREAT : type != 9 ? q3.NONE : q3.GOOD;
            }
            int subtype = activeNetworkInfo.getSubtype();
            return subtype != 3 ? (subtype == 13 || subtype == 20) ? q3.GREAT : q3.BAD : q3.GOOD;
        } catch (SecurityException e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, b.b);
            return q3.NONE;
        }
    }

    @JvmStatic
    public static final q3 a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return q3.NONE;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return q3.GREAT;
        }
        if (min > 4000) {
            return q3.GOOD;
        }
        return q3.BAD;
    }
}
