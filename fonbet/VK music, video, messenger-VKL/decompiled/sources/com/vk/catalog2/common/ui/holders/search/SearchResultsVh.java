package com.vk.catalog2.common.ui.holders.search;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import xsna.byh0;
import xsna.d2e0;
import xsna.izs;
import xsna.n23;
import xsna.qoy;
import xsna.s3q0;

/* compiled from: SearchResultsVh.kt */
/* loaded from: classes16.dex */
public interface SearchResultsVh extends CommonSearchResultsVh, byh0 {

    /* compiled from: SearchResultsVh.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public a() {
            this(false, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(reloadOnNewQuery=");
            sb.append(this.a);
            sb.append(", scrollToTopOnSync=");
            sb.append(this.b);
            sb.append(", showLoadingOnViewCreate=");
            sb.append(this.c);
            sb.append(", reloadOnSameQuery=");
            sb.append(this.d);
            sb.append(", closeKeyboardOnTap=");
            sb.append(this.e);
            sb.append(", isSearchContextUsedOnlyForAnalytics=");
            return n23.b(sb, this.f, ", isSuggester=false)");
        }

        public a(boolean z, int i) {
            z = (i & 1) != 0 ? true : z;
            boolean z2 = (i & 2) == 0;
            boolean z3 = (i & 4) != 0;
            boolean z4 = (i & 8) == 0;
            boolean z5 = (i & 16) == 0;
            boolean z6 = (i & 32) == 0;
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
        }
    }

    static /* synthetic */ void cb(SearchResultsVh searchResultsVh, String str, String str2, SearchParams searchParams, boolean z, SearchInputMethod searchInputMethod, boolean z2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            searchParams = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            searchInputMethod = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        searchResultsVh.Zf(str, str2, searchParams, z, searchInputMethod, z2);
    }

    UIBlockList O0();

    void Zf(String str, String str2, SearchParams searchParams, boolean z, SearchInputMethod searchInputMethod, boolean z2);

    void clear();

    String dc();

    void f(boolean z);

    void setProgressDrawableFactory(d2e0 d2e0Var);

    default void q7(String str, UIBlockSearchQuickFilter uIBlockSearchQuickFilter, izs<? super Boolean, s3q0> izsVar) {
    }
}
