package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.presentation;

import A0.h;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.C3349u1;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import WZ.t;
import Z1.b;
import Z1.d;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.presentation.HotelsFavoritesCollectionVI;
import ru.ozon.app.android.travel.utils.compose.FixComposerWidgetBackgroundKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI;", "item", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "HotelsFavoritesCollectionContent", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$ImagesLinks;", "imagesLinks", "HotelsFavoritesCollectionCover-WBPWzBY", "(Ljava/util/List;Landroidx/compose/ui/e;LS0/k;II)V", "HotelsFavoritesCollectionCover", "Lkotlin/Function0;", "content", "CoverLayout", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Placement;", "placement", "clipForPlacement", "(Landroidx/compose/ui/e;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsFavoritesCollections/v1/presentation/HotelsFavoritesCollectionVI$Placement;)Landroidx/compose/ui/e;", "paddingForPlacement", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsFavoritesCollectionContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoverLayout(e eVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(1859516993);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function2) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            final int Y02 = ((d) u11.m(K0.e())).Y0(DsSpacings.INSTANCE.m1839getDp1D9Ej5fM());
            u11.o(-323921154);
            boolean r11 = u11.r(Y02);
            Object C11 = u11.C();
            if (r11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.presentation.HotelsFavoritesCollectionContentKt$CoverLayout$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsFavoritesCollections.v1.presentation.HotelsFavoritesCollectionContentKt$CoverLayout$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ List<m0> $placeables;
                        final /* synthetic */ int $spaceWidth;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(List<? extends m0> list, int i11) {
                            super(1);
                            this.$placeables = list;
                            this.$spaceWidth = i11;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            List<m0> list = this.$placeables;
                            int i11 = this.$spaceWidth;
                            int i12 = 0;
                            int i13 = 0;
                            int i14 = 0;
                            for (Object obj : list) {
                                int i15 = i12 + 1;
                                if (i12 < 0) {
                                    C7714v.O0();
                                    throw null;
                                }
                                m0 m0Var = (m0) obj;
                                layout.h(m0Var, i13, i14, 0.0f);
                                if (i12 == 0) {
                                    i13 = m0Var.u0() + i11 + i13;
                                } else {
                                    i14 = m0Var.l0() + i11 + i14;
                                }
                                i12 = i15;
                            }
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        long j12;
                        long j13;
                        long j14;
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int size = measurables.size();
                        if (size == 0 || size == 1) {
                            j12 = j11;
                            j13 = j12;
                            j14 = j13;
                        } else if (size != 2) {
                            int k11 = (int) ((b.k(j11) - Y02) * 0.65d);
                            j13 = b.c(k11, k11, b.j(j11), 0, 8, j11);
                            int size2 = measurables.size();
                            int i15 = size2 - 1;
                            int k12 = (b.k(j11) - k11) - Y02;
                            int i16 = size2 - 2;
                            int j15 = (b.j(j11) - (Y02 * i16)) / i15;
                            j14 = b.b(k12, k12, j15, j15);
                            int j16 = b.j(j11) - ((j15 + Y02) * i16);
                            j12 = b.c(0, 0, j16, j16, 3, j14);
                        } else {
                            int k13 = (b.k(j11) - Y02) / 2;
                            j13 = b.c(k13, k13, b.j(j11), 0, 8, j11);
                            int k14 = (b.k(j11) - k13) - Y02;
                            j12 = b.c(k14, k14, b.j(j11), 0, 8, j11);
                            j14 = j12;
                        }
                        int P11 = C7714v.P(measurables);
                        List<? extends U> list = measurables;
                        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                        int i17 = 0;
                        for (Object obj : list) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                C7714v.O0();
                                throw null;
                            }
                            arrayList.add(((U) obj).a0(i17 == 0 ? j13 : i17 == P11 ? j12 : j14));
                            i17 = i18;
                        }
                        z02 = Layout.z0(b.k(j11), b.j(j11), kotlin.collections.U.c(), new AnonymousClass1(arrayList, Y02));
                        return z02;
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int i15 = ((i13 >> 3) & 14) | ((i13 << 3) & 112);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, eVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            int i16 = ((i15 << 6) & 896) | 6;
            u11.i();
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C3349u1.e((i16 >> 6) & 14, function2, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new HotelsFavoritesCollectionContentKt$CoverLayout$2(eVar, function2, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HotelsFavoritesCollectionContent(@NotNull HotelsFavoritesCollectionVI item, e eVar, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        HotelsFavoritesCollectionVI.Model model;
        e b11;
        e b12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(797653774);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                if (i14 != 0) {
                    eVar2 = e.f40358c0;
                }
                FixComposerWidgetBackgroundKt.FixComposerWidgetBackground(u11, 0);
                model = item.getModel();
                u11.o(975129784);
                if (model != null) {
                    b12 = androidx.compose.foundation.e.b(clipForPlacement(a0.c(eVar2), item.getPlacement()), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
                    C5185h.a(b12, u11, 0);
                    u11.k();
                    J0 m02 = u11.m0();
                    if (m02 != null) {
                        m02.G(new HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionContent$1(item, eVar2, actionHandler, i11, i12));
                        return;
                    }
                    return;
                }
                u11.k();
                t viewEvent = model.getViewEvent();
                u11.o(975137991);
                if (viewEvent != null) {
                    l lVar = (l) u11.m(f.e());
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(-1470453068);
                    boolean F11 = u11.F(lVar) | u11.F(viewEvent);
                    Object C11 = u11.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionContent$2$1$1(lVar, viewEvent);
                        u11.x(C11);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C11, u11, 6);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                e clipForPlacement = clipForPlacement(eVar2, item.getPlacement());
                boolean z11 = model.getClickAction() != null;
                u11.o(975148851);
                boolean n11 = u11.n(model) | ((i13 & 896) == 256);
                Object C12 = u11.C();
                if (n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionContent$3$1(model, actionHandler);
                    u11.x(C12);
                }
                u11.k();
                b11 = androidx.compose.foundation.e.b(androidx.compose.foundation.i.c(clipForPlacement, z11, null, null, (Function0) C12, 6), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
                e paddingForPlacement = paddingForPlacement(b11, item.getPlacement());
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, paddingForPlacement);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a12);
                } else {
                    u11.e();
                }
                Function2 g10 = K00.b.g(u11, a11, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                List<? extends String> m1356getImagesLinksCR9ho0c = model.m1356getImagesLinksCR9ho0c();
                e.a aVar2 = e.f40358c0;
                e a13 = C5182e.a(a0.e(aVar2, 1.0f), ImageAspectRatio.RATIO_4_3.getValue(), false);
                DsSpacings dsSpacings = DsSpacings.INSTANCE;
                m1350HotelsFavoritesCollectionCoverWBPWzBY(m1356getImagesLinksCR9ho0c, C6988h.a(a13, h.b(dsSpacings.m1845getDp16D9Ej5fM())), u11, 0, 0);
                u0.E.a(u11, a0.f(aVar2, dsSpacings.m1861getDp8D9Ej5fM()));
                DsTextAtomKt.DsTextAtom(model.getTitle(), null, u11, 0, 2);
                TextDTO subtitle = model.getSubtitle();
                u11.o(-1470428797);
                if (subtitle != null) {
                    DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                }
                u11.k();
                u11.f();
            } else {
                u11.j();
            }
            e eVar3 = eVar2;
            J0 m03 = u11.m0();
            if (m03 != null) {
                m03.G(new HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionContent$5(item, eVar3, actionHandler, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 != 0) {
        }
        FixComposerWidgetBackgroundKt.FixComposerWidgetBackground(u11, 0);
        model = item.getModel();
        u11.o(975129784);
        if (model != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HotelsFavoritesCollectionCover-WBPWzBY, reason: not valid java name */
    public static final void m1350HotelsFavoritesCollectionCoverWBPWzBY(List<? extends String> list, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(1448136849);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(list) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            CoverLayout(eVar, a1.c.c(316948540, new HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionCover$1(list), u11), u11, ((i13 >> 3) & 14) | 48, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new HotelsFavoritesCollectionContentKt$HotelsFavoritesCollectionCover$2(list, eVar, i11, i12));
        }
    }

    private static final e clipForPlacement(e eVar, HotelsFavoritesCollectionVI.Placement placement) {
        if (!placement.getIsFirstRow() && !placement.getIsLastRow()) {
            return eVar;
        }
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        float m1838getDp0D9Ej5fM = dsSpacings.m1838getDp0D9Ej5fM();
        float m1850getDp24D9Ej5fM = dsSpacings.m1850getDp24D9Ej5fM();
        float f7 = (placement.getIsFirstRow() && placement.getPosition() == HotelsFavoritesCollectionVI.Position.LEFT) ? m1850getDp24D9Ej5fM : m1838getDp0D9Ej5fM;
        float f11 = (placement.getIsFirstRow() && placement.getPosition() == HotelsFavoritesCollectionVI.Position.RIGHT) ? m1850getDp24D9Ej5fM : m1838getDp0D9Ej5fM;
        float f12 = (placement.getIsLastRow() && placement.getPosition() == HotelsFavoritesCollectionVI.Position.LEFT) ? m1850getDp24D9Ej5fM : m1838getDp0D9Ej5fM;
        if (placement.getIsLastRow() && placement.getPosition() == HotelsFavoritesCollectionVI.Position.RIGHT) {
            m1838getDp0D9Ej5fM = m1850getDp24D9Ej5fM;
        }
        return C6988h.a(eVar, h.c(f7, f11, m1838getDp0D9Ej5fM, f12));
    }

    private static final e paddingForPlacement(e eVar, HotelsFavoritesCollectionVI.Placement placement) {
        return T.i(eVar, placement.getPosition() == HotelsFavoritesCollectionVI.Position.LEFT ? DsSpacings.INSTANCE.m1845getDp16D9Ej5fM() : DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), placement.getIsFirstRow() ? DsSpacings.INSTANCE.m1845getDp16D9Ej5fM() : DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), placement.getPosition() == HotelsFavoritesCollectionVI.Position.RIGHT ? DsSpacings.INSTANCE.m1845getDp16D9Ej5fM() : DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), placement.getIsLastRow() ? DsSpacings.INSTANCE.m1845getDp16D9Ej5fM() : DsSpacings.INSTANCE.m1854getDp4D9Ej5fM());
    }
}
