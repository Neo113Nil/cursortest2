package androidx.health.platform.client.error;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.proto.u;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.c5g;
import xsna.gzs;
import xsna.izs;
import xsna.ja20;
import xsna.lhg;
import xsna.ro;
import xsna.yup;

/* compiled from: ErrorStatus.kt */
/* loaded from: classes12.dex */
public final class ErrorStatus extends ProtoParcelable<u> {
    public static final Parcelable.Creator<ErrorStatus> CREATOR = new c();
    public final int c;
    public final String d;
    public final bpn0 e = new bpn0(new b());

    /* compiled from: ErrorStatus.kt */
    public static final class a {
        public static ErrorStatus a(int i, String str) {
            int i2;
            Object obj;
            Field[] declaredFields = yup.class.getDeclaredFields();
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(Integer.TYPE)) {
                    arrayList.add(field);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i2 = yup.INTERNAL_ERROR;
                obj = null;
                if (!hasNext) {
                    break;
                }
                try {
                    i2 = ((Integer) ((Field) it.next()).get(null)).intValue();
                } catch (IllegalAccessException unused) {
                }
                arrayList2.add(Integer.valueOf(i2));
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((Number) next).intValue() == i) {
                    obj = next;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i2 = num.intValue();
            }
            return new ErrorStatus(i2, str);
        }
    }

    /* compiled from: ErrorStatus.kt */
    public static final class b extends Lambda implements gzs<u> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final u invoke() {
            u.a y = u.y();
            int i = ErrorStatus.this.c;
            y.j();
            u.t((u) y.c, i);
            String str = ErrorStatus.this.d;
            if (str != null) {
                y.j();
                u.u((u) y.c, str);
            }
            return y.e();
        }
    }

    /* compiled from: ProtoParcelable.kt */
    public static final class c implements Parcelable.Creator<ErrorStatus> {
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.health.platform.client.error.ErrorStatus, androidx.health.platform.client.impl.data.ProtoParcelable] */
        @Override // android.os.Parcelable.Creator
        public final ErrorStatus createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return null;
                }
                u z = u.z(createByteArray);
                return a.a(z.v(), z.x() ? z.w() : null);
            }
            if (readInt != 1) {
                throw new IllegalArgumentException(lhg.a(readInt, "Unknown storage: "));
            }
            izs<byte[], ErrorStatus> izsVar = new izs<byte[], ErrorStatus>() { // from class: androidx.health.platform.client.error.ErrorStatus$special$$inlined$newCreator$connect_client_release$1$1
                @Override // xsna.izs
                public final ErrorStatus invoke(byte[] bArr) {
                    u z2 = u.z(bArr);
                    return ErrorStatus.a.a(z2.v(), z2.x() ? z2.w() : null);
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
        public final ErrorStatus[] newArray(int i) {
            return new ErrorStatus[i];
        }
    }

    public ErrorStatus(@yup int i, String str) {
        this.c = i;
        this.d = str;
    }

    @Override // xsna.m8e0
    public final ja20 d() {
        return (u) this.e.getValue();
    }
}
