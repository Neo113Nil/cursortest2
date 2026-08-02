package ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.more;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.atom2.LabelAtom;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.databinding.WidgetReviewMoreBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/more/ListReviewsMoreViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/more/ListReviewsMoreVO;", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewMoreBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/WidgetReviewMoreBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindText", "(Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/more/ListReviewsMoreVO;)V", "bindClickable", "bindBadge", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/more/ListReviewsMoreVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewMoreBinding;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/more/ListReviewsMoreVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListReviewsMoreViewHolder extends k<ListReviewsMoreVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetReviewMoreBinding binding;
    private ListReviewsMoreVO item;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.more.ListReviewsMoreViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            AtomAction action;
            Intrinsics.checkNotNullParameter(it, "it");
            ListReviewsMoreVO listReviewsMoreVO = ListReviewsMoreViewHolder.this.item;
            if (listReviewsMoreVO == null || (action = listReviewsMoreVO.getAction()) == null) {
                return;
            }
            ListReviewsMoreViewHolder.this.actionHandler.invoke(action);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListReviewsMoreViewHolder(@NotNull WidgetReviewMoreBinding binding, @NotNull ComposerReferences refs) {
        super(r3);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        LabelAtom labelAtom = binding.moreReviewsLa;
        labelAtom.setConfiguration(LabelAtom.Configuration.copy$default(labelAtom.getConfiguration(), 0, 0, 0, 0, null, null, null, null, R$style.TextStyle_Body_M, 0, null, null, null, 7932, null));
        ConstraintLayout moreReviewsCl = binding.moreReviewsCl;
        Intrinsics.checkNotNullExpressionValue(moreReviewsCl, "moreReviewsCl");
        ViewExtKt.setOnClickListenerThrottle$default(moreReviewsCl, 0L, new AnonymousClass1(), 1, null);
    }

    private final void bindBadge(ListReviewsMoreVO item) {
        WidgetReviewMoreBinding widgetReviewMoreBinding = this.binding;
        Label badge = item.getBadge();
        if (badge == null) {
            LabelAtom moreReviewsLa = widgetReviewMoreBinding.moreReviewsLa;
            Intrinsics.checkNotNullExpressionValue(moreReviewsLa, "moreReviewsLa");
            ViewExtKt.gone(moreReviewsLa);
        } else {
            widgetReviewMoreBinding.moreReviewsLa.bind(badge);
            LabelAtom moreReviewsLa2 = widgetReviewMoreBinding.moreReviewsLa;
            Intrinsics.checkNotNullExpressionValue(moreReviewsLa2, "moreReviewsLa");
            ViewExtKt.show(moreReviewsLa2);
        }
    }

    private final void bindClickable(ListReviewsMoreVO item) {
        this.binding.moreReviewsCl.setEnabled(item.getAction() != null);
    }

    private final void bindText(ListReviewsMoreVO item) {
        this.binding.moreReviewsTv.setText(item.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ListReviewsMoreVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        bindText(item);
        bindClickable(item);
        bindBadge(item);
    }
}
