package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import Lc0.e;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.G;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color.AspectColorVariantView;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetComparisonCharacteristicGroupItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetComparisonCharateristicsGroupColumnItemBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicType;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicsGroupVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.rating.RatingView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharacteristicGroupItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharacteristicGroupItemBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/View;", "columnView", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicType;", "type", "", "setupColumn", "(Landroid/view/View;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicType;)Ljava/lang/Object;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharateristicsGroupColumnItemBinding;", "", "resetChildViews", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharateristicsGroupColumnItemBinding;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "atom", "alignRatingAtomText", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;", "characteristic", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;)V", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharacteristicGroupItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicViewHolder extends RecyclerView.C {

    @NotNull
    private final PdpWidgetComparisonCharacteristicGroupItemBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicViewHolder(@NotNull PdpWidgetComparisonCharacteristicGroupItemBinding binding, @NotNull ComposerReferences composerReferences) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.binding = binding;
        this.composerReferences = composerReferences;
    }

    private final void alignRatingAtomText(SingleAtom atom) {
        View childAt = atom.getChildAt(0);
        final RatingView ratingView = childAt instanceof RatingView ? (RatingView) childAt : null;
        if (ratingView != null) {
            G.a(ratingView, new Runnable() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicViewHolder$alignRatingAtomText$lambda$13$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view = ratingView;
                    Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.android.uikit.view.atoms.rating.RatingView");
                    RatingView ratingView2 = (RatingView) view;
                    View childAt2 = ratingView2.getChildAt(1);
                    TextView textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
                    if (textView != null) {
                        if (textView.getLineCount() == 1) {
                            ratingView2.setGravity(16);
                        } else {
                            ratingView2.setGravity(1);
                        }
                    }
                }
            });
        }
    }

    private final void resetChildViews(PdpWidgetComparisonCharateristicsGroupColumnItemBinding pdpWidgetComparisonCharateristicsGroupColumnItemBinding) {
        SingleAtom atomSA = pdpWidgetComparisonCharateristicsGroupColumnItemBinding.atomSA;
        Intrinsics.checkNotNullExpressionValue(atomSA, "atomSA");
        ViewExtKt.gone(atomSA);
        ImageView imageIV = pdpWidgetComparisonCharateristicsGroupColumnItemBinding.imageIV;
        Intrinsics.checkNotNullExpressionValue(imageIV, "imageIV");
        ViewExtKt.gone(imageIV);
        AspectColorVariantView colorACVV = pdpWidgetComparisonCharateristicsGroupColumnItemBinding.colorACVV;
        Intrinsics.checkNotNullExpressionValue(colorACVV, "colorACVV");
        ViewExtKt.gone(colorACVV);
        ViewGroup.LayoutParams layoutParams = pdpWidgetComparisonCharateristicsGroupColumnItemBinding.colorACVV.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = 0;
            pdpWidgetComparisonCharateristicsGroupColumnItemBinding.colorACVV.setLayoutParams(layoutParams2);
        }
        TextView textTV = pdpWidgetComparisonCharateristicsGroupColumnItemBinding.textTV;
        Intrinsics.checkNotNullExpressionValue(textTV, "textTV");
        ViewExtKt.gone(textTV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color.AspectColorVariantView] */
    @SuppressLint({"DefaultLocale"})
    private final Object setupColumn(View columnView, CharacteristicType type) {
        ?? r02;
        PdpWidgetComparisonCharateristicsGroupColumnItemBinding bind = PdpWidgetComparisonCharateristicsGroupColumnItemBinding.bind(columnView);
        Intrinsics.f(bind);
        resetChildViews(bind);
        if (type instanceof CharacteristicType.Badge) {
            SingleAtom atomSA = bind.atomSA;
            Intrinsics.checkNotNullExpressionValue(atomSA, "atomSA");
            ViewExtKt.show(atomSA);
            SingleAtom.bind$default(bind.atomSA, ((CharacteristicType.Badge) type).getBadge(), false, 2, null);
            return Unit.f71690a;
        }
        if (type instanceof CharacteristicType.Color) {
            TextView textTV = bind.textTV;
            Intrinsics.checkNotNullExpressionValue(textTV, "textTV");
            ViewExtKt.show(textTV);
            CharacteristicType.Color color = (CharacteristicType.Color) type;
            bind.textTV.setText(h.q(color.getTitle()));
            List<String> colors = color.getColors();
            if (colors != null) {
                r02 = new ArrayList();
                for (String str : colors) {
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context = bind.getConstraintLayout().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Integer parseColor = styleParser.parseColor(context, str);
                    if (parseColor != null) {
                        r02.add(parseColor);
                    }
                }
            } else {
                r02 = K.f71697a;
            }
            bind.colorACVV.setColors(r02);
            ViewGroup.LayoutParams layoutParams = bind.colorACVV.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = ResourceExtKt.toPx(18);
                bind.colorACVV.setLayoutParams(layoutParams2);
            }
            AspectColorVariantView colorACVV = bind.colorACVV;
            Intrinsics.checkNotNullExpressionValue(colorACVV, "colorACVV");
            ViewExtKt.show(colorACVV);
            return Unit.f71690a;
        }
        if (type instanceof CharacteristicType.Image) {
            ImageView imageIV = bind.imageIV;
            Intrinsics.checkNotNullExpressionValue(imageIV, "imageIV");
            ViewExtKt.show(imageIV);
            ImageView imageIV2 = bind.imageIV;
            Intrinsics.checkNotNullExpressionValue(imageIV2, "imageIV");
            ImageViewExtKt.loadImageOrGone(imageIV2, ((CharacteristicType.Image) type).getUrl());
            return Unit.f71690a;
        }
        if (type instanceof CharacteristicType.Rating) {
            SingleAtom singleAtom = bind.atomSA;
            Intrinsics.f(singleAtom);
            ViewExtKt.show(singleAtom);
            SingleAtom.bind$default(singleAtom, ((CharacteristicType.Rating) type).getRatingAtom(), false, 2, null);
            singleAtom.setOnClickListener(new e(7, this, (CharacteristicType.Rating) type));
            alignRatingAtomText(singleAtom);
            return Unit.f71690a;
        }
        if (!(type instanceof CharacteristicType.TextCharacteristics)) {
            throw new o();
        }
        TextView textView = bind.textTV;
        Intrinsics.f(textView);
        ViewExtKt.show(textView);
        StringBuilder sb2 = new StringBuilder();
        CharacteristicType.TextCharacteristics textCharacteristics = (CharacteristicType.TextCharacteristics) type;
        int i11 = 0;
        for (Object obj : textCharacteristics.getValues()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CharacteristicType.TextCharacteristics.Text text = (CharacteristicType.TextCharacteristics.Text) obj;
            if (i11 != C7714v.P(textCharacteristics.getValues())) {
                String[] value = {text.getValue(), "\n"};
                Intrinsics.checkNotNullParameter(sb2, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                for (int i13 = 0; i13 < 2; i13++) {
                    sb2.append(value[i13]);
                }
            } else {
                sb2.append(text.getValue());
            }
            i11 = i12;
        }
        textView.setText(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(textView, "apply(...)");
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupColumn$lambda$9$lambda$6$lambda$5(CharacteristicViewHolder characteristicViewHolder, CharacteristicType characteristicType, View view) {
        ComposerNavigator.DefaultImpls.openDeeplink$default(characteristicViewHolder.composerReferences.getNavigator(), ((CharacteristicType.Rating) characteristicType).getDeeplink(), null, 2, null);
    }

    public final void bind(@NotNull CharacteristicsGroupVO.Characteristic characteristic) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        PdpWidgetComparisonCharacteristicGroupItemBinding pdpWidgetComparisonCharacteristicGroupItemBinding = this.binding;
        pdpWidgetComparisonCharacteristicGroupItemBinding.groupSubtitleTV.setText(characteristic.getTitle());
        int i11 = 0;
        for (Object obj : characteristic.getColumns()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CharacteristicType characteristicType = (CharacteristicType) obj;
            if (characteristicType != null) {
                if (i11 == 0) {
                    LinearLayout columnLL = pdpWidgetComparisonCharacteristicGroupItemBinding.leftColumn.columnLL;
                    Intrinsics.checkNotNullExpressionValue(columnLL, "columnLL");
                    setupColumn(columnLL, characteristicType);
                } else if (i11 == 1) {
                    LinearLayout columnLL2 = pdpWidgetComparisonCharacteristicGroupItemBinding.rightColumn.columnLL;
                    Intrinsics.checkNotNullExpressionValue(columnLL2, "columnLL");
                    setupColumn(columnLL2, characteristicType);
                }
            }
            i11 = i12;
        }
    }
}
