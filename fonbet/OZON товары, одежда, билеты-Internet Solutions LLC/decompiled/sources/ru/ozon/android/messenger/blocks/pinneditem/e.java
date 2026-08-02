package ru.ozon.android.messenger.blocks.pinneditem;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<String, PinnedItemDTO> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsonParser f86040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(JsonParser jsonParser) {
        super(1);
        this.f86040b = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PinnedItemDTO invoke(String str) {
        String state = str;
        Intrinsics.checkNotNullParameter(state, "state");
        return (PinnedItemDTO) this.f86040b.fromJson(state, PinnedItemDTO.class);
    }
}
