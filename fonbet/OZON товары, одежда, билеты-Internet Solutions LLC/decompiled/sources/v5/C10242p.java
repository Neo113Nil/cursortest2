package v5;

import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;
import w5.C10435g;
import w5.EnumC10434f;
import x5.InterfaceC10658b;
import x5.InterfaceC10659c;
import xe.B0;

/* renamed from: v5.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10242p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l5.i f102266a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A5.t f102267b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final A5.o f102268c = A5.e.a();

    public C10242p(@NotNull l5.i iVar, @NotNull A5.t tVar) {
        this.f102266a = iVar;
        this.f102267b = tVar;
    }

    public static boolean b(@NotNull C10234h c10234h, @NotNull Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (c10234h.h()) {
                InterfaceC10658b M11 = c10234h.M();
                if (M11 instanceof InterfaceC10659c) {
                    View view = ((InterfaceC10659c) M11).getView();
                    if (!view.isAttachedToWindow() || view.isHardwareAccelerated()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean a(@NotNull C10239m c10239m) {
        return c10239m.e() != Bitmap.Config.HARDWARE || this.f102268c.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003c, code lost:
    
        if (r18.f102268c.b(r6) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C10239m c(@NotNull C10234h c10234h, @NotNull C10435g c10435g) {
        C10234h c10234h2;
        C10435g c10435g2;
        Bitmap.Config j11;
        if (c10234h.O().isEmpty() || C7705l.m(A5.k.e(), c10234h.j())) {
            if (c10234h.j() == Bitmap.Config.HARDWARE) {
                c10234h2 = c10234h;
                if (b(c10234h2, c10234h.j())) {
                    c10435g2 = c10435g;
                }
            } else {
                c10234h2 = c10234h;
                c10435g2 = c10435g;
            }
            j11 = c10234h2.j();
            Bitmap.Config config = j11;
            EnumC10228b D11 = !this.f102267b.a() ? c10234h2.D() : EnumC10228b.DISABLED;
            AbstractC10429a d11 = c10435g2.d();
            AbstractC10429a.b bVar = AbstractC10429a.b.f103576a;
            return new C10239m(c10234h.l(), config, c10234h.k(), c10435g2, (!Intrinsics.d(d11, bVar) || Intrinsics.d(c10435g2.c(), bVar)) ? EnumC10434f.FIT : c10234h2.J(), A5.i.a(c10234h), (c10234h2.i() || !c10234h2.O().isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true, c10234h.I(), c10234h.r(), c10234h.x(), c10234h.L(), c10234h.E(), c10234h.C(), c10234h.s(), D11);
        }
        c10234h2 = c10234h;
        c10435g2 = c10435g;
        j11 = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = j11;
        EnumC10228b D112 = !this.f102267b.a() ? c10234h2.D() : EnumC10228b.DISABLED;
        AbstractC10429a d112 = c10435g2.d();
        AbstractC10429a.b bVar2 = AbstractC10429a.b.f103576a;
        return new C10239m(c10234h.l(), config2, c10234h.k(), c10435g2, (!Intrinsics.d(d112, bVar2) || Intrinsics.d(c10435g2.c(), bVar2)) ? EnumC10434f.FIT : c10234h2.J(), A5.i.a(c10234h), (c10234h2.i() || !c10234h2.O().isEmpty() || config2 == Bitmap.Config.ALPHA_8) ? false : true, c10234h.I(), c10234h.r(), c10234h.x(), c10234h.L(), c10234h.E(), c10234h.C(), c10234h.s(), D112);
    }

    @NotNull
    public final InterfaceC10241o d(@NotNull C10234h c10234h, @NotNull B0 b02) {
        AbstractC5434v z11 = c10234h.z();
        InterfaceC10658b M11 = c10234h.M();
        return M11 instanceof InterfaceC10659c ? new C10246t(this.f102266a, c10234h, (InterfaceC10659c) M11, z11, b02) : new C10227a(z11, b02);
    }
}
