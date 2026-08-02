package u4;

import D1.i;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6503i implements InterfaceC6492C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f66104a;

    /* renamed from: b, reason: collision with root package name */
    public Long f66105b;

    /* renamed from: c, reason: collision with root package name */
    public D1.i f66106c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66107d;

    public C6503i(Context context, Long l10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66104a = context;
        this.f66105b = l10;
        this.f66106c = e(g());
    }

    @Override // u4.InterfaceC6492C
    public void a(boolean z10) {
        this.f66107d = z10;
    }

    @Override // u4.InterfaceC6492C
    public D1.k b(int i10) {
        return f() ? new C6493D(i10) : new D1.j(i10);
    }

    @Override // u4.InterfaceC6492C
    public D1.i c() {
        return this.f66106c;
    }

    @Override // u4.InterfaceC6492C
    public void d(long j10) {
        Long g10 = g();
        if (g10 != null && g10.longValue() == j10) {
            return;
        }
        h(Long.valueOf(j10));
        this.f66106c = e(Long.valueOf(j10));
    }

    public final D1.i e(Long l10) {
        D1.i a10 = new i.b(this.f66104a).c(l10 != null ? l10.longValue() : 1000000L).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        return a10;
    }

    public boolean f() {
        return this.f66107d;
    }

    public Long g() {
        return this.f66105b;
    }

    public void h(Long l10) {
        this.f66105b = l10;
    }

    public /* synthetic */ C6503i(Context context, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : l10);
    }
}
