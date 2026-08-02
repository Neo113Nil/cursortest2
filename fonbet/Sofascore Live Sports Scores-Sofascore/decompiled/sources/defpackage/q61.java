package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzfyp;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.slider.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q61 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public q61(List list, int i, Throwable th) {
        this.a = 2;
        l4a.j(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cmn cmnVar = null;
        zzaza zzazaVar = null;
        int i = 11;
        switch (this.a) {
            case 0:
                ((b) this.c).h.w(this.b, 4);
                break;
            case 1:
                yia yiaVar = (yia) this.c;
                int i2 = this.b;
                t6a t6aVar = (t6a) yiaVar.b;
                if (t6aVar != null) {
                    t6aVar.B(i2);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                if (this.b != 1) {
                    for (int i3 = 0; i3 < size; i3++) {
                        ((al5) arrayList.get(i3)).a();
                    }
                    break;
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        ((al5) arrayList.get(i4)).b();
                    }
                    break;
                }
            case 3:
                ((MaterialCalendar) this.c).i.smoothScrollToPosition(this.b);
                break;
            case 4:
                ((RecyclerView) this.c).smoothScrollToPosition(this.b);
                break;
            case 5:
                ((zabk) this.c).b(this.b);
                break;
            case 6:
                int i5 = this.b;
                zzbcg zzbcgVar = (zzbcg) this.c;
                if (i5 > 0) {
                    try {
                        Thread.sleep(i5 * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = zzbcgVar.a;
                    zzazaVar = zzfyp.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                }
                zzbcg zzbcgVar2 = (zzbcg) this.c;
                zzbcgVar2.h = zzazaVar;
                int i6 = this.b;
                if (i6 < 4) {
                    if (zzazaVar == null || !zzazaVar.e0() || zzazaVar.z0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzazaVar.D0() || !zzazaVar.E0().D() || zzazaVar.E0().E() == -2) {
                        int i7 = i6 + 1;
                        if (zzbcgVar2.l) {
                            Future<?> submit = zzbcgVar2.b.submit(new q61(zzbcgVar2, i7, 6));
                            if (i7 == 0) {
                                zzbcgVar2.i = submit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                zzbkf zzbkfVar = (zzbkf) this.c;
                int i8 = this.b;
                zzeaj zzeajVar = zzbkfVar.d;
                if (zzeajVar != null) {
                    zzeai a = zzeajVar.a();
                    a.b("action", "cct_nav");
                    a.b("cct_navs", String.valueOf(i8));
                    a.c();
                    break;
                }
                break;
            case 8:
                zzchj zzchjVar = (zzchj) this.c;
                int i9 = this.b;
                zzcht zzchtVar = zzchjVar.q;
                if (zzchtVar != null) {
                    zzchtVar.onWindowVisibilityChanged(i9);
                    break;
                }
                break;
            case 9:
                zzcix zzcixVar = (zzcix) this.c;
                int i10 = this.b;
                zzcht zzchtVar2 = zzcixVar.g;
                if (zzchtVar2 != null) {
                    zzchtVar2.onWindowVisibilityChanged(i10);
                    break;
                }
                break;
            case 10:
                ((meo) this.c).b(this.b + 1);
                break;
            case 11:
                int i11 = this.b;
                zro zroVar = (zro) this.c;
                if (i11 > 0) {
                    try {
                        Thread.sleep(i11 * 1000);
                    } catch (InterruptedException unused3) {
                    }
                }
                try {
                    Context context2 = zroVar.a;
                    cmnVar = yaa.S(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused4) {
                }
                zro zroVar2 = (zro) this.c;
                zroVar2.h = cmnVar;
                int i12 = this.b;
                if (i12 < 4) {
                    if (cmnVar == null || !cmnVar.S() || cmnVar.h0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !cmnVar.j0() || !cmnVar.k0().s() || cmnVar.k0().t() == -2) {
                        int i13 = i12 + 1;
                        if (zroVar2.l) {
                            Future<?> submit2 = zroVar2.b.submit(new q61(zroVar2, i13, i));
                            if (i13 == 0) {
                                zroVar2.i = submit2;
                                break;
                            }
                        }
                    }
                }
                break;
            case 12:
                xwo xwoVar = (xwo) this.c;
                ((zzne) xwoVar.a[this.b].e).getClass();
                xwoVar.t.zzB();
                break;
            default:
                zzry zzryVar = (zzry) this.c;
                int i14 = this.b;
                String str = zzfm.a;
                auo auoVar = zzryVar.b;
                vto vtoVar = new vto(i14);
                zzdn zzdnVar = auoVar.a.z;
                zzguk.f(Looper.myLooper() == zzdnVar.b.zza());
                zzdnVar.f++;
                wjn wjnVar = new wjn(i, zzdnVar, vtoVar);
                zzea zzeaVar = zzdnVar.a;
                if (zzeaVar.zza().getThread().isAlive()) {
                    zzeaVar.f(wjnVar);
                }
                Integer valueOf = Integer.valueOf(i14);
                Object obj = zzdnVar.d;
                zzdnVar.d = valueOf;
                if (!obj.equals(valueOf)) {
                    cwo cwoVar = (cwo) zzdnVar.c.b;
                    cwoVar.o();
                    cwoVar.p(1, 10, valueOf);
                    cwoVar.p(2, 10, valueOf);
                    pff pffVar = new pff(i14);
                    zzeg zzegVar = cwoVar.m;
                    zzegVar.c(21, pffVar);
                    zzegVar.d();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q61(xwo xwoVar, int i, boolean z) {
        this.a = 12;
        this.c = xwoVar;
        this.b = i;
    }

    public q61(int i, ruk rukVar) {
        this.a = 4;
        this.b = i;
        this.c = rukVar;
    }

    public /* synthetic */ q61(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public q61(b bVar) {
        this.a = 0;
        this.c = bVar;
        this.b = -1;
    }
}
