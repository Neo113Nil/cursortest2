package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.PlayerInfo;
import androidx.media3.session.SequencedFutureManager;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
class MediaSessionImpl {
    private static final String ANDROID_AUTOMOTIVE_LAUNCHER_PACKAGE_NAME = "com.android.car.carlauncher";
    private static final String ANDROID_AUTOMOTIVE_MEDIA_PACKAGE_NAME = "com.android.car.media";
    private static final String ANDROID_AUTO_PACKAGE_NAME = "com.google.android.projection.gearhead";
    private static final long DEFAULT_SESSION_POSITION_UPDATE_DELAY_MS = 3000;
    private static final SessionResult RESULT_WHEN_CLOSED = new SessionResult(1);
    private static final String SYSTEM_UI_PACKAGE_NAME = "com.android.systemui";
    public static final String TAG = "MediaSessionImpl";
    private static final String WRONG_THREAD_ERROR_MESSAGE = "Player callback method is called from a wrong thread. See javadoc of MediaSession for details.";
    private final Handler applicationHandler;
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private MediaSessionServiceLegacyStub browserServiceLegacyStub;
    private final MediaSession.Callback callback;
    private boolean closed;
    private final ImmutableList<CommandButton> commandButtonsForMediaItems;
    private final Context context;
    private MediaSession.ControllerInfo controllerForCurrentRequest;
    private ImmutableList<CommandButton> customLayout;
    private final MediaSession instance;
    private boolean isMediaNotificationControllerConnected;
    private final boolean isPeriodicPositionUpdateEnabled;
    private final Object lock = new Object();
    private final Handler mainHandler;
    private ImmutableList<CommandButton> mediaButtonPreferences;
    private final MediaPlayPauseKeyHandler mediaPlayPauseKeyHandler;
    private MediaSession.Listener mediaSessionListener;
    private final PlayerInfoChangedHandler onPlayerInfoChangedHandler;
    private final Runnable periodicSessionPositionInfoUpdateRunnable;
    private final boolean playIfSuppressed;
    private PlaybackException playbackException;
    private PlayerInfo playerInfo;
    private PlayerListener playerListener;
    private PlayerWrapper playerWrapper;
    private PendingIntent sessionActivity;
    private Bundle sessionExtras;
    private final String sessionId;
    private final MediaSessionLegacyStub sessionLegacyStub;
    private long sessionPositionUpdateDelayMs;
    private final MediaSessionStub sessionStub;
    private final SessionToken sessionToken;
    private final Uri sessionUri;

    interface RemoteControllerTask {
        void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException;
    }

