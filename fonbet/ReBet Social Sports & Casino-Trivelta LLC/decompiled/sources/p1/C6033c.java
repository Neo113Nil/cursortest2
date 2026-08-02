package p1;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import e1.Z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import x1.InterfaceC6777a;

/* renamed from: p1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6033c implements InterfaceC6777a {

    /* renamed from: a, reason: collision with root package name */
    public final long f62900a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62901b;

    /* renamed from: c, reason: collision with root package name */
    public final long f62902c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f62903d;

    /* renamed from: e, reason: collision with root package name */
    public final long f62904e;

    /* renamed from: f, reason: collision with root package name */
    public final long f62905f;

    /* renamed from: g, reason: collision with root package name */
    public final long f62906g;

    /* renamed from: h, reason: collision with root package name */
    public final long f62907h;

    /* renamed from: i, reason: collision with root package name */
    public final o f62908i;

    /* renamed from: j, reason: collision with root package name */
    public final l f62909j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f62910k;

    /* renamed from: l, reason: collision with root package name */
    public final h f62911l;

    /* renamed from: m, reason: collision with root package name */
    public final List f62912m;

    public C6033c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f62900a = j10;
        this.f62901b = j11;
        this.f62902c = j12;
        this.f62903d = z10;
        this.f62904e = j13;
        this.f62905f = j14;
        this.f62906g = j15;
        this.f62907h = j16;
        this.f62911l = hVar;
        this.f62908i = oVar;
        this.f62910k = uri;
        this.f62909j = lVar;
        this.f62912m = list == null ? Collections.EMPTY_LIST : list;
    }

    public static ArrayList c(List list, LinkedList linkedList) {
        StreamKey streamKey = (StreamKey) linkedList.poll();
        int i10 = streamKey.f20472a;
        ArrayList arrayList = new ArrayList();
        do {
            int i11 = streamKey.f20473b;
            C6031a c6031a = (C6031a) list.get(i11);
            List list2 = c6031a.f62892c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(streamKey.f20474c));
                streamKey = (StreamKey) linkedList.poll();
                if (streamKey.f20472a != i10) {
                    break;
                }
            } while (streamKey.f20473b == i11);
            arrayList.add(new C6031a(c6031a.f62890a, c6031a.f62891b, arrayList2, c6031a.f62893d, c6031a.f62894e, c6031a.f62895f));
        } while (streamKey.f20472a == i10);
        linkedList.addFirst(streamKey);
        return arrayList;
    }

    @Override // x1.InterfaceC6777a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6033c a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f20472a != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j10 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f62932a, d10.f62933b - j10, c(d10.f62934c, linkedList), d10.f62935d));
            }
            i10++;
        }
        long j11 = this.f62901b;
        return new C6033c(this.f62900a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f62902c, this.f62903d, this.f62904e, this.f62905f, this.f62906g, this.f62907h, this.f62911l, this.f62908i, this.f62909j, this.f62910k, arrayList);
    }

    public final g d(int i10) {
        return (g) this.f62912m.get(i10);
    }

    public final int e() {
        return this.f62912m.size();
    }

    public final long f(int i10) {
        long j10;
        long j11;
        if (i10 == this.f62912m.size() - 1) {
            j10 = this.f62901b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((g) this.f62912m.get(i10)).f62933b;
        } else {
            j10 = ((g) this.f62912m.get(i10 + 1)).f62933b;
            j11 = ((g) this.f62912m.get(i10)).f62933b;
        }
        return j10 - j11;
    }

    public final long g(int i10) {
        return Z.a1(f(i10));
    }
}
