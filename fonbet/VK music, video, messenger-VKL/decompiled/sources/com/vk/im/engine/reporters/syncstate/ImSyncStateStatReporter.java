package com.vk.im.engine.reporters.syncstate;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* compiled from: ImSyncStateStatReporter.kt */
/* loaded from: classes2.dex */
public interface ImSyncStateStatReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImSyncStateStatReporter.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ABSENT;
        public static final State AVAILABLE;
        public static final State NETWORKING;
        public static final State UPDATING;

        static {
            State state = new State("ABSENT", 0);
            ABSENT = state;
            State state2 = new State("NETWORKING", 1);
            NETWORKING = state2;
            State state3 = new State("UPDATING", 2);
            UPDATING = state3;
            State state4 = new State("AVAILABLE", 3);
            AVAILABLE = state4;
            State[] stateArr = {state, state2, state3, state4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImSyncStateStatReporter.kt */
    public static final class Target {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Target[] $VALUES;
        public static final Target CHANNEL;
        public static final Target CHANNELS_LIST;
        public static final Target DIALOG;
        public static final Target DIALOG_LIST;
        public static final Target UNKNOWN;

        static {
            Target target = new Target(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = target;
            Target target2 = new Target("CHANNEL", 1);
            CHANNEL = target2;
            Target target3 = new Target("DIALOG", 2);
            DIALOG = target3;
            Target target4 = new Target("DIALOG_LIST", 3);
            DIALOG_LIST = target4;
            Target target5 = new Target("CHANNELS_LIST", 4);
            CHANNELS_LIST = target5;
            Target[] targetArr = {target, target2, target3, target4, target5};
            $VALUES = targetArr;
            $ENTRIES = new asp(targetArr);
        }

        public Target() {
            throw null;
        }

        public static Target valueOf(String str) {
            return (Target) Enum.valueOf(Target.class, str);
        }

        public static Target[] values() {
            return (Target[]) $VALUES.clone();
        }
    }

    void a(State state);

    void shutdown();
}
