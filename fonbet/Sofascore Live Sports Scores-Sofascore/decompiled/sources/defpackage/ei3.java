package defpackage;

import android.media.MediaCodec;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zziv;
import com.google.android.gms.internal.ads.zziy;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ei3 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public static ViewPager2 c(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        yhk.r(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    public static c78 e(c78 c78Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c78Var.c) {
            c78Var = (c78) c78Var.e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (c78Var.c - j));
            zo zoVar = (zo) c78Var.d;
            byteBuffer.put(zoVar.a, ((int) (j - c78Var.b)) + zoVar.b, min);
            i -= min;
            j += min;
            if (j == c78Var.c) {
                c78Var = (c78) c78Var.e;
            }
        }
        return c78Var;
    }

    public static c78 f(c78 c78Var, long j, byte[] bArr, int i) {
        while (j >= c78Var.c) {
            c78Var = (c78) c78Var.e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c78Var.c - j));
            zo zoVar = (zo) c78Var.d;
            System.arraycopy(zoVar.a, ((int) (j - c78Var.b)) + zoVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c78Var.c) {
                c78Var = (c78) c78Var.e;
            }
        }
        return c78Var;
    }

    public static c78 g(c78 c78Var, hm4 hm4Var, bm2 bm2Var, nkk nkkVar) {
        if (hm4Var.i(1073741824)) {
            long j = bm2Var.b;
            int i = 1;
            nkkVar.B(1);
            c78 f = f(c78Var, j, nkkVar.a, 1);
            long j2 = j + 1;
            byte b = nkkVar.a[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            d74 d74Var = hm4Var.g;
            byte[] bArr = d74Var.a;
            if (bArr == null) {
                d74Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c78Var = f(f, j2, d74Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                nkkVar.B(2);
                c78Var = f(c78Var, j3, nkkVar.a, 2);
                j3 += 2;
                i = nkkVar.x();
            }
            int[] iArr = d74Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = d74Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                nkkVar.B(i3);
                c78Var = f(c78Var, j3, nkkVar.a, i3);
                j3 += i3;
                nkkVar.E(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = nkkVar.x();
                    iArr2[i4] = nkkVar.v();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bm2Var.c - ((int) (j3 - bm2Var.b));
            }
            ssj ssjVar = (ssj) bm2Var.d;
            int i5 = lik.a;
            byte[] bArr2 = ssjVar.b;
            byte[] bArr3 = d74Var.a;
            int i6 = ssjVar.a;
            int i7 = ssjVar.c;
            int i8 = ssjVar.d;
            d74Var.f = i;
            d74Var.d = iArr;
            d74Var.e = iArr2;
            d74Var.b = bArr2;
            d74Var.a = bArr3;
            d74Var.c = i6;
            d74Var.g = i7;
            d74Var.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = d74Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (lik.a >= 24) {
                c74 c74Var = (c74) d74Var.j;
                c74Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = c74Var.b;
                pattern.set(i7, i8);
                c74Var.a.setPattern(pattern);
            }
            long j4 = bm2Var.b;
            int i9 = (int) (j3 - j4);
            bm2Var.b = j4 + i9;
            bm2Var.c -= i9;
        }
        if (!hm4Var.i(268435456)) {
            hm4Var.C(bm2Var.c);
            return e(c78Var, bm2Var.b, hm4Var.h, bm2Var.c);
        }
        nkkVar.B(4);
        c78 f2 = f(c78Var, bm2Var.b, nkkVar.a, 4);
        int v = nkkVar.v();
        bm2Var.b += 4;
        bm2Var.c -= 4;
        hm4Var.C(v);
        c78 e = e(f2, bm2Var.b, hm4Var.h, v);
        bm2Var.b += v;
        int i10 = bm2Var.c - v;
        bm2Var.c = i10;
        ByteBuffer byteBuffer = hm4Var.k;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            hm4Var.k = ByteBuffer.allocate(i10);
        } else {
            hm4Var.k.clear();
        }
        return e(e, bm2Var.b, hm4Var.k, bm2Var.c);
    }

    public static c78 k(c78 c78Var, zziy zziyVar, bm2 bm2Var, zzeu zzeuVar) {
        if (zziyVar.b(1073741824)) {
            long j = bm2Var.b;
            int i = 1;
            zzeuVar.y(1);
            c78 m = m(c78Var, j, zzeuVar.a, 1);
            long j2 = j + 1;
            byte b = zzeuVar.a[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zziv zzivVar = zziyVar.c;
            byte[] bArr = zzivVar.a;
            if (bArr == null) {
                zzivVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            c78Var = m(m, j2, zzivVar.a, i3);
            long j3 = j2 + i3;
            if (z) {
                zzeuVar.y(2);
                c78Var = m(c78Var, j3, zzeuVar.a, 2);
                j3 += 2;
                i = zzeuVar.J();
            }
            int[] iArr = zzivVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = zzivVar.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i4 = i * 6;
                zzeuVar.y(i4);
                c78Var = m(c78Var, j3, zzeuVar.a, i4);
                j3 += i4;
                zzeuVar.D(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr[i5] = zzeuVar.J();
                    iArr2[i5] = zzeuVar.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bm2Var.c - ((int) (j3 - bm2Var.b));
            }
            zzahs zzahsVar = (zzahs) bm2Var.d;
            String str = zzfm.a;
            byte[] bArr2 = zzahsVar.b;
            byte[] bArr3 = zzivVar.a;
            int i6 = zzahsVar.a;
            int i7 = zzahsVar.c;
            int i8 = zzahsVar.d;
            zzivVar.f = i;
            zzivVar.d = iArr;
            zzivVar.e = iArr2;
            zzivVar.b = bArr2;
            zzivVar.a = bArr3;
            zzivVar.c = i6;
            zzivVar.g = i7;
            zzivVar.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = zzivVar.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            c74 c74Var = zzivVar.j;
            c74Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = c74Var.b;
            pattern.set(i7, i8);
            c74Var.a.setPattern(pattern);
            long j4 = bm2Var.b;
            int i9 = (int) (j3 - j4);
            bm2Var.b = j4 + i9;
            bm2Var.c -= i9;
        }
        if (!zziyVar.b(268435456)) {
            zziyVar.d(bm2Var.c);
            return l(c78Var, bm2Var.b, zziyVar.d, bm2Var.c);
        }
        zzeuVar.y(4);
        c78 m2 = m(c78Var, bm2Var.b, zzeuVar.a, 4);
        int h = zzeuVar.h();
        bm2Var.b += 4;
        bm2Var.c -= 4;
        zziyVar.d(h);
        c78 l = l(m2, bm2Var.b, zziyVar.d, h);
        bm2Var.b += h;
        int i10 = bm2Var.c - h;
        bm2Var.c = i10;
        ByteBuffer byteBuffer = zziyVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            zziyVar.f = ByteBuffer.allocate(i10);
        } else {
            zziyVar.f.clear();
        }
        return l(l, bm2Var.b, zziyVar.f, bm2Var.c);
    }

    public static c78 l(c78 c78Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c78Var.c) {
            c78Var = (c78) c78Var.e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (c78Var.c - j));
            zzabn zzabnVar = (zzabn) c78Var.d;
            byte[] bArr = zzabnVar.a;
            long j2 = j - c78Var.b;
            zzabnVar.getClass();
            byteBuffer.put(bArr, (int) j2, min);
            i -= min;
            j += min;
            if (j == c78Var.c) {
                c78Var = (c78) c78Var.e;
            }
        }
        return c78Var;
    }

    public static c78 m(c78 c78Var, long j, byte[] bArr, int i) {
        while (j >= c78Var.c) {
            c78Var = (c78) c78Var.e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c78Var.c - j));
            zzabn zzabnVar = (zzabn) c78Var.d;
            byte[] bArr2 = zzabnVar.a;
            long j2 = j - c78Var.b;
            zzabnVar.getClass();
            System.arraycopy(bArr2, (int) j2, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c78Var.c) {
                c78Var = (c78) c78Var.e;
            }
        }
        return c78Var;
    }

    public fi3 a() {
        return new fi3((JSONObject) this.b, (Date) this.d, (JSONArray) this.e, (JSONObject) this.c, this.a, (JSONArray) this.f);
    }

    public void b(long j) {
        c78 c78Var;
        if (j == -1) {
            return;
        }
        while (true) {
            c78Var = (c78) this.d;
            if (j < c78Var.c) {
                break;
            }
            zz0 zz0Var = (zz0) this.b;
            zo zoVar = (zo) c78Var.d;
            synchronized (zz0Var) {
                zo[] zoVarArr = (zo[]) zz0Var.e;
                int i = zz0Var.d;
                zz0Var.d = i + 1;
                zoVarArr[i] = zoVar;
                zz0Var.c--;
                zz0Var.notifyAll();
            }
            c78 c78Var2 = (c78) this.d;
            c78Var2.d = null;
            c78 c78Var3 = (c78) c78Var2.e;
            c78Var2.e = null;
            this.d = c78Var3;
        }
        if (((c78) this.e).b < c78Var.b) {
            this.e = c78Var;
        }
    }

    public int d(int i) {
        zo zoVar;
        c78 c78Var = (c78) this.f;
        if (((zo) c78Var.d) == null) {
            zz0 zz0Var = (zz0) this.b;
            synchronized (zz0Var) {
                try {
                    int i2 = zz0Var.c + 1;
                    zz0Var.c = i2;
                    int i3 = zz0Var.d;
                    if (i3 > 0) {
                        zo[] zoVarArr = (zo[]) zz0Var.e;
                        int i4 = i3 - 1;
                        zz0Var.d = i4;
                        zoVar = zoVarArr[i4];
                        zoVar.getClass();
                        ((zo[]) zz0Var.e)[zz0Var.d] = null;
                    } else {
                        zo zoVar2 = new zo(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
                        zo[] zoVarArr2 = (zo[]) zz0Var.e;
                        if (i2 > zoVarArr2.length) {
                            zz0Var.e = (zo[]) Arrays.copyOf(zoVarArr2, zoVarArr2.length * 2);
                        }
                        zoVar = zoVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c78 c78Var2 = new c78(((c78) this.f).c, 3, (byte) 0);
            c78Var.d = zoVar;
            c78Var.e = c78Var2;
        }
        return Math.min(i, (int) (((c78) this.f).c - this.a));
    }

    public void h(boolean z) {
        int currentItem;
        Fragment fragment;
        wp8 wp8Var = (wp8) this.f;
        iz0 iz0Var = wp8Var.g;
        nkb nkbVar = wp8Var.c;
        s sVar = wp8Var.b;
        if (sVar.S() || ((ViewPager2) this.e).getScrollState() != 0 || nkbVar.e() || wp8Var.getItemCount() == 0 || (currentItem = ((ViewPager2) this.e).getCurrentItem()) >= wp8Var.getItemCount()) {
            return;
        }
        long itemId = wp8Var.getItemId(currentItem);
        if ((itemId != this.a || z) && (fragment = (Fragment) nkbVar.c(itemId)) != null && fragment.isAdded()) {
            this.a = itemId;
            sVar.getClass();
            a aVar = new a(sVar);
            ArrayList arrayList = new ArrayList();
            Fragment fragment2 = null;
            for (int i = 0; i < nkbVar.i(); i++) {
                long f = nkbVar.f(i);
                Fragment fragment3 = (Fragment) nkbVar.j(i);
                if (fragment3.isAdded()) {
                    if (f != this.a) {
                        aVar.m(fragment3, e6b.d);
                        iz0Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = iz0Var.a.iterator();
                        if (it.hasNext()) {
                            throw lnb.i(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        fragment2 = fragment3;
                    }
                    fragment3.setMenuVisibility(f == this.a);
                }
            }
            if (fragment2 != null) {
                aVar.m(fragment2, e6b.e);
                iz0Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = iz0Var.a.iterator();
                if (it2.hasNext()) {
                    throw lnb.i(it2);
                }
                arrayList.add(arrayList3);
            }
            if (aVar.c.isEmpty()) {
                return;
            }
            if (aVar.i) {
                a70.r("This transaction is already being added to the back stack");
                return;
            }
            aVar.j = false;
            aVar.t.A(aVar, false);
            Collections.reverse(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                List list = (List) it3.next();
                iz0Var.getClass();
                iz0.a(list);
            }
        }
    }

    public void i(long j) {
        c78 c78Var;
        if (j != -1) {
            while (true) {
                c78Var = (c78) this.d;
                if (j < c78Var.c) {
                    break;
                }
                ((zzabp) this.b).a((zzabn) c78Var.d);
                c78 c78Var2 = (c78) this.d;
                c78Var2.d = null;
                c78 c78Var3 = (c78) c78Var2.e;
                c78Var2.e = null;
                this.d = c78Var3;
            }
            if (((c78) this.e).b < c78Var.b) {
                this.e = c78Var;
            }
        }
    }

    public int j(int i) {
        c78 c78Var = (c78) this.f;
        if (((zzabn) c78Var.d) == null) {
            zzabn zza = ((zzabp) this.b).zza();
            c78 c78Var2 = new c78(((c78) this.f).c, 9, (byte) 0);
            c78Var.d = zza;
            c78Var.e = c78Var2;
        }
        return Math.min(i, (int) (((c78) this.f).c - this.a));
    }
}
