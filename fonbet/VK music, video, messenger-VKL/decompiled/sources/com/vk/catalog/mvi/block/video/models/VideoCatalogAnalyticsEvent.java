package com.vk.catalog.mvi.block.video.models;

import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.rmk;
import xsna.vu5;
import xsna.zrp;

/* compiled from: VideoCatalogAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public interface VideoCatalogAnalyticsEvent extends rmk {

    /* compiled from: VideoCatalogAnalyticsEvent.kt */
    public static final class VideoCardImageStateDrawn implements VideoCatalogAnalyticsEvent {
        public final String a;
        public final State b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoCatalogAnalyticsEvent.kt */
        public static final class State {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State Cancel;
            public static final State Error;
            public static final State Loading;
            public static final State Success;

            static {
                State state = new State("Loading", 0);
                Loading = state;
                State state2 = new State("Success", 1);
                Success = state2;
                State state3 = new State("Error", 2);
                Error = state3;
                State state4 = new State("Cancel", 3);
                Cancel = state4;
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

        public VideoCardImageStateDrawn(String str, State state) {
            this.a = str;
            this.b = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoCardImageStateDrawn)) {
                return false;
            }
            VideoCardImageStateDrawn videoCardImageStateDrawn = (VideoCardImageStateDrawn) obj;
            return epx.f(this.a, videoCardImageStateDrawn.a) && this.b == videoCardImageStateDrawn.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "VideoCardImageStateDrawn(imageId=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: VideoCatalogAnalyticsEvent.kt */
    public static final class a implements VideoCatalogAnalyticsEvent {
        public final String a;
        public final long b;
        public final long c;

        public a(String str, long j, long j2) {
            this.a = str;
            this.b = j;
            this.c = j2;
        }

        public final long a() {
            return this.c;
        }

        public final long b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            String str = this.a;
            return Long.hashCode(this.c) + bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoCardView(trackCode=");
            sb.append(this.a);
            sb.append(", startViewMs=");
            sb.append(this.b);
            sb.append(", endViewMs=");
            return vu5.a(')', this.c, sb);
        }
    }
}
