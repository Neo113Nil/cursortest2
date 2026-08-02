package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.view.Window;
import androidx.constraintlayout.motion.widget.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class r extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Window f90545b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f90546c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m.b f90547d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f90548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(Window window, k kVar, m.b bVar, boolean z11) {
        super(0);
        this.f90545b = window;
        this.f90546c = kVar;
        this.f90547d = bVar;
        this.f90548e = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i11;
        int i12;
        k kVar = this.f90546c;
        i11 = kVar.f90502k;
        Window window = this.f90545b;
        window.setStatusBarColor(i11);
        i12 = kVar.f90502k;
        window.setNavigationBarColor(i12);
        this.f90547d.D(this.f90548e);
        kVar.f90506o = false;
        return Unit.f71690a;
    }
}
