package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nfe {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof nfe)) {
            return false;
        }
        nfe nfeVar = (nfe) obj;
        String str = this.d;
        String str2 = nfeVar.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(nfeVar.a)) && Objects.equals(this.c, nfeVar.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(nfeVar.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(nfeVar.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
