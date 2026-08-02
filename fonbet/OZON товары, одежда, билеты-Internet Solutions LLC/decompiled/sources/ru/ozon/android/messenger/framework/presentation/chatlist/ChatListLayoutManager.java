package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/chatlist/ChatListLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatListLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    private boolean f90416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListLayoutManager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f90416a = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return this.f90416a && super.canScrollVertically();
    }
}
