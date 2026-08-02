package ru.ozon.app.android.ugc.widgets.listanswers.core.answer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerVO;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.ListAnswersVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerNoUiViewHolder;", "Ld20/b;", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/ListAnswersVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "Lm10/l;", "adapter", "Ll10/b;", "controller", "", "scrollToHighlightedAnswerIfExists", "(Lm10/l;Ll10/b;)V", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/ListAnswersVO;)V", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnswerNoUiViewHolder extends AbstractC6065b<ListAnswersVO> {

    @NotNull
    private final i container;
    private final View metricView;

    public AnswerNoUiViewHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToHighlightedAnswerIfExists(l adapter, InterfaceC7851b controller) {
        int itemCount = adapter.getItemCount();
        int i11 = 0;
        while (i11 < itemCount) {
            c b11 = adapter.b(i11);
            if ((b11 instanceof AnswerVO) && ((AnswerVO) b11).getIsHighlighted()) {
                int i12 = i11 + 1;
                if (i12 < adapter.getItemCount()) {
                    i11 = i12;
                }
                controller.l(i11);
                return;
            }
            i11++;
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ListAnswersVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        final RecyclerView.g adapter = ComposerViewExtensionKt.composerRecyclerView(this.container.Z()).getAdapter();
        if (adapter == 0) {
            return;
        }
        final l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return;
        }
        adapter.registerAdapterDataObserver(new RecyclerView.i() { // from class: ru.ozon.app.android.ugc.widgets.listanswers.core.answer.AnswerNoUiViewHolder$onWidgetCreated$$inlined$doAfterInsert$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                RecyclerView.g.this.unregisterAdapterDataObserver(this);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeChanged(int positionStart, int itemCount) {
                RecyclerView.g.this.unregisterAdapterDataObserver(this);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                i iVar;
                RecyclerView.g.this.unregisterAdapterDataObserver(this);
                AnswerNoUiViewHolder answerNoUiViewHolder = this;
                l lVar2 = lVar;
                iVar = answerNoUiViewHolder.container;
                answerNoUiViewHolder.scrollToHighlightedAnswerIfExists(lVar2, iVar.M());
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
                RecyclerView.g.this.unregisterAdapterDataObserver(this);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeRemoved(int positionStart, int itemCount) {
                RecyclerView.g.this.unregisterAdapterDataObserver(this);
            }
        });
    }
}
