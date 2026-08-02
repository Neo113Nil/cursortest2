package Z1;

import H1.InterfaceC1184q;
import e1.J;
import kotlin.UByte;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final J f14556a = new J(8);

    /* renamed from: b, reason: collision with root package name */
    public int f14557b;

    public final long a(InterfaceC1184q interfaceC1184q) {
        int i10 = 0;
        interfaceC1184q.n(this.f14556a.f(), 0, 1);
        int i11 = this.f14556a.f()[0] & UByte.MAX_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        interfaceC1184q.n(this.f14556a.f(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f14556a.f()[i10] & UByte.MAX_VALUE) + (i14 << 8);
        }
        this.f14557b += i13 + 1;
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(InterfaceC1184q interfaceC1184q) {
        long length = interfaceC1184q.getLength();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = length;
        }
        int i10 = (int) j10;
        interfaceC1184q.n(this.f14556a.f(), 0, 4);
        long O10 = this.f14556a.O();
        this.f14557b = 4;
        while (O10 != 440786851) {
            int i11 = this.f14557b + 1;
            this.f14557b = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC1184q.n(this.f14556a.f(), 0, 1);
            O10 = ((O10 << 8) & (-256)) | (this.f14556a.f()[0] & UByte.MAX_VALUE);
        }
        long a10 = a(interfaceC1184q);
        long j11 = this.f14557b;
        if (a10 != Long.MIN_VALUE && (length == -1 || j11 + a10 < length)) {
            while (true) {
                int i12 = this.f14557b;
                long j12 = j11 + a10;
                if (i12 < j12) {
                    if (a(interfaceC1184q) == Long.MIN_VALUE) {
                        return false;
                    }
                    long a11 = a(interfaceC1184q);
                    if (a11 < 0 || a11 > 2147483647L) {
                        break;
                    }
                    if (a11 != 0) {
                        int i13 = (int) a11;
                        interfaceC1184q.j(i13);
                        this.f14557b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
        }
        return false;
    }
}
