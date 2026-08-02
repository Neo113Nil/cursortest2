package ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation;

import WZ.l;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeVO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002!\"B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\f2\n\u0010\u0019\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO$Size;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter$SizeViewHolder;", "", "isMultiline", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "isSelect", "Lkotlin/Function1;", "", "", "onNewSelected", "<init>", "(ZLWZ/l;ZLkotlin/jvm/functions/Function1;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter$SizeViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter$SizeViewHolder;I)V", "Z", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "getOnNewSelected", "()Lkotlin/jvm/functions/Function1;", "SizeViewHolder", "AspectSizeType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4SizeAdapter extends t<AspectsV4SizeVO.Size, SizeViewHolder> {
    private final boolean isMultiline;
    private final boolean isSelect;

    @NotNull
    private final Function1<String, Unit> onNewSelected;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter$AspectSizeType;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "TITLE_SUBTITLE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class AspectSizeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AspectSizeType[] $VALUES;
        public static final AspectSizeType TITLE = new AspectSizeType(SelectionItemDescriptionDTO.TITLE, 0);
        public static final AspectSizeType TITLE_SUBTITLE = new AspectSizeType("TITLE_SUBTITLE", 1);

        private static final /* synthetic */ AspectSizeType[] $values() {
            return new AspectSizeType[]{TITLE, TITLE_SUBTITLE};
        }

        static {
            AspectSizeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AspectSizeType(String str, int i11) {
        }

        public static AspectSizeType valueOf(String str) {
            return (AspectSizeType) Enum.valueOf(AspectSizeType.class, str);
        }

        public static AspectSizeType[] values() {
            return (AspectSizeType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter$SizeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeViewItem;", "aspectView", "<init>", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeAdapter;Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeViewItem;)V", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO$Size;", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO$Size;)V", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeViewItem;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SizeViewHolder extends RecyclerView.C {

        @NotNull
        private final AspectsV4SizeViewItem aspectView;
        final /* synthetic */ AspectsV4SizeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SizeViewHolder(@NotNull AspectsV4SizeAdapter aspectsV4SizeAdapter, AspectsV4SizeViewItem aspectView) {
            super(aspectView.getRoot());
            Intrinsics.checkNotNullParameter(aspectView, "aspectView");
            this.this$0 = aspectsV4SizeAdapter;
            this.aspectView = aspectView;
        }

        public final void bind(@NotNull AspectsV4SizeVO.Size item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.aspectView.bind(item, new AspectsV4SizeAdapter$SizeViewHolder$bind$1(item, this.this$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AspectsV4SizeAdapter(boolean z11, @NotNull l tokenizedAnalytics, boolean z12, @NotNull Function1<? super String, Unit> onNewSelected) {
        super(new i.d<AspectsV4SizeVO.Size>() { // from class: ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AspectsV4SizeVO.Size oldItem, AspectsV4SizeVO.Size newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AspectsV4SizeVO.Size oldItem, AspectsV4SizeVO.Size newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (!Intrinsics.d(oldItem.getText().getText(), newItem.getText().getText())) {
                    return false;
                }
                TextDTO subtext = oldItem.getSubtext();
                OzonSpannableString text = subtext != null ? subtext.getText() : null;
                TextDTO subtext2 = oldItem.getSubtext();
                return Intrinsics.d(text, subtext2 != null ? subtext2.getText() : null);
            }
        });
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onNewSelected, "onNewSelected");
        this.isMultiline = z11;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isSelect = z12;
        this.onNewSelected = onNewSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getSubtext() != null ? AspectSizeType.TITLE_SUBTITLE.ordinal() : AspectSizeType.TITLE.ordinal();
    }

    @NotNull
    public final Function1<String, Unit> getOnNewSelected() {
        return this.onNewSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SizeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AspectsV4SizeVO.Size item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SizeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        AspectsV4SizeViewItem aspectsV4SizeViewWrapper;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == AspectSizeType.TITLE_SUBTITLE.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            aspectsV4SizeViewWrapper = new AspectV4SizeNewView(context, true, this.isSelect, this.isMultiline);
        } else if (viewType == AspectSizeType.TITLE.ordinal()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            aspectsV4SizeViewWrapper = new AspectV4SizeNewView(context2, false, this.isSelect, this.isMultiline);
        } else {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            aspectsV4SizeViewWrapper = new AspectsV4SizeViewWrapper(context3, this.isMultiline);
        }
        return new SizeViewHolder(this, aspectsV4SizeViewWrapper);
    }
}
