package androidx.health.platform.client.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.proto.v0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import xsna.izs;
import xsna.ja20;
import xsna.lhg;
import xsna.ro;

/* compiled from: ReadDataRangeResponse.kt */
/* loaded from: classes12.dex */
public final class ReadDataRangeResponse extends ProtoParcelable<v0> {
    public static final Parcelable.Creator<ReadDataRangeResponse> CREATOR = new a();
    public final v0 c;

    /* compiled from: ProtoParcelable.kt */
    public static final class a implements Parcelable.Creator<ReadDataRangeResponse> {
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.response.ReadDataRangeResponse] */
        @Override // android.os.Parcelable.Creator
        public final ReadDataRangeResponse createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return null;
                }
                return new ReadDataRangeResponse(v0.u(createByteArray));
            }
            if (readInt != 1) {
                throw new IllegalArgumentException(lhg.a(readInt, "Unknown storage: "));
            }
            izs<byte[], ReadDataRangeResponse> izsVar = new izs<byte[], ReadDataRangeResponse>() { // from class: androidx.health.platform.client.response.ReadDataRangeResponse$special$$inlined$newCreator$connect_client_release$1$1
                @Override // xsna.izs
                public final ReadDataRangeResponse invoke(byte[] bArr) {
                    return new ReadDataRangeResponse(v0.u(bArr));
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
        public final ReadDataRangeResponse[] newArray(int i) {
            return new ReadDataRangeResponse[i];
        }
    }

    public ReadDataRangeResponse(v0 v0Var) {
        this.c = v0Var;
    }

    @Override // xsna.m8e0
    public final ja20 d() {
        return this.c;
    }
}
