package f7;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import w6.InterfaceC6713d;

/* renamed from: f7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4263a implements InterfaceC6713d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0674a f46433c = new C0674a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46434a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46435b;

    /* renamed from: f7.a$a, reason: collision with other inner class name */
    public static final class C0674a {
        public /* synthetic */ C0674a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0674a() {
        }
    }

    public C4263a(int i10, boolean z10) {
        this.f46434a = z10;
        this.f46435b = "anim://" + i10;
    }

    @Override // w6.InterfaceC6713d
    public String a() {
        return this.f46435b;
    }

    @Override // w6.InterfaceC6713d
    public boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return StringsKt.startsWith$default(uri2, this.f46435b, false, 2, (Object) null);
    }

    @Override // w6.InterfaceC6713d
    public boolean c() {
        return false;
    }

    @Override // w6.InterfaceC6713d
    public boolean equals(Object obj) {
        if (!this.f46434a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C4263a.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f46435b, ((C4263a) obj).f46435b);
    }

    @Override // w6.InterfaceC6713d
    public int hashCode() {
        return !this.f46434a ? super.hashCode() : this.f46435b.hashCode();
    }
}
