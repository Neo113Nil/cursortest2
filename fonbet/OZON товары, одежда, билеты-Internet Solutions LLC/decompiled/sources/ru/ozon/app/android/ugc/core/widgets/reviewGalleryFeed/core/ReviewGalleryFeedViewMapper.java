package ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core;

import Sc.o;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.core.R$layout;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.data.ReviewGalleryFeedDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.di.ReviewGalleryFeedComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.ReviewGalleryFeedItemDecoration;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.ReviewGalleryFeedVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation.ReviewGalleryFeedViewHolder;
import ru.ozon.composer.ui.widget.h;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R2\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R,\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/core/ReviewGalleryFeedViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/di/ReviewGalleryFeedComponent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedVO;", "<init>", "()V", "state", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedVO;)Lru/ozon/composer/ui/widget/h;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedViewHolder;", "holderProducer", "getHolderProducer", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryFeedViewMapper extends WidgetViewMapper2<ReviewGalleryFeedComponent, ReviewGalleryFeedDTO, ReviewGalleryFeedVO> {

    @NotNull
    private final Function2<ReviewGalleryFeedDTO, d, List<ReviewGalleryFeedVO>> mapper = ReviewGalleryFeedViewMapper$mapper$1.INSTANCE;
    private final int layout = R$layout.widget_review_gallery_feed;

    @NotNull
    private final Function2<View, ComposerReferences, ReviewGalleryFeedViewHolder> holderProducer = new ReviewGalleryFeedViewMapper$holderProducer$1(this);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewGalleryFeedDTO.LayoutType.values().length];
            try {
                iArr[ReviewGalleryFeedDTO.LayoutType.LAYOUT_TYPE_GRID_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewGalleryFeedDTO.LayoutType.LAYOUT_TYPE_GRID_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ReviewGalleryFeedItemDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ReviewGalleryFeedViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ReviewGalleryFeedDTO, d, List<ReviewGalleryFeedVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewGalleryFeedComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewGalleryFeedComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull ReviewGalleryFeedDTO state, @NotNull ReviewGalleryFeedVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getLayoutType().ordinal()];
        if (i11 == 1) {
            return h.b.f94870b;
        }
        if (i11 == 2) {
            return h.c.f94871b;
        }
        throw new o();
    }
}
