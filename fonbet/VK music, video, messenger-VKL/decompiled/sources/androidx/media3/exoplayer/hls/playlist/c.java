package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import xsna.io20;
import xsna.o9v;

/* compiled from: HlsMultivariantPlaylist.java */
/* loaded from: classes.dex */
public final class c extends o9v {
    public static final c n;
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;

    @Nullable
    public final androidx.media3.common.a j;

    @Nullable
    public final List<androidx.media3.common.a> k;
    public final Map<String, String> l;
    public final List<DrmInitData> m;

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes12.dex */
    public static final class a {

        @Nullable
        public final Uri a;
        public final androidx.media3.common.a b;
        public final String c;

        public a(@Nullable Uri uri, androidx.media3.common.a aVar, String str) {
            this.a = uri;
            this.b = aVar;
            this.c = str;
        }
    }

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes12.dex */
    public static final class b {
        public final Uri a;
        public final androidx.media3.common.a b;

        @Nullable
        public final String c;

        @Nullable
        public final String d;

        @Nullable
        public final String e;

        @Nullable
        public final String f;

        public b(Uri uri, androidx.media3.common.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.a = uri;
            this.b = aVar;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public static b b(Uri uri) {
            a.C0043a c0043a = new a.C0043a();
            c0043a.a = "0";
            c0043a.l = io20.q(MimeTypes.APPLICATION_M3U8);
            return new b(uri, new androidx.media3.common.a(c0043a), null, null, null, null);
        }

        public final b a(androidx.media3.common.a aVar) {
            return new b(this.a, aVar, this.c, this.d, this.e, this.f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        n = new c("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public c(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @Nullable androidx.media3.common.a aVar, @Nullable List<androidx.media3.common.a> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = list2.get(i).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(arrayList, list3);
        a(arrayList, list4);
        a(arrayList, list5);
        a(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = aVar;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void a(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((a) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList b(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i3);
                    if (streamKey.c == i && streamKey.d == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // xsna.uer
    public final o9v copy(List list) {
        ArrayList b2 = b(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new c(this.a, this.b, b2, list2, b(1, this.g, list), b(2, this.h, list), list2, this.j, this.k, this.c, this.l, this.m);
    }
}
