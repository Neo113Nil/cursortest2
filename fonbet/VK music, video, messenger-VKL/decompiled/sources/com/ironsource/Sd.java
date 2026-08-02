package com.ironsource;

import com.ironsource.C4572u;
import com.ironsource.O7;
import java.util.Map;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes13.dex */
public final class Sd {
    private final C4602vb a;
    private final Map<String, C4572u.d> b;
    private final Map<String, C4572u.d> c;

    public Sd(C4602vb c4602vb, Map<String, C4572u.d> map, Map<String, C4572u.d> map2) {
        this.a = c4602vb;
        this.b = map;
        this.c = map2;
    }

    private final void b(O7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        if (!(a instanceof Result.Failure)) {
            aVar.a(str, str2, num.intValue());
        }
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            this.a.b(str, 3004, a2.getMessage());
        }
    }

    public final void a(O7.a aVar) {
        Map<String, C4572u.d> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4572u.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Qd f = entry.getValue().f();
                if (f != null) {
                    b(aVar, key, f.b(), f.a());
                }
            }
        }
        Map<String, C4572u.d> map2 = this.b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C4572u.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Qd a = entry2.getValue().a();
            if (a != null) {
                a(aVar, key2, a.b(), a.a());
            }
        }
    }

    private final void a(O7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        if (!(a instanceof Result.Failure)) {
            aVar.b(str, str2, num.intValue());
        }
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            this.a.b(str, 3004, a2.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            return s3q0.a;
        }
        return new Result.Failure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid"));
    }
}
