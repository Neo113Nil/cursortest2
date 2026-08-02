package defpackage;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzful;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hao {
    public final String a;
    public final AdFormat b;
    public final String c;

    public /* synthetic */ hao(zzful zzfulVar) {
        this.a = zzfulVar.a;
        this.b = zzfulVar.b;
        this.c = zzfulVar.c;
    }

    public final String a() {
        AdFormat adFormat = this.b;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof hao) {
            hao haoVar = (hao) obj;
            if (this.a.equals(haoVar.a) && (adFormat = this.b) != null && (adFormat2 = haoVar.b) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
