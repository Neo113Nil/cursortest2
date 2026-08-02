package F8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3590a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3591b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3592c;

    /* renamed from: d, reason: collision with root package name */
    public String f3593d;

    /* renamed from: e, reason: collision with root package name */
    public String f3594e;

    public a(String apikey, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(apikey, "apikey");
        this.f3590a = apikey;
        this.f3591b = z10;
        this.f3592c = z11;
        this.f3593d = "";
        this.f3594e = "";
        H8.a aVar = new H8.a(a());
        this.f3593d = aVar.b();
        String c10 = aVar.c();
        this.f3594e = c10;
        if (!z11 || c10 == null || c10.length() == 0) {
            return;
        }
        I8.a.a(this.f3594e);
    }

    public final String a() {
        if (this.f3591b) {
            return "";
        }
        return this.f3590a + '_';
    }

    public final String b() {
        return this.f3593d;
    }

    public final String c() {
        return this.f3594e;
    }

    public /* synthetic */ a(String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
