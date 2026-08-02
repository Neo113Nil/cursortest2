package wc;

import hg.InterfaceC6950c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v implements qc.g<InterfaceC6950c> {
    private static final /* synthetic */ v[] $VALUES;
    public static final v INSTANCE;

    static {
        v vVar = new v("INSTANCE", 0);
        INSTANCE = vVar;
        $VALUES = new v[]{vVar};
    }

    private v() {
        throw null;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    @Override // qc.g
    public final void accept(InterfaceC6950c interfaceC6950c) throws Exception {
        interfaceC6950c.n(Long.MAX_VALUE);
    }
}
