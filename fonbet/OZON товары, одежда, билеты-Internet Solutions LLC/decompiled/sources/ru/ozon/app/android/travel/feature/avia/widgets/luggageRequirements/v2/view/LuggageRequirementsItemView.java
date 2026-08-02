package ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewLuggageRequirementsBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation.LuggageRequirementsV2VO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/view/LuggageRequirementsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewLuggageRequirementsBinding;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$CompanyRequirementsVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LuggageRequirementsItemView extends ConstraintLayout {

    @NotNull
    private final ViewLuggageRequirementsBinding binding;

    public /* synthetic */ LuggageRequirementsItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull LuggageRequirementsV2VO.CompanyRequirementsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ShapeableImageView luggageReqIconIv = this.binding.luggageReqIconIv;
        Intrinsics.checkNotNullExpressionValue(luggageReqIconIv, "luggageReqIconIv");
        ImageViewExtKt.loadImageOrGone(luggageReqIconIv, item.getIconUrl());
        TextAtomView luggageReqCompanyNameTav = this.binding.luggageReqCompanyNameTav;
        Intrinsics.checkNotNullExpressionValue(luggageReqCompanyNameTav, "luggageReqCompanyNameTav");
        TextAtomHolderKt.bind$default(luggageReqCompanyNameTav, item.getCompanyName(), null, 2, null);
        TextAtomView luggageReqHandCarryTitleTav = this.binding.luggageReqHandCarryTitleTav;
        Intrinsics.checkNotNullExpressionValue(luggageReqHandCarryTitleTav, "luggageReqHandCarryTitleTav");
        TextAtomHolderKt.bindOrGone$default(luggageReqHandCarryTitleTav, item.getHandCarryTitle(), null, 2, null);
        TextAtomView luggageReqHandCarryTextTav = this.binding.luggageReqHandCarryTextTav;
        Intrinsics.checkNotNullExpressionValue(luggageReqHandCarryTextTav, "luggageReqHandCarryTextTav");
        TextAtomHolderKt.bindOrGone$default(luggageReqHandCarryTextTav, item.getHandCarryText(), null, 2, null);
        TextAtomView luggageReqLuggageTitleTav = this.binding.luggageReqLuggageTitleTav;
        Intrinsics.checkNotNullExpressionValue(luggageReqLuggageTitleTav, "luggageReqLuggageTitleTav");
        TextAtomHolderKt.bindOrGone$default(luggageReqLuggageTitleTav, item.getLuggageTitle(), null, 2, null);
        TextAtomView luggageReqLuggageTextTav = this.binding.luggageReqLuggageTextTav;
        Intrinsics.checkNotNullExpressionValue(luggageReqLuggageTextTav, "luggageReqLuggageTextTav");
        TextAtomHolderKt.bindOrGone$default(luggageReqLuggageTextTav, item.getLuggageText(), null, 2, null);
        View luggageReqSeparator = this.binding.luggageReqSeparator;
        Intrinsics.checkNotNullExpressionValue(luggageReqSeparator, "luggageReqSeparator");
        luggageReqSeparator.setVisibility(item.getIsSeparatorVisible() ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuggageRequirementsItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewLuggageRequirementsBinding inflate = ViewLuggageRequirementsBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }
}
