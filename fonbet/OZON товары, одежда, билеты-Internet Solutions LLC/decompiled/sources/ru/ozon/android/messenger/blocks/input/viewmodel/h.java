package ru.ozon.android.messenger.blocks.input.viewmodel;

import Ae.x0;
import Sc.s;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.T;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.input.SendButtonModeDTO;
import ru.ozon.android.messenger.blocks.input.e;
import ru.ozon.android.messenger.blocks.input.viewmodel.o;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class h extends ru.ozon.android.messenger.framework.presentation.common.viewmodel.a<o> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f85625b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.attachments.manager.d f85626c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.pickerlauncher.b f85627d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.messagesender.b f85628e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.e f85629f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.f f85630g;

    /* renamed from: h, reason: collision with root package name */
    private ru.ozon.android.messenger.blocks.input.d f85631h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.c f85632i;

    /* renamed from: j, reason: collision with root package name */
    private String f85633j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85634a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.blocks.input.messagesender.a.values().length];
            try {
                iArr[ru.ozon.android.messenger.blocks.input.messagesender.a.MESSAGES_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.blocks.input.messagesender.a.ATTACHMENTS_ISSUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85634a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<o, o> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f85636c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.input.d f85637d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, h hVar, ru.ozon.android.messenger.blocks.input.d dVar) {
            super(1);
            this.f85635b = str;
            this.f85636c = hVar;
            this.f85637d = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o invoke(o oVar) {
            o oVar2 = oVar;
            if (oVar2 == null) {
                return null;
            }
            h hVar = this.f85636c;
            String str = this.f85635b;
            o.a l11 = (str == null || str.length() == 0) ? oVar2.l() : new o.a(h.t0(hVar, oVar2.l().b(), str), true);
            ru.ozon.android.messenger.blocks.input.d dVar = this.f85637d;
            return o.a(oVar2, true ^ dVar.m(), l11, null, null, false, h.p0(hVar, dVar), dVar.e(), 2556);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.InputBlockViewModel$bindState$2", f = "InputBlockViewModel.kt", l = {243}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85638d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.input.d f85640f;

        static final class a extends AbstractC7737t implements Function1<o, o> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.blocks.input.d f85641b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f85642c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ CustomBlockDTO f85643d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ h f85644e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.blocks.input.b f85645f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ru.ozon.android.messenger.blocks.input.d dVar, String str, CustomBlockDTO customBlockDTO, h hVar, ru.ozon.android.messenger.blocks.input.b bVar) {
                super(1);
                this.f85641b = dVar;
                this.f85642c = str;
                this.f85643d = customBlockDTO;
                this.f85644e = hVar;
                this.f85645f = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final o invoke(o oVar) {
                List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> b11;
                ru.ozon.android.messenger.blocks.input.d dVar = this.f85641b;
                boolean z11 = !dVar.m();
                o.a aVar = new o.a(this.f85642c, true);
                String i11 = dVar.i();
                ru.ozon.android.messenger.blocks.input.e e11 = dVar.e();
                boolean d11 = Intrinsics.d(e11, e.b.f85534a);
                e.a aVar2 = e.a.f85533a;
                h hVar = this.f85644e;
                if (d11) {
                    b11 = K.f71697a;
                } else if (Intrinsics.d(e11, aVar2)) {
                    b11 = h.q0(hVar, this.f85645f);
                } else {
                    o oVar2 = (o) hVar.d0().getValue();
                    b11 = oVar2 != null ? oVar2.b() : null;
                    if (b11 == null) {
                        b11 = K.f71697a;
                    }
                }
                return new o(z11, aVar, i11, this.f85643d, b11, dVar.d(), h.p0(hVar, dVar), dVar.e(), !Intrinsics.d(dVar.e(), aVar2), 352);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ru.ozon.android.messenger.blocks.input.d dVar, kotlin.coroutines.d<? super c> dVar2) {
            super(2, dVar2);
            this.f85640f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new c(this.f85640f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            ru.ozon.android.messenger.blocks.input.b bVar;
            String n02;
            CustomBlockDTO r02;
            Object value;
            o oVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85638d;
            ru.ozon.android.messenger.blocks.input.d dVar = this.f85640f;
            h hVar = h.this;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.android.messenger.blocks.input.viewmodel.e eVar = hVar.f85629f;
                String c11 = dVar.c();
                this.f85638d = 1;
                a11 = eVar.a(c11, this);
                if (a11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                a11 = obj;
            }
            ru.ozon.android.messenger.blocks.input.b bVar2 = (ru.ozon.android.messenger.blocks.input.b) a11;
            o oVar2 = (o) hVar.d0().getValue();
            if (oVar2 == null || !oVar2.g()) {
                bVar = bVar2;
            } else {
                String chatId = dVar.c();
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                bVar = new ru.ozon.android.messenger.blocks.input.b(chatId, 0L, "", null, K.f71697a);
            }
            o oVar3 = (o) hVar.d0().getValue();
            ru.ozon.android.messenger.blocks.input.e d11 = oVar3 != null ? oVar3.d() : null;
            e.b bVar3 = e.b.f85534a;
            if (Intrinsics.d(d11, bVar3) && Intrinsics.d(dVar.e(), e.a.f85533a)) {
                x0 d02 = hVar.d0();
                do {
                    value = d02.getValue();
                    oVar = (o) value;
                } while (!d02.b(value, oVar != null ? o.a(oVar, false, new o.a("", false), null, null, false, null, null, 4093) : null));
            }
            if (!Intrinsics.d(d11, bVar3) && Intrinsics.d(dVar.e(), bVar3)) {
                ((ru.ozon.android.messenger.blocks.input.attachments.manager.d) hVar.f85626c).p();
            }
            if (dVar.l() == null) {
                hVar.f85633j = dVar.l();
            }
            if (Intrinsics.d(dVar.l(), hVar.f85633j)) {
                n02 = h.n0(hVar, dVar, bVar);
                r02 = h.r0(hVar, dVar, bVar);
            } else {
                hVar.f85633j = dVar.l();
                String k11 = dVar.k();
                n02 = k11 != null ? k11 : "";
                r02 = dVar.f();
            }
            ru.ozon.android.messenger.utils.coroutines.d.a(hVar.d0(), new a(dVar, n02, r02, h.this, bVar));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<o, o> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f85646b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final o invoke(o oVar) {
            o oVar2 = oVar;
            if (oVar2 != null) {
                return o.a(oVar2, false, null, null, null, false, null, null, 4031);
            }
            return null;
        }
    }

    static final class e extends AbstractC7737t implements Function1<o, o> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f85647b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final o invoke(o oVar) {
            o oVar2 = oVar;
            if (oVar2 != null) {
                return o.a(oVar2, false, null, null, null, false, null, null, 2047);
            }
            return null;
        }
    }

    static final class f extends AbstractC7737t implements Function1<o, o> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f85648b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o invoke(o oVar) {
            o oVar2 = oVar;
            if (oVar2 != null) {
                return o.a(oVar2, false, new o.a(this.f85648b, false), null, null, false, null, null, 4093);
            }
            return null;
        }
    }

    static final class g extends AbstractC7737t implements Function1<o, o> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f85649b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final o invoke(o oVar) {
            o oVar2 = oVar;
            if (oVar2 != null) {
                return o.a(oVar2, false, null, null, null, true, null, null, 4031);
            }
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.InputBlockViewModel$removeCustomBlock$1", f = "InputBlockViewModel.kt", l = {184}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.blocks.input.viewmodel.h$h, reason: collision with other inner class name */
    static final class C1507h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85650d;

        C1507h(kotlin.coroutines.d<? super C1507h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new C1507h(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1507h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85650d;
            if (i11 == 0) {
                s.b(obj);
                h hVar = h.this;
                String h02 = h.h0(hVar);
                if (h02 != null) {
                    ru.ozon.android.messenger.blocks.input.viewmodel.f fVar = hVar.f85630g;
                    this.f85650d = 1;
                    if (fVar.f(h02, this) == aVar) {
                        return aVar;
                    }
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

    static final class i extends AbstractC7737t implements Function1<o, o> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f85652b = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final o invoke(o oVar) {
            o oVar2 = oVar;
            if (oVar2 != null) {
                return o.a(oVar2, false, new o.a("", true), null, null, false, null, null, 3829);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, @NotNull ru.ozon.android.messenger.blocks.input.attachments.manager.d inputAttachmentsManager, @NotNull ru.ozon.android.messenger.blocks.input.pickerlauncher.b attachmentsPickerLauncher, @NotNull ru.ozon.android.messenger.blocks.input.messagesender.b messageSender, @NotNull ru.ozon.android.messenger.blocks.input.viewmodel.e draftLoader, @NotNull ru.ozon.android.messenger.blocks.input.viewmodel.f draftSaver) {
        super(null);
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(inputAttachmentsManager, "inputAttachmentsManager");
        Intrinsics.checkNotNullParameter(attachmentsPickerLauncher, "attachmentsPickerLauncher");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        Intrinsics.checkNotNullParameter(draftLoader, "draftLoader");
        Intrinsics.checkNotNullParameter(draftSaver, "draftSaver");
        this.f85625b = messengerController;
        this.f85626c = inputAttachmentsManager;
        this.f85627d = attachmentsPickerLauncher;
        this.f85628e = messageSender;
        this.f85629f = draftLoader;
        this.f85630g = draftSaver;
        this.f85632i = new ru.ozon.android.messenger.blocks.input.viewmodel.c();
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new l(this, null), 3);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new k(this, null), 3);
    }

    public static final String h0(h hVar) {
        ru.ozon.android.messenger.blocks.input.d dVar = hVar.f85631h;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public static final String n0(h hVar, ru.ozon.android.messenger.blocks.input.d dVar, ru.ozon.android.messenger.blocks.input.b bVar) {
        String str;
        o.a l11;
        o value = hVar.d0().getValue();
        if (value == null || (l11 = value.l()) == null || (str = l11.b()) == null) {
            str = "";
        }
        String b11 = N9.o.b();
        String str2 = b11 != null ? b11 : "";
        N9.o.c(null);
        String k11 = dVar.k();
        if (k11 == null || k11.length() == 0) {
            return str.length() == 0 ? t0(hVar, bVar.c(), str2) : t0(hVar, str, str2);
        }
        String t02 = t0(hVar, dVar.k(), str2);
        if (Intrinsics.d(dVar.e(), e.a.f85533a)) {
            ru.ozon.android.messenger.blocks.input.d dVar2 = hVar.f85631h;
            String c11 = dVar2 != null ? dVar2.c() : null;
            if (c11 != null) {
                hVar.f85630g.e(c11, t02);
            }
        }
        return t02;
    }

    public static final IconButtonV3DTO p0(h hVar, ru.ozon.android.messenger.blocks.input.d dVar) {
        Object obj;
        IconButtonV3DTO button;
        hVar.getClass();
        List<SendButtonModeDTO> j11 = dVar.j();
        ru.ozon.android.messenger.blocks.input.e e11 = dVar.e();
        Iterator<T> it = j11.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((SendButtonModeDTO) obj).getModeName(), e11.a())) {
                break;
            }
        }
        SendButtonModeDTO sendButtonModeDTO = (SendButtonModeDTO) obj;
        return (sendButtonModeDTO == null || (button = sendButtonModeDTO.getButton()) == null) ? ((SendButtonModeDTO) C7714v.K(j11)).getButton() : button;
    }

    public static final List q0(h hVar, ru.ozon.android.messenger.blocks.input.b bVar) {
        o value = hVar.d0().getValue();
        List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> b11 = value != null ? value.b() : null;
        List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list = b11;
        if (list != null && !list.isEmpty()) {
            return b11;
        }
        hVar.f85626c.x(C7714v.I0(new ru.ozon.android.messenger.blocks.input.viewmodel.i(), bVar.a()));
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CustomBlockDTO r0(h hVar, ru.ozon.android.messenger.blocks.input.d dVar, ru.ozon.android.messenger.blocks.input.b bVar) {
        CustomBlockDTO customBlockDTO;
        ru.ozon.android.messenger.blocks.input.d dVar2;
        hVar.getClass();
        if (!Intrinsics.d(dVar.e(), e.a.f85533a)) {
            ru.ozon.android.messenger.blocks.input.d dVar3 = hVar.f85631h;
            if ((dVar3 != null ? dVar3.f() : null) != null) {
                hVar.f85631h = ru.ozon.android.messenger.blocks.input.d.a(dVar, null, null, null, false, null, 8063);
            }
            return null;
        }
        CustomBlockDTO f7 = dVar.f();
        if (f7 == null) {
            o value = hVar.d0().getValue();
            if (value == null) {
                customBlockDTO = null;
                dVar2 = hVar.f85631h;
                if (!Intrinsics.d(customBlockDTO, dVar2 == null ? dVar2.f() : null)) {
                    hVar.f85631h = ru.ozon.android.messenger.blocks.input.d.a(dVar, null, customBlockDTO, null, false, null, 8063);
                }
                if (customBlockDTO != null) {
                    return bVar.b();
                }
                ru.ozon.android.messenger.blocks.input.d dVar4 = hVar.f85631h;
                String c11 = dVar4 != null ? dVar4.c() : null;
                if (c11 != null) {
                    hVar.f85630g.d(c11, customBlockDTO);
                }
                return customBlockDTO;
            }
            f7 = value.f();
        }
        customBlockDTO = f7;
        dVar2 = hVar.f85631h;
        if (!Intrinsics.d(customBlockDTO, dVar2 == null ? dVar2.f() : null)) {
        }
        if (customBlockDTO != null) {
        }
    }

    static String t0(h hVar, String str, String str2) {
        hVar.getClass();
        if (str2.length() == 0) {
            return str;
        }
        return (str.length() == 0 || C7714v.b0(' ', '\n').contains(Character.valueOf(kotlin.text.h.M(str)))) ? str.concat(str2) : G.g.c(str, " ", str2);
    }

    private final void u0(ru.ozon.android.messenger.blocks.input.d dVar) {
        if (!dVar.g()) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(dVar, null), 3);
            return;
        }
        String b11 = N9.o.b();
        N9.o.c(null);
        ru.ozon.android.messenger.utils.coroutines.d.a(d0(), new b(b11, this, dVar));
    }

    public final void A0(@NotNull String text) {
        ru.ozon.android.messenger.blocks.input.d dVar;
        o.a l11;
        Intrinsics.checkNotNullParameter(text, "text");
        o value = d0().getValue();
        if (!Intrinsics.d((value == null || (l11 = value.l()) == null) ? null : l11.b(), text)) {
            this.f85626c.r();
        }
        ru.ozon.android.messenger.utils.coroutines.d.a(d0(), new f(text));
        if (text.length() > 0 && (dVar = this.f85631h) != null) {
            this.f85625b.i(dVar.c());
        }
        o value2 = d0().getValue();
        if (Intrinsics.d(value2 != null ? value2.d() : null, e.a.f85533a)) {
            ru.ozon.android.messenger.blocks.input.d dVar2 = this.f85631h;
            String c11 = dVar2 != null ? dVar2.c() : null;
            if (c11 != null) {
                this.f85630g.e(c11, text);
            }
        }
    }

    public final void B0() {
        this.f85627d.f();
    }

    public final void C0(@NotNull UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ru.ozon.android.messenger.blocks.input.attachments.manager.d dVar = this.f85626c;
        dVar.u(id2);
        dVar.r();
    }

    public final void D0(@NotNull UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ru.ozon.android.messenger.blocks.input.attachments.manager.d dVar = this.f85626c;
        dVar.v(id2);
        dVar.r();
    }

    public final void E0(@NotNull IconButtonV3DTO buttonDTO) {
        AtomActionDTO action;
        o.a l11;
        Intrinsics.checkNotNullParameter(buttonDTO, "buttonDTO");
        o value = d0().getValue();
        String str = null;
        ru.ozon.android.messenger.blocks.input.e d11 = value != null ? value.d() : null;
        if (!Intrinsics.d(d11, e.b.f85534a)) {
            if (Intrinsics.d(d11, e.c.f85535a)) {
                F0();
                return;
            } else {
                F0();
                return;
            }
        }
        o value2 = d0().getValue();
        if (value2 != null && (l11 = value2.l()) != null) {
            str = l11.b();
        }
        if (str == null) {
            str = "";
        }
        CommonControlSettings common = buttonDTO.getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return;
        }
        Map<String, String> params = action.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        u11.put(d.c.TEXT.a(), str);
        this.f85625b.q(ru.ozon.android.messenger.framework.navigation.action.b.c(AtomActionDTO.copy$default(action, null, null, null, u11, null, 23, null)));
    }

    public final void F0() {
        String str;
        List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list;
        List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> b11;
        o.a l11;
        o value = d0().getValue();
        if (value == null || (l11 = value.l()) == null || (str = l11.b()) == null) {
            Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
            str = "";
        }
        o value2 = d0().getValue();
        CustomBlockDTO f7 = value2 != null ? value2.f() : null;
        o value3 = d0().getValue();
        if (value3 == null || (b11 = value3.b()) == null || (list = this.f85632i.b(b11)) == null) {
            list = K.f71697a;
        }
        int i11 = a.f85634a[this.f85628e.a(str, f7, list).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            ru.ozon.android.messenger.utils.coroutines.d.a(d0(), g.f85649b);
        } else {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new m(this, null), 3);
            ru.ozon.android.messenger.blocks.input.attachments.manager.d dVar = this.f85626c;
            dVar.p();
            ru.ozon.android.messenger.utils.coroutines.d.a(d0(), n.f85663b);
            dVar.r();
        }
    }

    public final ru.ozon.android.messenger.blocks.input.pickerlauncher.d G0() {
        ru.ozon.android.messenger.blocks.input.a c11;
        o value = d0().getValue();
        if (value == null || (c11 = value.c()) == null) {
            return null;
        }
        return new ru.ozon.android.messenger.blocks.input.pickerlauncher.d(c11.c() - value.b().size(), c11.b(), kotlin.text.h.m(c11.a(), new String[]{","}, 0, 6));
    }

    public final void H0() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C1507h(null), 3);
        ru.ozon.android.messenger.utils.coroutines.d.a(d0(), i.f85652b);
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        this.f85627d.g();
    }

    public final void v0() {
        ru.ozon.android.messenger.utils.coroutines.d.a(d0(), d.f85646b);
    }

    public final void w0() {
        ru.ozon.android.messenger.utils.coroutines.d.a(d0(), e.f85647b);
    }

    public final void x0() {
        this.f85625b.q(ru.ozon.android.messenger.framework.navigation.action.b.c(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.DISMISS_POPUP_MENU.a(), null, 10, null)));
    }

    public final void y0(@NotNull ru.ozon.android.messenger.blocks.input.d viewObject, @NotNull ru.ozon.android.messenger.framework.presentation.common.viewmodel.b savedStateHandle, @NotNull ComponentCallbacksC5392m currentFragment) {
        List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list;
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
        if (viewObject.equals(this.f85631h) && N9.o.b() == null) {
            return;
        }
        this.f85631h = viewObject;
        u0(viewObject);
        Integer valueOf = Integer.valueOf(viewObject.d().b());
        Integer valueOf2 = Integer.valueOf(viewObject.d().c());
        String d11 = viewObject.d().d();
        o value = d0().getValue();
        if (value == null || (list = value.b()) == null) {
            list = K.f71697a;
        }
        this.f85626c.w(valueOf, valueOf2, d11, list, viewObject.c());
        C9514a b11 = viewObject.b();
        ru.ozon.android.messenger.blocks.input.d dVar = this.f85631h;
        this.f85627d.e(currentFragment, this, b11, dVar != null ? dVar.c() : null);
    }

    public final void z0(@NotNull UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ru.ozon.android.messenger.blocks.input.attachments.manager.d dVar = this.f85626c;
        dVar.u(id2);
        dVar.r();
    }
}
