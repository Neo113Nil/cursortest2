package com.vk.clips.design.view.component.description;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.movika.sdk.base.logic.processor.actions.d;
import com.vkontakte.android.R;
import defpackage.q0;
import kotlin.LazyThreadSafetyMode;
import xsna.cut0;
import xsna.epx;
import xsna.gzs;
import xsna.h20;
import xsna.jjc;
import xsna.m7;
import xsna.mk5;
import xsna.msy;
import xsna.ndd;
import xsna.nh3;
import xsna.s3q0;
import xsna.tlo0;
import xsna.x7g;
import xsna.zmp0;

/* compiled from: ClipDescription.kt */
/* loaded from: classes16.dex */
public final class ClipDescription extends NestedScrollView {
    public static final /* synthetic */ int M = 0;
    public a H;
    public boolean I;
    public final b J;
    public final Object K;
    public final Object L;

    /* compiled from: ClipDescription.kt */
    public static final class a {
        public static final a f;
        public final tlo0 a;
        public final cut0 b;
        public final tlo0 c;
        public final gzs<s3q0> d;
        public final boolean e;

        static {
            tlo0.Companion.getClass();
            f = new a(tlo0.c.a, null, null, null, false);
        }

        public a(tlo0 tlo0Var, x7g x7gVar, tlo0.h hVar, nh3 nh3Var, boolean z) {
            this.a = tlo0Var;
            this.b = x7gVar;
            this.c = hVar;
            this.d = nh3Var;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            cut0 cut0Var = this.b;
            int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
            tlo0 tlo0Var = this.c;
            int hashCode3 = (hashCode2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            gzs<s3q0> gzsVar = this.d;
            return Boolean.hashCode(this.e) + ((hashCode3 + (gzsVar != null ? gzsVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(text=");
            sb.append(this.a);
            sb.append(", textColor=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            sb.append(this.c);
            sb.append(", onClick=");
            sb.append(this.d);
            sb.append(", isExpanded=");
            return q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ClipDescription.kt */
    public final class b implements View.OnTouchListener {
        public float b;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            ClipDescription clipDescription = ClipDescription.this;
            if (action == 0) {
                clipDescription.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 1) {
                clipDescription.getParent().requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                clipDescription.getParent().requestDisallowInterceptTouchEvent(clipDescription.canScrollVertically((int) (this.b - motionEvent.getY())));
            }
            this.b = motionEvent.getY();
            return false;
        }
    }

    public ClipDescription(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.H = a.f;
        this.I = true;
        this.J = new b();
        h20 h20Var = new h20(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.K = msy.a(lazyThreadSafetyMode, h20Var);
        this.L = msy.a(lazyThreadSafetyMode, new d(this, 14));
        LayoutInflater.from(context).inflate(R.layout.clip_description, (ViewGroup) this, true);
        setOverScrollMode(2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkLinkedText getDescriptionView() {
        return (VkLinkedText) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ndd getTransitionDelegate() {
        return (ndd) this.K.getValue();
    }

    private final void setupDescription(a aVar) {
        VkLinkedText descriptionView = getDescriptionView();
        descriptionView.setText(aVar.a.a(descriptionView.getContext()));
        cut0 cut0Var = aVar.b;
        descriptionView.setTextColor(cut0Var != null ? cut0Var.b(descriptionView.getContext()) : 0);
        tlo0 tlo0Var = aVar.c;
        descriptionView.setContentDescription(tlo0Var != null ? tlo0Var.a(descriptionView.getContext()) : null);
        jjc.g(descriptionView, new m7(aVar, 26));
    }

    public final a getConfig() {
        return this.H;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.I && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I && super.onTouchEvent(motionEvent);
    }

    public final void setConfig(a aVar) {
        if (epx.f(this.H, aVar)) {
            return;
        }
        this.H = aVar;
        getDescriptionView().setOnTouchListener(aVar.e ? this.J : null);
        if (isAttachedToWindow()) {
            setupDescription(aVar);
            return;
        }
        ndd transitionDelegate = getTransitionDelegate();
        com.vk.clips.design.view.component.description.a aVar2 = new com.vk.clips.design.view.component.description.a(this);
        ViewGroup viewGroup = transitionDelegate.a;
        zmp0.b(viewGroup);
        mk5 mk5Var = new mk5();
        mk5Var.a(new ndd.a(aVar2));
        zmp0.a(viewGroup, mk5Var);
        setupDescription(aVar);
        s3q0 s3q0Var = s3q0.a;
    }
}
