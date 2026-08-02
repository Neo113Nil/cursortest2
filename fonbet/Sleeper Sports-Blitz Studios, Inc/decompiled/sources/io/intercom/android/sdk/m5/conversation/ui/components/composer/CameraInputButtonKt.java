package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.SentryStackFrame;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: CameraInputButton.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aw\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"CameraInputButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "cameraInputType", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/CameraInputType;", "onResult", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "performWithOnClick", "Lkotlin/Function0;", "onPermissionDenied", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/CameraInputType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "getUriByFileName", "context", "Landroid/content/Context;", "fileName", "", "folderName", "hasCameraPermissionInManifest", "", "intercom-sdk-base_release", "latestFileName", "showDialog"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraInputButtonKt {

    /* compiled from: CameraInputButton.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraInputType.values().length];
            try {
                iArr[CameraInputType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraInputType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$15(Modifier modifier, CameraInputType cameraInputType, Function1 onResult, Function0 function0, Function0 function02, Function2 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(cameraInputType, "$cameraInputType");
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(content, "$content");
        CameraInputButton(modifier, cameraInputType, onResult, function0, function02, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CameraInputButton(Modifier modifier, final CameraInputType cameraInputType, final Function1<? super Uri, Unit> onResult, Function0<Unit> function0, Function0<Unit> function02, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function03;
        int i4;
        Function0<Unit> function04;
        int i5;
        int i6;
        Object rememberedValue;
        int i7;
        final String str;
        Object rememberedValue2;
        final MutableState mutableState;
        Composer composer2;
        MutableState mutableState2;
        int i8;
        int hashCode;
        Composer m5333constructorimpl;
        final Function0<Unit> function05;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(cameraInputType, "cameraInputType");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2022676727);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(cameraInputType) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onResult) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                function04 = function02;
                i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i5 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    i6 = i3;
                    if ((i6 & 374491) == 74898 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i10 != 0) {
                            function03 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            };
                        }
                        final Function0<Unit> function06 = i4 == 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        } : function04;
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context context = (Context) consume;
                        startRestartGroup.startReplaceGroup(-845514337);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final MutableState mutableState3 = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        i7 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                        if (i7 != 1) {
                            str = "videos";
                        } else {
                            if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = DebugMeta.JsonKeys.IMAGES;
                        }
                        final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.StartActivityForResult(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit CameraInputButton$lambda$5;
                                CameraInputButton$lambda$5 = CameraInputButtonKt.CameraInputButton$lambda$5(Function1.this, context, str, mutableState3, (ActivityResult) obj);
                                return CameraInputButton$lambda$5;
                            }
                        }, startRestartGroup, 8);
                        startRestartGroup.startReplaceGroup(-845473406);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        mutableState = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-845471236);
                        if (CameraInputButton$lambda$7(mutableState)) {
                            composer2 = startRestartGroup;
                            mutableState2 = mutableState;
                            i8 = 8;
                        } else {
                            String obj = Phrase.from(context, R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                            String stringResource = StringResources_androidKt.stringResource(R.string.intercom_settings, startRestartGroup, 0);
                            String stringResource2 = StringResources_androidKt.stringResource(R.string.intercom_not_now, startRestartGroup, 0);
                            Integer valueOf = Integer.valueOf(R.drawable.intercom_ic_camera);
                            startRestartGroup.startReplaceGroup(-845454121);
                            boolean z = (i6 & 57344) == 16384;
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit CameraInputButton$lambda$10$lambda$9;
                                        CameraInputButton$lambda$10$lambda$9 = CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(Function0.this, mutableState);
                                        return CameraInputButton$lambda$10$lambda$9;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceGroup();
                            mutableState2 = mutableState;
                            i8 = 8;
                            PermissionDeniedDialogKt.PermissionDeniedDialog(null, obj, stringResource, stringResource2, valueOf, (Function0) rememberedValue3, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit CameraInputButton$lambda$11;
                                    CameraInputButton$lambda$11 = CameraInputButtonKt.CameraInputButton$lambda$11(context, mutableState);
                                    return CameraInputButton$lambda$11;
                                }
                            }, startRestartGroup, 0, 1);
                            composer2 = startRestartGroup;
                        }
                        composer2.endReplaceGroup();
                        final MutableState mutableState4 = mutableState2;
                        int i11 = i8;
                        final String str2 = str;
                        function04 = function06;
                        final ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit CameraInputButton$lambda$12;
                                CameraInputButton$lambda$12 = CameraInputButtonKt.CameraInputButton$lambda$12(CameraInputType.this, context, str2, rememberLauncherForActivityResult, mutableState3, mutableState4, ((Boolean) obj2).booleanValue());
                                return CameraInputButton$lambda$12;
                            }
                        }, composer2, i11);
                        final Function0<Unit> function07 = function03;
                        Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(modifier4, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CameraInputButton$lambda$13;
                                CameraInputButton$lambda$13 = CameraInputButtonKt.CameraInputButton$lambda$13(Function0.this, context, rememberLauncherForActivityResult2, cameraInputType, str2, rememberLauncherForActivityResult, mutableState3);
                                return CameraInputButton$lambda$13;
                            }
                        }, 15, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m623clickableoSLSa3U$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        m5333constructorimpl = Updater.m5333constructorimpl(composer2);
                        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                        }
                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        content.invoke(composer2, Integer.valueOf((i6 >> 15) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        function05 = function07;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        function05 = function03;
                    }
                    final Function0<Unit> function08 = function04;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit CameraInputButton$lambda$15;
                                CameraInputButton$lambda$15 = CameraInputButtonKt.CameraInputButton$lambda$15(Modifier.this, cameraInputType, onResult, function05, function08, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return CameraInputButton$lambda$15;
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                i6 = i3;
                if ((i6 & 374491) == 74898) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if (i4 == 0) {
                }
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context2 = (Context) consume2;
                startRestartGroup.startReplaceGroup(-845514337);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState32 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                i7 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i7 != 1) {
                }
                final ManagedActivityResultLauncher rememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.StartActivityForResult(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit CameraInputButton$lambda$5;
                        CameraInputButton$lambda$5 = CameraInputButtonKt.CameraInputButton$lambda$5(Function1.this, context2, str, mutableState32, (ActivityResult) obj2);
                        return CameraInputButton$lambda$5;
                    }
                }, startRestartGroup, 8);
                startRestartGroup.startReplaceGroup(-845473406);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-845471236);
                if (CameraInputButton$lambda$7(mutableState)) {
                }
                composer2.endReplaceGroup();
                final MutableState mutableState42 = mutableState2;
                int i112 = i8;
                final String str22 = str;
                function04 = function06;
                final ManagedActivityResultLauncher rememberLauncherForActivityResult22 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit CameraInputButton$lambda$12;
                        CameraInputButton$lambda$12 = CameraInputButtonKt.CameraInputButton$lambda$12(CameraInputType.this, context2, str22, rememberLauncherForActivityResult3, mutableState32, mutableState42, ((Boolean) obj2).booleanValue());
                        return CameraInputButton$lambda$12;
                    }
                }, composer2, i112);
                final Function0 function072 = function03;
                Modifier m623clickableoSLSa3U$default2 = ClickableKt.m623clickableoSLSa3U$default(modifier4, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CameraInputButton$lambda$13;
                        CameraInputButton$lambda$13 = CameraInputButtonKt.CameraInputButton$lambda$13(Function0.this, context2, rememberLauncherForActivityResult22, cameraInputType, str22, rememberLauncherForActivityResult3, mutableState32);
                        return CameraInputButton$lambda$13;
                    }
                }, 15, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m623clickableoSLSa3U$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m5333constructorimpl = Updater.m5333constructorimpl(composer2);
                Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting()) {
                }
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                content.invoke(composer2, Integer.valueOf((i6 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                function05 = function072;
                modifier3 = modifier4;
                final Function0 function082 = function04;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function04 = function02;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            i6 = i3;
            if ((i6 & 374491) == 74898) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if (i4 == 0) {
            }
            ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localContext22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context22 = (Context) consume22;
            startRestartGroup.startReplaceGroup(-845514337);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState322 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            i7 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
            if (i7 != 1) {
            }
            final ManagedActivityResultLauncher rememberLauncherForActivityResult32 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.StartActivityForResult(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit CameraInputButton$lambda$5;
                    CameraInputButton$lambda$5 = CameraInputButtonKt.CameraInputButton$lambda$5(Function1.this, context22, str, mutableState322, (ActivityResult) obj2);
                    return CameraInputButton$lambda$5;
                }
            }, startRestartGroup, 8);
            startRestartGroup.startReplaceGroup(-845473406);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-845471236);
            if (CameraInputButton$lambda$7(mutableState)) {
            }
            composer2.endReplaceGroup();
            final MutableState mutableState422 = mutableState2;
            int i1122 = i8;
            final String str222 = str;
            function04 = function06;
            final ManagedActivityResultLauncher rememberLauncherForActivityResult222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit CameraInputButton$lambda$12;
                    CameraInputButton$lambda$12 = CameraInputButtonKt.CameraInputButton$lambda$12(CameraInputType.this, context22, str222, rememberLauncherForActivityResult32, mutableState322, mutableState422, ((Boolean) obj2).booleanValue());
                    return CameraInputButton$lambda$12;
                }
            }, composer2, i1122);
            final Function0 function0722 = function03;
            Modifier m623clickableoSLSa3U$default22 = ClickableKt.m623clickableoSLSa3U$default(modifier4, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit CameraInputButton$lambda$13;
                    CameraInputButton$lambda$13 = CameraInputButtonKt.CameraInputButton$lambda$13(Function0.this, context22, rememberLauncherForActivityResult222, cameraInputType, str222, rememberLauncherForActivityResult32, mutableState322);
                    return CameraInputButton$lambda$13;
                }
            }, 15, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, m623clickableoSLSa3U$default22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(composer2);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            content.invoke(composer2, Integer.valueOf((i6 >> 15) & 14));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            function05 = function0722;
            modifier3 = modifier4;
            final Function0 function0822 = function04;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function03 = function0;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function04 = function02;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        i6 = i3;
        if ((i6 & 374491) == 74898) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if (i4 == 0) {
        }
        ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localContext222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context222 = (Context) consume222;
        startRestartGroup.startReplaceGroup(-845514337);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState3222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        i7 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
        if (i7 != 1) {
        }
        final ManagedActivityResultLauncher rememberLauncherForActivityResult322 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.StartActivityForResult(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit CameraInputButton$lambda$5;
                CameraInputButton$lambda$5 = CameraInputButtonKt.CameraInputButton$lambda$5(Function1.this, context222, str, mutableState3222, (ActivityResult) obj2);
                return CameraInputButton$lambda$5;
            }
        }, startRestartGroup, 8);
        startRestartGroup.startReplaceGroup(-845473406);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-845471236);
        if (CameraInputButton$lambda$7(mutableState)) {
        }
        composer2.endReplaceGroup();
        final MutableState mutableState4222 = mutableState2;
        int i11222 = i8;
        final String str2222 = str;
        function04 = function06;
        final ManagedActivityResultLauncher rememberLauncherForActivityResult2222 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit CameraInputButton$lambda$12;
                CameraInputButton$lambda$12 = CameraInputButtonKt.CameraInputButton$lambda$12(CameraInputType.this, context222, str2222, rememberLauncherForActivityResult322, mutableState3222, mutableState4222, ((Boolean) obj2).booleanValue());
                return CameraInputButton$lambda$12;
            }
        }, composer2, i11222);
        final Function0 function07222 = function03;
        Modifier m623clickableoSLSa3U$default222 = ClickableKt.m623clickableoSLSa3U$default(modifier4, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CameraInputButton$lambda$13;
                CameraInputButton$lambda$13 = CameraInputButtonKt.CameraInputButton$lambda$13(Function0.this, context222, rememberLauncherForActivityResult2222, cameraInputType, str2222, rememberLauncherForActivityResult322, mutableState3222);
                return CameraInputButton$lambda$13;
            }
        }, 15, null);
        ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
        CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer2, m623clickableoSLSa3U$default222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(composer2);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash222);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        content.invoke(composer2, Integer.valueOf((i6 >> 15) & 14));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        function05 = function07222;
        modifier3 = modifier4;
        final Function0 function08222 = function04;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final String CameraInputButton$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$5(Function1 onResult, Context context, String folderName, MutableState latestFileName$delegate, ActivityResult result) {
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(folderName, "$folderName");
        Intrinsics.checkNotNullParameter(latestFileName$delegate, "$latestFileName$delegate");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1 && CameraInputButton$lambda$3(latestFileName$delegate).length() > 0) {
            onResult.invoke(getUriByFileName(context, CameraInputButton$lambda$3(latestFileName$delegate), folderName));
        }
        latestFileName$delegate.setValue("");
        return Unit.INSTANCE;
    }

    private static final void CameraInputButton$launchCameraIntent(CameraInputType cameraInputType, Context context, String str, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, MutableState<String> mutableState) {
        String str2;
        Intent intent;
        int i = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
        if (i == 1) {
            str2 = ".mp4";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = ".jpg";
        }
        String str3 = UUID.randomUUID() + str2;
        Uri uriByFileName = getUriByFileName(context, str3, str);
        mutableState.setValue(str3);
        int i2 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
        if (i2 == 1) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Intent putExtra = intent.putExtra(AgentOptions.OUTPUT, uriByFileName);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        managedActivityResultLauncher.launch(putExtra);
    }

    private static final boolean CameraInputButton$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CameraInputButton$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$10$lambda$9(Function0 function0, MutableState showDialog$delegate) {
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        CameraInputButton$lambda$8(showDialog$delegate, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$11(Context context, MutableState showDialog$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        CameraInputButton$lambda$8(showDialog$delegate, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, context.getPackageName(), null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$12(CameraInputType cameraInputType, Context context, String folderName, ManagedActivityResultLauncher cameraLauncher, MutableState latestFileName$delegate, MutableState showDialog$delegate, boolean z) {
        Intrinsics.checkNotNullParameter(cameraInputType, "$cameraInputType");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(folderName, "$folderName");
        Intrinsics.checkNotNullParameter(cameraLauncher, "$cameraLauncher");
        Intrinsics.checkNotNullParameter(latestFileName$delegate, "$latestFileName$delegate");
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        if (z) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, folderName, cameraLauncher, latestFileName$delegate);
        } else {
            CameraInputButton$lambda$8(showDialog$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraInputButton$lambda$13(Function0 function0, Context context, ManagedActivityResultLauncher permissionLauncher, CameraInputType cameraInputType, String folderName, ManagedActivityResultLauncher cameraLauncher, MutableState latestFileName$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(permissionLauncher, "$permissionLauncher");
        Intrinsics.checkNotNullParameter(cameraInputType, "$cameraInputType");
        Intrinsics.checkNotNullParameter(folderName, "$folderName");
        Intrinsics.checkNotNullParameter(cameraLauncher, "$cameraLauncher");
        Intrinsics.checkNotNullParameter(latestFileName$delegate, "$latestFileName$delegate");
        function0.invoke();
        if (hasCameraPermissionInManifest(context)) {
            if (ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
                CameraInputButton$launchCameraIntent(cameraInputType, context, folderName, cameraLauncher, latestFileName$delegate);
            } else {
                permissionLauncher.launch("android.permission.CAMERA");
            }
        } else {
            CameraInputButton$launchCameraIntent(cameraInputType, context, folderName, cameraLauncher, latestFileName$delegate);
        }
        return Unit.INSTANCE;
    }

    private static final Uri getUriByFileName(Context context, String str, String str2) {
        File file = new File(context.getExternalCacheDir(), str2);
        file.mkdir();
        Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), new File(file, str));
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    private static final boolean hasCameraPermissionInManifest(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return ArraysKt.contains(strArr, "android.permission.CAMERA");
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
