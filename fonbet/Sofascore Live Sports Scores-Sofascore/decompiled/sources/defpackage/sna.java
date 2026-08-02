package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sna extends gw8 {
    private static final sna DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile p9e PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private una layout_;

    static {
        sna snaVar = new sna();
        DEFAULT_INSTANCE = snaVar;
        gw8.i(sna.class, snaVar);
    }

    public static rna m() {
        return (rna) ((cw8) DEFAULT_INSTANCE.b(5));
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
                return new jnf(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new sna();
            case 4:
                return new rna(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p9e p9eVar2 = PARSER;
                if (p9eVar2 != null) {
                    return p9eVar2;
                }
                synchronized (sna.class) {
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

    public final una k() {
        una unaVar = this.layout_;
        return unaVar == null ? una.l() : unaVar;
    }

    public final int l() {
        return this.layoutIndex_;
    }

    public final void n(una unaVar) {
        unaVar.getClass();
        this.layout_ = unaVar;
        this.bitField0_ |= 1;
    }

    public final void o(int i) {
        this.layoutIndex_ = i;
    }
}
