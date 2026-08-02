package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Mb {

    @NotNull
    private final com.ironsource.mediationsdk.c a;

    @NotNull
    private final C4181la b;

    @NotNull
    private final T9 c;

    @NotNull
    private final Q6 d;

    @NotNull
    private final C4157k4 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Mb(com.ironsource.mediationsdk.c cVar, C4181la c4181la, T9 t9, Q6 q6, C4157k4 c4157k4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, c4181la, t9, q6, r7);
        if ((i & 1) != 0) {
            cVar = com.ironsource.mediationsdk.c.d();
            cVar.getClass();
        }
        if ((i & 2) != 0) {
            c4181la = C4181la.b();
            c4181la.getClass();
        }
        t9 = (i & 4) != 0 ? new T9() : t9;
        q6 = (i & 8) != 0 ? new Q6(t9) : q6;
        if ((i & 16) != 0) {
            c4157k4 = C4157k4.d();
            c4157k4.getClass();
        }
        C4157k4 c4157k42 = c4157k4;
    }

    private final void a() {
        try {
            HashMap hashMap = new HashMap(this.a.f());
            hashMap.putAll(this.b.c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), (List) entry.getValue());
            }
            this.d.a(jSONObject);
            this.c.a(jSONObject);
        } catch (JSONException e) {
            this.e.a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
    }

    public final void b(boolean z) {
        List<String> list = com.ironsource.mediationsdk.metadata.a.g;
        list.getClass();
        a(list, z);
    }

    public Mb(@NotNull com.ironsource.mediationsdk.c cVar, @NotNull C4181la c4181la, @NotNull T9 t9, @NotNull Q6 q6, @NotNull C4157k4 c4157k4) {
        cVar.getClass();
        c4181la.getClass();
        t9.getClass();
        q6.getClass();
        c4157k4.getClass();
        this.a = cVar;
        this.b = c4181la;
        this.c = t9;
        this.d = q6;
        this.e = c4157k4;
    }

    public Mb() {
        this(null, null, null, null, null, 31, null);
    }

    private final void a(String str, boolean z) {
        List<String> c = kotlin.collections.a.c(String.valueOf(z));
        if (MetaDataUtils.isMediationOnlyKey(str)) {
            this.b.a(str, c);
        } else {
            this.a.c(str, c);
        }
    }

    public final void a(boolean z) {
        a(kotlin.collections.a.c(com.ironsource.mediationsdk.metadata.a.a), z);
    }

    private final void a(List<String> list, boolean z) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), z);
        }
        a();
    }
}
