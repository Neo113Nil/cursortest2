package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9449w extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2 f89690b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f89691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9449w(Function2 function2, List list) {
        super(1);
        this.f89690b = function2;
        this.f89691c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.f89690b.invoke(Integer.valueOf(intValue), this.f89691c.get(intValue));
    }
}
