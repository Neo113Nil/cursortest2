package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrh implements zzrl {
    @Override // com.google.android.gms.internal.measurement.zzrl
    public final boolean a(zzrg zzrgVar) {
        zzrgVar.getClass();
        String str = "false";
        try {
            str = (String) zzrm.a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception unused) {
        }
        return str.equals("true");
    }
}
