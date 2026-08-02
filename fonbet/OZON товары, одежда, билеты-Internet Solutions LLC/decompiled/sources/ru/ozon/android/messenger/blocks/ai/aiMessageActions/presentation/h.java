package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import T7.E;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.f;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.l;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.B0;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class h extends v<ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.e, a> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f84024e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l.a f84025f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<f> f84026g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f84027h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C0 f84028i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<b> f84029j;

    public interface a {

        /* renamed from: ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.h$a$a, reason: collision with other inner class name */
        public static final class C1456a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1456a f84030a = new C1456a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1456a);
            }

            public final int hashCode() {
                return 491345046;
            }

            @NotNull
            public final String toString() {
                return "ClickBadge";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final int f84031a;

            public b(int i11) {
                this.f84031a = i11;
            }

            public final int a() {
                return this.f84031a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f84031a == ((b) obj).f84031a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f84031a);
            }

            @NotNull
            public final String toString() {
                return K00.b.e(this.f84031a, ")", new StringBuilder("ClickIconButton(id="));
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f84032a;

            public c(Map<String, MessengerTrackingInfo> map) {
                this.f84032a = map;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo>] */
            public final Map<String, MessengerTrackingInfo> a() {
                return this.f84032a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f84032a.equals(((c) obj).f84032a);
            }

            public final int hashCode() {
                return this.f84032a.hashCode();
            }

            @NotNull
            public final String toString() {
                return E.c(this.f84032a, ")", new StringBuilder("View(trackingInfo="));
            }
        }
    }

    public interface b {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f84033a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2057713137;
            }

            @NotNull
            public final String toString() {
                return "Vibrate";
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.AiMessageActionsViewModel$onActionButtonClick$1", f = "AiMessageActionsViewModel.kt", l = {66}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f84034d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f84034d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = h.this.f84028i;
                b.a aVar2 = b.a.f84033a;
                this.f84034d = 1;
                if (c02.emit(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, @NotNull l.a outerToUiStateMapper) {
        super(new ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.e(0));
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(outerToUiStateMapper, "outerToUiStateMapper");
        this.f84024e = messengerController;
        this.f84025f = outerToUiStateMapper;
        x0<f> a11 = O0.a(null);
        this.f84026g = a11;
        this.f84027h = Sc.k.b(i.f84036b);
        C0 b11 = E0.b(0, 0, null, 7);
        this.f84028i = b11;
        this.f84029j = C2399j.a(b11);
        C2399j.C(new C2408n0(new C2406m0(a11), new g(this, null)), androidx.lifecycle.x0.a(this));
    }

    private final void m0(int i11) {
        Object obj;
        f value;
        f fVar;
        String b11;
        CommonControlSettings common;
        Iterator<T> it = f0().a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a) obj).getId() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a aVar = (ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a) obj;
        if (aVar == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(null), 3);
        boolean z11 = aVar instanceof a.b;
        ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = this.f84024e;
        if (z11) {
            CommonControlSettings common2 = ((a.b) aVar).getButton().getCommon();
            if (common2 != null) {
                k.a(common2, aVar2, U.c());
                return;
            }
            return;
        }
        boolean z12 = aVar instanceof a.c;
        x0<f> x0Var = this.f84026g;
        if (z12) {
            a.c cVar = (a.c) aVar;
            f value2 = x0Var.getValue();
            if (value2 == null || (b11 = ru.ozon.android.messenger.framework.presentation.models.h.b(value2)) == null || (common = cVar.getButton().getCommon()) == null) {
                return;
            }
            k.a(common, aVar2, U.j(new Pair(d.c.AI_MESSAGE_ACTION_TOGGLE_ID.a(), Integer.valueOf(cVar.getId())), new Pair(d.c.ITEM_ID.a(), b11)));
            return;
        }
        if (aVar instanceof a.C1454a) {
            a.C1454a c1454a = (a.C1454a) aVar;
            CommonControlSettings common3 = c1454a.getButton().getCommon();
            if (common3 != null) {
                k.a(common3, aVar2, U.c());
            }
            if (!c1454a.b()) {
                do {
                    value = x0Var.getValue();
                    f fVar2 = value;
                    if (fVar2 != null) {
                        List<f.a> b12 = fVar2.b();
                        ArrayList arrayList = new ArrayList(C7714v.z(b12, 10));
                        for (f.a aVar3 : b12) {
                            if (aVar3.d() == c1454a.getId()) {
                                aVar3 = f.a.a(aVar3, Boolean.TRUE);
                            }
                            arrayList.add(aVar3);
                        }
                        fVar = f.a(fVar2, arrayList);
                    } else {
                        fVar = null;
                    }
                } while (!x0Var.b(value, fVar));
            }
            InterfaceC4008j interfaceC4008j = this.f84027h;
            B0 b02 = (B0) ((HashMap) interfaceC4008j.getValue()).get(Integer.valueOf(c1454a.getId()));
            if (b02 != null) {
                b02.j(null);
            }
            ((HashMap) interfaceC4008j.getValue()).put(Integer.valueOf(c1454a.getId()), C10727i.c(androidx.lifecycle.x0.a(this), null, null, new j(c1454a, this, null), 3));
        }
    }

    @NotNull
    public final InterfaceC2395h<b> getEffects() {
        return this.f84029j;
    }

    public final void k0(@NotNull f blockVO) {
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        this.f84026g.setValue(blockVO);
    }

    @Override // ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final void g0(@NotNull a action) {
        AiMessageActionsDTO.SourcesBadge c11;
        CommonControlSettings common;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = action instanceof a.C1456a;
        ru.ozon.android.messenger.framework.navigation.controller.a aVar = this.f84024e;
        if (z11) {
            f value = this.f84026g.getValue();
            if (value == null || (c11 = value.c()) == null || (common = c11.getBadge().getCommon()) == null) {
                return;
            }
            k.a(common, aVar, U.i(new Pair(d.c.AI_MESSAGE_ACTION_MENU_INFO.a(), c11.getMenuInfo())));
            return;
        }
        if (action instanceof a.b) {
            m0(((a.b) action).a());
        } else {
            if (!(action instanceof a.c)) {
                throw new o();
            }
            aVar.s(((a.c) action).a());
        }
    }
}
