package ru.ozon.id.amf;

import Vb0.b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/id/amf/Amf;", "", "<init>", "()V", "", "getValueNative", "()[B", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Amf {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f97147a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f97148b = new AtomicBoolean(false);

    private final native byte[] getValueNative();

    public final byte[] a() {
        if (this.f97147a) {
            return getValueNative();
        }
        if (this.f97148b.getAndSet(true)) {
            return null;
        }
        try {
            System.loadLibrary("ozon-id-sdk");
            this.f97147a = true;
        } catch (Throwable th2) {
            b.a.c(b.f28514a, th2);
        }
        if (this.f97147a) {
            return getValueNative();
        }
        return null;
    }
}
