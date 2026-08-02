package defpackage;

import android.content.SharedPreferences;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.newNetwork.ApiBranchesResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o05 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q05 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o05(q05 q05Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = q05Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        q05 q05Var = this.t;
        switch (i) {
            case 0:
                return new o05(q05Var, rq3Var, 0);
            default:
                return new o05(q05Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o05) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        r15 = kotlin.text.StringsKt__StringsKt.split$default(r1, new java.lang.String[]{com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object P;
        List<String> list;
        String str;
        Object value2;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    bfk bfkVar = this.t.f;
                    Boolean bool = Boolean.FALSE;
                    this.s = 1;
                    if (bfk.e(bfkVar, null, null, null, null, null, bool, null, null, null, this, 8127) == lu3Var) {
                        break;
                    }
                } else if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                q05 q05Var = this.t;
                fdi fdiVar = q05Var.m;
                SharedPreferences sharedPreferences = q05Var.h;
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                Object obj2 = null;
                if (i2 == 0) {
                    y6a.M(obj);
                    String valueOf = String.valueOf(Integer.parseInt(iii.H(6, "260720003")));
                    String string = sharedPreferences.getString("AUTH_TOKEN", null);
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, j05.a((j05) value, null, null, null, null, null, null, null, null, null, null, string == null, null, null, false, false, null, false, 268304383)));
                    yw ywVar = new yw(q05Var, string, valueOf, null, 5);
                    this.s = 1;
                    P = yaa.P(ywVar, this);
                    if (P == lu3Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar = (x2g) P;
                if (x2gVar instanceof v2g) {
                    list = ((ApiBranchesResponse) ((v2g) x2gVar).a).getBranches();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putString("API_BRANCH_CACHE", CollectionsKt.f0(list, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                    edit.apply();
                } else {
                    String string2 = sharedPreferences.getString("API_BRANCH_CACHE", null);
                    if (string2 == null || list == null) {
                        list = km5.a;
                    }
                }
                ArrayList x0 = CollectionsKt.x0(CollectionsKt.G0(list), "api.sofascore.com/");
                List H0 = CollectionsKt.H0(x0, new y73(15));
                Iterator it = H0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (StringsKt.J("https://" + uaa.c, (String) next, false)) {
                            obj2 = next;
                        }
                    }
                }
                String str2 = (String) obj2;
                if (str2 == null) {
                    String str3 = (String) CollectionsKt.firstOrNull(x0);
                    str = str3 == null ? "api.sofascore.com/" : str3;
                } else {
                    str = str2;
                }
                do {
                    value2 = fdiVar.getValue();
                } while (!fdiVar.k(value2, j05.a((j05) value2, null, null, null, null, null, null, null, null, null, H0, false, str, null, false, false, null, false, 268107775)));
                break;
        }
        return Unit.a;
    }
}
