package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zc4 implements b38 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final tm0 i;
    public final s5c j;
    public final Uri k;
    public final acf l;
    public final List m;

    public zc4(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, acf acfVar, tm0 tm0Var, s5c s5cVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = acfVar;
        this.i = tm0Var;
        this.k = uri;
        this.j = s5cVar;
        this.m = arrayList;
    }

    public final ude a(int i) {
        return (ude) this.m.get(i);
    }

    public final long b(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j2 = ((ude) list.get(i)).b;
        } else {
            j = ((ude) list.get(i + 1)).b;
            j2 = ((ude) list.get(i)).b;
        }
        return j - j2;
    }

    public final long c(int i) {
        return nik.T(b(i));
    }

    @Override // defpackage.b38
    public final Object copy(List list) {
        long j;
        long j2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i = 0;
        while (true) {
            int size = this.m.size();
            j = C.TIME_UNSET;
            if (i >= size) {
                break;
            }
            if (((StreamKey) linkedList.peek()).a != i) {
                long b = b(i);
                if (b != C.TIME_UNSET) {
                    j3 += b;
                }
            } else {
                ude a = a(i);
                List list2 = a.c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.b;
                    ch chVar = (ch) list2.get(i3);
                    List list3 = chVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((ozf) list3.get(streamKey.c));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.a != i2) {
                            break;
                        }
                    } while (streamKey.b == i3);
                    j2 = j3;
                    arrayList2.add(new ch(chVar.a, chVar.b, arrayList3, chVar.d, chVar.e, chVar.f));
                    if (streamKey.a != i2) {
                        break;
                    }
                    j3 = j2;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new ude(a.a, a.b - j2, arrayList2, a.d));
                j3 = j2;
            }
            i++;
        }
        long j4 = j3;
        long j5 = this.b;
        if (j5 != C.TIME_UNSET) {
            j = j5 - j4;
        }
        s5c s5cVar = this.j;
        Uri uri = this.k;
        return new zc4(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, s5cVar, uri, arrayList);
    }
}
