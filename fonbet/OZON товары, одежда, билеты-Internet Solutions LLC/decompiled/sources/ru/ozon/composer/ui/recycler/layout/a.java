package ru.ozon.composer.ui.recycler.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.composer.ui.recycler.layout.ComposerGridLayoutManager;
import ru.ozon.composer.ui.recycler.layout.ComposerGridLayoutManager.a;

/* loaded from: classes7.dex */
final class a extends AbstractC7737t implements Function0<ComposerGridLayoutManager.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComposerGridLayoutManager f94846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(ComposerGridLayoutManager composerGridLayoutManager) {
        super(0);
        this.f94846b = composerGridLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComposerGridLayoutManager.a invoke() {
        return this.f94846b.new a();
    }
}
