package dj;

import android.content.Intent;
import androidx.activity.ActivityC5043j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import dj.j;
import g.AbstractC6592d;
import g.C6589a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.h;

/* renamed from: dj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6205b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6592d<Intent> f61637a;

    /* renamed from: b, reason: collision with root package name */
    private Function1<? super j, Unit> f61638b;

    /* renamed from: c, reason: collision with root package name */
    private String f61639c;

    public static void a(C6205b c6205b, C6589a c6589a) {
        int b11 = c6589a.b();
        if (b11 == 102 || b11 == 103) {
            Function1<? super j, Unit> function1 = c6205b.f61638b;
            if (function1 != null) {
                function1.invoke(new j.c(k.HUAWEI));
                return;
            }
            return;
        }
        if (b11 == 108) {
            Function1<? super j, Unit> function12 = c6205b.f61638b;
            if (function12 != null) {
                function12.invoke(new j.a(0));
                return;
            }
            return;
        }
        Function1<? super j, Unit> function13 = c6205b.f61638b;
        if (function13 != null) {
            IllegalStateException error = new IllegalStateException("Не смогли выполнить оценку " + k.HUAWEI + ", ошибка " + c6589a.b());
            Intrinsics.checkNotNullParameter(error, "error");
            function13.invoke(new j.b(new f(error)));
        }
    }

    public final void b(@NotNull Intent intent, Function1<? super j, Unit> function1) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f61638b = function1;
        try {
            AbstractC6592d<Intent> abstractC6592d = this.f61637a;
            if (abstractC6592d != null) {
                abstractC6592d.a(intent);
            }
        } catch (Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            function1.invoke(new j.b(new f(error)));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        sj.d q11 = sj.e.f98817f.q(new sj.a("DevTools", "OzonInAppReview", null));
        if (this.f61639c != null && !owner.getClass().getName().equals(this.f61639c)) {
            h.a.d(q11, ru.ozon.android.ozonLogger.core.c.ERROR, "Observer был подключен для другой activity, запуск appGallery store невозможен", null, null, 12);
            return;
        }
        ActivityC5043j activityC5043j = owner instanceof ActivityC5043j ? (ActivityC5043j) owner : null;
        if (activityC5043j == null) {
            h.a.d(q11, ru.ozon.android.ozonLogger.core.c.ERROR, "Используйте activity типа ComponentActivity)", null, null, 12);
        } else {
            this.f61637a = activityC5043j.registerForActivityResult(new h.j(), new C6204a(this, 0));
            this.f61639c = owner.getClass().getName();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        AbstractC6592d<Intent> abstractC6592d = this.f61637a;
        if (abstractC6592d != null) {
            abstractC6592d.b();
        }
        this.f61637a = null;
    }
}
