package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.Time;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class TransportThreadAlert implements Serializable {
    private Closed closed;
    private ClosedUntil closedUntil;
    private LastTrip lastTrip;
    private String text;

    public TransportThreadAlert(@NonNull String str, Closed closed, ClosedUntil closedUntil, LastTrip lastTrip) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        this.text = str;
        this.closed = closed;
        this.closedUntil = closedUntil;
        this.lastTrip = lastTrip;
    }

    public Closed getClosed() {
        return this.closed;
    }

    public ClosedUntil getClosedUntil() {
        return this.closedUntil;
    }

    public LastTrip getLastTrip() {
        return this.lastTrip;
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.text = archive.add(this.text, false);
        this.closed = (Closed) archive.add((Archive) this.closed, true, (Class<Archive>) Closed.class);
        this.closedUntil = (ClosedUntil) archive.add((Archive) this.closedUntil, true, (Class<Archive>) ClosedUntil.class);
        this.lastTrip = (LastTrip) archive.add((Archive) this.lastTrip, true, (Class<Archive>) LastTrip.class);
    }

    public static class Closed implements Serializable {
        private boolean dummy;

        public Closed(boolean z11) {
            this.dummy = z11;
        }

        public boolean getDummy() {
            return this.dummy;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.dummy = archive.add(this.dummy);
        }

        public Closed() {
        }
    }

    public static class ClosedUntil implements Serializable {
        private Time time;

        public ClosedUntil(@NonNull Time time) {
            if (time == null) {
                throw new IllegalArgumentException("Required field \"time\" cannot be null");
            }
            this.time = time;
        }

        @NonNull
        public Time getTime() {
            return this.time;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.time = (Time) archive.add((Archive) this.time, false, (Class<Archive>) Time.class);
        }

        public ClosedUntil() {
        }
    }

    public static class LastTrip implements Serializable {
        private Time time;

        public LastTrip(@NonNull Time time) {
            if (time == null) {
                throw new IllegalArgumentException("Required field \"time\" cannot be null");
            }
            this.time = time;
        }

        @NonNull
        public Time getTime() {
            return this.time;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.time = (Time) archive.add((Archive) this.time, false, (Class<Archive>) Time.class);
        }

        public LastTrip() {
        }
    }

    public TransportThreadAlert() {
    }
}
