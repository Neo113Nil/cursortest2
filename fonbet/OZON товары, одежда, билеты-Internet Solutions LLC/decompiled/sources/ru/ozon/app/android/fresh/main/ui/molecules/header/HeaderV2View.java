package ru.ozon.app.android.fresh.main.ui.molecules.header;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolderKt;
import ru.ozon.app.android.fresh.main.databinding.FreshHeaderViewBinding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/fresh/main/databinding/FreshHeaderViewBinding;", "roundedPadding", "defaultPadding", "corners", "", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "bind", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "applyTopCorners", "applyDefaultCorners", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeaderV2View extends ConstraintLayout implements AtomView {

    @NotNull
    private final FreshHeaderViewBinding binding;
    private final float corners;
    private final int defaultPadding;
    private final int roundedPadding;

    @NotNull
    private final GradientDrawable topBackgroundLayer;

    public /* synthetic */ HeaderV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyDefaultCorners() {
        ConstraintLayout headerLayout = this.binding.headerLayout;
        Intrinsics.checkNotNullExpressionValue(headerLayout, "headerLayout");
        ViewExtKt.updatePadding$default(headerLayout, 0, this.defaultPadding, 0, 0, 13, null);
        GradientDrawable gradientDrawable = this.topBackgroundLayer;
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = 0.0f;
        }
        gradientDrawable.setCornerRadii(fArr);
    }

    private final void applyTopCorners() {
        ConstraintLayout headerLayout = this.binding.headerLayout;
        Intrinsics.checkNotNullExpressionValue(headerLayout, "headerLayout");
        ViewExtKt.updatePadding$default(headerLayout, 0, this.roundedPadding, 0, 0, 13, null);
        GradientDrawable gradientDrawable = this.topBackgroundLayer;
        float f7 = this.corners;
        gradientDrawable.setCornerRadii(new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    public final void bind(@NotNull HeaderV2VO header, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.topBackgroundLayer.setColor(styleParser.parseColor(context, header.getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY));
        this.binding.headerLayout.setBackground(this.topBackgroundLayer);
        actionHandler.invoke(new AtomAction.ViewAction(header.getTrackingInfo(), null, 2, null));
        TextAtomView headerTitleTa = this.binding.headerTitleTa;
        Intrinsics.checkNotNullExpressionValue(headerTitleTa, "headerTitleTa");
        TextAtomHolderKt.bind$default(headerTitleTa, header.getTitle(), null, 2, null);
        DisclosureView headerDisclosure = this.binding.headerDisclosure;
        Intrinsics.checkNotNullExpressionValue(headerDisclosure, "headerDisclosure");
        DisclosureHolderKt.bindOrGone$default(headerDisclosure, header.getDisclosure(), null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(this, 0L, new HeaderV2View$bind$1(header, actionHandler), 1, null);
        if (header.getIsTopCornersRounded()) {
            applyTopCorners();
        } else {
            applyDefaultCorners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FreshHeaderViewBinding inflate = FreshHeaderViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.roundedPadding = ResourceExtKt.toPx(14);
        this.defaultPadding = ResourceExtKt.toPx(24);
        this.corners = ResourceExtKt.toPxF(24);
        this.topBackgroundLayer = new GradientDrawable();
    }
}
