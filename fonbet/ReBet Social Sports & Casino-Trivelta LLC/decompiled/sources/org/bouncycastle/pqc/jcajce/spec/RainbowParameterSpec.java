package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public class RainbowParameterSpec implements AlgorithmParameterSpec {
    private static final int[] DEFAULT_VI = {6, 12, 17, 22, 33};

    /* renamed from: vi, reason: collision with root package name */
    private int[] f62136vi;

    public RainbowParameterSpec() {
        this.f62136vi = DEFAULT_VI;
    }

    private void checkParams() {
        int[] iArr;
        int i10;
        int[] iArr2 = this.f62136vi;
        if (iArr2 == null) {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (iArr2.length <= 1) {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i11 = 0;
        do {
            iArr = this.f62136vi;
            if (i11 >= iArr.length - 1) {
                return;
            }
            i10 = iArr[i11];
            i11++;
        } while (i10 < iArr[i11]);
        throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
    }

    public int getDocumentLength() {
        int[] iArr = this.f62136vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f62136vi.length - 1;
    }

    public int[] getVi() {
        return Arrays.clone(this.f62136vi);
    }

    public RainbowParameterSpec(int[] iArr) {
        this.f62136vi = iArr;
        checkParams();
    }
}
