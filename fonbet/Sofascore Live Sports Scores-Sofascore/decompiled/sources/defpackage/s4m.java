package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s4m {
    public static final /* synthetic */ int b = 0;
    public final Context a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public s4m(@NotNull Context context) {
        context.getClass();
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #2 {Exception -> 0x0045, blocks: (B:3:0x0008, B:7:0x0036, B:9:0x003c, B:13:0x0047, B:22:0x007c, B:29:0x0032, B:26:0x0011), top: B:2:0x0008, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:3:0x0008, B:7:0x0036, B:9:0x003c, B:13:0x0047, B:22:0x007c, B:29:0x0032, B:26:0x0011), top: B:2:0x0008, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(s4m s4mVar, v7m v7mVar, Uri uri, pe2 pe2Var) {
        int i;
        jd4 b2;
        int i2;
        s4mVar.getClass();
        try {
            ozf ozfVar = v7mVar.a;
            jlf jlfVar = ozfVar.e;
            int i3 = 1;
            if (jlfVar != null) {
                try {
                    hqm.downloadSegment$default(hqm.a, hqm.a(uri, tba.K(v7mVar.b, jlfVar.c)), pe2Var, null, null, null, 28, null);
                    String str = v7mVar.a.a.a;
                    i = 1;
                } catch (Exception unused) {
                    jlfVar.toString();
                }
                b2 = ozfVar.b();
                if (b2 != null) {
                    i2 = b(v7mVar, uri, ozfVar.e, pe2Var);
                } else {
                    try {
                        jlf i4 = b2.i(b2.p());
                        i4.getClass();
                        hqm.downloadSegment$default(hqm.a, hqm.a(uri, tba.K(v7mVar.b, i4.c)), pe2Var, null, null, null, 28, null);
                    } catch (Exception e) {
                        e = e;
                        i3 = 0;
                    }
                    try {
                        String str2 = v7mVar.a.a.a;
                    } catch (Exception e2) {
                        e = e2;
                        e.getMessage();
                        i2 = i3;
                        return i + i2;
                    }
                    i2 = i3;
                }
                return i + i2;
            }
            i = 0;
            b2 = ozfVar.b();
            if (b2 != null) {
            }
            return i + i2;
        } catch (Exception e3) {
            e3.getMessage();
            return 0;
        }
    }

    public static int b(v7m v7mVar, Uri uri, jlf jlfVar, pe2 pe2Var) {
        ozf ozfVar = v7mVar.a;
        String str = v7mVar.b;
        b bVar = ozfVar.a;
        String str2 = bVar.a;
        try {
            int i = bVar.j;
            if (i <= 0) {
                return 0;
            }
            hqm hqmVar = hqm.a;
            long j = (long) ((i * 3.0f) / 8.0f);
            long j2 = 0;
            if (jlfVar != null) {
                long j3 = jlfVar.b;
                Long valueOf = Long.valueOf(j3);
                if (j3 <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    j2 = valueOf.longValue();
                }
            }
            if (str.length() > 0) {
                uri = hqm.a(uri, str);
            }
            hqm.downloadSegment$default(hqmVar, uri, pe2Var, Long.valueOf(j2), Long.valueOf(j), null, 16, null);
            return 1;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public static final zc4 c(s4m s4mVar, String str, pe2 pe2Var, String str2) {
        s4mVar.getClass();
        try {
            Uri parse = Uri.parse(str);
            qe2 createDataSource = pe2Var.createDataSource();
            Map map = Collections.EMPTY_MAP;
            z1a.y(parse, "The uri must be set.");
            ue4 ue4Var = new ue4(createDataSource, new xe4(parse, 0L, 1, null, map, 0L, -1L, str2, 0));
            try {
                zc4 e = new bd4().e(parse, ue4Var);
                ue4Var.close();
                return e;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static List d(zc4 zc4Var) {
        ArrayList arrayList = new ArrayList();
        List<ch> list = zc4Var.a(0).c;
        list.getClass();
        for (ch chVar : list) {
            if (chVar.b == 2) {
                List<ozf> list2 = chVar.c;
                list2.getClass();
                for (ozf ozfVar : list2) {
                    ozfVar.getClass();
                    arrayList.add(new v7m(ozfVar));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return km5.a;
        }
        List L0 = CollectionsKt.L0(CollectionsKt.H0(arrayList, new mam()), Integer.MAX_VALUE);
        CollectionsKt.f0(L0, ", ", null, null, new pcl(28), 30);
        L0.size();
        return L0;
    }
}
