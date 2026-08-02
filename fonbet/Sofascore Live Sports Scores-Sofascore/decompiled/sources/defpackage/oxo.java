package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class oxo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wxo b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ zzxf d;
    public final /* synthetic */ zzxk e;

    public /* synthetic */ oxo(wxo wxoVar, Pair pair, zzxf zzxfVar, zzxk zzxkVar, int i) {
        this.a = i;
        this.b = wxoVar;
        this.c = pair;
        this.d = zzxfVar;
        this.e = zzxkVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzxk zzxkVar = this.e;
        zzxf zzxfVar = this.d;
        wxo wxoVar = this.b;
        Pair pair = this.c;
        switch (i) {
            case 0:
                ((zznq) wxoVar.b.k).k(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar);
                break;
            default:
                ((zznq) wxoVar.b.k).l(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar);
                break;
        }
    }
}
