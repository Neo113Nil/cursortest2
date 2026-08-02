package e4;

import java.io.IOException;
import java.util.ArrayList;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8579a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f8580b = new long[2];

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8581c = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8582d = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    public boolean f8583e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8584f;

    /* renamed from: g, reason: collision with root package name */
    public com.android.billingclient.api.i f8585g;

    /* renamed from: h, reason: collision with root package name */
    public int f8586h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f8587i;

    public b(e eVar, String str) {
        this.f8587i = eVar;
        this.f8579a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i5 = 0; i5 < 2; i5++) {
            sb2.append(i5);
            this.f8581c.add(this.f8587i.f8592a.resolve(sb2.toString()));
            sb2.append(".tmp");
            this.f8582d.add(this.f8587i.f8592a.resolve(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c a() {
        if (!this.f8583e || this.f8585g != null || this.f8584f) {
            return null;
        }
        ArrayList arrayList = this.f8581c;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            e eVar = this.f8587i;
            if (i5 >= size) {
                this.f8586h++;
                return new c(eVar, this);
            }
            if (!eVar.q.exists((Path) arrayList.get(i5))) {
                try {
                    eVar.C(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i5++;
        }
    }
}
