package defpackage;

import dalvik.system.DelegateLastClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class ye5 {
    public static /* synthetic */ DelegateLastClassLoader a(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* synthetic */ InMemoryDexClassLoader b(ByteBuffer[] byteBufferArr, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBufferArr, classLoader);
    }

    public static /* synthetic */ void c() {
    }
}
