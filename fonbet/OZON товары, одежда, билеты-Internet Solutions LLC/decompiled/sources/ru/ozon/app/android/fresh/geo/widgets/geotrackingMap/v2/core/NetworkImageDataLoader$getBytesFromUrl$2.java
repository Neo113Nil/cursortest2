package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core;

import Sc.r;
import Sc.s;
import Wc.a;
import We.E;
import We.G;
import We.L;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core.NetworkImageDataLoader;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "LSc/r;", "", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core.NetworkImageDataLoader$getBytesFromUrl$2", f = "NetworkImageDataLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NetworkImageDataLoader$getBytesFromUrl$2 extends j implements Function2<M, d<? super r<? extends byte[]>>, Object> {
    final /* synthetic */ NetworkImageDataLoader.FileFormat $fileFormat;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ NetworkImageDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkImageDataLoader$getBytesFromUrl$2(String str, NetworkImageDataLoader.FileFormat fileFormat, NetworkImageDataLoader networkImageDataLoader, d<? super NetworkImageDataLoader$getBytesFromUrl$2> dVar) {
        super(2, dVar);
        this.$url = str;
        this.$fileFormat = fileFormat;
        this.this$0 = networkImageDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NetworkImageDataLoader$getBytesFromUrl$2(this.$url, this.$fileFormat, this.this$0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends byte[]>> dVar) {
        return invoke2(m11, (d<? super r<byte[]>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        E e11;
        L execute;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        try {
            URL url = new URL(this.$url);
            String path = url.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            if (!h.A(path, this.$fileFormat.getExtension(), true)) {
                r.Companion companion = r.INSTANCE;
                return r.a(s.a(new Throwable(Nk.a.b("URL must end with ", this.$fileFormat.getExtension()))));
            }
            G.a aVar2 = new G.a();
            aVar2.l(url);
            aVar2.f(null, "GET");
            G b11 = aVar2.b();
            try {
                e11 = this.this$0.okHttpClient;
                execute = e11.a(b11).execute();
                str = this.$url;
                try {
                } finally {
                }
            } catch (Exception e12) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(new Throwable(Nk.a.b("Network request failed for URL: ", this.$url), e12));
            }
            if (!execute.v()) {
                r.Companion companion3 = r.INSTANCE;
                r a12 = r.a(s.a(new Throwable("Failed to load data. Code: " + execute.m() + ", URL: " + str)));
                execute.close();
                return a12;
            }
            We.M c11 = execute.c();
            if (c11 == null || (a11 = c11.bytes()) == null) {
                r.Companion companion4 = r.INSTANCE;
                a11 = s.a(new Throwable("Empty response body. URL: " + str));
            } else {
                r.Companion companion5 = r.INSTANCE;
            }
            execute.close();
            return r.a(a11);
        } catch (MalformedURLException e13) {
            r.Companion companion6 = r.INSTANCE;
            return r.a(s.a(new Throwable(Nk.a.b("Invalid URL: ", this.$url), e13)));
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<byte[]>> dVar) {
        return ((NetworkImageDataLoader$getBytesFromUrl$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
