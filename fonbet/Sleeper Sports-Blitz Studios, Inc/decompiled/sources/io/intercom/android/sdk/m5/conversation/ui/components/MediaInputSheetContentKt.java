package io.intercom.android.sdk.m5.conversation.ui.components;

import android.net.Uri;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.component.MediaType;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaInputSheetContent.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"MediaInputSheetContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "onMediaSelected", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "dismissSheet", "Lkotlin/Function0;", "trackClickedInput", "", "inputTypeState", "Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;Landroidx/compose/runtime/Composer;II)V", "MediaInputSheetContentItem", "text", "icon", "", "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MediaInputSheetContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$22(Modifier modifier, Function1 onMediaSelected, Function0 dismissSheet, Function1 trackClickedInput, InputTypeState inputTypeState, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        Intrinsics.checkNotNullParameter(dismissSheet, "$dismissSheet");
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        Intrinsics.checkNotNullParameter(inputTypeState, "$inputTypeState");
        MediaInputSheetContent(modifier, onMediaSelected, dismissSheet, trackClickedInput, inputTypeState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContentItem$lambda$24(String text, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        MediaInputSheetContentItem(text, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void MediaInputSheetContent(Modifier modifier, final Function1<? super List<? extends Uri>, Unit> onMediaSelected, final Function0<Unit> dismissSheet, final Function1<? super String, Unit> trackClickedInput, final InputTypeState inputTypeState, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final Function0<Unit> function0;
        boolean z;
        int i3;
        Intrinsics.checkNotNullParameter(onMediaSelected, "onMediaSelected");
        Intrinsics.checkNotNullParameter(dismissSheet, "dismissSheet");
        Intrinsics.checkNotNullParameter(trackClickedInput, "trackClickedInput");
        Intrinsics.checkNotNullParameter(inputTypeState, "inputTypeState");
        Composer startRestartGroup = composer.startRestartGroup(-842940445);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1878694694);
        startRestartGroup.startReplaceGroup(-1878695438);
        boolean z2 = true;
        if (inputTypeState.getCameraInputEnabled()) {
            CameraInputType cameraInputType = CameraInputType.PHOTO;
            startRestartGroup.startReplaceGroup(2017624231);
            int i4 = (i & 112) ^ 48;
            boolean z3 = (i4 > 32 && startRestartGroup.changed(onMediaSelected)) || (i & 48) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0(Function1.this, (Uri) obj);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(2017628249);
            int i5 = (i & 7168) ^ 3072;
            boolean z4 = (i5 > 2048 && startRestartGroup.changed(trackClickedInput)) || (i & 3072) == 2048;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2(Function1.this);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(2017632787);
            int i6 = (i & 896) ^ 384;
            boolean z5 = (i6 > 256 && startRestartGroup.changed(dismissSheet)) || (i & 384) == 256;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4(Function0.this);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            modifier2 = modifier3;
            i3 = 32;
            z = false;
            CameraInputButtonKt.CameraInputButton(null, cameraInputType, function1, function02, (Function0) rememberedValue3, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m12195getLambda1$intercom_sdk_base_release(), startRestartGroup, 196656, 1);
            CameraInputType cameraInputType2 = CameraInputType.VIDEO;
            startRestartGroup.startReplaceGroup(2017647079);
            boolean z6 = (i4 > 32 && startRestartGroup.changed(onMediaSelected)) || (i & 48) == 32;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(Function1.this, (Uri) obj);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Function1 function12 = (Function1) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(2017651097);
            boolean z7 = (i5 > 2048 && startRestartGroup.changed(trackClickedInput)) || (i & 3072) == 2048;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z7 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8(Function1.this);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Function0 function03 = (Function0) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(2017655635);
            function0 = dismissSheet;
            boolean z8 = (i6 > 256 && startRestartGroup.changed(function0)) || (i & 384) == 256;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(Function0.this);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            CameraInputButtonKt.CameraInputButton(null, cameraInputType2, function12, function03, (Function0) rememberedValue6, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m12196getLambda2$intercom_sdk_base_release(), startRestartGroup, 196656, 1);
        } else {
            modifier2 = modifier3;
            function0 = dismissSheet;
            z = false;
            i3 = 32;
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878648653);
        if (inputTypeState.getMediaInputEnabled()) {
            MediaType mediaType = MediaType.ImageAndVideo;
            Set<String> trustedFileExtensions = inputTypeState.getTrustedFileExtensions();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
            IndicationNodeFactory m3513rippleH2RKhps$default = RippleKt.m3513rippleH2RKhps$default(true, 0.0f, 0L, 6, null);
            startRestartGroup.startReplaceGroup(2017674808);
            boolean z9 = ((((i & 112) ^ 48) <= i3 || !startRestartGroup.changed(onMediaSelected)) && (i & 48) != i3) ? z : true;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(Function1.this, (List) obj);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            Function1 function13 = (Function1) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton2 = topBarButton;
            startRestartGroup.startReplaceGroup(2017682648);
            boolean z10 = ((((i & 7168) ^ 3072) <= 2048 || !startRestartGroup.changed(trackClickedInput)) && (i & 3072) != 2048) ? z : true;
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14(Function1.this);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceGroup();
            MediaPickerButtonKt.MediaPickerButton(1, m3513rippleH2RKhps$default, mediaType, trustedFileExtensions, function13, topBarButton2, (Function0) rememberedValue8, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m12197getLambda3$intercom_sdk_base_release(), startRestartGroup, (MediaPickerButtonCTAStyle.TopBarButton.$stable << 15) | 12587446, 0);
            startRestartGroup = startRestartGroup;
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878620614);
        if (inputTypeState.getFileInputEnabled()) {
            MediaType mediaType2 = MediaType.DocumentOnly;
            Set<String> trustedFileExtensions2 = inputTypeState.getTrustedFileExtensions();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton3 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
            IndicationNodeFactory m3513rippleH2RKhps$default2 = RippleKt.m3513rippleH2RKhps$default(true, 0.0f, 0L, 6, null);
            startRestartGroup.startReplaceGroup(2017704824);
            boolean z11 = ((((i & 112) ^ 48) <= i3 || !startRestartGroup.changed(onMediaSelected)) && (i & 48) != i3) ? z : true;
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(Function1.this, (List) obj);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            Function1 function14 = (Function1) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton4 = topBarButton3;
            startRestartGroup.startReplaceGroup(2017712663);
            if ((((i & 7168) ^ 3072) <= 2048 || !startRestartGroup.changed(trackClickedInput)) && (i & 3072) != 2048) {
                z2 = z;
            }
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18;
                        MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18(Function1.this);
                        return MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            startRestartGroup.endReplaceGroup();
            Composer composer2 = startRestartGroup;
            MediaPickerButtonKt.MediaPickerButton(1, m3513rippleH2RKhps$default2, mediaType2, trustedFileExtensions2, function14, topBarButton4, (Function0) rememberedValue10, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m12198getLambda4$intercom_sdk_base_release(), composer2, (MediaPickerButtonCTAStyle.TopBarButton.$stable << 15) | 12587446, 0);
            startRestartGroup = composer2;
        }
        startRestartGroup.endReplaceGroup();
        Unit unit = Unit.INSTANCE;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0<Unit> function04 = function0;
            final Modifier modifier4 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MediaInputSheetContent$lambda$22;
                    MediaInputSheetContent$lambda$22 = MediaInputSheetContentKt.MediaInputSheetContent$lambda$22(Modifier.this, onMediaSelected, function04, trackClickedInput, inputTypeState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MediaInputSheetContent$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0(Function1 onMediaSelected, Uri uri) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        onMediaSelected.invoke(CollectionsKt.listOfNotNull(uri));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.CAMERA_INPUT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4(Function0 dismissSheet) {
        Intrinsics.checkNotNullParameter(dismissSheet, "$dismissSheet");
        dismissSheet.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(Function1 onMediaSelected, Uri uri) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        onMediaSelected.invoke(CollectionsKt.listOfNotNull(uri));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.CAMERA_INPUT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(Function0 dismissSheet) {
        Intrinsics.checkNotNullParameter(dismissSheet, "$dismissSheet");
        dismissSheet.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(Function1 onMediaSelected, List it) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        Intrinsics.checkNotNullParameter(it, "it");
        onMediaSelected.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.IMAGE_INPUT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(Function1 onMediaSelected, List it) {
        Intrinsics.checkNotNullParameter(onMediaSelected, "$onMediaSelected");
        Intrinsics.checkNotNullParameter(it, "it");
        onMediaSelected.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18(Function1 trackClickedInput) {
        Intrinsics.checkNotNullParameter(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.FILE_INPUT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaInputSheetContentItem(final String str, final int i, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-181831684);
        if ((i2 & 14) == 0) {
            i3 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(56)), 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i, startRestartGroup, (i3 >> 3) & 14), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), 0L, startRestartGroup, 440, 8);
            SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m3901TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, i3 & 14, 0, 262142);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MediaInputSheetContentItem$lambda$24;
                    MediaInputSheetContentItem$lambda$24 = MediaInputSheetContentKt.MediaInputSheetContentItem$lambda$24(str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MediaInputSheetContentItem$lambda$24;
                }
            });
        }
    }
}
