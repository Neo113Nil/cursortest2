package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2;

import X4.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.b;
import androidx.core.view.G;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$VariantV2;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color.AspectsColorVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.image.AspectsImageVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.media.AspectsCompactMediaVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.AspectsCompactPackVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.text.AspectsTextVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles.AspectsCompactTilesVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.AspectsImageTitleVariantV2VO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR<\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "LX4/a;", "<init>", "()V", "Landroid/view/View;", "variant", "", "setParandjaForAspects", "(Landroid/view/View;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "", "getCornerRadius", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)F", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;I)V", "Lkotlin/Function1;", "variantsHolder", "Lkotlin/jvm/functions/Function1;", "getVariantsHolder", "()Lkotlin/jvm/functions/Function1;", "setVariantsHolder", "(Lkotlin/jvm/functions/Function1;)V", "onVariantClick", "getOnVariantClick", "setOnVariantClick", "dp6", "F", "dp8", "dp12", "dp16", "dp20", "Landroidx/recyclerview/widget/RecyclerView;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public class VariantsAdapter extends t<AspectsCompactVO$Variant, VariantsViewHolder<AspectsCompactVO$Variant, ? extends a>> {
    private final float dp12;
    private final float dp16;
    private final float dp20;
    private final float dp6;
    private final float dp8;
    private Function1<? super AspectsCompactVO$Variant, Unit> onVariantClick;
    private RecyclerView recyclerView;
    private Function1<? super ViewGroup, ? extends VariantsViewHolder<AspectsCompactVO$Variant, ? extends a>> variantsHolder;

    public VariantsAdapter() {
        super(new i.d<AspectsCompactVO$Variant>() { // from class: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
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
        this.dp6 = ResourceExtKt.toPxF(6);
        this.dp8 = ResourceExtKt.toPxF(8);
        this.dp12 = ResourceExtKt.toPxF(12);
        this.dp16 = ResourceExtKt.toPxF(16);
        this.dp20 = ResourceExtKt.toPxF(20);
    }

    private final float getCornerRadius(AspectsCompactVO$Variant variant) {
        return variant instanceof AspectsTextVariantV2VO ? this.dp8 : ((variant instanceof AspectsCompactTilesVariantV2VO) || (variant instanceof AspectsCompactPackVariantV2VO) || (variant instanceof AspectsImageTitleVariantV2VO)) ? this.dp12 : ((variant instanceof AspectsColorVariantV2VO) || (variant instanceof AspectsImageVariantV2VO)) ? this.dp16 : variant instanceof AspectsCompactMediaVariantV2VO ? this.dp20 : this.dp6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$4$lambda$3(VariantsViewHolder variantsViewHolder, VariantsAdapter variantsAdapter, View view) {
        Integer valueOf = Integer.valueOf(variantsViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            Function1<? super AspectsCompactVO$Variant, Unit> function1 = variantsAdapter.onVariantClick;
            if (function1 != null) {
                AspectsCompactVO$Variant item = variantsAdapter.getItem(intValue);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                function1.invoke(item);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setParandjaForAspects(View view, AspectsCompactVO$Variant aspectsCompactVO$Variant) {
        if ((view instanceof ViewGroup) || (view instanceof b)) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            boolean isDarkThemeActive = ThemeExtKt.isDarkThemeActive(context);
            int color = androidx.core.content.a.getColor(view.getContext(), (!aspectsCompactVO$Variant.getIsAvailable() && isDarkThemeActive && (aspectsCompactVO$Variant instanceof AspectsCompactVO$VariantV2)) ? R$color.bg_secondary : (aspectsCompactVO$Variant.getIsAvailable() || !isDarkThemeActive) ? (aspectsCompactVO$Variant.getIsAvailable() && isDarkThemeActive) ? R$color.layer_overlay_paranja : (aspectsCompactVO$Variant.getIsAvailable() || isDarkThemeActive) ? R$color.transparent : R$color.layer_overlay_paranja : ru.ozon.app.android.pdp.ui.configurators.R$color.aspects_custom_parandja);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(color);
            gradientDrawable.setCornerRadius(getCornerRadius(aspectsCompactVO$Variant));
            view.setForeground(gradientDrawable);
        }
    }

    public final Function1<AspectsCompactVO$Variant, Unit> getOnVariantClick() {
        return this.onVariantClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
    }

    public final void setOnVariantClick(Function1<? super AspectsCompactVO$Variant, Unit> function1) {
        this.onVariantClick = function1;
    }

    public final void setVariantsHolder(Function1<? super ViewGroup, ? extends VariantsViewHolder<AspectsCompactVO$Variant, ? extends a>> function1) {
        this.variantsHolder = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull final VariantsViewHolder<AspectsCompactVO$Variant, ? extends a> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final AspectsCompactVO$Variant item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item);
        final RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            G.a(recyclerView, new Runnable() { // from class: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter$onBindViewHolder$lambda$6$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    VariantsAdapter variantsAdapter = this;
                    View parandjaView = holder.getParandjaView();
                    Intrinsics.f(item);
                    variantsAdapter.setParandjaForAspects(parandjaView, item);
                }
            });
        } else {
            Intrinsics.n("recyclerView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public VariantsViewHolder<AspectsCompactVO$Variant, a> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        VariantsViewHolder<AspectsCompactVO$Variant, a> variantsViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Function1<? super ViewGroup, ? extends VariantsViewHolder<AspectsCompactVO$Variant, ? extends a>> function1 = this.variantsHolder;
        if (function1 == null || (variantsViewHolder = (VariantsViewHolder) function1.invoke(parent)) == null) {
            throw new IllegalStateException("You must set variants view holder before using adapter!");
        }
        variantsViewHolder.itemView.setOnClickListener(new KX.b(1, variantsViewHolder, this));
        return variantsViewHolder;
    }
}
