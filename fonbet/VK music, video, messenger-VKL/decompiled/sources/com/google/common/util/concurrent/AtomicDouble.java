package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes13.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    public transient AtomicLong b = new AtomicLong(Double.doubleToRawLongBits(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.b = new AtomicLong();
        this.b.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(d());
    }

    public final double d() {
        return Double.longBitsToDouble(this.b.get());
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return d();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) d();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) d();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) d();
    }

    public final String toString() {
        return Double.toString(d());
    }
}
