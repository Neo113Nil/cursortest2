package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4403y implements InterfaceC4240of<JSONObject>, InterfaceC4204mf<C4367w> {

    @NotNull
    private final Map<String, H0> a = new LinkedHashMap();
    private int b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4186lf.values().length];
            try {
                iArr[EnumC4186lf.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4186lf.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4186lf.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4186lf.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4186lf.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4204mf
    public void a(@NotNull C4367w c4367w) {
        c4367w.getClass();
        String c = c4367w.c();
        Map<String, H0> map = this.a;
        H0 h0 = map.get(c);
        if (h0 == null) {
            h0 = new H0();
            map.put(c, h0);
        }
        h0.a(c4367w.a(new C4385x()));
        b(c4367w);
    }

    @Override // com.ironsource.InterfaceC3956a7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4222nf enumC4222nf) {
        enumC4222nf.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, H0> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a2 = entry.getValue().a(enumC4222nf);
            if (a2.length() > 0) {
                jSONObject.put(key, a2);
            }
        }
        return jSONObject;
    }

    public final int a() {
        return this.b;
    }

    private final void b(C4367w c4367w) {
        int i;
        int i2 = a.a[c4367w.f().ordinal()];
        if (i2 == 2) {
            this.b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.b) > 0) {
            this.b = i - 1;
        }
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }
}
