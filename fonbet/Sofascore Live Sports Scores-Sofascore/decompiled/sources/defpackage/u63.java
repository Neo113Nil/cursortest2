package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u63 extends w63 {
    public static w63 f(int i) {
        return i < 0 ? w63.b : i > 0 ? w63.c : w63.a;
    }

    @Override // defpackage.w63
    public final w63 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.w63
    public final w63 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.w63
    public final w63 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.w63
    public final w63 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.w63
    public final int e() {
        return 0;
    }
}
