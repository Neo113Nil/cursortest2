package com.socure.docv.capturesdk.feature.orchestrator;

import android.content.Context;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import com.socure.docv.capturesdk.models.ErrorLabelsModel;
import com.socure.docv.capturesdk.models.GlobalConfigModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LaunchCameraUseCase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\rH\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\rJ\b\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;", "", "context", "Landroid/content/Context;", "takePictureLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "requestPermissionLauncher", "", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "(Landroid/content/Context;Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;Lcom/socure/docv/capturesdk/models/StartSessionModel;)V", "handlePermissionResult", "", "isGranted", "", "invoke", "launchCamera", "requestCameraPermission", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LaunchCameraUseCase {
    private final Context context;
    private final ActivityResultLauncher<String> requestPermissionLauncher;
    private final StartSessionModel startSessionModel;
    private final ActivityResultLauncher<Void> takePictureLauncher;

    public LaunchCameraUseCase(Context context, ActivityResultLauncher<Void> takePictureLauncher, ActivityResultLauncher<String> requestPermissionLauncher, StartSessionModel startSessionModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(takePictureLauncher, "takePictureLauncher");
        Intrinsics.checkNotNullParameter(requestPermissionLauncher, "requestPermissionLauncher");
        this.context = context;
        this.takePictureLauncher = takePictureLauncher;
        this.requestPermissionLauncher = requestPermissionLauncher;
        this.startSessionModel = startSessionModel;
    }

    public final void invoke() {
        requestCameraPermission();
    }

    private final void requestCameraPermission() {
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.CAMERA") != 0) {
            this.requestPermissionLauncher.launch("android.permission.CAMERA");
        } else {
            launchCamera();
        }
    }

    public final void launchCamera() {
        this.takePictureLauncher.launch(null);
    }

    public final void handlePermissionResult(boolean isGranted) {
        GlobalConfigModel globalConfig;
        ErrorLabelsModel errorLabels;
        if (isGranted) {
            launchCamera();
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            LaunchCameraUseCase launchCameraUseCase = this;
            Context context = this.context;
            StartSessionModel startSessionModel = this.startSessionModel;
            Toast.makeText(context, (startSessionModel == null || (globalConfig = startSessionModel.getGlobalConfig()) == null || (errorLabels = globalConfig.getErrorLabels()) == null) ? null : errorLabels.getCameraPermission(), 1).show();
            Result.m13470constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
    }
}
