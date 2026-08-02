package ru.ozon.fintech.features.cbottomstories.presentation;

import A50.c;
import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import C50.d;
import android.os.Parcelable;
import d40.InterfaceC6083a;
import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2StoriesDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;
import z50.C10989c;
import z50.InterfaceC10990d;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class a extends G40.a<Cbottom2StoriesDTO> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f95387d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10656a f95388e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f95389f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC10990d f95390g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final c f95391h;

    /* renamed from: i, reason: collision with root package name */
    private Cbottom2StoriesDTO f95392i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<d> f95393j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0 f95394k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C0 f95395l;

    /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.a$a, reason: collision with other inner class name */
    /* synthetic */ class C2027a extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ class b extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.k0((a) this.receiver);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull InterfaceC6083a exchanger, @NotNull C10656a cbottomMapper2, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC10990d storiesDisplay) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(storiesDisplay, "storiesDisplay");
        this.f95387d = exchanger;
        this.f95388e = cbottomMapper2;
        this.f95389f = fintechSettings;
        this.f95390g = storiesDisplay;
        c cVar = new c(cbottomMapper2, exchanger);
        C2027a c2027a = new C2027a(1, this, a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
        Intrinsics.checkNotNullParameter(c2027a, "<set-?>");
        cVar.f464j = c2027a;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        Intrinsics.checkNotNullParameter(a11, "<set-?>");
        cVar.f462h = a11;
        b bVar = new b(0, this, a.class, "dismiss", "dismiss()V", 0);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        cVar.f463i = bVar;
        this.f95391h = cVar;
        this.f95393j = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f95394k = E0.a(0, 1, enumC11113a);
        this.f95395l = E0.a(0, 1, enumC11113a);
    }

    public static final void k0(a aVar) {
        aVar.f95391h.f();
        aVar.f95395l.tryEmit(Boolean.TRUE);
    }

    @Override // G40.a
    public final Cbottom2StoriesDTO f0() {
        return this.f95392i;
    }

    @Override // G40.a
    public final void g0() {
        C10989c.b(this.f95389f.isQa());
        super.g0();
    }

    @Override // G40.a
    protected final void handleState() {
        this.f95393j.setValue(this.f95391h.p());
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String c11;
        d p11 = this.f95391h.p();
        return (p11 == null || (c11 = p11.c()) == null) ? "" : c11;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, bool);
        c cVar = this.f95391h;
        cVar.I(uuid);
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2StoriesDTO)) {
            this.f95392i = (Cbottom2StoriesDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f95392i = (Cbottom2StoriesDTO) this.f95388e.d(str);
        }
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            cVar.H(this.f95392i);
            handleState();
        } else {
            Cbottom2StoriesDTO cbottom2StoriesDTO = this.f95392i;
            int selectedStory = cbottom2StoriesDTO != null ? cbottom2StoriesDTO.getSelectedStory() : 0;
            Cbottom2StoriesDTO cbottom2StoriesDTO2 = this.f95392i;
            cVar.G(selectedStory, cbottom2StoriesDTO2 != null ? cbottom2StoriesDTO2.getSelectedFrame() : 0);
        }
    }

    public final void l0() {
        this.f95390g.c(i0(), getUuid());
    }

    @NotNull
    public final C0 m0() {
        return this.f95394k;
    }

    @NotNull
    public final C0 n0() {
        return this.f95395l;
    }

    @NotNull
    public final c p0() {
        return this.f95391h;
    }

    @NotNull
    public final x0<d> q0() {
        return this.f95393j;
    }

    public final boolean r0() {
        return this.f95389f.isStandAloneIntegration();
    }

    public final void s0() {
        Cbottom2StoriesDTO cbottom2StoriesDTO = this.f95392i;
        if (cbottom2StoriesDTO != null) {
            String id2 = cbottom2StoriesDTO.getId();
            if (id2 == null) {
                id2 = "";
            }
            h0(id2);
        }
    }
}
