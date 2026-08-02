package ru.ozon.android.messenger.blocks.messagetext.domain;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f85856a;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85856a = new d(context);
    }

    @NotNull
    public final SpannableStringBuilder a(@NotNull MessageTextDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f85856a.a(c.a(dto.getText()));
    }
}
