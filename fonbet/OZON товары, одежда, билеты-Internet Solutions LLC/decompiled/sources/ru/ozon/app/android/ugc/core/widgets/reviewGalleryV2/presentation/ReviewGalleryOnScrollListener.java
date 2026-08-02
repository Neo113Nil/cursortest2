package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import T7.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lkotlin/Function1;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent;", "", "onScrollEvent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lkotlin/jvm/functions/Function1;", "initialPosition", "I", "getInitialPosition", "()I", "setInitialPosition", "(I)V", "Companion", "ScrollEvent", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryOnScrollListener extends RecyclerView.t {
    private int initialPosition;

    @NotNull
    private final Function1<ScrollEvent, Unit> onScrollEvent;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$Companion;", "", "<init>", "()V", "getPosition", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)Ljava/lang/Integer;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer getPosition(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                Integer valueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
                if (valueOf.intValue() != -1) {
                    return valueOf;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent;", "", "<init>", "()V", "DragEvent", "PositionChanged", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent$DragEvent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent$PositionChanged;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScrollEvent {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent$DragEvent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DragEvent extends ScrollEvent {

            @NotNull
            public static final DragEvent INSTANCE = new DragEvent();

            private DragEvent() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof DragEvent);
            }

            public int hashCode() {
                return -106299871;
            }

            @NotNull
            public String toString() {
                return "DragEvent";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent$PositionChanged;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener$ScrollEvent;", "", "position", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PositionChanged extends ScrollEvent {
            private final int position;

            public PositionChanged(int i11) {
                super(null);
                this.position = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PositionChanged) && this.position == ((PositionChanged) other).position;
            }

            public final int getPosition() {
                return this.position;
            }

            public int hashCode() {
                return Integer.hashCode(this.position);
            }

            @NotNull
            public String toString() {
                return E.a(this.position, "PositionChanged(position=", ")");
            }
        }

        public /* synthetic */ ScrollEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScrollEvent() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewGalleryOnScrollListener(@NotNull Function1<? super ScrollEvent, Unit> onScrollEvent) {
        Intrinsics.checkNotNullParameter(onScrollEvent, "onScrollEvent");
        this.onScrollEvent = onScrollEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        RecyclerView.g adapter;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (newState == 0) {
            Integer position = INSTANCE.getPosition(recyclerView);
            if (position != null) {
                this.onScrollEvent.invoke(new ScrollEvent.PositionChanged(position.intValue()));
                return;
            }
            return;
        }
        if (newState == 1 && (adapter = recyclerView.getAdapter()) != null && adapter.getCardsCount() > 1) {
            this.onScrollEvent.invoke(ScrollEvent.DragEvent.INSTANCE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (dy == 0) {
            Integer position = INSTANCE.getPosition(recyclerView);
            int i11 = this.initialPosition;
            if (position != null && position.intValue() == i11) {
                this.onScrollEvent.invoke(new ScrollEvent.PositionChanged(position.intValue()));
            }
        }
    }

    public final void setInitialPosition(int i11) {
        this.initialPosition = i11;
    }
}
