package ru.ozon.android.messenger.blocks.input.viewdelegates;

import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.C4005g;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.blocks.input.viewmodel.o;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MAttachmentsBlockBinding;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.h f85566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f85567b;

    /* renamed from: c, reason: collision with root package name */
    private MAttachmentsBlockBinding f85568c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.attachments.presentation.c f85569d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, String> f85570e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewdelegates.InputAttachmentsViewDelegate$onBind$1", f = "InputAttachmentsViewDelegate.kt", l = {63}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85571d;

        /* renamed from: ru.ozon.android.messenger.blocks.input.viewdelegates.e$a$a, reason: collision with other inner class name */
        static final class C1505a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f85573a;

            C1505a(e eVar) {
                this.f85573a = eVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> b11;
                T t2;
                MAttachmentsBlockBinding mAttachmentsBlockBinding;
                RecyclerView recyclerView;
                RecyclerView constraintLayout;
                o oVar = (o) obj;
                e eVar = this.f85573a;
                if (oVar != null && (b11 = oVar.b()) != null) {
                    MAttachmentsBlockBinding mAttachmentsBlockBinding2 = eVar.f85568c;
                    if (mAttachmentsBlockBinding2 != null && (constraintLayout = mAttachmentsBlockBinding2.getConstraintLayout()) != null) {
                        s.e(constraintLayout, Boolean.valueOf(!b11.isEmpty()));
                    }
                    eVar.f85569d.submitList(b11);
                    Iterator<T> it = b11.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = (T) null;
                            break;
                        }
                        t2 = it.next();
                        if (Intrinsics.d(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) t2).f(), b.c.C1503c.f85485a)) {
                            break;
                        }
                    }
                    if (t2 != null && (mAttachmentsBlockBinding = eVar.f85568c) != null && (recyclerView = mAttachmentsBlockBinding.attachmentRv) != null) {
                        recyclerView.smoothScrollToPosition(b11.size() - 1);
                    }
                    e.e(eVar, oVar.h());
                }
                if (oVar != null && oVar.j()) {
                    ((n) eVar.f85567b).b(new d(eVar));
                }
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85571d;
            if (i11 == 0) {
                Sc.s.b(obj);
                e eVar = e.this;
                x0 f91308a = eVar.f85566a.getF91308a();
                C1505a c1505a = new C1505a(eVar);
                this.f85571d = 1;
                if (f91308a.collect(c1505a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    public e(@NotNull ru.ozon.android.messenger.blocks.input.viewmodel.h chatInputViewModel, @NotNull n inputIncidentsPresenter) {
        Intrinsics.checkNotNullParameter(chatInputViewModel, "chatInputViewModel");
        Intrinsics.checkNotNullParameter(inputIncidentsPresenter, "inputIncidentsPresenter");
        this.f85566a = chatInputViewModel;
        this.f85567b = inputIncidentsPresenter;
        this.f85569d = new ru.ozon.android.messenger.blocks.input.attachments.presentation.c(new ru.ozon.android.messenger.blocks.input.viewdelegates.a(this), new b(this), new c(this));
        this.f85570e = U.c();
    }

    public static final void e(e eVar, Set set) {
        eVar.getClass();
        if (set == null) {
            return;
        }
        boolean isEmpty = set.isEmpty();
        n nVar = eVar.f85567b;
        if (isEmpty || eVar.f85570e.isEmpty()) {
            nVar.c();
        } else {
            nVar.d(eVar.f85570e, set);
        }
    }

    public final void f(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MAttachmentsBlockBinding inflate = MAttachmentsBlockBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
        parent.addView(inflate.getConstraintLayout());
        RecyclerView recyclerView = inflate.attachmentRv;
        recyclerView.setAdapter(this.f85569d);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        Context context2 = inflate.attachmentRv.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new ru.ozon.android.messenger.blocks.input.attachments.presentation.d(context2));
        this.f85568c = inflate;
    }

    public final void g(@NotNull ComponentCallbacksC5392m currentFragment, @NotNull J lifecycleOwner, @NotNull Map<String, String> lexemes) {
        Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(lexemes, "lexemes");
        this.f85567b.a(currentFragment);
        this.f85570e = lexemes;
        C10727i.c(K.a(lifecycleOwner), null, null, new a(null), 3);
    }

    public final void h(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f85567b.e();
        MAttachmentsBlockBinding mAttachmentsBlockBinding = this.f85568c;
        parent.removeView(mAttachmentsBlockBinding != null ? mAttachmentsBlockBinding.getConstraintLayout() : null);
        this.f85568c = null;
    }
}
