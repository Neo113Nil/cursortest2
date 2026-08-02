package ru.ozon.app.android.fresh.main.widgets.redirectButton.presentation;

import Gw.ViewOnClickListenerC3131a;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.WidgetExpressRedirectButtonBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/redirectButton/presentation/ExpressRedirectButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/redirectButton/presentation/ExpressRedirectButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "color", "", "setTextColorOrDefault", "(Ljava/lang/Integer;)V", "setBackgroundColorOrDefault", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/redirectButton/presentation/ExpressRedirectButtonVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/databinding/WidgetExpressRedirectButtonBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/WidgetExpressRedirectButtonBinding;", "Lru/ozon/app/android/fresh/main/widgets/redirectButton/presentation/ExpressRedirectButtonVO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressRedirectButtonViewHolder extends k<ExpressRedirectButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetExpressRedirectButtonBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;
    private ExpressRedirectButtonVO item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressRedirectButtonViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        WidgetExpressRedirectButtonBinding bind = WidgetExpressRedirectButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        containerView.setOnClickListener(new ViewOnClickListenerC3131a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ExpressRedirectButtonViewHolder expressRedirectButtonViewHolder, View view) {
        Function1<AtomAction, Unit> function1 = expressRedirectButtonViewHolder.actionHandler;
        ExpressRedirectButtonVO expressRedirectButtonVO = expressRedirectButtonViewHolder.item;
        if (expressRedirectButtonVO != null) {
            function1.invoke(expressRedirectButtonVO.getAction());
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    private final void setBackgroundColorOrDefault(Integer color) {
        int themeColor;
        CardView cardView = this.binding.cardView;
        if (color != null) {
            themeColor = color.intValue();
        } else {
            Context context = getContext();
            ExpressRedirectButtonVO expressRedirectButtonVO = this.item;
            if (expressRedirectButtonVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            themeColor = ThemeExtKt.themeColor(context, expressRedirectButtonVO.getDefaultBackgroundColor());
        }
        cardView.setCardBackgroundColor(themeColor);
    }

    private final void setTextColorOrDefault(Integer color) {
        int themeColor;
        TextView textView = this.binding.titleTv;
        if (color != null) {
            themeColor = color.intValue();
        } else {
            Context context = getContext();
            ExpressRedirectButtonVO expressRedirectButtonVO = this.item;
            if (expressRedirectButtonVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            themeColor = ThemeExtKt.themeColor(context, expressRedirectButtonVO.getDefaultTextColor());
        }
        textView.setTextColor(themeColor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ExpressRedirectButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.binding.titleTv.setText(item.getTitle());
        StyleParser styleParser = StyleParser.INSTANCE;
        setTextColorOrDefault(styleParser.parseColor(getContext(), item.getTextColor()));
        setBackgroundColorOrDefault(styleParser.parseColor(getContext(), item.getBackgroundColor()));
    }
}
