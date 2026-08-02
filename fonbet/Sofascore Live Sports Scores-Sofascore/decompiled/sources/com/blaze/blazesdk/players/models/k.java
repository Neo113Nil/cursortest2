package com.blaze.blazesdk.players.models;

import com.blaze.blazesdk.analytics.enums.EventExitTrigger;
import com.blaze.blazesdk.analytics.enums.EventStartTrigger;
import com.blaze.blazesdk.players.models.B;
import defpackage.zzl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k {
    public static final EventExitTrigger a(H h) {
        switch (h) {
            case SWIPE:
                return EventExitTrigger.SWIPE;
            case SWIPE_DOWN:
                return EventExitTrigger.SWIPE_DOWN;
            case USER_SWIPE_TO_DISMISS:
                return EventExitTrigger.USER_SWIPE_TO_DISMISS;
            case SKIP:
                return EventExitTrigger.SKIP;
            case USER_SKIP_NEXT:
                return EventExitTrigger.USER_SKIP_NEXT;
            case USER_SKIP_PREVIOUS:
                return EventExitTrigger.USER_SKIP_PREVIOUS;
            case VIDEO_FINISHED:
                return EventExitTrigger.VIDEO_FINISHED;
            case CLOSE_BUTTON:
                return EventExitTrigger.CLOSE_BUTTON;
            case APP_CLOSE:
                return EventExitTrigger.APP_CLOSE;
            case BACK_BUTTON:
                return EventExitTrigger.BACK_BUTTON;
            case STORIES_COMPLETED:
                return EventExitTrigger.STORIES_COMPLETED;
            case ASSETS_EXPIRY:
                return EventExitTrigger.ASSETS_EXPIRY;
            case APP_BACKGROUND:
                return EventExitTrigger.APP_BACKGROUND;
            case INLINE:
                return EventExitTrigger.INLINE;
            case VIEWING_MODE_TRANSITION:
                return EventExitTrigger.VIEWING_MODE_TRANSITION;
            case PIP_DISMISSED:
                return EventExitTrigger.PIP_DISMISSED;
            default:
                zzl.b();
                return null;
        }
    }

    public static final EventStartTrigger b(B.b bVar) {
        bVar.getClass();
        if (!(bVar instanceof B.b.a)) {
            if (Intrinsics.c(bVar, N.b)) {
                return EventStartTrigger.VIEWING_MODE_TRANSITION;
            }
            if (Intrinsics.c(bVar, L.b)) {
                return EventStartTrigger.SKIP;
            }
            if (Intrinsics.c(bVar, J.b)) {
                return EventStartTrigger.APP_FOREGROUND;
            }
            zzl.b();
            return null;
        }
        int ordinal = ((B.b.a) bVar).b.ordinal();
        if (ordinal == 0) {
            return EventStartTrigger.WIDGET;
        }
        if (ordinal == 1) {
            return EventStartTrigger.WIDGET_AUTO_PLAY;
        }
        if (ordinal == 2) {
            return EventStartTrigger.DEEPLINK;
        }
        if (ordinal == 3) {
            return EventStartTrigger.ENTRYPOINT;
        }
        if (ordinal == 4) {
            return EventStartTrigger.NOTIFICATION;
        }
        if (ordinal == 5) {
            return EventStartTrigger.INLINE;
        }
        zzl.b();
        return null;
    }
}
