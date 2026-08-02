package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kki extends aeh implements ddi {
    @Override // defpackage.ddi
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((q() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            b(Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((q() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
