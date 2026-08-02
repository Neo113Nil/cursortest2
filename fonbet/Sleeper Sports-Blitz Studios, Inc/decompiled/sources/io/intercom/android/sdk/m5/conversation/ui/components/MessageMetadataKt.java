package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MessageMetadata.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"MessageMetadata", "", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "suffix", "timestamp", "", "(Ljava/util/List;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Long;Landroidx/compose/runtime/Composer;II)V", "MessageMetadataPreview", "(Landroidx/compose/runtime/Composer;I)V", "MessageMetadataLongTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageMetadataKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadata$lambda$5(List avatars, String title, Modifier modifier, String str, Long l, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(title, "$title");
        MessageMetadata(avatars, title, modifier, str, l, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadataLongTextPreview$lambda$7(int i, Composer composer, int i2) {
        MessageMetadataLongTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadataPreview$lambda$6(int i, Composer composer, int i2) {
        MessageMetadataPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MessageMetadata(final List<AvatarWrapper> avatars, final String title, Modifier modifier, String str, Long l, Composer composer, final int i, final int i2) {
        Composer composer2;
        Object obj;
        long j;
        boolean z;
        Composer composer3;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(1631390024);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        String str2 = (i2 & 8) != 0 ? null : str;
        Long l2 = (i2 & 16) != 0 ? null : l;
        TextStyle m8245copyp1EtxEg$default = TextStyle.m8245copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        float f = 4;
        Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1016spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(1642417258);
        if (!avatars.isEmpty()) {
            AvatarGroupKt.m12024AvatarGroupJ8mCjc(avatars, PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m8798constructorimpl(f), 0.0f, 11, null), Dp.m8798constructorimpl(24), 0L, startRestartGroup, 440, 8);
        }
        startRestartGroup.endReplaceGroup();
        final Modifier modifier3 = modifier2;
        TextKt.m3901TextNvy7gAk(title, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 1, 0, null, m8245copyp1EtxEg$default, startRestartGroup, (i >> 3) & 14, 24960, 110588);
        Composer composer4 = startRestartGroup;
        composer4.startReplaceGroup(1642431398);
        if (str2 == null) {
            obj = null;
        } else {
            composer4.startReplaceGroup(1642431772);
            if (StringsKt.isBlank(title)) {
                composer2 = composer4;
                obj = null;
            } else {
                composer2 = composer4;
                obj = null;
                TextKt.m3901TextNvy7gAk("•", SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit MessageMetadata$lambda$4$lambda$1$lambda$0;
                        MessageMetadata$lambda$4$lambda$1$lambda$0 = MessageMetadataKt.MessageMetadata$lambda$4$lambda$1$lambda$0((SemanticsPropertyReceiver) obj2);
                        return MessageMetadata$lambda$4$lambda$1$lambda$0;
                    }
                }, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m8245copyp1EtxEg$default, composer2, 6, 0, 131068);
            }
            composer2.endReplaceGroup();
            TextKt.m3901TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 1, 0, null, m8245copyp1EtxEg$default, composer2, 0, 24960, 110590);
            composer4 = composer2;
        }
        composer4.endReplaceGroup();
        composer4.startReplaceGroup(1642448818);
        if (l2 == null) {
            composer3 = composer4;
        } else {
            long longValue = l2.longValue();
            composer4.startReplaceGroup(1642449084);
            if (!StringsKt.isBlank(title) || (str2 != null && (!StringsKt.isBlank(str2)))) {
                Composer composer5 = composer4;
                j = longValue;
                z = false;
                TextKt.m3901TextNvy7gAk("•", SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit MessageMetadata$lambda$4$lambda$3$lambda$2;
                        MessageMetadata$lambda$4$lambda$3$lambda$2 = MessageMetadataKt.MessageMetadata$lambda$4$lambda$3$lambda$2((SemanticsPropertyReceiver) obj2);
                        return MessageMetadata$lambda$4$lambda$3$lambda$2;
                    }
                }, 1, obj), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m8245copyp1EtxEg$default, composer5, 6, 0, 131068);
                composer4 = composer5;
            } else {
                j = longValue;
                z = false;
            }
            composer4.endReplaceGroup();
            Modifier weight = rowScopeInstance.weight(Modifier.INSTANCE, 0.5f, z);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer4.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer3 = composer4;
            TextKt.m3901TextNvy7gAk(TimeFormatterExtKt.formattedDateFromLong(j, (Context) consume), weight, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 1, 0, null, m8245copyp1EtxEg$default, composer3, 0, 24960, 110588);
        }
        composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            final String str3 = str2;
            final Long l3 = l2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit MessageMetadata$lambda$5;
                    MessageMetadata$lambda$5 = MessageMetadataKt.MessageMetadata$lambda$5(avatars, title, modifier3, str3, l3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return MessageMetadata$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadata$lambda$4$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadata$lambda$4$lambda$3$lambda$2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "");
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void MessageMetadataPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1316869201);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m12204getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessageMetadataPreview$lambda$6;
                    MessageMetadataPreview$lambda$6 = MessageMetadataKt.MessageMetadataPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MessageMetadataPreview$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void MessageMetadataLongTextPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-764241754);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m12206getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessageMetadataLongTextPreview$lambda$7;
                    MessageMetadataLongTextPreview$lambda$7 = MessageMetadataKt.MessageMetadataLongTextPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MessageMetadataLongTextPreview$lambda$7;
                }
            });
        }
    }
}
