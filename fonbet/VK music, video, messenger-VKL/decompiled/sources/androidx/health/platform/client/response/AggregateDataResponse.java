package androidx.health.platform.client.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.proto.u0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import xsna.izs;
import xsna.ja20;
import xsna.lhg;
import xsna.ro;

/* compiled from: AggregateDataResponse.kt */
/* loaded from: classes12.dex */
public final class AggregateDataResponse extends ProtoParcelable<u0> {
    public static final Parcelable.Creator<AggregateDataResponse> CREATOR = new a();
    public final u0 c;

    /* compiled from: ProtoParcelable.kt */
    public static final class a implements Parcelable.Creator<AggregateDataResponse> {
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.response.AggregateDataResponse] */
        @Override // android.os.Parcelable.Creator
        public final AggregateDataResponse createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return null;
                }
                return new AggregateDataResponse(u0.t(createByteArray));
            }
            if (readInt != 1) {
                throw new IllegalArgumentException(lhg.a(readInt, "Unknown storage: "));
            }
            izs<byte[], AggregateDataResponse> izsVar = new izs<byte[], AggregateDataResponse>() { // from class: androidx.health.platform.client.response.AggregateDataResponse$special$$inlined$newCreator$connect_client_release$1$1
                @Override // xsna.izs
                public final AggregateDataResponse invoke(byte[] bArr) {
                    return new AggregateDataResponse(u0.t(bArr));
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
        public final AggregateDataResponse[] newArray(int i) {
            return new AggregateDataResponse[i];
        }
    }

    public AggregateDataResponse(u0 u0Var) {
        this.c = u0Var;
    }

    @Override // xsna.m8e0
    public final ja20 d() {
        return this.c;
    }
}
