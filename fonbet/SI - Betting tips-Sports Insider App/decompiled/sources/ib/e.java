package ib;

import f3.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f11053a;

    public e(c newsDao) {
        Intrinsics.checkNotNullParameter(newsDao, "newsDao");
        this.f11053a = newsDao;
    }

    public final long a(ia.a newsData) {
        Intrinsics.checkNotNullParameter(newsData, "newsData");
        int i5 = newsData.f11034a;
        final String str = newsData.f11036c;
        c cVar = this.f11053a;
        Integer num = (Integer) x.n0(cVar.f11052a, true, false, new eb.b(i5, 6));
        if ((num != null ? num.intValue() : 0) <= 0) {
            return ((Number) x.n0(cVar.f11052a, false, true, new a(newsData.f11034a, newsData.f11035b, str == null ? "" : str, newsData.f11037d, newsData.f11038e))).longValue();
        }
        if (newsData.f11038e != null) {
            return ((Number) x.n0(cVar.f11052a, false, true, new a(newsData.f11035b, str == null ? "" : str, newsData.f11037d, r10, newsData.f11034a))).intValue();
        }
        final int i10 = newsData.f11034a;
        final int i11 = newsData.f11035b;
        if (str == null) {
            str = "";
        }
        final String str2 = newsData.f11037d;
        return ((Number) x.n0(cVar.f11052a, false, true, new Function1() { // from class: ib.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i12 = i11;
                String str3 = str;
                int i13 = i10;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                s2.c r02 = _connection.r0("\n            UPDATE news_table \n            SET dateTime = ?, title = ?, picture = ?\n            WHERE id == ?");
                try {
                    r02.f(1, i12);
                    r02.B(2, str3);
                    String str4 = str2;
                    if (str4 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str4);
                    }
                    r02.f(4, i13);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } catch (Throwable th2) {
                    r02.close();
                    throw th2;
                }
            }
        })).intValue();
    }
}
