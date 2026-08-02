package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CommentHeaderView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ int $dateLeftMargin;
    final /* synthetic */ boolean $hasIcon;
    final /* synthetic */ boolean $hasSubscribe;
    final /* synthetic */ int $nameLeftMargin;
    final /* synthetic */ CommentHeaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentHeaderView$setupConstraints$1(CommentHeaderView commentHeaderView, int i11, boolean z11, int i12, boolean z12) {
        super(1);
        this.this$0 = commentHeaderView;
        this.$nameLeftMargin = i11;
        this.$hasIcon = z11;
        this.$dateLeftMargin = i12;
        this.$hasSubscribe = z12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        int[] iArr;
        IconView nameIconView;
        IconView nameIconView2;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        iArr = this.this$0.viewIds;
        for (int i11 : iArr) {
            updateConstraints.o(i11, 6);
            updateConstraints.o(i11, 7);
        }
        updateConstraints.t(R$id.commentNameBadge, 6, 0, 6, this.$nameLeftMargin);
        if (this.$hasIcon) {
            updateConstraints.s(R$id.commentNameBadge, 7, R$id.commentNameIcon, 6);
            updateConstraints.s(R$id.commentNameIcon, 6, R$id.commentNameBadge, 7);
            updateConstraints.s(R$id.commentNameIcon, 7, R$id.commentDateText, 6);
            updateConstraints.t(R$id.commentDateText, 6, R$id.commentNameIcon, 7, this.$dateLeftMargin);
            nameIconView2 = this.this$0.getNameIconView();
            nameIconView2.setTranslationX(-Dimens.INSTANCE.getDPF_4());
        } else {
            updateConstraints.s(R$id.commentNameBadge, 7, R$id.commentDateText, 6);
            updateConstraints.t(R$id.commentDateText, 6, R$id.commentNameBadge, 7, this.$dateLeftMargin);
            nameIconView = this.this$0.getNameIconView();
            nameIconView.setTranslationX(0.0f);
        }
        if (!this.$hasSubscribe) {
            updateConstraints.s(R$id.commentDateText, 7, 0, 7);
        } else {
            updateConstraints.s(R$id.commentSubscribeBadge, 7, 0, 7);
            updateConstraints.t(R$id.commentDateText, 7, R$id.commentSubscribeBadge, 6, Dimens.INSTANCE.getDP_8());
        }
    }
}
