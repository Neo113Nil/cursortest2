package defpackage;

import com.sofascore.model.database.DbSavedSearches;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class as2 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as2(Object obj, String str, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = str;
        this.v = obj2;
        this.w = obj3;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.w;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new as2((cs2) this.t, (String) this.u, (String) obj2, (String) obj, rq3Var, 0);
            case 1:
                return new as2((fsf) this.u, (qf4) obj2, (dsf) obj, rq3Var, 1);
            case 2:
                return new as2((qf4) this.u, (CoroutineContext) obj2, (Function2) obj, rq3Var, 2);
            case 3:
                return new as2((s96) this.t, (String) this.u, (String) obj2, (String) obj, rq3Var, 3);
            case 4:
                return new as2((z18) obj2, obj, rq3Var);
            case 5:
                return new as2((gwg) this.t, (String) this.u, (DbSavedSearches) obj2, (Integer) obj, rq3Var, 5);
            default:
                return new as2((vrj) this.t, (String) this.u, (String) obj2, (String) obj, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((as2) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x012a, code lost:
    
        if (r12 == r8) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e8, code lost:
    
        if (r12 != r8) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0164, code lost:
    
        if (r0.i(r12, true, r11) == r8) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fsf fsfVar;
        dsf dsfVar;
        od4 od4Var;
        Object obj2;
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i = this.r;
        int i2 = 3;
        int i3 = 2;
        Object obj3 = this.w;
        Object obj4 = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object translate = ((cs2) this.t).c.translate((String) this.u, (String) obj4, (String) obj3, this);
                    return translate == lu3Var ? lu3Var : translate;
                }
                if (i4 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                dsf dsfVar2 = (dsf) obj3;
                fsf fsfVar2 = (fsf) this.u;
                qf4 qf4Var = (qf4) obj4;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                try {
                } catch (uu3 unused) {
                    Object obj5 = fsfVar2.a;
                    this.t = dsfVar2;
                    this.s = 3;
                    obj = qf4Var.i(obj5, true, this);
                    break;
                }
                if (i5 == 0) {
                    y6a.M(obj);
                    this.t = fsfVar2;
                    this.s = 1;
                    obj = ((lfi) qf4Var.j.getValue()).e(new ff4(i2, rq3Var), this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                    fsfVar = fsfVar2;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            dsfVar = (dsf) ((Serializable) this.t);
                            y6a.M(obj);
                            dsfVar.a = ((Number) obj).intValue();
                            return Unit.a;
                        }
                        if (i5 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dsfVar2 = (dsf) ((Serializable) this.t);
                        y6a.M(obj);
                        dsfVar2.a = ((Number) obj).intValue();
                        return Unit.a;
                    }
                    fsfVar = (fsf) ((Serializable) this.t);
                    y6a.M(obj);
                }
                fsfVar.a = obj;
                h7a c = qf4Var.c();
                this.t = dsfVar2;
                this.s = 2;
                obj = c.d(this);
                if (obj == lu3Var2) {
                    return lu3Var2;
                }
                dsfVar = dsfVar2;
                dsfVar.a = ((Number) obj).intValue();
                return Unit.a;
            case 2:
                qf4 qf4Var2 = (qf4) this.u;
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = qf4Var2.h(true, this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.t;
                            y6a.M(obj);
                            return obj6;
                        }
                        od4Var = (od4) this.t;
                        y6a.M(obj);
                        obj2 = od4Var.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == od4Var.c) {
                            a70.r("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!Intrinsics.c(od4Var.b, obj)) {
                            this.t = obj;
                            this.s = 3;
                            break;
                        }
                        return obj;
                    }
                    y6a.M(obj);
                }
                od4 od4Var2 = (od4) obj;
                ce4 ce4Var = new ce4((Function2) obj3, od4Var2, rq3Var, i3);
                this.t = od4Var2;
                this.s = 2;
                Object R = xw3.R((CoroutineContext) obj4, ce4Var, this);
                if (R != lu3Var3) {
                    od4Var = od4Var2;
                    obj = R;
                    obj2 = od4Var.b;
                    if ((obj2 == null ? obj2.hashCode() : 0) == od4Var.c) {
                    }
                }
                return lu3Var3;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object monthlyStages = ((s96) this.t).a.monthlyStages((String) this.u, (String) obj4, (String) obj3, this);
                    return monthlyStages == lu3Var4 ? lu3Var4 : monthlyStages;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                z18 z18Var = (z18) obj4;
                File file = z18Var.a;
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            c6h c6hVar = z18Var.b;
                            v52 v52Var = new v52(fileOutputStream3);
                            this.t = fileOutputStream3;
                            this.u = fileOutputStream3;
                            this.s = 1;
                            if (c6hVar.writeTo(obj3, v52Var, this) == lu3Var5) {
                                return lu3Var5;
                            }
                            fileOutputStream = fileOutputStream3;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw t62.P(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = (FileOutputStream) this.u;
                    fileOutputStream = (FileOutputStream) this.t;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            n4o.x(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                Unit unit = Unit.a;
                n4o.x(fileOutputStream, null);
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (gwg.a((gwg) this.t, (String) this.u, (DbSavedSearches) obj4, (Integer) obj3, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object monthlyTournaments = ((vrj) this.t).a.monthlyTournaments((String) this.u, (String) obj4, (String) obj3, this);
                    return monthlyTournaments == lu3Var7 ? lu3Var7 : monthlyTournaments;
                }
                if (i10 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as2(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as2(z18 z18Var, Object obj, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = 4;
        this.v = z18Var;
        this.w = obj;
    }
}
