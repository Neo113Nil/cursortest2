package o1;

import c1.p;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class C extends c1.r {
    private int[] outputChannels;
    private int[] pendingOutputChannels;

    @Override // c1.p
    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC4134a.e(this.outputChannels);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f26785b.f26783d) * this.f26786c.f26783d);
        while (position < limit) {
            for (int i10 : iArr) {
                int S10 = (e1.Z.S(this.f26785b.f26782c) * i10) + position;
                int i11 = this.f26785b.f26782c;
                if (i11 != 2) {
                    if (i11 == 3) {
                        l10.put(byteBuffer.get(S10));
                    } else if (i11 != 4) {
                        if (i11 != 21) {
                            if (i11 != 22) {
                                if (i11 != 268435456) {
                                    if (i11 != 1342177280) {
                                        if (i11 != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + this.f26785b.f26782c);
                                        }
                                    }
                                }
                            }
                            l10.putInt(byteBuffer.getInt(S10));
                        }
                        e1.Z.m1(l10, e1.Z.i0(byteBuffer, S10));
                    } else {
                        l10.putFloat(byteBuffer.getFloat(S10));
                    }
                }
                l10.putShort(byteBuffer.getShort(S10));
            }
            position += this.f26785b.f26783d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // c1.r
    public p.a h(p.a aVar) {
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return p.a.f26779e;
        }
        if (!e1.Z.O0(aVar.f26782c)) {
            throw new p.b(aVar);
        }
        boolean z10 = aVar.f26781b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f26781b) {
                throw new p.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new p.a(aVar.f26780a, iArr.length, aVar.f26782c) : p.a.f26779e;
    }

    @Override // c1.r
    public void i() {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // c1.r
    public void k() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    public void m(int[] iArr) {
        this.pendingOutputChannels = iArr;
    }
}
