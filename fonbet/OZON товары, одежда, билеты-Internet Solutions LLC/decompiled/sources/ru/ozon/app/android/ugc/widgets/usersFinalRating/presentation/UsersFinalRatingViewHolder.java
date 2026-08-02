package ru.ozon.app.android.ugc.widgets.usersFinalRating.presentation;

import DS.a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.databinding.WidgetUsersFinalRatingBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersFinalRating/presentation/UsersFinalRatingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/usersFinalRating/presentation/UsersFinalRatingVO;", "Lru/ozon/app/android/ugc/databinding/WidgetUsersFinalRatingBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetUsersFinalRatingBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "roundRating", "(F)F", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/usersFinalRating/presentation/UsersFinalRatingVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/databinding/WidgetUsersFinalRatingBinding;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "Lkotlin/Function1;", "onAction", "Lkotlin/jvm/functions/Function1;", "", "iconPadding", "I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersFinalRatingViewHolder extends k<UsersFinalRatingVO> {
    private AtomAction action;

    @NotNull
    private final WidgetUsersFinalRatingBinding binding;
    private final int iconPadding;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UsersFinalRatingViewHolder(@NotNull WidgetUsersFinalRatingBinding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onAction = new ActionHandler.Builder(refs, this).buildHandler();
        this.iconPadding = ResourceExtKt.toPx(4, getContext());
        binding.getConstraintLayout().setOnClickListener(new a(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(UsersFinalRatingViewHolder usersFinalRatingViewHolder, View view) {
        AtomAction atomAction = usersFinalRatingViewHolder.action;
        if (atomAction != null) {
            usersFinalRatingViewHolder.onAction.invoke(atomAction);
        }
    }

    private final float roundRating(float f7) {
        return C6915b.c(f7 * 2) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UsersFinalRatingVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.action = item.getAction();
        this.binding.usersFinalRatingRb.setRating(roundRating(item.getValue()));
        TextAtomV2View usersFinalRatingTitleTav = this.binding.usersFinalRatingTitleTav;
        Intrinsics.checkNotNullExpressionValue(usersFinalRatingTitleTav, "usersFinalRatingTitleTav");
        TextHolderKt.bind$default(usersFinalRatingTitleTav, item.getValueText(), null, 2, null);
        SmallIconButtonView smallIconButtonView = this.binding.usersFinalRatingIconSibv;
        Intrinsics.f(smallIconButtonView);
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, item.getShowDetailsButton(), this.onAction);
        int i11 = this.iconPadding;
        smallIconButtonView.setPadding(i11, i11, i11, i11);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = smallIconButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3Atom.SmallIconButton showDetailsButton = item.getShowDetailsButton();
        ThemeExtKt.tint(smallIconButtonView, styleParser.parseColor(context, showDetailsButton != null ? showDetailsButton.getTintColor() : null));
    }
}
