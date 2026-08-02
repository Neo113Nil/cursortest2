package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import Kk.C3532b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MMessageBaseLayoutBinding;
import ru.ozon.app.android.messenger.databinding.MNoTypeLayoutBinding;

/* loaded from: classes10.dex */
public final class i extends androidx.recyclerview.widget.t<ru.ozon.android.messenger.framework.presentation.models.q, k> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f91232a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<ru.ozon.android.messenger.framework.presentation.models.q, Integer, Unit> f91233b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9512c f91234c;

    /* renamed from: d, reason: collision with root package name */
    private String f91235d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a STATUS_CHANGED;

        static {
            a aVar = new a("STATUS_CHANGED", 0);
            STATUS_CHANGED = aVar;
            a[] aVarArr = {aVar};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b extends i.d<ru.ozon.android.messenger.framework.presentation.models.q> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.data.b f91236a;

        public b(@NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
            Intrinsics.checkNotNullParameter(blockStore, "blockStore");
            this.f91236a = blockStore;
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areContentsTheSame(ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.presentation.models.q qVar2) {
            ru.ozon.android.messenger.framework.presentation.models.q oldItem = qVar;
            ru.ozon.android.messenger.framework.presentation.models.q newItem = qVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areItemsTheSame(ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.presentation.models.q qVar2) {
            String e11;
            ru.ozon.android.messenger.framework.presentation.models.q oldItem = qVar;
            ru.ozon.android.messenger.framework.presentation.models.q newItem = qVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            boolean z11 = (!Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.e(oldItem), ru.ozon.android.messenger.framework.presentation.models.r.e(newItem)) || (e11 = ru.ozon.android.messenger.framework.presentation.models.r.e(oldItem)) == null || e11.length() == 0) ? false : true;
            boolean d11 = Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(oldItem), ru.ozon.android.messenger.framework.presentation.models.r.d(newItem));
            Intrinsics.checkNotNullParameter(oldItem, "<this>");
            Intrinsics.checkNotNullParameter(oldItem, "<this>");
            int e12 = ((ru.ozon.android.messenger.framework.presentation.models.u) C7714v.K(oldItem.b())).e();
            Intrinsics.checkNotNullParameter(newItem, "<this>");
            Intrinsics.checkNotNullParameter(newItem, "<this>");
            return (d11 || z11) && (e12 == ((ru.ozon.android.messenger.framework.presentation.models.u) C7714v.K(newItem.b())).e());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.i.d
        public final Object getChangePayload(ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.presentation.models.q qVar2) {
            j jVar;
            ru.ozon.android.messenger.framework.presentation.models.q oldItem = qVar;
            ru.ozon.android.messenger.framework.presentation.models.q newItem = qVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = oldItem.b();
            ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
            Iterator<T> it = b11.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                jVar = j.f91241b;
                if (!hasNext) {
                    break;
                }
                arrayList.add(jVar.invoke(it.next()));
            }
            List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = newItem.b();
            ArrayList arrayList2 = new ArrayList(C7714v.z(b12, 10));
            Iterator<T> it2 = b12.iterator();
            while (it2.hasNext()) {
                arrayList2.add(jVar.invoke(it2.next()));
            }
            if (arrayList.equals(arrayList2)) {
                ru.ozon.android.messenger.framework.presentation.models.p c11 = oldItem.c();
                ru.ozon.android.messenger.framework.presentation.models.p c12 = newItem.c();
                if ((c11 instanceof ru.ozon.android.messenger.framework.presentation.models.s) && (c12 instanceof ru.ozon.android.messenger.framework.presentation.models.s)) {
                    ru.ozon.android.messenger.framework.presentation.models.s sVar = (ru.ozon.android.messenger.framework.presentation.models.s) c11;
                    if (sVar.equals(ru.ozon.android.messenger.framework.presentation.models.s.d((ru.ozon.android.messenger.framework.presentation.models.s) c12, sVar.i(), sVar.j(), null, 0.0d, false, false, 0, sVar.k(), 253945))) {
                        c cVar = new c(1, !Intrinsics.d(sVar.k(), r5.k()), !Intrinsics.d(sVar.j(), r5.j()));
                        HashMap hashMap = new HashMap();
                        int size = oldItem.b().size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ru.ozon.android.messenger.framework.presentation.models.u uVar = oldItem.b().get(i11);
                            ru.ozon.android.messenger.framework.presentation.models.u uVar2 = newItem.b().get(i11);
                            if (!Intrinsics.d(uVar, uVar2)) {
                                hashMap.put(ru.ozon.android.messenger.framework.presentation.models.v.a(uVar2), ru.ozon.android.messenger.framework.data.d.a(this.f91236a, uVar.e()).getPayloads(uVar.c(), uVar2.c()));
                            }
                        }
                        return c.a(cVar, hashMap);
                    }
                }
            }
            return null;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<ru.ozon.android.messenger.framework.presentation.models.c, List<Object>> f91237a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f91238b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f91239c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c() {
            this(7, r1, r1);
            boolean z11 = false;
        }

        public static c a(c cVar, HashMap hashMap) {
            return new c((HashMap<ru.ozon.android.messenger.framework.presentation.models.c, List<Object>>) hashMap, cVar.f91238b, cVar.f91239c);
        }

        public final boolean b() {
            return this.f91239c;
        }

        public final HashMap<ru.ozon.android.messenger.framework.presentation.models.c, List<Object>> c() {
            return this.f91237a;
        }

        public final boolean d() {
            return this.f91238b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f91237a, cVar.f91237a) && this.f91238b == cVar.f91238b && this.f91239c == cVar.f91239c;
        }

        public final int hashCode() {
            HashMap<ru.ozon.android.messenger.framework.presentation.models.c, List<Object>> hashMap = this.f91237a;
            return Boolean.hashCode(this.f91239c) + C3532b.a((hashMap == null ? 0 : hashMap.hashCode()) * 31, 31, this.f91238b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemPayload(sameBlocksPayloads=");
            sb2.append(this.f91237a);
            sb2.append(", statusChanged=");
            sb2.append(this.f91238b);
            sb2.append(", layoutTypeChanged=");
            return Pk0.a.a(")", sb2, this.f91239c);
        }

        public /* synthetic */ c(int i11, boolean z11, boolean z12) {
            this((HashMap<ru.ozon.android.messenger.framework.presentation.models.c, List<Object>>) null, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12);
        }

        public c(HashMap<ru.ozon.android.messenger.framework.presentation.models.c, List<Object>> hashMap, boolean z11, boolean z12) {
            this.f91237a = hashMap;
            this.f91238b = z11;
            this.f91239c = z12;
        }
    }

    public final class d implements ru.ozon.android.messenger.utils.recycle.a {
        public d() {
        }

        public final void a(int i11, @NotNull View header) {
            Intrinsics.checkNotNullParameter(header, "header");
            ru.ozon.android.messenger.framework.presentation.models.q f7 = i.f(i.this, i11);
            Intrinsics.checkNotNullExpressionValue(f7, "access$getItem(...)");
            ru.ozon.android.messenger.framework.presentation.models.g b11 = ru.ozon.android.messenger.framework.presentation.models.r.b(f7);
            ru.ozon.android.messenger.blocks.date.a aVar = b11 instanceof ru.ozon.android.messenger.blocks.date.a ? (ru.ozon.android.messenger.blocks.date.a) b11 : null;
            if (aVar == null) {
                return;
            }
            ((TextView) header.findViewById(R$id.chatDateTv)).setText(aVar.b());
        }

        public final boolean b(int i11) {
            ru.ozon.android.messenger.framework.presentation.models.q f7 = i.f(i.this, i11);
            Intrinsics.checkNotNullExpressionValue(f7, "access$getItem(...)");
            return ru.ozon.android.messenger.framework.presentation.models.r.b(f7) instanceof ru.ozon.android.messenger.blocks.date.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull Function2<? super ru.ozon.android.messenger.framework.presentation.models.q, ? super Integer, Unit> showPopupMenu) {
        super(new b(references.a()));
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(showPopupMenu, "showPopupMenu");
        this.f91232a = references;
        this.f91233b = showPopupMenu;
        this.f91234c = new C9512c();
    }

    public static final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f(i iVar, int i11) {
        return iVar.getItem(i11);
    }

    public final void g(String str) {
        if (str == null) {
            return;
        }
        this.f91235d = str;
        List<ru.ozon.android.messenger.framework.presentation.models.q> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = currentList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            ru.ozon.android.messenger.framework.presentation.models.q next = it.next();
            Intrinsics.f(next);
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(next), str)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        notifyItemChanged(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        ru.ozon.android.messenger.framework.presentation.models.q item = getItem(i11);
        ru.ozon.android.messenger.framework.data.b a11 = this.f91232a.a();
        Intrinsics.f(item);
        int i12 = ru.ozon.android.messenger.framework.presentation.models.r.f91458b;
        Intrinsics.checkNotNullParameter(item, "<this>");
        Intrinsics.checkNotNullParameter(item, "<this>");
        a.AbstractC1563a blockContainerSettings = ru.ozon.android.messenger.framework.data.d.a(a11, ((ru.ozon.android.messenger.framework.presentation.models.u) C7714v.K(item.b())).e()).getBlockContainerSettings();
        if (Intrinsics.d(blockContainerSettings, a.AbstractC1563a.C1564a.f87356a)) {
            return 0;
        }
        if (blockContainerSettings instanceof a.AbstractC1563a.b) {
            return 1;
        }
        throw new Sc.o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@NotNull k holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ru.ozon.android.messenger.framework.presentation.models.q item = getItem(i11);
        Intrinsics.f(item);
        int i12 = k.f91242g;
        holder.f(item, null);
        if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(item), this.f91235d)) {
            holder.e(item);
            this.f91235d = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C9512c c9512c = this.f91234c;
        ru.ozon.android.messenger.framework.core.d dVar = this.f91232a;
        if (i11 == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            MNoTypeLayoutBinding inflate = MNoTypeLayoutBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new t(inflate, dVar, c9512c);
        }
        if (i11 != 1) {
            throw new IllegalStateException(("Unknown view type " + i11).toString());
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        MMessageBaseLayoutBinding inflate2 = MMessageBaseLayoutBinding.inflate(ru.ozon.android.messenger.utils.c.c(context2), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new m(inflate2, dVar, c9512c, this.f91233b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewDetachedFromWindow(RecyclerView.C c11) {
        k holder = (k) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h();
        super.onViewDetachedFromWindow(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(RecyclerView.C c11) {
        k holder = (k) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h();
        super.onViewRecycled(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11, List payloads) {
        k holder = (k) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            payloads = null;
        }
        if (payloads != null) {
            for (Object obj : payloads) {
                ru.ozon.android.messenger.framework.presentation.models.q item = getItem(i11);
                Intrinsics.f(item);
                holder.f(item, obj);
            }
        } else {
            onBindViewHolder(holder, i11);
        }
        ru.ozon.android.messenger.framework.presentation.models.q item2 = getItem(i11);
        Intrinsics.f(item2);
        if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(item2), this.f91235d)) {
            holder.e(item2);
            this.f91235d = null;
        }
    }
}
