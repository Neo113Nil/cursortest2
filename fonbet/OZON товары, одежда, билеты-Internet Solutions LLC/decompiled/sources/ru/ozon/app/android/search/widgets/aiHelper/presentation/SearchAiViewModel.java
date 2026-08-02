package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.search.widgets.aiHelper.data.PollSearchAiRequest;
import ru.ozon.app.android.search.widgets.aiHelper.data.ProcessingStatus;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/SearchAiViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "onCleared", "()V", "", "aiResultId", "pollSearchAi", "(Ljava/lang/String;)V", "stopSearchAi", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/w0;", "Lru/ozon/app/android/search/widgets/aiHelper/data/ProcessingStatus;", "_pollingStatus", "LAe/w0;", "Lxe/B0;", "pollSearchJob", "Lxe/B0;", "LAe/B0;", "getPollingStatus", "()LAe/B0;", "pollingStatus", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchAiViewModel extends w0 {

    @NotNull
    private final Ae.w0<ProcessingStatus> _pollingStatus;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private B0 pollSearchJob;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/SearchAiViewModel$Companion;", "", "<init>", "()V", "POLL_SEARCH_ACTION_ID", "", "STOP_SEARCH_ACTION_ID", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SearchAiViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this._pollingStatus = E0.b(0, 0, null, 7);
    }

    @NotNull
    public final Ae.B0<ProcessingStatus> getPollingStatus() {
        return C2399j.a(this._pollingStatus);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        B0 b02 = this.pollSearchJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void pollSearchAi(@NotNull String aiResultId) {
        Intrinsics.checkNotNullParameter(aiResultId, "aiResultId");
        B0 b02 = this.pollSearchJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.pollSearchJob = C10727i.c(x0.a(this), null, null, new SearchAiViewModel$pollSearchAi$1(this, new ActionV2Request(new PollSearchAiRequest(aiResultId), "pollSearchAi", false, 4, null), null), 3);
    }

    public final void stopSearchAi(@NotNull String aiResultId) {
        Intrinsics.checkNotNullParameter(aiResultId, "aiResultId");
        B0 b02 = this.pollSearchJob;
        if (b02 != null) {
            b02.j(null);
        }
        C10727i.c(x0.a(this), null, null, new SearchAiViewModel$stopSearchAi$1(this, new ActionV2Request(new PollSearchAiRequest(aiResultId), "stopSearchAi", false, 4, null), null), 3);
    }
}
