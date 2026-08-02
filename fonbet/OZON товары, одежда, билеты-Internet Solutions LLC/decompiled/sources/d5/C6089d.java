package d5;

import androidx.work.o;
import e5.AbstractC6296c;
import e5.C6294a;
import e5.C6295b;
import e5.C6297d;
import e5.C6298e;
import e5.C6299f;
import e5.C6300g;
import e5.C6301h;
import f5.AbstractC6430h;
import f5.C6425c;
import f5.C6437o;
import g5.C6627B;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6089d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6088c f61167a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC6296c<?>[] f61168b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f61169c;

    public C6089d(@NotNull C6437o trackers, InterfaceC6088c interfaceC6088c) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        AbstractC6430h<Boolean> tracker = trackers.a();
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        C6294a c6294a = new C6294a(tracker);
        C6425c tracker2 = trackers.b();
        Intrinsics.checkNotNullParameter(tracker2, "tracker");
        C6295b c6295b = new C6295b(tracker2);
        AbstractC6430h<Boolean> tracker3 = trackers.d();
        Intrinsics.checkNotNullParameter(tracker3, "tracker");
        C6301h c6301h = new C6301h(tracker3);
        AbstractC6430h<C6087b> tracker4 = trackers.c();
        Intrinsics.checkNotNullParameter(tracker4, "tracker");
        C6297d c6297d = new C6297d(tracker4);
        AbstractC6430h<C6087b> tracker5 = trackers.c();
        Intrinsics.checkNotNullParameter(tracker5, "tracker");
        C6300g c6300g = new C6300g(tracker5);
        AbstractC6430h<C6087b> tracker6 = trackers.c();
        Intrinsics.checkNotNullParameter(tracker6, "tracker");
        C6299f c6299f = new C6299f(tracker6);
        AbstractC6430h<C6087b> tracker7 = trackers.c();
        Intrinsics.checkNotNullParameter(tracker7, "tracker");
        AbstractC6296c<?>[] constraintControllers = {c6294a, c6295b, c6301h, c6297d, c6300g, c6299f, new C6298e(tracker7)};
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.f61167a = interfaceC6088c;
        this.f61168b = constraintControllers;
        this.f61169c = new Object();
    }

    public final boolean a(@NotNull String workSpecId) {
        AbstractC6296c<?> abstractC6296c;
        boolean z11;
        String str;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f61169c) {
            try {
                AbstractC6296c<?>[] abstractC6296cArr = this.f61168b;
                int length = abstractC6296cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        abstractC6296c = null;
                        break;
                    }
                    abstractC6296c = abstractC6296cArr[i11];
                    if (abstractC6296c.d(workSpecId)) {
                        break;
                    }
                    i11++;
                }
                if (abstractC6296c != null) {
                    o e11 = o.e();
                    str = C6090e.f61170a;
                    e11.a(str, "Work " + workSpecId + " constrained by " + abstractC6296c.getClass().getSimpleName());
                }
                z11 = abstractC6296c == null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public final void b(@NotNull ArrayList workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f61169c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : workSpecs) {
                    if (a(((C6627B) obj).f63799a)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C6627B c6627b = (C6627B) it.next();
                    o e11 = o.e();
                    str = C6090e.f61170a;
                    e11.a(str, "Constraints met for " + c6627b);
                }
                InterfaceC6088c interfaceC6088c = this.f61167a;
                if (interfaceC6088c != null) {
                    interfaceC6088c.f(arrayList);
                    Unit unit = Unit.f71690a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@NotNull ArrayList workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f61169c) {
            InterfaceC6088c interfaceC6088c = this.f61167a;
            if (interfaceC6088c != null) {
                interfaceC6088c.e(workSpecs);
                Unit unit = Unit.f71690a;
            }
        }
    }

    public final void d(@NotNull Iterable<C6627B> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f61169c) {
            try {
                for (AbstractC6296c<?> abstractC6296c : this.f61168b) {
                    abstractC6296c.g(null);
                }
                for (AbstractC6296c<?> abstractC6296c2 : this.f61168b) {
                    abstractC6296c2.e(workSpecs);
                }
                for (AbstractC6296c<?> abstractC6296c3 : this.f61168b) {
                    abstractC6296c3.g(this);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f61169c) {
            try {
                for (AbstractC6296c<?> abstractC6296c : this.f61168b) {
                    abstractC6296c.f();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
