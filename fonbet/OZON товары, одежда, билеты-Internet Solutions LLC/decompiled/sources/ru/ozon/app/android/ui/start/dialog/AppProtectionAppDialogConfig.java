package ru.ozon.app.android.ui.start.dialog;

import Lg0.a;
import android.app.Application;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ui/start/dialog/AppProtectionAppDialogConfig;", "LLg0/a;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppProtectionAppDialogConfig implements a {

    @NotNull
    private final Application application;

    public AppProtectionAppDialogConfig(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    @Override // Lg0.a
    @NotNull
    public Application getApplication() {
        return this.application;
    }

    @Override // Lg0.a
    public Mg0.a getCustomAlertDialogProvider() {
        return null;
    }

    @Override // Lg0.a
    public int getDialogThemeResId() {
        return R.style.Theme_AppCompat_DayNight_Dialog_Alert;
    }

    @Override // Lg0.a
    @NotNull
    public List<Intent> getPowerSettingsIntents() {
        return K.f71697a;
    }
}
