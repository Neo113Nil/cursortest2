package defpackage;

import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzguk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eho extends zzgui {
    public final Object a;

    public eho(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final Object d() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgui e(zzgub zzgubVar) {
        Object apply = zzgubVar.apply(this.a);
        zzguk.h(apply, "the Function passed to Optional.transform() must not return null.");
        return new eho(apply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eho) {
            return this.a.equals(((eho) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.a.toString();
        return wt3.m("Optional.of(", obj, new StringBuilder(obj.length() + 13), ")");
    }
}
