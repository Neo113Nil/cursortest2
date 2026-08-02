package q30;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import d30.InterfaceC6070a;
import e30.C6288a;
import e30.C6290c;
import i30.C7004a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: q30.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8982b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6070a f81544a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7004a f81545b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SimpleDateFormat f81546c;

    public C8982b(@NotNull InterfaceC6070a dao, @NotNull C7004a graylogConfig) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(graylogConfig, "graylogConfig");
        this.f81544a = dao;
        this.f81545b = graylogConfig;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f81546c = simpleDateFormat;
    }

    public final Object a(int i11, @NotNull d<? super Unit> dVar) {
        Object f7 = this.f81544a.f(i11, dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public final Object b(@NotNull d<? super List<C6288a>> dVar) {
        return this.f81544a.g(dVar);
    }

    public final Object c(int i11, @NotNull d<? super List<C6288a>> dVar) {
        return this.f81544a.e(i11, dVar);
    }

    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return this.f81544a.a(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x02e5, code lost:
    
        if (r2.i(r5, r3) != r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, Integer num2, String str11, Boolean bool, String str12, String str13, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str14, Boolean bool7, String str15, String str16, String str17, String str18, Boolean bool8, String str19, String str20, String str21, String str22, Integer num3, String str23, Integer num4, @NotNull String str24, String str25, Boolean bool9, String str26, String str27, String str28, String str29, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C8981a c8981a;
        int i11;
        String str30;
        Boolean bool10;
        String str31;
        String str32;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        String str33;
        Boolean bool16;
        String str34;
        String str35;
        String str36;
        String str37;
        Boolean bool17;
        String str38;
        String str39;
        String str40;
        String str41;
        Integer num5;
        String str42;
        Integer num6;
        String str43;
        Boolean bool18;
        String str44;
        String str45;
        String str46;
        String str47;
        Integer num7;
        Integer num8;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        C8982b c8982b;
        C6290c c6290c;
        if (cVar instanceof C8981a) {
            c8981a = (C8981a) cVar;
            int i12 = c8981a.f81536s0;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8981a.f81536s0 = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8981a.f81518Z;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8981a.f81536s0;
                if (i11 != 0) {
                    s.b(obj);
                    L80.a.a("GraylogRepository", "save log message=" + str);
                    String format = this.f81546c.format(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());
                    c8981a.f81519d = this;
                    c8981a.f81520e = str;
                    c8981a.f81521f = str2;
                    c8981a.f81522g = str3;
                    c8981a.f81523h = str4;
                    c8981a.f81524i = str5;
                    c8981a.f81525j = num;
                    c8981a.f81526k = str6;
                    c8981a.f81527l = str7;
                    c8981a.f81528m = str8;
                    c8981a.f81529n = str9;
                    c8981a.f81530o = str10;
                    c8981a.f81531p = num2;
                    c8981a.f81532q = str11;
                    c8981a.f81533r = bool;
                    c8981a.f81535s = str12;
                    c8981a.f81537t = str13;
                    c8981a.f81538u = bool2;
                    c8981a.f81539v = bool3;
                    c8981a.f81540w = bool4;
                    c8981a.f81541x = bool5;
                    c8981a.f81542y = bool6;
                    c8981a.f81543z = str14;
                    c8981a.f81497A = bool7;
                    c8981a.f81498B = str15;
                    c8981a.f81499C = str16;
                    c8981a.f81500D = str17;
                    c8981a.f81501E = str18;
                    c8981a.f81502F = bool8;
                    c8981a.f81503G = str19;
                    c8981a.f81504H = str20;
                    c8981a.f81505I = str21;
                    c8981a.f81506J = str22;
                    c8981a.f81507K = num3;
                    c8981a.f81508L = str23;
                    c8981a.f81509M = num4;
                    c8981a.f81510N = str24;
                    c8981a.f81511O = str25;
                    c8981a.f81512P = bool9;
                    c8981a.f81513Q = str26;
                    c8981a.f81514R = str27;
                    c8981a.f81515S = str28;
                    c8981a.f81516X = str29;
                    c8981a.f81517Y = format;
                    c8981a.f81536s0 = 1;
                    Object b11 = this.f81544a.b(c8981a);
                    if (b11 != aVar) {
                        str30 = str11;
                        bool10 = bool;
                        str31 = str12;
                        str32 = str13;
                        bool11 = bool2;
                        bool12 = bool3;
                        bool13 = bool4;
                        bool14 = bool5;
                        bool15 = bool6;
                        str33 = str14;
                        bool16 = bool7;
                        str34 = str15;
                        str35 = str16;
                        str36 = str17;
                        str37 = str18;
                        bool17 = bool8;
                        str38 = str19;
                        str39 = str20;
                        str40 = str21;
                        str41 = str22;
                        num5 = num3;
                        str42 = str23;
                        num6 = num4;
                        str43 = str25;
                        bool18 = bool9;
                        str44 = str26;
                        str45 = str27;
                        str46 = str28;
                        str47 = str29;
                        num7 = num2;
                        num8 = num;
                        str48 = str6;
                        str49 = str7;
                        str50 = str8;
                        str51 = str9;
                        str52 = str10;
                        str53 = str24;
                        str54 = format;
                        str55 = str2;
                        str56 = str3;
                        str57 = str4;
                        str58 = str5;
                        str59 = str;
                        obj = b11;
                        c8982b = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                String str60 = c8981a.f81517Y;
                String str61 = c8981a.f81516X;
                String str62 = c8981a.f81515S;
                String str63 = c8981a.f81514R;
                String str64 = c8981a.f81513Q;
                Boolean bool19 = c8981a.f81512P;
                String str65 = c8981a.f81511O;
                str53 = c8981a.f81510N;
                Integer num9 = c8981a.f81509M;
                String str66 = c8981a.f81508L;
                Integer num10 = c8981a.f81507K;
                String str67 = c8981a.f81506J;
                String str68 = c8981a.f81505I;
                String str69 = c8981a.f81504H;
                String str70 = c8981a.f81503G;
                Boolean bool20 = c8981a.f81502F;
                String str71 = c8981a.f81501E;
                String str72 = c8981a.f81500D;
                String str73 = c8981a.f81499C;
                String str74 = c8981a.f81498B;
                Boolean bool21 = c8981a.f81497A;
                String str75 = c8981a.f81543z;
                Boolean bool22 = c8981a.f81542y;
                Boolean bool23 = c8981a.f81541x;
                Boolean bool24 = c8981a.f81540w;
                Boolean bool25 = c8981a.f81539v;
                Boolean bool26 = c8981a.f81538u;
                String str76 = c8981a.f81537t;
                String str77 = c8981a.f81535s;
                Boolean bool27 = c8981a.f81533r;
                String str78 = c8981a.f81532q;
                Integer num11 = c8981a.f81531p;
                String str79 = c8981a.f81530o;
                String str80 = c8981a.f81529n;
                String str81 = c8981a.f81528m;
                String str82 = c8981a.f81527l;
                String str83 = c8981a.f81526k;
                Integer num12 = c8981a.f81525j;
                String str84 = c8981a.f81524i;
                String str85 = c8981a.f81523h;
                String str86 = c8981a.f81522g;
                String str87 = c8981a.f81521f;
                String str88 = c8981a.f81520e;
                c8982b = c8981a.f81519d;
                s.b(obj);
                str40 = str68;
                str39 = str69;
                str38 = str70;
                bool17 = bool20;
                str37 = str71;
                str36 = str72;
                str35 = str73;
                str34 = str74;
                bool16 = bool21;
                str33 = str75;
                bool15 = bool22;
                bool14 = bool23;
                bool13 = bool24;
                bool12 = bool25;
                bool11 = bool26;
                str32 = str76;
                str31 = str77;
                bool10 = bool27;
                str30 = str78;
                num7 = num11;
                str52 = str79;
                str51 = str80;
                str50 = str81;
                str49 = str82;
                str48 = str83;
                num8 = num12;
                str47 = str61;
                str41 = str67;
                str46 = str62;
                str45 = str63;
                str44 = str64;
                bool18 = bool19;
                str43 = str65;
                num6 = num9;
                str42 = str66;
                num5 = num10;
                str54 = str60;
                str58 = str84;
                str57 = str85;
                str56 = str86;
                str55 = str87;
                str59 = str88;
                c6290c = (C6290c) obj;
                if (c6290c != null || (r2 = c6290c.b()) == null) {
                    String str89 = "0";
                }
                String str90 = str89;
                InterfaceC6070a interfaceC6070a = c8982b.f81544a;
                Intrinsics.f(str54);
                C6288a c6288a = new C6288a(0, str54, str59, c8982b.f81545b.c(), str90, str55, str53, str56, str57, str58, num8, str48, str49, str50, str51, str52, num7, str30, bool10, str31, str32, bool11, bool12, bool13, bool14, bool15, str33, null, null, null, bool16, str34, str35, str36, str37, bool17, str38, str39, str40, str41, num5, str42, num6, str43, bool18, str44, str45, str46, str47);
                c8981a.f81519d = null;
                c8981a.f81520e = null;
                c8981a.f81521f = null;
                c8981a.f81522g = null;
                c8981a.f81523h = null;
                c8981a.f81524i = null;
                c8981a.f81525j = null;
                c8981a.f81526k = null;
                c8981a.f81527l = null;
                c8981a.f81528m = null;
                c8981a.f81529n = null;
                c8981a.f81530o = null;
                c8981a.f81531p = null;
                c8981a.f81532q = null;
                c8981a.f81533r = null;
                c8981a.f81535s = null;
                c8981a.f81537t = null;
                c8981a.f81538u = null;
                c8981a.f81539v = null;
                c8981a.f81540w = null;
                c8981a.f81541x = null;
                c8981a.f81542y = null;
                c8981a.f81543z = null;
                c8981a.f81497A = null;
                c8981a.f81498B = null;
                c8981a.f81499C = null;
                c8981a.f81500D = null;
                c8981a.f81501E = null;
                c8981a.f81502F = null;
                c8981a.f81503G = null;
                c8981a.f81504H = null;
                c8981a.f81505I = null;
                c8981a.f81506J = null;
                c8981a.f81507K = null;
                c8981a.f81508L = null;
                c8981a.f81509M = null;
                c8981a.f81510N = null;
                c8981a.f81511O = null;
                c8981a.f81512P = null;
                c8981a.f81513Q = null;
                c8981a.f81514R = null;
                c8981a.f81515S = null;
                c8981a.f81516X = null;
                c8981a.f81517Y = null;
                c8981a.f81536s0 = 2;
            }
        }
        c8981a = new C8981a(this, cVar);
        Object obj2 = c8981a.f81518Z;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8981a.f81536s0;
        if (i11 != 0) {
        }
        c6290c = (C6290c) obj2;
        if (c6290c != null) {
        }
        String str892 = "0";
        String str902 = str892;
        InterfaceC6070a interfaceC6070a2 = c8982b.f81544a;
        Intrinsics.f(str54);
        C6288a c6288a2 = new C6288a(0, str54, str59, c8982b.f81545b.c(), str902, str55, str53, str56, str57, str58, num8, str48, str49, str50, str51, str52, num7, str30, bool10, str31, str32, bool11, bool12, bool13, bool14, bool15, str33, null, null, null, bool16, str34, str35, str36, str37, bool17, str38, str39, str40, str41, num5, str42, num6, str43, bool18, str44, str45, str46, str47);
        c8981a.f81519d = null;
        c8981a.f81520e = null;
        c8981a.f81521f = null;
        c8981a.f81522g = null;
        c8981a.f81523h = null;
        c8981a.f81524i = null;
        c8981a.f81525j = null;
        c8981a.f81526k = null;
        c8981a.f81527l = null;
        c8981a.f81528m = null;
        c8981a.f81529n = null;
        c8981a.f81530o = null;
        c8981a.f81531p = null;
        c8981a.f81532q = null;
        c8981a.f81533r = null;
        c8981a.f81535s = null;
        c8981a.f81537t = null;
        c8981a.f81538u = null;
        c8981a.f81539v = null;
        c8981a.f81540w = null;
        c8981a.f81541x = null;
        c8981a.f81542y = null;
        c8981a.f81543z = null;
        c8981a.f81497A = null;
        c8981a.f81498B = null;
        c8981a.f81499C = null;
        c8981a.f81500D = null;
        c8981a.f81501E = null;
        c8981a.f81502F = null;
        c8981a.f81503G = null;
        c8981a.f81504H = null;
        c8981a.f81505I = null;
        c8981a.f81506J = null;
        c8981a.f81507K = null;
        c8981a.f81508L = null;
        c8981a.f81509M = null;
        c8981a.f81510N = null;
        c8981a.f81511O = null;
        c8981a.f81512P = null;
        c8981a.f81513Q = null;
        c8981a.f81514R = null;
        c8981a.f81515S = null;
        c8981a.f81516X = null;
        c8981a.f81517Y = null;
        c8981a.f81536s0 = 2;
    }

    public final Object f(@NotNull List<C6288a> list, @NotNull d<? super Unit> dVar) {
        List<C6288a> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((C6288a) it.next()).o()));
        }
        Object d11 = this.f81544a.d(arrayList, dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final Object g(String str, @NotNull d<? super Unit> dVar) {
        L80.a.a("GraylogRepository", "updateUserId " + str);
        if (str == null) {
            str = "0";
        }
        Object c11 = this.f81544a.c(new C6290c(0, str), dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }
}
