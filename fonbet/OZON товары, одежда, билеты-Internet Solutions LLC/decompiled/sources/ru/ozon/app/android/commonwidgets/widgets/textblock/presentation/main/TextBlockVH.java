package ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.main;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.commonwidgets.databinding.WidgetTextBlockBinding;
import ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockVO;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.TextBlockAtomDecorator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.core.socialAtoms.SocialAtomFactory;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001.B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/main/TextBlockVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "isRounded", "", "setIsRounded", "(Z)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/commonwidgets/databinding/WidgetTextBlockBinding;", "binding", "Lru/ozon/app/android/commonwidgets/databinding/WidgetTextBlockBinding;", "", "bgWrapperColor", "I", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable$delegate", "LSc/j;", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "bodyAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/TextBlockAtomDecorator;", "bodyDecorator", "Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/TextBlockAtomDecorator;", "Companion", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockVH extends k<TextBlockVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;
    private final int bgWrapperColor;

    @NotNull
    private final WidgetTextBlockBinding binding;

    @NotNull
    private final AtomsAdapter bodyAdapter;

    @NotNull
    private final TextBlockAtomDecorator bodyDecorator;

    @NotNull
    private final View containerView;
    private static final int ROUND_HORIZONTAL_MARGIN = ResourceExtKt.toPx(16);
    private static final int ROUND_VERTICAL_MARGIN = ResourceExtKt.toPx(4);
    private static final float cornerRadius = ResourceExtKt.toPxF(4);
    private static final int ROUND_TOP_PADDING = ResourceExtKt.toPx(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextBlockVH(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        WidgetTextBlockBinding bind = WidgetTextBlockBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        int color = AppTypeResolver.INSTANCE.isSelect(getContext()) ? getContext().getColor(R$color.clear_light_key_0) : ThemeExtKt.themeColor(getContext(), R$attr.layerFloor0);
        this.bgWrapperColor = color;
        this.backgroundDrawable = Sc.k.b(TextBlockVH$backgroundDrawable$2.INSTANCE);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, new SocialAtomFactory(), 7, null);
        this.bodyAdapter = atomsAdapter;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextBlockAtomDecorator textBlockAtomDecorator = new TextBlockAtomDecorator(context);
        this.bodyDecorator = textBlockAtomDecorator;
        bind.bodyVAL.setAdapter(atomsAdapter);
        bind.bodyVAL.setDecorator(textBlockAtomDecorator);
        atomsAdapter.setOnAction(buildHandler);
        bind.textBlockWidgetWrapper.setBackgroundColor(color);
    }

    private final void setIsRounded(boolean isRounded) {
        int i11;
        int i12;
        int i13;
        getBackgroundDrawable().setColor(AppTypeResolver.INSTANCE.isSelect(getContext()) ? getContext().getColor(R$color.clear_light_key_0) : getContext().getColor(R$color.layer_floor_1));
        if (isRounded) {
            i11 = ROUND_HORIZONTAL_MARGIN;
            i12 = ROUND_VERTICAL_MARGIN;
            getBackgroundDrawable().setCornerRadius(cornerRadius);
            i13 = ROUND_TOP_PADDING;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        LinearLayout linearLayout = this.binding.textBlockWidget;
        Intrinsics.f(linearLayout);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.bottomMargin = i12;
        linearLayout.setLayoutParams(marginLayoutParams);
        ViewExtKt.updatePadding$default(linearLayout, 0, i13, 0, 0, 13, null);
        linearLayout.setBackground(getBackgroundDrawable());
    }

    @NotNull
    public final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.backgroundDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextBlockVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, item.getTitle());
        Integer atomSpacing = item.getAtomSpacing();
        if (atomSpacing != null) {
            this.bodyDecorator.setVerticalMargin(ResourceExtKt.toPx(atomSpacing.intValue()));
        }
        Boolean isRounded = item.getIsRounded();
        setIsRounded(isRounded != null ? isRounded.booleanValue() : false);
        AtomsAdapter atomsAdapter = this.bodyAdapter;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getBody());
    }
}
