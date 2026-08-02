package B1;

import B1.f;
import H1.C1181n;
import H1.O;
import androidx.media3.exoplayer.source.b0;
import e1.AbstractC4156x;

/* loaded from: classes.dex */
public final class c implements f.b {
    private final b0[] sampleQueues;
    private final int[] trackTypes;

    public c(int[] iArr, b0[] b0VarArr) {
        this.trackTypes = iArr;
        this.sampleQueues = b0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.sampleQueues.length];
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.sampleQueues;
            if (i10 >= b0VarArr.length) {
                return iArr;
            }
            iArr[i10] = b0VarArr[i10].J();
            i10++;
        }
    }

    public void b(long j10) {
        for (b0 b0Var : this.sampleQueues) {
            b0Var.c0(j10);
        }
    }

    @Override // B1.f.b
    public O c(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i12 >= iArr.length) {
                AbstractC4156x.d("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C1181n();
            }
            if (i11 == iArr[i12]) {
                return this.sampleQueues[i12];
            }
            i12++;
        }
    }
}
