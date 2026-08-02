package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.presentation.ai.N;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
public final class p {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7799Q f90872b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d.a.C1558a f90873c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f90874d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90875e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f90876f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC7799Q abstractC7799Q, d.a.C1558a c1558a, q qVar, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.logger.b bVar) {
            super(2);
            this.f90872b = abstractC7799Q;
            this.f90873c = c1558a;
            this.f90874d = qVar;
            this.f90875e = dVar;
            this.f90876f = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                androidx.compose.ui.e a11 = androidx.compose.foundation.e.a(androidx.compose.ui.e.f40358c0, this.f90872b, this.f90873c.c().a(), 4);
                C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
                int I11 = interfaceC3967k2.I();
                A0 d11 = interfaceC3967k2.d();
                androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, a11);
                InterfaceC2801g.f5440U.getClass();
                Function0 a13 = InterfaceC2801g.a.a();
                if (interfaceC3967k2.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k2.i();
                if (interfaceC3967k2.t()) {
                    interfaceC3967k2.H(a13);
                } else {
                    interfaceC3967k2.e();
                }
                Function2 c11 = P.c(interfaceC3967k2, a12, interfaceC3967k2, d11);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                    Nk.a.d(c11, I11, interfaceC3967k2, I11);
                }
                Ek.a.g(f7, interfaceC3967k2, 151129020);
                Iterator it = ru.ozon.android.messenger.framework.presentation.models.f.b(this.f90874d).iterator();
                while (it.hasNext()) {
                    N.b(null, (ru.ozon.android.messenger.framework.presentation.models.e) it.next(), this.f90875e, this.f90876f, interfaceC3967k2, 0);
                }
                interfaceC3967k2.k();
                interfaceC3967k2.f();
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f90877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f90879d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, ru.ozon.android.messenger.framework.core.d dVar, o oVar) {
            super(0);
            this.f90877b = view;
            this.f90878c = dVar;
            this.f90879d = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            HapticVibrator.INSTANCE.vibrate(this.f90877b, HapticToken.SOFT);
            String b11 = this.f90879d.b();
            ru.ozon.android.messenger.framework.core.d dVar = this.f90878c;
            View view = dVar.d().getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                Context context = viewGroup.getContext();
                Intrinsics.f(context);
                ru.ozon.android.messenger.utils.c.f(context, b11);
                NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null);
                if (asNotificationLayoutManager$default != null) {
                    NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(ru.ozon.android.messenger.utils.c.d(R$string.messenger_text_copy_success, context), null, null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 476, null), dVar.f(), null, 8, null).show();
                }
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f90880b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<q> f90881c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90882d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d.a.C1558a f90883e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> f90884f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f90885g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f90886h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f90887i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, List<q> list, ru.ozon.android.messenger.framework.core.d dVar, d.a.C1558a c1558a, w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> wVar, ru.ozon.android.messenger.framework.logger.b bVar, Function0<Unit> function0, int i11) {
            super(2);
            this.f90880b = oVar;
            this.f90881c = list;
            this.f90882d = dVar;
            this.f90883e = c1558a;
            this.f90884f = wVar;
            this.f90885g = bVar;
            this.f90886h = function0;
            this.f90887i = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f90887i | 1);
            ru.ozon.android.messenger.framework.logger.b bVar = this.f90885g;
            Function0<Unit> function0 = this.f90886h;
            p.a(this.f90880b, this.f90881c, this.f90882d, this.f90883e, this.f90884f, bVar, function0, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<ru.ozon.android.messenger.blocks.messagetext.f, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f90888b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(ru.ozon.android.messenger.blocks.messagetext.f fVar) {
            ru.ozon.android.messenger.blocks.messagetext.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.d().toString();
        }
    }

    public static final void a(@NotNull o selected, @NotNull List<q> items, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull d.a.C1558a bubbleSettings, @NotNull w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> bubbleCoords, ru.ozon.android.messenger.framework.logger.b bVar, @NotNull Function0<Unit> onDismiss, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object obj;
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(bubbleSettings, "bubbleSettings");
        Intrinsics.checkNotNullParameter(bubbleCoords, "bubbleCoords");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        C3969l u11 = interfaceC3967k.u(-1241194987);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(selected) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(items) : u11.F(items) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(references) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(bubbleSettings) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(bubbleCoords) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= (262144 & i11) == 0 ? u11.n(bVar) : u11.F(bVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(onDismiss) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((599187 & i13) == 599186 && u11.b()) {
            u11.j();
        } else {
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((q) obj).c().getId(), selected.a())) {
                        break;
                    }
                }
            }
            q qVar = (q) obj;
            ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a aVar = bubbleCoords.get(selected.a());
            AbstractC7799Q a11 = ru.ozon.android.messenger.utils.compose.a.a(bubbleSettings.b(), u11, 0);
            if (qVar != null && aVar != null) {
                n nVar = new n(aVar.a(), aVar.b(), selected.c(), a1.c.c(-1587103971, new a(a11, bubbleSettings, qVar, references, bVar), u11));
                u11.o(1118431753);
                boolean F11 = u11.F(view) | u11.F(references) | ((i13 & 14) == 4);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new b(view, references, selected);
                    u11.x(C11);
                }
                u11.k();
                i.b(nVar, onDismiss, (Function0) C11, u11, (i13 >> 15) & 112);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(selected, items, references, bubbleSettings, bubbleCoords, bVar, onDismiss, i11));
        }
    }

    @NotNull
    public static final String b(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        List<u> b11 = qVar.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            ru.ozon.android.messenger.framework.presentation.models.g c11 = ((u) it.next()).c();
            ru.ozon.android.messenger.blocks.messagetext.f fVar = c11 instanceof ru.ozon.android.messenger.blocks.messagetext.f ? (ru.ozon.android.messenger.blocks.messagetext.f) c11 : null;
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return C7714v.V(arrayList, "\n", null, null, d.f90888b, 30);
    }
}
