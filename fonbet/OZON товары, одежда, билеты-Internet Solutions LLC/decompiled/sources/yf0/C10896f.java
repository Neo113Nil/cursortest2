package yf0;

import Kf0.a;
import Sc.InterfaceC4008j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xf0.C10771a;
import zf0.k;

/* renamed from: yf0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10896f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wf0.b f106594a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106595b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<k> f106596c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106597d;

    public C10896f(@NotNull wf0.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f106594a = config;
        this.f106595b = Sc.k.b(new C10891a(this));
        this.f106596c = Sc.k.b(new C10894d(this));
        this.f106597d = Sc.k.b(new C10895e(this));
    }

    public static final Lf0.b a(C10896f c10896f) {
        return (Lf0.b) c10896f.f106595b.getValue();
    }

    public static final Jf0.b b(C10896f c10896f) {
        c10896f.getClass();
        a.C0305a c0305a = Kf0.a.f15945f;
        Ld0.c limbDiStore = c10896f.f106594a.getLimbDiStore();
        c0305a.getClass();
        return a.C0305a.a(limbDiStore).h();
    }

    public static final C10771a c(C10896f c10896f) {
        return new C10771a(c10896f.f106594a.getLimbDiStore());
    }

    public static final Af0.a e(C10896f c10896f) {
        c10896f.getClass();
        a.C0305a c0305a = Kf0.a.f15945f;
        Ld0.c limbDiStore = c10896f.f106594a.getLimbDiStore();
        c0305a.getClass();
        return a.C0305a.a(limbDiStore).g();
    }

    @NotNull
    public final wf0.b f() {
        return this.f106594a;
    }

    @NotNull
    public final k g() {
        return this.f106596c.getValue();
    }

    @NotNull
    public final wf0.d h() {
        return (wf0.d) this.f106597d.getValue();
    }
}
