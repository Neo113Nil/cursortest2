package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class una extends gw8 {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final una DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile p9e PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private s7a children_ = lff.d;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        una unaVar = new una();
        DEFAULT_INSTANCE = unaVar;
        gw8.i(una.class, unaVar);
    }

    public static una l() {
        return DEFAULT_INSTANCE;
    }

    public static tna m() {
        return (tna) ((cw8) DEFAULT_INSTANCE.b(5));
    }

    @Override // defpackage.gw8
    public final Object b(int i) {
        p9e p9eVar;
        switch (wt3.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new jnf(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", una.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new una();
            case 4:
                return new tna(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p9e p9eVar2 = PARSER;
                if (p9eVar2 != null) {
                    return p9eVar2;
                }
                synchronized (una.class) {
                    try {
                        p9eVar = PARSER;
                        if (p9eVar == null) {
                            p9eVar = new ew8();
                            PARSER = p9eVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return p9eVar;
            default:
                a70.i();
                return null;
        }
    }

    public final void k(ArrayList arrayList) {
        s7a s7aVar = this.children_;
        boolean z = ((lff) s7aVar).a;
        s7a s7aVar2 = s7aVar;
        if (!z) {
            lff lffVar = (lff) s7aVar;
            int i = lffVar.c;
            lff e = lffVar.e(i == 0 ? 10 : i * 2);
            this.children_ = e;
            s7aVar2 = e;
        }
        Charset charset = u7a.a;
        if (s7aVar2 instanceof ArrayList) {
            ((ArrayList) s7aVar2).ensureCapacity(arrayList.size() + ((lff) s7aVar2).c);
        }
        lff lffVar2 = (lff) s7aVar2;
        int i2 = lffVar2.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                String str = "Element at index " + (lffVar2.c - i2) + " is null.";
                for (int i3 = lffVar2.c - 1; i3 >= i2; i3--) {
                    lffVar2.remove(i3);
                }
                yhk.s(str);
                return;
            }
            lffVar2.add(next);
        }
    }

    public final void n(boolean z) {
        this.hasAction_ = z;
    }

    public final void o(boolean z) {
        this.hasImageColorFilter_ = z;
    }

    public final void p(boolean z) {
        this.hasImageDescription_ = z;
    }

    public final void q(nna nnaVar) {
        this.height_ = nnaVar.getNumber();
    }

    public final void r(ona onaVar) {
        if (onaVar != ona.UNRECOGNIZED) {
            this.horizontalAlignment_ = onaVar.a;
        } else {
            a70.p("Can't get the number of an unknown enum value.");
        }
    }

    public final void s() {
        this.identity_ = 1;
    }

    public final void t(mna mnaVar) {
        if (mnaVar != mna.UNRECOGNIZED) {
            this.imageScale_ = mnaVar.a;
        } else {
            a70.p("Can't get the number of an unknown enum value.");
        }
    }

    public final void u(vna vnaVar) {
        if (vnaVar != vna.UNRECOGNIZED) {
            this.type_ = vnaVar.a;
        } else {
            a70.p("Can't get the number of an unknown enum value.");
        }
    }

    public final void v(wna wnaVar) {
        if (wnaVar != wna.UNRECOGNIZED) {
            this.verticalAlignment_ = wnaVar.a;
        } else {
            a70.p("Can't get the number of an unknown enum value.");
        }
    }

    public final void w(nna nnaVar) {
        this.width_ = nnaVar.getNumber();
    }
}
