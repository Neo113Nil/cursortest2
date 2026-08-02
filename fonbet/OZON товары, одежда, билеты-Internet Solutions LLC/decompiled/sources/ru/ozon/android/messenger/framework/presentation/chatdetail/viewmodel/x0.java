package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.ArrayList;
import java.util.function.Predicate;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;
import ru.ozon.android.messenger.framework.presentation.models.z;

/* loaded from: classes10.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f90377a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f90378b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f90379c;

    /* renamed from: d, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.models.q f90380d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f90381e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f90382f;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.s, ru.ozon.android.messenger.framework.presentation.models.s> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f90383b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.models.s invoke(ru.ozon.android.messenger.framework.presentation.models.s sVar) {
            ru.ozon.android.messenger.framework.presentation.models.s it = sVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.models.s.d(it, null, null, null, 0.0d, false, false, 0, z.b.f91564a, 251903);
        }
    }

    static final class b extends AbstractC7737t implements Function1<v0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f90384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f90384b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(v0 v0Var) {
            v0 it = v0Var;
            Intrinsics.checkNotNullParameter(it, "it");
            ru.ozon.android.messenger.framework.presentation.models.s f7 = ru.ozon.android.messenger.framework.presentation.models.r.f(it.c());
            return Boolean.valueOf(Intrinsics.d(f7 != null ? f7.getId() : null, this.f90384b));
        }
    }

    static final class c extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.s, ru.ozon.android.messenger.framework.presentation.models.s> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f90385b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.models.s invoke(ru.ozon.android.messenger.framework.presentation.models.s sVar) {
            ru.ozon.android.messenger.framework.presentation.models.s it = sVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.models.s.d(it, null, null, null, 0.0d, false, false, 0, z.b.f91564a, 251903);
        }
    }

    public x0() {
        ArrayList arrayList = new ArrayList();
        this.f90377a = arrayList;
        this.f90379c = arrayList;
    }

    public final void a(String str) {
        ArrayList arrayList = this.f90377a;
        if (arrayList.isEmpty()) {
            return;
        }
        int P11 = C7714v.P(arrayList);
        v0 v0Var = (v0) C7714v.Z(arrayList);
        if (v0Var != null) {
            arrayList.set(P11, v0.a(v0Var, null, null, str, null, 19));
        }
    }

    public final void b() {
        this.f90377a.clear();
        this.f90380d = null;
        this.f90378b = false;
    }

    public final void c() {
        this.f90378b = false;
    }

    public final ru.ozon.android.messenger.framework.presentation.models.q d() {
        return this.f90380d;
    }

    @NotNull
    public final ArrayList e() {
        return this.f90379c;
    }

    public final void f(@NotNull v0 messageModel) {
        Intrinsics.checkNotNullParameter(messageModel, "messageModel");
        this.f90377a.add(v0.a(messageModel, ru.ozon.android.messenger.framework.presentation.models.r.a(messageModel.c(), a.f90383b), null, null, null, 30));
        if (messageModel.e().f() instanceof y0.b) {
            this.f90378b = true;
        }
    }

    public final boolean g() {
        return this.f90378b;
    }

    public final boolean h() {
        return this.f90381e;
    }

    public final boolean i() {
        return this.f90382f;
    }

    public final v0 j() {
        return (v0) C7714v.Z(this.f90377a);
    }

    public final void k() {
    }

    public final void l(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f90377a;
        final b bVar = new b(id2);
        arrayList.removeIf(new Predicate() { // from class: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.w0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) Function1.this.invoke(obj)).booleanValue();
            }
        });
    }

    public final void m(@NotNull ru.ozon.android.messenger.framework.domain.model.j payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        ArrayList arrayList = this.f90377a;
        v0 v0Var = (v0) C7714v.Z(arrayList);
        if (v0Var == null) {
            return;
        }
        arrayList.set(C7714v.P(arrayList), v0.a(v0Var, ru.ozon.android.messenger.framework.presentation.models.r.a(payload.e(), c.f90385b), payload.c(), null, payload, 12));
    }

    public final void n(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        this.f90380d = qVar;
    }

    public final void o(boolean z11) {
        this.f90381e = z11;
    }

    public final void p(boolean z11) {
        this.f90382f = z11;
    }
}
