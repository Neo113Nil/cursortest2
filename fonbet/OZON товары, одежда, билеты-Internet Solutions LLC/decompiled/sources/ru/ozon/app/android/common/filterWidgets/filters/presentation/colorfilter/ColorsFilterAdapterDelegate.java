package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u00020\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorsFilterAdapterDelegate;", "Landroidx/recyclerview/widget/t;", "T", "", "", "canScrollHorizontally", "Landroidx/recyclerview/widget/RecyclerView$o;", "provideLayoutManager", "(Z)Landroidx/recyclerview/widget/RecyclerView$o;", "provideAdapter", "()Landroidx/recyclerview/widget/t;", "adapter", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;", "item", "", "bindAdapter", "(Landroidx/recyclerview/widget/t;Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;)V", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ColorsFilterAdapterDelegate<T extends t<?, ?>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ RecyclerView.o provideLayoutManager$default(ColorsFilterAdapterDelegate colorsFilterAdapterDelegate, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provideLayoutManager");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return colorsFilterAdapterDelegate.provideLayoutManager(z11);
        }
    }

    void bindAdapter(@NotNull T adapter, @NotNull ColorFilterVO item);

    @NotNull
    T provideAdapter();

    @NotNull
    RecyclerView.o provideLayoutManager(boolean canScrollHorizontally);
}
