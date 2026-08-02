package ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation;

import Sc.o;
import Xc.a;
import Xc.b;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation.ScrollAnchorViewHolder;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollUpdate;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u001f\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\"B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "scrollAnchorViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;)V", "", "onAttach", "()V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorVO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorViewHolder$ScrollDirection;", "scrollDirection", "Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorViewHolder$ScrollDirection;", "ru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorViewHolder$scrollListener$1;", "ScrollDirection", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScrollAnchorViewHolder extends k<ScrollAnchorVO> {
    private final RecyclerView composerRecyclerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ScrollAnchorViewModel scrollAnchorViewModel;

    @NotNull
    private ScrollDirection scrollDirection;

    @NotNull
    private final ScrollAnchorViewHolder$scrollListener$1 scrollListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorViewHolder$ScrollDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "UNSPECIFIED", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScrollDirection {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ScrollDirection[] $VALUES;
        public static final ScrollDirection UP = new ScrollDirection("UP", 0);
        public static final ScrollDirection DOWN = new ScrollDirection("DOWN", 1);
        public static final ScrollDirection UNSPECIFIED = new ScrollDirection("UNSPECIFIED", 2);

        private static final /* synthetic */ ScrollDirection[] $values() {
            return new ScrollDirection[]{UP, DOWN, UNSPECIFIED};
        }

        static {
            ScrollDirection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ScrollDirection(String str, int i11) {
        }

        public static ScrollDirection valueOf(String str) {
            return (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
        }

        public static ScrollDirection[] values() {
            return (ScrollDirection[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollDirection.values().length];
            try {
                iArr[ScrollDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollDirection.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScrollDirection.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v6, types: [ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation.ScrollAnchorViewHolder$scrollListener$1] */
    public ScrollAnchorViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull ScrollAnchorViewModel scrollAnchorViewModel) {
        super(containerView);
        View view;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(scrollAnchorViewModel, "scrollAnchorViewModel");
        this.references = references;
        this.scrollAnchorViewModel = scrollAnchorViewModel;
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        this.composerRecyclerView = (c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view);
        this.scrollDirection = ScrollDirection.UNSPECIFIED;
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation.ScrollAnchorViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    ScrollAnchorViewHolder.this.scrollDirection = ScrollAnchorViewHolder.ScrollDirection.UNSPECIFIED;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                ScrollAnchorViewHolder.this.scrollDirection = dy > 0 ? ScrollAnchorViewHolder.ScrollDirection.DOWN : dy < 0 ? ScrollAnchorViewHolder.ScrollDirection.UP : ScrollAnchorViewHolder.ScrollDirection.UNSPECIFIED;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ScrollAnchorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.scrollListener);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.scrollListener);
        }
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        ScrollAnchorVO boundData;
        super.onViewInVisibleBounds();
        if (!this.references.getContainer().g().getLifecycle().b().a(AbstractC5434v.b.RESUMED) || (boundData = getBoundData()) == null) {
            return;
        }
        this.scrollAnchorViewModel.sendScrollUpdate(new ScrollUpdate(true, boundData.getScrollAnchorId(), ScrollUpdate.AnchorPosition.IN_VISIBLE_AREA));
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        ScrollUpdate.AnchorPosition anchorPosition;
        super.onViewOutOfVisibleBounds();
        if (this.references.getContainer().g().getLifecycle().b().a(AbstractC5434v.b.RESUMED)) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.scrollDirection.ordinal()];
            if (i11 == 1) {
                anchorPosition = ScrollUpdate.AnchorPosition.BELOW_VISIBLE_AREA;
            } else if (i11 == 2) {
                anchorPosition = ScrollUpdate.AnchorPosition.ABOVE_VISIBLE_AREA;
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                anchorPosition = ScrollUpdate.AnchorPosition.UNSPECIFIED;
            }
            ScrollAnchorVO boundData = getBoundData();
            if (boundData != null) {
                this.scrollAnchorViewModel.sendScrollUpdate(new ScrollUpdate(false, boundData.getScrollAnchorId(), anchorPosition));
            }
        }
    }
}
