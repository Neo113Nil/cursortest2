package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddEdoV2ButtonBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonViewHolderV2;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonVOV2;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddEdoV2ButtonBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddEdoV2ButtonBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonVOV2;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddEdoV2ButtonBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonVOV2;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "buttonActionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddEdoButtonViewHolderV2 extends k<AddEdoButtonVOV2> {

    @NotNull
    private final WidgetAddEdoV2ButtonBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> buttonActionHandler;
    private AddEdoButtonVOV2 item;

    @NotNull
    private final AddEdoViewModelV2 viewModel;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddEdoButtonViewHolderV2(@NotNull WidgetAddEdoV2ButtonBinding binding, @NotNull AddEdoViewModelV2 viewModel, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.buttonActionHandler = new ActionHandler.Builder(references, this).onComposerAction(new AddEdoButtonViewHolderV2$buttonActionHandler$1(this)).onClick(new AddEdoButtonViewHolderV2$buttonActionHandler$2(references)).buildHandler();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getSingleEvent(), new AddEdoButtonViewHolderV2$onAttachViewModel$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddEdoButtonVOV2 item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        WidgetAddEdoV2ButtonBinding widgetAddEdoV2ButtonBinding = this.binding;
        TextAtomV2View addEdoDescriptionTv = widgetAddEdoV2ButtonBinding.addEdoDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(addEdoDescriptionTv, "addEdoDescriptionTv");
        TextHolderKt.bindOrGone$default(addEdoDescriptionTv, item.getDescription(), null, 2, null);
        ButtonV3View addEdoBtn = widgetAddEdoV2ButtonBinding.addEdoBtn;
        Intrinsics.checkNotNullExpressionValue(addEdoBtn, "addEdoBtn");
        ButtonV3HolderKt.bind(addEdoBtn, item.getButton(), this.buttonActionHandler);
        ButtonV3View addEdoAdditionalBtn = widgetAddEdoV2ButtonBinding.addEdoAdditionalBtn;
        Intrinsics.checkNotNullExpressionValue(addEdoAdditionalBtn, "addEdoAdditionalBtn");
        ButtonV3HolderKt.bindOrGone(addEdoAdditionalBtn, item.getAdditionalButton(), this.buttonActionHandler);
    }
}
