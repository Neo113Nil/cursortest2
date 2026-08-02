package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view;

import B90.p0;
import hd.C6915b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.travel.utils.animator.AnimatorListener;
import ru.ozon.app.android.travel.utils.animator.LinearFloatAnimator;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4LocationsView$startTypingTextAnimation$1$1", "Lru/ozon/app/android/travel/utils/animator/AnimatorListener;", "onAnimationUpdate", "", "progress", "", "onAnimationEnd", "onAnimationCancel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV4LocationsView$startTypingTextAnimation$1$1 implements AnimatorListener {
    final /* synthetic */ K $currentDestinationIndex;
    final /* synthetic */ M<Runnable> $destinationAnimationRunnable;
    final /* synthetic */ List<TextDTO> $destinations;
    final /* synthetic */ boolean $isDepartureLocation;
    final /* synthetic */ SearchFormV4LocationsView this$0;

    SearchFormV4LocationsView$startTypingTextAnimation$1$1(K k11, List<TextDTO> list, SearchFormV4LocationsView searchFormV4LocationsView, boolean z11, M<Runnable> m11) {
        this.$currentDestinationIndex = k11;
        this.$destinations = list;
        this.this$0 = searchFormV4LocationsView;
        this.$isDepartureLocation = z11;
        this.$destinationAnimationRunnable = m11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(SearchFormV4LocationsView searchFormV4LocationsView) {
        LinearFloatAnimator linearFloatAnimator;
        linearFloatAnimator = searchFormV4LocationsView.destinationAnimator;
        if (linearFloatAnimator != null) {
            linearFloatAnimator.start();
        }
    }

    @Override // ru.ozon.app.android.travel.utils.animator.AnimatorListener
    public void onAnimationCancel() {
        Runnable runnable = this.$destinationAnimationRunnable.f71787a;
        if (runnable != null) {
            this.this$0.removeCallbacks(runnable);
        }
        this.$destinationAnimationRunnable.f71787a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [B90.p0, T, java.lang.Runnable] */
    @Override // ru.ozon.app.android.travel.utils.animator.AnimatorListener
    public void onAnimationEnd() {
        LinearFloatAnimator linearFloatAnimator;
        linearFloatAnimator = this.this$0.destinationAnimator;
        if (linearFloatAnimator == null) {
            return;
        }
        K k11 = this.$currentDestinationIndex;
        k11.f71785a = (k11.f71785a + 1) % this.$destinations.size();
        M<Runnable> m11 = this.$destinationAnimationRunnable;
        SearchFormV4LocationsView searchFormV4LocationsView = this.this$0;
        ?? p0Var = new p0(searchFormV4LocationsView, 5);
        m11.f71787a = p0Var;
        searchFormV4LocationsView.postDelayed(p0Var, 1000L);
    }

    @Override // ru.ozon.app.android.travel.utils.animator.AnimatorListener
    public void onAnimationUpdate(float progress) {
        if (this.$currentDestinationIndex.f71785a < this.$destinations.size()) {
            TextDTO textDTO = this.$destinations.get(this.$currentDestinationIndex.f71785a);
            int length = textDTO.getText().length();
            int c11 = C6915b.c(progress * length);
            if (c11 <= length) {
                length = c11;
            }
            this.this$0.updateCurrentTextField(length, textDTO, this.$isDepartureLocation);
        }
    }
}
