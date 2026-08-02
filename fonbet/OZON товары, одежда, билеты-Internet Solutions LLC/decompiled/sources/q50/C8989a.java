package q50;

import Ae.O0;
import Ae.x0;
import E30.i;
import android.graphics.Rect;
import android.os.Parcelable;
import com.detmir.recycli.adapters.RecyclerItem;
import com.detmir.recycli.adapters.ScrollKeeper;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r50.C9174a;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.columnV20.ColumnV20State;
import x40.C10656a;

/* renamed from: q50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8989a extends G40.a<Cbottom2SheetDTO> implements ScrollKeeper.a {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ ScrollKeeper.b f81710d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10656a f81711e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f81712f;

    /* renamed from: g, reason: collision with root package name */
    private Cbottom2SheetDTO f81713g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f81714h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f81715i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<ColumnV20State> f81716j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final x0<List<RecyclerItem>> f81717k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private x0<Pair<RecyclerItem, RecyclerItem>> f81718l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<C9174a> f81719m;

    /* renamed from: q50.a$a, reason: collision with other inner class name */
    /* synthetic */ class C1376a extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C8989a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: q50.a$b */
    /* synthetic */ class b extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C8989a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: q50.a$c */
    /* synthetic */ class c extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C8989a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8989a(@NotNull C10656a cbottomMapper2, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC6083a exchanger) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f81710d = new ScrollKeeper.b();
        this.f81711e = cbottomMapper2;
        this.f81712f = fintechAnalyticInteractor;
        this.f81714h = O0.a(Boolean.TRUE);
        K k11 = K.f71697a;
        this.f81715i = O0.a(k11);
        this.f81716j = O0.a(null);
        this.f81717k = O0.a(k11);
        this.f81718l = O0.a(null);
        this.f81719m = O0.a(null);
    }

    @Override // com.detmir.recycli.adapters.ScrollKeeper.a
    @NotNull
    public final ScrollKeeper L(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f81710d.L(id2);
    }

    @Override // G40.a
    public final Cbottom2SheetDTO f0() {
        return this.f81713g;
    }

    @Override // G40.a
    public void g0() {
        this.f81712f.a(i0());
        super.g0();
    }

    @Override // G40.a
    protected final void handleState() {
        List<Integer> footerPaddings;
        List<Integer> mainPaddings;
        List<F40.a> footer;
        String id2;
        List<F40.a> main;
        String id3;
        List<F40.a> header;
        String id4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cbottom2SheetDTO cbottom2SheetDTO = this.f81713g;
        String str = "";
        C10656a c10656a = this.f81711e;
        if (cbottom2SheetDTO != null && (header = cbottom2SheetDTO.getHeader()) != null) {
            Cbottom2SheetDTO cbottom2SheetDTO2 = this.f81713g;
            String str2 = (cbottom2SheetDTO2 == null || (id4 = cbottom2SheetDTO2.getId()) == null) ? "" : id4;
            C1376a c1376a = new C1376a(1, this, C8989a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList2.addAll(C10656a.b(str2, header, c1376a, this));
        }
        ColumnV20State.Companion companion = ColumnV20State.INSTANCE;
        String i02 = i0();
        Cbottom2SheetDTO cbottom2SheetDTO3 = this.f81713g;
        Rect rect = null;
        ColumnV20State create = companion.create(i02, "topColumn", arrayList2, i.b(cbottom2SheetDTO3 != null ? cbottom2SheetDTO3.getHeaderPaddings() : null));
        Cbottom2SheetDTO cbottom2SheetDTO4 = this.f81713g;
        if (cbottom2SheetDTO4 != null && (main = cbottom2SheetDTO4.getMain()) != null) {
            Cbottom2SheetDTO cbottom2SheetDTO5 = this.f81713g;
            String str3 = (cbottom2SheetDTO5 == null || (id3 = cbottom2SheetDTO5.getId()) == null) ? "" : id3;
            b bVar = new b(1, this, C8989a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList.addAll(C10656a.b(str3, main, bVar, this));
        }
        ArrayList arrayList3 = new ArrayList();
        Cbottom2SheetDTO cbottom2SheetDTO6 = this.f81713g;
        if (cbottom2SheetDTO6 != null && (footer = cbottom2SheetDTO6.getFooter()) != null) {
            Cbottom2SheetDTO cbottom2SheetDTO7 = this.f81713g;
            if (cbottom2SheetDTO7 != null && (id2 = cbottom2SheetDTO7.getId()) != null) {
                str = id2;
            }
            c cVar = new c(1, this, C8989a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList3.addAll(C10656a.b(str, footer, cVar, this));
        }
        Cbottom2SheetDTO cbottom2SheetDTO8 = this.f81713g;
        boolean d11 = cbottom2SheetDTO8 != null ? Intrinsics.d(cbottom2SheetDTO8.getExpanded(), Boolean.TRUE) : false;
        Cbottom2SheetDTO cbottom2SheetDTO9 = this.f81713g;
        boolean d12 = cbottom2SheetDTO9 != null ? Intrinsics.d(cbottom2SheetDTO9.getDashHidden(), Boolean.TRUE) : false;
        Cbottom2SheetDTO cbottom2SheetDTO10 = this.f81713g;
        Rect b11 = (cbottom2SheetDTO10 == null || (mainPaddings = cbottom2SheetDTO10.getMainPaddings()) == null) ? null : i.b(mainPaddings);
        Cbottom2SheetDTO cbottom2SheetDTO11 = this.f81713g;
        if (cbottom2SheetDTO11 != null && (footerPaddings = cbottom2SheetDTO11.getFooterPaddings()) != null) {
            rect = i.b(footerPaddings);
        }
        C9174a c9174a = new C9174a(d11, d12, b11, rect);
        this.f81717k.setValue(arrayList3);
        this.f81715i.setValue(arrayList);
        this.f81716j.setValue(create);
        this.f81719m.setValue(c9174a);
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String id2;
        Cbottom2SheetDTO cbottom2SheetDTO = this.f81713g;
        return (cbottom2SheetDTO == null || (id2 = cbottom2SheetDTO.getId()) == null) ? "" : id2;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, null);
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2SheetDTO)) {
            this.f81713g = (Cbottom2SheetDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f81713g = (Cbottom2SheetDTO) this.f81711e.d(str);
        }
        handleState();
    }

    @NotNull
    public final x0<Pair<RecyclerItem, RecyclerItem>> k0() {
        return this.f81718l;
    }

    @NotNull
    public final x0<List<RecyclerItem>> l0() {
        return this.f81717k;
    }

    @NotNull
    public final x0<Boolean> m0() {
        return this.f81714h;
    }

    @NotNull
    public final x0<List<RecyclerItem>> n0() {
        return this.f81715i;
    }

    @NotNull
    public final x0<C9174a> p0() {
        return this.f81719m;
    }

    @NotNull
    public final x0<ColumnV20State> q0() {
        return this.f81716j;
    }

    public final void r0() {
        String id2;
        Cbottom2SheetDTO cbottom2SheetDTO = this.f81713g;
        if (cbottom2SheetDTO == null || (id2 = cbottom2SheetDTO.getId()) == null) {
            return;
        }
        h0(id2);
    }
}
