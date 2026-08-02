package v50;

import android.view.MotionEvent;
import android.view.View;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import na.C8479b;
import org.jetbrains.annotations.NotNull;

/* renamed from: v50.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10249B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super View, Unit> f102291a = new M60.b(1);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Function1<? super View, Unit> f102292b = new C8479b(1);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Function1<? super MotionEvent, Unit> f102293c = new y();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC6511n<? super MotionEvent, ? super Boolean, ? super Boolean, Unit> f102294d = new z();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private InterfaceC6511n<? super View, ? super Boolean, ? super Boolean, Unit> f102295e = new C10248A();

    /* renamed from: f, reason: collision with root package name */
    private float f102296f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f102297g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f102298h;

    @NotNull
    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnTouchListener(new D(view, this.f102291a, this.f102292b, this.f102293c, this.f102294d, this.f102295e, this.f102296f, this.f102297g, this.f102298h));
    }

    @NotNull
    public final void b(@NotNull Ca.D callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f102295e = callback;
    }

    @NotNull
    public final void c(@NotNull E90.h callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f102292b = callback;
    }

    @NotNull
    public final void d(@NotNull Ca.E callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f102294d = callback;
    }

    @NotNull
    public final void e(@NotNull g callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f102291a = callback;
    }

    @NotNull
    public final void f(@NotNull h callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f102293c = callback;
    }

    @NotNull
    public final void g(boolean z11) {
        this.f102298h = z11;
    }

    @NotNull
    public final void h() {
        this.f102297g = 0.25f;
    }

    @NotNull
    public final void i() {
        this.f102296f = 0.25f;
    }
}
