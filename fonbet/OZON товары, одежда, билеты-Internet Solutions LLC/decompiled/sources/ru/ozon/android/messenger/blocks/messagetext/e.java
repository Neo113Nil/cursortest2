package ru.ozon.android.messenger.blocks.messagetext;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e implements Function2<MessageTextDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends f>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.messagetext.domain.a f85865a;

    public e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85865a = new ru.ozon.android.messenger.blocks.messagetext.domain.a(context);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends f> invoke(MessageTextDTO messageTextDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        MessageTextDTO dto = messageTextDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        SpannableStringBuilder a11 = this.f85865a.a(dto);
        return a11.length() == 0 ? K.f71697a : C7714v.a0(new f(blockId, a11, null, null));
    }
}
