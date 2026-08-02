package ag;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import ag.H;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.AbstractC2082d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.flexbox.FlexboxLayout;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.C3937f;
import com.zoho.livechat.android.utils.C3948q;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import n.AbstractC5596a;
import od.AbstractC5886l;
import og.AbstractC5892d;
import og.AbstractC5893e;
import okhttp3.HttpUrl;
import rd.C6218a;
import td.C6461a;
import wf.EnumC6745a;
import xe.C6822a;
import zf.C6963d;
import zf.C6966g;

/* loaded from: classes4.dex */
public abstract class H extends RecyclerView.F {

    /* renamed from: A, reason: collision with root package name */
    public SalesIQChat f15226A;

    /* renamed from: B, reason: collision with root package name */
    public Message f15227B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15228C;

    /* renamed from: D, reason: collision with root package name */
    public ud.n f15229D;

    /* renamed from: E, reason: collision with root package name */
    public final Lazy f15230E;

    /* renamed from: F, reason: collision with root package name */
    public final Lazy f15231F;

    /* renamed from: G, reason: collision with root package name */
    public final Lazy f15232G;

    /* renamed from: H, reason: collision with root package name */
    public final Lazy f15233H;

    /* renamed from: I, reason: collision with root package name */
    public ValueAnimator f15234I;

    /* renamed from: J, reason: collision with root package name */
    public ValueAnimator f15235J;

    /* renamed from: K, reason: collision with root package name */
    public Drawable f15236K;

    /* renamed from: L, reason: collision with root package name */
    public AppCompatImageView f15237L;

    /* renamed from: O, reason: collision with root package name */
    public final Lazy f15238O;

    /* renamed from: P, reason: collision with root package name */
    public final Lazy f15239P;

    /* renamed from: R, reason: collision with root package name */
    public final Lazy f15240R;

    /* renamed from: T, reason: collision with root package name */
    public final Lazy f15241T;

    /* renamed from: V, reason: collision with root package name */
    public final Lazy f15242V;

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f15243W;

    /* renamed from: X, reason: collision with root package name */
    public androidx.constraintlayout.widget.d f15244X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f15245Y;

    /* renamed from: Z, reason: collision with root package name */
    public View f15246Z;

    /* renamed from: a, reason: collision with root package name */
    public final cg.e f15247a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f15248b;

    /* renamed from: b1, reason: collision with root package name */
    public AppCompatImageView f15249b1;

    /* renamed from: c, reason: collision with root package name */
    public final List f15250c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15251d;

    /* renamed from: e, reason: collision with root package name */
    public final List f15252e;

    /* renamed from: f, reason: collision with root package name */
    public final List f15253f;

    /* renamed from: g, reason: collision with root package name */
    public int f15254g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f15255h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f15256i;

    /* renamed from: j, reason: collision with root package name */
    public final Lazy f15257j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f15258k;

    /* renamed from: l, reason: collision with root package name */
    public final Lazy f15259l;

    /* renamed from: m, reason: collision with root package name */
    public final Lazy f15260m;

    /* renamed from: n, reason: collision with root package name */
    public final Lazy f15261n;

    /* renamed from: o, reason: collision with root package name */
    public final Lazy f15262o;

    /* renamed from: p, reason: collision with root package name */
    public final Lazy f15263p;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView f15264q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f15265r;

    /* renamed from: s, reason: collision with root package name */
    public final Lazy f15266s;

    /* renamed from: t, reason: collision with root package name */
    public FlexboxLayout f15267t;

    /* renamed from: u, reason: collision with root package name */
    public cg.f f15268u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup f15269v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f15270w;

    /* renamed from: x, reason: collision with root package name */
    public final Lazy f15271x;

    /* renamed from: y, reason: collision with root package name */
    public final Lazy f15272y;

    /* renamed from: z, reason: collision with root package name */
    public final Lazy f15273z;

    /* renamed from: g1, reason: collision with root package name */
    public static final C1949l f15218g1 = new C1949l(null);

    /* renamed from: p1, reason: collision with root package name */
    public static final Lazy f15220p1 = LazyKt.lazy(C1945g.f15306d);

    /* renamed from: x1, reason: collision with root package name */
    public static final Lazy f15222x1 = LazyKt.lazy(C1944f.f15305d);

    /* renamed from: y1, reason: collision with root package name */
    public static final Lazy f15224y1 = LazyKt.lazy(C1942d.f15303d);

    /* renamed from: T1, reason: collision with root package name */
    public static final Lazy f15215T1 = LazyKt.lazy(C1940b.f15301d);

    /* renamed from: V1, reason: collision with root package name */
    public static final Lazy f15216V1 = LazyKt.lazy(C1946i.f15308d);

    /* renamed from: b2, reason: collision with root package name */
    public static final Lazy f15217b2 = LazyKt.lazy(h.f15307d);

    /* renamed from: g2, reason: collision with root package name */
    public static final Lazy f15219g2 = LazyKt.lazy(C1943e.f15304d);

    /* renamed from: p2, reason: collision with root package name */
    public static final Lazy f15221p2 = LazyKt.lazy(C1941c.f15302d);

    /* renamed from: x2, reason: collision with root package name */
    public static final Lazy f15223x2 = LazyKt.lazy(C1947j.f15309d);

    /* renamed from: y2, reason: collision with root package name */
    public static final Lazy f15225y2 = LazyKt.lazy(C1948k.f15310d);

    /* renamed from: P4, reason: collision with root package name */
    public static final List f15214P4 = CollectionsKt.listOf((Object[]) new Message.g[]{Message.g.InfoMessage, Message.g.Feedback, Message.g.InlineForm, Message.g.LoadMore, Message.g.RequestLog});

    public static final class A implements L4.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15275b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15276c;

        public A(int i10, String str) {
            this.f15275b = i10;
            this.f15276c = str;
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, M4.j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
            ImageView Z10;
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            if (!Intrinsics.areEqual(model, this.f15276c) || (Z10 = H.this.Z()) == null) {
                return true;
            }
            Z10.setImageDrawable(resource);
            return true;
        }

