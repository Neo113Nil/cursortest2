package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9513d f91219b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f91220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C9513d c9513d, int i11) {
        super(0);
        this.f91219b = c9513d;
        this.f91220c = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.logger.b bVar;
        ru.ozon.android.messenger.framework.core.d dVar;
        C9513d c9513d = this.f91219b;
        bVar = c9513d.f91216b;
        if (bVar != null) {
            Pair pair = new Pair("viewType", String.valueOf(this.f91220c));
            dVar = c9513d.f91215a;
            bVar.log(new IllegalStateException(U.j(pair, new Pair("blockStore", dVar.a().toString())).toString()));
        }
        return Unit.f71690a;
    }
}
