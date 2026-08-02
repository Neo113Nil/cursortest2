package b2;

import H1.I;
import H1.InterfaceC1184q;
import W1.c;
import b1.C2338G;
import e1.J;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final Ra.r f24940d = Ra.r.d(':');

    /* renamed from: e, reason: collision with root package name */
    public static final Ra.r f24941e = Ra.r.d('*');

    /* renamed from: a, reason: collision with root package name */
    public final List f24942a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f24943b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f24944c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24945a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24946b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24947c;

        public a(int i10, long j10, int i11) {
            this.f24945a = i10;
            this.f24946b = j10;
            this.f24947c = i11;
        }
    }

    public static int b(String str) {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw C2338G.a("Invalid SEF name", null);
        }
    }

    public static W1.c f(J j10, int i10) {
        ArrayList arrayList = new ArrayList();
        List f10 = f24941e.f(j10.J(i10));
        for (int i11 = 0; i11 < f10.size(); i11++) {
            List f11 = f24940d.f((CharSequence) f10.get(i11));
            if (f11.size() != 3) {
                throw C2338G.a(null, null);
            }
            try {
                arrayList.add(new c.a(Long.parseLong((String) f11.get(0)), Long.parseLong((String) f11.get(1)), 1 << (Integer.parseInt((String) f11.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw C2338G.a(null, e10);
            }
        }
        return new W1.c(arrayList);
    }

    public final void a(InterfaceC1184q interfaceC1184q, I i10) {
        J j10 = new J(8);
        interfaceC1184q.readFully(j10.f(), 0, 8);
        this.f24944c = j10.z() + 8;
        if (j10.v() != 1397048916) {
            i10.f4333a = 0L;
        } else {
            i10.f4333a = interfaceC1184q.getPosition() - (this.f24944c - 12);
            this.f24943b = 2;
        }
    }

    public int c(InterfaceC1184q interfaceC1184q, I i10, List list) {
        int i11 = this.f24943b;
        long j10 = 0;
        if (i11 == 0) {
            long length = interfaceC1184q.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i10.f4333a = j10;
            this.f24943b = 1;
        } else if (i11 == 1) {
            a(interfaceC1184q, i10);
        } else if (i11 == 2) {
            d(interfaceC1184q, i10);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC1184q, list);
            i10.f4333a = 0L;
        }
        return 1;
    }

    public final void d(InterfaceC1184q interfaceC1184q, I i10) {
        long length = interfaceC1184q.getLength();
        int i11 = this.f24944c - 20;
        J j10 = new J(i11);
        interfaceC1184q.readFully(j10.f(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            j10.c0(2);
            short B10 = j10.B();
            if (B10 == 2192 || B10 == 2816 || B10 == 2817 || B10 == 2819 || B10 == 2820) {
                this.f24942a.add(new a(B10, (length - this.f24944c) - j10.z(), j10.z()));
            } else {
                j10.c0(8);
            }
        }
        if (this.f24942a.isEmpty()) {
            i10.f4333a = 0L;
        } else {
            this.f24943b = 3;
            i10.f4333a = ((a) this.f24942a.get(0)).f24946b;
        }
    }

    public final void e(InterfaceC1184q interfaceC1184q, List list) {
        long position = interfaceC1184q.getPosition();
        int length = (int) ((interfaceC1184q.getLength() - interfaceC1184q.getPosition()) - this.f24944c);
        J j10 = new J(length);
        interfaceC1184q.readFully(j10.f(), 0, length);
        for (int i10 = 0; i10 < this.f24942a.size(); i10++) {
            a aVar = (a) this.f24942a.get(i10);
            j10.b0((int) (aVar.f24946b - position));
            j10.c0(4);
            int z10 = j10.z();
            int b10 = b(j10.J(z10));
            int i11 = aVar.f24947c - (z10 + 8);
            if (b10 == 2192) {
                list.add(f(j10, i11));
            } else if (b10 != 2816 && b10 != 2817 && b10 != 2819 && b10 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f24942a.clear();
        this.f24943b = 0;
    }
}
