package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModel;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "item", "", "clickLike", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;)V", "clickDislike", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "checkAuthorise", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;", "getActionLiveData", "()Landroidx/lifecycle/P;", "actionLiveData", "getCompleteActionAfterAuthEvent", "completeActionAfterAuthEvent", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SingleReviewViewModel {
    void checkAuthorise(@NotNull AtomAction.Click action);

    void clickDislike(@NotNull ButtonsVO item);

    void clickLike(@NotNull ButtonsVO item);

    @NotNull
    P<Action> getActionLiveData();

    @NotNull
    P<AtomAction.Click> getCompleteActionAfterAuthEvent();
}
