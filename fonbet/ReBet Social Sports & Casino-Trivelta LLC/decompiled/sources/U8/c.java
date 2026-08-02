package U8;

import com.giphy.sdk.core.models.Media;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12136a = new a();

        public a() {
            super(null);
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12137a;

        public b(boolean z10) {
            super(null);
            this.f12137a = z10;
        }

        public final boolean a() {
            return this.f12137a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f12137a == ((b) obj).f12137a;
        }

        public int hashCode() {
            boolean z10 = this.f12137a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CaptionsVisibilityChanged(visible=" + this.f12137a + ')';
        }
    }

    /* renamed from: U8.c$c, reason: collision with other inner class name */
    public static final class C0252c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0252c f12138a = new C0252c();

        public C0252c() {
            super(null);
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f12139a = new d();

        public d() {
            super(null);
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Media f12140a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Media media) {
            super(null);
            Intrinsics.checkNotNullParameter(media, "media");
            this.f12140a = media;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f12140a, ((e) obj).f12140a);
        }

        public int hashCode() {
            return this.f12140a.hashCode();
        }

        public String toString() {
            return "MediaChanged(media=" + this.f12140a + ')';
        }
    }

    public static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final f f12141a = new f();

        public f() {
            super(null);
        }
    }

    public static final class g extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final g f12142a = new g();

        public g() {
            super(null);
        }
    }

    public static final class h extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final h f12143a = new h();

        public h() {
            super(null);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public c() {
    }
}
