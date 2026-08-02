package com.vk.clips.entrypoints.feature;

import com.vk.dto.clips.gallery.ClipsProcessedItem;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: ClipsEntryPointNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ClipsEntryPointNavigationEvent.kt */
    /* renamed from: com.vk.clips.entrypoints.feature.a$a, reason: collision with other inner class name */
    public static final class C0582a implements a {
        public static final C0582a a = new C0582a();
    }

    /* compiled from: ClipsEntryPointNavigationEvent.kt */
    public static final class b implements a {
        public final List<ClipsProcessedItem> a;

        public b(List<ClipsProcessedItem> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("GalleryPhotoProcessFinish(items="), this.a);
        }
    }
}
