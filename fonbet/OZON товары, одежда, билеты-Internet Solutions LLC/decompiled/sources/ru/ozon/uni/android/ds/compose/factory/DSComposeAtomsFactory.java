package ru.ozon.uni.android.ds.compose.factory;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import P9.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.indicator.DsIndicatorAtomKt;
import ru.ozon.uni.android.ds.compose.component.price.DsPriceAtomKt;
import ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt;
import ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox.DsCheckboxAtomKt;
import ru.ozon.uni.android.ds.compose.component.selectionControls.radio.DsRadioAtomKt;
import ru.ozon.uni.android.ds.compose.component.selectionControls.toggle.DsToggleAtomKt;
import ru.ozon.uni.android.ds.compose.component.tabs.DsTabsAtomKt;
import ru.ozon.uni.android.ds.compose.component.tagbutton.DsTagButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.components.badge.UniBadgeAtomKt;
import ru.ozon.uni.components.button.UniButtonAtomKt;
import ru.ozon.uni.components.button.UniButtonResizing;
import ru.ozon.uni.components.disclaimer.UniDisclaimerAtomKt;
import ru.ozon.uni.components.iconButton.UniIconButtonAtomKt;
import ru.ozon.uni.components.iconButton.UniIconButtonResizing;
import ru.ozon.uni.components.indicator.UniIndicatorAtomKt;
import ru.ozon.uni.components.productMedia.UniProductMediaAtomKt;
import ru.ozon.uni.components.tagButton.UniTagButtonAtomKt;
import ru.ozon.uni.components.text.UniTextAtomKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/ds/compose/factory/DSComposeAtomsFactory;", "", "<init>", "()V", "", "isUni", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "CreateAtom", "(ZLru/ozon/uni/atoms/data/AtomDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DSComposeAtomsFactory {
    public static final int $stable = 0;

    @NotNull
    public static final DSComposeAtomsFactory INSTANCE = new DSComposeAtomsFactory();

    private DSComposeAtomsFactory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CreateAtom(boolean z11, @NotNull AtomDTO atom, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        Function1<? super AtomAction, Unit> function14;
        C3969l c3969l;
        Function1<? super AtomAction, Unit> function15;
        J0 m02;
        Intrinsics.checkNotNullParameter(atom, "atom");
        C3969l u11 = interfaceC3967k.u(-2018989598);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? u11.n(atom) : u11.F(atom) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        u11.o(1869562203);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = DSComposeAtomsFactory$CreateAtom$3$1.INSTANCE;
                            u11.x(C11);
                        }
                        function13 = (Function1) C11;
                        u11.k();
                    } else {
                        function13 = function12;
                    }
                    if (z11) {
                        u11.o(2121912409);
                        e.a aVar = e.f40358c0;
                        a.b(aVar, "UniAtomContainer");
                        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                        int I11 = u11.I();
                        A0 d11 = u11.d();
                        e f11 = c.f(u11, aVar);
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
                        if (atom instanceof TagButtonDTO) {
                            u11.o(1180289144);
                            c3969l = u11;
                            UniTagButtonAtomKt.UniTagButtonAtom((TagButtonDTO) atom, eVar3, false, null, c3969l, (i13 >> 3) & 112, 12);
                            c3969l.k();
                        } else {
                            c3969l = u11;
                            if (atom instanceof IndicatorDTO) {
                                c3969l.o(1180291320);
                                UniIndicatorAtomKt.UniIndicatorAtom((IndicatorDTO) atom, eVar3, c3969l, (i13 >> 3) & 112, 0);
                                c3969l.k();
                            } else {
                                if (atom instanceof ProductMediaDTO) {
                                    c3969l.o(1180293605);
                                    function14 = function13;
                                    UniProductMediaAtomKt.UniProductMediaAtom((ProductMediaDTO) atom, eVar3, function14, c3969l, (i13 >> 3) & 1008, 0);
                                    c3969l = c3969l;
                                    c3969l.k();
                                } else {
                                    function14 = function13;
                                    if (atom instanceof BadgeDTO) {
                                        c3969l.o(1180296062);
                                        UniBadgeAtomKt.UniBadgeAtom((BadgeDTO) atom, eVar3, function14, c3969l, (i13 >> 3) & 1008, 0);
                                        c3969l = c3969l;
                                        c3969l.k();
                                    } else if (atom instanceof ButtonV3DTO) {
                                        c3969l.o(-2065453309);
                                        UniButtonAtomKt.UniButtonAtom((ButtonV3DTO) atom, eVar3, UniButtonResizing.HUG, false, function14, c3969l, ((i13 >> 3) & 112) | 3456 | ((i13 << 3) & 57344), 0);
                                        function14 = function14;
                                        c3969l = c3969l;
                                        c3969l.k();
                                    } else if (atom instanceof IconButtonV3DTO) {
                                        c3969l.o(-2065308508);
                                        UniIconButtonAtomKt.UniIconButtonAtom((IconButtonV3DTO) atom, eVar3, UniIconButtonResizing.HUG, false, function14, c3969l, ((i13 >> 3) & 112) | 3456 | ((i13 << 3) & 57344), 0);
                                        function13 = function14;
                                        c3969l = c3969l;
                                        c3969l.k();
                                    } else {
                                        function13 = function14;
                                        if (atom instanceof TextDTO) {
                                            c3969l.o(1180311283);
                                            UniTextAtomKt.UniTextAtom((TextDTO) atom, eVar3, null, c3969l, (i13 >> 3) & 112, 4);
                                            c3969l = c3969l;
                                            c3969l.k();
                                        } else if (atom instanceof DisclaimerDTO) {
                                            c3969l.o(1180313347);
                                            function14 = function13;
                                            UniDisclaimerAtomKt.UniDisclaimerAtom((DisclaimerDTO) atom, eVar3, function14, c3969l, (i13 >> 3) & 1008, 0);
                                            c3969l = c3969l;
                                            c3969l.k();
                                        } else {
                                            function14 = function13;
                                            c3969l.o(-2064924728);
                                            c3969l.k();
                                        }
                                    }
                                }
                                c3969l.f();
                                c3969l.k();
                            }
                        }
                        function14 = function13;
                        c3969l.f();
                        c3969l.k();
                    } else {
                        function14 = function13;
                        c3969l = u11;
                        c3969l.o(2122891048);
                        if (atom instanceof ButtonV3DTO) {
                            c3969l.o(1869596330);
                            DsButtonAtomKt.DsButtonAtom((ButtonV3DTO) atom, eVar3, false, function14, c3969l, ((i13 >> 3) & 112) | (i13 & 7168), 4);
                            function14 = function14;
                            c3969l.k();
                        } else if (atom instanceof IconButtonV3DTO) {
                            c3969l.o(1869599022);
                            DsIconButtonAtomKt.DsIconButtonAtom((IconButtonV3DTO) atom, eVar3, false, function14, c3969l, ((i13 >> 3) & 112) | (i13 & 7168), 4);
                            function14 = function14;
                            c3969l.k();
                        } else if (atom instanceof ImageDTO) {
                            c3969l.o(1869601588);
                            DsImageAtomKt.DsImageAtom((ImageDTO) atom, eVar3, c3969l, (i13 >> 3) & 112, 0);
                            c3969l.k();
                        } else if (atom instanceof TextDTO) {
                            c3969l.o(1869603315);
                            DsTextAtomKt.DsTextAtom((TextDTO) atom, eVar3, c3969l, (i13 >> 3) & 112, 0);
                            c3969l.k();
                        } else if (atom instanceof BadgeDTO) {
                            c3969l.o(1869605054);
                            DsBadgeAtomKt.DsBadgeAtom((BadgeDTO) atom, eVar3, function14, c3969l, (i13 >> 3) & 1008, 0);
                            c3969l = c3969l;
                            c3969l.k();
                        } else if (atom instanceof IconDTO) {
                            c3969l.o(1869607091);
                            DsIconAtomKt.DsIconAtom((IconDTO) atom, eVar3, c3969l, (i13 >> 3) & 112, 0);
                            c3969l.k();
                        } else if (atom instanceof RatingDTO) {
                            c3969l.o(1869608863);
                            DsRatingKt.DsRatingAtom((RatingDTO) atom, eVar3, function14, null, c3969l, (i13 >> 3) & 1008, 8);
                            c3969l.k();
                        } else {
                            if (atom instanceof CheckBoxDTO) {
                                c3969l.o(1869611063);
                                DsCheckboxAtomKt.DsCheckboxAtom((CheckBoxDTO) atom, eVar3, null, null, c3969l, (i13 >> 3) & 112, 12);
                                c3969l.k();
                            } else if (atom instanceof RadioDTO) {
                                c3969l.o(1869612916);
                                DsRadioAtomKt.DsRadioAtom((RadioDTO) atom, eVar3, null, null, c3969l, (i13 >> 3) & 112, 12);
                                c3969l.k();
                            } else if (atom instanceof ToggleDTO) {
                                c3969l.o(1869614709);
                                DsToggleAtomKt.DsToggleAtom((ToggleDTO) atom, eVar3, null, c3969l, (i13 >> 3) & 112, 4);
                                c3969l = c3969l;
                                c3969l.k();
                            } else if (atom instanceof IndicatorDTO) {
                                c3969l.o(1869616632);
                                DsIndicatorAtomKt.DsIndicatorAtom((IndicatorDTO) atom, eVar3, c3969l, (i13 >> 3) & 112, 0);
                                c3969l.k();
                            } else if (atom instanceof TabsDTO) {
                                c3969l.o(1869618515);
                                function14 = function14;
                                DsTabsAtomKt.DsTabsAtom((TabsDTO) atom, eVar3, function14, null, c3969l, (i13 >> 3) & 1008, 8);
                                c3969l.k();
                            } else {
                                function14 = function14;
                                if (atom instanceof CellDTO) {
                                    c3969l.o(1869621213);
                                    DsCellAtomKt.DsCellAtom((CellDTO) atom, eVar3, function14, c3969l, (i13 >> 3) & 1008, 0);
                                    c3969l = c3969l;
                                    c3969l.k();
                                } else if (atom instanceof DisclaimerDTO) {
                                    c3969l.o(1869623427);
                                    DsDisclaimerAtomKt.DsDisclaimerAtom((DisclaimerDTO) atom, eVar3, function14, c3969l, (i13 >> 3) & 1008, 0);
                                    c3969l = c3969l;
                                    c3969l.k();
                                } else if (atom instanceof PriceDTO) {
                                    c3969l.o(1869625652);
                                    DsPriceAtomKt.DsPriceAtom(eVar3, (PriceDTO) atom, c3969l, (i13 >> 6) & 14, 0);
                                    c3969l.k();
                                } else if (atom instanceof TagButtonDTO) {
                                    c3969l.o(1869627565);
                                    DsTagButtonAtomKt.DsTagButtonAtom((TagButtonDTO) atom, eVar3, false, function14, c3969l, ((i13 >> 3) & 112) | (i13 & 7168), 4);
                                    function14 = function14;
                                    c3969l.k();
                                } else {
                                    c3969l.o(2123950535);
                                    c3969l.k();
                                }
                            }
                            function14 = function14;
                        }
                        c3969l.k();
                    }
                    eVar2 = eVar3;
                    function15 = function14;
                } else {
                    u11.j();
                    function15 = function12;
                    c3969l = u11;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new DSComposeAtomsFactory$CreateAtom$5(this, z11, atom, eVar2, function15, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            if (z11) {
            }
            eVar2 = eVar3;
            function15 = function14;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        function12 = function1;
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        if (z11) {
        }
        eVar2 = eVar3;
        function15 = function14;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
