package x0;

import java.util.concurrent.CancellationException;
import m0.C8006o;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10601f extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    private final int f104739a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8006o<Float, C8008p> f104740b;

    public C10601f(int i11, @NotNull C8006o<Float, C8008p> c8006o) {
        this.f104739a = i11;
        this.f104740b = c8006o;
    }

    public final int a() {
        return this.f104739a;
    }

    @NotNull
    public final C8006o<Float, C8008p> b() {
        return this.f104740b;
    }
}
