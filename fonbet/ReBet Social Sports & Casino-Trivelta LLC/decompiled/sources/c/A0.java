package c;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.twilio.voice.PublisherMetadata;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26369a;

    public A0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26369a = context;
    }

    public final Map a() {
        String str = "";
        Pair pair = TuplesKt.to(PublisherMetadata.OS_VERSION, Build.VERSION.RELEASE);
        Pair pair2 = TuplesKt.to("sdk_int", Integer.valueOf(Build.VERSION.SDK_INT));
        try {
            String string = Settings.Secure.getString(this.f26369a.getContentResolver(), "android_id");
            if (string != null) {
                str = string;
            }
        } catch (Exception unused) {
        }
        return MapsKt.mapOf(pair, pair2, TuplesKt.to("android_id", str), TuplesKt.to("timezone", TimeZone.getDefault().getID()));
    }
}
