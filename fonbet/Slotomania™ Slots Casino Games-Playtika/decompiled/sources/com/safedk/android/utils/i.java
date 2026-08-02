package com.safedk.android.utils;

import android.util.Base64;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes6.dex */
public class i {
    private static final String a = "SerializingUtils";

    public static String a(Object obj) {
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        String str = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            synchronized (obj) {
                                objectOutputStream.writeObject(obj);
                            }
                            objectOutputStream.flush();
                            str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            n.a((Closeable) objectOutputStream);
                        } catch (IOException e) {
                            e = e;
                            Logger.d(a, "failed during serialization object: ", obj, " : ", e.getMessage(), e);
                            n.a((Closeable) objectOutputStream);
                            n.a((Closeable) byteArrayOutputStream);
                            return str;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        objectOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        closeable = null;
                        n.a(closeable);
                        n.a((Closeable) byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger.d(a, "failed during serializing object : ", th2.getMessage(), " for object : ", obj, th2);
                    new CrashReporter().caughtException(th2);
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                byteArrayOutputStream = null;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                closeable = null;
            }
            n.a((Closeable) byteArrayOutputStream);
            return str;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static Object a(String str) throws ClassNotFoundException, IOException {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
            }
        } catch (Throwable th3) {
            byteArrayInputStream = null;
            th = th3;
            objectInputStream = null;
        }
        try {
            Object readObject = objectInputStream.readObject();
            n.a((Closeable) objectInputStream);
            n.a((Closeable) byteArrayInputStream);
            return readObject;
        } catch (Throwable th4) {
            th = th4;
            n.a((Closeable) objectInputStream);
            n.a((Closeable) byteArrayInputStream);
            throw th;
        }
    }
}
