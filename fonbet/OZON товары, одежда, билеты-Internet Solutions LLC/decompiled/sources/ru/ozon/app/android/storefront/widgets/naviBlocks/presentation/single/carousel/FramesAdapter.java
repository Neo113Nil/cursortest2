package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel;

import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B?\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/FramesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/FramesAdapter$FrameViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lkotlin/Function0;", "onLongTapDownListener", "onLongTapUpListener", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/FramesAdapter$FrameViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/FramesAdapter$FrameViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "newItems", "setItems", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "", "items", "Ljava/util/List;", "FrameViewHolder", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FramesAdapter extends RecyclerView.g<FrameViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<FrameVO> items;

    @NotNull
    private final Function0<Unit> onLongTapDownListener;

    @NotNull
    private final Function0<Unit> onLongTapUpListener;

    @NotNull
    private final ComposerReferences references;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/FramesAdapter$FrameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameView;", "frameView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameView;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "frameVo", "", "bind", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameView;", "Lru/ozon/app/android/composer/ComposerReferences;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FrameViewHolder extends RecyclerView.C {

        @NotNull
        private final FrameView frameView;

        @NotNull
        private final ComposerReferences references;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrameViewHolder(@NotNull FrameView frameView, @NotNull ComposerReferences references) {
            super(frameView);
            Intrinsics.checkNotNullParameter(frameView, "frameView");
            Intrinsics.checkNotNullParameter(references, "references");
            this.frameView = frameView;
            this.references = references;
        }

        public final void bind(@NotNull FrameVO frameVo) {
            Intrinsics.checkNotNullParameter(frameVo, "frameVo");
            this.frameView.bind(frameVo, false);
            t tokenizedEvent = frameVo.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FramesAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ComposerReferences references, @NotNull Function0<Unit> onLongTapDownListener, @NotNull Function0<Unit> onLongTapUpListener) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(onLongTapDownListener, "onLongTapDownListener");
        Intrinsics.checkNotNullParameter(onLongTapUpListener, "onLongTapUpListener");
        this.actionHandler = actionHandler;
        this.references = references;
        this.onLongTapDownListener = onLongTapDownListener;
        this.onLongTapUpListener = onLongTapUpListener;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<FrameVO> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        List<FrameVO> list = this.items;
        list.clear();
        list.addAll(newItems);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FrameViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FrameViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FrameView frameView = new FrameView(context, null, 0, 6, null);
        frameView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameView.setOnAction(this.actionHandler);
        frameView.setOnLongTapDown(this.onLongTapDownListener);
        frameView.setOnLongTapUp(this.onLongTapUpListener);
        return new FrameViewHolder(frameView, this.references);
    }
}
