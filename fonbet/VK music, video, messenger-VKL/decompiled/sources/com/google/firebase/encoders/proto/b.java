package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.encoders.proto.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.d2z;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.p8e0;
import xsna.rq;
import xsna.sq;
import xsna.tjr0;
import xsna.w8e0;
import xsna.z8e0;

/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes13.dex */
public final class b implements np70 {
    public static final Charset f = Charset.forName(C.UTF8_NAME);
    public static final f7r g;
    public static final f7r h;
    public static final w8e0 i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final mp70<Object> d;
    public final z8e0 e = new z8e0(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        com.google.firebase.encoders.proto.a b = com.google.firebase.encoders.proto.a.b();
        b.a = 1;
        g = new f7r("key", sq.a(rq.f(Protobuf.class, b.a())));
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 2;
        h = new f7r("value", sq.a(rq.f(Protobuf.class, b2.a())));
        i = new w8e0();
    }

    public b(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, mp70 mp70Var) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = mp70Var;
    }

    public static int f(f7r f7rVar) {
        Protobuf protobuf = (Protobuf) f7rVar.a(Protobuf.class);
        if (protobuf != null) {
            return ((a.C0136a) protobuf).d;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(@NonNull f7r f7rVar, double d, boolean z) throws IOException {
        if (z && d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return;
        }
        g((f(f7rVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, @Nullable Object obj) throws IOException {
        d(f7rVar, obj, true);
        return this;
    }

    public final void b(@NonNull f7r f7rVar, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) f7rVar.a(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int[] iArr = a.a;
        a.C0136a c0136a = (a.C0136a) protobuf;
        int i3 = c0136a.d;
        int i4 = iArr[c0136a.e.ordinal()];
        if (i4 == 1) {
            g(i3 << 3);
            g(i2);
        } else if (i4 == 2) {
            g(i3 << 3);
            g((i2 << 1) ^ (i2 >> 31));
        } else {
            if (i4 != 3) {
                return;
            }
            g((i3 << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(@NonNull f7r f7rVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) f7rVar.a(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int[] iArr = a.a;
        a.C0136a c0136a = (a.C0136a) protobuf;
        int i2 = c0136a.d;
        int i3 = iArr[c0136a.e.ordinal()];
        if (i3 == 1) {
            g(i2 << 3);
            h(j);
        } else if (i3 == 2) {
            g(i2 << 3);
            h((j >> 63) ^ (j << 1));
        } else {
            if (i3 != 3) {
                return;
            }
            g((i2 << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void d(@NonNull f7r f7rVar, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            g((f(f7rVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            g(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(f7rVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(i, f7rVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(f7rVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            g((f(f7rVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(f7rVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(f7rVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            g((f(f7rVar) << 3) | 2);
            g(bArr.length);
            this.a.write(bArr);
            return;
        }
        mp70 mp70Var = (mp70) this.b.get(obj.getClass());
        if (mp70Var != null) {
            e(mp70Var, f7rVar, obj, z);
            return;
        }
        tjr0 tjr0Var = (tjr0) this.c.get(obj.getClass());
        if (tjr0Var != null) {
            z8e0 z8e0Var = this.e;
            z8e0Var.a = false;
            z8e0Var.c = f7rVar;
            z8e0Var.b = z;
            tjr0Var.encode(obj, z8e0Var);
            return;
        }
        if (obj instanceof p8e0) {
            b(f7rVar, ((p8e0) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(f7rVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.d, f7rVar, obj, z);
        }
    }

    public final void e(mp70 mp70Var, f7r f7rVar, Object obj, boolean z) throws IOException {
        d2z d2zVar = new d2z();
        d2zVar.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = d2zVar;
            try {
                mp70Var.encode(obj, this);
                this.a = outputStream;
                long j = d2zVar.b;
                d2zVar.close();
                if (z && j == 0) {
                    return;
                }
                g((f(f7rVar) << 3) | 2);
                h(j);
                mp70Var.encode(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                d2zVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void h(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, double d) throws IOException {
        a(f7rVar, d, true);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, int i2) throws IOException {
        b(f7rVar, i2, true);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, long j) throws IOException {
        c(f7rVar, j, true);
        return this;
    }

    @Override // xsna.np70
    @NonNull
    public final np70 add(@NonNull f7r f7rVar, boolean z) throws IOException {
        b(f7rVar, z ? 1 : 0, true);
        return this;
    }
}
