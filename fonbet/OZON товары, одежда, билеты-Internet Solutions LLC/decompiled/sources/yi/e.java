package yi;

import B4.V;
import C.o0;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f106673a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f106674b;

        public a(boolean z11, boolean z12) {
            this.f106673a = z11;
            this.f106674b = z12;
        }

        public final boolean a() {
            return this.f106674b;
        }

        public final boolean b() {
            return this.f106673a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f106673a == aVar.f106673a && this.f106674b == aVar.f106674b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106674b) + (Boolean.hashCode(this.f106673a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CameraAvailabilityUpdated(hasFront=");
            sb2.append(this.f106673a);
            sb2.append(", hasBack=");
            return Pk0.a.a(")", sb2, this.f106674b);
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f106675a;

        public b(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f106675a = message;
        }

        @NotNull
        public final String a() {
            return this.f106675a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f106675a, ((b) obj).f106675a);
        }

        public final int hashCode() {
            return this.f106675a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("CameraError(message="), this.f106675a, ")");
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f106676a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f106677b;

        public c(boolean z11, boolean z12) {
            this.f106676a = z11;
            this.f106677b = z12;
        }

        public final boolean a() {
            return this.f106677b;
        }

        public final boolean b() {
            return this.f106676a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f106676a == cVar.f106676a && this.f106677b == cVar.f106677b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106677b) + (Boolean.hashCode(this.f106676a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LensCapabilitiesUpdated(ultraWide=");
            sb2.append(this.f106676a);
            sb2.append(", telephoto=");
            return Pk0.a.a(")", sb2, this.f106677b);
        }
    }

    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        private final float f106678a;

        public d(float f7) {
            this.f106678a = f7;
        }

        public final float a() {
            return this.f106678a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f106678a, ((d) obj).f106678a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f106678a);
        }

        @NotNull
        public final String toString() {
            return V.b(this.f106678a, ")", new StringBuilder("MaxZoomUpdated(maxZoom="));
        }
    }

    /* renamed from: yi.e$e, reason: collision with other inner class name */
    public static final class C2307e implements e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2307e f106679a = new C2307e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2307e);
        }

        public final int hashCode() {
            return -1165454676;
        }

        @NotNull
        public final String toString() {
            return "VideoCanceled";
        }
    }

    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f106680a;

        public f(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f106680a = uri;
        }

        @NotNull
        public final Uri a() {
            return this.f106680a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.d(this.f106680a, ((f) obj).f106680a);
        }

        public final int hashCode() {
            return this.f106680a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "VideoSaved(uri=" + this.f106680a + ")";
        }
    }
}
