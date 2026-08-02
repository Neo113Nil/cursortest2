package ie0;

import Je0.d;
import Sc.o;
import Sc.s;
import ae0.q;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import ei0.InterfaceC6369b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je0.C7415j;
import ke0.b;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ActualBXTab;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import te0.C9867b;
import ue0.C10044a;
import ue0.C10045b;
import ue0.InterfaceC10046c;
import ve.C10312c;

/* renamed from: ie0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7064a {

    /* renamed from: b, reason: collision with root package name */
    private static GeoProviderConfig f66282b;

    /* renamed from: d, reason: collision with root package name */
    private static GeoProviderConfig f66284d;

    /* renamed from: e, reason: collision with root package name */
    private static WeakReference<Context> f66285e;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7064a f66281a = new C7064a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static Je0.n f66283c = Je0.n.REAL;

    /* renamed from: ie0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1095a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66286a;

        static {
            int[] iArr = new int[ActualBXTab.values().length];
            try {
                iArr[ActualBXTab.PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActualBXTab.COURIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActualBXTab.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66286a = iArr;
        }
    }

    private C7064a() {
    }

    private static Object c(Context context, kotlin.coroutines.jvm.internal.c cVar, GeoProviderConfig geoProviderConfig) {
        if (geoProviderConfig.parseVector() == null) {
            return Unit.f71690a;
        }
        g.f66321a.getClass();
        q i11 = g.i();
        return i11 != null ? i11.e(context, geoProviderConfig, geoProviderConfig.equals(GeoProviderConfig.INSTANCE.getDefaultLibre()), cVar) : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, kotlin.coroutines.jvm.internal.c cVar) {
        C7065b c7065b;
        int i11;
        C7064a c7064a;
        GeoProviderConfig geoProviderConfig;
        if (cVar instanceof C7065b) {
            c7065b = (C7065b) cVar;
            int i12 = c7065b.f66291h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c7065b.f66291h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c7065b.f66289f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c7065b.f66291h;
                if (i11 != 0) {
                    s.b(obj);
                    Ae0.f fVar = Ae0.f.f1194a;
                    c7065b.f66287d = this;
                    c7065b.f66288e = context;
                    c7065b.f66291h = 1;
                    obj = Ae0.f.a(context, c7065b);
                    if (obj != aVar) {
                        c7064a = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    GeoProviderConfig geoProviderConfig2 = (GeoProviderConfig) c7065b.f66287d;
                    s.b(obj);
                    return geoProviderConfig2;
                }
                context = c7065b.f66288e;
                c7064a = (C7064a) c7065b.f66287d;
                s.b(obj);
                geoProviderConfig = (GeoProviderConfig) obj;
                if (geoProviderConfig == null) {
                    geoProviderConfig = GeoProviderConfig.INSTANCE.getDefaultLibre();
                }
                f66283c = !Intrinsics.d(geoProviderConfig, GeoProviderConfig.INSTANCE.getDefaultLibre()) ? Je0.n.FALLBACK : Je0.n.PRE_CACHED;
                c7065b.f66287d = geoProviderConfig;
                c7065b.f66288e = null;
                c7065b.f66291h = 2;
                c7064a.getClass();
                return c(context, c7065b, geoProviderConfig) != aVar ? aVar : geoProviderConfig;
            }
        }
        c7065b = new C7065b(this, cVar);
        Object obj2 = c7065b.f66289f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c7065b.f66291h;
        if (i11 != 0) {
        }
        geoProviderConfig = (GeoProviderConfig) obj2;
        if (geoProviderConfig == null) {
        }
        f66283c = !Intrinsics.d(geoProviderConfig, GeoProviderConfig.INSTANCE.getDefaultLibre()) ? Je0.n.FALLBACK : Je0.n.PRE_CACHED;
        c7065b.f66287d = geoProviderConfig;
        c7065b.f66288e = null;
        c7065b.f66291h = 2;
        c7064a.getClass();
        if (c(context, c7065b, geoProviderConfig) != aVar2) {
        }
    }

    public static WeakReference e() {
        return f66285e;
    }

    @NotNull
    public static Je0.n f() {
        return f66283c;
    }

    public static GeoProviderConfig g() {
        return f66282b;
    }

    public static GeoProviderConfig h() {
        return f66284d;
    }

    private final Object i(List list, Context context, ActualBXTab actualBXTab, kotlin.coroutines.jvm.internal.c cVar) {
        Object obj;
        Object obj2;
        int i11 = C1095a.f66286a[actualBXTab.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                return j(list, context, cVar);
            }
            throw new o();
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            GeoProviderConfig geoProviderConfig = (GeoProviderConfig) obj2;
            if (Intrinsics.d(geoProviderConfig.getMode(), actualBXTab.getMode()) && !geoProviderConfig.getSdkType().isFallback()) {
                break;
            }
        }
        GeoProviderConfig geoProviderConfig2 = (GeoProviderConfig) obj2;
        if (actualBXTab == ActualBXTab.COURIER) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                GeoProviderConfig geoProviderConfig3 = (GeoProviderConfig) next;
                if (Intrinsics.d(geoProviderConfig3.getMode(), actualBXTab.getMode()) && !geoProviderConfig3.equals(geoProviderConfig2) && !geoProviderConfig3.getSdkType().isFallback()) {
                    obj = next;
                    break;
                }
            }
            f66284d = (GeoProviderConfig) obj;
        }
        return geoProviderConfig2 != null ? o(context, cVar, geoProviderConfig2) : j(list, context, cVar);
    }

    private final Object j(List list, Context context, kotlin.coroutines.jvm.internal.c cVar) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((GeoProviderConfig) obj).getSdkType().isFallback()) {
                break;
            }
        }
        return o(context, cVar, (GeoProviderConfig) obj);
    }

    public static void m(@NotNull Je0.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        f66283c = nVar;
    }

    public static void n(GeoProviderConfig geoProviderConfig) {
        f66282b = geoProviderConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Context context, kotlin.coroutines.jvm.internal.c cVar, GeoProviderConfig geoProviderConfig) {
        e eVar;
        int i11;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f66315f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f66315f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f66313d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f66315f;
                if (i11 != 0) {
                    s.b(obj);
                    if (geoProviderConfig != null) {
                        f66282b = geoProviderConfig;
                        return geoProviderConfig;
                    }
                    C9867b c9867b = C9867b.f99466a;
                    C9867b.f("Try set provider, but provider is null", new C10044a(new Exception("provider is null")), InterfaceC10046c.a.ERROR);
                    eVar.f66315f = 1;
                    obj = d(context, eVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                GeoProviderConfig geoProviderConfig2 = (GeoProviderConfig) obj;
                f66282b = geoProviderConfig2;
                Intrinsics.f(geoProviderConfig2);
                return geoProviderConfig2;
            }
        }
        eVar = new e(this, cVar);
        Object obj3 = eVar.f66313d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f66315f;
        if (i11 != 0) {
        }
        GeoProviderConfig geoProviderConfig22 = (GeoProviderConfig) obj3;
        f66282b = geoProviderConfig22;
        Intrinsics.f(geoProviderConfig22);
        return geoProviderConfig22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0240, code lost:
    
        if (r0 != r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(@NotNull Context context, String str, Double d11, Double d12, @NotNull ActualBXTab actualBXTab, String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C7066c c7066c;
        int i11;
        Context applicationContext;
        Context context2;
        long j11;
        String str3;
        String str4;
        Object a11;
        ArrayList arrayList;
        List list;
        String str5;
        ActualBXTab actualBXTab2;
        List list2;
        String str6;
        String str7;
        String str8;
        String str9;
        GeoProviderConfig geoProviderConfig;
        Context context3;
        String str10;
        GeoProviderConfig geoProviderConfig2;
        Context context4;
        GeoProviderConfig geoProviderConfig3;
        Context context5;
        String str11;
        GeoProviderConfig geoProviderConfig4;
        String str12;
        String str13;
        Je0.c cVar2;
        InterfaceC6369b ozonTracker;
        Je0.c cVar3;
        if (cVar instanceof C7066c) {
            c7066c = (C7066c) cVar;
            int i12 = c7066c.f66301m;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c7066c.f66301m = i12 - LinearLayoutManager.INVALID_OFFSET;
                C7066c c7066c2 = c7066c;
                Object obj = c7066c2.f66299k;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c7066c2.f66301m;
                Je0.c cVar4 = null;
                C7064a c7064a = f66281a;
                switch (i11) {
                    case 0:
                        s.b(obj);
                        applicationContext = context.getApplicationContext();
                        f66285e = new WeakReference<>(applicationContext);
                        kotlin.time.g.f71988a.getClass();
                        kotlin.time.f.f71986a.getClass();
                        long b11 = kotlin.time.f.b();
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            b.a aVar2 = ke0.b.f71519a;
                            c7066c2.f66292d = str;
                            c7066c2.f66293e = actualBXTab;
                            c7066c2.f66294f = null;
                            c7066c2.f66295g = applicationContext;
                            c7066c2.f66296h = arrayList2;
                            c7066c2.f66297i = arrayList2;
                            c7066c2.f66298j = b11;
                            c7066c2.f66301m = 1;
                            a11 = aVar2.a(str, d11, d12, str2, c7066c2);
                        } catch (Throwable th2) {
                            th = th2;
                            context2 = applicationContext;
                            j11 = b11;
                            str3 = str;
                            str4 = null;
                            if (!(th instanceof HttpException) && !(th instanceof UnknownHostException)) {
                                if (C10045b.a(th)) {
                                    C9867b c9867b = C9867b.f99466a;
                                    C9867b.f("have error while try load providers", new C10044a(th), InterfaceC10046c.a.ERROR);
                                } else {
                                    C9867b c9867b2 = C9867b.f99466a;
                                    C9867b.f(Nk.a.b("decode error: ", th.getMessage()), new C10044a(th), InterfaceC10046c.a.ERROR);
                                }
                            }
                            Intrinsics.f(context2);
                            c7066c2.f66292d = str3;
                            c7066c2.f66293e = str4;
                            c7066c2.f66294f = context2;
                            c7066c2.f66295g = null;
                            c7066c2.f66296h = null;
                            c7066c2.f66297i = null;
                            c7066c2.f66298j = j11;
                            c7066c2.f66301m = 2;
                            obj = c7064a.d(context2, c7066c2);
                            break;
                        }
                        if (a11 != aVar) {
                            arrayList = arrayList2;
                            list = arrayList;
                            obj = a11;
                            str5 = null;
                            j11 = b11;
                            actualBXTab2 = actualBXTab;
                            str3 = str;
                            try {
                                arrayList.addAll((Collection) obj);
                                if (list.isEmpty()) {
                                    C9867b c9867b3 = C9867b.f99466a;
                                    C9867b.f("Empty providers", new C10044a(new Exception("Empty providers")), InterfaceC10046c.a.ERROR);
                                }
                                Intrinsics.f(applicationContext);
                                c7066c2.f66292d = str3;
                                c7066c2.f66293e = actualBXTab2;
                                c7066c2.f66294f = str5;
                                c7066c2.f66295g = applicationContext;
                                c7066c2.f66296h = list;
                                c7066c2.f66297i = null;
                                c7066c2.f66298j = j11;
                                c7066c2.f66301m = 4;
                                obj = c7064a.i(list, applicationContext, ActualBXTab.NONE, c7066c2);
                            } catch (Throwable th3) {
                                th = th3;
                                context2 = applicationContext;
                                str4 = str5;
                                if (!(th instanceof HttpException)) {
                                    if (C10045b.a(th)) {
                                    }
                                }
                                Intrinsics.f(context2);
                                c7066c2.f66292d = str3;
                                c7066c2.f66293e = str4;
                                c7066c2.f66294f = context2;
                                c7066c2.f66295g = null;
                                c7066c2.f66296h = null;
                                c7066c2.f66297i = null;
                                c7066c2.f66298j = j11;
                                c7066c2.f66301m = 2;
                                obj = c7064a.d(context2, c7066c2);
                            }
                            if (obj != aVar) {
                                list2 = list;
                                f66284d = (GeoProviderConfig) obj;
                                Intrinsics.f(applicationContext);
                                c7066c2.f66292d = str3;
                                c7066c2.f66293e = str5;
                                c7066c2.f66294f = applicationContext;
                                c7066c2.f66295g = null;
                                c7066c2.f66296h = null;
                                c7066c2.f66298j = j11;
                                c7066c2.f66301m = 5;
                                obj = c7064a.i(list2, applicationContext, actualBXTab2, c7066c2);
                                if (obj != aVar) {
                                    context3 = applicationContext;
                                    str10 = str3;
                                    geoProviderConfig2 = (GeoProviderConfig) obj;
                                    Ae0.f fVar = Ae0.f.f1194a;
                                    Intrinsics.f(context3);
                                    c7066c2.f66292d = str10;
                                    c7066c2.f66293e = str5;
                                    c7066c2.f66294f = context3;
                                    c7066c2.f66295g = geoProviderConfig2;
                                    c7066c2.f66298j = j11;
                                    c7066c2.f66301m = 6;
                                    if (Ae0.f.c(context3, c7066c2, geoProviderConfig2) != aVar) {
                                        context4 = context3;
                                        geoProviderConfig3 = geoProviderConfig2;
                                        ae0.i iVar = ae0.i.f36650a;
                                        Intrinsics.f(context4);
                                        c7066c2.f66292d = str10;
                                        c7066c2.f66293e = str5;
                                        c7066c2.f66294f = context4;
                                        c7066c2.f66295g = null;
                                        c7066c2.f66298j = j11;
                                        c7066c2.f66301m = 7;
                                        obj = iVar.d(context4, c7066c2, geoProviderConfig3);
                                        if (obj != aVar) {
                                            context5 = context4;
                                            str11 = str5;
                                            geoProviderConfig4 = (GeoProviderConfig) obj;
                                            Intrinsics.f(context5);
                                            c7066c2.f66292d = str10;
                                            c7066c2.f66293e = str11;
                                            c7066c2.f66294f = geoProviderConfig4;
                                            c7066c2.f66298j = j11;
                                            c7066c2.f66301m = 8;
                                            c7064a.getClass();
                                            if (c(context5, c7066c2, geoProviderConfig4) != aVar) {
                                                geoProviderConfig = geoProviderConfig4;
                                                str12 = str11;
                                                str13 = str10;
                                                str8 = str12;
                                                str9 = str13;
                                                kotlin.time.f.f71986a.getClass();
                                                C10312c c10312c = new C10312c(geoProviderConfig, kotlin.time.f.a(j11), null);
                                                g.f66321a.getClass();
                                                if (g.c() != null) {
                                                    Je0.c.f14654d = null;
                                                } else {
                                                    cVar2 = Je0.c.f14654d;
                                                    if (cVar2 != null) {
                                                        cVar4 = Je0.c.f14654d;
                                                    } else {
                                                        GeoProxyConfig c11 = g.c();
                                                        if (c11 == null || (ozonTracker = c11.getOzonTracker()) == null) {
                                                            d.a.a();
                                                        } else {
                                                            Je0.c.f14654d = new Je0.c(ozonTracker);
                                                            cVar4 = Je0.c.f14654d;
                                                        }
                                                    }
                                                }
                                                cVar3 = cVar4;
                                                if (cVar3 != null) {
                                                    Je0.c.d(cVar3, (GeoProviderConfig) c10312c.b(), Je0.e.MAP_LOAD, str9, new Long(kotlin.time.b.h(c10312c.getF102869b())), str8, null, 80);
                                                }
                                                return c10312c.b();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 1:
                        j11 = c7066c2.f66298j;
                        arrayList = c7066c2.f66297i;
                        list = c7066c2.f66296h;
                        Context context6 = (Context) c7066c2.f66295g;
                        str4 = (String) c7066c2.f66294f;
                        actualBXTab2 = (ActualBXTab) c7066c2.f66293e;
                        str3 = c7066c2.f66292d;
                        try {
                            s.b(obj);
                            applicationContext = context6;
                            str5 = str4;
                            arrayList.addAll((Collection) obj);
                            if (list.isEmpty()) {
                            }
                            Intrinsics.f(applicationContext);
                            c7066c2.f66292d = str3;
                            c7066c2.f66293e = actualBXTab2;
                            c7066c2.f66294f = str5;
                            c7066c2.f66295g = applicationContext;
                            c7066c2.f66296h = list;
                            c7066c2.f66297i = null;
                            c7066c2.f66298j = j11;
                            c7066c2.f66301m = 4;
                            obj = c7064a.i(list, applicationContext, ActualBXTab.NONE, c7066c2);
                            if (obj != aVar) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            context2 = context6;
                            if (!(th instanceof HttpException)) {
                            }
                            Intrinsics.f(context2);
                            c7066c2.f66292d = str3;
                            c7066c2.f66293e = str4;
                            c7066c2.f66294f = context2;
                            c7066c2.f66295g = null;
                            c7066c2.f66296h = null;
                            c7066c2.f66297i = null;
                            c7066c2.f66298j = j11;
                            c7066c2.f66301m = 2;
                            obj = c7064a.d(context2, c7066c2);
                            break;
                        }
                        return aVar;
                    case 2:
                        j11 = c7066c2.f66298j;
                        context2 = (Context) c7066c2.f66294f;
                        String str14 = (String) c7066c2.f66293e;
                        String str15 = c7066c2.f66292d;
                        s.b(obj);
                        str4 = str14;
                        str3 = str15;
                        GeoProviderConfig geoProviderConfig5 = (GeoProviderConfig) obj;
                        f66282b = geoProviderConfig5;
                        ae0.i iVar2 = ae0.i.f36650a;
                        Intrinsics.f(context2);
                        c7066c2.f66292d = str3;
                        c7066c2.f66293e = str4;
                        c7066c2.f66294f = null;
                        c7066c2.f66298j = j11;
                        c7066c2.f66301m = 3;
                        obj = iVar2.d(context2, c7066c2, geoProviderConfig5);
                        if (obj != aVar) {
                            str6 = str4;
                            str7 = str3;
                            str8 = str6;
                            str9 = str7;
                            geoProviderConfig = (GeoProviderConfig) obj;
                            kotlin.time.f.f71986a.getClass();
                            C10312c c10312c2 = new C10312c(geoProviderConfig, kotlin.time.f.a(j11), null);
                            g.f66321a.getClass();
                            if (g.c() != null) {
                            }
                            cVar3 = cVar4;
                            if (cVar3 != null) {
                            }
                            return c10312c2.b();
                        }
                        return aVar;
                    case 3:
                        j11 = c7066c2.f66298j;
                        str6 = (String) c7066c2.f66293e;
                        str7 = c7066c2.f66292d;
                        s.b(obj);
                        str8 = str6;
                        str9 = str7;
                        geoProviderConfig = (GeoProviderConfig) obj;
                        kotlin.time.f.f71986a.getClass();
                        C10312c c10312c22 = new C10312c(geoProviderConfig, kotlin.time.f.a(j11), null);
                        g.f66321a.getClass();
                        if (g.c() != null) {
                        }
                        cVar3 = cVar4;
                        if (cVar3 != null) {
                        }
                        return c10312c22.b();
                    case 4:
                        j11 = c7066c2.f66298j;
                        list2 = c7066c2.f66296h;
                        Context context7 = (Context) c7066c2.f66295g;
                        str5 = (String) c7066c2.f66294f;
                        ActualBXTab actualBXTab3 = (ActualBXTab) c7066c2.f66293e;
                        String str16 = c7066c2.f66292d;
                        s.b(obj);
                        str3 = str16;
                        actualBXTab2 = actualBXTab3;
                        applicationContext = context7;
                        f66284d = (GeoProviderConfig) obj;
                        Intrinsics.f(applicationContext);
                        c7066c2.f66292d = str3;
                        c7066c2.f66293e = str5;
                        c7066c2.f66294f = applicationContext;
                        c7066c2.f66295g = null;
                        c7066c2.f66296h = null;
                        c7066c2.f66298j = j11;
                        c7066c2.f66301m = 5;
                        obj = c7064a.i(list2, applicationContext, actualBXTab2, c7066c2);
                        if (obj != aVar) {
                        }
                        return aVar;
                    case 5:
                        j11 = c7066c2.f66298j;
                        context3 = (Context) c7066c2.f66294f;
                        String str17 = (String) c7066c2.f66293e;
                        String str18 = c7066c2.f66292d;
                        s.b(obj);
                        str10 = str18;
                        str5 = str17;
                        geoProviderConfig2 = (GeoProviderConfig) obj;
                        Ae0.f fVar2 = Ae0.f.f1194a;
                        Intrinsics.f(context3);
                        c7066c2.f66292d = str10;
                        c7066c2.f66293e = str5;
                        c7066c2.f66294f = context3;
                        c7066c2.f66295g = geoProviderConfig2;
                        c7066c2.f66298j = j11;
                        c7066c2.f66301m = 6;
                        if (Ae0.f.c(context3, c7066c2, geoProviderConfig2) != aVar) {
                        }
                        return aVar;
                    case 6:
                        j11 = c7066c2.f66298j;
                        geoProviderConfig3 = (GeoProviderConfig) c7066c2.f66295g;
                        context4 = (Context) c7066c2.f66294f;
                        str5 = (String) c7066c2.f66293e;
                        str10 = c7066c2.f66292d;
                        s.b(obj);
                        ae0.i iVar3 = ae0.i.f36650a;
                        Intrinsics.f(context4);
                        c7066c2.f66292d = str10;
                        c7066c2.f66293e = str5;
                        c7066c2.f66294f = context4;
                        c7066c2.f66295g = null;
                        c7066c2.f66298j = j11;
                        c7066c2.f66301m = 7;
                        obj = iVar3.d(context4, c7066c2, geoProviderConfig3);
                        if (obj != aVar) {
                        }
                        return aVar;
                    case 7:
                        j11 = c7066c2.f66298j;
                        context5 = (Context) c7066c2.f66294f;
                        str11 = (String) c7066c2.f66293e;
                        String str19 = c7066c2.f66292d;
                        s.b(obj);
                        str10 = str19;
                        geoProviderConfig4 = (GeoProviderConfig) obj;
                        Intrinsics.f(context5);
                        c7066c2.f66292d = str10;
                        c7066c2.f66293e = str11;
                        c7066c2.f66294f = geoProviderConfig4;
                        c7066c2.f66298j = j11;
                        c7066c2.f66301m = 8;
                        c7064a.getClass();
                        if (c(context5, c7066c2, geoProviderConfig4) != aVar) {
                        }
                        return aVar;
                    case 8:
                        j11 = c7066c2.f66298j;
                        geoProviderConfig = (GeoProviderConfig) c7066c2.f66294f;
                        str12 = (String) c7066c2.f66293e;
                        str13 = c7066c2.f66292d;
                        s.b(obj);
                        str8 = str12;
                        str9 = str13;
                        kotlin.time.f.f71986a.getClass();
                        C10312c c10312c222 = new C10312c(geoProviderConfig, kotlin.time.f.a(j11), null);
                        g.f66321a.getClass();
                        if (g.c() != null) {
                        }
                        cVar3 = cVar4;
                        if (cVar3 != null) {
                        }
                        return c10312c222.b();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c7066c = new C7066c(this, cVar);
        C7066c c7066c22 = c7066c;
        Object obj2 = c7066c22.f66299k;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c7066c22.f66301m;
        Je0.c cVar42 = null;
        C7064a c7064a2 = f66281a;
        switch (i11) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01aa, code lost:
    
        if (r0 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, @NotNull Context context, @NotNull kotlin.coroutines.d dVar) {
        d dVar2;
        int i11;
        List arrayList;
        Context context2;
        long j11;
        String str2;
        String str3;
        Context context3;
        List list;
        String str4;
        Context context4;
        String str5;
        String str6;
        List list2;
        String str7;
        String str8;
        String str9;
        String str10;
        C7415j c7415j;
        List list3;
        GeoProviderConfig geoProviderConfig;
        String str11;
        String str12;
        Context context5;
        Object i12;
        GeoProviderConfig geoProviderConfig2;
        GeoProviderConfig geoProviderConfig3;
        GeoProviderConfig geoProviderConfig4;
        String str13;
        String str14;
        Context context6;
        GeoProviderConfig geoProviderConfig5;
        GeoProviderConfig geoProviderConfig6;
        GeoProviderConfig geoProviderConfig7;
        Context context7;
        String str15;
        String str16;
        Object d11;
        GeoProviderConfig geoProviderConfig8;
        GeoProviderConfig geoProviderConfig9;
        Object d12;
        GeoProviderConfig geoProviderConfig10;
        GeoProviderConfig geoProviderConfig11;
        String str17;
        Context context8;
        GeoProviderConfig geoProviderConfig12;
        Iterator it;
        String str18;
        GeoProviderConfig geoProviderConfig13;
        GeoProviderConfig geoProviderConfig14;
        Je0.c cVar;
        InterfaceC6369b ozonTracker;
        Je0.c cVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i13 = dVar2.f66312n;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar2.f66312n = i13 - LinearLayoutManager.INVALID_OFFSET;
                d dVar3 = dVar2;
                Object obj = dVar3.f66310l;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar3.f66312n;
                Je0.c cVar3 = null;
                C7064a c7064a = f66281a;
                switch (i11) {
                    case 0:
                        s.b(obj);
                        Context applicationContext = context.getApplicationContext();
                        f66285e = new WeakReference<>(applicationContext);
                        kotlin.time.g.f71988a.getClass();
                        kotlin.time.f.f71986a.getClass();
                        long b11 = kotlin.time.f.b();
                        arrayList = new ArrayList();
                        try {
                            g gVar = g.f66321a;
                            dVar3.f66302d = str;
                            dVar3.f66303e = null;
                            dVar3.f66304f = applicationContext;
                            dVar3.f66305g = arrayList;
                            dVar3.f66306h = arrayList;
                            dVar3.f66309k = b11;
                            dVar3.f66312n = 1;
                            Serializable g10 = gVar.g(str, null, null, null, dVar3);
                            if (g10 != aVar) {
                                context3 = applicationContext;
                                obj = g10;
                                j11 = b11;
                                list = arrayList;
                                str2 = str;
                                str3 = null;
                                list.addAll((Collection) obj);
                                Intrinsics.f(context3);
                                dVar3.f66302d = str2;
                                dVar3.f66303e = str3;
                                dVar3.f66304f = context3;
                                dVar3.f66305g = arrayList;
                                dVar3.f66306h = null;
                                dVar3.f66309k = j11;
                                dVar3.f66312n = 4;
                                obj = c7064a.i(arrayList, context3, ActualBXTab.NONE, dVar3);
                                if (obj != aVar) {
                                    context4 = context3;
                                    str5 = str3;
                                    str6 = str2;
                                    list2 = arrayList;
                                    f66284d = (GeoProviderConfig) obj;
                                    Intrinsics.f(context4);
                                    ActualBXTab actualBXTab = ActualBXTab.PICKUP;
                                    dVar3.f66302d = str6;
                                    dVar3.f66303e = str5;
                                    dVar3.f66304f = context4;
                                    dVar3.f66305g = list2;
                                    dVar3.f66309k = j11;
                                    dVar3.f66312n = 5;
                                    obj = c7064a.i(list2, context4, actualBXTab, dVar3);
                                    break;
                                }
                            }
                        } catch (Throwable unused) {
                            context2 = applicationContext;
                            j11 = b11;
                            str2 = str;
                            str3 = null;
                            Intrinsics.f(context2);
                            dVar3.f66302d = str2;
                            dVar3.f66303e = str3;
                            dVar3.f66304f = context2;
                            dVar3.f66305g = null;
                            dVar3.f66306h = null;
                            dVar3.f66309k = j11;
                            dVar3.f66312n = 2;
                            obj = c7064a.d(context2, dVar3);
                            if (obj != aVar) {
                            }
                            return aVar;
                        }
                        return aVar;
                    case 1:
                        j11 = dVar3.f66309k;
                        list = (List) dVar3.f66306h;
                        List list4 = (List) dVar3.f66305g;
                        context3 = dVar3.f66304f;
                        str3 = dVar3.f66303e;
                        str2 = dVar3.f66302d;
                        try {
                            s.b(obj);
                            arrayList = list4;
                            list.addAll((Collection) obj);
                            Intrinsics.f(context3);
                            dVar3.f66302d = str2;
                            dVar3.f66303e = str3;
                            dVar3.f66304f = context3;
                            dVar3.f66305g = arrayList;
                            dVar3.f66306h = null;
                            dVar3.f66309k = j11;
                            dVar3.f66312n = 4;
                            obj = c7064a.i(arrayList, context3, ActualBXTab.NONE, dVar3);
                            if (obj != aVar) {
                            }
                        } catch (Throwable unused2) {
                            context2 = context3;
                            Intrinsics.f(context2);
                            dVar3.f66302d = str2;
                            dVar3.f66303e = str3;
                            dVar3.f66304f = context2;
                            dVar3.f66305g = null;
                            dVar3.f66306h = null;
                            dVar3.f66309k = j11;
                            dVar3.f66312n = 2;
                            obj = c7064a.d(context2, dVar3);
                            if (obj != aVar) {
                                str4 = str3;
                                GeoProviderConfig geoProviderConfig15 = (GeoProviderConfig) obj;
                                f66282b = geoProviderConfig15;
                                ae0.i iVar = ae0.i.f36650a;
                                Intrinsics.f(context2);
                                dVar3.f66302d = str2;
                                dVar3.f66303e = str4;
                                dVar3.f66304f = null;
                                dVar3.f66309k = j11;
                                dVar3.f66312n = 3;
                                obj = iVar.d(context2, dVar3, geoProviderConfig15);
                                if (obj != aVar) {
                                }
                            }
                            return aVar;
                        }
                        return aVar;
                    case 2:
                        j11 = dVar3.f66309k;
                        context2 = dVar3.f66304f;
                        str4 = dVar3.f66303e;
                        String str19 = dVar3.f66302d;
                        s.b(obj);
                        str2 = str19;
                        GeoProviderConfig geoProviderConfig152 = (GeoProviderConfig) obj;
                        f66282b = geoProviderConfig152;
                        ae0.i iVar2 = ae0.i.f36650a;
                        Intrinsics.f(context2);
                        dVar3.f66302d = str2;
                        dVar3.f66303e = str4;
                        dVar3.f66304f = null;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 3;
                        obj = iVar2.d(context2, dVar3, geoProviderConfig152);
                        if (obj != aVar) {
                            str7 = str4;
                            str8 = str2;
                            GeoProviderConfig geoProviderConfig16 = (GeoProviderConfig) obj;
                            str9 = str7;
                            str10 = str8;
                            c7415j = new C7415j(geoProviderConfig16, geoProviderConfig16, geoProviderConfig16);
                            kotlin.time.f.f71986a.getClass();
                            C10312c c10312c = new C10312c(c7415j, kotlin.time.f.a(j11), null);
                            g.f66321a.getClass();
                            if (g.c() == null) {
                                Je0.c.f14654d = null;
                            } else {
                                cVar = Je0.c.f14654d;
                                if (cVar != null) {
                                    cVar3 = Je0.c.f14654d;
                                } else {
                                    GeoProxyConfig c11 = g.c();
                                    if (c11 == null || (ozonTracker = c11.getOzonTracker()) == null) {
                                        d.a.a();
                                    } else {
                                        Je0.c.f14654d = new Je0.c(ozonTracker);
                                        cVar3 = Je0.c.f14654d;
                                    }
                                }
                            }
                            cVar2 = cVar3;
                            if (cVar2 != null) {
                                Je0.c.d(cVar2, ((C7415j) c10312c.b()).c(), Je0.e.MAP_LOAD, str10, new Long(kotlin.time.b.h(c10312c.getF102869b())), str9, null, 80);
                            }
                            return c10312c.b();
                        }
                        return aVar;
                    case 3:
                        j11 = dVar3.f66309k;
                        str7 = dVar3.f66303e;
                        str8 = dVar3.f66302d;
                        s.b(obj);
                        GeoProviderConfig geoProviderConfig162 = (GeoProviderConfig) obj;
                        str9 = str7;
                        str10 = str8;
                        c7415j = new C7415j(geoProviderConfig162, geoProviderConfig162, geoProviderConfig162);
                        kotlin.time.f.f71986a.getClass();
                        C10312c c10312c2 = new C10312c(c7415j, kotlin.time.f.a(j11), null);
                        g.f66321a.getClass();
                        if (g.c() == null) {
                        }
                        cVar2 = cVar3;
                        if (cVar2 != null) {
                        }
                        return c10312c2.b();
                    case 4:
                        j11 = dVar3.f66309k;
                        list2 = (List) dVar3.f66305g;
                        context4 = dVar3.f66304f;
                        str5 = dVar3.f66303e;
                        str6 = dVar3.f66302d;
                        s.b(obj);
                        f66284d = (GeoProviderConfig) obj;
                        Intrinsics.f(context4);
                        ActualBXTab actualBXTab2 = ActualBXTab.PICKUP;
                        dVar3.f66302d = str6;
                        dVar3.f66303e = str5;
                        dVar3.f66304f = context4;
                        dVar3.f66305g = list2;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 5;
                        obj = c7064a.i(list2, context4, actualBXTab2, dVar3);
                        break;
                    case 5:
                        j11 = dVar3.f66309k;
                        list2 = (List) dVar3.f66305g;
                        context4 = dVar3.f66304f;
                        str5 = dVar3.f66303e;
                        str6 = dVar3.f66302d;
                        s.b(obj);
                        Context context9 = context4;
                        list3 = list2;
                        GeoProviderConfig geoProviderConfig17 = (GeoProviderConfig) obj;
                        Intrinsics.f(context9);
                        ActualBXTab actualBXTab3 = ActualBXTab.COURIER;
                        dVar3.f66302d = str6;
                        dVar3.f66303e = str5;
                        dVar3.f66304f = context9;
                        dVar3.f66305g = list3;
                        dVar3.f66306h = geoProviderConfig17;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 6;
                        Object i14 = c7064a.i(list3, context9, actualBXTab3, dVar3);
                        if (i14 != aVar) {
                            geoProviderConfig = geoProviderConfig17;
                            obj = i14;
                            str11 = str6;
                            str12 = str5;
                            context5 = context9;
                            GeoProviderConfig geoProviderConfig18 = (GeoProviderConfig) obj;
                            Intrinsics.f(context5);
                            dVar3.f66302d = str11;
                            dVar3.f66303e = str12;
                            dVar3.f66304f = context5;
                            dVar3.f66305g = geoProviderConfig;
                            dVar3.f66306h = geoProviderConfig18;
                            dVar3.f66309k = j11;
                            dVar3.f66312n = 7;
                            i12 = c7064a.i(list3, context5, ActualBXTab.NONE, dVar3);
                            if (i12 != aVar) {
                                GeoProviderConfig geoProviderConfig19 = geoProviderConfig;
                                geoProviderConfig2 = geoProviderConfig18;
                                obj = i12;
                                geoProviderConfig3 = geoProviderConfig19;
                                geoProviderConfig4 = (GeoProviderConfig) obj;
                                Ae0.f fVar = Ae0.f.f1194a;
                                Intrinsics.f(context5);
                                dVar3.f66302d = str11;
                                dVar3.f66303e = str12;
                                dVar3.f66304f = context5;
                                dVar3.f66305g = geoProviderConfig3;
                                dVar3.f66306h = geoProviderConfig2;
                                dVar3.f66307i = geoProviderConfig4;
                                dVar3.f66309k = j11;
                                dVar3.f66312n = 8;
                                if (Ae0.f.c(context5, dVar3, geoProviderConfig4) != aVar) {
                                    str13 = str11;
                                    str14 = str12;
                                    context6 = context5;
                                    geoProviderConfig5 = geoProviderConfig3;
                                    geoProviderConfig6 = geoProviderConfig2;
                                    geoProviderConfig7 = geoProviderConfig4;
                                    ae0.i iVar3 = ae0.i.f36650a;
                                    Intrinsics.f(context6);
                                    dVar3.f66302d = str13;
                                    dVar3.f66303e = str14;
                                    dVar3.f66304f = context6;
                                    dVar3.f66305g = geoProviderConfig6;
                                    dVar3.f66306h = geoProviderConfig7;
                                    dVar3.f66307i = null;
                                    dVar3.f66309k = j11;
                                    dVar3.f66312n = 9;
                                    obj = iVar3.d(context6, dVar3, geoProviderConfig5);
                                    if (obj != aVar) {
                                        context7 = context6;
                                        str15 = str14;
                                        str16 = str13;
                                        GeoProviderConfig geoProviderConfig20 = (GeoProviderConfig) obj;
                                        ae0.i iVar4 = ae0.i.f36650a;
                                        Intrinsics.f(context7);
                                        dVar3.f66302d = str16;
                                        dVar3.f66303e = str15;
                                        dVar3.f66304f = context7;
                                        dVar3.f66305g = geoProviderConfig7;
                                        dVar3.f66306h = geoProviderConfig20;
                                        dVar3.f66309k = j11;
                                        dVar3.f66312n = 10;
                                        d11 = iVar4.d(context7, dVar3, geoProviderConfig6);
                                        if (d11 != aVar) {
                                            GeoProviderConfig geoProviderConfig21 = geoProviderConfig7;
                                            geoProviderConfig8 = geoProviderConfig20;
                                            obj = d11;
                                            geoProviderConfig9 = geoProviderConfig21;
                                            GeoProviderConfig geoProviderConfig22 = (GeoProviderConfig) obj;
                                            ae0.i iVar5 = ae0.i.f36650a;
                                            Intrinsics.f(context7);
                                            dVar3.f66302d = str16;
                                            dVar3.f66303e = str15;
                                            dVar3.f66304f = context7;
                                            dVar3.f66305g = geoProviderConfig8;
                                            dVar3.f66306h = geoProviderConfig22;
                                            dVar3.f66309k = j11;
                                            dVar3.f66312n = 11;
                                            d12 = iVar5.d(context7, dVar3, geoProviderConfig9);
                                            if (d12 != aVar) {
                                                GeoProviderConfig geoProviderConfig23 = geoProviderConfig8;
                                                geoProviderConfig10 = geoProviderConfig22;
                                                obj = d12;
                                                geoProviderConfig11 = geoProviderConfig23;
                                                GeoProviderConfig geoProviderConfig24 = (GeoProviderConfig) obj;
                                                str17 = str16;
                                                context8 = context7;
                                                geoProviderConfig12 = geoProviderConfig10;
                                                it = C7714v.b0(geoProviderConfig11, geoProviderConfig10, geoProviderConfig24).iterator();
                                                str18 = str15;
                                                geoProviderConfig13 = geoProviderConfig11;
                                                geoProviderConfig14 = geoProviderConfig24;
                                                while (it.hasNext()) {
                                                    GeoProviderConfig geoProviderConfig25 = (GeoProviderConfig) it.next();
                                                    Intrinsics.f(context8);
                                                    dVar3.f66302d = str17;
                                                    dVar3.f66303e = str18;
                                                    dVar3.f66304f = context8;
                                                    dVar3.f66305g = geoProviderConfig13;
                                                    dVar3.f66306h = geoProviderConfig12;
                                                    dVar3.f66307i = geoProviderConfig14;
                                                    dVar3.f66308j = it;
                                                    dVar3.f66309k = j11;
                                                    dVar3.f66312n = 12;
                                                    c7064a.getClass();
                                                    if (c(context8, dVar3, geoProviderConfig25) == aVar) {
                                                    }
                                                }
                                                c7415j = new C7415j(geoProviderConfig13, geoProviderConfig12, geoProviderConfig14);
                                                str9 = str18;
                                                str10 = str17;
                                                kotlin.time.f.f71986a.getClass();
                                                C10312c c10312c22 = new C10312c(c7415j, kotlin.time.f.a(j11), null);
                                                g.f66321a.getClass();
                                                if (g.c() == null) {
                                                }
                                                cVar2 = cVar3;
                                                if (cVar2 != null) {
                                                }
                                                return c10312c22.b();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        j11 = dVar3.f66309k;
                        geoProviderConfig = (GeoProviderConfig) dVar3.f66306h;
                        list3 = (List) dVar3.f66305g;
                        context5 = dVar3.f66304f;
                        str12 = dVar3.f66303e;
                        str11 = dVar3.f66302d;
                        s.b(obj);
                        GeoProviderConfig geoProviderConfig182 = (GeoProviderConfig) obj;
                        Intrinsics.f(context5);
                        dVar3.f66302d = str11;
                        dVar3.f66303e = str12;
                        dVar3.f66304f = context5;
                        dVar3.f66305g = geoProviderConfig;
                        dVar3.f66306h = geoProviderConfig182;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 7;
                        i12 = c7064a.i(list3, context5, ActualBXTab.NONE, dVar3);
                        if (i12 != aVar) {
                        }
                        return aVar;
                    case 7:
                        j11 = dVar3.f66309k;
                        geoProviderConfig2 = (GeoProviderConfig) dVar3.f66306h;
                        geoProviderConfig3 = (GeoProviderConfig) dVar3.f66305g;
                        context5 = dVar3.f66304f;
                        str12 = dVar3.f66303e;
                        str11 = dVar3.f66302d;
                        s.b(obj);
                        geoProviderConfig4 = (GeoProviderConfig) obj;
                        Ae0.f fVar2 = Ae0.f.f1194a;
                        Intrinsics.f(context5);
                        dVar3.f66302d = str11;
                        dVar3.f66303e = str12;
                        dVar3.f66304f = context5;
                        dVar3.f66305g = geoProviderConfig3;
                        dVar3.f66306h = geoProviderConfig2;
                        dVar3.f66307i = geoProviderConfig4;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 8;
                        if (Ae0.f.c(context5, dVar3, geoProviderConfig4) != aVar) {
                        }
                        return aVar;
                    case 8:
                        j11 = dVar3.f66309k;
                        geoProviderConfig7 = dVar3.f66307i;
                        geoProviderConfig6 = (GeoProviderConfig) dVar3.f66306h;
                        geoProviderConfig5 = (GeoProviderConfig) dVar3.f66305g;
                        context6 = dVar3.f66304f;
                        str14 = dVar3.f66303e;
                        str13 = dVar3.f66302d;
                        s.b(obj);
                        ae0.i iVar32 = ae0.i.f36650a;
                        Intrinsics.f(context6);
                        dVar3.f66302d = str13;
                        dVar3.f66303e = str14;
                        dVar3.f66304f = context6;
                        dVar3.f66305g = geoProviderConfig6;
                        dVar3.f66306h = geoProviderConfig7;
                        dVar3.f66307i = null;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 9;
                        obj = iVar32.d(context6, dVar3, geoProviderConfig5);
                        if (obj != aVar) {
                        }
                        return aVar;
                    case 9:
                        j11 = dVar3.f66309k;
                        geoProviderConfig7 = (GeoProviderConfig) dVar3.f66306h;
                        geoProviderConfig6 = (GeoProviderConfig) dVar3.f66305g;
                        context7 = dVar3.f66304f;
                        str15 = dVar3.f66303e;
                        str16 = dVar3.f66302d;
                        s.b(obj);
                        GeoProviderConfig geoProviderConfig202 = (GeoProviderConfig) obj;
                        ae0.i iVar42 = ae0.i.f36650a;
                        Intrinsics.f(context7);
                        dVar3.f66302d = str16;
                        dVar3.f66303e = str15;
                        dVar3.f66304f = context7;
                        dVar3.f66305g = geoProviderConfig7;
                        dVar3.f66306h = geoProviderConfig202;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 10;
                        d11 = iVar42.d(context7, dVar3, geoProviderConfig6);
                        if (d11 != aVar) {
                        }
                        return aVar;
                    case 10:
                        j11 = dVar3.f66309k;
                        geoProviderConfig8 = (GeoProviderConfig) dVar3.f66306h;
                        geoProviderConfig9 = (GeoProviderConfig) dVar3.f66305g;
                        context7 = dVar3.f66304f;
                        str15 = dVar3.f66303e;
                        str16 = dVar3.f66302d;
                        s.b(obj);
                        GeoProviderConfig geoProviderConfig222 = (GeoProviderConfig) obj;
                        ae0.i iVar52 = ae0.i.f36650a;
                        Intrinsics.f(context7);
                        dVar3.f66302d = str16;
                        dVar3.f66303e = str15;
                        dVar3.f66304f = context7;
                        dVar3.f66305g = geoProviderConfig8;
                        dVar3.f66306h = geoProviderConfig222;
                        dVar3.f66309k = j11;
                        dVar3.f66312n = 11;
                        d12 = iVar52.d(context7, dVar3, geoProviderConfig9);
                        if (d12 != aVar) {
                        }
                        return aVar;
                    case 11:
                        j11 = dVar3.f66309k;
                        geoProviderConfig10 = (GeoProviderConfig) dVar3.f66306h;
                        geoProviderConfig11 = (GeoProviderConfig) dVar3.f66305g;
                        context7 = dVar3.f66304f;
                        str15 = dVar3.f66303e;
                        str16 = dVar3.f66302d;
                        s.b(obj);
                        GeoProviderConfig geoProviderConfig242 = (GeoProviderConfig) obj;
                        str17 = str16;
                        context8 = context7;
                        geoProviderConfig12 = geoProviderConfig10;
                        it = C7714v.b0(geoProviderConfig11, geoProviderConfig10, geoProviderConfig242).iterator();
                        str18 = str15;
                        geoProviderConfig13 = geoProviderConfig11;
                        geoProviderConfig14 = geoProviderConfig242;
                        while (it.hasNext()) {
                        }
                        c7415j = new C7415j(geoProviderConfig13, geoProviderConfig12, geoProviderConfig14);
                        str9 = str18;
                        str10 = str17;
                        kotlin.time.f.f71986a.getClass();
                        C10312c c10312c222 = new C10312c(c7415j, kotlin.time.f.a(j11), null);
                        g.f66321a.getClass();
                        if (g.c() == null) {
                        }
                        cVar2 = cVar3;
                        if (cVar2 != null) {
                        }
                        return c10312c222.b();
                    case 12:
                        j11 = dVar3.f66309k;
                        it = dVar3.f66308j;
                        geoProviderConfig14 = dVar3.f66307i;
                        geoProviderConfig12 = (GeoProviderConfig) dVar3.f66306h;
                        geoProviderConfig13 = (GeoProviderConfig) dVar3.f66305g;
                        context8 = dVar3.f66304f;
                        str18 = dVar3.f66303e;
                        str17 = dVar3.f66302d;
                        s.b(obj);
                        while (it.hasNext()) {
                        }
                        c7415j = new C7415j(geoProviderConfig13, geoProviderConfig12, geoProviderConfig14);
                        str9 = str18;
                        str10 = str17;
                        kotlin.time.f.f71986a.getClass();
                        C10312c c10312c2222 = new C10312c(c7415j, kotlin.time.f.a(j11), null);
                        g.f66321a.getClass();
                        if (g.c() == null) {
                        }
                        cVar2 = cVar3;
                        if (cVar2 != null) {
                        }
                        return c10312c2222.b();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dVar2 = new d(this, dVar);
        d dVar32 = dVar2;
        Object obj2 = dVar32.f66310l;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar32.f66312n;
        Je0.c cVar32 = null;
        C7064a c7064a2 = f66281a;
        switch (i11) {
        }
    }
}
