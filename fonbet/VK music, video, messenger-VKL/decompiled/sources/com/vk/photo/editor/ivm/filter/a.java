package com.vk.photo.editor.ivm.filter;

import android.graphics.Bitmap;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import java.util.ArrayList;
import xsna.edr;
import xsna.epx;
import xsna.mwx;
import xsna.n23;

/* compiled from: FilterPatch.kt */
/* loaded from: classes4.dex */
public interface a extends mwx {

    /* compiled from: FilterPatch.kt */
    /* renamed from: com.vk.photo.editor.ivm.filter.a$a, reason: collision with other inner class name */
    public static final class C1468a implements a {
        public static final C1468a a = new C1468a();
    }

    /* compiled from: FilterPatch.kt */
    public static final class b implements a {
        public final String a;
        public final Bitmap b;

        public b(String str, Bitmap bitmap) {
            this.a = str;
            this.b = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Bitmap bitmap = this.b;
            return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public final String toString() {
            return "UpdateFilterPreview(lutWrapperId=" + this.a + ", bitmap=" + this.b + ")";
        }
    }

    /* compiled from: FilterPatch.kt */
    public static final class c implements a {
        public final int a;
        public final FilterMessage.Source b;

        public c(int i, FilterMessage.Source source) {
            this.a = i;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "UpdateFilterValue(value=" + this.a + ", messageSource=" + this.b + ")";
        }
    }

    /* compiled from: FilterPatch.kt */
    public static final class d implements a {
        public final ArrayList a;
        public final FilterMessage.Source b;
        public final boolean c;

        public d(ArrayList arrayList, FilterMessage.Source source, boolean z) {
            this.a = arrayList;
            this.b = source;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateFilters(filters=");
            sb.append(this.a);
            sb.append(", messageSource=");
            sb.append(this.b);
            sb.append(", overrideSelectionState=");
            return n23.b(sb, this.c, ")");
        }
    }

    /* compiled from: FilterPatch.kt */
    public static final class e implements a {
        public final boolean a;
        public final FilterMessage.Source b;

        public e(boolean z, FilterMessage.Source source) {
            this.a = z;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "UpdateFiltersLoadingState(isLoading=" + this.a + ", messageSource=" + this.b + ")";
        }
    }

    /* compiled from: FilterPatch.kt */
    public static final class f implements a {
        public final edr a;

        public f(edr edrVar) {
            this.a = edrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateInitialFilterParams(filterParams=" + this.a + ")";
        }
    }
}
