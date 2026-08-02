package ru.ozon.uni.foundation.components.textarea;

import B0.C2475h;
import B0.M0;
import B0.N0;
import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import J0.u3;
import K1.C3422b;
import K1.D;
import K1.S;
import K1.T;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.F;
import Q1.K;
import Q1.X;
import R1.c;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import V1.a;
import V1.i;
import V1.m;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5191n;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
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
import l1.H0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.foundation.components.inputCore.DefaultTrailingIconKt;
import ru.ozon.uni.foundation.components.inputCore.decorationBox.DecorationBoxKt;
import t0.q;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u0083\u0004\u0010M\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020\f2\u0006\u0010F\u001a\u00020\f2\u0006\u0010G\u001a\u0002002\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u0002002\u0006\u0010J\u001a\u000200H\u0001¢\u0006\u0004\bK\u0010L\u001a§\u0004\u0010P\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\u00002\b\b\u0002\u0010>\u001a\u00020\u00122\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010E\u001a\u00020\f2\b\b\u0002\u0010F\u001a\u00020\f2\b\b\u0002\u0010H\u001a\u0002002\b\b\u0002\u0010G\u001a\u0002002\b\b\u0002\u0010I\u001a\u0002002\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010J\u001a\u000200H\u0003¢\u0006\u0004\bN\u0010O\u001a\u009d\u0002\u0010V\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010R\u001a\u00020Q2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\"2\u0006\u0010E\u001a\u00020\f2\u0006\u0010F\u001a\u00020\f2\u0006\u0010I\u001a\u0002002\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010S\u001a\u00020\fH\u0003¢\u0006\u0004\bT\u0010U\u001a\u0089\u0001\u0010[\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010X\u001a\u0002002\b\b\u0002\u0010@\u001a\u00020\u0012H\u0003¢\u0006\u0004\bY\u0010Z\u001ak\u0010_\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010X\u001a\u0002002\b\b\u0002\u0010@\u001a\u00020\u0012H\u0003¢\u0006\u0004\b]\u0010^\u001aA\u0010c\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020,2\u0006\u0010`\u001a\u00020\u0003H\u0003¢\u0006\u0004\ba\u0010b\"\u0014\u0010d\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g²\u0006\u000e\u0010f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LQ1/K;", "", "onValueChange", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "label", HammersV3BodyDTO.PLACEHOLDER, "LK1/b;", "caption", "", "captionLineLimit", "Lq1/b;", "systemContent", "Lkotlin/Function0;", "rightContent", "", "readOnly", "enabled", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "isFocused", "Lj1/r;", "focusRequester", "LB0/N0;", "keyboardOptions", "LB0/M0;", "keyboardActions", "LQ1/X;", "visualTransformation", "Lt0/q;", "interactionSource", "onFocusChanged", "Ll1/Z;", "backgroundColor", "cursorColor", "valueColor", "labelColor", "placeholderColor", "captionColor", "borderColor", "activeBorderColor", "systemContentColor", "LK1/T;", "labelTextStyle", "valueTextStyle", "captionTextStyle", "LZ1/h;", "borderWidth", "minHeight", "maxHeight", "clearButton", "textFieldModifier", "captionModifier", "labelModifier", "placeholderModifier", "lockIconModifier", "systemContentModifier", "counterModifier", "lockIcon", "lockColor", "hasCounter", "hasBottomBar", "isLeftLockIconEnabled", "maxLength", "counterColor", "counterErrorColor", "counterTextStyle", "minLines", "maxLines", "bodyTopPadding", "systemContentIconSize", "labelTopPadding", "inputCornerRadius", "FoundationTextArea-63v6-zQ", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LQ1/K;Ljava/lang/String;Ljava/lang/String;LK1/b;ILq1/b;Lkotlin/jvm/functions/Function2;ZZZZLj1/r;LB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function1;JJJJJJJJJLK1/T;LK1/T;LK1/T;FFFLkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;JZZZIJJLK1/T;IIFFFFLS0/k;IIIIII)V", "FoundationTextArea", "FoundationTextAreaImpl-omwVvnQ", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LQ1/K;Ljava/lang/String;Ljava/lang/String;LK1/b;ILq1/b;Lkotlin/jvm/functions/Function2;ZZZZLj1/r;LB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function1;JJJJJJJJJLK1/T;LK1/T;LK1/T;FFFLkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;JLandroidx/compose/ui/e;ZLjava/lang/Integer;Ll1/Z;Ll1/Z;LK1/T;ZIIFFFZFLS0/k;IIIIIIII)V", "FoundationTextAreaImpl", "Lu0/x;", "contentPadding", "placeholderMaxLines", "TextareaBody-qWYo42c", "(LQ1/K;Ljava/lang/String;Ljava/lang/String;ZZLj1/r;LQ1/X;Lt0/q;LB0/N0;LB0/M0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JJJJLK1/T;LK1/T;Lu0/x;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;JIIFZILS0/k;IIII)V", "TextareaBody", "isEmpty", "iconSize", "TrailingIcon-Gi_pv64", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZZJLq1/b;FZLS0/k;III)V", "TrailingIcon", "isNotEmpty", "SystemContent-WasTKPc", "(Landroidx/compose/ui/e;Lq1/b;Lkotlin/jvm/functions/Function2;ZZZJLq1/b;FZLS0/k;II)V", "SystemContent", "textFieldValue", "Counter-Y0xEhic", "(Landroidx/compose/ui/e;IJJLK1/T;LQ1/K;LS0/k;II)V", "Counter", "captionHeight", "F", "text", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationTextAreaKt {
    private static final float captionHeight = 20;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* renamed from: Counter-Y0xEhic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3028CounterY0xEhic(e eVar, int i11, long j11, long j12, T t2, K k11, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        e eVar2;
        int i14;
        long j13;
        long j14;
        T t11;
        K k12;
        C3422b i15;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-634391519);
        int i16 = i13 & 1;
        if (i16 != 0) {
            i14 = i12 | 6;
            eVar2 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i12;
        } else {
            eVar2 = eVar;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= u11.r(i11) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
            j13 = j11;
        } else {
            j13 = j11;
            if ((i12 & 384) == 0) {
                i14 |= u11.s(j13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
            j14 = j12;
        } else {
            j14 = j12;
            if ((i12 & 3072) == 0) {
                i14 |= u11.s(j14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i12 & 24576) == 0) {
            t11 = t2;
            i14 |= u11.n(t11) ? 16384 : 8192;
            if ((i13 & 32) == 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                k12 = k11;
                i14 |= u11.n(k12) ? 131072 : 65536;
                if ((74899 & i14) == 74898 || !u11.b()) {
                    if (i16 != 0) {
                        eVar2 = e.f40358c0;
                    }
                    if (k12.f().length() > i11) {
                        C3422b.a aVar = new C3422b.a();
                        int h11 = aVar.h(new D(j14, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, (i) null, (H0) null, 65534));
                        try {
                            aVar.e(String.valueOf(k12.f().length()));
                            Unit unit = Unit.f71690a;
                            aVar.f(h11);
                            h11 = aVar.h(new D(j13, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, 0L, (a) null, (m) null, (c) null, 0L, (i) null, (H0) null, 65534));
                            try {
                                aVar.e("/" + i11);
                                aVar.f(h11);
                                i15 = aVar.i();
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        C3422b.a aVar2 = new C3422b.a();
                        aVar2.e(k12.f().length() + "/" + i11);
                        i15 = aVar2.i();
                    }
                    c3969l = u11;
                    e eVar3 = eVar2;
                    u3.c(i15, eVar3, j11, 0L, 0L, null, 0L, 2, false, 0, 0, null, null, t11, c3969l, ((i14 << 3) & 112) | (i14 & 896), ((i14 << 9) & 29360128) | 48, 129016);
                    eVar2 = eVar3;
                } else {
                    u11.j();
                    c3969l = u11;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new FoundationTextAreaKt$Counter$1(eVar2, i11, j11, j12, t2, k12, i12, i13));
                    return;
                }
                return;
            }
            k12 = k11;
            if ((74899 & i14) == 74898) {
            }
            if (i16 != 0) {
            }
            if (k12.f().length() > i11) {
            }
            c3969l = u11;
            e eVar32 = eVar2;
            u3.c(i15, eVar32, j11, 0L, 0L, null, 0L, 2, false, 0, 0, null, null, t11, c3969l, ((i14 << 3) & 112) | (i14 & 896), ((i14 << 9) & 29360128) | 48, 129016);
            eVar2 = eVar32;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        t11 = t2;
        if ((i13 & 32) == 0) {
        }
        k12 = k11;
        if ((74899 & i14) == 74898) {
        }
        if (i16 != 0) {
        }
        if (k12.f().length() > i11) {
        }
        c3969l = u11;
        e eVar322 = eVar2;
        u3.c(i15, eVar322, j11, 0L, 0L, null, 0L, 2, false, 0, 0, null, null, t11, c3969l, ((i14 << 3) & 112) | (i14 & 896), ((i14 << 9) & 29360128) | 48, 129016);
        eVar2 = eVar322;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* renamed from: FoundationTextArea-63v6-zQ, reason: not valid java name */
    public static final void m3029FoundationTextArea63v6zQ(@NotNull e modifier, @NotNull Function1<? super K, Unit> onValueChange, @NotNull K value, @NotNull String label, String str, C3422b c3422b, int i11, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull r focusRequester, @NotNull N0 keyboardOptions, @NotNull M0 keyboardActions, @NotNull X visualTransformation, @NotNull q interactionSource, @NotNull Function1<? super Boolean, Unit> onFocusChanged, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @NotNull T labelTextStyle, @NotNull T valueTextStyle, @NotNull T captionTextStyle, float f7, float f11, float f12, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> clearButton, @NotNull e textFieldModifier, @NotNull e captionModifier, @NotNull e labelModifier, @NotNull e placeholderModifier, @NotNull e lockIconModifier, @NotNull e systemContentModifier, @NotNull e counterModifier, @NotNull AbstractC8972b lockIcon, long j21, boolean z15, boolean z16, boolean z17, int i12, long j22, long j23, @NotNull T counterTextStyle, int i13, int i14, float f13, float f14, float f15, float f16, InterfaceC3967k interfaceC3967k, int i15, int i16, int i17, int i18, int i19, int i21) {
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
        Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
        Intrinsics.checkNotNullParameter(captionTextStyle, "captionTextStyle");
        Intrinsics.checkNotNullParameter(clearButton, "clearButton");
        Intrinsics.checkNotNullParameter(textFieldModifier, "textFieldModifier");
        Intrinsics.checkNotNullParameter(captionModifier, "captionModifier");
        Intrinsics.checkNotNullParameter(labelModifier, "labelModifier");
        Intrinsics.checkNotNullParameter(placeholderModifier, "placeholderModifier");
        Intrinsics.checkNotNullParameter(lockIconModifier, "lockIconModifier");
        Intrinsics.checkNotNullParameter(systemContentModifier, "systemContentModifier");
        Intrinsics.checkNotNullParameter(counterModifier, "counterModifier");
        Intrinsics.checkNotNullParameter(lockIcon, "lockIcon");
        Intrinsics.checkNotNullParameter(counterTextStyle, "counterTextStyle");
        C3969l u11 = interfaceC3967k.u(-1855555272);
        if ((i15 & 6) == 0) {
            i22 = i15 | (u11.n(modifier) ? 4 : 2);
        } else {
            i22 = i15;
        }
        if ((i15 & 48) == 0) {
            i22 |= u11.F(onValueChange) ? 32 : 16;
        }
        int i28 = i15 & 384;
        int i29 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i28 == 0) {
            i22 |= u11.n(value) ? 256 : 128;
        }
        int i31 = i15 & 3072;
        int i32 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i31 == 0) {
            i22 |= u11.n(label) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i22 |= u11.n(str) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i22 |= u11.n(c3422b) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i22 |= u11.r(i11) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i22 |= u11.n(abstractC8972b) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i22 |= u11.F(function2) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i22 |= u11.p(z11) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i23 = i16 | (u11.p(z12) ? 4 : 2);
        } else {
            i23 = i16;
        }
        if ((i16 & 48) == 0) {
            i23 |= u11.p(z13) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i23 |= u11.p(z14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i23 |= u11.n(focusRequester) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i23 |= u11.n(keyboardOptions) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i23 |= u11.n(keyboardActions) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i23 |= u11.n(visualTransformation) ? 1048576 : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i23 |= u11.n(interactionSource) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i23 |= u11.F(onFocusChanged) ? 67108864 : 33554432;
        }
        if ((i16 & 805306368) == 0) {
            i23 |= u11.s(j11) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i24 = i17 | (u11.s(j12) ? 4 : 2);
        } else {
            i24 = i17;
        }
        if ((i17 & 48) == 0) {
            i24 |= u11.s(j13) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i24 |= u11.s(j14) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i24 |= u11.s(j15) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i24 |= u11.s(j16) ? 16384 : 8192;
        }
        if ((i17 & 196608) == 0) {
            i24 |= u11.s(j17) ? 131072 : 65536;
        }
        if ((i17 & 1572864) == 0) {
            i24 |= u11.s(j18) ? 1048576 : 524288;
        }
        if ((i17 & 12582912) == 0) {
            i24 |= u11.s(j19) ? 8388608 : 4194304;
        }
        if ((i17 & 100663296) == 0) {
            i24 |= u11.n(labelTextStyle) ? 67108864 : 33554432;
        }
        if ((i17 & 805306368) == 0) {
            i24 |= u11.n(valueTextStyle) ? 536870912 : 268435456;
        }
        if ((i18 & 6) == 0) {
            i25 = i18 | (u11.n(captionTextStyle) ? 4 : 2);
        } else {
            i25 = i18;
        }
        if ((i18 & 48) == 0) {
            i25 |= u11.q(f7) ? 32 : 16;
        }
        if ((i18 & 384) == 0) {
            i25 |= u11.q(f11) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            i25 |= u11.q(f12) ? 2048 : 1024;
        }
        if ((i18 & 24576) == 0) {
            i25 |= u11.F(clearButton) ? 16384 : 8192;
        }
        if ((i18 & 196608) == 0) {
            i25 |= u11.n(textFieldModifier) ? 131072 : 65536;
        }
        if ((i18 & 1572864) == 0) {
            i25 |= u11.n(captionModifier) ? 1048576 : 524288;
        }
        if ((i18 & 12582912) == 0) {
            i25 |= u11.n(labelModifier) ? 8388608 : 4194304;
        }
        if ((i18 & 100663296) == 0) {
            i25 |= u11.n(placeholderModifier) ? 67108864 : 33554432;
        }
        if ((i18 & 805306368) == 0) {
            i25 |= u11.n(lockIconModifier) ? 536870912 : 268435456;
        }
        if ((i19 & 6) == 0) {
            i26 = i19 | (u11.n(systemContentModifier) ? 4 : 2);
        } else {
            i26 = i19;
        }
        if ((i19 & 48) == 0) {
            i26 |= u11.n(counterModifier) ? 32 : 16;
        }
        if ((i19 & 384) == 0) {
            i26 |= u11.n(lockIcon) ? 256 : 128;
        }
        if ((i19 & 3072) == 0) {
            i26 |= u11.s(j21) ? 2048 : 1024;
        }
        if ((i19 & 24576) == 0) {
            i26 |= u11.p(z15) ? 16384 : 8192;
        }
        if ((i19 & 196608) == 0) {
            i26 |= u11.p(z16) ? 131072 : 65536;
        }
        if ((i19 & 1572864) == 0) {
            i26 |= u11.p(z17) ? 1048576 : 524288;
        }
        if ((i19 & 12582912) == 0) {
            i26 |= u11.r(i12) ? 8388608 : 4194304;
        }
        if ((i19 & 100663296) == 0) {
            i26 |= u11.s(j22) ? 67108864 : 33554432;
        }
        if ((i19 & 805306368) == 0) {
            i26 |= u11.s(j23) ? 536870912 : 268435456;
        }
        if ((i21 & 6) == 0) {
            i27 = i21 | (u11.n(counterTextStyle) ? 4 : 2);
        } else {
            i27 = i21;
        }
        if ((i21 & 48) == 0) {
            i27 |= u11.r(i13) ? 32 : 16;
        }
        if ((i21 & 384) == 0) {
            if (u11.r(i14)) {
                i29 = 256;
            }
            i27 |= i29;
        }
        if ((i21 & 3072) == 0) {
            if (u11.q(f13)) {
                i32 = 2048;
            }
            i27 |= i32;
        }
        if ((i21 & 24576) == 0) {
            i27 |= u11.q(f14) ? 16384 : 8192;
        }
        if ((i21 & 196608) == 0) {
            i27 |= u11.q(f15) ? 131072 : 65536;
        }
        if ((i21 & 1572864) == 0) {
            i27 |= u11.q(f16) ? 1048576 : 524288;
        }
        int i33 = i27;
        if ((i22 & 306783379) == 306783378 && (i23 & 306783379) == 306783378 && (i24 & 306783379) == 306783378 && (i25 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (599187 & i33) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            int i34 = i26 >> 3;
            int i35 = i26 >> 6;
            int i36 = i33 >> 3;
            c3969l = u11;
            m3030FoundationTextAreaImplomwVvnQ(modifier, onValueChange, value, label, str, c3422b, i11, abstractC8972b, function2, z11, z12, z13, z14, focusRequester, keyboardOptions, keyboardActions, visualTransformation, interactionSource, onFocusChanged, j11, j12, j13, j14, j15, j16, j17, j18, j19, labelTextStyle, valueTextStyle, captionTextStyle, f7, f11, f12, clearButton, textFieldModifier, captionModifier, labelModifier, placeholderModifier, lockIconModifier, systemContentModifier, lockIcon, j21, counterModifier, z15, Integer.valueOf(i12), C7807Z.m(j22), C7807Z.m(j23), counterTextStyle, z16, i13, i14, f14, f13, f15, z17, f16, c3969l, i22 & 2147483646, i23 & 2147483646, i24 & 2147483646, i25 & 2147483646, (i26 & 14) | (i34 & 112) | (i34 & 896) | ((i26 << 6) & 7168) | (i26 & 57344) | (i35 & 458752) | (i35 & 3670016) | (i35 & 29360128) | ((i33 << 24) & 234881024) | ((i26 << 12) & 1879048192), (i36 & 126) | ((i33 >> 6) & 896) | (i33 & 7168) | (i36 & 57344) | (i34 & 458752) | (i33 & 3670016), 0, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new FoundationTextAreaKt$FoundationTextArea$1(modifier, onValueChange, value, label, str, c3422b, i11, abstractC8972b, function2, z11, z12, z13, z14, focusRequester, keyboardOptions, keyboardActions, visualTransformation, interactionSource, onFocusChanged, j11, j12, j13, j14, j15, j16, j17, j18, j19, labelTextStyle, valueTextStyle, captionTextStyle, f7, f11, f12, clearButton, textFieldModifier, captionModifier, labelModifier, placeholderModifier, lockIconModifier, systemContentModifier, counterModifier, lockIcon, j21, z15, z16, z17, i12, j22, j23, counterTextStyle, i13, i14, f13, f14, f15, f16, i15, i16, i17, i18, i19, i21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037a  */
    /* renamed from: FoundationTextAreaImpl-omwVvnQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3030FoundationTextAreaImplomwVvnQ(e eVar, Function1<? super K, Unit> function1, K k11, String str, String str2, C3422b c3422b, int i11, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, boolean z12, boolean z13, boolean z14, r rVar, N0 n02, M0 m02, X x11, q qVar, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, T t2, T t11, T t12, float f7, float f11, float f12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6, e eVar7, AbstractC8972b abstractC8972b2, long j21, e eVar8, boolean z15, Integer num, C7807Z c7807z, C7807Z c7807z2, T t13, boolean z16, int i12, int i13, float f13, float f14, float f15, boolean z17, float f16, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
        int i23;
        String str3;
        int i24;
        int i25;
        boolean z18;
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
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        float f17;
        float f18;
        K k12;
        C3969l c3969l;
        float f19;
        float f21;
        float f22;
        boolean z19;
        float f23;
        boolean z21;
        Integer num2;
        C7807Z c7807z3;
        C7807Z c7807z4;
        T t14;
        e eVar9;
        boolean z22;
        int i61;
        int i62;
        J0 m03;
        C3969l u11 = interfaceC3967k.u(1652291548);
        if ((i21 & 1) != 0) {
            i23 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i23 = i14 | (u11.n(eVar) ? 4 : 2);
        } else {
            i23 = i14;
        }
        if ((i21 & 2) != 0) {
            i23 |= 48;
        } else if ((i14 & 48) == 0) {
            i23 |= u11.F(function1) ? 32 : 16;
        }
        int i63 = i23;
        int i64 = i21 & 4;
        int i65 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i64 != 0) {
            i63 |= 384;
        } else if ((i14 & 384) == 0) {
            i63 |= u11.n(k11) ? 256 : 128;
        }
        int i66 = i21 & 8;
        int i67 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i66 != 0) {
            i63 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i63 |= u11.n(str) ? 2048 : 1024;
            if ((i21 & 16) == 0) {
                i63 |= 24576;
            } else if ((i14 & 24576) == 0) {
                str3 = str2;
                i63 |= u11.n(str3) ? 16384 : 8192;
                if ((i21 & 32) != 0) {
                    i63 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i63 |= u11.n(c3422b) ? 131072 : 65536;
                }
                if ((i21 & 64) != 0) {
                    i63 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    i63 |= u11.r(i11) ? 1048576 : 524288;
                }
                if ((i21 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    i63 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    i63 |= u11.n(abstractC8972b) ? 8388608 : 4194304;
                    if ((i21 & 256) == 0) {
                        i63 |= 100663296;
                    } else if ((i14 & 100663296) == 0) {
                        i63 |= u11.F(function2) ? 67108864 : 33554432;
                        if ((i21 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            i63 |= 805306368;
                        } else if ((i14 & 805306368) == 0) {
                            i63 |= u11.p(z11) ? 536870912 : 268435456;
                        }
                        i24 = i63;
                        if ((i21 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            i25 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            i25 = (u11.p(z12) ? 4 : 2) | i15;
                        } else {
                            i25 = i15;
                        }
                        if ((i21 & 2048) != 0) {
                            i25 |= 48;
                        } else if ((i15 & 48) == 0) {
                            z18 = z13;
                            i25 |= u11.p(z18) ? 32 : 16;
                            if ((i21 & 4096) == 0) {
                                i25 |= 384;
                            } else if ((i15 & 384) == 0) {
                                i25 |= u11.p(z14) ? 256 : 128;
                            }
                            if ((i21 & 8192) == 0) {
                                i25 |= 3072;
                            } else if ((i15 & 3072) == 0) {
                                i25 |= u11.n(rVar) ? 2048 : 1024;
                                if ((i21 & 16384) != 0) {
                                    i25 |= 24576;
                                } else if ((i15 & 24576) == 0) {
                                    i25 |= u11.n(n02) ? 16384 : 8192;
                                    if ((i21 & 32768) == 0) {
                                        i25 |= 196608;
                                    } else if ((i15 & 196608) == 0) {
                                        i25 |= u11.n(m02) ? 131072 : 65536;
                                    }
                                    if ((i21 & 65536) == 0) {
                                        i25 |= 1572864;
                                    } else if ((i15 & 1572864) == 0) {
                                        i25 |= u11.n(x11) ? 1048576 : 524288;
                                    }
                                    if ((i21 & 131072) == 0) {
                                        i25 |= 12582912;
                                    } else if ((i15 & 12582912) == 0) {
                                        i25 |= u11.n(qVar) ? 8388608 : 4194304;
                                    }
                                    if ((i21 & 262144) == 0) {
                                        i25 |= 100663296;
                                    } else if ((i15 & 100663296) == 0) {
                                        i25 |= u11.F(function12) ? 67108864 : 33554432;
                                    }
                                    if ((i21 & 524288) == 0) {
                                        i25 |= 805306368;
                                    } else if ((i15 & 805306368) == 0) {
                                        i25 |= u11.s(j11) ? 536870912 : 268435456;
                                    }
                                    if ((i21 & 1048576) == 0) {
                                        i26 = i16 | 6;
                                    } else if ((i16 & 6) == 0) {
                                        i26 = i16 | (u11.s(j12) ? 4 : 2);
                                    } else {
                                        i26 = i16;
                                    }
                                    if ((i21 & 2097152) == 0) {
                                        i26 |= 48;
                                    } else if ((i16 & 48) == 0) {
                                        i26 |= u11.s(j13) ? 32 : 16;
                                    }
                                    int i68 = i26;
                                    if ((i21 & 4194304) == 0) {
                                        i27 = i68 | 384;
                                    } else {
                                        int i69 = i68;
                                        if ((i16 & 384) == 0) {
                                            i69 |= u11.s(j14) ? 256 : 128;
                                        }
                                        i27 = i69;
                                    }
                                    if ((i21 & 8388608) == 0) {
                                        i28 = i27 | 3072;
                                    } else {
                                        int i71 = i27;
                                        if ((i16 & 3072) == 0) {
                                            i71 |= u11.s(j15) ? 2048 : 1024;
                                        }
                                        i28 = i71;
                                    }
                                    if ((16777216 & i21) == 0) {
                                        i29 = i28 | 24576;
                                    } else {
                                        i29 = i28;
                                        if ((i16 & 24576) == 0) {
                                            i29 |= u11.s(j16) ? 16384 : 8192;
                                            if ((i21 & 33554432) != 0) {
                                                i29 |= 196608;
                                            } else if ((i16 & 196608) == 0) {
                                                i29 |= u11.s(j17) ? 131072 : 65536;
                                            }
                                            if ((i21 & 67108864) != 0) {
                                                i29 |= 1572864;
                                            } else if ((i16 & 1572864) == 0) {
                                                i29 |= u11.s(j18) ? 1048576 : 524288;
                                            }
                                            if ((i21 & 134217728) != 0) {
                                                i29 |= 12582912;
                                            } else if ((i16 & 12582912) == 0) {
                                                i29 |= u11.s(j19) ? 8388608 : 4194304;
                                            }
                                            if ((i21 & 268435456) != 0) {
                                                i29 |= 100663296;
                                            } else if ((i16 & 100663296) == 0) {
                                                i29 |= u11.n(t2) ? 67108864 : 33554432;
                                            }
                                            if ((i21 & 536870912) != 0) {
                                                i29 |= 805306368;
                                            } else if ((i16 & 805306368) == 0) {
                                                i29 |= u11.n(t11) ? 536870912 : 268435456;
                                                if ((i21 & 1073741824) == 0) {
                                                    i31 = i17 | 6;
                                                } else if ((i17 & 6) == 0) {
                                                    i31 = i17 | (u11.n(t12) ? 4 : 2);
                                                } else {
                                                    i31 = i17;
                                                }
                                                if ((i22 & 1) == 0) {
                                                    i31 |= 48;
                                                } else if ((i17 & 48) == 0) {
                                                    i31 |= u11.q(f7) ? 32 : 16;
                                                }
                                                int i72 = i31;
                                                if ((i22 & 2) == 0) {
                                                    i32 = i72 | 384;
                                                } else {
                                                    int i73 = i72;
                                                    if ((i17 & 384) == 0) {
                                                        i73 |= u11.q(f11) ? 256 : 128;
                                                    }
                                                    i32 = i73;
                                                }
                                                if ((i22 & 4) == 0) {
                                                    i33 = i32 | 3072;
                                                } else {
                                                    int i74 = i32;
                                                    if ((i17 & 3072) == 0) {
                                                        i74 |= u11.q(f12) ? 2048 : 1024;
                                                    }
                                                    i33 = i74;
                                                }
                                                if ((i22 & 8) == 0) {
                                                    i34 = i33 | 24576;
                                                } else {
                                                    i34 = i33;
                                                    if ((i17 & 24576) == 0) {
                                                        i34 |= u11.F(function22) ? 16384 : 8192;
                                                        if ((i22 & 16) != 0) {
                                                            i34 |= 196608;
                                                        } else if ((i17 & 196608) == 0) {
                                                            i34 |= u11.n(eVar2) ? 131072 : 65536;
                                                        }
                                                        if ((i22 & 32) != 0) {
                                                            i34 |= 1572864;
                                                        } else if ((i17 & 1572864) == 0) {
                                                            i34 |= u11.n(eVar3) ? 1048576 : 524288;
                                                        }
                                                        if ((i22 & 64) != 0) {
                                                            i34 |= 12582912;
                                                        } else if ((i17 & 12582912) == 0) {
                                                            i34 |= u11.n(eVar4) ? 8388608 : 4194304;
                                                        }
                                                        if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                            i34 |= 100663296;
                                                        } else if ((i17 & 100663296) == 0) {
                                                            i34 |= u11.n(eVar5) ? 67108864 : 33554432;
                                                            if ((i22 & 256) == 0) {
                                                                i34 |= 805306368;
                                                            } else if ((i17 & 805306368) == 0) {
                                                                i34 |= u11.n(eVar6) ? 536870912 : 268435456;
                                                                if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                                                    i35 = i18 | 6;
                                                                } else if ((i18 & 6) == 0) {
                                                                    i35 = i18 | (u11.n(eVar7) ? 4 : 2);
                                                                } else {
                                                                    i35 = i18;
                                                                }
                                                                if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                                    i35 |= 48;
                                                                } else if ((i18 & 48) == 0) {
                                                                    i35 |= u11.n(abstractC8972b2) ? 32 : 16;
                                                                }
                                                                int i75 = i35;
                                                                if ((i22 & 2048) != 0) {
                                                                    i36 = i75 | 384;
                                                                } else {
                                                                    int i76 = i75;
                                                                    if ((i18 & 384) == 0) {
                                                                        i76 |= u11.s(j21) ? 256 : 128;
                                                                    }
                                                                    i36 = i76;
                                                                }
                                                                i37 = i22 & 4096;
                                                                if (i37 != 0) {
                                                                    i38 = i36 | 3072;
                                                                } else {
                                                                    int i77 = i36;
                                                                    if ((i18 & 3072) == 0) {
                                                                        i77 |= u11.n(eVar8) ? 2048 : 1024;
                                                                    }
                                                                    i38 = i77;
                                                                }
                                                                i39 = i22 & 8192;
                                                                if (i39 != 0) {
                                                                    i41 = i38 | 24576;
                                                                } else {
                                                                    i41 = i38;
                                                                    if ((i18 & 24576) == 0) {
                                                                        i41 |= u11.p(z15) ? 16384 : 8192;
                                                                        i42 = i22 & 16384;
                                                                        if (i42 == 0) {
                                                                            i41 |= 196608;
                                                                        } else if ((i18 & 196608) == 0) {
                                                                            i43 = i42;
                                                                            i41 |= u11.n(num) ? 131072 : 65536;
                                                                            i44 = i22 & 32768;
                                                                            if (i44 != 0) {
                                                                                i41 |= 1572864;
                                                                            } else if ((i18 & 1572864) == 0) {
                                                                                i41 |= u11.n(c7807z) ? 1048576 : 524288;
                                                                            }
                                                                            i45 = i22 & 65536;
                                                                            if (i45 != 0) {
                                                                                i41 |= 12582912;
                                                                            } else if ((i18 & 12582912) == 0) {
                                                                                i41 |= u11.n(c7807z2) ? 8388608 : 4194304;
                                                                            }
                                                                            i46 = i22 & 131072;
                                                                            if (i46 != 0) {
                                                                                i41 |= 100663296;
                                                                            } else if ((i18 & 100663296) == 0) {
                                                                                i41 |= u11.n(t13) ? 67108864 : 33554432;
                                                                            }
                                                                            i47 = i22 & 262144;
                                                                            if (i47 != 0) {
                                                                                i41 |= 805306368;
                                                                            } else if ((i18 & 805306368) == 0) {
                                                                                i41 |= u11.p(z16) ? 536870912 : 268435456;
                                                                            }
                                                                            i48 = i22 & 524288;
                                                                            if (i48 != 0) {
                                                                                i49 = i19 | 6;
                                                                            } else if ((i19 & 6) == 0) {
                                                                                i49 = i19 | (u11.r(i12) ? 4 : 2);
                                                                            } else {
                                                                                i49 = i19;
                                                                            }
                                                                            i51 = i22 & 1048576;
                                                                            if (i51 != 0) {
                                                                                i49 |= 48;
                                                                            } else if ((i19 & 48) == 0) {
                                                                                i49 |= u11.r(i13) ? 32 : 16;
                                                                            }
                                                                            int i78 = i49;
                                                                            i52 = i22 & 2097152;
                                                                            if (i52 != 0) {
                                                                                i53 = i78 | 384;
                                                                            } else {
                                                                                int i79 = i78;
                                                                                if ((i19 & 384) == 0) {
                                                                                    if (u11.q(f13)) {
                                                                                        i65 = 256;
                                                                                    }
                                                                                    i79 |= i65;
                                                                                }
                                                                                i53 = i79;
                                                                            }
                                                                            i54 = i22 & 4194304;
                                                                            if (i54 != 0) {
                                                                                i55 = i53 | 3072;
                                                                            } else {
                                                                                int i81 = i53;
                                                                                if ((i19 & 3072) == 0) {
                                                                                    if (u11.q(f14)) {
                                                                                        i67 = 2048;
                                                                                    }
                                                                                    i55 = i81 | i67;
                                                                                } else {
                                                                                    i55 = i81;
                                                                                }
                                                                            }
                                                                            i56 = i22 & 8388608;
                                                                            if (i56 != 0) {
                                                                                i57 = i55 | 24576;
                                                                            } else {
                                                                                i57 = i55;
                                                                                if ((i19 & 24576) == 0) {
                                                                                    i57 |= u11.q(f15) ? 16384 : 8192;
                                                                                    i58 = i22 & 16777216;
                                                                                    if (i58 == 0) {
                                                                                        i57 |= 196608;
                                                                                    } else if ((i19 & 196608) == 0) {
                                                                                        i57 |= u11.p(z17) ? 131072 : 65536;
                                                                                    }
                                                                                    i59 = i22 & 33554432;
                                                                                    if (i59 == 0) {
                                                                                        i57 |= 1572864;
                                                                                    } else if ((i19 & 1572864) == 0) {
                                                                                        i57 |= u11.q(f16) ? 1048576 : 524288;
                                                                                    }
                                                                                    if ((i24 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i29 & 306783379) == 306783378 && (i34 & 306783379) == 306783378 && (i41 & 306783379) == 306783378 && (i57 & 599187) == 599186 && u11.b()) {
                                                                                        u11.j();
                                                                                        eVar9 = eVar8;
                                                                                        z21 = z15;
                                                                                        num2 = num;
                                                                                        c7807z3 = c7807z;
                                                                                        c7807z4 = c7807z2;
                                                                                        t14 = t13;
                                                                                        z22 = z16;
                                                                                        i61 = i12;
                                                                                        i62 = i13;
                                                                                        f23 = f13;
                                                                                        f21 = f14;
                                                                                        f22 = f15;
                                                                                        z19 = z17;
                                                                                        f19 = f16;
                                                                                        c3969l = u11;
                                                                                    } else {
                                                                                        e eVar10 = i37 == 0 ? e.f40358c0 : eVar8;
                                                                                        boolean z23 = i39 == 0 ? false : z15;
                                                                                        Integer num3 = i43 == 0 ? null : num;
                                                                                        C7807Z c7807z5 = i44 == 0 ? null : c7807z;
                                                                                        C7807Z c7807z6 = i45 == 0 ? null : c7807z2;
                                                                                        T t15 = i46 == 0 ? null : t13;
                                                                                        boolean z24 = i47 == 0 ? true : z16;
                                                                                        int i82 = i48 == 0 ? 1 : i12;
                                                                                        int i83 = i51 == 0 ? Integer.MAX_VALUE : i13;
                                                                                        float f24 = i52 == 0 ? 44 : f13;
                                                                                        float f25 = i54 == 0 ? 9 : f14;
                                                                                        float f26 = i56 == 0 ? 8 : f15;
                                                                                        boolean z25 = i58 == 0 ? false : z17;
                                                                                        float f27 = i59 == 0 ? 12 : f16;
                                                                                        if (z14) {
                                                                                            f17 = f27;
                                                                                            f18 = f25;
                                                                                            k12 = K.a(k11, null, S.a(0, 0), 5);
                                                                                        } else {
                                                                                            f17 = f27;
                                                                                            f18 = f25;
                                                                                            k12 = k11;
                                                                                        }
                                                                                        float f28 = f17;
                                                                                        boolean z26 = z24;
                                                                                        C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f28, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z26, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                                                                        c3969l = u11;
                                                                                        f19 = f28;
                                                                                        f21 = f18;
                                                                                        f22 = f26;
                                                                                        z19 = z25;
                                                                                        f23 = f24;
                                                                                        z21 = z23;
                                                                                        num2 = num3;
                                                                                        c7807z3 = c7807z5;
                                                                                        c7807z4 = c7807z6;
                                                                                        t14 = t15;
                                                                                        eVar9 = eVar10;
                                                                                        z22 = z26;
                                                                                        i61 = i82;
                                                                                        i62 = i83;
                                                                                    }
                                                                                    m03 = c3969l.m0();
                                                                                    if (m03 == null) {
                                                                                        m03.G(new FoundationTextAreaKt$FoundationTextAreaImpl$2(eVar, function1, k11, str, str2, c3422b, i11, abstractC8972b, function2, z11, z12, z13, z14, rVar, n02, m02, x11, qVar, function12, j11, j12, j13, j14, j15, j16, j17, j18, j19, t2, t11, t12, f7, f11, f12, function22, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, abstractC8972b2, j21, eVar9, z21, num2, c7807z3, c7807z4, t14, z22, i61, i62, f23, f21, f22, z19, f19, i14, i15, i16, i17, i18, i19, i21, i22));
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                            }
                                                                            i58 = i22 & 16777216;
                                                                            if (i58 == 0) {
                                                                            }
                                                                            i59 = i22 & 33554432;
                                                                            if (i59 == 0) {
                                                                            }
                                                                            if ((i24 & 306783379) != 306783378) {
                                                                            }
                                                                            if (i37 == 0) {
                                                                            }
                                                                            if (i39 == 0) {
                                                                            }
                                                                            if (i43 == 0) {
                                                                            }
                                                                            if (i44 == 0) {
                                                                            }
                                                                            if (i45 == 0) {
                                                                            }
                                                                            if (i46 == 0) {
                                                                            }
                                                                            if (i47 == 0) {
                                                                            }
                                                                            if (i48 == 0) {
                                                                            }
                                                                            if (i51 == 0) {
                                                                            }
                                                                            if (i52 == 0) {
                                                                            }
                                                                            if (i54 == 0) {
                                                                            }
                                                                            if (i56 == 0) {
                                                                            }
                                                                            if (i58 == 0) {
                                                                            }
                                                                            if (i59 == 0) {
                                                                            }
                                                                            if (z14) {
                                                                            }
                                                                            float f282 = f17;
                                                                            boolean z262 = z24;
                                                                            C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f282, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z262, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                                                            c3969l = u11;
                                                                            f19 = f282;
                                                                            f21 = f18;
                                                                            f22 = f26;
                                                                            z19 = z25;
                                                                            f23 = f24;
                                                                            z21 = z23;
                                                                            num2 = num3;
                                                                            c7807z3 = c7807z5;
                                                                            c7807z4 = c7807z6;
                                                                            t14 = t15;
                                                                            eVar9 = eVar10;
                                                                            z22 = z262;
                                                                            i61 = i82;
                                                                            i62 = i83;
                                                                            m03 = c3969l.m0();
                                                                            if (m03 == null) {
                                                                            }
                                                                        }
                                                                        i43 = i42;
                                                                        i44 = i22 & 32768;
                                                                        if (i44 != 0) {
                                                                        }
                                                                        i45 = i22 & 65536;
                                                                        if (i45 != 0) {
                                                                        }
                                                                        i46 = i22 & 131072;
                                                                        if (i46 != 0) {
                                                                        }
                                                                        i47 = i22 & 262144;
                                                                        if (i47 != 0) {
                                                                        }
                                                                        i48 = i22 & 524288;
                                                                        if (i48 != 0) {
                                                                        }
                                                                        i51 = i22 & 1048576;
                                                                        if (i51 != 0) {
                                                                        }
                                                                        int i782 = i49;
                                                                        i52 = i22 & 2097152;
                                                                        if (i52 != 0) {
                                                                        }
                                                                        i54 = i22 & 4194304;
                                                                        if (i54 != 0) {
                                                                        }
                                                                        i56 = i22 & 8388608;
                                                                        if (i56 != 0) {
                                                                        }
                                                                        i58 = i22 & 16777216;
                                                                        if (i58 == 0) {
                                                                        }
                                                                        i59 = i22 & 33554432;
                                                                        if (i59 == 0) {
                                                                        }
                                                                        if ((i24 & 306783379) != 306783378) {
                                                                        }
                                                                        if (i37 == 0) {
                                                                        }
                                                                        if (i39 == 0) {
                                                                        }
                                                                        if (i43 == 0) {
                                                                        }
                                                                        if (i44 == 0) {
                                                                        }
                                                                        if (i45 == 0) {
                                                                        }
                                                                        if (i46 == 0) {
                                                                        }
                                                                        if (i47 == 0) {
                                                                        }
                                                                        if (i48 == 0) {
                                                                        }
                                                                        if (i51 == 0) {
                                                                        }
                                                                        if (i52 == 0) {
                                                                        }
                                                                        if (i54 == 0) {
                                                                        }
                                                                        if (i56 == 0) {
                                                                        }
                                                                        if (i58 == 0) {
                                                                        }
                                                                        if (i59 == 0) {
                                                                        }
                                                                        if (z14) {
                                                                        }
                                                                        float f2822 = f17;
                                                                        boolean z2622 = z24;
                                                                        C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f2822, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z2622, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                                                        c3969l = u11;
                                                                        f19 = f2822;
                                                                        f21 = f18;
                                                                        f22 = f26;
                                                                        z19 = z25;
                                                                        f23 = f24;
                                                                        z21 = z23;
                                                                        num2 = num3;
                                                                        c7807z3 = c7807z5;
                                                                        c7807z4 = c7807z6;
                                                                        t14 = t15;
                                                                        eVar9 = eVar10;
                                                                        z22 = z2622;
                                                                        i61 = i82;
                                                                        i62 = i83;
                                                                        m03 = c3969l.m0();
                                                                        if (m03 == null) {
                                                                        }
                                                                    }
                                                                }
                                                                i42 = i22 & 16384;
                                                                if (i42 == 0) {
                                                                }
                                                                i43 = i42;
                                                                i44 = i22 & 32768;
                                                                if (i44 != 0) {
                                                                }
                                                                i45 = i22 & 65536;
                                                                if (i45 != 0) {
                                                                }
                                                                i46 = i22 & 131072;
                                                                if (i46 != 0) {
                                                                }
                                                                i47 = i22 & 262144;
                                                                if (i47 != 0) {
                                                                }
                                                                i48 = i22 & 524288;
                                                                if (i48 != 0) {
                                                                }
                                                                i51 = i22 & 1048576;
                                                                if (i51 != 0) {
                                                                }
                                                                int i7822 = i49;
                                                                i52 = i22 & 2097152;
                                                                if (i52 != 0) {
                                                                }
                                                                i54 = i22 & 4194304;
                                                                if (i54 != 0) {
                                                                }
                                                                i56 = i22 & 8388608;
                                                                if (i56 != 0) {
                                                                }
                                                                i58 = i22 & 16777216;
                                                                if (i58 == 0) {
                                                                }
                                                                i59 = i22 & 33554432;
                                                                if (i59 == 0) {
                                                                }
                                                                if ((i24 & 306783379) != 306783378) {
                                                                }
                                                                if (i37 == 0) {
                                                                }
                                                                if (i39 == 0) {
                                                                }
                                                                if (i43 == 0) {
                                                                }
                                                                if (i44 == 0) {
                                                                }
                                                                if (i45 == 0) {
                                                                }
                                                                if (i46 == 0) {
                                                                }
                                                                if (i47 == 0) {
                                                                }
                                                                if (i48 == 0) {
                                                                }
                                                                if (i51 == 0) {
                                                                }
                                                                if (i52 == 0) {
                                                                }
                                                                if (i54 == 0) {
                                                                }
                                                                if (i56 == 0) {
                                                                }
                                                                if (i58 == 0) {
                                                                }
                                                                if (i59 == 0) {
                                                                }
                                                                if (z14) {
                                                                }
                                                                float f28222 = f17;
                                                                boolean z26222 = z24;
                                                                C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f28222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z26222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                                                c3969l = u11;
                                                                f19 = f28222;
                                                                f21 = f18;
                                                                f22 = f26;
                                                                z19 = z25;
                                                                f23 = f24;
                                                                z21 = z23;
                                                                num2 = num3;
                                                                c7807z3 = c7807z5;
                                                                c7807z4 = c7807z6;
                                                                t14 = t15;
                                                                eVar9 = eVar10;
                                                                z22 = z26222;
                                                                i61 = i82;
                                                                i62 = i83;
                                                                m03 = c3969l.m0();
                                                                if (m03 == null) {
                                                                }
                                                            }
                                                            if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                                            }
                                                            if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                            }
                                                            int i752 = i35;
                                                            if ((i22 & 2048) != 0) {
                                                            }
                                                            i37 = i22 & 4096;
                                                            if (i37 != 0) {
                                                            }
                                                            i39 = i22 & 8192;
                                                            if (i39 != 0) {
                                                            }
                                                            i42 = i22 & 16384;
                                                            if (i42 == 0) {
                                                            }
                                                            i43 = i42;
                                                            i44 = i22 & 32768;
                                                            if (i44 != 0) {
                                                            }
                                                            i45 = i22 & 65536;
                                                            if (i45 != 0) {
                                                            }
                                                            i46 = i22 & 131072;
                                                            if (i46 != 0) {
                                                            }
                                                            i47 = i22 & 262144;
                                                            if (i47 != 0) {
                                                            }
                                                            i48 = i22 & 524288;
                                                            if (i48 != 0) {
                                                            }
                                                            i51 = i22 & 1048576;
                                                            if (i51 != 0) {
                                                            }
                                                            int i78222 = i49;
                                                            i52 = i22 & 2097152;
                                                            if (i52 != 0) {
                                                            }
                                                            i54 = i22 & 4194304;
                                                            if (i54 != 0) {
                                                            }
                                                            i56 = i22 & 8388608;
                                                            if (i56 != 0) {
                                                            }
                                                            i58 = i22 & 16777216;
                                                            if (i58 == 0) {
                                                            }
                                                            i59 = i22 & 33554432;
                                                            if (i59 == 0) {
                                                            }
                                                            if ((i24 & 306783379) != 306783378) {
                                                            }
                                                            if (i37 == 0) {
                                                            }
                                                            if (i39 == 0) {
                                                            }
                                                            if (i43 == 0) {
                                                            }
                                                            if (i44 == 0) {
                                                            }
                                                            if (i45 == 0) {
                                                            }
                                                            if (i46 == 0) {
                                                            }
                                                            if (i47 == 0) {
                                                            }
                                                            if (i48 == 0) {
                                                            }
                                                            if (i51 == 0) {
                                                            }
                                                            if (i52 == 0) {
                                                            }
                                                            if (i54 == 0) {
                                                            }
                                                            if (i56 == 0) {
                                                            }
                                                            if (i58 == 0) {
                                                            }
                                                            if (i59 == 0) {
                                                            }
                                                            if (z14) {
                                                            }
                                                            float f282222 = f17;
                                                            boolean z262222 = z24;
                                                            C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f282222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z262222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                                            c3969l = u11;
                                                            f19 = f282222;
                                                            f21 = f18;
                                                            f22 = f26;
                                                            z19 = z25;
                                                            f23 = f24;
                                                            z21 = z23;
                                                            num2 = num3;
                                                            c7807z3 = c7807z5;
                                                            c7807z4 = c7807z6;
                                                            t14 = t15;
                                                            eVar9 = eVar10;
                                                            z22 = z262222;
                                                            i61 = i82;
                                                            i62 = i83;
                                                            m03 = c3969l.m0();
                                                            if (m03 == null) {
                                                            }
                                                        }
                                                        if ((i22 & 256) == 0) {
                                                        }
                                                        if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                                        }
                                                        if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                        }
                                                        int i7522 = i35;
                                                        if ((i22 & 2048) != 0) {
                                                        }
                                                        i37 = i22 & 4096;
                                                        if (i37 != 0) {
                                                        }
                                                        i39 = i22 & 8192;
                                                        if (i39 != 0) {
                                                        }
                                                        i42 = i22 & 16384;
                                                        if (i42 == 0) {
                                                        }
                                                        i43 = i42;
                                                        i44 = i22 & 32768;
                                                        if (i44 != 0) {
                                                        }
                                                        i45 = i22 & 65536;
                                                        if (i45 != 0) {
                                                        }
                                                        i46 = i22 & 131072;
                                                        if (i46 != 0) {
                                                        }
                                                        i47 = i22 & 262144;
                                                        if (i47 != 0) {
                                                        }
                                                        i48 = i22 & 524288;
                                                        if (i48 != 0) {
                                                        }
                                                        i51 = i22 & 1048576;
                                                        if (i51 != 0) {
                                                        }
                                                        int i782222 = i49;
                                                        i52 = i22 & 2097152;
                                                        if (i52 != 0) {
                                                        }
                                                        i54 = i22 & 4194304;
                                                        if (i54 != 0) {
                                                        }
                                                        i56 = i22 & 8388608;
                                                        if (i56 != 0) {
                                                        }
                                                        i58 = i22 & 16777216;
                                                        if (i58 == 0) {
                                                        }
                                                        i59 = i22 & 33554432;
                                                        if (i59 == 0) {
                                                        }
                                                        if ((i24 & 306783379) != 306783378) {
                                                        }
                                                        if (i37 == 0) {
                                                        }
                                                        if (i39 == 0) {
                                                        }
                                                        if (i43 == 0) {
                                                        }
                                                        if (i44 == 0) {
                                                        }
                                                        if (i45 == 0) {
                                                        }
                                                        if (i46 == 0) {
                                                        }
                                                        if (i47 == 0) {
                                                        }
                                                        if (i48 == 0) {
                                                        }
                                                        if (i51 == 0) {
                                                        }
                                                        if (i52 == 0) {
                                                        }
                                                        if (i54 == 0) {
                                                        }
                                                        if (i56 == 0) {
                                                        }
                                                        if (i58 == 0) {
                                                        }
                                                        if (i59 == 0) {
                                                        }
                                                        if (z14) {
                                                        }
                                                        float f2822222 = f17;
                                                        boolean z2622222 = z24;
                                                        C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f2822222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z2622222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                                        c3969l = u11;
                                                        f19 = f2822222;
                                                        f21 = f18;
                                                        f22 = f26;
                                                        z19 = z25;
                                                        f23 = f24;
                                                        z21 = z23;
                                                        num2 = num3;
                                                        c7807z3 = c7807z5;
                                                        c7807z4 = c7807z6;
                                                        t14 = t15;
                                                        eVar9 = eVar10;
                                                        z22 = z2622222;
                                                        i61 = i82;
                                                        i62 = i83;
                                                        m03 = c3969l.m0();
                                                        if (m03 == null) {
                                                        }
                                                    }
                                                }
                                                if ((i22 & 16) != 0) {
                                                }
                                                if ((i22 & 32) != 0) {
                                                }
                                                if ((i22 & 64) != 0) {
                                                }
                                                if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                }
                                                if ((i22 & 256) == 0) {
                                                }
                                                if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                                }
                                                if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                }
                                                int i75222 = i35;
                                                if ((i22 & 2048) != 0) {
                                                }
                                                i37 = i22 & 4096;
                                                if (i37 != 0) {
                                                }
                                                i39 = i22 & 8192;
                                                if (i39 != 0) {
                                                }
                                                i42 = i22 & 16384;
                                                if (i42 == 0) {
                                                }
                                                i43 = i42;
                                                i44 = i22 & 32768;
                                                if (i44 != 0) {
                                                }
                                                i45 = i22 & 65536;
                                                if (i45 != 0) {
                                                }
                                                i46 = i22 & 131072;
                                                if (i46 != 0) {
                                                }
                                                i47 = i22 & 262144;
                                                if (i47 != 0) {
                                                }
                                                i48 = i22 & 524288;
                                                if (i48 != 0) {
                                                }
                                                i51 = i22 & 1048576;
                                                if (i51 != 0) {
                                                }
                                                int i7822222 = i49;
                                                i52 = i22 & 2097152;
                                                if (i52 != 0) {
                                                }
                                                i54 = i22 & 4194304;
                                                if (i54 != 0) {
                                                }
                                                i56 = i22 & 8388608;
                                                if (i56 != 0) {
                                                }
                                                i58 = i22 & 16777216;
                                                if (i58 == 0) {
                                                }
                                                i59 = i22 & 33554432;
                                                if (i59 == 0) {
                                                }
                                                if ((i24 & 306783379) != 306783378) {
                                                }
                                                if (i37 == 0) {
                                                }
                                                if (i39 == 0) {
                                                }
                                                if (i43 == 0) {
                                                }
                                                if (i44 == 0) {
                                                }
                                                if (i45 == 0) {
                                                }
                                                if (i46 == 0) {
                                                }
                                                if (i47 == 0) {
                                                }
                                                if (i48 == 0) {
                                                }
                                                if (i51 == 0) {
                                                }
                                                if (i52 == 0) {
                                                }
                                                if (i54 == 0) {
                                                }
                                                if (i56 == 0) {
                                                }
                                                if (i58 == 0) {
                                                }
                                                if (i59 == 0) {
                                                }
                                                if (z14) {
                                                }
                                                float f28222222 = f17;
                                                boolean z26222222 = z24;
                                                C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f28222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z26222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                                c3969l = u11;
                                                f19 = f28222222;
                                                f21 = f18;
                                                f22 = f26;
                                                z19 = z25;
                                                f23 = f24;
                                                z21 = z23;
                                                num2 = num3;
                                                c7807z3 = c7807z5;
                                                c7807z4 = c7807z6;
                                                t14 = t15;
                                                eVar9 = eVar10;
                                                z22 = z26222222;
                                                i61 = i82;
                                                i62 = i83;
                                                m03 = c3969l.m0();
                                                if (m03 == null) {
                                                }
                                            }
                                            if ((i21 & 1073741824) == 0) {
                                            }
                                            if ((i22 & 1) == 0) {
                                            }
                                            int i722 = i31;
                                            if ((i22 & 2) == 0) {
                                            }
                                            if ((i22 & 4) == 0) {
                                            }
                                            if ((i22 & 8) == 0) {
                                            }
                                            if ((i22 & 16) != 0) {
                                            }
                                            if ((i22 & 32) != 0) {
                                            }
                                            if ((i22 & 64) != 0) {
                                            }
                                            if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                            }
                                            if ((i22 & 256) == 0) {
                                            }
                                            if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                            }
                                            if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                            }
                                            int i752222 = i35;
                                            if ((i22 & 2048) != 0) {
                                            }
                                            i37 = i22 & 4096;
                                            if (i37 != 0) {
                                            }
                                            i39 = i22 & 8192;
                                            if (i39 != 0) {
                                            }
                                            i42 = i22 & 16384;
                                            if (i42 == 0) {
                                            }
                                            i43 = i42;
                                            i44 = i22 & 32768;
                                            if (i44 != 0) {
                                            }
                                            i45 = i22 & 65536;
                                            if (i45 != 0) {
                                            }
                                            i46 = i22 & 131072;
                                            if (i46 != 0) {
                                            }
                                            i47 = i22 & 262144;
                                            if (i47 != 0) {
                                            }
                                            i48 = i22 & 524288;
                                            if (i48 != 0) {
                                            }
                                            i51 = i22 & 1048576;
                                            if (i51 != 0) {
                                            }
                                            int i78222222 = i49;
                                            i52 = i22 & 2097152;
                                            if (i52 != 0) {
                                            }
                                            i54 = i22 & 4194304;
                                            if (i54 != 0) {
                                            }
                                            i56 = i22 & 8388608;
                                            if (i56 != 0) {
                                            }
                                            i58 = i22 & 16777216;
                                            if (i58 == 0) {
                                            }
                                            i59 = i22 & 33554432;
                                            if (i59 == 0) {
                                            }
                                            if ((i24 & 306783379) != 306783378) {
                                            }
                                            if (i37 == 0) {
                                            }
                                            if (i39 == 0) {
                                            }
                                            if (i43 == 0) {
                                            }
                                            if (i44 == 0) {
                                            }
                                            if (i45 == 0) {
                                            }
                                            if (i46 == 0) {
                                            }
                                            if (i47 == 0) {
                                            }
                                            if (i48 == 0) {
                                            }
                                            if (i51 == 0) {
                                            }
                                            if (i52 == 0) {
                                            }
                                            if (i54 == 0) {
                                            }
                                            if (i56 == 0) {
                                            }
                                            if (i58 == 0) {
                                            }
                                            if (i59 == 0) {
                                            }
                                            if (z14) {
                                            }
                                            float f282222222 = f17;
                                            boolean z262222222 = z24;
                                            C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f282222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z262222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                            c3969l = u11;
                                            f19 = f282222222;
                                            f21 = f18;
                                            f22 = f26;
                                            z19 = z25;
                                            f23 = f24;
                                            z21 = z23;
                                            num2 = num3;
                                            c7807z3 = c7807z5;
                                            c7807z4 = c7807z6;
                                            t14 = t15;
                                            eVar9 = eVar10;
                                            z22 = z262222222;
                                            i61 = i82;
                                            i62 = i83;
                                            m03 = c3969l.m0();
                                            if (m03 == null) {
                                            }
                                        }
                                    }
                                    if ((i21 & 33554432) != 0) {
                                    }
                                    if ((i21 & 67108864) != 0) {
                                    }
                                    if ((i21 & 134217728) != 0) {
                                    }
                                    if ((i21 & 268435456) != 0) {
                                    }
                                    if ((i21 & 536870912) != 0) {
                                    }
                                    if ((i21 & 1073741824) == 0) {
                                    }
                                    if ((i22 & 1) == 0) {
                                    }
                                    int i7222 = i31;
                                    if ((i22 & 2) == 0) {
                                    }
                                    if ((i22 & 4) == 0) {
                                    }
                                    if ((i22 & 8) == 0) {
                                    }
                                    if ((i22 & 16) != 0) {
                                    }
                                    if ((i22 & 32) != 0) {
                                    }
                                    if ((i22 & 64) != 0) {
                                    }
                                    if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                    }
                                    if ((i22 & 256) == 0) {
                                    }
                                    if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                    }
                                    if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                    }
                                    int i7522222 = i35;
                                    if ((i22 & 2048) != 0) {
                                    }
                                    i37 = i22 & 4096;
                                    if (i37 != 0) {
                                    }
                                    i39 = i22 & 8192;
                                    if (i39 != 0) {
                                    }
                                    i42 = i22 & 16384;
                                    if (i42 == 0) {
                                    }
                                    i43 = i42;
                                    i44 = i22 & 32768;
                                    if (i44 != 0) {
                                    }
                                    i45 = i22 & 65536;
                                    if (i45 != 0) {
                                    }
                                    i46 = i22 & 131072;
                                    if (i46 != 0) {
                                    }
                                    i47 = i22 & 262144;
                                    if (i47 != 0) {
                                    }
                                    i48 = i22 & 524288;
                                    if (i48 != 0) {
                                    }
                                    i51 = i22 & 1048576;
                                    if (i51 != 0) {
                                    }
                                    int i782222222 = i49;
                                    i52 = i22 & 2097152;
                                    if (i52 != 0) {
                                    }
                                    i54 = i22 & 4194304;
                                    if (i54 != 0) {
                                    }
                                    i56 = i22 & 8388608;
                                    if (i56 != 0) {
                                    }
                                    i58 = i22 & 16777216;
                                    if (i58 == 0) {
                                    }
                                    i59 = i22 & 33554432;
                                    if (i59 == 0) {
                                    }
                                    if ((i24 & 306783379) != 306783378) {
                                    }
                                    if (i37 == 0) {
                                    }
                                    if (i39 == 0) {
                                    }
                                    if (i43 == 0) {
                                    }
                                    if (i44 == 0) {
                                    }
                                    if (i45 == 0) {
                                    }
                                    if (i46 == 0) {
                                    }
                                    if (i47 == 0) {
                                    }
                                    if (i48 == 0) {
                                    }
                                    if (i51 == 0) {
                                    }
                                    if (i52 == 0) {
                                    }
                                    if (i54 == 0) {
                                    }
                                    if (i56 == 0) {
                                    }
                                    if (i58 == 0) {
                                    }
                                    if (i59 == 0) {
                                    }
                                    if (z14) {
                                    }
                                    float f2822222222 = f17;
                                    boolean z2622222222 = z24;
                                    C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f2822222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z2622222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                    c3969l = u11;
                                    f19 = f2822222222;
                                    f21 = f18;
                                    f22 = f26;
                                    z19 = z25;
                                    f23 = f24;
                                    z21 = z23;
                                    num2 = num3;
                                    c7807z3 = c7807z5;
                                    c7807z4 = c7807z6;
                                    t14 = t15;
                                    eVar9 = eVar10;
                                    z22 = z2622222222;
                                    i61 = i82;
                                    i62 = i83;
                                    m03 = c3969l.m0();
                                    if (m03 == null) {
                                    }
                                }
                                if ((i21 & 32768) == 0) {
                                }
                                if ((i21 & 65536) == 0) {
                                }
                                if ((i21 & 131072) == 0) {
                                }
                                if ((i21 & 262144) == 0) {
                                }
                                if ((i21 & 524288) == 0) {
                                }
                                if ((i21 & 1048576) == 0) {
                                }
                                if ((i21 & 2097152) == 0) {
                                }
                                int i682 = i26;
                                if ((i21 & 4194304) == 0) {
                                }
                                if ((i21 & 8388608) == 0) {
                                }
                                if ((16777216 & i21) == 0) {
                                }
                                if ((i21 & 33554432) != 0) {
                                }
                                if ((i21 & 67108864) != 0) {
                                }
                                if ((i21 & 134217728) != 0) {
                                }
                                if ((i21 & 268435456) != 0) {
                                }
                                if ((i21 & 536870912) != 0) {
                                }
                                if ((i21 & 1073741824) == 0) {
                                }
                                if ((i22 & 1) == 0) {
                                }
                                int i72222 = i31;
                                if ((i22 & 2) == 0) {
                                }
                                if ((i22 & 4) == 0) {
                                }
                                if ((i22 & 8) == 0) {
                                }
                                if ((i22 & 16) != 0) {
                                }
                                if ((i22 & 32) != 0) {
                                }
                                if ((i22 & 64) != 0) {
                                }
                                if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                }
                                if ((i22 & 256) == 0) {
                                }
                                if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                }
                                if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                }
                                int i75222222 = i35;
                                if ((i22 & 2048) != 0) {
                                }
                                i37 = i22 & 4096;
                                if (i37 != 0) {
                                }
                                i39 = i22 & 8192;
                                if (i39 != 0) {
                                }
                                i42 = i22 & 16384;
                                if (i42 == 0) {
                                }
                                i43 = i42;
                                i44 = i22 & 32768;
                                if (i44 != 0) {
                                }
                                i45 = i22 & 65536;
                                if (i45 != 0) {
                                }
                                i46 = i22 & 131072;
                                if (i46 != 0) {
                                }
                                i47 = i22 & 262144;
                                if (i47 != 0) {
                                }
                                i48 = i22 & 524288;
                                if (i48 != 0) {
                                }
                                i51 = i22 & 1048576;
                                if (i51 != 0) {
                                }
                                int i7822222222 = i49;
                                i52 = i22 & 2097152;
                                if (i52 != 0) {
                                }
                                i54 = i22 & 4194304;
                                if (i54 != 0) {
                                }
                                i56 = i22 & 8388608;
                                if (i56 != 0) {
                                }
                                i58 = i22 & 16777216;
                                if (i58 == 0) {
                                }
                                i59 = i22 & 33554432;
                                if (i59 == 0) {
                                }
                                if ((i24 & 306783379) != 306783378) {
                                }
                                if (i37 == 0) {
                                }
                                if (i39 == 0) {
                                }
                                if (i43 == 0) {
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if (i46 == 0) {
                                }
                                if (i47 == 0) {
                                }
                                if (i48 == 0) {
                                }
                                if (i51 == 0) {
                                }
                                if (i52 == 0) {
                                }
                                if (i54 == 0) {
                                }
                                if (i56 == 0) {
                                }
                                if (i58 == 0) {
                                }
                                if (i59 == 0) {
                                }
                                if (z14) {
                                }
                                float f28222222222 = f17;
                                boolean z26222222222 = z24;
                                C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f28222222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z26222222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                                c3969l = u11;
                                f19 = f28222222222;
                                f21 = f18;
                                f22 = f26;
                                z19 = z25;
                                f23 = f24;
                                z21 = z23;
                                num2 = num3;
                                c7807z3 = c7807z5;
                                c7807z4 = c7807z6;
                                t14 = t15;
                                eVar9 = eVar10;
                                z22 = z26222222222;
                                i61 = i82;
                                i62 = i83;
                                m03 = c3969l.m0();
                                if (m03 == null) {
                                }
                            }
                            if ((i21 & 16384) != 0) {
                            }
                            if ((i21 & 32768) == 0) {
                            }
                            if ((i21 & 65536) == 0) {
                            }
                            if ((i21 & 131072) == 0) {
                            }
                            if ((i21 & 262144) == 0) {
                            }
                            if ((i21 & 524288) == 0) {
                            }
                            if ((i21 & 1048576) == 0) {
                            }
                            if ((i21 & 2097152) == 0) {
                            }
                            int i6822 = i26;
                            if ((i21 & 4194304) == 0) {
                            }
                            if ((i21 & 8388608) == 0) {
                            }
                            if ((16777216 & i21) == 0) {
                            }
                            if ((i21 & 33554432) != 0) {
                            }
                            if ((i21 & 67108864) != 0) {
                            }
                            if ((i21 & 134217728) != 0) {
                            }
                            if ((i21 & 268435456) != 0) {
                            }
                            if ((i21 & 536870912) != 0) {
                            }
                            if ((i21 & 1073741824) == 0) {
                            }
                            if ((i22 & 1) == 0) {
                            }
                            int i722222 = i31;
                            if ((i22 & 2) == 0) {
                            }
                            if ((i22 & 4) == 0) {
                            }
                            if ((i22 & 8) == 0) {
                            }
                            if ((i22 & 16) != 0) {
                            }
                            if ((i22 & 32) != 0) {
                            }
                            if ((i22 & 64) != 0) {
                            }
                            if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            }
                            if ((i22 & 256) == 0) {
                            }
                            if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            }
                            if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            }
                            int i752222222 = i35;
                            if ((i22 & 2048) != 0) {
                            }
                            i37 = i22 & 4096;
                            if (i37 != 0) {
                            }
                            i39 = i22 & 8192;
                            if (i39 != 0) {
                            }
                            i42 = i22 & 16384;
                            if (i42 == 0) {
                            }
                            i43 = i42;
                            i44 = i22 & 32768;
                            if (i44 != 0) {
                            }
                            i45 = i22 & 65536;
                            if (i45 != 0) {
                            }
                            i46 = i22 & 131072;
                            if (i46 != 0) {
                            }
                            i47 = i22 & 262144;
                            if (i47 != 0) {
                            }
                            i48 = i22 & 524288;
                            if (i48 != 0) {
                            }
                            i51 = i22 & 1048576;
                            if (i51 != 0) {
                            }
                            int i78222222222 = i49;
                            i52 = i22 & 2097152;
                            if (i52 != 0) {
                            }
                            i54 = i22 & 4194304;
                            if (i54 != 0) {
                            }
                            i56 = i22 & 8388608;
                            if (i56 != 0) {
                            }
                            i58 = i22 & 16777216;
                            if (i58 == 0) {
                            }
                            i59 = i22 & 33554432;
                            if (i59 == 0) {
                            }
                            if ((i24 & 306783379) != 306783378) {
                            }
                            if (i37 == 0) {
                            }
                            if (i39 == 0) {
                            }
                            if (i43 == 0) {
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if (i46 == 0) {
                            }
                            if (i47 == 0) {
                            }
                            if (i48 == 0) {
                            }
                            if (i51 == 0) {
                            }
                            if (i52 == 0) {
                            }
                            if (i54 == 0) {
                            }
                            if (i56 == 0) {
                            }
                            if (i58 == 0) {
                            }
                            if (i59 == 0) {
                            }
                            if (z14) {
                            }
                            float f282222222222 = f17;
                            boolean z262222222222 = z24;
                            C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f282222222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z262222222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                            c3969l = u11;
                            f19 = f282222222222;
                            f21 = f18;
                            f22 = f26;
                            z19 = z25;
                            f23 = f24;
                            z21 = z23;
                            num2 = num3;
                            c7807z3 = c7807z5;
                            c7807z4 = c7807z6;
                            t14 = t15;
                            eVar9 = eVar10;
                            z22 = z262222222222;
                            i61 = i82;
                            i62 = i83;
                            m03 = c3969l.m0();
                            if (m03 == null) {
                            }
                        }
                        z18 = z13;
                        if ((i21 & 4096) == 0) {
                        }
                        if ((i21 & 8192) == 0) {
                        }
                        if ((i21 & 16384) != 0) {
                        }
                        if ((i21 & 32768) == 0) {
                        }
                        if ((i21 & 65536) == 0) {
                        }
                        if ((i21 & 131072) == 0) {
                        }
                        if ((i21 & 262144) == 0) {
                        }
                        if ((i21 & 524288) == 0) {
                        }
                        if ((i21 & 1048576) == 0) {
                        }
                        if ((i21 & 2097152) == 0) {
                        }
                        int i68222 = i26;
                        if ((i21 & 4194304) == 0) {
                        }
                        if ((i21 & 8388608) == 0) {
                        }
                        if ((16777216 & i21) == 0) {
                        }
                        if ((i21 & 33554432) != 0) {
                        }
                        if ((i21 & 67108864) != 0) {
                        }
                        if ((i21 & 134217728) != 0) {
                        }
                        if ((i21 & 268435456) != 0) {
                        }
                        if ((i21 & 536870912) != 0) {
                        }
                        if ((i21 & 1073741824) == 0) {
                        }
                        if ((i22 & 1) == 0) {
                        }
                        int i7222222 = i31;
                        if ((i22 & 2) == 0) {
                        }
                        if ((i22 & 4) == 0) {
                        }
                        if ((i22 & 8) == 0) {
                        }
                        if ((i22 & 16) != 0) {
                        }
                        if ((i22 & 32) != 0) {
                        }
                        if ((i22 & 64) != 0) {
                        }
                        if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        }
                        if ((i22 & 256) == 0) {
                        }
                        if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        }
                        if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        }
                        int i7522222222 = i35;
                        if ((i22 & 2048) != 0) {
                        }
                        i37 = i22 & 4096;
                        if (i37 != 0) {
                        }
                        i39 = i22 & 8192;
                        if (i39 != 0) {
                        }
                        i42 = i22 & 16384;
                        if (i42 == 0) {
                        }
                        i43 = i42;
                        i44 = i22 & 32768;
                        if (i44 != 0) {
                        }
                        i45 = i22 & 65536;
                        if (i45 != 0) {
                        }
                        i46 = i22 & 131072;
                        if (i46 != 0) {
                        }
                        i47 = i22 & 262144;
                        if (i47 != 0) {
                        }
                        i48 = i22 & 524288;
                        if (i48 != 0) {
                        }
                        i51 = i22 & 1048576;
                        if (i51 != 0) {
                        }
                        int i782222222222 = i49;
                        i52 = i22 & 2097152;
                        if (i52 != 0) {
                        }
                        i54 = i22 & 4194304;
                        if (i54 != 0) {
                        }
                        i56 = i22 & 8388608;
                        if (i56 != 0) {
                        }
                        i58 = i22 & 16777216;
                        if (i58 == 0) {
                        }
                        i59 = i22 & 33554432;
                        if (i59 == 0) {
                        }
                        if ((i24 & 306783379) != 306783378) {
                        }
                        if (i37 == 0) {
                        }
                        if (i39 == 0) {
                        }
                        if (i43 == 0) {
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if (i46 == 0) {
                        }
                        if (i47 == 0) {
                        }
                        if (i48 == 0) {
                        }
                        if (i51 == 0) {
                        }
                        if (i52 == 0) {
                        }
                        if (i54 == 0) {
                        }
                        if (i56 == 0) {
                        }
                        if (i58 == 0) {
                        }
                        if (i59 == 0) {
                        }
                        if (z14) {
                        }
                        float f2822222222222 = f17;
                        boolean z2622222222222 = z24;
                        C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f2822222222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z2622222222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                        c3969l = u11;
                        f19 = f2822222222222;
                        f21 = f18;
                        f22 = f26;
                        z19 = z25;
                        f23 = f24;
                        z21 = z23;
                        num2 = num3;
                        c7807z3 = c7807z5;
                        c7807z4 = c7807z6;
                        t14 = t15;
                        eVar9 = eVar10;
                        z22 = z2622222222222;
                        i61 = i82;
                        i62 = i83;
                        m03 = c3969l.m0();
                        if (m03 == null) {
                        }
                    }
                    if ((i21 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    i24 = i63;
                    if ((i21 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    if ((i21 & 2048) != 0) {
                    }
                    z18 = z13;
                    if ((i21 & 4096) == 0) {
                    }
                    if ((i21 & 8192) == 0) {
                    }
                    if ((i21 & 16384) != 0) {
                    }
                    if ((i21 & 32768) == 0) {
                    }
                    if ((i21 & 65536) == 0) {
                    }
                    if ((i21 & 131072) == 0) {
                    }
                    if ((i21 & 262144) == 0) {
                    }
                    if ((i21 & 524288) == 0) {
                    }
                    if ((i21 & 1048576) == 0) {
                    }
                    if ((i21 & 2097152) == 0) {
                    }
                    int i682222 = i26;
                    if ((i21 & 4194304) == 0) {
                    }
                    if ((i21 & 8388608) == 0) {
                    }
                    if ((16777216 & i21) == 0) {
                    }
                    if ((i21 & 33554432) != 0) {
                    }
                    if ((i21 & 67108864) != 0) {
                    }
                    if ((i21 & 134217728) != 0) {
                    }
                    if ((i21 & 268435456) != 0) {
                    }
                    if ((i21 & 536870912) != 0) {
                    }
                    if ((i21 & 1073741824) == 0) {
                    }
                    if ((i22 & 1) == 0) {
                    }
                    int i72222222 = i31;
                    if ((i22 & 2) == 0) {
                    }
                    if ((i22 & 4) == 0) {
                    }
                    if ((i22 & 8) == 0) {
                    }
                    if ((i22 & 16) != 0) {
                    }
                    if ((i22 & 32) != 0) {
                    }
                    if ((i22 & 64) != 0) {
                    }
                    if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    }
                    if ((i22 & 256) == 0) {
                    }
                    if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    int i75222222222 = i35;
                    if ((i22 & 2048) != 0) {
                    }
                    i37 = i22 & 4096;
                    if (i37 != 0) {
                    }
                    i39 = i22 & 8192;
                    if (i39 != 0) {
                    }
                    i42 = i22 & 16384;
                    if (i42 == 0) {
                    }
                    i43 = i42;
                    i44 = i22 & 32768;
                    if (i44 != 0) {
                    }
                    i45 = i22 & 65536;
                    if (i45 != 0) {
                    }
                    i46 = i22 & 131072;
                    if (i46 != 0) {
                    }
                    i47 = i22 & 262144;
                    if (i47 != 0) {
                    }
                    i48 = i22 & 524288;
                    if (i48 != 0) {
                    }
                    i51 = i22 & 1048576;
                    if (i51 != 0) {
                    }
                    int i7822222222222 = i49;
                    i52 = i22 & 2097152;
                    if (i52 != 0) {
                    }
                    i54 = i22 & 4194304;
                    if (i54 != 0) {
                    }
                    i56 = i22 & 8388608;
                    if (i56 != 0) {
                    }
                    i58 = i22 & 16777216;
                    if (i58 == 0) {
                    }
                    i59 = i22 & 33554432;
                    if (i59 == 0) {
                    }
                    if ((i24 & 306783379) != 306783378) {
                    }
                    if (i37 == 0) {
                    }
                    if (i39 == 0) {
                    }
                    if (i43 == 0) {
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if (i46 == 0) {
                    }
                    if (i47 == 0) {
                    }
                    if (i48 == 0) {
                    }
                    if (i51 == 0) {
                    }
                    if (i52 == 0) {
                    }
                    if (i54 == 0) {
                    }
                    if (i56 == 0) {
                    }
                    if (i58 == 0) {
                    }
                    if (i59 == 0) {
                    }
                    if (z14) {
                    }
                    float f28222222222222 = f17;
                    boolean z26222222222222 = z24;
                    C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f28222222222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z26222222222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                    c3969l = u11;
                    f19 = f28222222222222;
                    f21 = f18;
                    f22 = f26;
                    z19 = z25;
                    f23 = f24;
                    z21 = z23;
                    num2 = num3;
                    c7807z3 = c7807z5;
                    c7807z4 = c7807z6;
                    t14 = t15;
                    eVar9 = eVar10;
                    z22 = z26222222222222;
                    i61 = i82;
                    i62 = i83;
                    m03 = c3969l.m0();
                    if (m03 == null) {
                    }
                }
                if ((i21 & 256) == 0) {
                }
                if ((i21 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                i24 = i63;
                if ((i21 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                if ((i21 & 2048) != 0) {
                }
                z18 = z13;
                if ((i21 & 4096) == 0) {
                }
                if ((i21 & 8192) == 0) {
                }
                if ((i21 & 16384) != 0) {
                }
                if ((i21 & 32768) == 0) {
                }
                if ((i21 & 65536) == 0) {
                }
                if ((i21 & 131072) == 0) {
                }
                if ((i21 & 262144) == 0) {
                }
                if ((i21 & 524288) == 0) {
                }
                if ((i21 & 1048576) == 0) {
                }
                if ((i21 & 2097152) == 0) {
                }
                int i6822222 = i26;
                if ((i21 & 4194304) == 0) {
                }
                if ((i21 & 8388608) == 0) {
                }
                if ((16777216 & i21) == 0) {
                }
                if ((i21 & 33554432) != 0) {
                }
                if ((i21 & 67108864) != 0) {
                }
                if ((i21 & 134217728) != 0) {
                }
                if ((i21 & 268435456) != 0) {
                }
                if ((i21 & 536870912) != 0) {
                }
                if ((i21 & 1073741824) == 0) {
                }
                if ((i22 & 1) == 0) {
                }
                int i722222222 = i31;
                if ((i22 & 2) == 0) {
                }
                if ((i22 & 4) == 0) {
                }
                if ((i22 & 8) == 0) {
                }
                if ((i22 & 16) != 0) {
                }
                if ((i22 & 32) != 0) {
                }
                if ((i22 & 64) != 0) {
                }
                if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                }
                if ((i22 & 256) == 0) {
                }
                if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                int i752222222222 = i35;
                if ((i22 & 2048) != 0) {
                }
                i37 = i22 & 4096;
                if (i37 != 0) {
                }
                i39 = i22 & 8192;
                if (i39 != 0) {
                }
                i42 = i22 & 16384;
                if (i42 == 0) {
                }
                i43 = i42;
                i44 = i22 & 32768;
                if (i44 != 0) {
                }
                i45 = i22 & 65536;
                if (i45 != 0) {
                }
                i46 = i22 & 131072;
                if (i46 != 0) {
                }
                i47 = i22 & 262144;
                if (i47 != 0) {
                }
                i48 = i22 & 524288;
                if (i48 != 0) {
                }
                i51 = i22 & 1048576;
                if (i51 != 0) {
                }
                int i78222222222222 = i49;
                i52 = i22 & 2097152;
                if (i52 != 0) {
                }
                i54 = i22 & 4194304;
                if (i54 != 0) {
                }
                i56 = i22 & 8388608;
                if (i56 != 0) {
                }
                i58 = i22 & 16777216;
                if (i58 == 0) {
                }
                i59 = i22 & 33554432;
                if (i59 == 0) {
                }
                if ((i24 & 306783379) != 306783378) {
                }
                if (i37 == 0) {
                }
                if (i39 == 0) {
                }
                if (i43 == 0) {
                }
                if (i44 == 0) {
                }
                if (i45 == 0) {
                }
                if (i46 == 0) {
                }
                if (i47 == 0) {
                }
                if (i48 == 0) {
                }
                if (i51 == 0) {
                }
                if (i52 == 0) {
                }
                if (i54 == 0) {
                }
                if (i56 == 0) {
                }
                if (i58 == 0) {
                }
                if (i59 == 0) {
                }
                if (z14) {
                }
                float f282222222222222 = f17;
                boolean z262222222222222 = z24;
                C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f282222222222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z262222222222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
                c3969l = u11;
                f19 = f282222222222222;
                f21 = f18;
                f22 = f26;
                z19 = z25;
                f23 = f24;
                z21 = z23;
                num2 = num3;
                c7807z3 = c7807z5;
                c7807z4 = c7807z6;
                t14 = t15;
                eVar9 = eVar10;
                z22 = z262222222222222;
                i61 = i82;
                i62 = i83;
                m03 = c3969l.m0();
                if (m03 == null) {
                }
            }
            str3 = str2;
            if ((i21 & 32) != 0) {
            }
            if ((i21 & 64) != 0) {
            }
            if ((i21 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            if ((i21 & 256) == 0) {
            }
            if ((i21 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            i24 = i63;
            if ((i21 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            if ((i21 & 2048) != 0) {
            }
            z18 = z13;
            if ((i21 & 4096) == 0) {
            }
            if ((i21 & 8192) == 0) {
            }
            if ((i21 & 16384) != 0) {
            }
            if ((i21 & 32768) == 0) {
            }
            if ((i21 & 65536) == 0) {
            }
            if ((i21 & 131072) == 0) {
            }
            if ((i21 & 262144) == 0) {
            }
            if ((i21 & 524288) == 0) {
            }
            if ((i21 & 1048576) == 0) {
            }
            if ((i21 & 2097152) == 0) {
            }
            int i68222222 = i26;
            if ((i21 & 4194304) == 0) {
            }
            if ((i21 & 8388608) == 0) {
            }
            if ((16777216 & i21) == 0) {
            }
            if ((i21 & 33554432) != 0) {
            }
            if ((i21 & 67108864) != 0) {
            }
            if ((i21 & 134217728) != 0) {
            }
            if ((i21 & 268435456) != 0) {
            }
            if ((i21 & 536870912) != 0) {
            }
            if ((i21 & 1073741824) == 0) {
            }
            if ((i22 & 1) == 0) {
            }
            int i7222222222 = i31;
            if ((i22 & 2) == 0) {
            }
            if ((i22 & 4) == 0) {
            }
            if ((i22 & 8) == 0) {
            }
            if ((i22 & 16) != 0) {
            }
            if ((i22 & 32) != 0) {
            }
            if ((i22 & 64) != 0) {
            }
            if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            if ((i22 & 256) == 0) {
            }
            if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            int i7522222222222 = i35;
            if ((i22 & 2048) != 0) {
            }
            i37 = i22 & 4096;
            if (i37 != 0) {
            }
            i39 = i22 & 8192;
            if (i39 != 0) {
            }
            i42 = i22 & 16384;
            if (i42 == 0) {
            }
            i43 = i42;
            i44 = i22 & 32768;
            if (i44 != 0) {
            }
            i45 = i22 & 65536;
            if (i45 != 0) {
            }
            i46 = i22 & 131072;
            if (i46 != 0) {
            }
            i47 = i22 & 262144;
            if (i47 != 0) {
            }
            i48 = i22 & 524288;
            if (i48 != 0) {
            }
            i51 = i22 & 1048576;
            if (i51 != 0) {
            }
            int i782222222222222 = i49;
            i52 = i22 & 2097152;
            if (i52 != 0) {
            }
            i54 = i22 & 4194304;
            if (i54 != 0) {
            }
            i56 = i22 & 8388608;
            if (i56 != 0) {
            }
            i58 = i22 & 16777216;
            if (i58 == 0) {
            }
            i59 = i22 & 33554432;
            if (i59 == 0) {
            }
            if ((i24 & 306783379) != 306783378) {
            }
            if (i37 == 0) {
            }
            if (i39 == 0) {
            }
            if (i43 == 0) {
            }
            if (i44 == 0) {
            }
            if (i45 == 0) {
            }
            if (i46 == 0) {
            }
            if (i47 == 0) {
            }
            if (i48 == 0) {
            }
            if (i51 == 0) {
            }
            if (i52 == 0) {
            }
            if (i54 == 0) {
            }
            if (i56 == 0) {
            }
            if (i58 == 0) {
            }
            if (i59 == 0) {
            }
            if (z14) {
            }
            float f2822222222222222 = f17;
            boolean z2622222222222222 = z24;
            C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f2822222222222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z2622222222222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
            c3969l = u11;
            f19 = f2822222222222222;
            f21 = f18;
            f22 = f26;
            z19 = z25;
            f23 = f24;
            z21 = z23;
            num2 = num3;
            c7807z3 = c7807z5;
            c7807z4 = c7807z6;
            t14 = t15;
            eVar9 = eVar10;
            z22 = z2622222222222222;
            i61 = i82;
            i62 = i83;
            m03 = c3969l.m0();
            if (m03 == null) {
            }
        }
        if ((i21 & 16) == 0) {
        }
        str3 = str2;
        if ((i21 & 32) != 0) {
        }
        if ((i21 & 64) != 0) {
        }
        if ((i21 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        if ((i21 & 256) == 0) {
        }
        if ((i21 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        i24 = i63;
        if ((i21 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        if ((i21 & 2048) != 0) {
        }
        z18 = z13;
        if ((i21 & 4096) == 0) {
        }
        if ((i21 & 8192) == 0) {
        }
        if ((i21 & 16384) != 0) {
        }
        if ((i21 & 32768) == 0) {
        }
        if ((i21 & 65536) == 0) {
        }
        if ((i21 & 131072) == 0) {
        }
        if ((i21 & 262144) == 0) {
        }
        if ((i21 & 524288) == 0) {
        }
        if ((i21 & 1048576) == 0) {
        }
        if ((i21 & 2097152) == 0) {
        }
        int i682222222 = i26;
        if ((i21 & 4194304) == 0) {
        }
        if ((i21 & 8388608) == 0) {
        }
        if ((16777216 & i21) == 0) {
        }
        if ((i21 & 33554432) != 0) {
        }
        if ((i21 & 67108864) != 0) {
        }
        if ((i21 & 134217728) != 0) {
        }
        if ((i21 & 268435456) != 0) {
        }
        if ((i21 & 536870912) != 0) {
        }
        if ((i21 & 1073741824) == 0) {
        }
        if ((i22 & 1) == 0) {
        }
        int i72222222222 = i31;
        if ((i22 & 2) == 0) {
        }
        if ((i22 & 4) == 0) {
        }
        if ((i22 & 8) == 0) {
        }
        if ((i22 & 16) != 0) {
        }
        if ((i22 & 32) != 0) {
        }
        if ((i22 & 64) != 0) {
        }
        if ((i22 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        if ((i22 & 256) == 0) {
        }
        if ((i22 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        if ((i22 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        int i75222222222222 = i35;
        if ((i22 & 2048) != 0) {
        }
        i37 = i22 & 4096;
        if (i37 != 0) {
        }
        i39 = i22 & 8192;
        if (i39 != 0) {
        }
        i42 = i22 & 16384;
        if (i42 == 0) {
        }
        i43 = i42;
        i44 = i22 & 32768;
        if (i44 != 0) {
        }
        i45 = i22 & 65536;
        if (i45 != 0) {
        }
        i46 = i22 & 131072;
        if (i46 != 0) {
        }
        i47 = i22 & 262144;
        if (i47 != 0) {
        }
        i48 = i22 & 524288;
        if (i48 != 0) {
        }
        i51 = i22 & 1048576;
        if (i51 != 0) {
        }
        int i7822222222222222 = i49;
        i52 = i22 & 2097152;
        if (i52 != 0) {
        }
        i54 = i22 & 4194304;
        if (i54 != 0) {
        }
        i56 = i22 & 8388608;
        if (i56 != 0) {
        }
        i58 = i22 & 16777216;
        if (i58 == 0) {
        }
        i59 = i22 & 33554432;
        if (i59 == 0) {
        }
        if ((i24 & 306783379) != 306783378) {
        }
        if (i37 == 0) {
        }
        if (i39 == 0) {
        }
        if (i43 == 0) {
        }
        if (i44 == 0) {
        }
        if (i45 == 0) {
        }
        if (i46 == 0) {
        }
        if (i47 == 0) {
        }
        if (i48 == 0) {
        }
        if (i51 == 0) {
        }
        if (i52 == 0) {
        }
        if (i54 == 0) {
        }
        if (i56 == 0) {
        }
        if (i58 == 0) {
        }
        if (i59 == 0) {
        }
        if (z14) {
        }
        float f28222222222222222 = f17;
        boolean z26222222222222222 = z24;
        C5191n.a(eVar, null, a1.c.c(1863609030, new FoundationTextAreaKt$FoundationTextAreaImpl$1(f11, f12, j11, f28222222222222222, f7, z18, j18, j17, z12, rVar, (P1) u11.m(K0.o()), c3422b, f18, z26222222222222222, t11, j12, k12, str, str3, !z11 && z12 && k11.f().length() > 0, x11, qVar, n02, m02, function1, function12, j14, j15, j13, t2, eVar2, eVar4, eVar5, eVar6, abstractC8972b2, j21, i82, i83, f26, z25, eVar7, abstractC8972b, function22, function2, k11, j19, f24, z23, num3, c7807z5, c7807z6, t15, eVar10, eVar3, j16, i11, t12), u11), u11, (i24 & 14) | 3072, 6);
        c3969l = u11;
        f19 = f28222222222222222;
        f21 = f18;
        f22 = f26;
        z19 = z25;
        f23 = f24;
        z21 = z23;
        num2 = num3;
        c7807z3 = c7807z5;
        c7807z4 = c7807z6;
        t14 = t15;
        eVar9 = eVar10;
        z22 = z26222222222222222;
        i61 = i82;
        i62 = i83;
        m03 = c3969l.m0();
        if (m03 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00da  */
    /* renamed from: SystemContent-WasTKPc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3031SystemContentWasTKPc(e eVar, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, boolean z12, boolean z13, long j11, AbstractC8972b abstractC8972b2, float f7, boolean z14, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        long j12;
        int i14;
        e eVar3;
        e eVar4;
        C3969l c3969l;
        e eVar5;
        boolean z15;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(909730990);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = i11 | (u11.n(eVar2) ? 4 : 2);
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((2 & i12) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(abstractC8972b) ? 32 : 16;
        }
        int i16 = i13;
        if ((4 & i12) != 0) {
            i16 |= 384;
        } else if ((i11 & 384) == 0) {
            i16 |= u11.F(function2) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i16 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i16 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((16 & i12) != 0) {
            i16 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i16 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i16 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i16 |= u11.p(z13) ? 131072 : 65536;
        }
        if ((i12 & 64) != 0) {
            i16 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            j12 = j11;
            i16 |= u11.s(j12) ? 1048576 : 524288;
            if ((128 & i12) == 0) {
                i16 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i16 |= u11.n(abstractC8972b2) ? 8388608 : 4194304;
                if ((256 & i12) != 0) {
                    i16 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i16 |= u11.q(f7) ? 67108864 : 33554432;
                    i14 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i14 == 0) {
                        i16 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        i16 |= u11.p(z14) ? 536870912 : 268435456;
                    }
                    if ((i16 & 306783379) == 306783378 || !u11.b()) {
                        eVar3 = i15 == 0 ? e.f40358c0 : eVar2;
                        boolean z16 = i14 == 0 ? false : z14;
                        if (z13 || z16) {
                            eVar4 = eVar3;
                            if (z12 || !z11) {
                                u11.o(84867672);
                                if (abstractC8972b != null) {
                                    c3969l = u11;
                                } else {
                                    int i17 = i16 >> 15;
                                    DefaultTrailingIconKt.m3010DefaultTrailingIconN8B1yIo(abstractC8972b, j11, eVar4, f7, u11, (i17 & 112) | ((i16 << 6) & 896) | (i17 & 7168), 0);
                                    c3969l = u11;
                                    Unit unit = Unit.f71690a;
                                }
                                c3969l.k();
                            } else {
                                u11.o(84575466);
                                V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                                int I11 = u11.I();
                                A0 d11 = u11.d();
                                e f12 = androidx.compose.ui.c.f(u11, eVar4);
                                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.H(a11);
                                } else {
                                    u11.e();
                                }
                                Function2 f13 = E.f(u11, f11, u11, d11);
                                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    Ep.a.d(I11, u11, I11, f13);
                                }
                                F1.b(u11, f12, InterfaceC2801g.a.f());
                                function2.invoke(u11, Integer.valueOf((i16 >> 6) & 14));
                                u11.f();
                                u11.k();
                                c3969l = u11;
                            }
                        } else {
                            u11.o(84265187);
                            int i18 = i16 >> 15;
                            c3969l = u11;
                            DefaultTrailingIconKt.m3010DefaultTrailingIconN8B1yIo(abstractC8972b2, j12, eVar3, f7, c3969l, ((i16 >> 21) & 14) | (i18 & 112) | ((i16 << 6) & 896) | (i18 & 7168), 0);
                            eVar4 = eVar3;
                            c3969l.k();
                        }
                        eVar5 = eVar4;
                        z15 = z16;
                    } else {
                        u11.j();
                        z15 = z14;
                        c3969l = u11;
                        eVar5 = eVar2;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new FoundationTextAreaKt$SystemContent$3(eVar5, abstractC8972b, function2, z11, z12, z13, j11, abstractC8972b2, f7, z15, i11, i12));
                        return;
                    }
                    return;
                }
                i14 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i14 == 0) {
                }
                if ((i16 & 306783379) == 306783378) {
                }
                if (i15 == 0) {
                }
                if (i14 == 0) {
                }
                if (z13) {
                }
                eVar4 = eVar3;
                if (z12) {
                }
                u11.o(84867672);
                if (abstractC8972b != null) {
                }
                c3969l.k();
                eVar5 = eVar4;
                z15 = z16;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            if ((256 & i12) != 0) {
            }
            i14 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i14 == 0) {
            }
            if ((i16 & 306783379) == 306783378) {
            }
            if (i15 == 0) {
            }
            if (i14 == 0) {
            }
            if (z13) {
            }
            eVar4 = eVar3;
            if (z12) {
            }
            u11.o(84867672);
            if (abstractC8972b != null) {
            }
            c3969l.k();
            eVar5 = eVar4;
            z15 = z16;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        j12 = j11;
        if ((128 & i12) == 0) {
        }
        if ((256 & i12) != 0) {
        }
        i14 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i14 == 0) {
        }
        if ((i16 & 306783379) == 306783378) {
        }
        if (i15 == 0) {
        }
        if (i14 == 0) {
        }
        if (z13) {
        }
        eVar4 = eVar3;
        if (z12) {
        }
        u11.o(84867672);
        if (abstractC8972b != null) {
        }
        c3969l.k();
        eVar5 = eVar4;
        z15 = z16;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0336  */
    /* renamed from: TextareaBody-qWYo42c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3032TextareaBodyqWYo42c(K k11, String str, String str2, boolean z11, boolean z12, r rVar, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, T t2, T t11, InterfaceC9914x interfaceC9914x, e eVar, e eVar2, e eVar3, e eVar4, AbstractC8972b abstractC8972b, long j15, int i11, int i12, float f7, boolean z13, int i13, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        String str3;
        int i21;
        int i22;
        int i23;
        long j16;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        boolean z14;
        Object C11;
        C3969l c3969l;
        boolean z15;
        int i34;
        J0 m03;
        C3969l u11 = interfaceC3967k.u(-1222507598);
        if ((i17 & 1) != 0) {
            i18 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i18 = (u11.n(k11) ? 4 : 2) | i14;
        } else {
            i18 = i14;
        }
        if ((i17 & 2) != 0) {
            i18 |= 48;
        } else if ((i14 & 48) == 0) {
            i18 |= u11.n(str) ? 32 : 16;
            i19 = i17 & 4;
            int i35 = UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 == 0) {
                i18 |= 384;
            } else if ((i14 & 384) == 0) {
                str3 = str2;
                i18 |= u11.n(str3) ? 256 : 128;
                i21 = i17 & 8;
                int i36 = UserVerificationMethods.USER_VERIFY_ALL;
                if (i21 != 0) {
                    i18 |= 3072;
                } else if ((i14 & 3072) == 0) {
                    i18 |= u11.p(z11) ? 2048 : 1024;
                    if ((i17 & 16) == 0) {
                        i18 |= 24576;
                    } else if ((i14 & 24576) == 0) {
                        i18 |= u11.p(z12) ? 16384 : 8192;
                        if ((i17 & 32) != 0) {
                            i18 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i18 |= u11.n(rVar) ? 131072 : 65536;
                        }
                        if ((i17 & 64) != 0) {
                            i18 |= 1572864;
                        } else if ((i14 & 1572864) == 0) {
                            i18 |= u11.n(x11) ? 1048576 : 524288;
                        }
                        if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            i18 |= 12582912;
                        } else if ((i14 & 12582912) == 0) {
                            i18 |= u11.n(qVar) ? 8388608 : 4194304;
                            if ((i17 & 256) == 0) {
                                i18 |= 100663296;
                            } else if ((i14 & 100663296) == 0) {
                                i18 |= u11.n(n02) ? 67108864 : 33554432;
                                if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                    i18 |= 805306368;
                                } else if ((i14 & 805306368) == 0) {
                                    i18 |= u11.n(m02) ? 536870912 : 268435456;
                                    i22 = i18;
                                    if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                        i23 = i15 | 6;
                                    } else if ((i15 & 6) == 0) {
                                        i23 = i15 | (u11.F(function1) ? 4 : 2);
                                    } else {
                                        i23 = i15;
                                    }
                                    if ((i17 & 2048) == 0) {
                                        i23 |= 48;
                                    } else if ((i15 & 48) == 0) {
                                        i23 |= u11.F(function12) ? 32 : 16;
                                    }
                                    int i37 = i23;
                                    if ((i17 & 4096) == 0) {
                                        i37 |= 384;
                                    } else if ((i15 & 384) == 0) {
                                        i37 |= u11.s(j11) ? 256 : 128;
                                        if ((i17 & 8192) != 0) {
                                            i37 |= 3072;
                                        } else if ((i15 & 3072) == 0) {
                                            i37 |= u11.s(j12) ? 2048 : 1024;
                                            if ((i17 & 16384) == 0) {
                                                i37 |= 24576;
                                            } else if ((i15 & 24576) == 0) {
                                                j16 = j13;
                                                i37 |= u11.s(j16) ? 16384 : 8192;
                                                if ((i17 & 32768) != 0) {
                                                    i37 |= 196608;
                                                } else if ((i15 & 196608) == 0) {
                                                    i37 |= u11.s(j14) ? 131072 : 65536;
                                                }
                                                if ((i17 & 65536) != 0) {
                                                    i37 |= 1572864;
                                                } else if ((i15 & 1572864) == 0) {
                                                    i24 = i37 | (u11.n(t2) ? 1048576 : 524288);
                                                    if ((i17 & 131072) == 0) {
                                                        i24 |= 12582912;
                                                    } else if ((i15 & 12582912) == 0) {
                                                        i24 |= u11.n(t11) ? 8388608 : 4194304;
                                                    }
                                                    if ((i17 & 262144) == 0) {
                                                        i24 |= 100663296;
                                                    } else if ((i15 & 100663296) == 0) {
                                                        i24 |= u11.n(interfaceC9914x) ? 67108864 : 33554432;
                                                    }
                                                    if ((i17 & 524288) == 0) {
                                                        i24 |= 805306368;
                                                    } else if ((i15 & 805306368) == 0) {
                                                        i24 |= u11.n(eVar) ? 536870912 : 268435456;
                                                    }
                                                    i25 = i24;
                                                    if ((i17 & 1048576) == 0) {
                                                        i26 = i16 | 6;
                                                    } else if ((i16 & 6) == 0) {
                                                        i26 = i16 | (u11.n(eVar2) ? 4 : 2);
                                                    } else {
                                                        i26 = i16;
                                                    }
                                                    if ((i17 & 2097152) == 0) {
                                                        i26 |= 48;
                                                    } else if ((i16 & 48) == 0) {
                                                        i26 |= u11.n(eVar3) ? 32 : 16;
                                                    }
                                                    int i38 = i26;
                                                    if ((i17 & 4194304) == 0) {
                                                        i27 = i38 | 384;
                                                    } else {
                                                        int i39 = i38;
                                                        if ((i16 & 384) == 0) {
                                                            if (u11.n(eVar4)) {
                                                                i35 = 256;
                                                            }
                                                            i39 |= i35;
                                                        }
                                                        i27 = i39;
                                                    }
                                                    if ((i17 & 8388608) == 0) {
                                                        i28 = i27 | 3072;
                                                    } else {
                                                        int i41 = i27;
                                                        if ((i16 & 3072) == 0) {
                                                            if (u11.n(abstractC8972b)) {
                                                                i36 = 2048;
                                                            }
                                                            i41 |= i36;
                                                        }
                                                        i28 = i41;
                                                    }
                                                    if ((i17 & 16777216) == 0) {
                                                        i29 = i28 | 24576;
                                                    } else {
                                                        i29 = i28;
                                                        if ((i16 & 24576) == 0) {
                                                            i29 |= u11.s(j15) ? 16384 : 8192;
                                                            if ((i17 & 33554432) != 0) {
                                                                i29 |= 196608;
                                                            } else if ((i16 & 196608) == 0) {
                                                                i29 |= u11.r(i11) ? 131072 : 65536;
                                                            }
                                                            if ((i17 & 67108864) != 0) {
                                                                i29 |= 1572864;
                                                            } else if ((i16 & 1572864) == 0) {
                                                                i29 |= u11.r(i12) ? 1048576 : 524288;
                                                            }
                                                            if ((i17 & 134217728) != 0) {
                                                                i29 |= 12582912;
                                                            } else if ((i16 & 12582912) == 0) {
                                                                i29 |= u11.q(f7) ? 8388608 : 4194304;
                                                            }
                                                            i31 = i17 & 268435456;
                                                            if (i31 != 0) {
                                                                i29 |= 100663296;
                                                            } else if ((i16 & 100663296) == 0) {
                                                                i29 |= u11.p(z13) ? 67108864 : 33554432;
                                                            }
                                                            i32 = i17 & 536870912;
                                                            if (i32 != 0) {
                                                                i29 |= 805306368;
                                                            } else if ((i16 & 805306368) == 0) {
                                                                i29 |= u11.r(i13) ? 536870912 : 268435456;
                                                            }
                                                            i33 = i29;
                                                            if ((i22 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i33 & 306783379) == 306783378 && u11.b()) {
                                                                u11.j();
                                                                z15 = z13;
                                                                i34 = i13;
                                                                c3969l = u11;
                                                            } else {
                                                                boolean z16 = i31 != 0 ? false : z13;
                                                                int i42 = i32 != 0 ? 1 : i13;
                                                                e a11 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                                                                u11.o(486052771);
                                                                z14 = (i25 & 112) == 32;
                                                                C11 = u11.C();
                                                                if (!z14 || C11 == InterfaceC3967k.a.a()) {
                                                                    C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                                                                    u11.x(C11);
                                                                }
                                                                u11.k();
                                                                e a12 = androidx.compose.ui.focus.a.a(a11, (Function1) C11);
                                                                int i43 = i22 >> 9;
                                                                int i44 = (i43 & 7168) | ((i25 >> 15) & 896) | 48 | (i43 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                                                                int i45 = i33 << 9;
                                                                int i46 = i33 << 3;
                                                                c3969l = u11;
                                                                int i47 = i22 >> 6;
                                                                C2475h.c(k11, function1, a12, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i44 | (i45 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i45 & 7168) | (i45 & 57344) | (458752 & i45) | (3670016 & i45) | (i46 & 234881024) | (i46 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i47) | (i47 & 29360128) | (i45 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                                                                z15 = z16;
                                                                i34 = i42;
                                                            }
                                                            m03 = c3969l.m0();
                                                            if (m03 != null) {
                                                                m03.G(new FoundationTextAreaKt$TextareaBody$1(k11, str, str2, z11, z12, rVar, x11, qVar, n02, m02, function1, function12, j11, j12, j13, j14, t2, t11, interfaceC9914x, eVar, eVar2, eVar3, eVar4, abstractC8972b, j15, i11, i12, f7, z15, i34, i14, i15, i16, i17));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    if ((i17 & 33554432) != 0) {
                                                    }
                                                    if ((i17 & 67108864) != 0) {
                                                    }
                                                    if ((i17 & 134217728) != 0) {
                                                    }
                                                    i31 = i17 & 268435456;
                                                    if (i31 != 0) {
                                                    }
                                                    i32 = i17 & 536870912;
                                                    if (i32 != 0) {
                                                    }
                                                    i33 = i29;
                                                    if ((i22 & 306783379) != 306783378) {
                                                    }
                                                    if (i31 != 0) {
                                                    }
                                                    if (i32 != 0) {
                                                    }
                                                    e a112 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                                                    u11.o(486052771);
                                                    if ((i25 & 112) == 32) {
                                                    }
                                                    C11 = u11.C();
                                                    if (!z14) {
                                                    }
                                                    C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                                                    u11.x(C11);
                                                    u11.k();
                                                    e a122 = androidx.compose.ui.focus.a.a(a112, (Function1) C11);
                                                    int i432 = i22 >> 9;
                                                    int i442 = (i432 & 7168) | ((i25 >> 15) & 896) | 48 | (i432 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                                                    int i452 = i33 << 9;
                                                    int i462 = i33 << 3;
                                                    c3969l = u11;
                                                    int i472 = i22 >> 6;
                                                    C2475h.c(k11, function1, a122, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i442 | (i452 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i452 & 7168) | (i452 & 57344) | (458752 & i452) | (3670016 & i452) | (i462 & 234881024) | (i462 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i472) | (i472 & 29360128) | (i452 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                                                    z15 = z16;
                                                    i34 = i42;
                                                    m03 = c3969l.m0();
                                                    if (m03 != null) {
                                                    }
                                                }
                                                i24 = i37;
                                                if ((i17 & 131072) == 0) {
                                                }
                                                if ((i17 & 262144) == 0) {
                                                }
                                                if ((i17 & 524288) == 0) {
                                                }
                                                i25 = i24;
                                                if ((i17 & 1048576) == 0) {
                                                }
                                                if ((i17 & 2097152) == 0) {
                                                }
                                                int i382 = i26;
                                                if ((i17 & 4194304) == 0) {
                                                }
                                                if ((i17 & 8388608) == 0) {
                                                }
                                                if ((i17 & 16777216) == 0) {
                                                }
                                                if ((i17 & 33554432) != 0) {
                                                }
                                                if ((i17 & 67108864) != 0) {
                                                }
                                                if ((i17 & 134217728) != 0) {
                                                }
                                                i31 = i17 & 268435456;
                                                if (i31 != 0) {
                                                }
                                                i32 = i17 & 536870912;
                                                if (i32 != 0) {
                                                }
                                                i33 = i29;
                                                if ((i22 & 306783379) != 306783378) {
                                                }
                                                if (i31 != 0) {
                                                }
                                                if (i32 != 0) {
                                                }
                                                e a1122 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                                                u11.o(486052771);
                                                if ((i25 & 112) == 32) {
                                                }
                                                C11 = u11.C();
                                                if (!z14) {
                                                }
                                                C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                                                u11.x(C11);
                                                u11.k();
                                                e a1222 = androidx.compose.ui.focus.a.a(a1122, (Function1) C11);
                                                int i4322 = i22 >> 9;
                                                int i4422 = (i4322 & 7168) | ((i25 >> 15) & 896) | 48 | (i4322 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                                                int i4522 = i33 << 9;
                                                int i4622 = i33 << 3;
                                                c3969l = u11;
                                                int i4722 = i22 >> 6;
                                                C2475h.c(k11, function1, a1222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i4422 | (i4522 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i4522 & 7168) | (i4522 & 57344) | (458752 & i4522) | (3670016 & i4522) | (i4622 & 234881024) | (i4622 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i4722) | (i4722 & 29360128) | (i4522 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                                                z15 = z16;
                                                i34 = i42;
                                                m03 = c3969l.m0();
                                                if (m03 != null) {
                                                }
                                            }
                                            j16 = j13;
                                            if ((i17 & 32768) != 0) {
                                            }
                                            if ((i17 & 65536) != 0) {
                                            }
                                            i24 = i37;
                                            if ((i17 & 131072) == 0) {
                                            }
                                            if ((i17 & 262144) == 0) {
                                            }
                                            if ((i17 & 524288) == 0) {
                                            }
                                            i25 = i24;
                                            if ((i17 & 1048576) == 0) {
                                            }
                                            if ((i17 & 2097152) == 0) {
                                            }
                                            int i3822 = i26;
                                            if ((i17 & 4194304) == 0) {
                                            }
                                            if ((i17 & 8388608) == 0) {
                                            }
                                            if ((i17 & 16777216) == 0) {
                                            }
                                            if ((i17 & 33554432) != 0) {
                                            }
                                            if ((i17 & 67108864) != 0) {
                                            }
                                            if ((i17 & 134217728) != 0) {
                                            }
                                            i31 = i17 & 268435456;
                                            if (i31 != 0) {
                                            }
                                            i32 = i17 & 536870912;
                                            if (i32 != 0) {
                                            }
                                            i33 = i29;
                                            if ((i22 & 306783379) != 306783378) {
                                            }
                                            if (i31 != 0) {
                                            }
                                            if (i32 != 0) {
                                            }
                                            e a11222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                                            u11.o(486052771);
                                            if ((i25 & 112) == 32) {
                                            }
                                            C11 = u11.C();
                                            if (!z14) {
                                            }
                                            C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                                            u11.x(C11);
                                            u11.k();
                                            e a12222 = androidx.compose.ui.focus.a.a(a11222, (Function1) C11);
                                            int i43222 = i22 >> 9;
                                            int i44222 = (i43222 & 7168) | ((i25 >> 15) & 896) | 48 | (i43222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                                            int i45222 = i33 << 9;
                                            int i46222 = i33 << 3;
                                            c3969l = u11;
                                            int i47222 = i22 >> 6;
                                            C2475h.c(k11, function1, a12222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i44222 | (i45222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i45222 & 7168) | (i45222 & 57344) | (458752 & i45222) | (3670016 & i45222) | (i46222 & 234881024) | (i46222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i47222) | (i47222 & 29360128) | (i45222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                                            z15 = z16;
                                            i34 = i42;
                                            m03 = c3969l.m0();
                                            if (m03 != null) {
                                            }
                                        }
                                        if ((i17 & 16384) == 0) {
                                        }
                                        j16 = j13;
                                        if ((i17 & 32768) != 0) {
                                        }
                                        if ((i17 & 65536) != 0) {
                                        }
                                        i24 = i37;
                                        if ((i17 & 131072) == 0) {
                                        }
                                        if ((i17 & 262144) == 0) {
                                        }
                                        if ((i17 & 524288) == 0) {
                                        }
                                        i25 = i24;
                                        if ((i17 & 1048576) == 0) {
                                        }
                                        if ((i17 & 2097152) == 0) {
                                        }
                                        int i38222 = i26;
                                        if ((i17 & 4194304) == 0) {
                                        }
                                        if ((i17 & 8388608) == 0) {
                                        }
                                        if ((i17 & 16777216) == 0) {
                                        }
                                        if ((i17 & 33554432) != 0) {
                                        }
                                        if ((i17 & 67108864) != 0) {
                                        }
                                        if ((i17 & 134217728) != 0) {
                                        }
                                        i31 = i17 & 268435456;
                                        if (i31 != 0) {
                                        }
                                        i32 = i17 & 536870912;
                                        if (i32 != 0) {
                                        }
                                        i33 = i29;
                                        if ((i22 & 306783379) != 306783378) {
                                        }
                                        if (i31 != 0) {
                                        }
                                        if (i32 != 0) {
                                        }
                                        e a112222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                                        u11.o(486052771);
                                        if ((i25 & 112) == 32) {
                                        }
                                        C11 = u11.C();
                                        if (!z14) {
                                        }
                                        C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                                        u11.x(C11);
                                        u11.k();
                                        e a122222 = androidx.compose.ui.focus.a.a(a112222, (Function1) C11);
                                        int i432222 = i22 >> 9;
                                        int i442222 = (i432222 & 7168) | ((i25 >> 15) & 896) | 48 | (i432222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                                        int i452222 = i33 << 9;
                                        int i462222 = i33 << 3;
                                        c3969l = u11;
                                        int i472222 = i22 >> 6;
                                        C2475h.c(k11, function1, a122222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i442222 | (i452222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i452222 & 7168) | (i452222 & 57344) | (458752 & i452222) | (3670016 & i452222) | (i462222 & 234881024) | (i462222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i472222) | (i472222 & 29360128) | (i452222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                                        z15 = z16;
                                        i34 = i42;
                                        m03 = c3969l.m0();
                                        if (m03 != null) {
                                        }
                                    }
                                    if ((i17 & 8192) != 0) {
                                    }
                                    if ((i17 & 16384) == 0) {
                                    }
                                    j16 = j13;
                                    if ((i17 & 32768) != 0) {
                                    }
                                    if ((i17 & 65536) != 0) {
                                    }
                                    i24 = i37;
                                    if ((i17 & 131072) == 0) {
                                    }
                                    if ((i17 & 262144) == 0) {
                                    }
                                    if ((i17 & 524288) == 0) {
                                    }
                                    i25 = i24;
                                    if ((i17 & 1048576) == 0) {
                                    }
                                    if ((i17 & 2097152) == 0) {
                                    }
                                    int i382222 = i26;
                                    if ((i17 & 4194304) == 0) {
                                    }
                                    if ((i17 & 8388608) == 0) {
                                    }
                                    if ((i17 & 16777216) == 0) {
                                    }
                                    if ((i17 & 33554432) != 0) {
                                    }
                                    if ((i17 & 67108864) != 0) {
                                    }
                                    if ((i17 & 134217728) != 0) {
                                    }
                                    i31 = i17 & 268435456;
                                    if (i31 != 0) {
                                    }
                                    i32 = i17 & 536870912;
                                    if (i32 != 0) {
                                    }
                                    i33 = i29;
                                    if ((i22 & 306783379) != 306783378) {
                                    }
                                    if (i31 != 0) {
                                    }
                                    if (i32 != 0) {
                                    }
                                    e a1122222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                                    u11.o(486052771);
                                    if ((i25 & 112) == 32) {
                                    }
                                    C11 = u11.C();
                                    if (!z14) {
                                    }
                                    C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                                    u11.x(C11);
                                    u11.k();
                                    e a1222222 = androidx.compose.ui.focus.a.a(a1122222, (Function1) C11);
                                    int i4322222 = i22 >> 9;
                                    int i4422222 = (i4322222 & 7168) | ((i25 >> 15) & 896) | 48 | (i4322222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                                    int i4522222 = i33 << 9;
                                    int i4622222 = i33 << 3;
                                    c3969l = u11;
                                    int i4722222 = i22 >> 6;
                                    C2475h.c(k11, function1, a1222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i4422222 | (i4522222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i4522222 & 7168) | (i4522222 & 57344) | (458752 & i4522222) | (3670016 & i4522222) | (i4622222 & 234881024) | (i4622222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i4722222) | (i4722222 & 29360128) | (i4522222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                                    z15 = z16;
                                    i34 = i42;
                                    m03 = c3969l.m0();
                                    if (m03 != null) {
                                    }
                                }
                                i22 = i18;
                                if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                }
                                if ((i17 & 2048) == 0) {
                                }
                                int i372 = i23;
                                if ((i17 & 4096) == 0) {
                                }
                                if ((i17 & 8192) != 0) {
                                }
                                if ((i17 & 16384) == 0) {
                                }
                                j16 = j13;
                                if ((i17 & 32768) != 0) {
                                }
                                if ((i17 & 65536) != 0) {
                                }
                                i24 = i372;
                                if ((i17 & 131072) == 0) {
                                }
                                if ((i17 & 262144) == 0) {
                                }
                                if ((i17 & 524288) == 0) {
                                }
                                i25 = i24;
                                if ((i17 & 1048576) == 0) {
                                }
                                if ((i17 & 2097152) == 0) {
                                }
                                int i3822222 = i26;
                                if ((i17 & 4194304) == 0) {
                                }
                                if ((i17 & 8388608) == 0) {
                                }
                                if ((i17 & 16777216) == 0) {
                                }
                                if ((i17 & 33554432) != 0) {
                                }
                                if ((i17 & 67108864) != 0) {
                                }
                                if ((i17 & 134217728) != 0) {
                                }
                                i31 = i17 & 268435456;
                                if (i31 != 0) {
                                }
                                i32 = i17 & 536870912;
                                if (i32 != 0) {
                                }
                                i33 = i29;
                                if ((i22 & 306783379) != 306783378) {
                                }
                                if (i31 != 0) {
                                }
                                if (i32 != 0) {
                                }
                                e a11222222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                                u11.o(486052771);
                                if ((i25 & 112) == 32) {
                                }
                                C11 = u11.C();
                                if (!z14) {
                                }
                                C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                                u11.x(C11);
                                u11.k();
                                e a12222222 = androidx.compose.ui.focus.a.a(a11222222, (Function1) C11);
                                int i43222222 = i22 >> 9;
                                int i44222222 = (i43222222 & 7168) | ((i25 >> 15) & 896) | 48 | (i43222222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                                int i45222222 = i33 << 9;
                                int i46222222 = i33 << 3;
                                c3969l = u11;
                                int i47222222 = i22 >> 6;
                                C2475h.c(k11, function1, a12222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i44222222 | (i45222222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i45222222 & 7168) | (i45222222 & 57344) | (458752 & i45222222) | (3670016 & i45222222) | (i46222222 & 234881024) | (i46222222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i47222222) | (i47222222 & 29360128) | (i45222222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                                z15 = z16;
                                i34 = i42;
                                m03 = c3969l.m0();
                                if (m03 != null) {
                                }
                            }
                            if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            }
                            i22 = i18;
                            if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                            }
                            if ((i17 & 2048) == 0) {
                            }
                            int i3722 = i23;
                            if ((i17 & 4096) == 0) {
                            }
                            if ((i17 & 8192) != 0) {
                            }
                            if ((i17 & 16384) == 0) {
                            }
                            j16 = j13;
                            if ((i17 & 32768) != 0) {
                            }
                            if ((i17 & 65536) != 0) {
                            }
                            i24 = i3722;
                            if ((i17 & 131072) == 0) {
                            }
                            if ((i17 & 262144) == 0) {
                            }
                            if ((i17 & 524288) == 0) {
                            }
                            i25 = i24;
                            if ((i17 & 1048576) == 0) {
                            }
                            if ((i17 & 2097152) == 0) {
                            }
                            int i38222222 = i26;
                            if ((i17 & 4194304) == 0) {
                            }
                            if ((i17 & 8388608) == 0) {
                            }
                            if ((i17 & 16777216) == 0) {
                            }
                            if ((i17 & 33554432) != 0) {
                            }
                            if ((i17 & 67108864) != 0) {
                            }
                            if ((i17 & 134217728) != 0) {
                            }
                            i31 = i17 & 268435456;
                            if (i31 != 0) {
                            }
                            i32 = i17 & 536870912;
                            if (i32 != 0) {
                            }
                            i33 = i29;
                            if ((i22 & 306783379) != 306783378) {
                            }
                            if (i31 != 0) {
                            }
                            if (i32 != 0) {
                            }
                            e a112222222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                            u11.o(486052771);
                            if ((i25 & 112) == 32) {
                            }
                            C11 = u11.C();
                            if (!z14) {
                            }
                            C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                            u11.x(C11);
                            u11.k();
                            e a122222222 = androidx.compose.ui.focus.a.a(a112222222, (Function1) C11);
                            int i432222222 = i22 >> 9;
                            int i442222222 = (i432222222 & 7168) | ((i25 >> 15) & 896) | 48 | (i432222222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                            int i452222222 = i33 << 9;
                            int i462222222 = i33 << 3;
                            c3969l = u11;
                            int i472222222 = i22 >> 6;
                            C2475h.c(k11, function1, a122222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i442222222 | (i452222222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i452222222 & 7168) | (i452222222 & 57344) | (458752 & i452222222) | (3670016 & i452222222) | (i462222222 & 234881024) | (i462222222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i472222222) | (i472222222 & 29360128) | (i452222222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                            z15 = z16;
                            i34 = i42;
                            m03 = c3969l.m0();
                            if (m03 != null) {
                            }
                        }
                        if ((i17 & 256) == 0) {
                        }
                        if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        }
                        i22 = i18;
                        if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        }
                        if ((i17 & 2048) == 0) {
                        }
                        int i37222 = i23;
                        if ((i17 & 4096) == 0) {
                        }
                        if ((i17 & 8192) != 0) {
                        }
                        if ((i17 & 16384) == 0) {
                        }
                        j16 = j13;
                        if ((i17 & 32768) != 0) {
                        }
                        if ((i17 & 65536) != 0) {
                        }
                        i24 = i37222;
                        if ((i17 & 131072) == 0) {
                        }
                        if ((i17 & 262144) == 0) {
                        }
                        if ((i17 & 524288) == 0) {
                        }
                        i25 = i24;
                        if ((i17 & 1048576) == 0) {
                        }
                        if ((i17 & 2097152) == 0) {
                        }
                        int i382222222 = i26;
                        if ((i17 & 4194304) == 0) {
                        }
                        if ((i17 & 8388608) == 0) {
                        }
                        if ((i17 & 16777216) == 0) {
                        }
                        if ((i17 & 33554432) != 0) {
                        }
                        if ((i17 & 67108864) != 0) {
                        }
                        if ((i17 & 134217728) != 0) {
                        }
                        i31 = i17 & 268435456;
                        if (i31 != 0) {
                        }
                        i32 = i17 & 536870912;
                        if (i32 != 0) {
                        }
                        i33 = i29;
                        if ((i22 & 306783379) != 306783378) {
                        }
                        if (i31 != 0) {
                        }
                        if (i32 != 0) {
                        }
                        e a1122222222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                        u11.o(486052771);
                        if ((i25 & 112) == 32) {
                        }
                        C11 = u11.C();
                        if (!z14) {
                        }
                        C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                        u11.x(C11);
                        u11.k();
                        e a1222222222 = androidx.compose.ui.focus.a.a(a1122222222, (Function1) C11);
                        int i4322222222 = i22 >> 9;
                        int i4422222222 = (i4322222222 & 7168) | ((i25 >> 15) & 896) | 48 | (i4322222222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                        int i4522222222 = i33 << 9;
                        int i4622222222 = i33 << 3;
                        c3969l = u11;
                        int i4722222222 = i22 >> 6;
                        C2475h.c(k11, function1, a1222222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i4422222222 | (i4522222222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i4522222222 & 7168) | (i4522222222 & 57344) | (458752 & i4522222222) | (3670016 & i4522222222) | (i4622222222 & 234881024) | (i4622222222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i4722222222) | (i4722222222 & 29360128) | (i4522222222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                        z15 = z16;
                        i34 = i42;
                        m03 = c3969l.m0();
                        if (m03 != null) {
                        }
                    }
                    if ((i17 & 32) != 0) {
                    }
                    if ((i17 & 64) != 0) {
                    }
                    if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    }
                    if ((i17 & 256) == 0) {
                    }
                    if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    i22 = i18;
                    if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                    }
                    if ((i17 & 2048) == 0) {
                    }
                    int i372222 = i23;
                    if ((i17 & 4096) == 0) {
                    }
                    if ((i17 & 8192) != 0) {
                    }
                    if ((i17 & 16384) == 0) {
                    }
                    j16 = j13;
                    if ((i17 & 32768) != 0) {
                    }
                    if ((i17 & 65536) != 0) {
                    }
                    i24 = i372222;
                    if ((i17 & 131072) == 0) {
                    }
                    if ((i17 & 262144) == 0) {
                    }
                    if ((i17 & 524288) == 0) {
                    }
                    i25 = i24;
                    if ((i17 & 1048576) == 0) {
                    }
                    if ((i17 & 2097152) == 0) {
                    }
                    int i3822222222 = i26;
                    if ((i17 & 4194304) == 0) {
                    }
                    if ((i17 & 8388608) == 0) {
                    }
                    if ((i17 & 16777216) == 0) {
                    }
                    if ((i17 & 33554432) != 0) {
                    }
                    if ((i17 & 67108864) != 0) {
                    }
                    if ((i17 & 134217728) != 0) {
                    }
                    i31 = i17 & 268435456;
                    if (i31 != 0) {
                    }
                    i32 = i17 & 536870912;
                    if (i32 != 0) {
                    }
                    i33 = i29;
                    if ((i22 & 306783379) != 306783378) {
                    }
                    if (i31 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    e a11222222222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                    u11.o(486052771);
                    if ((i25 & 112) == 32) {
                    }
                    C11 = u11.C();
                    if (!z14) {
                    }
                    C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                    u11.x(C11);
                    u11.k();
                    e a12222222222 = androidx.compose.ui.focus.a.a(a11222222222, (Function1) C11);
                    int i43222222222 = i22 >> 9;
                    int i44222222222 = (i43222222222 & 7168) | ((i25 >> 15) & 896) | 48 | (i43222222222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                    int i45222222222 = i33 << 9;
                    int i46222222222 = i33 << 3;
                    c3969l = u11;
                    int i47222222222 = i22 >> 6;
                    C2475h.c(k11, function1, a12222222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i44222222222 | (i45222222222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i45222222222 & 7168) | (i45222222222 & 57344) | (458752 & i45222222222) | (3670016 & i45222222222) | (i46222222222 & 234881024) | (i46222222222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i47222222222) | (i47222222222 & 29360128) | (i45222222222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                    z15 = z16;
                    i34 = i42;
                    m03 = c3969l.m0();
                    if (m03 != null) {
                    }
                }
                if ((i17 & 16) == 0) {
                }
                if ((i17 & 32) != 0) {
                }
                if ((i17 & 64) != 0) {
                }
                if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                }
                if ((i17 & 256) == 0) {
                }
                if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                i22 = i18;
                if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                }
                if ((i17 & 2048) == 0) {
                }
                int i3722222 = i23;
                if ((i17 & 4096) == 0) {
                }
                if ((i17 & 8192) != 0) {
                }
                if ((i17 & 16384) == 0) {
                }
                j16 = j13;
                if ((i17 & 32768) != 0) {
                }
                if ((i17 & 65536) != 0) {
                }
                i24 = i3722222;
                if ((i17 & 131072) == 0) {
                }
                if ((i17 & 262144) == 0) {
                }
                if ((i17 & 524288) == 0) {
                }
                i25 = i24;
                if ((i17 & 1048576) == 0) {
                }
                if ((i17 & 2097152) == 0) {
                }
                int i38222222222 = i26;
                if ((i17 & 4194304) == 0) {
                }
                if ((i17 & 8388608) == 0) {
                }
                if ((i17 & 16777216) == 0) {
                }
                if ((i17 & 33554432) != 0) {
                }
                if ((i17 & 67108864) != 0) {
                }
                if ((i17 & 134217728) != 0) {
                }
                i31 = i17 & 268435456;
                if (i31 != 0) {
                }
                i32 = i17 & 536870912;
                if (i32 != 0) {
                }
                i33 = i29;
                if ((i22 & 306783379) != 306783378) {
                }
                if (i31 != 0) {
                }
                if (i32 != 0) {
                }
                e a112222222222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
                u11.o(486052771);
                if ((i25 & 112) == 32) {
                }
                C11 = u11.C();
                if (!z14) {
                }
                C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
                u11.x(C11);
                u11.k();
                e a122222222222 = androidx.compose.ui.focus.a.a(a112222222222, (Function1) C11);
                int i432222222222 = i22 >> 9;
                int i442222222222 = (i432222222222 & 7168) | ((i25 >> 15) & 896) | 48 | (i432222222222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
                int i452222222222 = i33 << 9;
                int i462222222222 = i33 << 3;
                c3969l = u11;
                int i472222222222 = i22 >> 6;
                C2475h.c(k11, function1, a122222222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i442222222222 | (i452222222222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i452222222222 & 7168) | (i452222222222 & 57344) | (458752 & i452222222222) | (3670016 & i452222222222) | (i462222222222 & 234881024) | (i462222222222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i472222222222) | (i472222222222 & 29360128) | (i452222222222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
                z15 = z16;
                i34 = i42;
                m03 = c3969l.m0();
                if (m03 != null) {
                }
            }
            str3 = str2;
            i21 = i17 & 8;
            int i362 = UserVerificationMethods.USER_VERIFY_ALL;
            if (i21 != 0) {
            }
            if ((i17 & 16) == 0) {
            }
            if ((i17 & 32) != 0) {
            }
            if ((i17 & 64) != 0) {
            }
            if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            if ((i17 & 256) == 0) {
            }
            if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            i22 = i18;
            if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            }
            if ((i17 & 2048) == 0) {
            }
            int i37222222 = i23;
            if ((i17 & 4096) == 0) {
            }
            if ((i17 & 8192) != 0) {
            }
            if ((i17 & 16384) == 0) {
            }
            j16 = j13;
            if ((i17 & 32768) != 0) {
            }
            if ((i17 & 65536) != 0) {
            }
            i24 = i37222222;
            if ((i17 & 131072) == 0) {
            }
            if ((i17 & 262144) == 0) {
            }
            if ((i17 & 524288) == 0) {
            }
            i25 = i24;
            if ((i17 & 1048576) == 0) {
            }
            if ((i17 & 2097152) == 0) {
            }
            int i382222222222 = i26;
            if ((i17 & 4194304) == 0) {
            }
            if ((i17 & 8388608) == 0) {
            }
            if ((i17 & 16777216) == 0) {
            }
            if ((i17 & 33554432) != 0) {
            }
            if ((i17 & 67108864) != 0) {
            }
            if ((i17 & 134217728) != 0) {
            }
            i31 = i17 & 268435456;
            if (i31 != 0) {
            }
            i32 = i17 & 536870912;
            if (i32 != 0) {
            }
            i33 = i29;
            if ((i22 & 306783379) != 306783378) {
            }
            if (i31 != 0) {
            }
            if (i32 != 0) {
            }
            e a1122222222222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
            u11.o(486052771);
            if ((i25 & 112) == 32) {
            }
            C11 = u11.C();
            if (!z14) {
            }
            C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
            u11.x(C11);
            u11.k();
            e a1222222222222 = androidx.compose.ui.focus.a.a(a1122222222222, (Function1) C11);
            int i4322222222222 = i22 >> 9;
            int i4422222222222 = (i4322222222222 & 7168) | ((i25 >> 15) & 896) | 48 | (i4322222222222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
            int i4522222222222 = i33 << 9;
            int i4622222222222 = i33 << 3;
            c3969l = u11;
            int i4722222222222 = i22 >> 6;
            C2475h.c(k11, function1, a1222222222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i4422222222222 | (i4522222222222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i4522222222222 & 7168) | (i4522222222222 & 57344) | (458752 & i4522222222222) | (3670016 & i4522222222222) | (i4622222222222 & 234881024) | (i4622222222222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i4722222222222) | (i4722222222222 & 29360128) | (i4522222222222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
            z15 = z16;
            i34 = i42;
            m03 = c3969l.m0();
            if (m03 != null) {
            }
        }
        i19 = i17 & 4;
        int i352 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 == 0) {
        }
        str3 = str2;
        i21 = i17 & 8;
        int i3622 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i21 != 0) {
        }
        if ((i17 & 16) == 0) {
        }
        if ((i17 & 32) != 0) {
        }
        if ((i17 & 64) != 0) {
        }
        if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        if ((i17 & 256) == 0) {
        }
        if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        i22 = i18;
        if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
        }
        if ((i17 & 2048) == 0) {
        }
        int i372222222 = i23;
        if ((i17 & 4096) == 0) {
        }
        if ((i17 & 8192) != 0) {
        }
        if ((i17 & 16384) == 0) {
        }
        j16 = j13;
        if ((i17 & 32768) != 0) {
        }
        if ((i17 & 65536) != 0) {
        }
        i24 = i372222222;
        if ((i17 & 131072) == 0) {
        }
        if ((i17 & 262144) == 0) {
        }
        if ((i17 & 524288) == 0) {
        }
        i25 = i24;
        if ((i17 & 1048576) == 0) {
        }
        if ((i17 & 2097152) == 0) {
        }
        int i3822222222222 = i26;
        if ((i17 & 4194304) == 0) {
        }
        if ((i17 & 8388608) == 0) {
        }
        if ((i17 & 16777216) == 0) {
        }
        if ((i17 & 33554432) != 0) {
        }
        if ((i17 & 67108864) != 0) {
        }
        if ((i17 & 134217728) != 0) {
        }
        i31 = i17 & 268435456;
        if (i31 != 0) {
        }
        i32 = i17 & 536870912;
        if (i32 != 0) {
        }
        i33 = i29;
        if ((i22 & 306783379) != 306783378) {
        }
        if (i31 != 0) {
        }
        if (i32 != 0) {
        }
        e a11222222222222 = androidx.compose.ui.focus.i.a(a0.e(eVar, 1.0f), rVar);
        u11.o(486052771);
        if ((i25 & 112) == 32) {
        }
        C11 = u11.C();
        if (!z14) {
        }
        C11 = new FoundationTextAreaKt$TextareaBody$textFieldModifier$1$1(function12);
        u11.x(C11);
        u11.k();
        e a12222222222222 = androidx.compose.ui.focus.a.a(a11222222222222, (Function1) C11);
        int i43222222222222 = i22 >> 9;
        int i44222222222222 = (i43222222222222 & 7168) | ((i25 >> 15) & 896) | 48 | (i43222222222222 & 57344) | ((i22 << 12) & 458752) | ((i25 << 12) & 3670016);
        int i45222222222222 = i33 << 9;
        int i46222222222222 = i33 << 3;
        c3969l = u11;
        int i47222222222222 = i22 >> 6;
        C2475h.c(k11, function1, a12222222222222, z12, z11, T.c(t11, j16, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), n02, m02, false, i12, i11, x11, null, qVar, new l1.K0(j14), DecorationBoxKt.m3016DecorationBoxrw7q5tQ(k11.f(), false, t11, x11, qVar, str, j11, j15, t2, str3, j12, i42, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, e.f40358c0, f7, z16, u11, i44222222222222 | (i45222222222222 & 29360128) | ((i25 << 6) & 234881024) | ((i22 << 21) & 1879048192), ((i25 >> 9) & 14) | 12582912 | ((i33 >> 24) & 112) | ((i25 >> 18) & 896) | (i45222222222222 & 7168) | (i45222222222222 & 57344) | (458752 & i45222222222222) | (3670016 & i45222222222222) | (i46222222222222 & 234881024) | (i46222222222222 & 1879048192), 0), c3969l, (i22 & 14) | ((i25 << 3) & 112) | ((i22 >> 3) & 7168) | ((i22 << 3) & 57344) | (3670016 & i47222222222222) | (i47222222222222 & 29360128) | (i45222222222222 & 1879048192), ((i33 >> 15) & 14) | ((i22 >> 15) & 112) | ((i22 >> 12) & 7168), 4352);
        z15 = z16;
        i34 = i42;
        m03 = c3969l.m0();
        if (m03 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0180  */
    /* renamed from: TrailingIcon-Gi_pv64, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3033TrailingIconGi_pv64(e eVar, e eVar2, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, boolean z11, boolean z12, boolean z13, boolean z14, long j11, AbstractC8972b abstractC8972b2, float f7, boolean z15, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        int i16;
        AbstractC8972b abstractC8972b3;
        int i17;
        int i18;
        float f11;
        int i19;
        int i21;
        boolean z16;
        C3969l c3969l;
        boolean z17;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(123075277);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i15 = i14 | 48;
        } else {
            int i22 = i14;
            if ((i11 & 48) == 0) {
                i15 = i22 | (u11.n(eVar2) ? 32 : 16);
            } else {
                i15 = i22;
            }
        }
        if ((i13 & 4) != 0) {
            i15 |= 384;
        } else if ((i11 & 384) == 0) {
            i15 |= u11.n(abstractC8972b) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i15 |= 3072;
        } else if ((i11 & 3072) == 0) {
            function23 = function2;
            i15 |= u11.F(function23) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i13 & 16) == 0) {
                i15 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i15 |= u11.F(function22) ? 16384 : 8192;
            }
            if ((i13 & 32) == 0) {
                i15 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i15 |= u11.p(z11) ? 131072 : 65536;
            }
            if ((i13 & 64) == 0) {
                i15 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i15 |= u11.p(z12) ? 1048576 : 524288;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                i15 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i15 |= u11.p(z13) ? 8388608 : 4194304;
            }
            if ((i13 & 256) == 0) {
                i15 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                i15 |= u11.p(z14) ? 67108864 : 33554432;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                i15 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                i15 |= u11.s(j11) ? 536870912 : 268435456;
            }
            i16 = i15;
            if ((1024 & i13) == 0) {
                i17 = i12 | 6;
                i18 = 2048;
                abstractC8972b3 = abstractC8972b2;
            } else {
                if ((i12 & 6) == 0) {
                    abstractC8972b3 = abstractC8972b2;
                    i17 = i12 | (u11.n(abstractC8972b3) ? 4 : 2);
                } else {
                    abstractC8972b3 = abstractC8972b2;
                    i17 = i12;
                }
                i18 = 2048;
            }
            if ((i18 & i13) == 0) {
                i17 |= 48;
            } else if ((i12 & 48) == 0) {
                f11 = f7;
                i17 |= u11.q(f11) ? 32 : 16;
                int i23 = i17;
                i19 = i13 & 4096;
                if (i19 != 0) {
                    i21 = i23 | 384;
                } else {
                    int i24 = i23;
                    if ((i12 & 384) == 0) {
                        i24 |= u11.p(z15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i21 = i24;
                }
                if ((i16 & 306783379) != 306783378 && (i21 & 147) == 146 && u11.b()) {
                    u11.j();
                    z17 = z15;
                    c3969l = u11;
                } else {
                    boolean z18 = i19 != 0 ? false : z15;
                    if (!z11) {
                        u11.o(191438443);
                        u11.k();
                        z16 = z18;
                        c3969l = u11;
                    } else if (function22 == null) {
                        u11.o(191572394);
                        int i25 = i16 >> 6;
                        int i26 = i21 << 21;
                        AbstractC8972b abstractC8972b4 = abstractC8972b3;
                        z16 = z18;
                        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24 = function23;
                        float f12 = f11;
                        c3969l = u11;
                        m3031SystemContentWasTKPc(eVar.l0(eVar2), abstractC8972b, function24, !z14, z12, z13, j11, abstractC8972b4, f12, z16, c3969l, ((i16 >> 3) & 1008) | (i25 & 57344) | (i25 & 458752) | ((i16 >> 9) & 3670016) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192), 0);
                        c3969l.k();
                    } else {
                        int i27 = i21;
                        z16 = z18;
                        c3969l = u11;
                        if (z13 || ((z12 && !z14) || abstractC8972b != null)) {
                            c3969l.o(192359050);
                            Y b11 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), c3969l, 0);
                            int I11 = c3969l.I();
                            A0 d11 = c3969l.d();
                            e f13 = androidx.compose.ui.c.f(c3969l, eVar);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, c3969l);
                            if (c3969l.t()) {
                                c3969l.H(a11);
                            } else {
                                c3969l.e();
                            }
                            Function2 h11 = Cm.e.h(c3969l, b11, c3969l, d11);
                            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                                Ep.a.d(I11, c3969l, I11, h11);
                            }
                            F1.b(c3969l, f13, InterfaceC2801g.a.f());
                            e.a aVar = e.f40358c0;
                            int i28 = i16 >> 6;
                            int i29 = ((i16 >> 3) & 1008) | (i28 & 57344) | (i28 & 458752) | ((i16 >> 9) & 3670016);
                            int i31 = i27 << 21;
                            m3031SystemContentWasTKPc(eVar2, abstractC8972b, function2, !z14, z12, z13, j11, abstractC8972b2, f7, z16, c3969l, i29 | (i31 & 29360128) | (i31 & 234881024) | (i31 & 1879048192), 0);
                            function22.invoke(c3969l, Integer.valueOf((i16 >> 12) & 14));
                            c3969l.f();
                            c3969l.k();
                        } else {
                            c3969l.o(192233810);
                            V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
                            int I12 = c3969l.I();
                            A0 d12 = c3969l.d();
                            e f15 = androidx.compose.ui.c.f(c3969l, eVar);
                            Function0 a12 = g.a(InterfaceC2801g.f5440U, c3969l);
                            if (c3969l.t()) {
                                c3969l.H(a12);
                            } else {
                                c3969l.e();
                            }
                            Function2 f16 = E.f(c3969l, f14, c3969l, d12);
                            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                                Ep.a.d(I12, c3969l, I12, f16);
                            }
                            F1.b(c3969l, f15, InterfaceC2801g.a.f());
                            function22.invoke(c3969l, Integer.valueOf((i16 >> 12) & 14));
                            c3969l.f();
                            c3969l.k();
                        }
                    }
                    z17 = z16;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new FoundationTextAreaKt$TrailingIcon$3(eVar, eVar2, abstractC8972b, function2, function22, z11, z12, z13, z14, j11, abstractC8972b2, f7, z17, i11, i12, i13));
                    return;
                }
                return;
            }
            f11 = f7;
            int i232 = i17;
            i19 = i13 & 4096;
            if (i19 != 0) {
            }
            if ((i16 & 306783379) != 306783378) {
            }
            if (i19 != 0) {
            }
            if (!z11) {
            }
            z17 = z16;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        function23 = function2;
        if ((i13 & 16) == 0) {
        }
        if ((i13 & 32) == 0) {
        }
        if ((i13 & 64) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i13 & 256) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        i16 = i15;
        if ((1024 & i13) == 0) {
        }
        if ((i18 & i13) == 0) {
        }
        f11 = f7;
        int i2322 = i17;
        i19 = i13 & 4096;
        if (i19 != 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        if (i19 != 0) {
        }
        if (!z11) {
        }
        z17 = z16;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
