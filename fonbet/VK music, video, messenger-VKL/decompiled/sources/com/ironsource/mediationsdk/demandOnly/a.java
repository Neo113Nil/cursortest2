package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4504q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.go9;
import xsna.j5g;
import xsna.zcl;

/* loaded from: classes13.dex */
public interface a {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0227a implements a {
        private final List<C4504q2> a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0227a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C4504q2 a(String str) {
            Object obj;
            Iterator<T> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((C4504q2) obj).c(), str)) {
                    break;
                }
            }
            return (C4504q2) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public String b() {
            return this.a.isEmpty() ? "" : go9.b("1", ((C4504q2) j5g.Y(this.a)).c());
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public C4504q2 get(int i) {
            if (i < 0 || i >= this.a.size()) {
                return null;
            }
            return this.a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public C0227a(List<C4504q2> list) {
            this.a = list;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public List<C4504q2> a() {
            return this.a;
        }

        public /* synthetic */ C0227a(List list, int i, zcl zclVar) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    C4504q2 a(String str);

    List<C4504q2> a();

    String b();

    C4504q2 get(int i);

    boolean isEmpty();
}
