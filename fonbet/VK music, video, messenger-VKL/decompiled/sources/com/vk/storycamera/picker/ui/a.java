package com.vk.storycamera.picker.ui;

import android.os.Bundle;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.kj50;
import xsna.l7s;
import xsna.ms9;
import xsna.uf3;
import xsna.vu5;

/* compiled from: StoryMediaPickerAction.kt */
/* loaded from: classes6.dex */
public abstract class a implements kj50 {

    /* compiled from: StoryMediaPickerAction.kt */
    /* renamed from: com.vk.storycamera.picker.ui.a$a, reason: collision with other inner class name */
    public static final class C1847a extends a {
        public static final C1847a b = new C1847a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1847a);
        }

        public final int hashCode() {
            return -1286003081;
        }

        public final String toString() {
            return "InitLoad";
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class b extends a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1107837667;
        }

        public final String toString() {
            return "OnBackAction";
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class c extends a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2092694318;
        }

        public final String toString() {
            return "OnCloseAction";
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class d extends a {
        public final MediaStoreEntry b;
        public final List<MediaStoreEntry> c;
        public final l7s d;
        public final Bundle e;

        public d(MediaStoreEntry mediaStoreEntry, List list, l7s l7sVar, Bundle bundle) {
            this.b = mediaStoreEntry;
            this.c = list;
            this.d = l7sVar;
            this.e = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c)) * 31;
            Bundle bundle = this.e;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCollageReady(collageImage=");
            sb.append(this.b);
            sb.append(", selectedEntries=");
            sb.append(this.c);
            sb.append(", context=");
            sb.append(this.d);
            sb.append(", collageParams=");
            return uf3.c(sb, this.e, ')');
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class e extends a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 984707611;
        }

        public final String toString() {
            return "OnGalleryPickerSelected";
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class f extends a {
        public final List<MediaStoreEntry> b;
        public final l7s c;

        public f(List list, l7s l7sVar) {
            this.b = list;
            this.c = l7sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "OnGalleryReady(entryList=" + this.b + ", context=" + this.c + ')';
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class g extends a {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnNewTemplateCount(count="), this.b, ')');
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class h extends a {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 884934741;
        }

        public final String toString() {
            return "OnTemplateSelected";
        }
    }

    /* compiled from: StoryMediaPickerAction.kt */
    public static final class i extends a {
        public final List<MediaStoreEntry> b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(List<? extends MediaStoreEntry> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateGallerySelectedItems(selectedItems="), this.b);
        }
    }
}
