package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hk0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hk0(ugn ugnVar, int i, Exception exc, byte[] bArr, Map map) {
        this.c = ugnVar;
        this.b = i;
        this.d = exc;
        this.e = bArr;
        this.f = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object[] objArr = 0;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                i25 v = j72.v(new gk0(this));
                ((ik0) obj4).c.execute(new vlo(this, v, objArr == true ? 1 : 0, 2));
                return;
            case 1:
                break;
            case 2:
                ugn ugnVar = (ugn) obj2;
                ((fwo) ugnVar.d).d((String) ugnVar.g, this.b, (Exception) obj3, (byte[]) obj, (Map) obj4);
                return;
            default:
                Pair pair = (Pair) obj3;
                ((zznq) ((wxo) obj2).b.k).e(((Integer) pair.first).intValue(), (zzxo) pair.second, (zzxf) obj, (zzxk) obj4, this.b);
                return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            View view = (View) ((ArrayList) obj2).get(i2);
            String str = (String) ((ArrayList) obj3).get(i2);
            WeakHashMap weakHashMap = bsk.a;
            view.setTransitionName(str);
            ((View) ((ArrayList) obj).get(i2)).setTransitionName((String) ((ArrayList) obj4).get(i2));
        }
    }

    public /* synthetic */ hk0(wxo wxoVar, Pair pair, zzxf zzxfVar, zzxk zzxkVar, int i) {
        this.c = wxoVar;
        this.d = pair;
        this.e = zzxfVar;
        this.f = zzxkVar;
        this.b = i;
    }

    public hk0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    public hk0(ik0 ik0Var, List list, List list2, int i, Runnable runnable) {
        this.f = ik0Var;
        this.c = list;
        this.d = list2;
        this.b = i;
        this.e = runnable;
    }
}
