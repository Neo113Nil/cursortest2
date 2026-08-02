package com.vk.photo.editor.ivm.filter;

import android.content.Context;
import com.vk.photo.editor.features.filter.FilterUiModel;
import xsna.asp;
import xsna.edr;
import xsna.epx;
import xsna.zrp;

/* compiled from: FilterMessage.kt */
/* loaded from: classes4.dex */
public interface FilterMessage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FilterMessage.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source Synthetic;
        public static final Source UserInput;

        static {
            Source source = new Source("UserInput", 0);
            UserInput = source;
            Source source2 = new Source("Synthetic", 1);
            Synthetic = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: FilterMessage.kt */
    public static final class a implements FilterMessage {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LoadFilters(context=" + this.a + ")";
        }
    }

    /* compiled from: FilterMessage.kt */
    public static final class b implements FilterMessage {
        public final FilterUiModel a;

        public b(FilterUiModel filterUiModel) {
            this.a = filterUiModel;
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
            return "OnFilterHide(filterUiModel=" + this.a + ")";
        }
    }

    /* compiled from: FilterMessage.kt */
    public static final class c implements FilterMessage {
        public final FilterUiModel a;

        public c(FilterUiModel filterUiModel) {
            this.a = filterUiModel;
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
            return "OnFilterShow(filterUiModel=" + this.a + ")";
        }
    }

    /* compiled from: FilterMessage.kt */
    public static final class d implements FilterMessage {
        public final FilterUiModel a;

        public d(FilterUiModel filterUiModel) {
            this.a = filterUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RetryFilterLoad(filterUiModel=" + this.a + ")";
        }
    }

    /* compiled from: FilterMessage.kt */
    public static final class e implements FilterMessage {
        public final edr a;

        public e(edr edrVar) {
            this.a = edrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SaveInitialFilterParams(filterParams=" + this.a + ")";
        }
    }

    /* compiled from: FilterMessage.kt */
    public static final class f implements FilterMessage {
        public final String a;
        public final Source b;

        public f(String str, Source source) {
            this.a = str;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectFilter(filterId=" + this.a + ", source=" + this.b + ")";
        }
    }

    /* compiled from: FilterMessage.kt */
    public static final class g implements FilterMessage {
        public final int a;
        public final Source b;

        public g(int i, Source source) {
            this.a = i;
            this.b = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "UpdateFilterValue(value=" + this.a + ", source=" + this.b + ")";
        }
    }
}
