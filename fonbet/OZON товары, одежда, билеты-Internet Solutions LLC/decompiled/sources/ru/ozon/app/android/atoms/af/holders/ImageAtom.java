package ru.ozon.app.android.atoms.af.holders;

import AD.b;
import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.databinding.AtomImageBinding;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.deprecated.Image;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0002H\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/ImageAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/deprecated/Image;", "Lru/ozon/app/android/atoms/af/holders/ImageAtom$Configuration;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomImageBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "radius", "", "strokeWidth", "onConfigureView", "", "configuration", "onBind", "item", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageAtom extends Atom<Image, Configuration> {

    @NotNull
    private final AtomImageBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;
    private final float radius;
    private final float strokeWidth;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b \u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b!\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/ImageAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "imageWidth", "imageHeight", "", "isLoadWithCrop", "<init>", "(IIIIIIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "getImageWidth", "getImageHeight", "Z", "()Z", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final int imageHeight;
        private final int imageWidth;
        private final boolean isLoadWithCrop;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;

        public Configuration() {
            this(0, 0, 0, 0, 0, 0, false, 127, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.imageWidth == configuration.imageWidth && this.imageHeight == configuration.imageHeight && this.isLoadWithCrop == configuration.isLoadWithCrop;
        }

        public final int getImageHeight() {
            return this.imageHeight;
        }

        public final int getImageWidth() {
            return this.imageWidth;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingEnd() {
            return this.paddingEnd;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingStart() {
            return this.paddingStart;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingTop() {
            return this.paddingTop;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoadWithCrop) + C2454a.a(this.imageHeight, C2454a.a(this.imageWidth, C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31), 31);
        }

        /* renamed from: isLoadWithCrop, reason: from getter */
        public final boolean getIsLoadWithCrop() {
            return this.isLoadWithCrop;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingBottom(int i11) {
            this.paddingBottom = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingEnd(int i11) {
            this.paddingEnd = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingStart(int i11) {
            this.paddingStart = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingTop(int i11) {
            this.paddingTop = i11;
        }

        @NotNull
        public String toString() {
            int i11 = this.paddingStart;
            int i12 = this.paddingEnd;
            int i13 = this.paddingTop;
            int i14 = this.paddingBottom;
            int i15 = this.imageWidth;
            int i16 = this.imageHeight;
            boolean z11 = this.isLoadWithCrop;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", imageWidth=", a11);
            a.f(i15, i16, ", imageHeight=", ", isLoadWithCrop=", a11);
            return Pk0.a.a(")", a11, z11);
        }

        public Configuration(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.imageWidth = i15;
            this.imageHeight = i16;
            this.isLoadWithCrop = z11;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 72 : i15, (i17 & 32) != 0 ? 72 : i16, (i17 & 64) != 0 ? true : z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomImageBinding bind = AtomImageBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Image.class, null, 2, 0 == true ? 1 : 0), new Configuration(0, 0, 0, 0, 0, 0, false, 127, null)));
        this.radius = getContext().getResources().getDimensionPixelSize(R$dimen.design_default_radius);
        this.strokeWidth = ResourceExtKt.toPxF(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ImageAtom imageAtom, View view) {
        AtomAction atomAction$default;
        Image data = imageAtom.getData();
        AtomActionDTO action = data.getAction();
        if (action == null || (atomAction$default = AtomActionMapperKt.toAtomAction$default(action, data, data.getTrackingInfo(), null, 4, null)) == null) {
            return;
        }
        imageAtom.handleAction(atomAction$default);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Integer valueOf = item.getBorderColor() != null ? Integer.valueOf(StyleParser.INSTANCE.parseColor(getContext(), item.getBorderColor(), R$color.oz_semantic_accent_alert)) : null;
        if (valueOf != null) {
            if (getCurrentConfiguration().getIsLoadWithCrop()) {
                ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
                ImageView imageIv = this.binding.imageIv;
                Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
                imageLoader.loadCropAndRoundInDark(imageIv, item.getImage());
            } else {
                ImageLoader imageLoader2 = AtomConfig.INSTANCE.getImageLoader();
                ImageView imageIv2 = this.binding.imageIv;
                Intrinsics.checkNotNullExpressionValue(imageIv2, "imageIv");
                imageLoader2.loadRoundCorners(imageIv2, item.getImage());
            }
        } else if (getCurrentConfiguration().getIsLoadWithCrop()) {
            ImageLoader imageLoader3 = AtomConfig.INSTANCE.getImageLoader();
            ImageView imageIv3 = this.binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv3, "imageIv");
            imageLoader3.loadCropInDark(imageIv3, item.getImage());
        } else {
            ImageLoader imageLoader4 = AtomConfig.INSTANCE.getImageLoader();
            ImageView imageIv4 = this.binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv4, "imageIv");
            imageLoader4.load(imageIv4, item.getImage());
        }
        if (valueOf != null) {
            View borderV = this.binding.borderV;
            Intrinsics.checkNotNullExpressionValue(borderV, "borderV");
            ViewExtKt.show(borderV);
            View view = this.binding.borderV;
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = this.radius;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(valueOf.intValue());
            shapeDrawable.getPaint().setStrokeWidth(this.strokeWidth);
            shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
            view.setBackground(shapeDrawable);
        } else {
            View borderV2 = this.binding.borderV;
            Intrinsics.checkNotNullExpressionValue(borderV2, "borderV");
            ViewExtKt.gone(borderV2);
        }
        ClickableCiewKt.switchClickable(getContainerView(), item.getAction() != null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
        ViewGroup.LayoutParams layoutParams = this.binding.imageIv.getLayoutParams();
        layoutParams.width = ResourceExtKt.toPx(configuration.getImageWidth());
        layoutParams.height = ResourceExtKt.toPx(configuration.getImageHeight());
        getContainerView().requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_image, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        getContainerView().setOnClickListener(new b(this, 4));
    }
}
