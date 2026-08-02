package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.RootConfig;
import defpackage.a70;
import defpackage.b98;
import defpackage.fsf;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Kh implements b98 {
    public final /* synthetic */ Mh a;
    public final /* synthetic */ b98 b;
    public final /* synthetic */ fsf c;

    public Kh(Mh mh, b98 b98Var, fsf fsfVar) {
        this.a = mh;
        this.b = b98Var;
        this.c = fsfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
    
        if (r13.emit(r1, r6) != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        if (r13 == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.b98
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(AbstractC3875x4 abstractC3875x4, rq3 rq3Var) {
        Jh jh;
        int i;
        Object obj;
        if (rq3Var instanceof Jh) {
            jh = (Jh) rq3Var;
            int i2 = jh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jh.d = i2 - Integer.MIN_VALUE;
                Jh jh2 = jh;
                Object obj2 = jh2.b;
                lu3 lu3Var = lu3.a;
                i = jh2.d;
                if (i != 0) {
                    y6a.M(obj2);
                    if (!(abstractC3875x4 instanceof C3901y4)) {
                        if (!(abstractC3875x4 instanceof C3512j4)) {
                            zzl.b();
                            return null;
                        }
                        return Unit.a;
                    }
                    Mh mh = this.a;
                    C3901y4 c3901y4 = (C3901y4) abstractC3875x4;
                    jh2.a = abstractC3875x4;
                    jh2.d = 1;
                    int i3 = c3901y4.a;
                    if (i3 == 200) {
                        C3487i4 c3487i4 = mh.a;
                        Config config = c3901y4.b;
                        C3724r9 c3724r9 = c3487i4.a;
                        config.getClass();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("config_value", config.toJson().toString());
                        contentValues.put("config_type", config.getType());
                        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
                        obj = c3724r9.a("config_db", contentValues, 5, jh2);
                        if (obj != lu3Var) {
                            obj = Unit.a;
                        }
                        if (obj != lu3Var) {
                            obj = Unit.a;
                        }
                    } else if (i3 == 304) {
                        C3487i4 c3487i42 = mh.a;
                        String type = c3901y4.b.getType();
                        long lastUpdateTimeStamp = c3901y4.b.getLastUpdateTimeStamp();
                        c3487i42.getClass();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("update_ts", new Long(lastUpdateTimeStamp));
                        obj = C3724r9.a(c3487i42.a, "config_db", contentValues2, "config_type=?", new String[]{type}, jh2, 16);
                        if (obj != lu3Var) {
                            obj = Unit.a;
                        }
                        if (obj != lu3Var) {
                            obj = Unit.a;
                        }
                    } else {
                        obj = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        abstractC3875x4 = jh2.a;
                        y6a.M(obj2);
                        if (((C3901y4) abstractC3875x4).b instanceof RootConfig) {
                            this.c.a = Mh.a(this.a);
                        }
                        return Unit.a;
                    }
                    abstractC3875x4 = jh2.a;
                    y6a.M(obj2);
                }
                b98 b98Var = this.b;
                Config config2 = ((C3901y4) abstractC3875x4).b;
                jh2.a = abstractC3875x4;
                jh2.d = 2;
            }
        }
        jh = new Jh(this, rq3Var);
        Jh jh22 = jh;
        Object obj22 = jh22.b;
        lu3 lu3Var2 = lu3.a;
        i = jh22.d;
        if (i != 0) {
        }
        b98 b98Var2 = this.b;
        Config config22 = ((C3901y4) abstractC3875x4).b;
        jh22.a = abstractC3875x4;
        jh22.d = 2;
    }
}
