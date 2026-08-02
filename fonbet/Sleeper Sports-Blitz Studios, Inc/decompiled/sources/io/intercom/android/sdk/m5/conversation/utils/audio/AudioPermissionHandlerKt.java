package io.intercom.android.sdk.m5.conversation.utils.audio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.LocalActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.PermissionResult;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioPermissionHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"rememberAudioPermissionHandler", "Lkotlin/Function0;", "", "onPermissionGranted", "onPermissionDenied", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "checkAudioPermissionStatus", "Lio/intercom/android/sdk/m5/conversation/utils/audio/PermissionResult;", "context", "Landroid/content/Context;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "hasRecordAudioPermissionInManifest", "", "shouldShowRequestPermissionRationale", "intercom-sdk-base_release", "showSettingsDialog"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AudioPermissionHandlerKt {
    public static final Function0<Unit> rememberAudioPermissionHandler(final Function0<Unit> onPermissionGranted, final Function0<Unit> onPermissionDenied, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onPermissionGranted, "onPermissionGranted");
        Intrinsics.checkNotNullParameter(onPermissionDenied, "onPermissionDenied");
        composer.startReplaceGroup(2051621013);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Context context = (Context) consume;
        ProvidableCompositionLocal<Activity> localActivity = LocalActivityKt.getLocalActivity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localActivity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Activity activity = (Activity) consume2;
        composer.startReplaceGroup(826575842);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
        composer.startReplaceGroup(826581387);
        int i2 = (i & 112) ^ 48;
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(onPermissionGranted)) || (i & 6) == 4) | ((i2 > 32 && composer.changed(onPermissionDenied)) || (i & 48) == 32);
        Object rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.AudioPermissionHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit rememberAudioPermissionHandler$lambda$4$lambda$3;
                    rememberAudioPermissionHandler$lambda$4$lambda$3 = AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$4$lambda$3(Function0.this, onPermissionDenied, ((Boolean) obj).booleanValue());
                    return rememberAudioPermissionHandler$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue2, composer, 8);
        composer.startReplaceGroup(826589549);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.AudioPermissionHandlerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rememberAudioPermissionHandler$lambda$6$lambda$5;
                    rememberAudioPermissionHandler$lambda$6$lambda$5 = AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$6$lambda$5(context, activity, onPermissionGranted, rememberLauncherForActivityResult, mutableState);
                    return rememberAudioPermissionHandler$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(function0);
            rememberedValue3 = function0;
        }
        Function0<Unit> function02 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        if (rememberAudioPermissionHandler$lambda$1(mutableState)) {
            String obj = Phrase.from(context, R.string.intercom_need_microphone_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
            String stringResource = StringResources_androidKt.stringResource(R.string.intercom_settings, composer, 0);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.intercom_not_now, composer, 0);
            Integer valueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_microphone);
            composer.startReplaceGroup(826629471);
            boolean z2 = (i2 > 32 && composer.changed(onPermissionDenied)) || (i & 48) == 32;
            Object rememberedValue4 = composer.rememberedValue();
            if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.AudioPermissionHandlerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit rememberAudioPermissionHandler$lambda$8$lambda$7;
                        rememberAudioPermissionHandler$lambda$8$lambda$7 = AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$8$lambda$7(Function0.this, mutableState);
                        return rememberAudioPermissionHandler$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            PermissionDeniedDialogKt.PermissionDeniedDialog(null, obj, stringResource, stringResource2, valueOf, (Function0) rememberedValue4, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.AudioPermissionHandlerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rememberAudioPermissionHandler$lambda$9;
                    rememberAudioPermissionHandler$lambda$9 = AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$9(context, mutableState);
                    return rememberAudioPermissionHandler$lambda$9;
                }
            }, composer, 0, 1);
        }
        composer.endReplaceGroup();
        return function02;
    }

    private static final boolean rememberAudioPermissionHandler$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void rememberAudioPermissionHandler$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$4$lambda$3(Function0 onPermissionGranted, Function0 onPermissionDenied, boolean z) {
        Intrinsics.checkNotNullParameter(onPermissionGranted, "$onPermissionGranted");
        Intrinsics.checkNotNullParameter(onPermissionDenied, "$onPermissionDenied");
        if (z) {
            onPermissionGranted.invoke();
        } else {
            onPermissionDenied.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$6$lambda$5(Context context, Activity activity, Function0 onPermissionGranted, ManagedActivityResultLauncher permissionLauncher, MutableState showSettingsDialog$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(onPermissionGranted, "$onPermissionGranted");
        Intrinsics.checkNotNullParameter(permissionLauncher, "$permissionLauncher");
        Intrinsics.checkNotNullParameter(showSettingsDialog$delegate, "$showSettingsDialog$delegate");
        PermissionResult checkAudioPermissionStatus = checkAudioPermissionStatus(context, activity);
        if (Intrinsics.areEqual(checkAudioPermissionStatus, PermissionResult.Granted.INSTANCE) || Intrinsics.areEqual(checkAudioPermissionStatus, PermissionResult.NotRequired.INSTANCE)) {
            onPermissionGranted.invoke();
        } else if (Intrinsics.areEqual(checkAudioPermissionStatus, PermissionResult.Denied.INSTANCE)) {
            permissionLauncher.launch("android.permission.RECORD_AUDIO");
        } else {
            if (!Intrinsics.areEqual(checkAudioPermissionStatus, PermissionResult.PermanentlyDenied.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            rememberAudioPermissionHandler$lambda$2(showSettingsDialog$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$8$lambda$7(Function0 onPermissionDenied, MutableState showSettingsDialog$delegate) {
        Intrinsics.checkNotNullParameter(onPermissionDenied, "$onPermissionDenied");
        Intrinsics.checkNotNullParameter(showSettingsDialog$delegate, "$showSettingsDialog$delegate");
        rememberAudioPermissionHandler$lambda$2(showSettingsDialog$delegate, false);
        onPermissionDenied.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$9(Context context, MutableState showSettingsDialog$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(showSettingsDialog$delegate, "$showSettingsDialog$delegate");
        rememberAudioPermissionHandler$lambda$2(showSettingsDialog$delegate, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, context.getPackageName(), null)));
        return Unit.INSTANCE;
    }

    public static final PermissionResult checkAudioPermissionStatus(Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!hasRecordAudioPermissionInManifest(context)) {
            return PermissionResult.NotRequired.INSTANCE;
        }
        int checkSelfPermission = ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO");
        if (checkSelfPermission != -1) {
            if (checkSelfPermission == 0) {
                return PermissionResult.Granted.INSTANCE;
            }
            return PermissionResult.Denied.INSTANCE;
        }
        if (shouldShowRequestPermissionRationale(activity)) {
            return PermissionResult.PermanentlyDenied.INSTANCE;
        }
        return PermissionResult.Denied.INSTANCE;
    }

    public static final boolean hasRecordAudioPermissionInManifest(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return ArraysKt.contains(strArr, "android.permission.RECORD_AUDIO");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static final boolean shouldShowRequestPermissionRationale(Activity activity) {
        if (activity != null) {
            return ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.RECORD_AUDIO");
        }
        return false;
    }
}
