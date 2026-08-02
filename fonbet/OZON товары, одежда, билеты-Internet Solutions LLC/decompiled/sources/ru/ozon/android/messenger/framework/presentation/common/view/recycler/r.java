package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import c3.C5739a;
import c3.C5741c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r extends AbstractC9510a<ru.ozon.android.messenger.framework.presentation.models.g> implements C {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final B<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> f91262e;

    /* renamed from: f, reason: collision with root package name */
    private final l f91263f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC7737t f91264g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private a f91265h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLOSED;
        public static final a CLOSING;
        public static final a OPENED;
        public static final a OPENING;
        public static final a UNDEFINED;

        static {
            a aVar = new a("OPENING", 0);
            OPENING = aVar;
            a aVar2 = new a("OPENED", 1);
            OPENED = aVar2;
            a aVar3 = new a("CLOSING", 2);
            CLOSING = aVar3;
            a aVar4 = new a("CLOSED", 3);
            CLOSED = aVar4;
            a aVar5 = new a("UNDEFINED", 4);
            UNDEFINED = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            r.this.f91265h = a.UNDEFINED;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            r.this.f91265h = a.CLOSED;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    public static final class c implements Animator.AnimatorListener {
        c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            r.this.f91265h = a.UNDEFINED;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            r.this.f91265h = a.OPENED;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull B<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> messengerView, l lVar, Function0<Unit> function0) {
        super(messengerView.getBinding().getRoot(), messengerView);
        Intrinsics.checkNotNullParameter(messengerView, "messengerView");
        this.f91262e = messengerView;
        this.f91263f = lVar;
        this.f91264g = (AbstractC7737t) function0;
        this.f91265h = a.CLOSED;
        messengerView.b(new B90.D(this));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.C
    public final void a() {
        a aVar;
        a aVar2 = this.f91265h;
        if (aVar2 == a.OPENED || aVar2 == (aVar = a.OPENING)) {
            return;
        }
        this.f91265h = aVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.itemView, "scrollX", this.f91262e.a());
        ofInt.setInterpolator(new C5741c());
        ofInt.setDuration(200L);
        ofInt.addListener(new c());
        ofInt.start();
        ofInt.setAutoCancel(true);
        ?? r02 = this.f91264g;
        if (r02 != 0) {
            r02.invoke();
        }
        l lVar = this.f91263f;
        if (lVar != null) {
            lVar.a(this);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.C
    public final void b() {
        a aVar;
        a aVar2 = this.f91265h;
        if (aVar2 == a.CLOSED || aVar2 == (aVar = a.CLOSING)) {
            return;
        }
        this.f91265h = aVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.itemView, "scrollX", 0);
        ofInt.setInterpolator(new C5739a());
        ofInt.setDuration(200L);
        ofInt.addListener(new b());
        ofInt.start();
        ofInt.setAutoCancel(true);
        l lVar = this.f91263f;
        if (lVar != null) {
            lVar.b(this);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.AbstractC9510a
    public final void onRecycle() {
        super.onRecycle();
        this.itemView.setScrollX(0);
        this.f91265h = a.CLOSED;
    }
}
