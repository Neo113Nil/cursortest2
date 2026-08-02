package defpackage;

import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nff implements tjd {
    public static final Charset e = Charset.forName(C.UTF8_NAME);
    public static final nz7 f = new nz7(U3.i.W, fn0.q(fn0.o(iff.class, new ql0(1))));
    public static final nz7 g = new nz7(U3.i.X, fn0.q(fn0.o(iff.class, new ql0(2))));
    public static final ifa h = new ifa(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final off d = new off(this);

    public nff(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int k(nz7 nz7Var) {
        iff iffVar = (iff) ((Annotation) nz7Var.b.get(iff.class));
        if (iffVar != null) {
            return iffVar.tag();
        }
        throw new mn5("Field has no @Protobuf config");
    }

    @Override // defpackage.tjd
    public final tjd a(nz7 nz7Var, Object obj) {
        i(nz7Var, obj, true);
        return this;
    }

    public final void b(nz7 nz7Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((k(nz7Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(nz7 nz7Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        iff iffVar = (iff) ((Annotation) nz7Var.b.get(iff.class));
        if (iffVar == null) {
            throw new mn5("Field has no @Protobuf config");
        }
        int ordinal = iffVar.intEncoding().ordinal();
        if (ordinal == 0) {
            l(iffVar.tag() << 3);
            l(i);
        } else if (ordinal == 1) {
            l(iffVar.tag() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((iffVar.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // defpackage.tjd
    public final tjd d(nz7 nz7Var, boolean z) {
        c(nz7Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.tjd
    public final tjd e(nz7 nz7Var, int i) {
        c(nz7Var, i, true);
        return this;
    }

    @Override // defpackage.tjd
    public final tjd f(nz7 nz7Var, double d) {
        b(nz7Var, d, true);
        return this;
    }

    @Override // defpackage.tjd
    public final tjd g(nz7 nz7Var, long j) {
        h(nz7Var, j, true);
        return this;
    }

    public final void h(nz7 nz7Var, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        iff iffVar = (iff) ((Annotation) nz7Var.b.get(iff.class));
        if (iffVar == null) {
            throw new mn5("Field has no @Protobuf config");
        }
        int ordinal = iffVar.intEncoding().ordinal();
        if (ordinal == 0) {
            l(iffVar.tag() << 3);
            m(j);
        } else if (ordinal == 1) {
            l(iffVar.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((iffVar.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(nz7 nz7Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(nz7Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(e);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(nz7Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(h, nz7Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(nz7Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            l((k(nz7Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(nz7Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(nz7Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(nz7Var) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        sjd sjdVar = (sjd) this.b.get(obj.getClass());
        if (sjdVar != null) {
            j(sjdVar, nz7Var, obj, z);
            return;
        }
        hkk hkkVar = (hkk) this.c.get(obj.getClass());
        if (hkkVar != null) {
            off offVar = this.d;
            offVar.a = false;
            offVar.c = nz7Var;
            offVar.b = z;
            hkkVar.a(obj, offVar);
            return;
        }
        if (obj instanceof yef) {
            c(nz7Var, ((yef) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            c(nz7Var, ((Enum) obj).ordinal(), true);
        } else {
            j(wkn.k, nz7Var, obj, z);
        }
    }

    public final void j(sjd sjdVar, nz7 nz7Var, Object obj, boolean z) {
        x5b x5bVar = new x5b();
        x5bVar.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = x5bVar;
            try {
                sjdVar.a(obj, this);
                this.a = outputStream;
                long j = x5bVar.a;
                x5bVar.close();
                if (z && j == 0) {
                    return;
                }
                l((k(nz7Var) << 3) | 2);
                m(j);
                sjdVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                x5bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                return;
            } else {
                outputStream.write((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                return;
            } else {
                outputStream.write((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                j >>>= 7;
            }
        }
    }
}
