package defpackage;

import com.sofascore.model.newNetwork.WSCStoriesResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iqk {
    public final NetworkCoroutineAPI a;
    public final bfk b;

    public iqk(NetworkCoroutineAPI networkCoroutineAPI, bfk bfkVar) {
        networkCoroutineAPI.getClass();
        bfkVar.getClass();
        this.a = networkCoroutineAPI;
        this.b = bfkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(int i, String str, sq3 sq3Var) {
        fqk fqkVar;
        int i2;
        if (sq3Var instanceof fqk) {
            fqkVar = (fqk) sq3Var;
            int i3 = fqkVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fqkVar.t = i3 - Integer.MIN_VALUE;
                Object obj = fqkVar.r;
                lu3 lu3Var = lu3.a;
                i2 = fqkVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    Boolean dataSharingOptOut = this.b.b().getDataSharingOptOut();
                    rq3 rq3Var = null;
                    if (!Boolean.valueOf(!Intrinsics.c(dataSharingOptOut, r2)).equals(Boolean.TRUE)) {
                        return null;
                    }
                    gqk gqkVar = new gqk(this, i, str, rq3Var, 0);
                    fqkVar.t = 1;
                    obj = yaa.P(gqkVar, fqkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (WSCStoriesResponse) yaa.x((x2g) obj);
            }
        }
        fqkVar = new fqk(this, sq3Var);
        Object obj2 = fqkVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = fqkVar.t;
        if (i2 != 0) {
        }
        return (WSCStoriesResponse) yaa.x((x2g) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, sq3 sq3Var) {
        hqk hqkVar;
        int i2;
        Boolean bool;
        if (sq3Var instanceof hqk) {
            hqkVar = (hqk) sq3Var;
            int i3 = hqkVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hqkVar.t = i3 - Integer.MIN_VALUE;
                Object obj = hqkVar.r;
                lu3 lu3Var = lu3.a;
                i2 = hqkVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    Boolean dataSharingOptOut = this.b.b().getDataSharingOptOut();
                    bool = null;
                    Object[] objArr = 0;
                    if (Boolean.valueOf(!Intrinsics.c(dataSharingOptOut, r2)).equals(Boolean.TRUE)) {
                        gqk gqkVar = new gqk(this, i, str, objArr == true ? 1 : 0, 1);
                        hqkVar.t = 1;
                        obj = yaa.P(gqkVar, hqkVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                bool = Boolean.valueOf(x2gVar instanceof v2g);
                return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
            }
        }
        hqkVar = new hqk(this, sq3Var);
        Object obj2 = hqkVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = hqkVar.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        bool = Boolean.valueOf(x2gVar2 instanceof v2g);
        return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
    }
}
