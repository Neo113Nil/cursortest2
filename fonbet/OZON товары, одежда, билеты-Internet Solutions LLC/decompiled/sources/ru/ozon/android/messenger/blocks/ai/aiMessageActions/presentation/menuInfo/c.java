package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class c extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f84044b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f84045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, List list) {
        super(1);
        this.f84044b = bVar;
        this.f84045c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        this.f84045c.get(num.intValue());
        this.f84044b.getClass();
        return null;
    }
}
