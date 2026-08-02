package ru.ozon.app.android.travel.molecules.view.dropDownBanner;

import JG.b;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewDropDownBannerBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setUp", "(Landroid/content/Context;)V", "getSelectableItemBackgroundRes", "(Landroid/content/Context;)Ljava/lang/Integer;", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "item", "bind", "(Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewDropDownBannerBinding;", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewDropDownBannerBinding;", "Lkotlin/Function0;", "onBannerClickListener", "Lkotlin/jvm/functions/Function0;", "getOnBannerClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnBannerClickListener", "(Lkotlin/jvm/functions/Function0;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DropDownBannerView extends CardView {

    @NotNull
    private final ViewDropDownBannerBinding binding;
    private Function0<Unit> onBannerClickListener;

    public /* synthetic */ DropDownBannerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Integer getSelectableItemBackgroundRes(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true)) {
            return Integer.valueOf(typedValue.resourceId);
        }
        return null;
    }

    private final void setUp(Context context) {
        int px = ResourceExtKt.toPx(16, context);
        setContentPadding(px, px, px, px);
        setCardBackgroundColor(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        setRadius(ResourceExtKt.toPxF(6, context));
        setCardElevation(0.0f);
        setClickable(true);
        setFocusable(true);
        Integer selectableItemBackgroundRes = getSelectableItemBackgroundRes(context);
        setForeground(selectableItemBackgroundRes != null ? a.getDrawable(context, selectableItemBackgroundRes.intValue()) : null);
        super.setOnClickListener(new b(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUp$lambda$3(DropDownBannerView dropDownBannerView, View view) {
        Function0<Unit> function0 = dropDownBannerView.onBannerClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull DropDownBannerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatImageView appCompatImageView = this.binding.dropDownBannerIcon;
        Intrinsics.f(appCompatImageView);
        appCompatImageView.setVisibility(item.getIsIconVisible() ? 0 : 8);
        ImageViewExtKt.load$default(appCompatImageView, item.getIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.tint(appCompatImageView, item.getIconTint());
        TextAtomView dropDownBannerTitle = this.binding.dropDownBannerTitle;
        Intrinsics.checkNotNullExpressionValue(dropDownBannerTitle, "dropDownBannerTitle");
        TextAtomHolderKt.bind$default(dropDownBannerTitle, item.getTitle(), null, 2, null);
        this.binding.dropDownBannerExpandIcon.setRotation(item.getIsExpanded() ? 270.0f : 90.0f);
        TextAtomView textAtomView = this.binding.dropDownBannerHiddenContent;
        Intrinsics.f(textAtomView);
        textAtomView.setVisibility(item.getIsExpanded() ? 0 : 8);
        TextAtomHolderKt.bind$default(textAtomView, item.getHiddenText(), null, 2, null);
    }

    public final void setOnBannerClickListener(Function0<Unit> function0) {
        this.onBannerClickListener = function0;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownBannerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewDropDownBannerBinding inflate = ViewDropDownBannerBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setUp(context);
    }
}
