package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zxh extends g7a {
    public final nkk h = new nkk(4, false);
    public final nm2 i = new nm2(2);
    public cjj j;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r5 != r7) goto L14;
     */
    @Override // defpackage.g7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Metadata s(vic vicVar, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        nkk nkkVar;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        long j2;
        long j3;
        boolean z4;
        long j4;
        List list;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i4;
        int i5;
        int i6;
        long j5;
        long j6;
        char c;
        long j7;
        boolean z9;
        nkk nkkVar2 = this.h;
        nm2 nm2Var = this.i;
        cjj cjjVar = this.j;
        if (cjjVar != null) {
            long j8 = vicVar.m;
            synchronized (cjjVar) {
                long j9 = cjjVar.b;
            }
        }
        cjj cjjVar2 = new cjj(vicVar.j);
        this.j = cjjVar2;
        cjjVar2.a(vicVar.j - vicVar.m);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        nkkVar2.C(array, limit);
        nm2Var.p(array, limit);
        nm2Var.t(39);
        boolean z10 = true;
        long i7 = (nm2Var.i(1) << 32) | nm2Var.i(32);
        nm2Var.t(20);
        int i8 = nm2Var.i(12);
        int i9 = nm2Var.i(8);
        nkkVar2.F(14);
        if (i9 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (i9 != 255) {
            long j10 = 1;
            long j11 = C.TIME_UNSET;
            if (i9 == 4) {
                int s = nkkVar2.s();
                ArrayList arrayList = new ArrayList(s);
                int i10 = 0;
                while (i10 < s) {
                    long t = nkkVar2.t();
                    boolean z11 = (nkkVar2.s() & 128) != 0 ? z10 : false;
                    ArrayList arrayList2 = new ArrayList();
                    if (z11) {
                        nkkVar = nkkVar2;
                        j = j10;
                        z = false;
                        z2 = false;
                        z3 = false;
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                    } else {
                        int s2 = nkkVar2.s();
                        boolean z12 = (s2 & 128) != 0 ? z10 : false;
                        boolean z13 = (s2 & 64) != 0 ? z10 : false;
                        boolean z14 = (s2 & 32) != 0 ? z10 : false;
                        long t2 = z13 ? nkkVar2.t() : -9223372036854775807L;
                        if (!z13) {
                            int s3 = nkkVar2.s();
                            ArrayList arrayList3 = new ArrayList(s3);
                            int i11 = 0;
                            while (i11 < s3) {
                                nkk nkkVar3 = nkkVar2;
                                arrayList3.add(new fyh(nkkVar2.s(), nkkVar3.t()));
                                i11++;
                                nkkVar2 = nkkVar3;
                                j10 = j10;
                            }
                            arrayList2 = arrayList3;
                        }
                        nkkVar = nkkVar2;
                        j = j10;
                        if (z14) {
                            long s4 = nkkVar.s();
                            z4 = (s4 & 128) != 0;
                            j4 = ((((s4 & j) << 32) | nkkVar.t()) * 1000) / 90;
                        } else {
                            z4 = false;
                            j4 = -9223372036854775807L;
                        }
                        j3 = j4;
                        z3 = z4;
                        z = z12;
                        z2 = z13;
                        j2 = t2;
                        i = nkkVar.x();
                        i2 = nkkVar.s();
                        i3 = nkkVar.s();
                    }
                    arrayList.add(new gyh(t, z11, z, z2, arrayList2, j2, z3, j3, i, i2, i3));
                    i10++;
                    nkkVar2 = nkkVar;
                    j10 = j;
                    z10 = true;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList);
            } else if (i9 == 5) {
                cjj cjjVar3 = this.j;
                long t3 = nkkVar2.t();
                boolean z15 = (nkkVar2.s() & 128) != 0;
                List list2 = Collections.EMPTY_LIST;
                if (z15) {
                    list = list2;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    j5 = -9223372036854775807L;
                    j6 = -9223372036854775807L;
                } else {
                    int s5 = nkkVar2.s();
                    boolean z16 = (s5 & 128) != 0;
                    boolean z17 = (s5 & 64) != 0;
                    boolean z18 = (s5 & 32) != 0;
                    boolean z19 = (s5 & 16) != 0;
                    long a = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.a(i7, nkkVar2);
                    if (z17) {
                        c = ' ';
                        j7 = 90;
                    } else {
                        int s6 = nkkVar2.s();
                        c = ' ';
                        ArrayList arrayList4 = new ArrayList(s6);
                        j7 = 90;
                        for (int i12 = 0; i12 < s6; i12++) {
                            int s7 = nkkVar2.s();
                            long a2 = !z19 ? TimeSignalCommand.a(i7, nkkVar2) : -9223372036854775807L;
                            arrayList4.add(new byh(s7, a2, cjjVar3.b(a2)));
                        }
                        list2 = arrayList4;
                    }
                    if (z18) {
                        long s8 = nkkVar2.s();
                        z9 = (s8 & 128) != 0;
                        j11 = ((((s8 & 1) << c) | nkkVar2.t()) * 1000) / j7;
                    } else {
                        z9 = false;
                    }
                    int x = nkkVar2.x();
                    int s9 = nkkVar2.s();
                    i6 = nkkVar2.s();
                    list = list2;
                    z7 = z19;
                    z8 = z9;
                    i4 = x;
                    i5 = s9;
                    j6 = j11;
                    j5 = a;
                    z5 = z16;
                    z6 = z17;
                }
                spliceNullCommand = new SpliceInsertCommand(t3, z15, z5, z6, z7, j5, cjjVar3.b(j5), list, z8, j6, i4, i5, i6);
            } else if (i9 != 6) {
                spliceNullCommand = null;
            } else {
                cjj cjjVar4 = this.j;
                long a3 = TimeSignalCommand.a(i7, nkkVar2);
                spliceNullCommand = new TimeSignalCommand(a3, cjjVar4.b(a3));
            }
        } else {
            long t4 = nkkVar2.t();
            int i13 = i8 - 4;
            byte[] bArr = new byte[i13];
            nkkVar2.e(bArr, 0, i13);
            spliceNullCommand = new PrivateCommand(t4, bArr, i7);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
