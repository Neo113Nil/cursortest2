package com.socure.docv.capturesdk.feature.orchestrator;

import androidx.activity.result.ActivityResultLauncher;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenFilePickerUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;", "", "orchestratorActivity", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/OrchestratorActivity;", "filePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "(Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/OrchestratorActivity;Landroidx/activity/result/ActivityResultLauncher;)V", "invoke", "", "mimeTypes", "([Ljava/lang/String;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenFilePickerUseCase {
    private final ActivityResultLauncher<String[]> filePickerLauncher;
    private final OrchestratorActivity orchestratorActivity;

    public OpenFilePickerUseCase(OrchestratorActivity orchestratorActivity, ActivityResultLauncher<String[]> filePickerLauncher) {
        Intrinsics.checkNotNullParameter(orchestratorActivity, "orchestratorActivity");
        Intrinsics.checkNotNullParameter(filePickerLauncher, "filePickerLauncher");
        this.orchestratorActivity = orchestratorActivity;
        this.filePickerLauncher = filePickerLauncher;
    }

    public final void invoke(String[] mimeTypes) {
        Intrinsics.checkNotNullParameter(mimeTypes, "mimeTypes");
        if (!(mimeTypes.length == 0)) {
            this.filePickerLauncher.launch(mimeTypes);
        } else {
            this.orchestratorActivity.backToCallerUnknown();
        }
    }
}
