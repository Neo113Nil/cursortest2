package ru.ozon.fintech.features.cbottomstories.presentation;

import A50.c;
import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import H30.D;
import Sc.InterfaceC4008j;
import Sc.s;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.C;
import androidx.annotation.Keep;
import androidx.appcompat.view.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.viewpager2.widget.ViewPager2;
import f3.AbstractC6409a;
import java.util.ArrayList;
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
import ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour;
import ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment;
import w40.InterfaceC10428a;
import x50.C10661b;
import xe.C10727i;
import xe.M;
import xe.N;

@Keep
@Metadata(d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\b\u0007*\u0001j\b\u0007\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002noB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J3\u00102\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010#2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020#H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0002¢\u0006\u0004\b:\u0010\u0005J\u000f\u0010;\u001a\u00020\u000bH\u0002¢\u0006\u0004\b;\u0010\u0005R\u001a\u0010<\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010%R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020H8\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020P8\u0016X\u0096D¢\u0006\f\n\u0004\b\\\u0010R\u001a\u0004\b]\u0010^R\u001b\u0010`\u001a\u00020P8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b_\u0010D\u001a\u0004\b`\u0010^R\u001a\u0010a\u001a\u0002068\u0016X\u0096D¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010f\u001a\u0004\u0018\u00010e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lru/ozon/fintech/features/cbottomstories/presentation/StoriesFragment;", "LE30/b;", "Lw40/a;", "LA50/c$a;", "<init>", "()V", "LA50/c;", "provideStoriesInteractor", "()LA50/c;", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onPause", "onResume", "", "provideId", "()Ljava/lang/String;", "onDestroy", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "parameterJson", "Landroid/os/Parcelable;", "parameterParcelable", "", "version", "uuid", "updateState", "(Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/String;)V", "action", "(Ljava/lang/String;)V", "", "slideOffset", "setBackAlpha", "(F)V", "doOpenAnimation", "doCloseAnimation", "fragmentName", "Ljava/lang/String;", "getFragmentName", "Lx50/b;", "binding", "Lx50/b;", "Lru/ozon/fintech/features/cbottomstories/presentation/a;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/fintech/features/cbottomstories/presentation/a;", "viewModel", "", "animDuration", "J", "Landroidx/appcompat/app/j;", "delegate", "Landroidx/appcompat/app/j;", "prevSelected", "Ljava/lang/Integer;", "", "nowClosing", "Z", "Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour;", "Landroidx/viewpager2/widget/ViewPager2;", "sheetBehavior", "Lru/ozon/fintech/base/bottom/BaseBottomSheetBehaviour;", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "getOnBackPressedCallback", "()Landroidx/activity/C;", "lightStatusBar", "getLightStatusBar", "()Z", "isStandaloneIntegration$delegate", "isStandaloneIntegration", "dimAmount", "F", "getDimAmount", "()F", "", "dialogBackground", "Ljava/lang/Void;", "getDialogBackground", "()Ljava/lang/Void;", "ru/ozon/fintech/features/cbottomstories/presentation/StoriesFragment$m", "pageListener", "Lru/ozon/fintech/features/cbottomstories/presentation/StoriesFragment$m;", "Companion", "a", "b", "cbottom-stories_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoriesFragment extends E30.b implements InterfaceC10428a, c.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String TAG = "StoriesFragment";
    private final long animDuration;
    private C10661b binding;
    private androidx.appcompat.app.j delegate;
    private final Void dialogBackground;
    private final float dimAmount;

    @NotNull
    private final String fragmentName = TAG;

    /* renamed from: isStandaloneIntegration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isStandaloneIntegration;
    private final boolean lightStatusBar;
    private boolean nowClosing;

    @NotNull
    private final C onBackPressedCallback;

    @NotNull
    private final m pageListener;
    private Integer prevSelected;
    private BaseBottomSheetBehaviour<ViewPager2> sheetBehavior;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static Bundle a(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return androidx.core.os.d.b(new Pair("PARAMETER_JSON", str), new Pair("PARAMETER_PARCELABLE", parcelable), new Pair("PARAMETER_VERSION", Integer.valueOf(i11)), new Pair("PARAMETER_UUID", uuid));
        }
    }

    public final class b extends Z4.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C50.d f95295a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull StoriesFragment storiesFragment, C50.d storiesUI) {
            super(storiesFragment.getChildFragmentManager(), storiesFragment.getLifecycle());
            Intrinsics.checkNotNullParameter(storiesUI, "storiesUI");
            this.f95295a = storiesUI;
        }

        @Override // Z4.a
        @NotNull
        public final ComponentCallbacksC5392m createFragment(int i11) {
            if (((C50.e) C7714v.Q(i11, this.f95295a.f())) == null) {
                throw new Exception("Not found");
            }
            StoryFragment.Companion companion = StoryFragment.INSTANCE;
            companion.getClass();
            StoryFragment storyFragment = new StoryFragment();
            companion.getClass();
            storyFragment.setArguments(androidx.core.os.d.b(new Pair("STORY_POS", Integer.valueOf(i11))));
            return storyFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: getItemCount */
        public final int getShimmersCount() {
            return ((ArrayList) this.f95295a.f()).size();
        }
    }

    public static final class c extends C {
        c() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            StoriesFragment.this.getViewModel().p0().L();
        }
    }

    public static final class d implements androidx.appcompat.app.h {
        @Override // androidx.appcompat.app.h
        public final void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
        }

        @Override // androidx.appcompat.app.h
        public final void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
        }

        @Override // androidx.appcompat.app.h
        public final androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
            return null;
        }
    }

    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f95297a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StoriesFragment f95298b;

        public e(View view, StoriesFragment storiesFragment) {
            this.f95297a = view;
            this.f95298b = storiesFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CoordinatorLayout coordinatorLayout;
            CoordinatorLayout coordinatorLayout2;
            View view = this.f95297a;
            if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                return;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            StoriesFragment storiesFragment = this.f95298b;
            C10661b c10661b = storiesFragment.binding;
            Integer num = null;
            Integer valueOf = (c10661b == null || (coordinatorLayout2 = c10661b.f105034c) == null) ? null : Integer.valueOf(coordinatorLayout2.getWidth());
            C10661b c10661b2 = storiesFragment.binding;
            if (c10661b2 != null && (coordinatorLayout = c10661b2.f105034c) != null) {
                num = Integer.valueOf(coordinatorLayout.getHeight());
            }
            E30.g.a(storiesFragment.new j(), valueOf, num);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$1", f = "StoriesFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95299d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95300e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95302g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ StoriesFragment f95303h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$1$1", f = "StoriesFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95304d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95305e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ StoriesFragment f95306f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$f$a$a, reason: collision with other inner class name */
            public static final class C2019a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoriesFragment f95307a;

                public C2019a(StoriesFragment storiesFragment) {
                    this.f95307a = storiesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    if (((Boolean) t2).booleanValue()) {
                        StoriesFragment storiesFragment = this.f95307a;
                        storiesFragment.nowClosing = true;
                        storiesFragment.doCloseAnimation();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
                super(2, dVar);
                this.f95305e = c02;
                this.f95306f = storiesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95305e, dVar, this.f95306f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95304d;
                if (i11 == 0) {
                    s.b(obj);
                    C2019a c2019a = new C2019a(this.f95306f);
                    this.f95304d = 1;
                    if (this.f95305e.collect(c2019a, this) == aVar) {
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
        public f(C0 c02, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
            super(2, dVar);
            this.f95302g = c02;
            this.f95303h = storiesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = StoriesFragment.this.new f(this.f95302g, dVar, this.f95303h);
            fVar.f95300e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95299d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95300e)) {
                    J viewLifecycleOwner = StoriesFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95302g, null, this.f95303h);
                    this.f95299d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$2", f = "StoriesFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95308d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95309e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95311g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ StoriesFragment f95312h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$2$1", f = "StoriesFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95313d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95314e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ StoriesFragment f95315f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$g$a$a, reason: collision with other inner class name */
            public static final class C2020a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoriesFragment f95316a;

                public C2020a(StoriesFragment storiesFragment) {
                    this.f95316a = storiesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    int intValue = ((Number) ((Pair) t2).e()).intValue();
                    C10661b c10661b = this.f95316a.binding;
                    if (c10661b != null) {
                        D.d(c10661b.f105033b, intValue);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
                super(2, dVar);
                this.f95314e = c02;
                this.f95315f = storiesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95314e, dVar, this.f95315f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95313d;
                if (i11 == 0) {
                    s.b(obj);
                    C2020a c2020a = new C2020a(this.f95315f);
                    this.f95313d = 1;
                    if (this.f95314e.collect(c2020a, this) == aVar) {
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
        public g(C0 c02, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
            super(2, dVar);
            this.f95311g = c02;
            this.f95312h = storiesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = StoriesFragment.this.new g(this.f95311g, dVar, this.f95312h);
            gVar.f95309e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95308d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95309e)) {
                    J viewLifecycleOwner = StoriesFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95311g, null, this.f95312h);
                    this.f95308d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$3", f = "StoriesFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95317d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95318e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95320g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ StoriesFragment f95321h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$3$1", f = "StoriesFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95322d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95323e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ StoriesFragment f95324f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$h$a$a, reason: collision with other inner class name */
            public static final class C2021a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoriesFragment f95325a;

                public C2021a(StoriesFragment storiesFragment) {
                    this.f95325a = storiesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C50.d dVar2 = (C50.d) t2;
                    if (dVar2 != null) {
                        StoriesFragment storiesFragment = this.f95325a;
                        C10661b c10661b = storiesFragment.binding;
                        if ((c10661b != null ? c10661b.f105033b.e() : null) == null && !dVar2.f().isEmpty()) {
                            b bVar = new b(storiesFragment, dVar2);
                            C10661b c10661b2 = storiesFragment.binding;
                            if (c10661b2 != null) {
                                c10661b2.f105033b.s(bVar);
                            }
                            if (storiesFragment.prevSelected == null) {
                                storiesFragment.prevSelected = new Integer(dVar2.e());
                            }
                            C10661b c10661b3 = storiesFragment.binding;
                            if (c10661b3 != null) {
                                c10661b3.f105033b.t(dVar2.e(), false);
                            }
                            C10661b c10661b4 = storiesFragment.binding;
                            if (c10661b4 != null) {
                                c10661b4.f105033b.post(storiesFragment.new l());
                            }
                            BaseBottomSheetBehaviour baseBottomSheetBehaviour = storiesFragment.sheetBehavior;
                            if (baseBottomSheetBehaviour != null) {
                                baseBottomSheetBehaviour.setDraggable(dVar2.a());
                            }
                            storiesFragment.doOpenAnimation();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
                super(2, dVar);
                this.f95323e = interfaceC2395h;
                this.f95324f = storiesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95323e, dVar, this.f95324f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95322d;
                if (i11 == 0) {
                    s.b(obj);
                    C2021a c2021a = new C2021a(this.f95324f);
                    this.f95322d = 1;
                    if (this.f95323e.collect(c2021a, this) == aVar) {
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
        public h(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
            super(2, dVar);
            this.f95320g = interfaceC2395h;
            this.f95321h = storiesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = StoriesFragment.this.new h(this.f95320g, dVar, this.f95321h);
            hVar.f95318e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95317d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95318e)) {
                    J viewLifecycleOwner = StoriesFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95320g, null, this.f95321h);
                    this.f95317d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$4", f = "StoriesFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95326d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95327e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f95329g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ StoriesFragment f95330h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$onViewCreated$$inlined$observe$4$1", f = "StoriesFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95331d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f95332e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ StoriesFragment f95333f;

            /* renamed from: ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment$i$a$a, reason: collision with other inner class name */
            public static final class C2022a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ StoriesFragment f95334a;

                public C2022a(StoriesFragment storiesFragment) {
                    this.f95334a = storiesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ViewPager2 viewPager2;
                    int intValue = ((Number) t2).intValue();
                    C10661b c10661b = this.f95334a.binding;
                    if (c10661b != null && (viewPager2 = c10661b.f105033b) != null) {
                        viewPager2.t(intValue, true);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
                super(2, dVar);
                this.f95332e = c02;
                this.f95333f = storiesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95332e, dVar, this.f95333f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95331d;
                if (i11 == 0) {
                    s.b(obj);
                    C2022a c2022a = new C2022a(this.f95333f);
                    this.f95331d = 1;
                    if (this.f95332e.collect(c2022a, this) == aVar) {
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
        public i(C0 c02, kotlin.coroutines.d dVar, StoriesFragment storiesFragment) {
            super(2, dVar);
            this.f95329g = c02;
            this.f95330h = storiesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = StoriesFragment.this.new i(this.f95329g, dVar, this.f95330h);
            iVar.f95327e = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95326d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95327e)) {
                    J viewLifecycleOwner = StoriesFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95329g, null, this.f95330h);
                    this.f95326d = 1;
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

    static final class j implements Function2<Integer, Integer, Unit> {
        j() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Integer num2) {
            ViewPager2 viewPager2;
            C10661b c10661b;
            ViewPager2 viewPager22;
            float intValue = num2.intValue() * 0.5f;
            float intValue2 = num.intValue();
            StoriesFragment storiesFragment = StoriesFragment.this;
            if (intValue2 > intValue && (c10661b = storiesFragment.binding) != null && (viewPager22 = c10661b.f105033b) != null) {
                int i11 = (int) intValue;
                Intrinsics.checkNotNullParameter(viewPager22, "<this>");
                ViewGroup.LayoutParams layoutParams = viewPager22.getLayoutParams();
                if (layoutParams.width != i11) {
                    layoutParams.width = i11;
                    viewPager22.setLayoutParams(layoutParams);
                }
            }
            C10661b c10661b2 = storiesFragment.binding;
            if (c10661b2 == null || (viewPager2 = c10661b2.f105033b) == null) {
                return null;
            }
            D.b(viewPager2, 1);
            D.c(viewPager2, 32.0f);
            D.a(viewPager2);
            viewPager2.x(new E50.a());
            return Unit.f71690a;
        }
    }

    public static final class k extends BaseBottomSheetBehaviour.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f95336a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f95337b;

        k() {
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void a(View bottomSheet, float f7) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            StoriesFragment storiesFragment = StoriesFragment.this;
            storiesFragment.setBackAlpha(f7);
            if (!this.f95336a && storiesFragment.nowClosing && f7 < 0.2f) {
                this.f95336a = true;
                storiesFragment.getViewModel().l0();
            }
            C10661b c10661b = storiesFragment.binding;
            if (c10661b != null) {
                c10661b.f105033b.setAlpha(f7 + 0.7f);
            }
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void b(View bottomSheet, int i11) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            StoriesFragment storiesFragment = StoriesFragment.this;
            if (i11 == 1) {
                this.f95337b = true;
                storiesFragment.getViewModel().p0().t(true);
                return;
            }
            if (i11 == 3) {
                if (this.f95337b) {
                    this.f95337b = false;
                    storiesFragment.getViewModel().p0().t(false);
                    return;
                }
                return;
            }
            if (i11 == 5 && !this.f95336a) {
                this.f95336a = true;
                storiesFragment.getViewModel().l0();
            }
        }
    }

    static final class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StoriesFragment storiesFragment = StoriesFragment.this;
            C10661b c10661b = storiesFragment.binding;
            if (c10661b != null) {
                c10661b.f105033b.p(storiesFragment.pageListener);
            }
        }
    }

    public static final class m extends ViewPager2.g {
        m() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i11) {
            ViewPager2 viewPager2;
            StoriesFragment storiesFragment = StoriesFragment.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    return;
                }
                storiesFragment.getViewModel().p0().t(true);
            } else {
                A50.c p02 = storiesFragment.getViewModel().p0();
                C10661b c10661b = storiesFragment.binding;
                p02.v((c10661b == null || (viewPager2 = c10661b.f105033b) == null) ? 0 : viewPager2.f());
                storiesFragment.getViewModel().p0().t(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i11, float f7, int i12) {
            C10661b c10661b = StoriesFragment.this.binding;
            if (c10661b != null) {
                ViewPager2 viewPager2 = c10661b.f105033b;
            }
            super.onPageScrolled(i11, f7, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            Integer num;
            StoriesFragment storiesFragment = StoriesFragment.this;
            if (storiesFragment.prevSelected != null && ((num = storiesFragment.prevSelected) == null || num.intValue() != i11)) {
                storiesFragment.getViewModel().p0().f();
                A50.c p02 = storiesFragment.getViewModel().p0();
                Integer num2 = storiesFragment.prevSelected;
                p02.g(i11, num2 != null ? num2.intValue() : 0);
            }
            storiesFragment.prevSelected = Integer.valueOf(i11);
            C10661b c10661b = storiesFragment.binding;
            if (c10661b == null || c10661b.f105033b.k() != 0) {
                return;
            }
            A50.c p03 = storiesFragment.getViewModel().p0();
            C10661b c10661b2 = storiesFragment.binding;
            p03.v(c10661b2 != null ? c10661b2.f105033b.f() : 0);
            storiesFragment.getViewModel().p0().t(false);
        }
    }

    public static final class n extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return StoriesFragment.this;
        }
    }

    public static final class o extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f95342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f95342b = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95342b.invoke();
        }
    }

    public static final class p extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95343b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95343b.getValue()).getViewModelStore();
        }
    }

    public static final class q extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95344b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95344b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95344b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public StoriesFragment() {
        A30.a aVar = new A30.a(this, 1);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new o(new n()));
        this.viewModel = b0.b(this, kotlin.jvm.internal.N.b(a.class), new p(a11), new q(a11), aVar);
        this.animDuration = 400L;
        this.onBackPressedCallback = new c();
        this.isStandaloneIntegration = Sc.k.b(new B50.k(this, 0));
        this.dimAmount = 0.6f;
        this.pageListener = new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doCloseAnimation() {
        BaseBottomSheetBehaviour<ViewPager2> baseBottomSheetBehaviour = this.sheetBehavior;
        if (baseBottomSheetBehaviour != null) {
            baseBottomSheetBehaviour.setState(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOpenAnimation() {
        C10661b c10661b = this.binding;
        if (c10661b != null) {
            c10661b.f105033b.post(new B50.l(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOpenAnimation$lambda$8(StoriesFragment storiesFragment) {
        BaseBottomSheetBehaviour<ViewPager2> baseBottomSheetBehaviour = storiesFragment.sheetBehavior;
        if (baseBottomSheetBehaviour != null) {
            baseBottomSheetBehaviour.setState(3);
        }
    }

    @NotNull
    public static final Bundle getBundle(String str, Parcelable parcelable, int i11, @NotNull String str2) {
        INSTANCE.getClass();
        return Companion.a(str, parcelable, i11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isStandaloneIntegration_delegate$lambda$1(StoriesFragment storiesFragment) {
        return storiesFragment.getViewModel().r0();
    }

    @NotNull
    public static final StoriesFragment newInstance(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Companion companion = INSTANCE;
        companion.getClass();
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        StoriesFragment storiesFragment = new StoriesFragment();
        companion.getClass();
        storiesFragment.setArguments(Companion.a(str, parcelable, i11, uuid));
        return storiesFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackAlpha(float slideOffset) {
        CoordinatorLayout coordinatorLayout;
        CoordinatorLayout coordinatorLayout2;
        C10661b c10661b = this.binding;
        Drawable background = (c10661b == null || (coordinatorLayout2 = c10661b.f105034c) == null) ? null : coordinatorLayout2.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        Integer valueOf = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
        if (valueOf != null) {
            int f7 = androidx.core.graphics.c.f(valueOf.intValue(), Math.min(Math.max((int) (slideOffset * 255.0f), 0), 255));
            C10661b c10661b2 = this.binding;
            Object background2 = (c10661b2 == null || (coordinatorLayout = c10661b2.f105034c) == null) ? null : coordinatorLayout.getBackground();
            ColorDrawable colorDrawable2 = background2 instanceof ColorDrawable ? (ColorDrawable) background2 : null;
            if (colorDrawable2 != null) {
                colorDrawable2.setColor(f7);
            }
        }
    }

    @Override // w40.InterfaceC10428a
    public void action(String parameterJson) {
    }

    @Override // E30.b
    public /* bridge */ /* synthetic */ Integer getDialogBackground() {
        return (Integer) getDialogBackground();
    }

    @Override // E30.b
    /* renamed from: getDimAmount, reason: from getter */
    public float getF96848e() {
        return this.dimAmount;
    }

    @Override // E30.b
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public String getF62770a() {
        return this.fragmentName;
    }

    @Override // E30.b
    /* renamed from: getLightStatusBar, reason: from getter */
    public boolean getF62776g() {
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
        ((y50.g) O30.a.a(O30.c.a(requireActivity)).a(y50.g.class)).p(this);
        super.onAttach(context);
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        L80.a.a(TAG, "onCreate");
        setStyle(2, R.style.Base_Ozon_FullScreenDialog);
        a viewModel = getViewModel();
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("PARAMETER_JSON") : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        int i11 = arguments3 != null ? arguments3.getInt("PARAMETER_VERSION") : 2;
        Bundle arguments4 = getArguments();
        viewModel.j0(string2, parcelable, Integer.valueOf(i11), (arguments4 == null || (string = arguments4.getString("PARAMETER_UUID", "")) == null) ? "" : string, Boolean.TRUE);
        getViewModel().g0();
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        androidx.appcompat.app.j i11 = androidx.appcompat.app.j.i(onCreateDialog, new d());
        this.delegate = i11;
        i11.M(1);
        androidx.appcompat.app.j jVar = this.delegate;
        if (jVar != null) {
            jVar.g();
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        L80.a.a(TAG, "onCreateView");
        C10661b b11 = C10661b.b(inflater, container);
        this.binding = b11;
        CoordinatorLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        getViewModel().onDestroy();
        L80.a.a(TAG, "onDestroy");
    }

    @Override // E30.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        L80.a.a(TAG, "onDestroyView");
        getViewModel().p0().w();
        boolean nightOnStart = getNightOnStart();
        if (nightOnStart) {
            androidx.appcompat.app.j jVar = this.delegate;
            if (jVar != null) {
                jVar.M(2);
            }
        } else {
            if (nightOnStart) {
                throw new Sc.o();
            }
            androidx.appcompat.app.j jVar2 = this.delegate;
            if (jVar2 != null) {
                jVar2.M(1);
            }
        }
        androidx.appcompat.app.j jVar3 = this.delegate;
        if (jVar3 != null) {
            jVar3.g();
        }
        C10661b c10661b = this.binding;
        if (c10661b != null) {
            c10661b.f105033b.A(this.pageListener);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getViewModel().s0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        getViewModel().p0().x();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        getViewModel().p0().y();
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
        CoordinatorLayout coordinatorLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        L80.a.a(TAG, "onViewCreated");
        setBackAlpha(0.0f);
        C10661b c10661b = this.binding;
        if (c10661b != null && (coordinatorLayout = c10661b.f105034c) != null) {
            coordinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new e(coordinatorLayout, this));
        }
        getViewModel().p0().getClass();
        C0 n02 = getViewModel().n0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new f(n02, null, this), 3);
        C0 l11 = getViewModel().p0().l();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new g(l11, null, this), 3);
        C10661b c10661b2 = this.binding;
        ViewPager2 viewPager2 = c10661b2 != null ? c10661b2.f105033b : null;
        Intrinsics.f(viewPager2);
        BaseBottomSheetBehaviour<ViewPager2> h11 = BaseBottomSheetBehaviour.h(viewPager2);
        this.sheetBehavior = h11;
        if (h11 != null) {
            h11.setState(5);
        }
        BaseBottomSheetBehaviour<ViewPager2> baseBottomSheetBehaviour = this.sheetBehavior;
        if (baseBottomSheetBehaviour != null) {
            baseBottomSheetBehaviour.f94952a = 4;
        }
        if (baseBottomSheetBehaviour != null) {
            baseBottomSheetBehaviour.setFitToContents(true);
        }
        BaseBottomSheetBehaviour<ViewPager2> baseBottomSheetBehaviour2 = this.sheetBehavior;
        if (baseBottomSheetBehaviour2 != null) {
            baseBottomSheetBehaviour2.setSkipCollapsed(true);
        }
        BaseBottomSheetBehaviour<ViewPager2> baseBottomSheetBehaviour3 = this.sheetBehavior;
        if (baseBottomSheetBehaviour3 != null) {
            baseBottomSheetBehaviour3.g(new k());
        }
        x0<C50.d> q02 = getViewModel().q0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new h(q02, null, this), 3);
        C0 m02 = getViewModel().m0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new i(m02, null, this), 3);
    }

    @Override // w40.InterfaceC10428a
    @NotNull
    public String provideId() {
        return getViewModel().i0();
    }

    @Override // A50.c.a
    @NotNull
    public A50.c provideStoriesInteractor() {
        return getViewModel().p0();
    }

    @Override // w40.InterfaceC10428a
    public void updateState(String parameterJson, Parcelable parameterParcelable, int version, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        a viewModel = getViewModel();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("PARAMETER_JSON") : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        viewModel.j0(string, parcelable, Integer.valueOf(arguments3 != null ? arguments3.getInt("PARAMETER_VERSION") : 2), uuid, Boolean.FALSE);
    }

    public Void getDialogBackground() {
        return this.dialogBackground;
    }
}
