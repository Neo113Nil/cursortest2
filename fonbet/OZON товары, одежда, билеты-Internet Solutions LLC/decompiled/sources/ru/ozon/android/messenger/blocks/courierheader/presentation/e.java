package ru.ozon.android.messenger.blocks.courierheader.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.courierheader.presentation.a;
import ru.ozon.app.android.messenger.databinding.MCourierHeaderOrderItemBinding;

/* loaded from: classes10.dex */
public final class e extends t<a.C1486a, d> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f84963a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashSet<a.C1486a> f84964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller) {
        super(new c());
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f84963a = controller;
        this.f84964b = new HashSet<>();
    }

    public final void f() {
        this.f84964b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        d holder = (d) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        a.C1486a item = getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.f(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MCourierHeaderOrderItemBinding inflate = MCourierHeaderOrderItemBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new d(inflate, this.f84963a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewAttachedToWindow(RecyclerView.C c11) {
        d holder = (d) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int adapterPosition = holder.getAdapterPosition();
        Integer valueOf = Integer.valueOf(adapterPosition);
        if (adapterPosition == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            a.C1486a item = getItem(valueOf.intValue());
            if (this.f84964b.add(item)) {
                this.f84963a.s(item.e());
            }
        }
    }
}
