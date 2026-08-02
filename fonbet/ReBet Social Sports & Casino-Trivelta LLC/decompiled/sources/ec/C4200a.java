package ec;

import java.security.Key;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ec.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4200a {

    /* renamed from: a, reason: collision with root package name */
    public final String f45901a;

    /* renamed from: b, reason: collision with root package name */
    public final Key f45902b;

    /* renamed from: c, reason: collision with root package name */
    public final b f45903c;

    @NotNull
    private final byte[] password;

    @NotNull
    private final byte[] username;

    public C4200a(String alias, Key key, byte[] password, byte[] username, b operation) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f45901a = alias;
        this.f45902b = key;
        this.password = password;
        this.username = username;
        this.f45903c = operation;
    }

    public final Key a() {
        return this.f45902b;
    }

    public final b b() {
        return this.f45903c;
    }

    public final byte[] c() {
        return this.password;
    }

    public final byte[] d() {
        return this.username;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4200a)) {
            return false;
        }
        C4200a c4200a = (C4200a) obj;
        return Intrinsics.areEqual(this.f45901a, c4200a.f45901a) && Intrinsics.areEqual(this.f45902b, c4200a.f45902b) && Intrinsics.areEqual(this.password, c4200a.password) && Intrinsics.areEqual(this.username, c4200a.username) && this.f45903c == c4200a.f45903c;
    }

    public int hashCode() {
        return (((((((this.f45901a.hashCode() * 31) + this.f45902b.hashCode()) * 31) + Arrays.hashCode(this.password)) * 31) + Arrays.hashCode(this.username)) * 31) + this.f45903c.hashCode();
    }

    public String toString() {
        return "CryptoContext(alias=" + this.f45901a + ", key=" + this.f45902b + ", password=" + Arrays.toString(this.password) + ", username=" + Arrays.toString(this.username) + ", operation=" + this.f45903c + ")";
    }
}
