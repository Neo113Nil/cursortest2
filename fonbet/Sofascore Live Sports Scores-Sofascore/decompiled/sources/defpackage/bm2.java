package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzanr;
import com.google.android.gms.internal.ads.zzcy;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzdf;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bm2 implements zzdu, zzeb {
    public final /* synthetic */ int a;
    public long b;
    public int c;
    public Object d;

    public /* synthetic */ bm2(zznr zznrVar, int i, long j, long j2) {
        this.a = 7;
        this.d = zznrVar;
        this.c = i;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo13zza(Object obj) {
        long j;
        int i;
        long j2;
        Iterator it;
        Bitmap bitmap;
        switch (this.a) {
            case 5:
                whn whnVar = (whn) this.d;
                long j3 = this.b;
                int i2 = this.c;
                zzanr zzanrVar = (zzanr) obj;
                whnVar.h.getClass();
                zzgxm zzgxmVar = zzanrVar.a;
                long j4 = zzanrVar.c;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgxmVar.size());
                Iterator it2 = zzgxmVar.iterator();
                while (true) {
                    int i3 = 0;
                    if (!it2.hasNext()) {
                        int i4 = i2;
                        long j5 = j3;
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList(a.q, arrayList);
                        bundle.putLong("d", j4);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeBundle(bundle);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        zzeu zzeuVar = whnVar.c;
                        int length = marshall.length;
                        zzeuVar.z(length, marshall);
                        zzaht zzahtVar = whnVar.a;
                        zzahtVar.b(length, zzeuVar);
                        long j6 = zzanrVar.b;
                        zzv zzvVar = whnVar.h;
                        if (j6 == C.TIME_UNSET) {
                            zzguk.f(zzvVar.t == Long.MAX_VALUE);
                            j = j5;
                        } else {
                            long j7 = zzvVar.t;
                            j = j7 == Long.MAX_VALUE ? j5 + j6 : j6 + j7;
                        }
                        zzahtVar.f(j, i4 | 1, length, 0, null);
                        break;
                    } else {
                        zzcy zzcyVar = (zzcy) it2.next();
                        zzcyVar.getClass();
                        Bundle bundle2 = new Bundle();
                        CharSequence charSequence = zzcyVar.a;
                        if (charSequence != null) {
                            bundle2.putCharSequence(zzcy.q, charSequence);
                            if (charSequence instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence;
                                String str = fyn.a;
                                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                zzdd[] zzddVarArr = (zzdd[]) spanned.getSpans(0, spanned.length(), zzdd.class);
                                int length2 = zzddVarArr.length;
                                while (i3 < length2) {
                                    int i5 = i2;
                                    zzdd zzddVar = zzddVarArr[i3];
                                    zzddVar.getClass();
                                    long j8 = j3;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString(zzdd.c, zzddVar.a);
                                    bundle3.putInt(zzdd.d, zzddVar.b);
                                    arrayList2.add(fyn.a(spanned, zzddVar, 1, bundle3));
                                    i3++;
                                    i2 = i5;
                                    j3 = j8;
                                    it2 = it2;
                                }
                                i = i2;
                                j2 = j3;
                                it = it2;
                                for (zzdf zzdfVar : (zzdf[]) spanned.getSpans(0, spanned.length(), zzdf.class)) {
                                    zzdfVar.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putInt(zzdf.d, zzdfVar.a);
                                    bundle4.putInt(zzdf.e, zzdfVar.b);
                                    bundle4.putInt(zzdf.f, zzdfVar.c);
                                    arrayList2.add(fyn.a(spanned, zzdfVar, 2, bundle4));
                                }
                                for (zzdc zzdcVar : (zzdc[]) spanned.getSpans(0, spanned.length(), zzdc.class)) {
                                    arrayList2.add(fyn.a(spanned, zzdcVar, 3, null));
                                }
                                for (zzdg zzdgVar : (zzdg[]) spanned.getSpans(0, spanned.length(), zzdg.class)) {
                                    zzdgVar.getClass();
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString(zzdg.b, zzdgVar.a);
                                    arrayList2.add(fyn.a(spanned, zzdgVar, 4, bundle5));
                                }
                                if (!arrayList2.isEmpty()) {
                                    bundle2.putParcelableArrayList(zzcy.r, arrayList2);
                                }
                                bundle2.putSerializable(zzcy.s, zzcyVar.b);
                                bundle2.putSerializable(zzcy.t, zzcyVar.c);
                                bundle2.putFloat(zzcy.v, zzcyVar.e);
                                bundle2.putInt(zzcy.w, zzcyVar.f);
                                bundle2.putInt(zzcy.x, zzcyVar.g);
                                bundle2.putFloat(zzcy.y, zzcyVar.h);
                                bundle2.putInt(zzcy.z, zzcyVar.i);
                                bundle2.putInt(zzcy.A, zzcyVar.l);
                                bundle2.putFloat(zzcy.B, zzcyVar.m);
                                bundle2.putFloat(zzcy.C, zzcyVar.j);
                                bundle2.putFloat(zzcy.D, zzcyVar.k);
                                bundle2.putBoolean(zzcy.F, false);
                                bundle2.putInt(zzcy.E, -16777216);
                                bundle2.putInt(zzcy.G, zzcyVar.n);
                                bundle2.putFloat(zzcy.H, zzcyVar.o);
                                bundle2.putInt(zzcy.I, zzcyVar.p);
                                bitmap = zzcyVar.d;
                                if (bitmap == null) {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzguk.f(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                                    bundle2.putByteArray(zzcy.u, byteArrayOutputStream.toByteArray());
                                }
                                arrayList.add(bundle2);
                                i2 = i;
                                j3 = j2;
                                it2 = it;
                            }
                        }
                        i = i2;
                        j2 = j3;
                        it = it2;
                        bundle2.putSerializable(zzcy.s, zzcyVar.b);
                        bundle2.putSerializable(zzcy.t, zzcyVar.c);
                        bundle2.putFloat(zzcy.v, zzcyVar.e);
                        bundle2.putInt(zzcy.w, zzcyVar.f);
                        bundle2.putInt(zzcy.x, zzcyVar.g);
                        bundle2.putFloat(zzcy.y, zzcyVar.h);
                        bundle2.putInt(zzcy.z, zzcyVar.i);
                        bundle2.putInt(zzcy.A, zzcyVar.l);
                        bundle2.putFloat(zzcy.B, zzcyVar.m);
                        bundle2.putFloat(zzcy.C, zzcyVar.j);
                        bundle2.putFloat(zzcy.D, zzcyVar.k);
                        bundle2.putBoolean(zzcy.F, false);
                        bundle2.putInt(zzcy.E, -16777216);
                        bundle2.putInt(zzcy.G, zzcyVar.n);
                        bundle2.putFloat(zzcy.H, zzcyVar.o);
                        bundle2.putInt(zzcy.I, zzcyVar.p);
                        bitmap = zzcyVar.d;
                        if (bitmap == null) {
                        }
                        arrayList.add(bundle2);
                        i2 = i;
                        j3 = j2;
                        it2 = it;
                    }
                }
            default:
                ((zznt) obj).g((zznr) this.d, this.c, this.b);
                break;
        }
    }

    public /* synthetic */ bm2(int i) {
        this.a = i;
    }

    public /* synthetic */ bm2(whn whnVar, long j, int i) {
        this.a = 5;
        this.d = whnVar;
        this.b = j;
        this.c = i;
    }

    public bm2(int i, URL url, long j) {
        this.a = 0;
        this.c = i;
        this.d = url;
        this.b = j;
    }

    public bm2(int i, long j) {
        this.a = 2;
        this.c = i;
        this.b = j;
    }
}
