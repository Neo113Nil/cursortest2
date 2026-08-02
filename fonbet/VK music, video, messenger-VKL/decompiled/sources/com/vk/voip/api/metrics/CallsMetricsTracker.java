package com.vk.voip.api.metrics;

import xsna.asp;
import xsna.zrp;

/* compiled from: CallsMetricsTracker.kt */
/* loaded from: classes11.dex */
public interface CallsMetricsTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallsMetricsTracker.kt */
    /* loaded from: classes7.dex */
    public static final class AnyTimeEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnyTimeEvent[] $VALUES;
        public static final AnyTimeEvent ACTIVE_CALL;

        static {
            AnyTimeEvent anyTimeEvent = new AnyTimeEvent("ACTIVE_CALL", 0);
            ACTIVE_CALL = anyTimeEvent;
            AnyTimeEvent[] anyTimeEventArr = {anyTimeEvent};
            $VALUES = anyTimeEventArr;
            $ENTRIES = new asp(anyTimeEventArr);
        }

        public AnyTimeEvent() {
            throw null;
        }

        public static AnyTimeEvent valueOf(String str) {
            return (AnyTimeEvent) Enum.valueOf(AnyTimeEvent.class, str);
        }

        public static AnyTimeEvent[] values() {
            return (AnyTimeEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallsMetricsTracker.kt */
    /* loaded from: classes7.dex */
    public static final class SingleEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SingleEvent[] $VALUES;
        public static final SingleEvent CALL_WITH_CAMERA;
        public static final SingleEvent GROUP_CALL;
        public static final SingleEvent ONE_TO_ONE_CALL;

        static {
            SingleEvent singleEvent = new SingleEvent("ONE_TO_ONE_CALL", 0);
            ONE_TO_ONE_CALL = singleEvent;
            SingleEvent singleEvent2 = new SingleEvent("GROUP_CALL", 1);
            GROUP_CALL = singleEvent2;
            SingleEvent singleEvent3 = new SingleEvent("CALL_WITH_CAMERA", 2);
            CALL_WITH_CAMERA = singleEvent3;
            SingleEvent[] singleEventArr = {singleEvent, singleEvent2, singleEvent3};
            $VALUES = singleEventArr;
            $ENTRIES = new asp(singleEventArr);
        }

        public SingleEvent() {
            throw null;
        }

        public static SingleEvent valueOf(String str) {
            return (SingleEvent) Enum.valueOf(SingleEvent.class, str);
        }

        public static SingleEvent[] values() {
            return (SingleEvent[]) $VALUES.clone();
        }
    }

    void a(AnyTimeEvent anyTimeEvent);

    void b(AnyTimeEvent anyTimeEvent);

    void c(SingleEvent singleEvent);
}
