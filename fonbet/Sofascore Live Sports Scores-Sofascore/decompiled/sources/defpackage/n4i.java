package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.StageResponse;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ln4i;", "Lq8;", "i4i", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class n4i extends q8 {
    public final s96 e;
    public final qa6 f;
    public final umd g;
    public final amd h;
    public final int i;
    public Integer j;
    public Stage k;
    public final yzc l;
    public final yzc m;
    public final yzc n;
    public final yzc o;
    public final yzc p;
    public final yzc q;
    public final jof r;
    public boolean s;
    public boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4i(Application application, fqg fqgVar, s96 s96Var, qa6 qa6Var, qa6 qa6Var2, umd umdVar, amd amdVar, bt7 bt7Var) {
        super(application);
        fqgVar.getClass();
        s96Var.getClass();
        qa6Var.getClass();
        qa6Var2.getClass();
        umdVar.getClass();
        amdVar.getClass();
        this.e = s96Var;
        this.f = qa6Var;
        this.g = umdVar;
        this.h = amdVar;
        Integer num = (Integer) fqgVar.a("OPEN_STAGE_ID");
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        this.i = intValue;
        Integer num2 = (Integer) fqgVar.a("SUB_STAGE_ID");
        this.j = Integer.valueOf(num2 != null ? num2.intValue() : intValue);
        yzc yzcVar = new yzc();
        this.l = yzcVar;
        this.m = yzcVar;
        yzc yzcVar2 = new yzc();
        this.n = yzcVar2;
        this.o = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.p = yzcVar3;
        this.q = yzcVar3;
        this.r = un0.K(bt7Var.a.f(), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
        this.s = true;
        xw3.L(un0.z(this), hq4.c, null, new h4i(this, fqgVar, (rq3) null, i), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r8 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0045, code lost:
    
        if (r8 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(int i, sq3 sq3Var) {
        j4i j4iVar;
        int i2;
        Stage stage;
        Stage stageParent;
        if (sq3Var instanceof j4i) {
            j4iVar = (j4i) sq3Var;
            int i3 = j4iVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j4iVar.u = i3 - Integer.MIN_VALUE;
                Object obj = j4iVar.s;
                lu3 lu3Var = lu3.a;
                i2 = j4iVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    j4iVar.r = i;
                    j4iVar.u = 1;
                    obj = this.e.y(i, j4iVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return (Stage) obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = j4iVar.r;
                    y6a.M(obj);
                }
                StageResponse stageResponse = (StageResponse) obj;
                stage = stageResponse == null ? stageResponse.getStage() : null;
                if (stage != null) {
                    Stage stage2 = (stage.getType() == ServerType.EVENT || stage.getStageParent() == null) ? stage : null;
                    if (stage2 != null) {
                        return stage2;
                    }
                }
                if (stage != null && (stageParent = stage.getStageParent()) != null) {
                    if (stageParent.getId() == i) {
                        stageParent = null;
                    }
                    if (stageParent != null) {
                        int id = stageParent.getId();
                        j4iVar.r = i;
                        j4iVar.u = 2;
                        obj = k(id, j4iVar);
                    }
                }
                return null;
            }
        }
        j4iVar = new j4i(this, sq3Var);
        Object obj2 = j4iVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = j4iVar.u;
        if (i2 != 0) {
        }
        StageResponse stageResponse2 = (StageResponse) obj2;
        if (stageResponse2 == null) {
        }
        if (stage != null) {
        }
        if (stage != null) {
            if (stageParent.getId() == i) {
            }
            if (stageParent != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable l(Stage stage, sq3 sq3Var) {
        m4i m4iVar;
        int i;
        Stage stage2;
        if (sq3Var instanceof m4i) {
            m4iVar = (m4i) sq3Var;
            int i2 = m4iVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m4iVar.t = i2 - Integer.MIN_VALUE;
                Object obj = m4iVar.r;
                lu3 lu3Var = lu3.a;
                i = m4iVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    m4iVar.t = 1;
                    obj = this.e.a(stage, true, m4iVar);
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
                stage2 = (Stage) obj;
                if (stage2 != null) {
                    return null;
                }
                joa joaVar = l5i.a;
                l5i.l(stage2);
                return stage2;
            }
        }
        m4iVar = new m4i(this, sq3Var);
        Object obj2 = m4iVar.r;
        lu3 lu3Var2 = lu3.a;
        i = m4iVar.t;
        if (i != 0) {
        }
        stage2 = (Stage) obj2;
        if (stage2 != null) {
        }
    }
}
