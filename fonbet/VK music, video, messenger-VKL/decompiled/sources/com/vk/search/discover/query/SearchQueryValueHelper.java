package com.vk.search.discover.query;

import android.widget.EditText;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.f3;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.asp;
import xsna.av70;
import xsna.bj50;
import xsna.dli0;
import xsna.dnz;
import xsna.eni0;
import xsna.epx;
import xsna.et;
import xsna.i0q0;
import xsna.ij8;
import xsna.jli0;
import xsna.jsv;
import xsna.n8c0;
import xsna.pey;
import xsna.tgb;
import xsna.u730;
import xsna.up;
import xsna.wxh0;
import xsna.x310;
import xsna.xpt;
import xsna.xxh;
import xsna.xxh0;
import xsna.yxh0;
import xsna.z2d0;
import xsna.zrp;

/* compiled from: SearchQueryValueHelper.kt */
/* loaded from: classes5.dex */
public final class SearchQueryValueHelper {
    public boolean a;
    public final d<a> b = d.O0(new a(new SearchQuery("", SearchInputMethod.Keyboard, null, null, 12, null), ChangeType.MANUAL, null));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchQueryValueHelper.kt */
    public static final class ChangeType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangeType[] $VALUES;
        public static final ChangeType KEYBOARD;
        public static final ChangeType MANUAL;
        public static final ChangeType SILENT;

        static {
            ChangeType changeType = new ChangeType("KEYBOARD", 0);
            KEYBOARD = changeType;
            ChangeType changeType2 = new ChangeType("MANUAL", 1);
            MANUAL = changeType2;
            ChangeType changeType3 = new ChangeType("SILENT", 2);
            SILENT = changeType3;
            ChangeType[] changeTypeArr = {changeType, changeType2, changeType3};
            $VALUES = changeTypeArr;
            $ENTRIES = new asp(changeTypeArr);
        }

        public ChangeType() {
            throw null;
        }

        public static ChangeType valueOf(String str) {
            return (ChangeType) Enum.valueOf(ChangeType.class, str);
        }

        public static ChangeType[] values() {
            return (ChangeType[]) $VALUES.clone();
        }
    }

    /* compiled from: SearchQueryValueHelper.kt */
    public static final class a {
        public final SearchQuery a;
        public final ChangeType b;
        public final Reference<Object> c;

        public a(SearchQuery searchQuery, ChangeType changeType, WeakReference weakReference) {
            this.a = searchQuery;
            this.b = changeType;
            this.c = weakReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            Reference<Object> reference = this.c;
            return hashCode + (reference == null ? 0 : reference.hashCode());
        }

        public final String toString() {
            return "SearchQueryWithChangeType(query=" + this.a + ", changeType=" + this.b + ", changeOwner=" + this.c + ')';
        }
    }

    public static void e(SearchQueryValueHelper searchQueryValueHelper, SearchQuery searchQuery) {
        searchQueryValueHelper.b.onNext(new a(searchQuery, ChangeType.MANUAL, null));
    }

    public final b a(VkSearchView vkSearchView) {
        b bVar = new b();
        EditText editView = vkSearchView.getEditView();
        yxh0 yxh0Var = new yxh0(this, vkSearchView);
        editView.addTextChangedListener(yxh0Var);
        bVar.b(new io.reactivex.rxjava3.disposables.a(new tgb(2, vkSearchView, yxh0Var)));
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        x310 x310Var = new x310(new ij8(29, ref$BooleanRef, vkSearchView), 7);
        d<a> dVar = this.b;
        dVar.getClass();
        bVar.b(new i0(dVar, x310Var).subscribe(new jsv(new xxh(ref$BooleanRef, this, vkSearchView, 7), 22)));
        return bVar;
    }

    public final SearchQuery b() {
        a P0 = this.b.P0();
        if (P0 != null) {
            return P0.a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void c(String str, VkSearchView vkSearchView) {
        if (!i0q0.b()) {
            i0q0.f(new z2d0(this, str, vkSearchView, 2));
        } else {
            if (epx.f(str, vkSearchView.getQuery())) {
                return;
            }
            this.a = true;
            vkSearchView.setQuery(str);
            this.a = false;
        }
    }

    public final q<SearchQuery> d(long j, boolean z, boolean z2) {
        d<a> dVar = this.b;
        if (j > 0) {
            jli0 jli0Var = new jli0(dli0.e(Boolean.TRUE, new eni0(5)));
            u730 u730Var = new u730(new wxh0(z, this, z2, j), 11);
            dVar.getClass();
            return new f3(dVar, jli0Var, u730Var).s0(new et(new av70(11), 29));
        }
        if (!z && !z2) {
            return dVar.U(new up(new pey(28), 28));
        }
        jli0 jli0Var2 = new jli0(dli0.e(Boolean.TRUE, new eni0(5)));
        dnz dnzVar = new dnz(com.vk.search.discover.query.a.b, 13);
        dVar.getClass();
        return new i0(new f3(dVar, jli0Var2, dnzVar), new n8c0(new xxh0(z, this, z2), 5)).U(new bj50(new xpt(28), 9));
    }
}
