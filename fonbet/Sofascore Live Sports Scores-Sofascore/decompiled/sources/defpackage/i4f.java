package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i4f implements fm8, rdh {
    public final boolean a;
    public final r9k b;
    public final q9k c;
    public final gv9 d;
    public final gv9 e;
    public final q9k f;
    public final q9k g;

    public i4f(boolean z, r9k r9kVar, q9k q9kVar, q9k q9kVar2, q9k q9kVar3) {
        b7 K = l6g.K(new r13(hkg.d(4281541120L)), new r13(hkg.d(4291593728L)), new r13(hkg.d(4281541120L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294944768L)), new r13(hkg.b(16754688)), new r13(hkg.d(4281541120L)));
        K.getClass();
        K2.getClass();
        this.a = z;
        this.b = r9kVar;
        this.c = q9kVar;
        this.d = K;
        this.e = K2;
        this.f = q9kVar2;
        this.g = q9kVar3;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 5000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.e;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.anomaly_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4f)) {
            return false;
        }
        i4f i4fVar = (i4f) obj;
        return this.a == i4fVar.a && this.b.equals(i4fVar.b) && this.c.equals(i4fVar.c) && this.d.equals(i4fVar.d) && this.e.equals(i4fVar.e) && this.f.equals(i4fVar.f) && this.g.equals(i4fVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + lnb.e(ljg.d(ljg.d(wv8.a(R.drawable.anomaly_card_share_background, wv8.a(5000, lnb.e((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "PredictorContributorCard(isPredictor=" + this.a + ", title=" + this.b + ", description=" + this.c + ", durationMilliseconds=5000, backgroundResource=2131231067, contentGradient=" + this.d + ", borderContentGradient=" + this.e + ", shareTitle=" + this.f + ", shareDescription=" + this.g + ")";
    }
}
