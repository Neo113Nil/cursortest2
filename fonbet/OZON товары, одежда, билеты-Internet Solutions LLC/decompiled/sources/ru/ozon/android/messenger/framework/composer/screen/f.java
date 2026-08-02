package ru.ozon.android.messenger.framework.composer.screen;

import i10.C6997c;
import i10.h;
import i10.j;
import i10.l;
import kotlin.collections.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function0<C6997c<l>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f86807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar) {
        super(0);
        this.f86807b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C6997c<l> invoke() {
        h.c i11 = this.f86807b.i();
        M m11 = M.f71699a;
        i10.l loader = new i10.l(false, false, new l.a.C1079a(0L, null, 3));
        Intrinsics.checkNotNullParameter(loader, "loader");
        return C6997c.a.a(i11, new j(null, loader, false, false, null), true, m11);
    }
}
