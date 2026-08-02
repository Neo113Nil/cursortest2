package defpackage;

import com.google.android.gms.internal.pal.zzabe;
import com.google.android.gms.internal.pal.zzyx;
import com.google.android.gms.internal.pal.zzyy;
import com.google.android.gms.internal.pal.zzza;
import com.google.android.gms.internal.pal.zzzb;
import com.google.android.gms.internal.pal.zzzd;
import com.google.android.gms.internal.pal.zzzg;
import com.vungle.ads.internal.protos.Sdk;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p4n extends zzzg {
    public static void a(zzabe zzabeVar, zzyy zzyyVar) {
        StringWriter stringWriter = zzabeVar.a;
        if (zzyyVar == null || (zzyyVar instanceof zzza)) {
            if (zzabeVar.f != null) {
                zzabeVar.n();
            }
            zzabeVar.k();
            stringWriter.write("null");
            return;
        }
        zzzb zzzbVar = null;
        if (zzyyVar instanceof zzzd) {
            if (zzabeVar.f != null) {
                zzabeVar.n();
            }
            zzabeVar.k();
            stringWriter.write("null");
            return;
        }
        if (zzyyVar instanceof zzyx) {
            zzabeVar.n();
            zzabeVar.k();
            int i = zzabeVar.c;
            int[] iArr = zzabeVar.b;
            if (i == iArr.length) {
                iArr = Arrays.copyOf(iArr, i + i);
                zzabeVar.b = iArr;
            }
            int i2 = zzabeVar.c;
            zzabeVar.c = i2 + 1;
            iArr[i2] = 1;
            stringWriter.write(91);
            Iterator it = ((zzyx) zzyyVar).a.iterator();
            while (it.hasNext()) {
                a(zzabeVar, (zzyy) it.next());
            }
            zzabeVar.i(1, 2, ']');
            return;
        }
        if (!(zzyyVar instanceof zzzb)) {
            Class<?> cls = zzyyVar.getClass();
            cls.toString();
            a70.p("Couldn't write ".concat(String.valueOf(cls)));
            return;
        }
        zzabeVar.n();
        zzabeVar.k();
        int i3 = zzabeVar.c;
        int[] iArr2 = zzabeVar.b;
        if (i3 == iArr2.length) {
            iArr2 = Arrays.copyOf(iArr2, i3 + i3);
            zzabeVar.b = iArr2;
        }
        int i4 = zzabeVar.c;
        zzabeVar.c = i4 + 1;
        iArr2[i4] = 3;
        stringWriter.write(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        if (zzyyVar instanceof zzzb) {
            zzzbVar = (zzzb) zzyyVar;
        } else {
            zzyyVar.toString();
            a70.r("Not a JSON Object: ".concat(zzyyVar.toString()));
        }
        Iterator it2 = ((mfp) zzzbVar.a.entrySet()).iterator();
        while (((lbb) it2).hasNext()) {
            xfp c = ((kfp) it2).c();
            String str = (String) c.getKey();
            if (str == null) {
                yhk.s("name == null");
                return;
            }
            if (zzabeVar.f != null) {
                zzl.s();
                return;
            } else if (zzabeVar.c == 0) {
                a70.r("JsonWriter is closed.");
                return;
            } else {
                zzabeVar.f = str;
                a(zzabeVar, (zzyy) c.getValue());
            }
        }
        zzabeVar.i(3, 5, '}');
    }
}
