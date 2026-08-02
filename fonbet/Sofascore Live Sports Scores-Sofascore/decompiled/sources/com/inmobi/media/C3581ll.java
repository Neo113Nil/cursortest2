package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ll, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3581ll {
    public static final h2d c = new j2d();
    public final InterfaceC3317bf a;
    public final LinkedHashSet b;

    public C3581ll(InterfaceC3317bf interfaceC3317bf, LinkedHashSet linkedHashSet) {
        interfaceC3317bf.getClass();
        linkedHashSet.getClass();
        this.a = interfaceC3317bf;
        this.b = linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x007f, B:14:0x0098, B:16:0x009e, B:23:0x00a6, B:19:0x00b1, B:26:0x00b5, B:33:0x0054, B:37:0x0063, B:43:0x0079, B:44:0x00c0), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x007f, B:14:0x0098, B:16:0x009e, B:23:0x00a6, B:19:0x00b1, B:26:0x00b5, B:33:0x0054, B:37:0x0063, B:43:0x0079, B:44:0x00c0), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, sq3 sq3Var) {
        C3555kl c3555kl;
        Object obj;
        int i;
        JSONObject jSONObject2;
        h2d h2dVar;
        int c2;
        Object a;
        JSONObject jSONObject3;
        try {
            if (sq3Var instanceof C3555kl) {
                c3555kl = (C3555kl) sq3Var;
                int i2 = c3555kl.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3555kl.e = i2 - Integer.MIN_VALUE;
                    Object obj2 = c3555kl.c;
                    obj = lu3.a;
                    i = c3555kl.e;
                    if (i != 0) {
                        y6a.M(obj2);
                        h2d h2dVar2 = c;
                        c3555kl.a = jSONObject;
                        c3555kl.b = h2dVar2;
                        c3555kl.e = 1;
                        if (h2dVar2.e(c3555kl) != obj) {
                            jSONObject2 = jSONObject;
                            h2dVar = h2dVar2;
                        }
                        return obj;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = c3555kl.b;
                        jSONObject3 = c3555kl.a;
                        y6a.M(obj2);
                        Q9.b(AbstractC3633nl.a(jSONObject3, Q9.b()));
                        JSONObject a2 = AbstractC3633nl.a(Q9.b());
                        for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.b) {
                            if (a2 == null) {
                                AbstractC3633nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                            } else {
                                AbstractC3633nl.a(inMobiUnifiedIdInterface, a2, null);
                            }
                        }
                        this.b.clear();
                        Unit unit = Unit.a;
                        h2dVar.f(null);
                        return unit;
                    }
                    h2dVar = c3555kl.b;
                    jSONObject2 = c3555kl.a;
                    y6a.M(obj2);
                    c2 = this.a.c();
                    C3437g6 c3437g6 = EnumC3489i6.b;
                    if (c2 != 192 && c2 != 0) {
                        C3503il c3503il = C3503il.a;
                        c3555kl.a = jSONObject2;
                        c3555kl.b = h2dVar;
                        c3555kl.e = 2;
                        a = N3.a(C3503il.b, new C3375dl(null), c3555kl);
                        if (a == obj) {
                            a = Unit.a;
                        }
                        if (a != obj) {
                            jSONObject3 = jSONObject2;
                            Q9.b(AbstractC3633nl.a(jSONObject3, Q9.b()));
                            JSONObject a22 = AbstractC3633nl.a(Q9.b());
                            while (r0.hasNext()) {
                            }
                            this.b.clear();
                            Unit unit2 = Unit.a;
                            h2dVar.f(null);
                            return unit2;
                        }
                        return obj;
                    }
                    Unit unit3 = Unit.a;
                    h2dVar.f(null);
                    return unit3;
                }
            }
            if (i != 0) {
            }
            c2 = this.a.c();
            C3437g6 c3437g62 = EnumC3489i6.b;
            if (c2 != 192) {
                C3503il c3503il2 = C3503il.a;
                c3555kl.a = jSONObject2;
                c3555kl.b = h2dVar;
                c3555kl.e = 2;
                a = N3.a(C3503il.b, new C3375dl(null), c3555kl);
                if (a == obj) {
                }
                if (a != obj) {
                }
                return obj;
            }
            Unit unit32 = Unit.a;
            h2dVar.f(null);
            return unit32;
        } catch (Throwable th) {
            jSONObject.f(null);
            throw th;
        }
        c3555kl = new C3555kl(this, sq3Var);
        Object obj22 = c3555kl.c;
        obj = lu3.a;
        i = c3555kl.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:26:0x0059, B:30:0x007f, B:36:0x0095, B:37:0x00a9), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, sq3 sq3Var) {
        C3529jl c3529jl;
        Object obj;
        int i2;
        String str2;
        h2d h2dVar;
        int c2;
        Object a;
        h2d h2dVar2;
        String str3;
        try {
            if (sq3Var instanceof C3529jl) {
                c3529jl = (C3529jl) sq3Var;
                int i3 = c3529jl.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c3529jl.f = i3 - Integer.MIN_VALUE;
                    Object obj2 = c3529jl.d;
                    obj = lu3.a;
                    i2 = c3529jl.f;
                    if (i2 != 0) {
                        y6a.M(obj2);
                        h2d h2dVar3 = c;
                        c3529jl.b = str;
                        c3529jl.c = h2dVar3;
                        c3529jl.a = i;
                        c3529jl.f = 1;
                        if (h2dVar3.e(c3529jl) != obj) {
                            str2 = str;
                            h2dVar = h2dVar3;
                        }
                        return obj;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar2 = c3529jl.c;
                        str3 = c3529jl.b;
                        try {
                            y6a.M(obj2);
                            a(str3);
                            Unit unit = Unit.a;
                            h2dVar2.f(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            h2dVar = h2dVar2;
                            h2dVar.f(null);
                            throw th;
                        }
                    }
                    i = c3529jl.a;
                    h2dVar = c3529jl.c;
                    str2 = c3529jl.b;
                    y6a.M(obj2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
                    C3839vk c3839vk = C3839vk.a;
                    C3839vk.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC3943zk.SDK);
                    c2 = this.a.c();
                    C3437g6 c3437g6 = EnumC3489i6.b;
                    if (c2 != 192 && c2 != 0) {
                        C3503il c3503il = C3503il.a;
                        c3529jl.b = str2;
                        c3529jl.c = h2dVar;
                        c3529jl.f = 2;
                        a = N3.a(C3503il.b, new C3375dl(null), c3529jl);
                        if (a == obj) {
                            a = Unit.a;
                        }
                        if (a != obj) {
                            h2dVar2 = h2dVar;
                            str3 = str2;
                            a(str3);
                            Unit unit2 = Unit.a;
                            h2dVar2.f(null);
                            return unit2;
                        }
                        return obj;
                    }
                    Unit unit3 = Unit.a;
                    h2dVar.f(null);
                    return unit3;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
            C3839vk c3839vk2 = C3839vk.a;
            C3839vk.b("UnifiedIdNetworkResponseFailure", linkedHashMap2, EnumC3943zk.SDK);
            c2 = this.a.c();
            C3437g6 c3437g62 = EnumC3489i6.b;
            if (c2 != 192) {
                C3503il c3503il2 = C3503il.a;
                c3529jl.b = str2;
                c3529jl.c = h2dVar;
                c3529jl.f = 2;
                a = N3.a(C3503il.b, new C3375dl(null), c3529jl);
                if (a == obj) {
                }
                if (a != obj) {
                }
                return obj;
            }
            Unit unit32 = Unit.a;
            h2dVar.f(null);
            return unit32;
        } catch (Throwable th2) {
            th = th2;
            h2dVar.f(null);
            throw th;
        }
        c3529jl = new C3529jl(this, sq3Var);
        Object obj22 = c3529jl.d;
        obj = lu3.a;
        i2 = c3529jl.f;
        if (i2 != 0) {
        }
    }

    public final void a(String str) {
        JSONObject a = AbstractC3633nl.a(Q9.b());
        try {
            if (a != null) {
                try {
                    if (a.has("ufids") && a.getJSONArray("ufids").length() > 0) {
                        Iterator it = this.b.iterator();
                        while (it.hasNext()) {
                            AbstractC3633nl.a((InMobiUnifiedIdInterface) it.next(), a, null);
                        }
                        this.b.clear();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    this.b.clear();
                    return;
                }
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                AbstractC3633nl.a((InMobiUnifiedIdInterface) it2.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
            }
            this.b.clear();
        } catch (Throwable th) {
            this.b.clear();
            throw th;
        }
    }
}
