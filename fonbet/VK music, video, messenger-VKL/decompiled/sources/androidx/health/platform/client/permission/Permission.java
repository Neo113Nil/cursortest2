package androidx.health.platform.client.permission;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.proto.m0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import xsna.izs;
import xsna.ja20;
import xsna.lhg;
import xsna.ro;

/* compiled from: Permission.kt */
/* loaded from: classes12.dex */
public final class Permission extends ProtoParcelable<m0> {
    public static final Parcelable.Creator<Permission> CREATOR = new a();
    public final m0 c;

    /* compiled from: ProtoParcelable.kt */
    public static final class a implements Parcelable.Creator<Permission> {
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.health.platform.client.impl.data.ProtoParcelable, androidx.health.platform.client.permission.Permission] */
        @Override // android.os.Parcelable.Creator
        public final Permission createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return null;
                }
                return new Permission(m0.w(createByteArray));
            }
            if (readInt != 1) {
                throw new IllegalArgumentException(lhg.a(readInt, "Unknown storage: "));
            }
            izs<byte[], Permission> izsVar = new izs<byte[], Permission>() { // from class: androidx.health.platform.client.permission.Permission$special$$inlined$newCreator$connect_client_release$1$1
                @Override // xsna.izs
                public final Permission invoke(byte[] bArr) {
                    return new Permission(m0.w(bArr));
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
        public final Permission[] newArray(int i) {
            return new Permission[i];
        }
    }

    public Permission(m0 m0Var) {
        this.c = m0Var;
    }

    @Override // xsna.m8e0
    public final ja20 d() {
        return this.c;
    }
}
