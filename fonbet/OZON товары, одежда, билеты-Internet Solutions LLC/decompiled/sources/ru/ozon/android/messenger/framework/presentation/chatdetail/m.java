package ru.ozon.android.messenger.framework.presentation.chatdetail;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f89919b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Window f89920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(Window window, k kVar) {
        super(0);
        this.f89919b = kVar;
        this.f89920c = window;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i11;
        int i12;
        Window window = this.f89920c;
        int statusBarColor = window.getStatusBarColor();
        k kVar = this.f89919b;
        kVar.f89907v = statusBarColor;
        i11 = kVar.f89906u;
        window.setStatusBarColor(i11);
        i12 = kVar.f89906u;
        window.setNavigationBarColor(i12);
        return Unit.f71690a;
    }
}
