package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Window f89921b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f89922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(Window window, k kVar) {
        super(0);
        this.f89921b = window;
        this.f89922c = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i11;
        int i12;
        k kVar = this.f89922c;
        i11 = kVar.f89907v;
        Window window = this.f89921b;
        window.setStatusBarColor(i11);
        i12 = kVar.f89907v;
        window.setNavigationBarColor(i12);
        return Unit.f71690a;
    }
}
