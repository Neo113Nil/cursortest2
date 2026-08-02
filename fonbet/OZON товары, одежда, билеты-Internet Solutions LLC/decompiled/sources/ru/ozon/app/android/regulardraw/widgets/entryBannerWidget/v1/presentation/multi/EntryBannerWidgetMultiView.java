package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.databinding.EntryBannerWidgetMultiIndicatorBinding;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.EntryBannerWidgetVO;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi.recyclerview.EntryBannerRvAdapter;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\b2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/EntryBannerWidgetMultiView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "backgroundColor", "", "setBackgroundColor", "(Ljava/lang/String;)V", "Landroid/os/Parcelable;", "scrollState", "restoreInstanceStateRecyclerView", "(Landroid/os/Parcelable;)V", "Lkotlin/Function1;", "block", "onScrollStateIdle", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/recyclerview/EntryBannerRvAdapter;", "entryBannerWidgetRvAdapter", "setupBannersRecyclerView", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/recyclerview/EntryBannerRvAdapter;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Multi;", "entryBannerWidgetVO", "bind", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Multi;)V", "adapter", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/recyclerview/EntryBannerRvAdapter;", "Landroidx/recyclerview/widget/x;", "pagerSnapHelper", "Landroidx/recyclerview/widget/x;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/regulardraw/databinding/EntryBannerWidgetMultiIndicatorBinding;", "indicatorBinding", "Lru/ozon/app/android/regulardraw/databinding/EntryBannerWidgetMultiIndicatorBinding;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerWidgetMultiView extends FrameLayout {
    private EntryBannerRvAdapter adapter;

    @NotNull
    private final EntryBannerWidgetMultiIndicatorBinding indicatorBinding;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;

    @NotNull
    private final x pagerSnapHelper;

    @NotNull
    private final RecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryBannerWidgetMultiView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        x xVar = new x();
        this.pagerSnapHelper = xVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.linearLayoutManager = linearLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.entryBannerWidget_Multi_RecyclerView);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setClipToOutline(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setBackground(a.getDrawable(context, R$drawable.bg_entry_banner_widget));
        xVar.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
        EntryBannerWidgetMultiIndicatorBinding inflate = EntryBannerWidgetMultiIndicatorBinding.inflate(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.indicatorBinding = inflate;
        setId(R$id.entryBannerWidget_Multi_Root);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(recyclerView);
        addView(inflate.entryBannerWidgetMultiIndicatorRoot);
    }

    private final void restoreInstanceStateRecyclerView(Parcelable scrollState) {
        if (scrollState == null) {
            this.recyclerView.scrollToPosition(0);
        } else {
            this.linearLayoutManager.onRestoreInstanceState(scrollState);
        }
    }

    private final void setBackgroundColor(String backgroundColor) {
        if (backgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setBackgroundColor(styleParser.parseColor(context, backgroundColor, R.color.transparent));
        }
    }

    public final void bind(@NotNull EntryBannerWidgetVO.Multi entryBannerWidgetVO) {
        Intrinsics.checkNotNullParameter(entryBannerWidgetVO, "entryBannerWidgetVO");
        setBackgroundColor(entryBannerWidgetVO.getBackgroundColor());
        EntryBannerRvAdapter entryBannerRvAdapter = this.adapter;
        if (entryBannerRvAdapter != null) {
            entryBannerRvAdapter.submitList(entryBannerWidgetVO.getBanners());
        }
        restoreInstanceStateRecyclerView(entryBannerWidgetVO.getScrollState());
    }

    public final void onScrollStateIdle(@NotNull final Function1<? super Parcelable, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi.EntryBannerWidgetMultiView$onScrollStateIdle$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                LinearLayoutManager linearLayoutManager;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    Function1<Parcelable, Unit> function1 = block;
                    linearLayoutManager = this.linearLayoutManager;
                    function1.invoke(linearLayoutManager.onSaveInstanceState());
                }
            }
        });
    }

    public final void setupBannersRecyclerView(@NotNull EntryBannerRvAdapter entryBannerWidgetRvAdapter) {
        Intrinsics.checkNotNullParameter(entryBannerWidgetRvAdapter, "entryBannerWidgetRvAdapter");
        this.adapter = entryBannerWidgetRvAdapter;
        this.recyclerView.setAdapter(entryBannerWidgetRvAdapter);
        this.indicatorBinding.entryBannerWidgetMultiIndicator.d(this.recyclerView);
    }
}
