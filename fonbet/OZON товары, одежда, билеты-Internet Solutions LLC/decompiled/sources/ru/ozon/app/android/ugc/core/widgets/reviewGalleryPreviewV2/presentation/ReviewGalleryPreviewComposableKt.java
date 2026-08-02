package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import T7.E;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a©\u0001\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0081\u0001\u0010\u0014\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "item", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "previews", "Lkotlin/Function2;", "", "", "onScroll", "onLoadNext", "Lkotlin/Function1;", "LWZ/t;", "onView", "onItemClick", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lv0/I;", "listState", "ReviewGalleryPreviewComposable", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv0/I;LS0/k;II)V", "ReviewGalleryPreviewsList", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv0/I;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "ReviewGalleryItemContent", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;LS0/k;I)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReviewGalleryItemContent(e eVar, ReviewGalleryPreviewV2VO.ItemVO itemVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1788279534);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(itemVO) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (itemVO.getIcon() != null && itemVO.getText() == null) {
            u11.o(957227891);
            V f7 = C5185h.f(InterfaceC6250b.a.c(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, eVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsImageAtomKt.DsImageAtom(itemVO.getImage(), null, u11, 0, 2);
            float f13 = 2;
            DsIconButtonAtomKt.DsIconButtonAtom(itemVO.getIcon(), T.j(e.f40358c0, 0.0f, 0.0f, f13, f13, 3), false, null, u11, IconButtonV3DTO.$stable | 48, 12);
            u11.f();
            u11.k();
        } else if (itemVO.getText() != null) {
            u11.o(957237315);
            V f14 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f15 = c.f(u11, eVar);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f16 = E.f(u11, f14, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f16);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            DsImageAtomKt.DsImageAtom(itemVO.getImage(), null, u11, 0, 2);
            DsTextAtomKt.DsTextAtom(itemVO.getText(), null, u11, 0, 2);
            u11.f();
            u11.k();
        } else {
            u11.o(-390245944);
            DsImageAtomKt.DsImageAtom(itemVO.getImage(), eVar, u11, (i12 << 3) & 112, 0);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ReviewGalleryPreviewComposableKt$ReviewGalleryItemContent$3(eVar, itemVO, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewGalleryPreviewComposable(@NotNull ReviewGalleryPreviewV2VO item, @NotNull List<ReviewGalleryPreviewV2VO.ItemVO> previews, Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22, Function1<? super t, Unit> function1, Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function12, Function1<? super AtomAction, Unit> function13, I i11, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        int i14;
        Function2<? super Integer, ? super Integer, Unit> function23;
        int i15;
        Function2<? super Integer, ? super Integer, Unit> function24;
        int i16;
        boolean z11;
        Function1<? super t, Unit> function14;
        int i17;
        Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function15;
        int i18;
        Function1<? super AtomAction, Unit> function16;
        I i19;
        Function2<? super Integer, ? super Integer, Unit> function25;
        Function1<? super t, Unit> function17;
        Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function18;
        Function1<? super AtomAction, Unit> function19;
        Function2<? super Integer, ? super Integer, Unit> function26;
        Function1<? super t, Unit> function110;
        Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function111;
        e b11;
        Object C11;
        int I11;
        ButtonV3DTO showMore;
        Function1<? super AtomAction, Unit> function112;
        Function1<? super AtomAction, Unit> function113;
        C3969l c3969l;
        J0 m02;
        int i21;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previews, "previews");
        C3969l u11 = interfaceC3967k.u(-1593435161);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (u11.F(item) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((2 & i13) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= u11.F(previews) ? 32 : 16;
        }
        int i22 = i13 & 4;
        if (i22 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            function23 = function2;
            i14 |= u11.F(function23) ? 256 : 128;
            i15 = i13 & 8;
            if (i15 == 0) {
                i14 |= 3072;
                function24 = function22;
            } else if ((i12 & 3072) == 0) {
                function24 = function22;
                i14 |= u11.F(function24) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            } else {
                function24 = function22;
            }
            i16 = i13 & 16;
            if (i16 == 0) {
                i14 |= 24576;
                z11 = true;
            } else {
                z11 = true;
                if ((i12 & 24576) == 0) {
                    function14 = function1;
                    i14 |= u11.F(function14) ? 16384 : 8192;
                    i17 = i13 & 32;
                    if (i17 != 0) {
                        i14 |= 196608;
                        function15 = function12;
                    } else {
                        function15 = function12;
                        if ((i12 & 196608) == 0) {
                            i14 |= u11.F(function15) ? 131072 : 65536;
                        }
                    }
                    i18 = i13 & 64;
                    if (i18 != 0) {
                        i14 |= 1572864;
                        function16 = function13;
                    } else {
                        function16 = function13;
                        if ((i12 & 1572864) == 0) {
                            i14 |= u11.F(function16) ? 1048576 : 524288;
                        }
                    }
                    if ((i12 & 12582912) == 0) {
                        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                            i19 = i11;
                            if (u11.n(i19)) {
                                i21 = 8388608;
                                i14 |= i21;
                            }
                        } else {
                            i19 = i11;
                        }
                        i21 = 4194304;
                        i14 |= i21;
                    } else {
                        i19 = i11;
                    }
                    if ((i14 & 4793491) == 4793490 || !u11.b()) {
                        u11.Q0();
                        if ((i12 & 1) != 0 || u11.w0()) {
                            if (i22 != 0) {
                                u11.o(1563398786);
                                Object C12 = u11.C();
                                if (C12 == InterfaceC3967k.a.a()) {
                                    C12 = ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$1$1.INSTANCE;
                                    u11.x(C12);
                                }
                                function25 = (Function2) C12;
                                u11.k();
                            } else {
                                function25 = function23;
                            }
                            if (i15 != 0) {
                                u11.o(1563400386);
                                Object C13 = u11.C();
                                if (C13 == InterfaceC3967k.a.a()) {
                                    C13 = ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$2$1.INSTANCE;
                                    u11.x(C13);
                                }
                                function24 = (Function2) C13;
                                u11.k();
                            }
                            if (i16 != 0) {
                                u11.o(1563402047);
                                Object C14 = u11.C();
                                if (C14 == InterfaceC3967k.a.a()) {
                                    C14 = ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$3$1.INSTANCE;
                                    u11.x(C14);
                                }
                                function17 = (Function1) C14;
                                u11.k();
                            } else {
                                function17 = function14;
                            }
                            if (i17 != 0) {
                                u11.o(1563404511);
                                Object C15 = u11.C();
                                if (C15 == InterfaceC3967k.a.a()) {
                                    C15 = ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$4$1.INSTANCE;
                                    u11.x(C15);
                                }
                                function18 = (Function1) C15;
                                u11.k();
                            } else {
                                function18 = function15;
                            }
                            if (i18 != 0) {
                                u11.o(1563406015);
                                Object C16 = u11.C();
                                if (C16 == InterfaceC3967k.a.a()) {
                                    C16 = ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$5$1.INSTANCE;
                                    u11.x(C16);
                                }
                                function16 = (Function1) C16;
                                u11.k();
                            }
                            if ((128 & i13) != 0) {
                                i19 = new I(0, 0);
                                i14 &= -29360129;
                            }
                            Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function114 = function18;
                            function19 = function16;
                            function26 = function25;
                            function110 = function17;
                            function111 = function114;
                        } else {
                            u11.j();
                            if ((128 & i13) != 0) {
                                i14 &= -29360129;
                            }
                            function110 = function14;
                            function111 = function15;
                            function19 = function16;
                            function26 = function23;
                        }
                        u11.j0();
                        u11.o(1563408267);
                        if (item.getTokenizedEvent() != null) {
                            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                            u11.o(1563411082);
                            boolean F11 = ((57344 & i14) == 16384 ? z11 : false) | u11.F(item);
                            Object C17 = u11.C();
                            if (F11 || C17 == InterfaceC3967k.a.a()) {
                                C17 = new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$6$1(function110, item);
                                u11.x(C17);
                            }
                            u11.k();
                            i.a(aVar, null, (Function0) C17, u11, 6);
                        }
                        u11.k();
                        e.a aVar2 = e.f40358c0;
                        e u12 = a0.u(a0.e(aVar2, 1.0f), 3);
                        C7807Z parseColorToken = TokenParserKt.parseColorToken(UniColors.LAYER_FLOOR_1.getToken(), u11, 0);
                        b11 = androidx.compose.foundation.e.b(u12, parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m, y0.a());
                        u11.o(1563419894);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$7$1.INSTANCE;
                            u11.x(C11);
                        }
                        u11.k();
                        e c11 = o.c(b11, false, (Function1) C11);
                        float f7 = 4;
                        C5194q a11 = C5193p.a(C5179b.n(f7), InterfaceC6250b.a.k(), u11, 6);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f11 = c.f(u11, c11);
                        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.H(a12);
                        } else {
                            u11.e();
                        }
                        Function2 g10 = b.g(u11, a11, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            Ep.a.d(I11, u11, I11, g10);
                        }
                        F1.b(u11, f11, InterfaceC2801g.a.f());
                        I i23 = i19;
                        ReviewGalleryPreviewsList(previews, function26, function24, function110, function111, i23, u11, ((i14 >> 3) & 65534) | ((i14 >> 6) & 458752));
                        showMore = item.getShowMore();
                        u11.o(-1250952235);
                        if (showMore == null) {
                            function112 = function19;
                        } else {
                            Function1<? super AtomAction, Unit> function115 = function19;
                            DsButtonAtomKt.DsButtonAtom(showMore, T.j(aVar2, f7, 0.0f, 0.0f, 0.0f, 14), false, function115, u11, ((i14 >> 9) & 7168) | 48, 4);
                            function112 = function115;
                            Unit unit = Unit.f71690a;
                        }
                        u11.k();
                        u11.f();
                        function113 = function112;
                        c3969l = u11;
                        i19 = i23;
                    } else {
                        u11.j();
                        function113 = function16;
                        c3969l = u11;
                        function110 = function14;
                        function111 = function15;
                        function26 = function23;
                    }
                    m02 = c3969l.m0();
                    if (m02 != null) {
                        m02.G(new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewComposable$9(item, previews, function26, function24, function110, function111, function113, i19, i12, i13));
                        return;
                    }
                    return;
                }
            }
            function14 = function1;
            i17 = i13 & 32;
            if (i17 != 0) {
            }
            i18 = i13 & 64;
            if (i18 != 0) {
            }
            if ((i12 & 12582912) == 0) {
            }
            if ((i14 & 4793491) == 4793490) {
            }
            u11.Q0();
            if ((i12 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if ((128 & i13) != 0) {
            }
            Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function1142 = function18;
            function19 = function16;
            function26 = function25;
            function110 = function17;
            function111 = function1142;
            u11.j0();
            u11.o(1563408267);
            if (item.getTokenizedEvent() != null) {
            }
            u11.k();
            e.a aVar22 = e.f40358c0;
            e u122 = a0.u(a0.e(aVar22, 1.0f), 3);
            C7807Z parseColorToken2 = TokenParserKt.parseColorToken(UniColors.LAYER_FLOOR_1.getToken(), u11, 0);
            b11 = androidx.compose.foundation.e.b(u122, parseColorToken2 != null ? parseColorToken2.w() : C7807Z.f72259m, y0.a());
            u11.o(1563419894);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            u11.k();
            e c112 = o.c(b11, false, (Function1) C11);
            float f72 = 4;
            C5194q a112 = C5193p.a(C5179b.n(f72), InterfaceC6250b.a.k(), u11, 6);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, c112);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, g102);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            I i232 = i19;
            ReviewGalleryPreviewsList(previews, function26, function24, function110, function111, i232, u11, ((i14 >> 3) & 65534) | ((i14 >> 6) & 458752));
            showMore = item.getShowMore();
            u11.o(-1250952235);
            if (showMore == null) {
            }
            u11.k();
            u11.f();
            function113 = function112;
            c3969l = u11;
            i19 = i232;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        function23 = function2;
        i15 = i13 & 8;
        if (i15 == 0) {
        }
        i16 = i13 & 16;
        if (i16 == 0) {
        }
        function14 = function1;
        i17 = i13 & 32;
        if (i17 != 0) {
        }
        i18 = i13 & 64;
        if (i18 != 0) {
        }
        if ((i12 & 12582912) == 0) {
        }
        if ((i14 & 4793491) == 4793490) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if ((128 & i13) != 0) {
        }
        Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> function11422 = function18;
        function19 = function16;
        function26 = function25;
        function110 = function17;
        function111 = function11422;
        u11.j0();
        u11.o(1563408267);
        if (item.getTokenizedEvent() != null) {
        }
        u11.k();
        e.a aVar222 = e.f40358c0;
        e u1222 = a0.u(a0.e(aVar222, 1.0f), 3);
        C7807Z parseColorToken22 = TokenParserKt.parseColorToken(UniColors.LAYER_FLOOR_1.getToken(), u11, 0);
        b11 = androidx.compose.foundation.e.b(u1222, parseColorToken22 != null ? parseColorToken22.w() : C7807Z.f72259m, y0.a());
        u11.o(1563419894);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e c1122 = o.c(b11, false, (Function1) C11);
        float f722 = 4;
        C5194q a1122 = C5193p.a(C5179b.n(f722), InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, c1122);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g1022);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        I i2322 = i19;
        ReviewGalleryPreviewsList(previews, function26, function24, function110, function111, i2322, u11, ((i14 >> 3) & 65534) | ((i14 >> 6) & 458752));
        showMore = item.getShowMore();
        u11.o(-1250952235);
        if (showMore == null) {
        }
        u11.k();
        u11.f();
        function113 = function112;
        c3969l = u11;
        i19 = i2322;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    public static final void ReviewGalleryPreviewsList(@NotNull List<ReviewGalleryPreviewV2VO.ItemVO> list, @NotNull Function2<? super Integer, ? super Integer, Unit> onScroll, @NotNull Function2<? super Integer, ? super Integer, Unit> onLoadNext, @NotNull Function1<? super t, Unit> onView, @NotNull Function1<? super ReviewGalleryPreviewV2VO.ItemVO, Unit> onItemClick, @NotNull I listState, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        I i14;
        C3969l c3969l;
        List<ReviewGalleryPreviewV2VO.ItemVO> previews = list;
        Intrinsics.checkNotNullParameter(previews, "previews");
        Intrinsics.checkNotNullParameter(onScroll, "onScroll");
        Intrinsics.checkNotNullParameter(onLoadNext, "onLoadNext");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(listState, "listState");
        C3969l u11 = interfaceC3967k.u(35517611);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(previews) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onScroll) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onLoadNext) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onView) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onItemClick) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(listState) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(868698176);
            boolean F11 = ((458752 & i12) == 131072) | ((i12 & 112) == 32) | ((i12 & 896) == 256) | u11.F(previews);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                i13 = i12;
                ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1 reviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1 = new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1(listState, onScroll, onLoadNext, previews, null);
                i14 = listState;
                previews = previews;
                u11.x(reviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1);
                C11 = reviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1;
            } else {
                i14 = listState;
                i13 = i12;
            }
            u11.k();
            Q.g(i14, previews, (Function2) C11, u11);
            C5179b.i n11 = C5179b.n(4);
            C9915y a11 = T.a(16, 2, 0.0f);
            u11.o(868723613);
            boolean F12 = u11.F(previews) | ((i13 & 7168) == 2048) | ((57344 & i13) == 16384);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$2$1(previews, onView, onItemClick);
                u11.x(C12);
            }
            u11.k();
            c3969l = u11;
            C10164d.b(null, i14, a11, n11, null, null, false, (Function1) C12, c3969l, ((i13 >> 12) & 112) | 24960, 233);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$3(previews, onScroll, onLoadNext, onView, onItemClick, listState, i11));
        }
    }
}
