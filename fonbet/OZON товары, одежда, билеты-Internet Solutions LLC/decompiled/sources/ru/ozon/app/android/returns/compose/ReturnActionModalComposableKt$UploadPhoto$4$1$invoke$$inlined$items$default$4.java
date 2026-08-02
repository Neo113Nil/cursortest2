package ru.ozon.app.android.returns.compose;

import A0.h;
import B0.C2454a;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import J0.T0;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import e1.InterfaceC6250b;
import fd.InterfaceC6512o;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.image.DsImageKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv0/e;", "", "it", "", "invoke", "(Lv0/e;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class ReturnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ float $itemRoundCorners$inlined;
    final /* synthetic */ float $itemSize$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $onRemovePhotoClicked$inlined;
    final /* synthetic */ Function1 $onRetryLoadPhotoClick$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4(List list, float f7, float f11, Function1 function1, Function1 function12) {
        super(4);
        this.$items = list;
        this.$itemSize$inlined = f7;
        this.$itemRoundCorners$inlined = f11;
        this.$onRetryLoadPhotoClick$inlined = function1;
        this.$onRemovePhotoClicked$inlined = function12;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        invoke(interfaceC10165e, num.intValue(), interfaceC3967k, num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(@NotNull InterfaceC10165e interfaceC10165e, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C5187j c5187j;
        boolean z11;
        ReturnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4 returnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4;
        AttachmentVO.AttachedImageVO attachedImageVO;
        e b11;
        if ((i12 & 6) == 0) {
            i13 = i12 | (interfaceC3967k.n(interfaceC10165e) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= interfaceC3967k.r(i11) ? 32 : 16;
        }
        if ((i13 & 147) == 146 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        AttachmentVO.AttachedImageVO attachedImageVO2 = (AttachmentVO.AttachedImageVO) this.$items.get(i11);
        interfaceC3967k.o(202497733);
        PikazonImagePainter a11 = f.a(attachedImageVO2.getMediaUri(), InterfaceC2547p.a.a(), null, null, interfaceC3967k, 48, 12);
        e.a aVar = e.f40358c0;
        e n11 = a0.n(aVar, this.$itemSize$inlined);
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, n11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        e a13 = C6988h.a(c5187j2.a(a0.d(aVar), InterfaceC6250b.a.e()), h.b(this.$itemRoundCorners$inlined));
        interfaceC3967k.o(-1490011512);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = p.a();
            interfaceC3967k.x(C11);
        }
        q qVar = (q) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1490007901);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = ReturnActionModalComposableKt$UploadPhoto$4$1$3$1$2$1.INSTANCE;
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        DsImageKt.m1720DsImageA8mMYrQ(a11, i.b(a13, qVar, null, false, null, null, (Function0) C12, 28), false, 0.0f, 0L, InterfaceC2547p.a.a(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC3967k, 196608, 0, 2012);
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        interfaceC3967k2.o(-1490004198);
        if (attachedImageVO2.getStatus().getIsShowLoader()) {
            e a14 = C6988h.a(a0.n(aVar, 40), h.e());
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i14 = UniTheme.$stable;
            b11 = androidx.compose.foundation.e.b(a14, uniTheme.getColors(interfaceC3967k2, i14).getLayerOverlayDimming(), y0.a());
            c5187j = c5187j2;
            e a15 = c5187j.a(b11, InterfaceC6250b.a.e());
            z11 = false;
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = interfaceC3967k2.I();
            A0 d13 = interfaceC3967k2.d();
            e f13 = c.f(interfaceC3967k2, a15);
            Function0 a16 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a16);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d14 = C2454a.d(interfaceC3967k2, f12, interfaceC3967k2, d13);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                a.d(d14, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f13, InterfaceC2801g.a.f());
            DsLoaderKt.m1753DsLoader3IgeMak(c5187j.a(a0.n(aVar, 34), InterfaceC6250b.a.e()), uniTheme.getColors(interfaceC3967k2, i14).getBgLightKey(), DsLoaderSize.Size400, interfaceC3967k2, 384, 0);
            interfaceC3967k2.f();
        } else {
            c5187j = c5187j2;
            z11 = false;
        }
        interfaceC3967k2.k();
        interfaceC3967k2.o(-1489980271);
        if (attachedImageVO2.getStatus().getIsShowRetry()) {
            PikazonImagePainter a17 = f.a(Integer.valueOf(R$drawable.ic_m_reload), null, null, null, interfaceC3967k2, 0, 14);
            long textPrimary = UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getTextPrimary();
            e a18 = c5187j.a(a0.n(aVar, 24), InterfaceC6250b.a.e());
            interfaceC3967k2.o(-1489965304);
            Object C13 = interfaceC3967k2.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = p.a();
                interfaceC3967k2.x(C13);
            }
            q qVar2 = (q) C13;
            interfaceC3967k2.k();
            interfaceC3967k2.o(-1489961340);
            returnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4 = this;
            attachedImageVO = attachedImageVO2;
            boolean n12 = interfaceC3967k2.n(returnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4.$onRetryLoadPhotoClick$inlined) | interfaceC3967k2.F(attachedImageVO);
            Object C14 = interfaceC3967k2.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new ReturnActionModalComposableKt$UploadPhoto$4$1$3$1$5$1(returnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4.$onRetryLoadPhotoClick$inlined, attachedImageVO);
                interfaceC3967k2.x(C14);
            }
            interfaceC3967k2.k();
            T0.a(a17, null, i.b(a18, qVar2, null, false, null, null, (Function0) C14, 28), textPrimary, interfaceC3967k, 48);
            interfaceC3967k2 = interfaceC3967k;
        } else {
            returnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4 = this;
            attachedImageVO = attachedImageVO2;
        }
        interfaceC3967k2.k();
        interfaceC3967k2.o(-1489955058);
        if (attachedImageVO.getStatus().getIsShowRemover()) {
            e n13 = a0.n(T.f(aVar, 4), 16);
            UniTheme uniTheme2 = UniTheme.INSTANCE;
            int i15 = UniTheme.$stable;
            e b12 = androidx.compose.foundation.e.b(n13, uniTheme2.getColors(interfaceC3967k2, i15).getBgPrimary(), h.e());
            interfaceC3967k2.o(-1489941176);
            Object C15 = interfaceC3967k2.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = p.a();
                interfaceC3967k2.x(C15);
            }
            q qVar3 = (q) C15;
            interfaceC3967k2.k();
            interfaceC3967k2.o(-1489937213);
            boolean n14 = interfaceC3967k2.n(returnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4.$onRemovePhotoClicked$inlined) | interfaceC3967k2.F(attachedImageVO);
            Object C16 = interfaceC3967k2.C();
            if (n14 || C16 == InterfaceC3967k.a.a()) {
                C16 = new ReturnActionModalComposableKt$UploadPhoto$4$1$3$1$7$1(returnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4.$onRemovePhotoClicked$inlined, attachedImageVO);
                interfaceC3967k2.x(C16);
            }
            interfaceC3967k2.k();
            e a19 = Q1.a(c5187j.a(i.b(b12, qVar3, null, false, null, null, (Function0) C16, 28), InterfaceC6250b.a.n()), "delivery_review_form_remove_photo_btn");
            V f14 = C5185h.f(InterfaceC6250b.a.o(), z11);
            int I13 = interfaceC3967k2.I();
            A0 d15 = interfaceC3967k2.d();
            e f15 = c.f(interfaceC3967k2, a19);
            Function0 a21 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a21);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d16 = C2454a.d(interfaceC3967k2, f14, interfaceC3967k2, d15);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
                a.d(d16, I13, interfaceC3967k2, I13);
            }
            F1.b(interfaceC3967k2, f15, InterfaceC2801g.a.f());
            T0.a(f.a(Integer.valueOf(R$drawable.ic_s_cross_filled_compact), null, null, null, interfaceC3967k2, 0, 14), null, c5187j.a(a0.n(aVar, 12), InterfaceC6250b.a.e()), uniTheme2.getColors(interfaceC3967k2, i15).getGraphicTertiary(), interfaceC3967k, 48);
            interfaceC3967k.f();
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
