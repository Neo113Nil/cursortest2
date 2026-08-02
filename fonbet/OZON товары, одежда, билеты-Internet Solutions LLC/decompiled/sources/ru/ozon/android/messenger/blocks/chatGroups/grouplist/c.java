package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<String, h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d<X4.a> f84699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d<X4.a> dVar) {
        super(1);
        this.f84699b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final h invoke(String str) {
        JsonParser jsonParser;
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        jsonParser = ((d) this.f84699b).f84700b;
        return (h) jsonParser.fromJson(it, h.class);
    }
}
