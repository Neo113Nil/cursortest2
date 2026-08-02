package com.ironsource;

import android.content.Context;
import com.ironsource.Ve;

/* loaded from: classes13.dex */
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

    InterfaceC4652y7 a();

    String a(Context context);

    void a(long j, Ve.a aVar);

    void a(De de);

    void a(F1 f1);

    void a(Runnable runnable);

    void a(Runnable runnable, long j);

    void a(String str, String str2);

    void b();

    void b(Runnable runnable);

    boolean b(Context context);

    C4243ba c();

    String c(Context context);

    void c(Runnable runnable);

    void d(Runnable runnable);

    boolean d();

    void e();

    void f();

    U9 g();
}
