package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class q extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f90543b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Window f90544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(k kVar, Window window) {
        super(0);
        this.f90543b = kVar;
        this.f90544c = window;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Window window = this.f90544c;
        int statusBarColor = window.getStatusBarColor();
        k kVar = this.f90543b;
        kVar.f90502k = statusBarColor;
        window.setStatusBarColor(k.d(kVar));
        window.setNavigationBarColor(k.d(kVar));
        return Unit.f71690a;
    }
}
