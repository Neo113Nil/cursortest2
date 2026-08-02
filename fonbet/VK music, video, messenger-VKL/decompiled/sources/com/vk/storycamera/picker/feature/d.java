package com.vk.storycamera.picker.feature;

import com.vk.mediastore.system.MediaStoreEntry;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.vu5;
import xsna.xl50;

/* compiled from: StoryMediaPickerPatch.kt */
/* loaded from: classes6.dex */
public abstract class d implements xl50 {

    /* compiled from: StoryMediaPickerPatch.kt */
    public static final class a extends d {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1791495968;
        }

        public final String toString() {
            return "GalleryPickerSelected";
        }
    }

    /* compiled from: StoryMediaPickerPatch.kt */
    public static final class b extends d {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("InitState(forceTemplate="), this.b, ')');
        }
    }

    /* compiled from: StoryMediaPickerPatch.kt */
    public static final class c extends d {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("StoryNewTemplateCount(count="), this.b, ')');
        }
    }

    /* compiled from: StoryMediaPickerPatch.kt */
    /* renamed from: com.vk.storycamera.picker.feature.d$d, reason: collision with other inner class name */
    public static final class C1846d extends d {
        public static final C1846d b = new C1846d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1846d);
        }

        public final int hashCode() {
            return -1946051536;
        }

        public final String toString() {
            return "TemplateSelected";
        }
    }

    /* compiled from: StoryMediaPickerPatch.kt */
    public static final class e extends d {
        public final List<MediaStoreEntry> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends MediaStoreEntry> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateGallerySelectedItems(selectedItems="), this.b);
        }
    }
}
