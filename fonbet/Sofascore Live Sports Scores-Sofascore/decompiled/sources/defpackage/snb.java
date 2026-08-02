package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class snb implements vnb {
    public final mnb a = new mnb(new q9k(R.string.loading_error_title), new q9k(R.string.loading_error_body));

    @Override // defpackage.vnb
    public final /* bridge */ Object a() {
        return (Void) super.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snb) && this.a.equals(((snb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
