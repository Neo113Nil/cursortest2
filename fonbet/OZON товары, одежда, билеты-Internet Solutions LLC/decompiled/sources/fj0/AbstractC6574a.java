package fj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fj0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC6574a implements d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63594a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f63595b;

    public AbstractC6574a(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f63594a = key;
        this.f63595b = z11;
    }

    @Override // fj0.d
    public final Boolean a() {
        return Boolean.valueOf(this.f63595b);
    }

    @Override // fj0.d
    @NotNull
    public final String getKey() {
        return this.f63594a;
    }
}
