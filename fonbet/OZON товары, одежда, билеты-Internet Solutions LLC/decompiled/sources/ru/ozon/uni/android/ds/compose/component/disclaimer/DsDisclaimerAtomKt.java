package ru.ozon.uni.android.ds.compose.component.disclaimer;

import K1.C3422b;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import Sc.o;
import a1.C4912a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerButtonStyle;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;
import t0.u;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u0018\u001aA\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010\u000e\u001a\u00020\u001a*\u0004\u0018\u00010!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'²\u0006\f\u0010&\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "DsDisclaimerAtom", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$MainButton;", "", "hasIcon", "Lkotlin/Function0;", "asVo", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$MainButton;ZLkotlin/jvm/functions/Function1;LS0/k;I)Lkotlin/jvm/functions/Function2;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;", "theme", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;", "customButtonTheme", "Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerButtonStyle;", "getMainButtonStyle", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerButtonStyle;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$AdditionalButton;ZLkotlin/jvm/functions/Function1;LS0/k;I)Lkotlin/jvm/functions/Function2;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;", "style", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)Lkotlin/jvm/functions/Function2;", "LZ1/h;", "CORNER_RADIUS", "F", "", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$Theme;", "styleMap", "Ljava/util/Map;", "getAsVo", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$Theme;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;", "isPressed", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsDisclaimerAtomKt {
    private static final float CORNER_RADIUS = DsSpacings.INSTANCE.m1845getDp16D9Ej5fM();

    @NotNull
    private static final Map<DisclaimerDTO.Theme, Function2<InterfaceC3967k, Integer, DsDisclaimerStyle>> styleMap = U.j(new Pair(DisclaimerDTO.Theme.NEUTRAL, DsDisclaimerAtomKt$styleMap$1.INSTANCE), new Pair(DisclaimerDTO.Theme.POSITIVE, DsDisclaimerAtomKt$styleMap$2.INSTANCE), new Pair(DisclaimerDTO.Theme.WARNING, DsDisclaimerAtomKt$styleMap$3.INSTANCE), new Pair(DisclaimerDTO.Theme.NEGATIVE, DsDisclaimerAtomKt$styleMap$4.INSTANCE), new Pair(DisclaimerDTO.Theme.MARKETING, DsDisclaimerAtomKt$styleMap$5.INSTANCE));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerDTO.ButtonTheme.values().length];
            try {
                iArr[DisclaimerDTO.ButtonTheme.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.THEME_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.BASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsDisclaimerAtom(@NotNull DisclaimerDTO dto, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        e viewAnalytics;
        Object C11;
        CommonControlSettings closeButton;
        e eVar3;
        DsDisclaimerStyle dsDisclaimerStyle;
        Function2<InterfaceC3967k, Integer, Unit> function2;
        boolean z11;
        DsDisclaimerLocator dsDisclaimerLocator;
        InterfaceC3978p0 interfaceC3978p0;
        Function2<InterfaceC3967k, Integer, Unit> function22;
        e eVar4;
        OzonSpannableString title;
        DsDisclaimerStyle dsDisclaimerStyle2;
        C3422b m1836toAnnotateStringiJQMabo;
        Function1<? super AtomAction, Unit> function13;
        e eVar5;
        boolean n11;
        Object C12;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(196434743);
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
                    e eVar6 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        function12 = null;
                    }
                    viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar6, dto);
                    u11.o(-221783361);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = p.a();
                        u11.x(C11);
                    }
                    q qVar = (q) C11;
                    u11.k();
                    InterfaceC3978p0 a11 = u.a(qVar, u11, 6);
                    DsDisclaimerLocator dsDisclaimerLocator2 = new DsDisclaimerLocator(dto.getTestInfo(), null, 2, null);
                    boolean d11 = Intrinsics.d(dto.getHideIcon(), Boolean.TRUE);
                    boolean z12 = !d11;
                    DsDisclaimerStyle asVo = getAsVo(dto.getTheme(), u11, 0);
                    DisclaimerDTO.MainButton mainButton = !dto.isClickable() ? dto.getMainButton() : null;
                    u11.o(-221773777);
                    Function2<InterfaceC3967k, Integer, Unit> asVo2 = mainButton == null ? null : asVo(mainButton, z12, function12, u11, i13 & 896);
                    u11.k();
                    DisclaimerDTO.AdditionalButton additionalButton = dto.getAdditionalButton();
                    if (dto.isClickable()) {
                        additionalButton = null;
                    }
                    u11.o(-221770545);
                    Function2<InterfaceC3967k, Integer, Unit> asVo3 = additionalButton == null ? null : asVo(additionalButton, z12, function12, u11, i13 & 896);
                    u11.k();
                    closeButton = dto.getCloseButton();
                    if (dto.isClickable()) {
                        closeButton = null;
                    }
                    u11.o(-221766822);
                    if (closeButton == null) {
                        eVar3 = eVar6;
                        interfaceC3978p0 = a11;
                        dsDisclaimerLocator = dsDisclaimerLocator2;
                        dsDisclaimerStyle = asVo;
                        function2 = asVo3;
                        function22 = null;
                        z11 = z12;
                    } else {
                        eVar3 = eVar6;
                        e testTag = AtomLocatorKt.testTag(e.f40358c0, dsDisclaimerLocator2.getCloseButton().invoke());
                        dsDisclaimerStyle = asVo;
                        function2 = asVo3;
                        z11 = z12;
                        dsDisclaimerLocator = dsDisclaimerLocator2;
                        interfaceC3978p0 = a11;
                        Function2<InterfaceC3967k, Integer, Unit> asVo4 = asVo(closeButton, dsDisclaimerStyle, function12, testTag, u11, i13 & 896, 0);
                        u11 = u11;
                        function22 = asVo4;
                    }
                    Function1<? super AtomAction, Unit> function14 = function12;
                    u11.k();
                    u11.o(-221747319);
                    u11.o(-221759784);
                    if (dto.isClickable() && function14 != null) {
                        u11.o(-1164407357);
                        n11 = u11.n(interfaceC3978p0) | u11.n(dsDisclaimerStyle);
                        C12 = u11.C();
                        if (!n11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new DsDisclaimerAtomKt$DsDisclaimerAtom$clickableModifier$1$1$1(dsDisclaimerStyle, interfaceC3978p0);
                            u11.x(C12);
                        }
                        u11.k();
                        viewAnalytics = c.d(viewAnalytics, (Function1) C12);
                    }
                    u11.k();
                    if (dto.isClickable() || function14 == null) {
                        eVar4 = viewAnalytics;
                    } else {
                        u11.o(-1164392784);
                        boolean F11 = ((i13 & 896) == 256) | u11.F(dto);
                        Object C13 = u11.C();
                        if (F11 || C13 == InterfaceC3967k.a.a()) {
                            C13 = new DsDisclaimerAtomKt$DsDisclaimerAtom$clickableModifier$2$1$1(dto, function14);
                            u11.x(C13);
                        }
                        u11.k();
                        eVar4 = i.b(viewAnalytics, qVar, null, true, null, null, (Function0) C13, 24);
                    }
                    u11.k();
                    e testTag2 = AtomLocatorKt.testTag(eVar4, dsDisclaimerLocator);
                    e j11 = !d11 ? e.f40358c0 : T.j(e.f40358c0, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
                    title = dto.getTitle();
                    u11.o(-221733654);
                    if (title == null) {
                        dsDisclaimerStyle2 = dsDisclaimerStyle;
                        m1836toAnnotateStringiJQMabo = null;
                    } else {
                        dsDisclaimerStyle2 = dsDisclaimerStyle;
                        m1836toAnnotateStringiJQMabo = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(title, 0L, u11, 0, 1);
                    }
                    u11.k();
                    OzonSpannableString subtitle = dto.getSubtitle();
                    u11.o(-221731958);
                    C3422b m1836toAnnotateStringiJQMabo2 = subtitle == null ? null : SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(subtitle, 0L, u11, 0, 1);
                    u11.k();
                    C3969l c3969l = u11;
                    DsDisclaimerKt.DsDisclaimer(testTag2, m1836toAnnotateStringiJQMabo, m1836toAnnotateStringiJQMabo2, asVo2, function2, function22, dto.isClickable(), z11, dto.getIcon(), dsDisclaimerStyle2, AtomLocatorKt.testTag(j11, dsDisclaimerLocator.getTitle().invoke()), AtomLocatorKt.testTag(j11, dsDisclaimerLocator.getSubtitle().invoke()), AtomLocatorKt.testTag(e.f40358c0, dsDisclaimerLocator.getIcon().invoke()), c3969l, 0, 0, 0);
                    u11 = c3969l;
                    function13 = function14;
                    eVar5 = eVar3;
                } else {
                    u11.j();
                    eVar5 = eVar2;
                    function13 = function12;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new DsDisclaimerAtomKt$DsDisclaimerAtom$1(dto, eVar5, function13, i11, i12));
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
            viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar6, dto);
            u11.o(-221783361);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            q qVar2 = (q) C11;
            u11.k();
            InterfaceC3978p0 a112 = u.a(qVar2, u11, 6);
            DsDisclaimerLocator dsDisclaimerLocator22 = new DsDisclaimerLocator(dto.getTestInfo(), null, 2, null);
            boolean d112 = Intrinsics.d(dto.getHideIcon(), Boolean.TRUE);
            boolean z122 = !d112;
            DsDisclaimerStyle asVo5 = getAsVo(dto.getTheme(), u11, 0);
            if (!dto.isClickable()) {
            }
            u11.o(-221773777);
            if (mainButton == null) {
            }
            u11.k();
            DisclaimerDTO.AdditionalButton additionalButton2 = dto.getAdditionalButton();
            if (dto.isClickable()) {
            }
            u11.o(-221770545);
            if (additionalButton2 == null) {
            }
            u11.k();
            closeButton = dto.getCloseButton();
            if (dto.isClickable()) {
            }
            u11.o(-221766822);
            if (closeButton == null) {
            }
            Function1<? super AtomAction, Unit> function142 = function12;
            u11.k();
            u11.o(-221747319);
            u11.o(-221759784);
            if (dto.isClickable()) {
                u11.o(-1164407357);
                n11 = u11.n(interfaceC3978p0) | u11.n(dsDisclaimerStyle);
                C12 = u11.C();
                if (!n11) {
                }
                C12 = new DsDisclaimerAtomKt$DsDisclaimerAtom$clickableModifier$1$1$1(dsDisclaimerStyle, interfaceC3978p0);
                u11.x(C12);
                u11.k();
                viewAnalytics = c.d(viewAnalytics, (Function1) C12);
            }
            u11.k();
            if (dto.isClickable()) {
            }
            eVar4 = viewAnalytics;
            u11.k();
            e testTag22 = AtomLocatorKt.testTag(eVar4, dsDisclaimerLocator);
            if (!d112) {
            }
            title = dto.getTitle();
            u11.o(-221733654);
            if (title == null) {
            }
            u11.k();
            OzonSpannableString subtitle2 = dto.getSubtitle();
            u11.o(-221731958);
            if (subtitle2 == null) {
            }
            u11.k();
            C3969l c3969l2 = u11;
            DsDisclaimerKt.DsDisclaimer(testTag22, m1836toAnnotateStringiJQMabo, m1836toAnnotateStringiJQMabo2, asVo2, function2, function22, dto.isClickable(), z11, dto.getIcon(), dsDisclaimerStyle2, AtomLocatorKt.testTag(j11, dsDisclaimerLocator.getTitle().invoke()), AtomLocatorKt.testTag(j11, dsDisclaimerLocator.getSubtitle().invoke()), AtomLocatorKt.testTag(e.f40358c0, dsDisclaimerLocator.getIcon().invoke()), c3969l2, 0, 0, 0);
            u11 = c3969l2;
            function13 = function142;
            eVar5 = eVar3;
            m02 = u11.m0();
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
        viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar6, dto);
        u11.o(-221783361);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        q qVar22 = (q) C11;
        u11.k();
        InterfaceC3978p0 a1122 = u.a(qVar22, u11, 6);
        DsDisclaimerLocator dsDisclaimerLocator222 = new DsDisclaimerLocator(dto.getTestInfo(), null, 2, null);
        boolean d1122 = Intrinsics.d(dto.getHideIcon(), Boolean.TRUE);
        boolean z1222 = !d1122;
        DsDisclaimerStyle asVo52 = getAsVo(dto.getTheme(), u11, 0);
        if (!dto.isClickable()) {
        }
        u11.o(-221773777);
        if (mainButton == null) {
        }
        u11.k();
        DisclaimerDTO.AdditionalButton additionalButton22 = dto.getAdditionalButton();
        if (dto.isClickable()) {
        }
        u11.o(-221770545);
        if (additionalButton22 == null) {
        }
        u11.k();
        closeButton = dto.getCloseButton();
        if (dto.isClickable()) {
        }
        u11.o(-221766822);
        if (closeButton == null) {
        }
        Function1<? super AtomAction, Unit> function1422 = function12;
        u11.k();
        u11.o(-221747319);
        u11.o(-221759784);
        if (dto.isClickable()) {
        }
        u11.k();
        if (dto.isClickable()) {
        }
        eVar4 = viewAnalytics;
        u11.k();
        e testTag222 = AtomLocatorKt.testTag(eVar4, dsDisclaimerLocator);
        if (!d1122) {
        }
        title = dto.getTitle();
        u11.o(-221733654);
        if (title == null) {
        }
        u11.k();
        OzonSpannableString subtitle22 = dto.getSubtitle();
        u11.o(-221731958);
        if (subtitle22 == null) {
        }
        u11.k();
        C3969l c3969l22 = u11;
        DsDisclaimerKt.DsDisclaimer(testTag222, m1836toAnnotateStringiJQMabo, m1836toAnnotateStringiJQMabo2, asVo2, function2, function22, dto.isClickable(), z11, dto.getIcon(), dsDisclaimerStyle2, AtomLocatorKt.testTag(j11, dsDisclaimerLocator.getTitle().invoke()), AtomLocatorKt.testTag(j11, dsDisclaimerLocator.getSubtitle().invoke()), AtomLocatorKt.testTag(e.f40358c0, dsDisclaimerLocator.getIcon().invoke()), c3969l22, 0, 0, 0);
        u11 = c3969l22;
        function13 = function1422;
        eVar5 = eVar3;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DsDisclaimerAtom$lambda$1(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final Function2<InterfaceC3967k, Integer, Unit> asVo(DisclaimerDTO.MainButton mainButton, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(872519786);
        C4912a c11 = a1.c.c(-2087706361, new DsDisclaimerAtomKt$asVo$1(mainButton, z11, function1), interfaceC3967k);
        interfaceC3967k.k();
        return c11;
    }

    private static final DsDisclaimerStyle getAsVo(DisclaimerDTO.Theme theme, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1264431599);
        Function2<InterfaceC3967k, Integer, DsDisclaimerStyle> function2 = styleMap.get(theme);
        interfaceC3967k.o(-239719099);
        DsDisclaimerStyle invoke = function2 == null ? null : function2.invoke(interfaceC3967k, 0);
        interfaceC3967k.k();
        if (invoke == null) {
            invoke = DsDisclaimerStyle.INSTANCE.neutral(interfaceC3967k, 6);
        }
        interfaceC3967k.k();
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DsDisclaimerButtonStyle getMainButtonStyle(DisclaimerDTO.ButtonTheme buttonTheme, DisclaimerDTO.CustomButtonTheme customButtonTheme, InterfaceC3967k interfaceC3967k, int i11) {
        DsDisclaimerButtonStyle base;
        UniColorToken bgOverlap;
        UniColorToken textPrimary;
        String textColor;
        String backgroundColor;
        interfaceC3967k.o(-851610266);
        int i12 = buttonTheme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonTheme.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                base = DsDisclaimerButtonStyle.INSTANCE.getPrimary();
            } else if (i12 == 2) {
                DsDisclaimerButtonStyle.Companion companion = DsDisclaimerButtonStyle.INSTANCE;
                if (customButtonTheme == null || (backgroundColor = customButtonTheme.getBackgroundColor()) == null || (bgOverlap = UniTheme.INSTANCE.getColorTokens().getById(backgroundColor)) == null) {
                    bgOverlap = UniTheme.INSTANCE.getColorTokens().getBgOverlap();
                }
                if (customButtonTheme == null || (textColor = customButtonTheme.getTextColor()) == null || (textPrimary = UniTheme.INSTANCE.getColorTokens().getById(textColor)) == null) {
                    textPrimary = UniTheme.INSTANCE.getColorTokens().getTextPrimary();
                }
                base = companion.custom(bgOverlap, textPrimary);
            } else if (i12 != 3 && i12 != 4) {
                throw new o();
            }
            interfaceC3967k.k();
            return base;
        }
        base = DsDisclaimerButtonStyle.INSTANCE.getBase();
        interfaceC3967k.k();
        return base;
    }

    private static final Function2<InterfaceC3967k, Integer, Unit> asVo(DisclaimerDTO.AdditionalButton additionalButton, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(237333720);
        C4912a c11 = a1.c.c(-1142928459, new DsDisclaimerAtomKt$asVo$2(z11, additionalButton, function1), interfaceC3967k);
        interfaceC3967k.k();
        return c11;
    }

    private static final Function2<InterfaceC3967k, Integer, Unit> asVo(CommonControlSettings commonControlSettings, DsDisclaimerStyle dsDisclaimerStyle, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        interfaceC3967k.o(626800754);
        if ((i12 & 4) != 0) {
            eVar = e.f40358c0;
        }
        C4912a c11 = a1.c.c(-980447153, new DsDisclaimerAtomKt$asVo$3(dsDisclaimerStyle, eVar, commonControlSettings, function1), interfaceC3967k);
        interfaceC3967k.k();
        return c11;
    }
}
