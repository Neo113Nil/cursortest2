package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dqg extends fcp {
    public final Bundle o;
    public final bqg p;
    public String q;
    public int r;

    public dqg(Bundle bundle, bqg bqgVar) {
        bqgVar.getClass();
        this.o = bundle;
        this.p = bqgVar;
        this.q = "";
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        return !o3a.I(this.o, this.q);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final byte E() {
        return (byte) o3a.y(this.o, this.q);
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.uf3
    public final p5c a() {
        return this.p.a;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final uf3 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return Intrinsics.c(this.q, "") ? this : new dqg(o3a.B(this.o, this.q), this.p);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final int f(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return o3a.y(this.o, this.q);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final int k() {
        return o3a.y(this.o, this.q);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final long m() {
        return o3a.A(this.o, this.q);
    }

    @Override // defpackage.uf3
    public final int o(SerialDescriptor serialDescriptor) {
        String e;
        serialDescriptor.getClass();
        boolean c = Intrinsics.c(serialDescriptor.getKind(), nii.g);
        Bundle bundle = this.o;
        int size = (c || Intrinsics.c(serialDescriptor.getKind(), nii.h)) ? bundle.size() : serialDescriptor.d();
        while (true) {
            int i = this.r;
            if (i >= size) {
                return -1;
            }
            e = serialDescriptor.e(i);
            if (!serialDescriptor.i(this.r) || o3a.r(bundle, e)) {
                break;
            }
            this.r++;
        }
        this.q = e;
        int i2 = this.r;
        this.r = i2 + 1;
        return i2;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final short q() {
        return (short) o3a.y(this.o, this.q);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final float r() {
        return o3a.x(this.o, this.q);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final double t() {
        return o3a.w(this.o, this.q);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final boolean u() {
        return o3a.t(this.o, this.q);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final char v() {
        String str = this.q;
        str.getClass();
        Bundle bundle = this.o;
        char c = bundle.getChar(str, (char) 0);
        if (c != 0 || bundle.getChar(str, (char) 65535) != 65535) {
            return c;
        }
        w3a.I(str);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object y(dy4 dy4Var) {
        Object a;
        dy4Var.getClass();
        SerialDescriptor descriptor = dy4Var.getDescriptor();
        if (Intrinsics.c(descriptor, aqg.a)) {
            rp2 rp2Var = rp2.a;
            a = rp2.a(this);
        } else if (Intrinsics.c(descriptor, aqg.b)) {
            a = qr4.b.deserialize(this);
        } else if (Intrinsics.c(descriptor, aqg.c)) {
            a = oq4.b.deserialize(this);
        } else if (Intrinsics.c(descriptor, aqg.d)) {
            a = yl9.a(this);
        } else if (Intrinsics.c(descriptor, aqg.i) || Intrinsics.c(descriptor, aqg.j)) {
            a = op2.a(this);
        } else if (Intrinsics.c(descriptor, aqg.k) || Intrinsics.c(descriptor, aqg.l)) {
            a = qp2.a.deserialize(this);
        } else if (Intrinsics.c(descriptor, aqg.e)) {
            Parcelable[] a2 = a9e.a(this);
            Object deserialize = dy4Var.deserialize(zl5.o);
            deserialize.getClass();
            a = Arrays.copyOf(a2, a2.length, sha.x(duf.a.getOrCreateKotlinClass(deserialize.getClass())));
        } else {
            a = Intrinsics.c(descriptor, aqg.f) ? a9e.a(this) : (Intrinsics.c(descriptor, aqg.g) || Intrinsics.c(descriptor, aqg.h)) ? b9e.a.deserialize(this) : (Intrinsics.c(descriptor, aqg.m) || Intrinsics.c(descriptor, aqg.n) || Intrinsics.c(descriptor, aqg.o)) ? exh.a.deserialize(this) : null;
        }
        if (a != null) {
            return a;
        }
        SerialDescriptor descriptor2 = dy4Var.getDescriptor();
        boolean c = Intrinsics.c(descriptor2, zpg.a);
        Bundle bundle = this.o;
        if (c) {
            String str = this.q;
            str.getClass();
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
            if (integerArrayList != null) {
                return integerArrayList;
            }
            w3a.I(str);
            throw null;
        }
        if (Intrinsics.c(descriptor2, zpg.b)) {
            return o3a.E(bundle, this.q);
        }
        if (Intrinsics.c(descriptor2, zpg.c)) {
            String str2 = this.q;
            str2.getClass();
            boolean[] booleanArray = bundle.getBooleanArray(str2);
            if (booleanArray != null) {
                return booleanArray;
            }
            w3a.I(str2);
            throw null;
        }
        if (Intrinsics.c(descriptor2, zpg.d)) {
            String str3 = this.q;
            str3.getClass();
            char[] charArray = bundle.getCharArray(str3);
            if (charArray != null) {
                return charArray;
            }
            w3a.I(str3);
            throw null;
        }
        if (Intrinsics.c(descriptor2, zpg.e)) {
            String str4 = this.q;
            str4.getClass();
            double[] doubleArray = bundle.getDoubleArray(str4);
            if (doubleArray != null) {
                return doubleArray;
            }
            w3a.I(str4);
            throw null;
        }
        if (Intrinsics.c(descriptor2, zpg.f)) {
            String str5 = this.q;
            str5.getClass();
            float[] floatArray = bundle.getFloatArray(str5);
            if (floatArray != null) {
                return floatArray;
            }
            w3a.I(str5);
            throw null;
        }
        if (Intrinsics.c(descriptor2, zpg.g)) {
            return o3a.z(bundle, this.q);
        }
        if (!Intrinsics.c(descriptor2, zpg.h)) {
            return Intrinsics.c(descriptor2, zpg.i) ? o3a.D(bundle, this.q) : dy4Var.deserialize(this);
        }
        String str6 = this.q;
        str6.getClass();
        long[] longArray = bundle.getLongArray(str6);
        if (longArray != null) {
            return longArray;
        }
        w3a.I(str6);
        throw null;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final String z() {
        return o3a.C(this.o, this.q);
    }
}
