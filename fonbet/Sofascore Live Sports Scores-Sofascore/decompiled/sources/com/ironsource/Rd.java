package com.ironsource;

import com.ironsource.C4331u;
import com.ironsource.L7;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rd {

    @NotNull
    private final C4325tb a;

    @Nullable
    private final Map<String, C4331u.d> b;

    @Nullable
    private final Map<String, C4331u.d> c;

    public Rd(@NotNull C4325tb c4325tb, @Nullable Map<String, C4331u.d> map, @Nullable Map<String, C4331u.d> map2) {
        c4325tb.getClass();
        this.a = c4325tb;
        this.b = map;
        this.c = map2;
    }

    private final void b(L7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        p2g p2gVar = w2g.b;
        if (!(a instanceof u2g)) {
            str2.getClass();
            num.getClass();
            aVar.a(str, str2, num.intValue());
        }
        Throwable a2 = w2g.a(a);
        if (a2 != null) {
            this.a.b(str, 3004, a2.getMessage());
        }
    }

    public final void a(@NotNull L7.a aVar) {
        aVar.getClass();
        Map<String, C4331u.d> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4331u.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Pd f = entry.getValue().f();
                if (f != null) {
                    b(aVar, key, f.b(), f.a());
                }
            }
        }
        Map<String, C4331u.d> map2 = this.b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C4331u.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Pd a = entry2.getValue().a();
            if (a != null) {
                a(aVar, key2, a.b(), a.a());
            }
        }
    }

    private final void a(L7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        p2g p2gVar = w2g.b;
        if (!(a instanceof u2g)) {
            str2.getClass();
            num.getClass();
            aVar.b(str, str2, num.intValue());
        }
        Throwable a2 = w2g.a(a);
        if (a2 != null) {
            this.a.b(str, 3004, a2.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            p2g p2gVar = w2g.b;
            return Unit.a;
        }
        p2g p2gVar2 = w2g.b;
        return new u2g(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid"));
    }
}
