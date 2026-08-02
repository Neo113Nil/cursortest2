package androidx.health.platform.client.impl.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.OsConstants;
import androidx.health.platform.client.proto.CodedOutputStream;
import androidx.health.platform.client.proto.GeneratedMessageLite;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;
import xsna.ja20;
import xsna.m8e0;
import xsna.s3q0;

/* compiled from: ProtoParcelable.kt */
/* loaded from: classes12.dex */
public abstract class ProtoParcelable<T extends ja20> extends m8e0<T> implements Parcelable {
    public final bpn0 b = new bpn0(new a(this));

    /* compiled from: ProtoParcelable.kt */
    public static final class a extends Lambda implements gzs<byte[]> {
        final /* synthetic */ ProtoParcelable<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProtoParcelable<T> protoParcelable) {
            super(0);
            this.this$0 = protoParcelable;
        }

        @Override // xsna.gzs
        public final byte[] invoke() {
            androidx.health.platform.client.proto.a aVar = (androidx.health.platform.client.proto.a) this.this$0.d();
            aVar.getClass();
            try {
                int e = ((GeneratedMessageLite) aVar).e(null);
                byte[] bArr = new byte[e];
                Logger logger = CodedOutputStream.b;
                CodedOutputStream.a aVar2 = new CodedOutputStream.a(bArr, e);
                ((GeneratedMessageLite) aVar).b(aVar2);
                if (aVar2.X() == 0) {
                    return bArr;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e2) {
                throw new RuntimeException(aVar.f("byte array"), e2);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return (((byte[]) this.b.getValue()).length <= 16384 ? 1 : 0) ^ 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bpn0 bpn0Var = this.b;
        if (((byte[]) bpn0Var.getValue()).length <= 16384) {
            parcel.writeInt(0);
            parcel.writeByteArray((byte[]) bpn0Var.getValue());
            return;
        }
        parcel.writeInt(1);
        byte[] bArr = (byte[]) bpn0Var.getValue();
        SharedMemory create = SharedMemory.create("ProtoParcelable", bArr.length);
        try {
            int i2 = OsConstants.PROT_READ;
            create.setProtect(OsConstants.PROT_WRITE | i2);
            create.mapReadWrite().put(bArr);
            create.setProtect(i2);
            create.writeToParcel(parcel, i);
            s3q0 s3q0Var = s3q0.a;
            create.close();
        } finally {
        }
    }
}
