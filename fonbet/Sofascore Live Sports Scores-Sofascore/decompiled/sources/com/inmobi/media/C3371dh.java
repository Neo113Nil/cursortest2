package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.y6a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.dh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3371dh extends hoi implements Function2 {
    public Map a;
    public int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ SignalsConfig.PublisherConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3371dh(Map map, SignalsConfig.PublisherConfig publisherConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = map;
        this.d = publisherConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3371dh(this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3371dh(this.c, this.d, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x015b, code lost:
    
        if (com.inmobi.media.C3422fh.b(r13, r1, r3, r12) == r0) goto L70;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        lu3 lu3Var = lu3.a;
        int i = this.b;
        try {
        } catch (Exception unused) {
            Xb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
        if (i == 0) {
            y6a.M(obj);
            Objects.toString(this.c);
            Pair b = AbstractC3448gh.b(this.c);
            Map map2 = (Map) b.a;
            Map map3 = (Map) b.b;
            if (!map2.isEmpty()) {
                C3422fh c3422fh = C3422fh.a;
                JSONObject b2 = AbstractC3448gh.b(AbstractC3448gh.a(AbstractC3448gh.d(tub.k(AbstractC3448gh.a(c3422fh.b(), C3422fh.c()), map2), this.d)), this.d);
                if (b2 != null) {
                    JSONObject a = C3422fh.a(c3422fh);
                    a.getClass();
                    Iterator<String> keys = b2.keys();
                    keys.getClass();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a.put(next, b2.opt(next));
                    }
                    C3422fh c3422fh2 = C3422fh.a;
                    this.a = map3;
                    this.b = 1;
                    if (c3422fh2.a(a, this) == lu3Var) {
                        return lu3Var;
                    }
                }
            }
            map = map3;
        } else {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = this.a;
            y6a.M(obj);
        }
        if (!map.isEmpty()) {
            Map map4 = AbstractC3448gh.a;
            Set keySet = map.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (!kotlin.text.c.v((String) it.next(), "dir_", false)) {
                        Set keySet2 = map.keySet();
                        if (!(keySet2 instanceof Collection) || !keySet2.isEmpty()) {
                            Iterator it2 = keySet2.iterator();
                            while (it2.hasNext()) {
                                if (!kotlin.text.c.v((String) it2.next(), "obj_", false)) {
                                    Set keySet3 = map.keySet();
                                    if (!(keySet3 instanceof Collection) || !keySet3.isEmpty()) {
                                        Iterator it3 = keySet3.iterator();
                                        while (it3.hasNext()) {
                                            if (!kotlin.text.c.v((String) it3.next(), "auto_", false)) {
                                                Xb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to unsupported or mixed keys = " + map + ". Each call must contain only one type of new flow signals (obj_* or dir_*)");
                                                break;
                                            }
                                        }
                                    }
                                    C3422fh c3422fh3 = C3422fh.a;
                                    SignalsConfig.PublisherConfig publisherConfig = this.d;
                                    this.a = null;
                                    this.b = 4;
                                    if (C3422fh.a(c3422fh3, map, publisherConfig, this) == lu3Var) {
                                        return lu3Var;
                                    }
                                }
                            }
                        }
                        C3422fh c3422fh4 = C3422fh.a;
                        SignalsConfig.PublisherConfig publisherConfig2 = this.d;
                        this.a = null;
                        this.b = 3;
                        if (C3422fh.c(c3422fh4, map, publisherConfig2, this) == lu3Var) {
                            return lu3Var;
                        }
                    }
                }
            }
            C3422fh c3422fh5 = C3422fh.a;
            SignalsConfig.PublisherConfig publisherConfig3 = this.d;
            this.a = null;
            this.b = 2;
        }
        return Unit.a;
    }
}
