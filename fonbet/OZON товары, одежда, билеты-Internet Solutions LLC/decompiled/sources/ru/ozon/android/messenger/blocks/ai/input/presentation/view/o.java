package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import K1.Q;
import K1.S;
import Kk.C3532b;
import Q1.K;
import Sc.s;
import androidx.lifecycle.w0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.input.data.AiInputButton;
import ru.ozon.android.messenger.blocks.ai.input.data.Settings;
import ru.ozon.android.messenger.blocks.ai.input.presentation.a;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.ai.K0;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.repository.UniTheme;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/input/presentation/view/o;", "Landroidx/lifecycle/w0;", "<init>", "()V", "b", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private ru.ozon.android.messenger.blocks.ai.input.presentation.a f84284a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<b> f84285b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<b> f84286c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f84287d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<a> f84288e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private ru.ozon.android.messenger.blocks.ai.input.data.a f84289f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f84290g;

    /* renamed from: h, reason: collision with root package name */
    private String f84291h;

    public interface a {

        /* renamed from: ru.ozon.android.messenger.blocks.ai.input.presentation.view.o$a$a, reason: collision with other inner class name */
        public static final class C1462a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1462a f84292a = new C1462a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1462a);
            }

            public final int hashCode() {
                return -1774202591;
            }

            @NotNull
            public final String toString() {
                return "ClearFocus";
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final K f84293a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f84294b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final TextDTO f84295c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f84296d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f84297e;

        /* renamed from: f, reason: collision with root package name */
        private final Settings f84298f;

        /* renamed from: g, reason: collision with root package name */
        private final IconButtonV3DTO f84299g;

        static {
            int i11 = IconButtonV3DTO.$stable;
        }

        public b() {
            this(0);
        }

        public static b a(b bVar, K k11, boolean z11, TextDTO textDTO, String str, String str2, Settings settings, IconButtonV3DTO iconButtonV3DTO, int i11) {
            if ((i11 & 1) != 0) {
                k11 = bVar.f84293a;
            }
            K textFieldValue = k11;
            if ((i11 & 2) != 0) {
                z11 = bVar.f84294b;
            }
            boolean z12 = z11;
            if ((i11 & 4) != 0) {
                textDTO = bVar.f84295c;
            }
            TextDTO placeholder = textDTO;
            if ((i11 & 8) != 0) {
                str = bVar.f84296d;
            }
            String cursorColor = str;
            if ((i11 & 16) != 0) {
                str2 = bVar.f84297e;
            }
            String outlineColor = str2;
            if ((i11 & 32) != 0) {
                settings = bVar.f84298f;
            }
            Settings settings2 = settings;
            if ((i11 & 64) != 0) {
                iconButtonV3DTO = bVar.f84299g;
            }
            bVar.getClass();
            Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(cursorColor, "cursorColor");
            Intrinsics.checkNotNullParameter(outlineColor, "outlineColor");
            return new b(textFieldValue, z12, placeholder, cursorColor, outlineColor, settings2, iconButtonV3DTO);
        }

        @NotNull
        public final String b() {
            return this.f84296d;
        }

        @NotNull
        public final String c() {
            return this.f84297e;
        }

        @NotNull
        public final TextDTO d() {
            return this.f84295c;
        }

        public final IconButtonV3DTO e() {
            return this.f84299g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f84293a, bVar.f84293a) && this.f84294b == bVar.f84294b && Intrinsics.d(this.f84295c, bVar.f84295c) && Intrinsics.d(this.f84296d, bVar.f84296d) && Intrinsics.d(this.f84297e, bVar.f84297e) && Intrinsics.d(this.f84298f, bVar.f84298f) && Intrinsics.d(this.f84299g, bVar.f84299g);
        }

        public final Settings f() {
            return this.f84298f;
        }

        @NotNull
        public final K g() {
            return this.f84293a;
        }

        public final boolean h() {
            return this.f84294b;
        }

        public final int hashCode() {
            int a11 = G.g.a(G.g.a(Ns.b.a(this.f84295c, C3532b.a(this.f84293a.hashCode() * 31, 31, this.f84294b), 31), 31, this.f84296d), 31, this.f84297e);
            Settings settings = this.f84298f;
            int hashCode = (a11 + (settings == null ? 0 : settings.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.f84299g;
            return hashCode + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "State(textFieldValue=" + this.f84293a + ", isInputFocused=" + this.f84294b + ", placeholder=" + this.f84295c + ", cursorColor=" + this.f84296d + ", outlineColor=" + this.f84297e + ", settings=" + this.f84298f + ", sendButton=" + this.f84299g + ")";
        }

        public b(@NotNull K textFieldValue, boolean z11, @NotNull TextDTO placeholder, @NotNull String cursorColor, @NotNull String outlineColor, Settings settings, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(cursorColor, "cursorColor");
            Intrinsics.checkNotNullParameter(outlineColor, "outlineColor");
            this.f84293a = textFieldValue;
            this.f84294b = z11;
            this.f84295c = placeholder;
            this.f84296d = cursorColor;
            this.f84297e = outlineColor;
            this.f84298f = settings;
            this.f84299g = iconButtonV3DTO;
        }

        public /* synthetic */ b(int i11) {
            this(new K(7, 0L, (String) null), false, new TextDTO(new OzonSpannableString(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), "", "", null, null);
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84300a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.blocks.ai.input.data.a.values().length];
            try {
                iArr[ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f84300a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.input.presentation.view.AiInputViewModel$onSendClick$1", f = "AiInputViewModel.kt", l = {164}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f84301d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f84301d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = o.this.f84287d;
                a.C1462a c1462a = a.C1462a.f84292a;
                this.f84301d = 1;
                if (c02.emit(c1462a, this) == aVar) {
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

    public o() {
        x0<b> a11 = O0.a(new b(0));
        this.f84285b = a11;
        this.f84286c = C2399j.b(a11);
        C0 b11 = E0.b(0, 0, null, 7);
        this.f84287d = b11;
        this.f84288e = C2399j.a(b11);
        this.f84289f = ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT_EMPTY;
        this.f84290g = true;
    }

    private final IconButtonV3DTO e0(ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar, ru.ozon.android.messenger.blocks.ai.input.data.a aVar2, String str) {
        List<AiInputButton> c11;
        Object obj;
        List<AiInputButton> c12;
        Object obj2;
        IconButtonV3DTO iconButton;
        if (!this.f84290g) {
            aVar2 = kotlin.text.h.K(str) ? ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY : ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING;
        }
        if (aVar != null && (c12 = aVar.c()) != null) {
            Iterator<T> it = c12.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((AiInputButton) obj2).getMode() == aVar2) {
                    break;
                }
            }
            AiInputButton aiInputButton = (AiInputButton) obj2;
            if (aiInputButton != null && (iconButton = aiInputButton.getIconButton()) != null) {
                return iconButton;
            }
        }
        if (aVar != null && (c11 = aVar.c()) != null) {
            Iterator<T> it2 = c11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                AiInputButton aiInputButton2 = (AiInputButton) obj;
                if (aVar2 == ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY && aiInputButton2.getMode() == ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING) {
                    break;
                }
            }
            AiInputButton aiInputButton3 = (AiInputButton) obj;
            if (aiInputButton3 != null) {
                return aiInputButton3.getIconButton();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(@NotNull ru.ozon.android.messenger.blocks.ai.input.presentation.a aiInputVO) {
        long j11;
        String f7;
        int i11;
        ru.ozon.android.messenger.blocks.ai.input.data.a aVar;
        String c11;
        Intrinsics.checkNotNullParameter(aiInputVO, "aiInputVO");
        x0<b> x0Var = this.f84285b;
        b value = x0Var.getValue();
        ru.ozon.android.messenger.blocks.ai.input.data.a d11 = aiInputVO.d();
        String h11 = aiInputVO.h();
        K g10 = value.g();
        String str = this.f84291h;
        int[] iArr = c.f84300a;
        int i12 = iArr[d11.ordinal()];
        if (i12 == 1 || i12 == 2) {
            if (str != null) {
                this.f84291h = null;
                if (Intrinsics.d(g10.f(), str)) {
                    j11 = Q.f15009b;
                    g10 = new K(4, j11, "");
                }
                K k11 = g10;
                this.f84284a = aiInputVO;
                ru.ozon.android.messenger.blocks.ai.input.data.a d12 = aiInputVO.d();
                f7 = k11.f();
                i11 = iArr[d12.ordinal()];
                if (i11 != 1 || i11 == 2) {
                    aVar = !kotlin.text.h.K(f7) ? ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY : ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING;
                } else if (i11 == 3 || i11 == 4) {
                    aVar = kotlin.text.h.K(f7) ? ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT_EMPTY : ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT;
                } else {
                    if (i11 != 5) {
                        throw new Sc.o();
                    }
                    aVar = kotlin.text.h.K(f7) ? ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT_EMPTY : ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT;
                }
                this.f84289f = aVar;
                TextDTO f11 = aiInputVO.f();
                String b11 = aiInputVO.b();
                c11 = value.c();
                if (c11.length() == 0) {
                    c11 = aiInputVO.e().a();
                }
                x0Var.setValue(b.a(value, k11, false, f11, b11, c11, aiInputVO.g(), e0(aiInputVO, this.f84289f, k11.f()), 2));
            }
        } else if (i12 != 3 && i12 != 4 && i12 != 5) {
            throw new Sc.o();
        }
        if (d11 == ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT || d11 == ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT_EMPTY) {
            this.f84291h = null;
        }
        if (h11 != null && kotlin.text.h.K(g10.f())) {
            int length = h11.length();
            g10 = new K(4, S.a(length, length), h11);
        }
        K k112 = g10;
        this.f84284a = aiInputVO;
        ru.ozon.android.messenger.blocks.ai.input.data.a d122 = aiInputVO.d();
        f7 = k112.f();
        i11 = iArr[d122.ordinal()];
        if (i11 != 1) {
        }
        if (!kotlin.text.h.K(f7)) {
        }
        this.f84289f = aVar;
        TextDTO f112 = aiInputVO.f();
        String b112 = aiInputVO.b();
        c11 = value.c();
        if (c11.length() == 0) {
        }
        x0Var.setValue(b.a(value, k112, false, f112, b112, c11, aiInputVO.g(), e0(aiInputVO, this.f84289f, k112.f()), 2));
    }

    public final void g0() {
        String c11;
        a.C1461a e11;
        x0<b> x0Var = this.f84285b;
        if (x0Var.getValue().h()) {
            return;
        }
        b value = x0Var.getValue();
        ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar = this.f84284a;
        if (aVar == null || (e11 = aVar.e()) == null || (c11 = e11.b()) == null) {
            c11 = x0Var.getValue().c();
        }
        x0Var.setValue(b.a(value, null, true, null, null, c11, null, null, 109));
    }

    @NotNull
    public final InterfaceC2395h<a> getEffects() {
        return this.f84288e;
    }

    @NotNull
    public final M0<b> getState() {
        return this.f84286c;
    }

    public final void h0(@NotNull K value) {
        K k11;
        ru.ozon.android.messenger.blocks.ai.input.data.a aVar;
        String id2;
        a.C1461a e11;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.f().length() <= 1000) {
            k11 = value;
        } else {
            String q02 = kotlin.text.h.q0(1000, value.f());
            long e12 = value.e();
            int length = q02.length();
            int i11 = Q.f15010c;
            k11 = new K(4, S.a(kotlin.ranges.h.e((int) (e12 >> 32), 0, length), kotlin.ranges.h.e((int) (e12 & 4294967295L), 0, length)), q02);
        }
        ru.ozon.android.messenger.blocks.ai.input.data.a aVar2 = this.f84289f;
        String f7 = k11.f();
        int i12 = c.f84300a[aVar2.ordinal()];
        if (i12 == 1 || i12 == 2) {
            aVar = kotlin.text.h.K(f7) ? ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY : ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING;
        } else {
            if (i12 != 3 && i12 != 4 && i12 != 5) {
                throw new Sc.o();
            }
            aVar = kotlin.text.h.K(f7) ? ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT_EMPTY : ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT;
        }
        this.f84289f = aVar;
        x0<b> x0Var = this.f84285b;
        b value2 = x0Var.getValue();
        ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar3 = this.f84284a;
        if (aVar3 == null || (e11 = aVar3.e()) == null || (id2 = e11.b()) == null) {
            id2 = UniTheme.INSTANCE.getColorTokens().getClearLightKey0().getId();
        }
        x0Var.setValue(b.a(value2, k11, false, null, null, id2, null, e0(this.f84284a, this.f84289f, k11.f()), 46));
    }

    public final void i0(boolean z11) {
        if (this.f84290g == z11) {
            return;
        }
        this.f84290g = z11;
        x0<b> x0Var = this.f84285b;
        b value = x0Var.getValue();
        x0Var.setValue(b.a(value, null, false, null, null, null, null, e0(this.f84284a, this.f84289f, value.g().f()), 63));
    }

    public final void j0(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, K0 k02, Map<String, MessengerTrackingInfo> map, @NotNull ru.ozon.android.messenger.framework.navigation.action.a action) {
        String c11;
        a.C1461a e11;
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f84290g && this.f84289f == ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_DEFAULT) {
            x0<b> x0Var = this.f84285b;
            if (kotlin.text.h.K(x0Var.getValue().g().f())) {
                return;
            }
            K g10 = x0Var.getValue().g();
            String obj = kotlin.text.h.z0(g10.f()).toString();
            if (kotlin.text.h.K(obj)) {
                return;
            }
            if (k02 != null ? k02.c(action.getId()) : true) {
                this.f84291h = g10.f();
                b value = x0Var.getValue();
                ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar = this.f84284a;
                if (aVar == null || (e11 = aVar.e()) == null || (c11 = e11.a()) == null) {
                    c11 = x0Var.getValue().c();
                }
                x0Var.setValue(b.a(value, null, false, null, null, c11, null, null, 109));
                AtomActionDTO atomActionDTO = null;
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new d(null), 3);
                boolean d11 = Intrinsics.d(action.getId(), "aiSendMessage");
                String str = d11 ? "text" : "prefillMessage";
                Tc.d builder = new Tc.d();
                builder.put(str, obj);
                if (d11) {
                    builder.put("textRestoreStrategy", "onError");
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                Tc.d u11 = builder.u();
                AtomActionDTO b11 = action.b();
                if (b11 != null) {
                    Map<String, String> params = action.b().getParams();
                    if (params == null) {
                        params = U.c();
                    }
                    atomActionDTO = AtomActionDTO.copy$default(b11, null, null, null, U.m(params, u11), null, 23, null);
                }
                messengerController.q(ru.ozon.android.messenger.framework.navigation.action.a.a(action, atomActionDTO));
                if (map != null) {
                    messengerController.m(map);
                }
            }
        }
    }
}
