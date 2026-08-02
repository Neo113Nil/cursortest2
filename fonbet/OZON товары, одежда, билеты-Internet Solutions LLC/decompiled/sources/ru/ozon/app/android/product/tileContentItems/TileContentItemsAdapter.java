package ru.ozon.app.android.product.tileContentItems;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.atoms.v3.holders.labelList.LabelListAtomViewHolder;
import ru.ozon.app.android.product.ViewExtensionsKt;
import ru.ozon.app.android.product.labelList.presentation.view.LabelListView;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListVO;
import ru.ozon.app.android.product.tileContentItems.vh.LabelListV2ViewHolder;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolder;
import ru.ozon.uni.atoms.v3.holders.text.TextHolder;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolder;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u001f\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0015\u001a\u00020\u0014*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b(\u0010)R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter$TileItemType;", "getAtomViewType", "(Lru/ozon/uni/atoms/data/AtomDTO;)Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter$TileItemType;", "Landroidx/appcompat/widget/AppCompatTextView;", "disableSpannableClickOnText", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "Lru/ozon/uni/atoms/af/Atom;", "onAction", "Landroid/view/ViewGroup$MarginLayoutParams;", "layoutParams", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "createVHV2", "(Lru/ozon/uni/atoms/af/Atom;Lkotlin/jvm/functions/Function1;Landroid/view/ViewGroup$MarginLayoutParams;)Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "newItems", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "items", "Ljava/util/List;", "TileItemType", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileContentItemsAdapter extends RecyclerView.g<RecyclerView.C> {
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<? extends TileContentItem> items;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter$TileItemType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "PRICE", "LABEL_LIST", "TEXT", "TEXT_V2", "LABEL_LIST_V2", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TileItemType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TileItemType[] $VALUES;
        private final int id;
        public static final TileItemType PRICE = new TileItemType("PRICE", 0, 1000);
        public static final TileItemType LABEL_LIST = new TileItemType("LABEL_LIST", 1, 10001);
        public static final TileItemType TEXT = new TileItemType("TEXT", 2, 10003);
        public static final TileItemType TEXT_V2 = new TileItemType("TEXT_V2", 3, 10004);
        public static final TileItemType LABEL_LIST_V2 = new TileItemType("LABEL_LIST_V2", 4, 10005);

        private static final /* synthetic */ TileItemType[] $values() {
            return new TileItemType[]{PRICE, LABEL_LIST, TEXT, TEXT_V2, LABEL_LIST_V2};
        }

        static {
            TileItemType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TileItemType(String str, int i11, int i12) {
            this.id = i12;
        }

        public static TileItemType valueOf(String str) {
            return (TileItemType) Enum.valueOf(TileItemType.class, str);
        }

        public static TileItemType[] values() {
            return (TileItemType[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TileContentItemsAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final AtomItemViewHolder createVHV2(Atom<?, ?> atom, Function1<? super AtomAction, Unit> function1, ViewGroup.MarginLayoutParams marginLayoutParams) {
        atom.setOnAtomAction(function1);
        View containerView = atom.getContainerView();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        containerView.setLayoutParams(marginLayoutParams);
        return new AtomItemViewHolder(atom, null, null);
    }

    static /* synthetic */ AtomItemViewHolder createVHV2$default(TileContentItemsAdapter tileContentItemsAdapter, Atom atom, Function1 function1, ViewGroup.MarginLayoutParams marginLayoutParams, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            marginLayoutParams = null;
        }
        return tileContentItemsAdapter.createVHV2(atom, function1, marginLayoutParams);
    }

    private final void disableSpannableClickOnText(AppCompatTextView appCompatTextView) {
        appCompatTextView.setMovementMethod(null);
    }

    private final TileItemType getAtomViewType(AtomDTO atomDTO) {
        if (atomDTO instanceof PriceDTO) {
            return TileItemType.PRICE;
        }
        if (atomDTO instanceof LabelListAtom) {
            return TileItemType.LABEL_LIST;
        }
        if (atomDTO instanceof TextDTO) {
            return TileItemType.TEXT_V2;
        }
        if (atomDTO instanceof TextAtom) {
            return TileItemType.TEXT;
        }
        throw new IllegalArgumentException("Wrong viewType for " + atomDTO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TileItemType tileItemType;
        TileContentItem tileContentItem = this.items.get(position);
        if (tileContentItem instanceof TileContentItem.Atom) {
            tileItemType = getAtomViewType(((TileContentItem.Atom) tileContentItem).getAtom());
        } else {
            if (!(tileContentItem instanceof TileContentItem.LabelListV2)) {
                throw new o();
            }
            tileItemType = TileItemType.LABEL_LIST_V2;
        }
        return tileItemType.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        LabelListVO labelList;
        AtomDTO atom;
        TextAtomV2View textAtomV2View;
        Intrinsics.checkNotNullParameter(holder, "holder");
        TileContentItem tileContentItem = this.items.get(position);
        if (!(holder instanceof AtomItemViewHolder)) {
            if (holder instanceof LabelListV2ViewHolder) {
                TileContentItem.LabelListV2 labelListV2 = tileContentItem instanceof TileContentItem.LabelListV2 ? (TileContentItem.LabelListV2) tileContentItem : null;
                if (labelListV2 == null || (labelList = labelListV2.getLabelList()) == null) {
                    return;
                }
                ((LabelListV2ViewHolder) holder).bind(labelList);
                View view = holder.itemView;
                AppCompatTextView appCompatTextView = view instanceof AppCompatTextView ? (AppCompatTextView) view : null;
                if (appCompatTextView != null) {
                    disableSpannableClickOnText(appCompatTextView);
                    return;
                }
                return;
            }
            return;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtensionsKt.disableEmojiProcessingWithDescendants(itemView);
        TileContentItem.Atom atom2 = tileContentItem instanceof TileContentItem.Atom ? (TileContentItem.Atom) tileContentItem : null;
        if (atom2 == null || (atom = atom2.getAtom()) == null) {
            return;
        }
        AtomItemViewHolder atomItemViewHolder = (AtomItemViewHolder) holder;
        atomItemViewHolder.bind(atom);
        Atom<? super AtomDTO, ? super Atom.AtomConfiguration> atom3 = atomItemViewHolder.getAtom();
        TextHolder textHolder = atom3 instanceof TextHolder ? (TextHolder) atom3 : null;
        if (textHolder == null || (textAtomV2View = (TextAtomV2View) textHolder.getContainerView()) == null) {
            return;
        }
        disableSpannableClickOnText(textAtomV2View);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == TileItemType.PRICE.getId()) {
            Intrinsics.f(context);
            return createVHV2$default(this, new PriceAtomHolder(context, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == TileItemType.LABEL_LIST.getId()) {
            Intrinsics.f(context);
            return createVHV2$default(this, new LabelListAtomViewHolder(context, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType == TileItemType.TEXT_V2.getId()) {
            Intrinsics.f(context);
            AtomItemViewHolder createVHV2$default = createVHV2$default(this, new TextHolder(context, (String) null), this.actionHandler, null, 2, null);
            View view = createVHV2$default.itemView;
            TextAtomV2View textAtomV2View = view instanceof TextAtomV2View ? (TextAtomV2View) view : null;
            if (textAtomV2View != null) {
                textAtomV2View.setTextIsSelectable(false);
            }
            return createVHV2$default;
        }
        if (viewType == TileItemType.TEXT.getId()) {
            Intrinsics.f(context);
            return createVHV2$default(this, new TextAtomHolder(context, (String) null), this.actionHandler, null, 2, null);
        }
        if (viewType != TileItemType.LABEL_LIST_V2.getId()) {
            throw new IllegalArgumentException(Ej.b.a(viewType, "Wrong viewType: "));
        }
        LabelListView.Companion companion = LabelListView.INSTANCE;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new LabelListV2ViewHolder(companion.create(context2));
    }

    public final void submitList(@NotNull List<? extends TileContentItem> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        i.c a11 = i.a(new TileItemsDiffUtilCallback(this.items, newItems), false);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.items = newItems;
        a11.c(this);
    }

    public /* synthetic */ TileContentItemsAdapter(Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TileContentItemsAdapter(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
        this.items = K.f71697a;
    }
}
