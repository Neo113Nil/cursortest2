package ru.ozon.app.android.video.player.soundservice;

import Sc.o;
import java.util.EnumMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/SoundServiceImpl;", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundContentObserver", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver;", "<init>", "(Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver;)V", "soundControllers", "Ljava/util/EnumMap;", "Lru/ozon/app/android/video/player/soundservice/SoundScope;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "getSoundController", "scope", "createSoundController", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SoundServiceImpl implements SoundService {

    @NotNull
    private final SoundContentObserver soundContentObserver;

    @NotNull
    private final EnumMap<SoundScope, SoundController> soundControllers;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SoundScope.values().length];
            try {
                iArr[SoundScope.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SoundServiceImpl(@NotNull SoundContentObserver soundContentObserver) {
        Intrinsics.checkNotNullParameter(soundContentObserver, "soundContentObserver");
        this.soundContentObserver = soundContentObserver;
        this.soundControllers = new EnumMap<>(SoundScope.class);
    }

    private final SoundController createSoundController(SoundScope scope) {
        if (WhenMappings.$EnumSwitchMapping$0[scope.ordinal()] != 1) {
            throw new o();
        }
        SoundControllerImpl soundControllerImpl = new SoundControllerImpl(this.soundContentObserver);
        soundControllerImpl.setSoundMutedState(true);
        return soundControllerImpl;
    }

    @Override // ru.ozon.app.android.video.player.soundservice.SoundService
    @NotNull
    public SoundController getSoundController(@NotNull SoundScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        EnumMap<SoundScope, SoundController> enumMap = this.soundControllers;
        SoundController soundController = enumMap.get(scope);
        if (soundController == null) {
            soundController = createSoundController(scope);
            enumMap.put((EnumMap<SoundScope, SoundController>) scope, (SoundScope) soundController);
        }
        Intrinsics.checkNotNullExpressionValue(soundController, "getOrPut(...)");
        return soundController;
    }
}
