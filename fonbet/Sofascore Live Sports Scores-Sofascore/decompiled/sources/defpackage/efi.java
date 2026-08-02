package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class efi {
    public final int a;
    public final int b;
    public final emh c;
    public final String d;

    public efi(int i, int i2) {
        emh emhVar = emh.a;
        this.a = i;
        this.b = i2;
        this.c = emhVar;
        this.d = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efi)) {
            return false;
        }
        efi efiVar = (efi) obj;
        return this.a == efiVar.a && this.b == efiVar.b && this.c == efiVar.c && this.d.equals(efiVar.d);
    }

    public final int hashCode() {
        return dmi.e(dmi.c((this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31, false);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "StatusSnackbarVisuals(stringRes=", ", iconRes=", ", duration=");
        s.append(this.c);
        s.append(", message=");
        s.append(this.d);
        s.append(", withDismissAction=false, actionLabel=null)");
        return s.toString();
    }
}
