package net.time4j.history;

import net.time4j.F;
import oi.AbstractC5909e;
import oi.q;
import oi.r;
import oi.x;
import oi.z;

/* loaded from: classes5.dex */
public final class i extends AbstractC5909e {
    private static final long serialVersionUID = -5386613740709845550L;
    private final d history;

    public static class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final d f58200a;

        public a(d dVar) {
            this.f58200a = dVar;
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(q qVar) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(q qVar) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public h e(q qVar) {
            d dVar = this.f58200a;
            return dVar == d.f58163s ? h.g(j.BYZANTINE, 999984973, 8, 31) : dVar == d.f58162r ? h.g(j.AD, 999979465, 12, 31) : dVar == d.f58161q ? h.g(j.AD, 999999999, 12, 31) : h.g(j.AD, 9999, 12, 31);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public h i(q qVar) {
            d dVar = this.f58200a;
            return dVar == d.f58163s ? h.g(j.BYZANTINE, 0, 9, 1) : dVar == d.f58162r ? h.g(j.BC, 999979466, 1, 1) : dVar == d.f58161q ? h.g(j.BC, 1000000000, 1, 1) : h.g(j.BC, 45, 1, 1);
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public h p(q qVar) {
            try {
                return this.f58200a.e((F) qVar.j(F.f57535m));
            } catch (IllegalArgumentException e10) {
                throw new r(e10.getMessage(), e10);
            }
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public q q(q qVar, h hVar, boolean z10) {
            if (hVar == null) {
                throw new IllegalArgumentException("Missing historic date.");
            }
            return qVar.y(F.f57535m, this.f58200a.d(hVar));
        }

        @Override // oi.z
        public boolean isValid(q qVar, h hVar) {
            return this.f58200a.isValid(hVar);
        }
    }

    public i(d dVar) {
        super("HISTORIC_DATE");
        this.history = dVar;
    }

    private Object readResolve() {
        return this.history.f();
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return h.class;
    }

    @Override // oi.AbstractC5909e
    public z r(x xVar) {
        if (xVar.x(F.f57535m)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // oi.AbstractC5909e
    public boolean s(AbstractC5909e abstractC5909e) {
        return this.history.equals(((i) abstractC5909e).history);
    }

    @Override // oi.p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public h c() {
        return h.g(j.AD, 9999, 12, 31);
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public h d0() {
        return h.g(j.BC, 45, 1, 1);
    }
}
