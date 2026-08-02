package ru.ozon.android.messenger.blocks.buttons.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.messenger.databinding.MItemChatFixedButtonBinding;
import ru.ozon.app.android.messenger.databinding.MItemChatFlexButtonBinding;

/* loaded from: classes10.dex */
public final class c extends t<ru.ozon.android.messenger.blocks.buttons.a, b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f84429a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d.a f84430b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f84431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, @NotNull d.a networkConfig, boolean z11) {
        super(new d());
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f84429a = controller;
        this.f84430b = networkConfig;
        this.f84431c = z11;
    }

    public final void f(boolean z11) {
        this.f84431c = z11;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        return getItem(i11).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        b holder = (b) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ru.ozon.android.messenger.blocks.buttons.a item = getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.e(item, this.f84431c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        int ordinal = ru.ozon.android.messenger.blocks.buttons.e.TEXT.ordinal();
        d.a aVar = this.f84430b;
        ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = this.f84429a;
        if (i11 == ordinal) {
            Intrinsics.f(context);
            MItemChatFlexButtonBinding inflate = MItemChatFlexButtonBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new ru.ozon.android.messenger.blocks.buttons.presentation.flex.a(inflate, aVar2, aVar);
        }
        if (i11 != ru.ozon.android.messenger.blocks.buttons.e.ORDER.ordinal()) {
            throw new IllegalArgumentException("unknown viewType");
        }
        Intrinsics.f(context);
        MItemChatFixedButtonBinding inflate2 = MItemChatFixedButtonBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new ru.ozon.android.messenger.blocks.buttons.presentation.fixed.a(inflate2, aVar, aVar2);
    }
}
