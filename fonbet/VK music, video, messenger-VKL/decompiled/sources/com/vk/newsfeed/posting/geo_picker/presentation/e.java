package com.vk.newsfeed.posting.geo_picker.presentation;

import android.app.Dialog;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.c;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.util.NoLocation;
import com.vk.location.common.LocationCommon;
import com.vk.movika.sdk.base.flow.binding.l;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.newsfeed.posting.impl.domain.model.GeoPermissionStatus;
import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import com.vk.newsfeed.posting.impl.domain.model.PlacesLoadingState;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.asu0;
import xsna.bra0;
import xsna.cra0;
import xsna.dhr0;
import xsna.dw20;
import xsna.e3m;
import xsna.ebs;
import xsna.epx;
import xsna.ey90;
import xsna.f4z;
import xsna.g0t;
import xsna.gm50;
import xsna.h90;
import xsna.hoh;
import xsna.km50;
import xsna.kmu0;
import xsna.kn4;
import xsna.mh4;
import xsna.mhy;
import xsna.mk50;
import xsna.nht;
import xsna.oxz;
import xsna.rqa0;
import xsna.s8g0;
import xsna.sra0;
import xsna.tl50;
import xsna.tqa0;
import xsna.ts90;
import xsna.tvo;
import xsna.tzp0;
import xsna.uqa0;
import xsna.vk50;
import xsna.w8i;
import xsna.wqa0;
import xsna.xd40;
import xsna.xn50;
import xsna.xqa0;
import xsna.xzs;
import xsna.yfb;
import xsna.yhu;
import xsna.yqa0;
import xsna.yx90;

