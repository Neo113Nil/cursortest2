package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import G.g;
import Kk.C3532b;
import Pk0.a;
import Pk0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\\\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\f\u0010\u001f¨\u0006'"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewState;", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "widgetState", "", "headerBadgeEnabled", "dragEnabled", "swipeOutEnabled", "reactionButtonsEnabled", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Card;", "visibleCards", "isTeensModeEnabled", "<init>", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;ZZZZLjava/util/List;Z)V", "copy", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;ZZZZLjava/util/List;Z)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "getWidgetState", "()Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "Z", "getHeaderBadgeEnabled", "()Z", "getDragEnabled", "getSwipeOutEnabled", "getReactionButtonsEnabled", "Ljava/util/List;", "getVisibleCards", "()Ljava/util/List;", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MatchShoppingCardsViewState {
    private final boolean dragEnabled;
    private final boolean headerBadgeEnabled;
    private final boolean isTeensModeEnabled;
    private final boolean reactionButtonsEnabled;
    private final boolean swipeOutEnabled;

    @NotNull
    private final List<MatchShoppingCardsVI.Card> visibleCards;

    @NotNull
    private final MatchShoppingCardsVI widgetState;

    public MatchShoppingCardsViewState(@NotNull MatchShoppingCardsVI widgetState, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull List<MatchShoppingCardsVI.Card> visibleCards, boolean z15) {
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(visibleCards, "visibleCards");
        this.widgetState = widgetState;
        this.headerBadgeEnabled = z11;
        this.dragEnabled = z12;
        this.swipeOutEnabled = z13;
        this.reactionButtonsEnabled = z14;
        this.visibleCards = visibleCards;
        this.isTeensModeEnabled = z15;
    }

    public static /* synthetic */ MatchShoppingCardsViewState copy$default(MatchShoppingCardsViewState matchShoppingCardsViewState, MatchShoppingCardsVI matchShoppingCardsVI, boolean z11, boolean z12, boolean z13, boolean z14, List list, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            matchShoppingCardsVI = matchShoppingCardsViewState.widgetState;
        }
        if ((i11 & 2) != 0) {
            z11 = matchShoppingCardsViewState.headerBadgeEnabled;
        }
        if ((i11 & 4) != 0) {
            z12 = matchShoppingCardsViewState.dragEnabled;
        }
        if ((i11 & 8) != 0) {
            z13 = matchShoppingCardsViewState.swipeOutEnabled;
        }
        if ((i11 & 16) != 0) {
            z14 = matchShoppingCardsViewState.reactionButtonsEnabled;
        }
        if ((i11 & 32) != 0) {
            list = matchShoppingCardsViewState.visibleCards;
        }
        if ((i11 & 64) != 0) {
            z15 = matchShoppingCardsViewState.isTeensModeEnabled;
        }
        List list2 = list;
        boolean z16 = z15;
        boolean z17 = z14;
        boolean z18 = z12;
        return matchShoppingCardsViewState.copy(matchShoppingCardsVI, z11, z18, z13, z17, list2, z16);
    }

    @NotNull
    public final MatchShoppingCardsViewState copy(@NotNull MatchShoppingCardsVI widgetState, boolean headerBadgeEnabled, boolean dragEnabled, boolean swipeOutEnabled, boolean reactionButtonsEnabled, @NotNull List<MatchShoppingCardsVI.Card> visibleCards, boolean isTeensModeEnabled) {
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(visibleCards, "visibleCards");
        return new MatchShoppingCardsViewState(widgetState, headerBadgeEnabled, dragEnabled, swipeOutEnabled, reactionButtonsEnabled, visibleCards, isTeensModeEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchShoppingCardsViewState)) {
            return false;
        }
        MatchShoppingCardsViewState matchShoppingCardsViewState = (MatchShoppingCardsViewState) other;
        return Intrinsics.d(this.widgetState, matchShoppingCardsViewState.widgetState) && this.headerBadgeEnabled == matchShoppingCardsViewState.headerBadgeEnabled && this.dragEnabled == matchShoppingCardsViewState.dragEnabled && this.swipeOutEnabled == matchShoppingCardsViewState.swipeOutEnabled && this.reactionButtonsEnabled == matchShoppingCardsViewState.reactionButtonsEnabled && Intrinsics.d(this.visibleCards, matchShoppingCardsViewState.visibleCards) && this.isTeensModeEnabled == matchShoppingCardsViewState.isTeensModeEnabled;
    }

    public final boolean getDragEnabled() {
        return this.dragEnabled;
    }

    public final boolean getHeaderBadgeEnabled() {
        return this.headerBadgeEnabled;
    }

    public final boolean getReactionButtonsEnabled() {
        return this.reactionButtonsEnabled;
    }

    public final boolean getSwipeOutEnabled() {
        return this.swipeOutEnabled;
    }

    @NotNull
    public final List<MatchShoppingCardsVI.Card> getVisibleCards() {
        return this.visibleCards;
    }

    @NotNull
    public final MatchShoppingCardsVI getWidgetState() {
        return this.widgetState;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTeensModeEnabled) + g.b(C3532b.a(C3532b.a(C3532b.a(C3532b.a(this.widgetState.hashCode() * 31, 31, this.headerBadgeEnabled), 31, this.dragEnabled), 31, this.swipeOutEnabled), 31, this.reactionButtonsEnabled), 31, this.visibleCards);
    }

    /* renamed from: isTeensModeEnabled, reason: from getter */
    public final boolean getIsTeensModeEnabled() {
        return this.isTeensModeEnabled;
    }

    @NotNull
    public String toString() {
        MatchShoppingCardsVI matchShoppingCardsVI = this.widgetState;
        boolean z11 = this.headerBadgeEnabled;
        boolean z12 = this.dragEnabled;
        boolean z13 = this.swipeOutEnabled;
        boolean z14 = this.reactionButtonsEnabled;
        List<MatchShoppingCardsVI.Card> list = this.visibleCards;
        boolean z15 = this.isTeensModeEnabled;
        StringBuilder sb2 = new StringBuilder("MatchShoppingCardsViewState(widgetState=");
        sb2.append(matchShoppingCardsVI);
        sb2.append(", headerBadgeEnabled=");
        sb2.append(z11);
        sb2.append(", dragEnabled=");
        f.c(", swipeOutEnabled=", ", reactionButtonsEnabled=", sb2, z12, z13);
        sb2.append(z14);
        sb2.append(", visibleCards=");
        sb2.append(list);
        sb2.append(", isTeensModeEnabled=");
        return a.a(")", sb2, z15);
    }

    public /* synthetic */ MatchShoppingCardsViewState(MatchShoppingCardsVI matchShoppingCardsVI, boolean z11, boolean z12, boolean z13, boolean z14, List list, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(matchShoppingCardsVI, (i11 & 2) != 0 ? !matchShoppingCardsVI.getHeader().getDeferredBadge() : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? true : z13, (i11 & 16) != 0 ? true : z14, (i11 & 32) != 0 ? C7714v.K0(matchShoppingCardsVI.getCards(), 2) : list, z15);
    }
}
