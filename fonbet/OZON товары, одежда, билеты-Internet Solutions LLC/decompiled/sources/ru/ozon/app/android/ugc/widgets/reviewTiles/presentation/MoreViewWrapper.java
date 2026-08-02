package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import AW.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/MoreViewWrapper;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$More;", "content", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$More;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/MoreView;", "moreView", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/MoreView;", "getMoreView", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/MoreView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoreViewWrapper extends ConstraintLayout {

    @NotNull
    private final MoreView moreView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewWrapper(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        MoreView moreView = new MoreView(context);
        moreView.setId(View.generateViewId());
        this.moreView = moreView;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        addView(moreView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.topToTop$default(dVar, moreView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, moreView.getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(Function1 function1, ReviewTilesVO.Content.More more, View view) {
        function1.invoke(more.getOpenFullViewAction());
    }

    public final void bind(@NotNull ReviewTilesVO.Content.More content, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setOnClickListener(new b(0, actionHandler, content));
        this.moreView.bind(content, actionHandler);
    }
}
