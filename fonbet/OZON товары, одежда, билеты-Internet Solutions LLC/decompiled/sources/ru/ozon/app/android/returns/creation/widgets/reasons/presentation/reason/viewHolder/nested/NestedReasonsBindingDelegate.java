package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewHolder.nested;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationReasonsNestedBinding;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem.NestedReasons;
import ru.ozon.app.android.returns.ui.molecules.reason.NestedReasonsAdapter;
import ru.ozon.app.android.returns.ui.molecules.reason.decoration.NestedReasonsDecoration;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewHolder/nested/NestedReasonsBindingDelegate;", "", "binding", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsNestedBinding;", "inputViewModel", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsNestedBinding;Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "commentCache", "", "", "", "getCommentCache", "()Ljava/util/Map;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "nestedReasonsAdapter", "Lru/ozon/app/android/returns/ui/molecules/reason/NestedReasonsAdapter;", "bind", "item", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "bindOrGone", "onUpdateComment", "id", "comment", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NestedReasonsBindingDelegate {

    @NotNull
    private final ReturnCreationReasonsNestedBinding binding;

    @NotNull
    private final Map<Long, String> commentCache;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final NestedReasonsAdapter nestedReasonsAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewHolder/nested/NestedReasonsBindingDelegate$Companion;", "", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NestedReasonsBindingDelegate(@NotNull ReturnCreationReasonsNestedBinding binding, @NotNull InputViewModel inputViewModel, @NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(inputViewModel, "inputViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.binding = binding;
        this.onAction = onAction;
        this.commentCache = new LinkedHashMap();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(CORNER_RADIUS);
        this.gradientDrawable = gradientDrawable;
        NestedReasonsAdapter nestedReasonsAdapter = new NestedReasonsAdapter(refs, inputViewModel, onAction, new NestedReasonsBindingDelegate$nestedReasonsAdapter$1(this));
        this.nestedReasonsAdapter = nestedReasonsAdapter;
        RecyclerView recyclerView = binding.nestedReasonsRv;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(nestedReasonsAdapter);
        int i11 = 0;
        recyclerView.addItemDecoration(new NestedReasonsDecoration(i11, i11, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateComment(long id2, String comment) {
        this.commentCache.put(Long.valueOf(id2), comment);
    }

    public final void bind(@NotNull NestedReasons item) {
        Intrinsics.checkNotNullParameter(item, "item");
        GradientDrawable gradientDrawable = this.gradientDrawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ColorStateList.valueOf(styleParser.parseColor(context, item.getBackgroundColor(), R$color.bg_secondary)));
        ReturnCreationReasonsNestedBinding returnCreationReasonsNestedBinding = this.binding;
        returnCreationReasonsNestedBinding.nestedReasonsContainer.setBackground(this.gradientDrawable);
        TextAtomV2View validationTav = returnCreationReasonsNestedBinding.validationTav;
        Intrinsics.checkNotNullExpressionValue(validationTav, "validationTav");
        TextHolderKt.bindOrGone(validationTav, item.getValidationText(), this.onAction);
        LinearLayout nestedReasonsContainer = returnCreationReasonsNestedBinding.nestedReasonsContainer;
        Intrinsics.checkNotNullExpressionValue(nestedReasonsContainer, "nestedReasonsContainer");
        ViewExtKt.show(nestedReasonsContainer);
        this.nestedReasonsAdapter.submitList(item.getReasons());
    }

    public final void bindOrGone(NestedReasons item) {
        if (item != null) {
            bind(item);
            return;
        }
        LinearLayout nestedReasonsContainer = this.binding.nestedReasonsContainer;
        Intrinsics.checkNotNullExpressionValue(nestedReasonsContainer, "nestedReasonsContainer");
        ViewExtKt.gone(nestedReasonsContainer);
    }

    @NotNull
    public final Map<Long, String> getCommentCache() {
        return this.commentCache;
    }
}
