package ru.ozon.android.messenger.blocks.input.pickerlauncher;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import De.C2862e;
import De.s;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.widget.Toast;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.viewmodel.h;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.d;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;
import ze.C11115c;
import ze.k;

/* loaded from: classes10.dex */
public final class b implements ru.ozon.android.messenger.blocks.input.pickerlauncher.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f85537a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.d f85538b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d.f f85539c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C11115c f85540d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<f> f85541e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<ComponentCallbacksC5392m> f85542f;

    /* renamed from: g, reason: collision with root package name */
    private h f85543g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private C2862e f85544h;

    /* renamed from: i, reason: collision with root package name */
    private B0 f85545i;

    /* renamed from: j, reason: collision with root package name */
    private C9514a f85546j;

    /* renamed from: k, reason: collision with root package name */
    private String f85547k;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85548a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.navigation.action.d.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.PICK_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.PICK_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.TAKE_PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.FAST_ANSWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f85548a = iArr;
        }
    }

    public b(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, @NotNull ru.ozon.android.messenger.framework.navigation.d router, @NotNull d.f networkConfig) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f85537a = controller;
        this.f85538b = router;
        this.f85539c = networkConfig;
        C11115c a11 = k.a(1, 6, null);
        this.f85540d = a11;
        this.f85541e = C2399j.H(a11);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f85544h = N.a(s.f6650a.x());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(b bVar, d.f fVar) {
        ComponentCallbacksC5392m currentFragment;
        d G02;
        String str;
        WeakReference<ComponentCallbacksC5392m> weakReference = bVar.f85542f;
        if (weakReference == null || (currentFragment = weakReference.get()) == 0) {
            return;
        }
        ru.ozon.android.messenger.framework.navigation.action.a a11 = fVar.a();
        h hVar = bVar.f85543g;
        if (hVar == null || (G02 = hVar.G0()) == null || G02.b() <= 0) {
            return;
        }
        d.a aVar = ru.ozon.android.messenger.framework.navigation.action.d.Companion;
        String id2 = a11.getId();
        aVar.getClass();
        ru.ozon.android.messenger.framework.navigation.action.d a12 = d.a.a(id2);
        int i11 = a12 == null ? -1 : a.f85548a[a12.ordinal()];
        ru.ozon.android.messenger.framework.navigation.d dVar = bVar.f85538b;
        if (i11 == 1) {
            String[] supportedMimeTypes = (String[]) G02.a().toArray(new String[0]);
            dVar.getClass();
            Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
            Intrinsics.checkNotNullParameter(supportedMimeTypes, "supportedMimeTypes");
            try {
                Intrinsics.checkNotNullParameter(currentFragment, "<this>");
                Intrinsics.checkNotNullParameter("PICK_FILE", "tag");
                ((ru.ozon.android.messenger.framework.presentation.common.launcher.a) currentFragment).g("PICK_FILE").a(supportedMimeTypes);
                return;
            } catch (ActivityNotFoundException unused) {
                Lm0.a.f17149a.w("No activity found for picking a file", new Object[0]);
                Toast.makeText(currentFragment.requireContext(), currentFragment.requireContext().getResources().getString(R$string.messenger_error_not_found_app_to_open_file), 0).show();
                return;
            }
        }
        if (i11 == 2) {
            int b11 = G02.b();
            dVar.getClass();
            ru.ozon.android.messenger.framework.navigation.d.b(currentFragment, b11);
        } else if (i11 == 3) {
            dVar.getClass();
            Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
            ((ru.ozon.android.messenger.utils.camera.a) currentFragment).b(currentFragment);
        } else if (i11 == 4 && (str = bVar.f85547k) != null) {
            dVar.a(str);
        }
    }

    @NotNull
    public final InterfaceC2395h<f> d() {
        return this.f85541e;
    }

    public final void e(@NotNull ComponentCallbacksC5392m fragment, @NotNull h pickerConfigProvider, C9514a c9514a, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(pickerConfigProvider, "pickerConfigProvider");
        this.f85542f = new WeakReference<>(fragment);
        this.f85543g = pickerConfigProvider;
        this.f85546j = c9514a;
        this.f85547k = str;
        B0 b02 = this.f85545i;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f85545i = C10727i.c(this.f85544h, null, null, new c(this, null), 3);
        }
    }

    public final void f() {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        Context context;
        G supportFragmentManager;
        AtomActionDTO action;
        WeakReference<ComponentCallbacksC5392m> weakReference = this.f85542f;
        if (weakReference == null || (componentCallbacksC5392m = weakReference.get()) == null || (context = componentCallbacksC5392m.getContext()) == null) {
            return;
        }
        C9514a c9514a = this.f85546j;
        String namespace = this.f85539c.c();
        this.f85538b.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getApplicationContext().getSystemService("camera");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            String[] cameraIdList = ((CameraManager) systemService).getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
            r3 = !(cameraIdList.length == 0);
        } catch (CameraAccessException unused) {
        }
        if (!r3) {
            if (c9514a != null) {
                List<CellDTO> c11 = c9514a.c();
                ArrayList arrayList = new ArrayList();
                for (Object obj : c11) {
                    CommonControlSettings common = ((CellDTO) obj).getCommon();
                    if (!Intrinsics.d((common == null || (action = common.getAction()) == null) ? null : action.getId(), ru.ozon.android.messenger.framework.navigation.action.d.TAKE_PHOTO.a())) {
                        arrayList.add(obj);
                    }
                }
                c9514a = C9514a.a(c9514a, arrayList);
            } else {
                c9514a = null;
            }
        }
        if (c9514a != null) {
            g gVar = context instanceof g ? (g) context : null;
            if (gVar == null || (supportFragmentManager = gVar.getSupportFragmentManager()) == null) {
                return;
            }
            int i11 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.d.f91057e;
            d.f.a(c9514a, namespace).show(supportFragmentManager, (String) null);
        }
    }

    public final void g() {
        this.f85542f = null;
        this.f85543g = null;
        B0 b02 = this.f85545i;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f85545i = null;
    }
}
