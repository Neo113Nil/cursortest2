package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eqg extends k53 {
    public final Bundle o;
    public final bqg p;
    public String q;

    public eqg(Bundle bundle, bqg bqgVar) {
        bqgVar.getClass();
        this.o = bundle;
        this.p = bqgVar;
        this.q = "";
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void B(int i) {
        r4a.E(this.q, i, this.o);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void F(String str) {
        str.getClass();
        r4a.H(this.q, this.o, str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final p5c a() {
        return this.p.a;
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final wf3 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean c = Intrinsics.c(this.q, "");
        bqg bqgVar = this.p;
        if (c) {
            bqgVar.getClass();
            return this;
        }
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        r4a.G(this.o, this.q, E);
        bqgVar.getClass();
        return new eqg(E, bqgVar);
    }

    @Override // defpackage.k53
    public final void c0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        this.q = serialDescriptor.e(i);
        this.p.getClass();
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void e(double d) {
        String str = this.q;
        str.getClass();
        this.o.putDouble(str, d);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        r4a.E(this.q, b, this.o);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void j(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        r4a.E(this.q, i, this.o);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        if (Intrinsics.c(descriptor, aqg.a)) {
            rp2 rp2Var = rp2.a;
            obj.getClass();
            rp2.b(this, (CharSequence) obj);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.b)) {
            qr4 qr4Var = qr4.b;
            obj.getClass();
            qr4Var.serialize(this, (Parcelable) obj);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.c)) {
            oq4 oq4Var = oq4.b;
            obj.getClass();
            oq4Var.serialize(this, (Serializable) obj);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.d)) {
            m5h m5hVar = yl9.a;
            obj.getClass();
            IBinder iBinder = (IBinder) obj;
            iBinder.getClass();
            if (!(this instanceof eqg)) {
                ogj.h(ml4.S(yl9.a.a, this));
                return;
            }
            String str = this.q;
            str.getClass();
            this.o.putBinder(str, iBinder);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.i) || Intrinsics.c(descriptor, aqg.j)) {
            m5h m5hVar2 = op2.a;
            obj.getClass();
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            charSequenceArr.getClass();
            if (!(this instanceof eqg)) {
                ogj.h(ml4.S(op2.a.a, this));
                return;
            }
            String str2 = this.q;
            str2.getClass();
            this.o.putCharSequenceArray(str2, charSequenceArr);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.k) || Intrinsics.c(descriptor, aqg.l)) {
            qp2 qp2Var = qp2.a;
            obj.getClass();
            qp2Var.serialize(this, (List) obj);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.e) || Intrinsics.c(descriptor, aqg.f)) {
            m5h m5hVar3 = a9e.a;
            obj.getClass();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            parcelableArr.getClass();
            if (!(this instanceof eqg)) {
                ogj.h(ml4.S(a9e.a.a, this));
                return;
            }
            String str3 = this.q;
            str3.getClass();
            this.o.putParcelableArray(str3, parcelableArr);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.g) || Intrinsics.c(descriptor, aqg.h)) {
            b9e b9eVar = b9e.a;
            obj.getClass();
            b9eVar.serialize(this, (List) obj);
            return;
        }
        if (Intrinsics.c(descriptor, aqg.m) || Intrinsics.c(descriptor, aqg.n) || Intrinsics.c(descriptor, aqg.o)) {
            exh exhVar = exh.a;
            obj.getClass();
            exhVar.serialize(this, (SparseArray) obj);
            return;
        }
        SerialDescriptor descriptor2 = kSerializer.getDescriptor();
        boolean c = Intrinsics.c(descriptor2, zpg.a);
        Bundle bundle = this.o;
        if (c) {
            String str4 = this.q;
            obj.getClass();
            str4.getClass();
            bundle.putIntegerArrayList(str4, h5a.R((List) obj));
            return;
        }
        if (Intrinsics.c(descriptor2, zpg.b)) {
            String str5 = this.q;
            obj.getClass();
            r4a.I(bundle, str5, (List) obj);
            return;
        }
        if (Intrinsics.c(descriptor2, zpg.c)) {
            String str6 = this.q;
            obj.getClass();
            str6.getClass();
            bundle.putBooleanArray(str6, (boolean[]) obj);
            return;
        }
        if (Intrinsics.c(descriptor2, zpg.d)) {
            String str7 = this.q;
            obj.getClass();
            str7.getClass();
            bundle.putCharArray(str7, (char[]) obj);
            return;
        }
        if (Intrinsics.c(descriptor2, zpg.e)) {
            String str8 = this.q;
            obj.getClass();
            str8.getClass();
            bundle.putDoubleArray(str8, (double[]) obj);
            return;
        }
        if (Intrinsics.c(descriptor2, zpg.f)) {
            String str9 = this.q;
            obj.getClass();
            str9.getClass();
            bundle.putFloatArray(str9, (float[]) obj);
            return;
        }
        if (Intrinsics.c(descriptor2, zpg.g)) {
            String str10 = this.q;
            obj.getClass();
            str10.getClass();
            bundle.putIntArray(str10, (int[]) obj);
            return;
        }
        if (Intrinsics.c(descriptor2, zpg.h)) {
            String str11 = this.q;
            obj.getClass();
            str11.getClass();
            bundle.putLongArray(str11, (long[]) obj);
            return;
        }
        if (!Intrinsics.c(descriptor2, zpg.i)) {
            kSerializer.serialize(this, obj);
            return;
        }
        String str12 = this.q;
        obj.getClass();
        str12.getClass();
        bundle.putStringArray(str12, (String[]) obj);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void m(long j) {
        String str = this.q;
        str.getClass();
        this.o.putLong(str, j);
    }

    @Override // defpackage.wf3
    public final boolean o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.p.getClass();
        return false;
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void p() {
        String str = this.q;
        str.getClass();
        this.o.putString(str, null);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void r(short s) {
        r4a.E(this.q, s, this.o);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void s(boolean z) {
        String str = this.q;
        str.getClass();
        this.o.putBoolean(str, z);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void v(float f) {
        String str = this.q;
        str.getClass();
        this.o.putFloat(str, f);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void w(char c) {
        String str = this.q;
        str.getClass();
        this.o.putChar(str, c);
    }
}
