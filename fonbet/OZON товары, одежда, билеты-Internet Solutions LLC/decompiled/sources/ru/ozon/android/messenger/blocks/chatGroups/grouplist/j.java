package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import C.o0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.b;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C9513d;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.v;
import ru.ozon.app.android.messenger.databinding.MBlockChatGroupListBinding;

/* loaded from: classes10.dex */
public final class j extends d<MBlockChatGroupListBinding> {

    /* renamed from: l, reason: collision with root package name */
    private static Parcelable f84714l;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.chatGroups.e f84715g;

    /* renamed from: h, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f84716h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Handler f84717i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f84718j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, m, m> f84719k;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f84720a;

        public a(@NotNull q group) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.f84720a = group;
        }

        @NotNull
        public final q a() {
            return this.f84720a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f84720a, ((a) obj).f84720a);
        }

        public final int hashCode() {
            return this.f84720a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "AddGroupUpdate(group=" + this.f84720a + ")";
        }
    }

    public static final class b implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f84721a;

        public b(@NotNull String selectedGroupId) {
            Intrinsics.checkNotNullParameter(selectedGroupId, "selectedGroupId");
            this.f84721a = selectedGroupId;
        }

        @NotNull
        public final String a() {
            return this.f84721a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f84721a, ((b) obj).f84721a);
        }

        public final int hashCode() {
            return this.f84721a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ChatGroupSelectedUpdate(selectedGroupId="), this.f84721a, ")");
        }
    }

    public static final class c implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f84722a;

        public c(@NotNull q group) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.f84722a = group;
        }

        @NotNull
        public final q a() {
            return this.f84722a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f84722a, ((c) obj).f84722a);
        }

        public final int hashCode() {
            return this.f84722a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "UpdateGroupById(group=" + this.f84722a + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull JsonParser deserializer, @NotNull Jb.c blocksItemMapperProvider, @NotNull ru.ozon.android.messenger.blocks.chatGroups.e chatGroupViewParamsDelegate, ru.ozon.android.messenger.framework.logger.b bVar) {
        super(deserializer, blocksItemMapperProvider);
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(blocksItemMapperProvider, "blocksItemMapperProvider");
        Intrinsics.checkNotNullParameter(chatGroupViewParamsDelegate, "chatGroupViewParamsDelegate");
        this.f84715g = chatGroupViewParamsDelegate;
        this.f84716h = bVar;
        this.f84717i = new Handler(Looper.getMainLooper());
        this.f84718j = C7714v.b0(b.class, a.class, c.class);
        this.f84719k = new l(this);
    }

    public static final u r(j jVar, u uVar, boolean z11) {
        jVar.getClass();
        ru.ozon.android.messenger.blocks.chatGroups.a aVar = (ru.ozon.android.messenger.blocks.chatGroups.a) v.b(uVar);
        return aVar != null ? u.a(uVar, ru.ozon.android.messenger.blocks.chatGroups.a.a(aVar, z11, 2031)) : uVar;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, m mVar) {
        AbstractC5434v lifecycle;
        MBlockChatGroupListBinding binding = (MBlockChatGroupListBinding) aVar;
        m viewObject = mVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        RecyclerView recyclerView = binding.chatGroupsRv;
        recyclerView.setAdapter(new C9513d(references, this.f84716h, null));
        boolean d11 = this.f84715g.d();
        recyclerView.setNestedScrollingEnabled(d11);
        if (!d11) {
            recyclerView.setOverScrollMode(2);
        }
        b.C1565b g10 = g(rootView);
        if (g10 == null || (lifecycle = g10.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new k(recyclerView));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, final ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        final MBlockChatGroupListBinding binding = (MBlockChatGroupListBinding) aVar;
        final m viewObject = (m) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        List<q> b11 = viewObject.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            C7714v.p(ru.ozon.android.messenger.framework.presentation.models.f.b((q) it.next()), arrayList);
        }
        RecyclerView.g adapter = binding.chatGroupsRv.getAdapter();
        C9513d c9513d = adapter instanceof C9513d ? (C9513d) adapter : null;
        if (c9513d != null) {
            c9513d.submitList(arrayList);
        }
        Handler handler = this.f84717i;
        handler.removeCallbacksAndMessages(null);
        handler.post(new Runnable() { // from class: ru.ozon.android.messenger.blocks.chatGroups.grouplist.i
            @Override // java.lang.Runnable
            public final void run() {
                if (ru.ozon.android.messenger.framework.core.d.this.d().getLifecycle().b().a(AbstractC5434v.b.RESUMED)) {
                    RecyclerView chatGroupsRv = binding.chatGroupsRv;
                    Intrinsics.checkNotNullExpressionValue(chatGroupsRv, "chatGroupsRv");
                    this.getClass();
                    m mVar = viewObject;
                    Iterator<q> it2 = mVar.b().iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i11 = -1;
                            break;
                        } else if (Intrinsics.d(r.d(it2.next()), mVar.c())) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        RecyclerView.o layoutManager = chatGroupsRv.getLayoutManager();
                        if (layoutManager == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        IntRange intRange = new IntRange(linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition(), 1);
                        int f71842a = intRange.getF71842a();
                        if (intValue > intRange.getF71843b() || f71842a > intValue) {
                            chatGroupsRv.smoothScrollToPosition(intValue);
                        }
                    }
                }
            }
        });
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        if (obj instanceof h) {
            m mVar = (m) C7714v.M(((ru.ozon.android.messenger.blocks.chatGroups.grouplist.b) getMapper()).invoke(obj, new ru.ozon.android.messenger.framework.presentation.models.c("", 0)));
            return (mVar == null || mVar.d()) ? false : true;
        }
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.g b11 = ((ru.ozon.android.messenger.framework.presentation.models.e) obj).b();
            m mVar2 = b11 instanceof m ? (m) b11 : null;
            if (mVar2 != null && !mVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f84718j;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, m, m> getUpdateConsumer() {
        return this.f84719k;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final X4.a j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MBlockChatGroupListBinding inflate = MBlockChatGroupListBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references) {
        MBlockChatGroupListBinding binding = (MBlockChatGroupListBinding) aVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f84717i.removeCallbacksAndMessages(null);
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).removeView(binding.chatGroupsRv);
    }
}
