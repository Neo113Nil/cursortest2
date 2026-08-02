package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class D extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f89233b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f89234c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(ru.ozon.android.messenger.framework.logger.b bVar, int i11, ru.ozon.android.messenger.framework.core.d dVar) {
        super(0);
        this.f89233b = bVar;
        this.f89234c = i11;
        this.f89235d = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.logger.b bVar = this.f89233b;
        if (bVar != null) {
            bVar.log("Cannot find suitable compose block mapper for viewType: " + this.f89234c + ", blockStore: " + this.f89235d.a());
        }
        return Unit.f71690a;
    }
}
