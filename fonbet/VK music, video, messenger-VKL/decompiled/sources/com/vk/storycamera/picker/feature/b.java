package com.vk.storycamera.picker.feature;

import android.os.Bundle;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.uf3;

/* compiled from: StoryMediaPickerNavigationEvent.kt */
/* loaded from: classes6.dex */
public abstract class b {

    /* compiled from: StoryMediaPickerNavigationEvent.kt */
    public static final class a extends b {
        public static final a a = new a();
    }

    /* compiled from: StoryMediaPickerNavigationEvent.kt */
    /* renamed from: com.vk.storycamera.picker.feature.b$b, reason: collision with other inner class name */
    public static final class C1845b extends b {
        public final MediaStoreEntry a;
        public final List<MediaStoreEntry> b;
        public final Bundle c;

        /* JADX WARN: Multi-variable type inference failed */
        public C1845b(MediaStoreEntry mediaStoreEntry, List<? extends MediaStoreEntry> list, Bundle bundle) {
            this.a = mediaStoreEntry;
            this.b = list;
            this.c = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1845b)) {
                return false;
            }
            C1845b c1845b = (C1845b) obj;
            return epx.f(this.a, c1845b.a) && epx.f(this.b, c1845b.b) && epx.f(this.c, c1845b.c);
        }

        public final int hashCode() {
            int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
            Bundle bundle = this.c;
            return a + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GalleryCollageProcessFinish(collage=");
            sb.append(this.a);
            sb.append(", selectedItems=");
            sb.append(this.b);
            sb.append(", collageParams=");
            return uf3.c(sb, this.c, ')');
        }
    }

    /* compiled from: StoryMediaPickerNavigationEvent.kt */
    public static final class c extends b {
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
            return ms9.a(')', new StringBuilder("GalleryPhotoProcessFinish(items="), this.a);
        }
    }
}