/* compiled from: PlacePickerModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class e extends tl50<com.vk.newsfeed.posting.geo_picker.presentation.b, j, com.vk.newsfeed.posting.geo_picker.presentation.a> implements w8i, tvo.a, nht, h90.a, tqa0 {
    public static final /* synthetic */ int t1 = 0;
    public final Handler i1 = new Handler(Looper.getMainLooper());
    public wqa0 j1;
    public final uqa0 k1;
    public final f l1;
    public final cra0<yqa0> m1;
    public sra0 n1;
    public final f4z o1;
    public View p1;
    public View q1;
    public xd40 r1;
    public s8g0 s1;

    /* compiled from: PlacePickerModalBottomSheet.kt */
    public static final /* synthetic */ class b implements tqa0, g0t {
        public b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof tqa0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, e.this, e.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.tqa0
        public final void yi(com.vk.newsfeed.posting.geo_picker.presentation.a aVar) {
            e eVar = e.this;
            eVar.getClass();
            xn50.a.c(eVar, aVar);
        }
    }

    public e() {
        uqa0.a aVar = new uqa0.a();
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.b;
        if (executorService == null) {
            synchronized (c.a.a) {
                try {
                    if (c.a.b == null) {
                        asu0.a.getClass();
                        ExecutorService D = asu0.D();
                        c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            executorService = c.a.b;
        }
        uqa0 uqa0Var = new uqa0(new androidx.recyclerview.widget.c(null, executorService, aVar), this);
        this.k1 = uqa0Var;
        this.l1 = new f(this);
        this.m1 = new cra0<>(uqa0Var, new bra0(this));
        this.o1 = new f4z();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        s8g0 s8g0Var;
        Context requireContext = requireContext();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ebs c = kn4.c(this);
            dhr0.a.getClass();
            Context E = dhr0.E();
            ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E));
            PermissionHelper.a.getClass();
            s8g0Var = new s8g0(c, null, ey90Var, new yx90(R.string.geo_picker_permission_title, 14, PermissionHelper.h, PermissionHelper.i, true), new l(15, this, activity), null, null, null, null, null);
        } else {
            s8g0Var = null;
        }
        this.s1 = s8g0Var;
        b bVar = new b();
        uqa0 uqa0Var = this.k1;
        sra0 sra0Var = new sra0(requireContext, this, bVar, uqa0Var);
        this.n1 = sra0Var;
        uqa0Var.d.b.add(this.m1);
        return new mk50.c(sra0Var.e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        j jVar = (j) ao50Var;
        sra0 sra0Var = this.n1;
        if (sra0Var != null) {
            new hoh(1, this, e.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6);
            gm50.a.b(sra0Var, jVar.a, new yhu(sra0Var, 18));
        }
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        s8g0 s8g0Var = this.s1;
        if (s8g0Var != null) {
            s8g0Var.K0(i, strArr);
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.newsfeed.posting.geo_picker.presentation.b bVar = (com.vk.newsfeed.posting.geo_picker.presentation.b) vk50Var;
        bVar.g.a(new mh4(24, this, bVar), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, rqa0.b);
        return true;
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
        }
        xn50.a.c(this, new a.d.C1413d(SystemClock.elapsedRealtime()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        View view = this.q1;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        Object obj = fVar != null ? fVar.a : null;
        ModalBottomSheetBehavior modalBottomSheetBehavior = obj instanceof ModalBottomSheetBehavior ? (ModalBottomSheetBehavior) obj : null;
        if (modalBottomSheetBehavior != null && modalBottomSheetBehavior.k == 5) {
            mhy.d(getView());
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        s8g0 s8g0Var = this.s1;
        if (s8g0Var != null) {
            s8g0Var.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getActivity() == null) {
            return;
        }
        AtomicReference<Location> atomicReference = oxz.a;
        LocationCommon.a.getClass();
        xn50.a.c(this, new a.b.C1409b(!LocationCommon.b(r0), !LocationCommon.a(r0)));
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        s8g0 s8g0Var = this.s1;
        if (s8g0Var != null) {
            s8g0Var.pc(i, list);
        }
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        s8g0 s8g0Var = this.s1;
        if (s8g0Var != null) {
            s8g0Var.wi(i, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r1 == null) goto L13;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        PlacePickerArguments placePickerArguments;
        boolean z;
        boolean z2;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("PollEditorArguments", PlacePickerArguments.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("PollEditorArguments");
                if (!(parcelable3 instanceof PlacePickerArguments)) {
                    parcelable3 = null;
                }
                parcelable = (PlacePickerArguments) parcelable3;
            }
            placePickerArguments = (PlacePickerArguments) parcelable;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        EmptyList emptyList = EmptyList.b;
        GeoPermissionStatus geoPermissionStatus = GeoPermissionStatus.DeviceRestricted;
        PlacesLoadingState placesLoadingState = PlacesLoadingState.Idle;
        NoLocation noLocation = NoLocation.b;
        placePickerArguments = new PlacePickerArguments(elapsedRealtime, new NearbyPlaces(emptyList, 0, 0, placesLoadingState, geoPermissionStatus, noLocation, noLocation));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AtomicReference<Location> atomicReference = oxz.a;
            LocationCommon.a.getClass();
            z = LocationCommon.a(activity);
        } else {
            z = true;
        }
        boolean z3 = !z;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            LocationCommon.a.getClass();
            z2 = LocationCommon.b(activity2);
        } else {
            z2 = true;
        }
        return new com.vk.newsfeed.posting.geo_picker.presentation.b(new xqa0(new com.vk.movika.sdk.android.defaultplayer.layout.a(requireContext())), new h(this, PlacePickerState.a(PlacePickerState.o, null, null, 0, null, null, false, null, !z2, z3, false, null, 13311)), new a.InterfaceC1406a.C1407a(placePickerArguments.b, placePickerArguments.c), this.r1, this.o1);
    }

    @Override // xsna.tqa0
    public final void yi(com.vk.newsfeed.posting.geo_picker.presentation.a aVar) {
        xn50.a.c(this, aVar);
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        View findViewById = yn.findViewById(R.id.coordinator);
        this.p1 = findViewById;
        this.q1 = findViewById != null ? findViewById.findViewById(R.id.design_bottom_sheet) : null;
        return yn;
    }

    /* compiled from: PlacePickerModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final NearbyPlaces h;
        public final long i;
        public final wqa0 j;
        public final xd40 k;

        public a(Context context, NearbyPlaces nearbyPlaces, long j, wqa0 wqa0Var, xd40 xd40Var) {
            super(context, new tzp0.c.a(new d(), true));
            this.h = nearbyPlaces;
            this.i = j;
            this.j = wqa0Var;
            this.k = xd40Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c(new ts90(1.0f, 2));
            F0(true);
            x(0);
            R0(false);
            I(true);
            p(true);
            this.d.C1 = true;
            m(R.attr.vk_ui_background_modal);
            e eVar = new e();
            eVar.setArguments(yfb.b(new Pair("PollEditorArguments", new PlacePickerArguments(this.i, this.h))));
            wqa0 wqa0Var = this.j;
            eVar.j1 = wqa0Var;
            eVar.l1.b = wqa0Var;
            eVar.r1 = this.k;
            n(new C1415a(eVar));
            return eVar;
        }

        /* compiled from: PlacePickerModalBottomSheet.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.e$a$a, reason: collision with other inner class name */
        public static final class C1415a extends ModalBottomSheetBehavior.d {
            public final /* synthetic */ e a;

            public C1415a(e eVar) {
                this.a = eVar;
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void b(int i, View view) {
                e eVar = this.a;
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        return;
                    }
                    eVar.getFeature().C(a.d.c.b);
                } else {
                    sra0 sra0Var = eVar.n1;
                    if (sra0Var != null) {
                        sra0Var.f.setLayoutTransition(sra0Var.m);
                        sra0Var.g.setLayoutTransition(sra0Var.n);
                    }
                }
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void a(View view, float f) {
            }
        }
    }
}
