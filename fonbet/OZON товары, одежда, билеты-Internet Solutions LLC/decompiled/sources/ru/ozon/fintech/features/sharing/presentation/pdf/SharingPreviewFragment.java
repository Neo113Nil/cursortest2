package ru.ozon.fintech.features.sharing.presentation.pdf;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Ae.x0;
import B90.s0;
import B90.t0;
import C.D;
import H30.z;
import Sc.InterfaceC4008j;
import Sc.s;
import X80.a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b80.InterfaceC5585a;
import c3.C5741c;
import c80.C5768a;
import com.facebook.shimmer.ShimmerFrameLayout;
import f3.AbstractC6409a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import u90.C9987a;
import xe.C10727i;
import xe.M;
import xe.N;

@Keep
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J/\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u0013\u0010*\u001a\u00020\u001a*\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u001d*\u00020)2\u0006\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0003R\u001a\u00105\u001a\u00020/8\u0016X\u0096D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010;\u001a\u00020/8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u00108R\u001a\u0010<\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00106R\u001a\u0010J\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\u0016\u0010U\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010RR\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lru/ozon/fintech/features/sharing/presentation/pdf/SharingPreviewFragment;", "LX80/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "onResume", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "scaleFactor", "onScaleChange", "(F)V", "startAnimateButton", "animateShareBtn", "La80/b;", "toImageResId", "(La80/b;)I", "sizeOfFile", "toSubTitle", "(La80/b;Ljava/lang/String;)Ljava/lang/String;", "", "hide", "hideShowButton", "(Z)V", "hideSystemBarUi", "returnSystemBarUi", "lightStatusBar", "Z", "getLightStatusBar", "()Z", "isStandaloneIntegration$delegate", "LSc/j;", "isStandaloneIntegration", "dimAmount", "F", "getDimAmount", "()F", "LW70/d;", "binding", "LW70/d;", "Lc80/i;", "viewModel$delegate", "getViewModel", "()Lc80/i;", "viewModel", "isBtnHidden", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "getOnBackPressedCallback", "()Landroidx/activity/C;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "savedSystemBarColor", "I", "savedNavBarColor", "shortAnimationDuration", "buttonDiff", "Lkotlin/Function0;", "pendingShareBtnAnim", "Lkotlin/jvm/functions/Function0;", "fragmentName", "Ljava/lang/String;", "getFragmentName", "()Ljava/lang/String;", "Companion", "a", "sharing-files_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharingPreviewFragment extends a {
    private static final long BUTTON_ANIMATION_DURATION = 400;

    @NotNull
    private static final String BUTTON_TEXT = "button_text";

    @NotNull
    private static final String FILE_CONTENT_DEPOSITION = "sharing_file_deposition";

    @NotNull
    private static final String FILE_CONTENT_LENGTH = "sharing_file_content_length";

    @NotNull
    private static final String FILE_MIME_TYPE = "sharing_file_mime_type";

    @NotNull
    private static final String FILE_URL = "sharing_file_url";

    @NotNull
    private static final String FRAGMENT_NAME = "SharingPreviewFragment";

    @NotNull
    private static final String FRAGMENT_TITLE = "sharing_title";

    @NotNull
    private static final String IS_FROM_BASE64 = "is_base64";
    private W70.d binding;
    private int buttonDiff;
    private final float dimAmount;

    @NotNull
    private final String fragmentName;
    private boolean isBtnHidden;

    @NotNull
    private final C onBackPressedCallback;
    private Function0<Unit> pendingShareBtnAnim;
    private int savedNavBarColor;
    private int savedSystemBarColor;
    private int shortAnimationDuration;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;
    private ViewPager2 viewPager2;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static final int BUTTON_HEIGHT = D.c(56.0f);
    private final boolean lightStatusBar = true;

    /* renamed from: isStandaloneIntegration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isStandaloneIntegration = Sc.k.b(new B50.b(this, 2));

    /* renamed from: ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static Bundle a(@NotNull String url, @NotNull String contentDeposition, long j11, String str, String str2, boolean z11, String str3) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(contentDeposition, "contentDeposition");
            return androidx.core.os.d.b(new Pair(SharingPreviewFragment.FRAGMENT_TITLE, str), new Pair(SharingPreviewFragment.FILE_URL, url), new Pair(SharingPreviewFragment.FILE_CONTENT_DEPOSITION, contentDeposition), new Pair(SharingPreviewFragment.FILE_CONTENT_LENGTH, Long.valueOf(j11)), new Pair(SharingPreviewFragment.FILE_MIME_TYPE, str2), new Pair(SharingPreviewFragment.IS_FROM_BASE64, Boolean.valueOf(z11)), new Pair(SharingPreviewFragment.BUTTON_TEXT, str3));
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96146a;

        static {
            int[] iArr = new int[a80.b.values().length];
            try {
                iArr[a80.b.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a80.b.XLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a80.b.ONE_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a80.b.TXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a80.b.XML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a80.b.ZIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f96146a = iArr;
        }
    }

    public static final class c extends C {
        c() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            SharingPreviewFragment sharingPreviewFragment = SharingPreviewFragment.this;
            W70.d dVar = sharingPreviewFragment.binding;
            if (dVar == null || !dVar.f33309e.close()) {
                sharingPreviewFragment.getViewModel().I0();
            }
        }
    }

    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f96148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SharingPreviewFragment f96149b;

        public d(ConstraintLayout constraintLayout, SharingPreviewFragment sharingPreviewFragment) {
            this.f96148a = constraintLayout;
            this.f96149b = sharingPreviewFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ConstraintLayout constraintLayout = this.f96148a;
            if (constraintLayout.getMeasuredWidth() <= 0 || constraintLayout.getMeasuredHeight() <= 0) {
                return;
            }
            constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            SharingPreviewFragment sharingPreviewFragment = this.f96149b;
            W70.d dVar = sharingPreviewFragment.binding;
            sharingPreviewFragment.buttonDiff = dVar != null ? dVar.a().getBottom() - dVar.f33311g.getTop() : -1;
            W70.d dVar2 = sharingPreviewFragment.binding;
            if (dVar2 != null) {
                dVar2.f33311g.setTranslationY(sharingPreviewFragment.buttonDiff);
                Function0 function0 = sharingPreviewFragment.pendingShareBtnAnim;
                if (function0 != null) {
                    function0.invoke();
                    sharingPreviewFragment.pendingShareBtnAnim = null;
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$1", f = "SharingPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96150d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96151e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96153g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SharingPreviewFragment f96154h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$1$1", f = "SharingPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96155d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96156e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SharingPreviewFragment f96157f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2069a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SharingPreviewFragment f96158a;

                public C2069a(SharingPreviewFragment sharingPreviewFragment) {
                    this.f96158a = sharingPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    W70.d dVar2;
                    ScreenState screenState = (ScreenState) t2;
                    SharingPreviewFragment sharingPreviewFragment = this.f96158a;
                    W70.d dVar3 = sharingPreviewFragment.binding;
                    if (dVar3 != null) {
                        dVar3.f33310f.setVisibility((screenState == null || (screenState instanceof ScreenState.Progress)) ? 8 : 0);
                    }
                    if (screenState instanceof ScreenState.Progress) {
                        W70.d dVar4 = sharingPreviewFragment.binding;
                        if (dVar4 != null) {
                            ShimmerFrameLayout shimmerFrameLayout = dVar4.f33312h;
                            shimmerFrameLayout.a();
                            shimmerFrameLayout.setVisibility(0);
                        }
                    } else {
                        W70.d dVar5 = sharingPreviewFragment.binding;
                        if (dVar5 != null) {
                            ShimmerFrameLayout shimmerFrameLayout2 = dVar5.f33312h;
                            shimmerFrameLayout2.b();
                            shimmerFrameLayout2.setVisibility(8);
                        }
                        if (screenState != null && (dVar2 = sharingPreviewFragment.binding) != null) {
                            dVar2.f33310f.bindState(screenState);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
                super(2, dVar);
                this.f96156e = interfaceC2395h;
                this.f96157f = sharingPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96156e, dVar, this.f96157f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96155d;
                if (i11 == 0) {
                    s.b(obj);
                    C2069a c2069a = new C2069a(this.f96157f);
                    this.f96155d = 1;
                    if (this.f96156e.collect(c2069a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
            super(2, dVar);
            this.f96153g = interfaceC2395h;
            this.f96154h = sharingPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = SharingPreviewFragment.this.new e(this.f96153g, dVar, this.f96154h);
            eVar.f96151e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96150d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96151e)) {
                    J viewLifecycleOwner = SharingPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96153g, null, this.f96154h);
                    this.f96150d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$2", f = "SharingPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96159d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96160e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96162g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SharingPreviewFragment f96163h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$2$1", f = "SharingPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96164d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96165e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SharingPreviewFragment f96166f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2070a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SharingPreviewFragment f96167a;

                public C2070a(SharingPreviewFragment sharingPreviewFragment) {
                    this.f96167a = sharingPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    PermissionsScreenStateView permissionsScreenStateView;
                    C9987a c9987a = (C9987a) t2;
                    W70.d dVar2 = this.f96167a.binding;
                    if (dVar2 != null && (permissionsScreenStateView = dVar2.f33309e) != null) {
                        permissionsScreenStateView.setVisibility(c9987a != null ? 0 : 8);
                        if (c9987a != null) {
                            permissionsScreenStateView.c(c9987a);
                            permissionsScreenStateView.expand();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
                super(2, dVar);
                this.f96165e = interfaceC2395h;
                this.f96166f = sharingPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96165e, dVar, this.f96166f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96164d;
                if (i11 == 0) {
                    s.b(obj);
                    C2070a c2070a = new C2070a(this.f96166f);
                    this.f96164d = 1;
                    if (this.f96165e.collect(c2070a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
            super(2, dVar);
            this.f96162g = interfaceC2395h;
            this.f96163h = sharingPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = SharingPreviewFragment.this.new f(this.f96162g, dVar, this.f96163h);
            fVar.f96160e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96159d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96160e)) {
                    J viewLifecycleOwner = SharingPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96162g, null, this.f96163h);
                    this.f96159d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$3", f = "SharingPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96168d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96169e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96171g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SharingPreviewFragment f96172h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$3$1", f = "SharingPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96173d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96174e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SharingPreviewFragment f96175f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$g$a$a, reason: collision with other inner class name */
            public static final class C2071a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SharingPreviewFragment f96176a;

                public C2071a(SharingPreviewFragment sharingPreviewFragment) {
                    this.f96176a = sharingPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AbstractC9781a abstractC9781a = (AbstractC9781a) t2;
                    if (abstractC9781a != null) {
                        boolean z11 = abstractC9781a instanceof AbstractC9781a.b;
                        SharingPreviewFragment sharingPreviewFragment = this.f96176a;
                        if (z11) {
                            List<InterfaceC9636e> a11 = ((AbstractC9781a.b) abstractC9781a).a();
                            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                            Iterator<T> it = a11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InterfaceC9636e) it.next()).a());
                            }
                            sharingPreviewFragment.requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
                        } else if (abstractC9781a instanceof AbstractC9781a.C2181a) {
                            sharingPreviewFragment.requireContext().startActivity(((AbstractC9781a.C2181a) abstractC9781a).a());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
                super(2, dVar);
                this.f96174e = c02;
                this.f96175f = sharingPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96174e, dVar, this.f96175f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96173d;
                if (i11 == 0) {
                    s.b(obj);
                    C2071a c2071a = new C2071a(this.f96175f);
                    this.f96173d = 1;
                    if (this.f96174e.collect(c2071a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C0 c02, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
            super(2, dVar);
            this.f96171g = c02;
            this.f96172h = sharingPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = SharingPreviewFragment.this.new g(this.f96171g, dVar, this.f96172h);
            gVar.f96169e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96168d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96169e)) {
                    J viewLifecycleOwner = SharingPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96171g, null, this.f96172h);
                    this.f96168d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$4", f = "SharingPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96177d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96178e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96180g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SharingPreviewFragment f96181h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$4$1", f = "SharingPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96182d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96183e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SharingPreviewFragment f96184f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$h$a$a, reason: collision with other inner class name */
            public static final class C2072a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SharingPreviewFragment f96185a;

                public C2072a(SharingPreviewFragment sharingPreviewFragment) {
                    this.f96185a = sharingPreviewFragment;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    InterfaceC5585a interfaceC5585a = (InterfaceC5585a) t2;
                    boolean z11 = interfaceC5585a instanceof InterfaceC5585a.c;
                    SharingPreviewFragment sharingPreviewFragment = this.f96185a;
                    if (z11) {
                        W70.d dVar2 = sharingPreviewFragment.binding;
                        if (dVar2 != null) {
                            InterfaceC5585a.c cVar = (InterfaceC5585a.c) interfaceC5585a;
                            int imageResId = sharingPreviewFragment.toImageResId(cVar.c());
                            ImageView imageView = dVar2.f33306b;
                            imageView.setImageResource(imageResId);
                            imageView.setVisibility(0);
                            String b11 = cVar.b();
                            TextView textView = dVar2.f33307c;
                            textView.setText(b11);
                            textView.setVisibility(0);
                            String subTitle = sharingPreviewFragment.toSubTitle(cVar.c(), cVar.d());
                            TextView textView2 = dVar2.f33308d;
                            textView2.setText(subTitle);
                            textView2.setVisibility(0);
                            FinLargeButtonState copy$default = FinLargeButtonState.copy$default(cVar.a(), null, null, sharingPreviewFragment.new k(), null, null, null, null, null, null, 507, null);
                            FinLargeButtonView finLargeButtonView = dVar2.f33311g;
                            finLargeButtonView.bindState(copy$default);
                            finLargeButtonView.setVisibility(0);
                            sharingPreviewFragment.startAnimateButton();
                        }
                    } else if (interfaceC5585a instanceof InterfaceC5585a.b) {
                        ViewPager2 viewPager2 = sharingPreviewFragment.viewPager2;
                        if ((viewPager2 != null ? viewPager2.e() : null) != null) {
                            viewPager2 = null;
                        }
                        if (viewPager2 != null) {
                            int b12 = ((InterfaceC5585a.b) interfaceC5585a).b();
                            AbstractC5434v lifecycle = sharingPreviewFragment.getLifecycle();
                            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                            G childFragmentManager = sharingPreviewFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            viewPager2.s(new C5768a(b12, lifecycle, childFragmentManager));
                        }
                        W70.d dVar3 = sharingPreviewFragment.binding;
                        if (dVar3 != null) {
                            FinLargeButtonView finLargeButtonView2 = dVar3.f33311g;
                            finLargeButtonView2.bindState(FinLargeButtonState.copy$default(((InterfaceC5585a.b) interfaceC5585a).a(), null, null, sharingPreviewFragment.new l(), null, null, null, null, null, null, 507, null));
                            finLargeButtonView2.setVisibility(0);
                            sharingPreviewFragment.startAnimateButton();
                        }
                    } else if (!Intrinsics.d(interfaceC5585a, InterfaceC5585a.C0832a.f55718a)) {
                        throw new Sc.o();
                    }
                    if (interfaceC5585a instanceof InterfaceC5585a.b) {
                        ViewPager2 viewPager22 = sharingPreviewFragment.viewPager2;
                        if (viewPager22 != null) {
                            z.b(sharingPreviewFragment.shortAnimationDuration, viewPager22);
                        }
                    } else {
                        ViewPager2 viewPager23 = sharingPreviewFragment.viewPager2;
                        if (viewPager23 != null) {
                            viewPager23.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
                super(2, dVar);
                this.f96183e = interfaceC2395h;
                this.f96184f = sharingPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96183e, dVar, this.f96184f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96182d;
                if (i11 == 0) {
                    s.b(obj);
                    C2072a c2072a = new C2072a(this.f96184f);
                    this.f96182d = 1;
                    if (this.f96183e.collect(c2072a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
            super(2, dVar);
            this.f96180g = interfaceC2395h;
            this.f96181h = sharingPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = SharingPreviewFragment.this.new h(this.f96180g, dVar, this.f96181h);
            hVar.f96178e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96177d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96178e)) {
                    J viewLifecycleOwner = SharingPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96180g, null, this.f96181h);
                    this.f96177d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$5", f = "SharingPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96186d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96187e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96189g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SharingPreviewFragment f96190h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$5$1", f = "SharingPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96191d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96192e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SharingPreviewFragment f96193f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$i$a$a, reason: collision with other inner class name */
            public static final class C2073a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SharingPreviewFragment f96194a;

                public C2073a(SharingPreviewFragment sharingPreviewFragment) {
                    this.f96194a = sharingPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    SharingPreviewFragment sharingPreviewFragment = this.f96194a;
                    sharingPreviewFragment.startActivity(Intent.createChooser((Intent) t2, sharingPreviewFragment.requireContext().getString(R.string.fintech_share_file_chooser_title)));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
                super(2, dVar);
                this.f96192e = c02;
                this.f96193f = sharingPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96192e, dVar, this.f96193f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96191d;
                if (i11 == 0) {
                    s.b(obj);
                    C2073a c2073a = new C2073a(this.f96193f);
                    this.f96191d = 1;
                    if (this.f96192e.collect(c2073a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C0 c02, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
            super(2, dVar);
            this.f96189g = c02;
            this.f96190h = sharingPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = SharingPreviewFragment.this.new i(this.f96189g, dVar, this.f96190h);
            iVar.f96187e = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96186d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96187e)) {
                    J viewLifecycleOwner = SharingPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96189g, null, this.f96190h);
                    this.f96186d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$6", f = "SharingPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96195d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96196e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96198g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SharingPreviewFragment f96199h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$onViewCreated$$inlined$observe$6$1", f = "SharingPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96200d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96201e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SharingPreviewFragment f96202f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment$j$a$a, reason: collision with other inner class name */
            public static final class C2074a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SharingPreviewFragment f96203a;

                public C2074a(SharingPreviewFragment sharingPreviewFragment) {
                    this.f96203a = sharingPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    W70.d dVar2;
                    FinToolbarView finToolbarView;
                    FinToolbarState finToolbarState = (FinToolbarState) t2;
                    if (finToolbarState != null && (dVar2 = this.f96203a.binding) != null && (finToolbarView = dVar2.f33313i) != null) {
                        finToolbarView.bindState(finToolbarState);
                        finToolbarView.setVisibility(0);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
                super(2, dVar);
                this.f96201e = interfaceC2395h;
                this.f96202f = sharingPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96201e, dVar, this.f96202f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96200d;
                if (i11 == 0) {
                    s.b(obj);
                    C2074a c2074a = new C2074a(this.f96202f);
                    this.f96200d = 1;
                    if (this.f96201e.collect(c2074a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, SharingPreviewFragment sharingPreviewFragment) {
            super(2, dVar);
            this.f96198g = interfaceC2395h;
            this.f96199h = sharingPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = SharingPreviewFragment.this.new j(this.f96198g, dVar, this.f96199h);
            jVar.f96196e = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96195d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96196e)) {
                    J viewLifecycleOwner = SharingPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96198g, null, this.f96199h);
                    this.f96195d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    static final class k implements Function0<Unit> {
        k() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SharingPreviewFragment sharingPreviewFragment = SharingPreviewFragment.this;
            c80.i viewModel = sharingPreviewFragment.getViewModel();
            r requireActivity = sharingPreviewFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            viewModel.K0(requireActivity);
            return Unit.f71690a;
        }
    }

    static final class l implements Function0<Unit> {
        l() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SharingPreviewFragment sharingPreviewFragment = SharingPreviewFragment.this;
            c80.i viewModel = sharingPreviewFragment.getViewModel();
            r requireActivity = sharingPreviewFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            viewModel.K0(requireActivity);
            return Unit.f71690a;
        }
    }

    public static final class m extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return SharingPreviewFragment.this;
        }
    }

    public static final class n extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f96207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.f96207b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96207b.invoke();
        }
    }

    public static final class o extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96208b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96208b.getValue()).getViewModelStore();
        }
    }

    public static final class p extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96209b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96209b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96209b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public SharingPreviewFragment() {
        U50.m mVar = new U50.m(this, 1);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new n(new m()));
        this.viewModel = b0.b(this, kotlin.jvm.internal.N.b(c80.i.class), new o(a11), new p(a11), mVar);
        this.onBackPressedCallback = new c();
        this.buttonDiff = -1;
        this.fragmentName = FRAGMENT_NAME;
    }

    private final void animateShareBtn() {
        FinLargeButtonView finLargeButtonView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        W70.d dVar = this.binding;
        if (dVar == null || (finLargeButtonView = dVar.f33311g) == null || (animate = finLargeButtonView.animate()) == null || (translationY = animate.translationY(0.0f)) == null || (startDelay = translationY.setStartDelay(this.shortAnimationDuration)) == null || (duration = startDelay.setDuration(BUTTON_ANIMATION_DURATION)) == null || (interpolator = duration.setInterpolator(new C5741c())) == null) {
            return;
        }
        interpolator.start();
    }

    @NotNull
    public static final Bundle getBundle(@NotNull String str, @NotNull String str2, long j11, String str3, String str4, boolean z11, String str5) {
        INSTANCE.getClass();
        return Companion.a(str, str2, j11, str3, str4, z11, str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c80.i getViewModel() {
        return (c80.i) this.viewModel.getValue();
    }

    private final void hideShowButton(boolean hide) {
        FinLargeButtonView finLargeButtonView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        FinLargeButtonView finLargeButtonView2;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationY2;
        if (hide && !this.isBtnHidden) {
            this.isBtnHidden = true;
            W70.d dVar = this.binding;
            if (dVar == null || (finLargeButtonView2 = dVar.f33311g) == null || (animate2 = finLargeButtonView2.animate()) == null || (translationY2 = animate2.translationY(D.d(BUTTON_HEIGHT))) == null) {
                return;
            }
            translationY2.start();
            return;
        }
        if (hide || !this.isBtnHidden) {
            return;
        }
        this.isBtnHidden = false;
        W70.d dVar2 = this.binding;
        if (dVar2 == null || (finLargeButtonView = dVar2.f33311g) == null || (animate = finLargeButtonView.animate()) == null || (translationY = animate.translationY(D.c(0.0f))) == null) {
            return;
        }
        translationY.start();
    }

    private final void hideSystemBarUi() {
        if (Build.VERSION.SDK_INT > 31) {
            Window window = requireActivity().getWindow();
            this.savedSystemBarColor = window.getStatusBarColor();
            this.savedNavBarColor = window.getNavigationBarColor();
            int color = androidx.core.content.a.getColor(requireContext(), R.color.oz_semantic_bg_secondary);
            window.setStatusBarColor(color);
            window.setNavigationBarColor(color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isStandaloneIntegration_delegate$lambda$0(SharingPreviewFragment sharingPreviewFragment) {
        return sharingPreviewFragment.getViewModel().H0();
    }

    @NotNull
    public static final SharingPreviewFragment newInstance(@NotNull String url, @NotNull String contentDeposition, long j11, String str, String str2, boolean z11, String str3) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentDeposition, "contentDeposition");
        SharingPreviewFragment sharingPreviewFragment = new SharingPreviewFragment();
        sharingPreviewFragment.setArguments(Companion.a(url, contentDeposition, j11, str, str2, z11, str3));
        return sharingPreviewFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$34(SharingPreviewFragment sharingPreviewFragment) {
        RecyclerView.o layoutManager;
        ViewPager2 viewPager2 = sharingPreviewFragment.viewPager2;
        if (viewPager2 != null) {
            viewPager2.v(2);
            viewPager2.w(1);
            View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            layoutManager.setItemPrefetchEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(SharingPreviewFragment sharingPreviewFragment) {
        ConstraintLayout a11;
        W70.d dVar = sharingPreviewFragment.binding;
        if (dVar == null || (a11 = dVar.a()) == null) {
            return;
        }
        sharingPreviewFragment.getViewModel().M0(a11.getMeasuredWidth(), a11.getMeasuredHeight());
    }

    private final void returnSystemBarUi() {
        Window window;
        if (Build.VERSION.SDK_INT <= 31 || (window = requireActivity().getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(this.savedSystemBarColor);
        window.setNavigationBarColor(this.savedNavBarColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimateButton() {
        if (this.buttonDiff <= 0) {
            this.pendingShareBtnAnim = new B50.a(this, 5);
        } else {
            animateShareBtn();
            this.buttonDiff = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startAnimateButton$lambda$35(SharingPreviewFragment sharingPreviewFragment) {
        sharingPreviewFragment.animateShareBtn();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toImageResId(a80.b bVar) {
        switch (b.f96146a[bVar.ordinal()]) {
            case 1:
                return R.drawable.fintech_icon_document_pdf;
            case 2:
                return R.drawable.fintech_icon_document_xls;
            case 3:
                return R.drawable.fintech_icon_document_1c;
            case 4:
                return R.drawable.fintech_icon_document_txt;
            case 5:
                return R.drawable.fintech_icon_document_xml;
            case 6:
                return R.drawable.fintech_icon_document_zip;
            default:
                throw new Sc.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toSubTitle(a80.b bVar, String str) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        switch (b.f96146a[bVar.ordinal()]) {
            case 1:
                return U7.d.e(requireContext.getString(R.string.fintech_share_file_pdf_subtitle), str);
            case 2:
                return U7.d.e(requireContext.getString(R.string.fintech_share_file_xls_subtitle), str);
            case 3:
                return U7.d.e(requireContext.getString(R.string.fintech_share_file_one_c_subtitle), str);
            case 4:
                return U7.d.e(requireContext.getString(R.string.fintech_share_file_txt_subtitle), str);
            case 5:
                return U7.d.e(requireContext.getString(R.string.fintech_share_file_xml_subtitle), str);
            case 6:
                return U7.d.e(requireContext.getString(R.string.fintech_share_file_zip_subtitle), str);
            default:
                throw new Sc.o();
        }
    }

    @Override // E30.b
    public float getDimAmount() {
        return this.dimAmount;
    }

    @Override // E30.b
    @NotNull
    public String getFragmentName() {
        return this.fragmentName;
    }

    @Override // E30.b
    public boolean getLightStatusBar() {
        return this.lightStatusBar;
    }

    @Override // E30.b
    @NotNull
    public C getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @Override // E30.b
    /* renamed from: isStandaloneIntegration */
    public boolean getF96847d() {
        return ((Boolean) this.isStandaloneIntegration.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((X70.b) O30.a.a(O30.c.a(requireActivity)).a(X70.b.class)).V0(this);
        super.onAttach(context);
        this.shortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);
    }

    @Override // X80.a, E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(FRAGMENT_TITLE, "");
            String string2 = arguments.getString(FILE_URL, "");
            String string3 = arguments.getString(FILE_CONTENT_DEPOSITION, "");
            arguments.getLong(FILE_CONTENT_LENGTH, 0L);
            String string4 = arguments.getString(FILE_MIME_TYPE, "");
            boolean z11 = arguments.getBoolean(IS_FROM_BASE64, false);
            String string5 = arguments.getString(BUTTON_TEXT);
            c80.i viewModel = getViewModel();
            Intrinsics.f(string);
            Intrinsics.f(string2);
            Intrinsics.f(string3);
            Intrinsics.f(string4);
            viewModel.J0(string, z11, string2, string3, string4, getUniqueUuid(), string5);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        W70.d b11 = W70.d.b(inflater, container);
        this.binding = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // X80.a, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        c80.i viewModel = getViewModel();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.L0(requireActivity);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        returnSystemBarUi();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        c80.i viewModel = getViewModel();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        c80.i viewModel = getViewModel();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onPermissionResumeOrResult(requireActivity);
    }

    public final void onScaleChange(float scaleFactor) {
        ViewPager2 viewPager2 = this.viewPager2;
        if (viewPager2 != null) {
            viewPager2.y(scaleFactor < 1.1f);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ConstraintLayout a11;
        ConstraintLayout a12;
        ConstraintLayout a13;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        hideSystemBarUi();
        W70.d dVar = this.binding;
        if (dVar != null) {
            ViewPager2 viewPager2 = new ViewPager2(requireContext());
            viewPager2.setLayoutParams(new ConstraintLayout.b(-1, 0));
            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
            viewPager2.setId(View.generateViewId());
            dVar.a().addView(viewPager2, 0);
            dVar2.p(dVar.a());
            dVar2.t(viewPager2.getId(), 3, dVar.f33313i.getId(), 4, 0);
            dVar2.t(viewPager2.getId(), 6, 0, 6, 0);
            dVar2.t(viewPager2.getId(), 7, 0, 7, 0);
            dVar2.t(viewPager2.getId(), 4, 0, 4, 0);
            dVar2.f(dVar.a());
            this.viewPager2 = viewPager2;
            viewPager2.setVisibility(8);
            ViewPager2 viewPager22 = this.viewPager2;
            if (viewPager22 != null) {
                H30.D.c(viewPager22, 48.0f);
            }
        }
        W70.d dVar3 = this.binding;
        if (dVar3 != null && (a13 = dVar3.a()) != null) {
            a13.post(new s0(this, 2));
        }
        W70.d dVar4 = this.binding;
        if (dVar4 != null && (a12 = dVar4.a()) != null) {
            a12.getViewTreeObserver().addOnGlobalLayoutListener(new d(a12, this));
        }
        c80.i viewModel = getViewModel();
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.G0(requireActivity);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, getOnBackPressedCallback());
        x0<ScreenState> D02 = getViewModel().D0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new e(D02, null, this), 3);
        x0<C9987a> permissionScreenState = getViewModel().getPermissionScreenState();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new f(permissionScreenState, null, this), 3);
        w0<AbstractC9781a> permissionAction = getViewModel().getPermissionAction();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new g((C0) permissionAction, null, this), 3);
        x0<InterfaceC5585a> A02 = getViewModel().A0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new h(A02, null, this), 3);
        C0 E02 = getViewModel().E0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new i(E02, null, this), 3);
        x0<FinToolbarState> F02 = getViewModel().F0();
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner7), null, null, new j(F02, null, this), 3);
        W70.d dVar5 = this.binding;
        if (dVar5 == null || (a11 = dVar5.a()) == null) {
            return;
        }
        a11.post(new t0(this, 2));
    }
}
