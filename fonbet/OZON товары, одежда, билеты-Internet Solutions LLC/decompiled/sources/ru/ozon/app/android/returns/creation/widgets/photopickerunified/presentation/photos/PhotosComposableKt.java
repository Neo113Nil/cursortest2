package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
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
import l1.y0;
import n0.C8366G;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewState;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001aE\u0010\u0007\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "photos", "Lkotlin/Function1;", "", "onRemove", "onRetry", "PhotosComposable", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "item", "Photo", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotosComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void Photo(PhotoItem photoItem, Function1<? super PhotoItem, Unit> function1, Function1<? super PhotoItem, Unit> function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z11;
        Function1<? super PhotoItem, Unit> function13 = function12;
        C3969l u11 = interfaceC3967k.u(-178730322);
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
            u11.o(-1528195360);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = h.b(16);
                u11.x(C11);
            }
            A0.g gVar = (A0.g) C11;
            u11.k();
            PikazonImagePainter a12 = f.a(photoItem.getLink().getUrl(), InterfaceC2547p.a.a(), null, null, u11, 48, 12);
            u11.o(-1528183581);
            e a13 = C6988h.a(c5187j.b(aVar), gVar);
            PhotoItemViewState state = photoItem.getState();
            PhotoItemViewState.Error error = PhotoItemViewState.Error.INSTANCE;
            if (Intrinsics.d(state, error)) {
                a13 = C8385f.c(2, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNegativePrimary(), a13, gVar);
            }
            u11.k();
            C8366G.a(a12, null, a13, null, null, 0.0f, null, u11, 48, 120);
            u11 = u11;
            u11.o(-1528174364);
            PhotoItemViewState state2 = photoItem.getState();
            PhotoItemViewState.Loading loading = PhotoItemViewState.Loading.INSTANCE;
            if (!Intrinsics.d(state2, loading)) {
                IconButtonV3DTO deleteButton = photoItem.getDeleteButton();
                e a14 = c5187j.a(P.b(aVar, 6, -6), InterfaceC6250b.a.n());
                u11.o(-1528165709);
                boolean z12 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(photoItem))) | ((i12 & 112) == 32);
                Object C12 = u11.C();
                if (z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new PhotosComposableKt$Photo$1$2$1(function1, photoItem);
                    u11.x(C12);
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(deleteButton, null, a14, false, (Function1) C12, u11, IconButtonV3DTO.$stable, 10);
                u11 = u11;
            }
            u11.k();
            u11.o(-1528163311);
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
                u11.o(346226610);
                boolean z13 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(photoItem))) | ((i12 & 112) == 32);
                Object C13 = u11.C();
                if (z13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new PhotosComposableKt$Photo$1$3$1$1(function1, photoItem);
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
            u11.o(-1528147109);
            if (Intrinsics.d(photoItem.getState(), error)) {
                IconButtonV3DTO reloadButton = PhotoItem.INSTANCE.getReloadButton();
                e a17 = c5187j.a(aVar, InterfaceC6250b.a.e());
                u11.o(-1528139694);
                boolean z14 = (i12 & 896) == 256 ? true : z11;
                if ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(photoItem))) {
                    z11 = true;
                }
                boolean z15 = z14 | z11;
                Object C14 = u11.C();
                if (z15 || C14 == InterfaceC3967k.a.a()) {
                    function13 = function12;
                    C14 = new PhotosComposableKt$Photo$1$4$1(function13, photoItem);
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
            m02.G(new PhotosComposableKt$Photo$2(photoItem, function1, function13, i11));
        }
    }

    public static final void PhotosComposable(@NotNull List<PhotoItem> photos, @NotNull Function1<? super PhotoItem, Unit> onRemove, @NotNull Function1<? super PhotoItem, Unit> onRetry, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        C3969l u11 = interfaceC3967k.u(1486631511);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(photos) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onRemove) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onRetry) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            float f7 = 8;
            C5179b.i n11 = C5179b.n(f7);
            C5179b.i n12 = C5179b.n(f7);
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            B.a(T.f(b11, 16), n11, n12, 0, 0, null, a1.c.c(148533756, new PhotosComposableKt$PhotosComposable$1(photos, onRemove, onRetry), u11), u11, 1573296, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PhotosComposableKt$PhotosComposable$2(photos, onRemove, onRetry, i11));
        }
    }
}
