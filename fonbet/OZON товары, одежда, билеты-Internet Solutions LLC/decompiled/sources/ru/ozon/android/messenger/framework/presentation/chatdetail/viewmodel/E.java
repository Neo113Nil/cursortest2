package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.alert.a;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.C10727i;

/* loaded from: classes10.dex */
final class E extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9467e f89979b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AtomActionDTO f89980c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a.C1470a f89981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(C9467e c9467e, AtomActionDTO atomActionDTO, a.C1470a c1470a) {
        super(0);
        this.f89979b = c9467e;
        this.f89980c = atomActionDTO;
        this.f89981d = c1470a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9467e c9467e = this.f89979b;
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new D(c9467e, this.f89980c, this.f89981d, null), 3);
        return Unit.f71690a;
    }
}
