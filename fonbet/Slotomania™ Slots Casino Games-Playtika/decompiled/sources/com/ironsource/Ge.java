package com.ironsource;

import android.content.Context;
import com.ironsource.Ve;

/* loaded from: classes4.dex */
public interface Ge {
    static /* synthetic */ void a(Ge ge, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        ge.a(runnable, j);
    }

    Ve a(Context context, String str);

    InterfaceC2738x7 a();

    String a(Context context);

    void a(long j, Ve.a aVar);

    void a(De de2);

    void a(F1 f1);

    void a(AbstractRunnableC2512ke abstractRunnableC2512ke);

    void a(AbstractRunnableC2512ke abstractRunnableC2512ke, long j);

    void a(Runnable runnable);

    void a(Runnable runnable, long j);

    void a(String str, String str2);

    void b();

    void b(Runnable runnable);

    boolean b(Context context);

    C2329aa c();

    String c(Context context);

    void c(Runnable runnable);

    void d(Runnable runnable);

    boolean d();

    void e();

    void e(Runnable runnable);

    void f();

    T9 g();

    static /* synthetic */ void a(Ge ge, AbstractRunnableC2512ke abstractRunnableC2512ke, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        ge.a(abstractRunnableC2512ke, j);
    }
}