        @Override // L4.g
        public boolean k(com.bumptech.glide.load.engine.q qVar, Object obj, M4.j target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            ImageView Z10 = H.this.Z();
            if (Z10 == null) {
                return true;
            }
            Z10.setImageResource(this.f15275b);
            return true;
        }
    }

    public static final class B extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15277d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ H f15278e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(View view, H h10) {
            super(0);
            this.f15277d = view;
            this.f15278e = h10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConstraintLayout invoke() {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f15277d.findViewById(od.q.f60505e1);
            return constraintLayout == null ? new ConstraintLayout(this.f15278e.d0()) : constraintLayout;
        }
    }

    public static final class C extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15279d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(View view) {
            super(0);
            this.f15279d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) this.f15279d.findViewById(od.q.f60603n6);
        }
    }

    public static final class D extends Lambda implements Function0 {
        public D() {
            super(0);
        }

        public static final boolean c(H this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            cg.e o02 = this$0.o0();
            if (o02 == null) {
                return true;
            }
            o02.N(this$0.q0());
            return true;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View.OnLongClickListener invoke() {
            final H h10 = H.this;
            return new View.OnLongClickListener() { // from class: ag.L
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean c10;
                    c10 = H.D.c(H.this, view);
                    return c10;
                }
            };
        }
    }

    public static final class E extends Lambda implements Function0 {
        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            Drawable c10 = AbstractC5892d.c(H.this.d0(), od.p.f59968F, AbstractC5892d.h(H.this.d0(), Integer.valueOf(AbstractC5886l.f59704C2), 0.0f, 2, null));
            Intrinsics.checkNotNull(c10);
            return c10;
        }
    }

    public static final class F extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15282d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(View view) {
            super(0);
            this.f15282d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MobilistenTextView invoke() {
            return (MobilistenTextView) this.f15282d.findViewById(od.q.f60684v7);
        }
    }

    public static final class G extends Lambda implements Function0 {
        public G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            Drawable c10 = AbstractC5892d.c(H.this.d0(), od.p.f59978H, AbstractC5892d.h(H.this.d0(), Integer.valueOf(AbstractC5886l.f59708D2), 0.0f, 2, null));
            Intrinsics.checkNotNull(c10);
            return c10;
        }
    }

    /* renamed from: ag.H$H, reason: collision with other inner class name */
    public static final class C0324H extends Lambda implements Function0 {
        public C0324H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            Drawable c10 = AbstractC5892d.c(H.this.d0(), od.p.f59973G, AbstractC5892d.h(H.this.d0(), Integer.valueOf(AbstractC5886l.f59712E2), 0.0f, 2, null));
            Intrinsics.checkNotNull(c10);
            return c10;
        }
    }

    public static final class I extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(View view) {
            super(0);
            this.f15285d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f15285d.findViewById(od.q.f60694w7);
        }
    }

    public static final class J extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15286d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(View view) {
            super(0);
            this.f15286d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RelativeLayout invoke() {
            return (RelativeLayout) this.f15286d.findViewById(od.q.f60714y7);
        }
    }

    public static final class K extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15287d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ H f15288e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(View view, H h10) {
            super(0);
            this.f15287d = view;
            this.f15288e = h10;
        }

        public static final void c(H this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            cg.e o02 = this$0.o0();
            if (o02 != null) {
                o02.a(this$0.q0(), this$0.getBindingAdapterPosition());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            View findViewById = this.f15287d.findViewById(od.q.f60593m6);
            final H h10 = this.f15288e;
            ImageView imageView = (ImageView) findViewById;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ag.M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    H.K.c(H.this, view);
                }
            });
            return imageView;
        }
    }

    public static final class L extends RecyclerView.p {
        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int m02 = parent.m0(view);
            if (m02 != 0) {
                if (MobilistenUtil.m()) {
                    outRect.right = og.k.b(4);
                } else {
                    outRect.left = og.k.b(4);
                }
            }
            if (m02 == state.b() - 1) {
                if (MobilistenUtil.m()) {
                    outRect.left = og.k.b(16);
                } else {
                    outRect.right = og.k.b(16);
                }
            }
        }
    }

    public static final class M extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15289d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ H f15290e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(View view, H h10) {
            super(0);
            this.f15289d = view;
            this.f15290e = h10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            TextView textView = (TextView) this.f15289d.findViewById(od.q.f60613o6);
            if (textView == null) {
                return null;
            }
            this.f15290e.R1(textView);
            return textView;
        }
    }

    public static final class N extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15291d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(View view) {
            super(0);
            this.f15291d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Group invoke() {
            return (Group) this.f15291d.findViewById(od.q.f60491c9);
        }
    }

    public static final class O extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15292d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O(View view) {
            super(0);
            this.f15292d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MobilistenTextView invoke() {
            MobilistenTextView mobilistenTextView = (MobilistenTextView) this.f15292d.findViewById(od.q.f60605n8);
            mobilistenTextView.setTypeface(C6218a.C());
            Intrinsics.checkNotNull(mobilistenTextView);
            int b10 = og.k.b(32);
            Context context = mobilistenTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            og.p.d(mobilistenTextView, b10, Integer.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59796Z2), 0.0f, 2, null)), 0, null, false, 28, null);
            mobilistenTextView.setOnLongClickListener(null);
            return mobilistenTextView;
        }
    }

    public static final class P extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15293d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(View view) {
            super(0);
            this.f15293d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) this.f15293d.findViewById(od.q.f60623p6);
        }
    }

    public static final class Q extends Lambda implements Function0 {
        public Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return androidx.core.content.res.k.f(H.this.d0().getResources(), od.p.f60104h, H.this.d0().getTheme());
        }
    }

    /* renamed from: ag.H$a, reason: case insensitive filesystem */
    public final class C1939a extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public final List f15295a;

        /* renamed from: ag.H$a$a, reason: collision with other inner class name */
        public final class C0325a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15297a;

            /* renamed from: b, reason: collision with root package name */
            public RelativeLayout f15298b;

            /* renamed from: c, reason: collision with root package name */
            public TextView f15299c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C1939a f15300d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0325a(C1939a c1939a, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.f15300d = c1939a;
                View findViewById = itemView.findViewById(od.q.f60523f8);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                LinearLayout linearLayout = (LinearLayout) findViewById;
                this.f15297a = linearLayout;
                linearLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, AbstractC5892d.h(H.this.d0(), Integer.valueOf(AbstractC5886l.f59803b0), 0.0f, 2, null), H.a1(), og.k.a(1.5f), AbstractC5892d.h(H.this.d0(), Integer.valueOf(AbstractC5886l.f59808c0), 0.0f, 2, null)));
                View findViewById2 = itemView.findViewById(od.q.f60545h8);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                this.f15298b = (RelativeLayout) findViewById2;
                View findViewById3 = itemView.findViewById(od.q.f60534g8);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                this.f15299c = (TextView) findViewById3;
            }

            public final TextView b() {
                return this.f15299c;
            }

            public final RelativeLayout c() {
                return this.f15298b;
            }
        }

        public C1939a(List list) {
            this.f15295a = list;
        }

        public static final void e(int i10, H this$0, String str, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Ye.d.o(De.a.IsCampaignSuggestionsSubscribed, i10 == 0);
            cg.f fVar = this$0.f15268u;
            if (fVar != null) {
                fVar.L(str);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0325a holder, final int i10) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            List list = this.f15295a;
            final String str = null;
            Message.Meta.a aVar = list != null ? (Message.Meta.a) list.get(i10) : null;
            if ((aVar != null ? aVar.a() : null) != null && aVar.a().intValue() > 0) {
                str = H.this.d0().getString(aVar.a().intValue());
            } else if (aVar != null) {
                str = aVar.b();
            }
            holder.b().setText(str);
            RelativeLayout c10 = holder.c();
            final H h10 = H.this;
            c10.setOnClickListener(new View.OnClickListener() { // from class: ag.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    H.C1939a.e(i10, h10, str, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0325a onCreateViewHolder(ViewGroup parent, int i10) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = H.this.p0().inflate(od.r.f60750M, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new C0325a(this, inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15295a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    /* renamed from: ag.H$b, reason: case insensitive filesystem */
    public static final class C1940b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1940b f15301d = new C1940b();

        public C1940b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(og.k.b(10));
        }
    }

    /* renamed from: ag.H$c, reason: case insensitive filesystem */
    public static final class C1941c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1941c f15302d = new C1941c();

        public C1941c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(H.U0());
        }
    }

    /* renamed from: ag.H$d, reason: case insensitive filesystem */
    public static final class C1942d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1942d f15303d = new C1942d();

        public C1942d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(og.k.b(12));
        }
    }

    /* renamed from: ag.H$e, reason: case insensitive filesystem */
    public static final class C1943e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1943e f15304d = new C1943e();

        public C1943e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(H.W0());
        }
    }

    /* renamed from: ag.H$f, reason: case insensitive filesystem */
    public static final class C1944f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1944f f15305d = new C1944f();

        public C1944f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(og.k.b(16));
        }
    }

    /* renamed from: ag.H$g, reason: case insensitive filesystem */
    public static final class C1945g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1945g f15306d = new C1945g();

        public C1945g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(og.k.b(20));
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f15307d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(H.Z0());
        }
    }

    /* renamed from: ag.H$i, reason: case insensitive filesystem */
    public static final class C1946i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1946i f15308d = new C1946i();

        public C1946i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(og.k.b(8));
        }
    }

    /* renamed from: ag.H$j, reason: case insensitive filesystem */
    public static final class C1947j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1947j f15309d = new C1947j();

        public C1947j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final float[] invoke() {
            return new float[]{H.V0(), H.V0(), H.V0(), H.V0(), 0.0f, 0.0f, 0.0f, 0.0f};
        }
    }

    /* renamed from: ag.H$k, reason: case insensitive filesystem */
    public static final class C1948k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1948k f15310d = new C1948k();

        public C1948k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final float[] invoke() {
            return new float[]{H.X0(), H.X0(), H.X0(), H.X0(), 0.0f, 0.0f, 0.0f, 0.0f};
        }
    }

    /* renamed from: ag.H$l, reason: case insensitive filesystem */
    public static final class C1949l {
        public /* synthetic */ C1949l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float[] b() {
            return (float[]) H.f15223x2.getValue();
        }

        public final float[] c() {
            return (float[]) H.f15225y2.getValue();
        }

        public final float[] d(float f10) {
            return MobilistenUtil.m() ? new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10} : new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f};
        }

        public final int e() {
            return ((Number) H.f15215T1.getValue()).intValue();
        }

        public final float f() {
            return ((Number) H.f15221p2.getValue()).floatValue();
        }

        public final int g() {
            return ((Number) H.f15224y1.getValue()).intValue();
        }

        public final float h() {
            return ((Number) H.f15219g2.getValue()).floatValue();
        }

        public final int i() {
            return ((Number) H.f15222x1.getValue()).intValue();
        }

        public final int j() {
            return ((Number) H.f15220p1.getValue()).intValue();
        }

        public final float k() {
            return ((Number) H.f15217b2.getValue()).floatValue();
        }

        public final int l() {
            return ((Number) H.f15216V1.getValue()).intValue();
        }

        public C1949l() {
        }
    }

    /* renamed from: ag.H$m, reason: case insensitive filesystem */
    public final class C1950m extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public List f15311a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f15312b;

        /* renamed from: ag.H$m$a */
        public final class a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15313a;

            /* renamed from: b, reason: collision with root package name */
            public LinearLayout f15314b;

            /* renamed from: c, reason: collision with root package name */
            public TextView f15315c;

            /* renamed from: d, reason: collision with root package name */
            public View f15316d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1950m f15317e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1950m c1950m, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.f15317e = c1950m;
                View findViewById = itemView.findViewById(od.q.f60591m4);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                LinearLayout linearLayout = (LinearLayout) findViewById;
                this.f15313a = linearLayout;
                linearLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, AbstractC5892d.h(c1950m.f15312b.d0(), Integer.valueOf(AbstractC5886l.f59827g), 0.0f, 2, null), H.a1(), og.k.a(1.5f), AbstractC5892d.h(c1950m.f15312b.d0(), Integer.valueOf(AbstractC5886l.f59757Q), 0.0f, 2, null)));
                View findViewById2 = itemView.findViewById(od.q.f60621p4);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                this.f15314b = (LinearLayout) findViewById2;
                View findViewById3 = itemView.findViewById(od.q.f60611o4);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                this.f15315c = (TextView) findViewById3;
                View findViewById4 = itemView.findViewById(od.q.f60601n4);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                this.f15316d = findViewById4;
            }

            public final View b() {
                return this.f15316d;
            }

            public final TextView c() {
                return this.f15315c;
            }

            public final LinearLayout d() {
                return this.f15314b;
            }
        }

        public C1950m(H h10, List suggestions) {
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            this.f15312b = h10;
            this.f15311a = suggestions;
        }

        public static final void e(H this$0, Channel.Department department, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            cg.f fVar = this$0.f15268u;
            if (fVar != null) {
                fVar.K(department);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i10) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            List list = this.f15311a;
            final Channel.Department department = list != null ? (Channel.Department) list.get(i10) : null;
            String unescapeHtml = LiveChatUtil.unescapeHtml(department != null ? department.getName() : null);
            if (unescapeHtml != null) {
                holder.c().setText(unescapeHtml);
            } else {
                holder.c().setText(department != null ? department.getName() : null);
            }
            View b10 = holder.b();
            GradientDrawable gradientDrawable = new GradientDrawable();
            H h10 = this.f15312b;
            gradientDrawable.setShape(1);
            if (department != null ? Intrinsics.areEqual(department.isOnline(), Boolean.TRUE) : false) {
                gradientDrawable.setColor(AbstractC5892d.h(h10.d0(), Integer.valueOf(AbstractC5886l.f59823f0), 0.0f, 2, null));
            } else {
                gradientDrawable.setColor(AbstractC5892d.h(h10.d0(), Integer.valueOf(AbstractC5886l.f59833h0), 0.0f, 2, null));
            }
            AbstractC2082d0.p0(b10, gradientDrawable);
            LinearLayout d10 = holder.d();
            final H h11 = this.f15312b;
            d10.setOnClickListener(new View.OnClickListener() { // from class: ag.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    H.C1950m.e(H.this, department, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i10) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = this.f15312b.p0().inflate(od.r.f60756P, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new a(this, inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15311a;
            return og.i.k(list != null ? Integer.valueOf(list.size()) : null);
        }
    }

    /* renamed from: ag.H$n, reason: case insensitive filesystem */
    public final class C1951n extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public List f15318a;

        /* renamed from: ag.H$n$a */
        public final class a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public LinearLayout f15320a;

            /* renamed from: b, reason: collision with root package name */
            public RelativeLayout f15321b;

            /* renamed from: c, reason: collision with root package name */
            public TextView f15322c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C1951n f15323d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1951n c1951n, View itemView) {
                super(itemView);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                this.f15323d = c1951n;
                View findViewById = itemView.findViewById(od.q.f60523f8);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                LinearLayout linearLayout = (LinearLayout) findViewById;
                this.f15320a = linearLayout;
                linearLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, AbstractC5892d.h(H.this.d0(), Integer.valueOf(AbstractC5886l.f59803b0), 0.0f, 2, null), H.a1(), og.k.a(1.5f), AbstractC5892d.h(H.this.d0(), Integer.valueOf(AbstractC5886l.f59808c0), 0.0f, 2, null)));
                View findViewById2 = itemView.findViewById(od.q.f60545h8);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                this.f15321b = (RelativeLayout) findViewById2;
                View findViewById3 = itemView.findViewById(od.q.f60534g8);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                this.f15322c = (TextView) findViewById3;
            }

            public final TextView b() {
                return this.f15322c;
            }

            public final RelativeLayout c() {
                return this.f15321b;
            }
        }

        public C1951n(List list) {
            this.f15318a = list;
        }

        public static final void e(H this$0, String text, String id2, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(text, "$text");
            Intrinsics.checkNotNullParameter(id2, "$id");
            cg.f fVar = this$0.f15268u;
            if (fVar != null) {
                fVar.v(this$0.f15264q, text, Message.g.WidgetSuggestions, text, id2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i10) {
            final String valueOf;
            final String str;
            Intrinsics.checkNotNullParameter(holder, "holder");
            List list = this.f15318a;
            Object obj = list != null ? list.get(i10) : null;
            if (obj instanceof com.google.gson.internal.g) {
                com.google.gson.internal.g gVar = (com.google.gson.internal.g) obj;
                str = String.valueOf(gVar.get(StackTraceHelper.ID_KEY));
                valueOf = String.valueOf(gVar.get("text"));
            } else {
                valueOf = String.valueOf(obj);
                str = "";
            }
            holder.b().setText(valueOf);
            RelativeLayout c10 = holder.c();
            final H h10 = H.this;
            c10.setOnClickListener(new View.OnClickListener() { // from class: ag.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    H.C1951n.e(H.this, valueOf, str, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i10) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = H.this.p0().inflate(od.r.f60750M, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new a(this, inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            List list = this.f15318a;
            return og.i.k(list != null ? Integer.valueOf(list.size()) : null);
        }
    }

    /* renamed from: ag.H$o, reason: case insensitive filesystem */
    public /* synthetic */ class C1952o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Message.f.values().length];
            try {
                iArr[Message.f.Sent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Message.f.WaitingForWms.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Message.f.Sending.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Message.f.Uploading.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Message.g.values().length];
            try {
                iArr2[Message.g.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Message.g.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Message.g.Audio.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Message.g.File.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Message.g.Article.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: ag.H$p, reason: case insensitive filesystem */
    public static final class C1953p extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f15325b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f15326c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f15327d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ImageView f15328e;

        /* renamed from: ag.H$p$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ H f15329a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ImageView f15330b;

            public a(H h10, ImageView imageView) {
                this.f15329a = h10;
                this.f15330b = imageView;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f15329a.E0().setAlpha(255);
                ImageView imageView = this.f15330b;
                if (imageView != null) {
                    imageView.setContentDescription("Message read");
                }
                this.f15329a.I1(null);
                this.f15329a.H1(null);
                this.f15329a.J1(null);
            }
        }

        public C1953p(float f10, float f11, int i10, ImageView imageView) {
            this.f15325b = f10;
            this.f15326c = f11;
            this.f15327d = i10;
            this.f15328e = imageView;
        }

        public static final void b(H this$0, ImageView imageView, ValueAnimator fadeInAnimation) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(fadeInAnimation, "fadeInAnimation");
            Object animatedValue = fadeInAnimation.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Drawable i02 = this$0.i0();
            if (i02 != null) {
                i02.setAlpha((int) (floatValue * 255));
            }
            if (imageView != null) {
                imageView.setImageDrawable(this$0.i0());
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            H.this.H1(ValueAnimator.ofFloat(this.f15325b, this.f15326c));
            ValueAnimator g02 = H.this.g0();
            if (g02 != null) {
                g02.setDuration(this.f15327d);
            }
            ValueAnimator g03 = H.this.g0();
            if (g03 != null) {
                final H h10 = H.this;
                final ImageView imageView = this.f15328e;
                g03.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.K
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        H.C1953p.b(H.this, imageView, valueAnimator);
                    }
                });
            }
            ValueAnimator g04 = H.this.g0();
            if (g04 != null) {
                g04.addListener(new a(H.this, this.f15328e));
            }
            ValueAnimator g05 = H.this.g0();
            if (g05 != null) {
                g05.start();
            }
        }
    }

    /* renamed from: ag.H$q, reason: case insensitive filesystem */
    public static final class C1954q extends Lambda implements Function0 {
        public C1954q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return androidx.core.content.res.k.f(H.this.d0().getResources(), od.p.f60139o, H.this.d0().getTheme());
        }
    }

    public static final class r extends Lambda implements Function0 {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return androidx.core.content.res.k.f(H.this.r0().getResources(), od.p.f60178v3, H.this.d0().getTheme());
        }
    }

    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return androidx.core.content.res.k.f(H.this.d0().getResources(), od.p.f59985I1, H.this.d0().getTheme());
        }
    }

    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return androidx.core.content.res.k.f(H.this.d0().getResources(), od.p.f59970F1, H.this.d0().getTheme());
        }
    }

    public static final class u extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15335d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(View view) {
            super(0);
            this.f15335d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) this.f15335d.findViewById(od.q.f60674u7);
        }
    }

    public static final class v extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15336d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(View view) {
            super(0);
            this.f15336d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) this.f15336d.findViewById(od.q.f60563j6);
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            return androidx.core.content.res.k.f(H.this.d0().getResources(), od.p.f59953C, H.this.d0().getTheme());
        }
    }

    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke() {
            return LayoutInflater.from(H.this.d0());
        }
    }

    public static final class z extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f15341n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Message.Extras f15342o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Message.Attachment f15343p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ImageView f15344q;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f15345n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ImageView f15346o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f15347p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImageView imageView, Ref.ObjectRef objectRef, Continuation continuation) {
                super(2, continuation);
                this.f15346o = imageView;
                this.f15347p = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f15346o, this.f15347p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f15345n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                wd.d.K(this.f15346o, this.f15347p.element, null, false, false, null, null, null, null, null, false, null, 4092, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Message.Extras extras, Message.Attachment attachment, ImageView imageView, Continuation continuation) {
            super(2, continuation);
            this.f15342o = extras;
            this.f15343p = attachment;
            this.f15344q = imageView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new z(this.f15342o, this.f15343p, this.f15344q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((z) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v12, types: [T, java.io.File] */
        /* JADX WARN: Type inference failed for: r1v7, types: [T, byte[]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String localFilePath;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f15341n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Message.Extras extras = this.f15342o;
                if (extras != null && (localFilePath = extras.getLocalFilePath()) != null && new File(localFilePath).exists()) {
                    objectRef.element = new File(this.f15342o.getLocalFilePath());
                } else if (this.f15343p.getBlurImage() != null) {
                    objectRef.element = Base64.decode(this.f15343p.getBlurImage(), 0);
                } else {
                    this.f15344q.setImageDrawable(null);
                }
                if (objectRef.element != 0) {
                    Ph.M0 c10 = C1452g0.c();
                    a aVar = new a(this.f15344q, objectRef, null);
                    this.f15341n = 1;
                    if (AbstractC1455i.g(c10, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(View itemView) {
        this(itemView, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    public static /* synthetic */ ViewGroup F(H h10, ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addIfNotExists");
        }
        if ((i10 & 2) != 0) {
            layoutParams = null;
        }
        return h10.E(viewGroup, view, layoutParams);
    }

    public static final void L(ImageView imageView, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        Drawable drawable = imageView != null ? imageView.getDrawable() : null;
        if (drawable != null) {
            drawable.setAlpha((int) (floatValue * 255));
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public static final int U0() {
        return f15218g1.e();
    }

    public static final float V0() {
        return f15218g1.f();
    }

    public static final int W0() {
        return f15218g1.g();
    }

    public static final void W1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        editText.requestFocus();
        LiveChatUtil.showKeyboard(editText);
    }

    public static final float X0() {
        return f15218g1.h();
    }

    public static final int Y0() {
        return f15218g1.i();
    }

    public static final int Z0() {
        return f15218g1.j();
    }

    public static final float a1() {
        return f15218g1.k();
    }

    public static final int b1() {
        return f15218g1.l();
    }

    public static final void f1(EditText editText, final H this$0, final View view, final boolean z10) {
        Intrinsics.checkNotNullParameter(editText, "$editText");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z10) {
            editText.post(new Runnable() { // from class: ag.w
                @Override // java.lang.Runnable
                public final void run() {
                    H.g1(view, this$0, z10);
                }
            });
        }
        cg.e o02 = this$0.o0();
        if (o02 != null) {
            o02.r(z10);
        }
    }

    public static final void g1(View view, H this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LiveChatUtil.showKeyboard(view);
        cg.e o02 = this$0.o0();
        if (o02 != null) {
            o02.r(z10);
        }
    }

    public static final void h1(H this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cg.e o02 = this$0.o0();
        if (o02 != null) {
            o02.r(true);
        }
    }

    public static final void j1(H this$0, View view) {
        cg.f fVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f15228C || (fVar = this$0.f15268u) == null) {
            return;
        }
        Intrinsics.checkNotNull(fVar);
        this$0.f15228C = !fVar.z();
    }

    public static final void k1(H this$0, Channel.Department department, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(department, "$department");
        cg.f fVar = this$0.f15268u;
        if (fVar != null) {
            fVar.K(department);
        }
    }

    public static final float[] l0() {
        return f15218g1.b();
    }

    public static final void l1(H this$0, String suggestion, String id2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(suggestion, "$suggestion");
        Intrinsics.checkNotNullParameter(id2, "$id");
        cg.f fVar = this$0.f15268u;
        Boolean valueOf = fVar != null ? Boolean.valueOf(fVar.v(this$0.f15267t, suggestion, Message.g.WidgetSuggestions, suggestion, id2)) : null;
        if ((Intrinsics.areEqual(valueOf, Boolean.TRUE) ? valueOf : null) != null) {
            this$0.C1(this$0.r0(), this$0.f15267t);
        }
    }

    public static final float[] m0() {
        return f15218g1.c();
    }

    public static final void m1(H this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cg.f fVar = this$0.f15268u;
        if (fVar != null) {
            fVar.P("-", Message.g.Skip, "-", null);
        }
    }

    public static final void o(H this$0, View view) {
        cg.e o02;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Message message = this$0.f15227B;
        if (message == null || (o02 = this$0.o0()) == null) {
            return;
        }
        o02.k(message);
    }

    public static final void p(H this$0, View view) {
        cg.e o02;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Message message = this$0.f15227B;
        if (message == null || (o02 = this$0.o0()) == null) {
            return;
        }
        o02.F(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutInflater p0() {
        return (LayoutInflater) this.f15266s.getValue();
    }

    public static final void p1(TextView textView, Message message, Message message2, H h10) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (message.getMessageType() == Message.g.File) {
            AppCompatImageView appCompatImageView = h10.f15237L;
            if (appCompatImageView != null) {
                bVar.f18190v = -1;
                Intrinsics.checkNotNull(appCompatImageView);
                bVar.f18188u = appCompatImageView.getId();
            } else {
                bVar.f18190v = 0;
                bVar.f18188u = -1;
            }
        } else if (message2.getMessageType() == Message.g.Image || message2.getMessageType() == Message.g.Video) {
            AppCompatImageView appCompatImageView2 = h10.f15237L;
            if (appCompatImageView2 != null) {
                bVar.f18190v = -1;
                Intrinsics.checkNotNull(appCompatImageView2);
                bVar.f18188u = appCompatImageView2.getId();
            }
        } else {
            AppCompatImageView appCompatImageView3 = h10.f15237L;
            if (appCompatImageView3 != null) {
                bVar.f18190v = -1;
                Intrinsics.checkNotNull(appCompatImageView3);
                bVar.f18188u = appCompatImageView3.getId();
            } else {
                bVar.f18190v = h10.y0().f66336c.getId();
                bVar.f18188u = -1;
            }
        }
        textView.setLayoutParams(bVar);
    }

    public static /* synthetic */ void s1(H h10, Message message, boolean z10, ImageView imageView, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleStatus");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            imageView = null;
        }
        h10.r1(message, z10, imageView);
    }

    public static final void u1(H this$0, int i10, View backgroundHighlightAnimationView, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(backgroundHighlightAnimationView, "$backgroundHighlightAnimationView");
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (this$0.getBindingAdapterPosition() != i10) {
            backgroundHighlightAnimationView.setBackgroundColor(this$0.S0());
            return;
        }
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        backgroundHighlightAnimationView.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public MobilistenTextView A0() {
        return null;
    }

    public final void A1(ImageView imageView, Message.Attachment attachment, Message.Extras extras) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        AbstractC1459k.d(C6461a.f65810a.e(), null, null, new z(extras, attachment, imageView, null), 3, null);
    }

    public MobilistenTextView B0() {
        return null;
    }

    public final void B1(Message message) {
        if (Z() != null) {
            ImageView Z10 = Z();
            if (Z10 != null && Z10.getVisibility() == 0) {
                ImageView Z11 = Z();
                Drawable background = Z11 != null ? Z11.getBackground() : null;
                if (background != null) {
                    background.setColorFilter(new PorterDuffColorFilter(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59827g), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP));
                }
                int i10 = message.isBot() ? od.p.f60148p3 : StringsKt.equals("DARK", com.zoho.livechat.android.utils.P.j(d0()), true) ? od.p.f60127l2 : od.p.f60132m2;
                ImageView Z12 = Z();
                if (Z12 != null) {
                    Z12.setImageResource(i10);
                }
                Message.Meta meta = message.getMeta();
                if ((meta != null ? meta.getOperationUser() : null) != null) {
                    ImageView Z13 = Z();
                    int i11 = StringsKt.equals(com.zoho.livechat.android.utils.P.j(Z13 != null ? Z13.getContext() : null), "DARK", true) ? od.p.f60047U3 : od.p.f60042T3;
                    ImageView Z14 = Z();
                    if (Z14 != null) {
                        Z14.setImageResource(i11);
                    }
                } else if (message.getSender() != null && !Intrinsics.areEqual(message.getSender(), "form_sender") && Z() != null) {
                    String b10 = sd.d.b(message.getSender(), message.isBot());
                    ImageView Z15 = Z();
                    Intrinsics.checkNotNull(Z15);
                    wd.d.K(Z15, b10, null, false, true, new A(i10, b10), null, AbstractC5596a.b(d0(), i10), message.getSender(), null, false, null, 3584, null);
                }
            }
        }
    }

    public final MobilistenTextView C0() {
        Object value = this.f15260m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MobilistenTextView) value;
    }

    public final ViewGroup C1(ViewGroup viewGroup, View view) {
        Boolean bool;
        if (view != null) {
            if (viewGroup != null) {
                bool = Boolean.valueOf(viewGroup.indexOfChild(view) != -1);
            } else {
                bool = null;
            }
            r0 = Intrinsics.areEqual(bool, Boolean.TRUE);
        }
        if (r0 && viewGroup != null) {
            viewGroup.removeView(view);
        }
        return viewGroup;
    }

    public final Drawable D0() {
        return (Drawable) this.f15233H.getValue();
    }

    public final void D1() {
        MobilistenTextView mobilistenTextView;
        MobilistenTextView mobilistenTextView2;
        y0().f66338e.setMaxWidth(Integer.MAX_VALUE);
        ud.n nVar = this.f15229D;
        ViewGroup.LayoutParams layoutParams = (nVar == null || (mobilistenTextView2 = nVar.f66338e) == null) ? null : mobilistenTextView2.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            bVar.f18190v = 0;
            bVar.f18188u = -1;
            ud.n nVar2 = this.f15229D;
            MobilistenTextView mobilistenTextView3 = nVar2 != null ? nVar2.f66338e : null;
            if (mobilistenTextView3 != null) {
                mobilistenTextView3.setLayoutParams(bVar);
            }
        }
        ud.n nVar3 = this.f15229D;
        ViewGroup.LayoutParams layoutParams2 = (nVar3 == null || (mobilistenTextView = nVar3.f66337d) == null) ? null : mobilistenTextView.getLayoutParams();
        ConstraintLayout.b bVar2 = layoutParams2 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams2 : null;
        if (bVar2 != null) {
            bVar2.f18190v = 0;
            bVar2.f18188u = -1;
            ud.n nVar4 = this.f15229D;
            MobilistenTextView mobilistenTextView4 = nVar4 != null ? nVar4.f66337d : null;
            if (mobilistenTextView4 != null) {
                mobilistenTextView4.setLayoutParams(bVar2);
            }
        }
        C1(this.f15269v, this.f15237L);
        this.f15237L = null;
    }

    public final ViewGroup E(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (viewGroup != null) {
            if (viewGroup.indexOfChild(view) != -1) {
                return viewGroup;
            }
            if (layoutParams != null) {
                viewGroup.addView(view, layoutParams);
                return viewGroup;
            }
            viewGroup.addView(view);
        }
        return viewGroup;
    }

    public final Drawable E0() {
        return (Drawable) this.f15232G.getValue();
    }

    public final void E1() {
        D1();
        ViewGroup viewGroup = this.f15269v;
        if (viewGroup != null) {
            ud.n nVar = this.f15229D;
            C1(viewGroup, nVar != null ? nVar.f66336c : null);
        }
        ViewGroup viewGroup2 = this.f15269v;
        if (viewGroup2 != null) {
            ud.n nVar2 = this.f15229D;
            C1(viewGroup2, nVar2 != null ? nVar2.f66337d : null);
        }
        ViewGroup viewGroup3 = this.f15269v;
        if (viewGroup3 != null) {
            ud.n nVar3 = this.f15229D;
            C1(viewGroup3, nVar3 != null ? nVar3.f66338e : null);
        }
        ViewGroup viewGroup4 = this.f15269v;
        if (viewGroup4 != null) {
            ud.n nVar4 = this.f15229D;
            C1(viewGroup4, nVar4 != null ? nVar4.f66335b : null);
        }
        ViewGroup viewGroup5 = this.f15269v;
        if (viewGroup5 != null) {
            ud.n nVar5 = this.f15229D;
            C1(viewGroup5, nVar5 != null ? nVar5.f66339f : null);
        }
        ViewGroup viewGroup6 = this.f15269v;
        if (viewGroup6 != null) {
            ud.n nVar6 = this.f15229D;
            C1(viewGroup6, nVar6 != null ? nVar6.f66340g : null);
        }
        this.f15229D = null;
    }

    public final int F0() {
        return og.k.a(232.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F1(SalesIQChat salesIQChat, Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f15226A = salesIQChat;
        this.f15227B = message;
        ViewGroup viewGroup = this.f15269v;
        if (viewGroup != null) {
            O(viewGroup);
        }
        ViewGroup viewGroup2 = this.f15269v;
        if (viewGroup2 != null) {
            N(viewGroup2);
        }
        P();
        n1();
        Q1();
        this.f15228C = true;
        C1(r0(), this.f15264q);
        C1(r0(), this.f15267t);
        this.f15267t = null;
        this.f15264q = null;
        if (w1()) {
            B1(message);
            C0().setText(Vf.b.i().a(message.getDisplayName()));
            Message.Meta meta = message.getMeta();
            if ((meta != null ? meta.getOperationUser() : null) != null) {
                C0().setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59852l), 0.0f, 2, null));
            } else {
                C0().setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59790Y0), 0.0f, 2, null));
            }
            i1(message);
        } else {
            v1();
            og.p.n(K0());
            if (LiveChatUtil.showVisitorName()) {
                Message.b displayName = message.getDisplayName();
                if (!LiveChatUtil.isAnnonVisitorbyName(displayName != null ? displayName.e() : null)) {
                    C0().setText(Vf.b.i().a(message.getDisplayName()));
                    if (Message.f.Companion.b(message.getStatus())) {
                        og.p.w(K0());
                    }
                }
            }
            C0().setText(d0().getResources().getString(od.t.f61127v1));
            if (Message.f.Companion.b(message.getStatus())) {
            }
        }
        if (og.i.e(message.getTimeDifferenceContent()) || message.isFirstMessage()) {
            if (!message.isFirstMessage()) {
                WaitingChatDetails D10 = Tf.b.D(message.getAcknowledgementKey());
                if ((D10 != null ? D10.getAttenderId() : null) != null) {
                    C0().setVisibility(4);
                }
            }
            P0().setVisibility(0);
            MobilistenTextView Q02 = Q0();
            String timeDifferenceContent = message.getTimeDifferenceContent();
            if (timeDifferenceContent == null) {
                String dateDifference = ((message.getPreviousMessageTime() > 0L ? 1 : (message.getPreviousMessageTime() == 0L ? 0 : -1)) > 0 ? this : null) != null ? LiveChatUtil.getDateDifference(d0(), Long.valueOf(message.getPreviousMessageTime())) : null;
                timeDifferenceContent = dateDifference != null ? dateDifference : d0().getString(od.t.f60899M);
            }
            Q02.setText(timeDifferenceContent);
        } else {
            P0().setVisibility(8);
        }
        S1(message);
        o1(message);
        N1(message);
    }

    public final int G0() {
        int b10 = x1() ? og.k.b(94) : c0() ? og.k.b(56) : og.k.b(94);
        return MobilistenUtil.l() ? u0() - (C6218a.s() - b10) : b10;
    }

    public final void G1() {
        if (this.f15245Y) {
            C1(r0(), r0().findViewById(od.q.f60481c));
        }
    }

    public final CardView H0() {
        CardView cardView = this.f15270w;
        if (cardView == null) {
            cardView = ud.m.c(LayoutInflater.from(d0()), r0(), true).b();
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f18186t = 0;
            bVar.f18190v = 0;
            ViewGroup viewGroup = this.f15269v;
            if (viewGroup != null) {
                bVar.f18166j = viewGroup.getId();
            }
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = og.k.b(16);
            cardView.setLayoutParams(bVar);
            this.f15270w = cardView;
            Intrinsics.checkNotNullExpressionValue(cardView, "also(...)");
        }
        return cardView;
    }

    public final void H1(ValueAnimator valueAnimator) {
        this.f15235J = valueAnimator;
    }

    public final void I() {
        ConstraintLayout r02 = r0();
        FlexboxLayout L02 = L0();
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = W0();
        bVar.f18190v = r0().getId();
        ViewGroup viewGroup = this.f15269v;
        if (viewGroup != null) {
            int id2 = viewGroup.getId();
            bVar.f18166j = id2;
            bVar.f18186t = id2;
        }
        Unit unit = Unit.INSTANCE;
        E(r02, L02, bVar);
        if (MobilistenUtil.m()) {
            L0().setPadding(Z0(), 0, 0, 0);
        } else {
            L0().setPadding(0, 0, Z0(), 0);
        }
    }

    public final LinearLayout I0() {
        return (LinearLayout) this.f15271x.getValue();
    }

    public final void I1(ValueAnimator valueAnimator) {
        this.f15234I = valueAnimator;
    }

    public final void J() {
        E(r0(), M0(), new ConstraintLayout.b(0, -2));
    }

    public final RelativeLayout J0() {
        return (RelativeLayout) this.f15272y.getValue();
    }

    public final void J1(Drawable drawable) {
        this.f15236K = drawable;
    }

    public final void K(final ImageView imageView, Drawable drawable, float f10, float f11, int i10, int i11) {
        H h10;
        this.f15236K = drawable;
        if (this.f15234I == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15234I = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(i11);
            }
            ValueAnimator valueAnimator = this.f15234I;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.D
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        H.L(imageView, valueAnimator2);
                    }
                });
            }
            ValueAnimator valueAnimator2 = this.f15234I;
            if (valueAnimator2 != null) {
                h10 = this;
                valueAnimator2.addListener(h10.new C1953p(f10, f11, i10, imageView));
            } else {
                h10 = this;
            }
            ValueAnimator valueAnimator3 = h10.f15234I;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    public final ImageView K0() {
        Object value = this.f15273z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final void K1(ViewGroup viewGroup) {
        this.f15269v = viewGroup;
    }

    public final FlexboxLayout L0() {
        FlexboxLayout flexboxLayout = this.f15267t;
        if (flexboxLayout != null) {
            return flexboxLayout;
        }
        FlexboxLayout flexboxLayout2 = new FlexboxLayout(d0());
        flexboxLayout2.setId(od.q.f60512e8);
        flexboxLayout2.setFlexDirection(0);
        flexboxLayout2.setAlignContent(0);
        flexboxLayout2.setAlignItems(0);
        flexboxLayout2.setFlexWrap(1);
        flexboxLayout2.setShowDivider(2);
        flexboxLayout2.setShowDividerVertical(2);
        flexboxLayout2.setShowDividerHorizontal(2);
        flexboxLayout2.setDividerDrawableHorizontal(AbstractC5596a.b(flexboxLayout2.getContext(), od.p.f60069a));
        flexboxLayout2.setDividerDrawableVertical(AbstractC5596a.b(flexboxLayout2.getContext(), od.p.f60074b));
        this.f15267t = flexboxLayout2;
        return flexboxLayout2;
    }

    public final void L1(int i10) {
        this.f15254g = i10;
    }

    public final void M() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(r0());
        ViewGroup viewGroup = this.f15269v;
        if (viewGroup != null) {
            dVar.i(od.q.f60481c, 3, viewGroup.getId(), 3, -og.k.a(1.5f));
        }
        dVar.h(od.q.f60481c, 6, 0, 6);
        dVar.h(od.q.f60481c, 7, 0, 7);
        ViewGroup viewGroup2 = this.f15269v;
        if (viewGroup2 != null) {
            dVar.i(od.q.f60481c, 4, viewGroup2.getId(), 4, -og.k.a(1.5f));
        }
        dVar.c(r0());
    }

    public final RecyclerView M0() {
        RecyclerView recyclerView = this.f15264q;
        if (recyclerView == null) {
            recyclerView = ud.f.b(p0(), r0()).f66291b;
            recyclerView.j(new L());
            ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = og.k.b(10);
            ViewGroup viewGroup = this.f15269v;
            if (viewGroup != null) {
                int id2 = viewGroup.getId();
                bVar.f18166j = id2;
                bVar.f18186t = id2;
            }
            bVar.f18190v = 0;
            recyclerView.setLayoutParams(bVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
            recyclerView.setClipToPadding(false);
            this.f15264q = recyclerView;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "also(...)");
        }
        return recyclerView;
    }

    public final void M1(Message message) {
        this.f15227B = message;
    }

    public final void N(View view) {
        int i10;
        int i11 = x1() ? AbstractC5886l.f59770T0 : AbstractC5886l.f59766S0;
        int W02 = W0();
        Message message = this.f15227B;
        if ((message != null ? message.getMessageType() : null) != Message.g.Feedback) {
            Message message2 = this.f15227B;
            if ((message2 != null ? message2.getMessageType() : null) != Message.g.WidgetSuggestions) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                i10 = AbstractC5892d.h(context, Integer.valueOf(i11), 0.0f, 2, null);
                og.p.d(view, W02, Integer.valueOf(i10), 0, null, false, 28, null);
            }
        }
        i10 = 0;
        og.p.d(view, W02, Integer.valueOf(i10), 0, null, false, 28, null);
    }

    public final Function1 N0() {
        return this.f15248b;
    }

    public void N1(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Boolean isEdited = message.isEdited();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(isEdited, bool) && !Intrinsics.areEqual(message.isDeleted(), bool)) {
            int i10 = w1() ? AbstractC5886l.f59783W1 : AbstractC5886l.f59787X1;
            TextView f02 = f0();
            if (f02 != null) {
                f02.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null));
            }
            MobilistenTextView A02 = A0();
            if (A02 != null) {
                A02.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null));
            }
            TextView f03 = f0();
            if (f03 != null) {
                f03.setText(d0().getString(od.t.f60994b3));
            }
            MobilistenTextView A03 = A0();
            if (A03 != null) {
                A03.setText(d0().getString(od.t.f60994b3));
            }
        }
        TextView R02 = R0();
        if (R02 != null) {
            R02.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(x1() ? AbstractC5886l.f59814d1 : AbstractC5886l.f59809c1), 0.0f, 2, null));
        }
        d1(message);
    }

    public final View O(View view) {
        float f10;
        if (this.f15244X == null) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            this.f15244X = dVar;
            dVar.f(r0());
            Unit unit = Unit.INSTANCE;
        }
        androidx.constraintlayout.widget.d dVar2 = this.f15244X;
        if (dVar2 != null) {
            dVar2.h(view.getId(), 3, od.q.f60684v7, 4);
        }
        if (x1()) {
            androidx.constraintlayout.widget.d dVar3 = this.f15244X;
            if (dVar3 != null) {
                dVar3.h(od.q.f60593m6, 7, view.getId(), 6);
            }
            androidx.constraintlayout.widget.d dVar4 = this.f15244X;
            if (dVar4 != null) {
                dVar4.h(od.q.f60593m6, 3, view.getId(), 3);
            }
            androidx.constraintlayout.widget.d dVar5 = this.f15244X;
            if (dVar5 != null) {
                dVar5.h(od.q.f60593m6, 4, view.getId(), 4);
            }
            androidx.constraintlayout.widget.d dVar6 = this.f15244X;
            if (dVar6 != null) {
                dVar6.h(od.q.f60684v7, 7, view.getId(), 7);
            }
            androidx.constraintlayout.widget.d dVar7 = this.f15244X;
            if (dVar7 != null) {
                dVar7.h(od.q.f60684v7, 6, 0, 6);
            }
            androidx.constraintlayout.widget.d dVar8 = this.f15244X;
            if (dVar8 != null) {
                dVar8.i(view.getId(), 7, 0, 7, Y0());
            }
            androidx.constraintlayout.widget.d dVar9 = this.f15244X;
            if (dVar9 != null) {
                dVar9.i(view.getId(), 6, 0, 6, y1() ? G0() : C6963d.f68921i.n());
            }
            f10 = 1.0f;
        } else {
            androidx.constraintlayout.widget.d dVar10 = this.f15244X;
            if (dVar10 != null) {
                dVar10.i(view.getId(), 6, od.q.f60674u7, 7, c0() ? b1() : Y0());
            }
            androidx.constraintlayout.widget.d dVar11 = this.f15244X;
            if (dVar11 != null) {
                dVar11.h(od.q.f60684v7, 7, 0, 7);
            }
            androidx.constraintlayout.widget.d dVar12 = this.f15244X;
            if (dVar12 != null) {
                dVar12.h(od.q.f60684v7, 6, view.getId(), 6);
            }
            androidx.constraintlayout.widget.d dVar13 = this.f15244X;
            if (dVar13 != null) {
                dVar13.h(od.q.f60539h2, 3, view.getId(), 4);
            }
            androidx.constraintlayout.widget.d dVar14 = this.f15244X;
            if (dVar14 != null) {
                dVar14.i(view.getId(), 7, 0, 7, y1() ? G0() : c0() ? C6963d.f68921i.o() : C6963d.f68921i.n());
            }
            f10 = 0.0f;
        }
        androidx.constraintlayout.widget.d dVar15 = this.f15244X;
        if (dVar15 != null) {
            dVar15.c(r0());
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = k0() ? 0 : -2;
        bVar.f18128G = f10;
        bVar.f18149a0 = true;
        view.setLayoutParams(bVar);
        T();
        return view;
    }

    public final TextView O0() {
        return (TextView) this.f15256i.getValue();
    }

    public final void O1(Function1 function1) {
        this.f15248b = function1;
    }

    public final void P() {
        Message message;
        Message message2 = this.f15227B;
        if (og.i.e(message2 != null ? message2.getReplyTo() : null) && (message = this.f15227B) != null) {
            if (!(message != null ? Intrinsics.areEqual(message.isDeleted(), Boolean.TRUE) : false)) {
                ud.n y02 = y0();
                View view = y02.f66336c;
                int U02 = U0();
                int color = AbstractC5338c.getColor(d0(), x1() ? od.n.f59931k : od.n.f59930j);
                Intrinsics.checkNotNull(view);
                og.p.v(view, color, null, Integer.valueOf(U02), false, 0, 26, null);
                if (w1()) {
                    y02.f66338e.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59748N2), 0.0f, 2, null));
                    y02.f66337d.setTextColor(AbstractC5892d.g(d0(), Integer.valueOf(AbstractC5886l.f59756P2), 86.0f));
                    View view2 = y02.f66339f;
                    view2.setBackground(AbstractC5893e.a(view2.getBackground(), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59764R2), 0.0f, 2, null)));
                    return;
                }
                y02.f66338e.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59752O2), 0.0f, 2, null));
                y02.f66337d.setTextColor(AbstractC5892d.g(d0(), Integer.valueOf(AbstractC5886l.f59760Q2), 86.0f));
                View view3 = y02.f66339f;
                view3.setBackground(AbstractC5893e.a(view3.getBackground(), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59768S2), 0.0f, 2, null)));
                return;
            }
        }
        E1();
    }

    public final Group P0() {
        Object value = this.f15261n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r0 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(Message message) {
        Message message2;
        String content;
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(message, "message");
        this.f15227B = message;
        TextView O02 = O0();
        if (O02 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                O02.setBreakStrategy(0);
            } else {
                O02.setBreakStrategy(0);
            }
            C6963d.b bVar = C6963d.f68921i;
            Message.Meta meta = message.getMeta();
            if (!(meta != null ? Intrinsics.areEqual(meta.isFormMessage(), Boolean.TRUE) : false)) {
                content = message.getContent();
            } else if (Intrinsics.areEqual(message.getMeta().getHasCustomMessage(), Boolean.TRUE)) {
                content = message.getContent();
            } else {
                Integer messageStringResourceId = message.getMessageStringResourceId();
                if (messageStringResourceId != null) {
                    int intValue = messageStringResourceId.intValue();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(d0().getString(intValue));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m153isFailureimpl(m147constructorimpl)) {
                        m147constructorimpl = null;
                    }
                    content = (String) m147constructorimpl;
                }
                content = message.getContent();
            }
            message2 = message;
            C6963d.b.x(bVar, O02, content, message2, w1(), false, false, 48, null);
        } else {
            message2 = message;
        }
        Boolean isEdited = message2.isEdited();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(isEdited, bool) || Intrinsics.areEqual(message2.isDeleted(), bool)) {
            og.p.n(f0());
        } else {
            og.p.w(f0());
        }
    }

    public final void Q(View view, float f10, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(f15218g1.d(f10));
        gradientDrawable.setColor(AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null));
        AbstractC2082d0.p0(view, gradientDrawable);
    }

    public final MobilistenTextView Q0() {
        Object value = this.f15262o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MobilistenTextView) value;
    }

    public final void Q1() {
        TextView O02 = O0();
        if (O02 != null) {
            O02.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(x1() ? AbstractC5886l.f59804b1 : AbstractC5886l.f59799a1), 0.0f, 2, null));
        }
    }

    public final void R(ViewGroup layout, int i10) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        og.p.i(layout, null, Integer.valueOf(W0()), Integer.valueOf(com.zoho.livechat.android.utils.P.e(layout.getContext(), i10)), null, null, false, 56, null);
    }

    public final TextView R0() {
        return (TextView) this.f15257j.getValue();
    }

    public final void R1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setMovementMethod(C3937f.f());
    }

    public final int S0() {
        return AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59827g), 0.0f, 2, null);
    }

    public final void S1(Message message) {
        TextView R02 = R0();
        if (R02 == null) {
            return;
        }
        R02.setText(message.getFormattedClientTime());
    }

    public final void T() {
        Message message = this.f15227B;
        if (message == null || !message.getCanShowSenderName()) {
            og.p.n(C0());
        } else {
            og.p.w(C0());
            ViewGroup.LayoutParams layoutParams = C0().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int W02 = W0();
            if (x1()) {
                bVar.setMarginEnd(0);
                bVar.setMarginStart(W02);
                bVar.f18128G = 1.0f;
            } else {
                bVar.setMarginEnd(W02);
                bVar.setMarginStart(0);
                bVar.f18128G = 0.0f;
            }
            C0().setLayoutParams(bVar);
        }
        if (x1()) {
            ImageView Z10 = Z();
            if (Z10 != null) {
                og.p.n(Z10);
                return;
            }
            return;
        }
        if (!c0()) {
            ImageView Z11 = Z();
            if (Z11 != null) {
                og.p.n(Z11);
                return;
            }
            return;
        }
        Message message2 = this.f15227B;
        if (message2 == null || !message2.getCanShowSenderAvatar()) {
            ImageView Z12 = Z();
            if (Z12 == null) {
                return;
            }
            Z12.setVisibility(4);
            return;
        }
        ImageView Z13 = Z();
        if (Z13 != null) {
            og.p.w(Z13);
        }
    }

    public final Drawable T0() {
        return (Drawable) this.f15241T.getValue();
    }

    public final void T1(Message message, boolean z10, TextView textView) {
        Intrinsics.checkNotNullParameter(message, "message");
        String formattedClientTime = message.getFormattedClientTime();
        if (z10) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView R02 = R0();
            if (R02 != null) {
                R02.setVisibility(0);
            }
            TextView R03 = R0();
            if (R03 == null) {
                return;
            }
            R03.setText(formattedClientTime);
            return;
        }
        if (message.isLastMessage() && textView != null) {
            textView.setVisibility(0);
            textView.setText(formattedClientTime);
            TextView R04 = R0();
            if (R04 == null) {
                return;
            }
            R04.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView R05 = R0();
        if (R05 != null) {
            R05.setVisibility(0);
        }
        TextView R06 = R0();
        if (R06 == null) {
            return;
        }
        R06.setText(formattedClientTime);
    }

    public final Drawable U() {
        return (Drawable) this.f15243W.getValue();
    }

    public final void U1(cg.f fVar) {
        this.f15268u = fVar;
    }

    public final Drawable V() {
        return (Drawable) this.f15238O.getValue();
    }

    public final void V1(final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.post(new Runnable() { // from class: ag.B
            @Override // java.lang.Runnable
            public final void run() {
                H.W1(editText);
            }
        });
    }

    public final HttpUrl.Builder W(SalesIQChat salesIQChat, Message.Attachment attachment) {
        try {
            Result.Companion companion = Result.INSTANCE;
            HttpUrl.Builder g10 = Yd.a.g("visitor/v2/%1$s/conversations/%2$s/download", LiveChatUtil.getScreenName(), salesIQChat != null ? salesIQChat.getVisitorid() : null);
            if (salesIQChat != null && g10 != null) {
                if (attachment != null) {
                    g10.addQueryParameter(EventKeys.URL, attachment.getUrl());
                    g10.addQueryParameter("file_size", String.valueOf(attachment.getSize()));
                    g10.addEncodedQueryParameter("file_name", attachment.getFileName());
                }
                return g10;
            }
            return null;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
            }
            return (HttpUrl.Builder) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        }
    }

    public final Drawable X() {
        return (Drawable) this.f15239P.getValue();
    }

    public void X1(int i10) {
        if (i10 == 1) {
            MobilistenUtil.z(od.t.f61056k2, 0, 2, null);
            return;
        }
        String string = d0().getString(od.t.f61063l2, Integer.valueOf(i10));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        MobilistenUtil.A(string, 0, 2, null);
    }

    public final Drawable Y() {
        return (Drawable) this.f15240R.getValue();
    }

    public final ImageView Z() {
        return (ImageView) this.f15259l.getValue();
    }

    public final ValueAnimator a0() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(j0()), Integer.valueOf(S0()));
        Intrinsics.checkNotNullExpressionValue(ofObject, "ofObject(...)");
        return ofObject;
    }

    public final boolean b0() {
        Message.Meta meta;
        Message message = this.f15227B;
        if (og.i.f(message != null ? message.getUniqueID() : null)) {
            Message message2 = this.f15227B;
            Intrinsics.checkNotNull(message2);
            Boolean isDeleted = message2.isDeleted();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.areEqual(isDeleted, bool)) {
                List list = f15214P4;
                Message message3 = this.f15227B;
                Intrinsics.checkNotNull(message3);
                if (!list.contains(message3.getMessageType())) {
                    Message message4 = this.f15227B;
                    if (!Intrinsics.areEqual(message4 != null ? message4.getSender() : null, "form_sender")) {
                        Message message5 = this.f15227B;
                        if ((message5 != null ? message5.getStatus() : null) == Message.f.Sent) {
                            Message message6 = this.f15227B;
                            if (!((message6 == null || (meta = message6.getMeta()) == null) ? false : Intrinsics.areEqual(meta.isFormMessage(), bool))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean c0() {
        Channel.Chat chat;
        Channel m10 = C6822a.m();
        return ((m10 == null || (chat = m10.getChat()) == null) ? false : Intrinsics.areEqual(chat.getShowOperatorImage(), Boolean.TRUE)) && LiveChatUtil.canShowOperatorImageInChat();
    }

    public final void c1(SalesIQChat salesIQChat, Message message, ImageView imageView, cg.e eVar, Function2 callBack) {
        File file;
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (message.getStatus() != Message.f.Sent) {
            Message.f status = message.getStatus();
            Message.f fVar = Message.f.Uploading;
            if (status != fVar) {
                if (!Message.f.Companion.b(message.getStatus()) || salesIQChat.getStatus() == 4) {
                    return;
                }
                if (eVar != null) {
                    eVar.n(message);
                }
                callBack.invoke(Boolean.TRUE, Message.copy$default(message, null, null, null, null, fVar, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -17, 1023, null));
                return;
            }
            Ph.C0 c02 = (Ph.C0) com.zoho.livechat.android.utils.Q.f44444C.get(message.getChatId() + '_' + message.getId());
            if (c02 != null && c02.isActive()) {
                c02.cancel((CancellationException) null);
                com.zoho.livechat.android.utils.Q.f44444C.remove(message.getChatId() + '_' + message.getId());
            }
            if (eVar != null) {
                eVar.u(message.getChatId(), message.getId());
            }
            callBack.invoke(Boolean.TRUE, Message.copy$default(message, null, null, null, null, Message.f.Failure, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -17, 1023, null));
            return;
        }
        if (message.getAttachment() != null) {
            HttpUrl.Builder W10 = W(salesIQChat, message.getAttachment());
            Message.Extras extras = message.getExtras();
            if ((extras != null ? extras.getLocalFilePath() : null) != null) {
                Message.Extras extras2 = message.getExtras();
                file = new File(extras2 != null ? extras2.getLocalFilePath() : null);
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                Message.Extras extras3 = message.getExtras();
                int m10 = og.i.m(extras3 != null ? Long.valueOf(extras3.getLocalFileSize()) : null);
                Message.Attachment attachment = message.getAttachment();
                if (m10 >= og.i.m(attachment != null ? Long.valueOf(attachment.getSize()) : null)) {
                    if (eVar == null || message.getMessageType() != Message.g.Video) {
                        return;
                    }
                    Message.Extras extras4 = message.getExtras();
                    if ((extras4 != null ? extras4.getLocalFilePath() : null) != null) {
                        Message.Extras extras5 = message.getExtras();
                        Intrinsics.checkNotNull(extras5);
                        eVar.T(new File(extras5.getLocalFilePath()));
                        return;
                    }
                    return;
                }
            }
            if (W10 == null || !C3948q.b().c(message.getId())) {
                C3948q b10 = C3948q.b();
                String chatId = message.getChatId();
                String id2 = message.getId();
                com.zoho.livechat.android.utils.y yVar = com.zoho.livechat.android.utils.y.INSTANCE;
                Message.Attachment attachment2 = message.getAttachment();
                String fileName = yVar.getFileName(attachment2 != null ? attachment2.getFileName() : null, LiveChatUtil.getLong(message.getId()));
                Message.Attachment attachment3 = message.getAttachment();
                b10.a(chatId, id2, W10, fileName, og.i.r(attachment3 != null ? Long.valueOf(attachment3.getSize()) : null));
            } else {
                C3948q.b().e(message.getId());
                if (imageView != null) {
                    imageView.setImageDrawable(e0(w1(), message.getHasComment()));
                }
            }
            callBack.invoke(Boolean.TRUE, message);
        }
    }

    public final Context d0() {
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final void d1(Message message) {
        Message message2;
        Intrinsics.checkNotNullParameter(message, "message");
        this.f15227B = message;
        if (this.f15250c.contains(message.getMessageType()) || message.getMessageType() == Message.g.File) {
            Boolean isDeleted = message.isDeleted();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(isDeleted, bool)) {
                return;
            }
            String comment = message.getComment();
            if (comment == null || comment.length() == 0) {
                message2 = message;
                og.p.n(O0());
            } else {
                TextView O02 = O0();
                if (O02 != null) {
                    og.p.w(O0());
                    message2 = message;
                    C6963d.b.x(C6963d.f68921i, O02, message.getComment(), message2, w1(), false, false, 48, null);
                } else {
                    message2 = message;
                }
            }
            TextView R02 = R0();
            if (R02 != null) {
                R02.setText(message2.getFormattedClientTime());
            }
            MobilistenTextView B02 = B0();
            if (B02 != null) {
                B02.setText(message2.getFormattedClientTime());
            }
            if (!Intrinsics.areEqual(message2.isEdited(), bool) || Intrinsics.areEqual(message2.isDeleted(), bool) || !this.f15250c.contains(message2.getMessageType())) {
                og.p.n(f0());
                og.p.n(A0());
                if (og.i.f(message2.getComment())) {
                    TextView R03 = R0();
                    if (R03 != null) {
                        og.p.w(R03);
                    }
                    MobilistenTextView B03 = B0();
                    if (B03 != null) {
                        og.p.n(B03);
                        return;
                    }
                    return;
                }
                TextView R04 = R0();
                if (R04 != null) {
                    og.p.n(R04);
                }
                MobilistenTextView B04 = B0();
                if (B04 != null) {
                    og.p.w(B04);
                    return;
                }
                return;
            }
            if (!og.i.f(message2.getComment())) {
                og.p.n(f0());
                og.p.w(A0());
                TextView R05 = R0();
                if (R05 != null) {
                    og.p.n(R05);
                }
                MobilistenTextView B05 = B0();
                if (B05 != null) {
                    og.p.w(B05);
                    return;
                }
                return;
            }
            TextView f02 = f0();
            if (f02 != null) {
                og.p.w(f02);
            }
            MobilistenTextView A02 = A0();
            if (A02 != null) {
                og.p.n(A02);
            }
            TextView R06 = R0();
            if (R06 != null) {
                og.p.w(R06);
            }
            MobilistenTextView B06 = B0();
            if (B06 != null) {
                og.p.n(B06);
            }
        }
    }

    public final Drawable e0(boolean z10, boolean z11) {
        return AbstractC5892d.c(d0(), od.p.f60004M0, AbstractC5892d.h(d0(), Integer.valueOf(z10 ? z11 ? AbstractC5886l.f59870p : AbstractC5886l.f59886t : z11 ? AbstractC5886l.f59874q : AbstractC5886l.f59890u), 0.0f, 2, null));
    }

    public final void e1(final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ag.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                H.f1(editText, this, view, z10);
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: ag.F
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                H.h1(H.this, view);
            }
        });
    }

    public final TextView f0() {
        return (TextView) this.f15263p.getValue();
    }

    public final ValueAnimator g0() {
        return this.f15235J;
    }

    public final Drawable h0() {
        return (Drawable) this.f15242V.getValue();
    }

    public final Drawable i0() {
        return this.f15236K;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1(Message message) {
        final String obj;
        final String str;
        boolean z10;
        List<Channel.Department> i10;
        Intrinsics.checkNotNullParameter(message, "message");
        this.f15227B = message;
        v1();
        C1(r0(), this.f15264q);
        C1(r0(), this.f15267t);
        this.f15267t = null;
        this.f15264q = null;
        SalesIQChat salesIQChat = this.f15226A;
        if (salesIQChat != null) {
            Intrinsics.checkNotNull(salesIQChat);
            if (salesIQChat.getStatus() != 4 && message.isLastMessage() && message.getMeta() != null && message.isTyping() == null) {
                Boolean bool = Boolean.TRUE;
                int i11 = -2;
                float f10 = 1.5f;
                if (!Intrinsics.areEqual(bool, message.getMeta().isFormMessage())) {
                    if (message.getMeta().getSuggestions() != null) {
                        List<Object> suggestions = message.getMeta().getSuggestions();
                        if (!suggestions.isEmpty()) {
                            if (StringsKt.equals("VERTICAL", com.zoho.livechat.android.utils.P.i(d0()), true)) {
                                I();
                                L0().removeAllViews();
                                int size = suggestions.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    if (suggestions.get(i12) instanceof com.google.gson.internal.g) {
                                        Object obj2 = suggestions.get(i12);
                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.google.gson.internal.LinkedTreeMap<kotlin.String?, kotlin.Any?>");
                                        com.google.gson.internal.g gVar = (com.google.gson.internal.g) obj2;
                                        obj = String.valueOf(gVar.get("text"));
                                        str = String.valueOf(gVar.get(StackTraceHelper.ID_KEY));
                                    } else {
                                        obj = suggestions.get(i12).toString();
                                        str = "";
                                    }
                                    View inflate = p0().inflate(od.r.f60750M, (ViewGroup) null);
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(od.q.f60523f8);
                                    linearLayout.setLayoutParams(layoutParams);
                                    linearLayout.setBackground(com.zoho.livechat.android.utils.P.d(0, AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59803b0), 0.0f, 2, null), a1(), og.k.a(1.5f), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59808c0), 0.0f, 2, null)));
                                    RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(od.q.f60545h8);
                                    ((TextView) inflate.findViewById(od.q.f60534g8)).setText(obj);
                                    L0().addView(inflate);
                                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: ag.z
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            H.l1(H.this, obj, str, view);
                                        }
                                    });
                                }
                            } else {
                                J();
                                M0().setAdapter(new C1951n(suggestions));
                            }
                        }
                    }
                    if (message.getMeta().getInputCard() == null || message.getMeta().isSkippable() == null) {
                        C1(r0(), this.f15270w);
                        return;
                    }
                    if (!message.getMeta().isSkippable().booleanValue()) {
                        C1(r0(), this.f15270w);
                        return;
                    }
                    H0();
                    LinearLayout I02 = I0();
                    if (I02 != null) {
                        I02.setBackground(com.zoho.livechat.android.utils.P.d(0, AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59785X), 0.0f, 2, null), a1(), og.k.a(1.5f), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59789Y), 0.0f, 2, null)));
                    }
                    RelativeLayout J02 = J0();
                    if (J02 != null) {
                        J02.setOnClickListener(new View.OnClickListener() { // from class: ag.A
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                H.m1(H.this, view);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(bool, message.getMeta().isSkippable()) && message.getMeta().getCampaignSuggestions() == null) {
                    H0();
                    LinearLayout I03 = I0();
                    if (I03 != null) {
                        I03.setBackground(com.zoho.livechat.android.utils.P.d(0, AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59785X), 0.0f, 2, null), a1(), og.k.a(1.5f), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59789Y), 0.0f, 2, null)));
                    }
                    this.f15228C = true;
                    RelativeLayout J03 = J0();
                    if (J03 != null) {
                        J03.setOnClickListener(new View.OnClickListener() { // from class: ag.x
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                H.j1(H.this, view);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (message.getMeta().getSuggestions() == null) {
                    if (message.getMeta().getCampaignSuggestions() == null) {
                        C1(r0(), this.f15270w);
                        return;
                    }
                    C1(r0(), this.f15270w);
                    J();
                    M0().setAdapter(new C1939a(message.getMeta().getCampaignSuggestions()));
                    return;
                }
                C1(r0(), this.f15270w);
                SalesIQChat salesIQChat2 = this.f15226A;
                Intrinsics.checkNotNull(salesIQChat2);
                if (salesIQChat2.getStatus() != 5) {
                    SalesIQChat salesIQChat3 = this.f15226A;
                    Intrinsics.checkNotNull(salesIQChat3);
                    if (salesIQChat3.getStatus() != 6) {
                        z10 = false;
                        SalesIQChat salesIQChat4 = this.f15226A;
                        i10 = AbstractC3945n.i(z10, null, salesIQChat4 == null ? salesIQChat4.getConvID() : null);
                        Intrinsics.checkNotNullExpressionValue(i10, "getValidChatDepartments(...)");
                        if (i10.isEmpty()) {
                            if (!StringsKt.equals("VERTICAL", com.zoho.livechat.android.utils.P.i(d0()), true)) {
                                J();
                                M0().setAdapter(new C1950m(this, i10));
                                return;
                            }
                            I();
                            L0().removeAllViews();
                            for (final Channel.Department department : i10) {
                                View inflate2 = p0().inflate(od.r.f60756P, (ViewGroup) null);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i11);
                                LinearLayout linearLayout2 = (LinearLayout) inflate2.findViewById(od.q.f60591m4);
                                linearLayout2.setLayoutParams(layoutParams2);
                                int h10 = AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59827g), 0.0f, 2, null);
                                float a12 = a1();
                                int a10 = og.k.a(f10);
                                Context d02 = d0();
                                float f11 = f10;
                                Boolean isEngaged = department.isEngaged();
                                Boolean bool2 = Boolean.TRUE;
                                linearLayout2.setBackground(com.zoho.livechat.android.utils.P.d(0, h10, a12, a10, AbstractC5892d.h(d02, Integer.valueOf(Intrinsics.areEqual(isEngaged, bool2) ? AbstractC5886l.f59729J : Intrinsics.areEqual(department.isOnline(), bool2) ? AbstractC5886l.f59757Q : AbstractC5886l.f59753P), 0.0f, 2, null)));
                                LinearLayout linearLayout3 = (LinearLayout) inflate2.findViewById(od.q.f60621p4);
                                View findViewById = inflate2.findViewById(od.q.f60601n4);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setShape(1);
                                gradientDrawable.setColor(AbstractC5892d.h(d0(), Integer.valueOf(Intrinsics.areEqual(department.isEngaged(), bool2) ? AbstractC5886l.f59828g0 : Intrinsics.areEqual(department.isOnline(), bool2) ? AbstractC5886l.f59823f0 : AbstractC5886l.f59833h0), 0.0f, 2, null));
                                AbstractC2082d0.p0(findViewById, gradientDrawable);
                                ((TextView) inflate2.findViewById(od.q.f60611o4)).setText(LiveChatUtil.unescapeHtml(department.getName()));
                                L0().addView(inflate2);
                                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: ag.y
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        H.k1(H.this, department, view);
                                    }
                                });
                                f10 = f11;
                                i11 = -2;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                SalesIQChat salesIQChat42 = this.f15226A;
                i10 = AbstractC3945n.i(z10, null, salesIQChat42 == null ? salesIQChat42.getConvID() : null);
                Intrinsics.checkNotNullExpressionValue(i10, "getValidChatDepartments(...)");
                if (i10.isEmpty()) {
                }
            }
        }
        C1(r0(), this.f15270w);
    }

    public final int j0() {
        return AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59744M2), 0.0f, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (kotlin.collections.CollectionsKt.contains(r0, r3 != null ? r3.getMessageType() : null) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r0.length() != 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k0() {
        Message message;
        SalesIQChat salesIQChat;
        SalesIQChat salesIQChat2;
        SalesIQChat salesIQChat3;
        Message.Meta meta;
        Message.Meta.DisplayCard displayCard;
        Message.Attachment attachment;
        Integer rating;
        Message.Attachment attachment2;
        List list = this.f15253f;
        Message message2 = this.f15227B;
        String str = null;
        if (!CollectionsKt.contains(list, message2 != null ? message2.getMessageType() : null)) {
            List list2 = this.f15251d;
            Message message3 = this.f15227B;
        }
        Message message4 = this.f15227B;
        if ((message4 != null ? message4.getMessageType() : null) == Message.g.Feedback) {
            Message message5 = this.f15227B;
            if ((message5 != null ? message5.getAttachment() : null) != null) {
                Message message6 = this.f15227B;
                if (message6 != null && (attachment = message6.getAttachment()) != null && (rating = attachment.getRating()) != null && rating.intValue() == 0) {
                    Message message7 = this.f15227B;
                    String ratingMessage = (message7 == null || (attachment2 = message7.getAttachment()) == null) ? null : attachment2.getRatingMessage();
                    if (ratingMessage != null) {
                    }
                }
            }
            return true;
        }
        Message message8 = this.f15227B;
        if (message8 != null && (meta = message8.getMeta()) != null && (displayCard = meta.getDisplayCard()) != null) {
            str = displayCard.getImage();
        }
        if (str != null || ((message = this.f15227B) != null && message.isLastMessage() && (((salesIQChat = this.f15226A) != null && salesIQChat.getStatus() == 2) || (((salesIQChat2 = this.f15226A) != null && salesIQChat2.getStatus() == 6) || ((salesIQChat3 = this.f15226A) != null && salesIQChat3.getStatus() == 5))))) {
            Message message9 = this.f15227B;
            if (!(message9 != null ? Intrinsics.areEqual(message9.isTyping(), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    public final ViewGroup n0() {
        return this.f15269v;
    }

    public final void n1() {
        if (!(this instanceof K0)) {
            C1(r0(), this.f15265r);
            return;
        }
        RecyclerView recyclerView = this.f15265r;
        if (recyclerView != null) {
            F(this, r0(), recyclerView, null, 2, null);
        }
    }

    public cg.e o0() {
        return this.f15247a;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(Message message) {
        double u02;
        double d10;
        double u03;
        double d11;
        String thumbnailUrl;
        String str;
        Message.Meta.CardData cardData;
        Message.Meta.CardData.Value value;
        Message.Meta.DisplayCard displayCard;
        Message.Meta.DisplayCard.LinkInfo linkInfo;
        Message.Meta.DisplayCard displayCard2;
        String sender;
        if (message.getReplyTo() == null || Intrinsics.areEqual(message.isDeleted(), Boolean.TRUE) || message.getMessageType() == Message.g.InfoMessage) {
            E1();
            return;
        }
        ud.n y02 = y0();
        Message replyTo = message.getReplyTo();
        Unit unit = null;
        y02.f66338e.setText((LiveChatUtil.showVisitorName() || !((sender = replyTo.getSender()) == null || StringsKt.startsWith$default(sender, "$", false, 2, (Object) null))) ? Vf.b.i().a(replyTo.getDisplayName()) : d0().getString(od.t.f61127v1));
        MobilistenTextView mobilistenTextView = y02.f66337d;
        mobilistenTextView.setText(com.zoho.livechat.android.modules.messages.domain.entities.a.a(replyTo, mobilistenTextView.getTextSize()));
        og.p.w(y02.f66335b);
        int i10 = w1() ? AbstractC5886l.f59736K2 : AbstractC5886l.f59740L2;
        int i11 = C1952o.$EnumSwitchMapping$1[replyTo.getMessageType().ordinal()];
        if (i11 == 1) {
            if (og.i.e(replyTo.getAttachment())) {
                A1(z0(), replyTo.getAttachment(), replyTo.getExtras());
            } else {
                D1();
            }
            ImageView imageView = y02.f66335b;
            Drawable V10 = V();
            imageView.setImageDrawable(V10 != null ? AbstractC5893e.a(V10, AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null)) : null);
        } else if (i11 == 2) {
            Message.Extras extras = replyTo.getExtras();
            if (og.i.r(extras != null ? Long.valueOf(extras.getLocalFileSize()) : null) <= 0) {
                Message.Extras extras2 = replyTo.getExtras();
                String localFilePath = extras2 != null ? extras2.getLocalFilePath() : null;
                if (localFilePath == null) {
                    localFilePath = "";
                }
                if (new File(localFilePath).length() <= 0) {
                    D1();
                    ImageView imageView2 = y02.f66335b;
                    Drawable X10 = X();
                    imageView2.setImageDrawable(X10 != null ? AbstractC5893e.a(X10, AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null)) : null);
                }
            }
            if (replyTo.getAttachment() != null) {
                A1(z0(), replyTo.getAttachment(), replyTo.getExtras());
            } else {
                D1();
            }
            ImageView imageView22 = y02.f66335b;
            Drawable X102 = X();
            imageView22.setImageDrawable(X102 != null ? AbstractC5893e.a(X102, AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null)) : null);
        } else if (i11 == 3) {
            ImageView imageView3 = y02.f66335b;
            Message.Attachment attachment = message.getReplyTo().getAttachment();
            Drawable T02 = (attachment != null ? attachment.getAttachmentType() : null) == Message.Attachment.a.VoiceNote ? T0() : Y();
            imageView3.setImageDrawable(T02 != null ? AbstractC5893e.a(T02, AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null)) : null);
            D1();
        } else if (i11 == 4) {
            ImageView imageView4 = y02.f66335b;
            Drawable h02 = h0();
            imageView4.setImageDrawable(h02 != null ? AbstractC5893e.a(h02, AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null)) : null);
            D1();
        } else if (i11 != 5) {
            og.p.n(y02.f66335b);
            Message.Meta meta = replyTo.getMeta();
            if (meta == null || (displayCard2 = meta.getDisplayCard()) == null || (thumbnailUrl = displayCard2.getImage()) == null) {
                Message.Meta meta2 = replyTo.getMeta();
                thumbnailUrl = (meta2 == null || (displayCard = meta2.getDisplayCard()) == null || (linkInfo = displayCard.getLinkInfo()) == null) ? null : linkInfo.getThumbnailUrl();
                if (thumbnailUrl == null) {
                    Message.Meta meta3 = replyTo.getMeta();
                    if (meta3 == null || (cardData = meta3.getCardData()) == null || (value = cardData.getValue()) == null) {
                        str = null;
                        if (str != null) {
                            wd.d.K(z0(), str, null, false, false, null, null, null, null, null, false, null, 4092, null);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            D1();
                        }
                    } else {
                        thumbnailUrl = value.getImage();
                    }
                }
            }
            str = thumbnailUrl;
            if (str != null) {
            }
            if (unit == null) {
            }
        } else {
            ImageView imageView5 = y02.f66335b;
            Drawable U10 = U();
            imageView5.setImageDrawable(U10 != null ? AbstractC5893e.a(U10, AbstractC5892d.h(d0(), Integer.valueOf(i10), 0.0f, 2, null)) : null);
            D1();
        }
        MobilistenTextView textViewRepliedMessageSenderName = y02.f66338e;
        Intrinsics.checkNotNullExpressionValue(textViewRepliedMessageSenderName, "textViewRepliedMessageSenderName");
        p1(textViewRepliedMessageSenderName, message, replyTo, this);
        MobilistenTextView textViewRepliedMessage = y02.f66337d;
        Intrinsics.checkNotNullExpressionValue(textViewRepliedMessage, "textViewRepliedMessage");
        p1(textViewRepliedMessage, message, replyTo, this);
        if (this.f15237L != null) {
            MobilistenTextView mobilistenTextView2 = y0().f66338e;
            if (z1()) {
                u03 = F0();
                d11 = 0.6d;
            } else if (y1()) {
                u03 = F0();
                d11 = 0.65d;
            } else {
                u03 = u0();
                d11 = 0.5d;
            }
            mobilistenTextView2.setMaxWidth((int) (u03 * d11));
            return;
        }
        MobilistenTextView mobilistenTextView3 = y0().f66338e;
        if (z1()) {
            u02 = F0();
            d10 = 0.8d;
        } else if (y1()) {
            u02 = F0();
            d10 = 0.9d;
        } else {
            u02 = u0();
            d10 = 0.7d;
        }
        mobilistenTextView3.setMaxWidth((int) (u02 * d10));
    }

    public final Message q0() {
        return this.f15227B;
    }

    public final void q1(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        s1(this, message, false, null, 6, null);
    }

    public final ConstraintLayout r0() {
        return (ConstraintLayout) this.f15255h.getValue();
    }

    public void r1(Message message, boolean z10, ImageView imageView) {
        Message message2;
        Message.f status;
        Intrinsics.checkNotNullParameter(message, "message");
        Message.f.a aVar = Message.f.Companion;
        boolean z11 = aVar.b(message.getStatus()) || !((message2 = this.f15227B) == null || (status = message2.getStatus()) == null || !aVar.b(status));
        this.f15227B = message;
        if (x1()) {
            if (z11) {
                P1(message);
            }
            if (imageView == null) {
                imageView = s0();
            }
            ImageView imageView2 = imageView;
            og.p.n(K0());
            Drawable drawable = null;
            if (message.getHasComment() || !(message.getMessageType() == Message.g.Image || message.getMessageType() == Message.g.Video)) {
                int i10 = C1952o.$EnumSwitchMapping$0[message.getStatus().ordinal()];
                if (i10 == 1) {
                    drawable = Intrinsics.areEqual(message.isRead(), Boolean.TRUE) ? x0() : E0();
                } else if (i10 == 2 || i10 == 3 || i10 == 4) {
                    drawable = D0();
                }
            } else {
                int i11 = C1952o.$EnumSwitchMapping$0[message.getStatus().ordinal()];
                if (i11 == 1) {
                    drawable = Intrinsics.areEqual(message.isRead(), Boolean.TRUE) ? AbstractC5893e.a(x0(), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59855l2), 0.0f, 2, null)) : AbstractC5893e.a(E0(), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59865n2), 0.0f, 2, null));
                } else if (i11 == 2 || i11 == 3 || i11 == 4) {
                    drawable = AbstractC5893e.a(D0(), AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59860m2), 0.0f, 2, null));
                }
            }
            Drawable drawable2 = drawable;
            if (message.getStatus() != Message.f.Sent) {
                if (message.getStatus() != Message.f.WaitingForWms && message.getStatus() != Message.f.Sending && message.getStatus() != Message.f.Uploading) {
                    if (imageView2 != null) {
                        og.p.n(imageView2);
                    }
                    og.p.w(K0());
                    return;
                }
                if (imageView2 != null) {
                    og.p.w(imageView2);
                }
                if (imageView2 != null) {
                    imageView2.setContentDescription("Message sending");
                }
                if (imageView2 != null) {
                    imageView2.setImageDrawable(drawable2);
                    return;
                }
                return;
            }
            Boolean isDeleted = message.isDeleted();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(isDeleted, bool)) {
                if (imageView2 != null) {
                    og.p.n(imageView2);
                }
                og.p.n(K0());
                return;
            }
            if (!C6966g.h0(EnumC6745a.Read) || !Intrinsics.areEqual(message.isRead(), bool)) {
                if (imageView2 != null) {
                    og.p.w(imageView2);
                }
                if (imageView2 != null) {
                    imageView2.setContentDescription("Message sent");
                }
                if (imageView2 != null) {
                    imageView2.setImageDrawable(drawable2);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(this.f15236K, x0())) {
                return;
            }
            if (z10) {
                Intrinsics.checkNotNull(drawable2);
                K(imageView2, drawable2, 0.15f, 1.0f, 250, 180);
                return;
            }
            if (imageView2 != null) {
                og.p.w(imageView2);
            }
            if (imageView2 != null) {
                imageView2.setContentDescription("Message read");
            }
            if (imageView2 != null) {
                imageView2.setImageDrawable(drawable2);
            }
        }
    }

    public final ImageView s0() {
        return (ImageView) this.f15258k.getValue();
    }

    public final View.OnLongClickListener t0() {
        return (View.OnLongClickListener) this.f15230E.getValue();
    }

    public final void t1(final int i10) {
        if (getBindingAdapterPosition() == i10) {
            ValueAnimator a02 = a0();
            final View view = new View(d0());
            view.setId(od.q.f60481c);
            view.setLayoutParams(new ConstraintLayout.b(0, 0));
            view.setElevation(og.k.b(-1));
            F(this, r0(), view, null, 2, null);
            M();
            this.f15245Y = true;
            a02.setDuration(3000L);
            a02.setInterpolator(new DecelerateInterpolator());
            a02.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    H.u1(H.this, i10, view, valueAnimator);
                }
            });
            a02.addListener(new x(view));
            a02.start();
        }
    }

    public final int u0() {
        Integer valueOf = Integer.valueOf(C6963d.f68921i.i());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : MobilistenUtil.l() ? (C6218a.t() - C6218a.U()) - C6218a.G() : C6218a.t();
    }

    public final View v0() {
        View view = new View(d0());
        view.setId(od.q.f60583l6);
        F(this, r0(), view, null, 2, null);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = og.k.b(36);
        ((ViewGroup.MarginLayoutParams) bVar).height = og.k.b(28);
        view.setElevation(og.k.b(2));
        ViewGroup viewGroup = this.f15269v;
        if (viewGroup != null) {
            int id2 = viewGroup.getId();
            bVar.f18170l = id2;
            bVar.f18184s = id2;
            bVar.f18190v = id2;
            bVar.f18166j = id2;
        }
        view.setLayoutParams(bVar);
        View view2 = new View(d0());
        F(this, r0(), view2, null, 2, null);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        ViewGroup viewGroup2 = this.f15269v;
        if (viewGroup2 != null) {
            bVar2.f18166j = viewGroup2.getId();
        }
        ((ViewGroup.MarginLayoutParams) bVar2).height = og.k.b(20);
        bVar2.f18186t = 0;
        bVar2.f18190v = 0;
        view.setOnClickListener(new View.OnClickListener() { // from class: ag.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                H.o(H.this, view3);
            }
        });
        this.f15246Z = view;
        return view;
    }

    public final void v1() {
        ViewGroup.LayoutParams layoutParams = r0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, this.f15254g);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            r0().setLayoutParams(marginLayoutParams);
        }
    }

    public final AppCompatImageView w0() {
        AppCompatImageView appCompatImageView = this.f15249b1;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(d0());
        appCompatImageView2.setId(od.q.f60573k6);
        F(this, r0(), appCompatImageView2, null, 2, null);
        appCompatImageView2.setElevation(og.k.b(3));
        ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int b10 = og.k.b(18);
        ((ViewGroup.MarginLayoutParams) bVar).width = b10;
        ((ViewGroup.MarginLayoutParams) bVar).height = b10;
        int id2 = v0().getId();
        bVar.f18170l = id2;
        bVar.f18190v = id2;
        bVar.f18186t = id2;
        bVar.f18164i = id2;
        appCompatImageView2.setLayoutParams(bVar);
        this.f15249b1 = appCompatImageView2;
        return appCompatImageView2;
    }

    public final boolean w1() {
        return !x1();
    }

    public final Drawable x0() {
        return (Drawable) this.f15231F.getValue();
    }

    public final boolean x1() {
        Message message = this.f15227B;
        return og.i.i(message != null ? Boolean.valueOf(message.isRightAligned()) : null);
    }

    public final ud.n y0() {
        ud.n nVar = this.f15229D;
        if (nVar != null) {
            return nVar;
        }
        LayoutInflater p02 = p0();
        ViewGroup viewGroup = this.f15269v;
        Intrinsics.checkNotNull(viewGroup);
        ud.n b10 = ud.n.b(p02, viewGroup);
        b10.f66336c.setOnLongClickListener(t0());
        b10.f66336c.setOnClickListener(new View.OnClickListener() { // from class: ag.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                H.p(H.this, view);
            }
        });
        this.f15229D = b10;
        Intrinsics.checkNotNullExpressionValue(b10, "also(...)");
        return b10;
    }

    public final boolean y1() {
        Message message = this.f15227B;
        if ((message != null ? message.getMessageType() : null) != null) {
            Message message2 = this.f15227B;
            if (!(message2 != null ? Intrinsics.areEqual(message2.isDeleted(), Boolean.TRUE) : false)) {
                List list = this.f15251d;
                Message message3 = this.f15227B;
                if (CollectionsKt.contains(list, message3 != null ? message3.getMessageType() : null) || k0()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AppCompatImageView z0() {
        AppCompatImageView appCompatImageView = this.f15237L;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(d0());
        appCompatImageView2.setId(od.q.f60289J);
        F(this, this.f15269v, appCompatImageView2, null, 2, null);
        appCompatImageView2.setAdjustViewBounds(true);
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int b10 = og.k.b(4);
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = b10;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = b10;
        bVar.setMarginEnd(b10);
        bVar.f18130I = "W,1:1";
        bVar.f18144W = 1.0f;
        bVar.f18190v = y0().f66336c.getId();
        bVar.f18164i = y0().f66336c.getId();
        bVar.f18170l = y0().f66336c.getId();
        appCompatImageView2.setLayoutParams(bVar);
        y0().f66338e.setMaxWidth((int) ((z1() || y1()) ? F0() * 0.55d : u0() * 0.5d));
        ViewGroup.LayoutParams layoutParams2 = y0().f66338e.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f18188u = appCompatImageView2.getId();
        bVar2.f18190v = -1;
        y0().f66338e.setLayoutParams(bVar2);
        ViewGroup.LayoutParams layoutParams3 = y0().f66337d.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.f18188u = appCompatImageView2.getId();
        bVar3.f18190v = -1;
        y0().f66337d.setLayoutParams(bVar3);
        og.p.d(appCompatImageView2, b1(), null, 0, null, false, 30, null);
        this.f15237L = appCompatImageView2;
        return appCompatImageView2;
    }

    public final boolean z1() {
        Message message = this.f15227B;
        if ((message != null ? message.getMessageType() : null) != null) {
            Message message2 = this.f15227B;
            if (!(message2 != null ? Intrinsics.areEqual(message2.isDeleted(), Boolean.TRUE) : false)) {
                List list = this.f15252e;
                Message message3 = this.f15227B;
                if (CollectionsKt.contains(list, message3 != null ? message3.getMessageType() : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ H(View view, cg.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i10 & 2) != 0 ? null : eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(View itemView, cg.e eVar) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f15247a = eVar;
        List listOf = CollectionsKt.listOf((Object[]) new Message.g[]{Message.g.Image, Message.g.Video, Message.g.Audio});
        this.f15250c = listOf;
        List mutableList = CollectionsKt.toMutableList((Collection) listOf);
        mutableList.addAll(CollectionsKt.listOf((Object[]) new Message.g[]{Message.g.Location, Message.g.WidgetImage, Message.g.WidgetVideo, Message.g.WidgetLinks, Message.g.WidgetSingleProduct}));
        this.f15251d = mutableList;
        this.f15252e = CollectionsKt.listOf((Object[]) new Message.g[]{Message.g.File, Message.g.Article});
        this.f15253f = CollectionsKt.listOf((Object[]) new Message.g[]{Message.g.WidgetLocation, Message.g.WidgetCalendar, Message.g.WidgetInputDropdown, Message.g.WidgetDateTimeslots, Message.g.WidgetTimeslots, Message.g.WidgetInputEmail, Message.g.WidgetInputName, Message.g.WidgetInputUrl, Message.g.WidgetInputPassword, Message.g.WidgetInputTelephone, Message.g.WidgetSingleSelection, Message.g.WidgetMultiSelect, Message.g.WidgetStarRating, Message.g.WidgetHappinessRating, Message.g.WidgetLikeRating, Message.g.WidgetFileUpload, Message.g.WidgetSlider, Message.g.WidgetRangeSlider, Message.g.WidgetArticles, Message.g.InlineForm, Message.g.Feedback, Message.g.RequestLog});
        this.f15255h = LazyKt.lazy(new B(itemView, this));
        this.f15256i = LazyKt.lazy(new M(itemView, this));
        this.f15257j = LazyKt.lazy(new P(itemView));
        this.f15258k = LazyKt.lazy(new C(itemView));
        this.f15259l = LazyKt.lazy(new u(itemView));
        this.f15260m = LazyKt.lazy(new F(itemView));
        this.f15261n = LazyKt.lazy(new N(itemView));
        this.f15262o = LazyKt.lazy(new O(itemView));
        this.f15263p = LazyKt.lazy(new v(itemView));
        this.f15266s = LazyKt.lazy(new y());
        this.f15271x = LazyKt.lazy(new I(itemView));
        this.f15272y = LazyKt.lazy(new J(itemView));
        this.f15273z = LazyKt.lazy(new K(itemView, this));
        this.f15228C = true;
        this.f15230E = LazyKt.lazy(new D());
        this.f15231F = LazyKt.lazy(new E());
        this.f15232G = LazyKt.lazy(new C0324H());
        this.f15233H = LazyKt.lazy(new G());
        this.f15238O = LazyKt.lazy(new r());
        this.f15239P = LazyKt.lazy(new s());
        this.f15240R = LazyKt.lazy(new t());
        this.f15241T = LazyKt.lazy(new Q());
        this.f15242V = LazyKt.lazy(new w());
        this.f15243W = LazyKt.lazy(new C1954q());
    }

    public static final class x implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f15339b;

        public x(View view) {
            this.f15339b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            H h10 = H.this;
            h10.C1(h10.r0(), this.f15339b);
            H.this.f15245Y = false;
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
