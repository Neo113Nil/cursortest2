package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack;

import Xc.a;
import Xc.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/PackVariantsAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackBadgeTopViewHolder;", "createPackBadgeTopViewHolder", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackBadgeTopViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackBadgeBottomRightViewHolder;", "createPackBadgeBottomRightViewHolder", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackBadgeBottomRightViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackViewHolder;", "createPackDefaultViewHolder", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackViewHolder;", "", "viewType", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackVariantBaseViewHolder;", "LX4/a;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackVariantBaseViewHolder;", "position", "getItemViewType", "(I)I", "Type", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackVariantsAdapter extends VariantsAdapter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/PackVariantsAdapter$Type;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "BADGE_TOP", "BADGE_BOTTOM_RIGHT", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final int value;
        public static final Type DEFAULT = new Type("DEFAULT", 0, 0);
        public static final Type BADGE_TOP = new Type("BADGE_TOP", 1, 1);
        public static final Type BADGE_BOTTOM_RIGHT = new Type("BADGE_BOTTOM_RIGHT", 2, 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT, BADGE_TOP, BADGE_BOTTOM_RIGHT};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11, int i12) {
            this.value = i12;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    private final AspectsCompactV2PackBadgeBottomRightViewHolder createPackBadgeBottomRightViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.widget_aspects_compact_v2_pack_badge_bottom_right_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new AspectsCompactV2PackBadgeBottomRightViewHolder(inflate);
    }

    private final AspectsCompactV2PackBadgeTopViewHolder createPackBadgeTopViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.widget_aspects_compact_v2_pack_badge_top_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new AspectsCompactV2PackBadgeTopViewHolder(inflate);
    }

    private final AspectsCompactV2PackViewHolder createPackDefaultViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.widget_aspects_compact_v2_pack_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new AspectsCompactV2PackViewHolder(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$3$lambda$2(AspectsCompactV2PackVariantBaseViewHolder aspectsCompactV2PackVariantBaseViewHolder, PackVariantsAdapter packVariantsAdapter, View view) {
        Integer valueOf = Integer.valueOf(aspectsCompactV2PackVariantBaseViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            Function1<AspectsCompactVO$Variant, Unit> onVariantClick = packVariantsAdapter.getOnVariantClick();
            if (onVariantClick != null) {
                AspectsCompactVO$Variant item = packVariantsAdapter.getItem(intValue);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                onVariantClick.invoke(item);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AspectsCompactVO$Variant item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.AspectsCompactPackVariantV2VO");
        AspectsCompactPackVariantV2VO aspectsCompactPackVariantV2VO = (AspectsCompactPackVariantV2VO) item;
        return (aspectsCompactPackVariantV2VO.getBadge() == null || !aspectsCompactPackVariantV2VO.getIsBadgeTop()) ? (aspectsCompactPackVariantV2VO.getBadge() == null || aspectsCompactPackVariantV2VO.getIsBadgeTop()) ? Type.DEFAULT.getValue() : Type.BADGE_BOTTOM_RIGHT.getValue() : Type.BADGE_TOP.getValue();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter, androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AspectsCompactV2PackVariantBaseViewHolder<X4.a> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        AspectsCompactV2PackVariantBaseViewHolder<X4.a> createPackBadgeBottomRightViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Type.BADGE_TOP.getValue()) {
            createPackBadgeBottomRightViewHolder = createPackBadgeTopViewHolder(parent);
        } else {
            createPackBadgeBottomRightViewHolder = viewType == Type.BADGE_BOTTOM_RIGHT.getValue() ? createPackBadgeBottomRightViewHolder(parent) : createPackDefaultViewHolder(parent);
        }
        createPackBadgeBottomRightViewHolder.itemView.setOnClickListener(new VD.a(4, createPackBadgeBottomRightViewHolder, this));
        return createPackBadgeBottomRightViewHolder;
    }
}
