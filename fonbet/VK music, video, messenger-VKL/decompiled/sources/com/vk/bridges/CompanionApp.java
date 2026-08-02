package com.vk.bridges;

import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.on00;
import xsna.zrp;

/* compiled from: CompanionAppBridge.kt */
/* loaded from: classes.dex */
public interface CompanionApp {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CompanionAppBridge.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State BACKGROUND;
        public static final a Companion;
        public static final State FOREGROUND;
        public static final State UI_DESTROYED;
        public static final State UNDEFINED;
        private static final Map<String, State> byAction;
        private final String action;

        /* compiled from: CompanionAppBridge.kt */
        public static final class a {
        }

        static {
            State state = new State("FOREGROUND", 0, "com.vk.im.ACTION_APP_FOREGROUND");
            FOREGROUND = state;
            State state2 = new State("BACKGROUND", 1, "com.vk.im.ACTION_APP_BACKGROUND");
            BACKGROUND = state2;
            State state3 = new State("UI_DESTROYED", 2, "com.vk.im.ACTION_APP_UI_DESTROYED");
            UI_DESTROYED = state3;
            State state4 = new State("UNDEFINED", 3, StringUtils.UNDEFINED);
            UNDEFINED = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
            Companion = new a();
            State[] values = values();
            int e = on00.e(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
            for (State state5 : values) {
                linkedHashMap.put(state5.action, state5);
            }
            byAction = linkedHashMap;
        }

        public State(String str, int i, String str2) {
            this.action = str2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final String i() {
            return this.action;
        }
    }

    q<State> b();

    boolean c(boolean z);

    void d();

    boolean e();

    boolean f(UserId userId);

    boolean g(UserId userId);

    String getPackageName();

    boolean h(UserId userId);

    boolean i(UserId userId);
}
