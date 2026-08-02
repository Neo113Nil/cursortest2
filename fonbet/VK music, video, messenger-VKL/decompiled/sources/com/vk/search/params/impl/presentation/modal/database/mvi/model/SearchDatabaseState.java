package com.vk.search.params.impl.presentation.modal.database.mvi.model;

import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.cph0;
import xsna.epx;
import xsna.fw3;
import xsna.mph0;
import xsna.ms9;
import xsna.zrp;

/* compiled from: SearchDatabaseState.kt */
/* loaded from: classes5.dex */
public final class SearchDatabaseState<Item> implements mph0 {
    public final String b;
    public final String c;
    public final com.vk.search.params.impl.presentation.modal.database.mvi.model.a<Item> d;
    public final a<Item> e;
    public final List<cph0> f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchDatabaseState.kt */
    public static final class ListEnd {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ListEnd[] $VALUES;
        public static final ListEnd END;
        public static final ListEnd LOADING_NEXT;
        public static final ListEnd LOAD_NEXT_TRIGGER;

        static {
            ListEnd listEnd = new ListEnd("LOAD_NEXT_TRIGGER", 0);
            LOAD_NEXT_TRIGGER = listEnd;
            ListEnd listEnd2 = new ListEnd("LOADING_NEXT", 1);
            LOADING_NEXT = listEnd2;
            ListEnd listEnd3 = new ListEnd("END", 2);
            END = listEnd3;
            ListEnd[] listEndArr = {listEnd, listEnd2, listEnd3};
            $VALUES = listEndArr;
            $ENTRIES = new asp(listEndArr);
        }

        public ListEnd() {
            throw null;
        }

        public static ListEnd valueOf(String str) {
            return (ListEnd) Enum.valueOf(ListEnd.class, str);
        }

        public static ListEnd[] values() {
            return (ListEnd[]) $VALUES.clone();
        }
    }

    /* compiled from: SearchDatabaseState.kt */
    public interface a<Item> extends mph0 {

        /* compiled from: SearchDatabaseState.kt */
        /* renamed from: com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState$a$a, reason: collision with other inner class name */
        public static final class C1763a implements a {
            public static final C1763a b = new C1763a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1763a);
            }

            public final int hashCode() {
                return -158986776;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: SearchDatabaseState.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -158836061;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: SearchDatabaseState.kt */
        public static final class c implements a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1109730591;
            }

            public final String toString() {
                return "Initial";
            }
        }

        /* compiled from: SearchDatabaseState.kt */
        public static final class d<Item> implements a<Item> {
            public final String b;
            public final List<Item> c;
            public final ListEnd d;

            /* JADX WARN: Multi-variable type inference failed */
            public d(String str, List<? extends Item> list, ListEnd listEnd) {
                this.b = str;
                this.c = list;
                this.d = listEnd;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                return "Items(query=" + this.b + ", items=" + this.c + ", listEnd=" + this.d + ')';
            }
        }

        /* compiled from: SearchDatabaseState.kt */
        public static final class e implements a {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -501960937;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public SearchDatabaseState() {
        this(null, 31);
    }

    public static SearchDatabaseState a(SearchDatabaseState searchDatabaseState, String str, String str2, com.vk.search.params.impl.presentation.modal.database.mvi.model.a aVar, a aVar2, List list, int i) {
        if ((i & 1) != 0) {
            str = searchDatabaseState.b;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = searchDatabaseState.c;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            aVar = searchDatabaseState.d;
        }
        com.vk.search.params.impl.presentation.modal.database.mvi.model.a aVar3 = aVar;
        if ((i & 8) != 0) {
            aVar2 = searchDatabaseState.e;
        }
        a aVar4 = aVar2;
        if ((i & 16) != 0) {
            list = searchDatabaseState.f;
        }
        searchDatabaseState.getClass();
        return new SearchDatabaseState(str3, str4, aVar3, aVar4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDatabaseState)) {
            return false;
        }
        SearchDatabaseState searchDatabaseState = (SearchDatabaseState) obj;
        return epx.f(this.b, searchDatabaseState.b) && epx.f(this.c, searchDatabaseState.c) && epx.f(this.d, searchDatabaseState.d) && epx.f(this.e, searchDatabaseState.e) && epx.f(this.f, searchDatabaseState.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchDatabaseState(inputQuery=");
        sb.append(this.b);
        sb.append(", activeRequestQuery=");
        sb.append(this.c);
        sb.append(", selectedItem=");
        sb.append(this.d);
        sb.append(", content=");
        sb.append(this.e);
        sb.append(", customActions=");
        return ms9.a(')', sb, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchDatabaseState(String str, String str2, com.vk.search.params.impl.presentation.modal.database.mvi.model.a<? extends Item> aVar, a<? extends Item> aVar2, List<cph0> list) {
        this.b = str;
        this.c = str2;
        this.d = aVar;
        this.e = aVar2;
        this.f = list;
    }

    public SearchDatabaseState(com.vk.search.params.impl.presentation.modal.database.mvi.model.a aVar, int i) {
        this("", null, (i & 4) != 0 ? a.c.a : aVar, a.c.b, EmptyList.b);
    }
}
