package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import n0.C8366G;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewState;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data.ItemDTO;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ao\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "item", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "photos", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lkotlin/Function0;", "onAddPhoto", "onRemove", "onReload", "ItemComposable", "(Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "onClick", "AddPhotoButton", "(Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Photo", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AddPhotoButton(ItemDTO.AddPhotoButtonDTO addPhotoButtonDTO, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-576071698);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(addPhotoButtonDTO) : u11.F(addPhotoButtonDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            String backgroundColor = addPhotoButtonDTO.getBackgroundColor();
            u11.o(-1205935124);
            C7807Z c7807z = backgroundColor == null ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
            u11.k();
            u11.o(-1205935769);
            long bgActionSecondary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgActionSecondary() : c7807z.w();
            u11.k();
            e.a aVar = e.f40358c0;
            e b11 = androidx.compose.foundation.e.b(a0.r(a0.f(aVar, 96), 72), bgActionSecondary, h.b(16));
            u11.o(-1205925262);
            boolean z11 = (i12 & 112) == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ItemComposableKt$AddPhotoButton$1$1(function0);
                u11.x(C11);
            }
            u11.k();
            e b12 = i.b(b11, null, null, false, null, null, (Function0) C11, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b12);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsIconAtomKt.DsIconAtom(addPhotoButtonDTO.getIcon(), C5187j.f39515a.a(aVar, InterfaceC6250b.a.e()), u11, IconDTO.$stable, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ItemComposableKt$AddPhotoButton$3(addPhotoButtonDTO, function0, i11));
        }
    }

    public static final void ItemComposable(@NotNull ItemVI item, @NotNull List<PhotoItem> photos, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function0<Unit> onAddPhoto, @NotNull Function1<? super PhotoItem, Unit> onRemove, @NotNull Function1<? super PhotoItem, Unit> onReload, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onAddPhoto, "onAddPhoto");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        Intrinsics.checkNotNullParameter(onReload, "onReload");
        C3969l u11 = interfaceC3967k.u(-1893260030);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(item) : u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(photos) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onAction) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onAddPhoto) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onRemove) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onReload) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.u(a0.e(aVar, 1.0f), 3), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            float f7 = 16;
            e i13 = T.i(b11, f7, 14, f7, f7);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, i13);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsCellAtomKt.DsCellAtom(item.getCell(), null, onAction, u11, CellDTO.$stable | (i12 & 896), 2);
            u0.E.a(u11, a0.f(aVar, 2));
            DsTextAtomKt.DsTextAtom(item.getSubtitle(), null, u11, 0, 2);
            float f12 = 12;
            u0.E.a(u11, a0.f(aVar, f12));
            float f13 = 8;
            B.a(null, C5179b.n(f13), C5179b.n(f13), 0, 0, null, a1.c.c(-84488611, new ItemComposableKt$ItemComposable$1$1(photos, item, onAddPhoto, onRemove, onReload), u11), u11, 1573296, 57);
            u11.o(-457167118);
            if (item.getShowError()) {
                u0.E.a(u11, a0.f(aVar, f12));
                DsTextAtomKt.DsTextAtom(item.getErrorDescription(), null, u11, 0, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ItemComposableKt$ItemComposable$2(item, photos, onAction, onAddPhoto, onRemove, onReload, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Photo(PhotoItem photoItem, Function1<? super PhotoItem, Unit> function1, Function1<? super PhotoItem, Unit> function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z11;
        Function1<? super PhotoItem, Unit> function13 = function12;
        C3969l u11 = interfaceC3967k.u(2107717572);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(photoItem) : u11.F(photoItem) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e r11 = a0.r(a0.f(aVar, 96), 72);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, r11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            u11.o(1599874908);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = h.b(16);
                u11.x(C11);
            }
            A0.g gVar = (A0.g) C11;
            u11.k();
            PikazonImagePainter a12 = f.a(photoItem.getLink().getUrl(), InterfaceC2547p.a.a(), null, null, u11, 48, 12);
            u11.o(1599886687);
            e a13 = C6988h.a(c5187j.b(aVar), gVar);
            PhotoItemViewState state = photoItem.getState();
            PhotoItemViewState.Error error = PhotoItemViewState.Error.INSTANCE;
            if (Intrinsics.d(state, error)) {
                a13 = C8385f.c(2, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNegativePrimary(), a13, gVar);
            }
            u11.k();
            C8366G.a(a12, null, a13, null, null, 0.0f, null, u11, 48, 120);
            u11 = u11;
            u11.o(1599895904);
            PhotoItemViewState state2 = photoItem.getState();
            PhotoItemViewState.Loading loading = PhotoItemViewState.Loading.INSTANCE;
            if (!Intrinsics.d(state2, loading)) {
                IconButtonV3DTO deleteButton = photoItem.getDeleteButton();
                e a14 = c5187j.a(P.b(aVar, 6, -6), InterfaceC6250b.a.n());
                u11.o(1599904559);
                boolean z12 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(photoItem))) | ((i12 & 112) == 32);
                Object C12 = u11.C();
                if (z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new ItemComposableKt$Photo$1$2$1(function1, photoItem);
                    u11.x(C12);
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(deleteButton, null, a14, false, (Function1) C12, u11, IconButtonV3DTO.$stable, 10);
                u11 = u11;
            }
            u11.k();
            u11.o(1599906957);
            if (Intrinsics.d(photoItem.getState(), loading)) {
                e a15 = c5187j.a(aVar, InterfaceC6250b.a.e());
                z11 = false;
                V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f14 = c.f(u11, a15);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a16);
                } else {
                    u11.e();
                }
                Function2 f15 = E.f(u11, f13, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f15);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                IconButtonV3DTO stopButton = PhotoItem.INSTANCE.getStopButton();
                u11.o(-1467996626);
                boolean z13 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(photoItem))) | ((i12 & 112) == 32);
                Object C13 = u11.C();
                if (z13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new ItemComposableKt$Photo$1$3$1$1(function1, photoItem);
                    u11.x(C13);
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(stopButton, null, false, (Function1) C13, u11, IconButtonV3DTO.$stable, 6);
                DsLoaderKt.m1753DsLoader3IgeMak(null, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPrimaryOnDark(), DsLoaderSize.Size400, u11, 384, 1);
                u11.f();
            } else {
                z11 = false;
            }
            u11.k();
            u11.o(1599923160);
            if (Intrinsics.d(photoItem.getState(), error)) {
                IconButtonV3DTO reloadButton = PhotoItem.INSTANCE.getReloadButton();
                e a17 = c5187j.a(aVar, InterfaceC6250b.a.e());
                u11.o(1599930575);
                boolean z14 = (i12 & 896) == 256 ? true : z11;
                if ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(photoItem))) {
                    z11 = true;
                }
                boolean z15 = z14 | z11;
                Object C14 = u11.C();
                if (z15 || C14 == InterfaceC3967k.a.a()) {
                    function13 = function12;
                    C14 = new ItemComposableKt$Photo$1$4$1(function13, photoItem);
                    u11.x(C14);
                } else {
                    function13 = function12;
                }
                u11.k();
                C3969l c3969l = u11;
                DsIconButtonAtomKt.DsIconButtonAtom(reloadButton, null, a17, false, (Function1) C14, c3969l, IconButtonV3DTO.$stable, 10);
                u11 = c3969l;
            } else {
                function13 = function12;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ItemComposableKt$Photo$2(photoItem, function1, function13, i11));
        }
    }
}
