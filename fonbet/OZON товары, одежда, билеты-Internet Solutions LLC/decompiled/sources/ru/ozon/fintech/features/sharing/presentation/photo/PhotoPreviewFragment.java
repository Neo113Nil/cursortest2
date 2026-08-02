package ru.ozon.fintech.features.sharing.presentation.photo;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Ae.x0;
import C.D;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import androidx.activity.C;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import d80.C6100a;
import d80.C6102c;
import e80.C6319a;
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
import ru.ozon.fintech.features.sharing.presentation.photo.a;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.misc.ExtraSpaceLayoutManager;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import u90.C9987a;
import xe.C10727i;
import xe.M;
import xe.N;

@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J/\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00107\u001a\u0002068\u0016X\u0096D¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010=\u001a\u0002068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010:R\u001a\u0010>\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00108R\u0016\u0010M\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00108¨\u0006P"}, d2 = {"Lru/ozon/fintech/features/sharing/presentation/photo/PhotoPreviewFragment;", "LX80/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onResume", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "scaleFactor", "onScaleChange", "(F)V", "hideToolbarAndThumbs", "showToolbarAndThumbs", "pos", "Landroid/graphics/Bitmap;", "getCurrentBitmap", "(I)Landroid/graphics/Bitmap;", "fragmentName", "Ljava/lang/String;", "getFragmentName", "()Ljava/lang/String;", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "getOnBackPressedCallback", "()Landroidx/activity/C;", "", "lightStatusBar", "Z", "getLightStatusBar", "()Z", "isStandaloneIntegration$delegate", "LSc/j;", "isStandaloneIntegration", "dimAmount", "F", "getDimAmount", "()F", "LW70/c;", "binding", "LW70/c;", "Lru/ozon/fintech/features/sharing/presentation/photo/a;", "viewModel$delegate", "getViewModel", "()Lru/ozon/fintech/features/sharing/presentation/photo/a;", "viewModel", "thumbsCount", "I", "thumbsHiddenAnimated", "thumbsShownAnimated", "Companion", "a", "sharing-files_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhotoPreviewFragment extends X80.a {

    @NotNull
    private static final String BASE64_URLS = "BASE64_URLS";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String FRAGMENT_NAME = "PhotoPreviewFragment";

    @NotNull
    private static final String SELECTED = "SELECTED";

    @NotNull
    private static final String URLS = "URLS";
    private W70.c binding;
    private final float dimAmount;

    /* renamed from: isStandaloneIntegration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isStandaloneIntegration;
    private int thumbsCount;
    private boolean thumbsHiddenAnimated;
    private boolean thumbsShownAnimated;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    @NotNull
    private final String fragmentName = FRAGMENT_NAME;

    @NotNull
    private final C onBackPressedCallback = new b();
    private final boolean lightStatusBar = true;

    /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static Bundle a(List list, List list2, int i11) {
            Bundle b11 = androidx.core.os.d.b(new Pair(PhotoPreviewFragment.SELECTED, Integer.valueOf(i11)));
            if (list != null) {
                b11.putStringArrayList(PhotoPreviewFragment.URLS, new ArrayList<>(list));
                return b11;
            }
            if (list2 != null) {
                b11.putStringArrayList(PhotoPreviewFragment.BASE64_URLS, new ArrayList<>(C6319a.c(list2)));
            }
            return b11;
        }
    }

    public static final class b extends C {
        b() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            PhotoPreviewFragment photoPreviewFragment = PhotoPreviewFragment.this;
            W70.c cVar = photoPreviewFragment.binding;
            if (cVar == null || !cVar.f33302c.close()) {
                photoPreviewFragment.getViewModel().r0();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$1", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96211d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96212e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96214g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96215h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$1$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96216d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96217e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96218f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2075a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96219a;

                public C2075a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96219a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    List<String> c11;
                    List<String> a11;
                    a.C2083a c2083a = (a.C2083a) t2;
                    if (c2083a != null) {
                        PhotoPreviewFragment photoPreviewFragment = this.f96219a;
                        W70.c cVar = photoPreviewFragment.binding;
                        if (cVar != null) {
                            com.detmir.recycli.adapters.d.a(cVar.f33301b, c2083a.e());
                        }
                        W70.c cVar2 = photoPreviewFragment.binding;
                        if ((cVar2 != null ? cVar2.f33304e.e() : null) == null && (((c11 = c2083a.c()) != null && (!c11.isEmpty())) || ((a11 = c2083a.a()) != null && (!a11.isEmpty())))) {
                            List<String> c12 = c2083a.c();
                            int size = (c12 == null && (c12 = c2083a.a()) == null) ? 0 : c12.size();
                            G childFragmentManager = photoPreviewFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            AbstractC5434v lifecycle = photoPreviewFragment.getLifecycle();
                            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                            C6100a c6100a = new C6100a(childFragmentManager, lifecycle, c2083a.c(), c2083a.a());
                            W70.c cVar3 = photoPreviewFragment.binding;
                            if (cVar3 != null) {
                                cVar3.f33304e.s(c6100a);
                            }
                            W70.c cVar4 = photoPreviewFragment.binding;
                            if (cVar4 != null) {
                                cVar4.f33304e.t(c2083a.d(), false);
                            }
                            W70.c cVar5 = photoPreviewFragment.binding;
                            if (cVar5 != null) {
                                cVar5.f33301b.scrollToPosition(c2083a.d());
                            }
                            photoPreviewFragment.thumbsCount = size;
                        }
                        if (c2083a.b()) {
                            photoPreviewFragment.hideToolbarAndThumbs();
                        } else {
                            photoPreviewFragment.showToolbarAndThumbs();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96217e = interfaceC2395h;
                this.f96218f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96217e, dVar, this.f96218f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96216d;
                if (i11 == 0) {
                    s.b(obj);
                    C2075a c2075a = new C2075a(this.f96218f);
                    this.f96216d = 1;
                    if (this.f96217e.collect(c2075a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96214g = interfaceC2395h;
            this.f96215h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = PhotoPreviewFragment.this.new c(this.f96214g, dVar, this.f96215h);
            cVar.f96212e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96211d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96212e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96214g, null, this.f96215h);
                    this.f96211d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$2", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96220d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96221e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96223g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96224h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$2$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96225d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96226e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96227f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$d$a$a, reason: collision with other inner class name */
            public static final class C2076a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96228a;

                public C2076a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96228a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ViewPager2 viewPager2;
                    int intValue = ((Number) t2).intValue();
                    W70.c cVar = this.f96228a.binding;
                    if (cVar != null && (viewPager2 = cVar.f33304e) != null) {
                        viewPager2.t(intValue, true);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96226e = c02;
                this.f96227f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96226e, dVar, this.f96227f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96225d;
                if (i11 == 0) {
                    s.b(obj);
                    C2076a c2076a = new C2076a(this.f96227f);
                    this.f96225d = 1;
                    if (this.f96226e.collect(c2076a, this) == aVar) {
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
        public d(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96223g = c02;
            this.f96224h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = PhotoPreviewFragment.this.new d(this.f96223g, dVar, this.f96224h);
            dVar2.f96221e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96220d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96221e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96223g, null, this.f96224h);
                    this.f96220d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$3", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96229d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96230e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96232g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96233h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$3$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96234d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96235e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96236f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$e$a$a, reason: collision with other inner class name */
            public static final class C2077a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96237a;

                public C2077a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96237a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    RecyclerView recyclerView;
                    int intValue = ((Number) t2).intValue();
                    W70.c cVar = this.f96237a.binding;
                    if (cVar != null && (recyclerView = cVar.f33301b) != null) {
                        recyclerView.scrollToPosition(intValue);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96235e = c02;
                this.f96236f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96235e, dVar, this.f96236f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96234d;
                if (i11 == 0) {
                    s.b(obj);
                    C2077a c2077a = new C2077a(this.f96236f);
                    this.f96234d = 1;
                    if (this.f96235e.collect(c2077a, this) == aVar) {
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
        public e(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96232g = c02;
            this.f96233h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = PhotoPreviewFragment.this.new e(this.f96232g, dVar, this.f96233h);
            eVar.f96230e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96229d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96230e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96232g, null, this.f96233h);
                    this.f96229d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$4", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96238d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96239e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96241g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96242h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$4$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96243d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96244e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96245f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2078a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96246a;

                public C2078a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96246a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FinToolbarState finToolbarState = (FinToolbarState) t2;
                    W70.c cVar = this.f96246a.binding;
                    E30.g.a(n.f96285a, cVar != null ? cVar.f33303d : null, finToolbarState);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96244e = interfaceC2395h;
                this.f96245f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96244e, dVar, this.f96245f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96243d;
                if (i11 == 0) {
                    s.b(obj);
                    C2078a c2078a = new C2078a(this.f96245f);
                    this.f96243d = 1;
                    if (this.f96244e.collect(c2078a, this) == aVar) {
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
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96241g = interfaceC2395h;
            this.f96242h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = PhotoPreviewFragment.this.new f(this.f96241g, dVar, this.f96242h);
            fVar.f96239e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96238d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96239e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96241g, null, this.f96242h);
                    this.f96238d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$5", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96247d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96248e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96250g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96251h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$5$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96252d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96253e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96254f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$g$a$a, reason: collision with other inner class name */
            public static final class C2079a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96255a;

                public C2079a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96255a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    int intValue = ((Number) t2).intValue();
                    PhotoPreviewFragment photoPreviewFragment = this.f96255a;
                    photoPreviewFragment.getViewModel().t0(photoPreviewFragment.getCurrentBitmap(intValue), intValue);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96253e = c02;
                this.f96254f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96253e, dVar, this.f96254f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96252d;
                if (i11 == 0) {
                    s.b(obj);
                    C2079a c2079a = new C2079a(this.f96254f);
                    this.f96252d = 1;
                    if (this.f96253e.collect(c2079a, this) == aVar) {
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
        public g(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96250g = c02;
            this.f96251h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = PhotoPreviewFragment.this.new g(this.f96250g, dVar, this.f96251h);
            gVar.f96248e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96247d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96248e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96250g, null, this.f96251h);
                    this.f96247d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$6", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96256d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96257e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96259g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96260h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$6$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96261d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96262e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96263f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$h$a$a, reason: collision with other inner class name */
            public static final class C2080a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96264a;

                public C2080a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96264a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    int intValue = ((Number) t2).intValue();
                    PhotoPreviewFragment photoPreviewFragment = this.f96264a;
                    photoPreviewFragment.getViewModel().v0(photoPreviewFragment.getCurrentBitmap(intValue), intValue);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96262e = c02;
                this.f96263f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96262e, dVar, this.f96263f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96261d;
                if (i11 == 0) {
                    s.b(obj);
                    C2080a c2080a = new C2080a(this.f96263f);
                    this.f96261d = 1;
                    if (this.f96262e.collect(c2080a, this) == aVar) {
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
        public h(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96259g = c02;
            this.f96260h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = PhotoPreviewFragment.this.new h(this.f96259g, dVar, this.f96260h);
            hVar.f96257e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96256d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96257e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96259g, null, this.f96260h);
                    this.f96256d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$7", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96265d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96266e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96268g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96269h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$7$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96270d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96271e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96272f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$i$a$a, reason: collision with other inner class name */
            public static final class C2081a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96273a;

                public C2081a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96273a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    PermissionsScreenStateView permissionsScreenStateView;
                    C9987a c9987a = (C9987a) t2;
                    W70.c cVar = this.f96273a.binding;
                    if (cVar != null && (permissionsScreenStateView = cVar.f33302c) != null) {
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
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96271e = interfaceC2395h;
                this.f96272f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96271e, dVar, this.f96272f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96270d;
                if (i11 == 0) {
                    s.b(obj);
                    C2081a c2081a = new C2081a(this.f96272f);
                    this.f96270d = 1;
                    if (this.f96271e.collect(c2081a, this) == aVar) {
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
        public i(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96268g = interfaceC2395h;
            this.f96269h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = PhotoPreviewFragment.this.new i(this.f96268g, dVar, this.f96269h);
            iVar.f96266e = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96265d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96266e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96268g, null, this.f96269h);
                    this.f96265d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$8", f = "PhotoPreviewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96274d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96275e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96277g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PhotoPreviewFragment f96278h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$onViewCreated$$inlined$observe$8$1", f = "PhotoPreviewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96279d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96280e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PhotoPreviewFragment f96281f;

            /* renamed from: ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment$j$a$a, reason: collision with other inner class name */
            public static final class C2082a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PhotoPreviewFragment f96282a;

                public C2082a(PhotoPreviewFragment photoPreviewFragment) {
                    this.f96282a = photoPreviewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AbstractC9781a abstractC9781a = (AbstractC9781a) t2;
                    if (abstractC9781a != null) {
                        boolean z11 = abstractC9781a instanceof AbstractC9781a.b;
                        PhotoPreviewFragment photoPreviewFragment = this.f96282a;
                        if (z11) {
                            List<InterfaceC9636e> a11 = ((AbstractC9781a.b) abstractC9781a).a();
                            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                            Iterator<T> it = a11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InterfaceC9636e) it.next()).a());
                            }
                            photoPreviewFragment.requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
                        } else if (abstractC9781a instanceof AbstractC9781a.C2181a) {
                            photoPreviewFragment.requireContext().startActivity(((AbstractC9781a.C2181a) abstractC9781a).a());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
                super(2, dVar);
                this.f96280e = c02;
                this.f96281f = photoPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96280e, dVar, this.f96281f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96279d;
                if (i11 == 0) {
                    s.b(obj);
                    C2082a c2082a = new C2082a(this.f96281f);
                    this.f96279d = 1;
                    if (this.f96280e.collect(c2082a, this) == aVar) {
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
        public j(C0 c02, kotlin.coroutines.d dVar, PhotoPreviewFragment photoPreviewFragment) {
            super(2, dVar);
            this.f96277g = c02;
            this.f96278h = photoPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = PhotoPreviewFragment.this.new j(this.f96277g, dVar, this.f96278h);
            jVar.f96275e = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96274d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96275e)) {
                    J viewLifecycleOwner = PhotoPreviewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96277g, null, this.f96278h);
                    this.f96274d = 1;
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

    public static final class k implements ViewTreeObserver.OnPreDrawListener {
        k() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ConstraintLayout a11;
            ViewTreeObserver viewTreeObserver;
            RecyclerView recyclerView;
            ConstraintLayout a12;
            ConstraintLayout a13;
            PhotoPreviewFragment photoPreviewFragment = PhotoPreviewFragment.this;
            W70.c cVar = photoPreviewFragment.binding;
            int i11 = 0;
            int measuredWidth = (cVar == null || (a13 = cVar.a()) == null) ? 0 : a13.getMeasuredWidth();
            W70.c cVar2 = photoPreviewFragment.binding;
            if (cVar2 != null && (a12 = cVar2.a()) != null) {
                i11 = a12.getMeasuredHeight();
            }
            if (photoPreviewFragment.thumbsCount <= 0 || measuredWidth <= 0 || i11 <= 0) {
                return true;
            }
            int c11 = (((D.c(2.0f) * 2) + D.c(56.0f)) * photoPreviewFragment.thumbsCount) + ((D.c(16.0f) - D.c(2.0f)) * 2);
            W70.c cVar3 = photoPreviewFragment.binding;
            if (cVar3 != null && (recyclerView = cVar3.f33301b) != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                if (c11 > measuredWidth) {
                    c11 = -1;
                }
                ((ViewGroup.MarginLayoutParams) bVar).width = c11;
                recyclerView.setLayoutParams(bVar);
            }
            W70.c cVar4 = photoPreviewFragment.binding;
            if (cVar4 == null || (a11 = cVar4.a()) == null || (viewTreeObserver = a11.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }
    }

    public static final class l extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.A a11) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            int a12 = Nh.a.a(recyclerView, "parent", a11, "state", view);
            RecyclerView.g adapter = recyclerView.getAdapter();
            int shimmersCount = adapter != null ? adapter.getShimmersCount() : 0;
            if (a12 == 0) {
                outRect.left = D.c(16.0f);
                outRect.right = D.c(2.0f);
            } else if (a12 == shimmersCount - 1) {
                outRect.left = D.c(2.0f);
                outRect.right = D.c(16.0f);
            } else {
                outRect.left = D.c(2.0f);
                outRect.right = D.c(2.0f);
            }
        }
    }

    public static final class m extends ViewPager2.g {
        m() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i11) {
            ViewPager2 viewPager2;
            if (i11 == 0) {
                PhotoPreviewFragment photoPreviewFragment = PhotoPreviewFragment.this;
                a viewModel = photoPreviewFragment.getViewModel();
                W70.c cVar = photoPreviewFragment.binding;
                viewModel.p0((cVar == null || (viewPager2 = cVar.f33304e) == null) ? 0 : viewPager2.f());
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            ViewPager2 viewPager2;
            PhotoPreviewFragment photoPreviewFragment = PhotoPreviewFragment.this;
            a viewModel = photoPreviewFragment.getViewModel();
            W70.c cVar = photoPreviewFragment.binding;
            viewModel.p0((cVar == null || (viewPager2 = cVar.f33304e) == null) ? 0 : viewPager2.f());
        }
    }

    static final class n implements Function2<FinToolbarView, FinToolbarState, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f96285a = new n();

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(FinToolbarView finToolbarView, FinToolbarState finToolbarState) {
            FinToolbarView toolBar = finToolbarView;
            FinToolbarState state = finToolbarState;
            Intrinsics.checkNotNullParameter(toolBar, "toolBar");
            Intrinsics.checkNotNullParameter(state, "state");
            toolBar.bindState(state);
            return Unit.f71690a;
        }
    }

    public static final class o extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return PhotoPreviewFragment.this;
        }
    }

    public static final class p extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f96287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f96287b = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96287b.invoke();
        }
    }

    public static final class q extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96288b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96288b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96288b.getValue()).getViewModelStore();
        }
    }

    public static final class r extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96289b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96289b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public PhotoPreviewFragment() {
        int i11 = 2;
        this.isStandaloneIntegration = Sc.k.b(new D80.a(this, i11));
        A90.b bVar = new A90.b(this, i11);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new p(new o()));
        this.viewModel = b0.b(this, kotlin.jvm.internal.N.b(a.class), new q(a11), new r(a11), bVar);
    }

    @NotNull
    public static final Bundle getBundle(List<String> list, List<String> list2, int i11) {
        INSTANCE.getClass();
        return Companion.a(list, list2, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getCurrentBitmap(int pos) {
        W70.c cVar = this.binding;
        RecyclerView.g e11 = cVar != null ? cVar.f33304e.e() : null;
        C6100a c6100a = e11 instanceof C6100a ? (C6100a) e11 : null;
        ComponentCallbacksC5392m f7 = c6100a != null ? c6100a.f(pos) : null;
        C6102c c6102c = f7 instanceof C6102c ? (C6102c) f7 : null;
        Drawable w11 = c6102c != null ? c6102c.w() : null;
        BitmapDrawable bitmapDrawable = w11 instanceof BitmapDrawable ? (BitmapDrawable) w11 : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideToolbarAndThumbs() {
        ViewPager2 viewPager2;
        FinToolbarView finToolbarView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        RecyclerView recyclerView;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationY2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator duration2;
        ViewPager2 viewPager22;
        W70.c cVar = this.binding;
        if (cVar != null && (viewPager22 = cVar.f33304e) != null) {
            viewPager22.y(false);
        }
        if (!this.thumbsHiddenAnimated) {
            this.thumbsShownAnimated = false;
            this.thumbsHiddenAnimated = true;
            W70.c cVar2 = this.binding;
            if (cVar2 != null && (recyclerView = cVar2.f33301b) != null && (animate2 = recyclerView.animate()) != null && (translationY2 = animate2.translationY(D.c(100.0f))) != null && (interpolator2 = translationY2.setInterpolator(new OvershootInterpolator())) != null && (duration2 = interpolator2.setDuration(300L)) != null) {
                duration2.start();
            }
            W70.c cVar3 = this.binding;
            if (cVar3 != null && (finToolbarView = cVar3.f33303d) != null && (animate = finToolbarView.animate()) != null && (translationY = animate.translationY(-D.c(56.0f))) != null && (interpolator = translationY.setInterpolator(new OvershootInterpolator())) != null && (duration = interpolator.setDuration(300L)) != null) {
                duration.start();
            }
        }
        W70.c cVar4 = this.binding;
        if (cVar4 == null || (viewPager2 = cVar4.f33304e) == null) {
            return;
        }
        viewPager2.y(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isStandaloneIntegration_delegate$lambda$0(PhotoPreviewFragment photoPreviewFragment) {
        return photoPreviewFragment.getViewModel().q0();
    }

    @NotNull
    public static final PhotoPreviewFragment newInstance(List<String> list, List<String> list2, int i11) {
        INSTANCE.getClass();
        PhotoPreviewFragment photoPreviewFragment = new PhotoPreviewFragment();
        photoPreviewFragment.setArguments(Companion.a(list, list2, i11));
        return photoPreviewFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showToolbarAndThumbs() {
        ViewPager2 viewPager2;
        FinToolbarView finToolbarView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        RecyclerView recyclerView;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationY2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator duration2;
        if (!this.thumbsShownAnimated) {
            this.thumbsShownAnimated = true;
            this.thumbsHiddenAnimated = false;
            W70.c cVar = this.binding;
            if (cVar != null && (recyclerView = cVar.f33301b) != null && (animate2 = recyclerView.animate()) != null && (translationY2 = animate2.translationY(D.c(0.0f))) != null && (interpolator2 = translationY2.setInterpolator(new OvershootInterpolator())) != null && (duration2 = interpolator2.setDuration(300L)) != null) {
                duration2.start();
            }
            W70.c cVar2 = this.binding;
            if (cVar2 != null && (finToolbarView = cVar2.f33303d) != null && (animate = finToolbarView.animate()) != null && (translationY = animate.translationY(D.c(0.0f))) != null && (interpolator = translationY.setInterpolator(new OvershootInterpolator())) != null && (duration = interpolator.setDuration(300L)) != null) {
                duration.start();
            }
        }
        W70.c cVar3 = this.binding;
        if (cVar3 == null || (viewPager2 = cVar3.f33304e) == null) {
            return;
        }
        viewPager2.y(true);
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
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((X70.b) O30.a.a(O30.c.a(requireActivity)).a(X70.b.class)).d1(this);
        super.onAttach(context);
    }

    @Override // X80.a, E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        Bundle arguments = getArguments();
        List<String> list = null;
        List<String> U02 = (arguments == null || (stringArrayList2 = arguments.getStringArrayList(URLS)) == null) ? null : C7714v.U0(stringArrayList2);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (stringArrayList = arguments2.getStringArrayList(BASE64_URLS)) != null) {
            list = C7714v.U0(stringArrayList);
        }
        Bundle arguments3 = getArguments();
        getViewModel().s0(U02, list, arguments3 != null ? arguments3.getInt(SELECTED, 0) : 0, getUniqueUuid());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        W70.c b11 = W70.c.b(inflater, container);
        this.binding = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @InterfaceC3999a
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        a viewModel = getViewModel();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        a viewModel = getViewModel();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        viewModel.onPermissionResumeOrResult(requireActivity);
    }

    public final void onScaleChange(float scaleFactor) {
        if (scaleFactor < 1.1f) {
            getViewModel().u0(false);
        } else {
            getViewModel().u0(true);
        }
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        getViewModel().onStart();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        getViewModel().onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ConstraintLayout a11;
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        W70.c cVar = this.binding;
        if (cVar != null && (a11 = cVar.a()) != null && (viewTreeObserver = a11.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new k());
        }
        W70.c cVar2 = this.binding;
        if (cVar2 != null) {
            RecyclerView recyclerView = cVar2.f33301b;
            recyclerView.addItemDecoration(new l());
            ExtraSpaceLayoutManager extraSpaceLayoutManager = new ExtraSpaceLayoutManager(recyclerView.getContext(), 0, false);
            extraSpaceLayoutManager.setExtraLayoutSpaceStart(D.c(200.0f));
            extraSpaceLayoutManager.setExtraLayoutSpaceEnd(D.c(200.0f));
            recyclerView.setLayoutManager(extraSpaceLayoutManager);
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            androidx.recyclerview.widget.C c11 = itemAnimator instanceof androidx.recyclerview.widget.C ? (androidx.recyclerview.widget.C) itemAnimator : null;
            if (c11 != null) {
                c11.setSupportsChangeAnimations(false);
            }
        }
        W70.c cVar3 = this.binding;
        if (cVar3 != null) {
            ViewPager2 viewPager2 = cVar3.f33304e;
            viewPager2.v(2);
            H30.D.c(viewPager2, 48.0f);
            viewPager2.p(new m());
        }
        x0<a.C2083a> state = getViewModel().getState();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new c(state, null, this), 3);
        C0 l02 = getViewModel().l0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new d(l02, null, this), 3);
        C0 m02 = getViewModel().m0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new e(m02, null, this), 3);
        x0<FinToolbarState> j02 = getViewModel().j0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new f(j02, null, this), 3);
        C0 k02 = getViewModel().k0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new g(k02, null, this), 3);
        C0 n02 = getViewModel().n0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new h(n02, null, this), 3);
        x0<C9987a> permissionScreenState = getViewModel().getPermissionScreenState();
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner7), null, null, new i(permissionScreenState, null, this), 3);
        w0<AbstractC9781a> permissionAction = getViewModel().getPermissionAction();
        J viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner8), null, null, new j((C0) permissionAction, null, this), 3);
    }
}
