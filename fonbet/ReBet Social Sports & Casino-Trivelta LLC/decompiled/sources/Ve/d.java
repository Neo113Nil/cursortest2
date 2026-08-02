package Ve;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bg.k;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import od.AbstractC5886l;
import og.AbstractC5892d;
import og.i;
import og.j;
import og.m;
import og.p;

/* loaded from: classes4.dex */
public final class d extends Ve.e {

    /* renamed from: c, reason: collision with root package name */
    public final ud.c f12872c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f12873d;

    /* renamed from: e, reason: collision with root package name */
    public final k.b f12874e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SalesIQChat.Media.Status.values().length];
            try {
                iArr[SalesIQChat.Media.Status.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SalesIQChat.Media.Status.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SalesIQChat.Media.Status.MISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m31invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m31invoke() {
            d.this.f12872c.f66272f.setVisibility(0);
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m32invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m32invoke() {
            d.this.f12872c.f66272f.setVisibility(8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(ud.c binding, Function1 isExpanded, k.b clickListener) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(isExpanded, "isExpanded");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        ConstraintLayout b10 = binding.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
        this.f12872c = binding;
        this.f12873d = isExpanded;
        this.f12874e = clickListener;
        this.f12882a.setOnClickListener(new View.OnClickListener() { // from class: Ve.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.k(d.this, view);
            }
        });
    }

    public static final void k(d this$0, View view) {
        SalesIQChat salesIQChat;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SalesIQChat salesIQChat2 = this$0.f12883b;
        if ((salesIQChat2 != null && salesIQChat2.getStatus() == 4) || ((salesIQChat = this$0.f12883b) != null && salesIQChat.getStatus() == 3)) {
            this$0.f12874e.a(this$0.f12883b);
            if (this$0.f12872c.f66272f.getVisibility() == 8) {
                this$0.p();
                return;
            } else {
                this$0.m();
                return;
            }
        }
        if (Td.e.m0()) {
            String K10 = Td.e.K();
            SalesIQChat salesIQChat3 = this$0.f12883b;
            if (Intrinsics.areEqual(K10, salesIQChat3 != null ? salesIQChat3.getVisitorid() : null)) {
                Td.e.r0(this$0.d());
            }
        }
    }

    public static final void n(View this_collapse, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this_collapse, "$this_collapse");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this_collapse.getLayoutParams();
        layoutParams.height = intValue;
        this_collapse.setLayoutParams(layoutParams);
    }

    public static final void q(View this_expand, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this_expand, "$this_expand");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this_expand.getLayoutParams();
        layoutParams.height = intValue;
        this_expand.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        if (r3.length() > 0) goto L38;
     */
    @Override // Ve.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(SalesIQChat salesIQChat) {
        Object m147constructorimpl;
        String i10;
        SalesIQChat.Extras.a aVar;
        String str;
        String u10;
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        this.f12883b = salesIQChat;
        String str2 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            ConstraintLayout b10 = this.f12872c.b();
            Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
            p.v(b10, AbstractC5892d.h(d(), Integer.valueOf(AbstractC5886l.f59699B1), 0.0f, 2, null), null, null, false, 0, 30, null);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        ud.c cVar = this.f12872c;
        SalesIQChat.Media media = salesIQChat.getMedia();
        if ((media != null ? media.status : null) != SalesIQChat.Media.Status.CANCELLED) {
            ImageView siqUserDp = cVar.f66279m;
            Intrinsics.checkNotNullExpressionValue(siqUserDp, "siqUserDp");
            e(siqUserDp);
            cVar.f66279m.setBackgroundColor(0);
            ImageView siqUserDp2 = cVar.f66279m;
            Intrinsics.checkNotNullExpressionValue(siqUserDp2, "siqUserDp");
            siqUserDp2.setPadding(0, 0, 0, 0);
        } else {
            ImageView siqUserDp3 = cVar.f66279m;
            Intrinsics.checkNotNullExpressionValue(siqUserDp3, "siqUserDp");
            int b11 = og.k.b(10);
            siqUserDp3.setPadding(b11, b11, b11, b11);
            cVar.f66279m.setBackground(AbstractC5892d.c(d(), od.p.f59954C0, AbstractC5892d.h(d(), Integer.valueOf(AbstractC5886l.f59845j2), 0.0f, 2, null)));
            ImageView siqUserDp4 = cVar.f66279m;
            Intrinsics.checkNotNullExpressionValue(siqUserDp4, "siqUserDp");
            wd.d.K(siqUserDp4, Integer.valueOf(od.p.f60154r), null, false, true, null, null, null, null, null, false, null, 4076, null);
        }
        if (!Td.e.H()) {
            SalesIQChat.Extras extras = salesIQChat.getExtras();
            if (extras != null && (aVar = extras.attributes) != null && (str = aVar.additionalInfo) != null) {
                Intrinsics.checkNotNull(str);
                i10 = m.d(str);
            }
            SalesIQChat.Extras extras2 = salesIQChat.getExtras();
            if (extras2 != null) {
                extras2.getCall();
            }
            Pe.b g02 = Te.a.g0();
            if (g02 != null) {
                i10 = g02.i();
                if (i10 != null) {
                }
            }
        }
        i10 = null;
        MobilistenTextView mobilistenTextView = cVar.f66276j;
        if (salesIQChat.getStatus() != 1 && salesIQChat.getStatus() != 2 && salesIQChat.getStatus() != 4) {
            i10 = Td.e.B();
        } else if (i10 == null) {
            String attenderName = salesIQChat.getAttenderName();
            if (attenderName != null && (u10 = i.u(attenderName)) != null) {
                if (!Td.e.f11456a.G()) {
                    u10 = null;
                }
                if (u10 != null && u10.length() > 0) {
                    str2 = u10;
                }
            }
            i10 = str2 == null ? Td.e.B() : str2;
        }
        mobilistenTextView.setText(new Message.b(i10, true).a());
        cVar.f66275i.setText(salesIQChat.getLastMessageContentForCall(d()));
        MobilistenTextView siqLastModifiedTime = cVar.f66278l;
        Intrinsics.checkNotNullExpressionValue(siqLastModifiedTime, "siqLastModifiedTime");
        g(siqLastModifiedTime);
        s();
        u();
        t();
        if (((Boolean) this.f12873d.invoke(salesIQChat)).booleanValue()) {
            p();
        } else {
            m();
        }
    }

    public final void m() {
        this.f12872c.f66272f.setVisibility(8);
        ConstraintLayout b10 = this.f12872c.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
        o(b10, this.f12872c.b().getMeasuredHeight(), 200L, new b(), new c());
    }

    public final void o(final View view, int i10, long j10, Function0 doBeforeAnimationStart, Function0 doOnEnd) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(doBeforeAnimationStart, "doBeforeAnimationStart");
        Intrinsics.checkNotNullParameter(doOnEnd, "doOnEnd");
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            doBeforeAnimationStart.invoke();
            ViewParent parent2 = view.getParent();
            Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) parent2).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("height", i10, measuredHeight));
            ofPropertyValuesHolder.setDuration(j10);
            ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ve.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d.n(view, valueAnimator);
                }
            });
            Intrinsics.checkNotNull(ofPropertyValuesHolder);
            ofPropertyValuesHolder.addListener(new C0267d(doOnEnd, view, this));
            ofPropertyValuesHolder.start();
        }
    }

    public final void p() {
        this.f12872c.f66272f.setVisibility(0);
        ConstraintLayout b10 = this.f12872c.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
        r(b10, 150L);
    }

    public final void r(final View view, long j10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getParent() != null) {
            int measuredHeight = view.getMeasuredHeight();
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = view.getMeasuredHeight();
            ViewParent parent2 = view.getParent();
            Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) parent2).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("height", measuredHeight, measuredHeight2));
            ofPropertyValuesHolder.setDuration(j10);
            ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ve.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d.q(view, valueAnimator);
                }
            });
            Intrinsics.checkNotNull(ofPropertyValuesHolder);
            ofPropertyValuesHolder.addListener(new e(view, this));
            ofPropertyValuesHolder.start();
        }
    }

    public final void s() {
        SalesIQChat salesIQChat;
        int i10;
        Integer valueOf;
        SalesIQChat.Media media;
        SalesIQChat.Media media2;
        ImageView imageView = this.f12872c.f66274h;
        SalesIQChat salesIQChat2 = this.f12883b;
        if ((salesIQChat2 == null || salesIQChat2.getStatus() != 4) && ((salesIQChat = this.f12883b) == null || salesIQChat.getStatus() != 3)) {
            SalesIQChat salesIQChat3 = this.f12883b;
            if (salesIQChat3 != null && salesIQChat3.canShowQueue()) {
                SalesIQChat salesIQChat4 = this.f12883b;
                if (i.k(salesIQChat4 != null ? Integer.valueOf(salesIQChat4.getQueuePosition()) : null) > 0) {
                    i10 = od.p.f60003M;
                    valueOf = Integer.valueOf(i10);
                }
            }
            i10 = od.p.f59998L;
            valueOf = Integer.valueOf(i10);
        } else {
            SalesIQChat salesIQChat5 = this.f12883b;
            if (salesIQChat5 != null && salesIQChat5.getStatus() == 3) {
                SalesIQChat salesIQChat6 = this.f12883b;
                if (((salesIQChat6 == null || (media2 = salesIQChat6.getMedia()) == null) ? null : media2.status) != SalesIQChat.Media.Status.CANCELLED) {
                    valueOf = Integer.valueOf(od.p.f59963E);
                }
            }
            SalesIQChat salesIQChat7 = this.f12883b;
            SalesIQChat.Media.Status status = (salesIQChat7 == null || (media = salesIQChat7.getMedia()) == null) ? null : media.status;
            int i11 = status == null ? -1 : a.$EnumSwitchMapping$0[status.ordinal()];
            valueOf = i11 != 1 ? (i11 == 2 || i11 == 3) ? Integer.valueOf(od.p.f59963E) : null : Integer.valueOf(od.p.f59993K);
        }
        imageView.setImageDrawable(valueOf != null ? androidx.core.content.res.k.f(d().getResources(), valueOf.intValue(), d().getTheme()) : null);
    }

    public final void t() {
        Long chatLastInitiatedTime;
        MobilistenTextView mobilistenTextView = this.f12872c.f66269c;
        SalesIQChat salesIQChat = this.f12883b;
        mobilistenTextView.setText((salesIQChat == null || (chatLastInitiatedTime = salesIQChat.getChatLastInitiatedTime()) == null) ? null : j.b(chatLastInitiatedTime.longValue(), "dd/MM/yyyy, HH:mm", "dd/MM/yyyy, hh:mm aa"));
    }

    public final void u() {
        MobilistenTextView mobilistenTextView = this.f12872c.f66270d;
        SalesIQChat salesIQChat = this.f12883b;
        mobilistenTextView.setText(salesIQChat != null ? salesIQChat.getDepartmentName() : null);
    }

    /* renamed from: Ve.d$d, reason: collision with other inner class name */
    public static final class C0267d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f12877a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f12878b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f12879c;

        public C0267d(Function0 function0, View view, d dVar) {
            this.f12877a = function0;
            this.f12878b = view;
            this.f12879c = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12877a.invoke();
            this.f12878b.getLayoutParams().height = -2;
            this.f12878b.requestLayout();
            Context context = this.f12878b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int h10 = AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59841i3), 0.0f, 2, null);
            this.f12879c.f12872c.f66275i.setTextColor(h10);
            this.f12879c.f12872c.f66270d.setTextColor(h10);
            this.f12879c.f12872c.f66269c.setTextColor(h10);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f12880a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f12881b;

        public e(View view, d dVar) {
            this.f12880a = view;
            this.f12881b = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12880a.getLayoutParams().height = -2;
            this.f12880a.requestLayout();
            Context context = this.f12880a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int h10 = AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59836h3), 0.0f, 2, null);
            this.f12881b.f12872c.f66275i.setTextColor(h10);
            this.f12881b.f12872c.f66270d.setTextColor(h10);
            this.f12881b.f12872c.f66269c.setTextColor(h10);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
