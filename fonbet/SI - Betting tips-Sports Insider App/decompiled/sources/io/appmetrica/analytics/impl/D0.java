package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class D0 {
    public static B6 a(Handler handler, C0 c02) {
        return new B6(handler, c02);
    }

    public static Bf a(Context context, B6 b62) {
        return new Bf(context, b62);
    }

    public static C0585wi a(Bf bf2, Context context, ICommonExecutor iCommonExecutor) {
        C0393p0 c0393p0 = new C0393p0(context, iCommonExecutor);
        return new C0585wi(c0393p0, new Sn(new C0304lb()), new F4(bf2), new Yj(context, c0393p0));
    }

    public static Ol a(Context context, C0585wi c0585wi, Ve ve2, Handler handler) {
        return new Ol(c0585wi, new Wl(context, ve2), handler);
    }

    public static C0258jg a(C0585wi c0585wi, Ve ve2, Handler handler) {
        return new C0258jg(c0585wi, ve2, handler, ve2.s());
    }

    public static C0260ji a(Context context, Bf bf2, C0585wi c0585wi, Handler handler, Ol ol) {
        return new C0260ji(context, bf2, c0585wi, handler, ol);
    }

    public static C0075cd a(Context context) {
        return new C0075cd(C0040b4.l().f13374c.a(), C0040b4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
