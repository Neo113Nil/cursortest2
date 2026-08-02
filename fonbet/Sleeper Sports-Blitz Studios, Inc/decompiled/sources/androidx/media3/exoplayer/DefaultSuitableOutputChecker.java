package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.SuitableOutputChecker;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {
    private final SuitableOutputChecker impl;

    public DefaultSuitableOutputChecker() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.impl = new ImplApi35();
        } else {
            this.impl = new ImplApi23();
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void enable(SuitableOutputChecker.Callback callback, Context context, Looper looper, Looper looper2, Clock clock) {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.enable(callback, context, looper, looper2, clock);
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void disable() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.disable();
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public boolean isSelectedOutputSuitableForPlayback() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        return suitableOutputChecker == null || suitableOutputChecker.isSelectedOutputSuitableForPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ImplApi35 implements SuitableOutputChecker {
        private static final RouteDiscoveryPreference EMPTY_DISCOVERY_PREFERENCE;
        private MediaRouter2$ControllerCallback controllerCallback;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;
        private MediaRouter2$RouteCallback routeCallback;
        private MediaRouter2 router;

        private ImplApi35() {
        }

        static {
            RouteDiscoveryPreference build;
            MediaExtractorCompat$$ExternalSyntheticApiModelOutline0.m9397m();
            build = Util$$ExternalSyntheticApiModelOutline0.m((List) ImmutableList.of(), false).build();
            EMPTY_DISCOVERY_PREFERENCE = build;
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void enable(final SuitableOutputChecker.Callback callback, final Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(true, looper2, looper, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda20
                @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
                public final void onStateChanged(Object obj, Object obj2) {
                    SuitableOutputChecker.Callback.this.onSelectedOutputSuitabilityChanged(((Boolean) obj2).booleanValue());
                }
            });
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi35.this.m9373x2808a185(context);
                }
            });
        }

        /* renamed from: lambda$enable$1$androidx-media3-exoplayer-DefaultSuitableOutputChecker$ImplApi35, reason: not valid java name */
        /* synthetic */ void m9373x2808a185(Context context) {
            MediaRouter2 mediaRouter2;
            Assertions.checkNotNull(this.isSuitableForPlaybackState);
            mediaRouter2 = MediaRouter2.getInstance(context);
            this.router = mediaRouter2;
            this.routeCallback = new MediaRouter2$RouteCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.1
            };
            final BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            Objects.requireNonNull(backgroundThreadStateHandler);
            Executor executor = new Executor() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda18
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    BackgroundThreadStateHandler.this.runInBackground(runnable);
                }
            };
            this.router.registerRouteCallback(executor, this.routeCallback, EMPTY_DISCOVERY_PREFERENCE);
            MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = new MediaRouter2$ControllerCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.2
                public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                    ImplApi35.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi35.isSelectedOutputSuitableForPlayback(ImplApi35.this.router)));
                }
            };
            this.controllerCallback = mediaRouter2$ControllerCallback;
            this.router.registerControllerCallback(executor, mediaRouter2$ControllerCallback);
            this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(isSelectedOutputSuitableForPlayback(this.router)));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkStateNotNull(this.isSuitableForPlaybackState)).runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi35.this.m9372x2d89dbb9();
                }
            });
        }

        /* renamed from: lambda$disable$2$androidx-media3-exoplayer-DefaultSuitableOutputChecker$ImplApi35, reason: not valid java name */
        /* synthetic */ void m9372x2d89dbb9() {
            Util$$ExternalSyntheticApiModelOutline0.m9346m(Assertions.checkNotNull(this.router)).unregisterControllerCallback(MediaExtractorCompat$$ExternalSyntheticApiModelOutline0.m9387m(Assertions.checkNotNull(this.controllerCallback)));
            this.controllerCallback = null;
            this.router.unregisterRouteCallback(MediaExtractorCompat$$ExternalSyntheticApiModelOutline0.m9388m(Assertions.checkNotNull(this.routeCallback)));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSelectedOutputSuitableForPlayback(MediaRouter2 mediaRouter2) {
            MediaRouter2.RoutingController systemController;
            RoutingSessionInfo routingSessionInfo;
            int transferReason;
            MediaRouter2.RoutingController systemController2;
            boolean wasTransferInitiatedBySelf;
            MediaRouter2.RoutingController systemController3;
            List selectedRoutes;
            systemController = Util$$ExternalSyntheticApiModelOutline0.m9346m(Assertions.checkNotNull(mediaRouter2)).getSystemController();
            routingSessionInfo = systemController.getRoutingSessionInfo();
            transferReason = routingSessionInfo.getTransferReason();
            systemController2 = mediaRouter2.getSystemController();
            wasTransferInitiatedBySelf = systemController2.wasTransferInitiatedBySelf();
            systemController3 = mediaRouter2.getSystemController();
            selectedRoutes = systemController3.getSelectedRoutes();
            Iterator it = selectedRoutes.iterator();
            while (it.hasNext()) {
                if (isRouteSuitableForMediaPlayback(Util$$ExternalSyntheticApiModelOutline0.m9345m(it.next()), transferReason, wasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isRouteSuitableForMediaPlayback(MediaRoute2Info mediaRoute2Info, int i, boolean z) {
            int suitabilityStatus;
            suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i == 1 || i == 2) && z : suitabilityStatus == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ImplApi23 implements SuitableOutputChecker {
        private AudioDeviceCallback audioDeviceCallback;
        private AudioManager audioManager;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;

        private ImplApi23() {
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void enable(final SuitableOutputChecker.Callback callback, final Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(true, looper2, looper, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
                public final void onStateChanged(Object obj, Object obj2) {
                    SuitableOutputChecker.Callback.this.onSelectedOutputSuitabilityChanged(((Boolean) obj2).booleanValue());
                }
            });
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi23.this.m9370x2808a164(context);
                }
            });
        }

        /* renamed from: lambda$enable$1$androidx-media3-exoplayer-DefaultSuitableOutputChecker$ImplApi23, reason: not valid java name */
        /* synthetic */ void m9370x2808a164(Context context) {
            AudioManager audioManager;
            Assertions.checkNotNull(this.isSuitableForPlaybackState);
            if (Util.isWear(context) && (audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) != null) {
                this.audioManager = audioManager;
                AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.1
                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }

                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }
                };
                this.audioDeviceCallback = audioDeviceCallback;
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler((Looper) Assertions.checkNotNull(Looper.myLooper())));
                this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(hasSupportedAudioOutput()));
            }
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkNotNull(this.isSuitableForPlaybackState)).runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi23.this.m9369x2d89db98();
                }
            });
        }

        /* renamed from: lambda$disable$2$androidx-media3-exoplayer-DefaultSuitableOutputChecker$ImplApi23, reason: not valid java name */
        /* synthetic */ void m9369x2d89db98() {
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) Assertions.checkNotNull(this.audioDeviceCallback));
            }
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasSupportedAudioOutput() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) Assertions.checkStateNotNull(this.audioManager)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }
    }
}
