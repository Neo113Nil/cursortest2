package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\nJ\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0014\u0010\"\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0019R\u0014\u0010&\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "", "", "position", "", "setCurrentItemPosition", "(I)V", "", "playbackAvailable", "updatePlaybackState", "(Z)V", "orientation", "setOrientation", "isSoundMuted", "onChangeMuteClicked", "scrolling", "onScrollEvent", "", "key", "checkIfOnBackActionRequired", "(Ljava/lang/String;)V", "onBackActionInvoked", "()V", "Landroidx/lifecycle/P;", "getCurrentItemPosition", "()Landroidx/lifecycle/P;", "currentItemPosition", "getLastItemPosition", "()Ljava/lang/Integer;", "lastItemPosition", "getPlaybackAvailable", "getOrientation", "getSoundMutedState", "soundMutedState", "isMuted", "()Z", "getActiveScroll", "activeScroll", "isOnBackActionRequired", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewGalleryV2MainViewModel {
    void checkIfOnBackActionRequired(String key);

    @NotNull
    P<Boolean> getActiveScroll();

    @NotNull
    P<Integer> getCurrentItemPosition();

    Integer getLastItemPosition();

    @NotNull
    P<Integer> getOrientation();

    @NotNull
    P<Boolean> getPlaybackAvailable();

    @NotNull
    P<Boolean> getSoundMutedState();

    boolean isMuted();

    boolean isOnBackActionRequired();

    void onBackActionInvoked();

    void onChangeMuteClicked(boolean isSoundMuted);

    void onScrollEvent(boolean scrolling);

    void setCurrentItemPosition(int position);

    void setOrientation(int orientation);

    void updatePlaybackState(boolean playbackAvailable);
}
