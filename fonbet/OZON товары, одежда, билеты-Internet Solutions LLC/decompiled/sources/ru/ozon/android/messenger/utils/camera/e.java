package ru.ozon.android.messenger.utils.camera;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ci.C2779a;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6762h;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;

/* loaded from: classes10.dex */
public final class e implements ru.ozon.android.messenger.utils.camera.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C11115c f91838a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Uri> f91839b;

    /* renamed from: c, reason: collision with root package name */
    private String f91840c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f91841d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC6592d<String[]> f91842e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC6592d<Uri> f91843f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f91844g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f91845h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f91846i;

    static final class a extends AbstractC7737t implements Function0<Function1<? super File, ? extends Unit>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f91847b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Function1<? super File, ? extends Unit> invoke() {
            return d.f91837b;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Function2<? super Context, ? super File, ? extends Unit>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Function2<? super Context, ? super File, ? extends Unit> invoke() {
            return new f(e.this);
        }
    }

    static final class c extends AbstractC7737t implements Function0<Function2<? super ComponentCallbacksC5392m, ? super String, ? extends Unit>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Function2<? super ComponentCallbacksC5392m, ? super String, ? extends Unit> invoke() {
            return new i(e.this);
        }
    }

    public e() {
        C11115c a11 = ze.k.a(1, 6, null);
        this.f91838a = a11;
        this.f91839b = C2399j.H(a11);
        this.f91844g = ru.ozon.android.messenger.utils.f.b(new b());
        this.f91845h = ru.ozon.android.messenger.utils.f.b(a.f91847b);
        this.f91846i = ru.ozon.android.messenger.utils.f.b(new c());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Sc.j, java.lang.Object] */
    public static void a(e eVar, ru.ozon.android.messenger.framework.presentation.chatdetail.d dVar, Boolean bool) {
        String str = eVar.f91840c;
        if (str != null) {
            File file = new File(str);
            if (!bool.booleanValue()) {
                ((Function1) eVar.f91845h.getValue()).invoke(file);
                return;
            }
            Function2 function2 = (Function2) eVar.f91844g.getValue();
            Context requireContext = dVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            function2.invoke(requireContext, file);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Sc.j, java.lang.Object] */
    public static void c(e eVar, ru.ozon.android.messenger.framework.presentation.chatdetail.d dVar, Map grantedMap) {
        Object obj;
        Intrinsics.checkNotNullParameter(grantedMap, "grantedMap");
        Iterator it = grantedMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (!((Boolean) ((Map.Entry) obj).getValue()).booleanValue()) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            ((Function2) eVar.f91846i.getValue()).invoke(dVar, entry.getKey());
            return;
        }
        eVar.getClass();
        File a11 = Fi.c.a(C2779a.c());
        Context requireContext = dVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Uri c11 = Fi.c.c(requireContext, a11);
        eVar.f91840c = a11.getAbsolutePath();
        AbstractC6592d<Uri> abstractC6592d = eVar.f91843f;
        if (abstractC6592d == null) {
            throw new IllegalStateException("resultListener was not initialized");
        }
        abstractC6592d.a(c11);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.utils.camera.a
    public final void b(@NotNull ComponentCallbacksC5392m fragment) {
        String str;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        int i11 = 0;
        String[] strArr = Build.VERSION.SDK_INT <= 29 ? (String[]) C7705l.U(Li.a.b(), "android.permission.CAMERA") : new String[]{"android.permission.CAMERA"};
        r activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        int length = strArr.length;
        while (true) {
            if (i11 >= length) {
                str = null;
                break;
            }
            str = strArr[i11];
            if (androidx.core.app.b.h(activity, str)) {
                break;
            } else {
                i11++;
            }
        }
        if (str != null) {
            ((Function2) this.f91846i.getValue()).invoke(fragment, str);
            return;
        }
        AbstractC6592d<String[]> abstractC6592d = this.f91842e;
        if (abstractC6592d != null) {
            abstractC6592d.a(strArr);
        }
    }

    @NotNull
    public final InterfaceC2395h<Uri> f() {
        return this.f91839b;
    }

    public final void g(@NotNull ComponentCallbacksC5392m fragment, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (bundle == null) {
            return;
        }
        this.f91840c = bundle.getString("TEMP_FILE_ABS_PATH_BUNDLE_KEY");
        boolean z11 = bundle.getBoolean("SETTINGS_SCREENS_BUNDLE_KEY");
        this.f91841d = z11;
        if (z11) {
            b(fragment);
            this.f91841d = false;
        }
    }

    @NotNull
    public final Bundle h() {
        return androidx.core.os.d.b(new Pair("TEMP_FILE_ABS_PATH_BUNDLE_KEY", this.f91840c), new Pair("SETTINGS_SCREENS_BUNDLE_KEY", Boolean.valueOf(this.f91841d)));
    }

    public final void i(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        final ru.ozon.android.messenger.framework.presentation.chatdetail.d dVar = (ru.ozon.android.messenger.framework.presentation.chatdetail.d) fragment;
        this.f91842e = fragment.registerForActivityResult(new C6762h(), new InterfaceC6590b() { // from class: ru.ozon.android.messenger.utils.camera.b
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                e.c(e.this, dVar, (Map) obj);
            }
        });
        this.f91843f = fragment.registerForActivityResult(new h.l(), new InterfaceC6590b() { // from class: ru.ozon.android.messenger.utils.camera.c
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                e.a(e.this, dVar, (Boolean) obj);
            }
        });
    }
}
