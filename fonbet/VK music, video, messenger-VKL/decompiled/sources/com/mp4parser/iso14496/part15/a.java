package com.mp4parser.iso14496.part15;

import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: HevcDecoderConfigurationRecord.java */
/* loaded from: classes14.dex */
public final class a {
    public boolean A;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public int g;
    public int i;
    public int k;
    public int m;
    public int o;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public boolean x;
    public boolean y;
    public boolean z;
    public int h = 15;
    public int j = 63;
    public int l = 63;
    public int n = 31;
    public int p = 31;
    public ArrayList w = new ArrayList();

    /* compiled from: HevcDecoderConfigurationRecord.java */
    /* renamed from: com.mp4parser.iso14496.part15.a$a, reason: collision with other inner class name */
    public static class C0361a {
        public boolean a;
        public boolean b;
        public int c;
        public ArrayList d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0361a.class != obj.getClass()) {
                return false;
            }
            C0361a c0361a = (C0361a) obj;
            if (this.a != c0361a.a || this.c != c0361a.c || this.b != c0361a.b) {
                return false;
            }
            ListIterator listIterator = this.d.listIterator();
            ListIterator listIterator2 = c0361a.d.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                byte[] bArr = (byte[]) listIterator.next();
                byte[] bArr2 = (byte[]) listIterator2.next();
                if (bArr == null) {
                    if (bArr2 != null) {
                        return false;
                    }
                } else if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
            }
            return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
        }

        public final int hashCode() {
            int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
            ArrayList arrayList = this.d;
            return i + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final String toString() {
            return "Array{nal_unit_type=" + this.c + ", reserved=" + this.b + ", array_completeness=" + this.a + ", num_nals=" + this.d.size() + '}';
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.r != aVar.r || this.q != aVar.q || this.o != aVar.o || this.m != aVar.m || this.a != aVar.a || this.s != aVar.s || this.f != aVar.f || this.g != aVar.g || this.e != aVar.e || this.d != aVar.d || this.b != aVar.b || this.c != aVar.c || this.v != aVar.v || this.i != aVar.i || this.t != aVar.t || this.k != aVar.k || this.h != aVar.h || this.j != aVar.j || this.l != aVar.l || this.n != aVar.n || this.p != aVar.p || this.u != aVar.u) {
            return false;
        }
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = aVar.w;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final int hashCode() {
        int i = ((((((this.a * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31;
        long j = this.e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i3 = (((((((((((((((((((((((((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + (this.u ? 1 : 0)) * 31) + this.v) * 31;
        ArrayList arrayList = this.w;
        return i3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("HEVCDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.a);
        sb.append(", general_profile_space=");
        sb.append(this.b);
        sb.append(", general_tier_flag=");
        sb.append(this.c);
        sb.append(", general_profile_idc=");
        sb.append(this.d);
        sb.append(", general_profile_compatibility_flags=");
        sb.append(this.e);
        sb.append(", general_constraint_indicator_flags=");
        sb.append(this.f);
        sb.append(", general_level_idc=");
        sb.append(this.g);
        String str5 = "";
        if (this.h != 15) {
            str = ", reserved1=" + this.h;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", min_spatial_segmentation_idc=");
        sb.append(this.i);
        if (this.j != 63) {
            str2 = ", reserved2=" + this.j;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(", parallelismType=");
        sb.append(this.k);
        if (this.l != 63) {
            str3 = ", reserved3=" + this.l;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", chromaFormat=");
        sb.append(this.m);
        if (this.n != 31) {
            str4 = ", reserved4=" + this.n;
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.o);
        if (this.p != 31) {
            str5 = ", reserved5=" + this.p;
        }
        sb.append(str5);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.q);
        sb.append(", avgFrameRate=");
        sb.append(this.r);
        sb.append(", constantFrameRate=");
        sb.append(this.s);
        sb.append(", numTemporalLayers=");
        sb.append(this.t);
        sb.append(", temporalIdNested=");
        sb.append(this.u);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.v);
        sb.append(", arrays=");
        return j.b('}', sb, this.w);
    }
}
