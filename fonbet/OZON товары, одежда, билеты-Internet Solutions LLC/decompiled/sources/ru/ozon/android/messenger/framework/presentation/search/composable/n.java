package ru.ozon.android.messenger.framework.presentation.search.composable;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class n extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f91678b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f91679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, List list) {
        super(1);
        this.f91678b = mVar;
        this.f91679c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        this.f91679c.get(num.intValue());
        this.f91678b.getClass();
        return null;
    }
}
