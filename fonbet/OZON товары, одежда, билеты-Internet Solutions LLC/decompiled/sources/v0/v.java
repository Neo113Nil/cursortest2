package v0;

import B1.m0;
import e1.InterfaceC6250b;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10573B;

/* loaded from: classes.dex */
public final class v extends AbstractC10159D {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f101583d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC10573B f101584e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f101585f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f101586g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b.InterfaceC0966b f101587h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b.c f101588i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f101589j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f101590k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ long f101591l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ I f101592m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(long j11, boolean z11, o oVar, InterfaceC10573B interfaceC10573B, int i11, int i12, InterfaceC6250b.InterfaceC0966b interfaceC0966b, InterfaceC6250b.c cVar, int i13, int i14, long j12, I i15) {
        super(j11, z11, oVar, interfaceC10573B);
        this.f101583d = z11;
        this.f101584e = interfaceC10573B;
        this.f101585f = i11;
        this.f101586g = i12;
        this.f101587h = interfaceC0966b;
        this.f101588i = cVar;
        this.f101589j = i13;
        this.f101590k = i14;
        this.f101591l = j12;
        this.f101592m = i15;
    }

    @Override // v0.AbstractC10159D
    @NotNull
    public final C10158C b(int i11, @NotNull Object obj, Object obj2, @NotNull List<? extends m0> list, long j11) {
        int i12 = i11 == this.f101585f + (-1) ? 0 : this.f101586g;
        return new C10158C(i11, list, this.f101583d, this.f101587h, this.f101588i, this.f101584e.getLayoutDirection(), this.f101589j, this.f101590k, i12, this.f101591l, obj, obj2, this.f101592m.s(), j11);
    }
}
