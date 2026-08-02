package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.presentation;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCounterHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetAccountBalanceBarBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCounterView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceBar/presentation/AccountBalanceBarWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceBar/presentation/AccountBalanceBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "view", "", "color", "", "setBackgroundColor", "(Landroid/view/View;I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceBar/presentation/AccountBalanceBarVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetAccountBalanceBarBinding;", "binding", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetAccountBalanceBarBinding;", "", "cornerRadius", "F", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountBalanceBarWidgetViewHolder extends k<AccountBalanceBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAccountBalanceBarBinding binding;

    @NotNull
    private final View containerView;
    private final float cornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBalanceBarWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        WidgetAccountBalanceBarBinding bind = WidgetAccountBalanceBarBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.cornerRadius = ResourceExtKt.toPxF(12, getContext());
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        CellWithSubtitleCounterView cellWithSubtitleCounterView = bind.accountBalanceBar;
        cellWithSubtitleCounterView.setClipToOutline(true);
        cellWithSubtitleCounterView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.presentation.AccountBalanceBarWidgetViewHolder$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                if (view == null || outline == null) {
                    return;
                }
                int width = view.getWidth();
                int height = view.getHeight();
                f7 = AccountBalanceBarWidgetViewHolder.this.cornerRadius;
                outline.setRoundRect(0, 0, width, height, f7);
            }
        });
    }

    private final void setBackgroundColor(View view, int color) {
        Drawable background = view.getBackground();
        if (background == null) {
            view.setBackground(new ColorDrawable(color));
        } else {
            background.setTint(color);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AccountBalanceBarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View accountBalanceBarRoot = this.binding.accountBalanceBarRoot;
        Intrinsics.checkNotNullExpressionValue(accountBalanceBarRoot, "accountBalanceBarRoot");
        StyleParser styleParser = StyleParser.INSTANCE;
        setBackgroundColor(accountBalanceBarRoot, styleParser.parseColor(getContext(), item.getContainerBackground(), R$color.layer_floor_1));
        CellWithSubtitleCounterView cellWithSubtitleCounterView = this.binding.accountBalanceBar;
        Intrinsics.f(cellWithSubtitleCounterView);
        CellWithSubtitleCounterHolderKt.bind(cellWithSubtitleCounterView, item.getBalanceBar(), this.actionHandler);
        Context context = cellWithSubtitleCounterView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(cellWithSubtitleCounterView, styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_0));
    }
}
