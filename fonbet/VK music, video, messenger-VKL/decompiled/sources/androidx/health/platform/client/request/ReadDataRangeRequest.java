package androidx.health.platform.client.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.proto.r0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import xsna.izs;
import xsna.ja20;
import xsna.lhg;
import xsna.ro;

/* compiled from: ReadDataRangeRequest.kt */
/* loaded from: classes12.dex */
public final class ReadDataRangeRequest extends ProtoParcelable<r0> {
    public static final Parcelable.Creator<ReadDataRangeRequest> CREATOR = new a();
    public final r0 c;

    /* compiled from: ProtoParcelable.kt */
    public static final class a implements Parcelable.Creator<ReadDataRangeRequest> {
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.request.ReadDataRangeRequest] */
        @Override // android.os.Parcelable.Creator
        public final ReadDataRangeRequest createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return null;
                }
                return new ReadDataRangeRequest(r0.A(createByteArray));
            }
            if (readInt != 1) {
                throw new IllegalArgumentException(lhg.a(readInt, "Unknown storage: "));
            }
            izs<byte[], ReadDataRangeRequest> izsVar = new izs<byte[], ReadDataRangeRequest>() { // from class: androidx.health.platform.client.request.ReadDataRangeRequest$special$$inlined$newCreator$connect_client_release$1$1
                @Override // xsna.izs
                public final ReadDataRangeRequest invoke(byte[] bArr) {
                    return new ReadDataRangeRequest(r0.A(bArr));
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
        public final ReadDataRangeRequest[] newArray(int i) {
            return new ReadDataRangeRequest[i];
        }
    }

    public ReadDataRangeRequest(r0 r0Var) {
        this.c = r0Var;
    }

    @Override // xsna.m8e0
    public final ja20 d() {
        return this.c;
    }
}
