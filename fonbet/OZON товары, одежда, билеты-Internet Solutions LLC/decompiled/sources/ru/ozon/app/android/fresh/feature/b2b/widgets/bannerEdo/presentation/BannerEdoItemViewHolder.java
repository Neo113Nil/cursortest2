package ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.presentation;

import android.graphics.drawable.PaintDrawable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.BannerEdoListItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.presentation.BannerEdoVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/presentation/BannerEdoItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/BannerEdoListItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/BannerEdoListItemBinding;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/presentation/BannerEdoVO$ListItemVo;", "item", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/presentation/BannerEdoVO$ListItemVo;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/BannerEdoListItemBinding;", "getBinding", "()Lru/ozon/app/android/fresh/feature/b2b/databinding/BannerEdoListItemBinding;", "Landroid/graphics/drawable/PaintDrawable;", "iconBackground", "Landroid/graphics/drawable/PaintDrawable;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BannerEdoItemViewHolder extends RecyclerView.C {

    @NotNull
    private final BannerEdoListItemBinding binding;

    @NotNull
    private final PaintDrawable iconBackground;
    public static final int $stable = 8;
    private static final float iconBackgroundCornerRadius = ResourceExtKt.toPxF(12);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerEdoItemViewHolder(@NotNull BannerEdoListItemBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(binding.getConstraintLayout().getContext().getColor(R$color.bg_light_key));
        paintDrawable.setCornerRadius(iconBackgroundCornerRadius);
        paintDrawable.setAlpha(51);
        this.iconBackground = paintDrawable;
    }

    public final void bind(@NotNull BannerEdoVO.ListItemVo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BannerEdoListItemBinding bannerEdoListItemBinding = this.binding;
        bannerEdoListItemBinding.icon.setBackground(this.iconBackground);
        ImageView icon = bannerEdoListItemBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ImageViewExtKt.load$default(icon, item.getIcon(), null, null, null, null, false, null, 126, null);
        TextAtomV2View description = bannerEdoListItemBinding.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        TextHolderKt.bind$default(description, item.getDescription(), null, 2, null);
    }
}
