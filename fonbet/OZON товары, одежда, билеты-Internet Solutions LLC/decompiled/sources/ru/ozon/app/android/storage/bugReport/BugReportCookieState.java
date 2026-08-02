package ru.ozon.app.android.storage.bugReport;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storage/bugReport/BugReportCookieState;", "", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "", "isEnabled", "", "setBugReportModeCookieChanged", "(Z)V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "LAe/x0;", "_bugReportModeFlow", "LAe/x0;", "LAe/M0;", "bugReportModeFlow", "LAe/M0;", "getBugReportModeFlow", "()LAe/M0;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BugReportCookieState {

    @NotNull
    private final x0<Boolean> _bugReportModeFlow;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final M0<Boolean> bugReportModeFlow;

    public BugReportCookieState(@NotNull AuthStateStorage authManager) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.authManager = authManager;
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._bugReportModeFlow = a11;
        this.bugReportModeFlow = C2399j.b(a11);
    }

    @NotNull
    public final M0<Boolean> getBugReportModeFlow() {
        return this.bugReportModeFlow;
    }

    public final void setBugReportModeCookieChanged(boolean isEnabled) {
        this._bugReportModeFlow.setValue(Boolean.valueOf(isEnabled && this.authManager.isAuthenticated()));
    }
}
