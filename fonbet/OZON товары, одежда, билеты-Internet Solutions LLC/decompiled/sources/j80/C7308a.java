package j80;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import B4.C2584m;
import B90.o0;
import H30.e;
import H30.x;
import T80.b;
import T80.c;
import Y80.g;
import Y80.k;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import com.google.android.gms.common.internal.ImagesContract;
import g30.InterfaceC6618a;
import i80.InterfaceC7021a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l70.C7892a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;
import ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment;
import ru.ozon.fintech.features.cbottomscreen.presentation.CbottomScreenFragment;
import ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet;
import ru.ozon.fintech.features.cbottomstories.presentation.FullFragment;
import ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment;
import ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;
import ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ze.EnumC11113a;

/* renamed from: j80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7308a extends g implements c {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Application f69506h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final b f69507i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f69508j;

    /* renamed from: k, reason: collision with root package name */
    private C0 f69509k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f69510l;

    /* renamed from: m, reason: collision with root package name */
    private C0 f69511m;

    /* renamed from: n, reason: collision with root package name */
    private x0<Unit> f69512n;

    public C7308a(@NotNull Application application, @NotNull b externalFintechNavigation, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalFintechNavigation, "externalFintechNavigation");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f69506h = application;
        this.f69507i = externalFintechNavigation;
        this.f69508j = fintechAnalyticInteractor;
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f69509k = E0.a(0, 1, enumC11113a);
        this.f69511m = E0.a(0, 1, enumC11113a);
        this.f69512n = O0.a(null);
    }

    @Override // T80.c
    public final void B0(String str, A40.a aVar, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        OnboardingSlidesFragment.Companion companion = OnboardingSlidesFragment.INSTANCE;
        companion.getClass();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        OnboardingSlidesFragment onboardingSlidesFragment = new OnboardingSlidesFragment();
        companion.getClass();
        onboardingSlidesFragment.setArguments(OnboardingSlidesFragment.Companion.a(str, aVar, i11, uuid));
        e1(onboardingSlidesFragment);
    }

    @Override // T80.c
    public final void C() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CameraFragment.NO_BOTTOM_TABS, true);
        g.i1(this, R.id.action_global_open_offline_select, bundle, 12);
    }

    @Override // T80.c
    public final void C0(@NotNull String label, @NotNull String textToCopy) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(textToCopy, "textToCopy");
        e.b(this.f69506h, label, textToCopy);
    }

    @Override // T80.c
    public final void D(String str) {
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString("LOAD_URL_KEY", str);
        bundle.putStringArrayList("CANCEL_URLS", new ArrayList<>(K.f71697a));
        bundle.putBoolean(CameraFragment.NO_BOTTOM_TABS, true);
        g.i1(this, R.id.action_global_bank_cards_payment_fintech_web_view, bundle, 12);
    }

    @Override // T80.c
    public final void E0(@NotNull String positiveButton, @NotNull String negativeButton) {
        Intrinsics.checkNotNullParameter("", SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
        Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
        g.i1(this, R.id.action_global_qr_result_bottom_sheet, QrScannerResultBottomSheet.INSTANCE.getBundle("", positiveButton, negativeButton), 12);
    }

    @Override // T80.c
    public final void F(String str, A40.a aVar, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        StoriesFragment.Companion companion = StoriesFragment.INSTANCE;
        companion.getClass();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        StoriesFragment storiesFragment = new StoriesFragment();
        companion.getClass();
        storiesFragment.setArguments(StoriesFragment.Companion.a(str, aVar, i11, uuid));
        e1(storiesFragment);
    }

    @Override // T80.c
    public final void F0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        CbottomWebViewDialogFragment cbottomWebViewDialogFragment = new CbottomWebViewDialogFragment();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        cbottomWebViewDialogFragment.setArguments(d.b(new Pair("PARAMETER_JSON", null), new Pair("PARAMETER_PARCELABLE", aVar), new Pair("PARAMETER_VERSION", 2), new Pair("PARAMETER_UUID", uuid)));
        e1(cbottomWebViewDialogFragment);
    }

    @Override // T80.c
    public final Integer G() {
        Integer l12 = l1();
        if (l12 != null && l12.intValue() == R.navigation.tab0) {
            return 0;
        }
        if (l12 != null && l12.intValue() == R.navigation.tab1) {
            return 1;
        }
        if (l12 != null && l12.intValue() == R.navigation.tab2) {
            return 2;
        }
        if (l12 != null && l12.intValue() == R.navigation.tab3) {
            return 3;
        }
        return (l12 != null && l12.intValue() == R.navigation.tab4) ? 4 : null;
    }

    @Override // T80.c
    public final void G0() {
        g.i1(this, R.id.action_global_text_input_playground, null, 14);
    }

    @Override // T80.c
    public final void H(@NotNull Uri uri, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
        intent.setType(mimeType);
        Activity c11 = c();
        if (c11 != null) {
            c11.startActivity(Intent.createChooser(intent, c11.getString(R.string.finance_share)));
        }
    }

    @Override // T80.c
    public final void I(@NotNull String workingMode, @NotNull String confirmPhotoTitle, @NotNull String qrAction, boolean z11, String str, boolean z12, boolean z13, @NotNull String previewCameraTitle, String str2, String str3, String str4, List<String> list, String str5, boolean z14, Long l11, String str6, Boolean bool) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        Intrinsics.checkNotNullParameter(confirmPhotoTitle, "confirmPhotoTitle");
        Intrinsics.checkNotNullParameter(qrAction, "qrAction");
        Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
        g.i1(this, R.id.action_global_open_camera, CameraFragment.INSTANCE.getBundle(CameraFragment.WorkingMode.valueOf(workingMode), confirmPhotoTitle, CameraFragment.ScanAction.valueOf(qrAction), true, z11, str, z12, z13, previewCameraTitle, str2, str3, str4, list, str5, z14, l11, str6, bool), 12);
    }

    @Override // T80.c
    public final void J0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        OnboardingSlidesV2Fragment.INSTANCE.getClass();
        e1(OnboardingSlidesV2Fragment.Companion.b(null, aVar, 2, uuid));
    }

    @Override // T80.c
    public final Integer K0() {
        k f72987p = Y0().getF72987P();
        if (f72987p != null) {
            return f72987p.p();
        }
        return null;
    }

    @Override // T80.c
    public final void N(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        f50.b bVar = new f50.b();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        bVar.setArguments(d.b(new Pair("PARAMETER_JSON", null), new Pair("PARAMETER_PARCELABLE", aVar), new Pair("PARAMETER_VERSION", 2), new Pair("PARAMETER_UUID", uuid)));
        e1(bVar);
    }

    @Override // T80.c
    public final boolean N0() {
        return L0() instanceof PinPadFragment;
    }

    @Override // T80.c
    public final void O0(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
        intent.setType("image/png");
        Activity c11 = c();
        if (c11 != null) {
            c11.startActivity(Intent.createChooser(intent, c11.getString(R.string.finance_share)));
        }
    }

    @Override // T80.c
    public final void P(@NotNull O30.b type) {
        Intrinsics.checkNotNullParameter(type, "fintechLibType");
        Intrinsics.checkNotNullParameter(type, "type");
        g.i1(this, R.id.action_global_open_prefepences_activity, d.b(new Pair("FINTECH_ACTIVITY_LIB_TYPE_KEY", Integer.valueOf(type.ordinal()))), 12);
    }

    @Override // T80.c
    public final void P0(Cbottom2ScreenDTO cbottom2ScreenDTO, boolean z11, boolean z12, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (!z11) {
            g.i1(this, R.id.action_global_open_js_context, CbottomScreenFragment.a.a(cbottom2ScreenDTO, z11, z12, uuid), 12);
            return;
        }
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        CbottomScreenFragment cbottomScreenFragment = new CbottomScreenFragment();
        cbottomScreenFragment.setArguments(CbottomScreenFragment.a.a(cbottom2ScreenDTO, z11, z12, uuid));
        f1(cbottomScreenFragment);
    }

    @Override // T80.c
    public final void Q0(@NotNull String uuid, @NotNull String pinPadCbottomType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(pinPadCbottomType, "pinPadCbottomType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(pinPadCbottomType, "pinPadCbottomType");
        Pair pair = new Pair("PARAMETER_UUID", uuid);
        Pair pair2 = new Pair("PARAMETER_CBOTTOM_TYPE", pinPadCbottomType);
        if (map == null) {
            map = U.c();
        }
        g.i1(this, R.id.action_global_open_pinpad_sheet, d.b(pair, pair2, new Pair("PARAMETER_PLACEHOLDERS_VALUE", new HashMap(map))), 12);
    }

    @Override // T80.c
    public final void R(@NotNull String textToShare) {
        Intrinsics.checkNotNullParameter(textToShare, "textToShare");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", textToShare);
        Activity c11 = c();
        if (c11 != null) {
            c11.startActivity(Intent.createChooser(intent, c11.getString(R.string.finance_share)));
        }
    }

    @Override // T80.c
    public final void R0() {
        k f72987p = Y0().getF72987P();
        if (f72987p != null) {
            f72987p.s();
        }
    }

    @Override // T80.c
    public final void S() {
        PinPadFragment pinPadFragment = new PinPadFragment();
        L80.a.a("PINPADER_PERF", "gotoPinPad f=" + pinPadFragment);
        ComponentCallbacksC5392m L02 = L0();
        if ((L02 instanceof PinPadFragment ? (PinPadFragment) L02 : null) == null) {
            f1(pinPadFragment);
        }
    }

    @Override // T80.c
    public final void T() {
        g.i1(this, R.id.action_global_camera_settings, null, 14);
    }

    @Override // T80.c
    public final void T0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        FullFragment.Companion companion = FullFragment.INSTANCE;
        companion.getClass();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        FullFragment fullFragment = new FullFragment();
        companion.getClass();
        fullFragment.setArguments(FullFragment.Companion.a(null, aVar, 2, uuid));
        e1(fullFragment);
    }

    @Override // T80.c
    public final void U0(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        CbottomModalDialogFragment cbottomModalDialogFragment = new CbottomModalDialogFragment();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        cbottomModalDialogFragment.setArguments(d.b(new Pair("PARAMETER_JSON", null), new Pair("PARAMETER_PARCELABLE", aVar), new Pair("PARAMETER_VERSION", 2), new Pair("PARAMETER_UUID", uuid)));
        e1(cbottomModalDialogFragment);
    }

    @Override // T80.c
    public final void V(G30.a aVar) {
        k f72987p = Y0().getF72987P();
        if (f72987p != null) {
            f72987p.u(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T80.c
    public final void V0() {
        Activity c11 = c();
        if (c11 != 0) {
            C0 c02 = this.f69511m;
            if (c02 != null) {
                c02.tryEmit(Boolean.TRUE);
            }
            ((I30.d) c11).i();
            c11.finish();
        }
    }

    @Override // T80.c
    public final w0<Boolean> X() {
        return this.f69511m;
    }

    @Override // T80.c
    public final Integer Z(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 2567003:
                if (str.equals("TAB0")) {
                    return Integer.valueOf(R.navigation.tab0);
                }
                return null;
            case 2567004:
                if (str.equals("TAB1")) {
                    return Integer.valueOf(R.navigation.tab1);
                }
                return null;
            case 2567005:
                if (str.equals("TAB2")) {
                    return Integer.valueOf(R.navigation.tab2);
                }
                return null;
            case 2567006:
                if (str.equals("TAB3")) {
                    return Integer.valueOf(R.navigation.tab3);
                }
                return null;
            case 2567007:
                if (str.equals("TAB4")) {
                    return Integer.valueOf(R.navigation.tab4);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // T80.c
    public final void a0() {
        g.i1(this, R.id.action_global_qr_settings, null, 14);
    }

    @Override // T80.c
    public final void b0(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Integer l12 = l1();
        Integer Z11 = Z(id2);
        if (Z11 == null || Intrinsics.d(l12, Z11)) {
            return;
        }
        d1(Z11.intValue());
    }

    @Override // T80.c
    public final Activity c() {
        return Y0().c();
    }

    @Override // T80.c
    public final void d0() {
        this.f69510l = false;
    }

    @Override // T80.c
    public final w0<Boolean> e() {
        return this.f69509k;
    }

    @Override // T80.c
    public final String e0() {
        Integer l12 = l1();
        if (l12 != null && l12.intValue() == R.navigation.tab0) {
            return "TAB0";
        }
        if (l12 != null && l12.intValue() == R.navigation.tab1) {
            return "TAB1";
        }
        if (l12 != null && l12.intValue() == R.navigation.tab2) {
            return "TAB2";
        }
        if (l12 != null && l12.intValue() == R.navigation.tab3) {
            return "TAB3";
        }
        if (l12 != null && l12.intValue() == R.navigation.tab4) {
            return "TAB4";
        }
        return null;
    }

    @Override // T80.c
    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CameraFragment.NO_BOTTOM_TABS, true);
        g.i1(this, R.id.action_global_open_theme, bundle, 12);
    }

    @Override // T80.c
    public final void f0() {
        g.i1(this, R.id.action_testing_features_v2_edit, null, 14);
    }

    @Override // T80.c
    public final void g() {
        g.i1(this, R.id.action_global_open_logcat, null, 14);
    }

    @Override // T80.c
    public final void h(WeakReference<WebView> weakReference) {
    }

    @Override // T80.c
    public final void i(String str, String str2, String str3) {
        g.i1(this, R.id.action_global_request_notifications, d.b(new Pair("PARAMETER_ICON", str), new Pair("PARAMETER_TITLE", str2), new Pair("PARAMETER_SUBTITLE", str3)), 12);
    }

    @Override // T80.c
    public final void j0(@NotNull String url, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        Activity c11 = c();
        if (c11 != null) {
            ComponentCallbacks2 componentCallbacks2 = this.f69506h;
            String str2 = null;
            InterfaceC7021a interfaceC7021a = componentCallbacks2 instanceof InterfaceC7021a ? (InterfaceC7021a) componentCallbacks2 : null;
            Activity c12 = interfaceC7021a != null ? interfaceC7021a.c() : null;
            if (this.f69510l) {
                return;
            }
            if (c12 == null || !c12.getClass().getSimpleName().equals("AuthFlowActivity")) {
                String c13 = x.c(Uri.parse(url), ImagesContract.URL);
                if (c13 == null) {
                    c13 = "";
                }
                if (c13.length() != 0 && c13.length() != 1) {
                    str2 = c13;
                }
                this.f69510l = true;
                this.f69507i.startOzonIdSign(c11, str2, str);
                this.f69508j.G1(z11);
            }
        }
    }

    @Override // T80.c
    public final void k() {
        C2584m f72996o = Y0().getF72996o();
        if (f72996o != null) {
            f72996o.O(R.id.global_open_camera, true);
        }
    }

    @Override // T80.c
    public final void k0() {
        g.i1(this, R.id.action_global_antifraud_json, null, 14);
    }

    @Override // T80.c
    public final void l0(int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("ID_KEY", i11);
        g.i1(this, R.id.action_global_demo, bundle, 12);
    }

    public final Integer l1() {
        Integer n11;
        k f72987p = Y0().getF72987P();
        return (f72987p == null || (n11 = f72987p.n()) == null) ? (Integer) C7714v.M(Y0().q()) : n11;
    }

    @Override // T80.c
    public final boolean m(@NotNull String deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        ComponentCallbacksC5392m U10 = U();
        r activity = U10 != null ? U10.getActivity() : null;
        PackageManager packageManager = activity != null ? activity.getPackageManager() : null;
        boolean z11 = false;
        if (activity != null && packageManager != null) {
            try {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(deepLink)));
                z11 = true;
                Unit unit = Unit.f71690a;
                return true;
            } catch (ActivityNotFoundException e11) {
                Log.e("finDemo", "can't go. " + e11);
            }
        }
        return z11;
    }

    @Override // T80.c
    public final void n(A40.a aVar, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        CbottomBottomSheet cbottomBottomSheet = new CbottomBottomSheet();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        cbottomBottomSheet.setArguments(d.b(new Pair("PARAMETER_JSON", null), new Pair("PARAMETER_PARCELABLE", aVar), new Pair("PARAMETER_VERSION", 2), new Pair("PARAMETER_UUID", uuid)));
        e1(cbottomBottomSheet);
    }

    @Override // T80.c
    public final void n0() {
        PackageManager packageManager;
        Application application;
        Activity c11 = c();
        Intent intent = null;
        String packageName = (c11 == null || (application = c11.getApplication()) == null) ? null : application.getPackageName();
        if (packageName != null) {
            Activity c12 = c();
            if (c12 != null && (packageManager = c12.getPackageManager()) != null) {
                intent = packageManager.getLaunchIntentForPackage(packageName);
            }
            if (intent != null) {
                intent.addFlags(32768);
                Activity c13 = c();
                if (c13 != null) {
                    c13.startActivity(intent);
                }
                Runtime.getRuntime().exit(0);
            }
        }
    }

    @Override // T80.c
    public final void o0() {
        if (L0() instanceof PinPadFragment) {
            E();
        }
    }

    @Override // T80.c
    public final void p0() {
        g.i1(this, R.id.action_testing_features_v1_edit, null, 14);
    }

    @Override // T80.c
    public final void q(@NotNull String uuid, @NotNull String offlineCbottomType, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(offlineCbottomType, "offlineCbottomType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(offlineCbottomType, "offlineCbottomType");
        Pair pair = new Pair("PARAMETER_UUID", uuid);
        Pair pair2 = new Pair("PARAMETER_CBOTTOM_TYPE", offlineCbottomType);
        if (map == null) {
            map = U.c();
        }
        g.i1(this, R.id.action_global_open_offline_how, d.b(pair, pair2, new Pair("PARAMETER_PLACEHOLDERS_VALUE", new HashMap(map))), 12);
    }

    @Override // T80.c
    public final String q0(int i11) {
        if (i11 == 0) {
            return "TAB0";
        }
        if (i11 == 1) {
            return "TAB1";
        }
        if (i11 == 2) {
            return "TAB2";
        }
        if (i11 == 3) {
            return "TAB3";
        }
        if (i11 != 4) {
            return null;
        }
        return "TAB4";
    }

    @Override // T80.c
    public final void r() {
        g.i1(this, R.id.action_global_cbdc_mfe_script_debug, null, 14);
    }

    @Override // T80.c
    public final void s() {
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter("", "id");
        g.i1(this, R.id.action_global_operation_info, d.b(new Pair("id_key", ""), new Pair("type_key", "")), 12);
    }

    @Override // T80.c
    public final void s0(@NotNull String text, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:+" + phone));
        intent.putExtra("sms_body", text);
        Activity c11 = c();
        if (c11 != null) {
            c11.startActivity(intent);
        }
    }

    @Override // T80.c
    public final void t() {
        g.i1(this, R.id.action_global_open_updatewall, null, 14);
    }

    @Override // T80.c
    public final void t0(int i11, List list, List list2) {
        PhotoPreviewFragment.INSTANCE.getClass();
        g.i1(this, R.id.action_global_photo_preview, PhotoPreviewFragment.Companion.a(list, list2, i11), 12);
    }

    @Override // T80.c
    public final boolean u(@NotNull String pack) {
        Intrinsics.checkNotNullParameter(pack, "pack");
        Activity c11 = c();
        if (c11 == null) {
            return true;
        }
        try {
            c11.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(pack))));
            return true;
        } catch (ActivityNotFoundException e11) {
            L80.a.b("GotoFintechNavigationDelegate", "Can't open Play Market for package = " + pack + " e = " + e11);
            return false;
        }
    }

    @Override // T80.c
    public final void v(@NotNull String tel) {
        Intrinsics.checkNotNullParameter(tel, "tel");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:".concat(tel)));
        Activity c11 = c();
        if (c11 != null) {
            c11.startActivity(intent);
        }
    }

    @Override // T80.c
    public final void v0(String str, @NotNull String url, long j11, @NotNull String contentDeposition, String str2, boolean z11, String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentDeposition, "contentDeposition");
        SharingPreviewFragment.INSTANCE.getClass();
        g.i1(this, R.id.action_global_open_sharing_files, SharingPreviewFragment.Companion.a(url, contentDeposition, j11, str, str2, z11, str3), 12);
    }

    @Override // T80.c
    public final void w() {
        e1(new FintechNativeBridgeTestingFragment());
    }

    @Override // T80.c
    public final void w0(@NotNull String id2, @NotNull String receiptText, int i11, @NotNull String time, @NotNull String amount, @NotNull String receiverBank, @NotNull String senderName, @NotNull String senderPhone, @NotNull String senderBank, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(receiptText, "receiptText");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiverBank, "receiverBank");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderPhone, "senderPhone");
        Intrinsics.checkNotNullParameter(senderBank, "senderBank");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(receiptText, "receiptText");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiverBank, "receiverBank");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderPhone, "senderPhone");
        Intrinsics.checkNotNullParameter(senderBank, "senderBank");
        g.i1(this, R.id.action_global_receipt_info, d.b(new Pair("id_key", id2), new Pair("receipt_status_text_key", receiptText), new Pair("receipt_status_type_key", Integer.valueOf(i11)), new Pair("time_key", time), new Pair("amount_key", amount), new Pair("receiver_bank_key", receiverBank), new Pair("sender_count_key", senderName), new Pair("sender_bank_key", senderBank), new Pair("sender_phone_key", senderPhone), new Pair("message_key", str)), 12);
    }

    @Override // T80.c
    public final void x(int i11, boolean z11) {
        Integer l12 = l1();
        Integer valueOf = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? null : Integer.valueOf(R.navigation.tab4) : Integer.valueOf(R.navigation.tab3) : Integer.valueOf(R.navigation.tab2) : Integer.valueOf(R.navigation.tab1) : Integer.valueOf(R.navigation.tab0);
        if (valueOf != null) {
            if (!Intrinsics.d(l12, valueOf)) {
                d1(valueOf.intValue());
            }
            if (z11) {
                d1(valueOf.intValue());
                X0().post(new o0(this, 1));
            }
        }
    }

    @Override // T80.c
    public final void x0(@NotNull C7892a contact, @NotNull String bankId) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Bundle bundle = new Bundle();
        bundle.putBoolean(CameraFragment.NO_BOTTOM_TABS, true);
        bundle.putString("BANK_ID_ARG", bankId);
        bundle.putParcelable("CONTACT_ARG", contact);
        g.i1(this, R.id.action_global_open_offline_pay, bundle, 12);
    }

    @Override // T80.c
    public final boolean y0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ComponentCallbacksC5392m U10 = U();
        r activity = U10 != null ? U10.getActivity() : null;
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(url);
        if (parse.getScheme() == null) {
            parse = parse.buildUpon().scheme("http").build();
        }
        intent.setData(parse);
        intent.addFlags(268435456);
        if (activity == null) {
            return true;
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // T80.c
    public final void z0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CameraFragment.NO_BOTTOM_TABS, true);
        g.i1(this, R.id.action_global_open_offline_main, bundle, 12);
    }
}
