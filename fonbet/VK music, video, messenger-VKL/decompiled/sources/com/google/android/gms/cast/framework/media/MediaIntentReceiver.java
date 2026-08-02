package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.exc0;
import xsna.g0a;
import xsna.hui0;
import xsna.lvf0;
import xsna.o100;
import xsna.ssi0;
import xsna.uz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
@Keep
/* loaded from: classes12.dex */
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
    private static final o100 log = new o100(TAG, null);

    @Nullable
    private static lvf0 getRemoteMediaClient(g0a g0aVar) {
        if (g0aVar == null || !g0aVar.c()) {
            return null;
        }
        return g0aVar.k();
    }

    private void seek(g0a g0aVar, long j) {
        lvf0 remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(g0aVar)) == null || remoteMediaClient.m() || remoteMediaClient.q()) {
            return;
        }
        remoteMediaClient.w(remoteMediaClient.d() + j);
    }

    private void togglePlayback(g0a g0aVar) {
        lvf0 remoteMediaClient = getRemoteMediaClient(g0aVar);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.x();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        hui0 d;
        ssi0 d2;
        char c;
        String action = intent.getAction();
        log.a("onReceive action: %s", action);
        if (action == null || (d2 = (d = uz9.e(context).d()).d()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(ACTION_REWIND)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -945151566:
                if (action.equals(ACTION_SKIP_NEXT)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -945080078:
                if (action.equals(ACTION_SKIP_PREV)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (action.equals(ACTION_STOP_CASTING)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 235550565:
                if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (action.equals(ACTION_FORWARD)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                onReceiveActionTogglePlayback(d2);
                break;
            case 1:
                onReceiveActionSkipNext(d2);
                break;
            case 2:
                onReceiveActionSkipPrev(d2);
                break;
            case 3:
                onReceiveActionForward(d2, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case 4:
                onReceiveActionRewind(d2, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case 5:
                d.b(true);
                break;
            case 6:
                d.b(false);
                break;
            case 7:
                onReceiveActionMediaButton(d2, intent);
                break;
            default:
                onReceiveOtherAction(context, action, intent);
                break;
        }
    }

    public void onReceiveActionForward(@NonNull ssi0 ssi0Var, long j) {
        if (ssi0Var instanceof g0a) {
            seek((g0a) ssi0Var, j);
        }
    }

    public void onReceiveActionMediaButton(@NonNull ssi0 ssi0Var, @NonNull Intent intent) {
        if ((ssi0Var instanceof g0a) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            exc0.i(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((g0a) ssi0Var);
            }
        }
    }

    public void onReceiveActionRewind(@NonNull ssi0 ssi0Var, long j) {
        if (ssi0Var instanceof g0a) {
            seek((g0a) ssi0Var, -j);
        }
    }

    public void onReceiveActionSkipNext(@NonNull ssi0 ssi0Var) {
        lvf0 remoteMediaClient;
        if (!(ssi0Var instanceof g0a) || (remoteMediaClient = getRemoteMediaClient((g0a) ssi0Var)) == null || remoteMediaClient.q()) {
            return;
        }
        remoteMediaClient.r();
    }

    public void onReceiveActionSkipPrev(@NonNull ssi0 ssi0Var) {
        lvf0 remoteMediaClient;
        if (!(ssi0Var instanceof g0a) || (remoteMediaClient = getRemoteMediaClient((g0a) ssi0Var)) == null || remoteMediaClient.q()) {
            return;
        }
        remoteMediaClient.s();
    }

    public void onReceiveActionTogglePlayback(@NonNull ssi0 ssi0Var) {
        if (ssi0Var instanceof g0a) {
            togglePlayback((g0a) ssi0Var);
        }
    }

    public void onReceiveOtherAction(@Nullable Context context, @NonNull String str, @NonNull Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(@NonNull String str, @NonNull Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
