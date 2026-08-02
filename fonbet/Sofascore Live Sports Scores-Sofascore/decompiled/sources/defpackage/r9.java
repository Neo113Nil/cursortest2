package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
import com.facebook.internal.d;
import com.google.android.gms.internal.ads.zzhlb;
import com.google.android.gms.internal.ads.zzhlx;
import com.google.android.gms.internal.ads.zziat;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import javax.crypto.AEADBadTagException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class r9 {
    public Object a;
    public Object b;

    public r9(int i, boolean z) {
        switch (i) {
            case 5:
                this.a = new SparseIntArray();
                this.b = new SparseIntArray();
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public static float j(int i, int i2, int i3) {
        return s6a.s((i - i2) / i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public abstract void A();

    public void B() {
        e();
        IntentFilter f = f();
        if (f.countActions() == 0) {
            return;
        }
        d dVar = (d) this.a;
        if (dVar == null) {
            dVar = new d(this, 1);
            this.a = dVar;
        }
        ((ub0) this.b).k.registerReceiver(dVar, f);
    }

    public abstract void C();

    public abstract void D();

    public abstract qo2 E(int i, byte[] bArr);

    public byte[] F(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            zzl.x("ciphertext too short");
            return null;
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((qo2) this.b).I(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i3 = remaining % 16;
            int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
            ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i2);
            order.put(byteBuffer);
            order.position(i4);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(zzhlb.a(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            qo2 qo2Var = (qo2) this.a;
            qo2Var.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != qo2Var.H()) {
                int H = qo2Var.H();
                throw new GeneralSecurityException(me4.g(H, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(H).length() + 36)));
            }
            int remaining2 = byteBuffer.remaining();
            int i5 = remaining2 / 64;
            for (int i6 = 0; i6 < i5 + 1; i6++) {
                ByteBuffer I = qo2Var.I(qo2Var.a + i6, bArr);
                if (i6 == i5) {
                    zziat.c(allocate, byteBuffer, I, remaining2 % 64);
                } else {
                    zziat.c(allocate, byteBuffer, I, 64);
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public abstract void c(ujg ujgVar);

    public abstract void d();

    public void e() {
        d dVar = (d) this.a;
        if (dVar != null) {
            try {
                ((ub0) this.b).k.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter f();

    public abstract int[] g(int i);

    public abstract int h();

    public String i() {
        return null;
    }

    public MenuItem k(MenuItem menuItem) {
        if (!(menuItem instanceof bni)) {
            return menuItem;
        }
        bni bniVar = (bni) menuItem;
        fhh fhhVar = (fhh) this.b;
        if (fhhVar == null) {
            fhhVar = new fhh(0);
            this.b = fhhVar;
        }
        MenuItem menuItem2 = (MenuItem) fhhVar.get(bniVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        jfc jfcVar = new jfc((Context) this.a, bniVar);
        ((fhh) this.b).put(bniVar, jfcVar);
        return jfcVar;
    }

    public int[] l(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public int m(int i, int i2) {
        int o = o(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int o2 = o(i5);
            i3 += o2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = o2;
            }
        }
        return i3 + o > i2 ? i4 + 1 : i4;
    }

    public int n(int i, int i2) {
        int o = o(i);
        if (o == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int o2 = o(i4);
            i3 += o2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = o2;
            }
        }
        if (o + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public abstract int o(int i);

    public String p() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        Intrinsics.i("text");
        throw null;
    }

    public void q() {
        ((SparseIntArray) this.a).clear();
    }

    public abstract void r();

    public boolean s() {
        return ((px0) this.a).b && ((ox0) this.b).e;
    }

    public abstract void u();

    public abstract void x();

    public abstract int[] y(int i);

    public abstract void z(j51 j51Var);

    public void t() {
    }

    public void w() {
    }

    public void v(nx0 nx0Var) {
    }

    public r9(q9k q9kVar, q9k q9kVar2) {
        this.a = q9kVar;
        this.b = q9kVar2;
    }

    public r9(Context context) {
        this.a = context;
    }

    public r9(int i) {
        this.b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.b).add(new kb5());
        }
    }

    public r9(l8d l8dVar) {
        this.a = new px0(this, 0);
        this.b = new ox0(this, l8dVar);
    }

    public r9(byte[] bArr) {
        if (zzhlx.a(1)) {
            this.a = E(1, bArr);
            this.b = E(0, bArr);
        } else {
            zzl.x("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
    }

    public r9(ub0 ub0Var) {
        this.b = ub0Var;
    }
}
