package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class MediaIntentReceiver extends BroadcastReceiver {

    @NonNull
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";

    @NonNull
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";

    @NonNull
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";

    @NonNull
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";

    @NonNull
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";

    @NonNull
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";

    @NonNull
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";

    @NonNull
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final Logger log = new Logger(TAG, null);

    @Nullable
    private static RemoteMediaClient getRemoteMediaClient(CastSession castSession) {
        if (castSession == null || !castSession.c()) {
            return null;
        }
        return castSession.k();
    }

    private void seek(CastSession castSession, long j) {
        RemoteMediaClient remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(castSession)) == null || remoteMediaClient.m() || remoteMediaClient.q()) {
            return;
        }
        remoteMediaClient.v(remoteMediaClient.d() + j);
    }

    private void togglePlayback(CastSession castSession) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient(castSession);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.x();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        SessionManager b;
        Session d;
        String action = intent.getAction();
        log.a("onReceive action: %s", action);
        if (action == null || (d = (b = CastContext.c(context).b()).d()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(ACTION_REWIND)) {
                    onReceiveActionRewind(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case -945151566:
                if (action.equals(ACTION_SKIP_NEXT)) {
                    onReceiveActionSkipNext(d);
                    return;
                }
                break;
            case -945080078:
                if (action.equals(ACTION_SKIP_PREV)) {
                    onReceiveActionSkipPrev(d);
                    return;
                }
                break;
            case -668151673:
                if (action.equals(ACTION_STOP_CASTING)) {
                    b.b(true);
                    return;
                }
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    b.b(false);
                    return;
                }
                break;
            case 235550565:
                if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                    onReceiveActionTogglePlayback(d);
                    return;
                }
                break;
            case 1362116196:
                if (action.equals(ACTION_FORWARD)) {
                    onReceiveActionForward(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    onReceiveActionMediaButton(d, intent);
                    return;
                }
                break;
        }
        onReceiveOtherAction(context, action, intent);
    }

    public void onReceiveActionForward(@NonNull Session session, long j) {
        if (session instanceof CastSession) {
            seek((CastSession) session, j);
        }
    }

    public void onReceiveActionMediaButton(@NonNull Session session, @NonNull Intent intent) {
        if ((session instanceof CastSession) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            Preconditions.i(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((CastSession) session);
            }
        }
    }

    public void onReceiveActionRewind(@NonNull Session session, long j) {
        if (session instanceof CastSession) {
            seek((CastSession) session, -j);
        }
    }

    public void onReceiveActionSkipNext(@NonNull Session session) {
        RemoteMediaClient remoteMediaClient;
        if (!(session instanceof CastSession) || (remoteMediaClient = getRemoteMediaClient((CastSession) session)) == null || remoteMediaClient.q()) {
            return;
        }
        remoteMediaClient.r();
    }

    public void onReceiveActionSkipPrev(@NonNull Session session) {
        RemoteMediaClient remoteMediaClient;
        if (!(session instanceof CastSession) || (remoteMediaClient = getRemoteMediaClient((CastSession) session)) == null || remoteMediaClient.q()) {
            return;
        }
        remoteMediaClient.s();
    }

    public void onReceiveActionTogglePlayback(@NonNull Session session) {
        if (session instanceof CastSession) {
            togglePlayback((CastSession) session);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(@NonNull String str, @NonNull Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(@Nullable Context context, @NonNull String str, @NonNull Intent intent) {
    }
}
