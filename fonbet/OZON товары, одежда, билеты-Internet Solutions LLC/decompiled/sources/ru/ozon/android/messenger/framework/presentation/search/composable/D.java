package ru.ozon.android.messenger.framework.presentation.search.composable;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class D extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.e f91645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(ru.ozon.android.messenger.framework.presentation.models.e eVar) {
        super(0);
        this.f91645b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        throw new IllegalStateException(("No mapper for " + this.f91645b.d()).toString());
    }
}
