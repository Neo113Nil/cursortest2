package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18988a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f18989b;

    public w(boolean z10) {
        this.f18988a = z10;
    }

    public final boolean a() {
        return this.f18988a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(boolean z10, Configuration newConfig) {
        this(z10);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f18989b = newConfig;
    }
}
