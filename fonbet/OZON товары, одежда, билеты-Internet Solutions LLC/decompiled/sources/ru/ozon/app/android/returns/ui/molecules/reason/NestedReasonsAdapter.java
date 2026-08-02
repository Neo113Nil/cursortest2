package ru.ozon.app.android.returns.ui.molecules.reason;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.ui.molecules.reason.viewHolder.CellViewHolder;
import ru.ozon.app.android.returns.ui.molecules.reason.viewHolder.InputViewHolder;
import ru.ozon.app.android.returns.ui.molecules.reason.viewHolder.PickedImagesViewHolder;
import ru.ozon.app.android.returns.ui.molecules.reason.viewHolder.ReasonViewHolder;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.app.android.returns.ui.presentation.flexImages.FlexImagesView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$BE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/NestedReasonsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/ReasonViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "inputViewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lkotlin/Function2;", "", "", "onUpdateComment", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/ReasonViewHolder;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/ReasonViewHolder;I)V", "getItemVO", "(I)Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "ViewType", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NestedReasonsAdapter extends t<ReasonRow, ReasonViewHolder> {

    @NotNull
    private final InputViewModel inputViewModel;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function2<Long, String, Unit> onUpdateComment;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/NestedReasonsAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "CELL", "INPUT", "PICKED_IMAGES", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType CELL = new ViewType("CELL", 0);
        public static final ViewType INPUT = new ViewType("INPUT", 1);
        public static final ViewType PICKED_IMAGES = new ViewType("PICKED_IMAGES", 2);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{CELL, INPUT, PICKED_IMAGES};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        @NotNull
        public static a<ViewType> getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.CELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.PICKED_IMAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NestedReasonsAdapter(@NotNull ComposerReferences refs, @NotNull InputViewModel inputViewModel, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function2<? super Long, ? super String, Unit> onUpdateComment) {
        super(new i.d<ReasonRow>() { // from class: ru.ozon.app.android.returns.ui.molecules.reason.NestedReasonsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ReasonRow oldItem, ReasonRow newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof ReasonRow.CellRow) && (newItem instanceof ReasonRow.CellRow)) {
                    return Intrinsics.d(oldItem, newItem);
                }
                if ((oldItem instanceof ReasonRow.InputRow) && (newItem instanceof ReasonRow.InputRow)) {
                    return Intrinsics.d(oldItem, newItem);
                }
                if ((oldItem instanceof ReasonRow.PickedImagesRow) && (newItem instanceof ReasonRow.PickedImagesRow)) {
                    return Intrinsics.d(oldItem, newItem);
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ReasonRow oldItem, ReasonRow newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return ((oldItem instanceof ReasonRow.CellRow) && (newItem instanceof ReasonRow.CellRow)) ? ((ReasonRow.CellRow) oldItem).getId() == ((ReasonRow.CellRow) newItem).getId() : ((oldItem instanceof ReasonRow.InputRow) && (newItem instanceof ReasonRow.InputRow)) ? ((ReasonRow.InputRow) oldItem).getId() == ((ReasonRow.InputRow) newItem).getId() : (oldItem instanceof ReasonRow.PickedImagesRow) && (newItem instanceof ReasonRow.PickedImagesRow) && ((ReasonRow.PickedImagesRow) oldItem).getId() == ((ReasonRow.PickedImagesRow) newItem).getId();
            }
        });
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inputViewModel, "inputViewModel");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onUpdateComment, "onUpdateComment");
        this.refs = refs;
        this.inputViewModel = inputViewModel;
        this.onAction = onAction;
        this.onUpdateComment = onUpdateComment;
    }

    public final ReasonRow getItemVO(int position) {
        if (position < getShimmersCount()) {
            return getItem(position);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ReasonRow item = getItem(position);
        if (item instanceof ReasonRow.CellRow) {
            return ViewType.CELL.ordinal();
        }
        if (item instanceof ReasonRow.InputRow) {
            return ViewType.INPUT.ordinal();
        }
        if (item instanceof ReasonRow.PickedImagesRow) {
            return ViewType.PICKED_IMAGES.ordinal();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ReasonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReasonRow item = getItem(position);
        if (item instanceof ReasonRow.CellRow) {
            ((CellViewHolder) holder).bind((ReasonRow.CellRow) item);
        } else if (item instanceof ReasonRow.InputRow) {
            ((InputViewHolder) holder).bind((ReasonRow.InputRow) item);
        } else {
            if (!(item instanceof ReasonRow.PickedImagesRow)) {
                throw new o();
            }
            ((PickedImagesViewHolder) holder).bind((ReasonRow.PickedImagesRow) item);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ReasonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = WhenMappings.$EnumSwitchMapping$0[((ViewType) ViewType.getEntries().get(viewType)).ordinal()];
        if (i11 == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
            cellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new CellViewHolder(cellView, this.onAction);
        }
        if (i11 == 2) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new InputViewHolder(new TextAreaView(context2, null, 0, 6, null), this.refs, this.inputViewModel, this.onAction, this.onUpdateComment);
        }
        if (i11 != 3) {
            throw new o();
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return new PickedImagesViewHolder(new FlexImagesView(context3, null, 0, 6, null), this.onAction);
    }
}
