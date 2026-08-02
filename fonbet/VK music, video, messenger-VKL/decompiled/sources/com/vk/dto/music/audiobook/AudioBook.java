package com.vk.dto.music.audiobook;

import com.ironsource.Hb;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.audiobook.AudioBooksAccessStatus;
import com.vk.movika.sdk.base.observable.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.i8;
import xsna.j5g;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: AudioBook.kt */
/* loaded from: classes18.dex */
public final class AudioBook extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioBook> CREATOR = new b();
    public static final a x = new a();
    public static final AudioBook y;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final AudioBookPublisher h;
    public final int i;
    public final Image j;
    public final List<AudioBookChapter> k;
    public final List<AudioBookPerson> l;
    public final List<AudioBookPerson> m;
    public final List<AudioBookPerson> n;
    public final List<AudioBookGenre> o;
    public final String p;
    public final Integer q;
    public final boolean r;
    public final AudioBooksAccessStatus s;
    public final String t;
    public final int u;
    public final MusicDynamicRestriction v;
    public final String w;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioBook> {
        @Override // xsna.aay
        public final AudioBook a(JSONObject jSONObject) {
            return new AudioBook(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioBook> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioBook a(Serializer serializer) {
            return new AudioBook(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioBook[i];
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        y = new AudioBook(0, "", "", 0, false, 0, null, 0, null, null, emptyList, emptyList, null, emptyList, "", 0, false, AudioBooksAccessStatus.PAID, "", 0, null, null);
    }

    public AudioBook(int i, String str, String str2, int i2, boolean z, int i3, AudioBookPublisher audioBookPublisher, int i4, Image image, List<AudioBookChapter> list, List<AudioBookPerson> list2, List<AudioBookPerson> list3, List<AudioBookPerson> list4, List<AudioBookGenre> list5, String str3, Integer num, boolean z2, AudioBooksAccessStatus audioBooksAccessStatus, String str4, int i5, MusicDynamicRestriction musicDynamicRestriction, String str5) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = z;
        this.g = i3;
        this.h = audioBookPublisher;
        this.i = i4;
        this.j = image;
        this.k = list;
        this.l = list2;
        this.m = list3;
        this.n = list4;
        this.o = list5;
        this.p = str3;
        this.q = num;
        this.r = z2;
        this.s = audioBooksAccessStatus;
        this.t = str4;
        this.u = i5;
        this.v = musicDynamicRestriction;
        this.w = str5;
    }

    public static AudioBook zb(AudioBook audioBook, List list, boolean z, int i) {
        Integer num;
        boolean z2;
        int i2 = audioBook.b;
        String str = audioBook.c;
        String str2 = audioBook.d;
        int i3 = audioBook.e;
        boolean z3 = audioBook.f;
        int i4 = audioBook.g;
        AudioBookPublisher audioBookPublisher = audioBook.h;
        int i5 = audioBook.i;
        Image image = audioBook.j;
        List list2 = (i & 512) != 0 ? audioBook.k : list;
        List<AudioBookPerson> list3 = audioBook.l;
        List list4 = list2;
        List<AudioBookPerson> list5 = audioBook.m;
        List<AudioBookPerson> list6 = audioBook.n;
        List<AudioBookGenre> list7 = audioBook.o;
        String str3 = audioBook.p;
        Integer num2 = audioBook.q;
        if ((i & 65536) != 0) {
            num = num2;
            z2 = audioBook.r;
        } else {
            num = num2;
            z2 = z;
        }
        AudioBooksAccessStatus audioBooksAccessStatus = audioBook.s;
        String str4 = audioBook.t;
        int i6 = audioBook.u;
        MusicDynamicRestriction musicDynamicRestriction = audioBook.v;
        String str5 = audioBook.w;
        audioBook.getClass();
        return new AudioBook(i2, str, str2, i3, z3, i4, audioBookPublisher, i5, image, list4, list3, list5, list6, list7, str3, num, z2, audioBooksAccessStatus, str4, i6, musicDynamicRestriction, str5);
    }

    public final AudioBooksAccessStatus Ab() {
        return this.s;
    }

    public final List<AudioBookChapter> Bb() {
        return this.k;
    }

    public final Image Cb() {
        return this.j;
    }

    public final String Db() {
        return j5g.g0(this.l, ", ", null, null, 0, new i8(5), 30);
    }

    public final MusicDynamicRestriction Eb() {
        return this.v;
    }

    public final boolean Fb() {
        return this.s == AudioBooksAccessStatus.PAID;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.S(this.g);
        serializer.i0(this.h);
        serializer.S(this.i);
        serializer.i0(this.j);
        serializer.o0(this.k);
        serializer.o0(this.l);
        serializer.o0(this.m);
        serializer.o0(this.n);
        serializer.o0(this.o);
        serializer.j0(this.p);
        Integer num = this.q;
        serializer.S(num != null ? num.intValue() : 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.g0(this.s);
        serializer.j0(this.t);
        serializer.S(this.u);
        serializer.i0(this.v);
        serializer.j0(this.w);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new g(this, 6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBook)) {
            return false;
        }
        AudioBook audioBook = (AudioBook) obj;
        return this.b == audioBook.b && epx.f(this.c, audioBook.c) && epx.f(this.d, audioBook.d) && this.e == audioBook.e && this.f == audioBook.f && this.g == audioBook.g && epx.f(this.h, audioBook.h) && this.i == audioBook.i && epx.f(this.j, audioBook.j) && epx.f(this.k, audioBook.k) && epx.f(this.l, audioBook.l) && epx.f(this.m, audioBook.m) && epx.f(this.n, audioBook.n) && epx.f(this.o, audioBook.o) && epx.f(this.p, audioBook.p) && epx.f(this.q, audioBook.q) && this.r == audioBook.r && this.s == audioBook.s && epx.f(this.t, audioBook.t) && this.u == audioBook.u && epx.f(this.v, audioBook.v) && epx.f(this.w, audioBook.w);
    }

    public final int getId() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = shy.a(this.g, qoy.b(shy.a(this.e, urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31), 31, this.f), 31);
        AudioBookPublisher audioBookPublisher = this.h;
        int a3 = shy.a(this.i, (a2 + (audioBookPublisher == null ? 0 : audioBookPublisher.hashCode())) * 31, 31);
        Image image = this.j;
        int hashCode = (a3 + (image == null ? 0 : image.hashCode())) * 31;
        List<AudioBookChapter> list = this.k;
        int a4 = fw3.a(fw3.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.l), 31, this.m);
        List<AudioBookPerson> list2 = this.n;
        int a5 = fw3.a((a4 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.o);
        String str = this.p;
        int hashCode2 = (a5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.q;
        int a6 = shy.a(this.u, urd0.a((this.s.hashCode() + qoy.b((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.r)) * 31, 31, this.t), 31);
        MusicDynamicRestriction musicDynamicRestriction = this.v;
        int hashCode3 = (a6 + (musicDynamicRestriction == null ? 0 : musicDynamicRestriction.hashCode())) * 31;
        String str2 = this.w;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBook(id=");
        sb.append(this.b);
        sb.append(", name=");
        return ho8.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBook(JSONObject jSONObject) {
        this(r19, r4, r5, r6, r7, r8, r9, r10, r18, r12, r13, r14, r15, r2, r17, r1, r3, r23, r21, r22, r11, jSONObject.optString("illegal_mentions_text"));
        Image image;
        ArrayList arrayList;
        ?? r11;
        Image image2;
        EmptyList emptyList;
        ArrayList arrayList2;
        List list;
        AudioBooksAccessStatus audioBooksAccessStatus;
        MusicDynamicRestriction musicDynamicRestriction;
        int optInt = jSONObject.optInt("id");
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("annotation");
        int optInt2 = jSONObject.optInt("minimum_age");
        boolean optBoolean = jSONObject.optBoolean("is_explicit");
        int optInt3 = jSONObject.optInt("duration");
        AudioBookPublisher audioBookPublisher = new AudioBookPublisher(jSONObject.optJSONObject(Hb.b));
        int optInt4 = jSONObject.optInt("updated_at");
        String str = null;
        boolean z = false;
        if (jSONObject.has("cover")) {
            image = new Image(jSONObject.getJSONArray("cover"), str, 2, z ? 1 : 0);
        } else {
            image = null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("chapters");
        if (optJSONArray != null) {
            ArrayList arrayList3 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList3.add(new AudioBookChapter(optJSONArray.getJSONObject(i)));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("authors");
        if (optJSONArray2 != null) {
            r11 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            int i2 = 0;
            while (i2 < length2) {
                r11.add(new AudioBookPerson(optJSONArray2.getJSONObject(i2)));
                i2++;
                optJSONArray2 = optJSONArray2;
            }
        } else {
            r11 = EmptyList.b;
        }
        List list2 = r11;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("narrators");
        if (optJSONArray3 != null) {
            ?? arrayList4 = new ArrayList(optJSONArray3.length());
            int length3 = optJSONArray3.length();
            int i3 = 0;
            while (i3 < length3) {
                arrayList4.add(new AudioBookPerson(optJSONArray3.getJSONObject(i3)));
                i3++;
                image = image;
                optJSONArray3 = optJSONArray3;
            }
            image2 = image;
            emptyList = arrayList4;
        } else {
            image2 = image;
            emptyList = EmptyList.b;
        }
        EmptyList emptyList2 = emptyList;
        JSONArray optJSONArray4 = jSONObject.optJSONArray("translators");
        if (optJSONArray4 != null) {
            ArrayList arrayList5 = new ArrayList(optJSONArray4.length());
            int length4 = optJSONArray4.length();
            int i4 = 0;
            while (i4 < length4) {
                arrayList5.add(new AudioBookPerson(optJSONArray4.getJSONObject(i4)));
                i4++;
                optInt = optInt;
                optJSONArray4 = optJSONArray4;
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        int i5 = optInt;
        JSONArray optJSONArray5 = jSONObject.optJSONArray("genres");
        if (optJSONArray5 != null) {
            list = new ArrayList(optJSONArray5.length());
            int length5 = optJSONArray5.length();
            int i6 = 0;
            while (i6 < length5) {
                list.add(new AudioBookGenre(optJSONArray5.getJSONObject(i6)));
                i6++;
                length5 = length5;
                optJSONArray5 = optJSONArray5;
            }
        } else {
            list = EmptyList.b;
        }
        String optString3 = jSONObject.optString("copyright");
        Integer valueOf = Integer.valueOf(jSONObject.optInt("release_date"));
        boolean optBoolean2 = jSONObject.optBoolean("in_favorites");
        AudioBooksAccessStatus.a aVar = AudioBooksAccessStatus.Companion;
        String optString4 = jSONObject.optString("access_status");
        aVar.getClass();
        AudioBooksAccessStatus a2 = AudioBooksAccessStatus.a.a(optString4);
        String optString5 = jSONObject.optString("track_code");
        int optInt5 = jSONObject.optInt("flags_context");
        if (jSONObject.has("restriction")) {
            audioBooksAccessStatus = a2;
            musicDynamicRestriction = new MusicDynamicRestriction(jSONObject.getJSONObject("restriction"));
        } else {
            audioBooksAccessStatus = a2;
            musicDynamicRestriction = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBook(Serializer serializer) {
        this(r1, r2, r3, r5, r5, r6, r8, r8, r10, r11, r11, r12, r12, r14, r15, r17, r17, r19, r20 != null ? r20 : "", serializer.u(), (MusicDynamicRestriction) serializer.G(MusicDynamicRestriction.class.getClassLoader()), serializer.H());
        int u = serializer.u();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        int u2 = serializer.u();
        String str = H2;
        boolean m = serializer.m();
        int u3 = serializer.u();
        AudioBookPublisher audioBookPublisher = (AudioBookPublisher) serializer.G(AudioBookPublisher.class.getClassLoader());
        int u4 = serializer.u();
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        ArrayList j = serializer.j(AudioBookChapter.CREATOR);
        Serializer.c<AudioBookPerson> cVar = AudioBookPerson.CREATOR;
        List j2 = serializer.j(cVar);
        j2 = j2 == null ? EmptyList.b : j2;
        List j3 = serializer.j(cVar);
        j3 = j3 == null ? EmptyList.b : j3;
        ArrayList j4 = serializer.j(cVar);
        List j5 = serializer.j(AudioBookGenre.CREATOR);
        j5 = j5 == null ? EmptyList.b : j5;
        String H3 = serializer.H();
        H3 = H3 == null ? "" : H3;
        Integer valueOf = Integer.valueOf(serializer.u());
        List list = j2;
        List list2 = j3;
        List list3 = j5;
        String str2 = H3;
        boolean m2 = serializer.m();
        AudioBooksAccessStatus audioBooksAccessStatus = (AudioBooksAccessStatus) serializer.C();
        audioBooksAccessStatus = audioBooksAccessStatus == null ? AudioBooksAccessStatus.PAID : audioBooksAccessStatus;
        String H4 = serializer.H();
    }
}
