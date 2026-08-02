package ru.ozon.app.android.search.widgets.feedbackTile.presentation;

import Nk.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.feedbackTile.data.FeedbackTileDTO;
import ru.ozon.app.android.search.widgets.feedbackTile.di.FeedbackTileComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR2\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R<\u0010&\u001a$\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040$j\b\u0012\u0004\u0012\u00020\u0004`%0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006)"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/feedbackTile/di/FeedbackTileComponent;", "Lru/ozon/app/android/search/widgets/feedbackTile/data/FeedbackTileDTO;", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileVO;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView;", "createFeedbackTileView", "(Landroid/content/Context;)Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/search/widgets/feedbackTile/presentation/FeedbackTileView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeedbackTileViewMapper extends WidgetViewMapper2<FeedbackTileComponent, FeedbackTileDTO, FeedbackTileVO> {
    private static final int tileTopMargin = ResourceExtKt.toPx(8);
    private static final int tileBottomMargin = ResourceExtKt.toPx(2);

    @NotNull
    private final Function2<FeedbackTileDTO, d, List<FeedbackTileVO>> mapper = FeedbackTileViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, k<FeedbackTileVO>> holderProducer = new FeedbackTileViewMapper$holderProducer$1(this);

    private final FeedbackTileView createFeedbackTileView(Context context) {
        FeedbackTileView feedbackTileView = (FeedbackTileView) q.f64554a.i(N.b(FeedbackTileView.class), context);
        if (feedbackTileView != null) {
            return feedbackTileView;
        }
        return new FeedbackTileView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof FeedbackTileDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FeedbackTileVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<FeedbackTileDTO, d, List<FeedbackTileVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FeedbackTileComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FeedbackTileComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public FeedbackTileView createView(@NotNull ViewGroup parent) {
        FeedbackTileView createFeedbackTileView = createFeedbackTileView(a.a(parent, "parent", "getContext(...)"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tileTopMargin;
        layoutParams.bottomMargin = tileBottomMargin;
        createFeedbackTileView.setLayoutParams(layoutParams);
        return createFeedbackTileView;
    }
}
