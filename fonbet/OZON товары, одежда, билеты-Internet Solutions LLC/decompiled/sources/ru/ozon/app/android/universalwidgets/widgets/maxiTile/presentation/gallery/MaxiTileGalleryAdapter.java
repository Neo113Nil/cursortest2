package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery;

import FX.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.J;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery.view.MaxiTileImageView;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.vi.MaxiTileVI;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryAdapter;", "Ljk0/i;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryAdapter$MaxiTileViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function0;", "", "onClick", "<init>", "(Landroidx/lifecycle/J;LWZ/l;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryAdapter$MaxiTileViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryAdapter$MaxiTileViewHolder;I)V", "getItemViewType", "(I)I", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "MaxiTileViewHolder", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxiTileGalleryAdapter extends i<MaxiTileVI.Gallery.ImageItem, MaxiTileViewHolder> {

    @NotNull
    private final Function0<Unit> onClick;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryAdapter$MaxiTileViewHolder;", "Ljk0/j;", "Landroidx/appcompat/widget/AppCompatImageView;", "view", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroidx/appcompat/widget/AppCompatImageView;LWZ/l;)V", "", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;", "item", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "LWZ/l;", "Landroid/graphics/drawable/Drawable;", "paranjaDrawable$delegate", "LSc/j;", "getParanjaDrawable", "()Landroid/graphics/drawable/Drawable;", "paranjaDrawable", "boundData", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MaxiTileViewHolder extends j {
        private MaxiTileVI.Gallery.ImageItem boundData;

        /* renamed from: paranjaDrawable$delegate, reason: from kotlin metadata */
        @NotNull
        private final InterfaceC4008j paranjaDrawable;

        @NotNull
        private final l tokenizedAnalytics;

        @NotNull
        private final AppCompatImageView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxiTileViewHolder(@NotNull AppCompatImageView view, @NotNull l tokenizedAnalytics) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            this.view = view;
            this.tokenizedAnalytics = tokenizedAnalytics;
            this.paranjaDrawable = k.b(new MaxiTileGalleryAdapter$MaxiTileViewHolder$paranjaDrawable$2(this));
        }

        private final Drawable getParanjaDrawable() {
            return (Drawable) this.paranjaDrawable.getValue();
        }

        public final void bind(@NotNull MaxiTileVI.Gallery.ImageItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            AppCompatImageView appCompatImageView = this.view;
            this.boundData = item;
            ImageViewExtKt.load$default(appCompatImageView, item.getLink(), null, null, null, null, false, null, 126, null);
            appCompatImageView.setScaleType(item.getScaleType());
            appCompatImageView.setForeground(item.getEnableParanja() ? getParanjaDrawable() : null);
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            t tokenizedEvent;
            super.onViewInVisibleBounds();
            MaxiTileVI.Gallery.ImageItem imageItem = this.boundData;
            if (imageItem == null || (tokenizedEvent = imageItem.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxiTileGalleryAdapter(@NotNull J lifecycleOwner, @NotNull l tokenizedAnalytics, @NotNull Function0<Unit> onClick) {
        super(MaxiTileGalleryDiffCallback.INSTANCE, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onClick = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1$lambda$0(MaxiTileGalleryAdapter maxiTileGalleryAdapter, View view) {
        maxiTileGalleryAdapter.onClick.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getDisplayMode().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MaxiTileViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MaxiTileVI.Gallery.ImageItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MaxiTileViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MaxiTileImageView maxiTileImageView = new MaxiTileImageView(context, null, 0, 6, null);
        maxiTileImageView.setDisplayMode(((MaxiTileVI.Gallery.ImageItem.DisplayMode[]) MaxiTileVI.Gallery.ImageItem.DisplayMode.getEntries().toArray(new MaxiTileVI.Gallery.ImageItem.DisplayMode[0]))[viewType]);
        maxiTileImageView.setOnClickListener(new a(this, 0));
        return new MaxiTileViewHolder(maxiTileImageView, this.tokenizedAnalytics);
    }
}
