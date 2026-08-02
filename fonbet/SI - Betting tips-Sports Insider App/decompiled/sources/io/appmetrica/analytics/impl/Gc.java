package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.sentry.protocol.DebugImage;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Gc {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f12258c;

    /* renamed from: a, reason: collision with root package name */
    public final String f12259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12260b;

    static {
        SparseArray sparseArray = new SparseArray();
        f12258c = sparseArray;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Gc(DebugImage.JVM, "binder"));
        sparseArray.put(5890, new Gc(DebugImage.JVM, "file"));
        sparseArray.put(5889, new Gc(DebugImage.JVM, "file"));
        sparseArray.put(5897, new Gc("jni_native", "file"));
        sparseArray.put(5898, new Gc("jni_native", "file"));
    }

    public Gc(String str, String str2) {
        this.f12259a = str;
        this.f12260b = str2;
    }
}
