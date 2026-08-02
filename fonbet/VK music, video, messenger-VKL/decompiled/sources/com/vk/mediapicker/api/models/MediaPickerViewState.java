package com.vk.mediapicker.api.models;

import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.tp10;
import xsna.zrp;

/* compiled from: MediaPickerViewState.kt */
/* loaded from: classes3.dex */
public final class MediaPickerViewState {
    public final tp10 a;
    public final Medias b;

    /* compiled from: MediaPickerViewState.kt */
    public interface Medias {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MediaPickerViewState.kt */
        public static final class Pagination {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Pagination[] $VALUES;
            public static final Pagination Error;
            public static final Pagination Loaded;
            public static final Pagination Loading;

            static {
                Pagination pagination = new Pagination("Loading", 0);
                Loading = pagination;
                Pagination pagination2 = new Pagination("Error", 1);
                Error = pagination2;
                Pagination pagination3 = new Pagination("Loaded", 2);
                Loaded = pagination3;
                Pagination[] paginationArr = {pagination, pagination2, pagination3};
                $VALUES = paginationArr;
                $ENTRIES = new asp(paginationArr);
            }

            public Pagination() {
                throw null;
            }

            public static Pagination valueOf(String str) {
                return (Pagination) Enum.valueOf(Pagination.class, str);
            }

            public static Pagination[] values() {
                return (Pagination[]) $VALUES.clone();
            }
        }

        /* compiled from: MediaPickerViewState.kt */
        public static final class a implements Medias {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 361063989;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: MediaPickerViewState.kt */
        public static final class b implements Medias {
            public final ArrayList a;
            public final List<MediaStoreEntry> b;
            public final Pagination c;

            public b(ArrayList arrayList, List list, Pagination pagination) {
                this.a = arrayList;
                this.b = list;
                this.c = pagination;
            }

            public final List<MediaStoreEntry> a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return "Loaded(items=" + this.a + ", selectedItems=" + this.b + ", paginationState=" + this.c + ')';
            }
        }

        /* compiled from: MediaPickerViewState.kt */
        public static final class c implements Medias {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 905780777;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public MediaPickerViewState(tp10 tp10Var, Medias medias) {
        this.a = tp10Var;
        this.b = medias;
    }

    public final Medias a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPickerViewState)) {
            return false;
        }
        MediaPickerViewState mediaPickerViewState = (MediaPickerViewState) obj;
        return epx.f(this.a, mediaPickerViewState.a) && epx.f(this.b, mediaPickerViewState.b);
    }

    public final int hashCode() {
        tp10 tp10Var = this.a;
        return this.b.hashCode() + ((tp10Var == null ? 0 : tp10Var.hashCode()) * 31);
    }

    public final String toString() {
        return "MediaPickerViewState(albums=" + this.a + ", mediasState=" + this.b + ')';
    }
}
