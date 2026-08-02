package androidx.room;

import E2.h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.room.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2267e implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final h.c f23328a;

    /* renamed from: b, reason: collision with root package name */
    public final C2265c f23329b;

    public C2267e(h.c delegate, C2265c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f23328a = delegate;
        this.f23329b = autoCloser;
    }

    @Override // E2.h.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2266d a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C2266d(this.f23328a.a(configuration), this.f23329b);
    }
}
