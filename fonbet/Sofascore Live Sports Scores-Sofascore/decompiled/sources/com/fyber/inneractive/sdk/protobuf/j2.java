package com.fyber.inneractive.sdk.protobuf;

import defpackage.a70;
import defpackage.zzl;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j2 implements t2 {
    public final d2 a;
    public final o3 b;
    public final boolean c;
    public final j0 d;

    public j2(o3 o3Var, j0 j0Var, d2 d2Var) {
        this.b = o3Var;
        j0Var.getClass();
        this.c = d2Var instanceof GeneratedMessageLite$ExtendableMessage;
        this.d = j0Var;
        this.a = d2Var;
    }

    public final boolean a(s2 s2Var, h0 h0Var, j0 j0Var, n0 n0Var, o3 o3Var, n3 n3Var) {
        byte[] bArr;
        int e = s2Var.e();
        if (e != 11) {
            if ((e & 7) != 2) {
                return s2Var.i();
            }
            d2 d2Var = this.a;
            j0Var.getClass();
            x0 a = h0Var.a(e >>> 3, d2Var);
            if (a == null) {
                o3Var.getClass();
                return o3.a((Object) n3Var, s2Var);
            }
            n0Var.c(a.d, s2Var.b(a.c.getClass(), h0Var));
            return true;
        }
        x0 x0Var = null;
        int i = 0;
        s sVar = null;
        while (s2Var.s() != Integer.MAX_VALUE) {
            int e2 = s2Var.e();
            if (e2 == 16) {
                i = s2Var.c();
                d2 d2Var2 = this.a;
                j0Var.getClass();
                x0Var = h0Var.a(i, d2Var2);
            } else if (e2 == 26) {
                if (x0Var != null) {
                    j0Var.getClass();
                    n0Var.c(x0Var.d, s2Var.b(x0Var.c.getClass(), h0Var));
                } else {
                    sVar = s2Var.a();
                }
            } else if (!s2Var.i()) {
                break;
            }
        }
        if (s2Var.e() != 12) {
            zzl.j("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (sVar != null) {
            if (x0Var != null) {
                j0Var.getClass();
                z0 b = ((t0) x0Var.c.newBuilderForType()).b();
                int size = sVar.size();
                if (size == 0) {
                    bArr = l1.b;
                } else {
                    byte[] bArr2 = new byte[size];
                    sVar.a(size, bArr2);
                    bArr = bArr2;
                }
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                if (!wrap.hasArray()) {
                    a70.p("Direct buffers not yet supported");
                    return false;
                }
                h hVar = new h(wrap);
                p2 p2Var = p2.c;
                p2Var.getClass();
                p2Var.a(b.getClass()).a(b, hVar, h0Var);
                n0Var.c(x0Var.d, b);
                if (hVar.s() != Integer.MAX_VALUE) {
                    zzl.j("Protocol message end-group tag did not match expected tag.");
                    return false;
                }
            } else {
                o3Var.getClass();
                n3Var.a((i << 3) | 2, sVar);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(Object obj) {
        this.b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        int i = n3Var.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < n3Var.a; i3++) {
                int i4 = n3Var.b[i3] >>> 3;
                i2 += b0.a((s) n3Var.c[i3]) + b0.b(3) + b0.c(i4) + b0.b(2) + (b0.b(1) * 2);
            }
            n3Var.d = i2;
            i = i2;
        }
        if (!this.c) {
            return i;
        }
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a() + i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        this.b.getClass();
        ((z0) obj).unknownFields.e = false;
        this.d.getClass();
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int d(Object obj) {
        this.b.getClass();
        int hashCode = ((z0) obj).unknownFields.hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a.hashCode() + (hashCode * 53);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean b(Object obj, Object obj2) {
        this.b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        this.b.getClass();
        if (!n3Var.equals(((z0) obj2).unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.getClass();
        n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.d.getClass();
        return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, Object obj2) {
        o3 o3Var = this.b;
        Class cls = u2.a;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        n3 n3Var2 = ((z0) obj2).unknownFields;
        if (!n3Var2.equals(n3.f)) {
            n3Var = n3.a(n3Var, n3Var2);
        }
        z0Var.unknownFields = n3Var;
        if (this.c) {
            this.d.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (n0Var.a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, c0 c0Var) {
        this.d.getClass();
        Iterator d = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            w0 w0Var = (w0) entry.getKey();
            if (w0Var.c.a() == k4.MESSAGE && !w0Var.d && !w0Var.e) {
                int i = w0Var.b;
                Object value = entry.getValue();
                c0Var.getClass();
                boolean z = value instanceof s;
                b0 b0Var = c0Var.a;
                if (z) {
                    b0Var.b(i, (s) value);
                } else {
                    b0Var.a(i, (d2) value);
                }
            } else {
                a70.r("Found invalid MessageSet item.");
                return;
            }
        }
        this.b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        n3Var.getClass();
        c0Var.getClass();
        if (q4.ASCENDING == q4.DESCENDING) {
            for (int i2 = n3Var.a - 1; i2 >= 0; i2--) {
                int i3 = n3Var.b[i2] >>> 3;
                Object obj2 = n3Var.c[i2];
                boolean z2 = obj2 instanceof s;
                b0 b0Var2 = c0Var.a;
                if (z2) {
                    b0Var2.b(i3, (s) obj2);
                } else {
                    b0Var2.a(i3, (d2) obj2);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < n3Var.a; i4++) {
            int i5 = n3Var.b[i4] >>> 3;
            Object obj3 = n3Var.c[i4];
            boolean z3 = obj3 instanceof s;
            b0 b0Var3 = c0Var.a;
            if (z3) {
                b0Var3.b(i5, (s) obj3);
            } else {
                b0Var3.a(i5, (d2) obj3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[EDGE_INSN: B:32:0x00d2->B:33:0x00d2 BREAK  A[LOOP:1: B:10:0x0066->B:25:0x0066], SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, byte[] bArr, int i, int i2, f fVar) {
        int i3;
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n3 n3Var2 = n3Var;
        n0 ensureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        x0 x0Var = null;
        while (i < i2) {
            int d = g.d(bArr, i, fVar);
            int i4 = fVar.a;
            if (i4 == 11) {
                int i5 = i2;
                f fVar2 = fVar;
                int i6 = 0;
                s sVar = null;
                while (true) {
                    if (d >= i5) {
                        i3 = d;
                        break;
                    }
                    i3 = d + 1;
                    byte b = bArr[d];
                    if (b >= 0) {
                        fVar2.a = b;
                    } else {
                        i3 = g.a(b, bArr, i3, fVar2);
                    }
                    int i7 = fVar2.a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (x0Var != null) {
                                d = g.a(p2.c.a(x0Var.c.getClass()), bArr, i3, i5, fVar2);
                                ensureExtensionsAreMutable.c(x0Var.d, fVar2.c);
                            } else if (i9 == 2) {
                                d = g.a(bArr, i3, fVar2);
                                sVar = (s) fVar2.c;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            d = g.a(i7, bArr, i3, i5, fVar2);
                        }
                    } else if (i9 == 0) {
                        int i10 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 >= 0) {
                            fVar2.a = b2;
                        } else {
                            i10 = g.a(b2, bArr, i10, fVar2);
                        }
                        d = i10;
                        i6 = fVar2.a;
                        j0 j0Var = this.d;
                        h0 h0Var = fVar2.d;
                        d2 d2Var = this.a;
                        j0Var.getClass();
                        x0Var = h0Var.a(i6, d2Var);
                    } else if (i7 != 12) {
                    }
                }
                if (sVar != null) {
                    n3Var2.a((i6 << 3) | 2, sVar);
                }
                i = i3;
                i2 = i5;
                fVar = fVar2;
            } else if ((i4 & 7) == 2) {
                j0 j0Var2 = this.d;
                h0 h0Var2 = fVar.d;
                d2 d2Var2 = this.a;
                j0Var2.getClass();
                x0Var = h0Var2.a(i4 >>> 3, d2Var2);
                if (x0Var != null) {
                    i = g.a(p2.c.a(x0Var.c.getClass()), bArr, d, i2, fVar);
                    ensureExtensionsAreMutable.c(x0Var.d, fVar.c);
                } else {
                    i = g.a(i4, bArr, d, i2, n3Var2, fVar);
                }
            } else {
                i = g.a(i4, bArr, d, i2, fVar);
            }
        }
        if (i == i2) {
            return;
        }
        zzl.j("Failed to parse the message.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) {
        o3 o3Var = this.b;
        j0 j0Var = this.d;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n3 n3Var2 = n3Var;
        j0Var.getClass();
        n0 ensureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (s2Var.s() != Integer.MAX_VALUE) {
            try {
                j2 j2Var = this;
                s2 s2Var2 = s2Var;
                h0 h0Var2 = h0Var;
                if (!j2Var.a(s2Var2, h0Var2, j0Var, ensureExtensionsAreMutable, o3Var, n3Var2)) {
                    break;
                }
                this = j2Var;
                s2Var = s2Var2;
                h0Var = h0Var2;
            } finally {
                z0Var.unknownFields = n3Var2;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        return ((t0) this.a.newBuilderForType()).b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(Object obj) {
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.c();
    }
}
