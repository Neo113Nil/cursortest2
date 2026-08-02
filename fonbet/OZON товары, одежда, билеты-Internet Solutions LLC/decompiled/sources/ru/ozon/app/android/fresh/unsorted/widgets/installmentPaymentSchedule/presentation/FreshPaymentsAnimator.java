package ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.presentation;

import B90.j0;
import B90.k0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.utils.FigmaInterpolator;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/presentation/FreshPaymentsAnimator;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "moveList", "Ljava/util/HashMap;", "Ljava/lang/Runnable;", "", "Lkotlin/collections/HashMap;", "start", "", "stop", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPaymentsAnimator {

    @NotNull
    private final HashMap<Runnable, Long> moveList;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int FIRST_ANIMATION_OFFSET = UiExtKt.toPx(32);
    private static final int SECOND_ANIMATION_OFFSET = UiExtKt.toPx(-32);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/installmentPaymentSchedule/presentation/FreshPaymentsAnimator$Companion;", "", "<init>", "()V", "", "ANIMATION_DURATION", "I", "", "FIRST_ANIMATION_DELAY", "J", "SECOND_ANIMATION_DELAY", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FreshPaymentsAnimator(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        this.moveList = U.f(new Pair(new j0(this, 2), 800L), new Pair(new k0(this, 7), 1500L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveList$lambda$0(FreshPaymentsAnimator freshPaymentsAnimator) {
        freshPaymentsAnimator.recyclerView.smoothScrollBy(FIRST_ANIMATION_OFFSET, 0, FigmaInterpolator.INSTANCE.getLinear(), 400);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveList$lambda$1(FreshPaymentsAnimator freshPaymentsAnimator) {
        freshPaymentsAnimator.recyclerView.smoothScrollBy(SECOND_ANIMATION_OFFSET, 0, FigmaInterpolator.INSTANCE.getLinear(), 400);
    }

    public final void start() {
        for (Map.Entry<Runnable, Long> entry : this.moveList.entrySet()) {
            this.recyclerView.postDelayed(entry.getKey(), entry.getValue().longValue());
        }
    }

    public final void stop() {
        Iterator<Map.Entry<Runnable, Long>> it = this.moveList.entrySet().iterator();
        while (it.hasNext()) {
            this.recyclerView.removeCallbacks(it.next().getKey());
        }
    }
}
