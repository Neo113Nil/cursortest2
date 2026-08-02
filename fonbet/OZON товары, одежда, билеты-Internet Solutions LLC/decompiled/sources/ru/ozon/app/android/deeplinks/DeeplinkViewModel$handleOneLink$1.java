package ru.ozon.app.android.deeplinks;

import Sc.r;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.deeplinks.DeeplinkViewModel$handleOneLink$1", f = "DeeplinkViewModel.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DeeplinkViewModel$handleOneLink$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Uri $referrer;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeeplinkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeeplinkViewModel$handleOneLink$1(DeeplinkViewModel deeplinkViewModel, Uri uri, Uri uri2, d<? super DeeplinkViewModel$handleOneLink$1> dVar) {
        super(2, dVar);
        this.this$0 = deeplinkViewModel;
        this.$uri = uri;
        this.$referrer = uri2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeeplinkViewModel$handleOneLink$1 deeplinkViewModel$handleOneLink$1 = new DeeplinkViewModel$handleOneLink$1(this.this$0, this.$uri, this.$referrer, dVar);
        deeplinkViewModel$handleOneLink$1.L$0 = obj;
        return deeplinkViewModel$handleOneLink$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ExternalDeeplink processLink;
        V v11;
        ExternalDeeplink processLink2;
        V v12;
        AppsFlyerResolver appsFlyerResolver;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                DeeplinkViewModel deeplinkViewModel = this.this$0;
                Uri uri = this.$uri;
                r.Companion companion = r.INSTANCE;
                appsFlyerResolver = deeplinkViewModel.appsFlyerResolver;
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
            a11 = (AppsFlyerDeeplinkResult) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        DeeplinkViewModel deeplinkViewModel2 = this.this$0;
        Uri uri2 = this.$referrer;
        if (!(a11 instanceof r.b)) {
            AppsFlyerDeeplinkResult appsFlyerDeeplinkResult = (AppsFlyerDeeplinkResult) a11;
            processLink2 = deeplinkViewModel2.processLink(appsFlyerDeeplinkResult instanceof AppsFlyerDeeplinkResult.Success ? ((AppsFlyerDeeplinkResult.Success) appsFlyerDeeplinkResult).getLink() : null, uri2);
            v12 = deeplinkViewModel2._oneLinkEvent;
            v12.postValue(processLink2);
        }
        DeeplinkViewModel deeplinkViewModel3 = this.this$0;
        Uri uri3 = this.$referrer;
        if (r.b(a11) != null) {
            processLink = deeplinkViewModel3.processLink(null, uri3);
            v11 = deeplinkViewModel3._oneLinkEvent;
            v11.postValue(processLink);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeeplinkViewModel$handleOneLink$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
