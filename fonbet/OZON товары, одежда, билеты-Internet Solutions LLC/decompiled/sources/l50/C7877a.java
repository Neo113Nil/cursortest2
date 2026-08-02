package l50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: l50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7877a {

    /* renamed from: a, reason: collision with root package name */
    private final String f72851a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f72852b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final H40.a f72853c;

    public C7877a(String str, Boolean bool, @NotNull H40.a cbottomUIState) {
        Intrinsics.checkNotNullParameter(cbottomUIState, "cbottomUIState");
        this.f72851a = str;
        this.f72852b = bool;
        this.f72853c = cbottomUIState;
    }

    @NotNull
    public final H40.a a() {
        return this.f72853c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7877a)) {
            return false;
        }
        C7877a c7877a = (C7877a) obj;
        return Intrinsics.d(this.f72851a, c7877a.f72851a) && Intrinsics.d(this.f72852b, c7877a.f72852b) && Intrinsics.d(this.f72853c, c7877a.f72853c);
    }

    public final int hashCode() {
        String str = this.f72851a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f72852b;
        return this.f72853c.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ScreenUI(id=" + this.f72851a + ", canClose=" + this.f72852b + ", cbottomUIState=" + this.f72853c + ")";
    }
}
