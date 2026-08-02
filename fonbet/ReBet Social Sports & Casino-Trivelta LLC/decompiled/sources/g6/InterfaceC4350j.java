package g6;

import T7.C1665e;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4350j {

    /* renamed from: g6.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f47089a;

        /* renamed from: b, reason: collision with root package name */
        public final int f47090b;

        /* renamed from: c, reason: collision with root package name */
        public final Intent f47091c;

        public a(int i10, int i11, Intent intent) {
            this.f47089a = i10;
            this.f47090b = i11;
            this.f47091c = intent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47089a == aVar.f47089a && this.f47090b == aVar.f47090b && Intrinsics.areEqual(this.f47091c, aVar.f47091c);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f47089a) * 31) + Integer.hashCode(this.f47090b)) * 31;
            Intent intent = this.f47091c;
            return hashCode + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.f47089a + ", resultCode=" + this.f47090b + ", data=" + this.f47091c + ')';
        }
    }

    /* renamed from: g6.j$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f47092a = new b();

        public static final InterfaceC4350j a() {
            return new C1665e();
        }
    }

    boolean a(int i10, int i11, Intent intent);
}
