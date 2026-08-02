package ru.ozon.app.android.product.molecules.blur.presentation;

import Bi.b;
import EX.c;
import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0014\u0018\u0000 #2\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001bJ\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0016\u0010\u001f\u001a\u00020\u0017*\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0018\u0010\"\u001a\u00020\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001bH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconId", "descriptionId", "placeholderIV", "Landroidx/appcompat/widget/AppCompatImageView;", "iconIv", "descriptionTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "cornerRadius", "", "cornerOutlineProvider", "ru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView$cornerOutlineProvider$1", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView$cornerOutlineProvider$1;", "bind", "", "blurItem", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "onClick", "Lkotlin/Function0;", "bindBlurImage", ImagesContract.URL, "", "bindOrGone", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "setClickAction", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BlurMoleculeView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_16 = ResourceExtKt.toPx(16);
    private static final int DP_4 = ResourceExtKt.toPx(4);

    @NotNull
    private final BlurMoleculeView$cornerOutlineProvider$1 cornerOutlineProvider;
    private float cornerRadius;
    private final int descriptionId;

    @NotNull
    private final TextAtomV2View descriptionTv;
    private final int iconId;

    @NotNull
    private final AppCompatImageView iconIv;

    @NotNull
    private final AppCompatImageView placeholderIV;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            updateConstraints.F(0, 0, new int[]{BlurMoleculeView.this.iconId, BlurMoleculeView.this.descriptionId}, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView$Companion;", "", "<init>", "()V", "", "LOCATOR", "Ljava/lang/String;", "ICON_TINT_DEFAULT", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ BlurMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBlurImage(String url) {
        if (url == null || url.length() == 0) {
            ImageViewExtKt.clearResource(this.placeholderIV);
        } else {
            ImageViewExtKt.load$default(this.placeholderIV, url, null, null, null, null, false, null, 126, null);
        }
    }

    private final void bindOrGone(AppCompatImageView appCompatImageView, CommonAtomIconDTO commonAtomIconDTO) {
        if (commonAtomIconDTO == null) {
            appCompatImageView.setVisibility(8);
            return;
        }
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, commonAtomIconDTO.getIcon());
        if (iconResByToken != null) {
            this.iconIv.setImageResource(iconResByToken.intValue());
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String tintColor = commonAtomIconDTO.getTintColor();
        if (tintColor == null) {
            tintColor = "graphicSecondaryOnLight";
        }
        Integer mapColor = styleParser.mapColor(context2, tintColor);
        if (mapColor != null) {
            int intValue = mapColor.intValue();
            AppCompatImageView appCompatImageView2 = this.iconIv;
            Context context3 = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            appCompatImageView2.setColorFilter(ResourceExtKt.color(context3, intValue), PorterDuff.Mode.SRC_IN);
        }
        appCompatImageView.setVisibility(0);
    }

    private final void setClickAction(Function0<Unit> onClick) {
        if (onClick != null) {
            setOnClickListener(new c(onClick, 2));
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    public final void bind(BlurMoleculeVO blurItem, Function0<Unit> onClick) {
        if (blurItem == null) {
            setVisibility(8);
            return;
        }
        Float cornerRadius = blurItem.getCornerRadius();
        this.cornerRadius = cornerRadius != null ? cornerRadius.floatValue() : 0.0f;
        bindBlurImage(blurItem.getBlurPlaceholderImage());
        bindOrGone(this.iconIv, blurItem.getIcon());
        TextHolderKt.bindOrGone$default(this.descriptionTv, blurItem.getText(), null, 2, null);
        this.descriptionTv.setTextIsSelectable(false);
        setClickAction(onClick);
        setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.ViewOutlineProvider, ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView$cornerOutlineProvider$1] */
    public BlurMoleculeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int generateViewId = View.generateViewId();
        this.iconId = generateViewId;
        int generateViewId2 = View.generateViewId();
        this.descriptionId = generateViewId2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        appCompatImageView.setLayoutParams(bVar);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(appCompatImageView);
        this.placeholderIV = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(generateViewId);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41636i = 0;
        bVar2.f41640k = generateViewId2;
        appCompatImageView2.setLayoutParams(bVar2);
        addView(appCompatImageView2);
        this.iconIv = appCompatImageView2;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, generateViewId2, -2, -2);
        d11.f41656t = 0;
        d11.f41658v = 0;
        d11.f41638j = generateViewId;
        d11.f41642l = 0;
        int i12 = DP_16;
        d11.setMarginStart(i12);
        d11.setMarginEnd(i12);
        ((ViewGroup.MarginLayoutParams) d11).topMargin = DP_4;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.descriptionTv = textAtomV2View;
        ?? r11 = new ViewOutlineProvider() { // from class: ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView$cornerOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                float f11;
                int f12 = C3143a.f(view, "view", outline, "outline");
                float height = view.getHeight();
                f7 = BlurMoleculeView.this.cornerRadius;
                f11 = BlurMoleculeView.this.cornerRadius;
                outline.setRoundRect(0, 0, f12, (int) (f7 + height), f11);
            }
        };
        this.cornerOutlineProvider = r11;
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
        setContentDescription("BlurMoleculeContainer");
        setOutlineProvider(r11);
        setClipToOutline(true);
        setBackgroundColor(ResourceExtKt.color(context, R$color.bg_light_key));
    }
}
