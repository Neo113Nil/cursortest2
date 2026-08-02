package ru.ozon.android.messenger.blocks.input.viewmodel;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.input.attachments.manager.a;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<o, o> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> f85653b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.C1497a f85654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    j(List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list, a.C1497a c1497a) {
        super(1);
        this.f85653b = list;
        this.f85654c = c1497a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o invoke(o oVar) {
        o oVar2 = oVar;
        if (oVar2 == null) {
            return null;
        }
        return o.a(oVar2, false, null, this.f85653b, this.f85654c.b(), false, null, null, 4047);
    }
}
