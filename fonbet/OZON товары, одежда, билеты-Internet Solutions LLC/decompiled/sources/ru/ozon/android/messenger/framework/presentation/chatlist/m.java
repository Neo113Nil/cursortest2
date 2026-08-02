package ru.ozon.android.messenger.framework.presentation.chatlist;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.messenger.R$color;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f90508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(k kVar) {
        super(0);
        this.f90508b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        ru.ozon.android.messenger.framework.core.d dVar;
        dVar = this.f90508b.f90496e;
        return Integer.valueOf(androidx.core.content.a.getColor(ru.ozon.android.messenger.framework.core.f.a(dVar), R$color.layer_overlay_dimming));
    }
}
