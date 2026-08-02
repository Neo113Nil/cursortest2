package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.models.Weight;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class EventRowKt$EventRow$1 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ AvatarWrapper $avatar;
    final /* synthetic */ float $avatarSize;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ List<EventLabelSegment> $labelSegments;
    final /* synthetic */ TextStyle $textStyle;

    /* compiled from: EventRow.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Weight.values().length];
            try {
                iArr[Weight.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Weight.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Weight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Weight.SEMI_BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Weight.BOLD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    EventRowKt$EventRow$1(float f, AvatarWrapper avatarWrapper, String str, TextStyle textStyle, List<EventLabelSegment> list) {
        this.$avatarSize = f;
        this.$avatar = avatarWrapper;
        this.$contentDescription = str;
        this.$textStyle = textStyle;
        this.$labelSegments = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        FontWeight normal;
        long m13101getDescriptionText0d7_KjU;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            AvatarIconKt.m12134AvatarIconRd90Nhg(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, this.$avatarSize), this.$avatar, null, false, 0L, Color.m6029boximpl(ColorKt.Color(4294046193L)), composer, 196678, 28);
            composer.startReplaceGroup(-1441488026);
            List<EventLabelSegment> list = this.$labelSegments;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composer.startReplaceGroup(-1441486517);
            for (EventLabelSegment eventLabelSegment : list) {
                Weight weight = eventLabelSegment.getWeight();
                int i2 = weight == null ? -1 : WhenMappings.$EnumSwitchMapping$0[weight.ordinal()];
                if (i2 == -1) {
                    normal = FontWeight.INSTANCE.getNormal();
                } else if (i2 == 1) {
                    normal = FontWeight.INSTANCE.getNormal();
                } else if (i2 == 2) {
                    normal = FontWeight.INSTANCE.getLight();
                } else if (i2 == 3) {
                    normal = FontWeight.INSTANCE.getMedium();
                } else if (i2 == 4) {
                    normal = FontWeight.INSTANCE.getSemiBold();
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    normal = FontWeight.INSTANCE.getBold();
                }
                FontWeight fontWeight = normal;
                if (eventLabelSegment.getWeight() != null && eventLabelSegment.getWeight() != Weight.REGULAR) {
                    composer.startReplaceGroup(1299792498);
                    m13101getDescriptionText0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1299869998);
                    m13101getDescriptionText0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU();
                    composer.endReplaceGroup();
                }
                int pushStyle = builder.pushStyle(new SpanStyle(m13101getDescriptionText0d7_KjU, 0L, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
                try {
                    builder.append(eventLabelSegment.getText());
                    Unit unit = Unit.INSTANCE;
                } finally {
                    builder.pop(pushStyle);
                }
            }
            composer.endReplaceGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composer.endReplaceGroup();
            int m8654getCentere0LSkKk = TextAlign.INSTANCE.m8654getCentere0LSkKk();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1441447434);
            boolean changed = composer.changed(this.$contentDescription);
            final String str = this.$contentDescription;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$EventRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$4$lambda$3;
                        invoke$lambda$4$lambda$3 = EventRowKt$EventRow$1.invoke$lambda$4$lambda$3(str, (SemanticsPropertyReceiver) obj);
                        return invoke$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            TextKt.m3902TextZ58ophY(annotatedString, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(m8654getCentere0LSkKk), 0L, 0, false, 0, 0, null, null, this.$textStyle, composer, 0, 0, 261116);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(String contentDescription, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, contentDescription);
        return Unit.INSTANCE;
    }
}
