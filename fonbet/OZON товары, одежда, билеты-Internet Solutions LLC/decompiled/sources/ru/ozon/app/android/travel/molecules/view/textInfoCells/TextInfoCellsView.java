package ru.ozon.app.android.travel.molecules.view.textInfoCells;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.adapter.TextInfoCellsAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ2\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0004\u0018\u0001`\u000eJ4\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0004\u0018\u0001`\u000eR\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0004\u0018\u0001`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellsView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "onAction", "cellAdapter", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/adapter/TextInfoCellsAdapter;", "bind", "items", "", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "bindOrGone", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextInfoCellsView extends RecyclerView {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final TextInfoCellsAdapter cellAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInfoCellsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(TextInfoCellsView textInfoCellsView, List list, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        textInfoCellsView.bind(list, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindOrGone$default(TextInfoCellsView textInfoCellsView, List list, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        textInfoCellsView.bindOrGone(list, function1);
    }

    public final void bind(@NotNull List<TextInfoCellVO> items, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.actionHandler = actionHandler;
        this.cellAdapter.setItems(items);
    }

    public final void bindOrGone(List<TextInfoCellVO> items, Function1<? super AtomAction, Unit> actionHandler) {
        List<TextInfoCellVO> list = items;
        if (list == null || list.isEmpty()) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(items, actionHandler);
        }
    }

    public /* synthetic */ TextInfoCellsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInfoCellsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextInfoCellsView$onAction$1 textInfoCellsView$onAction$1 = new TextInfoCellsView$onAction$1(this);
        this.onAction = textInfoCellsView$onAction$1;
        TextInfoCellsAdapter textInfoCellsAdapter = new TextInfoCellsAdapter(textInfoCellsView$onAction$1);
        this.cellAdapter = textInfoCellsAdapter;
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        setAdapter(textInfoCellsAdapter);
    }
}
