package ru.ozon.android.gallery.media.view;

import B90.Q;
import C.i0;
import Ci.C2779a;
import Ci.k;
import Hi.f;
import Ki.b;
import Sc.n;
import Sc.o;
import Ti.i;
import Ui.C4069c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import fd.InterfaceC6512o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import xe.C10727i;
import xi.C10779a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/android/gallery/media/view/GalleryActivity;", "", "Landroidx/appcompat/app/g;", "<init>", "()V", "a", "ozon-gallery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GalleryActivity extends g {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f83799o = 0;

    /* renamed from: h, reason: collision with root package name */
    public i f83800h;

    /* renamed from: i, reason: collision with root package name */
    private File f83801i;

    /* renamed from: j, reason: collision with root package name */
    private Hi.i f83802j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f83803k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f83804l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final b.a f83805m;

    /* renamed from: n, reason: collision with root package name */
    private Ii.a f83806n;

    public static final class a {
        @NotNull
        public static Intent a(@NotNull Context context, k kVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) GalleryActivity.class);
            if (kVar == null) {
                kVar = C2779a.d();
            }
            Intent putExtra = intent.putExtra("GALLERY_PAGE_CONFIG_ARG", kVar);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        public static f b(Intent intent) {
            Object parcelableExtra;
            if (intent == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT < 33) {
                return (f) intent.getParcelableExtra("extra_gallery_activity_result");
            }
            parcelableExtra = intent.getParcelableExtra("extra_gallery_activity_result", f.class);
            return (f) parcelableExtra;
        }
    }

    static final class b extends AbstractC7737t implements Function0<C10779a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10779a invoke() {
            Bundle extras = GalleryActivity.this.getIntent().getExtras();
            if (extras != null) {
                return (C10779a) Ei.b.a(extras, "CAMERA_PAGE_CONFIG_ARG", C10779a.class);
            }
            return null;
        }
    }

    static final class c extends AbstractC7737t implements Function0<k> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final k invoke() {
            Bundle extras = GalleryActivity.this.getIntent().getExtras();
            if (extras != null) {
                return (k) Ei.b.a(extras, "GALLERY_PAGE_CONFIG_ARG", k.class);
            }
            return null;
        }
    }

    public GalleryActivity() {
        n nVar = n.NONE;
        this.f83803k = Sc.k.a(nVar, new c());
        this.f83804l = Sc.k.a(nVar, new b());
        this.f83805m = new b.a(this);
    }

    public static final void J(GalleryActivity galleryActivity) {
        if (Intrinsics.d(null, Fi.f.f9495a)) {
            Ii.a aVar = galleryActivity.f83806n;
            Intrinsics.f(aVar);
            FrameLayout loadingOverlay = aVar.f12552b;
            Intrinsics.checkNotNullExpressionValue(loadingOverlay, "loadingOverlay");
            loadingOverlay.setVisibility(8);
            return;
        }
        if (!Intrinsics.d(null, Fi.g.f9496a)) {
            throw new o();
        }
        Ii.a aVar2 = galleryActivity.f83806n;
        Intrinsics.f(aVar2);
        FrameLayout loadingOverlay2 = aVar2.f12552b;
        Intrinsics.checkNotNullExpressionValue(loadingOverlay2, "loadingOverlay");
        loadingOverlay2.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final k N() {
        return (k) this.f83803k.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Sc.j, java.lang.Object] */
    public final void K(@NotNull Bi.c result, @NotNull List<? extends Hi.k> legacyMedia) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(legacyMedia, "legacyMedia");
        Intent putExtra = new Intent().putExtra("extra_camera_activity_result", result);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        List<? extends Hi.k> list = legacyMedia;
        if (!list.isEmpty()) {
            putExtra.putParcelableArrayListExtra("media_arg", new ArrayList<>(list));
        }
        C10779a c10779a = (C10779a) this.f83804l.getValue();
        if (c10779a == null) {
            throw new IllegalStateException("Camera page config is not specified");
        }
        setResult(c10779a.e(), putExtra);
        finish();
    }

    public final void L(@NotNull f result, @NotNull List<? extends Hi.k> legacyMedia) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(legacyMedia, "legacyMedia");
        Intent putExtra = new Intent().putExtra("extra_gallery_activity_result", result);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        List<? extends Hi.k> list = legacyMedia;
        if (!list.isEmpty()) {
            putExtra.putParcelableArrayListExtra("media_arg", new ArrayList<>(list));
        }
        k N11 = N();
        if (N11 == null) {
            throw new IllegalStateException("Gallery page config is not specified");
        }
        setResult(N11.i(), putExtra);
        finish();
    }

    /* renamed from: M, reason: from getter */
    public final File getF83801i() {
        return this.f83801i;
    }

    /* renamed from: O, reason: from getter */
    public final Hi.i getF83802j() {
        return this.f83802j;
    }

    @NotNull
    public final i P() {
        i iVar = this.f83800h;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    public final void Q(@NotNull Hi.k ozMedia) {
        Intrinsics.checkNotNullParameter(ozMedia, "ozMedia");
        S(C7714v.a0(Long.valueOf(ozMedia.getId())));
        Hi.i iVar = this.f83802j;
        this.f83802j = iVar != null ? Hi.i.a(iVar, null) : null;
    }

    public final void R(File file) {
        this.f83801i = file;
    }

    public final void S(@NotNull List<Long> selectedIds) {
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        P();
        Intrinsics.checkNotNullParameter(this, "activity");
        ComponentCallbacksC5392m g02 = getSupportFragmentManager().g0("GalleryFragment");
        C4069c c4069c = g02 instanceof C4069c ? (C4069c) g02 : null;
        if (c4069c != null) {
            c4069c.i0(selectedIds);
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        InterfaceC6512o<GalleryActivity, Integer, Integer, Intent, Unit> e11;
        super.onActivityResult(i11, i12, intent);
        k N11 = N();
        if (N11 == null || (e11 = N11.e()) == null) {
            return;
        }
        e11.invoke(this, Integer.valueOf(i11), Integer.valueOf(i12), intent);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int f7;
        Hi.i h11;
        String string;
        k N11 = N();
        ?? r12 = this.f83804l;
        if (N11 == null && ((C10779a) r12.getValue()) == null) {
            throw new IllegalStateException("Neither Gallery page config nor Camera page config are specified");
        }
        k N12 = N();
        if (N12 != null) {
            f7 = N12.j();
        } else {
            C10779a c10779a = (C10779a) r12.getValue();
            if (c10779a == null) {
                return;
            } else {
                f7 = c10779a.f();
            }
        }
        setTheme(f7);
        super.onCreate(bundle);
        this.f83801i = (bundle == null || (string = bundle.getString("CAMERA_TEMP_FILE_ARG")) == null) ? null : new File(string);
        if (bundle == null || (h11 = (Hi.i) Ei.b.a(bundle, "CAMERA_RESTORABLE_STATE_ARG", Hi.i.class)) == null) {
            k N13 = N();
            h11 = N13 != null ? N13.h() : null;
        }
        this.f83802j = h11;
        Window window = getWindow();
        window.setStatusBarColor(ThemeExtKt.themeColor(this, R$attr.bgDarkKey));
        window.setNavigationBarColor(ThemeExtKt.themeColor(this, R$attr.bgDarkKey));
        View decorView = window.getDecorView();
        decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(0);
        Ii.a b11 = Ii.a.b(getLayoutInflater());
        this.f83806n = b11;
        setContentView(b11.a());
        Pi.b.a().b(this);
        C10727i.c(K.a(this), null, null, new ru.ozon.android.gallery.media.view.a(this, null), 3);
        k pageConfig = N();
        if (pageConfig != null) {
            i P11 = P();
            Intrinsics.checkNotNullParameter(this, "activity");
            Intrinsics.checkNotNullParameter(pageConfig, "pageConfig");
            getSupportFragmentManager().n1("CAMERA_REQUEST_KEY", this, new i0(this, P11, pageConfig));
            P();
            i.c(this, pageConfig, bundle);
        }
        C10779a pageConfig2 = (C10779a) r12.getValue();
        if (pageConfig2 != null) {
            i P12 = P();
            Intrinsics.checkNotNullParameter(this, "activity");
            getSupportFragmentManager().n1("CAMERA_REQUEST_KEY", this, new Q(P12, this));
            P();
            Intrinsics.checkNotNullParameter(this, "activity");
            Intrinsics.checkNotNullParameter(pageConfig2, "pageConfig");
            if (bundle != null) {
                return;
            }
            i.b(this, pageConfig2.d(), false, pageConfig2);
        }
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        this.f83806n = null;
    }

    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        File file = this.f83801i;
        if (file != null) {
            outState.putString("CAMERA_TEMP_FILE_ARG", file.getAbsolutePath());
        }
        Hi.i iVar = this.f83802j;
        if (iVar != null) {
            outState.putParcelable("CAMERA_RESTORABLE_STATE_ARG", iVar);
        }
    }

    public final void requestPermission(@NotNull Function1<? super b.a, Unit> buildPermissionRequest) {
        Intrinsics.checkNotNullParameter(buildPermissionRequest, "buildPermissionRequest");
        b.a aVar = this.f83805m;
        buildPermissionRequest.invoke(aVar);
        aVar.a().a();
    }
}
