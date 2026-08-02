package defpackage;

import com.sofascore.model.database.MediaReactionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fdd extends w31 {
    public final x43 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fdd() {
        super(null, null, null, null, false, r0);
        x43 x43Var = new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31);
        this.g = x43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdd) && this.g.equals(((fdd) obj).g);
    }

    @Override // defpackage.w31
    public final x43 f() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String g() {
        return null;
    }

    public final int hashCode() {
        return this.g.hashCode() + ljg.c(Integer.hashCode(-99999) * 29791, 31, 0L);
    }

    @Override // defpackage.w31
    public final int i() {
        return -99999;
    }

    @Override // defpackage.w31
    public final String k() {
        return null;
    }

    public final String toString() {
        return "NoNewPostFeedCardModel(id=-99999, title=null, body=null, createdAtTimestamp=0, additionalData=" + this.g + ")";
    }
}
