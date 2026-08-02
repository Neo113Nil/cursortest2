package ru.ozon.app.android.common;

import Cw.c;
import L00.j;
import androidx.lifecycle.J;
import io.reactivex.m;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"ru/ozon/app/android/common/SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1", "Lio/reactivex/m;", "LL00/j;", "response", "", "onSuccess", "(LL00/j;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "Lnc/b;", "d", "onSubscribe", "(Lnc/b;)V", "onComplete", "()V", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1 implements m<j> {
    final /* synthetic */ String $deeplink;
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ Function1<String, Unit> $navigateAction;
    final /* synthetic */ SearchUrlPrefetchServiceImpl this$0;

    /* JADX WARN: Multi-variable type inference failed */
    SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1(SearchUrlPrefetchServiceImpl searchUrlPrefetchServiceImpl, Function1<? super String, Unit> function1, String str, J j11) {
        this.this$0 = searchUrlPrefetchServiceImpl;
        this.$navigateAction = function1;
        this.$deeplink = str;
        this.$lifecycleOwner = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onError$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @Override // io.reactivex.m
    public void onComplete() {
    }

    @Override // io.reactivex.m
    public void onError(Throwable throwable) {
        UrlPrefetchedEventHolder urlPrefetchedEventHolder;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.this$0.addLifecycleObserver(this.$lifecycleOwner);
        urlPrefetchedEventHolder = this.this$0.urlPrefetchedEventHolder;
        p<String> filter = urlPrefetchedEventHolder.observePrefetchedUrls().filter(new c(new SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1$onError$1(this.$deeplink), 18));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        RxExtKt.observe$default(filter, this.$lifecycleOwner, new SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1$onError$2(this.this$0, this.$navigateAction, this.$deeplink), new SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1$onError$3(Lm0.a.f17149a), null, 8, null);
    }

    @Override // io.reactivex.m, io.reactivex.A
    public void onSubscribe(InterfaceC8487b d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
    }

    @Override // io.reactivex.m, io.reactivex.A
    public void onSuccess(j response) {
        InterfaceC8487b interfaceC8487b;
        Intrinsics.checkNotNullParameter(response, "response");
        interfaceC8487b = this.this$0.urlPrefetchDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.$navigateAction.invoke(this.$deeplink);
    }
}
