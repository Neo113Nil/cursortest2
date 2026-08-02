package com.inmobi.media;

import android.content.Context;
import defpackage.a70;
import defpackage.km5;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ph0;
import defpackage.sq3;
import defpackage.y6a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Wb {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final WeakReference f;
    public final AtomicBoolean g;

    public Wb(Context context, String str, long j, long j2, int i, int i2) {
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        WeakReference weakReference = new WeakReference(context);
        this.f = weakReference;
        this.g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            ku3 ku3Var = AbstractC3417fc.a;
            AbstractC3391ec.a(new Vb(this, context2, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ae -> B:11:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Db db, sq3 sq3Var) {
        Rb rb;
        int i;
        Context context;
        Iterable iterable;
        Iterator it;
        if (sq3Var instanceof Rb) {
            rb = (Rb) sq3Var;
            int i2 = rb.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rb.e = i2 - Integer.MIN_VALUE;
                Object obj = rb.c;
                lu3 lu3Var = lu3.a;
                i = rb.e;
                if (i != 0) {
                    y6a.M(obj);
                    AbstractC3443gc.a(db.a);
                    Kb kb = (Kb) Lb.a.getValue();
                    String str = db.a;
                    rb.e = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str2 = rb.b;
                        it = rb.a;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            AbstractC3443gc.a(str2);
                        }
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            Kb kb2 = (Kb) Lb.a.getValue();
                            rb.a = it;
                            rb.b = str2;
                            rb.e = 2;
                            obj = kb2.b(str2, rb);
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                context = (Context) this.f.get();
                if (context != null) {
                    ku3 ku3Var = AbstractC3417fc.a;
                    String a = AbstractC3391ec.a(context);
                    a.getClass();
                    File file = new File(a);
                    if (file.exists() && file.isDirectory()) {
                        String[] list = file.list();
                        if (list == null || (iterable = ph0.X(list)) == null) {
                            iterable = km5.a;
                        }
                    } else {
                        iterable = km5.a;
                    }
                    it = iterable.iterator();
                    if (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        rb = new Rb(this, sq3Var);
        Object obj2 = rb.c;
        lu3 lu3Var2 = lu3.a;
        i = rb.e;
        if (i != 0) {
        }
        context = (Context) this.f.get();
        if (context != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x012b, code lost:
    
        if (a(r2, r4) == r5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
    
        if (defpackage.n4o.y(r7, r4) != r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        if (r6 == r5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0111 -> B:20:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Db db, sq3 sq3Var) {
        Ub ub;
        Object obj;
        int i;
        Object a;
        InterfaceC3317bf interfaceC3317bf;
        String str2;
        Db db2;
        Ub ub2;
        Object obj2;
        int i2;
        Db db3;
        Kb kb;
        String str3 = str;
        Db db4 = db;
        if (sq3Var instanceof Ub) {
            ub = (Ub) sq3Var;
            int i3 = ub.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ub.f = i3 - Integer.MIN_VALUE;
                Object obj3 = ub.d;
                obj = lu3.a;
                i = ub.f;
                if (i != 0) {
                    y6a.M(obj3);
                    if (this.g.get()) {
                        return Unit.a;
                    }
                    if (db4.d != 0 && System.currentTimeMillis() - db4.d < this.b) {
                        return Unit.a;
                    }
                    ub.a = str3;
                    ub.b = db4;
                    ub.f = 1;
                    a = a(str3, db4, ub);
                } else if (i == 1) {
                    Db db5 = ub.b;
                    String str4 = ub.a;
                    y6a.M(obj3);
                    db4 = db5;
                    str3 = str4;
                    a = obj3;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            db2 = ub.c;
                            db4 = ub.b;
                            str2 = ub.a;
                            y6a.M(obj3);
                            Db db6 = db4;
                            Db db7 = db2;
                            ub.a = str2;
                            ub.b = db6;
                            ub.c = null;
                            ub.f = 4;
                            Object a2 = a(str2, db7, ub);
                            if (a2 != obj) {
                                db4 = db6;
                                str3 = str2;
                                ub2 = ub;
                                obj2 = a2;
                                Ub ub3 = ub2;
                                interfaceC3317bf = (InterfaceC3317bf) obj2;
                                ub = ub3;
                                if (interfaceC3317bf == null) {
                                }
                                db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
                                kb = (Kb) Lb.a.getValue();
                                ub.a = str3;
                                ub.b = db4;
                                ub.c = db3;
                                ub.f = 2;
                                if (kb.b(db3, ub) != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i != 4) {
                            if (i == 5) {
                                y6a.M(obj3);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Db db8 = ub.b;
                        String str5 = ub.a;
                        y6a.M(obj3);
                        db4 = db8;
                        str3 = str5;
                        ub2 = ub;
                        obj2 = obj3;
                        Ub ub32 = ub2;
                        interfaceC3317bf = (InterfaceC3317bf) obj2;
                        ub = ub32;
                        if (!(interfaceC3317bf == null && Fl.a(interfaceC3317bf)) && (i2 = db4.c + 1) < this.d) {
                            db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
                            kb = (Kb) Lb.a.getValue();
                            ub.a = str3;
                            ub.b = db4;
                            ub.c = db3;
                            ub.f = 2;
                            if (kb.b(db3, ub) != obj) {
                                str2 = str3;
                                db2 = db3;
                                long j = this.b;
                                ub.a = str2;
                                ub.b = db4;
                                ub.c = db2;
                                ub.f = 3;
                            }
                        } else {
                            ub.a = null;
                            ub.b = null;
                            ub.f = 5;
                        }
                        return obj;
                    }
                    db2 = ub.c;
                    db4 = ub.b;
                    str2 = ub.a;
                    y6a.M(obj3);
                    long j2 = this.b;
                    ub.a = str2;
                    ub.b = db4;
                    ub.c = db2;
                    ub.f = 3;
                }
                interfaceC3317bf = (InterfaceC3317bf) a;
                if (interfaceC3317bf == null) {
                }
                db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
                kb = (Kb) Lb.a.getValue();
                ub.a = str3;
                ub.b = db4;
                ub.c = db3;
                ub.f = 2;
                if (kb.b(db3, ub) != obj) {
                }
                return obj;
            }
        }
        ub = new Ub(this, sq3Var);
        Object obj32 = ub.d;
        obj = lu3.a;
        i = ub.f;
        if (i != 0) {
        }
        interfaceC3317bf = (InterfaceC3317bf) a;
        if (interfaceC3317bf == null) {
        }
        db3 = new Db(db4.a, db4.b, i2, System.currentTimeMillis(), false, 0, 48);
        kb = (Kb) Lb.a.getValue();
        ub.a = str3;
        ub.b = db4;
        ub.c = db3;
        ub.f = 2;
        if (kb.b(db3, ub) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, sq3 sq3Var) {
        Sb sb;
        int i;
        Context context2;
        Iterator it;
        if (sq3Var instanceof Sb) {
            sb = (Sb) sq3Var;
            int i2 = sb.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sb.e = i2 - Integer.MIN_VALUE;
                Object obj = sb.c;
                Object obj2 = lu3.a;
                i = sb.e;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.g.get()) {
                        return Unit.a;
                    }
                    Kb kb = (Kb) Lb.a.getValue();
                    sb.a = context;
                    sb.e = 1;
                    obj = kb.a(sb);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = sb.b;
                        context2 = sb.a;
                        y6a.M(obj);
                        while (it.hasNext()) {
                            Db db = (Db) it.next();
                            String str = this.a;
                            sb.a = context2;
                            sb.b = it;
                            sb.e = 2;
                            if (b(str, db, sb) == obj2) {
                                return obj2;
                            }
                        }
                        return Unit.a;
                    }
                    context = sb.a;
                    y6a.M(obj);
                }
                context2 = context;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        sb = new Sb(this, sq3Var);
        Object obj3 = sb.c;
        Object obj22 = lu3.a;
        i = sb.e;
        if (i != 0) {
        }
        context2 = context;
        it = ((List) obj3).iterator();
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Db db, sq3 sq3Var) {
        Tb tb;
        int i;
        try {
            if (sq3Var instanceof Tb) {
                tb = (Tb) sq3Var;
                int i2 = tb.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tb.c = i2 - Integer.MIN_VALUE;
                    Object obj = tb.a;
                    lu3 lu3Var = lu3.a;
                    i = tb.c;
                    if (i == 0) {
                        if (i == 1) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    F9 f9 = (F9) Ve.h.getValue();
                    str.getClass();
                    db.getClass();
                    str.getClass();
                    Ze ze = new Ze(str, null, null, new C3283a7(db.a), null, 54);
                    tb.c = 1;
                    Object a = f9.a.a(ze, tb);
                    return a == lu3Var ? lu3Var : a;
                }
            }
            if (i == 0) {
            }
        } catch (IllegalStateException unused) {
            return null;
        }
        tb = new Tb(this, sq3Var);
        Object obj2 = tb.a;
        lu3 lu3Var2 = lu3.a;
        i = tb.c;
    }
}
