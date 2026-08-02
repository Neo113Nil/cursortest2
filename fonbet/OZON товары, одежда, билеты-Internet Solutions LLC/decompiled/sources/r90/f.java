package r90;

import Sc.o;
import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import g30.InterfaceC6618a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.InterfaceC9218a;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinButtonV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinImageV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import s90.C9632a;
import s90.C9633b;
import s90.C9634c;
import s90.C9635d;
import s90.InterfaceC9636e;
import s90.h;
import s90.i;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f83224a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9634c f83225b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final s90.f f83226c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f83227d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9632a f83228e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C9633b f83229f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C9635d f83230g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f83231h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC9218a f83232i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f83233j;

    /* renamed from: k, reason: collision with root package name */
    private w0 f83234k;

    public interface a {
        void permissionUpdated(AbstractC9782b abstractC9782b);
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83235a;

        static {
            int[] iArr = new int[InterfaceC9218a.EnumC1415a.values().length];
            try {
                iArr[InterfaceC9218a.EnumC1415a.PERMISSION_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC9218a.EnumC1415a.NEED_PERMISSION_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC9218a.EnumC1415a.NEED_PERMISSION_RATIONALE_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC9218a.EnumC1415a.NEED_OPEN_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f83235a = iArr;
        }
    }

    public f(@NotNull i writeExternalStoragePermission, @NotNull C9634c cameraPermission, @NotNull s90.f readContactsPermission, @NotNull h recordAudioPermission, @NotNull C9632a accessCoarseLocationPermission, @NotNull C9633b accessFineLocationPermission, @NotNull C9635d notificationsPermission, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC9218a fintechPermissionManager, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(writeExternalStoragePermission, "writeExternalStoragePermission");
        Intrinsics.checkNotNullParameter(cameraPermission, "cameraPermission");
        Intrinsics.checkNotNullParameter(readContactsPermission, "readContactsPermission");
        Intrinsics.checkNotNullParameter(recordAudioPermission, "recordAudioPermission");
        Intrinsics.checkNotNullParameter(accessCoarseLocationPermission, "accessCoarseLocationPermission");
        Intrinsics.checkNotNullParameter(accessFineLocationPermission, "accessFineLocationPermission");
        Intrinsics.checkNotNullParameter(notificationsPermission, "notificationsPermission");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechPermissionManager, "fintechPermissionManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f83224a = writeExternalStoragePermission;
        this.f83225b = cameraPermission;
        this.f83226c = readContactsPermission;
        this.f83227d = recordAudioPermission;
        this.f83228e = accessCoarseLocationPermission;
        this.f83229f = accessFineLocationPermission;
        this.f83230g = notificationsPermission;
        this.f83231h = fintechSettings;
        this.f83232i = fintechPermissionManager;
        this.f83233j = fintechAnalyticInteractor;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.w0, r90.f$a] */
    private final void e(List<? extends InterfaceC9636e> list, Activity activity, boolean z11) {
        AbstractC9782b j11 = j(list, activity, false);
        j11.c(z11);
        ?? r32 = this.f83234k;
        if (r32 != 0) {
            r32.permissionUpdated(j11);
        }
        boolean z12 = j11 instanceof AbstractC9782b.c;
        InterfaceC6618a interfaceC6618a = this.f83233j;
        i iVar = this.f83224a;
        if (z12) {
            iVar.getClass();
            interfaceC6618a.I1();
        } else if (j11 instanceof AbstractC9782b.d) {
            iVar.getClass();
            interfaceC6618a.q1();
        }
    }

    private final AbstractC9782b j(List<? extends InterfaceC9636e> list, Activity activity, boolean z11) {
        boolean z12;
        List<? extends InterfaceC9636e> list2 = list;
        boolean z13 = list2 instanceof Collection;
        InterfaceC9218a interfaceC9218a = this.f83232i;
        boolean z14 = false;
        if (!z13 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (interfaceC9218a.a(((InterfaceC9636e) it.next()).a())) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (!z13 || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!((InterfaceC9636e) it2.next()).e()) {
                    break;
                }
            }
        }
        z14 = true;
        InterfaceC9636e interfaceC9636e = (InterfaceC9636e) C7714v.K(list);
        int d11 = interfaceC9636e.d();
        InterfaceC9218a.EnumC1415a enumC1415a = InterfaceC9218a.EnumC1415a.NEED_OPEN_SETTINGS;
        if (!z12 || !z14) {
            return new AbstractC9782b.e(list);
        }
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            InterfaceC9218a.EnumC1415a b11 = interfaceC9218a.b(activity, ((InterfaceC9636e) it3.next()).a(), z11);
            if (b11.ordinal() < enumC1415a.ordinal()) {
                enumC1415a = b11;
            }
        }
        int i11 = b.f83235a[enumC1415a.ordinal()];
        if (i11 == 1) {
            return new AbstractC9782b.a(list);
        }
        if (i11 == 2) {
            return new AbstractC9782b.c(list);
        }
        if (i11 == 3) {
            return new AbstractC9782b.C2182b(list, d11, interfaceC9636e.b());
        }
        if (i11 == 4) {
            return new AbstractC9782b.d(list, ((InterfaceC9636e) C7714v.K(list)).f(), d11, interfaceC9636e.c());
        }
        throw new o();
    }

    public static AbstractC9781a p(AbstractC9782b abstractC9782b) {
        if (abstractC9782b == null || abstractC9782b.b()) {
            if (abstractC9782b instanceof AbstractC9782b.c) {
                return new AbstractC9781a.b(((AbstractC9782b.c) abstractC9782b).a());
            }
            return null;
        }
        if ((abstractC9782b instanceof AbstractC9782b.C2182b) || (abstractC9782b instanceof AbstractC9782b.c)) {
            return new AbstractC9781a.b(abstractC9782b.a());
        }
        if (abstractC9782b instanceof AbstractC9782b.d) {
            return new AbstractC9781a.C2181a(((AbstractC9782b.d) abstractC9782b).e());
        }
        return null;
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        e(C7714v.a0(this.f83225b), activity, true);
    }

    public final void b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        e(C7714v.a0(this.f83226c), activity, true);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.w0, r90.f$a] */
    public final void c(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("location");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        boolean a11 = androidx.core.location.b.a((LocationManager) systemService);
        C9632a c9632a = this.f83228e;
        C9633b c9633b = this.f83229f;
        if (a11) {
            e(C7714v.b0(c9633b, c9632a), activity, true);
            return;
        }
        ?? r72 = this.f83234k;
        if (r72 != 0) {
            AbstractC9782b.e eVar = new AbstractC9782b.e(C7714v.b0(c9633b, c9632a));
            eVar.c(false);
            r72.permissionUpdated(eVar);
        }
    }

    public final void d(@NotNull Activity activity, boolean z11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        e(C7714v.a0(this.f83230g), activity, z11);
    }

    public final void f(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        e(C7714v.a0(this.f83227d), activity, true);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.w0, r90.f$a] */
    public final void g(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i11 = Build.VERSION.SDK_INT;
        i iVar = this.f83224a;
        if (i11 < 29) {
            e(C7714v.a0(iVar), activity, true);
            return;
        }
        AbstractC9782b.a aVar = new AbstractC9782b.a(C7714v.a0(iVar));
        aVar.c(true);
        ?? r02 = this.f83234k;
        if (r02 != 0) {
            r02.permissionUpdated(aVar);
        }
    }

    @NotNull
    public final AbstractC9782b h(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return j(C7714v.a0(this.f83226c), activity, true);
    }

    @NotNull
    public final AbstractC9782b i(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return j(C7714v.b0(this.f83229f, this.f83228e), activity, true);
    }

    @NotNull
    public final AbstractC9782b k(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return j(C7714v.a0(this.f83230g), activity, true);
    }

    @NotNull
    public final AbstractC9782b l(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return j(C7714v.a0(this.f83227d), activity, true);
    }

    public final boolean m() {
        this.f83228e.getClass();
        return this.f83232i.a("android.permission.ACCESS_COARSE_LOCATION");
    }

    public final boolean n() {
        this.f83229f.getClass();
        return this.f83232i.a("android.permission.ACCESS_FINE_LOCATION");
    }

    public final boolean o() {
        return this.f83230g.e() && this.f83232i.a("android.permission.POST_NOTIFICATIONS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C9987a q(final AbstractC9782b abstractC9782b, @NotNull Context context, @NotNull final Function1<? super AbstractC9781a, Unit> requestPermissionAction, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestPermissionAction, "requestPermissionAction");
        if ((abstractC9782b != null && !abstractC9782b.b()) || (abstractC9782b instanceof AbstractC9782b.c)) {
            return null;
        }
        boolean z11 = abstractC9782b instanceof AbstractC9782b.C2182b;
        ru.ozon.fintech.settings.domain.a aVar = this.f83231h;
        if (z11) {
            AbstractC9782b.C2182b c2182b = (AbstractC9782b.C2182b) abstractC9782b;
            String string = context.getString(c2182b.e(), aVar.getAppName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(c2182b.d());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = context.getString(R.string.fintech_permissions_permission_rationale_request);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            Integer num = null;
            String str = "positive_btn";
            Function1 function1 = null;
            String str2 = null;
            FinLargeButtonState finLargeButtonState = new FinLargeButtonState(str, string3, new Function0(requestPermissionAction, abstractC9782b) { // from class: r90.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C7719a f83217a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC9782b f83218b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f83217a = (C7719a) requestPermissionAction;
                    this.f83218b = abstractC9782b;
                }

                /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.a] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.f83217a.invoke(new AbstractC9781a.b(((AbstractC9782b.C2182b) this.f83218b).a()));
                    return Unit.f71690a;
                }
            }, function1, FinLargeButtonState.Type.PRIMARY, null, str2, null, num, 488, null);
            String string4 = context.getString(R.string.fintech_request_permissions_negative_button);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return new C9987a(string, string2, finLargeButtonState, new FinLargeButtonState("negative_btn", string4, function0, null, FinLargeButtonState.Type.SECONDARY, str2, 0 == true ? 1 : 0, num, null, 488, null), function0);
        }
        if (!(abstractC9782b instanceof AbstractC9782b.d)) {
            if (!(abstractC9782b instanceof AbstractC9782b.a) && (abstractC9782b instanceof AbstractC9782b.e)) {
                String string5 = context.getString(R.string.fintech_permissions_no_permission_title);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String string6 = context.getString(R.string.fintech_no_manifest_permission);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return new C9987a(string5, string6, null, null, function0);
            }
            return null;
        }
        AbstractC9782b.d dVar = (AbstractC9782b.d) abstractC9782b;
        String string7 = context.getString(dVar.f(), aVar.getAppName());
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = context.getString(dVar.d());
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String string9 = context.getString(R.string.fintech_permissions_go_to_permission_settings);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        return new C9987a(string7, string8, new FinLargeButtonState("positive_btn", string9, new Function0(requestPermissionAction, abstractC9782b) { // from class: r90.d

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C7719a f83219a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC9782b f83220b;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f83219a = (C7719a) requestPermissionAction;
                this.f83220b = abstractC9782b;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.a] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f83219a.invoke(new AbstractC9781a.C2181a(((AbstractC9782b.d) this.f83220b).e()));
                return Unit.f71690a;
            }
        }, null, FinLargeButtonState.Type.PRIMARY, null, null, null, null, 488, null), null, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Cbottom2SheetDTO r(AbstractC9782b abstractC9782b, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((abstractC9782b != null && !abstractC9782b.b()) || (abstractC9782b instanceof AbstractC9782b.c)) {
            return null;
        }
        boolean z11 = abstractC9782b instanceof AbstractC9782b.C2182b;
        ru.ozon.fintech.settings.domain.a aVar = this.f83231h;
        if (z11) {
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            String str2 = null;
            FinImageV20DTO finImageV20DTO = new FinImageV20DTO(null, "perm_icon", null, null, null, null, bool, null, null, null, num, null, C7714v.b0(16, 24, 16, 12), null, null, null, null, null, null, null, null, null, null, num2, num3, null, null, null, "ic_illustration_permission_rationale_80", null, null, null, null, str, str2, null, null, -268439555, 31, null);
            Gravity gravity = Gravity.CENTER;
            String obj = gravity.toString();
            AbstractC9782b.C2182b c2182b = (AbstractC9782b.C2182b) abstractC9782b;
            String string = context.getString(c2182b.e(), aVar.getAppName());
            String value = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue();
            CbottomElement2 cbottomElement2 = null;
            Object[] objArr = null == true ? 1 : 0;
            Object[] objArr2 = null == true ? 1 : 0;
            Object[] objArr3 = null == true ? 1 : 0;
            Object[] objArr4 = null == true ? 1 : 0;
            Object[] objArr5 = null == true ? 1 : 0;
            Object[] objArr6 = null == true ? 1 : 0;
            Object[] objArr7 = null == true ? 1 : 0;
            TextItemV20DTO textItemV20DTO = new TextItemV20DTO(cbottomElement2, "perm_title", objArr, objArr2, objArr3, bool, objArr4, objArr5, objArr6, num, objArr7, null, C7714v.b0(16, 12, 16, 4), null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num2, num3, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, string, StyleParser.TextStyle.HEAD_L.getStyleName(), value, null == true ? 1 : 0, obj, str, str2, null == true ? 1 : 0, null == true ? 1 : 0, null, 1207955453, 31, null);
            String obj2 = gravity.toString();
            String string2 = context.getString(c2182b.d());
            String value2 = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue();
            CbottomElement2 cbottomElement22 = null;
            Object[] objArr8 = null == true ? 1 : 0;
            Object[] objArr9 = null == true ? 1 : 0;
            Object[] objArr10 = null == true ? 1 : 0;
            Object[] objArr11 = null == true ? 1 : 0;
            Object[] objArr12 = null == true ? 1 : 0;
            Object[] objArr13 = null == true ? 1 : 0;
            Object[] objArr14 = null == true ? 1 : 0;
            Object[] objArr15 = null == true ? 1 : 0;
            Object[] objArr16 = null == true ? 1 : 0;
            Object[] objArr17 = null == true ? 1 : 0;
            Object[] objArr18 = null == true ? 1 : 0;
            Object[] objArr19 = null == true ? 1 : 0;
            Object[] objArr20 = null == true ? 1 : 0;
            Object[] objArr21 = null == true ? 1 : 0;
            Object[] objArr22 = null == true ? 1 : 0;
            Object[] objArr23 = null == true ? 1 : 0;
            Object[] objArr24 = null == true ? 1 : 0;
            Object[] objArr25 = null == true ? 1 : 0;
            Object[] objArr26 = null == true ? 1 : 0;
            Object[] objArr27 = null == true ? 1 : 0;
            TextItemV20DTO textItemV20DTO2 = new TextItemV20DTO(cbottomElement22, "perm_subtitle", objArr8, objArr9, bool, objArr10, objArr11, objArr12, num, objArr13, objArr27, null, C7714v.b0(16, 8, 16, 4), objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, num2, num3, objArr22, objArr23, objArr24, null, string2, StyleParser.TextStyle.BODY_M.getStyleName(), value2, null, obj2, str2, objArr25, objArr26, null == true ? 1 : 0, null, 1207955453, 31, null);
            String string3 = context.getString(R.string.fintech_permissions_permission_rationale_request);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_600;
            ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
            List b02 = C7714v.b0(16, 24, 16, 4);
            Boolean bool2 = Boolean.TRUE;
            int i11 = -939528203;
            int i12 = 16383;
            DefaultConstructorMarker defaultConstructorMarker = null;
            CbottomElement2 cbottomElement23 = null;
            Boolean bool3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z12 = false;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Map map = null;
            Map map2 = null;
            Object[] objArr28 = null == true ? 1 : 0;
            Object[] objArr29 = null == true ? 1 : 0;
            Object[] objArr30 = null == true ? 1 : 0;
            Object[] objArr31 = null == true ? 1 : 0;
            Object[] objArr32 = null == true ? 1 : 0;
            Object[] objArr33 = null == true ? 1 : 0;
            Object[] objArr34 = null == true ? 1 : 0;
            Object[] objArr35 = null == true ? 1 : 0;
            Object[] objArr36 = null == true ? 1 : 0;
            Object[] objArr37 = null == true ? 1 : 0;
            Object[] objArr38 = null == true ? 1 : 0;
            Object[] objArr39 = null == true ? 1 : 0;
            Object[] objArr40 = null == true ? 1 : 0;
            Object[] objArr41 = null == true ? 1 : 0;
            Object[] objArr42 = null == true ? 1 : 0;
            Object[] objArr43 = null == true ? 1 : 0;
            Object[] objArr44 = null == true ? 1 : 0;
            FinButtonV22DTO finButtonV22DTO = new FinButtonV22DTO(cbottomElement23, "PERM_GO_RUNTIME", objArr28, bool2, objArr29, objArr30, objArr31, num, objArr32, null == true ? 1 : 0, null == true ? 1 : 0, null, b02, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, num2, num3, objArr40, objArr41, objArr42, null == true ? 1 : 0, bool3, styleTypes, string3, sizes, str3, str2, objArr43, objArr44, null == true ? 1 : 0, null == true ? 1 : 0, str4, str5, null == true ? 1 : 0, str6, z12, str7, str8, str9, map, map2, i11, i12, defaultConstructorMarker);
            String string4 = context.getString(R.string.fintech_request_permissions_negative_button);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            ButtonV3DTO.StyleTypes styleTypes2 = ButtonV3DTO.StyleTypes.ACTION_SECONDARY;
            List b03 = C7714v.b0(16, 4, 16, 24);
            Object[] objArr45 = null == true ? 1 : 0;
            Object[] objArr46 = null == true ? 1 : 0;
            Object[] objArr47 = null == true ? 1 : 0;
            Object[] objArr48 = null == true ? 1 : 0;
            Object[] objArr49 = null == true ? 1 : 0;
            Object[] objArr50 = null == true ? 1 : 0;
            Object[] objArr51 = null == true ? 1 : 0;
            Object[] objArr52 = null == true ? 1 : 0;
            Object[] objArr53 = null == true ? 1 : 0;
            Object[] objArr54 = null == true ? 1 : 0;
            Object[] objArr55 = null == true ? 1 : 0;
            Object[] objArr56 = null == true ? 1 : 0;
            Object[] objArr57 = null == true ? 1 : 0;
            Object[] objArr58 = null == true ? 1 : 0;
            Object[] objArr59 = null == true ? 1 : 0;
            Object[] objArr60 = null == true ? 1 : 0;
            Object[] objArr61 = null == true ? 1 : 0;
            List b04 = C7714v.b0(finImageV20DTO, textItemV20DTO, textItemV20DTO2, finButtonV22DTO, new FinButtonV22DTO(cbottomElement23, "perm_close", objArr45, bool2, objArr46, objArr47, objArr48, num, objArr49, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, b03, objArr50, objArr51, objArr52, objArr53, objArr54, objArr55, objArr56, num2, num3, objArr57, objArr58, objArr59, null == true ? 1 : 0, bool3, styleTypes2, string4, sizes, str3, str2, objArr60, objArr61, null == true ? 1 : 0, null == true ? 1 : 0, str4, str5, null == true ? 1 : 0, str6, z12, str7, str8, str9, map, map2, i11, i12, defaultConstructorMarker));
            Boolean bool4 = Boolean.FALSE;
            Integer num4 = null;
            return new Cbottom2SheetDTO("PERM_ID", null == true ? 1 : 0, num4, null == true ? 1 : 0, b04, null == true ? 1 : 0, bool4, bool4, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 6, null == true ? 1 : 0);
        }
        if (!(abstractC9782b instanceof AbstractC9782b.d)) {
            if (!(abstractC9782b instanceof AbstractC9782b.a) && (abstractC9782b instanceof AbstractC9782b.e)) {
                Integer num5 = null;
                Integer num6 = null;
                Integer num7 = null;
                Integer num8 = null;
                String str10 = null;
                String str11 = null;
                FinImageV20DTO finImageV20DTO2 = new FinImageV20DTO(null, "perm_icon", null, null, null, null, null, null, null, num5, num6, null, C7714v.b0(16, 24, 16, 12), null, null, null, null, null, null, null, null, null, null, num7, num8, null, null, null, "ic_illustration_permission_rationale_80", null, null, null, null, str10, str11, null, null, -268439555, 31, null);
                Gravity gravity2 = Gravity.CENTER;
                String obj3 = gravity2.toString();
                String string5 = context.getString(R.string.fintech_permissions_no_permission_title);
                String value3 = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue();
                String styleName = StyleParser.TextStyle.HEAD_L.getStyleName();
                Map map3 = null;
                TextItemV20DTO textItemV20DTO3 = new TextItemV20DTO(null, "perm_title", null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num5, num6, null == true ? 1 : 0, null, C7714v.b0(16, 12, 16, 4), null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num7, num8, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, string5, styleName, value3, null == true ? 1 : 0, obj3, str10, str11, null == true ? 1 : 0, null == true ? 1 : 0, map3, 1207955453, 31, null);
                String obj4 = gravity2.toString();
                String string6 = context.getString(R.string.fintech_no_manifest_permission);
                String value4 = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue();
                CbottomElement2 cbottomElement24 = null;
                Object[] objArr62 = null == true ? 1 : 0;
                Object[] objArr63 = null == true ? 1 : 0;
                Object[] objArr64 = null == true ? 1 : 0;
                Object[] objArr65 = null == true ? 1 : 0;
                Object[] objArr66 = null == true ? 1 : 0;
                Object[] objArr67 = null == true ? 1 : 0;
                Object[] objArr68 = null == true ? 1 : 0;
                Object[] objArr69 = null == true ? 1 : 0;
                Object[] objArr70 = null == true ? 1 : 0;
                Object[] objArr71 = null == true ? 1 : 0;
                Object[] objArr72 = null == true ? 1 : 0;
                Object[] objArr73 = null == true ? 1 : 0;
                Object[] objArr74 = null == true ? 1 : 0;
                Object[] objArr75 = null == true ? 1 : 0;
                Object[] objArr76 = null == true ? 1 : 0;
                Object[] objArr77 = null == true ? 1 : 0;
                Object[] objArr78 = null == true ? 1 : 0;
                Object[] objArr79 = null == true ? 1 : 0;
                Object[] objArr80 = null == true ? 1 : 0;
                Object[] objArr81 = null == true ? 1 : 0;
                List b05 = C7714v.b0(finImageV20DTO2, textItemV20DTO3, new TextItemV20DTO(cbottomElement24, "perm_subtitle", objArr62, objArr63, objArr64, objArr65, objArr66, num5, num6, objArr67, objArr81, null, C7714v.b0(16, 8, 16, 24), objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, num7, num8, objArr76, objArr77, objArr78, null, string6, StyleParser.TextStyle.BODY_M.getStyleName(), value4, null, obj4, str11, objArr79, objArr80, map3, null, 1207955453, 31, null));
                Boolean bool5 = Boolean.FALSE;
                return new Cbottom2SheetDTO("PERM_ID", null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, b05, null == true ? 1 : 0, bool5, bool5, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 6, null == true ? 1 : 0);
            }
            return null;
        }
        Boolean bool6 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        String str12 = null;
        String str13 = null;
        FinImageV20DTO finImageV20DTO3 = new FinImageV20DTO(null, "perm_icon", null, null, null, null, bool6, null, null, null, num9, null, C7714v.b0(16, 24, 16, 12), null, null, null, null, null, null, null, null, null, null, num10, num11, null, null, null, "ic_illustration_permission_rationale_80", null, null, null, null, str12, str13, null, null, -268439555, 31, null);
        Gravity gravity3 = Gravity.CENTER;
        String obj5 = gravity3.toString();
        AbstractC9782b.d dVar = (AbstractC9782b.d) abstractC9782b;
        String string7 = context.getString(dVar.f(), aVar.getAppName());
        String value5 = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue();
        CbottomElement2 cbottomElement25 = null;
        Object[] objArr82 = null == true ? 1 : 0;
        Object[] objArr83 = null == true ? 1 : 0;
        Object[] objArr84 = null == true ? 1 : 0;
        Object[] objArr85 = null == true ? 1 : 0;
        Object[] objArr86 = null == true ? 1 : 0;
        Object[] objArr87 = null == true ? 1 : 0;
        Object[] objArr88 = null == true ? 1 : 0;
        TextItemV20DTO textItemV20DTO4 = new TextItemV20DTO(cbottomElement25, "perm_title", objArr82, objArr83, objArr84, bool6, objArr85, objArr86, objArr87, num9, objArr88, null, C7714v.b0(16, 12, 16, 4), null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num10, num11, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, string7, StyleParser.TextStyle.HEAD_L.getStyleName(), value5, null == true ? 1 : 0, obj5, str12, str13, null == true ? 1 : 0, null == true ? 1 : 0, null, 1207955453, 31, null);
        String obj6 = gravity3.toString();
        String string8 = context.getString(dVar.d());
        String value6 = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue();
        CbottomElement2 cbottomElement26 = null;
        Object[] objArr89 = null == true ? 1 : 0;
        Object[] objArr90 = null == true ? 1 : 0;
        Object[] objArr91 = null == true ? 1 : 0;
        Object[] objArr92 = null == true ? 1 : 0;
        Object[] objArr93 = null == true ? 1 : 0;
        Object[] objArr94 = null == true ? 1 : 0;
        Object[] objArr95 = null == true ? 1 : 0;
        Object[] objArr96 = null == true ? 1 : 0;
        Object[] objArr97 = null == true ? 1 : 0;
        Object[] objArr98 = null == true ? 1 : 0;
        Object[] objArr99 = null == true ? 1 : 0;
        Object[] objArr100 = null == true ? 1 : 0;
        Object[] objArr101 = null == true ? 1 : 0;
        Object[] objArr102 = null == true ? 1 : 0;
        Object[] objArr103 = null == true ? 1 : 0;
        Object[] objArr104 = null == true ? 1 : 0;
        Object[] objArr105 = null == true ? 1 : 0;
        Object[] objArr106 = null == true ? 1 : 0;
        Object[] objArr107 = null == true ? 1 : 0;
        Object[] objArr108 = null == true ? 1 : 0;
        TextItemV20DTO textItemV20DTO5 = new TextItemV20DTO(cbottomElement26, "perm_subtitle", objArr89, objArr90, bool6, objArr91, objArr92, objArr93, num9, objArr94, objArr108, null, C7714v.b0(16, 8, 16, 4), objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, num10, num11, objArr103, objArr104, objArr105, null, string8, StyleParser.TextStyle.BODY_M.getStyleName(), value6, null, obj6, str13, objArr106, objArr107, null == true ? 1 : 0, null, 1207955453, 31, null);
        String string9 = context.getString(R.string.fintech_permissions_go_to_permission_settings);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        ButtonV3DTO.Sizes sizes2 = ButtonV3DTO.Sizes.SIZE_600;
        ButtonV3DTO.StyleTypes styleTypes3 = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
        CbottomElement2 cbottomElement27 = null;
        Object[] objArr109 = null == true ? 1 : 0;
        Object[] objArr110 = null == true ? 1 : 0;
        Object[] objArr111 = null == true ? 1 : 0;
        Object[] objArr112 = null == true ? 1 : 0;
        Object[] objArr113 = null == true ? 1 : 0;
        Object[] objArr114 = null == true ? 1 : 0;
        Object[] objArr115 = null == true ? 1 : 0;
        Object[] objArr116 = null == true ? 1 : 0;
        Object[] objArr117 = null == true ? 1 : 0;
        Object[] objArr118 = null == true ? 1 : 0;
        Object[] objArr119 = null == true ? 1 : 0;
        Object[] objArr120 = null == true ? 1 : 0;
        Object[] objArr121 = null == true ? 1 : 0;
        Object[] objArr122 = null == true ? 1 : 0;
        Object[] objArr123 = null == true ? 1 : 0;
        Object[] objArr124 = null == true ? 1 : 0;
        Object[] objArr125 = null == true ? 1 : 0;
        Object[] objArr126 = null == true ? 1 : 0;
        Object[] objArr127 = null == true ? 1 : 0;
        Object[] objArr128 = null == true ? 1 : 0;
        Object[] objArr129 = null == true ? 1 : 0;
        List b06 = C7714v.b0(finImageV20DTO3, textItemV20DTO4, textItemV20DTO5, new FinButtonV22DTO(cbottomElement27, "PERM_GO_SETTINGS", objArr109, Boolean.TRUE, objArr110, objArr111, objArr112, num9, objArr113, objArr126, objArr129, null, C7714v.b0(16, 24, 16, 24), objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, num10, num11, objArr121, objArr122, objArr123, null == true ? 1 : 0, null, styleTypes3, string9, sizes2, null, str13, objArr124, objArr125, objArr127, null == true ? 1 : 0, null, null, objArr128, null, false, null, null, null, null, null, -939528203, 16383, null));
        Boolean bool7 = Boolean.FALSE;
        Integer num12 = null;
        return new Cbottom2SheetDTO("PERM_ID", null == true ? 1 : 0, num12, null == true ? 1 : 0, b06, null == true ? 1 : 0, bool7, bool7, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 6, null == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(a aVar) {
        this.f83234k = (w0) aVar;
    }
}
