package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18856a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f18857b;

    public i(boolean z10) {
        this.f18856a = z10;
    }

    public final boolean a() {
        return this.f18856a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(boolean z10, Configuration newConfig) {
        this(z10);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f18857b = newConfig;
    }
}
