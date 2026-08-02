package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class Clock {

    public final /* synthetic */ class VivifiedWrapper extends Clock {
        public final /* synthetic */ java.time.Clock wrappedValue;

        private /* synthetic */ VivifiedWrapper(java.time.Clock clock) {
            this.wrappedValue = clock;
        }

        public static /* synthetic */ Clock convert(java.time.Clock clock) {
            if (clock == null) {
                return null;
            }
            return new VivifiedWrapper(clock);
        }

        @Override // j$.time.Clock
        public /* synthetic */ boolean equals(Object obj) {
            java.time.Clock clock = this.wrappedValue;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).wrappedValue;
            }
            return clock.equals(obj);
        }

        @Override // j$.time.Clock
        public /* synthetic */ ZoneId getZone() {
            return TimeConversions.convert(this.wrappedValue.getZone());
        }

        @Override // j$.time.Clock
        public /* synthetic */ int hashCode() {
            return this.wrappedValue.hashCode();
        }

        @Override // j$.time.Clock
        public /* synthetic */ Instant instant() {
            return TimeConversions.convert(this.wrappedValue.instant());
        }

        @Override // j$.time.Clock
        public /* synthetic */ long millis() {
            return this.wrappedValue.millis();
        }
    }

    public abstract ZoneId getZone();

    public abstract Instant instant();

    public static Clock systemUTC() {
        return SystemClock.UTC;
    }

    public static Clock systemDefaultZone() {
        return new SystemClock(ZoneId.systemDefault());
    }

    protected Clock() {
    }

    public long millis() {
        return instant().toEpochMilli();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    static final class SystemClock extends Clock implements Serializable {
        private static final long OFFSET_SEED = (System.currentTimeMillis() / 1000) - 1024;
        static final SystemClock UTC = new SystemClock(ZoneOffset.UTC);
        private static final long serialVersionUID = 6740630888130243051L;
        private final ZoneId zone;

        SystemClock(ZoneId zoneId) {
            this.zone = zoneId;
        }

        @Override // j$.time.Clock
        public ZoneId getZone() {
            return this.zone;
        }

        @Override // j$.time.Clock
        public long millis() {
            return System.currentTimeMillis();
        }

        @Override // j$.time.Clock
        public Instant instant() {
            return Instant.ofEpochMilli(millis());
        }

        @Override // j$.time.Clock
        public boolean equals(Object obj) {
            if (obj instanceof SystemClock) {
                return this.zone.equals(((SystemClock) obj).zone);
            }
            return false;
        }

        @Override // j$.time.Clock
        public int hashCode() {
            return this.zone.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.zone + "]";
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
        }
    }
}
