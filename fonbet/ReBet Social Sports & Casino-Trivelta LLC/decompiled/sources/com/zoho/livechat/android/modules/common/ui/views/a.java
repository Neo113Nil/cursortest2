package com.zoho.livechat.android.modules.common.ui.views;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.P;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.modules.common.ui.views.a;
import com.zoho.livechat.android.ui.customviews.SalesIQFloatingActionButton;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import od.AbstractC5886l;
import od.n;
import od.o;
import od.q;
import od.t;
import od.u;
import og.AbstractC5892d;
import og.k;
import og.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.C6218a;
import td.C6461a;

/* loaded from: classes4.dex */
public abstract class a extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    public final int f42737A;

    /* renamed from: B, reason: collision with root package name */
    public final int f42738B;

    /* renamed from: C, reason: collision with root package name */
    public View f42739C;

    /* renamed from: D, reason: collision with root package name */
    public final View f42740D;

    /* renamed from: E, reason: collision with root package name */
    public SalesIQFloatingActionButton f42741E;

    /* renamed from: F, reason: collision with root package name */
    public MobilistenTextView f42742F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f42743G;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f42744H;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f42745I;

    /* renamed from: J, reason: collision with root package name */
    public b f42746J;

    /* renamed from: K, reason: collision with root package name */
    public c f42747K;

    /* renamed from: L, reason: collision with root package name */
    public final SalesIQFloatingActionButton f42748L;

    /* renamed from: O, reason: collision with root package name */
    public final SalesIQFloatingActionButton f42749O;

    /* renamed from: P, reason: collision with root package name */
    public final SalesIQFloatingActionButton f42750P;

    /* renamed from: R, reason: collision with root package name */
    public final MobilistenTextView f42751R;

    /* renamed from: T, reason: collision with root package name */
    public final MobilistenTextView f42752T;

    /* renamed from: T1, reason: collision with root package name */
    public View.OnClickListener f42753T1;

    /* renamed from: V, reason: collision with root package name */
    public final MobilistenTextView f42754V;

    /* renamed from: V1, reason: collision with root package name */
    public final Lazy f42755V1;

    /* renamed from: W, reason: collision with root package name */
    public final MobilistenTextView f42756W;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f42757b1;

    /* renamed from: b2, reason: collision with root package name */
    public View.OnClickListener f42758b2;

    /* renamed from: g1, reason: collision with root package name */
    public C0616a f42759g1;

    /* renamed from: g2, reason: collision with root package name */
    public Function1 f42760g2;

    /* renamed from: p1, reason: collision with root package name */
    public View.OnClickListener f42761p1;

    /* renamed from: x1, reason: collision with root package name */
    public View.OnTouchListener f42762x1;

    /* renamed from: y1, reason: collision with root package name */
    public final Lazy f42763y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42764z;

    /* renamed from: com.zoho.livechat.android.modules.common.ui.views.a$a, reason: collision with other inner class name */
    public static final class C0616a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f42765a;

        public C0616a(boolean z10) {
            this.f42765a = z10;
        }

        public final boolean a() {
            return this.f42765a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Start = new b("Start", 0);
        public static final b End = new b("End", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{Start, End};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private b(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Top = new c("Top", 0);
        public static final c Bottom = new c("Bottom", 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{Top, Bottom};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private c(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[c.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42766n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f42767o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ a f42768p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f42767o = j10;
            this.f42768p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f42767o, this.f42768p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42766n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                long j10 = this.f42767o - 30;
                this.f42766n = 1;
                if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.f42768p.z0()) {
                a aVar = this.f42768p;
                aVar.B0(aVar.f42752T);
            } else {
                a aVar2 = this.f42768p;
                aVar2.B0(aVar2.f42751R);
                MobilistenTextView mobilistenTextView = this.f42768p.f42742F;
                if (mobilistenTextView != null) {
                    this.f42768p.B0(mobilistenTextView);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f42769a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f42770b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f42771c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f42772d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f42773e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Continuation f42774f;

        public f(boolean z10, a aVar, boolean z11, boolean z12, Function0 function0, Continuation continuation) {
            this.f42769a = z10;
            this.f42770b = aVar;
            this.f42771c = z11;
            this.f42772d = z12;
            this.f42773e = function0;
            this.f42774f = continuation;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f42769a) {
                this.f42770b.y0();
            }
            if (!this.f42771c) {
                this.f42770b.x0();
            }
            if (!this.f42770b.z0()) {
                this.f42770b.O();
                if (this.f42772d) {
                    View scrimView = this.f42770b.getScrimView();
                    if (scrimView != null) {
                        p.n(scrimView);
                    }
                    View scrimView2 = this.f42770b.getScrimView();
                    if (scrimView2 != null) {
                        scrimView2.setAlpha(1.0f);
                    }
                }
            }
            Function0 function0 = this.f42773e;
            if (function0 != null) {
                function0.invoke();
            }
            Continuation continuation = this.f42774f;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static final class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f42775a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f42776b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f42777c;

        public g(boolean z10, a aVar, boolean z11) {
            this.f42775a = z10;
            this.f42776b = aVar;
            this.f42777c = z11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f42775a && this.f42776b.f42748L.getVisibility() != 0) {
                this.f42776b.f42748L.setVisibility(0);
                this.f42776b.f42754V.setVisibility(0);
            }
            if (!this.f42777c || this.f42776b.f42749O.getVisibility() == 0) {
                return;
            }
            this.f42776b.f42749O.setVisibility(0);
            this.f42776b.f42756W.setVisibility(0);
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        public static final void c(a this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            View.OnClickListener onClickListener = this$0.f42753T1;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View.OnClickListener invoke() {
            final a aVar = a.this;
            return new View.OnClickListener() { // from class: ye.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.h.c(com.zoho.livechat.android.modules.common.ui.views.a.this, view);
                }
            };
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            View.OnClickListener onClickListener = this$0.f42758b2;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View.OnClickListener invoke() {
            final a aVar = a.this;
            return new View.OnClickListener() { // from class: ye.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.i.c(com.zoho.livechat.android.modules.common.ui.views.a.this, view);
                }
            };
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42780n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42781o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f42782p;

        /* renamed from: q, reason: collision with root package name */
        public int f42783q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f42785s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f42785s = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new j(this.f42785s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        
            if (com.zoho.livechat.android.modules.common.ui.views.a.o0(r0, true, null, r11, 2, null) == r6) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
        
            if (com.zoho.livechat.android.modules.common.ui.views.a.m0(r7, false, null, r11, 2, null) == r6) goto L59;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b1 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:13:0x001d, B:14:0x00e5, B:19:0x0035, B:20:0x00ab, B:22:0x00b1), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v13, types: [Wh.a] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [Wh.a] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Wh.a aVar2;
            boolean z10;
            a aVar3;
            Wh.a aVar4;
            Function1<Boolean, Unit> onFabToggleClickListener;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42783q;
            ?? r12 = 5;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Wh.a c10 = C6461a.C0913a.f65814a.c();
                        a aVar5 = a.this;
                        boolean z11 = this.f42785s;
                        this.f42780n = c10;
                        this.f42781o = aVar5;
                        this.f42782p = z11;
                        this.f42783q = 1;
                        if (c10.f(null, this) != coroutine_suspended) {
                            aVar = aVar5;
                            aVar2 = c10;
                            z10 = z11;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            if (i10 != 4 && i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Wh.a aVar6 = (Wh.a) this.f42780n;
                            ResultKt.throwOnFailure(obj);
                            r12 = aVar6;
                            Unit unit = Unit.INSTANCE;
                            r12.g(null);
                            return Unit.INSTANCE;
                        }
                        aVar3 = (a) this.f42781o;
                        Wh.a aVar7 = (Wh.a) this.f42780n;
                        ResultKt.throwOnFailure(obj);
                        aVar4 = aVar7;
                        onFabToggleClickListener = aVar3.getOnFabToggleClickListener();
                        r12 = aVar4;
                        if (onFabToggleClickListener != null) {
                            onFabToggleClickListener.invoke(Boxing.boxBoolean(aVar3.z0()));
                            r12 = aVar4;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        r12.g(null);
                        return Unit.INSTANCE;
                    }
                    z10 = this.f42782p;
                    aVar = (a) this.f42781o;
                    aVar2 = (Wh.a) this.f42780n;
                    ResultKt.throwOnFailure(obj);
                    if (aVar.f42764z && z10) {
                        if (!aVar.getFabsState().a()) {
                            a aVar8 = aVar;
                            this.f42780n = aVar2;
                            this.f42781o = null;
                            this.f42783q = 4;
                            if (a.m0(aVar8, true, null, this, 2, null) == coroutine_suspended) {
                            }
                            r12 = aVar2;
                            Unit unit22 = Unit.INSTANCE;
                            r12.g(null);
                            return Unit.INSTANCE;
                        }
                        if (aVar.z0()) {
                            this.f42780n = aVar2;
                            this.f42781o = aVar;
                            this.f42783q = 2;
                            aVar3 = aVar;
                            if (a.m0(aVar3, true, null, this, 2, null) == coroutine_suspended) {
                            }
                            aVar4 = aVar2;
                            onFabToggleClickListener = aVar3.getOnFabToggleClickListener();
                            r12 = aVar4;
                            if (onFabToggleClickListener != null) {
                            }
                        } else {
                            aVar3 = aVar;
                            this.f42780n = aVar2;
                            this.f42781o = aVar3;
                            this.f42783q = 3;
                        }
                        Unit unit222 = Unit.INSTANCE;
                        r12.g(null);
                        return Unit.INSTANCE;
                        return coroutine_suspended;
                    }
                    this.f42780n = aVar2;
                    this.f42781o = null;
                    this.f42783q = 5;
                } catch (Throwable th2) {
                    th = th2;
                    r12 = aVar2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            th = th3;
            r12.g(null);
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimension = (int) context.getResources().getDimension(o.f59939f);
        this.f42737A = dimension;
        int dimension2 = (int) context.getResources().getDimension(o.f59940g);
        this.f42738B = dimension2;
        View view = new View(context, attributeSet);
        view.setId(View.generateViewId());
        this.f42740D = view;
        this.f42746J = b.End;
        this.f42747K = c.Bottom;
        SalesIQFloatingActionButton salesIQFloatingActionButton = new SalesIQFloatingActionButton(context, attributeSet);
        salesIQFloatingActionButton.setId(q.f60255F5);
        salesIQFloatingActionButton.setContentDescription("miniFabOne");
        salesIQFloatingActionButton.setCompatPressedTranslationZ(k.d(1));
        salesIQFloatingActionButton.setCompatHoveredFocusedTranslationZ(k.d(1));
        salesIQFloatingActionButton.setCustomCornerRadius(12.0f);
        salesIQFloatingActionButton.setVisibility(8);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        salesIQFloatingActionButton.setScaleType(scaleType);
        salesIQFloatingActionButton.setMaxImageSize(dimension2);
        this.f42748L = salesIQFloatingActionButton;
        SalesIQFloatingActionButton salesIQFloatingActionButton2 = new SalesIQFloatingActionButton(context, attributeSet);
        salesIQFloatingActionButton2.setId(q.f60265G5);
        salesIQFloatingActionButton2.setContentDescription("miniFabTwo");
        salesIQFloatingActionButton2.setCompatPressedTranslationZ(k.d(1));
        salesIQFloatingActionButton2.setCompatHoveredFocusedTranslationZ(k.d(1));
        salesIQFloatingActionButton2.setCustomCornerRadius(12.0f);
        salesIQFloatingActionButton2.setScaleType(scaleType);
        salesIQFloatingActionButton2.setVisibility(8);
        salesIQFloatingActionButton2.setMaxImageSize(dimension2);
        this.f42749O = salesIQFloatingActionButton2;
        SalesIQFloatingActionButton salesIQFloatingActionButton3 = new SalesIQFloatingActionButton(context, attributeSet);
        salesIQFloatingActionButton3.setId(q.f60245E5);
        salesIQFloatingActionButton3.setCustomSize(dimension);
        salesIQFloatingActionButton3.setContentDescription("baseFab");
        salesIQFloatingActionButton3.setElevation(k.d(2));
        salesIQFloatingActionButton3.setCompatPressedTranslationZ(k.d(1));
        salesIQFloatingActionButton3.setCompatHoveredFocusedTranslationZ(k.d(1));
        this.f42750P = salesIQFloatingActionButton3;
        MobilistenTextView mobilistenTextView = new MobilistenTextView(context, attributeSet);
        mobilistenTextView.setId(View.generateViewId());
        mobilistenTextView.setTextAppearance(u.f61160f);
        mobilistenTextView.setVisibility(8);
        mobilistenTextView.setElevation(k.d(15));
        mobilistenTextView.setTypeface(C6218a.C());
        this.f42751R = mobilistenTextView;
        MobilistenTextView mobilistenTextView2 = new MobilistenTextView(context, attributeSet);
        mobilistenTextView2.setId(View.generateViewId());
        mobilistenTextView2.setTextAppearance(u.f61160f);
        mobilistenTextView2.setElevation(k.d(15));
        mobilistenTextView2.setTypeface(C6218a.C());
        mobilistenTextView2.setVisibility(8);
        this.f42752T = mobilistenTextView2;
        MobilistenTextView mobilistenTextView3 = new MobilistenTextView(context, attributeSet);
        mobilistenTextView3.setId(View.generateViewId());
        mobilistenTextView3.setText(context.getString(t.f61136w4));
        mobilistenTextView3.setTextSize(14.0f);
        mobilistenTextView3.setTextColor(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59728I2), 0.0f, 2, null));
        mobilistenTextView3.setTypeface(C6218a.C());
        mobilistenTextView3.setLetterSpacing(0.01f);
        mobilistenTextView3.setShadowLayer(k.d(4), k.d(1), k.d(1), androidx.core.content.res.k.d(context.getResources(), n.f59932l, context.getTheme()));
        this.f42754V = mobilistenTextView3;
        MobilistenTextView mobilistenTextView4 = new MobilistenTextView(context, attributeSet);
        mobilistenTextView4.setId(View.generateViewId());
        mobilistenTextView4.setText(context.getString(t.f60921P3));
        mobilistenTextView4.setTextSize(14.0f);
        mobilistenTextView4.setTextColor(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59728I2), 0.0f, 2, null));
        mobilistenTextView4.setLineSpacing(context.getResources().getDimension(o.f59941h), 1.0f);
        mobilistenTextView4.setTypeface(C6218a.C());
        mobilistenTextView4.setLetterSpacing(0.01f);
        mobilistenTextView4.setShadowLayer(k.d(4), k.d(1), k.d(1), androidx.core.content.res.k.d(context.getResources(), n.f59932l, context.getTheme()));
        this.f42756W = mobilistenTextView4;
        this.f42757b1 = true;
        this.f42759g1 = new C0616a(false);
        K();
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        W(this, dVar, false, 1, null);
        U(this, dVar, false, 1, null);
        c0(this, dVar, false, 1, null);
        h0(this, dVar, false, 1, null);
        e0(this, dVar, false, 1, null);
        j0(this, dVar, false, 1, null);
        R(dVar);
        a0(this, dVar, false, 1, null);
        dVar.c(this);
        L(mobilistenTextView);
        N(this, mobilistenTextView, false, 1, null);
        MobilistenTextView mobilistenTextView5 = this.f42742F;
        if (mobilistenTextView5 != null) {
            Q(this, mobilistenTextView5, false, 1, null);
        }
        L(mobilistenTextView2);
        M(mobilistenTextView2, true);
        X();
        S();
        Y(salesIQFloatingActionButton);
        Y(salesIQFloatingActionButton2);
        f0();
        p0();
        r0();
        this.f42763y1 = LazyKt.lazy(new h());
        this.f42755V1 = LazyKt.lazy(new i());
    }

    public static /* synthetic */ void N(a aVar, MobilistenTextView mobilistenTextView, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyBadgeCountLayoutParams");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.M(mobilistenTextView, z10);
    }

    public static /* synthetic */ void Q(a aVar, MobilistenTextView mobilistenTextView, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyBaseFabAliasBadgeCountConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.P(mobilistenTextView, z10);
    }

    public static /* synthetic */ void U(a aVar, androidx.constraintlayout.widget.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyBaseFabViewConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.T(dVar, z10);
    }

    public static /* synthetic */ void W(a aVar, androidx.constraintlayout.widget.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyCenterViewConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.V(dVar, z10);
    }

    public static /* synthetic */ void a0(a aVar, androidx.constraintlayout.widget.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMiniFabOneBadgeCountConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.Z(dVar, z10);
    }

    public static /* synthetic */ void c0(a aVar, androidx.constraintlayout.widget.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMiniFabOneConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.b0(dVar, z10);
    }

    public static /* synthetic */ void e0(a aVar, androidx.constraintlayout.widget.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMiniFabOneTitleConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.d0(dVar, z10);
    }

    private final View.OnClickListener getDefaultMiniFabOneOnClickListener() {
        return (View.OnClickListener) this.f42763y1.getValue();
    }

    private final View.OnClickListener getDefaultMiniFabTwoOnClickListener() {
        return (View.OnClickListener) this.f42755V1.getValue();
    }

    private final int get_16DpInPixels() {
        return (int) getContext().getResources().getDimension(o.f59937d);
    }

    public static /* synthetic */ void h0(a aVar, androidx.constraintlayout.widget.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMiniFabTwoConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.g0(dVar, z10);
    }

    public static /* synthetic */ void j0(a aVar, androidx.constraintlayout.widget.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMiniFabTwoTitleConstraints");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.i0(dVar, z10);
    }

    public static /* synthetic */ Object m0(a aVar, boolean z10, Function0 function0, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapseFABs");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        return aVar.l0(z10, function0, continuation);
    }

    public static /* synthetic */ Object o0(a aVar, boolean z10, Function0 function0, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandFABs");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        return aVar.n0(z10, function0, continuation);
    }

    public static final void q0(a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f42759g1.a()) {
            this$0.s0(true);
            return;
        }
        View.OnClickListener onClickListener = this$0.f42761p1;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void A0() {
        getBaseFab().m();
        SalesIQFloatingActionButton salesIQFloatingActionButton = this.f42741E;
        if (salesIQFloatingActionButton != null) {
            salesIQFloatingActionButton.m();
        }
    }

    public final void B0(MobilistenTextView mobilistenTextView) {
        if (mobilistenTextView.length() <= 0 || mobilistenTextView.getVisibility() == 0) {
            return;
        }
        p.w(mobilistenTextView);
    }

    public final void K() {
        addView(this.f42740D);
        addView(getBaseFab());
        addView(this.f42748L);
        addView(this.f42754V);
        addView(this.f42749O);
        addView(this.f42756W);
        addView(this.f42751R);
        addView(this.f42752T);
    }

    public final void L(MobilistenTextView mobilistenTextView) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(k.d(24));
        Context context = mobilistenTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59913z2), 0.0f, 2, null));
        mobilistenTextView.setBackgroundDrawable(gradientDrawable);
    }

    public final void M(MobilistenTextView mobilistenTextView, boolean z10) {
        float f10;
        mobilistenTextView.setGravity(17);
        mobilistenTextView.setTextSize(11.0f);
        int b10 = k.b(2);
        mobilistenTextView.setPadding(b10, b10, b10, b10);
        mobilistenTextView.setMinWidth(k.b(18));
        mobilistenTextView.setMinHeight(k.b(18));
        if (z10) {
            return;
        }
        mobilistenTextView.setTranslationY(k.c(4.5f));
        int i10 = d.$EnumSwitchMapping$0[this.f42746J.ordinal()];
        if (i10 == 1) {
            f10 = -k.c(4.5f);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = k.c(4.5f);
        }
        mobilistenTextView.setTranslationX(f10);
    }

    public final void O() {
        SalesIQFloatingActionButton salesIQFloatingActionButton;
        SalesIQFloatingActionButton baseFab = getBaseFab();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        baseFab.setBackgroundTintList(ColorStateList.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59889t2), 0.0f, 2, null)));
        if (this.f42743G == null) {
            Drawable drawable = this.f42745I;
            if (drawable != null) {
                getBaseFab().setImageDrawable(drawable);
            }
            Drawable drawable2 = this.f42745I;
            if (drawable2 != null && (salesIQFloatingActionButton = this.f42741E) != null) {
                salesIQFloatingActionButton.setImageDrawable(drawable2);
            }
        }
        SalesIQFloatingActionButton salesIQFloatingActionButton2 = this.f42741E;
        if (salesIQFloatingActionButton2 != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            salesIQFloatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(AbstractC5892d.h(context2, Integer.valueOf(AbstractC5886l.f59889t2), 0.0f, 2, null)));
        }
        B0(this.f42751R);
        MobilistenTextView mobilistenTextView = this.f42742F;
        if (mobilistenTextView != null) {
            B0(mobilistenTextView);
        }
        p.n(this.f42752T);
    }

    public final void P(MobilistenTextView mobilistenTextView, boolean z10) {
        SalesIQFloatingActionButton salesIQFloatingActionButton;
        if (mobilistenTextView == null || (salesIQFloatingActionButton = this.f42741E) == null) {
            return;
        }
        Intrinsics.checkNotNull(salesIQFloatingActionButton);
        ViewGroup.LayoutParams layoutParams = mobilistenTextView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f18164i = salesIQFloatingActionButton.getId();
        bVar.f18168k = salesIQFloatingActionButton.getId();
        int i10 = d.$EnumSwitchMapping$0[this.f42746J.ordinal()];
        if (i10 == 1) {
            if (z10) {
                bVar.f18186t = -1;
                bVar.f18188u = -1;
            }
            bVar.f18190v = salesIQFloatingActionButton.getId();
            bVar.f18184s = salesIQFloatingActionButton.getId();
        } else if (i10 == 2) {
            if (z10) {
                bVar.f18190v = -1;
                bVar.f18184s = -1;
            }
            bVar.f18186t = salesIQFloatingActionButton.getId();
            bVar.f18188u = salesIQFloatingActionButton.getId();
        }
        mobilistenTextView.setLayoutParams(bVar);
    }

    public final void R(androidx.constraintlayout.widget.d dVar) {
        dVar.h(this.f42751R.getId(), 3, getBaseFab().getId(), 3);
        dVar.h(this.f42751R.getId(), 4, getBaseFab().getId(), 3);
        dVar.h(this.f42751R.getId(), 6, getBaseFab().getId(), 6);
        dVar.h(this.f42751R.getId(), 7, getBaseFab().getId(), 6);
    }

    public final void S() {
        SalesIQFloatingActionButton baseFab = getBaseFab();
        ViewGroup.LayoutParams layoutParams = baseFab.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f18141T = this.f42737A;
        baseFab.setLayoutParams(bVar);
    }

    public final void T(androidx.constraintlayout.widget.d dVar, boolean z10) {
        androidx.constraintlayout.widget.d dVar2;
        if (this.f42747K == c.Bottom) {
            if (z10) {
                dVar.h(getBaseFab().getId(), 3, -1, 3);
            }
            dVar2 = dVar;
            dVar2.i(getBaseFab().getId(), 4, 0, 4, get_16DpInPixels());
        } else {
            dVar2 = dVar;
            if (z10) {
                dVar2.h(getBaseFab().getId(), 4, -1, 4);
            }
            dVar2.i(getBaseFab().getId(), 3, 0, 3, get_16DpInPixels());
        }
        dVar2.h(getBaseFab().getId(), 7, this.f42740D.getId(), 7);
        dVar2.h(getBaseFab().getId(), 6, this.f42740D.getId(), 6);
    }

    public final void V(androidx.constraintlayout.widget.d dVar, boolean z10) {
        if (this.f42747K == c.Top) {
            if (z10) {
                dVar.h(this.f42740D.getId(), 4, -1, 4);
            }
            dVar.h(this.f42740D.getId(), 3, 0, 3);
        } else {
            if (z10) {
                dVar.h(this.f42740D.getId(), 3, -1, 3);
            }
            dVar.h(this.f42740D.getId(), 4, 0, 4);
        }
        dVar.h(this.f42740D.getId(), 7, 0, 7);
        dVar.h(this.f42740D.getId(), 6, 0, 6);
    }

    public final void X() {
        float f10;
        View view = this.f42740D;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = this.f42737A;
        ((ViewGroup.MarginLayoutParams) bVar).height = k.b(1);
        bVar.f18141T = this.f42737A;
        int i10 = d.$EnumSwitchMapping$0[this.f42746J.ordinal()];
        float f11 = 0.0f;
        if (i10 == 1) {
            f10 = 0.0f;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = 1.0f;
        }
        bVar.f18128G = f10;
        int i11 = d.$EnumSwitchMapping$1[this.f42747K.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f11 = 1.0f;
        }
        bVar.f18129H = f11;
        bVar.setMarginStart(get_16DpInPixels());
        bVar.setMarginEnd(get_16DpInPixels());
        view.setLayoutParams(bVar);
    }

    public final void Y(SalesIQFloatingActionButton salesIQFloatingActionButton) {
        ViewGroup.LayoutParams layoutParams = salesIQFloatingActionButton.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f18141T = this.f42738B;
        salesIQFloatingActionButton.setLayoutParams(bVar);
    }

    public final void Z(androidx.constraintlayout.widget.d dVar, boolean z10) {
        dVar.h(this.f42752T.getId(), 3, this.f42748L.getId(), 3);
        dVar.h(this.f42752T.getId(), 4, this.f42748L.getId(), 3);
        int i10 = d.$EnumSwitchMapping$0[this.f42746J.ordinal()];
        if (i10 == 1) {
            if (z10) {
                dVar.h(this.f42752T.getId(), 6, -1, 6);
                dVar.h(this.f42752T.getId(), 7, -1, 6);
            }
            dVar.h(this.f42752T.getId(), 7, this.f42748L.getId(), 7);
            dVar.h(this.f42752T.getId(), 6, this.f42748L.getId(), 7);
            return;
        }
        if (i10 != 2) {
            return;
        }
        if (z10) {
            dVar.h(this.f42752T.getId(), 7, -1, 7);
            dVar.h(this.f42752T.getId(), 6, -1, 7);
        }
        dVar.h(this.f42752T.getId(), 6, this.f42748L.getId(), 6);
        dVar.h(this.f42752T.getId(), 7, this.f42748L.getId(), 6);
    }

    public final void b0(androidx.constraintlayout.widget.d dVar, boolean z10) {
        if (this.f42747K == c.Bottom) {
            if (z10) {
                dVar.i(this.f42748L.getId(), 3, -1, 4, 0);
            }
            dVar.i(this.f42748L.getId(), 4, getBaseFab().getId(), 3, k.b(24));
        } else {
            if (z10) {
                dVar.i(this.f42748L.getId(), 4, -1, 3, 0);
            }
            dVar.i(this.f42748L.getId(), 3, getBaseFab().getId(), 4, k.b(24));
        }
        dVar.h(this.f42748L.getId(), 7, this.f42740D.getId(), 7);
        dVar.h(this.f42748L.getId(), 6, this.f42740D.getId(), 6);
    }

    public final void d0(androidx.constraintlayout.widget.d dVar, boolean z10) {
        dVar.h(this.f42754V.getId(), 3, this.f42748L.getId(), 3);
        dVar.h(this.f42754V.getId(), 4, this.f42748L.getId(), 4);
        int i10 = d.$EnumSwitchMapping$0[this.f42746J.ordinal()];
        if (i10 == 1) {
            if (z10) {
                dVar.i(this.f42754V.getId(), 7, -1, 6, 0);
            }
            dVar.i(this.f42754V.getId(), 6, this.f42748L.getId(), 7, k.b(14));
        } else {
            if (i10 != 2) {
                return;
            }
            if (z10) {
                dVar.i(this.f42754V.getId(), 6, -1, 7, 0);
            }
            dVar.i(this.f42754V.getId(), 7, this.f42748L.getId(), 6, k.b(14));
        }
    }

    public final void f0() {
        MobilistenTextView mobilistenTextView = this.f42754V;
        ViewGroup.LayoutParams layoutParams = mobilistenTextView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        mobilistenTextView.setLayoutParams(bVar);
        MobilistenTextView mobilistenTextView2 = this.f42756W;
        ViewGroup.LayoutParams layoutParams2 = mobilistenTextView2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        ((ViewGroup.MarginLayoutParams) bVar2).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar2).height = -2;
        mobilistenTextView2.setLayoutParams(bVar2);
    }

    public final void g0(androidx.constraintlayout.widget.d dVar, boolean z10) {
        androidx.constraintlayout.widget.d dVar2;
        if (this.f42747K == c.Bottom) {
            if (z10) {
                dVar.i(this.f42749O.getId(), 3, -1, 4, 0);
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
            }
            dVar2.i(this.f42749O.getId(), 4, this.f42748L.getId(), 3, get_16DpInPixels());
        } else {
            dVar2 = dVar;
            if (z10) {
                dVar2.i(this.f42749O.getId(), 4, -1, 3, 0);
            }
            dVar2.i(this.f42749O.getId(), 3, this.f42748L.getId(), 4, get_16DpInPixels());
        }
        dVar2.h(this.f42749O.getId(), 7, this.f42740D.getId(), 7);
        dVar2.h(this.f42749O.getId(), 6, this.f42740D.getId(), 6);
    }

    @Nullable
    public final SalesIQFloatingActionButton getAliasBaseFab() {
        return this.f42741E;
    }

    @NotNull
    public SalesIQFloatingActionButton getBaseFab() {
        return this.f42750P;
    }

    @Nullable
    public final Drawable getBaseFabCustomImageDrawable() {
        return this.f42743G;
    }

    @NotNull
    public final C0616a getFabsState() {
        return this.f42759g1;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnFabToggleClickListener() {
        return this.f42760g2;
    }

    @Nullable
    public final View getScrimView() {
        return this.f42739C;
    }

    public final void i0(androidx.constraintlayout.widget.d dVar, boolean z10) {
        dVar.h(this.f42756W.getId(), 3, this.f42749O.getId(), 3);
        dVar.h(this.f42756W.getId(), 4, this.f42749O.getId(), 4);
        int i10 = d.$EnumSwitchMapping$0[this.f42746J.ordinal()];
        if (i10 == 1) {
            if (z10) {
                dVar.i(this.f42756W.getId(), 7, -1, 6, 0);
            }
            dVar.i(this.f42756W.getId(), 6, this.f42749O.getId(), 7, k.b(14));
        } else {
            if (i10 != 2) {
                return;
            }
            if (z10) {
                dVar.h(this.f42756W.getId(), 6, -1, 7);
            }
            dVar.i(this.f42756W.getId(), 7, this.f42749O.getId(), 6, k.b(14));
        }
    }

    public final Object k0(boolean z10, boolean z11, boolean z12, Function0 function0, Continuation continuation) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        ObjectAnimator objectAnimator;
        View view;
        if (z12) {
            if (this.f42749O.getVisibility() != 0) {
                int height = this.f42749O.getHeight();
                ViewGroup.LayoutParams layoutParams = this.f42749O.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int height2 = height + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + this.f42748L.getHeight();
                ViewGroup.LayoutParams layoutParams2 = this.f42748L.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i10 = height2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                if (this.f42747K == c.Top) {
                    i10 = -i10;
                }
                float f10 = i10;
                this.f42749O.setTranslationY(f10);
                this.f42756W.setTranslationY(f10);
                ofFloat = ObjectAnimator.ofFloat(this.f42749O, "translationY", f10, 0.0f);
                ofFloat2 = ObjectAnimator.ofFloat(this.f42756W, "translationY", f10, 0.0f);
            }
            ofFloat2 = null;
            ofFloat = null;
        } else {
            if (this.f42749O.getVisibility() == 0) {
                int height3 = this.f42749O.getHeight();
                ViewGroup.LayoutParams layoutParams3 = this.f42749O.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int height4 = height3 + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0) + this.f42748L.getHeight();
                ViewGroup.LayoutParams layoutParams4 = this.f42748L.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                int i11 = height4 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
                if (this.f42747K == c.Top) {
                    i11 = -i11;
                }
                float f11 = i11;
                ofFloat = ObjectAnimator.ofFloat(this.f42749O, "translationY", 0.0f, f11);
                ofFloat2 = ObjectAnimator.ofFloat(this.f42756W, "translationY", 0.0f, f11);
            }
            ofFloat2 = null;
            ofFloat = null;
        }
        if (z11) {
            if (this.f42748L.getVisibility() != 0) {
                int height5 = this.f42748L.getHeight();
                ViewGroup.LayoutParams layoutParams5 = this.f42748L.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                int i12 = height5 + (marginLayoutParams5 != null ? marginLayoutParams5.bottomMargin : 0);
                if (this.f42747K == c.Top) {
                    i12 = -i12;
                }
                float f12 = i12;
                this.f42748L.setTranslationY(f12);
                this.f42754V.setTranslationY(f12);
                ofFloat3 = ObjectAnimator.ofFloat(this.f42748L, "translationY", f12, 0.0f);
                ofFloat4 = ObjectAnimator.ofFloat(this.f42754V, "translationY", f12, 0.0f);
            }
            ofFloat4 = null;
            ofFloat3 = null;
        } else {
            if (this.f42748L.getVisibility() == 0) {
                int height6 = this.f42748L.getHeight();
                ViewGroup.LayoutParams layoutParams6 = this.f42748L.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                int i13 = height6 + (marginLayoutParams6 != null ? marginLayoutParams6.bottomMargin : 0);
                if (this.f42747K == c.Top) {
                    i13 = -i13;
                }
                float f13 = i13;
                ofFloat3 = ObjectAnimator.ofFloat(this.f42748L, "translationY", 0.0f, f13);
                ofFloat4 = ObjectAnimator.ofFloat(this.f42754V, "translationY", 0.0f, f13);
            }
            ofFloat4 = null;
            ofFloat3 = null;
        }
        if (ofFloat3 == null && ofFloat == null) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        if (!z10 || (view = this.f42739C) == null) {
            objectAnimator = null;
        } else if (this.f42757b1) {
            view.setAlpha(0.0f);
            p.w(view);
            objectAnimator = ObjectAnimator.ofFloat(this.f42739C, "alpha", 0.0f, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        }
        if (this.f42757b1) {
            p.n(this.f42751R);
            MobilistenTextView mobilistenTextView = this.f42742F;
            if (mobilistenTextView != null) {
                mobilistenTextView.setVisibility(4);
            }
        } else {
            p.n(this.f42752T);
        }
        AbstractC1459k.d(C6461a.f65810a.d(), null, null, new e(150L, this, null), 3, null);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        ArrayList arrayList = new ArrayList();
        if (ofFloat3 != null) {
            Boxing.boxBoolean(arrayList.add(ofFloat3));
        }
        if (ofFloat != null) {
            Boxing.boxBoolean(arrayList.add(ofFloat));
        }
        if (ofFloat4 != null) {
            Boxing.boxBoolean(arrayList.add(ofFloat4));
        }
        if (ofFloat2 != null) {
            Boxing.boxBoolean(arrayList.add(ofFloat2));
        }
        if (objectAnimator != null) {
            arrayList.add(objectAnimator);
        }
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new g(z11, this, z12));
        animatorSet.addListener(new f(z12, this, z11, z10, function0, safeContinuation));
        animatorSet.start();
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object l0(boolean z10, Function0 function0, Continuation continuation) {
        SalesIQFloatingActionButton salesIQFloatingActionButton = this.f42748L;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        salesIQFloatingActionButton.setImageTintList(ColorStateList.valueOf(AbstractC5892d.h(context, Boxing.boxInt(AbstractC5886l.f59728I2), 0.0f, 2, null)));
        this.f42757b1 = false;
        if (this.f42764z && z10) {
            Object k02 = k0(true, false, false, function0, continuation);
            return k02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? k02 : Unit.INSTANCE;
        }
        x0();
        y0();
        O();
        this.f42764z = true;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final Object n0(boolean z10, Function0 function0, Continuation continuation) {
        SalesIQFloatingActionButton salesIQFloatingActionButton;
        SalesIQFloatingActionButton baseFab = getBaseFab();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        baseFab.setBackgroundTintList(ColorStateList.valueOf(AbstractC5892d.h(context, Boxing.boxInt(AbstractC5886l.f59728I2), 0.0f, 2, null)));
        SalesIQFloatingActionButton baseFab2 = getBaseFab();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        baseFab2.setImageTintList(ColorStateList.valueOf(AbstractC5892d.h(context2, Boxing.boxInt(AbstractC5886l.f59889t2), 0.0f, 2, null)));
        if (this.f42743G == null) {
            Drawable drawable = this.f42744H;
            if (drawable != null) {
                getBaseFab().setImageDrawable(drawable);
            }
            Drawable drawable2 = this.f42744H;
            if (drawable2 != null && (salesIQFloatingActionButton = this.f42741E) != null) {
                salesIQFloatingActionButton.setImageDrawable(drawable2);
            }
        }
        SalesIQFloatingActionButton salesIQFloatingActionButton2 = this.f42741E;
        if (salesIQFloatingActionButton2 != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            salesIQFloatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(AbstractC5892d.h(context3, Boxing.boxInt(AbstractC5886l.f59728I2), 0.0f, 2, null)));
        }
        SalesIQFloatingActionButton salesIQFloatingActionButton3 = this.f42741E;
        if (salesIQFloatingActionButton3 != null) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            salesIQFloatingActionButton3.setImageTintList(ColorStateList.valueOf(AbstractC5892d.h(context4, Boxing.boxInt(AbstractC5886l.f59889t2), 0.0f, 2, null)));
        }
        this.f42757b1 = true;
        Object k02 = k0(z10, true, true, function0, continuation);
        return k02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? k02 : Unit.INSTANCE;
    }

    public final void p0() {
        getBaseFab().setOnClickListener(new View.OnClickListener() { // from class: ye.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.zoho.livechat.android.modules.common.ui.views.a.q0(com.zoho.livechat.android.modules.common.ui.views.a.this, view);
            }
        });
    }

    public final void r0() {
        View.OnTouchListener onTouchListener = this.f42762x1;
        if (onTouchListener != null) {
            getBaseFab().setOnTouchListener(onTouchListener);
        }
    }

    public final void s0(boolean z10) {
        AbstractC1459k.d(C6461a.f65810a.f(), null, null, new j(z10, null), 3, null);
    }

    public final void setAliasBaseFab(@Nullable SalesIQFloatingActionButton salesIQFloatingActionButton) {
        this.f42741E = salesIQFloatingActionButton;
    }

    public void setAliasBaseFabBadgeCountView(@NotNull MobilistenTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f42742F = view;
        if (view != null) {
            L(view);
        }
        MobilistenTextView mobilistenTextView = this.f42742F;
        if (mobilistenTextView != null) {
            N(this, mobilistenTextView, false, 1, null);
        }
    }

    public void setAliasBaseFloatingActionButton(@NotNull SalesIQFloatingActionButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f42741E = button;
    }

    public void setBadgeCount(int i10) {
        String valueOf = i10 > 99 ? "99+" : i10 > 0 ? String.valueOf(i10) : "";
        this.f42751R.setText(valueOf);
        MobilistenTextView mobilistenTextView = this.f42742F;
        if (mobilistenTextView != null) {
            mobilistenTextView.setText(valueOf);
        }
        this.f42752T.setText(valueOf);
        if (!og.i.f(valueOf)) {
            p.n(this.f42752T);
            p.n(this.f42751R);
            MobilistenTextView mobilistenTextView2 = this.f42742F;
            if (mobilistenTextView2 != null) {
                p.n(mobilistenTextView2);
                return;
            }
            return;
        }
        if (this.f42757b1) {
            B0(this.f42752T);
            p.n(this.f42751R);
            p.n(this.f42742F);
        } else {
            p.n(this.f42752T);
            B0(this.f42751R);
            MobilistenTextView mobilistenTextView3 = this.f42742F;
            if (mobilistenTextView3 != null) {
                B0(mobilistenTextView3);
            }
        }
    }

    public final void setBaseFabCollapsedStateImageResource(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f42745I = drawable;
        if (this.f42743G == null) {
            if (this.f42757b1) {
                Drawable drawable2 = this.f42744H;
                if (drawable2 != null) {
                    getBaseFab().setImageDrawable(drawable2);
                    return;
                }
                return;
            }
            getBaseFab().setImageDrawable(drawable);
            SalesIQFloatingActionButton salesIQFloatingActionButton = this.f42741E;
            if (salesIQFloatingActionButton != null) {
                salesIQFloatingActionButton.setImageDrawable(drawable);
            }
        }
    }

    public final void setBaseFabCustomImageDrawable(@Nullable Drawable drawable) {
        this.f42743G = drawable;
    }

    public final void setBaseFabCustomSize(int i10) {
        getBaseFab().setCustomSize(i10);
    }

    public final void setBaseFabExpandedStateImageResource(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f42744H = drawable;
        if (this.f42743G == null) {
            if (!this.f42757b1) {
                Drawable drawable2 = this.f42745I;
                if (drawable2 != null) {
                    getBaseFab().setImageDrawable(drawable2);
                    return;
                }
                return;
            }
            getBaseFab().setImageDrawable(drawable);
            SalesIQFloatingActionButton salesIQFloatingActionButton = this.f42741E;
            if (salesIQFloatingActionButton != null) {
                salesIQFloatingActionButton.setImageDrawable(drawable);
            }
        }
    }

    public final void setBaseFabImageResource(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.f42743G == null) {
            getBaseFab().setImageDrawable(drawable);
            SalesIQFloatingActionButton salesIQFloatingActionButton = this.f42741E;
            if (salesIQFloatingActionButton != null) {
                salesIQFloatingActionButton.setImageDrawable(drawable);
            }
        }
    }

    public final void setFabsState(@NotNull C0616a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42759g1 = value;
        this.f42764z = false;
        s0(false);
    }

    public final void setIconsExpanded(boolean z10) {
        this.f42757b1 = z10;
    }

    public final void setMiniFabOneCustomSize(int i10) {
        this.f42748L.setCustomSize(i10);
    }

    public final void setMiniFabOneImageResource(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f42748L.setImageDrawable(drawable);
    }

    public final void setMiniFabTwoCustomSize(int i10) {
        this.f42749O.setCustomSize(i10);
    }

    public final void setMiniFabTwoImageResource(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f42749O.setImageDrawable(drawable);
    }

    public final void setOnBaseFabClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42761p1 = listener;
    }

    public final void setOnBaseFabTouchListener(@NotNull View.OnTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42762x1 = listener;
        r0();
    }

    public final void setOnFabToggleClickListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f42760g2 = function1;
    }

    public final void setOnMiniFabOneClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42748L.setOnClickListener(getDefaultMiniFabOneOnClickListener());
        this.f42753T1 = listener;
    }

    public final void setOnMiniFabTwoClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42749O.setOnClickListener(getDefaultMiniFabTwoOnClickListener());
        this.f42758b2 = listener;
    }

    public final void setScrimView(@Nullable View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        this.f42739C = view;
    }

    public final void t0(b horizontalSide) {
        float f10;
        Intrinsics.checkNotNullParameter(horizontalSide, "horizontalSide");
        this.f42746J = horizontalSide;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        d0(dVar, true);
        i0(dVar, true);
        dVar.c(this);
        View view = this.f42740D;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int i10 = d.$EnumSwitchMapping$0[horizontalSide.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = 1.0f;
        }
        bVar.f18128G = f10;
        view.setLayoutParams(bVar);
    }

    public final void u0(c verticalSide) {
        Intrinsics.checkNotNullParameter(verticalSide, "verticalSide");
        this.f42747K = verticalSide;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        V(dVar, true);
        T(dVar, true);
        b0(dVar, true);
        g0(dVar, true);
        dVar.c(this);
        X();
        S();
    }

    public final void v0() {
        w0();
        x0();
        y0();
    }

    public final void w0() {
        getBaseFab().h();
        SalesIQFloatingActionButton salesIQFloatingActionButton = this.f42741E;
        if (salesIQFloatingActionButton != null) {
            salesIQFloatingActionButton.h();
        }
    }

    public final void x0() {
        this.f42748L.setVisibility(8);
        p.n(this.f42754V);
        p.n(this.f42752T);
    }

    public final void y0() {
        this.f42749O.setVisibility(8);
        p.n(this.f42756W);
    }

    public final boolean z0() {
        return this.f42757b1;
    }
}
