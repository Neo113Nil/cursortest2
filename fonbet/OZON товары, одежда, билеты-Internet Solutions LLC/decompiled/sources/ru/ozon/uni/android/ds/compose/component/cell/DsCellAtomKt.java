package ru.ozon.uni.android.ds.compose.component.cell;

import A0.h;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K1.C3422b;
import K1.K;
import K1.N;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.b;
import a1.c;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import hd.C6915b;
import i1.C6988h;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCell;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox.DsCheckboxAtomKt;
import ru.ozon.uni.android.ds.compose.component.selectionControls.radio.DsRadioAtomKt;
import ru.ozon.uni.android.ds.compose.component.selectionControls.toggle.DsToggleAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomMappersKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextPreset;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u001c\u001a\u00020\u0006*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a7\u0010 \u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b \u0010!\u001a9\u0010'\u001a\u00020\u0006*\u00020\"2\u0006\u0010\u0001\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u0003¢\u0006\u0004\b'\u0010(\u001a!\u0010*\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020)2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b*\u0010+\u001aS\u00106\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u000202H\u0003¢\u0006\u0004\b4\u00105\u001a%\u0010<\u001a\u00020:*\u0002072\u0006\u00109\u001a\u0002082\b\b\u0002\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=\u001a%\u0010>\u001a\u00020:*\u0002072\u0006\u00109\u001a\u0002082\b\b\u0002\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b>\u0010=\u001a\u0013\u0010@\u001a\u00020?*\u00020,H\u0002¢\u0006\u0004\b@\u0010A\"\u001a\u0010F\u001a\u00020C*\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001a\u0010K\u001a\u00020H*\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u001a\u0010N\u001a\u000202*\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u0018\u0010R\u001a\u00020,*\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\"\u0018\u0010V\u001a\u000200*\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "DsCellAtom", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "status", "Lru/ozon/uni/android/ds/compose/component/cell/CheckBoxControlState;", "rememberCheckBoxControlState", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/cell/CheckBoxControlState;", "", "isSelected", "Lru/ozon/uni/android/ds/compose/component/cell/RadioControlState;", "rememberRadioControlState", "(Ljava/lang/Boolean;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/cell/RadioControlState;", "Lru/ozon/uni/android/ds/compose/component/cell/ToggleControlState;", "rememberToggleControlState", "(Ljava/lang/Boolean;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/cell/ToggleControlState;", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;", "blockDto", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "locator", "LeftBlock", "(Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;Lru/ozon/uni/android/ds/compose/modifier/Locator;LS0/k;I)V", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;", "CenterBlock", "(Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;Lru/ozon/uni/android/ds/compose/modifier/Locator;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "Lt0/q;", "interactionSource", "Lkotlin/Function0;", "RightBlock", "(Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;Lru/ozon/uni/android/ds/compose/modifier/Locator;Lt0/q;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "ControlAtom", "(Lru/ozon/uni/atoms/data/AtomDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleDTO", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTO", "LZ1/h;", "spacing", "TitleRowWithBadgeAndIcon-HYR8e34", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;FLS0/k;II)V", "TitleRowWithBadgeAndIcon", "LK1/K;", "", "lineIndex", "", "fallbackValue", "getLineWidth", "(LK1/K;IF)F", "getLineHeight", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "extractTextPreset", "(Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "Le1/b$c;", "getAsVerticalAlignment", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;)Le1/b$c;", "asVerticalAlignment", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Landroidx/compose/foundation/layout/b$e;", "getAsAddonItemsHorizontalArrangement", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Landroidx/compose/foundation/layout/b$e;", "asAddonItemsHorizontalArrangement", "getDpOrZero", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)F", "dpOrZero", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "getAsTextDto", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;)Lru/ozon/uni/atoms/data/text/TextDTO;", "asTextDto", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getAsIconDto", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "asIconDto", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsCellAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CellView.AddonBlock.Alignment.values().length];
            try {
                iArr[CellView.AddonBlock.Alignment.ALIGNMENT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CenterBlock(DsCell.CenterScope centerScope, CellDTO.CenterBlock centerBlock, Locator locator, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        DsCell.CenterScope centerScope2;
        C3969l u11 = interfaceC3967k.u(1344839296);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(centerScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(centerBlock) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(locator) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            centerScope2 = centerScope;
        } else {
            centerScope2 = centerScope;
            centerScope2.Addon(null, c.c(2078613650, new DsCellAtomKt$CenterBlock$1$1(locator, centerBlock, function1), u11), u11, ((i12 << 6) & 896) | 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DsCellAtomKt$CenterBlock$2(centerScope2, centerBlock, locator, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ControlAtom(AtomDTO atomDTO, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-1177727877);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(atomDTO) : u11.F(atomDTO) ? 4 : 2) | i11;
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
            e eVar2 = eVar;
            if (atomDTO instanceof CheckBoxDTO) {
                u11.o(-643320939);
                DsCheckboxAtomKt.DsCheckboxAtom((CheckBoxDTO) atomDTO, eVar2, null, null, u11, i13 & 112, 12);
                u11.k();
            } else if (atomDTO instanceof RadioDTO) {
                u11.o(-643319246);
                DsRadioAtomKt.DsRadioAtom((RadioDTO) atomDTO, eVar2, null, null, u11, i13 & 112, 12);
                u11.k();
            } else if (atomDTO instanceof ToggleDTO) {
                u11.o(-643317613);
                DsToggleAtomKt.DsToggleAtom((ToggleDTO) atomDTO, eVar2, null, u11, i13 & 112, 4);
                u11 = u11;
                u11.k();
            } else {
                u11.o(1532022378);
                u11.k();
            }
            eVar = eVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DsCellAtomKt$ControlAtom$1(atomDTO, eVar, i11, i12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ff  */
    /* JADX WARN: Type inference failed for: r14v13, types: [T, ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO] */
    /* JADX WARN: Type inference failed for: r14v15, types: [T, ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO] */
    /* JADX WARN: Type inference failed for: r14v17, types: [T, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO] */
    /* JADX WARN: Type inference failed for: r14v4, types: [T, ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO] */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO] */
    /* JADX WARN: Type inference failed for: r14v6, types: [T, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsCellAtom(@NotNull CellDTO dto, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        boolean d11;
        Object C11;
        CellDTO.Settings settings;
        boolean z11;
        ToggleControlState toggleControlState;
        ToggleControlState toggleControlState2;
        ToggleControlState toggleControlState3;
        ToggleControlState toggleControlState4;
        ToggleControlState toggleControlState5;
        ToggleControlState toggleControlState6;
        ToggleControlState toggleControlState7;
        ToggleControlState toggleControlState8;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1;
        Function0 function0;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$12;
        Function0 function02;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$13;
        Function0 function03;
        boolean n11;
        Object C12;
        Function0 function04;
        C3969l c3969l;
        Function1<? super AtomAction, Unit> function14;
        Boolean disableSeparator;
        AtomAction atomAction;
        CommonControlSettings common;
        AtomAction atomAction2;
        CommonControlSettings common2;
        AtomAction atomAction3;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1649270473);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        u11.o(1848361018);
                        Object C13 = u11.C();
                        if (C13 == InterfaceC3967k.a.a()) {
                            C13 = DsCellAtomKt$DsCellAtom$1$1.INSTANCE;
                            u11.x(C13);
                        }
                        u11.k();
                        function13 = (Function1) C13;
                    } else {
                        function13 = function12;
                    }
                    e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                    boolean z12 = !dto.getIsDisabled();
                    CellDTO.Settings settings2 = dto.getSettings();
                    d11 = settings2 != null ? Intrinsics.d(settings2.isAutoToggleDisabled(), Boolean.TRUE) : false;
                    u11.o(1848367359);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = p.a();
                        u11.x(C11);
                    }
                    q qVar = (q) C11;
                    u11.k();
                    CellDTO.Settings settings3 = dto.getSettings();
                    float dpOrZero = getDpOrZero(settings3 != null ? settings3.getLeftPadding() : null);
                    CellDTO.Settings settings4 = dto.getSettings();
                    float dpOrZero2 = getDpOrZero(settings4 != null ? settings4.getTopPadding() : null);
                    CellDTO.Settings settings5 = dto.getSettings();
                    float dpOrZero3 = getDpOrZero(settings5 != null ? settings5.getRightPadding() : null);
                    CellDTO.Settings settings6 = dto.getSettings();
                    float dpOrZero4 = getDpOrZero(settings6 != null ? settings6.getBottomPadding() : null);
                    settings = dto.getSettings();
                    if (settings != null || (r6 = settings.getCornerRadius()) == null) {
                        CornerRadius cornerRadius = CornerRadius.NO_RADIUS;
                    }
                    float m1866getDpD9Ej5fM = cornerRadius.m1866getDpD9Ej5fM();
                    M m11 = new M();
                    M m12 = new M();
                    u11.o(1848383442);
                    if (d11) {
                        z11 = true;
                    } else {
                        CellDTO.LeftBlock leftBlock = dto.getLeftBlock();
                        AtomDTO control = leftBlock != null ? leftBlock.getControl() : null;
                        z11 = true;
                        if (control instanceof CheckBoxDTO) {
                            u11.o(1465499437);
                            CheckBoxDTO checkBoxDTO = (CheckBoxDTO) control;
                            CheckBoxControlState rememberCheckBoxControlState = rememberCheckBoxControlState(checkBoxDTO.getStatus(), u11, 0);
                            if (rememberCheckBoxControlState != 0) {
                                m11.f71787a = CheckBoxDTO.copy$default(checkBoxDTO, null, rememberCheckBoxControlState.getState(), null, null, null, null, null, null, null, null, 1021, null);
                                toggleControlState3 = rememberCheckBoxControlState;
                            } else {
                                toggleControlState3 = null;
                            }
                            u11.k();
                            toggleControlState4 = toggleControlState3;
                        } else if (control instanceof RadioDTO) {
                            u11.o(1465655305);
                            RadioDTO radioDTO = (RadioDTO) control;
                            RadioControlState rememberRadioControlState = rememberRadioControlState(radioDTO.isSelected(), u11, 0);
                            if (rememberRadioControlState != 0) {
                                m11.f71787a = RadioDTO.copy$default(radioDTO, null, rememberRadioControlState.getState(), null, null, null, null, 61, null);
                                toggleControlState2 = rememberRadioControlState;
                            } else {
                                toggleControlState2 = null;
                            }
                            u11.k();
                            toggleControlState4 = toggleControlState2;
                        } else if (control instanceof ToggleDTO) {
                            u11.o(1465817001);
                            ToggleDTO toggleDTO = (ToggleDTO) control;
                            ToggleControlState rememberToggleControlState = rememberToggleControlState(toggleDTO.isSelected(), u11, 0);
                            if (rememberToggleControlState != null) {
                                m11.f71787a = ToggleDTO.copy$default(toggleDTO, rememberToggleControlState.getState(), null, null, null, null, null, 62, null);
                                toggleControlState = rememberToggleControlState;
                            } else {
                                toggleControlState = null;
                            }
                            u11.k();
                            toggleControlState4 = toggleControlState;
                        } else {
                            u11.o(1465901413);
                            u11.k();
                        }
                        u11.k();
                        u11.o(1848405261);
                        if (!d11) {
                            CellDTO.RightBlock rightBlock = dto.getRightBlock();
                            AtomDTO control2 = rightBlock != null ? rightBlock.getControl() : null;
                            if (control2 instanceof CheckBoxDTO) {
                                u11.o(1466176911);
                                CheckBoxDTO checkBoxDTO2 = (CheckBoxDTO) control2;
                                CheckBoxControlState rememberCheckBoxControlState2 = rememberCheckBoxControlState(checkBoxDTO2.getStatus(), u11, 0);
                                if (rememberCheckBoxControlState2 != 0) {
                                    m12.f71787a = CheckBoxDTO.copy$default(checkBoxDTO2, null, rememberCheckBoxControlState2.getState(), null, null, null, null, null, null, null, null, 1021, null);
                                    toggleControlState7 = rememberCheckBoxControlState2;
                                } else {
                                    toggleControlState7 = null;
                                }
                                u11.k();
                                toggleControlState8 = toggleControlState7;
                            } else if (control2 instanceof RadioDTO) {
                                u11.o(1466330795);
                                RadioDTO radioDTO2 = (RadioDTO) control2;
                                RadioControlState rememberRadioControlState2 = rememberRadioControlState(radioDTO2.isSelected(), u11, 0);
                                if (rememberRadioControlState2 != 0) {
                                    m12.f71787a = RadioDTO.copy$default(radioDTO2, null, rememberRadioControlState2.getState(), null, null, null, null, 61, null);
                                    toggleControlState6 = rememberRadioControlState2;
                                } else {
                                    toggleControlState6 = null;
                                }
                                u11.k();
                                toggleControlState8 = toggleControlState6;
                            } else if (control2 instanceof ToggleDTO) {
                                u11.o(1466490507);
                                ToggleDTO toggleDTO2 = (ToggleDTO) control2;
                                ToggleControlState rememberToggleControlState2 = rememberToggleControlState(toggleDTO2.isSelected(), u11, 0);
                                if (rememberToggleControlState2 != null) {
                                    m12.f71787a = ToggleDTO.copy$default(toggleDTO2, rememberToggleControlState2.getState(), null, null, null, null, null, 62, null);
                                    toggleControlState5 = rememberToggleControlState2;
                                } else {
                                    toggleControlState5 = null;
                                }
                                u11.k();
                                toggleControlState8 = toggleControlState5;
                            } else {
                                u11.o(1466572997);
                                u11.k();
                            }
                            u11.k();
                            CellDTO.LeftBlock leftBlock2 = dto.getLeftBlock();
                            foundationMapperKt$toOnClickLambda$1$1 = (leftBlock2 != null || (common2 = leftBlock2.getCommon()) == null || (atomAction3 = common2.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction3);
                            u11.o(1848427248);
                            if (foundationMapperKt$toOnClickLambda$1$1 == null) {
                                function0 = null;
                            } else {
                                u11.o(788406939);
                                boolean F11 = u11.F(toggleControlState4) | u11.n(foundationMapperKt$toOnClickLambda$1$1);
                                Object C14 = u11.C();
                                if (F11 || C14 == InterfaceC3967k.a.a()) {
                                    C14 = new DsCellAtomKt$DsCellAtom$onStartClick$1$1$1(toggleControlState4, foundationMapperKt$toOnClickLambda$1$1);
                                    u11.x(C14);
                                }
                                function0 = (Function0) C14;
                                u11.k();
                            }
                            u11.k();
                            CellDTO.RightBlock rightBlock2 = dto.getRightBlock();
                            foundationMapperKt$toOnClickLambda$1$12 = (rightBlock2 != null || (common = rightBlock2.getCommon()) == null || (atomAction2 = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction2);
                            u11.o(1848432398);
                            if (foundationMapperKt$toOnClickLambda$1$12 == null) {
                                function02 = null;
                            } else {
                                u11.o(788412089);
                                boolean F12 = u11.F(toggleControlState8) | u11.n(foundationMapperKt$toOnClickLambda$1$12);
                                Object C15 = u11.C();
                                if (F12 || C15 == InterfaceC3967k.a.a()) {
                                    C15 = new DsCellAtomKt$DsCellAtom$onEndClick$1$1$1(toggleControlState8, foundationMapperKt$toOnClickLambda$1$12);
                                    u11.x(C15);
                                }
                                function02 = (Function0) C15;
                                u11.k();
                            }
                            u11.k();
                            CommonControlSettings common3 = dto.getCommon();
                            foundationMapperKt$toOnClickLambda$1$13 = (common3 != null || (atomAction = common3.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                            u11.o(1848437130);
                            if (foundationMapperKt$toOnClickLambda$1$13 == null) {
                                function03 = null;
                            } else {
                                u11.o(788416821);
                                boolean n12 = u11.n(function0) | u11.n(function02) | u11.F(toggleControlState4) | u11.F(toggleControlState8) | u11.n(foundationMapperKt$toOnClickLambda$1$13);
                                Object C16 = u11.C();
                                ToggleControlState toggleControlState9 = toggleControlState8;
                                if (n12 || C16 == InterfaceC3967k.a.a()) {
                                    C16 = new DsCellAtomKt$DsCellAtom$onClick$1$1$1(function0, function02, toggleControlState4, toggleControlState9, foundationMapperKt$toOnClickLambda$1$13);
                                    u11.x(C16);
                                }
                                function03 = (Function0) C16;
                                u11.k();
                            }
                            u11.k();
                            CellDTO.Settings settings7 = dto.getSettings();
                            boolean z13 = !((settings7 == null && (disableSeparator = settings7.getDisableSeparator()) != null && disableSeparator.booleanValue()) ? z11 : false);
                            CellDTO.Settings settings8 = dto.getSettings();
                            C7807Z c7807z = TokenParserKt.tokenToColor(settings8 != null ? settings8.getSeparatorColor() : null, u11, 0);
                            u11.o(1848446853);
                            long graphicNeutral = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z.w();
                            u11.k();
                            CellDTO.Settings settings9 = dto.getSettings();
                            C7807Z c7807z2 = TokenParserKt.tokenToColor(settings9 != null ? settings9.getBackgroundColor() : null, u11, 0);
                            long w11 = c7807z2 != null ? c7807z2.w() : C7807Z.f72259m;
                            CellDTO.Settings settings10 = dto.getSettings();
                            C7807Z c7807z3 = TokenParserKt.tokenToColor(settings10 != null ? settings10.getBackgroundHoverColor() : null, u11, 0);
                            long w12 = c7807z3 != null ? c7807z3.w() : C7807Z.f72259m;
                            DsCellLocator dsCellLocator = new DsCellLocator(dto.getTestInfo(), null, 2, null);
                            e testTag = AtomLocatorKt.testTag(C6988h.a(viewAnalytics, h.b(m1866getDpD9Ej5fM)), dsCellLocator);
                            u11.o(1848492408);
                            if (function03 != null && function0 == null && function02 == null) {
                                function04 = null;
                            } else {
                                u11.o(1848495963);
                                n11 = u11.n(function03) | u11.n(function0) | u11.n(function02);
                                C12 = u11.C();
                                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                                    C12 = new DsCellAtomKt$DsCellAtom$2$1(function03, function0, function02);
                                    u11.x(C12);
                                }
                                u11.k();
                                function04 = (Function0) C12;
                            }
                            u11.k();
                            eVar2 = eVar3;
                            c3969l = u11;
                            DsCellKt.m1701DsCell0rfeiU(c.c(-1635621928, new DsCellAtomKt$DsCellAtom$3(dto, dsCellLocator, function13), u11), testTag, c.c(-624319607, new DsCellAtomKt$DsCellAtom$4(dto, m11, dsCellLocator), u11), c.c(913633585, new DsCellAtomKt$DsCellAtom$5(dto, m12, dsCellLocator, qVar, function02, function03), u11), function0, function02, function04, z12, z13, graphicNeutral, w11, w12, null, dpOrZero, dpOrZero2, dpOrZero3, dpOrZero4, qVar, null, null, c3969l, 3462, 12582912, 790528);
                            function14 = function13;
                        }
                        toggleControlState8 = null;
                        u11.k();
                        CellDTO.LeftBlock leftBlock22 = dto.getLeftBlock();
                        if (leftBlock22 != null) {
                        }
                        u11.o(1848427248);
                        if (foundationMapperKt$toOnClickLambda$1$1 == null) {
                        }
                        u11.k();
                        CellDTO.RightBlock rightBlock22 = dto.getRightBlock();
                        if (rightBlock22 != null) {
                        }
                        u11.o(1848432398);
                        if (foundationMapperKt$toOnClickLambda$1$12 == null) {
                        }
                        u11.k();
                        CommonControlSettings common32 = dto.getCommon();
                        if (common32 != null) {
                        }
                        u11.o(1848437130);
                        if (foundationMapperKt$toOnClickLambda$1$13 == null) {
                        }
                        u11.k();
                        CellDTO.Settings settings72 = dto.getSettings();
                        boolean z132 = !((settings72 == null && (disableSeparator = settings72.getDisableSeparator()) != null && disableSeparator.booleanValue()) ? z11 : false);
                        CellDTO.Settings settings82 = dto.getSettings();
                        C7807Z c7807z4 = TokenParserKt.tokenToColor(settings82 != null ? settings82.getSeparatorColor() : null, u11, 0);
                        u11.o(1848446853);
                        long graphicNeutral2 = c7807z4 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z4.w();
                        u11.k();
                        CellDTO.Settings settings92 = dto.getSettings();
                        C7807Z c7807z22 = TokenParserKt.tokenToColor(settings92 != null ? settings92.getBackgroundColor() : null, u11, 0);
                        long w112 = c7807z22 != null ? c7807z22.w() : C7807Z.f72259m;
                        CellDTO.Settings settings102 = dto.getSettings();
                        C7807Z c7807z32 = TokenParserKt.tokenToColor(settings102 != null ? settings102.getBackgroundHoverColor() : null, u11, 0);
                        long w122 = c7807z32 != null ? c7807z32.w() : C7807Z.f72259m;
                        DsCellLocator dsCellLocator2 = new DsCellLocator(dto.getTestInfo(), null, 2, null);
                        e testTag2 = AtomLocatorKt.testTag(C6988h.a(viewAnalytics, h.b(m1866getDpD9Ej5fM)), dsCellLocator2);
                        u11.o(1848492408);
                        if (function03 != null) {
                        }
                        u11.o(1848495963);
                        n11 = u11.n(function03) | u11.n(function0) | u11.n(function02);
                        C12 = u11.C();
                        if (!n11) {
                        }
                        C12 = new DsCellAtomKt$DsCellAtom$2$1(function03, function0, function02);
                        u11.x(C12);
                        u11.k();
                        function04 = (Function0) C12;
                        u11.k();
                        eVar2 = eVar3;
                        c3969l = u11;
                        DsCellKt.m1701DsCell0rfeiU(c.c(-1635621928, new DsCellAtomKt$DsCellAtom$3(dto, dsCellLocator2, function13), u11), testTag2, c.c(-624319607, new DsCellAtomKt$DsCellAtom$4(dto, m11, dsCellLocator2), u11), c.c(913633585, new DsCellAtomKt$DsCellAtom$5(dto, m12, dsCellLocator2, qVar, function02, function03), u11), function0, function02, function04, z12, z132, graphicNeutral2, w112, w122, null, dpOrZero, dpOrZero2, dpOrZero3, dpOrZero4, qVar, null, null, c3969l, 3462, 12582912, 790528);
                        function14 = function13;
                    }
                    toggleControlState4 = null;
                    u11.k();
                    u11.o(1848405261);
                    if (!d11) {
                    }
                    toggleControlState8 = null;
                    u11.k();
                    CellDTO.LeftBlock leftBlock222 = dto.getLeftBlock();
                    if (leftBlock222 != null) {
                    }
                    u11.o(1848427248);
                    if (foundationMapperKt$toOnClickLambda$1$1 == null) {
                    }
                    u11.k();
                    CellDTO.RightBlock rightBlock222 = dto.getRightBlock();
                    if (rightBlock222 != null) {
                    }
                    u11.o(1848432398);
                    if (foundationMapperKt$toOnClickLambda$1$12 == null) {
                    }
                    u11.k();
                    CommonControlSettings common322 = dto.getCommon();
                    if (common322 != null) {
                    }
                    u11.o(1848437130);
                    if (foundationMapperKt$toOnClickLambda$1$13 == null) {
                    }
                    u11.k();
                    CellDTO.Settings settings722 = dto.getSettings();
                    boolean z1322 = !((settings722 == null && (disableSeparator = settings722.getDisableSeparator()) != null && disableSeparator.booleanValue()) ? z11 : false);
                    CellDTO.Settings settings822 = dto.getSettings();
                    C7807Z c7807z42 = TokenParserKt.tokenToColor(settings822 != null ? settings822.getSeparatorColor() : null, u11, 0);
                    u11.o(1848446853);
                    long graphicNeutral22 = c7807z42 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z42.w();
                    u11.k();
                    CellDTO.Settings settings922 = dto.getSettings();
                    C7807Z c7807z222 = TokenParserKt.tokenToColor(settings922 != null ? settings922.getBackgroundColor() : null, u11, 0);
                    long w1122 = c7807z222 != null ? c7807z222.w() : C7807Z.f72259m;
                    CellDTO.Settings settings1022 = dto.getSettings();
                    C7807Z c7807z322 = TokenParserKt.tokenToColor(settings1022 != null ? settings1022.getBackgroundHoverColor() : null, u11, 0);
                    long w1222 = c7807z322 != null ? c7807z322.w() : C7807Z.f72259m;
                    DsCellLocator dsCellLocator22 = new DsCellLocator(dto.getTestInfo(), null, 2, null);
                    e testTag22 = AtomLocatorKt.testTag(C6988h.a(viewAnalytics, h.b(m1866getDpD9Ej5fM)), dsCellLocator22);
                    u11.o(1848492408);
                    if (function03 != null) {
                    }
                    u11.o(1848495963);
                    n11 = u11.n(function03) | u11.n(function0) | u11.n(function02);
                    C12 = u11.C();
                    if (!n11) {
                    }
                    C12 = new DsCellAtomKt$DsCellAtom$2$1(function03, function0, function02);
                    u11.x(C12);
                    u11.k();
                    function04 = (Function0) C12;
                    u11.k();
                    eVar2 = eVar3;
                    c3969l = u11;
                    DsCellKt.m1701DsCell0rfeiU(c.c(-1635621928, new DsCellAtomKt$DsCellAtom$3(dto, dsCellLocator22, function13), u11), testTag22, c.c(-624319607, new DsCellAtomKt$DsCellAtom$4(dto, m11, dsCellLocator22), u11), c.c(913633585, new DsCellAtomKt$DsCellAtom$5(dto, m12, dsCellLocator22, qVar, function02, function03), u11), function0, function02, function04, z12, z1322, graphicNeutral22, w1122, w1222, null, dpOrZero, dpOrZero2, dpOrZero3, dpOrZero4, qVar, null, null, c3969l, 3462, 12582912, 790528);
                    function14 = function13;
                } else {
                    u11.j();
                    function14 = function12;
                    c3969l = u11;
                }
                e eVar4 = eVar2;
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new DsCellAtomKt$DsCellAtom$6(dto, eVar4, function14, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
            boolean z122 = !dto.getIsDisabled();
            CellDTO.Settings settings22 = dto.getSettings();
            if (settings22 != null) {
            }
            u11.o(1848367359);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            q qVar2 = (q) C11;
            u11.k();
            CellDTO.Settings settings32 = dto.getSettings();
            float dpOrZero5 = getDpOrZero(settings32 != null ? settings32.getLeftPadding() : null);
            CellDTO.Settings settings42 = dto.getSettings();
            float dpOrZero22 = getDpOrZero(settings42 != null ? settings42.getTopPadding() : null);
            CellDTO.Settings settings52 = dto.getSettings();
            float dpOrZero32 = getDpOrZero(settings52 != null ? settings52.getRightPadding() : null);
            CellDTO.Settings settings62 = dto.getSettings();
            float dpOrZero42 = getDpOrZero(settings62 != null ? settings62.getBottomPadding() : null);
            settings = dto.getSettings();
            if (settings != null) {
            }
            CornerRadius cornerRadius2 = CornerRadius.NO_RADIUS;
            float m1866getDpD9Ej5fM2 = cornerRadius2.m1866getDpD9Ej5fM();
            M m112 = new M();
            M m122 = new M();
            u11.o(1848383442);
            if (d11) {
            }
            toggleControlState4 = null;
            u11.k();
            u11.o(1848405261);
            if (!d11) {
            }
            toggleControlState8 = null;
            u11.k();
            CellDTO.LeftBlock leftBlock2222 = dto.getLeftBlock();
            if (leftBlock2222 != null) {
            }
            u11.o(1848427248);
            if (foundationMapperKt$toOnClickLambda$1$1 == null) {
            }
            u11.k();
            CellDTO.RightBlock rightBlock2222 = dto.getRightBlock();
            if (rightBlock2222 != null) {
            }
            u11.o(1848432398);
            if (foundationMapperKt$toOnClickLambda$1$12 == null) {
            }
            u11.k();
            CommonControlSettings common3222 = dto.getCommon();
            if (common3222 != null) {
            }
            u11.o(1848437130);
            if (foundationMapperKt$toOnClickLambda$1$13 == null) {
            }
            u11.k();
            CellDTO.Settings settings7222 = dto.getSettings();
            boolean z13222 = !((settings7222 == null && (disableSeparator = settings7222.getDisableSeparator()) != null && disableSeparator.booleanValue()) ? z11 : false);
            CellDTO.Settings settings8222 = dto.getSettings();
            C7807Z c7807z422 = TokenParserKt.tokenToColor(settings8222 != null ? settings8222.getSeparatorColor() : null, u11, 0);
            u11.o(1848446853);
            long graphicNeutral222 = c7807z422 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z422.w();
            u11.k();
            CellDTO.Settings settings9222 = dto.getSettings();
            C7807Z c7807z2222 = TokenParserKt.tokenToColor(settings9222 != null ? settings9222.getBackgroundColor() : null, u11, 0);
            long w11222 = c7807z2222 != null ? c7807z2222.w() : C7807Z.f72259m;
            CellDTO.Settings settings10222 = dto.getSettings();
            C7807Z c7807z3222 = TokenParserKt.tokenToColor(settings10222 != null ? settings10222.getBackgroundHoverColor() : null, u11, 0);
            long w12222 = c7807z3222 != null ? c7807z3222.w() : C7807Z.f72259m;
            DsCellLocator dsCellLocator222 = new DsCellLocator(dto.getTestInfo(), null, 2, null);
            e testTag222 = AtomLocatorKt.testTag(C6988h.a(viewAnalytics2, h.b(m1866getDpD9Ej5fM2)), dsCellLocator222);
            u11.o(1848492408);
            if (function03 != null) {
            }
            u11.o(1848495963);
            n11 = u11.n(function03) | u11.n(function0) | u11.n(function02);
            C12 = u11.C();
            if (!n11) {
            }
            C12 = new DsCellAtomKt$DsCellAtom$2$1(function03, function0, function02);
            u11.x(C12);
            u11.k();
            function04 = (Function0) C12;
            u11.k();
            eVar2 = eVar3;
            c3969l = u11;
            DsCellKt.m1701DsCell0rfeiU(c.c(-1635621928, new DsCellAtomKt$DsCellAtom$3(dto, dsCellLocator222, function13), u11), testTag222, c.c(-624319607, new DsCellAtomKt$DsCellAtom$4(dto, m112, dsCellLocator222), u11), c.c(913633585, new DsCellAtomKt$DsCellAtom$5(dto, m122, dsCellLocator222, qVar2, function02, function03), u11), function0, function02, function04, z122, z13222, graphicNeutral222, w11222, w12222, null, dpOrZero5, dpOrZero22, dpOrZero32, dpOrZero42, qVar2, null, null, c3969l, 3462, 12582912, 790528);
            function14 = function13;
            e eVar42 = eVar2;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function12 = function1;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
        boolean z1222 = !dto.getIsDisabled();
        CellDTO.Settings settings222 = dto.getSettings();
        if (settings222 != null) {
        }
        u11.o(1848367359);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        q qVar22 = (q) C11;
        u11.k();
        CellDTO.Settings settings322 = dto.getSettings();
        float dpOrZero52 = getDpOrZero(settings322 != null ? settings322.getLeftPadding() : null);
        CellDTO.Settings settings422 = dto.getSettings();
        float dpOrZero222 = getDpOrZero(settings422 != null ? settings422.getTopPadding() : null);
        CellDTO.Settings settings522 = dto.getSettings();
        float dpOrZero322 = getDpOrZero(settings522 != null ? settings522.getRightPadding() : null);
        CellDTO.Settings settings622 = dto.getSettings();
        float dpOrZero422 = getDpOrZero(settings622 != null ? settings622.getBottomPadding() : null);
        settings = dto.getSettings();
        if (settings != null) {
        }
        CornerRadius cornerRadius22 = CornerRadius.NO_RADIUS;
        float m1866getDpD9Ej5fM22 = cornerRadius22.m1866getDpD9Ej5fM();
        M m1122 = new M();
        M m1222 = new M();
        u11.o(1848383442);
        if (d11) {
        }
        toggleControlState4 = null;
        u11.k();
        u11.o(1848405261);
        if (!d11) {
        }
        toggleControlState8 = null;
        u11.k();
        CellDTO.LeftBlock leftBlock22222 = dto.getLeftBlock();
        if (leftBlock22222 != null) {
        }
        u11.o(1848427248);
        if (foundationMapperKt$toOnClickLambda$1$1 == null) {
        }
        u11.k();
        CellDTO.RightBlock rightBlock22222 = dto.getRightBlock();
        if (rightBlock22222 != null) {
        }
        u11.o(1848432398);
        if (foundationMapperKt$toOnClickLambda$1$12 == null) {
        }
        u11.k();
        CommonControlSettings common32222 = dto.getCommon();
        if (common32222 != null) {
        }
        u11.o(1848437130);
        if (foundationMapperKt$toOnClickLambda$1$13 == null) {
        }
        u11.k();
        CellDTO.Settings settings72222 = dto.getSettings();
        boolean z132222 = !((settings72222 == null && (disableSeparator = settings72222.getDisableSeparator()) != null && disableSeparator.booleanValue()) ? z11 : false);
        CellDTO.Settings settings82222 = dto.getSettings();
        C7807Z c7807z4222 = TokenParserKt.tokenToColor(settings82222 != null ? settings82222.getSeparatorColor() : null, u11, 0);
        u11.o(1848446853);
        long graphicNeutral2222 = c7807z4222 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z4222.w();
        u11.k();
        CellDTO.Settings settings92222 = dto.getSettings();
        C7807Z c7807z22222 = TokenParserKt.tokenToColor(settings92222 != null ? settings92222.getBackgroundColor() : null, u11, 0);
        long w112222 = c7807z22222 != null ? c7807z22222.w() : C7807Z.f72259m;
        CellDTO.Settings settings102222 = dto.getSettings();
        C7807Z c7807z32222 = TokenParserKt.tokenToColor(settings102222 != null ? settings102222.getBackgroundHoverColor() : null, u11, 0);
        long w122222 = c7807z32222 != null ? c7807z32222.w() : C7807Z.f72259m;
        DsCellLocator dsCellLocator2222 = new DsCellLocator(dto.getTestInfo(), null, 2, null);
        e testTag2222 = AtomLocatorKt.testTag(C6988h.a(viewAnalytics22, h.b(m1866getDpD9Ej5fM22)), dsCellLocator2222);
        u11.o(1848492408);
        if (function03 != null) {
        }
        u11.o(1848495963);
        n11 = u11.n(function03) | u11.n(function0) | u11.n(function02);
        C12 = u11.C();
        if (!n11) {
        }
        C12 = new DsCellAtomKt$DsCellAtom$2$1(function03, function0, function02);
        u11.x(C12);
        u11.k();
        function04 = (Function0) C12;
        u11.k();
        eVar2 = eVar3;
        c3969l = u11;
        DsCellKt.m1701DsCell0rfeiU(c.c(-1635621928, new DsCellAtomKt$DsCellAtom$3(dto, dsCellLocator2222, function13), u11), testTag2222, c.c(-624319607, new DsCellAtomKt$DsCellAtom$4(dto, m1122, dsCellLocator2222), u11), c.c(913633585, new DsCellAtomKt$DsCellAtom$5(dto, m1222, dsCellLocator2222, qVar22, function02, function03), u11), function0, function02, function04, z1222, z132222, graphicNeutral2222, w112222, w122222, null, dpOrZero52, dpOrZero222, dpOrZero322, dpOrZero422, qVar22, null, null, c3969l, 3462, 12582912, 790528);
        function14 = function13;
        e eVar422 = eVar2;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LeftBlock(DsCell.StartScope startScope, CellDTO.LeftBlock leftBlock, Locator locator, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        DsCell.StartScope startScope2;
        C3969l u11 = interfaceC3967k.u(1178580478);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(startScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(leftBlock) : u11.F(leftBlock) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(locator) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            startScope2 = startScope;
        } else {
            startScope2 = startScope;
            startScope2.Addon(getAsVerticalAlignment(leftBlock.getAlignment()), c.c(1290415454, new DsCellAtomKt$LeftBlock$1$1(locator, leftBlock), u11), u11, ((i12 << 6) & 896) | 48, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DsCellAtomKt$LeftBlock$2(startScope2, leftBlock, locator, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RightBlock(DsCell.EndScope endScope, CellDTO.RightBlock rightBlock, Locator locator, q qVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        DsCell.EndScope endScope2;
        C3969l u11 = interfaceC3967k.u(1257439282);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(endScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(rightBlock) : u11.F(rightBlock) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(locator) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(qVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function0) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            endScope2 = endScope;
        } else {
            endScope2 = endScope;
            endScope2.Addon(getAsVerticalAlignment(rightBlock.getAlignment()), c.c(294032593, new DsCellAtomKt$RightBlock$1$1(locator, rightBlock, qVar, function0), u11), u11, ((i12 << 6) & 896) | 48, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DsCellAtomKt$RightBlock$2(endScope2, rightBlock, locator, qVar, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007a  */
    /* renamed from: TitleRowWithBadgeAndIcon-HYR8e34, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1699TitleRowWithBadgeAndIconHYR8e34(final TextDTO textDTO, BadgeDTO badgeDTO, IconDTO iconDTO, Function1<? super AtomAction, Unit> function1, e eVar, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super AtomAction, Unit> function12;
        int i14;
        e eVar2;
        int i15;
        float f11;
        int i16;
        final float m1854getDp4D9Ej5fM;
        e eVar3;
        final C3422b c3422b;
        boolean n11;
        Object C11;
        int I11;
        e eVar4;
        e eVar5;
        e eVar6;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1715702891);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(badgeDTO) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(iconDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 16384 : 8192;
                i15 = i12 & 32;
                if (i15 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    f11 = f7;
                    i13 |= u11.q(f11) ? 131072 : 65536;
                    i16 = i13;
                    if ((i16 & 74899) == 74898 || !u11.b()) {
                        e eVar7 = i14 == 0 ? e.f40358c0 : eVar2;
                        m1854getDp4D9Ej5fM = i15 == 0 ? DsSpacings.INSTANCE.m1854getDp4D9Ej5fM() : f11;
                        final K1.M a11 = N.a(u11);
                        u11.o(1974651445);
                        if (textDTO.getTagSupported()) {
                            eVar3 = null;
                            String obj = textDTO.getText().toString();
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                            c3422b = new C3422b(6, obj, null);
                        } else {
                            eVar3 = null;
                            c3422b = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(textDTO.getText(), 0L, u11, 0, 1);
                        }
                        u11.k();
                        u11.o(1974665207);
                        int i17 = i16 & 14;
                        n11 = ((i16 & 458752) != 131072) | (i17 != 4) | u11.n(a11) | u11.n(c3422b);
                        C11 = u11.C();
                        if (!n11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new V() { // from class: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1

                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                                /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$1, reason: invalid class name */
                                static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                                    final /* synthetic */ m0 $textPlaceable;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(m0 m0Var) {
                                        super(1);
                                        this.$textPlaceable = m0Var;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                        invoke2(aVar);
                                        return Unit.f71690a;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(m0.a layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        layout.h(this.$textPlaceable, 0, 0, 0.0f);
                                    }
                                }

                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                                /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$2, reason: invalid class name */
                                /* loaded from: classes4.dex */
                                static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                                    final /* synthetic */ List<m0> $restPlaceables;
                                    final /* synthetic */ int $spacingPx;
                                    final /* synthetic */ float $textFirstLineCenterY;
                                    final /* synthetic */ m0 $textPlaceable;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass2(m0 m0Var, List<? extends m0> list, int i11, float f7) {
                                        super(1);
                                        this.$textPlaceable = m0Var;
                                        this.$restPlaceables = list;
                                        this.$spacingPx = i11;
                                        this.$textFirstLineCenterY = f7;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                        invoke2(aVar);
                                        return Unit.f71690a;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(m0.a layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        layout.h(this.$textPlaceable, 0, 0, 0.0f);
                                        int u02 = this.$textPlaceable.u0();
                                        List<m0> list = this.$restPlaceables;
                                        int i11 = this.$spacingPx;
                                        float f7 = this.$textFirstLineCenterY;
                                        int size = list.size();
                                        for (int i12 = 0; i12 < size; i12++) {
                                            m0 m0Var = list.get(i12);
                                            int i13 = u02 + i11;
                                            int c11 = C6915b.c(f7 - (m0Var.l0() / 2.0f));
                                            if (c11 < 0) {
                                                c11 = 0;
                                            }
                                            layout.h(m0Var, i13, c11, 0.0f);
                                            u02 = i13 + m0Var.u0();
                                        }
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
                                /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
                                @Override // B1.V
                                /* renamed from: measure-3p2s80s */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                                    DsTextPreset extractTextPreset;
                                    int i18;
                                    C7665d it;
                                    W z02;
                                    W z03;
                                    W z04;
                                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    U u12 = (U) C7714v.M(measurables);
                                    if (u12 == null) {
                                        z04 = Layout.z0(0, 0, kotlin.collections.U.c(), DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$textMeasurable$1.INSTANCE);
                                        return z04;
                                    }
                                    List D11 = C7714v.D(measurables, 1);
                                    long c11 = b.c(0, 0, 0, 0, 10, j11);
                                    if (D11.isEmpty()) {
                                        m0 a02 = u12.a0(c11);
                                        z03 = Layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new AnonymousClass1(a02));
                                        return z03;
                                    }
                                    int Y02 = Layout.Y0(m1854getDp4D9Ej5fM);
                                    ArrayList arrayList = new ArrayList(D11.size());
                                    int size = D11.size();
                                    for (int i19 = 0; i19 < size; i19++) {
                                        arrayList.add(((U) D11.get(i19)).a0(c11));
                                    }
                                    int size2 = arrayList.size();
                                    int i21 = 0;
                                    for (int i22 = 0; i22 < size2; i22++) {
                                        i21 += ((m0) arrayList.get(i22)).u0();
                                    }
                                    int size3 = (arrayList.size() * Y02) + i21;
                                    int k11 = b.k(j11) - size3;
                                    int i23 = k11 < 0 ? 0 : k11;
                                    int truncateMode = DsTextAtomMappersKt.getTruncateMode(textDTO.getTruncatingMode());
                                    extractTextPreset = DsCellAtomKt.extractTextPreset(textDTO);
                                    T textStyle = extractTextPreset.getTextStyle();
                                    Integer maxLines = textDTO.getMaxLines();
                                    if (maxLines != null) {
                                        if (maxLines.intValue() <= 0) {
                                            maxLines = null;
                                        }
                                        if (maxLines != null) {
                                            i18 = maxLines.intValue();
                                            Float f12 = null;
                                            K b11 = K1.M.b(a11, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                                            it = kotlin.ranges.h.o(0, b11.m()).iterator();
                                            if (it.hasNext()) {
                                                throw new NoSuchElementException();
                                            }
                                            float lineWidth$default = DsCellAtomKt.getLineWidth$default(b11, it.b(), 0.0f, 2, null);
                                            while (it.hasNext()) {
                                                lineWidth$default = Math.max(lineWidth$default, DsCellAtomKt.getLineWidth$default(b11, it.b(), 0.0f, 2, null));
                                            }
                                            m0 a03 = u12.a0(b.c(0, C6915b.c(lineWidth$default), 0, 0, 13, c11));
                                            float lineHeight$default = (b11.m() > 0 ? DsCellAtomKt.getLineHeight$default(b11, 0, 0.0f, 2, null) : a03.l0()) / 2.0f;
                                            int u02 = a03.u0() + size3;
                                            int k12 = b.k(j11);
                                            if (u02 > k12) {
                                                u02 = k12;
                                            }
                                            int l02 = a03.l0();
                                            if (!arrayList.isEmpty()) {
                                                m0 m0Var = (m0) arrayList.get(0);
                                                f12 = Float.valueOf(Math.max((m0Var.l0() / 2.0f) + lineHeight$default, m0Var.l0()));
                                                int P11 = C7714v.P(arrayList);
                                                int i24 = 1;
                                                if (1 <= P11) {
                                                    while (true) {
                                                        m0 m0Var2 = (m0) arrayList.get(i24);
                                                        Float valueOf = Float.valueOf(Math.max((m0Var2.l0() / 2.0f) + lineHeight$default, m0Var2.l0()));
                                                        if (valueOf.compareTo(f12) > 0) {
                                                            f12 = valueOf;
                                                        }
                                                        if (i24 == P11) {
                                                            break;
                                                        }
                                                        i24++;
                                                    }
                                                }
                                            }
                                            Float f13 = f12;
                                            z02 = Layout.z0(u02, Math.max(l02, f13 != null ? C6915b.c(f13.floatValue()) : 0), kotlin.collections.U.c(), new AnonymousClass2(a03, arrayList, Y02, lineHeight$default));
                                            return z02;
                                        }
                                    }
                                    i18 = Integer.MAX_VALUE;
                                    Float f122 = null;
                                    K b112 = K1.M.b(a11, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                                    it = kotlin.ranges.h.o(0, b112.m()).iterator();
                                    if (it.hasNext()) {
                                    }
                                }
                            };
                            u11.x(C11);
                        }
                        V v11 = (V) C11;
                        u11.k();
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f12 = androidx.compose.ui.c.f(u11, eVar7);
                        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a12);
                        }
                        Function2 f13 = E.f(u11, v11, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, f13);
                        }
                        F1.b(u11, f12, InterfaceC2801g.a.f());
                        DsTextAtomKt.DsTextAtom(textDTO, eVar3, u11, i17, 2);
                        u11.o(1415556066);
                        if (badgeDTO != null) {
                            eVar4 = eVar7;
                            eVar5 = eVar3;
                            f11 = m1854getDp4D9Ej5fM;
                        } else {
                            f11 = m1854getDp4D9Ej5fM;
                            eVar4 = eVar7;
                            eVar5 = eVar3;
                            DsBadgeAtomKt.DsBadgeAtom(badgeDTO, null, function12, u11, (i16 >> 3) & 910, 2);
                        }
                        u11.k();
                        u11.o(1415558533);
                        if (iconDTO != null) {
                            DsIconAtomKt.DsIconAtom(iconDTO, eVar5, u11, (i16 >> 6) & 14, 2);
                        }
                        u11.k();
                        u11.f();
                        eVar6 = eVar4;
                    } else {
                        u11.j();
                        eVar6 = eVar2;
                    }
                    float f14 = f11;
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new DsCellAtomKt$TitleRowWithBadgeAndIcon$3(textDTO, badgeDTO, iconDTO, function1, eVar6, f14, i11, i12));
                        return;
                    }
                    return;
                }
                f11 = f7;
                i16 = i13;
                if ((i16 & 74899) == 74898) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                final K1.M a112 = N.a(u11);
                u11.o(1974651445);
                if (textDTO.getTagSupported()) {
                }
                u11.k();
                u11.o(1974665207);
                int i172 = i16 & 14;
                n11 = ((i16 & 458752) != 131072) | (i172 != 4) | u11.n(a112) | u11.n(c3422b);
                C11 = u11.C();
                if (!n11) {
                }
                C11 = new V() { // from class: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $textPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(m0 m0Var) {
                            super(1);
                            this.$textPlaceable = m0Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            layout.h(this.$textPlaceable, 0, 0, 0.0f);
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ List<m0> $restPlaceables;
                        final /* synthetic */ int $spacingPx;
                        final /* synthetic */ float $textFirstLineCenterY;
                        final /* synthetic */ m0 $textPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(m0 m0Var, List<? extends m0> list, int i11, float f7) {
                            super(1);
                            this.$textPlaceable = m0Var;
                            this.$restPlaceables = list;
                            this.$spacingPx = i11;
                            this.$textFirstLineCenterY = f7;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            layout.h(this.$textPlaceable, 0, 0, 0.0f);
                            int u02 = this.$textPlaceable.u0();
                            List<m0> list = this.$restPlaceables;
                            int i11 = this.$spacingPx;
                            float f7 = this.$textFirstLineCenterY;
                            int size = list.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                m0 m0Var = list.get(i12);
                                int i13 = u02 + i11;
                                int c11 = C6915b.c(f7 - (m0Var.l0() / 2.0f));
                                if (c11 < 0) {
                                    c11 = 0;
                                }
                                layout.h(m0Var, i13, c11, 0.0f);
                                u02 = i13 + m0Var.u0();
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        DsTextPreset extractTextPreset;
                        int i18;
                        C7665d it;
                        W z02;
                        W z03;
                        W z04;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        U u12 = (U) C7714v.M(measurables);
                        if (u12 == null) {
                            z04 = Layout.z0(0, 0, kotlin.collections.U.c(), DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$textMeasurable$1.INSTANCE);
                            return z04;
                        }
                        List D11 = C7714v.D(measurables, 1);
                        long c11 = b.c(0, 0, 0, 0, 10, j11);
                        if (D11.isEmpty()) {
                            m0 a02 = u12.a0(c11);
                            z03 = Layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new AnonymousClass1(a02));
                            return z03;
                        }
                        int Y02 = Layout.Y0(m1854getDp4D9Ej5fM);
                        ArrayList arrayList = new ArrayList(D11.size());
                        int size = D11.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            arrayList.add(((U) D11.get(i19)).a0(c11));
                        }
                        int size2 = arrayList.size();
                        int i21 = 0;
                        for (int i22 = 0; i22 < size2; i22++) {
                            i21 += ((m0) arrayList.get(i22)).u0();
                        }
                        int size3 = (arrayList.size() * Y02) + i21;
                        int k11 = b.k(j11) - size3;
                        int i23 = k11 < 0 ? 0 : k11;
                        int truncateMode = DsTextAtomMappersKt.getTruncateMode(textDTO.getTruncatingMode());
                        extractTextPreset = DsCellAtomKt.extractTextPreset(textDTO);
                        T textStyle = extractTextPreset.getTextStyle();
                        Integer maxLines = textDTO.getMaxLines();
                        if (maxLines != null) {
                            if (maxLines.intValue() <= 0) {
                                maxLines = null;
                            }
                            if (maxLines != null) {
                                i18 = maxLines.intValue();
                                Float f122 = null;
                                K b112 = K1.M.b(a112, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                                it = kotlin.ranges.h.o(0, b112.m()).iterator();
                                if (it.hasNext()) {
                                    throw new NoSuchElementException();
                                }
                                float lineWidth$default = DsCellAtomKt.getLineWidth$default(b112, it.b(), 0.0f, 2, null);
                                while (it.hasNext()) {
                                    lineWidth$default = Math.max(lineWidth$default, DsCellAtomKt.getLineWidth$default(b112, it.b(), 0.0f, 2, null));
                                }
                                m0 a03 = u12.a0(b.c(0, C6915b.c(lineWidth$default), 0, 0, 13, c11));
                                float lineHeight$default = (b112.m() > 0 ? DsCellAtomKt.getLineHeight$default(b112, 0, 0.0f, 2, null) : a03.l0()) / 2.0f;
                                int u02 = a03.u0() + size3;
                                int k12 = b.k(j11);
                                if (u02 > k12) {
                                    u02 = k12;
                                }
                                int l02 = a03.l0();
                                if (!arrayList.isEmpty()) {
                                    m0 m0Var = (m0) arrayList.get(0);
                                    f122 = Float.valueOf(Math.max((m0Var.l0() / 2.0f) + lineHeight$default, m0Var.l0()));
                                    int P11 = C7714v.P(arrayList);
                                    int i24 = 1;
                                    if (1 <= P11) {
                                        while (true) {
                                            m0 m0Var2 = (m0) arrayList.get(i24);
                                            Float valueOf = Float.valueOf(Math.max((m0Var2.l0() / 2.0f) + lineHeight$default, m0Var2.l0()));
                                            if (valueOf.compareTo(f122) > 0) {
                                                f122 = valueOf;
                                            }
                                            if (i24 == P11) {
                                                break;
                                            }
                                            i24++;
                                        }
                                    }
                                }
                                Float f132 = f122;
                                z02 = Layout.z0(u02, Math.max(l02, f132 != null ? C6915b.c(f132.floatValue()) : 0), kotlin.collections.U.c(), new AnonymousClass2(a03, arrayList, Y02, lineHeight$default));
                                return z02;
                            }
                        }
                        i18 = Integer.MAX_VALUE;
                        Float f1222 = null;
                        K b1122 = K1.M.b(a112, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                        it = kotlin.ranges.h.o(0, b1122.m()).iterator();
                        if (it.hasNext()) {
                        }
                    }
                };
                u11.x(C11);
                V v112 = (V) C11;
                u11.k();
                I11 = u11.I();
                A0 d112 = u11.d();
                e f122 = androidx.compose.ui.c.f(u11, eVar7);
                Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f132 = E.f(u11, v112, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f132);
                F1.b(u11, f122, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(textDTO, eVar3, u11, i172, 2);
                u11.o(1415556066);
                if (badgeDTO != null) {
                }
                u11.k();
                u11.o(1415558533);
                if (iconDTO != null) {
                }
                u11.k();
                u11.f();
                eVar6 = eVar4;
                float f142 = f11;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            eVar2 = eVar;
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            f11 = f7;
            i16 = i13;
            if ((i16 & 74899) == 74898) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            final K1.M a1122 = N.a(u11);
            u11.o(1974651445);
            if (textDTO.getTagSupported()) {
            }
            u11.k();
            u11.o(1974665207);
            int i1722 = i16 & 14;
            n11 = ((i16 & 458752) != 131072) | (i1722 != 4) | u11.n(a1122) | u11.n(c3422b);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = new V() { // from class: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                    final /* synthetic */ m0 $textPlaceable;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(m0 m0Var) {
                        super(1);
                        this.$textPlaceable = m0Var;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                        invoke2(aVar);
                        return Unit.f71690a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(m0.a layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        layout.h(this.$textPlaceable, 0, 0, 0.0f);
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                    final /* synthetic */ List<m0> $restPlaceables;
                    final /* synthetic */ int $spacingPx;
                    final /* synthetic */ float $textFirstLineCenterY;
                    final /* synthetic */ m0 $textPlaceable;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(m0 m0Var, List<? extends m0> list, int i11, float f7) {
                        super(1);
                        this.$textPlaceable = m0Var;
                        this.$restPlaceables = list;
                        this.$spacingPx = i11;
                        this.$textFirstLineCenterY = f7;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                        invoke2(aVar);
                        return Unit.f71690a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(m0.a layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        layout.h(this.$textPlaceable, 0, 0, 0.0f);
                        int u02 = this.$textPlaceable.u0();
                        List<m0> list = this.$restPlaceables;
                        int i11 = this.$spacingPx;
                        float f7 = this.$textFirstLineCenterY;
                        int size = list.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            m0 m0Var = list.get(i12);
                            int i13 = u02 + i11;
                            int c11 = C6915b.c(f7 - (m0Var.l0() / 2.0f));
                            if (c11 < 0) {
                                c11 = 0;
                            }
                            layout.h(m0Var, i13, c11, 0.0f);
                            u02 = i13 + m0Var.u0();
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
                @Override // B1.V
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                    DsTextPreset extractTextPreset;
                    int i18;
                    C7665d it;
                    W z02;
                    W z03;
                    W z04;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    U u12 = (U) C7714v.M(measurables);
                    if (u12 == null) {
                        z04 = Layout.z0(0, 0, kotlin.collections.U.c(), DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$textMeasurable$1.INSTANCE);
                        return z04;
                    }
                    List D11 = C7714v.D(measurables, 1);
                    long c11 = b.c(0, 0, 0, 0, 10, j11);
                    if (D11.isEmpty()) {
                        m0 a02 = u12.a0(c11);
                        z03 = Layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new AnonymousClass1(a02));
                        return z03;
                    }
                    int Y02 = Layout.Y0(m1854getDp4D9Ej5fM);
                    ArrayList arrayList = new ArrayList(D11.size());
                    int size = D11.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        arrayList.add(((U) D11.get(i19)).a0(c11));
                    }
                    int size2 = arrayList.size();
                    int i21 = 0;
                    for (int i22 = 0; i22 < size2; i22++) {
                        i21 += ((m0) arrayList.get(i22)).u0();
                    }
                    int size3 = (arrayList.size() * Y02) + i21;
                    int k11 = b.k(j11) - size3;
                    int i23 = k11 < 0 ? 0 : k11;
                    int truncateMode = DsTextAtomMappersKt.getTruncateMode(textDTO.getTruncatingMode());
                    extractTextPreset = DsCellAtomKt.extractTextPreset(textDTO);
                    T textStyle = extractTextPreset.getTextStyle();
                    Integer maxLines = textDTO.getMaxLines();
                    if (maxLines != null) {
                        if (maxLines.intValue() <= 0) {
                            maxLines = null;
                        }
                        if (maxLines != null) {
                            i18 = maxLines.intValue();
                            Float f1222 = null;
                            K b1122 = K1.M.b(a1122, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                            it = kotlin.ranges.h.o(0, b1122.m()).iterator();
                            if (it.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            float lineWidth$default = DsCellAtomKt.getLineWidth$default(b1122, it.b(), 0.0f, 2, null);
                            while (it.hasNext()) {
                                lineWidth$default = Math.max(lineWidth$default, DsCellAtomKt.getLineWidth$default(b1122, it.b(), 0.0f, 2, null));
                            }
                            m0 a03 = u12.a0(b.c(0, C6915b.c(lineWidth$default), 0, 0, 13, c11));
                            float lineHeight$default = (b1122.m() > 0 ? DsCellAtomKt.getLineHeight$default(b1122, 0, 0.0f, 2, null) : a03.l0()) / 2.0f;
                            int u02 = a03.u0() + size3;
                            int k12 = b.k(j11);
                            if (u02 > k12) {
                                u02 = k12;
                            }
                            int l02 = a03.l0();
                            if (!arrayList.isEmpty()) {
                                m0 m0Var = (m0) arrayList.get(0);
                                f1222 = Float.valueOf(Math.max((m0Var.l0() / 2.0f) + lineHeight$default, m0Var.l0()));
                                int P11 = C7714v.P(arrayList);
                                int i24 = 1;
                                if (1 <= P11) {
                                    while (true) {
                                        m0 m0Var2 = (m0) arrayList.get(i24);
                                        Float valueOf = Float.valueOf(Math.max((m0Var2.l0() / 2.0f) + lineHeight$default, m0Var2.l0()));
                                        if (valueOf.compareTo(f1222) > 0) {
                                            f1222 = valueOf;
                                        }
                                        if (i24 == P11) {
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                            }
                            Float f1322 = f1222;
                            z02 = Layout.z0(u02, Math.max(l02, f1322 != null ? C6915b.c(f1322.floatValue()) : 0), kotlin.collections.U.c(), new AnonymousClass2(a03, arrayList, Y02, lineHeight$default));
                            return z02;
                        }
                    }
                    i18 = Integer.MAX_VALUE;
                    Float f12222 = null;
                    K b11222 = K1.M.b(a1122, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                    it = kotlin.ranges.h.o(0, b11222.m()).iterator();
                    if (it.hasNext()) {
                    }
                }
            };
            u11.x(C11);
            V v1122 = (V) C11;
            u11.k();
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f1222 = androidx.compose.ui.c.f(u11, eVar7);
            Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1322 = E.f(u11, v1122, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f1322);
            F1.b(u11, f1222, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(textDTO, eVar3, u11, i1722, 2);
            u11.o(1415556066);
            if (badgeDTO != null) {
            }
            u11.k();
            u11.o(1415558533);
            if (iconDTO != null) {
            }
            u11.k();
            u11.f();
            eVar6 = eVar4;
            float f1422 = f11;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        function12 = function1;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        f11 = f7;
        i16 = i13;
        if ((i16 & 74899) == 74898) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        final K1.M a11222 = N.a(u11);
        u11.o(1974651445);
        if (textDTO.getTagSupported()) {
        }
        u11.k();
        u11.o(1974665207);
        int i17222 = i16 & 14;
        n11 = ((i16 & 458752) != 131072) | (i17222 != 4) | u11.n(a11222) | u11.n(c3422b);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new V() { // from class: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                final /* synthetic */ m0 $textPlaceable;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(m0 m0Var) {
                    super(1);
                    this.$textPlaceable = m0Var;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                    invoke2(aVar);
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(m0.a layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    layout.h(this.$textPlaceable, 0, 0, 0.0f);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                final /* synthetic */ List<m0> $restPlaceables;
                final /* synthetic */ int $spacingPx;
                final /* synthetic */ float $textFirstLineCenterY;
                final /* synthetic */ m0 $textPlaceable;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(m0 m0Var, List<? extends m0> list, int i11, float f7) {
                    super(1);
                    this.$textPlaceable = m0Var;
                    this.$restPlaceables = list;
                    this.$spacingPx = i11;
                    this.$textFirstLineCenterY = f7;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                    invoke2(aVar);
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(m0.a layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    layout.h(this.$textPlaceable, 0, 0, 0.0f);
                    int u02 = this.$textPlaceable.u0();
                    List<m0> list = this.$restPlaceables;
                    int i11 = this.$spacingPx;
                    float f7 = this.$textFirstLineCenterY;
                    int size = list.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        m0 m0Var = list.get(i12);
                        int i13 = u02 + i11;
                        int c11 = C6915b.c(f7 - (m0Var.l0() / 2.0f));
                        if (c11 < 0) {
                            c11 = 0;
                        }
                        layout.h(m0Var, i13, c11, 0.0f);
                        u02 = i13 + m0Var.u0();
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
            @Override // B1.V
            /* renamed from: measure-3p2s80s */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                DsTextPreset extractTextPreset;
                int i18;
                C7665d it;
                W z02;
                W z03;
                W z04;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                U u12 = (U) C7714v.M(measurables);
                if (u12 == null) {
                    z04 = Layout.z0(0, 0, kotlin.collections.U.c(), DsCellAtomKt$TitleRowWithBadgeAndIcon$2$1$textMeasurable$1.INSTANCE);
                    return z04;
                }
                List D11 = C7714v.D(measurables, 1);
                long c11 = b.c(0, 0, 0, 0, 10, j11);
                if (D11.isEmpty()) {
                    m0 a02 = u12.a0(c11);
                    z03 = Layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new AnonymousClass1(a02));
                    return z03;
                }
                int Y02 = Layout.Y0(m1854getDp4D9Ej5fM);
                ArrayList arrayList = new ArrayList(D11.size());
                int size = D11.size();
                for (int i19 = 0; i19 < size; i19++) {
                    arrayList.add(((U) D11.get(i19)).a0(c11));
                }
                int size2 = arrayList.size();
                int i21 = 0;
                for (int i22 = 0; i22 < size2; i22++) {
                    i21 += ((m0) arrayList.get(i22)).u0();
                }
                int size3 = (arrayList.size() * Y02) + i21;
                int k11 = b.k(j11) - size3;
                int i23 = k11 < 0 ? 0 : k11;
                int truncateMode = DsTextAtomMappersKt.getTruncateMode(textDTO.getTruncatingMode());
                extractTextPreset = DsCellAtomKt.extractTextPreset(textDTO);
                T textStyle = extractTextPreset.getTextStyle();
                Integer maxLines = textDTO.getMaxLines();
                if (maxLines != null) {
                    if (maxLines.intValue() <= 0) {
                        maxLines = null;
                    }
                    if (maxLines != null) {
                        i18 = maxLines.intValue();
                        Float f12222 = null;
                        K b11222 = K1.M.b(a11222, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                        it = kotlin.ranges.h.o(0, b11222.m()).iterator();
                        if (it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        float lineWidth$default = DsCellAtomKt.getLineWidth$default(b11222, it.b(), 0.0f, 2, null);
                        while (it.hasNext()) {
                            lineWidth$default = Math.max(lineWidth$default, DsCellAtomKt.getLineWidth$default(b11222, it.b(), 0.0f, 2, null));
                        }
                        m0 a03 = u12.a0(b.c(0, C6915b.c(lineWidth$default), 0, 0, 13, c11));
                        float lineHeight$default = (b11222.m() > 0 ? DsCellAtomKt.getLineHeight$default(b11222, 0, 0.0f, 2, null) : a03.l0()) / 2.0f;
                        int u02 = a03.u0() + size3;
                        int k12 = b.k(j11);
                        if (u02 > k12) {
                            u02 = k12;
                        }
                        int l02 = a03.l0();
                        if (!arrayList.isEmpty()) {
                            m0 m0Var = (m0) arrayList.get(0);
                            f12222 = Float.valueOf(Math.max((m0Var.l0() / 2.0f) + lineHeight$default, m0Var.l0()));
                            int P11 = C7714v.P(arrayList);
                            int i24 = 1;
                            if (1 <= P11) {
                                while (true) {
                                    m0 m0Var2 = (m0) arrayList.get(i24);
                                    Float valueOf = Float.valueOf(Math.max((m0Var2.l0() / 2.0f) + lineHeight$default, m0Var2.l0()));
                                    if (valueOf.compareTo(f12222) > 0) {
                                        f12222 = valueOf;
                                    }
                                    if (i24 == P11) {
                                        break;
                                    }
                                    i24++;
                                }
                            }
                        }
                        Float f13222 = f12222;
                        z02 = Layout.z0(u02, Math.max(l02, f13222 != null ? C6915b.c(f13222.floatValue()) : 0), kotlin.collections.U.c(), new AnonymousClass2(a03, arrayList, Y02, lineHeight$default));
                        return z02;
                    }
                }
                i18 = Integer.MAX_VALUE;
                Float f122222 = null;
                K b112222 = K1.M.b(a11222, c3422b, textStyle, truncateMode, false, i18, b.c(0, i23, 0, 0, 13, c11), null, null, null, 1960);
                it = kotlin.ranges.h.o(0, b112222.m()).iterator();
                if (it.hasNext()) {
                }
            }
        };
        u11.x(C11);
        V v11222 = (V) C11;
        u11.k();
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f12222 = androidx.compose.ui.c.f(u11, eVar7);
        Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f13222 = E.f(u11, v11222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f13222);
        F1.b(u11, f12222, InterfaceC2801g.a.f());
        DsTextAtomKt.DsTextAtom(textDTO, eVar3, u11, i17222, 2);
        u11.o(1415556066);
        if (badgeDTO != null) {
        }
        u11.k();
        u11.o(1415558533);
        if (iconDTO != null) {
        }
        u11.k();
        u11.f();
        eVar6 = eVar4;
        float f14222 = f11;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DsTextPreset extractTextPreset(TextDTO textDTO) {
        return textDTO.getPreset() == TextPreset.PRESET_CUSTOM ? DsTextAtomMappersKt.getCustomPreset(textDTO.getTypographyToken(), null, null) : DsTextAtomMappersKt.getTextPreset(textDTO.getPreset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5179b.e getAsAddonItemsHorizontalArrangement(CommonCellSettings.LayoutPadding layoutPadding) {
        UniPaddingToken padding350;
        int i11 = C5179b.f39454h;
        if (layoutPadding == null || (padding350 = FoundationMapperKt.getToken(layoutPadding)) == null) {
            padding350 = UniTheme.INSTANCE.getPaddingTokens().getPadding350();
        }
        return C5179b.n(TokensExtKt.getDp(padding350));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconDTO getAsIconDto(CommonAtomIconDTO commonAtomIconDTO) {
        return new IconDTO(IconDTO.IconSize.SIZE_400, null, IconDTO.IconShape.SHAPE_NONE, null, commonAtomIconDTO, null, null, null, null, null, null, null, null, null, null, null, 65514, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDTO getAsTextDto(CellDTO.CellText cellText) {
        OzonSpannableString text = cellText.getText();
        String textColor = cellText.getTextColor();
        String typographyToken = cellText.getTypographyToken();
        Integer maxLines = cellText.getMaxLines();
        return new TextDTO(text, null, null, null, null, null, TextPreset.PRESET_CUSTOM, typographyToken, textColor, null, null, null, null, cellText.getTagSupported(), cellText.getTruncatingMode(), null, null, null, maxLines, 237118, null);
    }

    private static final InterfaceC6250b.c getAsVerticalAlignment(CellDTO.BlockAlignment blockAlignment) {
        CellView.AddonBlock.Alignment alignment = blockAlignment != null ? blockAlignment.getAlignment() : null;
        return (alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()]) == 1 ? InterfaceC6250b.a.l() : InterfaceC6250b.a.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getDpOrZero(CommonCellSettings.LayoutPadding layoutPadding) {
        UniPaddingToken none;
        if (layoutPadding == null || (none = FoundationMapperKt.getToken(layoutPadding)) == null) {
            none = UniTheme.INSTANCE.getPaddingTokens().getNone();
        }
        return TokensExtKt.getDp(none);
    }

    private static final float getLineHeight(K k11, int i11, float f7) {
        if (k11.m() <= i11) {
            return f7;
        }
        return (float) Math.ceil(k11.u(i11) + k11.l(i11));
    }

    static /* synthetic */ float getLineHeight$default(K k11, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 0.0f;
        }
        return getLineHeight(k11, i11, f7);
    }

    private static final float getLineWidth(K k11, int i11, float f7) {
        return k11.m() > i11 ? (float) Math.ceil(k11.s(i11)) : f7;
    }

    static /* synthetic */ float getLineWidth$default(K k11, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 0.0f;
        }
        return getLineWidth(k11, i11, f7);
    }

    private static final CheckBoxControlState rememberCheckBoxControlState(CheckBoxDTO.CheckboxStatus checkboxStatus, InterfaceC3967k interfaceC3967k, int i11) {
        CheckBoxControlState checkBoxControlState;
        interfaceC3967k.o(-1824657962);
        if (checkboxStatus == null) {
            checkBoxControlState = null;
        } else {
            interfaceC3967k.o(552802786);
            boolean n11 = interfaceC3967k.n(checkboxStatus);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CheckBoxControlState(checkboxStatus);
                interfaceC3967k.x(C11);
            }
            checkBoxControlState = (CheckBoxControlState) C11;
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return checkBoxControlState;
    }

    private static final RadioControlState rememberRadioControlState(Boolean bool, InterfaceC3967k interfaceC3967k, int i11) {
        RadioControlState radioControlState;
        interfaceC3967k.o(-642893263);
        if (bool == null) {
            radioControlState = null;
        } else {
            boolean booleanValue = bool.booleanValue();
            interfaceC3967k.o(874936689);
            boolean p11 = interfaceC3967k.p(booleanValue);
            Object C11 = interfaceC3967k.C();
            if (p11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new RadioControlState(booleanValue);
                interfaceC3967k.x(C11);
            }
            radioControlState = (RadioControlState) C11;
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return radioControlState;
    }

    private static final ToggleControlState rememberToggleControlState(Boolean bool, InterfaceC3967k interfaceC3967k, int i11) {
        ToggleControlState toggleControlState;
        interfaceC3967k.o(-1651560867);
        if (bool == null) {
            toggleControlState = null;
        } else {
            boolean booleanValue = bool.booleanValue();
            interfaceC3967k.o(122620721);
            boolean p11 = interfaceC3967k.p(booleanValue);
            Object C11 = interfaceC3967k.C();
            if (p11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ToggleControlState(booleanValue);
                interfaceC3967k.x(C11);
            }
            toggleControlState = (ToggleControlState) C11;
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return toggleControlState;
    }
}
