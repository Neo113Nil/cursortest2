package zi;

import B4.V;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface k {

    public static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f109191a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1548834953;
        }

        @NotNull
        public final String toString() {
            return "CancelRecording";
        }
    }

    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f109192a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -906574404;
        }

        @NotNull
        public final String toString() {
            return "ClearResult";
        }
    }

    public static final class c implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f109193a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 933489483;
        }

        @NotNull
        public final String toString() {
            return "CycleZoom";
        }
    }

    public static final class d implements k {

        /* renamed from: a, reason: collision with root package name */
        private final float f109194a;

        public d(float f7) {
            this.f109194a = f7;
        }

        public final float a() {
            return this.f109194a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f109194a, ((d) obj).f109194a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f109194a);
        }

        @NotNull
        public final String toString() {
            return V.b(this.f109194a, ")", new StringBuilder("PinchZoom(zoomDelta="));
        }
    }

    public static final class e implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f109195a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 425460438;
        }

        @NotNull
        public final String toString() {
            return "RequestAudioPermissionIfNeeded";
        }
    }

    public static final class f implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f109196a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1767886609;
        }

        @NotNull
        public final String toString() {
            return "RestoreCameraSession";
        }
    }

    public static final class g implements k {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return Float.compare(0.0f, 0.0f) == 0;
        }

        public final int hashCode() {
            Float.hashCode(0.0f);
            throw null;
        }

        @NotNull
        public final String toString() {
            return "SetZoom(level=0.0, lens=null)";
        }
    }

    public static final class h implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f109197a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1429495427;
        }

        @NotNull
        public final String toString() {
            return "StartRecording";
        }
    }

    public static final class i implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final i f109198a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 716246145;
        }

        @NotNull
        public final String toString() {
            return "StopRecording";
        }
    }

    public static final class j implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final j f109199a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1654342855;
        }

        @NotNull
        public final String toString() {
            return "SwitchCamera";
        }
    }

    /* renamed from: zi.k$k, reason: collision with other inner class name */
    public static final class C2354k implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2354k f109200a = new C2354k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2354k);
        }

        public final int hashCode() {
            return -315526307;
        }

        @NotNull
        public final String toString() {
            return "TakePhoto";
        }
    }

    public static final class l implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final l f109201a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 601817377;
        }

        @NotNull
        public final String toString() {
            return "TakePhotoWithScreenFlash";
        }
    }

    public static final class m implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final m f109202a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1534246279;
        }

        @NotNull
        public final String toString() {
            return "ToggleCaptureMode";
        }
    }

    public static final class n implements k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final n f109203a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 52511214;
        }

        @NotNull
        public final String toString() {
            return "ToggleFlash";
        }
    }
}
