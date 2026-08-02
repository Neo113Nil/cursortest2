package u50;

import C.D;
import H30.k;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.InterfaceC5431s;
import com.detmir.recycli.adapters.ScrollKeeper;
import d40.InterfaceC6083a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import u50.InterfaceC9967b;
import v50.j;
import v50.p;
import v50.r;
import v50.t;
import v50.u;
import x40.C10656a;
import y40.C10837a;

/* renamed from: u50.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9974i implements InterfaceC9967b, ScrollKeeper.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ScrollKeeper.b f100336a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10656a f100337b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f100338c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f100339d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Handler f100340e;

    public C9974i(@NotNull C10656a cbottomMapper2, @NotNull S80.b fintechNavigation, @NotNull InterfaceC6083a exchanger) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f100336a = new ScrollKeeper.b();
        this.f100337b = cbottomMapper2;
        this.f100338c = fintechNavigation;
        this.f100339d = exchanger;
        this.f100340e = new Handler(Looper.getMainLooper());
    }

    public static Unit e(C9974i c9974i, String str, String bottomId, int i11) {
        Intrinsics.checkNotNullParameter(bottomId, "bottomId");
        c9974i.k(i11, bottomId, str);
        return Unit.f71690a;
    }

    public static Unit f(C9974i c9974i, String str, ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "actionResult2UI");
        c9974i.getClass();
        ActionResult2.INSTANCE.getClass();
        String a11 = ActionResult2.Companion.a(str);
        c9974i.f100339d.c(C10837a.a(actionResult2UI), a11);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(M m11, ArrayList arrayList, final C9974i c9974i, final String str) {
        String str2;
        Activity activity;
        u a11;
        Integer bottomPadding;
        Integer topPadding;
        List<F40.a> main;
        Cbottom2SnackDTO cbottom2SnackDTO = (Cbottom2SnackDTO) m11.f71787a;
        if (cbottom2SnackDTO != null && (main = cbottom2SnackDTO.getMain()) != null) {
            C10656a c10656a = c9974i.f100337b;
            String id2 = ((Cbottom2SnackDTO) m11.f71787a).getId();
            Function1 function1 = new Function1() { // from class: u50.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C9974i.f(C9974i.this, str, (ActionResult2UI) obj);
                }
            };
            c10656a.getClass();
            arrayList.addAll(C10656a.b(id2, main, function1, c9974i));
        }
        Cbottom2SnackDTO cbottom2SnackDTO2 = (Cbottom2SnackDTO) m11.f71787a;
        int duration = cbottom2SnackDTO2 != null ? cbottom2SnackDTO2.getDuration() : 2000;
        if (duration == -1 || duration == 0) {
            duration = Integer.MAX_VALUE;
        }
        int i11 = duration;
        Cbottom2SnackDTO cbottom2SnackDTO3 = (Cbottom2SnackDTO) m11.f71787a;
        if (cbottom2SnackDTO3 == null || (str2 = cbottom2SnackDTO3.getId()) == null) {
            str2 = "";
        }
        Cbottom2SnackDTO cbottom2SnackDTO4 = (Cbottom2SnackDTO) m11.f71787a;
        boolean z11 = cbottom2SnackDTO4 != null && cbottom2SnackDTO4.getAtTop();
        Cbottom2SnackDTO cbottom2SnackDTO5 = (Cbottom2SnackDTO) m11.f71787a;
        boolean z12 = cbottom2SnackDTO5 != null && cbottom2SnackDTO5.getSwipeable();
        Cbottom2SnackDTO cbottom2SnackDTO6 = (Cbottom2SnackDTO) m11.f71787a;
        boolean z13 = cbottom2SnackDTO6 != null && cbottom2SnackDTO6.getInWindow();
        Cbottom2SnackDTO cbottom2SnackDTO7 = (Cbottom2SnackDTO) m11.f71787a;
        int intValue = (cbottom2SnackDTO7 == null || (topPadding = cbottom2SnackDTO7.getTopPadding()) == null) ? 0 : topPadding.intValue();
        Cbottom2SnackDTO cbottom2SnackDTO8 = (Cbottom2SnackDTO) m11.f71787a;
        int intValue2 = (cbottom2SnackDTO8 == null || (bottomPadding = cbottom2SnackDTO8.getBottomPadding()) == null) ? 0 : bottomPadding.intValue();
        Cbottom2SnackDTO cbottom2SnackDTO9 = (Cbottom2SnackDTO) m11.f71787a;
        Window window = null;
        String backgroundColor = cbottom2SnackDTO9 != null ? cbottom2SnackDTO9.getBackgroundColor() : null;
        Cbottom2SnackDTO cbottom2SnackDTO10 = (Cbottom2SnackDTO) m11.f71787a;
        List<Integer> backgroundRadius = cbottom2SnackDTO10 != null ? cbottom2SnackDTO10.getBackgroundRadius() : null;
        Cbottom2SnackDTO cbottom2SnackDTO11 = (Cbottom2SnackDTO) m11.f71787a;
        String borderColor = cbottom2SnackDTO11 != null ? cbottom2SnackDTO11.getBorderColor() : null;
        Cbottom2SnackDTO cbottom2SnackDTO12 = (Cbottom2SnackDTO) m11.f71787a;
        boolean z14 = z11;
        j.a aVar = new j.a(str2, 2, z14, D.d(intValue), D.d(intValue2), j.f102340l, j.f102341m, backgroundColor, backgroundRadius, borderColor, cbottom2SnackDTO12 != null ? cbottom2SnackDTO12.getBorderWidth() : null, i11, arrayList, z12, 425725944);
        InterfaceC5431s L02 = c9974i.f100338c.L0();
        E30.h hVar = L02 instanceof E30.h ? (E30.h) L02 : null;
        if (hVar == null) {
            InterfaceC5431s U10 = c9974i.f100338c.U();
            hVar = U10 instanceof E30.h ? (E30.h) U10 : null;
        }
        if (hVar == null) {
            WeakReference a12 = InterfaceC9967b.a.a();
            if (a12 != null && (activity = (Activity) a12.get()) != null) {
                window = activity.getWindow();
            }
            Window window2 = window;
            if (window2 != null) {
                aVar.p(false);
                r rVar = r.f102402a;
                p.a k11 = rVar.k(aVar.j());
                if (k11 != null) {
                    k11.b(aVar);
                    rVar.m(k11);
                    return;
                } else {
                    Context context = window2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    new j(context, rVar, aVar).r(window2);
                    return;
                }
            }
            return;
        }
        t tVar = t.f102407a;
        p.a j11 = tVar.j(aVar.j());
        boolean z15 = (j11 == null || (a11 = j11.a()) == null || !a11.isAttachedToWindow()) ? false : true;
        if (j11 != null && !z15) {
            String id3 = j11.getId();
            if (id3 == null) {
                id3 = "";
            }
            c9974i.c(id3, "");
            j11 = null;
        }
        if (z13 && z14 && j11 == null) {
            LinearLayout provideWindowTop = hVar.provideWindowTop();
            if (provideWindowTop != null) {
                Context context2 = provideWindowTop.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                j jVar = new j(context2, tVar, aVar);
                jVar.p(new Function2() { // from class: u50.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int intValue3 = ((Integer) obj2).intValue();
                        return C9974i.e(C9974i.this, str, (String) obj, intValue3);
                    }
                });
                jVar.q(provideWindowTop);
                return;
            }
            return;
        }
        if (z13 && !z14 && j11 == null) {
            LinearLayout provideWindowBottom = hVar.provideWindowBottom();
            if (provideWindowBottom != null) {
                Context context3 = provideWindowBottom.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                j jVar2 = new j(context3, tVar, aVar);
                jVar2.p(new Function2() { // from class: u50.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int intValue3 = ((Integer) obj2).intValue();
                        return C9974i.i(C9974i.this, str, (String) obj, intValue3);
                    }
                });
                jVar2.q(provideWindowBottom);
                return;
            }
            return;
        }
        if (!z13 && z14 && j11 == null) {
            LinearLayout provideFragmentTop = hVar.provideFragmentTop();
            if (provideFragmentTop != null) {
                Context context4 = provideFragmentTop.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                j jVar3 = new j(context4, tVar, aVar);
                jVar3.p(new Function2() { // from class: u50.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int intValue3 = ((Integer) obj2).intValue();
                        return C9974i.h(C9974i.this, str, (String) obj, intValue3);
                    }
                });
                jVar3.q(provideFragmentTop);
                return;
            }
            return;
        }
        if (z13 || z14 || j11 != null) {
            if (j11 != null) {
                j11.b(aVar);
                tVar.k(j11);
                return;
            }
            return;
        }
        LinearLayout provideFragmentBottom = hVar.provideFragmentBottom();
        if (provideFragmentBottom != null) {
            Context context5 = provideFragmentBottom.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            j jVar4 = new j(context5, tVar, aVar);
            jVar4.p(new Function2() { // from class: u50.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int intValue3 = ((Integer) obj2).intValue();
                    return C9974i.j(C9974i.this, str, (String) obj, intValue3);
                }
            });
            jVar4.q(provideFragmentBottom);
        }
    }

    public static Unit h(C9974i c9974i, String str, String bottomId, int i11) {
        Intrinsics.checkNotNullParameter(bottomId, "bottomId");
        c9974i.k(i11, bottomId, str);
        return Unit.f71690a;
    }

    public static Unit i(C9974i c9974i, String str, String bottomId, int i11) {
        Intrinsics.checkNotNullParameter(bottomId, "bottomId");
        c9974i.k(i11, bottomId, str);
        return Unit.f71690a;
    }

    public static Unit j(C9974i c9974i, String str, String bottomId, int i11) {
        Intrinsics.checkNotNullParameter(bottomId, "bottomId");
        c9974i.k(i11, bottomId, str);
        return Unit.f71690a;
    }

    private final void k(int i11, String str, String str2) {
        if (i11 == 2) {
            ActionResult2.INSTANCE.getClass();
            String a11 = ActionResult2.Companion.a(str2);
            this.f100339d.c(C10837a.a(ActionResult2UI.INSTANCE.dismissed(str)), a11);
        }
    }

    @Override // com.detmir.recycli.adapters.ScrollKeeper.a
    @NotNull
    public final ScrollKeeper L(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f100336a.L(id2);
    }

    @Override // u50.InterfaceC9967b
    @NotNull
    public final Set<String> a() {
        return e0.f(t.f102407a.i(), r.f102402a.j());
    }

    @Override // u50.InterfaceC9967b
    public final void b() {
        k.a(new ru.ozon.fintech.ui.input.b(1));
    }

    @Override // u50.InterfaceC9967b
    public final void c(@NotNull String id2, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        k.a(new D90.b(id2, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u50.InterfaceC9967b
    public final void d(Parcelable parcelable, @NotNull final String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        final M m11 = new M();
        final ArrayList arrayList = new ArrayList();
        if (parcelable != null) {
            m11.f71787a = parcelable instanceof Cbottom2SnackDTO ? (Cbottom2SnackDTO) parcelable : 0;
        }
        this.f100340e.post(new Runnable() { // from class: u50.c
            @Override // java.lang.Runnable
            public final void run() {
                C9974i.g(M.this, arrayList, this, uuid);
            }
        });
    }
}
