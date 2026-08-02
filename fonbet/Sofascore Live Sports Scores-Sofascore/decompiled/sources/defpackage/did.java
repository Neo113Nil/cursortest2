package defpackage;

import com.sofascore.local_persistance.UserAccount;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class did extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ jid t;
    public final /* synthetic */ HashSet u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ did(jid jidVar, HashSet hashSet, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = jidVar;
        this.u = hashSet;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        HashSet hashSet = this.u;
        jid jidVar = this.t;
        switch (i) {
            case 0:
                return new did(jidVar, hashSet, rq3Var, 0);
            case 1:
                return new did(jidVar, hashSet, rq3Var, 1);
            case 2:
                return new did(jidVar, hashSet, rq3Var, 2);
            case 3:
                return new did(jidVar, hashSet, rq3Var, 3);
            case 4:
                return new did(jidVar, hashSet, rq3Var, 4);
            default:
                return new did(jidVar, hashSet, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((did) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r9 == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
    
        if (r9 == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0108, code lost:
    
        if (r9 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f5, code lost:
    
        if (r9 == r0) goto L72;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        HashSet hashSet = this.u;
        boolean z = true;
        jid jidVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dhk dhkVar = jidVar.h;
                this.s = 1;
                Object l = dhkVar.l(hashSet, this);
                return l == lu3Var ? lu3Var : l;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    bfk bfkVar = jidVar.a;
                    this.s = 1;
                    obj = bfkVar.c(this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        z = ((Boolean) obj).booleanValue();
                        return Boolean.valueOf(z);
                    }
                    y6a.M(obj);
                }
                if (((UserAccount) obj).getIsLoggedIn()) {
                    dhk dhkVar2 = jidVar.h;
                    this.s = 2;
                    obj = dhkVar2.k(hashSet, this);
                    break;
                }
                return Boolean.valueOf(z);
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dhk dhkVar3 = jidVar.h;
                this.s = 1;
                Object q = dhkVar3.q(hashSet, this);
                return q == lu3Var3 ? lu3Var3 : q;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    bfk bfkVar2 = jidVar.a;
                    this.s = 1;
                    obj = bfkVar2.c(this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        z = ((Boolean) obj).booleanValue();
                        return Boolean.valueOf(z);
                    }
                    y6a.M(obj);
                }
                if (((UserAccount) obj).getIsLoggedIn()) {
                    dhk dhkVar4 = jidVar.h;
                    this.s = 2;
                    obj = dhkVar4.p(hashSet, this);
                    break;
                }
                return Boolean.valueOf(z);
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dhk dhkVar5 = jidVar.h;
                this.s = 1;
                Object t = dhkVar5.t(hashSet, this);
                return t == lu3Var5 ? lu3Var5 : t;
            default:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    bfk bfkVar3 = jidVar.a;
                    this.s = 1;
                    obj = bfkVar3.c(this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        z = ((Boolean) obj).booleanValue();
                        return Boolean.valueOf(z);
                    }
                    y6a.M(obj);
                }
                if (((UserAccount) obj).getIsLoggedIn()) {
                    dhk dhkVar6 = jidVar.h;
                    this.s = 2;
                    obj = dhkVar6.s(hashSet, this);
                    break;
                }
                return Boolean.valueOf(z);
        }
    }
}
