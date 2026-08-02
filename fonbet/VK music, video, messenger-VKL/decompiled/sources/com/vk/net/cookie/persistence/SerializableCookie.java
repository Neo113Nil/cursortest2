package com.vk.net.cookie.persistence;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import xsna.brm0;
import xsna.usj;

/* compiled from: SerializableCookie.kt */
/* loaded from: classes3.dex */
public final class SerializableCookie implements Serializable {
    private static final long serialVersionUID = -8594045714036645534L;
    public transient usj b;

    public SerializableCookie() {
        this(null);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        usj.a aVar = new usj.a();
        aVar.d((String) objectInputStream.readObject());
        aVar.e((String) objectInputStream.readObject());
        long readLong = objectInputStream.readLong();
        if (readLong != -1) {
            if (readLong <= 0) {
                readLong = Long.MIN_VALUE;
            }
            if (readLong > 253402300799999L) {
                readLong = 253402300799999L;
            }
            aVar.c = readLong;
            aVar.h = true;
        }
        String str = (String) objectInputStream.readObject();
        aVar.c(str, false);
        String str2 = (String) objectInputStream.readObject();
        if (!brm0.B(str2, DomExceptionUtils.SEPARATOR, false)) {
            throw new IllegalArgumentException("path must start with '/'");
        }
        aVar.e = str2;
        if (objectInputStream.readBoolean()) {
            aVar.f = true;
        }
        if (objectInputStream.readBoolean()) {
            aVar.g = true;
        }
        if (objectInputStream.readBoolean()) {
            aVar.c(str, true);
        }
        this.b = aVar.a();
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.b.a);
        objectOutputStream.writeObject(this.b.b);
        usj usjVar = this.b;
        objectOutputStream.writeLong(usjVar.h ? usjVar.c : -1L);
        objectOutputStream.writeObject(this.b.d);
        objectOutputStream.writeObject(this.b.e);
        objectOutputStream.writeBoolean(this.b.f);
        objectOutputStream.writeBoolean(this.b.g);
        objectOutputStream.writeBoolean(this.b.i);
    }

    public final usj d() {
        return this.b;
    }

    public SerializableCookie(usj usjVar) {
        this.b = usjVar;
    }
}
