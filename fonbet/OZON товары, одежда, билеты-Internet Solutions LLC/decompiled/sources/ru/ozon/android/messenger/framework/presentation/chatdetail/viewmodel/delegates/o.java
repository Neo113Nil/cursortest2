package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.usecases.Y;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class o extends l {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.a f90165c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.startup.a f90166d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Y f90167e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<Integer> f90168f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final M0<Integer> f90169g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f90170h;

    static final class a extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90172c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f90173d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Boolean bool) {
            super(1);
            this.f90172c = str;
            this.f90173d = bool;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
            String str;
            int i11;
            List<ru.ozon.android.messenger.framework.presentation.models.q> silentUpdateBlocks = list;
            Intrinsics.checkNotNullParameter(silentUpdateBlocks, "$this$silentUpdateBlocks");
            ListIterator<ru.ozon.android.messenger.framework.presentation.models.q> listIterator = silentUpdateBlocks.listIterator(silentUpdateBlocks.size());
            while (true) {
                boolean hasPrevious = listIterator.hasPrevious();
                str = this.f90172c;
                if (!hasPrevious) {
                    i11 = -1;
                    break;
                }
                if (Intrinsics.d(r.d(listIterator.previous()), str)) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            }
            Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = silentUpdateBlocks.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                s f7 = r.f(it.next());
                if (f7 != null && f7.t()) {
                    break;
                }
                i12++;
            }
            if (i11 != -1 && i12 != -1 && i12 <= i11) {
                o oVar = o.this;
                if (i12 <= i11) {
                    int i13 = i12;
                    while (true) {
                        ru.ozon.android.messenger.framework.presentation.models.q qVar = silentUpdateBlocks.get(i13);
                        if (qVar.c() instanceof s) {
                            silentUpdateBlocks.set(i13, ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, null, s.d((s) qVar.c(), null, null, null, 0.0d, false, false, 0, null, 262015), 1));
                            o.f(oVar).invoke(str);
                        }
                        if (i13 == i11) {
                            break;
                        }
                        i13++;
                    }
                }
                if (Intrinsics.d(this.f90173d, Boolean.TRUE)) {
                    oVar.l(m.f90162b);
                } else {
                    oVar.l(new n(i11, i12));
                }
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f90174b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    static final class c extends AbstractC7737t implements Function1<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f90175b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() - 1);
        }
    }

    static final class d extends AbstractC7737t implements Function0<Function1<? super String, ? extends Unit>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Function1<? super String, ? extends Unit> invoke() {
            o oVar = o.this;
            return ru.ozon.android.messenger.utils.coroutines.c.a(oVar.d(), 500L, new q(2, oVar, o.class, "sendMessagesRead", "sendMessagesRead(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
        }
    }

    public o(@NotNull ru.ozon.android.messenger.framework.data.local.a widgetStorageDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate, @NotNull Y sendReadMessagesUseCase) {
        Intrinsics.checkNotNullParameter(widgetStorageDelegate, "widgetStorageDelegate");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(sendReadMessagesUseCase, "sendReadMessagesUseCase");
        this.f90165c = widgetStorageDelegate;
        this.f90166d = chatStartupDelegate;
        this.f90167e = sendReadMessagesUseCase;
        x0<Integer> a11 = O0.a(0);
        this.f90168f = a11;
        this.f90169g = a11;
        this.f90170h = ru.ozon.android.messenger.utils.f.b(new d());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final Function1 f(o oVar) {
        return (Function1) oVar.f90170h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(o oVar, String str, kotlin.coroutines.d dVar) {
        p pVar;
        Object obj;
        int i11;
        oVar.getClass();
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i12 = pVar.f90180g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f90180g = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = pVar.f90178e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f90180g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String value = oVar.f90166d.e().getValue();
                    if (value == null) {
                        return Unit.f71690a;
                    }
                    ru.ozon.android.messenger.framework.data.requests.g gVar = new ru.ozon.android.messenger.framework.data.requests.g(value, str);
                    pVar.f90177d = str;
                    pVar.f90180g = 1;
                    obj = oVar.f90167e.a(gVar, pVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = pVar.f90177d;
                    Sc.s.b(obj);
                }
                if (((ru.ozon.android.messenger.utils.i) obj) instanceof i.a) {
                    Lm0.a.f17149a.w(Nk.a.b("Failed to send last read message with id ", str), new Object[0]);
                }
                return Unit.f71690a;
            }
        }
        pVar = new p(oVar, dVar);
        obj = pVar.f90178e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f90180g;
        if (i11 != 0) {
        }
        if (((ru.ozon.android.messenger.utils.i) obj) instanceof i.a) {
        }
        return Unit.f71690a;
    }

    @NotNull
    public final M0<Integer> h() {
        return this.f90169g;
    }

    public final void i(Boolean bool, @NotNull String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        this.f90165c.r(new a(msgId, bool));
    }

    public final void j(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
        s f7;
        Intrinsics.checkNotNullParameter(item, "item");
        s f11 = r.f(item);
        if (f11 != null && f11.t()) {
            l(b.f90174b);
        }
        s f12 = r.f(item);
        if ((f12 == null || !f12.p()) && ((f7 = r.f(item)) == null || !f7.q())) {
            return;
        }
        i(Boolean.TRUE, r.d(item));
    }

    public final void k(@NotNull ru.ozon.android.messenger.framework.presentation.models.q widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        s f7 = r.f(widget);
        if (f7 == null || f7.q()) {
            return;
        }
        l(c.f90175b);
    }

    public final void l(@NotNull Function1<? super Integer, Integer> updateUnread) {
        Intrinsics.checkNotNullParameter(updateUnread, "updateUnread");
        x0<Integer> x0Var = this.f90168f;
        int intValue = updateUnread.invoke(x0Var.getValue()).intValue();
        if (intValue < 0) {
            intValue = 0;
        }
        x0Var.setValue(Integer.valueOf(intValue));
    }
}
