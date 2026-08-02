package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.ugc.databinding.ItemUgcSingleBlockBinding;
import ru.ozon.app.android.ugc.view.ViewExtKt;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersSingleBlockItemBinder;", "", "bindSingleBlock", "", "binding", "Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;", "block", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "leftCorners", "", "rightCorners", "onClickListener", "Landroid/view/View$OnClickListener;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UgcCountersSingleBlockItemBinder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void bindSingleBlock(@NotNull UgcCountersSingleBlockItemBinder ugcCountersSingleBlockItemBinder, @NotNull ItemUgcSingleBlockBinding binding, @NotNull UgcCountersVO.Block.Single block, float f7, float f11, View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(block, "block");
            TextAtomV2View ugcBlockTitleTav = binding.ugcBlockTitleTav;
            Intrinsics.checkNotNullExpressionValue(ugcBlockTitleTav, "ugcBlockTitleTav");
            TextHolderKt.bindOrGone$default(ugcBlockTitleTav, block.getTitle(), null, 2, null);
            TextAtomV2View ugcBlockSubtitleTav = binding.ugcBlockSubtitleTav;
            Intrinsics.checkNotNullExpressionValue(ugcBlockSubtitleTav, "ugcBlockSubtitleTav");
            TextHolderKt.bind$default(ugcBlockSubtitleTav, block.getSubtitle(), null, 2, null);
            ImageView ugcBlockIconIv = binding.ugcBlockIconIv;
            Intrinsics.checkNotNullExpressionValue(ugcBlockIconIv, "ugcBlockIconIv");
            ViewExtKt.bindOrGone(ugcBlockIconIv, block.getIcon());
            ConstraintLayout constraintLayout = binding.ugcBlockRootCl;
            GradientDrawable gradientDrawable = new GradientDrawable();
            Context context = binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(ContextExtKt.parseColor(context, block.getBackgroundColor()));
            gradientDrawable.setCornerRadii(new float[]{f7, f7, f11, f11, f11, f11, f7, f7});
            constraintLayout.setBackground(gradientDrawable);
            binding.getConstraintLayout().setOnClickListener(onClickListener);
        }

        public static /* synthetic */ void bindSingleBlock$default(UgcCountersSingleBlockItemBinder ugcCountersSingleBlockItemBinder, ItemUgcSingleBlockBinding itemUgcSingleBlockBinding, UgcCountersVO.Block.Single single, float f7, float f11, View.OnClickListener onClickListener, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindSingleBlock");
            }
            if ((i11 & 4) != 0) {
                f7 = ResourceExtKt.toPxF(single.getCornerRadius().getPx());
            }
            float f12 = f7;
            if ((i11 & 8) != 0) {
                f11 = ResourceExtKt.toPxF(single.getCornerRadius().getPx());
            }
            ugcCountersSingleBlockItemBinder.bindSingleBlock(itemUgcSingleBlockBinding, single, f12, f11, onClickListener);
        }
    }

    void bindSingleBlock(@NotNull ItemUgcSingleBlockBinding binding, @NotNull UgcCountersVO.Block.Single block, float leftCorners, float rightCorners, View.OnClickListener onClickListener);
}
