package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\n\u0010\f¨\u0006\u0015"}, d2 = {"Lbo/app/e5;", "", "", "toString", "", "hashCode", "other", "", "equals", InAppPurchaseMetaData.KEY_SIGNATURE, Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getSignature$annotations", "()V", "Landroid/content/Context;", "context", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class e5 {
    public static final a e = new a(null);
    private final Context a;
    private final String b;
    private final String c;
    private final SharedPreferences d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lbo/app/e5$a;", "", "", "CACHED_SIGNATURE_KEY", "Ljava/lang/String;", "FILE_PREFIX", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Setting signature to: ", this.b);
        }
    }

    public e5(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.sdk_auth_cache", StringUtils.getCacheFileSuffix(context, str, str2)), 0);
    }

    public final String a() {
        return this.d.getString("auth_signature", null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) other;
        return Intrinsics.areEqual(this.a, e5Var.a) && Intrinsics.areEqual(this.b, e5Var.b) && Intrinsics.areEqual(this.c, e5Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SdkAuthenticationCache(context=" + this.a + ", userId=" + ((Object) this.b) + ", apiKey=" + ((Object) this.c) + ')';
    }

    public final void a(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(str), 2, (Object) null);
        this.d.edit().putString("auth_signature", str).apply();
    }
}
