package ug;

import androidx.appcompat.widget.y;
import androidx.transition.n0;
import com.android.billingclient.api.l0;
import f3.x;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import tg.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r extends x implements tg.k {

    /* renamed from: a, reason: collision with root package name */
    public final tg.c f24299a;

    /* renamed from: b, reason: collision with root package name */
    public final w f24300b;

    /* renamed from: c, reason: collision with root package name */
    public final u f24301c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.d f24302d;

    /* renamed from: e, reason: collision with root package name */
    public int f24303e;

    /* renamed from: f, reason: collision with root package name */
    public com.android.billingclient.api.a f24304f;

    /* renamed from: g, reason: collision with root package name */
    public final i f24305g;

    public r(tg.c json, w mode, u lexer, qg.g descriptor, com.android.billingclient.api.a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f24299a = json;
        this.f24300b = mode;
        this.f24301c = lexer;
        this.f24302d = json.f23938b;
        this.f24303e = -1;
        this.f24304f = aVar;
        this.f24305g = json.f23937a.f1006c ? null : new i(descriptor);
    }

    @Override // tg.k
    public final tg.c A() {
        return this.f24299a;
    }

    @Override // f3.x, rg.b
    public final byte B() {
        u uVar = this.f24301c;
        long h10 = uVar.h();
        byte b10 = (byte) h10;
        if (h10 == b10) {
            return b10;
        }
        u.m(uVar, "Failed to parse byte for input '" + h10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // f3.x, rg.b
    public final short C() {
        u uVar = this.f24301c;
        long h10 = uVar.h();
        short s8 = (short) h10;
        if (h10 == s8) {
            return s8;
        }
        u.m(uVar, "Failed to parse short for input '" + h10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // f3.x, rg.b
    public final float D() {
        u uVar = this.f24301c;
        String j = uVar.j();
        try {
            float parseFloat = Float.parseFloat(j);
            y yVar = this.f24299a.f23937a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            j.s(uVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, d9.e.e('\'', "Failed to parse type 'float' for input '", j), 0, null, 6);
            throw null;
        }
    }

    @Override // f3.x, rg.b
    public final double E() {
        u uVar = this.f24301c;
        String j = uVar.j();
        try {
            double parseDouble = Double.parseDouble(j);
            y yVar = this.f24299a.f23937a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            j.s(uVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, d9.e.e('\'', "Failed to parse type 'double' for input '", j), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    @Override // f3.x, rg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(og.a deserializer) {
        String message;
        tg.c cVar = this.f24299a;
        u uVar = this.f24301c;
        n0 n0Var = uVar.f24317b;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
        } catch (og.b e7) {
            message = e7.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.A(message, "at path", false)) {
            }
        }
        if (!(deserializer instanceof sg.b)) {
            return deserializer.a(this);
        }
        y yVar = cVar.f23937a;
        String i5 = j.i(((og.d) ((sg.b) deserializer)).d(), cVar);
        String o3 = uVar.o(i5);
        String str = null;
        if (o3 != null) {
            try {
                og.a n9 = k2.x.n((sg.b) deserializer, this, o3);
                Intrinsics.checkNotNull(n9, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                com.android.billingclient.api.a aVar = new com.android.billingclient.api.a(10);
                aVar.f3966b = i5;
                this.f24304f = aVar;
                return n9.a(this);
            } catch (og.f e9) {
                String message2 = e9.getMessage();
                Intrinsics.checkNotNull(message2);
                String N = StringsKt.N(StringsKt.W(message2, '\n'), ".");
                String message3 = e9.getMessage();
                Intrinsics.checkNotNull(message3);
                u.m(uVar, N, 0, StringsKt.T('\n', message3, ""), 2);
                throw null;
            }
        }
        y yVar2 = cVar.f23937a;
        String i10 = j.i(((og.d) ((sg.b) deserializer)).d(), cVar);
        tg.m j = j();
        String a7 = ((og.d) ((sg.b) deserializer)).d().a();
        if (!(j instanceof tg.y)) {
            throw j.e(-1, "Expected " + Reflection.getOrCreateKotlinClass(tg.y.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(j.getClass()).getSimpleName() + " as the serialized body of " + a7 + " at element: " + n0Var.d(), j.toString());
        }
        tg.y yVar3 = (tg.y) j;
        tg.m mVar = (tg.m) yVar3.get(i10);
        if (mVar != null) {
            c0 a10 = tg.n.a(mVar);
            Intrinsics.checkNotNullParameter(a10, "<this>");
            if (!(a10 instanceof tg.v)) {
                str = a10.a();
            }
        }
        try {
            og.a n10 = k2.x.n((sg.b) deserializer, this, str);
            Intrinsics.checkNotNull(n10, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return j.q(cVar, i10, yVar3, n10);
        } catch (og.f e10) {
            String message4 = e10.getMessage();
            Intrinsics.checkNotNull(message4);
            throw j.e(-1, message4, yVar3.toString());
        }
        message = e7.getMessage();
        Intrinsics.checkNotNull(message);
        if (!StringsKt.A(message, "at path", false)) {
            throw e7;
        }
        throw new og.b(e7.f21221a, e7.getMessage() + " at path: " + n0Var.d(), e7);
    }

    @Override // f3.x, rg.b
    public final boolean c() {
        boolean z5;
        boolean z7;
        u uVar = this.f24301c;
        int s8 = uVar.s();
        String str = uVar.f24320e;
        if (s8 == str.length()) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(s8) == '\"') {
            s8++;
            z5 = true;
        } else {
            z5 = false;
        }
        int r5 = uVar.r(s8);
        if (r5 >= str.length() || r5 == -1) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        int i5 = r5 + 1;
        int charAt = str.charAt(r5) | ' ';
        if (charAt == 102) {
            uVar.c(i5, "alse");
            z7 = false;
        } else {
            if (charAt != 116) {
                u.m(uVar, "Expected valid boolean literal prefix, but had '" + uVar.j() + '\'', 0, null, 6);
                throw null;
            }
            uVar.c(i5, "rue");
            z7 = true;
        }
        if (!z5) {
            return z7;
        }
        if (uVar.f24316a == str.length()) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(uVar.f24316a) == '\"') {
            uVar.f24316a++;
            return z7;
        }
        u.m(uVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // f3.x, rg.b
    public final char d() {
        u uVar = this.f24301c;
        String j = uVar.j();
        if (j.length() == 1) {
            return j.charAt(0);
        }
        u.m(uVar, d9.e.e('\'', "Expected single char, but got '", j), 0, null, 6);
        throw null;
    }

    @Override // f3.x, rg.a
    public final void g(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int f6 = descriptor.f();
        tg.c cVar = this.f24299a;
        if (f6 == 0 && j.m(descriptor, cVar)) {
            while (z(descriptor) != -1) {
            }
        }
        u uVar = this.f24301c;
        if (uVar.t()) {
            y yVar = cVar.f23937a;
            j.n(uVar, "");
            throw null;
        }
        uVar.g(this.f24300b.f24330b);
        n0 n0Var = uVar.f24317b;
        int i5 = n0Var.f2733b;
        int[] iArr = (int[]) n0Var.f2735d;
        if (iArr[i5] == -2) {
            iArr[i5] = -1;
            n0Var.f2733b = i5 - 1;
        }
        int i10 = n0Var.f2733b;
        if (i10 != -1) {
            n0Var.f2733b = i10 - 1;
        }
    }

    @Override // f3.x, rg.b
    public final rg.b i(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (t.a(descriptor)) {
            return new g(this.f24301c, this.f24299a);
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // tg.k
    public final tg.m j() {
        return new l0(this.f24299a.f23937a, this.f24301c).g();
    }

    @Override // f3.x, rg.b
    public final int l() {
        u uVar = this.f24301c;
        long h10 = uVar.h();
        int i5 = (int) h10;
        if (h10 == i5) {
            return i5;
        }
        u.m(uVar, "Failed to parse int for input '" + h10 + '\'', 0, null, 6);
        throw null;
    }

    @Override // rg.a
    public final c4.d n() {
        return this.f24302d;
    }

    @Override // f3.x, rg.b
    public final int r(qg.g enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        u uVar = this.f24301c;
        return j.l(enumDescriptor, this.f24299a, uVar.i(), " at path " + uVar.f24317b.d());
    }

    @Override // f3.x, rg.b
    public final String s() {
        return this.f24301c.i();
    }

    @Override // f3.x, rg.a
    public final Object u(qg.g descriptor, int i5, og.a deserializer, Object obj) {
        n0 n0Var = this.f24301c.f24317b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z5 = this.f24300b == w.f24325e && (i5 & 1) == 0;
        if (z5) {
            int[] iArr = (int[]) n0Var.f2735d;
            int i10 = n0Var.f2733b;
            if (iArr[i10] == -2) {
                ((Object[]) n0Var.f2734c)[i10] = k.f24276a;
            }
        }
        Object u10 = super.u(descriptor, i5, deserializer, obj);
        if (z5) {
            int[] iArr2 = (int[]) n0Var.f2735d;
            int i11 = n0Var.f2733b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                n0Var.f2733b = i12;
                if (i12 == ((Object[]) n0Var.f2734c).length) {
                    n0Var.h();
                }
            }
            Object[] objArr = (Object[]) n0Var.f2734c;
            int i13 = n0Var.f2733b;
            objArr[i13] = u10;
            ((int[]) n0Var.f2735d)[i13] = -2;
        }
        return u10;
    }

    @Override // f3.x, rg.b
    public final long v() {
        return this.f24301c.h();
    }

    @Override // f3.x, rg.b
    public final rg.a w(qg.g sd2) {
        Intrinsics.checkNotNullParameter(sd2, "descriptor");
        tg.c cVar = this.f24299a;
        w r5 = j.r(sd2, cVar);
        u uVar = this.f24301c;
        n0 n0Var = uVar.f24317b;
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i5 = n0Var.f2733b + 1;
        n0Var.f2733b = i5;
        if (i5 == ((Object[]) n0Var.f2734c).length) {
            n0Var.h();
        }
        ((Object[]) n0Var.f2734c)[i5] = sd2;
        uVar.g(r5.f24329a);
        if (uVar.p() != 4) {
            int ordinal = r5.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new r(this.f24299a, r5, uVar, sd2, this.f24304f) : (this.f24300b == r5 && cVar.f23937a.f1006c) ? this : new r(this.f24299a, r5, uVar, sd2, this.f24304f);
        }
        u.m(uVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // f3.x, rg.b
    public final boolean x() {
        i iVar = this.f24305g;
        if (!(iVar != null ? iVar.f24274b : false)) {
            u uVar = this.f24301c;
            int r5 = uVar.r(uVar.s());
            String str = uVar.f24320e;
            int length = str.length() - r5;
            boolean z5 = false;
            if (length >= 4 && r5 != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        if ("null".charAt(i5) != str.charAt(r5 + i5)) {
                            break;
                        }
                        i5++;
                    } else if (length <= 4 || j.h(str.charAt(r5 + 4)) != 0) {
                        z5 = true;
                        uVar.f24316a = r5 + 4;
                    }
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        r1 = r3.f2733b;
        r5 = (int[]) r3.f2735d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        if (r5[r1] != (-2)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        r5[r1] = -1;
        r3.f2733b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        r1 = r3.f2733b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        if (r1 == (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
    
        r3.f2733b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "key");
        r1 = kotlin.text.StringsKt.I(r4.subSequence(0, r2.f24316a).toString(), r6, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        throw new ug.h("Encountered an unknown key '" + r6 + "' at offset " + r1 + " at path: " + r3.d() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) ug.j.o(r1, r4)), 0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // rg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z(qg.g descriptor) {
        u uVar = this.f24301c;
        n0 n0Var = uVar.f24317b;
        String str = uVar.f24320e;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        w wVar = this.f24300b;
        int ordinal = wVar.ordinal();
        char c2 = ':';
        int i5 = 0;
        r10 = false;
        boolean z5 = false;
        tg.c cVar = this.f24299a;
        byte b10 = 1;
        int i10 = -1;
        if (ordinal == 0) {
            boolean t3 = uVar.t();
            while (true) {
                boolean b11 = uVar.b();
                byte b12 = b10;
                i iVar = this.f24305g;
                if (b11) {
                    String key = uVar.d();
                    uVar.g(c2);
                    int k6 = j.k(descriptor, cVar, key);
                    if (k6 != -3) {
                        if (iVar != null) {
                            sg.t tVar = iVar.f24273a;
                            if (k6 < 64) {
                                tVar.f23694c |= 1 << k6;
                            } else {
                                int i11 = (k6 >>> 6) - 1;
                                long[] jArr = tVar.f23695d;
                                jArr[i11] = jArr[i11] | (1 << (k6 & 63));
                            }
                        }
                        i10 = k6;
                    } else {
                        if (!j.m(descriptor, cVar)) {
                            com.android.billingclient.api.a aVar = this.f24304f;
                            if (aVar == null || !Intrinsics.areEqual(aVar.f3966b, key)) {
                                break;
                            }
                            aVar.f3966b = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte p10 = uVar.p();
                        byte b13 = 6;
                        if (p10 == 8 || p10 == 6) {
                            while (true) {
                                byte p11 = uVar.p();
                                b10 = b12;
                                if (p11 == b10) {
                                    uVar.d();
                                } else {
                                    if (p11 == 8 || p11 == b13) {
                                        arrayList.add(Byte.valueOf(p11));
                                    } else {
                                        if (p11 == 9) {
                                            if (((Number) CollectionsKt.K(arrayList)).byteValue() != 8) {
                                                throw j.e(uVar.f24316a, "found ] instead of } at path: " + n0Var, str);
                                            }
                                            z.s(arrayList);
                                        } else if (p11 == 7) {
                                            if (((Number) CollectionsKt.K(arrayList)).byteValue() != 6) {
                                                throw j.e(uVar.f24316a, "found } instead of ] at path: " + n0Var, str);
                                            }
                                            z.s(arrayList);
                                        } else if (p11 == 10) {
                                            u.m(uVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        b13 = 6;
                                    }
                                    uVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b12 = b10;
                            }
                        } else {
                            uVar.j();
                            b10 = b12;
                        }
                        t3 = uVar.t();
                        c2 = ':';
                    }
                } else {
                    if (t3) {
                        y yVar = cVar.f23937a;
                        j.n(uVar, "object");
                        throw null;
                    }
                    if (iVar != null) {
                        sg.t tVar2 = iVar.f24273a;
                        k2.v vVar = tVar2.f23693b;
                        qg.g gVar = tVar2.f23692a;
                        int f6 = gVar.f();
                        while (true) {
                            long j = tVar2.f23694c;
                            long j6 = -1;
                            if (j != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                tVar2.f23694c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) vVar.invoke(gVar, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i10 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (f6 > 64) {
                                long[] jArr2 = tVar2.f23695d;
                                int length = jArr2.length;
                                loop3: while (i5 < length) {
                                    int i12 = i5 + 1;
                                    int i13 = i12 * 64;
                                    long j10 = jArr2[i5];
                                    while (j10 != j6) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                                        j10 |= 1 << numberOfTrailingZeros2;
                                        i10 = numberOfTrailingZeros2 + i13;
                                        if (((Boolean) vVar.invoke(gVar, Integer.valueOf(i10))).booleanValue()) {
                                            jArr2[i5] = j10;
                                            break loop3;
                                        }
                                        j6 = -1;
                                    }
                                    jArr2[i5] = j10;
                                    i5 = i12;
                                    j6 = -1;
                                }
                            }
                        }
                    }
                    i10 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean t5 = uVar.t();
            if (uVar.b()) {
                int i14 = this.f24303e;
                if (i14 != -1 && !t5) {
                    u.m(uVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i10 = i14 + 1;
                this.f24303e = i10;
            } else if (t5) {
                y yVar2 = cVar.f23937a;
                j.n(uVar, "array");
                throw null;
            }
        } else {
            int i15 = this.f24303e;
            Object[] objArr = i15 % 2 != 0;
            if (objArr != true) {
                uVar.g(':');
            } else if (i15 != -1) {
                z5 = uVar.t();
            }
            if (uVar.b()) {
                if (objArr != false) {
                    if (this.f24303e == -1) {
                        int i16 = uVar.f24316a;
                        if (z5) {
                            u.m(uVar, "Unexpected leading comma", i16, null, 4);
                            throw null;
                        }
                    } else {
                        int i17 = uVar.f24316a;
                        if (!z5) {
                            u.m(uVar, "Expected comma after the key-value pair", i17, null, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.f24303e + 1;
                this.f24303e = i10;
            } else if (z5) {
                y yVar3 = cVar.f23937a;
                j.n(uVar, "object");
                throw null;
            }
        }
        if (wVar != w.f24325e) {
            ((int[]) n0Var.f2735d)[n0Var.f2733b] = i10;
        }
        return i10;
    }
}
