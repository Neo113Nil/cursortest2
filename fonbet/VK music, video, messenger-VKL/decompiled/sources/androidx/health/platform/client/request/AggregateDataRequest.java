package androidx.health.platform.client.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.proto.p0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import xsna.izs;
import xsna.ja20;
import xsna.lhg;
import xsna.ro;

/* compiled from: AggregateDataRequest.kt */
/* loaded from: classes12.dex */
public final class AggregateDataRequest extends ProtoParcelable<p0> {
    public static final Parcelable.Creator<AggregateDataRequest> CREATOR = new a();
    public final p0 c;

    /* compiled from: ProtoParcelable.kt */
    public static final class a implements Parcelable.Creator<AggregateDataRequest> {
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.request.AggregateDataRequest] */
        @Override // android.os.Parcelable.Creator
        public final AggregateDataRequest createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return null;
                }
                return new AggregateDataRequest(p0.y(createByteArray));
            }
            if (readInt != 1) {
                throw new IllegalArgumentException(lhg.a(readInt, "Unknown storage: "));
            }
            izs<byte[], AggregateDataRequest> izsVar = new izs<byte[], AggregateDataRequest>() { // from class: androidx.health.platform.client.request.AggregateDataRequest$special$$inlined$newCreator$connect_client_release$1$1
                @Override // xsna.izs
                public final AggregateDataRequest invoke(byte[] bArr) {
                    return new AggregateDataRequest(p0.y(bArr));
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
        public final AggregateDataRequest[] newArray(int i) {
            return new AggregateDataRequest[i];
        }
    }

    public AggregateDataRequest(p0 p0Var) {
        this.c = p0Var;
    }

    @Override // xsna.m8e0
    public final ja20 d() {
        return this.c;
    }
}
