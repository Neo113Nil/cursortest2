package ru.ozon.app.android.storage.debug;

import Nc.C3667a;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00060\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storage/debug/DebugToolsStorageImpl;", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/SharedPreferences;)V", "", "isDebugEnabled", "()Z", "isEnabled", "", "switchDebugEnabled", "(Z)V", "Landroid/content/SharedPreferences;", "LNc/a;", "kotlin.jvm.PlatformType", "debugEnabledSubj", "LNc/a;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugToolsStorageImpl implements DebugToolsStorage {

    @NotNull
    private final C3667a<Boolean> debugEnabledSubj;

    @NotNull
    private final SharedPreferences prefs;

    public DebugToolsStorageImpl(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
        C3667a<Boolean> e11 = C3667a.e(Boolean.valueOf(isDebugEnabled()));
        Intrinsics.checkNotNullExpressionValue(e11, "createDefault(...)");
        this.debugEnabledSubj = e11;
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsStorage
    public boolean isDebugEnabled() {
        return this.prefs.getBoolean("PREF_WIDGETS_DEBUG_TOOLS_ENABLED", false);
    }

    @Override // ru.ozon.app.android.storage.debug.DebugToolsStorage
    public void switchDebugEnabled(boolean isEnabled) {
        this.prefs.edit().putBoolean("PREF_WIDGETS_DEBUG_TOOLS_ENABLED", isEnabled).apply();
        this.debugEnabledSubj.onNext(Boolean.valueOf(isEnabled));
    }
}
