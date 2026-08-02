package ru.ozon.app.android.cscore.extendBackground.presentation;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import v10.C10183a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cscore/extendBackground/presentation/ExtendBackgroundViewHolder;", "Ld20/b;", "Lru/ozon/app/android/cscore/extendBackground/presentation/ExtendBackgroundVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/cscore/extendBackground/presentation/ExtendBackgroundItemDecoration;", "findOrCreateExtendBackgroundItemDecoration", "(Landroidx/recyclerview/widget/RecyclerView;)Lru/ozon/app/android/cscore/extendBackground/presentation/ExtendBackgroundItemDecoration;", "", "removeAllExtendBackgroundItemDecoration", "()V", "findComposerRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "item", "bind", "(Lru/ozon/app/android/cscore/extendBackground/presentation/ExtendBackgroundVO;)V", "onWidgetDestroyed", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendBackgroundViewHolder extends AbstractC6065b<ExtendBackgroundVO> {

    @NotNull
    private final i container;
    private final View metricView;

    public ExtendBackgroundViewHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    private final RecyclerView findComposerRecyclerView() {
        View requireView = this.container.Q().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        return C10183a.j(requireView);
    }

    private final ExtendBackgroundItemDecoration findOrCreateExtendBackgroundItemDecoration(RecyclerView recyclerView) {
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i11 = 0; i11 < itemDecorationCount; i11++) {
            RecyclerView.n itemDecorationAt = recyclerView.getItemDecorationAt(i11);
            Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
            if (itemDecorationAt instanceof ExtendBackgroundItemDecoration) {
                return (ExtendBackgroundItemDecoration) itemDecorationAt;
            }
        }
        ExtendBackgroundItemDecoration extendBackgroundItemDecoration = new ExtendBackgroundItemDecoration();
        recyclerView.addItemDecoration(extendBackgroundItemDecoration);
        return extendBackgroundItemDecoration;
    }

    private final void removeAllExtendBackgroundItemDecoration() {
        RecyclerView findComposerRecyclerView = findComposerRecyclerView();
        if (findComposerRecyclerView == null) {
            return;
        }
        int itemDecorationCount = findComposerRecyclerView.getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                return;
            }
            RecyclerView.n itemDecorationAt = findComposerRecyclerView.getItemDecorationAt(itemDecorationCount);
            Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
            if (itemDecorationAt instanceof ExtendBackgroundItemDecoration) {
                findComposerRecyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        removeAllExtendBackgroundItemDecoration();
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ExtendBackgroundVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        RecyclerView findComposerRecyclerView = findComposerRecyclerView();
        if (findComposerRecyclerView == null) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = findComposerRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getColorToken());
        if (parseColor != null) {
            findOrCreateExtendBackgroundItemDecoration(findComposerRecyclerView).bindColor(parseColor.intValue());
        }
    }
}
