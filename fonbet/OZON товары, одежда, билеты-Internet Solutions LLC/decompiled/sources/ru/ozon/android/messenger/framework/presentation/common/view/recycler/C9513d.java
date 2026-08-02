package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.viewmapper.a;

/* renamed from: ru.ozon.android.messenger.framework.presentation.common.view.recycler.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9513d extends androidx.recyclerview.widget.t<ru.ozon.android.messenger.framework.presentation.models.e, AbstractC9510a<ru.ozon.android.messenger.framework.presentation.models.g>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f91215a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f91216b;

    /* renamed from: c, reason: collision with root package name */
    private final l f91217c;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.view.recycler.d$a */
    public static final class a extends i.d<ru.ozon.android.messenger.framework.presentation.models.e> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.data.b f91218a;

        public a(@NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
            Intrinsics.checkNotNullParameter(blockStore, "blockStore");
            this.f91218a = blockStore;
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areContentsTheSame(ru.ozon.android.messenger.framework.presentation.models.e eVar, ru.ozon.android.messenger.framework.presentation.models.e eVar2) {
            ru.ozon.android.messenger.framework.presentation.models.e oldItem = eVar;
            ru.ozon.android.messenger.framework.presentation.models.e newItem = eVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areItemsTheSame(ru.ozon.android.messenger.framework.presentation.models.e eVar, ru.ozon.android.messenger.framework.presentation.models.e eVar2) {
            ru.ozon.android.messenger.framework.presentation.models.e oldItem = eVar;
            ru.ozon.android.messenger.framework.presentation.models.e newItem = eVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            Intrinsics.checkNotNullParameter(oldItem, "<this>");
            String id2 = oldItem.c().getId();
            Intrinsics.checkNotNullParameter(newItem, "<this>");
            return Intrinsics.d(id2, newItem.c().getId()) && (oldItem.d() == newItem.d());
        }

        @Override // androidx.recyclerview.widget.i.d
        public final Object getChangePayload(ru.ozon.android.messenger.framework.presentation.models.e eVar, ru.ozon.android.messenger.framework.presentation.models.e eVar2) {
            ru.ozon.android.messenger.framework.presentation.models.e oldItem = eVar;
            ru.ozon.android.messenger.framework.presentation.models.e newItem = eVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ru.ozon.android.messenger.framework.data.d.a(this.f91218a, oldItem.d()).getPayloads(oldItem.b(), newItem.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9513d(@NotNull ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.logger.b bVar, l lVar) {
        super(new a(references.a()));
        Intrinsics.checkNotNullParameter(references, "references");
        this.f91215a = references;
        this.f91216b = bVar;
        this.f91217c = lVar;
    }

    public static final void h(C9513d c9513d, B b11) {
        T boundedData = b11.getBoundedData();
        if (boundedData instanceof ru.ozon.android.messenger.blocks.chat.common.b) {
            Iterator<T> it = ((ru.ozon.android.messenger.blocks.chat.common.b) boundedData).c().iterator();
            while (it.hasNext()) {
                Map<String, MessengerTrackingInfo> e11 = ((ru.ozon.android.messenger.blocks.chat.common.menuItems.b) it.next()).e();
                if (e11 != null) {
                    c9513d.f91215a.c().s(e11);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        return getItem(i11).d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        AbstractC9510a holder = (AbstractC9510a) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ru.ozon.android.messenger.framework.presentation.models.e item = getItem(i11);
        ru.ozon.android.messenger.framework.presentation.models.g b11 = item.b();
        ru.ozon.android.messenger.framework.presentation.models.p c12 = item.c();
        ru.ozon.android.messenger.framework.presentation.models.d a11 = item.a();
        int i12 = AbstractC9510a.f91211d;
        holder.e(b11, c12, a11, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ru.ozon.android.messenger.framework.core.d dVar = this.f91215a;
        ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> e11 = ru.ozon.android.messenger.framework.data.d.e(dVar.a(), i11, new e(this, i11));
        InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, X4.a> inflate = e11.getInflate();
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        X4.a invoke = inflate.invoke(ru.ozon.android.messenger.utils.c.c(context), parent, Boolean.FALSE);
        a.AbstractC1563a blockContainerSettings = e11.getBlockContainerSettings();
        if (blockContainerSettings instanceof a.AbstractC1563a.b) {
            throw new IllegalStateException(("Use " + N.b(i.class).B() + " для сообщений").toString());
        }
        if (!(blockContainerSettings instanceof a.AbstractC1563a.C1564a)) {
            throw new Sc.o();
        }
        q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> invoke2 = e11.getViewProducer().invoke(invoke, dVar);
        if (!(invoke2 instanceof B)) {
            return new s(invoke2);
        }
        return new r((B) invoke2, this.f91217c, new f(this, (B) invoke2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(RecyclerView.C c11) {
        AbstractC9510a holder = (AbstractC9510a) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.onRecycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11, List payloads) {
        AbstractC9510a holder = (AbstractC9510a) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        List list = !payloads.isEmpty() ? payloads : null;
        if (list != null) {
            for (Object obj : list) {
                ru.ozon.android.messenger.framework.presentation.models.e item = getItem(i11);
                holder.e(item.b(), item.c(), item.a(), obj);
            }
            return;
        }
        super.onBindViewHolder(holder, i11, payloads);
    }
}
