package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter;

import android.content.Context;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.AspectsColorsAdapter;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/AspectsColorsFilterAdapterDelegate;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorsFilterAdapterDelegate;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/AspectsColorsAdapter;", "customRefreshHandler", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;Landroid/content/Context;)V", "provideLayoutManager", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "canScrollHorizontally", "", "provideAdapter", "bindAdapter", "", "adapter", "item", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AspectsColorsFilterAdapterDelegate implements ColorsFilterAdapterDelegate<AspectsColorsAdapter> {

    @NotNull
    private final Context context;

    @NotNull
    private final CustomRefreshHandler customRefreshHandler;

    public AspectsColorsFilterAdapterDelegate(@NotNull CustomRefreshHandler customRefreshHandler, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        this.customRefreshHandler = customRefreshHandler;
        this.context = context;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.ColorsFilterAdapterDelegate
    public void bindAdapter(@NotNull AspectsColorsAdapter adapter, @NotNull ColorFilterVO item) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(item, "item");
        adapter.submitList(item.getColorAspects());
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.ColorsFilterAdapterDelegate
    @NotNull
    public AspectsColorsAdapter provideAdapter() {
        return new AspectsColorsAdapter(this.customRefreshHandler);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.ColorsFilterAdapterDelegate
    @NotNull
    public FlexboxLayoutManager provideLayoutManager(final boolean canScrollHorizontally) {
        final Context context = this.context;
        return new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.AspectsColorsFilterAdapterDelegate$provideLayoutManager$1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            /* renamed from: canScrollHorizontally, reason: from getter */
            public boolean get$canScrollHorizontally() {
                return canScrollHorizontally;
            }
        };
    }
}
