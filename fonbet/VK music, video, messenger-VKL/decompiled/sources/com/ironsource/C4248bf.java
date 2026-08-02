package com.ironsource;

import com.ironsource.L8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.s3q0;

/* renamed from: com.ironsource.bf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4248bf implements L8, L8.a {
    private final Map<String, Integer> a = new HashMap();
    private final Map<String, Integer> b = new HashMap();

    @Override // com.ironsource.L8.a
    public void a(List<? extends L8.b> list) {
        for (L8.b bVar : list) {
            this.a.put(bVar.c(), 0);
            this.b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.ironsource.L8
    public boolean b(L8.b bVar) {
        boolean z;
        synchronized (this) {
            String c = bVar.c();
            if (this.a.containsKey(c)) {
                z = this.a.get(c).intValue() >= bVar.b();
            }
        }
        return z;
    }

    @Override // com.ironsource.L8.a
    public void a(L8.b bVar) {
        synchronized (this) {
            try {
                String c = bVar.c();
                if (this.a.containsKey(c)) {
                    Map<String, Integer> map = this.a;
                    map.put(c, Integer.valueOf(map.get(c).intValue() + 1));
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.L8
    public boolean a() {
        for (String str : this.b.keySet()) {
            if (this.a.get(str).intValue() < this.b.get(str).intValue()) {
                return false;
            }
        }
        return true;
    }
}
