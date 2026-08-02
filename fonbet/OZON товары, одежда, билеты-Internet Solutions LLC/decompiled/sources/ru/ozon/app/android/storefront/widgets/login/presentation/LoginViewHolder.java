package ru.ozon.app.android.storefront.widgets.login.presentation;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.databinding.WidgetLoginBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/login/presentation/LoginViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/login/presentation/LoginVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerRefs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/login/presentation/LoginVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/databinding/WidgetLoginBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetLoginBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "subOnAction", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginViewHolder extends k<LoginVO> {

    @NotNull
    private final WidgetLoginBinding binding;

    @NotNull
    private final ComposerReferences composerRefs;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function1<AtomAction, Unit> subOnAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerRefs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerRefs, "composerRefs");
        this.composerRefs = composerRefs;
        WidgetLoginBinding bind = WidgetLoginBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.onAction = new ActionHandler.Builder(composerRefs, this).onClick(new LoginViewHolder$onAction$1(this)).buildHandler();
        this.subOnAction = new ActionHandler.Builder(composerRefs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LoginVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetLoginBinding widgetLoginBinding = this.binding;
        widgetLoginBinding.title.setText(item.getTitle());
        widgetLoginBinding.title.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textPrimary));
        TextView subtitle = widgetLoginBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextViewExtKt.setTextOrGone(subtitle, item.getSubtitle());
        widgetLoginBinding.subtitle.setTextColor(ThemeExtKt.themeColor(getContext(), R$attr.textPrimary));
        widgetLoginBinding.loginContainer.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.layer_floor_1));
        ButtonV3View buttonAtomTitleTv = widgetLoginBinding.buttonAtomTitleTv;
        Intrinsics.checkNotNullExpressionValue(buttonAtomTitleTv, "buttonAtomTitleTv");
        ButtonV3HolderKt.bind(buttonAtomTitleTv, item.getButton(), this.onAction);
        LargeBorderlessButtonView buttonAtomSubTitleTv = widgetLoginBinding.buttonAtomSubTitleTv;
        Intrinsics.checkNotNullExpressionValue(buttonAtomSubTitleTv, "buttonAtomSubTitleTv");
        LargeBorderlessButtonHolderKt.bindOrGone(buttonAtomSubTitleTv, item.getSubButton(), this.subOnAction);
        ConstraintLayout loginContainer = widgetLoginBinding.loginContainer;
        Intrinsics.checkNotNullExpressionValue(loginContainer, "loginContainer");
        ViewExtKt.updatePadding$default(loginContainer, 0, 0, 0, ResourceExtKt.toPx(item.getSubButton() != null ? 16 : 40), 7, null);
    }
}
