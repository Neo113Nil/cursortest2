package k50;

import Ae.O0;
import Ae.x0;
import E30.i;
import G.g;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Parcelable;
import d40.InterfaceC6083a;
import j50.InterfaceC7285a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l50.C7877a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;
import ru.ozon.fintech.ui.ActionResult2UI;
import x40.C10656a;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: k50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7594a extends G40.a<Cbottom2ScreenDTO> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f70905d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10656a f70906e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7285a f70907f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<C7877a> f70908g;

    /* renamed from: h, reason: collision with root package name */
    private C7877a f70909h;

    /* renamed from: i, reason: collision with root package name */
    private Cbottom2ScreenDTO f70910i;

    /* renamed from: j, reason: collision with root package name */
    private String f70911j;

    /* renamed from: k50.a$a, reason: collision with other inner class name */
    /* synthetic */ class C1157a extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C7594a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: k50.a$b */
    /* synthetic */ class b extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C7594a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: k50.a$c */
    /* synthetic */ class c extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C7594a) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7594a(@NotNull InterfaceC6083a exchanger, @NotNull C10656a cbottomMapper2, @NotNull InterfaceC7285a screenDisplay) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(screenDisplay, "screenDisplay");
        this.f70905d = exchanger;
        this.f70906e = cbottomMapper2;
        this.f70907f = screenDisplay;
        this.f70908g = O0.a(null);
    }

    @Override // G40.a
    public final Cbottom2ScreenDTO f0() {
        return this.f70910i;
    }

    @Override // G40.a
    protected final void handleState() {
        this.f70908g.setValue(this.f70909h);
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String id2;
        String str = this.f70911j;
        if (str != null) {
            return g.c(str, "#", getUuid());
        }
        Cbottom2ScreenDTO cbottom2ScreenDTO = this.f70910i;
        return (cbottom2ScreenDTO == null || (id2 = cbottom2ScreenDTO.getId()) == null) ? "" : id2;
    }

    public final void init(String str) {
        this.f70911j = str;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Rect a11;
        Rect a12;
        Rect a13;
        List<Integer> footerPaddings;
        List<Integer> headerPaddings;
        List<Integer> mainPaddings;
        String id2;
        List<F40.a> main;
        String id3;
        List<F40.a> footer;
        List<F40.a> header;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, null);
        C10656a c10656a = this.f70906e;
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2ScreenDTO)) {
            this.f70910i = (Cbottom2ScreenDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f70910i = (Cbottom2ScreenDTO) c10656a.d(str);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Cbottom2ScreenDTO cbottom2ScreenDTO = this.f70910i;
        if (cbottom2ScreenDTO != null && (header = cbottom2ScreenDTO.getHeader()) != null) {
            String i02 = i0();
            C1157a c1157a = new C1157a(1, this, C7594a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList2.addAll(C10656a.b(i02, header, c1157a, null));
        }
        Cbottom2ScreenDTO cbottom2ScreenDTO2 = this.f70910i;
        if (cbottom2ScreenDTO2 != null && (footer = cbottom2ScreenDTO2.getFooter()) != null) {
            String i03 = i0();
            b bVar = new b(1, this, C7594a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList3.addAll(C10656a.b(i03, footer, bVar, null));
        }
        Cbottom2ScreenDTO cbottom2ScreenDTO3 = this.f70910i;
        String str2 = "";
        if (cbottom2ScreenDTO3 != null && (main = cbottom2ScreenDTO3.getMain()) != null) {
            Cbottom2ScreenDTO cbottom2ScreenDTO4 = this.f70910i;
            String str3 = (cbottom2ScreenDTO4 == null || (id3 = cbottom2ScreenDTO4.getId()) == null) ? "" : id3;
            c cVar = new c(1, this, C7594a.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
            c10656a.getClass();
            arrayList.addAll(C10656a.b(str3, main, cVar, null));
        }
        Cbottom2ScreenDTO cbottom2ScreenDTO5 = this.f70910i;
        if (cbottom2ScreenDTO5 != null && (id2 = cbottom2ScreenDTO5.getId()) != null) {
            str2 = id2;
        }
        Cbottom2ScreenDTO cbottom2ScreenDTO6 = this.f70910i;
        boolean d11 = cbottom2ScreenDTO6 != null ? Intrinsics.d(cbottom2ScreenDTO6.getScrollable(), Boolean.TRUE) : false;
        Cbottom2ScreenDTO cbottom2ScreenDTO7 = this.f70910i;
        String imageUrl = cbottom2ScreenDTO7 != null ? cbottom2ScreenDTO7.getImageUrl() : null;
        Cbottom2ScreenDTO cbottom2ScreenDTO8 = this.f70910i;
        String backgroundColor = cbottom2ScreenDTO8 != null ? cbottom2ScreenDTO8.getBackgroundColor() : null;
        Cbottom2ScreenDTO cbottom2ScreenDTO9 = this.f70910i;
        if (cbottom2ScreenDTO9 == null || (mainPaddings = cbottom2ScreenDTO9.getMainPaddings()) == null || (a11 = i.b(mainPaddings)) == null) {
            a11 = i.a();
        }
        Rect rect = a11;
        Cbottom2ScreenDTO cbottom2ScreenDTO10 = this.f70910i;
        if (cbottom2ScreenDTO10 == null || (headerPaddings = cbottom2ScreenDTO10.getHeaderPaddings()) == null || (a12 = i.b(headerPaddings)) == null) {
            a12 = i.a();
        }
        Rect rect2 = a12;
        Cbottom2ScreenDTO cbottom2ScreenDTO11 = this.f70910i;
        if (cbottom2ScreenDTO11 == null || (footerPaddings = cbottom2ScreenDTO11.getFooterPaddings()) == null || (a13 = i.b(footerPaddings)) == null) {
            a13 = i.a();
        }
        Rect rect3 = a13;
        Boolean bool2 = null;
        H40.a aVar = new H40.a(str2, arrayList2, arrayList3, arrayList, rect, rect3, rect2, imageUrl, d11, backgroundColor);
        String i04 = i0();
        Cbottom2ScreenDTO cbottom2ScreenDTO12 = this.f70910i;
        if (cbottom2ScreenDTO12 != null) {
            bool2 = cbottom2ScreenDTO12.getCanClose();
        }
        this.f70909h = new C7877a(i04, bool2, aVar);
        handleState();
    }

    @NotNull
    public final x0<C7877a> k0() {
        return this.f70908g;
    }

    @Override // G40.a
    public final void onBackPressed() {
        super.onBackPressed();
        Cbottom2ScreenDTO cbottom2ScreenDTO = this.f70910i;
        if (cbottom2ScreenDTO != null ? Intrinsics.d(cbottom2ScreenDTO.getCanClose(), Boolean.TRUE) : false) {
            this.f70907f.c(i0(), getUuid(), null);
        }
    }

    @Override // G40.a
    public final void onDestroy() {
        if (this.f70909h != null) {
            h0(i0());
            super.onDestroy();
        }
    }
}
