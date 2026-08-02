package defpackage;

import com.ironsource.U3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class tga implements vfa, Encoder, wf3 {
    public final ArrayList a;
    public final yea b;
    public final Function1 c;
    public final gfa d;
    public String e;
    public String f;
    public final /* synthetic */ int g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tga(yea yeaVar, Function1 function1, int i) {
        this(yeaVar, function1, (char) 0);
        this.g = i;
        yeaVar.getClass();
        function1.getClass();
        switch (i) {
            case 1:
                this(yeaVar, function1, (char) 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                this(yeaVar, function1, (char) 0);
                this.h = new ArrayList();
                break;
            default:
                this.a.add("primitive");
                break;
        }
    }

    @Override // defpackage.wf3
    public final void A(b7f b7fVar, int i, char c) {
        N(L(b7fVar, i), qfa.c(String.valueOf(c)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void B(int i) {
        String str = (String) M();
        str.getClass();
        N(str, qfa.b(Integer.valueOf(i)));
    }

    @Override // defpackage.wf3
    public final void D(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        H(L(serialDescriptor, i), d);
    }

    @Override // defpackage.wf3
    public final void E(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        N(L(serialDescriptor, i), qfa.b(Long.valueOf(j)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void F(String str) {
        str.getClass();
        String str2 = (String) M();
        str2.getClass();
        N(str2, qfa.c(str));
    }

    public final void G(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.a.add(L(serialDescriptor, i));
        if (kSerializer.getDescriptor().b()) {
            l(kSerializer, obj);
        } else if (obj == null) {
            p();
        } else {
            l(kSerializer, obj);
        }
    }

    public final void H(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        N(str, qfa.b(Double.valueOf(d)));
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw yfa.a(Double.valueOf(d), str);
        }
    }

    public final void I(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        N(str, qfa.b(Float.valueOf(f)));
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw yfa.a(Float.valueOf(f), str);
        }
    }

    public final Encoder J(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (ghi.a(serialDescriptor)) {
            return new p4(this, str);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(qfa.a)) {
            return new p4(this, str, serialDescriptor);
        }
        this.a.add(str);
        return this;
    }

    public b K() {
        switch (this.g) {
            case 0:
                b bVar = (b) this.h;
                if (bVar != null) {
                    return bVar;
                }
                a70.p("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new c((LinkedHashMap) this.h);
            default:
                return new a((ArrayList) this.h);
        }
    }

    public final String L(SerialDescriptor serialDescriptor, int i) {
        String valueOf;
        serialDescriptor.getClass();
        int i2 = this.g;
        serialDescriptor.getClass();
        switch (i2) {
            case 2:
                valueOf = String.valueOf(i);
                break;
            default:
                yea yeaVar = this.b;
                yeaVar.getClass();
                hz8.Q(yeaVar, serialDescriptor);
                valueOf = serialDescriptor.e(i);
                break;
        }
        valueOf.getClass();
        return valueOf;
    }

    public final Object M() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new v5h("No tag in stack for requested element");
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    public void N(String str, b bVar) {
        int i = this.g;
        str.getClass();
        bVar.getClass();
        switch (i) {
            case 0:
                if (str != "primitive") {
                    a70.p("This output can only consume primitives with 'primitive' tag");
                    break;
                } else if (((b) this.h) != null) {
                    a70.p("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                    break;
                } else {
                    this.h = bVar;
                    this.c.invoke(bVar);
                    break;
                }
            case 1:
                ((LinkedHashMap) this.h).put(str, bVar);
                break;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), bVar);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final p5c a() {
        return this.b.b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final wf3 b(SerialDescriptor serialDescriptor) {
        tga tgaVar;
        tga tgaVar2;
        serialDescriptor.getClass();
        Function1 u2Var = CollectionsKt.j0(this.a) == null ? this.c : new u2(this, 1);
        mha kind = serialDescriptor.getKind();
        boolean c = Intrinsics.c(kind, nii.g);
        yea yeaVar = this.b;
        if (c || (kind instanceof zze)) {
            tgaVar = new tga(yeaVar, u2Var, 2);
        } else {
            if (Intrinsics.c(kind, nii.h)) {
                SerialDescriptor h = oea.h(serialDescriptor.g(0), yeaVar.b);
                mha kind2 = h.getKind();
                if ((kind2 instanceof d7f) || Intrinsics.c(kind2, p5h.f)) {
                    u2Var.getClass();
                    dha dhaVar = new dha(yeaVar, u2Var, 1);
                    dhaVar.j = true;
                    tgaVar2 = dhaVar;
                } else {
                    if (!yeaVar.a.d) {
                        throw yfa.b(h);
                    }
                    tgaVar = new tga(yeaVar, u2Var, 2);
                }
            } else {
                tgaVar2 = new tga(yeaVar, u2Var, 1);
            }
            tgaVar = tgaVar2;
        }
        String str = this.e;
        if (str != null) {
            if (tgaVar instanceof dha) {
                dha dhaVar2 = (dha) tgaVar;
                dhaVar2.N(U3.i.W, qfa.c(str));
                String str2 = this.f;
                if (str2 == null) {
                    str2 = serialDescriptor.h();
                }
                dhaVar2.N(U3.i.X, qfa.c(str2));
            } else {
                String str3 = this.f;
                if (str3 == null) {
                    str3 = serialDescriptor.h();
                }
                tgaVar.N(str, qfa.c(str3));
            }
            this.e = null;
            this.f = null;
        }
        return tgaVar;
    }

    @Override // defpackage.wf3
    public final void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (!this.a.isEmpty()) {
            M();
        }
        this.c.invoke(K());
    }

    @Override // defpackage.vfa
    public final yea d() {
        return this.b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(double d) {
        H(M(), d);
    }

    @Override // defpackage.wf3
    public final void f(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.a.add(L(serialDescriptor, i));
        l(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        String str = (String) M();
        str.getClass();
        N(str, qfa.b(Byte.valueOf(b)));
    }

    @Override // defpackage.wf3
    public void h(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        switch (this.g) {
            case 1:
                serialDescriptor.getClass();
                kSerializer.getClass();
                if (obj != null || this.d.f) {
                    G(serialDescriptor, i, kSerializer, obj);
                    break;
                }
                break;
            default:
                G(serialDescriptor, i, kSerializer, obj);
                break;
        }
    }

    @Override // defpackage.wf3
    public final void i(b7f b7fVar, int i, short s) {
        N(L(b7fVar, i), qfa.b(Short.valueOf(s)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String str = (String) M();
        str.getClass();
        N(str, qfa.c(serialDescriptor.e(i)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder k(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (CollectionsKt.j0(this.a) == null) {
            return new tga(this.b, this.c, 0).k(serialDescriptor);
        }
        if (this.e != null) {
            this.f = serialDescriptor.h();
        }
        return J(M(), serialDescriptor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0 != defpackage.sv2.a) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r0, defpackage.nii.i) == false) goto L29;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(KSerializer kSerializer, Object obj) {
        String D;
        KSerializer kSerializer2;
        kSerializer.getClass();
        Object j0 = CollectionsKt.j0(this.a);
        yea yeaVar = this.b;
        if (j0 == null) {
            SerialDescriptor h = oea.h(kSerializer.getDescriptor(), yeaVar.b);
            if ((h.getKind() instanceof d7f) || h.getKind() == p5h.f) {
                new tga(yeaVar, this.c, 0).l(kSerializer, obj);
                return;
            }
        }
        boolean z = kSerializer instanceof e7;
        sv2 sv2Var = yeaVar.a.k;
        if (!z) {
            int ordinal = sv2Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    mha kind = kSerializer.getDescriptor().getKind();
                    if (!Intrinsics.c(kind, nii.f)) {
                    }
                    D = aik.D(yeaVar, kSerializer.getDescriptor());
                } else if (ordinal != 2) {
                    zzl.b();
                    return;
                }
            }
            D = null;
        }
        if (z) {
            e7 e7Var = (e7) kSerializer;
            if (obj == null) {
                pvd.A(e7Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            kSerializer2 = mha.n(e7Var, this, obj);
        } else {
            kSerializer2 = kSerializer;
        }
        if (D != null) {
            aik.z(yeaVar, kSerializer, kSerializer2, D);
            aik.A(kSerializer2.getDescriptor().getKind());
            String h2 = kSerializer2.getDescriptor().h();
            this.e = D;
            this.f = h2;
        }
        kSerializer2.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(long j) {
        String str = (String) M();
        str.getClass();
        N(str, qfa.b(Long.valueOf(j)));
    }

    @Override // defpackage.wf3
    public final Encoder n(b7f b7fVar, int i) {
        return J(L(b7fVar, i), b7fVar.g(i));
    }

    @Override // defpackage.wf3
    public final boolean o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.d.a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void p() {
        String str = (String) CollectionsKt.j0(this.a);
        if (str == null) {
            this.c.invoke(JsonNull.INSTANCE);
        } else {
            N(str, JsonNull.INSTANCE);
        }
    }

    @Override // defpackage.wf3
    public final void q(SerialDescriptor serialDescriptor, int i, byte b) {
        serialDescriptor.getClass();
        N(L(serialDescriptor, i), qfa.b(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void r(short s) {
        String str = (String) M();
        str.getClass();
        N(str, qfa.b(Short.valueOf(s)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void s(boolean z) {
        String str = (String) M();
        str.getClass();
        N(str, qfa.a(Boolean.valueOf(z)));
    }

    @Override // defpackage.wf3
    public final void t(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        I(L(serialDescriptor, i), f);
    }

    @Override // defpackage.wf3
    public final void u(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        N(L(serialDescriptor, i), qfa.b(Integer.valueOf(i2)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void v(float f) {
        I(M(), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(char c) {
        String str = (String) M();
        str.getClass();
        N(str, qfa.c(String.valueOf(c)));
    }

    @Override // defpackage.wf3
    public final void x(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        N(L(serialDescriptor, i), qfa.a(Boolean.valueOf(z)));
    }

    @Override // defpackage.wf3
    public final void y(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        N(L(serialDescriptor, i), qfa.c(str));
    }

    @Override // defpackage.vfa
    public final void z(b bVar) {
        bVar.getClass();
        if (this.e == null || (bVar instanceof c)) {
            l(sfa.a, bVar);
        } else {
            aik.i0(this.f, bVar);
            throw null;
        }
    }

    public tga(yea yeaVar, Function1 function1, char c) {
        this.a = new ArrayList();
        this.b = yeaVar;
        this.c = function1;
        this.d = yeaVar.a;
    }
}
