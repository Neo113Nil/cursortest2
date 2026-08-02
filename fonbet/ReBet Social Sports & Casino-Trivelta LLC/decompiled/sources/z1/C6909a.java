package z1;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import b2.u;
import e1.AbstractC4134a;
import e1.U;
import e1.Z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import x1.InterfaceC6777a;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6909a implements InterfaceC6777a {

    /* renamed from: a, reason: collision with root package name */
    public final int f68471a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68473c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68474d;

    /* renamed from: e, reason: collision with root package name */
    public final C0978a f68475e;

    /* renamed from: f, reason: collision with root package name */
    public final long f68476f;

    /* renamed from: g, reason: collision with root package name */
    public final long f68477g;
    public final b[] streamElements;

    /* renamed from: z1.a$a, reason: collision with other inner class name */
    public static class C0978a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f68478a;
        public final byte[] data;
        public final u[] trackEncryptionBoxes;

        public C0978a(UUID uuid, byte[] bArr, u[] uVarArr) {
            this.f68478a = uuid;
            this.data = bArr;
            this.trackEncryptionBoxes = uVarArr;
        }
    }

    public C6909a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0978a c0978a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : Z.p1(j11, 1000000L, j10), j12 != 0 ? Z.p1(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0978a, bVarArr);
    }

    @Override // x1.InterfaceC6777a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6909a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            b bVar2 = this.streamElements[streamKey.f20473b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((androidx.media3.common.a[]) arrayList3.toArray(new androidx.media3.common.a[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.formats[streamKey.f20474c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((androidx.media3.common.a[]) arrayList3.toArray(new androidx.media3.common.a[0])));
        }
        return new C6909a(this.f68471a, this.f68472b, this.f68476f, this.f68477g, this.f68473c, this.f68474d, this.f68475e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* renamed from: z1.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f68479a;

        /* renamed from: b, reason: collision with root package name */
        public final String f68480b;

        /* renamed from: c, reason: collision with root package name */
        public final long f68481c;
        private final long[] chunkStartTimesUs;

        /* renamed from: d, reason: collision with root package name */
        public final String f68482d;

        /* renamed from: e, reason: collision with root package name */
        public final int f68483e;

        /* renamed from: f, reason: collision with root package name */
        public final int f68484f;
        public final androidx.media3.common.a[] formats;

        /* renamed from: g, reason: collision with root package name */
        public final int f68485g;

        /* renamed from: h, reason: collision with root package name */
        public final int f68486h;

        /* renamed from: i, reason: collision with root package name */
        public final String f68487i;

        /* renamed from: j, reason: collision with root package name */
        public final int f68488j;

        /* renamed from: k, reason: collision with root package name */
        public final String f68489k;

        /* renamed from: l, reason: collision with root package name */
        public final String f68490l;

        /* renamed from: m, reason: collision with root package name */
        public final List f68491m;

        /* renamed from: n, reason: collision with root package name */
        public final long f68492n;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, androidx.media3.common.a[] aVarArr, List list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, aVarArr, list, Z.q1(list, 1000000L, j10), Z.p1(j11, 1000000L, j10));
        }

        public Uri a(int i10, int i11) {
            AbstractC4134a.g(this.formats != null);
            AbstractC4134a.g(this.f68491m != null);
            AbstractC4134a.g(i11 < this.f68491m.size());
            String num = Integer.toString(this.formats[i10].f20538j);
            String l10 = ((Long) this.f68491m.get(i11)).toString();
            return U.g(this.f68489k, this.f68490l.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(androidx.media3.common.a[] aVarArr) {
            return new b(this.f68489k, this.f68490l, this.f68479a, this.f68480b, this.f68481c, this.f68482d, this.f68483e, this.f68484f, this.f68485g, this.f68486h, this.f68487i, aVarArr, this.f68491m, this.chunkStartTimesUs, this.f68492n);
        }

        public long c(int i10) {
            if (i10 == this.f68488j - 1) {
                return this.f68492n;
            }
            long[] jArr = this.chunkStartTimesUs;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return Z.h(this.chunkStartTimesUs, j10, true, true);
        }

        public long e(int i10) {
            return this.chunkStartTimesUs[i10];
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, androidx.media3.common.a[] aVarArr, List list, long[] jArr, long j11) {
            this.f68489k = str;
            this.f68490l = str2;
            this.f68479a = i10;
            this.f68480b = str3;
            this.f68481c = j10;
            this.f68482d = str4;
            this.f68483e = i11;
            this.f68484f = i12;
            this.f68485g = i13;
            this.f68486h = i14;
            this.f68487i = str5;
            this.formats = aVarArr;
            this.f68491m = list;
            this.chunkStartTimesUs = jArr;
            this.f68492n = j11;
            this.f68488j = list.size();
        }
    }

    public C6909a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0978a c0978a, b[] bVarArr) {
        this.f68471a = i10;
        this.f68472b = i11;
        this.f68476f = j10;
        this.f68477g = j11;
        this.f68473c = i12;
        this.f68474d = z10;
        this.f68475e = c0978a;
        this.streamElements = bVarArr;
    }
}
