package com.vk.clips.entrypoints.feature;

import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.vu5;
import xsna.xl50;

/* compiled from: ClipsEntryPointsPatch.kt */
/* loaded from: classes16.dex */
public interface c extends xl50 {

    /* compiled from: ClipsEntryPointsPatch.kt */
    public static final class a implements c {
        public static final a b = new a();
    }

    /* compiled from: ClipsEntryPointsPatch.kt */
    public static final class b implements c {
        public static final b b = new b();
    }

    /* compiled from: ClipsEntryPointsPatch.kt */
    /* renamed from: com.vk.clips.entrypoints.feature.c$c, reason: collision with other inner class name */
    public static final class C0583c implements c {
        public static final C0583c b = new C0583c();
    }

    /* compiled from: ClipsEntryPointsPatch.kt */
    public static final class d implements c {
        public final boolean b;
        public final int c;

        public d(boolean z, int i) {
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToActiveState(showDraftsTab=");
            sb.append(this.b);
            sb.append(", draftsUnseenCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsEntryPointsPatch.kt */
    public static final class e implements c {
        public static final e b = new e();
    }

    /* compiled from: ClipsEntryPointsPatch.kt */
    public static final class f implements c {
        public final boolean b;
        public final int c;

        public f(boolean z, int i) {
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateDrafts(showDraftsTab=");
            sb.append(this.b);
            sb.append(", draftsUnseenCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsEntryPointsPatch.kt */
    public static final class g implements c {
        public final List<MediaStoreEntry> b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends MediaStoreEntry> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateGallerySelectedItems(selectedItems="), this.b);
        }
    }
}
