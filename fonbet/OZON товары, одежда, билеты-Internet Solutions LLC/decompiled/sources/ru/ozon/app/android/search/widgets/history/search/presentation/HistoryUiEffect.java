package ru.ozon.app.android.search.widgets.history.search.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryUiEffect;", "", "ShowHistoryFiltersOnboarding", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryUiEffect$ShowHistoryFiltersOnboarding;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HistoryUiEffect {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryUiEffect$ShowHistoryFiltersOnboarding;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryUiEffect;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;", "item", "<init>", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;", "getItem", "()Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem$TagButtonVO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowHistoryFiltersOnboarding implements HistoryUiEffect {
        public static final int $stable = TagButtonDTO.$stable;

        @NotNull
        private final HistoryItem.TagButtonVO item;

        public ShowHistoryFiltersOnboarding(@NotNull HistoryItem.TagButtonVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowHistoryFiltersOnboarding) && Intrinsics.d(this.item, ((ShowHistoryFiltersOnboarding) other).item);
        }

        @NotNull
        public final HistoryItem.TagButtonVO getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShowHistoryFiltersOnboarding(item=" + this.item + ")";
        }
    }
}
