package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.service.SyncWorker;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f54 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public int u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(tj7 tj7Var, int i, Integer num, Integer num2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.x = tj7Var;
        this.u = i;
        this.y = num;
        this.z = num2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new f54((q54) this.y, rq3Var);
            case 1:
                f54 f54Var = new f54(this.u, rq3Var, (c36) this.z);
                f54Var.t = obj;
                return f54Var;
            case 2:
                f54 f54Var2 = new f54((j67) this.x, (e37) this.y, (ev6) this.z, rq3Var, 2);
                f54Var2.t = obj;
                return f54Var2;
            case 3:
                f54 f54Var3 = new f54((tj7) this.x, this.u, (Integer) this.y, (Integer) this.z, rq3Var);
                f54Var3.w = obj;
                return f54Var3;
            case 4:
                return new f54((gk7) this.y, (wi7) this.z, rq3Var, 4);
            case 5:
                f54 f54Var4 = new f54(this.u, (du9[]) this.z, rq3Var);
                f54Var4.t = obj;
                return f54Var4;
            case 6:
                f54 f54Var5 = new f54((yta) this.x, (Season) this.y, (String) this.z, rq3Var, 6);
                f54Var5.t = obj;
                return f54Var5;
            case 7:
                f54 f54Var6 = new f54((MediaPost) this.w, (Function2) this.x, (Event) this.y, (u8c) this.z, rq3Var);
                f54Var6.t = obj;
                return f54Var6;
            case 8:
                f54 f54Var7 = new f54((h8i) this.y, (j5i) this.z, rq3Var, 8);
                f54Var7.t = obj;
                return f54Var7;
            default:
                return new f54((SyncWorker) this.t, (ArrayList) this.z, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((f54) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0656  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x03b3 -> B:122:0x03b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x0656 -> B:221:0x065a). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f54.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(int i, du9[] du9VarArr, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.u = i;
        this.z = du9VarArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f54(q8 q8Var, Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.y = q8Var;
        this.z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(q54 q54Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.y = q54Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(int i, rq3 rq3Var, c36 c36Var) {
        super(2, rq3Var);
        this.r = 1;
        this.z = c36Var;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(MediaPost mediaPost, Function2 function2, Event event, u8c u8cVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 7;
        this.w = mediaPost;
        this.x = function2;
        this.y = event;
        this.z = u8cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f54(SyncWorker syncWorker, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 9;
        this.t = syncWorker;
        this.z = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f54(Object obj, Object obj2, Serializable serializable, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
        this.y = obj2;
        this.z = serializable;
    }
}
