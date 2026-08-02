package lb;

import eg.z;
import f3.x;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.h;
import mf.i;
import sb.j;
import tb.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fb.b f19662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f19663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f19665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fb.b bVar, Integer num, long j, long j6, String str, Continuation continuation) {
        super(2, continuation);
        this.f19662b = bVar;
        this.f19663c = num;
        this.f19664d = j;
        this.f19665e = j6;
        this.f19666f = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f19662b, this.f19663c, this.f19664d, this.f19665e, this.f19666f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        j e0 = x.e0();
        e0.getClass();
        final String lang = this.f19666f;
        Intrinsics.checkNotNullParameter(lang, "lang");
        final int i5 = (int) (this.f19664d / 1000);
        final int i10 = (int) (this.f19665e / 1000);
        f fVar = e0.f23426a;
        Integer num = this.f19663c;
        int intValue = num != null ? num.intValue() : 0;
        fVar.getClass();
        w wVar = fVar.f23832a;
        Intrinsics.checkNotNullParameter(lang, "lang");
        if (((Number) x.n0(wVar, true, false, new h(intValue, lang, 5))).intValue() > 0) {
            final int intValue2 = num != null ? num.intValue() : 0;
            Intrinsics.checkNotNullParameter(lang, "lang");
            ((Number) x.n0(wVar, false, true, new Function1() { // from class: tb.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i11 = i5;
                    int i12 = i10;
                    int i13 = intValue2;
                    String str = lang;
                    s2.a _connection = (s2.a) obj2;
                    Intrinsics.checkNotNullParameter(_connection, "_connection");
                    s2.c r02 = _connection.r0("UPDATE request_update_table SET timeRequestStart = ?, timeRequestEnd = ? WHERE categoryId ==? AND lang == ?");
                    try {
                        r02.f(1, i11);
                        r02.f(2, i12);
                        r02.f(3, i13);
                        r02.B(4, str);
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
        } else {
            final int intValue3 = num != null ? num.intValue() : 0;
            Intrinsics.checkNotNullParameter(lang, "lang");
            ((Number) x.n0(wVar, false, true, new Function1() { // from class: tb.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i11 = intValue3;
                    int i12 = i5;
                    int i13 = i10;
                    int i14 = i5;
                    String str = lang;
                    s2.a _connection = (s2.a) obj2;
                    Intrinsics.checkNotNullParameter(_connection, "_connection");
                    s2.c r02 = _connection.r0("INSERT INTO request_update_table (categoryId, timeRequestStart, timeRequestEnd, timeRequestEndDownload, lang) VALUES (?, ?, ?, ?, ?)");
                    try {
                        r02.f(1, i11);
                        r02.f(2, i12);
                        r02.f(3, i13);
                        r02.f(4, i14);
                        r02.B(5, str);
                        r02.n0();
                        long p10 = io.sentry.config.a.p(_connection);
                        r02.close();
                        return Long.valueOf(p10);
                    } catch (Throwable th2) {
                        r02.close();
                        throw th2;
                    }
                }
            })).longValue();
        }
        return Unit.f19194a;
    }
}
