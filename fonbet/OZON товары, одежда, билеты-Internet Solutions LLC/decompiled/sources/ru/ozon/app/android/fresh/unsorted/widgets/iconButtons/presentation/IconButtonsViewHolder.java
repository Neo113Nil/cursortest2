package ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation;

import IK.a;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetIconButtonsBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation.IconButtonsVO;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO$IconButton;", "iconButton", "", "addIconButton", "(Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO$IconButton;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/iconButtons/presentation/IconButtonsVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetIconButtonsBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetIconButtonsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IconButtonsViewHolder extends k<IconButtonsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetIconButtonsBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonsViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
        WidgetIconButtonsBinding bind = WidgetIconButtonsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
    }

    private final void addIconButton(IconButtonsVO.IconButton iconButton) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.iconIv);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        imageView.setImageDrawable(ContextExtKt.loadIconByString(getContext(), iconButton.getIcon()));
        ThemeExtKt.tint(imageView, Integer.valueOf(StyleParser.INSTANCE.parseColor(getContext(), iconButton.getTintColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY)));
        t tokenizedEvent = iconButton.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        imageView.setOnClickListener(new a(6, this, iconButton));
        this.binding.iconButtonsContainer.addView(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addIconButton$lambda$3(IconButtonsViewHolder iconButtonsViewHolder, IconButtonsVO.IconButton iconButton, View view) {
        iconButtonsViewHolder.actionHandler.invoke(iconButton.getAction());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull IconButtonsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.iconButtonsContainer.removeAllViews();
        IconButtonsVO.IconButton iconButton = (IconButtonsVO.IconButton) C7714v.M(item.getItems());
        if (iconButton != null) {
            addIconButton(iconButton);
        }
    }
}
