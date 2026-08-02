package ru.ozon.app.android.fresh.common.widgets.horizontalListWidget;

import Ey.RunnableC2974a;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 !*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\u0004\b\u0001\u0010\u00042\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006:\u0001!B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0016\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010 \u001a\f\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u001d8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewHolder;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "VO", "ItemModel", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "saveScrollState", "()V", "", "badgeList", "Landroid/os/Parcelable;", "newScrollState", "Lkotlin/Function0;", "postSubmitAction", "submitList", "(Ljava/util/List;Landroid/os/Parcelable;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "", "lastSavedScrollStateHash", "I", "Landroidx/recyclerview/widget/t;", "getAdapter", "()Landroidx/recyclerview/widget/t;", "adapter", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AbstractHorizontalListViewHolder<VO extends c, ItemModel> extends k<VO> {

    @NotNull
    protected static final Companion Companion = new Companion(null);
    private int lastSavedScrollStateHash;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewHolder$Companion;", "", "<init>", "()V", "FIRST_ITEM_POSITION", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHorizontalListViewHolder(@NotNull RecyclerView recyclerView, @NotNull ComposerReferences refs) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.recyclerView = recyclerView;
        this.refs = refs;
        recyclerView.addOnScrollListener(new RecyclerView.t(this) { // from class: ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder.1
            final /* synthetic */ AbstractHorizontalListViewHolder<VO, ItemModel> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    this.this$0.saveScrollState();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [l20.c] */
    public final void saveScrollState() {
        Parcelable onSaveInstanceState;
        int hashCode;
        ?? boundData = getBoundData();
        if (boundData != 0) {
            long id2 = boundData.getId();
            RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
            if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null || this.lastSavedScrollStateHash == (hashCode = onSaveInstanceState.hashCode())) {
                return;
            }
            this.lastSavedScrollStateHash = hashCode;
            this.refs.getController().update(new ScrollStateUpdate(id2, onSaveInstanceState));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(AbstractHorizontalListViewHolder abstractHorizontalListViewHolder, List list, Parcelable parcelable, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        abstractHorizontalListViewHolder.submitList(list, parcelable, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$0(Parcelable parcelable, AbstractHorizontalListViewHolder abstractHorizontalListViewHolder, Function0 function0) {
        if (parcelable == null) {
            abstractHorizontalListViewHolder.recyclerView.scrollToPosition(0);
        } else {
            RecyclerView.o layoutManager = abstractHorizontalListViewHolder.recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(parcelable);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @NotNull
    protected abstract t<ItemModel, ?> getAdapter();

    /* JADX WARN: Multi-variable type inference failed */
    protected final void submitList(@NotNull List<? extends ItemModel> badgeList, Parcelable newScrollState, Function0<Unit> postSubmitAction) {
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        getAdapter().submitList(badgeList, new RunnableC2974a(newScrollState, this, postSubmitAction, 2));
    }
}
