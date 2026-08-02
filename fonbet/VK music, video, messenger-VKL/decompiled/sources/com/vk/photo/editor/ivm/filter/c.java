package com.vk.photo.editor.ivm.filter;

import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.edr;
import xsna.epx;
import xsna.fw3;
import xsna.n23;
import xsna.nwx;
import xsna.qoy;
import xsna.shy;

/* compiled from: FilterState.kt */
/* loaded from: classes4.dex */
public final class c implements nwx {
    public final edr a;
    public final List<FilterUiModel> b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final FilterMessage.Source f;
    public final boolean g;

    public c() {
        this(0);
    }

    public static c a(c cVar, edr edrVar, List list, boolean z, int i, boolean z2, FilterMessage.Source source, int i2) {
        if ((i2 & 1) != 0) {
            edrVar = cVar.a;
        }
        edr edrVar2 = edrVar;
        if ((i2 & 2) != 0) {
            list = cVar.b;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            z = cVar.c;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            i = cVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z2 = cVar.e;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            source = cVar.f;
        }
        FilterMessage.Source source2 = source;
        boolean z5 = (i2 & 64) != 0 ? cVar.g : true;
        cVar.getClass();
        return new c(edrVar2, list2, z3, i3, z4, source2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + qoy.b(shy.a(this.d, qoy.b(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterState(initialFilterParams=");
        sb.append(this.a);
        sb.append(", filters=");
        sb.append(this.b);
        sb.append(", enhanceIsVisible=");
        sb.append(this.c);
        sb.append(", filterValue=");
        sb.append(this.d);
        sb.append(", newFiltersLoading=");
        sb.append(this.e);
        sb.append(", messageSource=");
        sb.append(this.f);
        sb.append(", isLowMemoryError=");
        return n23.b(sb, this.g, ")");
    }

    public c(edr edrVar, List<FilterUiModel> list, boolean z, int i, boolean z2, FilterMessage.Source source, boolean z3) {
        this.a = edrVar;
        this.b = list;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = source;
        this.g = z3;
    }

    public c(int i) {
        this(new edr(null, 7, 0), EmptyList.b, false, 0, false, FilterMessage.Source.Synthetic, false);
    }
}
