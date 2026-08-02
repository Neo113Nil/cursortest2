package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import K1.T;
import Q1.X;
import S0.InterfaceC3967k;
import a1.C4912a;
import a1.c;
import androidx.compose.ui.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import t0.o;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0095\u0001\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.VALUE, "LK1/T;", "valueTextStyle", "LQ1/X;", "visualTransformation", "Lt0/o;", "interactionSource", "label", "Ll1/Z;", "labelColor", "labelTextStyle", "Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "labelPosition", HammersV3BodyDTO.PLACEHOLDER, "placeholderColor", "Landroidx/compose/ui/e;", "labelModifier", "placeholderModifier", "innerTextFieldModifier", "Lu0/x;", "contentPadding", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "DecorationBox-yr6d_t4", "(Ljava/lang/String;LK1/T;LQ1/X;Lt0/o;Ljava/lang/String;JLK1/T;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;Ljava/lang/String;JLandroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lu0/x;LS0/k;II)Lfd/n;", "DecorationBox", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecorationBoxKt {
    @NotNull
    /* renamed from: DecorationBox-yr6d_t4, reason: not valid java name */
    public static final InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> m1747DecorationBoxyr6d_t4(@NotNull String value, @NotNull T valueTextStyle, @NotNull X visualTransformation, @NotNull o interactionSource, String str, long j11, @NotNull T labelTextStyle, @NotNull DsInputLabelPosition labelPosition, String str2, long j12, @NotNull e labelModifier, @NotNull e placeholderModifier, @NotNull e innerTextFieldModifier, @NotNull InterfaceC9914x contentPadding, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(labelModifier, "labelModifier");
        Intrinsics.checkNotNullParameter(placeholderModifier, "placeholderModifier");
        Intrinsics.checkNotNullParameter(innerTextFieldModifier, "innerTextFieldModifier");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        interfaceC3967k.o(1863918672);
        C4912a c11 = c.c(1351065730, new DecorationBoxKt$DecorationBox$1(str, str2, value, visualTransformation, interactionSource, labelPosition, contentPadding, labelModifier, j11, labelTextStyle, placeholderModifier, j12, valueTextStyle, innerTextFieldModifier), interfaceC3967k);
        interfaceC3967k.k();
        return c11;
    }
}
