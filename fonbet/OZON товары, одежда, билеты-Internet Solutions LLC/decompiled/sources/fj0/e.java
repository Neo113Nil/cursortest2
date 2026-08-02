package fj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class e implements d<Integer> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63602a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63603b;

    public e(@NotNull String key, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f63602a = key;
        this.f63603b = i11;
    }

    @Override // fj0.d
    public final Integer a() {
        return Integer.valueOf(this.f63603b);
    }

    @Override // fj0.d
    @NotNull
    public final String getKey() {
        return this.f63602a;
    }
}
