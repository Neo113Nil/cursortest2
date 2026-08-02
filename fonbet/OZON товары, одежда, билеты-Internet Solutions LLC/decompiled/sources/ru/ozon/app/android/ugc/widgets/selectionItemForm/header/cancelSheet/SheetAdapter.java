package ru.ozon.app.android.ugc.widgets.selectionItemForm.header.cancelSheet;

import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u001fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00052\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/SheetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/ItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/ItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/ItemViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "", "items", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "ViewType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SheetAdapter extends RecyclerView.g<ItemViewHolder<?>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<Object> items;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/SheetAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_TEXT", "TYPE_BUTTON", "TYPE_SEPARATOR", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType TYPE_TEXT = new ViewType("TYPE_TEXT", 0);
        public static final ViewType TYPE_BUTTON = new ViewType("TYPE_BUTTON", 1);
        public static final ViewType TYPE_SEPARATOR = new ViewType("TYPE_SEPARATOR", 2);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{TYPE_TEXT, TYPE_BUTTON, TYPE_SEPARATOR};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SheetAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        Object obj = this.items.get(position);
        if (obj instanceof TextDTO) {
            return ViewType.TYPE_TEXT.ordinal();
        }
        if (obj instanceof ButtonV3DTO) {
            return ViewType.TYPE_BUTTON.ordinal();
        }
        if (obj instanceof SeparatorDTO) {
            return ViewType.TYPE_SEPARATOR.ordinal();
        }
        throw new IllegalStateException(("Unknown view type: " + this).toString());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends Object> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder<?> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.items.get(position);
        if (holder instanceof TextItemViewHolder) {
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.text.TextDTO");
            ((TextItemViewHolder) holder).bind((TextDTO) obj);
        } else if (holder instanceof ButtonV3ItemViewHolder) {
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO");
            ((ButtonV3ItemViewHolder) holder).bind((ButtonV3DTO) obj);
        } else if (holder instanceof SeparatorHolder) {
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.widgets.separator.SeparatorDTO");
            ((SeparatorHolder) holder).bind((SeparatorDTO) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ViewType.TYPE_TEXT.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            textAtomV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new TextItemViewHolder(textAtomV2View);
        }
        if (viewType == ViewType.TYPE_BUTTON.ordinal()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ButtonV3View buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
            buttonV3View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new ButtonV3ItemViewHolder(buttonV3View, this.actionHandler);
        }
        if (viewType == ViewType.TYPE_SEPARATOR.ordinal()) {
            View view = new View(parent.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, Dimens.INSTANCE.getDP_8()));
            return new SeparatorHolder(view);
        }
        throw new IllegalStateException(("Unknown view type: " + viewType).toString());
    }
}
