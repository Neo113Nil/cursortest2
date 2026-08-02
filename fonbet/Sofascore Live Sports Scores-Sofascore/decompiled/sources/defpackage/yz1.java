package defpackage;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzafy;
import com.google.android.gms.internal.ads.zzaxg;
import com.google.android.gms.internal.ads.zzaxk;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfmj;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzgad;
import com.google.android.gms.internal.ads.zzgae;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.inmobi.media.core.config.models.AdConfig;
import com.sofascore.model.mvvm.model.Lineups;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yz1 implements sa, qh2, moh, zzhcv, Continuation {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public yz1(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = 255;
                this.c = null;
                break;
            case 12:
                this.c = new nkk(8);
                break;
            case 13:
                this.c = new j9e(8);
                break;
            case 19:
                this.c = new zzeu(8);
                break;
            default:
                this.b = 4;
                break;
        }
    }

    public void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public boolean b() {
        return ((uc5) this.c) != null;
    }

    public void c(int i, yk0 yk0Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            yk0 yk0Var2 = ((yk0[]) this.c)[i2];
            yk0Var2.getClass();
            if (Intrinsics.e(0L, yk0Var.g - yk0Var2.g) <= 0) {
                break;
            }
            yk0Var2.f = i;
            ((yk0[]) this.c)[i] = yk0Var2;
            i = i2;
        }
        ((yk0[]) this.c)[i] = yk0Var;
        yk0Var.f = i;
    }

    public long d(ap4 ap4Var) {
        nkk nkkVar = (nkk) this.c;
        int i = 0;
        ap4Var.peekFully(nkkVar.a, 0, 1, false);
        int i2 = nkkVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ap4Var.peekFully(nkkVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (nkkVar.a[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public long e(bp4 bp4Var) {
        j9e j9eVar = (j9e) this.c;
        int i = 0;
        bp4Var.peekFully(j9eVar.a, 0, 1, false);
        int i2 = j9eVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        bp4Var.peekFully(j9eVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (j9eVar.a[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public void f(yk0 yk0Var) {
        yk0 yk0Var2;
        int i = yk0Var.f;
        if (i == -1) {
            a70.p("Failed requirement.");
            return;
        }
        int i2 = this.b;
        yk0 yk0Var3 = ((yk0[]) this.c)[i2];
        yk0Var3.getClass();
        yk0Var.f = -1;
        ((yk0[]) this.c)[i2] = null;
        this.b = i2 - 1;
        if (yk0Var == yk0Var3) {
            return;
        }
        int e = Intrinsics.e(0L, yk0Var3.g - yk0Var.g);
        if (e == 0) {
            ((yk0[]) this.c)[i] = yk0Var3;
            yk0Var3.f = i;
            return;
        }
        if (e >= 0) {
            c(i, yk0Var3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                yk0Var2 = ((yk0[]) this.c)[i3];
                yk0Var2.getClass();
            } else {
                yk0Var2 = ((yk0[]) this.c)[i3];
                yk0Var2.getClass();
                yk0 yk0Var4 = ((yk0[]) this.c)[i4];
                yk0Var4.getClass();
                if (Intrinsics.e(0L, yk0Var4.g - yk0Var2.g) >= 0) {
                    yk0Var2 = yk0Var4;
                }
            }
            if (Intrinsics.e(0L, yk0Var2.g - yk0Var3.g) <= 0) {
                break;
            }
            int i6 = yk0Var2.f;
            yk0Var2.f = i;
            ((yk0[]) this.c)[i] = yk0Var2;
            i = i6;
        }
        ((yk0[]) this.c)[i] = yk0Var3;
        yk0Var3.f = i;
    }

    public void g(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public long h(zzafy zzafyVar) {
        int i;
        zzeu zzeuVar = (zzeu) this.c;
        int i2 = 0;
        zzafyVar.f(zzeuVar.a, 0, 1, false);
        int i3 = zzeuVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzafyVar.f(zzeuVar.a, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (zzeuVar.a[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i6 << 8);
        }
        this.b += i;
        return i6;
    }

    @Override // defpackage.sa
    public boolean n(View view) {
        ((BottomSheetBehavior) this.c).M(this.b);
        return true;
    }

    @Override // defpackage.qh2
    public void onFailure(ah2 ah2Var, IOException iOException) {
        ((akg) this.c).b(iOException);
    }

    @Override // defpackage.qh2
    public void onResponse(ah2 ah2Var, d2g d2gVar) {
        i2g i2gVar;
        akg akgVar = (akg) this.c;
        if (!d2gVar.q || (i2gVar = d2gVar.g) == null) {
            akgVar.b(new wo0());
        } else {
            String string = i2gVar.string();
            if (string != null) {
                try {
                    akgVar.c(new JSONObject(string), this.b, true);
                } catch (JSONException unused) {
                    akgVar.b(new wo0());
                }
            }
        }
        try {
            d2gVar.close();
        } catch (Exception unused2) {
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 21:
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i = this.b;
                zzaxg zzaxgVar = (zzaxg) this.c;
                zzgae zzgaeVar = (zzgae) task.getResult();
                byte[] d = ((zzaxk) zzaxgVar.o()).d();
                zzgaeVar.getClass();
                zzgad zzgadVar = new zzgad(zzgaeVar, d);
                zzgadVar.c = i;
                zzgadVar.a();
                return Boolean.TRUE;
            default:
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i2 = this.b;
                lyo lyoVar = (lyo) this.c;
                u0p u0pVar = (u0p) task.getResult();
                byte[] b = ((w3p) lyoVar.c()).b();
                u0pVar.getClass();
                try {
                    if (u0pVar.b) {
                        x0p x0pVar = u0pVar.a;
                        x0pVar.y(b);
                        x0pVar.g(0);
                        x0pVar.h(i2);
                        x0pVar.g3();
                        x0pVar.v();
                    }
                } catch (RemoteException unused) {
                }
                return Boolean.TRUE;
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return new String((char[]) this.c, 0, this.b);
            case 16:
                yu9 yu9Var = (yu9) this.c;
                int i = yu9Var.b;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    z1a.v(i2, i);
                    arrayList.add(nik.g0(yu9Var.a[i2]));
                }
                return "UnsupportedBrands{major=" + nik.g0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzt.zzh().d("BufferingUrlPinger.attributionReportingManager", th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        zzfmj zzfmjVar = (zzfmj) this.c;
        String str = (String) obj;
        int i = this.b;
        zzfld zzfldVar = zzfmjVar.a;
        if (!zzfldVar.i0) {
            zzfmjVar.c.b(str, zzfldVar.x0, zzfmjVar.e, null);
            return;
        }
        zzfsw zzfswVar = zzfmjVar.d;
        String str2 = zzfmjVar.b.b;
        zzfswVar.getClass();
        zzelg zzelgVar = new zzelg(i, str2, zzt.zzk().a(), str);
        zzele zzeleVar = zzfswVar.a;
        zzeleVar.getClass();
        zzeleVar.e(new f0o(8, zzeleVar, zzelgVar));
    }

    public /* synthetic */ yz1(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ yz1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public yz1(int i, int[] iArr) {
        yu9 yu9Var;
        this.a = 16;
        this.b = i;
        if (iArr != null) {
            yu9 yu9Var2 = yu9.c;
            yu9Var = iArr.length == 0 ? yu9.c : new yu9(Arrays.copyOf(iArr, iArr.length));
        } else {
            yu9Var = yu9.c;
        }
        this.c = yu9Var;
    }

    public /* synthetic */ yz1(int i, Serializable serializable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = serializable;
    }

    public yz1(int i, Lineups lineups) {
        this.a = 3;
        lineups.getClass();
        this.b = i;
        this.c = lineups;
    }
}
