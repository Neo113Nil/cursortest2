package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import DJ.c;
import Lm0.a;
import android.content.SharedPreferences;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.app.android.video.player.soundservice.SoundController;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b&\u0010%R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b'\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R$\u0010,\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u0010\u0011R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00104¨\u0006="}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Lru/ozon/app/android/video/player/soundservice/SoundController;Landroid/content/SharedPreferences;)V", "", "position", "", "setCurrentItemPosition", "(I)V", "", "playbackAvailable", "updatePlaybackState", "(Z)V", "scrolling", "onScrollEvent", "orientation", "setOrientation", "isSoundMuted", "onChangeMuteClicked", "", "key", "checkIfOnBackActionRequired", "(Ljava/lang/String;)V", "onBackActionInvoked", "()V", "onCleared", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "currentItemPosition", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getCurrentItemPosition", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getPlaybackAvailable", "getOrientation", "soundMutedState", "getSoundMutedState", "activeScroll", "getActiveScroll", "lastItemPosition", "Ljava/lang/Integer;", "getLastItemPosition", "()Ljava/lang/Integer;", "setLastItemPosition", "(Ljava/lang/Integer;)V", "isOnBackActionRequired", "Z", "()Z", "setOnBackActionRequired", "Lnc/a;", "disposables", "Lnc/a;", "onBackActionKey", "Ljava/lang/String;", "isMuted", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryV2MainViewModelImpl extends w0 implements ReviewGalleryV2MainViewModel {

    @NotNull
    private final BroadcastSingleLiveEvent<Boolean> activeScroll;

    @NotNull
    private final BroadcastSingleLiveEvent<Integer> currentItemPosition;

    @NotNull
    private final C8486a disposables;
    private boolean isOnBackActionRequired;
    private Integer lastItemPosition;
    private String onBackActionKey;

    @NotNull
    private final BroadcastSingleLiveEvent<Integer> orientation;

    @NotNull
    private final BroadcastSingleLiveEvent<Boolean> playbackAvailable;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final SoundController soundController;

    @NotNull
    private final BroadcastSingleLiveEvent<Boolean> soundMutedState;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModelImpl$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<Boolean, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, BroadcastSingleLiveEvent.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            ((BroadcastSingleLiveEvent) this.receiver).setValue(bool);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModelImpl$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "d", "d(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).d(th2);
        }
    }

    public ReviewGalleryV2MainViewModelImpl(@NotNull SoundController soundController, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.soundController = soundController;
        this.sharedPreferences = sharedPreferences;
        this.currentItemPosition = new BroadcastSingleLiveEvent<>();
        this.playbackAvailable = new BroadcastSingleLiveEvent<>();
        BroadcastSingleLiveEvent<Integer> broadcastSingleLiveEvent = new BroadcastSingleLiveEvent<>();
        broadcastSingleLiveEvent.setValue(1);
        this.orientation = broadcastSingleLiveEvent;
        this.soundMutedState = new BroadcastSingleLiveEvent<>();
        this.activeScroll = new BroadcastSingleLiveEvent<>();
        C8486a c8486a = new C8486a();
        this.disposables = c8486a;
        InterfaceC8487b subscribe = soundController.getSoundMutedState().subscribeOn(Mc.a.b()).observeOn(C8125a.a()).subscribe(new c(new AnonymousClass1(getSoundMutedState()), 8), new AJ.c(new AnonymousClass2(a.f17149a), 7));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public void checkIfOnBackActionRequired(String key) {
        if (key == null || Intrinsics.d(this.sharedPreferences.getString("review_gallery_on_back_action_key", null), key)) {
            return;
        }
        this.onBackActionKey = key;
        setOnBackActionRequired(true);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public Integer getLastItemPosition() {
        return this.lastItemPosition;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public boolean isMuted() {
        return this.soundController.isMuted();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    /* renamed from: isOnBackActionRequired, reason: from getter */
    public boolean getIsOnBackActionRequired() {
        return this.isOnBackActionRequired;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public void onBackActionInvoked() {
        String str = this.onBackActionKey;
        if (str != null) {
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putString("review_gallery_on_back_action_key", str);
            edit.apply();
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public void onChangeMuteClicked(boolean isSoundMuted) {
        this.soundController.setSoundMutedState(isSoundMuted);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public void onScrollEvent(boolean scrolling) {
        getActiveScroll().setValue(Boolean.valueOf(scrolling));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public void setCurrentItemPosition(int position) {
        setLastItemPosition(getCurrentItemPosition().getValue());
        getCurrentItemPosition().setValue(Integer.valueOf(position));
    }

    public void setLastItemPosition(Integer num) {
        this.lastItemPosition = num;
    }

    public void setOnBackActionRequired(boolean z11) {
        this.isOnBackActionRequired = z11;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public void setOrientation(int orientation) {
        Integer value = getOrientation().getValue();
        if (value != null && value.intValue() == orientation) {
            return;
        }
        getOrientation().setValue(Integer.valueOf(orientation));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    public void updatePlaybackState(boolean playbackAvailable) {
        getPlaybackAvailable().setValue(Boolean.valueOf(playbackAvailable));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    @NotNull
    public BroadcastSingleLiveEvent<Boolean> getActiveScroll() {
        return this.activeScroll;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    @NotNull
    public BroadcastSingleLiveEvent<Integer> getCurrentItemPosition() {
        return this.currentItemPosition;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    @NotNull
    public BroadcastSingleLiveEvent<Integer> getOrientation() {
        return this.orientation;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    @NotNull
    public BroadcastSingleLiveEvent<Boolean> getPlaybackAvailable() {
        return this.playbackAvailable;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel
    @NotNull
    public BroadcastSingleLiveEvent<Boolean> getSoundMutedState() {
        return this.soundMutedState;
    }
}
