package androidx.room;

import E2.h;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f23269a;

    /* renamed from: b, reason: collision with root package name */
    public final File f23270b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f23271c;

    /* renamed from: d, reason: collision with root package name */
    public final h.c f23272d;

    public F(String str, File file, Callable callable, h.c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f23269a = str;
        this.f23270b = file;
        this.f23271c = callable;
        this.f23272d = mDelegate;
    }

    @Override // E2.h.c
    public E2.h a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new E(configuration.f2950a, this.f23269a, this.f23270b, this.f23271c, configuration.f2952c.f2948a, this.f23272d.a(configuration));
    }
}
