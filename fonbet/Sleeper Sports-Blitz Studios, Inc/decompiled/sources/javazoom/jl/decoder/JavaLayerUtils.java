package javazoom.jl.decoder;

import io.sentry.SentryEnvelopeItemHeader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;

/* loaded from: classes9.dex */
public class JavaLayerUtils {
    private static JavaLayerHook hook;

    public static Object deserialize(InputStream inputStream, Class cls) throws IOException {
        if (cls == null) {
            throw new NullPointerException("cls");
        }
        Object deserialize = deserialize(inputStream, cls);
        if (cls.isInstance(deserialize)) {
            return deserialize;
        }
        throw new InvalidObjectException("type of deserialized instance not of required class.");
    }

    public static Object deserialize(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("in");
        }
        try {
            return new ObjectInputStream(inputStream).readObject();
        } catch (ClassNotFoundException e) {
            throw new InvalidClassException(e.toString());
        }
    }

    public static Object deserializeArray(InputStream inputStream, Class cls, int i) throws IOException {
        if (cls == null) {
            throw new NullPointerException("elemType");
        }
        if (i < -1) {
            throw new IllegalArgumentException(SentryEnvelopeItemHeader.JsonKeys.LENGTH);
        }
        Object deserialize = deserialize(inputStream);
        Class<?> cls2 = deserialize.getClass();
        if (!cls2.isArray()) {
            throw new InvalidObjectException("object is not an array");
        }
        if (cls2.getComponentType() != cls) {
            throw new InvalidObjectException("unexpected array component type");
        }
        if (i == -1 || Array.getLength(deserialize) == i) {
            return deserialize;
        }
        throw new InvalidObjectException("array length mismatch");
    }

    public static Object deserializeArrayResource(String str, Class cls, int i) throws IOException {
        InputStream resourceAsStream = getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IOException("unable to load resource '" + str + "'");
        }
        return deserializeArray(resourceAsStream, cls, i);
    }

    public static void serialize(OutputStream outputStream, Object obj) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        if (obj == null) {
            throw new NullPointerException("obj");
        }
        new ObjectOutputStream(outputStream).writeObject(obj);
    }

    public static synchronized void setHook(JavaLayerHook javaLayerHook) {
        synchronized (JavaLayerUtils.class) {
            hook = javaLayerHook;
        }
    }

    public static synchronized JavaLayerHook getHook() {
        JavaLayerHook javaLayerHook;
        synchronized (JavaLayerUtils.class) {
            javaLayerHook = hook;
        }
        return javaLayerHook;
    }

    public static synchronized InputStream getResourceAsStream(String str) {
        InputStream resourceAsStream;
        synchronized (JavaLayerUtils.class) {
            JavaLayerHook javaLayerHook = hook;
            if (javaLayerHook != null) {
                resourceAsStream = javaLayerHook.getResourceAsStream(str);
            } else {
                resourceAsStream = JavaLayerUtils.class.getResourceAsStream(str);
            }
        }
        return resourceAsStream;
    }
}
