package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.List;
import java.util.Locale;
import xsna.dg2;
import xsna.eij;
import xsna.fw3;
import xsna.i700;
import xsna.m22;
import xsna.nf2;
import xsna.nhy;
import xsna.qus;
import xsna.yf2;
import xsna.zf2;

/* loaded from: classes12.dex */
public final class Layer {
    public final List<eij> a;
    public final i700 b;
    public final String c;
    public final long d;
    public final LayerType e;
    public final long f;

    @Nullable
    public final String g;
    public final List<Mask> h;
    public final dg2 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;

    @Nullable
    public final yf2 q;

    @Nullable
    public final zf2 r;

    @Nullable
    public final nf2 s;
    public final List<nhy<Float>> t;
    public final MatteType u;
    public final boolean v;

    @Nullable
    public final qus w;

    @Nullable
    public final m22 x;
    public final LBlendMode y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayerType {
        private static final /* synthetic */ LayerType[] $VALUES;
        public static final LayerType IMAGE;
        public static final LayerType NULL;
        public static final LayerType PRE_COMP;
        public static final LayerType SHAPE;
        public static final LayerType SOLID;
        public static final LayerType TEXT;
        public static final LayerType UNKNOWN;

        static {
            LayerType layerType = new LayerType("PRE_COMP", 0);
            PRE_COMP = layerType;
            LayerType layerType2 = new LayerType("SOLID", 1);
            SOLID = layerType2;
            LayerType layerType3 = new LayerType("IMAGE", 2);
            IMAGE = layerType3;
            LayerType layerType4 = new LayerType("NULL", 3);
            NULL = layerType4;
            LayerType layerType5 = new LayerType("SHAPE", 4);
            SHAPE = layerType5;
            LayerType layerType6 = new LayerType("TEXT", 5);
            TEXT = layerType6;
            LayerType layerType7 = new LayerType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
            UNKNOWN = layerType7;
            $VALUES = new LayerType[]{layerType, layerType2, layerType3, layerType4, layerType5, layerType6, layerType7};
        }

        public LayerType() {
            throw null;
        }

        public static LayerType valueOf(String str) {
            return (LayerType) Enum.valueOf(LayerType.class, str);
        }

        public static LayerType[] values() {
            return (LayerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatteType {
        private static final /* synthetic */ MatteType[] $VALUES;
        public static final MatteType ADD;
        public static final MatteType INVERT;
        public static final MatteType LUMA;
        public static final MatteType LUMA_INVERTED;
        public static final MatteType NONE;
        public static final MatteType UNKNOWN;

        static {
            MatteType matteType = new MatteType("NONE", 0);
            NONE = matteType;
            MatteType matteType2 = new MatteType("ADD", 1);
            ADD = matteType2;
            MatteType matteType3 = new MatteType("INVERT", 2);
            INVERT = matteType3;
            MatteType matteType4 = new MatteType("LUMA", 3);
            LUMA = matteType4;
            MatteType matteType5 = new MatteType("LUMA_INVERTED", 4);
            LUMA_INVERTED = matteType5;
            MatteType matteType6 = new MatteType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
            UNKNOWN = matteType6;
            $VALUES = new MatteType[]{matteType, matteType2, matteType3, matteType4, matteType5, matteType6};
        }

        public MatteType() {
            throw null;
        }

        public static MatteType valueOf(String str) {
            return (MatteType) Enum.valueOf(MatteType.class, str);
        }

        public static MatteType[] values() {
            return (MatteType[]) $VALUES.clone();
        }
    }

    public Layer(List<eij> list, i700 i700Var, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, dg2 dg2Var, int i, int i2, int i3, float f, float f2, float f3, float f4, @Nullable yf2 yf2Var, @Nullable zf2 zf2Var, List<nhy<Float>> list3, MatteType matteType, @Nullable nf2 nf2Var, boolean z, @Nullable qus qusVar, @Nullable m22 m22Var, LBlendMode lBlendMode) {
        this.a = list;
        this.b = i700Var;
        this.c = str;
        this.d = j;
        this.e = layerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = dg2Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = yf2Var;
        this.r = zf2Var;
        this.t = list3;
        this.u = matteType;
        this.s = nf2Var;
        this.v = z;
        this.w = qusVar;
        this.x = m22Var;
        this.y = lBlendMode;
    }

    public final String a(String str) {
        int i;
        StringBuilder e = fw3.e(str);
        e.append(this.c);
        e.append("\n");
        long j = this.f;
        i700 i700Var = this.b;
        Layer layer = i700Var.i.get(j);
        if (layer != null) {
            e.append("\t\tParents: ");
            e.append(layer.c);
            for (Layer layer2 = i700Var.i.get(layer.f); layer2 != null; layer2 = i700Var.i.get(layer2.f)) {
                e.append("->");
                e.append(layer2.c);
            }
            e.append(str);
            e.append("\n");
        }
        List<Mask> list = this.h;
        if (!list.isEmpty()) {
            e.append(str);
            e.append("\tMasks: ");
            e.append(list.size());
            e.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            e.append(str);
            e.append("\tBackground: ");
            e.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List<eij> list2 = this.a;
        if (!list2.isEmpty()) {
            e.append(str);
            e.append("\tShapes:\n");
            for (eij eijVar : list2) {
                e.append(str);
                e.append("\t\t");
                e.append(eijVar);
                e.append("\n");
            }
        }
        return e.toString();
    }

    public final String toString() {
        return a("");
    }
}
