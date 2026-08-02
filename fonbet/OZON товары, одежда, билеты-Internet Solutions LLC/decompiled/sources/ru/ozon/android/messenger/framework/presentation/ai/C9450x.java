package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9450x extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f89695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9450x(List list) {
        super(1);
        this.f89695b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        this.f89695b.get(num.intValue());
        return null;
    }
}