    public MediaSessionImpl(MediaSession mediaSession, Context context, String str, Player player, PendingIntent pendingIntent, ImmutableList<CommandButton> immutableList, ImmutableList<CommandButton> immutableList2, ImmutableList<CommandButton> immutableList3, MediaSession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2) {
        Log.i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + Util.DEVICE_DEBUG_INFO + "]");
        this.instance = mediaSession;
        this.context = context;
        this.sessionId = str;
        this.sessionActivity = pendingIntent;
        this.customLayout = immutableList;
        this.mediaButtonPreferences = immutableList2;
        this.commandButtonsForMediaItems = immutableList3;
        this.callback = callback;
        this.sessionExtras = bundle2;
        this.bitmapLoader = bitmapLoader;
        this.playIfSuppressed = z;
        this.isPeriodicPositionUpdateEnabled = z2;
        MediaSessionStub mediaSessionStub = new MediaSessionStub(this);
        this.sessionStub = mediaSessionStub;
        this.mainHandler = new Handler(Looper.getMainLooper());
        Looper applicationLooper = player.getApplicationLooper();
        Handler handler = new Handler(applicationLooper);
        this.applicationHandler = handler;
        this.playerInfo = PlayerInfo.DEFAULT;
        this.onPlayerInfoChangedHandler = new PlayerInfoChangedHandler(applicationLooper);
        this.mediaPlayPauseKeyHandler = new MediaPlayPauseKeyHandler(applicationLooper);
        Uri build = new Uri.Builder().scheme(MediaSessionImpl.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.sessionUri = build;
        MediaSession.ConnectionResult build2 = new MediaSession.ConnectionResult.AcceptedResultBuilder(mediaSession).build();
        MediaSessionLegacyStub mediaSessionLegacyStub = new MediaSessionLegacyStub(this, build, handler, bundle, z, immutableList, immutableList2, build2.availableSessionCommands, build2.availablePlayerCommands, bundle2);
        this.sessionLegacyStub = mediaSessionLegacyStub;
        this.sessionToken = new SessionToken(Process.myUid(), 0, MediaLibraryInfo.VERSION_INT, 5, context.getPackageName(), mediaSessionStub, bundle, mediaSessionLegacyStub.getSessionCompat().getSessionToken().getToken());
        final PlayerWrapper playerWrapper = new PlayerWrapper(player);
        this.playerWrapper = playerWrapper;
        Util.postOrRun(handler, new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.setPlayerInternal(null, playerWrapper);
            }
        });
        this.sessionPositionUpdateDelayMs = 3000L;
        this.periodicSessionPositionInfoUpdateRunnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.notifyPeriodicSessionPositionInfoChangesOnHandler();
            }
        };
        Util.postOrRun(handler, new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.schedulePeriodicSessionPositionInfoChanges();
            }
        });
    }

    public void setPlayer(Player player) {
        if (player == this.playerWrapper.getWrappedPlayer()) {
            return;
        }
        setPlayerInternal(this.playerWrapper, new PlayerWrapper(player));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerInternal(final PlayerWrapper playerWrapper, final PlayerWrapper playerWrapper2) {
        this.playerWrapper = playerWrapper2;
        if (playerWrapper != null) {
            playerWrapper.removeListener((Player.Listener) Assertions.checkStateNotNull(this.playerListener));
        }
        PlayerListener playerListener = new PlayerListener(this, playerWrapper2);
        playerWrapper2.addListener(playerListener);
        this.playerListener = playerListener;
        dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda2
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.onPlayerChanged(i, PlayerWrapper.this, playerWrapper2);
            }
        });
        if (playerWrapper == null) {
            this.sessionLegacyStub.start();
        }
        this.playerInfo = playerWrapper2.createInitialPlayerInfo();
        handleAvailablePlayerCommandsChanged(playerWrapper2.getAvailableCommands());
    }

    public void release() {
        Log.i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + Util.DEVICE_DEBUG_INFO + "] [" + MediaLibraryInfo.registeredModules() + "]");
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.mediaPlayPauseKeyHandler.clearPendingPlayPauseTask();
            this.applicationHandler.removeCallbacksAndMessages(null);
            try {
                Util.postOrRun(this.applicationHandler, new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSessionImpl.this.m9724lambda$release$2$androidxmedia3sessionMediaSessionImpl();
                    }
                });
            } catch (Exception e) {
                Log.w(TAG, "Exception thrown while closing", e);
            }
            this.sessionLegacyStub.release();
            this.sessionStub.release();
        }
    }

    /* renamed from: lambda$release$2$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9724lambda$release$2$androidxmedia3sessionMediaSessionImpl() {
        PlayerListener playerListener = this.playerListener;
        if (playerListener != null) {
            this.playerWrapper.removeListener(playerListener);
        }
    }

    public PlayerWrapper getPlayerWrapper() {
        return this.playerWrapper;
    }

    public Runnable callWithControllerForCurrentRequestSet(final MediaSession.ControllerInfo controllerInfo, final Runnable runnable) {
        return new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.m9720x8683e518(controllerInfo, runnable);
            }
        };
    }

    /* renamed from: lambda$callWithControllerForCurrentRequestSet$3$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9720x8683e518(MediaSession.ControllerInfo controllerInfo, Runnable runnable) {
        this.controllerForCurrentRequest = controllerInfo;
        runnable.run();
        this.controllerForCurrentRequest = null;
    }

    public String getId() {
        return this.sessionId;
    }

    public Uri getUri() {
        return this.sessionUri;
    }

    public SessionToken getToken() {
        return this.sessionToken;
    }

    public List<MediaSession.ControllerInfo> getConnectedControllers() {
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        ImmutableList<MediaSession.ControllerInfo> connectedControllers2 = this.sessionLegacyStub.getConnectedControllersManager().getConnectedControllers();
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(connectedControllers.size() + connectedControllers2.size());
        if (!this.isMediaNotificationControllerConnected) {
            return builderWithExpectedSize.addAll((Iterable) connectedControllers).addAll((Iterable) connectedControllers2).build();
        }
        for (int i = 0; i < connectedControllers.size(); i++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (!isSystemUiController(controllerInfo)) {
                builderWithExpectedSize.add((ImmutableList.Builder) controllerInfo);
            }
        }
        for (int i2 = 0; i2 < connectedControllers2.size(); i2++) {
            MediaSession.ControllerInfo controllerInfo2 = connectedControllers2.get(i2);
            if (!isSystemUiController(controllerInfo2)) {
                builderWithExpectedSize.add((ImmutableList.Builder) controllerInfo2);
            }
        }
        return builderWithExpectedSize.build();
    }

    public MediaSession.ControllerInfo getControllerForCurrentRequest() {
        MediaSession.ControllerInfo controllerInfo = this.controllerForCurrentRequest;
        if (controllerInfo != null) {
            return resolveControllerInfoForCallback(controllerInfo);
        }
        return null;
    }

    public boolean isConnected(MediaSession.ControllerInfo controllerInfo) {
        return this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo) || this.sessionLegacyStub.getConnectedControllersManager().isConnected(controllerInfo);
    }

    protected boolean isSystemUiController(MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo != null && Objects.equals(controllerInfo.getPackageName(), SYSTEM_UI_PACKAGE_NAME);
    }

    public boolean isMediaNotificationController(MediaSession.ControllerInfo controllerInfo) {
        return Objects.equals(controllerInfo.getPackageName(), this.context.getPackageName()) && controllerInfo.getControllerVersion() != 0 && controllerInfo.getConnectionHints().getBoolean(MediaController.KEY_MEDIA_NOTIFICATION_CONTROLLER_FLAG, false);
    }

    public boolean isAutomotiveController(MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo.getPackageName().equals(ANDROID_AUTOMOTIVE_MEDIA_PACKAGE_NAME) || controllerInfo.getPackageName().equals(ANDROID_AUTOMOTIVE_LAUNCHER_PACKAGE_NAME);
    }

    public boolean isAutoCompanionController(MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo.getPackageName().equals(ANDROID_AUTO_PACKAGE_NAME);
    }

    protected MediaSession.ControllerInfo getSystemUiControllerInfo() {
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionLegacyStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (isSystemUiController(controllerInfo)) {
                return controllerInfo;
            }
        }
        ImmutableList<MediaSession.ControllerInfo> connectedControllers2 = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i2 = 0; i2 < connectedControllers2.size(); i2++) {
            MediaSession.ControllerInfo controllerInfo2 = connectedControllers2.get(i2);
            if (isSystemUiController(controllerInfo2)) {
                return controllerInfo2;
            }
        }
        return null;
    }

    public MediaSession.ControllerInfo getMediaNotificationControllerInfo() {
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (isMediaNotificationController(controllerInfo)) {
                return controllerInfo;
            }
        }
        return null;
    }

    protected boolean isMediaNotificationControllerConnected() {
        return this.isMediaNotificationControllerConnected;
    }

    public ListenableFuture<SessionResult> setCustomLayout(MediaSession.ControllerInfo controllerInfo, final ImmutableList<CommandButton> immutableList) {
        if (isMediaNotificationController(controllerInfo)) {
            this.sessionLegacyStub.setPlatformCustomLayout(immutableList);
            this.sessionLegacyStub.updateLegacySessionPlaybackState(this.playerWrapper);
        }
        return dispatchRemoteControllerTask(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda28
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.setCustomLayout(i, ImmutableList.this);
            }
        });
    }

    public void setCustomLayout(final ImmutableList<CommandButton> immutableList) {
        this.customLayout = immutableList;
        this.sessionLegacyStub.setPlatformCustomLayout(immutableList);
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda30
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.setCustomLayout(i, ImmutableList.this);
            }
        });
    }

    public ListenableFuture<SessionResult> setMediaButtonPreferences(MediaSession.ControllerInfo controllerInfo, final ImmutableList<CommandButton> immutableList) {
        if (isMediaNotificationController(controllerInfo)) {
            this.sessionLegacyStub.setPlatformMediaButtonPreferences(immutableList);
            this.sessionLegacyStub.updateLegacySessionPlaybackState(this.playerWrapper);
        }
        return dispatchRemoteControllerTask(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda0
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.setMediaButtonPreferences(i, ImmutableList.this);
            }
        });
    }

    public void setMediaButtonPreferences(final ImmutableList<CommandButton> immutableList) {
        this.mediaButtonPreferences = immutableList;
        this.sessionLegacyStub.setPlatformMediaButtonPreferences(immutableList);
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda22
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.setMediaButtonPreferences(i, ImmutableList.this);
            }
        });
    }

    public void setPlaybackException(MediaSession.ControllerInfo controllerInfo, PlaybackException playbackException) {
        Player.Commands playerCommandsBeforePlaybackException;
        Player.Commands playerCommandsBeforePlaybackException2;
        ConnectedControllersManager<IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
        PlaybackException playbackException2 = connectedControllersManager.getPlaybackException(controllerInfo);
        if (!connectedControllersManager.isConnected(controllerInfo) || PlaybackException.areErrorInfosEqual(playbackException, playbackException2)) {
            return;
        }
        if (playbackException2 == null) {
            playerCommandsBeforePlaybackException = connectedControllersManager.getAvailablePlayerCommands(controllerInfo);
        } else {
            playerCommandsBeforePlaybackException = connectedControllersManager.getPlayerCommandsBeforePlaybackException(controllerInfo);
        }
        if (isMediaNotificationController(controllerInfo)) {
            this.sessionLegacyStub.setPlaybackException(playbackException, playbackException != null ? createPlayerCommandsForCustomErrorState(playerCommandsBeforePlaybackException) : null);
        }
        if (playbackException != null) {
            playerCommandsBeforePlaybackException2 = createPlayerCommandsForCustomErrorState(playerCommandsBeforePlaybackException);
        } else {
            playerCommandsBeforePlaybackException2 = connectedControllersManager.getPlayerCommandsBeforePlaybackException(controllerInfo);
        }
        SessionCommands availableSessionCommands = connectedControllersManager.getAvailableSessionCommands(controllerInfo);
        if (playerCommandsBeforePlaybackException2 == null || availableSessionCommands == null) {
            return;
        }
        connectedControllersManager.resetPlaybackException(controllerInfo);
        setAvailableCommands(controllerInfo, availableSessionCommands, playerCommandsBeforePlaybackException2);
        if (playbackException != null) {
            connectedControllersManager.setPlaybackException(controllerInfo, playbackException, (Player.Commands) Assertions.checkNotNull(playerCommandsBeforePlaybackException));
        }
    }

    public void setPlaybackException(PlaybackException playbackException) {
        this.playbackException = playbackException;
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            setPlaybackException(connectedControllers.get(i), playbackException);
        }
    }

    public PlaybackException getPlaybackException() {
        return this.playbackException;
    }

    static Player.Commands createPlayerCommandsForCustomErrorState(Player.Commands commands) {
        if (commands == null) {
            return null;
        }
        Player.Commands.Builder buildUpon = Player.Commands.EMPTY.buildUpon();
        if (commands.contains(16)) {
            buildUpon.add(16);
        }
        if (commands.contains(17)) {
            buildUpon.add(17);
        }
        if (commands.contains(18)) {
            buildUpon.add(18);
        }
        if (commands.contains(21)) {
            buildUpon.add(21);
        }
        if (commands.contains(22)) {
            buildUpon.add(22);
        }
        if (commands.contains(23)) {
            buildUpon.add(23);
        }
        if (commands.contains(30)) {
            buildUpon.add(30);
        }
        if (commands.contains(32)) {
            buildUpon.add(32);
        }
        return buildUpon.build();
    }

    public PlayerInfo getPlayerInfo() {
        return this.playerInfo;
    }

    public ImmutableList<CommandButton> getCustomLayout() {
        return this.customLayout;
    }

    public ImmutableList<CommandButton> getMediaButtonPreferences() {
        return this.mediaButtonPreferences;
    }

    public ImmutableList<CommandButton> getCommandButtonsForMediaItems() {
        return this.commandButtonsForMediaItems;
    }

    public void setSessionExtras(final Bundle bundle) {
        this.sessionExtras = bundle;
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda34
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.onSessionExtrasChanged(i, bundle);
            }
        });
    }

    public void setSessionExtras(MediaSession.ControllerInfo controllerInfo, final Bundle bundle) {
        if (this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda24
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onSessionExtrasChanged(i, bundle);
                }
            });
            if (isMediaNotificationController(controllerInfo)) {
                dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda25
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(MediaSession.ControllerCb controllerCb, int i) {
                        controllerCb.onSessionExtrasChanged(i, bundle);
                    }
                });
            }
        }
    }

    public Bundle getSessionExtras() {
        return this.sessionExtras;
    }

    public androidx.media3.common.util.BitmapLoader getBitmapLoader() {
        return this.bitmapLoader;
    }

    public boolean shouldPlayIfSuppressed() {
        return this.playIfSuppressed;
    }

    public void setAvailableCommands(MediaSession.ControllerInfo controllerInfo, final SessionCommands sessionCommands, Player.Commands commands) {
        ConnectedControllersManager connectedControllersManager;
        if (this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            if (isMediaNotificationController(controllerInfo)) {
                this.sessionLegacyStub.setAvailableCommands(sessionCommands, commands);
                MediaSession.ControllerInfo systemUiControllerInfo = getSystemUiControllerInfo();
                if (systemUiControllerInfo != null) {
                    if (systemUiControllerInfo.getControllerVersion() == 0) {
                        connectedControllersManager = this.sessionLegacyStub.getConnectedControllersManager();
                    } else {
                        connectedControllersManager = this.sessionStub.getConnectedControllersManager();
                    }
                    connectedControllersManager.updateCommandsFromSession(systemUiControllerInfo, sessionCommands, commands);
                }
            }
            this.sessionStub.getConnectedControllersManager().updateCommandsFromSession(controllerInfo, sessionCommands, commands);
            final Player.Commands availablePlayerCommands = this.sessionStub.getConnectedControllersManager().getAvailablePlayerCommands(controllerInfo);
            if (availablePlayerCommands != null) {
                dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda29
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(MediaSession.ControllerCb controllerCb, int i) {
                        controllerCb.onAvailableCommandsChangedFromSession(i, SessionCommands.this, availablePlayerCommands);
                    }
                });
                this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, false);
                return;
            }
            return;
        }
        if (controllerInfo.getControllerVersion() == 0) {
            this.sessionLegacyStub.getConnectedControllersManager().updateCommandsFromSession(controllerInfo, sessionCommands, commands);
        }
    }

    public void broadcastCustomCommand(final SessionCommand sessionCommand, final Bundle bundle) {
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda6
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.sendCustomCommand(i, SessionCommand.this, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnPlayerInfoChanged(PlayerInfo playerInfo, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        PlayerInfo generateAndCacheUniqueTrackGroupIds = this.sessionStub.generateAndCacheUniqueTrackGroupIds(playerInfo);
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        int i2 = 0;
        while (i2 < connectedControllers.size()) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i2);
            try {
                ConnectedControllersManager<IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
                SequencedFutureManager sequencedFutureManager = connectedControllersManager.getSequencedFutureManager(controllerInfo);
                if (sequencedFutureManager != null) {
                    i = sequencedFutureManager.obtainNextSequenceNumber();
                } else if (!isConnected(controllerInfo)) {
                    return;
                } else {
                    i = 0;
                }
                PlayerInfo playerInfoForPlaybackException = connectedControllersManager.getPlayerInfoForPlaybackException(controllerInfo);
                if (playerInfoForPlaybackException != null) {
                    z3 = z;
                    z4 = z2;
                } else {
                    PlaybackException playbackException = connectedControllersManager.getPlaybackException(controllerInfo);
                    if (playbackException != null) {
                        playerInfoForPlaybackException = createPlayerInfoForCustomPlaybackException(generateAndCacheUniqueTrackGroupIds, playbackException);
                        connectedControllersManager.setPlayerInfoForPlaybackException(controllerInfo, playerInfoForPlaybackException);
                    }
                    z3 = z;
                    z4 = z2;
                    try {
                        ((MediaSession.ControllerCb) Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onPlayerInfoChanged(i, playerInfoForPlaybackException == null ? generateAndCacheUniqueTrackGroupIds : playerInfoForPlaybackException, MediaUtils.intersect(connectedControllersManager.getAvailablePlayerCommands(controllerInfo), getPlayerWrapper().getAvailableCommands()), z3, z4);
                    } catch (DeadObjectException unused) {
                        onDeadObjectException(controllerInfo);
                        i2++;
                        z = z3;
                        z2 = z4;
                    } catch (RemoteException e) {
                        e = e;
                        Log.w(TAG, "Exception in " + controllerInfo, e);
                        i2++;
                        z = z3;
                        z2 = z4;
                    }
                }
            } catch (DeadObjectException unused2) {
                z3 = z;
                z4 = z2;
            } catch (RemoteException e2) {
                e = e2;
                z3 = z;
                z4 = z2;
            }
            i2++;
            z = z3;
            z2 = z4;
        }
    }

    static PlayerInfo createPlayerInfoForCustomPlaybackException(PlayerInfo playerInfo, PlaybackException playbackException) {
        return playerInfo.copyWithPlaybackState(1, playbackException).copyWithSessionPositionInfo(new SessionPositionInfo(playerInfo.sessionPositionInfo.positionInfo, playerInfo.sessionPositionInfo.isPlayingAd, playerInfo.sessionPositionInfo.eventTimeMs, playerInfo.sessionPositionInfo.durationMs, 0L, 0, 0L, playerInfo.sessionPositionInfo.currentLiveOffsetMs, playerInfo.sessionPositionInfo.contentDurationMs, 0L));
    }

    public ListenableFuture<SessionResult> sendCustomCommand(MediaSession.ControllerInfo controllerInfo, final SessionCommand sessionCommand, final Bundle bundle) {
        return dispatchRemoteControllerTask(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda1
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.sendCustomCommand(i, SessionCommand.this, bundle);
            }
        });
    }

    public void sendError(MediaSession.ControllerInfo controllerInfo, final SessionError sessionError) {
        if (controllerInfo.getControllerVersion() == 0 || controllerInfo.getInterfaceVersion() >= 4) {
            if (isMediaNotificationController(controllerInfo) || controllerInfo.getControllerVersion() == 0) {
                dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda7
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(MediaSession.ControllerCb controllerCb, int i) {
                        controllerCb.onError(i, SessionError.this);
                    }
                });
            } else {
                dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda8
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(MediaSession.ControllerCb controllerCb, int i) {
                        controllerCb.onError(i, SessionError.this);
                    }
                });
            }
        }
    }

    public void sendError(final SessionError sessionError) {
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (!isMediaNotificationController(controllerInfo)) {
                sendError(controllerInfo, sessionError);
            }
        }
        dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda5
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                controllerCb.onError(i2, SessionError.this);
            }
        });
    }

    public MediaSession.ConnectionResult onConnectOnHandler(MediaSession.ControllerInfo controllerInfo) {
        ImmutableList<CommandButton> mediaButtonPreferences;
        ImmutableList<CommandButton> customLayout;
        if (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) {
            return this.sessionLegacyStub.getPlatformConnectionResult(this.instance);
        }
        MediaSession.ConnectionResult connectionResult = (MediaSession.ConnectionResult) Assertions.checkNotNull(this.callback.onConnect(this.instance, controllerInfo), "Callback.onConnect must return non-null future");
        if (isMediaNotificationController(controllerInfo) && connectionResult.isAccepted) {
            this.isMediaNotificationControllerConnected = true;
            if (connectionResult.mediaButtonPreferences != null) {
                mediaButtonPreferences = connectionResult.mediaButtonPreferences;
            } else {
                mediaButtonPreferences = this.instance.getMediaButtonPreferences();
            }
            if (mediaButtonPreferences.isEmpty()) {
                MediaSessionLegacyStub mediaSessionLegacyStub = this.sessionLegacyStub;
                if (connectionResult.customLayout != null) {
                    customLayout = connectionResult.customLayout;
                } else {
                    customLayout = this.instance.getCustomLayout();
                }
                mediaSessionLegacyStub.setPlatformCustomLayout(customLayout);
            } else {
                this.sessionLegacyStub.setPlatformMediaButtonPreferences(mediaButtonPreferences);
            }
            this.sessionLegacyStub.setAvailableCommands(connectionResult.availableSessionCommands, connectionResult.availablePlayerCommands);
        }
        return connectionResult;
    }

    public void onPostConnectOnHandler(MediaSession.ControllerInfo controllerInfo) {
        if (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) {
            return;
        }
        this.callback.onPostConnect(this.instance, controllerInfo);
    }

    public void onDisconnectedOnHandler(MediaSession.ControllerInfo controllerInfo) {
        if (this.isMediaNotificationControllerConnected) {
            if (isSystemUiController(controllerInfo)) {
                return;
            }
            if (isMediaNotificationController(controllerInfo)) {
                this.isMediaNotificationControllerConnected = false;
            }
        }
        this.callback.onDisconnected(this.instance, controllerInfo);
    }

    public int onPlayerCommandRequestOnHandler(MediaSession.ControllerInfo controllerInfo, int i) {
        return this.callback.onPlayerCommandRequest(this.instance, resolveControllerInfoForCallback(controllerInfo), i);
    }

    public ListenableFuture<SessionResult> onSetRatingOnHandler(MediaSession.ControllerInfo controllerInfo, String str, Rating rating) {
        return (ListenableFuture) Assertions.checkNotNull(this.callback.onSetRating(this.instance, resolveControllerInfoForCallback(controllerInfo), str, rating), "Callback.onSetRating must return non-null future");
    }

    public ListenableFuture<SessionResult> onSetRatingOnHandler(MediaSession.ControllerInfo controllerInfo, Rating rating) {
        return (ListenableFuture) Assertions.checkNotNull(this.callback.onSetRating(this.instance, resolveControllerInfoForCallback(controllerInfo), rating), "Callback.onSetRating must return non-null future");
    }

    public ListenableFuture<SessionResult> onCustomCommandOnHandler(MediaSession.ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle) {
        return (ListenableFuture) Assertions.checkNotNull(this.callback.onCustomCommand(this.instance, resolveControllerInfoForCallback(controllerInfo), sessionCommand, bundle), "Callback.onCustomCommandOnHandler must return non-null future");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ListenableFuture<List<MediaItem>> onAddMediaItemsOnHandler(MediaSession.ControllerInfo controllerInfo, List<MediaItem> list) {
        return (ListenableFuture) Assertions.checkNotNull(this.callback.onAddMediaItems(this.instance, resolveControllerInfoForCallback(controllerInfo), list), "Callback.onAddMediaItems must return a non-null future");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ListenableFuture<MediaSession.MediaItemsWithStartPosition> onSetMediaItemsOnHandler(MediaSession.ControllerInfo controllerInfo, List<MediaItem> list, int i, long j) {
        return (ListenableFuture) Assertions.checkNotNull(this.callback.onSetMediaItems(this.instance, resolveControllerInfoForCallback(controllerInfo), list, i, j), "Callback.onSetMediaItems must return a non-null future");
    }

    protected void onPlayerInteractionFinishedOnHandler(MediaSession.ControllerInfo controllerInfo, Player.Commands commands) {
        this.callback.onPlayerInteractionFinished(this.instance, resolveControllerInfoForCallback(controllerInfo), commands);
    }

    public void connectFromService(IMediaController iMediaController, MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.connect(iMediaController, controllerInfo);
    }

    public MediaSession.Token getPlatformToken() {
        return this.sessionLegacyStub.getSessionCompat().getSessionToken().getToken();
    }

    public void setLegacyControllerConnectionTimeoutMs(long j) {
        this.sessionLegacyStub.setLegacyControllerDisconnectTimeoutMs(j);
    }

    protected MediaSessionLegacyStub getMediaSessionLegacyStub() {
        return this.sessionLegacyStub;
    }

    protected Context getContext() {
        return this.context;
    }

    protected Handler getApplicationHandler() {
        return this.applicationHandler;
    }

    protected boolean isReleased() {
        boolean z;
        synchronized (this.lock) {
            z = this.closed;
        }
        return z;
    }

    protected PendingIntent getSessionActivity() {
        return this.sessionActivity;
    }

    protected void setSessionActivity(PendingIntent pendingIntent) {
        this.sessionActivity = pendingIntent;
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            setSessionActivity(connectedControllers.get(i), pendingIntent);
        }
    }

    protected void setSessionActivity(MediaSession.ControllerInfo controllerInfo, final PendingIntent pendingIntent) {
        if (controllerInfo.getControllerVersion() < 3 || !this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            return;
        }
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda3
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.onSessionActivityChanged(i, pendingIntent);
            }
        });
        if (isMediaNotificationController(controllerInfo)) {
            dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda4
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onSessionActivityChanged(i, pendingIntent);
                }
            });
        }
    }

    protected MediaSession.ControllerInfo resolveControllerInfoForCallback(MediaSession.ControllerInfo controllerInfo) {
        return (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) ? (MediaSession.ControllerInfo) Assertions.checkNotNull(getMediaNotificationControllerInfo()) : controllerInfo;
    }

    protected IBinder getLegacyBrowserServiceBinder() {
        MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub;
        synchronized (this.lock) {
            if (this.browserServiceLegacyStub == null) {
                this.browserServiceLegacyStub = createLegacyBrowserService(this.sessionLegacyStub.getSessionCompat().getSessionToken());
            }
            mediaSessionServiceLegacyStub = this.browserServiceLegacyStub;
        }
        return mediaSessionServiceLegacyStub.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    protected MediaSessionServiceLegacyStub createLegacyBrowserService(MediaSessionCompat.Token token) {
        MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub = new MediaSessionServiceLegacyStub(this);
        mediaSessionServiceLegacyStub.initialize(token);
        return mediaSessionServiceLegacyStub;
    }

    protected void setSessionPositionUpdateDelayMsOnHandler(long j) {
        verifyApplicationThread();
        this.sessionPositionUpdateDelayMs = j;
        schedulePeriodicSessionPositionInfoChanges();
    }

    protected MediaSessionServiceLegacyStub getLegacyBrowserService() {
        MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub;
        synchronized (this.lock) {
            mediaSessionServiceLegacyStub = this.browserServiceLegacyStub;
        }
        return mediaSessionServiceLegacyStub;
    }

    boolean canResumePlaybackOnStart() {
        return this.sessionLegacyStub.canResumePlaybackOnStart();
    }

    void setMediaSessionListener(MediaSession.Listener listener) {
        this.mediaSessionListener = listener;
    }

    void clearMediaSessionListener() {
        this.mediaSessionListener = null;
    }

    void onNotificationRefreshRequired() {
        Util.postOrRun(this.mainHandler, new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.m9722xb6dfc4ae();
            }
        });
    }

    /* renamed from: lambda$onNotificationRefreshRequired$19$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9722xb6dfc4ae() {
        MediaSession.Listener listener = this.mediaSessionListener;
        if (listener != null) {
            listener.onNotificationRefreshRequired(this.instance);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean onPlayRequested() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            final SettableFuture create = SettableFuture.create();
            this.mainHandler.post(new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.this.m9723x44552b43(create);
                }
            });
            try {
                return ((Boolean) create.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        MediaSession.Listener listener = this.mediaSessionListener;
        if (listener != null) {
            return listener.onPlayRequested(this.instance);
        }
        return true;
    }

    /* renamed from: lambda$onPlayRequested$20$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9723x44552b43(SettableFuture settableFuture) {
        settableFuture.set(Boolean.valueOf(onPlayRequested()));
    }

    void handleMediaControllerPlayRequest(MediaSession.ControllerInfo controllerInfo, boolean z) {
        if (onPlayRequested()) {
            boolean z2 = this.playerWrapper.isCommandAvailable(16) && this.playerWrapper.getCurrentMediaItem() != null;
            boolean z3 = this.playerWrapper.isCommandAvailable(31) || this.playerWrapper.isCommandAvailable(20);
            MediaSession.ControllerInfo resolveControllerInfoForCallback = resolveControllerInfoForCallback(controllerInfo);
            Player.Commands build = new Player.Commands.Builder().add(1).build();
            if (z2 || !z3) {
                if (!z2) {
                    Log.w(TAG, "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                Util.handlePlayButtonAction(this.playerWrapper);
                if (z) {
                    onPlayerInteractionFinishedOnHandler(resolveControllerInfoForCallback, build);
                    return;
                }
                return;
            }
            Futures.addCallback((ListenableFuture) Assertions.checkNotNull(this.callback.onPlaybackResumption(this.instance, resolveControllerInfoForCallback), "Callback.onPlaybackResumption must return a non-null future"), new AnonymousClass1(resolveControllerInfoForCallback, z, build), new Executor() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda27
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    MediaSessionImpl.this.postOrRunOnApplicationHandler(runnable);
                }
            });
        }
    }

    /* renamed from: androidx.media3.session.MediaSessionImpl$1, reason: invalid class name */
    class AnonymousClass1 implements FutureCallback<MediaSession.MediaItemsWithStartPosition> {
        final /* synthetic */ boolean val$callOnPlayerInteractionFinished;
        final /* synthetic */ MediaSession.ControllerInfo val$controllerForRequest;
        final /* synthetic */ Player.Commands val$playCommand;

        AnonymousClass1(MediaSession.ControllerInfo controllerInfo, boolean z, Player.Commands commands) {
            this.val$controllerForRequest = controllerInfo;
            this.val$callOnPlayerInteractionFinished = z;
            this.val$playCommand = commands;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onSuccess(final MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
            MediaSessionImpl mediaSessionImpl = MediaSessionImpl.this;
            final MediaSession.ControllerInfo controllerInfo = this.val$controllerForRequest;
            final boolean z = this.val$callOnPlayerInteractionFinished;
            final Player.Commands commands = this.val$playCommand;
            mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.AnonymousClass1.this.m9725lambda$onSuccess$0$androidxmedia3sessionMediaSessionImpl$1(mediaItemsWithStartPosition, z, controllerInfo, commands);
                }
            }).run();
        }

        /* renamed from: lambda$onSuccess$0$androidx-media3-session-MediaSessionImpl$1, reason: not valid java name */
        /* synthetic */ void m9725lambda$onSuccess$0$androidxmedia3sessionMediaSessionImpl$1(MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition, boolean z, MediaSession.ControllerInfo controllerInfo, Player.Commands commands) {
            MediaUtils.setMediaItemsWithStartIndexAndPosition(MediaSessionImpl.this.playerWrapper, mediaItemsWithStartPosition);
            Util.handlePlayButtonAction(MediaSessionImpl.this.playerWrapper);
            if (z) {
                MediaSessionImpl.this.onPlayerInteractionFinishedOnHandler(controllerInfo, commands);
            }
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public void onFailure(Throwable th) {
            if (th instanceof UnsupportedOperationException) {
                Log.w(MediaSessionImpl.TAG, "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
            } else {
                Log.e(MediaSessionImpl.TAG, "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
            }
            Util.handlePlayButtonAction(MediaSessionImpl.this.playerWrapper);
            if (this.val$callOnPlayerInteractionFinished) {
                MediaSessionImpl.this.onPlayerInteractionFinishedOnHandler(this.val$controllerForRequest, this.val$playCommand);
            }
        }
    }

    void triggerPlayerInfoUpdate() {
        this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRemoteControllerTaskToLegacyStub(RemoteControllerTask remoteControllerTask) {
        try {
            remoteControllerTask.run(this.sessionLegacyStub.getControllerLegacyCbForBroadcast(), 0);
        } catch (RemoteException e) {
            Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    private void dispatchOnPeriodicSessionPositionInfoChanged(final SessionPositionInfo sessionPositionInfo) {
        ConnectedControllersManager<IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = connectedControllersManager.getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            final MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (connectedControllersManager.getPlaybackException(controllerInfo) == null) {
                final boolean isPlayerCommandAvailable = connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 16);
                final boolean isPlayerCommandAvailable2 = connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 17);
                dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda26
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                        controllerCb.onPeriodicSessionPositionInfoChanged(i2, SessionPositionInfo.this, isPlayerCommandAvailable, isPlayerCommandAvailable2, controllerInfo.getInterfaceVersion());
                    }
                });
            }
        }
        try {
            this.sessionLegacyStub.getControllerLegacyCbForBroadcast().onPeriodicSessionPositionInfoChanged(0, sessionPositionInfo, true, true, 0);
        } catch (RemoteException e) {
            Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    protected void dispatchRemoteControllerTaskWithoutReturn(RemoteControllerTask remoteControllerTask) {
        ImmutableList<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            dispatchRemoteControllerTaskWithoutReturn(connectedControllers.get(i), remoteControllerTask);
        }
        try {
            remoteControllerTask.run(this.sessionLegacyStub.getControllerLegacyCbForBroadcast(), 0);
        } catch (RemoteException e) {
            Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    protected void dispatchRemoteControllerTaskWithoutReturn(MediaSession.ControllerInfo controllerInfo, RemoteControllerTask remoteControllerTask) {
        int i;
        try {
            SequencedFutureManager sequencedFutureManager = this.sessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                i = sequencedFutureManager.obtainNextSequenceNumber();
            } else if (!isConnected(controllerInfo)) {
                return;
            } else {
                i = 0;
            }
            MediaSession.ControllerCb controllerCb = controllerInfo.getControllerCb();
            if (controllerCb != null) {
                remoteControllerTask.run(controllerCb, i);
            }
        } catch (DeadObjectException unused) {
            onDeadObjectException(controllerInfo);
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo, e);
        }
    }

    private ListenableFuture<SessionResult> dispatchRemoteControllerTask(MediaSession.ControllerInfo controllerInfo, RemoteControllerTask remoteControllerTask) {
        int i;
        ListenableFuture<SessionResult> listenableFuture;
        try {
            SequencedFutureManager sequencedFutureManager = this.sessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                SequencedFutureManager.SequencedFuture createSequencedFuture = sequencedFutureManager.createSequencedFuture(RESULT_WHEN_CLOSED);
                SequencedFutureManager.SequencedFuture sequencedFuture = createSequencedFuture;
                i = createSequencedFuture.getSequenceNumber();
                listenableFuture = createSequencedFuture;
            } else {
                if (!isConnected(controllerInfo)) {
                    return Futures.immediateFuture(new SessionResult(-100));
                }
                i = 0;
                listenableFuture = Futures.immediateFuture(new SessionResult(0));
            }
            MediaSession.ControllerCb controllerCb = controllerInfo.getControllerCb();
            if (controllerCb != null) {
                remoteControllerTask.run(controllerCb, i);
            }
            return listenableFuture;
        } catch (DeadObjectException unused) {
            onDeadObjectException(controllerInfo);
            return Futures.immediateFuture(new SessionResult(-100));
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo, e);
            return Futures.immediateFuture(new SessionResult(-1));
        }
    }

    private void onDeadObjectException(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.getConnectedControllersManager().removeController(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyApplicationThread() {
        if (Looper.myLooper() != this.applicationHandler.getLooper()) {
            throw new IllegalStateException(WRONG_THREAD_ERROR_MESSAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPeriodicSessionPositionInfoChangesOnHandler() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            SessionPositionInfo createSessionPositionInfo = this.playerWrapper.createSessionPositionInfo();
            if (!this.onPlayerInfoChangedHandler.hasPendingPlayerInfoChangedUpdate() && MediaUtils.areSessionPositionInfosInSamePeriodOrAd(createSessionPositionInfo, this.playerInfo.sessionPositionInfo)) {
                dispatchOnPeriodicSessionPositionInfoChanged(createSessionPositionInfo);
            }
            schedulePeriodicSessionPositionInfoChanges();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedulePeriodicSessionPositionInfoChanges() {
        this.applicationHandler.removeCallbacks(this.periodicSessionPositionInfoUpdateRunnable);
        if (!this.isPeriodicPositionUpdateEnabled || this.sessionPositionUpdateDelayMs <= 0) {
            return;
        }
        if (this.playerWrapper.isPlaying() || this.playerWrapper.isLoading()) {
            this.applicationHandler.postDelayed(this.periodicSessionPositionInfoUpdateRunnable, this.sessionPositionUpdateDelayMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAvailablePlayerCommandsChanged(final Player.Commands commands) {
        this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, false);
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda35
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.onAvailableCommandsChangedFromPlayer(i, Player.Commands.this);
            }
        });
        dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda36
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                MediaSessionImpl.this.m9721x512b9ea9(controllerCb, i);
            }
        });
    }

    /* renamed from: lambda$handleAvailablePlayerCommandsChanged$23$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9721x512b9ea9(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
        controllerCb.onDeviceInfoChanged(i, this.playerInfo.deviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean onMediaButtonEvent(MediaSession.ControllerInfo controllerInfo, Intent intent) {
        boolean z;
        KeyEvent keyEvent = DefaultActionFactory.getKeyEvent(intent);
        ComponentName component = intent.getComponent();
        if (!Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || ((component != null && !Objects.equals(component.getPackageName(), this.context.getPackageName())) || keyEvent == null || keyEvent.getAction() != 0)) {
            return false;
        }
        verifyApplicationThread();
        if (this.callback.onMediaButtonEvent(this.instance, controllerInfo, intent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean hasSystemFeature = this.context.getPackageManager().hasSystemFeature("android.software.leanback");
        if (keyCode == 79 || keyCode == 85) {
            if (hasSystemFeature || controllerInfo.getControllerVersion() != 0 || keyEvent.getRepeatCount() != 0) {
                this.mediaPlayPauseKeyHandler.flush();
            } else {
                if (this.mediaPlayPauseKeyHandler.hasPendingPlayPauseTask()) {
                    this.mediaPlayPauseKeyHandler.clearPendingPlayPauseTask();
                    z = true;
                    if (!isMediaNotificationControllerConnected()) {
                        return applyMediaButtonKeyEvent(keyEvent, z, intent.getBooleanExtra(MediaNotification.NOTIFICATION_DISMISSED_EVENT_KEY, false));
                    }
                    if ((keyCode == 85 || keyCode == 79) && z) {
                        this.sessionLegacyStub.onSkipToNext();
                        return true;
                    }
                    if (controllerInfo.getControllerVersion() == 0) {
                        return false;
                    }
                    this.sessionLegacyStub.getSessionCompat().getController().dispatchMediaButtonEvent(keyEvent);
                    return true;
                }
                this.mediaPlayPauseKeyHandler.setPendingPlayPauseTask(controllerInfo, keyEvent);
                return true;
            }
        } else {
            this.mediaPlayPauseKeyHandler.flush();
        }
        z = false;
        if (!isMediaNotificationControllerConnected()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean applyMediaButtonKeyEvent(KeyEvent keyEvent, boolean z, final boolean z2) {
        final Runnable runnable;
        final MediaSession.ControllerInfo controllerInfo = (MediaSession.ControllerInfo) Assertions.checkNotNull(this.instance.getMediaNotificationControllerInfo());
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.this.m9712xad54589f(controllerInfo);
                }
            };
        } else if (keyCode == 127) {
            runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.this.m9713xb4b98dbe(controllerInfo);
                }
            };
        } else {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (getPlayerWrapper().getPlayWhenReady()) {
                                runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda10
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaSessionImpl.this.m9710x9e89ee61(controllerInfo);
                                    }
                                };
                                break;
                            } else {
                                runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda12
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaSessionImpl.this.m9711xa5ef2380(controllerInfo);
                                    }
                                };
                                break;
                            }
                        case 86:
                            runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda19
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionImpl.this.m9718x7500f2e4(controllerInfo);
                                }
                            };
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda18
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionImpl.this.m9717x6d9bbdc5(controllerInfo);
                                }
                            };
                            break;
                        case 90:
                            runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda17
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionImpl.this.m9716x663688a6(controllerInfo);
                                }
                            };
                            break;
                        default:
                            return false;
                    }
                }
                runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSessionImpl.this.m9715xc383f7fc(controllerInfo);
                    }
                };
            }
            runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.this.m9714xbc1ec2dd(controllerInfo);
                }
            };
        }
        Util.postOrRun(getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.m9719x7c662803(z2, controllerInfo, runnable);
            }
        });
        return true;
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$24$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9710x9e89ee61(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.pauseForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$25$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9711xa5ef2380(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.playForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$26$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9712xad54589f(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.playForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$27$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9713xb4b98dbe(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.pauseForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$28$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9714xbc1ec2dd(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekToNextForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$29$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9715xc383f7fc(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekToPreviousForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$30$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9716x663688a6(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekForwardForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$31$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9717x6d9bbdc5(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekBackForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$32$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9718x7500f2e4(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.stopForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* renamed from: lambda$applyMediaButtonKeyEvent$33$androidx-media3-session-MediaSessionImpl, reason: not valid java name */
    /* synthetic */ void m9719x7c662803(boolean z, MediaSession.ControllerInfo controllerInfo, Runnable runnable) {
        if (z) {
            sendCustomCommand(controllerInfo, new SessionCommand(MediaNotification.NOTIFICATION_DISMISSED_EVENT_KEY, Bundle.EMPTY), Bundle.EMPTY);
        }
        runnable.run();
        this.sessionStub.getConnectedControllersManager().flushCommandQueue(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        Util.postOrRun(getApplicationHandler(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PlayerListener implements Player.Listener {
        private final WeakReference<PlayerWrapper> player;
        private final WeakReference<MediaSessionImpl> session;

        public PlayerListener(MediaSessionImpl mediaSessionImpl, PlayerWrapper playerWrapper) {
            this.session = new WeakReference<>(mediaSessionImpl);
            this.player = new WeakReference<>(playerWrapper);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(final PlaybackException playbackException) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayerError(playbackException);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda20
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onPlayerError(i, PlaybackException.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaItemTransition(final MediaItem mediaItem, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMediaItemTransitionReason(i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda16
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onMediaItemTransition(i2, MediaItem.this, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(final boolean z, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayWhenReady(z, i, session.playerInfo.playbackSuppressionReason);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda21
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onPlayWhenReadyChanged(i2, z, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackSuppressionReasonChanged(final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayWhenReady(session.playerInfo.playWhenReady, session.playerInfo.playWhenReadyChangeReason, i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda23
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onPlaybackSuppressionReasonChanged(i2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            final PlayerWrapper playerWrapper = this.player.get();
            if (playerWrapper == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlaybackState(i, playerWrapper.getPlayerError());
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda6
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onPlaybackStateChanged(i2, i, playerWrapper.getPlayerError());
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(final boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithIsPlaying(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda11
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onIsPlayingChanged(i, z);
                }
            });
            session.schedulePeriodicSessionPositionInfoChanges();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsLoadingChanged(final boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithIsLoading(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda2
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onIsLoadingChanged(i, z);
                }
            });
            session.schedulePeriodicSessionPositionInfoChanges();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPositionInfos(positionInfo, positionInfo2, i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda19
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onPositionDiscontinuity(i2, Player.PositionInfo.this, positionInfo2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlaybackParameters(playbackParameters);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda10
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onPlaybackParametersChanged(i, PlaybackParameters.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekBackIncrementChanged(final long j) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithSeekBackIncrement(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda18
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onSeekBackIncrementChanged(i, j);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekForwardIncrementChanged(final long j) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithSeekForwardIncrement(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda14
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onSeekForwardIncrementChanged(i, j);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(final Timeline timeline, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            PlayerWrapper playerWrapper = this.player.get();
            if (playerWrapper == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithTimelineAndSessionPositionInfo(timeline, playerWrapper.createSessionPositionInfo(), i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda7
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onTimelineChanged(i2, Timeline.this, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaylistMetadataChanged(final MediaMetadata mediaMetadata) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithPlaylistMetadata(mediaMetadata);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda0
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onPlaylistMetadataChanged(i, MediaMetadata.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRepeatModeChanged(final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithRepeatMode(i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda12
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onRepeatModeChanged(i2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onShuffleModeEnabledChanged(final boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithShuffleModeEnabled(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onShuffleModeEnabledChanged(i, z);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAudioAttributesChanged(final AudioAttributes audioAttributes) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithAudioAttributes(audioAttributes);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda8
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onAudioAttributesChanged(i, AudioAttributes.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVideoSizeChanged(final VideoSize videoSize) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithVideoSize(videoSize);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda22
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onVideoSizeChanged(i, VideoSize.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVolumeChanged(final float f) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithVolume(f);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda9
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onVolumeChanged(i, f);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(CueGroup cueGroup) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = new PlayerInfo.Builder(session.playerInfo).setCues(cueGroup).build();
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceInfoChanged(final DeviceInfo deviceInfo) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithDeviceInfo(deviceInfo);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda4
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onDeviceInfoChanged(i, DeviceInfo.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceVolumeChanged(final int i, final boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithDeviceVolume(i, z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda17
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onDeviceVolumeChanged(i2, i, z);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAvailableCommandsChanged(Player.Commands commands) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.handleAvailablePlayerCommandsChanged(commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(final Tracks tracks) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithCurrentTracks(tracks);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, false);
            session.dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda5
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onTracksChanged(i, Tracks.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTrackSelectionParametersChanged(final TrackSelectionParameters trackSelectionParameters) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithTrackSelectionParameters(trackSelectionParameters);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda1
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onTrackSelectionParametersChanged(i, TrackSelectionParameters.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaMetadataChanged(final MediaMetadata mediaMetadata) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMediaMetadata(mediaMetadata);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda13
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onMediaMetadataChanged(i, MediaMetadata.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            ConnectedControllersManager<IBinder> connectedControllersManager = session.sessionStub.getConnectedControllersManager();
            ImmutableList<MediaSession.ControllerInfo> connectedControllers = connectedControllersManager.getConnectedControllers();
            for (int i = 0; i < connectedControllers.size(); i++) {
                MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
                if (connectedControllersManager.getPlaybackException(controllerInfo) == null) {
                    session.dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.MediaSessionImpl$PlayerListener$$ExternalSyntheticLambda15
                        @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                        public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                            controllerCb.onRenderedFirstFrame(i2);
                        }
                    });
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long j) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMaxSeekToPreviousPositionMs(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
        }

        private MediaSessionImpl getSession() {
            return this.session.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class MediaPlayPauseKeyHandler extends Handler {
        private Runnable playPauseTask;

        public MediaPlayPauseKeyHandler(Looper looper) {
            super(looper);
        }

        public void setPendingPlayPauseTask(final MediaSession.ControllerInfo controllerInfo, final KeyEvent keyEvent) {
            Runnable runnable = new Runnable() { // from class: androidx.media3.session.MediaSessionImpl$MediaPlayPauseKeyHandler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.MediaPlayPauseKeyHandler.this.m9726xa939a527(controllerInfo, keyEvent);
                }
            };
            this.playPauseTask = runnable;
            postDelayed(runnable, ViewConfiguration.getDoubleTapTimeout());
        }

        /* renamed from: lambda$setPendingPlayPauseTask$0$androidx-media3-session-MediaSessionImpl$MediaPlayPauseKeyHandler, reason: not valid java name */
        /* synthetic */ void m9726xa939a527(MediaSession.ControllerInfo controllerInfo, KeyEvent keyEvent) {
            if (MediaSessionImpl.this.isMediaNotificationController(controllerInfo)) {
                MediaSessionImpl.this.applyMediaButtonKeyEvent(keyEvent, false, false);
            } else {
                MediaSessionImpl.this.sessionLegacyStub.handleMediaPlayPauseOnHandler((MediaSessionManager.RemoteUserInfo) Assertions.checkNotNull(controllerInfo.getRemoteUserInfo()));
            }
            this.playPauseTask = null;
        }

        public Runnable clearPendingPlayPauseTask() {
            Runnable runnable = this.playPauseTask;
            if (runnable == null) {
                return null;
            }
            removeCallbacks(runnable);
            Runnable runnable2 = this.playPauseTask;
            this.playPauseTask = null;
            return runnable2;
        }

        public boolean hasPendingPlayPauseTask() {
            return this.playPauseTask != null;
        }

        public void flush() {
            Runnable clearPendingPlayPauseTask = clearPendingPlayPauseTask();
            if (clearPendingPlayPauseTask != null) {
                Util.postOrRun(this, clearPendingPlayPauseTask);
            }
        }
    }

    private class PlayerInfoChangedHandler extends Handler {
        private static final int MSG_PLAYER_INFO_CHANGED = 1;
        private boolean excludeTimeline;
        private boolean excludeTracks;

        public PlayerInfoChangedHandler(Looper looper) {
            super(looper);
            this.excludeTimeline = true;
            this.excludeTracks = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                MediaSessionImpl mediaSessionImpl = MediaSessionImpl.this;
                mediaSessionImpl.playerInfo = mediaSessionImpl.playerInfo.copyWithTimelineAndSessionPositionInfo(MediaSessionImpl.this.getPlayerWrapper().getCurrentTimelineWithCommandCheck(), MediaSessionImpl.this.getPlayerWrapper().createSessionPositionInfo(), MediaSessionImpl.this.playerInfo.timelineChangeReason);
                MediaSessionImpl mediaSessionImpl2 = MediaSessionImpl.this;
                mediaSessionImpl2.dispatchOnPlayerInfoChanged(mediaSessionImpl2.playerInfo, this.excludeTimeline, this.excludeTracks);
                this.excludeTimeline = true;
                this.excludeTracks = true;
                return;
            }
            throw new IllegalStateException("Invalid message what=" + message.what);
        }

        public boolean hasPendingPlayerInfoChangedUpdate() {
            return hasMessages(1);
        }

        public void sendPlayerInfoChangedMessage(boolean z, boolean z2) {
            boolean z3 = false;
            this.excludeTimeline = this.excludeTimeline && z;
            if (this.excludeTracks && z2) {
                z3 = true;
            }
            this.excludeTracks = z3;
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessage(1);
        }
    }
}
