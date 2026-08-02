package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh;

import EW.a;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO.ReviewsFilterItemVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u0016*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0016B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/aspect/AspectView;", "aspectView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/uni/android/atom/aspect/AspectView;Lkotlin/jvm/functions/Function1;)V", "filter", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO;)V", "Lru/ozon/uni/android/atom/aspect/AspectView;", "Lkotlin/jvm/functions/Function1;", "Landroid/widget/LinearLayout;", "contentView", "Landroid/widget/LinearLayout;", "getContentView", "()Landroid/widget/LinearLayout;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ReviewsFilterVH<T extends ReviewsFilterVO.ReviewsFilterItemVO> extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AspectView aspectView;

    @NotNull
    private final LinearLayout contentView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int titleMaxWidth = ResourceExtKt.toPx(90);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH$Companion;", "", "<init>", "()V", "titleMaxWidth", "", "getTitleMaxWidth", "()I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTitleMaxWidth() {
            return ReviewsFilterVH.titleMaxWidth;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReviewsFilterVH(@NotNull AspectView aspectView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(aspectView);
        Intrinsics.checkNotNullParameter(aspectView, "aspectView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.aspectView = aspectView;
        this.actionHandler = actionHandler;
        LinearLayout linearLayout = new LinearLayout(this.itemView.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams);
        this.contentView = linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$3$lambda$2(View view, MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void bind(@NotNull T filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        AspectView aspectView = this.aspectView;
        if (aspectView.indexOfChild(this.contentView) == -1) {
            aspectView.addView(this.contentView);
        }
        AspectHolderKt.bind(aspectView, filter.getAspect(), this.actionHandler);
        if (filter.getAspect().getState() == AspectDTO.AspectState.UNAVAILABLE) {
            aspectView.setClickable(false);
            aspectView.setFocusable(false);
            aspectView.setOnClickListener(null);
            aspectView.setOnTouchListener(new a(0));
        }
    }

    @NotNull
    protected final LinearLayout getContentView() {
        return this.contentView;
    }
}
