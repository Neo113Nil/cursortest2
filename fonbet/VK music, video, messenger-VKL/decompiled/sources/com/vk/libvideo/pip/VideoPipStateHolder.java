package com.vk.libvideo.pip;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.media.player.VideoMode;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import xsna.asp;
import xsna.c63;
import xsna.cvk;
import xsna.e43;
import xsna.h2h0;
import xsna.itg0;
import xsna.msy;
import xsna.scn0;
import xsna.vqf0;
import xsna.yg5;
import xsna.ysg0;
import xsna.zrp;

/* compiled from: VideoPipStateHolder.kt */
/* loaded from: classes3.dex */
public final class VideoPipStateHolder {
    public static final VideoPipStateHolder a = new VideoPipStateHolder();
    public static final Object b = msy.a(LazyThreadSafetyMode.NONE, new vqf0(11));
    public static State c = State.NONE;
    public static WeakReference<yg5> d = new WeakReference<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPipStateHolder.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DESTROYING;
        public static final State DRAWN;
        public static final State NONE;
        public static final State OPENED;
        public static final State SCHEDULED_TO_OPEN;

        static {
            State state = new State("NONE", 0);
            NONE = state;
            State state2 = new State("SCHEDULED_TO_OPEN", 1);
            SCHEDULED_TO_OPEN = state2;
            State state3 = new State("OPENED", 2);
            OPENED = state3;
            State state4 = new State("DRAWN", 3);
            DRAWN = state4;
            State state5 = new State("DESTROYING", 4);
            DESTROYING = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoPipStateHolder.kt */
    public static final class a {
        public static final a a = new a();
    }

    /* compiled from: VideoPipStateHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        itg0.i(6, ysg0.b.a.b0(State.class), null, new h2h0(13), null);
        if (BuildInfo.s()) {
            c63 c63Var = c63.a;
            c63.a(scn0.b);
        }
    }

    public static void a() {
        yg5 yg5Var = d.get();
        if (yg5Var != null) {
            yg5Var.C(true);
        }
        ysg0.b.a(a.a);
    }

    public static void b() {
        if (h()) {
            yg5 yg5Var = d.get();
            if (yg5Var != null) {
                yg5Var.C(true);
            }
            ysg0.b.a(a.a);
        }
    }

    public static yg5 c() {
        return d.get();
    }

    public static boolean d() {
        return c.compareTo(State.SCHEDULED_TO_OPEN) >= 0;
    }

    public static boolean e() {
        return g() && !f();
    }

    public static boolean f() {
        Object failure;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        try {
            failure = Integer.valueOf(((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Integer num = (Integer) (failure instanceof Result.Failure ? null : failure);
        return num == null || num.intValue() != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean g() {
        return ((Boolean) b.getValue()).booleanValue();
    }

    public static boolean h() {
        return c.compareTo(State.OPENED) >= 0;
    }

    public static void i(yg5 yg5Var) {
        if (yg5Var != null) {
            yg5Var.L(VideoMode.PIP);
        }
        if (yg5Var != null) {
            yg5Var.a0(com.vk.libvideo.autoplay.a.a(yg5Var.getConfig(), null, null, null, null, PlayerType.INLINE, null, 491519));
        }
        d = new WeakReference<>(yg5Var);
    }

    public static void j(Context context) {
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + context.getPackageName()));
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            cvk.u(R.string.video_pip_enable_in_settings, false);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }
}
