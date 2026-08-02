package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rfb {
    public static final rfb f;
    public final qfb a;
    public final qfb b;
    public final qfb c;
    public final boolean d = false;
    public final boolean e;

    static {
        pfb pfbVar = pfb.c;
        f = new rfb(pfbVar, pfbVar, pfbVar);
    }

    public rfb(qfb qfbVar, qfb qfbVar2, qfb qfbVar3) {
        this.a = qfbVar;
        this.b = qfbVar2;
        this.c = qfbVar3;
        boolean z = false;
        if ((qfbVar instanceof pfb) && (qfbVar3 instanceof pfb) && (qfbVar2 instanceof pfb)) {
            z = true;
        }
        this.e = z;
    }

    public static rfb a(rfb rfbVar, int i) {
        int i2 = i & 1;
        qfb qfbVar = pfb.c;
        qfb qfbVar2 = i2 != 0 ? rfbVar.a : qfbVar;
        qfb qfbVar3 = (i & 2) != 0 ? rfbVar.b : qfbVar;
        if ((i & 4) != 0) {
            qfbVar = rfbVar.c;
        }
        return new rfb(qfbVar2, qfbVar3, qfbVar);
    }

    public final rfb b(sfb sfbVar) {
        sfbVar.getClass();
        int ordinal = sfbVar.ordinal();
        if (ordinal == 0) {
            return a(this, 6);
        }
        if (ordinal == 1) {
            return a(this, 5);
        }
        if (ordinal == 2) {
            return a(this, 3);
        }
        zzl.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfb)) {
            return false;
        }
        rfb rfbVar = (rfb) obj;
        return this.a.equals(rfbVar.a) && this.b.equals(rfbVar.b) && this.c.equals(rfbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
