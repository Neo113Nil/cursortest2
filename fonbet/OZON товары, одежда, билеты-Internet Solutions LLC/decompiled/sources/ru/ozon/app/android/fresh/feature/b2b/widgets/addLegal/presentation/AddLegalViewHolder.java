package ru.ozon.app.android.fresh.feature.b2b.widgets.addLegal.presentation;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.CommonTextWithErrorInputBinding;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addLegal.presentation.AddLegalVO;
import ru.ozon.app.android.pdp.utils.views.input.PdpTextInputLayout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addLegal/presentation/AddLegalViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addLegal/presentation/AddLegalVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addLegal/presentation/AddLegalVO$InputVO;", "input", "", "setupInput", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addLegal/presentation/AddLegalVO$InputVO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addLegal/presentation/AddLegalVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/CommonTextWithErrorInputBinding;", "inputBinding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/CommonTextWithErrorInputBinding;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalViewHolder extends k<AddLegalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAddLegalBinding binding;

    @NotNull
    private final CommonTextWithErrorInputBinding inputBinding;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddLegalViewHolder(@NotNull WidgetAddLegalBinding binding, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        CommonTextWithErrorInputBinding bind = CommonTextWithErrorInputBinding.bind(binding.input);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.inputBinding = bind;
    }

    private final void setupInput(AddLegalVO.InputVO input) {
        PdpTextInputLayout pdpTextInputLayout = this.inputBinding.inputTIL;
        pdpTextInputLayout.setEditable(false);
        pdpTextInputLayout.setHint(input.getPlaceholder());
        ViewExtKt.setOnClickListenerThrottle$default(pdpTextInputLayout, 0L, new AddLegalViewHolder$setupInput$1$1(this, input), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddLegalVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAddLegalBinding widgetAddLegalBinding = this.binding;
        TextAtomV2View title = widgetAddLegalBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View subtitle = widgetAddLegalBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bind$default(subtitle, item.getSubtitle(), null, 2, null);
        setupInput(item.getInput());
    }
}
