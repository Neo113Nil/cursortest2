package androidx.health.platform.client.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.proto.s0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;
import xsna.izs;
import xsna.ja20;
import xsna.lhg;
import xsna.ro;

/* compiled from: RequestContext.kt */
/* loaded from: classes12.dex */
public final class RequestContext extends ProtoParcelable<s0> {
    public static final Parcelable.Creator<RequestContext> CREATOR = new b();
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final bpn0 g = new bpn0(new a());

    /* compiled from: RequestContext.kt */
    public static final class a extends Lambda implements gzs<s0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final s0 invoke() {
            RequestContext requestContext = RequestContext.this;
            s0.a B = s0.B();
            String str = requestContext.c;
            B.j();
            s0.t((s0) B.c, str);
            int i = requestContext.d;
            B.j();
            s0.u((s0) B.c, i);
            String str2 = requestContext.e;
            if (str2 != null) {
                B.j();
                s0.v((s0) B.c, str2);
            }
            boolean z = requestContext.f;
            B.j();
            s0.w((s0) B.c, z);
            return B.e();
        }
    }

    /* compiled from: ProtoParcelable.kt */
    public static final class b implements Parcelable.Creator<RequestContext> {
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.request.RequestContext] */
        @Override // android.os.Parcelable.Creator
        public final RequestContext createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return null;
                }
                s0 C = s0.C(createByteArray);
                return new RequestContext(C.x(), C.A(), C.z(), C.y());
            }
            if (readInt != 1) {
                throw new IllegalArgumentException(lhg.a(readInt, "Unknown storage: "));
            }
            izs<byte[], RequestContext> izsVar = new izs<byte[], RequestContext>() { // from class: androidx.health.platform.client.request.RequestContext$special$$inlined$newCreator$connect_client_release$1$1
                @Override // xsna.izs
                public final RequestContext invoke(byte[] bArr) {
                    s0 C2 = s0.C(bArr);
                    return new RequestContext(C2.x(), C2.A(), C2.z(), C2.y());
                }
            };
            Closeable closeable = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
            try {
                ByteBuffer mapReadOnly = ((SharedMemory) closeable).mapReadOnly();
                byte[] bArr = new byte[mapReadOnly.remaining()];
                mapReadOnly.get(bArr);
                Object invoke = izsVar.invoke(bArr);
                ro.e(closeable, null);
                return (ProtoParcelable) invoke;
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final RequestContext[] newArray(int i) {
            return new RequestContext[i];
        }
    }

    public RequestContext(String str, int i, String str2, boolean z) {
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z;
    }

    @Override // xsna.m8e0
    public final ja20 d() {
        return (s0) this.g.getValue();
    }
}
