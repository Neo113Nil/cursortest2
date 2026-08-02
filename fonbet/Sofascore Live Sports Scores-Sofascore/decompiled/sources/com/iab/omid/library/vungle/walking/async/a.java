package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class a extends b {
    public final HashSet<String> c;
    public final JSONObject d;
    public final long e;

    public a(b.InterfaceC0181b interfaceC0181b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0181b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
