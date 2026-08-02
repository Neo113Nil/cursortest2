package ru.ozon.app.android.common;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1$onError$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ String $deeplink;
    final /* synthetic */ Function1<String, Unit> $navigateAction;
    final /* synthetic */ SearchUrlPrefetchServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1$onError$2(SearchUrlPrefetchServiceImpl searchUrlPrefetchServiceImpl, Function1<? super String, Unit> function1, String str) {
        super(1);
        this.this$0 = searchUrlPrefetchServiceImpl;
        this.$navigateAction = function1;
        this.$deeplink = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        Handler handler;
        handler = this.this$0.handler;
        final Function1<String, Unit> function1 = this.$navigateAction;
        final String str2 = this.$deeplink;
        handler.post(new Runnable() { // from class: ru.ozon.app.android.common.a
            @Override // java.lang.Runnable
            public final void run() {
                Function1.this.invoke(str2);
            }
        });
    }
}
