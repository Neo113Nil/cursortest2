package z90;

import Ae.O0;
import Ae.x0;
import B0.A0;
import T80.c;
import aa.C4987a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.core.app.t;
import androidx.core.content.FileProvider;
import d40.InterfaceC6083a;
import ha0.C6903a;
import i70.C7018a;
import ja.v;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import v50.g;
import v50.h;

/* loaded from: classes3.dex */
public final class e extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f107377a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f107378b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f107379c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f107380d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final K40.a f107381e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f107382f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f107383g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f107384h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f107385i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f107386j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f107387k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f107388l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f107389m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f107390n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f107391o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f107392p;

    /* renamed from: q, reason: collision with root package name */
    private String f107393q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final x0<x90.c> f107394r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final x0<x90.a> f107395s;

    /* synthetic */ class a extends C7735q implements Function1<MenuItem, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItem menuItem) {
            MenuItem p02 = menuItem;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((e) this.receiver).u0(p02);
            return Unit.f71690a;
        }
    }

    public e(@NotNull Application application, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6083a exchanger, @NotNull K40.a cbottomDisplay, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107377a = application;
        this.f107378b = fintechNavigation;
        this.f107379c = fintechSettings;
        this.f107380d = exchanger;
        this.f107381e = cbottomDisplay;
        this.f107382f = true;
        this.f107383g = true;
        this.f107384h = true;
        this.f107387k = true;
        this.f107391o = true;
        String string = context.getString(R.string.fintech_preference_camera_settings);
        int three_dots_menu_res = FinToolbarState.INSTANCE.getTHREE_DOTS_MENU_RES();
        FinToolbarState finToolbarState = new FinToolbarState(string, null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new C7018a(this, 3), Integer.valueOf(three_dots_menu_res), null, null, new a(1, this, e.class, "dotsClicked", "dotsClicked(Landroid/view/MenuItem;)V", 0), 17, 25086, null);
        String string2 = context.getString(R.string.fintech_preference_settings_start_button);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f107394r = O0.a(new x90.c(finToolbarState, new FinLargeButtonState("goto", string2, new C4987a(this, 3), null, null, null, null, null, null, 504, null)));
        this.f107395s = O0.a(null);
    }

    public static Unit d0(e eVar) {
        eVar.f107390n = false;
        eVar.f107391o = false;
        eVar.f107392p = true;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit e0(e eVar) {
        eVar.f107378b.pop();
        return Unit.f71690a;
    }

    public static Unit f0(e eVar) {
        eVar.f107384h = false;
        eVar.f107385i = true;
        eVar.f107386j = false;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit g0(e eVar) {
        eVar.f107383g = true;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit h0(e eVar) {
        eVar.f107387k = true;
        eVar.f107388l = false;
        eVar.f107389m = false;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit i0(e eVar) {
        eVar.f107384h = true;
        eVar.f107385i = false;
        eVar.f107386j = false;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit j0(e eVar) {
        eVar.f107387k = false;
        eVar.f107388l = false;
        eVar.f107389m = true;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit k0(e eVar) {
        eVar.f107383g = false;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit l0(e eVar) {
        eVar.f107390n = false;
        eVar.f107391o = true;
        eVar.f107392p = false;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit m0(e eVar) {
        S80.b bVar = eVar.f107378b;
        String str = eVar.f107386j ? "PASSPORT" : (!eVar.f107384h && eVar.f107385i) ? "REGISTRATION" : "NONE";
        boolean z11 = eVar.f107382f;
        boolean z12 = eVar.f107383g;
        String str2 = "SD";
        if (!eVar.f107387k) {
            if (eVar.f107388l) {
                str2 = "HD";
            } else if (eVar.f107389m) {
                str2 = "FHD";
            }
        }
        c.a.a(bVar, str, null, null, false, null, false, z11, null, null, null, null, null, null, z12, eVar.f107390n ? 3000L : eVar.f107391o ? 5000L : eVar.f107392p ? 10000L : 5000L, str2, null, 73662);
        return Unit.f71690a;
    }

    public static Unit n0(e eVar, ActionResult2 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.d(result.getType(), "CLICK") && Intrinsics.d(result.getWidgetId(), "PASSPORT")) {
            eVar.y0("PASSPORT");
        } else if (Intrinsics.d(result.getType(), "CLICK") && Intrinsics.d(result.getWidgetId(), "NONE")) {
            eVar.y0("NONE");
        } else if (Intrinsics.d(result.getType(), "CLICK") && Intrinsics.d(result.getWidgetId(), "REGISTRATION")) {
            eVar.y0("REGISTRATION");
        } else if (Intrinsics.d(result.getType(), "CLICK") && Intrinsics.d(result.getWidgetId(), "DELETE")) {
            Toast.makeText(eVar.f107377a, "Очистили сохраненные видео", 0).show();
            Application application = eVar.f107377a;
            Gf.d.b(new File(application.getFilesDir(), "/fin_video"));
            Gf.d.b(new File(application.getFilesDir(), "/fin_video_combined"));
        }
        return Unit.f71690a;
    }

    public static Unit p0(e eVar) {
        eVar.f107384h = false;
        eVar.f107385i = false;
        eVar.f107386j = true;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit q0(e eVar) {
        eVar.f107382f = true;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit r0(e eVar) {
        eVar.f107382f = false;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit s0(e eVar) {
        eVar.f107390n = true;
        eVar.f107391o = false;
        eVar.f107392p = false;
        eVar.z0();
        return Unit.f71690a;
    }

    public static Unit t0(e eVar) {
        eVar.f107387k = false;
        eVar.f107388l = true;
        eVar.f107389m = false;
        eVar.z0();
        return Unit.f71690a;
    }

    private final void z0() {
        this.f107395s.setValue(new x90.a(new FinRadioButtonState(R.string.fintech_preference_camera_settings_back, null, this.f107382f, 0, null, null, new i70.c(this, 1), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_front, null, !this.f107382f, 0, null, null, new i70.d(this, 1), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_pass, null, this.f107386j, 0, null, null, new Function1() { // from class: z90.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.p0(e.this);
            }
        }, 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_req, null, this.f107385i, 0, null, null, new v(this, 2), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_selfie, null, this.f107384h, 0, null, null, new C6903a(this, 2), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_enable, null, this.f107383g, 0, null, null, new k60.d(this, 2), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_disabled, null, !this.f107383g, 0, null, null, new Function1() { // from class: z90.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.k0(e.this);
            }
        }, 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_sd, null, this.f107387k, 0, null, null, new Function1() { // from class: z90.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.h0(e.this);
            }
        }, 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_hd, null, this.f107388l, 0, null, null, new g(this, 1), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_fhd, null, this.f107389m, 0, null, null, new h(this, 1), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_chunk3, null, this.f107390n, 0, null, null, new I90.d(this, 2), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_chunk5, null, this.f107391o, 0, null, null, new I90.e(this, 3), 56, null), new FinRadioButtonState(R.string.fintech_preference_camera_settings_video_chunk10, null, this.f107392p, 0, null, null, new ha.d(this, 4), 56, null)));
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.f107393q;
        if (str == null) {
            Intrinsics.n("uuid");
            throw null;
        }
        companion.getClass();
        this.f107380d.a(ActionResult2.Companion.a(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        ArrayList arrayList = new ArrayList();
        Application application = this.f107377a;
        File file = new File(application.getFilesDir(), "/fin_video_combined/PHOTO_PASSPORT.mp4");
        File file2 = new File(application.getFilesDir(), "/fin_video_combined/PHOTO_NONE.mp4");
        File file3 = new File(application.getFilesDir(), "/fin_video_combined/PHOTO_REGISTRATION.mp4");
        if (file.exists()) {
            ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_500;
            CbottomElement2 cbottomElement2 = null;
            String str = "PASSPORT";
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Float f7 = null;
            arrayList.add(new FinButtonV22DTO(cbottomElement2, str, num, Boolean.TRUE, bool, bool2, bool3, num2, num3, num4, num5, f7, C7714v.b0(16, 24, 16, 24), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Видео Пасспорт", sizes, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, -805310475, 16383, null));
        }
        if (file2.exists()) {
            ButtonV3DTO.Sizes sizes2 = ButtonV3DTO.Sizes.SIZE_500;
            CbottomElement2 cbottomElement22 = null;
            String str2 = "NONE";
            Integer num6 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            Float f11 = null;
            arrayList.add(new FinButtonV22DTO(cbottomElement22, str2, num6, Boolean.TRUE, bool4, bool5, bool6, num7, num8, num9, num10, f11, C7714v.b0(16, 24, 16, 24), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Видео Селфи", sizes2, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, -805310475, 16383, null));
        }
        if (file3.exists()) {
            ButtonV3DTO.Sizes sizes3 = ButtonV3DTO.Sizes.SIZE_500;
            CbottomElement2 cbottomElement23 = null;
            String str3 = "REGISTRATION";
            Integer num11 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Integer num12 = null;
            Integer num13 = null;
            Integer num14 = null;
            Integer num15 = null;
            Float f12 = null;
            arrayList.add(new FinButtonV22DTO(cbottomElement23, str3, num11, Boolean.TRUE, bool7, bool8, bool9, num12, num13, num14, num15, f12, C7714v.b0(16, 24, 16, 24), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Видео Регистрация", sizes3, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, -805310475, 16383, null));
        }
        ButtonV3DTO.Sizes sizes4 = ButtonV3DTO.Sizes.SIZE_500;
        String str4 = "DELETE";
        CbottomElement2 cbottomElement24 = null;
        Integer num16 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Float f13 = null;
        arrayList.add(new FinButtonV22DTO(cbottomElement24, str4, num16, Boolean.TRUE, bool10, bool11, bool12, num17, num18, num19, num20, f13, C7714v.b0(16, 24, 16, 24), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Удалить все", sizes4, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, -805310475, 16383, null));
        Boolean bool13 = Boolean.FALSE;
        Cbottom2SheetDTO cbottom2SheetDTO = new Cbottom2SheetDTO("xxx", null, null, null, arrayList, null, bool13, bool13, null, null == true ? 1 : 0, null, 6, null == true ? 1 : 0);
        CbottomType cbottomType = CbottomType.SHEET;
        String str5 = this.f107393q;
        if (str5 != null) {
            this.f107381e.g(cbottom2SheetDTO, cbottomType, str5, null);
        } else {
            Intrinsics.n("uuid");
            throw null;
        }
    }

    @NotNull
    public final x0<x90.a> v0() {
        return this.f107395s;
    }

    @NotNull
    public final x0<x90.c> w0() {
        return this.f107394r;
    }

    public final void x0(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f107393q = uuid;
        z0();
        ActionResult2.INSTANCE.getClass();
        this.f107380d.b(ActionResult2.Companion.a(uuid), androidx.lifecycle.x0.a(this), false, new Function1() { // from class: z90.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.n0(e.this, (ActionResult2) obj);
            }
        });
    }

    public final void y0(@NotNull String qualifier) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        String concat = "result=".concat(qualifier);
        Application application = this.f107377a;
        Toast.makeText(application, concat, 0).show();
        Uri d11 = FileProvider.d(application, this.f107379c.i(), new File(application.getFilesDir(), A0.b("/fin_video_combined/PHOTO_", qualifier, ".mp4")));
        Activity c11 = this.f107378b.c();
        Intrinsics.f(c11);
        t.a aVar = new t.a(c11);
        aVar.e(d11);
        aVar.g("video/mp4");
        aVar.h();
    }
}
