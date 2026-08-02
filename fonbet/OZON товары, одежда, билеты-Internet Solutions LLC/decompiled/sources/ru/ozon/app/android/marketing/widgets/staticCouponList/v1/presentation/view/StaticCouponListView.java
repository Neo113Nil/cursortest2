package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;)V", "", "background", "bindBackground", "(Ljava/lang/String;)V", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "contentItems", "bindContent", "(Ljava/util/List;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "setUpRecycler", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter;Landroidx/recyclerview/widget/RecyclerView$u;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "backgroundImage", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/recyclerview/widget/RecyclerView;", "content", "Landroidx/recyclerview/widget/RecyclerView;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListView extends FrameLayout {

    @NotNull
    private final AppCompatImageView backgroundImage;

    @NotNull
    private final RecyclerView content;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListView$Companion;", "", "<init>", "()V", "UNSPECIFIED", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        appCompatImageView.setScaleType(ImageView.ScaleType.MATRIX);
        this.backgroundImage = appCompatImageView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        this.content = recyclerView;
        addViews();
    }

    private final void addViews() {
        addView(this.backgroundImage);
        addView(this.content);
    }

    public final void bind(@NotNull StaticCouponListVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.backgroundImage, item.getBackgroundImage(), null, null, null, null, false, null, 126, null);
        RecyclerView.g adapter = this.content.getAdapter();
        StaticCouponListContentAdapter staticCouponListContentAdapter = adapter instanceof StaticCouponListContentAdapter ? (StaticCouponListContentAdapter) adapter : null;
        if (staticCouponListContentAdapter != null) {
            staticCouponListContentAdapter.submitList(item.getContent());
        }
    }

    public final void bindBackground(@NotNull String background) {
        Intrinsics.checkNotNullParameter(background, "background");
        ImageViewExtKt.load$default(this.backgroundImage, background, null, null, null, null, false, null, 126, null);
    }

    public final void bindContent(@NotNull List<? extends StaticCouponListVO.ContentItem> contentItems) {
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        RecyclerView.g adapter = this.content.getAdapter();
        StaticCouponListContentAdapter staticCouponListContentAdapter = adapter instanceof StaticCouponListContentAdapter ? (StaticCouponListContentAdapter) adapter : null;
        if (staticCouponListContentAdapter != null) {
            staticCouponListContentAdapter.submitList(contentItems);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.backgroundImage.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public final void setUpRecycler(@NotNull StaticCouponListContentAdapter adapter, @NotNull RecyclerView.u viewPool) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        this.content.setAdapter(adapter);
        this.content.setRecycledViewPool(viewPool);
    }
}
