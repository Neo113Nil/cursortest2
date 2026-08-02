package ru.ozon.android.messenger.blocks.chat.common.menuItems;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

/* loaded from: classes10.dex */
public final class d extends t<b, c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.a f84563a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<ru.ozon.android.messenger.framework.navigation.action.a, Map<String, MessengerTrackingInfo>, Unit> f84564b;

    private static final class a extends i.d<b> {
        @Override // androidx.recyclerview.widget.i.d
        public final boolean areContentsTheSame(b bVar, b bVar2) {
            b oldItem = bVar;
            b newItem = bVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areItemsTheSame(b bVar, b bVar2) {
            b oldItem = bVar;
            b newItem = bVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem == newItem;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull d.a networkConfig, @NotNull Function2<? super ru.ozon.android.messenger.framework.navigation.action.a, ? super Map<String, MessengerTrackingInfo>, Unit> onMenuItemClick) {
        super(new a());
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(onMenuItemClick, "onMenuItemClick");
        this.f84563a = networkConfig;
        this.f84564b = onMenuItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        c viewHolder = (c) c11;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        b item = getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        viewHolder.f(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(ViewGroupExtKt.inflate(parent, R$layout.m_context_menu_item), this.f84563a, this.f84564b);
    }
}
