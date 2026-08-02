package ru.ozon.app.android.error.summary.domain;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryState;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/error/summary/domain/ErrorSummaryInteractor;", "", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "serverIssue", "<init>", "(Lru/ozon/app/android/storage/appversion/AppVersionStorage;Lru/ozon/app/android/storage/debug/DebugToolsService;Lru/ozon/app/android/account/user/UserManager;Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;)V", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryState;", "fetch", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "Lru/ozon/app/android/account/user/UserManager;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "Companion", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppVersionStorage appVersionStorage;

    @NotNull
    private final DebugToolsService debugToolsService;
    private final ScreenState.ServerIssue serverIssue;

    @NotNull
    private final UserManager userManager;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/error/summary/domain/ErrorSummaryInteractor$Companion;", "", "<init>", "()V", "PLATFORM_NAME", "", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ErrorSummaryInteractor(@NotNull AppVersionStorage appVersionStorage, @NotNull DebugToolsService debugToolsService, @NotNull UserManager userManager, ScreenState.ServerIssue serverIssue) {
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.appVersionStorage = appVersionStorage;
        this.debugToolsService = debugToolsService;
        this.userManager = userManager;
        this.serverIssue = serverIssue;
    }

    public final Object fetch(@NotNull d<? super ErrorSummaryState> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ErrorSummaryInteractor$fetch$2(this, null), dVar);
    }
}
