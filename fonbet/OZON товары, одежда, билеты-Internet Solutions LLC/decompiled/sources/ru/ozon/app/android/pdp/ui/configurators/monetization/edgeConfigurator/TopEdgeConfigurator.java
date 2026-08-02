package ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator;

import B0.C2454a;
import Pk0.a;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.Q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/TopEdgeConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/TopEdgeConfigurator$BackupValuesTopEdge;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerContainer", "Landroid/view/Window;", "window", "Landroidx/core/view/Q0;", "insetsController", "", "applyWindowSettings", "(Landroid/view/ViewGroup;Landroid/view/Window;Landroidx/core/view/Q0;)V", "restoreWindowSettings", "backupValues", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/TopEdgeConfigurator$BackupValuesTopEdge;", "getBackupValues", "()Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/TopEdgeConfigurator$BackupValuesTopEdge;", "setBackupValues", "(Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/TopEdgeConfigurator$BackupValuesTopEdge;)V", "BackupValuesTopEdge", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopEdgeConfigurator extends EdgeConfigurator<BackupValuesTopEdge> {
    private BackupValuesTopEdge backupValues;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/TopEdgeConfigurator$BackupValuesTopEdge;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator$BackupValues;", "", "composerContainerFitsSystemWindows", "", "statusBarColor", "isAppearanceLightStatusBars", "<init>", "(ZIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getComposerContainerFitsSystemWindows", "()Z", "I", "getStatusBarColor", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class BackupValuesTopEdge implements EdgeConfigurator.BackupValues {
        private final boolean composerContainerFitsSystemWindows;
        private final boolean isAppearanceLightStatusBars;
        private final int statusBarColor;

        public BackupValuesTopEdge(boolean z11, int i11, boolean z12) {
            this.composerContainerFitsSystemWindows = z11;
            this.statusBarColor = i11;
            this.isAppearanceLightStatusBars = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackupValuesTopEdge)) {
                return false;
            }
            BackupValuesTopEdge backupValuesTopEdge = (BackupValuesTopEdge) other;
            return this.composerContainerFitsSystemWindows == backupValuesTopEdge.composerContainerFitsSystemWindows && this.statusBarColor == backupValuesTopEdge.statusBarColor && this.isAppearanceLightStatusBars == backupValuesTopEdge.isAppearanceLightStatusBars;
        }

        public final boolean getComposerContainerFitsSystemWindows() {
            return this.composerContainerFitsSystemWindows;
        }

        public final int getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAppearanceLightStatusBars) + C2454a.a(this.statusBarColor, Boolean.hashCode(this.composerContainerFitsSystemWindows) * 31, 31);
        }

        /* renamed from: isAppearanceLightStatusBars, reason: from getter */
        public final boolean getIsAppearanceLightStatusBars() {
            return this.isAppearanceLightStatusBars;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.composerContainerFitsSystemWindows;
            int i11 = this.statusBarColor;
            boolean z12 = this.isAppearanceLightStatusBars;
            StringBuilder sb2 = new StringBuilder("BackupValuesTopEdge(composerContainerFitsSystemWindows=");
            sb2.append(z11);
            sb2.append(", statusBarColor=");
            sb2.append(i11);
            sb2.append(", isAppearanceLightStatusBars=");
            return a.a(")", sb2, z12);
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator
    public void applyWindowSettings(@NotNull ViewGroup composerContainer, @NotNull Window window, @NotNull Q0 insetsController) {
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(insetsController, "insetsController");
        setBackupValues(new BackupValuesTopEdge(composerContainer.getFitsSystemWindows(), window.getStatusBarColor(), insetsController.c()));
        composerContainer.setFitsSystemWindows(false);
        window.setStatusBarColor(0);
        insetsController.e(false);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator
    public void restoreWindowSettings(@NotNull ViewGroup composerContainer, @NotNull Window window, @NotNull Q0 insetsController) {
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(insetsController, "insetsController");
        BackupValuesTopEdge backupValues = getBackupValues();
        if (backupValues != null) {
            composerContainer.setFitsSystemWindows(backupValues.getComposerContainerFitsSystemWindows());
            window.setStatusBarColor(backupValues.getStatusBarColor());
            insetsController.e(backupValues.getIsAppearanceLightStatusBars());
        }
        setBackupValues(null);
    }

    protected void setBackupValues(BackupValuesTopEdge backupValuesTopEdge) {
        this.backupValues = backupValuesTopEdge;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator
    public BackupValuesTopEdge getBackupValues() {
        return this.backupValues;
    }
}
