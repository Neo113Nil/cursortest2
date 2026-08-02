package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeDevNullItem {
    public final transient String a;
    public final transient String b;
    public final transient String c;
    public final transient String d;
    public final transient String e;
    public final transient String f;

    @pmi0("json")
    private final FilteredString filteredJson;

    @pmi0("value_str")
    private final FilteredString filteredValueStr;

    @pmi0("value_str10")
    private final FilteredString filteredValueStr10;

    @pmi0("value_str11")
    private final FilteredString filteredValueStr11;

    @pmi0("value_str12")
    private final FilteredString filteredValueStr12;

    @pmi0("value_str13")
    private final FilteredString filteredValueStr13;

    @pmi0("value_str14")
    private final FilteredString filteredValueStr14;

    @pmi0("value_str15")
    private final FilteredString filteredValueStr15;

    @pmi0("value_str16")
    private final FilteredString filteredValueStr16;

    @pmi0("value_str2")
    private final FilteredString filteredValueStr2;

    @pmi0("value_str3")
    private final FilteredString filteredValueStr3;

    @pmi0("value_str4")
    private final FilteredString filteredValueStr4;

    @pmi0("value_str5")
    private final FilteredString filteredValueStr5;

    @pmi0("value_str6")
    private final FilteredString filteredValueStr6;

    @pmi0("value_str7")
    private final FilteredString filteredValueStr7;

    @pmi0("value_str8")
    private final FilteredString filteredValueStr8;

    @pmi0("value_str9")
    private final FilteredString filteredValueStr9;
    public final transient String g;
    public final transient String h;
    public final transient String i;
    public final transient String j;
    public final transient String k;

    @pmi0("key")
    private final String key;
    public final transient String l;
    public final transient String m;
    public final transient String n;
    public final transient String o;
    public final transient String p;
    public final transient String q;

    @pmi0("value")
    private final Integer value;

    @pmi0("value10")
    private final Integer value10;

    @pmi0("value11")
    private final Integer value11;

    @pmi0("value12")
    private final Integer value12;

    @pmi0("value13")
    private final Integer value13;

    @pmi0("value14")
    private final Integer value14;

    @pmi0("value15")
    private final Integer value15;

    @pmi0("value16")
    private final Integer value16;

    @pmi0("value2")
    private final Integer value2;

    @pmi0("value3")
    private final Integer value3;

    @pmi0("value4")
    private final Integer value4;

    @pmi0("value5")
    private final Integer value5;

    @pmi0("value6")
    private final Integer value6;

    @pmi0("value7")
    private final Integer value7;

    @pmi0("value8")
    private final Integer value8;

    @pmi0("value9")
    private final Integer value9;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeDevNullItem>, a9y<SchemeStat$TypeDevNullItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$TypeDevNullItem(fai.s(x9yVar, "key"), fai.C(x9yVar, "json"), fai.C(x9yVar, "value_str"), fai.A(x9yVar, "value"), fai.C(x9yVar, "value_str2"), fai.A(x9yVar, "value2"), fai.C(x9yVar, "value_str3"), fai.A(x9yVar, "value3"), fai.C(x9yVar, "value_str4"), fai.A(x9yVar, "value4"), fai.C(x9yVar, "value_str5"), fai.A(x9yVar, "value5"), fai.C(x9yVar, "value_str6"), fai.A(x9yVar, "value6"), fai.C(x9yVar, "value_str7"), fai.A(x9yVar, "value7"), fai.C(x9yVar, "value_str8"), fai.A(x9yVar, "value8"), fai.C(x9yVar, "value_str9"), fai.A(x9yVar, "value9"), fai.C(x9yVar, "value_str10"), fai.A(x9yVar, "value10"), fai.C(x9yVar, "value_str11"), fai.A(x9yVar, "value11"), fai.C(x9yVar, "value_str12"), fai.A(x9yVar, "value12"), fai.C(x9yVar, "value_str13"), fai.A(x9yVar, "value13"), fai.C(x9yVar, "value_str14"), fai.A(x9yVar, "value14"), fai.C(x9yVar, "value_str15"), fai.A(x9yVar, "value15"), fai.C(x9yVar, "value_str16"), fai.A(x9yVar, "value16"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = (SchemeStat$TypeDevNullItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("key", schemeStat$TypeDevNullItem.b());
            x9yVar.o("json", schemeStat$TypeDevNullItem.a);
            x9yVar.o("value_str", schemeStat$TypeDevNullItem.b);
            x9yVar.n("value", schemeStat$TypeDevNullItem.c());
            x9yVar.o("value_str2", schemeStat$TypeDevNullItem.c);
            x9yVar.n("value2", schemeStat$TypeDevNullItem.k());
            x9yVar.o("value_str3", schemeStat$TypeDevNullItem.d);
            x9yVar.n("value3", schemeStat$TypeDevNullItem.l());
            x9yVar.o("value_str4", schemeStat$TypeDevNullItem.e);
            x9yVar.n("value4", schemeStat$TypeDevNullItem.m());
            x9yVar.o("value_str5", schemeStat$TypeDevNullItem.f);
            x9yVar.n("value5", schemeStat$TypeDevNullItem.n());
            x9yVar.o("value_str6", schemeStat$TypeDevNullItem.g);
            x9yVar.n("value6", schemeStat$TypeDevNullItem.o());
            x9yVar.o("value_str7", schemeStat$TypeDevNullItem.h);
            x9yVar.n("value7", schemeStat$TypeDevNullItem.p());
            x9yVar.o("value_str8", schemeStat$TypeDevNullItem.i);
            x9yVar.n("value8", schemeStat$TypeDevNullItem.q());
            x9yVar.o("value_str9", schemeStat$TypeDevNullItem.j);
            x9yVar.n("value9", schemeStat$TypeDevNullItem.r());
            x9yVar.o("value_str10", schemeStat$TypeDevNullItem.k);
            x9yVar.n("value10", schemeStat$TypeDevNullItem.d());
            x9yVar.o("value_str11", schemeStat$TypeDevNullItem.l);
            x9yVar.n("value11", schemeStat$TypeDevNullItem.e());
            x9yVar.o("value_str12", schemeStat$TypeDevNullItem.m);
            x9yVar.n("value12", schemeStat$TypeDevNullItem.f());
            x9yVar.o("value_str13", schemeStat$TypeDevNullItem.n);
            x9yVar.n("value13", schemeStat$TypeDevNullItem.g());
            x9yVar.o("value_str14", schemeStat$TypeDevNullItem.o);
            x9yVar.n("value14", schemeStat$TypeDevNullItem.h());
            x9yVar.o("value_str15", schemeStat$TypeDevNullItem.p);
            x9yVar.n("value15", schemeStat$TypeDevNullItem.i());
            x9yVar.o("value_str16", schemeStat$TypeDevNullItem.q);
            x9yVar.n("value16", schemeStat$TypeDevNullItem.j());
            return x9yVar;
        }
    }

    public SchemeStat$TypeDevNullItem(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, Integer num4, String str7, Integer num5, String str8, Integer num6, String str9, Integer num7, String str10, Integer num8, String str11, Integer num9, String str12, Integer num10, String str13, Integer num11, String str14, Integer num12, String str15, Integer num13, String str16, Integer num14, String str17, Integer num15, String str18, Integer num16) {
        this.key = str;
        this.a = str2;
        this.b = str3;
        this.value = num;
        this.c = str4;
        this.value2 = num2;
        this.d = str5;
        this.value3 = num3;
        this.e = str6;
        this.value4 = num4;
        this.f = str7;
        this.value5 = num5;
        this.g = str8;
        this.value6 = num6;
        this.h = str9;
        this.value7 = num7;
        this.i = str10;
        this.value8 = num8;
        this.j = str11;
        this.value9 = num9;
        this.k = str12;
        this.value10 = num10;
        this.l = str13;
        this.value11 = num11;
        this.m = str14;
        this.value12 = num12;
        this.n = str15;
        this.value13 = num13;
        this.o = str16;
        this.value14 = num14;
        this.p = str17;
        this.value15 = num15;
        this.q = str18;
        this.value16 = num16;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredJson = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredValueStr = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(256));
        this.filteredValueStr2 = filteredString3;
        FilteredString filteredString4 = new FilteredString(lhg.b(256));
        this.filteredValueStr3 = filteredString4;
        FilteredString filteredString5 = new FilteredString(lhg.b(256));
        this.filteredValueStr4 = filteredString5;
        FilteredString filteredString6 = new FilteredString(lhg.b(256));
        this.filteredValueStr5 = filteredString6;
        FilteredString filteredString7 = new FilteredString(lhg.b(256));
        this.filteredValueStr6 = filteredString7;
        FilteredString filteredString8 = new FilteredString(lhg.b(256));
        this.filteredValueStr7 = filteredString8;
        FilteredString filteredString9 = new FilteredString(lhg.b(256));
        this.filteredValueStr8 = filteredString9;
        FilteredString filteredString10 = new FilteredString(lhg.b(256));
        this.filteredValueStr9 = filteredString10;
        FilteredString filteredString11 = new FilteredString(lhg.b(256));
        this.filteredValueStr10 = filteredString11;
        FilteredString filteredString12 = new FilteredString(lhg.b(256));
        this.filteredValueStr11 = filteredString12;
        FilteredString filteredString13 = new FilteredString(lhg.b(256));
        this.filteredValueStr12 = filteredString13;
        FilteredString filteredString14 = new FilteredString(lhg.b(256));
        this.filteredValueStr13 = filteredString14;
        FilteredString filteredString15 = new FilteredString(lhg.b(256));
        this.filteredValueStr14 = filteredString15;
        FilteredString filteredString16 = new FilteredString(lhg.b(256));
        this.filteredValueStr15 = filteredString16;
        FilteredString filteredString17 = new FilteredString(lhg.b(256));
        this.filteredValueStr16 = filteredString17;
        filteredString.a(str2);
        filteredString2.a(str3);
        filteredString3.a(str4);
        filteredString4.a(str5);
        filteredString5.a(str6);
        filteredString6.a(str7);
        filteredString7.a(str8);
        filteredString8.a(str9);
        filteredString9.a(str10);
        filteredString10.a(str11);
        filteredString11.a(str12);
        filteredString12.a(str13);
        filteredString13.a(str14);
        filteredString14.a(str15);
        filteredString15.a(str16);
        filteredString16.a(str17);
        filteredString17.a(str18);
    }

    public static SchemeStat$TypeDevNullItem a(SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, int i2) {
        String str18 = schemeStat$TypeDevNullItem.key;
        String str19 = (i & 2) != 0 ? schemeStat$TypeDevNullItem.a : str;
        String str20 = (i & 4) != 0 ? schemeStat$TypeDevNullItem.b : str2;
        Integer num4 = schemeStat$TypeDevNullItem.value;
        String str21 = (i & 16) != 0 ? schemeStat$TypeDevNullItem.c : str3;
        Integer num5 = (i & 32) != 0 ? schemeStat$TypeDevNullItem.value2 : num;
        String str22 = (i & 64) != 0 ? schemeStat$TypeDevNullItem.d : str4;
        Integer num6 = (i & 128) != 0 ? schemeStat$TypeDevNullItem.value3 : num2;
        String str23 = (i & 256) != 0 ? schemeStat$TypeDevNullItem.e : str5;
        Integer num7 = (i & 512) != 0 ? schemeStat$TypeDevNullItem.value4 : num3;
        String str24 = (i & 1024) != 0 ? schemeStat$TypeDevNullItem.f : str6;
        Integer num8 = (i & 2048) != 0 ? schemeStat$TypeDevNullItem.value5 : 1000;
        String str25 = (i & 4096) != 0 ? schemeStat$TypeDevNullItem.g : str7;
        Integer num9 = schemeStat$TypeDevNullItem.value6;
        String str26 = (i & 16384) != 0 ? schemeStat$TypeDevNullItem.h : str8;
        Integer num10 = schemeStat$TypeDevNullItem.value7;
        String str27 = (i & 65536) != 0 ? schemeStat$TypeDevNullItem.i : str9;
        Integer num11 = schemeStat$TypeDevNullItem.value8;
        String str28 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? schemeStat$TypeDevNullItem.j : str10;
        Integer num12 = schemeStat$TypeDevNullItem.value9;
        String str29 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? schemeStat$TypeDevNullItem.k : str11;
        Integer num13 = schemeStat$TypeDevNullItem.value10;
        String str30 = (i & 4194304) != 0 ? schemeStat$TypeDevNullItem.l : str12;
        Integer num14 = schemeStat$TypeDevNullItem.value11;
        String str31 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? schemeStat$TypeDevNullItem.m : str13;
        Integer num15 = schemeStat$TypeDevNullItem.value12;
        String str32 = (i & 67108864) != 0 ? schemeStat$TypeDevNullItem.n : str14;
        Integer num16 = schemeStat$TypeDevNullItem.value13;
        String str33 = (i & 268435456) != 0 ? schemeStat$TypeDevNullItem.o : str15;
        Integer num17 = schemeStat$TypeDevNullItem.value14;
        String str34 = (i & 1073741824) != 0 ? schemeStat$TypeDevNullItem.p : str16;
        Integer num18 = schemeStat$TypeDevNullItem.value15;
        String str35 = (i2 & 1) != 0 ? schemeStat$TypeDevNullItem.q : str17;
        Integer num19 = schemeStat$TypeDevNullItem.value16;
        schemeStat$TypeDevNullItem.getClass();
        return new SchemeStat$TypeDevNullItem(str18, str19, str20, num4, str21, num5, str22, num6, str23, num7, str24, num8, str25, num9, str26, num10, str27, num11, str28, num12, str29, num13, str30, num14, str31, num15, str32, num16, str33, num17, str34, num18, str35, num19);
    }

    public final String b() {
        return this.key;
    }

    public final Integer c() {
        return this.value;
    }

    public final Integer d() {
        return this.value10;
    }

    public final Integer e() {
        return this.value11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeDevNullItem)) {
            return false;
        }
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = (SchemeStat$TypeDevNullItem) obj;
        return epx.f(this.key, schemeStat$TypeDevNullItem.key) && epx.f(this.a, schemeStat$TypeDevNullItem.a) && epx.f(this.b, schemeStat$TypeDevNullItem.b) && epx.f(this.value, schemeStat$TypeDevNullItem.value) && epx.f(this.c, schemeStat$TypeDevNullItem.c) && epx.f(this.value2, schemeStat$TypeDevNullItem.value2) && epx.f(this.d, schemeStat$TypeDevNullItem.d) && epx.f(this.value3, schemeStat$TypeDevNullItem.value3) && epx.f(this.e, schemeStat$TypeDevNullItem.e) && epx.f(this.value4, schemeStat$TypeDevNullItem.value4) && epx.f(this.f, schemeStat$TypeDevNullItem.f) && epx.f(this.value5, schemeStat$TypeDevNullItem.value5) && epx.f(this.g, schemeStat$TypeDevNullItem.g) && epx.f(this.value6, schemeStat$TypeDevNullItem.value6) && epx.f(this.h, schemeStat$TypeDevNullItem.h) && epx.f(this.value7, schemeStat$TypeDevNullItem.value7) && epx.f(this.i, schemeStat$TypeDevNullItem.i) && epx.f(this.value8, schemeStat$TypeDevNullItem.value8) && epx.f(this.j, schemeStat$TypeDevNullItem.j) && epx.f(this.value9, schemeStat$TypeDevNullItem.value9) && epx.f(this.k, schemeStat$TypeDevNullItem.k) && epx.f(this.value10, schemeStat$TypeDevNullItem.value10) && epx.f(this.l, schemeStat$TypeDevNullItem.l) && epx.f(this.value11, schemeStat$TypeDevNullItem.value11) && epx.f(this.m, schemeStat$TypeDevNullItem.m) && epx.f(this.value12, schemeStat$TypeDevNullItem.value12) && epx.f(this.n, schemeStat$TypeDevNullItem.n) && epx.f(this.value13, schemeStat$TypeDevNullItem.value13) && epx.f(this.o, schemeStat$TypeDevNullItem.o) && epx.f(this.value14, schemeStat$TypeDevNullItem.value14) && epx.f(this.p, schemeStat$TypeDevNullItem.p) && epx.f(this.value15, schemeStat$TypeDevNullItem.value15) && epx.f(this.q, schemeStat$TypeDevNullItem.q) && epx.f(this.value16, schemeStat$TypeDevNullItem.value16);
    }

    public final Integer f() {
        return this.value12;
    }

    public final Integer g() {
        return this.value13;
    }

    public final Integer h() {
        return this.value14;
    }

    public final int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.value;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.c;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.value2;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.d;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.value3;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.e;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.value4;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.f;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.value5;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str7 = this.g;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num6 = this.value6;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str8 = this.h;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num7 = this.value7;
        int hashCode16 = (hashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str9 = this.i;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num8 = this.value8;
        int hashCode18 = (hashCode17 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str10 = this.j;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num9 = this.value9;
        int hashCode20 = (hashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str11 = this.k;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num10 = this.value10;
        int hashCode22 = (hashCode21 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str12 = this.l;
        int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num11 = this.value11;
        int hashCode24 = (hashCode23 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str13 = this.m;
        int hashCode25 = (hashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num12 = this.value12;
        int hashCode26 = (hashCode25 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str14 = this.n;
        int hashCode27 = (hashCode26 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num13 = this.value13;
        int hashCode28 = (hashCode27 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str15 = this.o;
        int hashCode29 = (hashCode28 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num14 = this.value14;
        int hashCode30 = (hashCode29 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str16 = this.p;
        int hashCode31 = (hashCode30 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num15 = this.value15;
        int hashCode32 = (hashCode31 + (num15 == null ? 0 : num15.hashCode())) * 31;
        String str17 = this.q;
        int hashCode33 = (hashCode32 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num16 = this.value16;
        return hashCode33 + (num16 != null ? num16.hashCode() : 0);
    }

    public final Integer i() {
        return this.value15;
    }

    public final Integer j() {
        return this.value16;
    }

    public final Integer k() {
        return this.value2;
    }

    public final Integer l() {
        return this.value3;
    }

    public final Integer m() {
        return this.value4;
    }

    public final Integer n() {
        return this.value5;
    }

    public final Integer o() {
        return this.value6;
    }

    public final Integer p() {
        return this.value7;
    }

    public final Integer q() {
        return this.value8;
    }

    public final Integer r() {
        return this.value9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeDevNullItem(key=");
        sb.append(this.key);
        sb.append(", json=");
        sb.append(this.a);
        sb.append(", valueStr=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", valueStr2=");
        sb.append(this.c);
        sb.append(", value2=");
        sb.append(this.value2);
        sb.append(", valueStr3=");
        sb.append(this.d);
        sb.append(", value3=");
        sb.append(this.value3);
        sb.append(", valueStr4=");
        sb.append(this.e);
        sb.append(", value4=");
        sb.append(this.value4);
        sb.append(", valueStr5=");
        sb.append(this.f);
        sb.append(", value5=");
        sb.append(this.value5);
        sb.append(", valueStr6=");
        sb.append(this.g);
        sb.append(", value6=");
        sb.append(this.value6);
        sb.append(", valueStr7=");
        sb.append(this.h);
        sb.append(", value7=");
        sb.append(this.value7);
        sb.append(", valueStr8=");
        sb.append(this.i);
        sb.append(", value8=");
        sb.append(this.value8);
        sb.append(", valueStr9=");
        sb.append(this.j);
        sb.append(", value9=");
        sb.append(this.value9);
        sb.append(", valueStr10=");
        sb.append(this.k);
        sb.append(", value10=");
        sb.append(this.value10);
        sb.append(", valueStr11=");
        sb.append(this.l);
        sb.append(", value11=");
        sb.append(this.value11);
        sb.append(", valueStr12=");
        sb.append(this.m);
        sb.append(", value12=");
        sb.append(this.value12);
        sb.append(", valueStr13=");
        sb.append(this.n);
        sb.append(", value13=");
        sb.append(this.value13);
        sb.append(", valueStr14=");
        sb.append(this.o);
        sb.append(", value14=");
        sb.append(this.value14);
        sb.append(", valueStr15=");
        sb.append(this.p);
        sb.append(", value15=");
        sb.append(this.value15);
        sb.append(", valueStr16=");
        sb.append(this.q);
        sb.append(", value16=");
        return uqi.b(sb, this.value16, ')');
    }

    public /* synthetic */ SchemeStat$TypeDevNullItem(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, Integer num4, String str7, Integer num5, String str8, Integer num6, String str9, Integer num7, String str10, Integer num8, String str11, Integer num9, String str12, Integer num10, String str13, Integer num11, String str14, Integer num12, String str15, Integer num13, String str16, Integer num14, String str17, Integer num15, String str18, Integer num16, int i, int i2, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : num5, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : num6, (i & 16384) != 0 ? null : str9, (i & 32768) != 0 ? null : num7, (i & 65536) != 0 ? null : str10, (i & 131072) != 0 ? null : num8, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str11, (i & 524288) != 0 ? null : num9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str12, (i & 2097152) != 0 ? null : num10, (i & 4194304) != 0 ? null : str13, (i & 8388608) != 0 ? null : num11, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str14, (i & 33554432) != 0 ? null : num12, (i & 67108864) != 0 ? null : str15, (i & 134217728) != 0 ? null : num13, (i & 268435456) != 0 ? null : str16, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num14, (i & 1073741824) != 0 ? null : str17, (i & Integer.MIN_VALUE) != 0 ? null : num15, (i2 & 1) != 0 ? null : str18, (i2 & 2) != 0 ? null : num16);
    }
}
