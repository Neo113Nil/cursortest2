package z8;

import com.facebook.soloader.E;

/* renamed from: z8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6946e implements h {

    /* renamed from: a, reason: collision with root package name */
    public int f68632a = 0;
    private final h[] mStrategies;

    public C6946e(h... hVarArr) {
        this.mStrategies = hVarArr;
    }

    @Override // z8.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i10;
        h[] hVarArr;
        do {
            i10 = this.f68632a;
            hVarArr = this.mStrategies;
            if (i10 >= hVarArr.length) {
                return false;
            }
            this.f68632a = i10 + 1;
        } while (!hVarArr[i10].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
