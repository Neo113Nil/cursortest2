package k5;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: k5.g2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC7518g2<T extends Serializable> extends InterfaceC7500c0<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f70740b = Executors.newSingleThreadExecutor();

    /* renamed from: k5.g2$a */
    public static abstract class a implements Runnable {
    }

    /* renamed from: c */
    a mo68c();

    default void e() {
        f70740b.execute(mo68c());
    }
}
