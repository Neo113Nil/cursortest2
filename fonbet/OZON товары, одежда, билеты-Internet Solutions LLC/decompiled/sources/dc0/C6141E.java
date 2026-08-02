package dc0;

import Cb0.g;
import Sc.InterfaceC4008j;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.LocalCookieDataSource$detektChangeLocaleCookie$1", f = "LocalCookieDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: dc0.E, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6141E extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f61471d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6144H f61472e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ URI f61473f;

    /* renamed from: dc0.E$a */
    public static final class a extends g.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f61474a;

        /* renamed from: b, reason: collision with root package name */
        private final String f61475b;

        a(String str, String str2) {
            this.f61474a = str;
            this.f61475b = str2;
        }

        @Override // Cb0.g.b
        public final String a() {
            return this.f61475b;
        }

        @Override // Cb0.g.b
        public final String b() {
            return this.f61474a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6141E(ArrayList arrayList, C6144H c6144h, URI uri, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f61471d = arrayList;
        this.f61472e = c6144h;
        this.f61473f = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6141E(this.f61471d, this.f61472e, this.f61473f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6141E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        String g10 = C6171q.g(this.f61471d);
        if (g10 != null && g10.length() != 0) {
            Map<String, ? extends List<String>> c11 = U.c();
            URI uri = this.f61473f;
            C6144H c6144h = this.f61472e;
            String f7 = C6171q.f("x-o3-language", C6171q.m(c6144h.g(uri, c11)));
            if (!Intrinsics.d(f7, g10)) {
                interfaceC4008j = c6144h.f61489j;
                ((Cb0.i) interfaceC4008j.getValue()).b(new a(f7, g10));
            }
        }
        return Unit.f71690a;
    }
}
