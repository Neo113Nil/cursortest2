package ru.ozon.app.android.returns.creation.widgets.methods.presentation.textwithiconbutton;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.PaddingsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/textwithiconbutton/TextWithIconButtonElementViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/textwithiconbutton/TextWithIconButtonElementVO;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/textwithiconbutton/TextWithIconButtonElementView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/methods/presentation/textwithiconbutton/TextWithIconButtonElementView;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/creation/widgets/methods/presentation/textwithiconbutton/TextWithIconButtonElementVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/textwithiconbutton/TextWithIconButtonElementView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextWithIconButtonElementViewHolder extends k<TextWithIconButtonElementVO> {
    public static final int $stable = IconButtonV3View.$stable | TextAtomV2View.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TextWithIconButtonElementView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextWithIconButtonElementViewHolder(@NotNull TextWithIconButtonElementView view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextWithIconButtonElementVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextWithIconButtonElementView textWithIconButtonElementView = this.view;
        PaddingsKt.applyTo(item.getPaddings(), textWithIconButtonElementView);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textWithIconButtonElementView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textWithIconButtonElementView.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_1));
        TextHolderKt.bind(textWithIconButtonElementView.getText(), item.getText(), this.actionHandler);
        IconButtonV3HolderKt.bindOrGone(textWithIconButtonElementView.getButton(), item.getButton(), this.actionHandler);
    }
}
