package com.vk.photo.editor.ivm.collage;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.ivm.collage.CollageMessage;
import java.util.ArrayList;
import java.util.List;
import xsna.a3g;
import xsna.b3g;
import xsna.c3g;
import xsna.epx;
import xsna.f0g;
import xsna.fw3;
import xsna.h0g;
import xsna.n2k0;
import xsna.nwx;
import xsna.vq;
import xsna.w0g;
import xsna.z2g;

/* compiled from: CollageState.kt */
/* loaded from: classes4.dex */
public final class c implements nwx {
    public final List<b3g> a;
    public final w0g b;
    public final List<z2g> c;
    public final List<f0g> d;
    public final float e;
    public final f0g f;
    public final float g;
    public final n2k0 h;
    public final CollageMessage.Source i;

    public c() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(c cVar, ArrayList arrayList, w0g w0gVar, ArrayList arrayList2, ArrayList arrayList3, float f, f0g f0gVar, float f2, n2k0 n2k0Var, CollageMessage.Source source, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = cVar.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            w0gVar = cVar.b;
        }
        w0g w0gVar2 = w0gVar;
        List list3 = arrayList2;
        if ((i & 4) != 0) {
            list3 = cVar.c;
        }
        List list4 = list3;
        List list5 = arrayList3;
        if ((i & 8) != 0) {
            list5 = cVar.d;
        }
        List list6 = list5;
        if ((i & 16) != 0) {
            f = cVar.e;
        }
        float f3 = f;
        f0g f0gVar2 = (i & 32) != 0 ? cVar.f : f0gVar;
        float f4 = (i & 64) != 0 ? cVar.g : f2;
        n2k0 n2k0Var2 = (i & 128) != 0 ? cVar.h : n2k0Var;
        CollageMessage.Source source2 = (i & 256) != 0 ? cVar.i : source;
        cVar.getClass();
        return new c(list2, w0gVar2, list4, list6, f3, f0gVar2, f4, n2k0Var2, source2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && Float.compare(this.e, cVar.e) == 0 && epx.f(this.f, cVar.f) && Float.compare(this.g, cVar.g) == 0 && epx.f(this.h, cVar.h) && this.i == cVar.i;
    }

    public final int hashCode() {
        int a = io.reactivex.rxjava3.subjects.b.a(this.g, (this.f.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.e, fw3.a(fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31)) * 31, 31);
        n2k0 n2k0Var = this.h;
        return this.i.hashCode() + ((a + (n2k0Var == null ? 0 : n2k0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollageState(grids=");
        sb.append(this.a);
        sb.append(", grid=");
        sb.append(this.b);
        sb.append(", formats=");
        vq.d(sb, this.c, ", colors=", this.d, ", borderWidth=");
        sb.append(this.e);
        sb.append(", borderColor=");
        sb.append(this.f);
        sb.append(", cornerRadius=");
        sb.append(this.g);
        sb.append(", selectedSlotId=");
        sb.append(this.h);
        sb.append(", messageSource=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public c(List<b3g> list, w0g w0gVar, List<z2g> list2, List<f0g> list3, float f, f0g f0gVar, float f2, n2k0 n2k0Var, CollageMessage.Source source) {
        this.a = list;
        this.b = w0gVar;
        this.c = list2;
        this.d = list3;
        this.e = f;
        this.f = f0gVar;
        this.g = f2;
        this.h = n2k0Var;
        this.i = source;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int i) {
        this(r1, r1.get(0).d, a3g.a, h0g.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f0g.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, CollageMessage.Source.Synthetic);
        List<b3g> list = c3g.a;
    }
}
