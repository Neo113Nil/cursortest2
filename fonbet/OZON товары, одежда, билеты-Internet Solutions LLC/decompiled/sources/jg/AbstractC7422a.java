package jg;

import ig.C7073b;
import java.io.Serializable;
import jg.AbstractC7423b;

/* renamed from: jg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
abstract class AbstractC7422a<D extends AbstractC7423b> extends AbstractC7423b implements Serializable {

    /* renamed from: jg.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1147a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70002a;

        static {
            int[] iArr = new int[mg.b.values().length];
            f70002a = iArr;
            try {
                iArr[mg.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70002a[mg.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70002a[mg.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70002a[mg.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70002a[mg.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70002a[mg.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70002a[mg.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    AbstractC7422a() {
    }

    @Override // jg.AbstractC7423b
    public c<?> E0(ig.h hVar) {
        return d.j1(this, hVar);
    }

    @Override // jg.AbstractC7423b
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public AbstractC7422a<D> T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (AbstractC7422a) L0().b(kVar.a(this, j11));
        }
        switch (C1147a.f70002a[((mg.b) kVar).ordinal()]) {
            case 1:
                return k1(j11);
            case 2:
                return k1(lg.c.h(7, j11));
            case 3:
                return l1(j11);
            case 4:
                return m1(j11);
            case 5:
                return m1(lg.c.h(10, j11));
            case 6:
                return m1(lg.c.h(100, j11));
            case 7:
                return m1(lg.c.h(1000, j11));
            default:
                throw new C7073b(kVar + " not valid for chronology " + L0().i());
        }
    }

    abstract AbstractC7422a<D> k1(long j11);

    abstract AbstractC7422a<D> l1(long j11);

    abstract AbstractC7422a<D> m1(long j11);
}
