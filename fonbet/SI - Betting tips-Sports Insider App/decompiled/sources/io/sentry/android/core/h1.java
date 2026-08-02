package io.sentry.android.core;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f15622a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f15623b;

    public h1(Integer num, Boolean bool) {
        this.f15622a = num;
        this.f15623b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return y4.a.s(this.f15622a, h1Var.f15622a) && y4.a.s(this.f15623b, h1Var.f15623b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15622a, this.f15623b});
    }
}
