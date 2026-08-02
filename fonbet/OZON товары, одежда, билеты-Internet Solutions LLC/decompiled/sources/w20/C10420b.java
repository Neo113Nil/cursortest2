package w20;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.o;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w20.f;
import ze.C11115c;
import ze.EnumC11113a;
import ze.k;
import ze.l;

/* renamed from: w20.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10420b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f103382a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C11115c f103383b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<f> f103384c;

    /* renamed from: w20.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103385a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.DEPENDENCIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.DEBUG_LOCALIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f103385a = iArr;
        }
    }

    public C10420b() {
        C11115c a11 = k.a(Integer.MAX_VALUE, 4, EnumC11113a.SUSPEND);
        this.f103383b = a11;
        this.f103384c = C2399j.H(a11);
    }

    public final void a() {
        if (this.f103383b.b(f.b.f103392a) instanceof l.b) {
            return;
        }
        this.f103382a.clear();
    }

    @NotNull
    public final InterfaceC2395h<f> b() {
        return this.f103384c;
    }

    public final void c(@NotNull g screenType) {
        ComponentCallbacksC5392m fVar;
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        C11115c c11115c = this.f103383b;
        int i11 = a.f103385a[screenType.ordinal()];
        if (i11 == 1) {
            fVar = new R20.f();
        } else if (i11 == 2) {
            fVar = new K20.d();
        } else {
            if (i11 != 3) {
                throw new o();
            }
            fVar = new M20.l();
        }
        if (c11115c.b(new f.c(fVar)) instanceof l.b) {
            return;
        }
        this.f103382a.add(screenType);
    }

    public final void d() {
        ArrayList arrayList = this.f103382a;
        int size = arrayList.size();
        C11115c c11115c = this.f103383b;
        if (size <= 1 && !(c11115c.b(f.b.f103392a) instanceof l.b)) {
            arrayList.clear();
        } else {
            if (c11115c.b(f.a.f103391a) instanceof l.b) {
                return;
            }
        }
    }

    public final void e() {
        this.f103382a.clear();
        c(g.MAIN);
    }
}
