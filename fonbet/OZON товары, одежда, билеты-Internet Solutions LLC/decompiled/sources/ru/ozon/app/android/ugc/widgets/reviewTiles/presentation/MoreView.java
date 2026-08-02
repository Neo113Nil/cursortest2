package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import AW.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$drawable;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/MoreView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bind", "", "content", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$More;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoreView extends FrameLayout {
    private static final int moreViewHeigth = ResourceExtKt.toPx(94);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(Dimens.INSTANCE.getDP_36(), moreViewHeigth));
        setBackgroundColor(0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R$drawable.bg_review_tiles_more);
        appCompatImageView.setForegroundGravity(17);
        appCompatImageView.setContentDescription("reviewTilesMoreView");
        addView(appCompatImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(Function1 function1, ReviewTilesVO.Content.More more, View view) {
        function1.invoke(more.getOpenFullViewAction());
    }

    public final void bind(@NotNull ReviewTilesVO.Content.More content, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setOnClickListener(new a(0, actionHandler, content));
    }
}
