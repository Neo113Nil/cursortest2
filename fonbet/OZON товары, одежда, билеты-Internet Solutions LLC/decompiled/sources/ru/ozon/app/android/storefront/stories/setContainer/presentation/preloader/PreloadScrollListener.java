package ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreloadScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreviewImagePreloader;", "previewImagePreloader", "<init>", "(Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreviewImagePreloader;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreviewImagePreloader;", "", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "lastPosition", "I", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreloadScrollListener extends RecyclerView.t {

    @NotNull
    private List<? extends CommonItemVO> items;
    private int lastPosition;

    @NotNull
    private final PreviewImagePreloader previewImagePreloader;

    public PreloadScrollListener(@NotNull PreviewImagePreloader previewImagePreloader) {
        Intrinsics.checkNotNullParameter(previewImagePreloader, "previewImagePreloader");
        this.previewImagePreloader = previewImagePreloader;
        this.items = K.f71697a;
        this.lastPosition = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        int findLastVisibleItemPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition()) == this.lastPosition) {
            return;
        }
        this.lastPosition = findLastVisibleItemPosition;
        PreviewImagePreloader.preloadFrom$default(this.previewImagePreloader, this.items, findLastVisibleItemPosition + 1, 0L, 4, null);
    }

    public final void setItems(@NotNull List<? extends CommonItemVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.lastPosition = -1;
        this.items = value;
    }
}
