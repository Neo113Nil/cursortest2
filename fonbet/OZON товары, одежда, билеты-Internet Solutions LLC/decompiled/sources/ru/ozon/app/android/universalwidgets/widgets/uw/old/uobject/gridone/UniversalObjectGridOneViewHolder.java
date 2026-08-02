package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone;

import GJ.b;
import NX.a;
import android.os.Parcelable;
import android.view.View;
import androidx.core.graphics.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.databinding.ItemUobjectGridOneBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv.UwGridOneAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 *2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001*B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/UniversalObjectGridOneViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "", "needCorners", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Z)V", "item", "", "startAutoSwipe", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;Ll20/d;)V", "onRecycle", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/databinding/ItemUobjectGridOneBinding;", "binding", "Lru/ozon/app/android/universalwidgets/databinding/ItemUobjectGridOneBinding;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwGridOneAdapter;", "adapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwGridOneAdapter;", "Ll20/d;", "Lnc/b;", "autoSwipeDisposable", "Lnc/b;", "", "currentItemPosition", "I", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectGridOneViewHolder extends k<ObjectItemsVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final UwGridOneAdapter adapter;
    private InterfaceC8487b autoSwipeDisposable;

    @NotNull
    private final ItemUobjectGridOneBinding binding;
    private int currentItemPosition;
    private d info;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/UniversalObjectGridOneViewHolder$Companion;", "", "<init>", "()V", "PAGER_INDICATOR_LOCATOR_PREFIX", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectGridOneViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, boolean z11) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).buildHandler();
        this.actionHandler = buildHandler;
        final ItemUobjectGridOneBinding bind = ItemUobjectGridOneBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        UwGridOneAdapter uwGridOneAdapter = new UwGridOneAdapter(ref, z11, buildHandler, 0.0f, null, null, 0, this, 120, null);
        this.adapter = uwGridOneAdapter;
        bind.itemsRv.setAdapter(uwGridOneAdapter);
        ScrollingPagerIndicator scrollingPagerIndicator = bind.pagerIndicator;
        scrollingPagerIndicator.setContentDescription("PagerIndicatorPosition.0");
        scrollingPagerIndicator.d(bind.itemsRv);
        new x().attachToRecyclerView(bind.itemsRv);
        bind.itemsRv.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneViewHolder$1$2
            /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
            
                r3 = r2.this$0.autoSwipeDisposable;
             */
            @Override // androidx.recyclerview.widget.RecyclerView.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                InterfaceC8487b interfaceC8487b;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState != 0) {
                    if (newState == 1 && interfaceC8487b != null) {
                        interfaceC8487b.dispose();
                        return;
                    }
                    return;
                }
                RecyclerView.o layoutManager = bind.itemsRv.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    Integer valueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
                    Integer num = valueOf.intValue() >= 0 ? valueOf : null;
                    if (num != null) {
                        ItemUobjectGridOneBinding itemUobjectGridOneBinding = bind;
                        int intValue = num.intValue();
                        itemUobjectGridOneBinding.pagerIndicator.setContentDescription("PagerIndicatorPosition." + intValue);
                    }
                }
            }
        });
        bind.itemsRv.setNestedScrollingEnabled(false);
    }

    private final void startAutoSwipe(ObjectItemsVO item) {
        ItemUobjectGridOneBinding itemUobjectGridOneBinding = this.binding;
        RecyclerView.o layoutManager = itemUobjectGridOneBinding.itemsRv.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        this.currentItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() : 0;
        InterfaceC8487b interfaceC8487b = this.autoSwipeDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.autoSwipeDisposable = p.interval(item.getSpan(), TimeUnit.MILLISECONDS).map(new b(new UniversalObjectGridOneViewHolder$startAutoSwipe$1$1(this, item), 1)).observeOn(C8125a.a()).subscribe(new a(new UniversalObjectGridOneViewHolder$startAutoSwipe$1$2(itemUobjectGridOneBinding), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer startAutoSwipe$lambda$7$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Integer) function1.invoke(p02);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        ObjectItemsVO boundedData = getBoundedData();
        if (boundedData != null) {
            RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
            boundedData.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        ObjectItemsVO boundedData = getBoundedData();
        if (boundedData == null || boundedData.getSpan() == 0 || boundedData.getItems().size() <= 1) {
            return;
        }
        startAutoSwipe(boundedData);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        InterfaceC8487b interfaceC8487b = this.autoSwipeDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ObjectItemsVO item, @NotNull d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
        ItemUobjectGridOneBinding itemUobjectGridOneBinding = this.binding;
        itemUobjectGridOneBinding.uObjectGridOneContainer.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState != null && (layoutManager = itemUobjectGridOneBinding.itemsRv.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(layoutManagerState);
        }
        ScrollingPagerIndicator pagerIndicator = itemUobjectGridOneBinding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator, "pagerIndicator");
        ViewExtKt.showOrGone(pagerIndicator, Boolean.valueOf(!item.getHidePagination()));
        itemUobjectGridOneBinding.pagerIndicator.n(item.getTextColor());
        itemUobjectGridOneBinding.pagerIndicator.l(c.f(item.getTextColor(), 64));
        this.adapter.setInfo(info);
        this.adapter.setRatio(item.getRatio());
        this.adapter.setCornerRadius(item.getCornerRadius());
        this.adapter.setTextAlign(item.getTextAlign());
        this.adapter.setTextColor(item.getTextColor());
        this.adapter.setItems(item.getItems());
        this.adapter.setPaddings(item.getPaddings());
    }
}
