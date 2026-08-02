package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import android.os.Parcelable;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.onboarding.SuggestionsShimmerOnboardingResolver;
import xe.B0;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 12\u00020\u0001:\u000212B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionsShimmerOnboardingResolver;", "suggestionsShimmerOnboardingResolver", "<init>", "(Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionsShimmerOnboardingResolver;)V", "", "checkNeedOnboarding", "()V", "onCleared", "Lxe/B0;", "collectorJob", "attach", "(Lxe/B0;)V", "detach", "onShownOnboarding", "onFiltersInteraction", "Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionsShimmerOnboardingResolver;", "Landroid/os/Parcelable;", "layoutManagerState", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "", "currentItemId", "J", "getCurrentItemId", "()J", "setCurrentItemId", "(J)V", "Lze/h;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel$PresentationEvents;", "eventChannel", "Lze/h;", "LAe/h;", "presentationEventsFlow", "LAe/h;", "getPresentationEventsFlow", "()LAe/h;", "actualSubscriberJob", "Lxe/B0;", "", "isRefreshing", "Z", "()Z", "setRefreshing", "(Z)V", "Companion", "PresentationEvents", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionWithFilterSharedViewModel extends w0 {
    private B0 actualSubscriberJob;
    private long currentItemId;

    @NotNull
    private final h<PresentationEvents> eventChannel;
    private boolean isRefreshing;
    private Parcelable layoutManagerState;

    @NotNull
    private final InterfaceC2395h<PresentationEvents> presentationEventsFlow;

    @NotNull
    private final SuggestionsShimmerOnboardingResolver suggestionsShimmerOnboardingResolver;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel$PresentationEvents;", "", "<init>", "()V", "ShowOnboarding", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel$PresentationEvents$ShowOnboarding;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PresentationEvents {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel$PresentationEvents$ShowOnboarding;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel$PresentationEvents;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowOnboarding extends PresentationEvents {

            @NotNull
            public static final ShowOnboarding INSTANCE = new ShowOnboarding();

            private ShowOnboarding() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowOnboarding);
            }

            public int hashCode() {
                return 556790192;
            }

            @NotNull
            public String toString() {
                return "ShowOnboarding";
            }
        }

        public /* synthetic */ PresentationEvents(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PresentationEvents() {
        }
    }

    public SuggestionWithFilterSharedViewModel(@NotNull SuggestionsShimmerOnboardingResolver suggestionsShimmerOnboardingResolver) {
        Intrinsics.checkNotNullParameter(suggestionsShimmerOnboardingResolver, "suggestionsShimmerOnboardingResolver");
        this.suggestionsShimmerOnboardingResolver = suggestionsShimmerOnboardingResolver;
        C11115c a11 = k.a(-2, 6, null);
        this.eventChannel = a11;
        this.presentationEventsFlow = C2399j.H(a11);
    }

    private final void checkNeedOnboarding() {
        if (this.suggestionsShimmerOnboardingResolver.needShowShimmerOnboarding("suggestionWithFilterBlock")) {
            C10727i.c(x0.a(this), null, null, new SuggestionWithFilterSharedViewModel$checkNeedOnboarding$1(this, null), 3);
        }
    }

    public final void attach(@NotNull B0 collectorJob) {
        Intrinsics.checkNotNullParameter(collectorJob, "collectorJob");
        B0 b02 = this.actualSubscriberJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.actualSubscriberJob = collectorJob;
        checkNeedOnboarding();
    }

    public final void detach(@NotNull B0 collectorJob) {
        Intrinsics.checkNotNullParameter(collectorJob, "collectorJob");
        collectorJob.j(null);
    }

    public final long getCurrentItemId() {
        return this.currentItemId;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @NotNull
    public final InterfaceC2395h<PresentationEvents> getPresentationEventsFlow() {
        return this.presentationEventsFlow;
    }

    /* renamed from: isRefreshing, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.eventChannel.l(null);
        B0 b02 = this.actualSubscriberJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void onFiltersInteraction() {
        this.suggestionsShimmerOnboardingResolver.onShimmerOnboardingInteraction("suggestionWithFilterBlock");
    }

    public final void onShownOnboarding() {
        this.suggestionsShimmerOnboardingResolver.onShimmerOnboardingView("suggestionWithFilterBlock");
    }

    public final void setCurrentItemId(long j11) {
        this.currentItemId = j11;
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    public final void setRefreshing(boolean z11) {
        this.isRefreshing = z11;
    }
}
