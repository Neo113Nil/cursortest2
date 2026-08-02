package com.vk.libvideo.autoplay.background.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.autoplay.background.controller.a;
import com.vk.libvideo.autoplay.background.controller.h;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.fo8;
import xsna.gzs;
import xsna.s3q0;
import xsna.yg5;

/* compiled from: VideoNotificationActionReceiver.kt */
/* loaded from: classes2.dex */
public final class VideoNotificationActionReceiver extends BroadcastReceiver {
    public static final String f;
    public static final String g;
    public final h.b a;
    public final a.c b;
    public yg5 c;
    public gzs<s3q0> d;
    public gzs<s3q0> e;

    /* compiled from: VideoNotificationActionReceiver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoNotificationAction.values().length];
            try {
                iArr[VideoNotificationAction.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationAction.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationAction.REPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoNotificationAction.SEEK_FORWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoNotificationAction.SEEK_BACKWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoNotificationAction.CLOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoNotificationAction.SEEK_FORWARD_DISABLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoNotificationAction.SEEK_BACKWARD_DISABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String concat = (BuildInfo.q() ? "vkvideo_" : "").concat("VideoNotificationActionReceiver");
        f = fo8.a(concat, ":intent_action");
        g = fo8.a(concat, ":intent_extra_action");
    }

    public VideoNotificationActionReceiver(h.a aVar, a.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final void a(boolean z) {
        yg5 yg5Var = this.c;
        if (yg5Var != null) {
            this.b.b(yg5Var, true, z ? Math.min(yg5Var.getDuration(), yg5Var.getPosition() + 10000) : Math.max(0L, yg5Var.getPosition() - 10000));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (epx.f(intent.getAction(), f)) {
            Bundle extras = intent.getExtras();
            Serializable serializable = extras != null ? extras.getSerializable(g) : null;
            VideoNotificationAction videoNotificationAction = serializable instanceof VideoNotificationAction ? (VideoNotificationAction) serializable : null;
            int i = videoNotificationAction == null ? -1 : a.$EnumSwitchMapping$0[videoNotificationAction.ordinal()];
            a.c cVar = this.b;
            switch (i) {
                case -1:
                    s3q0 s3q0Var = s3q0.a;
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    yg5 yg5Var = this.c;
                    if (yg5Var != null) {
                        yg5Var.f();
                    }
                    yg5 yg5Var2 = this.c;
                    if (yg5Var2 != null) {
                        cVar.a(yg5Var2, SchemeStat$TypeVideoBackgroundListeningItem.EventType.START);
                    }
                    gzs<s3q0> gzsVar = this.d;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                        s3q0 s3q0Var2 = s3q0.a;
                        return;
                    }
                    return;
                case 2:
                    yg5 yg5Var3 = this.c;
                    if (yg5Var3 != null) {
                        yg5Var3.c();
                    }
                    yg5 yg5Var4 = this.c;
                    if (yg5Var4 != null) {
                        cVar.a(yg5Var4, SchemeStat$TypeVideoBackgroundListeningItem.EventType.END);
                    }
                    gzs<s3q0> gzsVar2 = this.d;
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                        s3q0 s3q0Var3 = s3q0.a;
                        return;
                    }
                    return;
                case 3:
                    yg5 yg5Var5 = this.c;
                    if (yg5Var5 != null) {
                        yg5Var5.S(false);
                    }
                    gzs<s3q0> gzsVar3 = this.d;
                    if (gzsVar3 != null) {
                        gzsVar3.invoke();
                        s3q0 s3q0Var4 = s3q0.a;
                        return;
                    }
                    return;
                case 4:
                    yg5 yg5Var6 = this.c;
                    if (yg5Var6 != null) {
                        yg5Var6.A0(true);
                    }
                    a(true);
                    gzs<s3q0> gzsVar4 = this.d;
                    if (gzsVar4 != null) {
                        gzsVar4.invoke();
                        s3q0 s3q0Var5 = s3q0.a;
                        return;
                    }
                    return;
                case 5:
                    yg5 yg5Var7 = this.c;
                    if (yg5Var7 != null) {
                        yg5Var7.A0(false);
                    }
                    a(false);
                    gzs<s3q0> gzsVar5 = this.d;
                    if (gzsVar5 != null) {
                        gzsVar5.invoke();
                        s3q0 s3q0Var6 = s3q0.a;
                        return;
                    }
                    return;
                case 6:
                    yg5 yg5Var8 = this.c;
                    if (yg5Var8 != null) {
                        yg5Var8.c();
                    }
                    yg5 yg5Var9 = this.c;
                    if (yg5Var9 != null) {
                        this.a.a(yg5Var9);
                    }
                    yg5 yg5Var10 = this.c;
                    if (yg5Var10 != null) {
                        cVar.a(yg5Var10, SchemeStat$TypeVideoBackgroundListeningItem.EventType.END);
                    }
                    gzs<s3q0> gzsVar6 = this.e;
                    if (gzsVar6 != null) {
                        gzsVar6.invoke();
                        s3q0 s3q0Var7 = s3q0.a;
                        return;
                    }
                    return;
                case 7:
                    s3q0 s3q0Var8 = s3q0.a;
                    return;
                case 8:
                    s3q0 s3q0Var9 = s3q0.a;
                    return;
            }
        }
    }
}
