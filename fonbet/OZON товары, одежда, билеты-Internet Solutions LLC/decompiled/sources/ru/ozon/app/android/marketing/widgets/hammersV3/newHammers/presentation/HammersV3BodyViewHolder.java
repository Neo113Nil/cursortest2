package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation;

import W10.c;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerBinderFrameWrapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerMultiFrameBinderDelegate;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductPropertyBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BodyVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 22\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u00012B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u001aJ#\u0010&\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$H\u0014¢\u0006\u0004\b&\u0010'J3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)2\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersV3BodyViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerBinderFrameWrapper;", "propertyWrappers", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerMultiFrameBinderDelegate;", "frameBinder", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Ljava/util/Set;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerMultiFrameBinderDelegate;)V", "item", "", "widgetId", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;Ljava/lang/String;Lru/ozon/composer/ui/widget/f;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "onAttach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onDetach", "onRecycle", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Ljava/util/Set;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerMultiFrameBinderDelegate;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3BodyViewHolder extends k<HammersV3BodyVO> {

    @NotNull
    private final View containerView;

    @NotNull
    private final HammerMultiFrameBinderDelegate frameBinder;

    @NotNull
    private final Set<HammerBinderFrameWrapper> propertyWrappers;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int VIEW_PADDING_TOP = UiExtKt.toPx(2);
    private static final int VIEW_PADDING_TOP_WITHOUT_HEADER = UiExtKt.toPx(14);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersV3BodyViewHolder$Companion;", "", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersV3BodyViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull Set<HammerBinderFrameWrapper> propertyWrappers, @NotNull HammerMultiFrameBinderDelegate frameBinder) {
        super(containerView);
        RecyclerView recyclerView;
        View view;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(propertyWrappers, "propertyWrappers");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.containerView = containerView;
        this.refs = refs;
        this.propertyWrappers = propertyWrappers;
        this.frameBinder = frameBinder;
        Iterator<T> it = propertyWrappers.iterator();
        while (true) {
            recyclerView = null;
            ViewGroup viewGroup = null;
            recyclerView = null;
            if (!it.hasNext()) {
                break;
            }
            HammerProductPropertyBinder binder = ((HammerBinderFrameWrapper) it.next()).getBinder();
            ComposerReferences composerReferences = this.refs;
            View containerView2 = getContainerView();
            if (containerView2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) containerView2;
            }
            binder.init(this, composerReferences, viewGroup);
        }
        HammerMultiFrameBinderDelegate hammerMultiFrameBinderDelegate = this.frameBinder;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        hammerMultiFrameBinderDelegate.init(itemView);
        HammerMultiFrameBinderDelegate hammerMultiFrameBinderDelegate2 = this.frameBinder;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null) {
            recyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
        }
        hammerMultiFrameBinderDelegate2.applyRecycler(recyclerView);
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.frameBinder.onAttach(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        Iterator<T> it = this.propertyWrappers.iterator();
        while (it.hasNext()) {
            ((HammerBinderFrameWrapper) it.next()).getBinder().detach();
        }
        this.frameBinder.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        Iterator<T> it = this.propertyWrappers.iterator();
        while (it.hasNext()) {
            ((HammerBinderFrameWrapper) it.next()).getBinder().recycle();
        }
        this.frameBinder.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Iterator<T> it = this.propertyWrappers.iterator();
        while (it.hasNext()) {
            ((HammerBinderFrameWrapper) it.next()).getBinder().onViewInVisibleBounds();
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        Iterator<T> it = this.propertyWrappers.iterator();
        while (it.hasNext()) {
            ((HammerBinderFrameWrapper) it.next()).getBinder().onViewOutOfVisibleBounds();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HammersV3BodyVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (getContainerView() instanceof HammersBodyView) {
            Iterator<T> it = this.propertyWrappers.iterator();
            while (it.hasNext()) {
                ((HammerBinderFrameWrapper) it.next()).getBinder().bindVO(item);
            }
            this.frameBinder.bind(item, info, this);
            getContainerView().setPadding(0, item.getHasHeader() ? VIEW_PADDING_TOP : VIEW_PADDING_TOP_WITHOUT_HEADER, 0, 0);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HammersV3BodyVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HammersV3BodyViewHolder) item, trackingData, viewedPond);
        String c11 = trackingData.c();
        if (c11 == null) {
            c11 = "";
        }
        trackView(item, c11, viewedPond);
    }

    private final void trackView(HammersV3BodyVO item, String widgetId, f viewedPond) {
        t tokenizedEvent;
        if (viewedPond == null || viewedPond.b(item.getId(), widgetId) || (tokenizedEvent = item.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        viewedPond.d(Long.valueOf(item.getId()), widgetId);
    }
}
