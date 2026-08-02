package com.vk.mediapicker.impl.presentation.mvi;

import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pk50;
import xsna.vu5;

/* compiled from: MediaPickerMviEvent.kt */
/* loaded from: classes3.dex */
public interface f extends pk50 {

    /* compiled from: MediaPickerMviEvent.kt */
    public static final class a implements f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -205400136;
        }

        public final String toString() {
            return "ChangeSelectedPermission";
        }
    }

    /* compiled from: MediaPickerMviEvent.kt */
    public static final class b implements f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1174158024;
        }

        public final String toString() {
            return "ClosePicker";
        }
    }

    /* compiled from: MediaPickerMviEvent.kt */
    public static final class c implements f {
        public final List<MediaStoreEntry> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends MediaStoreEntry> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("FinishSelection(medias="), this.a);
        }
    }

    /* compiled from: MediaPickerMviEvent.kt */
    public static final class d implements f {
        public final MediaPickerConfiguration.MediaType a;

        public d(MediaPickerConfiguration.MediaType mediaType) {
            this.a = mediaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenCamera(mediaType=" + this.a + ')';
        }
    }

    /* compiled from: MediaPickerMviEvent.kt */
    public static final class e implements f {
        public final MediaStoreEntry a;
        public final int b;

        public e(int i, MediaStoreEntry mediaStoreEntry) {
            this.a = mediaStoreEntry;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenViewer(media=");
            sb.append(this.a);
            sb.append(", position=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: MediaPickerMviEvent.kt */
    /* renamed from: com.vk.mediapicker.impl.presentation.mvi.f$f, reason: collision with other inner class name */
    public static final class C1267f implements f {
        public static final C1267f a = new C1267f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1267f);
        }

        public final int hashCode() {
            return 744951392;
        }

        public final String toString() {
            return "RequestPermission";
        }
    }

    /* compiled from: MediaPickerMviEvent.kt */
    public static final class g implements f {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 201863730;
        }

        public final String toString() {
            return "ShowPermissionsDeniedStub";
        }
    }

    /* compiled from: MediaPickerMviEvent.kt */
    public static final class h implements f {
        public final MediaPickerConfiguration.MediaType a;

        public h(MediaPickerConfiguration.MediaType mediaType) {
            this.a = mediaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSelectionLimitError(mediaType=" + this.a + ')';
        }
    }
}
