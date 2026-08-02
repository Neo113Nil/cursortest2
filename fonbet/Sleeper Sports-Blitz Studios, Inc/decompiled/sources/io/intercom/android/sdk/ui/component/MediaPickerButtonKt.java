package io.intercom.android.sdk.ui.component;

import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MediaPickerButton.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u008d\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001c2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\u001f\u001a\u0006\u0010 \u001a\u00020!\u001a\r\u0010\"\u001a\u00020\nH\u0003¢\u0006\u0002\u0010#\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006$"}, d2 = {"defaultTrustedImageExtensions", "", "", "defaultTrustedVideoExtensions", "defaultTrustedDocumentExtensions", "defaultTrustedAudioExtensions", "defaultTrustedFileExtensions", "getDefaultTrustedFileExtensions", "()Ljava/util/Set;", "MediaPickerButton", "", "maxSelection", "", "indication", "Landroidx/compose/foundation/Indication;", "mediaType", "Lio/intercom/android/sdk/ui/component/MediaType;", "trustedFileExtensions", "onResult", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uris", "mediaPickerButtonCTAStyle", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "(ILandroidx/compose/foundation/Indication;Lio/intercom/android/sdk/ui/component/MediaType;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isPhotoPickerAvailable", "", "MediaPickerButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MediaPickerButtonKt {
    private static final Set<String> defaultTrustedAudioExtensions;
    private static final Set<String> defaultTrustedDocumentExtensions;
    private static final Set<String> defaultTrustedFileExtensions;
    private static final Set<String> defaultTrustedImageExtensions;
    private static final Set<String> defaultTrustedVideoExtensions;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$7(int i, Indication indication, MediaType mediaType, Set set, Function1 onResult, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, Function0 function0, Function2 content, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(mediaPickerButtonCTAStyle, "$mediaPickerButtonCTAStyle");
        Intrinsics.checkNotNullParameter(content, "$content");
        MediaPickerButton(i, indication, mediaType, set, onResult, mediaPickerButtonCTAStyle, function0, content, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButtonPreview$lambda$8(int i, Composer composer, int i2) {
        MediaPickerButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        Set<String> of = SetsKt.setOf((Object[]) new String[]{"gif", "jpeg", "jpg", "png", "heic", "dng"});
        defaultTrustedImageExtensions = of;
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{RRWebVideoEvent.REPLAY_CONTAINER, "mov"});
        defaultTrustedVideoExtensions = of2;
        Set<String> of3 = SetsKt.setOf((Object[]) new String[]{"pdf", "txt"});
        defaultTrustedDocumentExtensions = of3;
        Set<String> of4 = SetsKt.setOf((Object[]) new String[]{"oga", "ogg"});
        defaultTrustedAudioExtensions = of4;
        defaultTrustedFileExtensions = SetsKt.plus(SetsKt.plus(SetsKt.plus((Set) of, (Iterable) of2), (Iterable) of3), (Iterable) of4);
    }

    public static final Set<String> getDefaultTrustedFileExtensions() {
        return defaultTrustedFileExtensions;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MediaPickerButton(final int i, Indication indication, MediaType mediaType, Set<String> set, final Function1<? super List<? extends Uri>, Unit> onResult, final MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        int i4;
        Indication indication2;
        MediaType mediaType2;
        int i5;
        int i6;
        int i7;
        final Function0<Unit> function02;
        final Set<String> set2;
        Indication indication3;
        Object rememberedValue;
        boolean z;
        Object rememberedValue2;
        Object rememberedValue3;
        int hashCode;
        Composer m5333constructorimpl;
        final Indication indication4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(mediaPickerButtonCTAStyle, "mediaPickerButtonCTAStyle");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1770734349);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                indication2 = indication;
                if (startRestartGroup.changed(indication2)) {
                    i9 = 32;
                    i4 |= i9;
                }
            } else {
                indication2 = indication;
            }
            i9 = 16;
            i4 |= i9;
        } else {
            indication2 = indication;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            mediaType2 = mediaType;
            i4 |= startRestartGroup.changed(mediaType2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 != 0) {
                i4 |= 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 57344) == 0) {
                i4 |= startRestartGroup.changedInstance(onResult) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((458752 & i2) == 0) {
                    i6 = startRestartGroup.changed(mediaPickerButtonCTAStyle) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((3670016 & i2) == 0) {
                    function02 = function0;
                    i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    if ((i3 & 128) != 0) {
                        i8 = (29360128 & i2) == 0 ? startRestartGroup.changedInstance(content) ? 8388608 : 4194304 : 12582912;
                        if (i5 == 8 || (i4 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if ((i3 & 2) != 0) {
                                    ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localIndication);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    indication2 = (Indication) consume;
                                    i4 &= -113;
                                }
                                if (i10 != 0) {
                                    mediaType2 = MediaType.All;
                                }
                                if (i5 != 0) {
                                    set2 = defaultTrustedFileExtensions;
                                    i4 &= -7169;
                                } else {
                                    set2 = set;
                                }
                                if (i7 != 0) {
                                    indication3 = indication2;
                                    function02 = new Function0() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.endDefaults();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    PreviewMediaContract previewMediaContract = new PreviewMediaContract();
                                    startRestartGroup.startReplaceGroup(-2009946895);
                                    z = (i4 & 57344) != 16384;
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit MediaPickerButton$lambda$2$lambda$1;
                                                MediaPickerButton$lambda$2$lambda$1 = MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(Function1.this, (List) obj);
                                                return MediaPickerButton$lambda$2$lambda$1;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(previewMediaContract, (Function1) rememberedValue2, startRestartGroup, 0);
                                    final ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new IntercomMediaPicker(mediaType2, set2, i), new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit MediaPickerButton$lambda$3;
                                            MediaPickerButton$lambda$3 = MediaPickerButtonKt.MediaPickerButton$lambda$3(CoroutineScope.this, onResult, rememberLauncherForActivityResult, mediaPickerButtonCTAStyle, (List) obj);
                                            return MediaPickerButton$lambda$3;
                                        }
                                    }, startRestartGroup, 8);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    startRestartGroup.startReplaceGroup(-2009910284);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier m619clickableO2vRcR0$default = ClickableKt.m619clickableO2vRcR0$default(companion, (MutableInteractionSource) rememberedValue3, indication3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit MediaPickerButton$lambda$5;
                                            MediaPickerButton$lambda$5 = MediaPickerButtonKt.MediaPickerButton$lambda$5(Function0.this, rememberLauncherForActivityResult2);
                                            return MediaPickerButton$lambda$5;
                                        }
                                    }, 28, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m619clickableO2vRcR0$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i11 = i4;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                                    Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                    }
                                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    content.invoke(startRestartGroup, Integer.valueOf((i11 >> 21) & 14));
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    indication4 = indication3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 2) != 0) {
                                    i4 &= -113;
                                }
                                if (i5 != 0) {
                                    i4 &= -7169;
                                }
                                set2 = set;
                            }
                            indication3 = indication2;
                            startRestartGroup.endDefaults();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            PreviewMediaContract previewMediaContract2 = new PreviewMediaContract();
                            startRestartGroup.startReplaceGroup(-2009946895);
                            if ((i4 & 57344) != 16384) {
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z) {
                            }
                            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit MediaPickerButton$lambda$2$lambda$1;
                                    MediaPickerButton$lambda$2$lambda$1 = MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(Function1.this, (List) obj);
                                    return MediaPickerButton$lambda$2$lambda$1;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceGroup();
                            final ManagedActivityResultLauncher rememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(previewMediaContract2, (Function1) rememberedValue2, startRestartGroup, 0);
                            final ManagedActivityResultLauncher rememberLauncherForActivityResult22 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new IntercomMediaPicker(mediaType2, set2, i), new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit MediaPickerButton$lambda$3;
                                    MediaPickerButton$lambda$3 = MediaPickerButtonKt.MediaPickerButton$lambda$3(CoroutineScope.this, onResult, rememberLauncherForActivityResult3, mediaPickerButtonCTAStyle, (List) obj);
                                    return MediaPickerButton$lambda$3;
                                }
                            }, startRestartGroup, 8);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            startRestartGroup.startReplaceGroup(-2009910284);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier m619clickableO2vRcR0$default2 = ClickableKt.m619clickableO2vRcR0$default(companion2, (MutableInteractionSource) rememberedValue3, indication3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit MediaPickerButton$lambda$5;
                                    MediaPickerButton$lambda$5 = MediaPickerButtonKt.MediaPickerButton$lambda$5(Function0.this, rememberLauncherForActivityResult22);
                                    return MediaPickerButton$lambda$5;
                                }
                            }, 28, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m619clickableO2vRcR0$default2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            int i112 = i4;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m5333constructorimpl.getInserting()) {
                            }
                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            content.invoke(startRestartGroup, Integer.valueOf((i112 >> 21) & 14));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            indication4 = indication3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            set2 = set;
                            indication4 = indication2;
                        }
                        final MediaType mediaType3 = mediaType2;
                        final Function0<Unit> function03 = function02;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit MediaPickerButton$lambda$7;
                                    MediaPickerButton$lambda$7 = MediaPickerButtonKt.MediaPickerButton$lambda$7(i, indication4, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, function03, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return MediaPickerButton$lambda$7;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= i8;
                    if (i5 == 8) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    indication3 = indication2;
                    startRestartGroup.endDefaults();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    PreviewMediaContract previewMediaContract22 = new PreviewMediaContract();
                    startRestartGroup.startReplaceGroup(-2009946895);
                    if ((i4 & 57344) != 16384) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit MediaPickerButton$lambda$2$lambda$1;
                            MediaPickerButton$lambda$2$lambda$1 = MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(Function1.this, (List) obj);
                            return MediaPickerButton$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    final ManagedActivityResultLauncher rememberLauncherForActivityResult32 = ActivityResultRegistryKt.rememberLauncherForActivityResult(previewMediaContract22, (Function1) rememberedValue2, startRestartGroup, 0);
                    final ManagedActivityResultLauncher rememberLauncherForActivityResult222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new IntercomMediaPicker(mediaType2, set2, i), new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit MediaPickerButton$lambda$3;
                            MediaPickerButton$lambda$3 = MediaPickerButtonKt.MediaPickerButton$lambda$3(CoroutineScope.this, onResult, rememberLauncherForActivityResult32, mediaPickerButtonCTAStyle, (List) obj);
                            return MediaPickerButton$lambda$3;
                        }
                    }, startRestartGroup, 8);
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceGroup(-2009910284);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m619clickableO2vRcR0$default22 = ClickableKt.m619clickableO2vRcR0$default(companion22, (MutableInteractionSource) rememberedValue3, indication3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MediaPickerButton$lambda$5;
                            MediaPickerButton$lambda$5 = MediaPickerButtonKt.MediaPickerButton$lambda$5(Function0.this, rememberLauncherForActivityResult222);
                            return MediaPickerButton$lambda$5;
                        }
                    }, 28, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m619clickableO2vRcR0$default22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    int i1122 = i4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting()) {
                    }
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    content.invoke(startRestartGroup, Integer.valueOf((i1122 >> 21) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    indication4 = indication3;
                    final MediaType mediaType32 = mediaType2;
                    final Function0 function032 = function02;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function02 = function0;
                if ((i3 & 128) != 0) {
                }
                i4 |= i8;
                if (i5 == 8) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if ((i3 & 2) != 0) {
                }
                if (i10 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                indication3 = indication2;
                startRestartGroup.endDefaults();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                PreviewMediaContract previewMediaContract222 = new PreviewMediaContract();
                startRestartGroup.startReplaceGroup(-2009946895);
                if ((i4 & 57344) != 16384) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MediaPickerButton$lambda$2$lambda$1;
                        MediaPickerButton$lambda$2$lambda$1 = MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(Function1.this, (List) obj);
                        return MediaPickerButton$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                final ManagedActivityResultLauncher rememberLauncherForActivityResult322 = ActivityResultRegistryKt.rememberLauncherForActivityResult(previewMediaContract222, (Function1) rememberedValue2, startRestartGroup, 0);
                final ManagedActivityResultLauncher rememberLauncherForActivityResult2222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new IntercomMediaPicker(mediaType2, set2, i), new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MediaPickerButton$lambda$3;
                        MediaPickerButton$lambda$3 = MediaPickerButtonKt.MediaPickerButton$lambda$3(CoroutineScope.this, onResult, rememberLauncherForActivityResult322, mediaPickerButtonCTAStyle, (List) obj);
                        return MediaPickerButton$lambda$3;
                    }
                }, startRestartGroup, 8);
                Modifier.Companion companion222 = Modifier.INSTANCE;
                startRestartGroup.startReplaceGroup(-2009910284);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier m619clickableO2vRcR0$default222 = ClickableKt.m619clickableO2vRcR0$default(companion222, (MutableInteractionSource) rememberedValue3, indication3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MediaPickerButton$lambda$5;
                        MediaPickerButton$lambda$5 = MediaPickerButtonKt.MediaPickerButton$lambda$5(Function0.this, rememberLauncherForActivityResult2222);
                        return MediaPickerButton$lambda$5;
                    }
                }, 28, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m619clickableO2vRcR0$default222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                int i11222 = i4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting()) {
                }
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash222);
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                content.invoke(startRestartGroup, Integer.valueOf((i11222 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                indication4 = indication3;
                final MediaType mediaType322 = mediaType2;
                final Function0 function0322 = function02;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 |= i6;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            function02 = function0;
            if ((i3 & 128) != 0) {
            }
            i4 |= i8;
            if (i5 == 8) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if ((i3 & 2) != 0) {
            }
            if (i10 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            indication3 = indication2;
            startRestartGroup.endDefaults();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final CoroutineScope coroutineScope2222 = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            PreviewMediaContract previewMediaContract2222 = new PreviewMediaContract();
            startRestartGroup.startReplaceGroup(-2009946895);
            if ((i4 & 57344) != 16384) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit MediaPickerButton$lambda$2$lambda$1;
                    MediaPickerButton$lambda$2$lambda$1 = MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(Function1.this, (List) obj);
                    return MediaPickerButton$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            final ManagedActivityResultLauncher rememberLauncherForActivityResult3222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(previewMediaContract2222, (Function1) rememberedValue2, startRestartGroup, 0);
            final ManagedActivityResultLauncher rememberLauncherForActivityResult22222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new IntercomMediaPicker(mediaType2, set2, i), new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit MediaPickerButton$lambda$3;
                    MediaPickerButton$lambda$3 = MediaPickerButtonKt.MediaPickerButton$lambda$3(CoroutineScope.this, onResult, rememberLauncherForActivityResult3222, mediaPickerButtonCTAStyle, (List) obj);
                    return MediaPickerButton$lambda$3;
                }
            }, startRestartGroup, 8);
            Modifier.Companion companion2222 = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(-2009910284);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier m619clickableO2vRcR0$default2222 = ClickableKt.m619clickableO2vRcR0$default(companion2222, (MutableInteractionSource) rememberedValue3, indication3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MediaPickerButton$lambda$5;
                    MediaPickerButton$lambda$5 = MediaPickerButtonKt.MediaPickerButton$lambda$5(Function0.this, rememberLauncherForActivityResult22222);
                    return MediaPickerButton$lambda$5;
                }
            }, 28, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m619clickableO2vRcR0$default2222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            int i112222 = i4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2222);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            content.invoke(startRestartGroup, Integer.valueOf((i112222 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            indication4 = indication3;
            final MediaType mediaType3222 = mediaType2;
            final Function0 function03222 = function02;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        mediaType2 = mediaType;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i6;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        function02 = function0;
        if ((i3 & 128) != 0) {
        }
        i4 |= i8;
        if (i5 == 8) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if ((i3 & 2) != 0) {
        }
        if (i10 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        indication3 = indication2;
        startRestartGroup.endDefaults();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final CoroutineScope coroutineScope22222 = (CoroutineScope) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        PreviewMediaContract previewMediaContract22222 = new PreviewMediaContract();
        startRestartGroup.startReplaceGroup(-2009946895);
        if ((i4 & 57344) != 16384) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MediaPickerButton$lambda$2$lambda$1;
                MediaPickerButton$lambda$2$lambda$1 = MediaPickerButtonKt.MediaPickerButton$lambda$2$lambda$1(Function1.this, (List) obj);
                return MediaPickerButton$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        final ManagedActivityResultLauncher rememberLauncherForActivityResult32222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(previewMediaContract22222, (Function1) rememberedValue2, startRestartGroup, 0);
        final ManagedActivityResultLauncher rememberLauncherForActivityResult222222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new IntercomMediaPicker(mediaType2, set2, i), new Function1() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MediaPickerButton$lambda$3;
                MediaPickerButton$lambda$3 = MediaPickerButtonKt.MediaPickerButton$lambda$3(CoroutineScope.this, onResult, rememberLauncherForActivityResult32222, mediaPickerButtonCTAStyle, (List) obj);
                return MediaPickerButton$lambda$3;
            }
        }, startRestartGroup, 8);
        Modifier.Companion companion22222 = Modifier.INSTANCE;
        startRestartGroup.startReplaceGroup(-2009910284);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m619clickableO2vRcR0$default22222 = ClickableKt.m619clickableO2vRcR0$default(companion22222, (MutableInteractionSource) rememberedValue3, indication3, false, null, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MediaPickerButton$lambda$5;
                MediaPickerButton$lambda$5 = MediaPickerButtonKt.MediaPickerButton$lambda$5(Function0.this, rememberLauncherForActivityResult222222);
                return MediaPickerButton$lambda$5;
            }
        }, 28, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m619clickableO2vRcR0$default22222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        int i1122222 = i4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22222);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        content.invoke(startRestartGroup, Integer.valueOf((i1122222 >> 21) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        indication4 = indication3;
        final MediaType mediaType32222 = mediaType2;
        final Function0 function032222 = function02;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$2$lambda$1(Function1 onResult, List it) {
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(it, "it");
        onResult.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$3(CoroutineScope scope, Function1 onResult, ManagedActivityResultLauncher previewLauncher, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, List it) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(previewLauncher, "$previewLauncher");
        Intrinsics.checkNotNullParameter(mediaPickerButtonCTAStyle, "$mediaPickerButtonCTAStyle");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(previewLauncher, it, mediaPickerButtonCTAStyle, null), 3, null);
        } else {
            onResult.invoke(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MediaPickerButton$lambda$5(Function0 function0, ManagedActivityResultLauncher pickerLauncher) {
        Intrinsics.checkNotNullParameter(pickerLauncher, "$pickerLauncher");
        function0.invoke();
        pickerLauncher.launch(ApiConstant.ALL_MEDIA_TYPE);
        return Unit.INSTANCE;
    }

    public static final boolean isPhotoPickerAvailable() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion >= 2) {
                return true;
            }
        }
        return false;
    }

    private static final void MediaPickerButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-158042907);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m12901getLambda3$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.MediaPickerButtonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MediaPickerButtonPreview$lambda$8;
                    MediaPickerButtonPreview$lambda$8 = MediaPickerButtonKt.MediaPickerButtonPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MediaPickerButtonPreview$lambda$8;
                }
            });
        }
    }
}
