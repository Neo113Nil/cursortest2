package ru.ozon.app.android.miniapp.webview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class MiniAppWebView$createWebViewClient$2 extends C7735q implements Function1<String, Unit> {
    MiniAppWebView$createWebViewClient$2(Object obj) {
        super(1, obj, MiniAppWebView.class, "onPageStart", "onPageStart(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((MiniAppWebView) this.receiver).onPageStart(str);
    }
}
