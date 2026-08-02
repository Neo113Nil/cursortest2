package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2748y implements InterfaceC2621qf<JSONObject>, InterfaceC2585of<C2712w> {
    private final Map<String, I0> a = new LinkedHashMap();
    private int b;

    /* renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2567nf.values().length];
            try {
                iArr[EnumC2567nf.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2567nf.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2567nf.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2567nf.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2567nf.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    private final void b(C2712w c2712w) {
        int i;
        int i2 = a.a[c2712w.f().ordinal()];
        if (i2 == 2) {
            this.b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.b) > 0) {
            this.b = i - 1;
        }
    }

    public final int a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC2585of
    public void a(C2712w record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c = record.c();
        Map<String, I0> map = this.a;
        I0 i0 = map.get(c);
        if (i0 == null) {
            i0 = new I0();
            map.put(c, i0);
        }
        i0.a(record.a(new C2730x()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC2380d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC2603pf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, I0> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jsonObjectInit.put(key, a2);
            }
        }
        return jsonObjectInit;
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }
}
