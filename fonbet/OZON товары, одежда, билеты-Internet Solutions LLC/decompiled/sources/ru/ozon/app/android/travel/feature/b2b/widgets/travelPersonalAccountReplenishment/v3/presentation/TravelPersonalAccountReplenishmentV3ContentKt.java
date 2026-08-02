package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import Fr.g;
import K00.b;
import K1.S;
import Nk.a;
import Q1.K;
import Q1.X;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import U7.i;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import androidx.lifecycle.AbstractC5434v;
import c1.w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import l1.C7807Z;
import l20.d;
import n0.d0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.utils.visualTransformation.AmountVisualTransformation;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.component.tagbutton.DsTagButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.q;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0015\u0010\u0014\u001aQ\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001aq\u0010%\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0003¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0003¢\u0006\u0004\b)\u0010*\u001aM\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\"2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b.\u0010/\u001a\u0017\u00100\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00103\u001a\u00020\"2\u0006\u00102\u001a\u00020\"H\u0002¢\u0006\u0004\b3\u00101\u001a\u0019\u00105\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b5\u00101\"\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:²\u0006\u000e\u00109\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/presentation/TravelPersonalAccountReplenishmentV3VI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Landroidx/compose/ui/e;", "modifier", "TravelPersonalAccountReplenishmentV3Content", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/presentation/TravelPersonalAccountReplenishmentV3VI;Lkotlin/jvm/functions/Function1;LWZ/l;Ll20/d;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Title", "(Lru/ozon/uni/atoms/data/text/TextDTO;LS0/k;I)V", "Subtitle", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "input", "LQ1/K;", "textFieldValue", "onValueChange", "Lkotlin/Function0;", "onHideKeyboard", "AmountInput", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;LQ1/K;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LWZ/l;LS0/k;I)V", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "variants", "", "currentAmount", "onAmountSelected", "InputVariants", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LWZ/l;Ll20/d;LS0/k;I)V", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Disclaimer", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;LS0/k;I)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "amountInputText", "SubmitButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/presentation/TravelPersonalAccountReplenishmentV3VI;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "checkAmountInput", "(Ljava/lang/String;)Ljava/lang/String;", "inputText", "getCentsAmountString", "centsStr", "formatCentsToAmountString", "Lkotlin/text/Regex;", "AMOUNT_REGEX", "Lkotlin/text/Regex;", "amountInputState", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelPersonalAccountReplenishmentV3ContentKt {

    @NotNull
    private static final Regex AMOUNT_REGEX = new Regex("^$|^(0|[1-9]\\d*)(,\\d{0,2})?$");

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AmountInput(CommonInputV2VO.TextInputV2 textInputV2, K k11, Function1<? super K, Unit> function1, Function0<Unit> function0, l lVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        K k12;
        long textSecondary;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(2135495014);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(textInputV2) : u11.F(textInputV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            k12 = k11;
            i12 |= u11.n(k12) ? 32 : 16;
        } else {
            k12 = k11;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(lVar) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            String mask = textInputV2.getMask();
            u11.o(185999385);
            boolean n11 = u11.n(mask);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                String mask2 = textInputV2.getMask();
                C11 = !(mask2 == null || h.K(mask2)) ? a.b("\u2009", textInputV2.getMask()) : null;
                u11.x(C11);
            }
            String str = (String) C11;
            u11.k();
            u11.o(186006062);
            boolean n12 = u11.n(str);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new AmountVisualTransformation(str, (char) 0, ',', 2, null);
                u11.x(C12);
            }
            AmountVisualTransformation amountVisualTransformation = (AmountVisualTransformation) C12;
            u11.k();
            e h11 = T.h(a0.e(e.f40358c0, 1.0f), DsSpacings.INSTANCE.m1845getDp16D9Ej5fM(), 0.0f, 2);
            String label = textInputV2.getLabel();
            DsInputStatus dsInputStatus = textInputV2.getIsErrorVisible() ? DsInputStatus.ERROR : DsInputStatus.NEUTRAL;
            if (textInputV2.getIsErrorVisible()) {
                u11.o(186020864);
                textSecondary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextNegative();
            } else {
                u11.o(186021953);
                textSecondary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextSecondary();
            }
            u11.k();
            String error = textInputV2.getError();
            N0 n02 = new N0(0, 9, 123);
            u11.o(186028584);
            boolean z11 = (i12 & 7168) == 2048;
            Object C13 = u11.C();
            if (z11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$1$1(function0);
                u11.x(C13);
            }
            u11.k();
            M0 m02 = new M0((Function1) C13, 62);
            u11.o(186033451);
            int i13 = i12 & 14;
            boolean F11 = ((i12 & 896) == 256) | (i13 == 4 || ((i12 & 8) != 0 && u11.F(textInputV2))) | u11.F(lVar);
            Object C14 = u11.C();
            if (F11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$2$1(function1, textInputV2, lVar);
                u11.x(C14);
            }
            Function1 function12 = (Function1) C14;
            u11.k();
            C7807Z m11 = C7807Z.m(textSecondary);
            u11.o(186086812);
            boolean F12 = u11.F(lVar) | (i13 == 4 || ((i12 & 8) != 0 && u11.F(textInputV2)));
            Object C15 = u11.C();
            if (F12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$3$1(textInputV2, lVar);
                u11.x(C15);
            }
            u11.k();
            c3969l = u11;
            DsInputBaseKt.m1742DsInputBaseawFkL_c(k12, (Function1<? super K, Unit>) function12, h11, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, label, (DsInputLabelPosition) null, (String) null, error, m11, (UniIconToken) null, (UniIconToken) null, false, false, false, n02, m02, (X) amountVisualTransformation, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) C15, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, (i12 >> 3) & 14, 817889280, 0, 398839160);
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new TravelPersonalAccountReplenishmentV3ContentKt$AmountInput$4(textInputV2, k11, function1, function0, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Disclaimer(DisclaimerDTO disclaimerDTO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        DisclaimerDTO disclaimerDTO2;
        C3969l u11 = interfaceC3967k.u(-654578538);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(disclaimerDTO) : u11.F(disclaimerDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            disclaimerDTO2 = disclaimerDTO;
        } else {
            e e11 = a0.e(e.f40358c0, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e j11 = T.j(e11, dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1850getDp24D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 8);
            u11.o(1608081307);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = TravelPersonalAccountReplenishmentV3ContentKt$Disclaimer$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            disclaimerDTO2 = disclaimerDTO;
            DsDisclaimerAtomKt.DsDisclaimerAtom(disclaimerDTO2, j11, (Function1) C11, u11, DisclaimerDTO.$stable | 384 | (i12 & 14), 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelPersonalAccountReplenishmentV3ContentKt$Disclaimer$2(disclaimerDTO2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InputVariants(List<TagButtonDTO> list, String str, Function1<? super String, Unit> function1, Function1<? super AtomAction, Unit> function12, l lVar, d dVar, InterfaceC3967k interfaceC3967k, int i11) {
        Function1<? super String, Unit> function13;
        Function1<? super AtomAction, Unit> function14;
        AtomActionDTO action;
        Map<String, String> params;
        Object obj;
        C3969l c3969l;
        TagButtonDTO copy;
        l lVar2 = lVar;
        d dVar2 = dVar;
        C3969l u11 = interfaceC3967k.u(-1074470421);
        int i12 = (i11 & 6) == 0 ? (u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            function13 = function1;
            i12 |= u11.F(function13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            function13 = function1;
        }
        if ((i11 & 3072) == 0) {
            function14 = function12;
            i12 |= u11.F(function14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function14 = function12;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(dVar2) ? 131072 : 65536;
        }
        int i13 = i12;
        if ((74899 & i13) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            d0 b11 = z.b(u11);
            Z1.d dVar3 = (Z1.d) u11.m(K0.e());
            u11.o(-35571100);
            boolean n11 = u11.n(dVar3);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = Float.valueOf(dVar3.v1(DsSpacings.INSTANCE.m1845getDp16D9Ej5fM()));
                u11.x(C11);
            }
            float floatValue = ((Number) C11).floatValue();
            u11.k();
            u11.o(-35564631);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new w();
                u11.x(C12);
            }
            w wVar = (w) C12;
            u11.k();
            u11.o(-35559675);
            boolean n12 = u11.n(list);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                List<TagButtonDTO> list2 = list;
                ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                for (TagButtonDTO tagButtonDTO : list2) {
                    CommonControlSettings common = tagButtonDTO.getCommon();
                    arrayList.add(new ParsedTag(tagButtonDTO, (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null) ? null : params.get("amount")));
                }
                u11.x(arrayList);
                C13 = arrayList;
            }
            List<ParsedTag> list3 = (List) C13;
            u11.k();
            u11.o(-35550107);
            boolean z11 = (i13 & 112) == 32;
            Object C14 = u11.C();
            if (z11 || C14 == InterfaceC3967k.a.a()) {
                C14 = getCentsAmountString(str);
                u11.x(C14);
            }
            String str2 = (String) C14;
            u11.k();
            u11.o(-35546585);
            boolean n13 = u11.n(list3) | u11.n(str2);
            Object C15 = u11.C();
            if (n13 || C15 == InterfaceC3967k.a.a()) {
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.d(((ParsedTag) obj).getAmountCents(), str2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ParsedTag parsedTag = (ParsedTag) obj;
                C15 = parsedTag != null ? parsedTag.getAmountCents() : null;
                u11.x(C15);
            }
            String str3 = (String) C15;
            u11.k();
            Float f7 = str3 != null ? (Float) wVar.get(str3) : null;
            u11.o(-35534960);
            boolean n14 = u11.n(f7) | u11.q(floatValue) | u11.n(b11);
            Object C16 = u11.C();
            if (n14 || C16 == InterfaceC3967k.a.a()) {
                C16 = new TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$1$1(f7, floatValue, b11, null);
                u11.x(C16);
            }
            u11.k();
            Q.e(u11, f7, (Function2) C16);
            e e11 = a0.e(e.f40358c0, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e h11 = T.h(z.a(T.j(e11, 0.0f, dsSpacings.m1842getDp12D9Ej5fM(), 0.0f, 0.0f, 13), b11), dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 2);
            int i14 = C5179b.f39454h;
            Y b12 = androidx.compose.foundation.layout.X.b(C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h12);
            }
            i.b(u11, f11, -433535612);
            for (ParsedTag parsedTag2 : list3) {
                boolean d12 = Intrinsics.d(parsedTag2.getAmountCents(), str2);
                u11.G(1554777900, parsedTag2.getDto().getText());
                copy = r19.copy((r34 & 1) != 0 ? r19.styleType : null, (r34 & 2) != 0 ? r19.size : null, (r34 & 4) != 0 ? r19.isSelected : Boolean.valueOf(d12), (r34 & 8) != 0 ? r19.isDisabled : null, (r34 & 16) != 0 ? r19.isClosable : null, (r34 & 32) != 0 ? r19.icon : null, (r34 & 64) != 0 ? r19.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r19.indicator : null, (r34 & 256) != 0 ? r19.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r19.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r19.common : null, (r34 & 2048) != 0 ? r19.closeControlSettings : null, (r34 & 4096) != 0 ? r19.context : null, (r34 & 8192) != 0 ? r19.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r19.image : null, (r34 & 32768) != 0 ? parsedTag2.getDto().round : null);
                e c11 = M.c(e.f40358c0, EnumC9909s.Max);
                u11.o(1554785352);
                boolean F11 = u11.F(parsedTag2);
                Object C17 = u11.C();
                if (F11 || C17 == InterfaceC3967k.a.a()) {
                    C17 = new TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$1$1(parsedTag2, wVar);
                    u11.x(C17);
                }
                u11.k();
                e a12 = androidx.compose.ui.layout.c.a(c11, (Function1) C17);
                u11.o(1554802512);
                boolean F12 = u11.F(parsedTag2) | ((i13 & 896) == 256) | u11.F(dVar2) | u11.F(lVar2) | ((i13 & 7168) == 2048);
                Object C18 = u11.C();
                if (F12 || C18 == InterfaceC3967k.a.a()) {
                    TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$2$1 travelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$2$1 = new TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$2$1(parsedTag2, dVar2, function14, function13, lVar2);
                    u11.x(travelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$2$1);
                    C18 = travelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$2$1;
                }
                Function1 function15 = (Function1) C18;
                u11.k();
                C3969l c3969l2 = u11;
                DsTagButtonAtomKt.DsTagButtonAtom(copy, a12, false, function15, c3969l2, TagButtonDTO.$stable, 4);
                c3969l2.J();
                function13 = function1;
                function14 = function12;
                lVar2 = lVar;
                dVar2 = dVar;
                u11 = c3969l2;
            }
            c3969l = u11;
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$3(list, str, function1, function12, lVar, dVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SubmitButton(ButtonV3DTO buttonV3DTO, TravelPersonalAccountReplenishmentV3VI travelPersonalAccountReplenishmentV3VI, String str, Function0<Unit> function0, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1411038002);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(buttonV3DTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(travelPersonalAccountReplenishmentV3VI) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(str) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            e e11 = a0.e(e.f40358c0, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e i13 = T.i(e11, dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1850getDp24D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM());
            u11.o(2118353152);
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((i12 & 896) == 256) | ((57344 & i12) == 16384);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new TravelPersonalAccountReplenishmentV3ContentKt$SubmitButton$1$1(function0, travelPersonalAccountReplenishmentV3VI, function1, str);
                u11.x(C11);
            }
            u11.k();
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO, i13, false, (Function1) C11, u11, i12 & 14, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelPersonalAccountReplenishmentV3ContentKt$SubmitButton$2(buttonV3DTO, travelPersonalAccountReplenishmentV3VI, str, function0, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Subtitle(TextDTO textDTO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(555347531);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            DsTextAtomKt.DsTextAtom(textDTO, T.h(e.f40358c0, DsSpacings.INSTANCE.m1845getDp16D9Ej5fM(), 0.0f, 2), u11, i12 & 14, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelPersonalAccountReplenishmentV3ContentKt$Subtitle$1(textDTO, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(TextDTO textDTO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1129969113);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            DsTextAtomKt.DsTextAtom(textDTO, T.j(aVar, dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 8), u11, i12 & 14, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelPersonalAccountReplenishmentV3ContentKt$Title$1(textDTO, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TravelPersonalAccountReplenishmentV3Content(@NotNull TravelPersonalAccountReplenishmentV3VI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, l lVar, d dVar, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean n11;
        Object C11;
        CommonInputV2VO.TextInputV2 input;
        t viewEvent;
        boolean F11;
        Object C12;
        int I11;
        TextDTO title;
        TextDTO subtitle;
        CommonInputV2VO.TextInputV2 input2;
        Function0 function0;
        String str;
        DisclaimerDTO disclaimer;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-490171194);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(lVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(dVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 16384 : 8192;
            i14 = i13;
            if ((i14 & 9363) == 9362 || !u11.b()) {
                e eVar4 = i15 == 0 ? e.f40358c0 : eVar2;
                CommonInputV2VO.TextInputV2 input3 = state.getInput();
                Object value = input3 == null ? input3.getValue() : null;
                u11.o(575600368);
                n11 = u11.n(value);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    input = state.getInput();
                    if (input != null || (r0 = input.getValue()) == null) {
                        String str2 = "";
                    }
                    int length = str2.length();
                    C11 = n1.f(new K(4, S.a(length, length), str2), D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                String f7 = TravelPersonalAccountReplenishmentV3Content$lambda$1(interfaceC3978p0).f();
                viewEvent = state.getViewEvent();
                u11.o(575610802);
                if (viewEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(145595821);
                    boolean F12 = u11.F(lVar) | u11.F(viewEvent);
                    Object C13 = u11.C();
                    if (F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$1$1$1(lVar, viewEvent);
                        u11.x(C13);
                    }
                    u11.k();
                    e3.i.a(aVar, null, (Function0) C13, u11, 6);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                P1 p12 = (P1) u11.m(K0.o());
                j1.i iVar = (j1.i) u11.m(K0.f());
                u11.o(575620377);
                F11 = u11.F(iVar) | u11.n(p12);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$hideKeyboardAndClearFocus$1$1(iVar, p12);
                    u11.x(C12);
                }
                Function0 function02 = (Function0) C12;
                u11.k();
                e e11 = a0.e(eVar4, 1.0f);
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, e11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                title = state.getTitle();
                u11.o(145608637);
                if (title != null) {
                    Title(title, u11, 0);
                    Unit unit2 = Unit.f71690a;
                }
                u11.k();
                subtitle = state.getSubtitle();
                u11.o(145610028);
                if (subtitle != null) {
                    Subtitle(state.getSubtitle(), u11, 0);
                    Unit unit3 = Unit.f71690a;
                }
                u11.k();
                input2 = state.getInput();
                u11.o(145612077);
                if (input2 != null) {
                    function0 = function02;
                } else {
                    K TravelPersonalAccountReplenishmentV3Content$lambda$1 = TravelPersonalAccountReplenishmentV3Content$lambda$1(interfaceC3978p0);
                    u11.o(168533828);
                    boolean n12 = u11.n(interfaceC3978p0);
                    Object C14 = u11.C();
                    if (n12 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$2$3$1$1(interfaceC3978p0);
                        u11.x(C14);
                    }
                    u11.k();
                    AmountInput(input2, TravelPersonalAccountReplenishmentV3Content$lambda$1, (Function1) C14, function02, lVar, u11, ((i14 << 6) & 57344) | CommonInputV2VO.TextInputV2.$stable);
                    function0 = function02;
                    Unit unit4 = Unit.f71690a;
                }
                u11.k();
                u11.o(145623091);
                if (state.getInputVariants().isEmpty()) {
                    List<TagButtonDTO> inputVariants = state.getInputVariants();
                    u11.o(145629090);
                    boolean n13 = u11.n(interfaceC3978p0);
                    Object C15 = u11.C();
                    if (n13 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$2$4$1(interfaceC3978p0);
                        u11.x(C15);
                    }
                    u11.k();
                    InputVariants(inputVariants, f7, (Function1) C15, actionHandler, lVar, dVar, u11, (i14 << 6) & 523264);
                    str = f7;
                } else {
                    str = f7;
                }
                u11.k();
                disclaimer = state.getDisclaimer();
                u11.o(145647097);
                if (disclaimer != null) {
                    Disclaimer(disclaimer, u11, DisclaimerDTO.$stable);
                    Unit unit5 = Unit.f71690a;
                }
                u11.k();
                SubmitButton(state.getSubmitButton(), state, str, function0, actionHandler, u11, ((i14 << 3) & 112) | ((i14 << 9) & 57344));
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$3(state, actionHandler, lVar, dVar, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i14 = i13;
        if ((i14 & 9363) == 9362) {
        }
        if (i15 == 0) {
        }
        CommonInputV2VO.TextInputV2 input32 = state.getInput();
        if (input32 == null) {
        }
        u11.o(575600368);
        n11 = u11.n(value);
        C11 = u11.C();
        if (!n11) {
        }
        input = state.getInput();
        if (input != null) {
        }
        String str22 = "";
        int length2 = str22.length();
        C11 = n1.f(new K(4, S.a(length2, length2), str22), D1.f25195a);
        u11.x(C11);
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
        u11.k();
        String f72 = TravelPersonalAccountReplenishmentV3Content$lambda$1(interfaceC3978p02).f();
        viewEvent = state.getViewEvent();
        u11.o(575610802);
        if (viewEvent != null) {
        }
        u11.k();
        P1 p122 = (P1) u11.m(K0.o());
        j1.i iVar2 = (j1.i) u11.m(K0.f());
        u11.o(575620377);
        F11 = u11.F(iVar2) | u11.n(p122);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new TravelPersonalAccountReplenishmentV3ContentKt$TravelPersonalAccountReplenishmentV3Content$hideKeyboardAndClearFocus$1$1(iVar2, p122);
        u11.x(C12);
        Function0 function022 = (Function0) C12;
        u11.k();
        e e112 = a0.e(eVar4, 1.0f);
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, e112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g102);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        title = state.getTitle();
        u11.o(145608637);
        if (title != null) {
        }
        u11.k();
        subtitle = state.getSubtitle();
        u11.o(145610028);
        if (subtitle != null) {
        }
        u11.k();
        input2 = state.getInput();
        u11.o(145612077);
        if (input2 != null) {
        }
        u11.k();
        u11.o(145623091);
        if (state.getInputVariants().isEmpty()) {
        }
        u11.k();
        disclaimer = state.getDisclaimer();
        u11.o(145647097);
        if (disclaimer != null) {
        }
        u11.k();
        SubmitButton(state.getSubmitButton(), state, str, function0, actionHandler, u11, ((i14 << 3) & 112) | ((i14 << 9) & 57344));
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final K TravelPersonalAccountReplenishmentV3Content$lambda$1(InterfaceC3978p0<K> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkAmountInput(String str) {
        String Y11 = h.Y(str, '.', ',');
        StringBuilder sb2 = new StringBuilder();
        int length = Y11.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = Y11.charAt(i11);
            if (Character.isDigit(charAt) || charAt == ',') {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        if (sb3.length() == 0) {
            return "";
        }
        List l11 = h.l(sb3, new char[]{','}, 0, 6);
        String str2 = (String) l11.get(0);
        String str3 = "0";
        if (str2.length() != 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= str2.length()) {
                    break;
                }
                if (str2.charAt(i12) != '0') {
                    str3 = h.G0(str2, '0');
                    break;
                }
                i12++;
            }
        }
        if (l11.size() == 1) {
            return str3;
        }
        String V11 = C7714v.V(C7714v.D(l11, 1), "", null, null, null, 62);
        StringBuilder sb4 = new StringBuilder();
        int length2 = V11.length();
        for (int i13 = 0; i13 < length2; i13++) {
            char charAt2 = V11.charAt(i13);
            if (Character.isDigit(charAt2)) {
                sb4.append(charAt2);
            }
        }
        String sb5 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
        return G.g.c(str3, ",", h.q0(2, sb5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatCentsToAmountString(String str) {
        Long y02;
        if (str == null || (y02 = h.y0(str)) == null) {
            return "";
        }
        long longValue = y02.longValue();
        long j11 = longValue / 100;
        long j12 = longValue % 100;
        if (j12 == 0) {
            return String.valueOf(j11);
        }
        if (j12 % 10 == 0) {
            return j11 + "," + (j12 / 10);
        }
        if (j12 < 10) {
            return j11 + ",0" + j12;
        }
        return j11 + "," + j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getCentsAmountString(String str) {
        String str2;
        String l11;
        String q02;
        CharSequence charSequence;
        if (h.K(str)) {
            return "";
        }
        List l12 = h.l(h.z0(h.Y(str, ',', '.')).toString(), new char[]{'.'}, 0, 6);
        CharSequence charSequence2 = (CharSequence) l12.get(0);
        if (charSequence2.length() == 0) {
            charSequence2 = "0";
        }
        String str3 = (String) charSequence2;
        String str4 = (String) C7714v.Q(1, l12);
        if (str4 != null && (q02 = h.q0(2, str4)) != null) {
            Intrinsics.checkNotNullParameter(q02, "<this>");
            Intrinsics.checkNotNullParameter(q02, "<this>");
            if (2 <= q02.length()) {
                charSequence = q02.subSequence(0, q02.length());
            } else {
                StringBuilder sb2 = new StringBuilder(2);
                sb2.append((CharSequence) q02);
                int length = 2 - q02.length();
                if (1 <= length) {
                    int i11 = 1;
                    while (true) {
                        sb2.append('0');
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
                charSequence = sb2;
            }
            str2 = charSequence.toString();
        }
        str2 = "00";
        Long y02 = h.y0(str3.concat(str2));
        return (y02 == null || (l11 = y02.toString()) == null) ? "" : l11;
    }
}
