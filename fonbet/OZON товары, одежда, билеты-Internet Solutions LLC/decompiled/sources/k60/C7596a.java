package k60;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: k60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7596a {

    /* renamed from: a, reason: collision with root package name */
    private final int f70932a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f70933b;

    public C7596a(int i11, Intent intent) {
        this.f70932a = i11;
        this.f70933b = intent;
    }

    public final Intent a() {
        return this.f70933b;
    }

    public final int b() {
        return this.f70932a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7596a)) {
            return false;
        }
        C7596a c7596a = (C7596a) obj;
        return this.f70932a == c7596a.f70932a && Intrinsics.d(this.f70933b, c7596a.f70933b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f70932a) * 31;
        Intent intent = this.f70933b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    @NotNull
    public final String toString() {
        return "AddCardActivityResult(resultCode=" + this.f70932a + ", data=" + this.f70933b + ")";
    }
}
