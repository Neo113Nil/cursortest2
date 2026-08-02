package com.plaid.internal;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n+ 2 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$notifyWebViewShown$3\n*L\n1#1,432:1\n110#2:433\n*E\n"})
/* loaded from: classes3.dex */
public final class S5 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f39624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P5 f39625b;

    public S5(View view, P5 p52) {
        this.f39624a = view;
        this.f39625b = p52;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f39624a.removeOnAttachStateChangeListener(this);
        P5 p52 = this.f39625b;
        p52.post(new R5(p52));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
