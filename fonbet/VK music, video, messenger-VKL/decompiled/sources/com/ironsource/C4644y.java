package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4644y implements InterfaceC4517qf<JSONObject>, InterfaceC4481of<C4608w> {
    private final Map<String, I0> a = new LinkedHashMap();
    private int b;

    /* renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4463nf.values().length];
            try {
                iArr[EnumC4463nf.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4463nf.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4463nf.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4463nf.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4463nf.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    private final void b(C4608w c4608w) {
        int i;
        int i2 = a.a[c4608w.f().ordinal()];
        if (i2 == 2) {
            this.b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.b) > 0) {
            this.b = i - 1;
        }
    }

    public final int a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4481of
    public void a(C4608w c4608w) {
        String c = c4608w.c();
        Map<String, I0> map = this.a;
        I0 i0 = map.get(c);
        if (i0 == null) {
            i0 = new I0();
            map.put(c, i0);
        }
        i0.a(c4608w.a(new C4626x()));
        b(c4608w);
    }

    @Override // com.ironsource.InterfaceC4294e7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC4499pf enumC4499pf) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, I0> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a2 = entry.getValue().a(enumC4499pf);
            if (a2.length() > 0) {
                jSONObject.put(key, a2);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }
}
