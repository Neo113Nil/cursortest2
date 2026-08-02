package hb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10478c;

    public /* synthetic */ e(String str, List list, int i5) {
        this.f10476a = i5;
        this.f10477b = str;
        this.f10478c = list;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int q;
        switch (this.f10476a) {
            case 0:
                List list = this.f10478c;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                s2.c r02 = _connection.r0(this.f10477b);
                try {
                    Iterator it = list.iterator();
                    int i5 = 1;
                    while (it.hasNext()) {
                        r02.f(i5, ((Number) it.next()).intValue());
                        i5++;
                    }
                    r02.n0();
                    q = io.sentry.config.a.q(_connection);
                    r02.close();
                    break;
                } catch (Throwable th2) {
                    r02.close();
                    throw th2;
                }
            case 1:
                List list2 = this.f10478c;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                s2.c r03 = _connection2.r0(this.f10477b);
                try {
                    Iterator it2 = list2.iterator();
                    int i10 = 1;
                    while (it2.hasNext()) {
                        r03.f(i10, ((Number) it2.next()).intValue());
                        i10++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (r03.n0()) {
                        arrayList.add(r03.isNull(0) ? null : r03.V(0));
                    }
                    r03.close();
                    return arrayList;
                } catch (Throwable th3) {
                    r03.close();
                    throw th3;
                }
            default:
                List list3 = this.f10478c;
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                s2.c r04 = _connection3.r0(this.f10477b);
                try {
                    Iterator it3 = list3.iterator();
                    int i11 = 1;
                    while (it3.hasNext()) {
                        r04.f(i11, ((Number) it3.next()).intValue());
                        i11++;
                    }
                    r04.n0();
                    q = io.sentry.config.a.q(_connection3);
                    r04.close();
                    break;
                } catch (Throwable th4) {
                    r04.close();
                    throw th4;
                }
        }
        return Integer.valueOf(q);
    }
}
