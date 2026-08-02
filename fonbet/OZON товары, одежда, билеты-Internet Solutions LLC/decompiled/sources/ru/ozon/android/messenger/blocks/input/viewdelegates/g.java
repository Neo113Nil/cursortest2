package ru.ozon.android.messenger.blocks.input.viewdelegates;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f85578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(j jVar) {
        super(0);
        this.f85578b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool;
        boolean z11;
        bool = ru.ozon.android.messenger.framework.presentation.common.popupmenu.n.f91009b;
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            this.f85578b.f85582a.x0();
            z11 = false;
        } else {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
