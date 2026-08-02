package ru.ozon.app.android.composer.network.redirect;

import Sc.r;
import Sc.s;
import Wc.a;
import android.net.Uri;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "LSc/r;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.network.redirect.AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1", f = "AppsFlyerRedirectNetworkInterceptor.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1 extends j implements Function2<M, d<? super r<? extends String>>, Object> {
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppsFlyerRedirectNetworkInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1(AppsFlyerRedirectNetworkInterceptor appsFlyerRedirectNetworkInterceptor, Uri uri, d<? super AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1> dVar) {
        super(2, dVar);
        this.this$0 = appsFlyerRedirectNetworkInterceptor;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1 appsFlyerRedirectNetworkInterceptor$replaceOneLink$1 = new AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1(this.this$0, this.$uri, dVar);
        appsFlyerRedirectNetworkInterceptor$replaceOneLink$1.L$0 = obj;
        return appsFlyerRedirectNetworkInterceptor$replaceOneLink$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends String>> dVar) {
        return invoke2(m11, (d<? super r<String>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        AppsFlyerResolver appsFlyerResolver;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                AppsFlyerRedirectNetworkInterceptor appsFlyerRedirectNetworkInterceptor = this.this$0;
                Uri uri = this.$uri;
                r.Companion companion = r.INSTANCE;
                appsFlyerResolver = appsFlyerRedirectNetworkInterceptor.appsFlyerResolver;
                Intrinsics.f(uri);
                this.label = 1;
                obj = appsFlyerResolver.resolveLink(uri, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            Uri link = ((AppsFlyerDeeplinkResult) obj).getLink();
            Intrinsics.f(link);
            a11 = link.toString();
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return r.a(a11);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<String>> dVar) {
        return ((AppsFlyerRedirectNetworkInterceptor$replaceOneLink$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
