package ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator;

import B0.C2454a;
import Kk.C3532b;
import Ql.c;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeToEdgeConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeToEdgeConfigurator$BackupValuesEdgeToEdge;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerContainer", "Landroid/view/Window;", "window", "Landroidx/core/view/Q0;", "insetsController", "", "applyWindowSettings", "(Landroid/view/ViewGroup;Landroid/view/Window;Landroidx/core/view/Q0;)V", "restoreWindowSettings", "backupValues", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeToEdgeConfigurator$BackupValuesEdgeToEdge;", "getBackupValues", "()Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeToEdgeConfigurator$BackupValuesEdgeToEdge;", "setBackupValues", "(Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeToEdgeConfigurator$BackupValuesEdgeToEdge;)V", "BackupValuesEdgeToEdge", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EdgeToEdgeConfigurator extends EdgeConfigurator<BackupValuesEdgeToEdge> {
    private BackupValuesEdgeToEdge backupValues;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0007\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeToEdgeConfigurator$BackupValuesEdgeToEdge;", "Lru/ozon/app/android/pdp/ui/configurators/monetization/edgeConfigurator/EdgeConfigurator$BackupValues;", "", "composerContainerFitsSystemWindows", "", "statusBarColor", "navigationBarColor", "isAppearanceLightStatusBars", "isAppearanceLightNavigationBars", "isNavigationBarContrastEnforced", "<init>", "(ZIIZZLjava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getComposerContainerFitsSystemWindows", "()Z", "I", "getStatusBarColor", "getNavigationBarColor", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class BackupValuesEdgeToEdge implements EdgeConfigurator.BackupValues {
        private final boolean composerContainerFitsSystemWindows;
        private final boolean isAppearanceLightNavigationBars;
        private final boolean isAppearanceLightStatusBars;
        private final Boolean isNavigationBarContrastEnforced;
        private final int navigationBarColor;
        private final int statusBarColor;

        public BackupValuesEdgeToEdge(boolean z11, int i11, int i12, boolean z12, boolean z13, Boolean bool) {
            this.composerContainerFitsSystemWindows = z11;
            this.statusBarColor = i11;
            this.navigationBarColor = i12;
            this.isAppearanceLightStatusBars = z12;
            this.isAppearanceLightNavigationBars = z13;
            this.isNavigationBarContrastEnforced = bool;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackupValuesEdgeToEdge)) {
                return false;
            }
            BackupValuesEdgeToEdge backupValuesEdgeToEdge = (BackupValuesEdgeToEdge) other;
            return this.composerContainerFitsSystemWindows == backupValuesEdgeToEdge.composerContainerFitsSystemWindows && this.statusBarColor == backupValuesEdgeToEdge.statusBarColor && this.navigationBarColor == backupValuesEdgeToEdge.navigationBarColor && this.isAppearanceLightStatusBars == backupValuesEdgeToEdge.isAppearanceLightStatusBars && this.isAppearanceLightNavigationBars == backupValuesEdgeToEdge.isAppearanceLightNavigationBars && Intrinsics.d(this.isNavigationBarContrastEnforced, backupValuesEdgeToEdge.isNavigationBarContrastEnforced);
        }

        public final boolean getComposerContainerFitsSystemWindows() {
            return this.composerContainerFitsSystemWindows;
        }

        public final int getNavigationBarColor() {
            return this.navigationBarColor;
        }

        public final int getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            int a11 = C3532b.a(C3532b.a(C2454a.a(this.navigationBarColor, C2454a.a(this.statusBarColor, Boolean.hashCode(this.composerContainerFitsSystemWindows) * 31, 31), 31), 31, this.isAppearanceLightStatusBars), 31, this.isAppearanceLightNavigationBars);
            Boolean bool = this.isNavigationBarContrastEnforced;
            return a11 + (bool == null ? 0 : bool.hashCode());
        }

        /* renamed from: isAppearanceLightNavigationBars, reason: from getter */
        public final boolean getIsAppearanceLightNavigationBars() {
            return this.isAppearanceLightNavigationBars;
        }

        /* renamed from: isAppearanceLightStatusBars, reason: from getter */
        public final boolean getIsAppearanceLightStatusBars() {
            return this.isAppearanceLightStatusBars;
        }

        /* renamed from: isNavigationBarContrastEnforced, reason: from getter */
        public final Boolean getIsNavigationBarContrastEnforced() {
            return this.isNavigationBarContrastEnforced;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.composerContainerFitsSystemWindows;
            int i11 = this.statusBarColor;
            int i12 = this.navigationBarColor;
            boolean z12 = this.isAppearanceLightStatusBars;
            boolean z13 = this.isAppearanceLightNavigationBars;
            Boolean bool = this.isNavigationBarContrastEnforced;
            StringBuilder sb2 = new StringBuilder("BackupValuesEdgeToEdge(composerContainerFitsSystemWindows=");
            sb2.append(z11);
            sb2.append(", statusBarColor=");
            sb2.append(i11);
            sb2.append(", navigationBarColor=");
            c.d(sb2, i12, ", isAppearanceLightStatusBars=", z12, ", isAppearanceLightNavigationBars=");
            sb2.append(z13);
            sb2.append(", isNavigationBarContrastEnforced=");
            sb2.append(bool);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator
    public void applyWindowSettings(@NotNull ViewGroup composerContainer, @NotNull Window window, @NotNull Q0 insetsController) {
        Boolean bool;
        boolean isNavigationBarContrastEnforced;
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(insetsController, "insetsController");
        C5334o0.a(window, false);
        int statusBarColor = window.getStatusBarColor();
        int navigationBarColor = window.getNavigationBarColor();
        boolean fitsSystemWindows = composerContainer.getFitsSystemWindows();
        boolean c11 = insetsController.c();
        boolean b11 = insetsController.b();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            isNavigationBarContrastEnforced = window.isNavigationBarContrastEnforced();
            bool = Boolean.valueOf(isNavigationBarContrastEnforced);
        } else {
            bool = null;
        }
        setBackupValues(new BackupValuesEdgeToEdge(fitsSystemWindows, statusBarColor, navigationBarColor, c11, b11, bool));
        composerContainer.setFitsSystemWindows(false);
        if (i11 >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        insetsController.e(false);
        insetsController.d(false);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator
    public void restoreWindowSettings(@NotNull ViewGroup composerContainer, @NotNull Window window, @NotNull Q0 insetsController) {
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(insetsController, "insetsController");
        BackupValuesEdgeToEdge backupValues = getBackupValues();
        if (backupValues != null) {
            composerContainer.setFitsSystemWindows(backupValues.getComposerContainerFitsSystemWindows());
            if (Build.VERSION.SDK_INT >= 29 && backupValues.getIsNavigationBarContrastEnforced() != null) {
                window.setNavigationBarContrastEnforced(backupValues.getIsNavigationBarContrastEnforced().booleanValue());
            }
            window.setStatusBarColor(backupValues.getStatusBarColor());
            window.setNavigationBarColor(backupValues.getNavigationBarColor());
            insetsController.e(backupValues.getIsAppearanceLightStatusBars());
            insetsController.d(backupValues.getIsAppearanceLightNavigationBars());
            C5334o0.a(window, true);
        }
        setBackupValues(null);
    }

    protected void setBackupValues(BackupValuesEdgeToEdge backupValuesEdgeToEdge) {
        this.backupValues = backupValuesEdgeToEdge;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeConfigurator
    public BackupValuesEdgeToEdge getBackupValues() {
        return this.backupValues;
    }
}
