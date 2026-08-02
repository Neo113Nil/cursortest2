package ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle;

import Dy.ViewOnClickListenerC2883a;
import Sc.o;
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
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.AspectsImageTitleVariantV2VO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/ImageTitleVariantV2Adapter;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/ColorTitleVariantV2ViewHolder;", "createColorViewHolder", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/ColorTitleVariantV2ViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/ImageTitleVariantV2ViewHolder;", "createImageViewHolder", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/ImageTitleVariantV2ViewHolder;", "", "viewType", "Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/BaseImageTitleVariantV2ViewHolder;", "LX4/a;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/BaseImageTitleVariantV2ViewHolder;", "position", "getItemViewType", "(I)I", "Type", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageTitleVariantV2Adapter extends VariantsAdapter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/ImageTitleVariantV2Adapter$Type;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "IMAGE", "COLOR", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final int value;
        public static final Type IMAGE = new Type("IMAGE", 0, 0);
        public static final Type COLOR = new Type("COLOR", 1, 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{IMAGE, COLOR};
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

    private final ColorTitleVariantV2ViewHolder createColorViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.widget_aspects_v2_text_color_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ColorTitleVariantV2ViewHolder(inflate);
    }

    private final ImageTitleVariantV2ViewHolder createImageViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.widget_aspects_v2_text_image_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ImageTitleVariantV2ViewHolder(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$3$lambda$2(BaseImageTitleVariantV2ViewHolder baseImageTitleVariantV2ViewHolder, ImageTitleVariantV2Adapter imageTitleVariantV2Adapter, View view) {
        Integer valueOf = Integer.valueOf(baseImageTitleVariantV2ViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            Function1<AspectsCompactVO$Variant, Unit> onVariantClick = imageTitleVariantV2Adapter.getOnVariantClick();
            if (onVariantClick != null) {
                AspectsCompactVO$Variant item = imageTitleVariantV2Adapter.getItem(intValue);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                onVariantClick.invoke(item);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AspectsCompactVO$Variant item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.AspectsImageTitleVariantV2VO");
        AspectsImageTitleVariantV2VO.ImageVariant imageVariant = ((AspectsImageTitleVariantV2VO) item).getImageVariant();
        if (imageVariant instanceof AspectsImageTitleVariantV2VO.ImageVariant.Image) {
            return Type.IMAGE.getValue();
        }
        if (imageVariant instanceof AspectsImageTitleVariantV2VO.ImageVariant.Color) {
            return Type.COLOR.getValue();
        }
        throw new o();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter, androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseImageTitleVariantV2ViewHolder<X4.a> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        BaseImageTitleVariantV2ViewHolder<X4.a> createColorViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Type.IMAGE.getValue()) {
            createColorViewHolder = createImageViewHolder(parent);
        } else {
            createColorViewHolder = viewType == Type.COLOR.getValue() ? createColorViewHolder(parent) : createImageViewHolder(parent);
        }
        createColorViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC2883a(11, createColorViewHolder, this));
        return createColorViewHolder;
    }
}
