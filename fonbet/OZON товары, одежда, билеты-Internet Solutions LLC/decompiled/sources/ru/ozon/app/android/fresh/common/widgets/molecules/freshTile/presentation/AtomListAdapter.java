package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import Sc.o;
import V.e;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.atoms.v3.holders.labelList.LabelListAtomViewHolderKt;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.presentation.FreshTextPairView;
import ru.ozon.app.android.uikit.view.atoms.labelList.LabelListView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003/01B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u000b*\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000b*\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u000b2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\u0004\b+\u0010,R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;", "<init>", "()V", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$LabelListViewHolder;", "holder", "", "reviewsLocator", "labelLocator", "", "bindLabelList", "(Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$LabelListViewHolder;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$PriceViewHolder;", "priceLocator", "bindPrice", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$PriceViewHolder;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextAtomViewHolder;", "bindText", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextAtomViewHolder;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextPairViewHolder;", "bindTextPair", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextPairViewHolder;)V", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "newItems", "submit", "(Ljava/util/List;)V", "currentList", "Ljava/util/List;", "Companion", "AtomViewType", "AtomListItemViewHolder", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AtomListAdapter extends RecyclerView.g<AtomListItemViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int labelListStartPadding;
    private static final int labelListVerticalPadding;

    @NotNull
    private List<? extends AtomDTO> currentList = K.f71697a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "PriceViewHolder", "TextAtomViewHolder", "TextPairViewHolder", "LabelListViewHolder", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$LabelListViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$PriceViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextAtomViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextPairViewHolder;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AtomListItemViewHolder extends RecyclerView.C {

        @NotNull
        private final View view;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$LabelListViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;", "view", "Lru/ozon/app/android/uikit/view/atoms/labelList/LabelListView;", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/labelList/LabelListView;)V", "getView", "()Lru/ozon/app/android/uikit/view/atoms/labelList/LabelListView;", "bind", "", "atom", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LabelListViewHolder extends AtomListItemViewHolder {

            @NotNull
            private final LabelListView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LabelListViewHolder(@NotNull LabelListView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            public final void bind(@NotNull LabelListAtom atom) {
                Intrinsics.checkNotNullParameter(atom, "atom");
                LabelListAtomViewHolderKt.bindOrGone$default(getView(), atom, null, 2, null);
                LabelListView view = getView();
                LabelListAtom.Label label = (LabelListAtom.Label) C7714v.M(atom.getItems());
                view.setPadding((label != null ? label.getIcon() : null) == null ? AtomListAdapter.Companion.getLabelListStartPadding() : 0, AtomListAdapter.Companion.getLabelListVerticalPadding(), 0, AtomListAdapter.Companion.getLabelListVerticalPadding());
            }

            @NotNull
            public LabelListView getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$PriceViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;", "view", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "<init>", "(Lru/ozon/uni/android/atom/price/ui/PriceAtomView;)V", "getView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PriceViewHolder extends AtomListItemViewHolder {

            @NotNull
            private final PriceAtomView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PriceViewHolder(@NotNull PriceAtomView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            public PriceAtomView getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextAtomViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;", "view", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "getView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TextAtomViewHolder extends AtomListItemViewHolder {

            @NotNull
            private final TextAtomV2View view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextAtomViewHolder(@NotNull TextAtomV2View view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            public TextAtomV2View getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder$TextPairViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomListItemViewHolder;", "view", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/presentation/FreshTextPairView;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/presentation/FreshTextPairView;)V", "getView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/presentation/FreshTextPairView;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TextPairViewHolder extends AtomListItemViewHolder {

            @NotNull
            private final FreshTextPairView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextPairViewHolder(@NotNull FreshTextPairView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            public FreshTextPairView getView() {
                return this.view;
            }
        }

        public /* synthetic */ AtomListItemViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private AtomListItemViewHolder(View view) {
            super(view);
            this.view = view;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$AtomViewType;", "", "<init>", "(Ljava/lang/String;I)V", "PRICE", "LABEL_LIST", "TEXT", "TEXT_PAIR", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AtomViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AtomViewType[] $VALUES;
        public static final AtomViewType PRICE = new AtomViewType("PRICE", 0);
        public static final AtomViewType LABEL_LIST = new AtomViewType("LABEL_LIST", 1);
        public static final AtomViewType TEXT = new AtomViewType("TEXT", 2);
        public static final AtomViewType TEXT_PAIR = new AtomViewType("TEXT_PAIR", 3);

        private static final /* synthetic */ AtomViewType[] $values() {
            return new AtomViewType[]{PRICE, LABEL_LIST, TEXT, TEXT_PAIR};
        }

        static {
            AtomViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AtomViewType(String str, int i11) {
        }

        public static AtomViewType valueOf(String str) {
            return (AtomViewType) Enum.valueOf(AtomViewType.class, str);
        }

        public static AtomViewType[] values() {
            return (AtomViewType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter$Companion;", "", "<init>", "()V", "ERROR_MESSAGE", "", "labelListStartPadding", "", "getLabelListStartPadding", "()I", "labelListVerticalPadding", "getLabelListVerticalPadding", "PRICE_LOCATOR", "LABEL_LOCATOR", "REVIEWS_LOCATOR", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLabelListStartPadding() {
            return AtomListAdapter.labelListStartPadding;
        }

        public final int getLabelListVerticalPadding() {
            return AtomListAdapter.labelListVerticalPadding;
        }

        private Companion() {
        }
    }

    static {
        Paddings paddings = Paddings.PADDING_100;
        labelListStartPadding = UiExtKt.toPx(paddings.getPx());
        labelListVerticalPadding = UiExtKt.toPx(paddings.getPx());
    }

    private final void bindLabelList(LabelListAtom labelListAtom, AtomListItemViewHolder.LabelListViewHolder labelListViewHolder, String str, String str2) {
        labelListViewHolder.bind(labelListAtom);
        LabelListView view = labelListViewHolder.getView();
        if (labelListAtom.getItems().size() <= 1) {
            str = str2;
        }
        view.setContentDescription(str);
    }

    private final void bindPrice(PriceDTO priceDTO, AtomListItemViewHolder.PriceViewHolder priceViewHolder, String str) {
        String str2;
        String text;
        PriceAtomHolderKt.bind$default(priceViewHolder.getView(), priceDTO, null, 2, null);
        PriceDTO.Component component = (PriceDTO.Component) C7714v.Q(0, priceDTO.getPrice());
        String str3 = "";
        if (component == null || (str2 = component.getText()) == null) {
            str2 = "";
        }
        PriceDTO.Component component2 = (PriceDTO.Component) C7714v.Q(2, priceDTO.getPrice());
        if (component2 != null && (text = component2.getText()) != null) {
            str3 = e.b(new Object[]{text}, 1, " oldPrice_%s", "format(...)");
        }
        PriceAtomView view = priceViewHolder.getView();
        String format = String.format(str, Arrays.copyOf(new Object[]{str2, str3}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        view.setContentDescription(format);
    }

    private final void bindText(TextDTO textDTO, AtomListItemViewHolder.TextAtomViewHolder textAtomViewHolder) {
        TextHolderKt.bind$default(textAtomViewHolder.getView(), textDTO, null, 2, null);
        textAtomViewHolder.getView().setContentDescription(textDTO.getText());
    }

    private final void bindTextPair(FreshTextPairDTO freshTextPairDTO, AtomListItemViewHolder.TextPairViewHolder textPairViewHolder) {
        textPairViewHolder.getView().bindOrGone(freshTextPairDTO);
        FreshTextPairView view = textPairViewHolder.getView();
        OzonSpannableString[] elements = {freshTextPairDTO.getEllipsizableText().getText(), freshTextPairDTO.getTrailingText().getText()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        view.setContentDescription(C7714v.V(C7705l.B(elements), " | ", null, null, null, 62));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.currentList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AtomDTO atomDTO = this.currentList.get(position);
        if (atomDTO instanceof PriceDTO) {
            return AtomViewType.PRICE.ordinal();
        }
        if (atomDTO instanceof LabelListAtom) {
            return AtomViewType.LABEL_LIST.ordinal();
        }
        if (atomDTO instanceof TextDTO) {
            return AtomViewType.TEXT.ordinal();
        }
        if (atomDTO instanceof FreshTextPairDTO) {
            return AtomViewType.TEXT_PAIR.ordinal();
        }
        throw new IllegalStateException("No such FreshTile AtomList ViewHolder");
    }

    public final void submit(List<? extends AtomDTO> newItems) {
        if (newItems == null) {
            newItems = K.f71697a;
        }
        i.c a11 = i.a(new AtomListItemDiffUtilCallback(newItems, this.currentList), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.currentList = newItems;
        a11.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AtomListItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AtomDTO atomDTO = (AtomDTO) C7714v.Q(position, this.currentList);
        if (holder instanceof AtomListItemViewHolder.LabelListViewHolder) {
            LabelListAtom labelListAtom = atomDTO instanceof LabelListAtom ? (LabelListAtom) atomDTO : null;
            if (labelListAtom != null) {
                bindLabelList(labelListAtom, (AtomListItemViewHolder.LabelListViewHolder) holder, "rating", "label");
                return;
            }
            return;
        }
        if (holder instanceof AtomListItemViewHolder.PriceViewHolder) {
            PriceDTO priceDTO = atomDTO instanceof PriceDTO ? (PriceDTO) atomDTO : null;
            if (priceDTO != null) {
                bindPrice(priceDTO, (AtomListItemViewHolder.PriceViewHolder) holder, "price_%s%s");
                return;
            }
            return;
        }
        if (holder instanceof AtomListItemViewHolder.TextAtomViewHolder) {
            TextDTO textDTO = atomDTO instanceof TextDTO ? (TextDTO) atomDTO : null;
            if (textDTO != null) {
                bindText(textDTO, (AtomListItemViewHolder.TextAtomViewHolder) holder);
                return;
            }
            return;
        }
        if (!(holder instanceof AtomListItemViewHolder.TextPairViewHolder)) {
            throw new o();
        }
        FreshTextPairDTO freshTextPairDTO = atomDTO instanceof FreshTextPairDTO ? (FreshTextPairDTO) atomDTO : null;
        if (freshTextPairDTO != null) {
            bindTextPair(freshTextPairDTO, (AtomListItemViewHolder.TextPairViewHolder) holder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AtomListItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == AtomViewType.PRICE.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
            priceAtomView.setId(R$id.freshTileAtomListPrice);
            return new AtomListItemViewHolder.PriceViewHolder(priceAtomView);
        }
        if (viewType == AtomViewType.LABEL_LIST.ordinal()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new AtomListItemViewHolder.LabelListViewHolder(new LabelListView(context2, null, 0, 6, null));
        }
        if (viewType == AtomViewType.TEXT.ordinal()) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            TextAtomV2View textAtomV2View = new TextAtomV2View(context3, null, 0, 6, null);
            textAtomV2View.setId(R$id.freshTileAtomListSkuName);
            return new AtomListItemViewHolder.TextAtomViewHolder(textAtomV2View);
        }
        if (viewType != AtomViewType.TEXT_PAIR.ordinal()) {
            throw new IllegalStateException("No such FreshTile AtomList ViewHolder");
        }
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        FreshTextPairView freshTextPairView = new FreshTextPairView(context4, null, 2, 0 == true ? 1 : 0);
        freshTextPairView.setId(R$id.freshTileAtomListSkuName);
        return new AtomListItemViewHolder.TextPairViewHolder(freshTextPairView);
    }
}
