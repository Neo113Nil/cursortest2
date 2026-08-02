package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.data.remote.mapper.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d<X4.a> f84697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(d<X4.a> dVar) {
        super(0);
        this.f84697b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ru.ozon.android.messenger.framework.data.remote.mapper.a invoke() {
        Pc.a aVar;
        aVar = ((d) this.f84697b).f84701c;
        return (ru.ozon.android.messenger.framework.data.remote.mapper.a) ((Jb.c) aVar).get();
    }
}
