package ru.ozon.app.android.travel.molecules.view.indicator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "", "actualItemCount", "", "calculateIndicatorPosition", "position", "calculateScrollToPosition", "(I)Ljava/lang/Integer;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IndicatorInfoProvider {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int calculateIndicatorPosition(@NotNull IndicatorInfoProvider indicatorInfoProvider, int i11) {
            return i11;
        }

        public static Integer calculateScrollToPosition(@NotNull IndicatorInfoProvider indicatorInfoProvider, int i11) {
            return null;
        }
    }

    int actualItemCount();

    int calculateIndicatorPosition(int position);

    Integer calculateScrollToPosition(int position);
}
