package ru.ozon.android.messenger.blocks.pinneditem;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.data.remote.mapper.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f86036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar) {
        super(0);
        this.f86036b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ru.ozon.android.messenger.framework.data.remote.mapper.a invoke() {
        Pc.a aVar;
        aVar = this.f86036b.f86041b;
        return (ru.ozon.android.messenger.framework.data.remote.mapper.a) ((Jb.c) aVar).get();
    }
}
