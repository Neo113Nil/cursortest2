package defpackage;

import com.google.android.gms.internal.ads.zzr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e3o {
    public final Object a;
    public zzr b = new zzr();
    public boolean c;
    public boolean d;

    public e3o(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e3o.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e3o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
