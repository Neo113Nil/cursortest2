package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w3o implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w3o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                p4o p4oVar = (p4o) obj;
                p4oVar.d = p4oVar.c();
                break;
            default:
                zzlj zzljVar = (zzlj) obj;
                zzljVar.getClass();
                if (Objects.equals(str, AndroidTcfDataSource.TCF_TCSTRING_KEY) || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
                    zzgu zzguVar = ((zzic) zzljVar.b).f;
                    zzic.m(zzguVar);
                    zzguVar.o.a("IABTCF_TCString change picked up in listener.");
                    dto dtoVar = zzljVar.v;
                    Preconditions.i(dtoVar);
                    dtoVar.b(500L);
                    break;
                }
                break;
        }
    }
}
