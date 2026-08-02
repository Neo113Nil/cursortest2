package Qg;

import ah.C2011c;
import ah.C2020l;
import ah.C2023o;
import ah.InterfaceC2019k;
import bh.AbstractC2423b;
import ch.u;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9744a = "Ktor client";

    /* renamed from: b, reason: collision with root package name */
    public static final Set f9745b;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2019k f9746d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AbstractC2423b f9747e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2019k interfaceC2019k, AbstractC2423b abstractC2423b) {
            super(1);
            this.f9746d = interfaceC2019k;
            this.f9747e = abstractC2423b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2020l) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(C2020l buildHeaders) {
            Intrinsics.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
            buildHeaders.d(this.f9746d);
            buildHeaders.d(this.f9747e.c());
        }
    }

    public static final class b extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function2 f9748d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function2 function2) {
            super(2);
            this.f9748d = function2;
        }

        public final void a(String key, List values) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(values, "values");
            C2023o c2023o = C2023o.f16113a;
            if (Intrinsics.areEqual(c2023o.g(), key) || Intrinsics.areEqual(c2023o.h(), key)) {
                return;
            }
            if (!m.f9745b.contains(key)) {
                this.f9748d.invoke(key, CollectionsKt.joinToString$default(values, ",", null, null, 0, null, null, 62, null));
                return;
            }
            Function2 function2 = this.f9748d;
            Iterator it = values.iterator();
            while (it.hasNext()) {
                function2.invoke(key, (String) it.next());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (List) obj2);
            return Unit.INSTANCE;
        }
    }

    static {
        C2023o c2023o = C2023o.f16113a;
        f9745b = SetsKt.setOf((Object[]) new String[]{c2023o.i(), c2023o.j(), c2023o.m(), c2023o.k(), c2023o.l()});
    }

    public static final Object b(Continuation continuation) {
        CoroutineContext.Element element = continuation.get$context().get(j.f9740b);
        Intrinsics.checkNotNull(element);
        return ((j) element).a();
    }

    public static final void c(InterfaceC2019k requestHeaders, AbstractC2423b content, Function2 block) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(block, "block");
        Yg.f.a(new a(requestHeaders, content)).d(new b(block));
        C2023o c2023o = C2023o.f16113a;
        if (requestHeaders.get(c2023o.p()) == null && content.c().get(c2023o.p()) == null && d()) {
            block.invoke(c2023o.p(), f9744a);
        }
        C2011c b10 = content.b();
        if ((b10 == null || (str = b10.toString()) == null) && (str = content.c().get(c2023o.h())) == null) {
            str = requestHeaders.get(c2023o.h());
        }
        Long a10 = content.a();
        if ((a10 == null || (str2 = a10.toString()) == null) && (str2 = content.c().get(c2023o.g())) == null) {
            str2 = requestHeaders.get(c2023o.g());
        }
        if (str != null) {
            block.invoke(c2023o.h(), str);
        }
        if (str2 != null) {
            block.invoke(c2023o.g(), str2);
        }
    }

    public static final boolean d() {
        return !u.f27846a.a();
    }
}
