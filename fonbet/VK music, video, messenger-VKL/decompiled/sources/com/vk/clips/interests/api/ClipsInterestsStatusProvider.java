package com.vk.clips.interests.api;

import io.reactivex.rxjava3.internal.operators.observable.y;
import xsna.asp;
import xsna.zrp;

/* compiled from: ClipsInterestsStatusProvider.kt */
/* loaded from: classes16.dex */
public interface ClipsInterestsStatusProvider {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsInterestsStatusProvider.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status COMPLETED;
        public static final a Companion;
        public static final Status NEED_UPDATE;
        public static final Status SHOWN;

        /* compiled from: ClipsInterestsStatusProvider.kt */
        public static final class a {
        }

        static {
            Status status = new Status("SHOWN", 0);
            SHOWN = status;
            Status status2 = new Status("COMPLETED", 1);
            COMPLETED = status2;
            Status status3 = new Status("NEED_UPDATE", 2);
            NEED_UPDATE = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
            Companion = new a();
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    y a();
}
