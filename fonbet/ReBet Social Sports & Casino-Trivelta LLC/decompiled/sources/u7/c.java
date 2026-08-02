package u7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f66211c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final c f66212d = new c("UNKNOWN", null);

    /* renamed from: a, reason: collision with root package name */
    public final String f66213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66214b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public interface b {
        c a(byte[] bArr, int i10);

        int b();
    }

    public c(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f66213a = name;
        this.f66214b = str;
    }

    public final String a() {
        return this.f66213a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f66213a, cVar.f66213a) && Intrinsics.areEqual(this.f66214b, cVar.f66214b);
    }

    public int hashCode() {
        int hashCode = this.f66213a.hashCode() * 31;
        String str = this.f66214b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f66213a;
    }
}
