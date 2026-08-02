package androidx.fragment.app;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2118a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f2121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2123f;

    public /* synthetic */ z1(s7.q0 q0Var, int i5, Exception exc, byte[] bArr, Map map) {
        this.f2120c = q0Var;
        this.f2119b = i5;
        this.f2121d = exc;
        this.f2122e = bArr;
        this.f2123f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f2118a;
        Object obj = this.f2123f;
        Object obj2 = this.f2122e;
        Serializable serializable = this.f2121d;
        Object obj3 = this.f2120c;
        switch (i5) {
            case 0:
                for (int i10 = 0; i10 < this.f2119b; i10++) {
                    View view = (View) ((ArrayList) obj3).get(i10);
                    String str = (String) ((ArrayList) serializable).get(i10);
                    WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                    androidx.core.view.q0.m(view, str);
                    androidx.core.view.q0.m((View) ((ArrayList) obj2).get(i10), (String) ((ArrayList) obj).get(i10));
                }
                break;
            default:
                s7.q0 q0Var = (s7.q0) obj3;
                ((s7.g2) q0Var.f22962f).b(q0Var.f22960d, this.f2119b, (Exception) serializable, (byte[]) obj2, (Map) obj);
                break;
        }
    }

    public z1(int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2119b = i5;
        this.f2120c = arrayList;
        this.f2121d = arrayList2;
        this.f2122e = arrayList3;
        this.f2123f = arrayList4;
    }
}
