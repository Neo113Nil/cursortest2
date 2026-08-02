package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public final int h() {
            return this.code;
        }
    }

    @NonNull
    HeartBeat a();
}
