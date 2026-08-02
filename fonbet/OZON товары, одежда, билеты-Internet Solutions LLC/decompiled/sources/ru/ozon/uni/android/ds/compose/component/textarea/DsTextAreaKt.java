package ru.ozon.uni.android.ds.compose.component.textarea;

import A0.h;
import B0.M0;
import B0.N0;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K1.C3422b;
import Q1.K;
import Q1.X;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import T7.E;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonStyle;
import ru.ozon.uni.android.ds.compose.util.ClipboardExtKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.textarea.FoundationTextAreaKt;
import t0.i;
import t0.p;
import t0.q;
import u0.C9915y;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a§\u0002\u0010'\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00002\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b%\u0010&\u001aa\u0010/\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b/\u00100\u001a5\u00104\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00122\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0003¢\u0006\u0004\b4\u00105\u001a\u001f\u00107\u001a\u0002062\u0006\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b7\u00108\u001a\u001f\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b:\u0010;\u001a'\u0010<\u001a\u0002092\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u0010=\u001a7\u0010>\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b>\u0010?\u001a/\u0010@\u001a\u0002092\u0006\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b@\u0010A\"\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\"\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010D¨\u0006K²\u0006\f\u0010F\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010H\u001a\u00020G8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010I\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010J\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "", "", "onValueChange", "inputText", "label", "Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStatus;", "status", "Landroidx/compose/ui/e;", "modifier", "LK1/b;", "caption", "", "minLines", "maxLines", "maxLength", "Ll1/Z;", "captionColor", "", "hasInfoIcon", "hasBottomBar", "hasCounter", "isCounterHasLimit", "LB0/N0;", "keyboardOptions", "LB0/M0;", "keyboardActions", "LQ1/X;", "visualTransformation", "Lt0/q;", "interactionSource", "onFocusChanged", "Lkotlin/Function0;", "onInfoButtonClicked", "onClearButtonClicked", "onCounterReachedLimit", "onCopyToClipboardClicked", "DsTextArea-s9ZHXeI", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStatus;Landroidx/compose/ui/e;LK1/b;IIILl1/Z;ZZZZLB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;IIII)V", "DsTextArea", "Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;", "style", "Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaState;", "state", "isTextEmpty", AppMeasurementSdk.ConditionalUserProperty.VALUE, "copyOnClipboard", "RightContent", "(Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaState;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lq1/b;", "icon", "onClick", "ClickableIcon", "(Lq1/b;Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;ZLkotlin/jvm/functions/Function0;LS0/k;I)V", "LK1/T;", "getLabelTextStyle", "(ZLru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaState;)LK1/T;", "Lu0/x;", "getLabelPadding", "(ZLru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaState;)Lu0/x;", "getSystemContentPadding", "(Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;ZZ)Lu0/x;", "hasRightContent", "(Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaState;ZZZ)Z", "getCounterPadding", "(Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaState;Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;ZZ)Lu0/x;", "LZ1/h;", "minHeight", "F", "maxHeight", "isFocused", "LQ1/K;", "textFieldValueState", "lastTextValue", "isLimitWasReached", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTextAreaKt {
    private static final float minHeight = DsSpacings.INSTANCE.m1858getDp56D9Ej5fM();
    private static final float maxHeight = Integer.MAX_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClickableIcon(AbstractC8972b abstractC8972b, DsTextAreaStyle dsTextAreaStyle, boolean z11, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        AbstractC8972b abstractC8972b2;
        int i12;
        DsTextAreaStyle dsTextAreaStyle2;
        long j11;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1327143149);
        if ((i11 & 6) == 0) {
            abstractC8972b2 = abstractC8972b;
            i12 = (u11.n(abstractC8972b2) ? 4 : 2) | i11;
        } else {
            abstractC8972b2 = abstractC8972b;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            dsTextAreaStyle2 = dsTextAreaStyle;
            i12 |= u11.n(dsTextAreaStyle2) ? 32 : 16;
        } else {
            dsTextAreaStyle2 = dsTextAreaStyle;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = e.f40358c0;
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
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e a12 = C5187j.f39515a.a(aVar, InterfaceC6250b.a.e());
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e h11 = T.h(a12, 0.0f, z11 ? dsSpacings.m1838getDp0D9Ej5fM() : dsSpacings.m1859getDp6D9Ej5fM(), 1);
            boolean z12 = dsTextAreaStyle2.getStatus() != DsTextAreaStatus.DISABLED;
            j11 = C7807Z.f72259m;
            long graphicTertiary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary();
            DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
            DsIconButtonStyle dsIconButtonStyle = new DsIconButtonStyle(j11, graphicTertiary, dsSpacings2.m1856getDp44D9Ej5fM(), dsSpacings2.m1845getDp16D9Ej5fM(), null);
            A0.g b11 = h.b(dsSpacings2.m1845getDp16D9Ej5fM());
            u11.o(511446244);
            boolean z13 = (i12 & 7168) == 2048;
            Object C11 = u11.C();
            if (z13 || C11 == InterfaceC3967k.a.a()) {
                C11 = new DsTextAreaKt$ClickableIcon$1$1$1(function0);
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            DsIconButtonKt.DsIconButton(abstractC8972b2, dsIconButtonStyle, b11, h11, null, z12, null, true, null, (Function0) C11, c3969l, (i12 & 14) | 12582912, 336);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new DsTextAreaKt$ClickableIcon$2(abstractC8972b, dsTextAreaStyle, z11, function0, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x066e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034f  */
    /* renamed from: DsTextArea-s9ZHXeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1820DsTextAreas9ZHXeI(@NotNull Function1<? super String, Unit> onValueChange, @NotNull String inputText, @NotNull String label, @NotNull DsTextAreaStatus status, e eVar, C3422b c3422b, int i11, int i12, int i13, C7807Z c7807z, boolean z11, boolean z12, boolean z13, boolean z14, N0 n02, M0 m02, X x11, q qVar, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super String, Unit> function12, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16, int i17) {
        int i18;
        e eVar2;
        int i19;
        C3422b c3422b2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i51;
        int i52;
        boolean z15;
        boolean z16;
        boolean z17;
        M0 m03;
        X a11;
        e eVar3;
        q qVar2;
        q qVar3;
        Function1<? super Boolean, Unit> function13;
        Function1<? super Boolean, Unit> function14;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Function0<Unit> function09;
        boolean z18;
        Function1<? super String, Unit> function15;
        int i53;
        int i54;
        int i55;
        C7807Z c7807z2;
        int i56;
        AbstractC8972b abstractC8972b;
        N0 n03;
        e eVar4;
        q qVar4;
        Function1<? super Boolean, Unit> function16;
        Function0<Unit> function010;
        Function0<Unit> function011;
        Object b11;
        int i57;
        C3422b c3422b3;
        int i58;
        boolean z19;
        Object C11;
        Object b12;
        boolean n11;
        Object C12;
        boolean z21;
        boolean z22;
        Function0<Unit> function012;
        Object C13;
        C3969l c3969l;
        boolean z23;
        Function0<Unit> function013;
        e eVar5;
        boolean z24;
        C3422b c3422b4;
        N0 n04;
        M0 m04;
        X x12;
        q qVar5;
        Function1<? super Boolean, Unit> function17;
        int i59;
        int i61;
        int i62;
        C7807Z c7807z3;
        boolean z25;
        boolean z26;
        Function0<Unit> function014;
        Function1<? super String, Unit> function18;
        Function0<Unit> function015;
        J0 m05;
        int i63;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(status, "status");
        C3969l u11 = interfaceC3967k.u(239662241);
        if ((i17 & 1) != 0) {
            i18 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i18 = (u11.F(onValueChange) ? 4 : 2) | i14;
        } else {
            i18 = i14;
        }
        if ((i17 & 2) != 0) {
            i18 |= 48;
        } else if ((i14 & 48) == 0) {
            i18 |= u11.n(inputText) ? 32 : 16;
        }
        if ((i17 & 4) != 0) {
            i18 |= 384;
        } else if ((i14 & 384) == 0) {
            i18 |= u11.n(label) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i64 = i17 & 8;
        int i65 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i64 != 0) {
            i18 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i18 |= u11.n(status) ? 2048 : 1024;
        }
        int i66 = i17 & 16;
        if (i66 != 0) {
            i18 |= 24576;
        } else if ((i14 & 24576) == 0) {
            eVar2 = eVar;
            i18 |= u11.n(eVar2) ? 16384 : 8192;
            i19 = i17 & 32;
            if (i19 == 0) {
                i18 |= 196608;
                c3422b2 = c3422b;
            } else {
                c3422b2 = c3422b;
                if ((i14 & 196608) == 0) {
                    i18 |= u11.n(c3422b2) ? 131072 : 65536;
                }
            }
            i21 = i17 & 64;
            if (i21 == 0) {
                i18 |= 1572864;
                i22 = i11;
            } else {
                i22 = i11;
                if ((i14 & 1572864) == 0) {
                    i18 |= u11.r(i22) ? 1048576 : 524288;
                }
            }
            i23 = i17 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i23 == 0) {
                i18 |= 12582912;
                i24 = i12;
            } else {
                i24 = i12;
                if ((i14 & 12582912) == 0) {
                    i18 |= u11.r(i24) ? 8388608 : 4194304;
                }
            }
            i25 = i17 & 256;
            if (i25 == 0) {
                i18 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                i18 |= u11.r(i13) ? 67108864 : 33554432;
            }
            i26 = i17 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i26 == 0) {
                i18 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                i27 = i26;
                i18 |= u11.n(c7807z) ? 536870912 : 268435456;
                i28 = i17 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i28 != 0) {
                    i31 = i15 | 6;
                    i29 = i28;
                } else if ((i15 & 6) == 0) {
                    i29 = i28;
                    i31 = i15 | (u11.p(z11) ? 4 : 2);
                } else {
                    i29 = i28;
                    i31 = i15;
                }
                i32 = i17 & 2048;
                if (i32 != 0) {
                    i31 |= 48;
                    i33 = i32;
                } else if ((i15 & 48) == 0) {
                    i33 = i32;
                    i31 |= u11.p(z12) ? 32 : 16;
                } else {
                    i33 = i32;
                }
                int i67 = i31;
                i34 = i17 & 4096;
                if (i34 != 0) {
                    i35 = i67 | 384;
                } else {
                    int i68 = i67;
                    if ((i15 & 384) == 0) {
                        i68 |= u11.p(z13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i35 = i68;
                }
                i36 = i17 & 8192;
                if (i36 != 0) {
                    i37 = i35 | 3072;
                } else {
                    int i69 = i35;
                    if ((i15 & 3072) == 0) {
                        if (u11.p(z14)) {
                            i65 = 2048;
                        }
                        i37 = i69 | i65;
                    } else {
                        i37 = i69;
                    }
                }
                i38 = i17 & 16384;
                if (i38 != 0) {
                    i39 = i37 | 24576;
                } else {
                    i39 = i37;
                    if ((i15 & 24576) == 0) {
                        i39 |= u11.n(n02) ? 16384 : 8192;
                        i41 = i17 & 32768;
                        if (i41 == 0) {
                            i39 |= 196608;
                        } else if ((i15 & 196608) == 0) {
                            i39 |= u11.n(m02) ? 131072 : 65536;
                        }
                        i42 = i17 & 65536;
                        if (i42 == 0) {
                            i39 |= 1572864;
                        } else if ((i15 & 1572864) == 0) {
                            i39 |= u11.n(x11) ? 1048576 : 524288;
                        }
                        i43 = i17 & 131072;
                        if (i43 == 0) {
                            i39 |= 12582912;
                        } else if ((i15 & 12582912) == 0) {
                            i39 |= u11.n(qVar) ? 8388608 : 4194304;
                        }
                        i44 = i17 & 262144;
                        if (i44 == 0) {
                            i39 |= 100663296;
                        } else if ((i15 & 100663296) == 0) {
                            i39 |= u11.F(function1) ? 67108864 : 33554432;
                        }
                        i45 = i17 & 524288;
                        if (i45 == 0) {
                            i39 |= 805306368;
                        } else if ((i15 & 805306368) == 0) {
                            i39 |= u11.F(function0) ? 536870912 : 268435456;
                        }
                        i46 = i39;
                        i47 = i17 & 1048576;
                        if (i47 == 0) {
                            i49 = i16 | 6;
                            i48 = i38;
                        } else if ((i16 & 6) == 0) {
                            i48 = i38;
                            i49 = i16 | (u11.F(function02) ? 4 : 2);
                        } else {
                            i48 = i38;
                            i49 = i16;
                        }
                        i51 = i17 & 2097152;
                        if (i51 == 0) {
                            i49 |= 48;
                        } else if ((i16 & 48) == 0) {
                            i49 |= u11.F(function03) ? 32 : 16;
                        }
                        if ((i16 & 384) == 0) {
                            if ((i17 & 4194304) == 0 && u11.F(function12)) {
                                i63 = 256;
                                i49 |= i63;
                            }
                            i63 = UserVerificationMethods.USER_VERIFY_PATTERN;
                            i49 |= i63;
                        }
                        i52 = i49;
                        if ((i18 & 306783379) != 306783378 && (306783379 & i46) == 306783378 && (i52 & 147) == 146 && u11.b()) {
                            u11.j();
                            i59 = i13;
                            z23 = z11;
                            z24 = z12;
                            m04 = m02;
                            x12 = x11;
                            qVar5 = qVar;
                            function17 = function1;
                            function014 = function0;
                            function015 = function02;
                            function013 = function03;
                            function18 = function12;
                            c3969l = u11;
                            c3422b4 = c3422b2;
                            i62 = i24;
                            i61 = i22;
                            eVar5 = eVar2;
                            c7807z3 = c7807z;
                            z25 = z13;
                            z26 = z14;
                            n04 = n02;
                        } else {
                            u11.Q0();
                            if ((i14 & 1) != 0 || u11.w0()) {
                                e eVar6 = i66 == 0 ? e.f40358c0 : eVar2;
                                if (i19 != 0) {
                                    c3422b2 = null;
                                }
                                if (i21 != 0) {
                                    i22 = 1;
                                }
                                int i71 = i23 == 0 ? 15 : i24;
                                int i72 = i25 == 0 ? CounterView.COUNTER_MAX_DEFAULT : i13;
                                C7807Z c7807z4 = i27 == 0 ? null : c7807z;
                                z15 = i29 == 0 ? true : z11;
                                boolean z27 = i33 == 0 ? false : z12;
                                z16 = i34 == 0 ? false : z13;
                                z17 = i36 == 0 ? true : z14;
                                N0 n05 = i48 == 0 ? N0.f1448g : n02;
                                m03 = i41 == 0 ? M0.f1437b : m02;
                                a11 = i42 == 0 ? X.a.a() : x11;
                                if (i43 == 0) {
                                    u11.o(1600629102);
                                    Object C14 = u11.C();
                                    eVar3 = eVar6;
                                    if (C14 == InterfaceC3967k.a.a()) {
                                        C14 = p.a();
                                        u11.x(C14);
                                    }
                                    qVar2 = (q) C14;
                                    u11.k();
                                } else {
                                    eVar3 = eVar6;
                                    qVar2 = qVar;
                                }
                                if (i44 == 0) {
                                    u11.o(1600631657);
                                    Object C15 = u11.C();
                                    qVar3 = qVar2;
                                    if (C15 == InterfaceC3967k.a.a()) {
                                        C15 = DsTextAreaKt$DsTextArea$2$1.INSTANCE;
                                        u11.x(C15);
                                    }
                                    function13 = (Function1) C15;
                                    u11.k();
                                } else {
                                    qVar3 = qVar2;
                                    function13 = function1;
                                }
                                if (i45 == 0) {
                                    u11.o(1600633001);
                                    Object C16 = u11.C();
                                    function14 = function13;
                                    if (C16 == InterfaceC3967k.a.a()) {
                                        C16 = DsTextAreaKt$DsTextArea$3$1.INSTANCE;
                                        u11.x(C16);
                                    }
                                    function04 = (Function0) C16;
                                    u11.k();
                                } else {
                                    function14 = function13;
                                    function04 = function0;
                                }
                                if (i47 == 0) {
                                    u11.o(1600634377);
                                    Object C17 = u11.C();
                                    function05 = function04;
                                    if (C17 == InterfaceC3967k.a.a()) {
                                        C17 = DsTextAreaKt$DsTextArea$4$1.INSTANCE;
                                        u11.x(C17);
                                    }
                                    function06 = (Function0) C17;
                                    u11.k();
                                } else {
                                    function05 = function04;
                                    function06 = function02;
                                }
                                if (i51 == 0) {
                                    u11.o(1600635785);
                                    Object C18 = u11.C();
                                    function07 = function06;
                                    if (C18 == InterfaceC3967k.a.a()) {
                                        C18 = DsTextAreaKt$DsTextArea$5$1.INSTANCE;
                                        u11.x(C18);
                                    }
                                    function08 = (Function0) C18;
                                    u11.k();
                                } else {
                                    function07 = function06;
                                    function08 = function03;
                                }
                                if ((i17 & 4194304) == 0) {
                                    function15 = ClipboardExtKt.addToClipboard(u11, 0);
                                    i52 &= -897;
                                    boolean z28 = z27;
                                    function09 = function08;
                                    z18 = z28;
                                } else {
                                    boolean z29 = z27;
                                    function09 = function08;
                                    z18 = z29;
                                    function15 = function12;
                                }
                                i53 = i52;
                                i54 = i71;
                                i55 = i72;
                                c7807z2 = c7807z4;
                                i56 = i22;
                                abstractC8972b = null;
                                n03 = n05;
                                eVar4 = eVar3;
                                qVar4 = qVar3;
                                function16 = function14;
                                function010 = function05;
                                function011 = function07;
                            } else {
                                u11.j();
                                if ((i17 & 4194304) != 0) {
                                    i52 &= -897;
                                }
                                i55 = i13;
                                c7807z2 = c7807z;
                                z18 = z12;
                                z16 = z13;
                                z17 = z14;
                                m03 = m02;
                                a11 = x11;
                                qVar4 = qVar;
                                function16 = function1;
                                function09 = function03;
                                function15 = function12;
                                i53 = i52;
                                i54 = i24;
                                i56 = i22;
                                eVar4 = eVar2;
                                abstractC8972b = null;
                                z15 = z11;
                                n03 = n02;
                                function010 = function0;
                                function011 = function02;
                            }
                            u11.j0();
                            InterfaceC3978p0 a12 = i.a(qVar4, u11, (i46 >> 21) & 14);
                            e eVar7 = eVar4;
                            DsTextAreaStyle style$uni_release = status.toStyle$uni_release(u11, (i18 >> 9) & 14);
                            DsTextAreaState dsTextAreaState = style$uni_release.getStatus() == DsTextAreaStatus.DISABLED ? DsTextArea_s9ZHXeI$lambda$5(a12) ? DsTextAreaState.ACTIVE : DsTextAreaState.DEFAULT : DsTextAreaState.DISABLED;
                            u11.o(1600648675);
                            DsTextAreaStyle m1828default = (style$uni_release.getStatus() == DsTextAreaStatus.SUCCESS || dsTextAreaState != DsTextAreaState.ACTIVE) ? style$uni_release : DsTextAreaStyle.INSTANCE.m1828default(u11, 6);
                            b11 = Pk0.h.b(u11, 1600654628);
                            if (b11 != InterfaceC3967k.a.a()) {
                                c3422b3 = c3422b2;
                                i57 = i18;
                                i58 = 6;
                                b11 = n1.f(new K(6, 0L, inputText), D1.f25195a);
                                u11.x(b11);
                            } else {
                                i57 = i18;
                                c3422b3 = c3422b2;
                                i58 = 6;
                            }
                            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) b11;
                            u11.k();
                            q qVar6 = qVar4;
                            K b13 = K.b(DsTextArea_s9ZHXeI$lambda$7(interfaceC3978p0), inputText, 0L, i58);
                            u11.o(1600659608);
                            z19 = (i57 & 112) != 32;
                            C11 = u11.C();
                            if (!z19 || C11 == InterfaceC3967k.a.a()) {
                                C11 = n1.f(inputText, D1.f25195a);
                                u11.x(C11);
                            }
                            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
                            b12 = Pk0.h.b(u11, 1600662121);
                            if (b12 == InterfaceC3967k.a.a()) {
                                b12 = n1.f(Boolean.FALSE, D1.f25195a);
                                u11.x(b12);
                            }
                            InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) b12;
                            u11.k();
                            u11.o(1600665975);
                            n11 = ((i46 & 896) != 256) | u11.n(interfaceC3978p02) | ((i46 & 7168) != 2048) | ((i57 & 234881024) != 67108864) | ((i57 & 14) != 4) | ((i53 & 112) != 32);
                            C12 = u11.C();
                            if (!n11 || C12 == InterfaceC3967k.a.a()) {
                                boolean z31 = z17;
                                Function0<Unit> function016 = function09;
                                boolean z32 = z16;
                                C12 = new DsTextAreaKt$DsTextArea$internalOnValueChange$1$1(z32, z31, i55, onValueChange, function016, interfaceC3978p0, interfaceC3978p02, interfaceC3978p03);
                                z21 = z32;
                                z22 = z31;
                                function012 = function016;
                                u11.x(C12);
                            } else {
                                z22 = z17;
                                function012 = function09;
                                z21 = z16;
                            }
                            Function1 function19 = (Function1) C12;
                            u11.k();
                            boolean z33 = b13.f().length() != 0;
                            InterfaceC9914x counterPadding = getCounterPadding(dsTextAreaState, m1828default, z33, z15);
                            InterfaceC9914x systemContentPadding = getSystemContentPadding(m1828default, z15, z18);
                            UniTheme uniTheme = UniTheme.INSTANCE;
                            Function0<Unit> function017 = function012;
                            int i73 = UniTheme.$stable;
                            long layerFloor1 = uniTheme.getColors(u11, i73).getLayerFloor1();
                            long graphicActionPrimary = uniTheme.getColors(u11, i73).getGraphicActionPrimary();
                            long w11 = c7807z2 == null ? c7807z2.w() : m1828default.getCaptionColor();
                            K1.T labelTextStyle = getLabelTextStyle(z33, dsTextAreaState);
                            K1.T body500Medium = uniTheme.getTypography().getBody500Medium();
                            K1.T body300XSmall = uniTheme.getTypography().getBody300XSmall();
                            long textSecondary = uniTheme.getColors(u11, i73).getTextSecondary();
                            long textNegative = uniTheme.getColors(u11, i73).getTextNegative();
                            K1.T body300XSmall2 = uniTheme.getTypography().getBody300XSmall();
                            boolean z34 = (m1828default.getIsReadOnly() || z18) ? false : true;
                            boolean z35 = (z34 || z33) ? false : true;
                            AbstractC8972b systemIcon = !z34 ? abstractC8972b : m1828default.getSystemIcon();
                            DsTextAreaState dsTextAreaState2 = dsTextAreaState;
                            DsTextAreaStyle dsTextAreaStyle = m1828default;
                            boolean z36 = z33;
                            Function0<Unit> function018 = function010;
                            boolean z37 = z15;
                            Function1<? super String, Unit> function110 = function15;
                            C4912a c11 = a1.c.c(-1420067041, new DsTextAreaKt$DsTextArea$6(dsTextAreaStyle, dsTextAreaState2, z37, z36, z18, b13, function018, function110), u11);
                            AbstractC8972b abstractC8972b2 = systemIcon;
                            Function1<? super Boolean, Unit> function111 = function16;
                            boolean isReadOnly = dsTextAreaStyle.getIsReadOnly();
                            boolean isEnabled = dsTextAreaStyle.getIsEnabled();
                            boolean z38 = dsTextAreaState2 != DsTextAreaState.ACTIVE;
                            boolean DsTextArea_s9ZHXeI$lambda$5 = DsTextArea_s9ZHXeI$lambda$5(a12);
                            boolean z39 = z38;
                            u11.o(1600757316);
                            C13 = u11.C();
                            if (C13 == InterfaceC3967k.a.a()) {
                                C13 = new r();
                                u11.x(C13);
                            }
                            r rVar = (r) C13;
                            u11.k();
                            long textColor = dsTextAreaStyle.getTextColor();
                            long labelColor = dsTextAreaStyle.getLabelColor();
                            long labelColor2 = dsTextAreaStyle.getLabelColor();
                            long borderColor = dsTextAreaStyle.getBorderColor();
                            long activeBorderColor = dsTextAreaStyle.getActiveBorderColor();
                            long systemIconColor = dsTextAreaStyle.getSystemIconColor();
                            float borderWidth = dsTextAreaState2.getBorderWidth();
                            float f7 = minHeight;
                            float f11 = maxHeight;
                            C4912a c12 = a1.c.c(-1803960914, new DsTextAreaKt$DsTextArea$8(style$uni_release, z18, function19, function011), u11);
                            e.a aVar = e.f40358c0;
                            DsSpacings dsSpacings = DsSpacings.INSTANCE;
                            e j11 = T.j(aVar, 0.0f, 0.0f, 0.0f, dsSpacings.m1854getDp4D9Ej5fM(), 7);
                            e j12 = T.j(aVar, dsSpacings.m1842getDp12D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
                            e e11 = T.e(aVar, getLabelPadding(z36, dsTextAreaState2));
                            e e12 = T.e(aVar, systemContentPadding);
                            e e13 = T.e(aVar, counterPadding);
                            AbstractC8972b icon = TokensExtKt.getIcon(uniTheme.getIconTokens().getIc_m_lock_closed_filled(), u11, UniIconToken.$stable);
                            long graphicTertiary = uniTheme.getColors(u11, i73).getGraphicTertiary();
                            int i74 = (i46 & 57344) | 3072 | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024);
                            int i75 = ((i46 << 12) & 458752) | ((i57 >> 3) & 29360128);
                            int i76 = i57 >> 15;
                            boolean z41 = z18;
                            c3969l = u11;
                            Function0<Unit> function019 = function011;
                            C3422b c3422b5 = c3422b3;
                            FoundationTextAreaKt.m3029FoundationTextArea63v6zQ(eVar7, function19, b13, label, null, c3422b5, 3, abstractC8972b2, c11, isReadOnly, isEnabled, z39, DsTextArea_s9ZHXeI$lambda$5, rVar, n03, m03, a11, qVar6, function111, layerFloor1, graphicActionPrimary, textColor, labelColor, labelColor2, w11, borderColor, activeBorderColor, systemIconColor, labelTextStyle, body500Medium, body300XSmall, borderWidth, f7, f11, c12, j11, j12, e11, aVar, aVar, e12, e13, icon, graphicTertiary, (z21 || dsTextAreaStyle.getIsReadOnly() || dsTextAreaStyle.getIsDisabled()) ? false : true, z41, z35, i55, textSecondary, textNegative, body300XSmall2, i56, i54, dsSpacings.m1838getDp0D9Ej5fM(), dsSpacings.m1850getDp24D9Ej5fM(), dsSpacings.m1861getDp8D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), c3969l, ((i57 >> 12) & 14) | 102260736 | ((i57 << 3) & 7168) | (i57 & 458752), i74, 0, 907767168, i75, (i76 & 112) | 1797120 | (i76 & 896));
                            z23 = z37;
                            function013 = function017;
                            eVar5 = eVar7;
                            z24 = z41;
                            c3422b4 = c3422b5;
                            n04 = n03;
                            m04 = m03;
                            x12 = a11;
                            qVar5 = qVar6;
                            function17 = function111;
                            i59 = i55;
                            i61 = i56;
                            i62 = i54;
                            c7807z3 = c7807z2;
                            z25 = z21;
                            z26 = z22;
                            function014 = function018;
                            function18 = function110;
                            function015 = function019;
                        }
                        m05 = c3969l.m0();
                        if (m05 == null) {
                            m05.G(new DsTextAreaKt$DsTextArea$9(onValueChange, inputText, label, status, eVar5, c3422b4, i61, i62, i59, c7807z3, z23, z24, z25, z26, n04, m04, x12, qVar5, function17, function014, function015, function013, function18, i14, i15, i16, i17));
                            return;
                        }
                        return;
                    }
                }
                i41 = i17 & 32768;
                if (i41 == 0) {
                }
                i42 = i17 & 65536;
                if (i42 == 0) {
                }
                i43 = i17 & 131072;
                if (i43 == 0) {
                }
                i44 = i17 & 262144;
                if (i44 == 0) {
                }
                i45 = i17 & 524288;
                if (i45 == 0) {
                }
                i46 = i39;
                i47 = i17 & 1048576;
                if (i47 == 0) {
                }
                i51 = i17 & 2097152;
                if (i51 == 0) {
                }
                if ((i16 & 384) == 0) {
                }
                i52 = i49;
                if ((i18 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i14 & 1) != 0) {
                }
                if (i66 == 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i23 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                if (i29 == 0) {
                }
                if (i33 == 0) {
                }
                if (i34 == 0) {
                }
                if (i36 == 0) {
                }
                if (i48 == 0) {
                }
                if (i41 == 0) {
                }
                if (i42 == 0) {
                }
                if (i43 == 0) {
                }
                if (i44 == 0) {
                }
                if (i45 == 0) {
                }
                if (i47 == 0) {
                }
                if (i51 == 0) {
                }
                if ((i17 & 4194304) == 0) {
                }
                i53 = i52;
                i54 = i71;
                i55 = i72;
                c7807z2 = c7807z4;
                i56 = i22;
                abstractC8972b = null;
                n03 = n05;
                eVar4 = eVar3;
                qVar4 = qVar3;
                function16 = function14;
                function010 = function05;
                function011 = function07;
                u11.j0();
                InterfaceC3978p0 a122 = i.a(qVar4, u11, (i46 >> 21) & 14);
                e eVar72 = eVar4;
                DsTextAreaStyle style$uni_release2 = status.toStyle$uni_release(u11, (i18 >> 9) & 14);
                if (style$uni_release2.getStatus() == DsTextAreaStatus.DISABLED) {
                }
                u11.o(1600648675);
                if (style$uni_release2.getStatus() == DsTextAreaStatus.SUCCESS) {
                }
                b11 = Pk0.h.b(u11, 1600654628);
                if (b11 != InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p04 = (InterfaceC3978p0) b11;
                u11.k();
                q qVar62 = qVar4;
                K b132 = K.b(DsTextArea_s9ZHXeI$lambda$7(interfaceC3978p04), inputText, 0L, i58);
                u11.o(1600659608);
                if ((i57 & 112) != 32) {
                }
                C11 = u11.C();
                if (!z19) {
                }
                C11 = n1.f(inputText, D1.f25195a);
                u11.x(C11);
                InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) C11;
                b12 = Pk0.h.b(u11, 1600662121);
                if (b12 == InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p032 = (InterfaceC3978p0) b12;
                u11.k();
                u11.o(1600665975);
                n11 = ((i46 & 896) != 256) | u11.n(interfaceC3978p022) | ((i46 & 7168) != 2048) | ((i57 & 234881024) != 67108864) | ((i57 & 14) != 4) | ((i53 & 112) != 32);
                C12 = u11.C();
                if (n11) {
                }
                boolean z312 = z17;
                Function0<Unit> function0162 = function09;
                boolean z322 = z16;
                C12 = new DsTextAreaKt$DsTextArea$internalOnValueChange$1$1(z322, z312, i55, onValueChange, function0162, interfaceC3978p04, interfaceC3978p022, interfaceC3978p032);
                z21 = z322;
                z22 = z312;
                function012 = function0162;
                u11.x(C12);
                Function1 function192 = (Function1) C12;
                u11.k();
                if (b132.f().length() != 0) {
                }
                InterfaceC9914x counterPadding2 = getCounterPadding(dsTextAreaState, m1828default, z33, z15);
                InterfaceC9914x systemContentPadding2 = getSystemContentPadding(m1828default, z15, z18);
                UniTheme uniTheme2 = UniTheme.INSTANCE;
                Function0<Unit> function0172 = function012;
                int i732 = UniTheme.$stable;
                long layerFloor12 = uniTheme2.getColors(u11, i732).getLayerFloor1();
                long graphicActionPrimary2 = uniTheme2.getColors(u11, i732).getGraphicActionPrimary();
                long w112 = c7807z2 == null ? c7807z2.w() : m1828default.getCaptionColor();
                K1.T labelTextStyle2 = getLabelTextStyle(z33, dsTextAreaState);
                K1.T body500Medium2 = uniTheme2.getTypography().getBody500Medium();
                K1.T body300XSmall3 = uniTheme2.getTypography().getBody300XSmall();
                long textSecondary2 = uniTheme2.getColors(u11, i732).getTextSecondary();
                long textNegative2 = uniTheme2.getColors(u11, i732).getTextNegative();
                K1.T body300XSmall22 = uniTheme2.getTypography().getBody300XSmall();
                if (m1828default.getIsReadOnly()) {
                }
                if (z34) {
                }
                if (!z34) {
                }
                DsTextAreaState dsTextAreaState22 = dsTextAreaState;
                DsTextAreaStyle dsTextAreaStyle2 = m1828default;
                boolean z362 = z33;
                Function0<Unit> function0182 = function010;
                boolean z372 = z15;
                Function1<? super String, Unit> function1102 = function15;
                C4912a c112 = a1.c.c(-1420067041, new DsTextAreaKt$DsTextArea$6(dsTextAreaStyle2, dsTextAreaState22, z372, z362, z18, b132, function0182, function1102), u11);
                AbstractC8972b abstractC8972b22 = systemIcon;
                Function1<? super Boolean, Unit> function1112 = function16;
                boolean isReadOnly2 = dsTextAreaStyle2.getIsReadOnly();
                boolean isEnabled2 = dsTextAreaStyle2.getIsEnabled();
                if (dsTextAreaState22 != DsTextAreaState.ACTIVE) {
                }
                boolean DsTextArea_s9ZHXeI$lambda$52 = DsTextArea_s9ZHXeI$lambda$5(a122);
                boolean z392 = z38;
                u11.o(1600757316);
                C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                }
                r rVar2 = (r) C13;
                u11.k();
                long textColor2 = dsTextAreaStyle2.getTextColor();
                long labelColor3 = dsTextAreaStyle2.getLabelColor();
                long labelColor22 = dsTextAreaStyle2.getLabelColor();
                long borderColor2 = dsTextAreaStyle2.getBorderColor();
                long activeBorderColor2 = dsTextAreaStyle2.getActiveBorderColor();
                long systemIconColor2 = dsTextAreaStyle2.getSystemIconColor();
                float borderWidth2 = dsTextAreaState22.getBorderWidth();
                float f72 = minHeight;
                float f112 = maxHeight;
                C4912a c122 = a1.c.c(-1803960914, new DsTextAreaKt$DsTextArea$8(style$uni_release2, z18, function192, function011), u11);
                e.a aVar2 = e.f40358c0;
                DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                e j112 = T.j(aVar2, 0.0f, 0.0f, 0.0f, dsSpacings2.m1854getDp4D9Ej5fM(), 7);
                e j122 = T.j(aVar2, dsSpacings2.m1842getDp12D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
                e e112 = T.e(aVar2, getLabelPadding(z362, dsTextAreaState22));
                e e122 = T.e(aVar2, systemContentPadding2);
                e e132 = T.e(aVar2, counterPadding2);
                AbstractC8972b icon2 = TokensExtKt.getIcon(uniTheme2.getIconTokens().getIc_m_lock_closed_filled(), u11, UniIconToken.$stable);
                long graphicTertiary2 = uniTheme2.getColors(u11, i732).getGraphicTertiary();
                int i742 = (i46 & 57344) | 3072 | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024);
                int i752 = ((i46 << 12) & 458752) | ((i57 >> 3) & 29360128);
                int i762 = i57 >> 15;
                boolean z412 = z18;
                c3969l = u11;
                Function0<Unit> function0192 = function011;
                C3422b c3422b52 = c3422b3;
                FoundationTextAreaKt.m3029FoundationTextArea63v6zQ(eVar72, function192, b132, label, null, c3422b52, 3, abstractC8972b22, c112, isReadOnly2, isEnabled2, z392, DsTextArea_s9ZHXeI$lambda$52, rVar2, n03, m03, a11, qVar62, function1112, layerFloor12, graphicActionPrimary2, textColor2, labelColor3, labelColor22, w112, borderColor2, activeBorderColor2, systemIconColor2, labelTextStyle2, body500Medium2, body300XSmall3, borderWidth2, f72, f112, c122, j112, j122, e112, aVar2, aVar2, e122, e132, icon2, graphicTertiary2, (z21 || dsTextAreaStyle2.getIsReadOnly() || dsTextAreaStyle2.getIsDisabled()) ? false : true, z412, z35, i55, textSecondary2, textNegative2, body300XSmall22, i56, i54, dsSpacings2.m1838getDp0D9Ej5fM(), dsSpacings2.m1850getDp24D9Ej5fM(), dsSpacings2.m1861getDp8D9Ej5fM(), dsSpacings2.m1845getDp16D9Ej5fM(), c3969l, ((i57 >> 12) & 14) | 102260736 | ((i57 << 3) & 7168) | (i57 & 458752), i742, 0, 907767168, i752, (i762 & 112) | 1797120 | (i762 & 896));
                z23 = z372;
                function013 = function0172;
                eVar5 = eVar72;
                z24 = z412;
                c3422b4 = c3422b52;
                n04 = n03;
                m04 = m03;
                x12 = a11;
                qVar5 = qVar62;
                function17 = function1112;
                i59 = i55;
                i61 = i56;
                i62 = i54;
                c7807z3 = c7807z2;
                z25 = z21;
                z26 = z22;
                function014 = function0182;
                function18 = function1102;
                function015 = function0192;
                m05 = c3969l.m0();
                if (m05 == null) {
                }
            }
            i27 = i26;
            i28 = i17 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i28 != 0) {
            }
            i32 = i17 & 2048;
            if (i32 != 0) {
            }
            int i672 = i31;
            i34 = i17 & 4096;
            if (i34 != 0) {
            }
            i36 = i17 & 8192;
            if (i36 != 0) {
            }
            i38 = i17 & 16384;
            if (i38 != 0) {
            }
            i41 = i17 & 32768;
            if (i41 == 0) {
            }
            i42 = i17 & 65536;
            if (i42 == 0) {
            }
            i43 = i17 & 131072;
            if (i43 == 0) {
            }
            i44 = i17 & 262144;
            if (i44 == 0) {
            }
            i45 = i17 & 524288;
            if (i45 == 0) {
            }
            i46 = i39;
            i47 = i17 & 1048576;
            if (i47 == 0) {
            }
            i51 = i17 & 2097152;
            if (i51 == 0) {
            }
            if ((i16 & 384) == 0) {
            }
            i52 = i49;
            if ((i18 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) != 0) {
            }
            if (i66 == 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            if (i29 == 0) {
            }
            if (i33 == 0) {
            }
            if (i34 == 0) {
            }
            if (i36 == 0) {
            }
            if (i48 == 0) {
            }
            if (i41 == 0) {
            }
            if (i42 == 0) {
            }
            if (i43 == 0) {
            }
            if (i44 == 0) {
            }
            if (i45 == 0) {
            }
            if (i47 == 0) {
            }
            if (i51 == 0) {
            }
            if ((i17 & 4194304) == 0) {
            }
            i53 = i52;
            i54 = i71;
            i55 = i72;
            c7807z2 = c7807z4;
            i56 = i22;
            abstractC8972b = null;
            n03 = n05;
            eVar4 = eVar3;
            qVar4 = qVar3;
            function16 = function14;
            function010 = function05;
            function011 = function07;
            u11.j0();
            InterfaceC3978p0 a1222 = i.a(qVar4, u11, (i46 >> 21) & 14);
            e eVar722 = eVar4;
            DsTextAreaStyle style$uni_release22 = status.toStyle$uni_release(u11, (i18 >> 9) & 14);
            if (style$uni_release22.getStatus() == DsTextAreaStatus.DISABLED) {
            }
            u11.o(1600648675);
            if (style$uni_release22.getStatus() == DsTextAreaStatus.SUCCESS) {
            }
            b11 = Pk0.h.b(u11, 1600654628);
            if (b11 != InterfaceC3967k.a.a()) {
            }
            InterfaceC3978p0 interfaceC3978p042 = (InterfaceC3978p0) b11;
            u11.k();
            q qVar622 = qVar4;
            K b1322 = K.b(DsTextArea_s9ZHXeI$lambda$7(interfaceC3978p042), inputText, 0L, i58);
            u11.o(1600659608);
            if ((i57 & 112) != 32) {
            }
            C11 = u11.C();
            if (!z19) {
            }
            C11 = n1.f(inputText, D1.f25195a);
            u11.x(C11);
            InterfaceC3978p0 interfaceC3978p0222 = (InterfaceC3978p0) C11;
            b12 = Pk0.h.b(u11, 1600662121);
            if (b12 == InterfaceC3967k.a.a()) {
            }
            InterfaceC3978p0 interfaceC3978p0322 = (InterfaceC3978p0) b12;
            u11.k();
            u11.o(1600665975);
            n11 = ((i46 & 896) != 256) | u11.n(interfaceC3978p0222) | ((i46 & 7168) != 2048) | ((i57 & 234881024) != 67108864) | ((i57 & 14) != 4) | ((i53 & 112) != 32);
            C12 = u11.C();
            if (n11) {
            }
            boolean z3122 = z17;
            Function0<Unit> function01622 = function09;
            boolean z3222 = z16;
            C12 = new DsTextAreaKt$DsTextArea$internalOnValueChange$1$1(z3222, z3122, i55, onValueChange, function01622, interfaceC3978p042, interfaceC3978p0222, interfaceC3978p0322);
            z21 = z3222;
            z22 = z3122;
            function012 = function01622;
            u11.x(C12);
            Function1 function1922 = (Function1) C12;
            u11.k();
            if (b1322.f().length() != 0) {
            }
            InterfaceC9914x counterPadding22 = getCounterPadding(dsTextAreaState, m1828default, z33, z15);
            InterfaceC9914x systemContentPadding22 = getSystemContentPadding(m1828default, z15, z18);
            UniTheme uniTheme22 = UniTheme.INSTANCE;
            Function0<Unit> function01722 = function012;
            int i7322 = UniTheme.$stable;
            long layerFloor122 = uniTheme22.getColors(u11, i7322).getLayerFloor1();
            long graphicActionPrimary22 = uniTheme22.getColors(u11, i7322).getGraphicActionPrimary();
            long w1122 = c7807z2 == null ? c7807z2.w() : m1828default.getCaptionColor();
            K1.T labelTextStyle22 = getLabelTextStyle(z33, dsTextAreaState);
            K1.T body500Medium22 = uniTheme22.getTypography().getBody500Medium();
            K1.T body300XSmall32 = uniTheme22.getTypography().getBody300XSmall();
            long textSecondary22 = uniTheme22.getColors(u11, i7322).getTextSecondary();
            long textNegative22 = uniTheme22.getColors(u11, i7322).getTextNegative();
            K1.T body300XSmall222 = uniTheme22.getTypography().getBody300XSmall();
            if (m1828default.getIsReadOnly()) {
            }
            if (z34) {
            }
            if (!z34) {
            }
            DsTextAreaState dsTextAreaState222 = dsTextAreaState;
            DsTextAreaStyle dsTextAreaStyle22 = m1828default;
            boolean z3622 = z33;
            Function0<Unit> function01822 = function010;
            boolean z3722 = z15;
            Function1<? super String, Unit> function11022 = function15;
            C4912a c1122 = a1.c.c(-1420067041, new DsTextAreaKt$DsTextArea$6(dsTextAreaStyle22, dsTextAreaState222, z3722, z3622, z18, b1322, function01822, function11022), u11);
            AbstractC8972b abstractC8972b222 = systemIcon;
            Function1<? super Boolean, Unit> function11122 = function16;
            boolean isReadOnly22 = dsTextAreaStyle22.getIsReadOnly();
            boolean isEnabled22 = dsTextAreaStyle22.getIsEnabled();
            if (dsTextAreaState222 != DsTextAreaState.ACTIVE) {
            }
            boolean DsTextArea_s9ZHXeI$lambda$522 = DsTextArea_s9ZHXeI$lambda$5(a1222);
            boolean z3922 = z38;
            u11.o(1600757316);
            C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
            }
            r rVar22 = (r) C13;
            u11.k();
            long textColor22 = dsTextAreaStyle22.getTextColor();
            long labelColor32 = dsTextAreaStyle22.getLabelColor();
            long labelColor222 = dsTextAreaStyle22.getLabelColor();
            long borderColor22 = dsTextAreaStyle22.getBorderColor();
            long activeBorderColor22 = dsTextAreaStyle22.getActiveBorderColor();
            long systemIconColor22 = dsTextAreaStyle22.getSystemIconColor();
            float borderWidth22 = dsTextAreaState222.getBorderWidth();
            float f722 = minHeight;
            float f1122 = maxHeight;
            C4912a c1222 = a1.c.c(-1803960914, new DsTextAreaKt$DsTextArea$8(style$uni_release22, z18, function1922, function011), u11);
            e.a aVar22 = e.f40358c0;
            DsSpacings dsSpacings22 = DsSpacings.INSTANCE;
            e j1122 = T.j(aVar22, 0.0f, 0.0f, 0.0f, dsSpacings22.m1854getDp4D9Ej5fM(), 7);
            e j1222 = T.j(aVar22, dsSpacings22.m1842getDp12D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
            e e1122 = T.e(aVar22, getLabelPadding(z3622, dsTextAreaState222));
            e e1222 = T.e(aVar22, systemContentPadding22);
            e e1322 = T.e(aVar22, counterPadding22);
            AbstractC8972b icon22 = TokensExtKt.getIcon(uniTheme22.getIconTokens().getIc_m_lock_closed_filled(), u11, UniIconToken.$stable);
            long graphicTertiary22 = uniTheme22.getColors(u11, i7322).getGraphicTertiary();
            int i7422 = (i46 & 57344) | 3072 | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024);
            int i7522 = ((i46 << 12) & 458752) | ((i57 >> 3) & 29360128);
            int i7622 = i57 >> 15;
            boolean z4122 = z18;
            c3969l = u11;
            Function0<Unit> function01922 = function011;
            C3422b c3422b522 = c3422b3;
            FoundationTextAreaKt.m3029FoundationTextArea63v6zQ(eVar722, function1922, b1322, label, null, c3422b522, 3, abstractC8972b222, c1122, isReadOnly22, isEnabled22, z3922, DsTextArea_s9ZHXeI$lambda$522, rVar22, n03, m03, a11, qVar622, function11122, layerFloor122, graphicActionPrimary22, textColor22, labelColor32, labelColor222, w1122, borderColor22, activeBorderColor22, systemIconColor22, labelTextStyle22, body500Medium22, body300XSmall32, borderWidth22, f722, f1122, c1222, j1122, j1222, e1122, aVar22, aVar22, e1222, e1322, icon22, graphicTertiary22, (z21 || dsTextAreaStyle22.getIsReadOnly() || dsTextAreaStyle22.getIsDisabled()) ? false : true, z4122, z35, i55, textSecondary22, textNegative22, body300XSmall222, i56, i54, dsSpacings22.m1838getDp0D9Ej5fM(), dsSpacings22.m1850getDp24D9Ej5fM(), dsSpacings22.m1861getDp8D9Ej5fM(), dsSpacings22.m1845getDp16D9Ej5fM(), c3969l, ((i57 >> 12) & 14) | 102260736 | ((i57 << 3) & 7168) | (i57 & 458752), i7422, 0, 907767168, i7522, (i7622 & 112) | 1797120 | (i7622 & 896));
            z23 = z3722;
            function013 = function01722;
            eVar5 = eVar722;
            z24 = z4122;
            c3422b4 = c3422b522;
            n04 = n03;
            m04 = m03;
            x12 = a11;
            qVar5 = qVar622;
            function17 = function11122;
            i59 = i55;
            i61 = i56;
            i62 = i54;
            c7807z3 = c7807z2;
            z25 = z21;
            z26 = z22;
            function014 = function01822;
            function18 = function11022;
            function015 = function01922;
            m05 = c3969l.m0();
            if (m05 == null) {
            }
        }
        eVar2 = eVar;
        i19 = i17 & 32;
        if (i19 == 0) {
        }
        i21 = i17 & 64;
        if (i21 == 0) {
        }
        i23 = i17 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i23 == 0) {
        }
        i25 = i17 & 256;
        if (i25 == 0) {
        }
        i26 = i17 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i26 == 0) {
        }
        i27 = i26;
        i28 = i17 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i28 != 0) {
        }
        i32 = i17 & 2048;
        if (i32 != 0) {
        }
        int i6722 = i31;
        i34 = i17 & 4096;
        if (i34 != 0) {
        }
        i36 = i17 & 8192;
        if (i36 != 0) {
        }
        i38 = i17 & 16384;
        if (i38 != 0) {
        }
        i41 = i17 & 32768;
        if (i41 == 0) {
        }
        i42 = i17 & 65536;
        if (i42 == 0) {
        }
        i43 = i17 & 131072;
        if (i43 == 0) {
        }
        i44 = i17 & 262144;
        if (i44 == 0) {
        }
        i45 = i17 & 524288;
        if (i45 == 0) {
        }
        i46 = i39;
        i47 = i17 & 1048576;
        if (i47 == 0) {
        }
        i51 = i17 & 2097152;
        if (i51 == 0) {
        }
        if ((i16 & 384) == 0) {
        }
        i52 = i49;
        if ((i18 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) != 0) {
        }
        if (i66 == 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i23 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        if (i29 == 0) {
        }
        if (i33 == 0) {
        }
        if (i34 == 0) {
        }
        if (i36 == 0) {
        }
        if (i48 == 0) {
        }
        if (i41 == 0) {
        }
        if (i42 == 0) {
        }
        if (i43 == 0) {
        }
        if (i44 == 0) {
        }
        if (i45 == 0) {
        }
        if (i47 == 0) {
        }
        if (i51 == 0) {
        }
        if ((i17 & 4194304) == 0) {
        }
        i53 = i52;
        i54 = i71;
        i55 = i72;
        c7807z2 = c7807z4;
        i56 = i22;
        abstractC8972b = null;
        n03 = n05;
        eVar4 = eVar3;
        qVar4 = qVar3;
        function16 = function14;
        function010 = function05;
        function011 = function07;
        u11.j0();
        InterfaceC3978p0 a12222 = i.a(qVar4, u11, (i46 >> 21) & 14);
        e eVar7222 = eVar4;
        DsTextAreaStyle style$uni_release222 = status.toStyle$uni_release(u11, (i18 >> 9) & 14);
        if (style$uni_release222.getStatus() == DsTextAreaStatus.DISABLED) {
        }
        u11.o(1600648675);
        if (style$uni_release222.getStatus() == DsTextAreaStatus.SUCCESS) {
        }
        b11 = Pk0.h.b(u11, 1600654628);
        if (b11 != InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0422 = (InterfaceC3978p0) b11;
        u11.k();
        q qVar6222 = qVar4;
        K b13222 = K.b(DsTextArea_s9ZHXeI$lambda$7(interfaceC3978p0422), inputText, 0L, i58);
        u11.o(1600659608);
        if ((i57 & 112) != 32) {
        }
        C11 = u11.C();
        if (!z19) {
        }
        C11 = n1.f(inputText, D1.f25195a);
        u11.x(C11);
        InterfaceC3978p0 interfaceC3978p02222 = (InterfaceC3978p0) C11;
        b12 = Pk0.h.b(u11, 1600662121);
        if (b12 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p03222 = (InterfaceC3978p0) b12;
        u11.k();
        u11.o(1600665975);
        n11 = ((i46 & 896) != 256) | u11.n(interfaceC3978p02222) | ((i46 & 7168) != 2048) | ((i57 & 234881024) != 67108864) | ((i57 & 14) != 4) | ((i53 & 112) != 32);
        C12 = u11.C();
        if (n11) {
        }
        boolean z31222 = z17;
        Function0<Unit> function016222 = function09;
        boolean z32222 = z16;
        C12 = new DsTextAreaKt$DsTextArea$internalOnValueChange$1$1(z32222, z31222, i55, onValueChange, function016222, interfaceC3978p0422, interfaceC3978p02222, interfaceC3978p03222);
        z21 = z32222;
        z22 = z31222;
        function012 = function016222;
        u11.x(C12);
        Function1 function19222 = (Function1) C12;
        u11.k();
        if (b13222.f().length() != 0) {
        }
        InterfaceC9914x counterPadding222 = getCounterPadding(dsTextAreaState, m1828default, z33, z15);
        InterfaceC9914x systemContentPadding222 = getSystemContentPadding(m1828default, z15, z18);
        UniTheme uniTheme222 = UniTheme.INSTANCE;
        Function0<Unit> function017222 = function012;
        int i73222 = UniTheme.$stable;
        long layerFloor1222 = uniTheme222.getColors(u11, i73222).getLayerFloor1();
        long graphicActionPrimary222 = uniTheme222.getColors(u11, i73222).getGraphicActionPrimary();
        long w11222 = c7807z2 == null ? c7807z2.w() : m1828default.getCaptionColor();
        K1.T labelTextStyle222 = getLabelTextStyle(z33, dsTextAreaState);
        K1.T body500Medium222 = uniTheme222.getTypography().getBody500Medium();
        K1.T body300XSmall322 = uniTheme222.getTypography().getBody300XSmall();
        long textSecondary222 = uniTheme222.getColors(u11, i73222).getTextSecondary();
        long textNegative222 = uniTheme222.getColors(u11, i73222).getTextNegative();
        K1.T body300XSmall2222 = uniTheme222.getTypography().getBody300XSmall();
        if (m1828default.getIsReadOnly()) {
        }
        if (z34) {
        }
        if (!z34) {
        }
        DsTextAreaState dsTextAreaState2222 = dsTextAreaState;
        DsTextAreaStyle dsTextAreaStyle222 = m1828default;
        boolean z36222 = z33;
        Function0<Unit> function018222 = function010;
        boolean z37222 = z15;
        Function1<? super String, Unit> function110222 = function15;
        C4912a c11222 = a1.c.c(-1420067041, new DsTextAreaKt$DsTextArea$6(dsTextAreaStyle222, dsTextAreaState2222, z37222, z36222, z18, b13222, function018222, function110222), u11);
        AbstractC8972b abstractC8972b2222 = systemIcon;
        Function1<? super Boolean, Unit> function111222 = function16;
        boolean isReadOnly222 = dsTextAreaStyle222.getIsReadOnly();
        boolean isEnabled222 = dsTextAreaStyle222.getIsEnabled();
        if (dsTextAreaState2222 != DsTextAreaState.ACTIVE) {
        }
        boolean DsTextArea_s9ZHXeI$lambda$5222 = DsTextArea_s9ZHXeI$lambda$5(a12222);
        boolean z39222 = z38;
        u11.o(1600757316);
        C13 = u11.C();
        if (C13 == InterfaceC3967k.a.a()) {
        }
        r rVar222 = (r) C13;
        u11.k();
        long textColor222 = dsTextAreaStyle222.getTextColor();
        long labelColor322 = dsTextAreaStyle222.getLabelColor();
        long labelColor2222 = dsTextAreaStyle222.getLabelColor();
        long borderColor222 = dsTextAreaStyle222.getBorderColor();
        long activeBorderColor222 = dsTextAreaStyle222.getActiveBorderColor();
        long systemIconColor222 = dsTextAreaStyle222.getSystemIconColor();
        float borderWidth222 = dsTextAreaState2222.getBorderWidth();
        float f7222 = minHeight;
        float f11222 = maxHeight;
        C4912a c12222 = a1.c.c(-1803960914, new DsTextAreaKt$DsTextArea$8(style$uni_release222, z18, function19222, function011), u11);
        e.a aVar222 = e.f40358c0;
        DsSpacings dsSpacings222 = DsSpacings.INSTANCE;
        e j11222 = T.j(aVar222, 0.0f, 0.0f, 0.0f, dsSpacings222.m1854getDp4D9Ej5fM(), 7);
        e j12222 = T.j(aVar222, dsSpacings222.m1842getDp12D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
        e e11222 = T.e(aVar222, getLabelPadding(z36222, dsTextAreaState2222));
        e e12222 = T.e(aVar222, systemContentPadding222);
        e e13222 = T.e(aVar222, counterPadding222);
        AbstractC8972b icon222 = TokensExtKt.getIcon(uniTheme222.getIconTokens().getIc_m_lock_closed_filled(), u11, UniIconToken.$stable);
        long graphicTertiary222 = uniTheme222.getColors(u11, i73222).getGraphicTertiary();
        int i74222 = (i46 & 57344) | 3072 | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024);
        int i75222 = ((i46 << 12) & 458752) | ((i57 >> 3) & 29360128);
        int i76222 = i57 >> 15;
        boolean z41222 = z18;
        c3969l = u11;
        Function0<Unit> function019222 = function011;
        C3422b c3422b5222 = c3422b3;
        FoundationTextAreaKt.m3029FoundationTextArea63v6zQ(eVar7222, function19222, b13222, label, null, c3422b5222, 3, abstractC8972b2222, c11222, isReadOnly222, isEnabled222, z39222, DsTextArea_s9ZHXeI$lambda$5222, rVar222, n03, m03, a11, qVar6222, function111222, layerFloor1222, graphicActionPrimary222, textColor222, labelColor322, labelColor2222, w11222, borderColor222, activeBorderColor222, systemIconColor222, labelTextStyle222, body500Medium222, body300XSmall322, borderWidth222, f7222, f11222, c12222, j11222, j12222, e11222, aVar222, aVar222, e12222, e13222, icon222, graphicTertiary222, (z21 || dsTextAreaStyle222.getIsReadOnly() || dsTextAreaStyle222.getIsDisabled()) ? false : true, z41222, z35, i55, textSecondary222, textNegative222, body300XSmall2222, i56, i54, dsSpacings222.m1838getDp0D9Ej5fM(), dsSpacings222.m1850getDp24D9Ej5fM(), dsSpacings222.m1861getDp8D9Ej5fM(), dsSpacings222.m1845getDp16D9Ej5fM(), c3969l, ((i57 >> 12) & 14) | 102260736 | ((i57 << 3) & 7168) | (i57 & 458752), i74222, 0, 907767168, i75222, (i76222 & 112) | 1797120 | (i76222 & 896));
        z23 = z37222;
        function013 = function017222;
        eVar5 = eVar7222;
        z24 = z41222;
        c3422b4 = c3422b5222;
        n04 = n03;
        m04 = m03;
        x12 = a11;
        qVar5 = qVar6222;
        function17 = function111222;
        i59 = i55;
        i61 = i56;
        i62 = i54;
        c7807z3 = c7807z2;
        z25 = z21;
        z26 = z22;
        function014 = function018222;
        function18 = function110222;
        function015 = function019222;
        m05 = c3969l.m0();
        if (m05 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DsTextArea_s9ZHXeI$lambda$10(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DsTextArea_s9ZHXeI$lambda$13(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DsTextArea_s9ZHXeI$lambda$14(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final boolean DsTextArea_s9ZHXeI$lambda$5(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final K DsTextArea_s9ZHXeI$lambda$7(InterfaceC3978p0<K> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RightContent(DsTextAreaStyle dsTextAreaStyle, DsTextAreaState dsTextAreaState, boolean z11, boolean z12, boolean z13, String str, Function0<Unit> function0, Function1<? super String, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0<Unit> function02;
        Function0<Unit> function03;
        C3969l c3969l;
        String str2 = str;
        Function1<? super String, Unit> function12 = function1;
        C3969l u11 = interfaceC3967k.u(-597343942);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(dsTextAreaStyle) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(dsTextAreaState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.p(z13) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(str2) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            function02 = function0;
            i12 |= u11.F(function02) ? 1048576 : 524288;
        } else {
            function02 = function0;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(function12) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            if (!hasRightContent(dsTextAreaStyle, dsTextAreaState, z12, z11, z13)) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new DsTextAreaKt$RightContent$1(dsTextAreaStyle, dsTextAreaState, z11, z12, z13, str2, function02, function12, i11));
                    return;
                }
                return;
            }
            AbstractC8972b rightContentIcon = dsTextAreaStyle.getRightContentIcon();
            if (rightContentIcon == null) {
                J0 m03 = u11.m0();
                if (m03 != null) {
                    m03.G(new DsTextAreaKt$RightContent$icon$1(dsTextAreaStyle, dsTextAreaState, z11, z12, z13, str, function0, function1, i11));
                    return;
                }
                return;
            }
            str2 = str;
            function12 = function1;
            u11.o(887380875);
            if (dsTextAreaStyle.getIsReadOnly()) {
                u11.o(887381820);
                boolean z14 = ((29360128 & i12) == 8388608) | ((458752 & i12) == 131072);
                Object C11 = u11.C();
                if (z14 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new DsTextAreaKt$RightContent$onClick$1$1(function12, str2);
                    u11.x(C11);
                }
                u11.k();
                function03 = (Function0) C11;
            } else {
                function03 = function0;
            }
            u11.k();
            c3969l = u11;
            ClickableIcon(rightContentIcon, dsTextAreaStyle, z13, function03, c3969l, ((i12 << 3) & 112) | ((i12 >> 6) & 896));
        }
        J0 m04 = c3969l.m0();
        if (m04 != null) {
            m04.G(new DsTextAreaKt$RightContent$2(dsTextAreaStyle, dsTextAreaState, z11, z12, z13, str2, function0, function12, i11));
        }
    }

    private static final InterfaceC9914x getCounterPadding(DsTextAreaState dsTextAreaState, DsTextAreaStyle dsTextAreaStyle, boolean z11, boolean z12) {
        if (dsTextAreaState.isDisabled()) {
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            return new C9915y(dsSpacings.m1838getDp0D9Ej5fM(), dsSpacings.m1838getDp0D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1861getDp8D9Ej5fM());
        }
        if (!z11 && dsTextAreaState.isActive()) {
            DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
            return new C9915y(dsSpacings2.m1838getDp0D9Ej5fM(), dsSpacings2.m1838getDp0D9Ej5fM(), dsSpacings2.m1838getDp0D9Ej5fM(), dsSpacings2.m1842getDp12D9Ej5fM());
        }
        if (!z12 && !dsTextAreaStyle.getHasSystemIcon()) {
            DsSpacings dsSpacings3 = DsSpacings.INSTANCE;
            return new C9915y(dsSpacings3.m1838getDp0D9Ej5fM(), dsSpacings3.m1838getDp0D9Ej5fM(), dsSpacings3.m1845getDp16D9Ej5fM(), dsSpacings3.m1861getDp8D9Ej5fM());
        }
        if (dsTextAreaStyle.getHasSystemIcon() && z12) {
            DsSpacings dsSpacings4 = DsSpacings.INSTANCE;
            return new C9915y(dsSpacings4.m1838getDp0D9Ej5fM(), dsSpacings4.m1838getDp0D9Ej5fM(), dsSpacings4.m1861getDp8D9Ej5fM(), dsSpacings4.m1842getDp12D9Ej5fM());
        }
        if (dsTextAreaStyle.getHasSystemIcon()) {
            DsSpacings dsSpacings5 = DsSpacings.INSTANCE;
            return new C9915y(dsSpacings5.m1838getDp0D9Ej5fM(), dsSpacings5.m1838getDp0D9Ej5fM(), dsSpacings5.m1861getDp8D9Ej5fM(), dsSpacings5.m1861getDp8D9Ej5fM());
        }
        DsSpacings dsSpacings6 = DsSpacings.INSTANCE;
        return new C9915y(dsSpacings6.m1838getDp0D9Ej5fM(), dsSpacings6.m1838getDp0D9Ej5fM(), dsSpacings6.m1838getDp0D9Ej5fM(), dsSpacings6.m1842getDp12D9Ej5fM());
    }

    private static final InterfaceC9914x getLabelPadding(boolean z11, DsTextAreaState dsTextAreaState) {
        return (!z11 || dsTextAreaState == DsTextAreaState.ACTIVE) ? T.b(0.0f, DsSpacings.INSTANCE.m1861getDp8D9Ej5fM(), 0.0f, 0.0f, 13) : T.b(0.0f, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 13);
    }

    private static final K1.T getLabelTextStyle(boolean z11, DsTextAreaState dsTextAreaState) {
        return (!z11 || dsTextAreaState == DsTextAreaState.ACTIVE) ? UniTheme.INSTANCE.getTypography().getBody300XSmall() : UniTheme.INSTANCE.getTypography().getBody500Medium();
    }

    private static final InterfaceC9914x getSystemContentPadding(DsTextAreaStyle dsTextAreaStyle, boolean z11, boolean z12) {
        if (!dsTextAreaStyle.getHasSystemIcon()) {
            float m1838getDp0D9Ej5fM = DsSpacings.INSTANCE.m1838getDp0D9Ej5fM();
            return new C9915y(m1838getDp0D9Ej5fM, m1838getDp0D9Ej5fM, m1838getDp0D9Ej5fM, m1838getDp0D9Ej5fM);
        }
        if (dsTextAreaStyle.getIsReadOnly()) {
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            return T.a(0.0f, 1, z12 ? dsSpacings.m1840getDp10D9Ej5fM() : dsSpacings.m1845getDp16D9Ej5fM());
        }
        if (!z12) {
            DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
            return new C9915y(dsSpacings2.m1838getDp0D9Ej5fM(), dsSpacings2.m1845getDp16D9Ej5fM(), z11 ? dsSpacings2.m1838getDp0D9Ej5fM() : dsSpacings2.m1845getDp16D9Ej5fM(), dsSpacings2.m1845getDp16D9Ej5fM());
        }
        if (z11) {
            DsSpacings dsSpacings3 = DsSpacings.INSTANCE;
            return new C9915y(dsSpacings3.m1838getDp0D9Ej5fM(), dsSpacings3.m1840getDp10D9Ej5fM(), dsSpacings3.m1838getDp0D9Ej5fM(), dsSpacings3.m1840getDp10D9Ej5fM());
        }
        DsSpacings dsSpacings4 = DsSpacings.INSTANCE;
        return new C9915y(dsSpacings4.m1838getDp0D9Ej5fM(), dsSpacings4.m1854getDp4D9Ej5fM(), dsSpacings4.m1840getDp10D9Ej5fM(), dsSpacings4.m1854getDp4D9Ej5fM());
    }

    private static final boolean hasRightContent(DsTextAreaStyle dsTextAreaStyle, DsTextAreaState dsTextAreaState, boolean z11, boolean z12, boolean z13) {
        if ((!z13 && z12) || dsTextAreaStyle.getIsReadOnly()) {
            return true;
        }
        if (dsTextAreaStyle.getIsDisabled()) {
            return false;
        }
        return (!dsTextAreaState.isActive() || z11) && dsTextAreaStyle.hasRightContentInfoIcon$uni_release(z12);
    }
}
