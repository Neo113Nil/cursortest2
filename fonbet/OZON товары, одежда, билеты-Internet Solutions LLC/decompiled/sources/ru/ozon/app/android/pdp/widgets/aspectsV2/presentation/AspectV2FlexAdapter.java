package ru.ozon.app.android.pdp.widgets.aspectsV2.presentation;

import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.WidgetFullAspectsV2TextLayoutBinding;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.text.AspectsTextVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2TilesLayoutBinding;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.text.AspectsV2TextViewHolderFlex;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.tiles.AspectsV2TileViewHolderFlex;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexInnerVH;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexInnerVH;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexInnerVH;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Lru/ozon/app/android/composer/ComposerReferences;", "FlexViewType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectV2FlexAdapter extends t<AspectsCompactVO$Variant, AspectV2FlexInnerVH<AspectsCompactVO$Variant>> {
    public static final int $stable = ComposerReferences.$stable;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectV2FlexAdapter$FlexViewType;", "", "<init>", "(Ljava/lang/String;I)V", "TILE", "TEXT", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class FlexViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FlexViewType[] $VALUES;
        public static final FlexViewType TILE = new FlexViewType("TILE", 0);
        public static final FlexViewType TEXT = new FlexViewType("TEXT", 1);

        private static final /* synthetic */ FlexViewType[] $values() {
            return new FlexViewType[]{TILE, TEXT};
        }

        static {
            FlexViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FlexViewType(String str, int i11) {
        }

        public static FlexViewType valueOf(String str) {
            return (FlexViewType) Enum.valueOf(FlexViewType.class, str);
        }

        public static FlexViewType[] values() {
            return (FlexViewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectV2FlexAdapter(@NotNull ComposerReferences refs) {
        super(new i.d<AspectsCompactVO$Variant>() { // from class: ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectV2FlexAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(AspectsCompactVO$Variant oldItem, AspectsCompactVO$Variant newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AspectsCompactVO$Variant oldItem, AspectsCompactVO$Variant newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        });
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return (getCurrentList().get(position) instanceof AspectsTextVariantV2VO ? FlexViewType.TEXT : FlexViewType.TILE).ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AspectV2FlexInnerVH<AspectsCompactVO$Variant> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AspectsCompactVO$Variant aspectsCompactVO$Variant = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(aspectsCompactVO$Variant, "get(...)");
        holder.bind(aspectsCompactVO$Variant);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AspectV2FlexInnerVH<AspectsCompactVO$Variant> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == FlexViewType.TILE.ordinal()) {
            WidgetAspectsCompactV2TilesLayoutBinding inflate = WidgetAspectsCompactV2TilesLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new AspectsV2TileViewHolderFlex(inflate, this.refs);
        }
        WidgetFullAspectsV2TextLayoutBinding inflate2 = WidgetFullAspectsV2TextLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new AspectsV2TextViewHolderFlex(inflate2, this.refs);
    }
}
