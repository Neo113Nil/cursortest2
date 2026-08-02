package defpackage;

import com.sofascore.model.Country;
import com.sofascore.model.network.response.PickemConfig;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nge {
    public final NetworkCoroutineAPI a;
    public final udl b;

    public nge(NetworkCoroutineAPI networkCoroutineAPI, udl udlVar) {
        networkCoroutineAPI.getClass();
        udlVar.getClass();
        this.a = networkCoroutineAPI;
        this.b = udlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        mge mgeVar;
        int i;
        String iso2Alpha;
        if (sq3Var instanceof mge) {
            mgeVar = (mge) sq3Var;
            int i2 = mgeVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mgeVar.t = i2 - Integer.MIN_VALUE;
                Object obj = mgeVar.r;
                lu3 lu3Var = lu3.a;
                i = mgeVar.t;
                Object[] objArr = 0;
                if (i != 0) {
                    y6a.M(obj);
                    int i3 = ke0.c;
                    ArrayList arrayList = dv3.a;
                    Country b = dv3.b(new Integer(i3));
                    if (b == null || (iso2Alpha = b.getIso2Alpha()) == null) {
                        return Unit.a;
                    }
                    cl clVar = new cl(this, iso2Alpha, objArr == true ? 1 : 0, 20);
                    mgeVar.t = 1;
                    obj = yaa.P(clVar, mgeVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) yaa.x((x2g) obj);
                this.b.n = list != null ? (PickemConfig) CollectionsKt.firstOrNull(list) : null;
                return Unit.a;
            }
        }
        mgeVar = new mge(this, sq3Var);
        Object obj2 = mgeVar.r;
        lu3 lu3Var2 = lu3.a;
        i = mgeVar.t;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        List list2 = (List) yaa.x((x2g) obj2);
        this.b.n = list2 != null ? (PickemConfig) CollectionsKt.firstOrNull(list2) : null;
        return Unit.a;
    }
}
