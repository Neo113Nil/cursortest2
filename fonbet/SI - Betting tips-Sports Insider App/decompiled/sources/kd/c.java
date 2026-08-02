package kd;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.u0;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.y;
import gf.k;
import gf.t;
import gf.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.f;
import org.json.JSONObject;
import rc.b0;
import rc.m;
import rc.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final u f19007d = new u("SimplePush", "Simple notice", "Simple notice");

    /* renamed from: a, reason: collision with root package name */
    public final t f19008a = k.b(new id.a(5));

    /* renamed from: b, reason: collision with root package name */
    public final t f19009b = k.b(new id.a(6));

    /* renamed from: c, reason: collision with root package name */
    public final t f19010c = k.b(new id.a(7));

    public static y c() {
        return new y("BasePush");
    }

    public static void h(int i5, long j) {
        c0.t(MyApp.f6830c, c(), null, new b(j, i5, null), 2);
    }

    public PendingIntent a(Intent intent, Context context) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(context, "context");
        ((jd.a) this.f19008a.getValue()).getClass();
        return jd.a.b(context, intent);
    }

    public u b() {
        return f19007d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer d(JSONObject json) {
        Integer num;
        String optString;
        Intrinsics.checkNotNullParameter(json, "json");
        Continuation continuation = null;
        try {
            optString = json.optString("push_id", "null");
        } catch (Exception unused) {
        }
        if (Intrinsics.areEqual(optString, "null")) {
            num = null;
            if (num != null) {
                return null;
            }
            int intValue = num.intValue();
            ((ed.b) this.f19009b.getValue()).getClass();
            f fVar = new f(6);
            if (intValue >= 1) {
                c0.t(MyApp.f6830c, f.k(), null, new cd.f(fVar, intValue, continuation, 1), 2);
            }
            return num;
        }
        Intrinsics.checkNotNull(optString);
        num = StringsKt.toIntOrNull(optString);
        if (num != null) {
        }
    }

    public final void e(int i5, PendingIntent pendingIntent, String pushTitle, String pushText, Context context, boolean z5, boolean z7, String str, int i10, PendingIntent pendingIntent2) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(pushTitle, "pushTitle");
        Intrinsics.checkNotNullParameter(pushText, "pushText");
        Intrinsics.checkNotNullParameter(context, "context");
        c0.t(MyApp.f6830c, c(), null, new a(this, i5, pendingIntent, pushTitle, pushText, context, z5, z7, str, i10, pendingIntent2, null), 2);
    }

    public final void f(String str, String clickAction) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        ed.b bVar = (ed.b) this.f19009b.getValue();
        String channel = (String) b().f10039a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        c0.t(MyApp.f6830c, b0.b(), null, new u0(bVar, channel, str, clickAction, (Continuation) null, 3), 2);
    }

    public Object g(a aVar) {
        r rVar = (r) this.f19010c.getValue();
        rVar.getClass();
        lg.e eVar = m0.f9201a;
        return c0.A(lg.d.f20063c, new m(rVar, null, 3), aVar);
    }
}
