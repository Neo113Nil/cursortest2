package ru.ozon.app.android.platform.rv.looped;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;

@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001-\u0018\u0000 02\u00020\u0001:\u0003012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ!\u0010 \u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010#\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010$\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\u0018J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u0018R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setInitialPosition", "()V", "position", "findNearestPosition", "(I)I", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "getAdapter", "()Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "smoothScrollToPosition", "(I)V", "scrollToPosition", "Landroidx/recyclerview/widget/RecyclerView$C;", "findViewHolderForAdapterPosition", "(I)Landroidx/recyclerview/widget/RecyclerView$C;", "initListeners", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnPositionChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "clearOnPositionChangeListener", "findCorrectViewHolderForAdapterPosition", "smoothScrollToCorrectPosition", "scrollToCorrectPosition", "itemsCount", "I", "logicCurrentPosition", "realCurrentPosition", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$ScrollListenerForPositionChanges;", "scrollListenerForPositionChanges", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$ScrollListenerForPositionChanges;", "ru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$adapterDataObserver$1", "adapterDataObserver", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$adapterDataObserver$1;", "Companion", "ScrollListenerForPositionChanges", "ItemPosition", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoopedRecyclerView extends RecyclerView {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LoopedRecyclerView$adapterDataObserver$1 adapterDataObserver;
    private int itemsCount;
    private int logicCurrentPosition;
    private int realCurrentPosition;

    @NotNull
    private final ScrollListenerForPositionChanges scrollListenerForPositionChanges;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$Companion;", "", "<init>", "()V", "ITEMS_COUNT", "", "MIDDLE_POSITION", "MIN_ITEMS_COUNT_FOR_LOOP", "getCorrectPosition", "position", "itemsCount", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCorrectPosition(int position, int itemsCount) {
            if (itemsCount > 0) {
                return (((position - 50000) % itemsCount) + itemsCount) % itemsCount;
            }
            LoggerExtKt.sendNonFatal$default(new IllegalStateException("itemsCount должен быть больше 0!"), null, null, null, 14, null);
            return 0;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0012R)\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00040\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$ScrollListenerForPositionChanges;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "loopedRecyclerView", "Lkotlin/Function1;", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$ItemPosition;", "", "onPositionChanged", "<init>", "(Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "newPosition", "onManualSetPosition", "(I)V", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Lkotlin/jvm/functions/Function1;", "itemsCount", "I", "getItemsCount", "()I", "setItemsCount", "", "onPositionChangeListeners", "Ljava/util/List;", "getOnPositionChangeListeners", "()Ljava/util/List;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager$delegate", "LSc/j;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ScrollListenerForPositionChanges extends RecyclerView.t {
        private int itemsCount;

        /* renamed from: layoutManager$delegate, reason: from kotlin metadata */
        @NotNull
        private final InterfaceC4008j layoutManager;

        @NotNull
        private final LoopedRecyclerView loopedRecyclerView;

        @NotNull
        private final List<Function1<Integer, Unit>> onPositionChangeListeners;

        @NotNull
        private final Function1<ItemPosition, Unit> onPositionChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public ScrollListenerForPositionChanges(@NotNull LoopedRecyclerView loopedRecyclerView, @NotNull Function1<? super ItemPosition, Unit> onPositionChanged) {
            Intrinsics.checkNotNullParameter(loopedRecyclerView, "loopedRecyclerView");
            Intrinsics.checkNotNullParameter(onPositionChanged, "onPositionChanged");
            this.loopedRecyclerView = loopedRecyclerView;
            this.onPositionChanged = onPositionChanged;
            this.onPositionChangeListeners = new ArrayList();
            this.layoutManager = k.a(n.NONE, new LoopedRecyclerView$ScrollListenerForPositionChanges$layoutManager$2(this));
        }

        private final LinearLayoutManager getLayoutManager() {
            return (LinearLayoutManager) this.layoutManager.getValue();
        }

        @NotNull
        public final List<Function1<Integer, Unit>> getOnPositionChangeListeners() {
            return this.onPositionChangeListeners;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onManualSetPosition(int newPosition) {
            this.onPositionChanged.invoke(new ItemPosition(newPosition, null, 2, 0 == true ? 1 : 0));
            Iterator<T> it = this.onPositionChangeListeners.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Integer.valueOf(newPosition));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            int findFirstCompletelyVisibleItemPosition;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState != 0 || (findFirstCompletelyVisibleItemPosition = getLayoutManager().findFirstCompletelyVisibleItemPosition()) == -1) {
                return;
            }
            int correctPosition = LoopedRecyclerView.INSTANCE.getCorrectPosition(findFirstCompletelyVisibleItemPosition, this.itemsCount);
            this.onPositionChanged.invoke(new ItemPosition(correctPosition, Integer.valueOf(findFirstCompletelyVisibleItemPosition)));
            Iterator<T> it = this.onPositionChangeListeners.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Integer.valueOf(correctPosition));
            }
        }

        public final void setItemsCount(int i11) {
            this.itemsCount = i11;
        }
    }

    public /* synthetic */ LoopedRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int findNearestPosition(int position) {
        return (position - this.logicCurrentPosition) + this.realCurrentPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInitialPosition() {
        this.logicCurrentPosition = 0;
        if (getAdapter().getCorrectItemsCount() < 2) {
            this.realCurrentPosition = 0;
        } else {
            this.realCurrentPosition = 50000;
            super.scrollToPosition(50000);
        }
    }

    public final void addOnPositionChangeListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.scrollListenerForPositionChanges.getOnPositionChangeListeners().add(listener);
    }

    public final void clearOnPositionChangeListener() {
        this.scrollListenerForPositionChanges.getOnPositionChangeListeners().clear();
    }

    public final RecyclerView.C findCorrectViewHolderForAdapterPosition(int position) {
        return super.findViewHolderForAdapterPosition(findNearestPosition(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @InterfaceC3999a
    public RecyclerView.C findViewHolderForAdapterPosition(int position) {
        return super.findViewHolderForAdapterPosition(position);
    }

    public final void initListeners() {
        addOnScrollListener(this.scrollListenerForPositionChanges);
    }

    public final void scrollToCorrectPosition(int position) {
        int findNearestPosition = findNearestPosition(position);
        this.realCurrentPosition = findNearestPosition;
        super.scrollToPosition(findNearestPosition);
        this.scrollListenerForPositionChanges.onManualSetPosition(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @InterfaceC3999a
    public void scrollToPosition(int position) {
        super.scrollToPosition(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.g<?> adapter) {
        if (super.getAdapter() != null) {
            throw new IllegalStateException("Адаптер можно установить только один раз.");
        }
        if (!(adapter instanceof LoopedAdapter)) {
            throw new IllegalArgumentException("Для LoopedRecyclerView нужно использовать LoopedAdapter!");
        }
        super.setAdapter(adapter);
        ((LoopedAdapter) adapter).registerAdapterDataObserver(this.adapterDataObserver);
    }

    public final void smoothScrollToCorrectPosition(int position) {
        super.smoothScrollToPosition(findNearestPosition(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @InterfaceC3999a
    public void smoothScrollToPosition(int position) {
        super.smoothScrollToPosition(position);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView$adapterDataObserver$1] */
    public LoopedRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollListenerForPositionChanges = new ScrollListenerForPositionChanges(this, new LoopedRecyclerView$scrollListenerForPositionChanges$1(this));
        this.adapterDataObserver = new RecyclerView.i(this) { // from class: ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView$adapterDataObserver$1
            private final Function0<Unit> updatePosition;

            {
                this.updatePosition = new LoopedRecyclerView$adapterDataObserver$1$updatePosition$1(this);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                this.updatePosition.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeChanged(int positionStart, int itemCount) {
                this.updatePosition.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                this.updatePosition.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
                this.updatePosition.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeRemoved(int positionStart, int itemCount) {
                this.updatePosition.invoke();
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @NotNull
    public LoopedAdapter<?> getAdapter() {
        RecyclerView.g adapter = super.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.platform.rv.looped.LoopedAdapter<*>");
        return (LoopedAdapter) adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView$ItemPosition;", "", "logicPosition", "", "realPosition", "<init>", "(ILjava/lang/Integer;)V", "getLogicPosition", "()I", "getRealPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ItemPosition {
        private final int logicPosition;
        private final Integer realPosition;

        public ItemPosition(int i11, Integer num) {
            this.logicPosition = i11;
            this.realPosition = num;
        }

        public final int getLogicPosition() {
            return this.logicPosition;
        }

        public final Integer getRealPosition() {
            return this.realPosition;
        }

        public /* synthetic */ ItemPosition(int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : num);
        }
    }
}
