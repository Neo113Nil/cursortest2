package defpackage;

import com.sofascore.model.database.DbWatchedVideo;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class irk {
    public final erk a;

    public irk(erk erkVar) {
        this.a = erkVar;
    }

    public final Object a(long j, int i, sq3 sq3Var) {
        DbWatchedVideo dbWatchedVideo = new DbWatchedVideo(i, j);
        erk erkVar = this.a;
        Object U = gz8.U(sq3Var, erkVar.a, false, true, new mwj(22, erkVar, dbWatchedVideo));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(sq3 sq3Var) {
        hrk hrkVar;
        int i;
        if (sq3Var instanceof hrk) {
            hrkVar = (hrk) sq3Var;
            int i2 = hrkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hrkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = hrkVar.r;
                lu3 lu3Var = lu3.a;
                i = hrkVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    hrkVar.t = 1;
                    obj = gz8.U(hrkVar, this.a.a, true, false, new wik(23));
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
                return CollectionsKt.V0((Iterable) obj);
            }
        }
        hrkVar = new hrk(this, sq3Var);
        Object obj2 = hrkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = hrkVar.t;
        if (i != 0) {
        }
        return CollectionsKt.V0((Iterable) obj2);
    }
}
