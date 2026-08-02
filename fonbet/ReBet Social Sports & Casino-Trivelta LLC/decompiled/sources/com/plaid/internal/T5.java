package com.plaid.internal;

import androidx.core.view.AbstractC2082d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5322g;

@SourceDebugExtension({"SMAP\nPlaidWebview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$notifyWebViewShown$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,206:1\n96#2,13:207\n*S KotlinDebug\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$notifyWebViewShown$3\n*L\n110#1:207,13\n*E\n"})
/* loaded from: classes3.dex */
public final class T5<T> implements InterfaceC5322g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P5 f39642a;

    public T5(P5 p52) {
        this.f39642a = p52;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5322g
    public final Object emit(Object obj, Continuation continuation) {
        ((Boolean) obj).getClass();
        P5 p52 = this.f39642a;
        if (AbstractC2082d0.Q(p52)) {
            p52.post(new R5(p52));
        } else {
            p52.addOnAttachStateChangeListener(new S5(p52, p52));
        }
        return Unit.INSTANCE;
    }
}
