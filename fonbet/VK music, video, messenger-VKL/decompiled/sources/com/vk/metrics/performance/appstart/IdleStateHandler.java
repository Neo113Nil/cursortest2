package com.vk.metrics.performance.appstart;

import android.app.Activity;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.asp;
import xsna.c63;
import xsna.vvv;
import xsna.zrp;

/* compiled from: IdleStateHandler.kt */
/* loaded from: classes.dex */
public final class IdleStateHandler {
    public static final IdleStateHandler a = new IdleStateHandler();
    public static final CopyOnWriteArrayList<AppStartListener> b = new CopyOnWriteArrayList<>();
    public static boolean c = true;
    public static boolean d;

    /* compiled from: IdleStateHandler.kt */
    public interface AppStartListener {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: IdleStateHandler.kt */
        public static final class StartType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StartType[] $VALUES;
            public static final StartType COLD;
            public static final StartType WARM;

            static {
                StartType startType = new StartType("COLD", 0);
                COLD = startType;
                StartType startType2 = new StartType("WARM", 1);
                WARM = startType2;
                StartType[] startTypeArr = {startType, startType2};
                $VALUES = startTypeArr;
                $ENTRIES = new asp(startTypeArr);
            }

            public StartType() {
                throw null;
            }

            public static StartType valueOf(String str) {
                return (StartType) Enum.valueOf(StartType.class, str);
            }

            public static StartType[] values() {
                return (StartType[]) $VALUES.clone();
            }
        }

        void a(StartType startType);
    }

    /* compiled from: IdleStateHandler.kt */
    public static final class a extends c63.b {
        @Override // xsna.c63.b
        public final void s() {
            IdleStateHandler.d = true;
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            IdleStateHandler.a.getClass();
            Looper.myQueue().addIdleHandler(new vvv());
        }
    }

    static {
        c63 c63Var = c63.a;
        c63.a(new a());
    }
}
