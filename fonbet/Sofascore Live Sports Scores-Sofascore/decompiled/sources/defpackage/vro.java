package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class vro extends zzw {
    public final int b;

    public vro(byte[] bArr) {
        Preconditions.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] Z1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            a70.j(e);
            return null;
        }
    }

    public abstract byte[] S1();

    public final boolean equals(Object obj) {
        IObjectWrapper zzd;
        if (!(obj instanceof zzx)) {
            return false;
        }
        try {
            zzx zzxVar = (zzx) obj;
            if (zzxVar.zze() == this.b && (zzd = zzxVar.zzd()) != null) {
                return Arrays.equals(S1(), (byte[]) ObjectWrapper.Z1(zzd));
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        return new ObjectWrapper(S1());
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        return this.b;
    }
}
