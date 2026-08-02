package androidx.constraintlayout.core;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {
    public boolean b;
    public float f;
    public Type j;
    public int c = -1;
    public int d = -1;
    public int e = 0;
    public boolean g = false;
    public final float[] h = new float[9];
    public final float[] i = new float[9];
    public b[] k = new b[16];
    public int l = 0;
    public int m = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CONSTANT;
        public static final Type ERROR;
        public static final Type SLACK;
        public static final Type UNKNOWN;
        public static final Type UNRESTRICTED;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            UNRESTRICTED = type;
            Type type2 = new Type("CONSTANT", 1);
            CONSTANT = type2;
            Type type3 = new Type("SLACK", 2);
            SLACK = type3;
            Type type4 = new Type("ERROR", 3);
            ERROR = type4;
            Type type5 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
            UNKNOWN = type5;
            $VALUES = new Type[]{type, type2, type3, type4, type5};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SolverVariable(Type type) {
        this.j = type;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                b[] bVarArr = this.k;
                if (i2 >= bVarArr.length) {
                    this.k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.k;
                int i3 = this.l;
                bVarArr2[i3] = bVar;
                this.l = i3 + 1;
                return;
            }
            if (this.k[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.j = Type.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.g = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.b = false;
        Arrays.fill(this.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.c - solverVariable.c;
    }

    public final void d(c cVar, float f) {
        this.f = f;
        this.g = true;
        int i = this.l;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].h(cVar, this, false);
        }
        this.l = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].i(cVar, bVar, false);
        }
        this.l = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
