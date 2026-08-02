package ru.ozon.app.android.fresh.navigation;

import android.graphics.Rect;
import android.view.View;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u0013*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004:\u0001\u0013B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/navigation/CatalogTabsPartViewHolder;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsPartVO;", "T", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "catalogTabsSharedViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;)V", "", "onViewOutOfVisibleBounds", "()V", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CatalogTabsPartViewHolder<T extends CatalogTabsPartVO> extends k<T> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Rect outOfVisibleRect = new Rect(0, 0, 0, 0);

    @NotNull
    private final CatalogTabsSharedViewModel catalogTabsSharedViewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/navigation/CatalogTabsPartViewHolder$Companion;", "", "<init>", "()V", "outOfVisibleRect", "Landroid/graphics/Rect;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogTabsPartViewHolder(@NotNull View view, @NotNull CatalogTabsSharedViewModel catalogTabsSharedViewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(catalogTabsSharedViewModel, "catalogTabsSharedViewModel");
        this.catalogTabsSharedViewModel = catalogTabsSharedViewModel;
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        CatalogTabsSharedViewModel catalogTabsSharedViewModel = this.catalogTabsSharedViewModel;
        Rect rect = outOfVisibleRect;
        CatalogTabsPartVO catalogTabsPartVO = (CatalogTabsPartVO) getBoundData();
        catalogTabsSharedViewModel.onWidgetVisibleAreaChanged(rect, catalogTabsPartVO != null ? catalogTabsPartVO.getCatalogueTabsConnectionTag() : null);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        CatalogTabsSharedViewModel catalogTabsSharedViewModel = this.catalogTabsSharedViewModel;
        Rect b11 = info.b();
        CatalogTabsPartVO catalogTabsPartVO = (CatalogTabsPartVO) getBoundData();
        catalogTabsSharedViewModel.onWidgetVisibleAreaChanged(b11, catalogTabsPartVO != null ? catalogTabsPartVO.getCatalogueTabsConnectionTag() : null);
    }
}
