package ru.ozon.android.messenger.blocks.travelOrders;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class j extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f86526b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f86527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, List list) {
        super(1);
        this.f86526b = iVar;
        this.f86527c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        this.f86527c.get(num.intValue());
        this.f86526b.getClass();
        return null;
    }
}
