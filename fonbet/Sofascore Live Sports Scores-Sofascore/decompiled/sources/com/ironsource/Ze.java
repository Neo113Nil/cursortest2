package com.ironsource;

import com.ironsource.I8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ze implements I8, I8.a {

    @NotNull
    private final Map<String, Integer> a = new HashMap();

    @NotNull
    private final Map<String, Integer> b = new HashMap();

    @Override // com.ironsource.I8
    public boolean a() {
        for (String str : this.b.keySet()) {
            Integer num = this.a.get(str);
            num.getClass();
            int intValue = num.intValue();
            Integer num2 = this.b.get(str);
            num2.getClass();
            if (intValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ironsource.I8
    public boolean b(@NotNull I8.b bVar) {
        boolean z;
        bVar.getClass();
        synchronized (this) {
            String c = bVar.c();
            if (this.a.containsKey(c)) {
                Integer num = this.a.get(c);
                num.getClass();
                z = num.intValue() >= bVar.b();
            }
        }
        return z;
    }

    @Override // com.ironsource.I8.a
    public void a(@NotNull I8.b bVar) {
        bVar.getClass();
        synchronized (this) {
            try {
                String c = bVar.c();
                if (this.a.containsKey(c)) {
                    Map<String, Integer> map = this.a;
                    Integer num = map.get(c);
                    num.getClass();
                    map.put(c, Integer.valueOf(num.intValue() + 1));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.I8.a
    public void a(@NotNull List<? extends I8.b> list) {
        list.getClass();
        for (I8.b bVar : list) {
            this.a.put(bVar.c(), 0);
            this.b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }
}
