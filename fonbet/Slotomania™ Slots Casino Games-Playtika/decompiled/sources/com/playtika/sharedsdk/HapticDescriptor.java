package com.playtika.sharedsdk;

/* loaded from: classes4.dex */
public final class HapticDescriptor {
    public final Event[] events;
    public final int repeat;

    public static final class Event {
        public final boolean continuous;
        public final int durationMs;
        public final float intensity;
        public final float sharpness;
        public final int timeMs;

        public Event(boolean z, int i, int i2, float f, float f2) {
            this.continuous = z;
            this.timeMs = i;
            this.durationMs = i2;
            this.intensity = f;
            this.sharpness = f2;
        }
    }

    public HapticDescriptor(int i, Event[] eventArr) {
        this.repeat = i;
        this.events = eventArr;
    }
}
