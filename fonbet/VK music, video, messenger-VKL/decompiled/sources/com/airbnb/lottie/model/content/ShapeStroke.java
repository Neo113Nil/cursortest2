package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import xsna.eij;
import xsna.gfj;
import xsna.i700;
import xsna.jrm0;
import xsna.k800;
import xsna.mf2;
import xsna.nf2;
import xsna.pf2;

/* loaded from: classes12.dex */
public final class ShapeStroke implements eij {
    public final String a;

    @Nullable
    public final nf2 b;
    public final ArrayList c;
    public final mf2 d;
    public final pf2 e;
    public final nf2 f;
    public final LineCapType g;
    public final LineJoinType h;
    public final float i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineCapType {
        private static final /* synthetic */ LineCapType[] $VALUES;
        public static final LineCapType BUTT;
        public static final LineCapType ROUND;
        public static final LineCapType UNKNOWN;

        static {
            LineCapType lineCapType = new LineCapType("BUTT", 0);
            BUTT = lineCapType;
            LineCapType lineCapType2 = new LineCapType("ROUND", 1);
            ROUND = lineCapType2;
            LineCapType lineCapType3 = new LineCapType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = lineCapType3;
            $VALUES = new LineCapType[]{lineCapType, lineCapType2, lineCapType3};
        }

        public LineCapType() {
            throw null;
        }

        public static LineCapType valueOf(String str) {
            return (LineCapType) Enum.valueOf(LineCapType.class, str);
        }

        public static LineCapType[] values() {
            return (LineCapType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineJoinType {
        private static final /* synthetic */ LineJoinType[] $VALUES;
        public static final LineJoinType BEVEL;
        public static final LineJoinType MITER;
        public static final LineJoinType ROUND;

        static {
            LineJoinType lineJoinType = new LineJoinType("MITER", 0);
            MITER = lineJoinType;
            LineJoinType lineJoinType2 = new LineJoinType("ROUND", 1);
            ROUND = lineJoinType2;
            LineJoinType lineJoinType3 = new LineJoinType("BEVEL", 2);
            BEVEL = lineJoinType3;
            $VALUES = new LineJoinType[]{lineJoinType, lineJoinType2, lineJoinType3};
        }

        public LineJoinType() {
            throw null;
        }

        public static LineJoinType valueOf(String str) {
            return (LineJoinType) Enum.valueOf(LineJoinType.class, str);
        }

        public static LineJoinType[] values() {
            return (LineJoinType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable nf2 nf2Var, ArrayList arrayList, mf2 mf2Var, pf2 pf2Var, nf2 nf2Var2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.a = str;
        this.b = nf2Var;
        this.c = arrayList;
        this.d = mf2Var;
        this.e = pf2Var;
        this.f = nf2Var2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.j = z;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new jrm0(k800Var, aVar, this);
    }
}
