package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wvd extends u4 implements RandomAccess {
    public static final /* synthetic */ int c = 0;
    public final gc2[] a;
    public final int[] b;

    public wvd(gc2[] gc2VarArr, int[] iArr) {
        this.a = gc2VarArr;
        this.b = iArr;
    }

    @Override // defpackage.v2, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof gc2) {
            return super.contains((gc2) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.u4, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof gc2) {
            return super.indexOf((gc2) obj);
        }
        return -1;
    }

    @Override // defpackage.u4, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof gc2) {
            return super.lastIndexOf((gc2) obj);
        }
        return -1;
    }
}
