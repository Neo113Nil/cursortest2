package ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewHolder;

import androidx.core.content.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject.ReturnCreationStepsVO;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject.Step;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewHolder/ReturnCreationStepsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/ReturnCreationStepsVO;", "Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewHolder/ReturnCreationStepsView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewHolder/ReturnCreationStepsView;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/ReturnCreationStepsVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewHolder/ReturnCreationStepsView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "layerFloor0", "I", "textTertiary", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationStepsViewHolder extends k<ReturnCreationStepsVO> {
    public static final int $stable = ComposerReferences.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int layerFloor0;

    @NotNull
    private final ComposerReferences refs;
    private final int textTertiary;

    @NotNull
    private final ReturnCreationStepsView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCreationStepsViewHolder(@NotNull ReturnCreationStepsView view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.layerFloor0 = a.getColor(getContext(), R$color.layer_floor_0);
        this.textTertiary = a.getColor(getContext(), R$color.text_tertiary);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnCreationStepsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnCreationStepsView returnCreationStepsView = this.view;
        List<Step> steps = item.getSteps();
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), item.getSeparatorColor());
        returnCreationStepsView.addSteps(steps, parseColor != null ? parseColor.intValue() : this.textTertiary, this.actionHandler);
        ReturnCreationStepsView returnCreationStepsView2 = this.view;
        Integer parseColor2 = styleParser.parseColor(getContext(), item.getBackgroundColor());
        returnCreationStepsView2.setBackgroundColor(parseColor2 != null ? parseColor2.intValue() : this.layerFloor0);
    }
}
