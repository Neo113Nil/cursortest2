package com.inmobi.media;

import defpackage.a70;
import defpackage.h2d;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.rq3;
import defpackage.wzb;
import defpackage.y6a;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3787tk extends hoi implements Function2 {
    public Object a;
    public h2d b;
    public int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ EnumC3943zk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3787tk(String str, Map map, EnumC3943zk enumC3943zk, rq3 rq3Var) {
        super(2, rq3Var);
        this.d = str;
        this.e = map;
        this.f = enumC3943zk;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3787tk(this.d, this.e, this.f, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3787tk) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int a;
        String str;
        h2d h2dVar;
        Dk dk;
        Throwable th;
        h2d h2dVar2;
        lu3 lu3Var = lu3.a;
        int i = this.c;
        try {
        } catch (Exception e) {
            C3839vk c3839vk = C3839vk.a;
            e.getMessage();
        }
        try {
            if (i == 0) {
                y6a.M(obj);
                C3839vk c3839vk2 = C3839vk.a;
                Map map = this.e;
                EnumC3943zk enumC3943zk = this.f;
                Objects.toString(map);
                Objects.toString(enumC3943zk);
                if (C3839vk.h == null) {
                    return Unit.a;
                }
                if (C3839vk.a(this.d, this.e, this.f)) {
                    return Unit.a;
                }
                Ik ik = C3839vk.h;
                if (ik == null) {
                    Intrinsics.i("mTelemetryValidator");
                    throw null;
                }
                EnumC3943zk enumC3943zk2 = this.f;
                String str2 = this.d;
                enumC3943zk2.getClass();
                str2.getClass();
                int ordinal = enumC3943zk2.ordinal();
                if (ordinal == 0) {
                    a = ik.b.a(str2);
                } else {
                    if (ordinal != 1) {
                        throw new ndd();
                    }
                    a = ik.c.a(str2);
                }
                if (a != 0) {
                    if (a != 1) {
                        return Unit.a;
                    }
                    if (this.e.get("samplingRate") == null) {
                        this.e.put("samplingRate", new Integer(100));
                    }
                } else if (this.e.get("samplingRate") == null) {
                    this.e.put("samplingRate", new Integer(wzb.a((1.0d - C3839vk.b().getSamplingFactor()) * 100.0d)));
                }
                String str3 = this.d;
                int ordinal2 = this.f.ordinal();
                if (ordinal2 == 0) {
                    str = "sdk";
                } else {
                    if (ordinal2 != 1) {
                        throw new ndd();
                    }
                    str = "template";
                }
                Dk dk2 = new Dk(str3, null, str);
                this.e.put("eventType", dk2.a);
                Map map2 = this.e;
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                map2.put("eventId", uuid);
                this.e.put("isTemplateEvent", Boolean.valueOf(this.f == EnumC3943zk.TEMPLATE));
                Map map3 = this.e;
                map3.getClass();
                String jSONObject = new JSONObject(map3).toString();
                jSONObject.getClass();
                dk2.b = jSONObject;
                h2dVar = C3839vk.b;
                this.a = dk2;
                this.b = h2dVar;
                this.c = 1;
                if (h2dVar.e(this) != lu3Var) {
                    dk = dk2;
                }
                return lu3Var;
            }
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h2dVar2 = (h2d) this.a;
                try {
                    y6a.M(obj);
                    C3839vk.a.a();
                    Unit unit = Unit.a;
                    h2dVar2.f(null);
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    h2dVar = h2dVar2;
                    h2dVar.f(null);
                    throw th;
                }
            }
            h2dVar = this.b;
            dk = (Dk) this.a;
            y6a.M(obj);
            C3839vk c3839vk3 = C3839vk.a;
            this.a = h2dVar;
            this.b = null;
            this.c = 2;
            if (c3839vk3.a(dk, this) != lu3Var) {
                h2dVar2 = h2dVar;
                C3839vk.a.a();
                Unit unit2 = Unit.a;
                h2dVar2.f(null);
                return Unit.a;
            }
            return lu3Var;
        } catch (Throwable th3) {
            th = th3;
            h2dVar.f(null);
            throw th;
        }
    }
}
