package defpackage;

import android.os.Parcel;
import com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzdm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzjf;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzqq;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzyg;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zzqk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.U3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class xto implements RemoteCall, zzeb, zzdm, zzqk, zzqq, icp, zzyg {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xto(zznr zznrVar, zzv zzvVar, zzjf zzjfVar) {
        this.a = 6;
        this.b = zzvVar;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 4:
                if (obj == null) {
                    return false;
                }
                return afn.a(this, obj, new String[0]);
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 4:
                return efn.a(this, new String[0]);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                AdPodInfoData adPodInfoData = (AdPodInfoData) this.b;
                Integer num = adPodInfoData.totalAds();
                int intValue = num == null ? 1 : num.intValue();
                Integer adPosition = adPodInfoData.adPosition();
                int intValue2 = adPosition == null ? 1 : adPosition.intValue();
                Boolean isBumper = adPodInfoData.isBumper();
                boolean booleanValue = isBumper == null ? false : isBumper.booleanValue();
                Double maxDuration = adPodInfoData.maxDuration();
                double doubleValue = maxDuration == null ? -1.0d : maxDuration.doubleValue();
                List<Long> adsDurationMs = adPodInfoData.adsDurationMs();
                if (adsDurationMs == null) {
                    adsDurationMs = new ArrayList<>();
                }
                String obj = adsDurationMs.toString();
                Integer podIndex = adPodInfoData.podIndex();
                int intValue3 = podIndex != null ? podIndex.intValue() : 0;
                Double timeOffset = adPodInfoData.timeOffset();
                double doubleValue2 = timeOffset == null ? 0.0d : timeOffset.doubleValue();
                StringBuilder sb = new StringBuilder(mz1.d(String.valueOf(intValue3).length() + mz1.d(String.valueOf(intValue).length() + 33 + String.valueOf(intValue2).length() + 11 + String.valueOf(booleanValue).length() + 14, 17, String.valueOf(doubleValue)) + obj.length() + 11 + 13, 1, String.valueOf(doubleValue2)));
                sb.append("AdPodInfo [totalAds=");
                sb.append(intValue);
                sb.append(", adPosition=");
                sb.append(intValue2);
                sb.append(", isBumper=");
                sb.append(booleanValue);
                sb.append(", maxDuration=");
                sb.append(doubleValue);
                sb.append(", adsDurationsMs=");
                sb.append(obj);
                wt3.u(intValue3, ", podIndex=", ", timeOffset=", sb);
                sb.append(doubleValue2);
                sb.append(U3.j.e);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
        hto htoVar = new hto((zzkk) this.b, taskCompletionSource);
        Parcel S1 = zzktVar.S1();
        zzbn.c(S1, htoVar);
        zzktVar.Z1(S1, 27);
    }

    @Override // defpackage.icp
    public Object zza() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            vha vhaVar = f6n.a;
            vp2.e("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (InstantiationException e2) {
            String d = f6n.d(constructor);
            StringBuilder sb = new StringBuilder(d.length() + 44);
            sb.append("Failed to invoke constructor '");
            sb.append(d);
            sb.append("' with no args");
            throw new RuntimeException(sb.toString(), e2);
        } catch (InvocationTargetException e3) {
            String d2 = f6n.d(constructor);
            StringBuilder sb2 = new StringBuilder(d2.length() + 44);
            sb2.append("Failed to invoke constructor '");
            sb2.append(d2);
            sb2.append("' with no args");
            vp2.e(sb2.toString(), e3.getCause());
            return null;
        }
    }

    public /* synthetic */ xto(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                int i2 = cwo.Z;
                ((zzaz) obj).h(((eyo) obj2).e);
                break;
            default:
                ((zznt) obj).i((zzv) obj2);
                break;
        }
    }
}
