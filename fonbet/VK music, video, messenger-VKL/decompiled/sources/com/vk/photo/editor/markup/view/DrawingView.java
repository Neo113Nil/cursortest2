package com.vk.photo.editor.markup.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fcl;
import xsna.hr9;
import xsna.izs;
import xsna.j5g;
import xsna.jio;
import xsna.k760;
import xsna.kif0;
import xsna.s3q0;
import xsna.tlo;
import xsna.uap;
import xsna.vap;
import xsna.vlo;
import xsna.xlo;
import xsna.yap;
import xsna.z860;

/* compiled from: DrawingView.kt */
/* loaded from: classes4.dex */
public class DrawingView extends ViewGroup {
    public static final /* synthetic */ int h = 0;
    public hr9 b;
    public vlo c;
    public tlo<?> d;
    public boolean e;
    public z860 f;
    public izs<? super vlo, s3q0> g;

    /* compiled from: DrawingView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<uap, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(uap uapVar) {
            ((DrawingView) this.receiver).a(uapVar);
            return s3q0.a;
        }
    }

    public DrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void a(uap uapVar) {
        vlo vloVar = this.c;
        this.c = vlo.a(vloVar, j5g.v0(uapVar, vloVar.a));
        if (uapVar instanceof jio) {
            this.b.e((jio) uapVar);
        }
        invalidate();
    }

    public final void b(vlo vloVar) {
        this.c = vloVar;
        if (isLaidOut()) {
            this.c = xlo.f(vloVar, getWidth(), getHeight());
        }
        this.b.b(this.c);
        invalidate();
    }

    public final void c(boolean z) {
        tlo<?> tloVar;
        if (z && (tloVar = this.d) != null) {
            tloVar.finish();
        }
        this.d = null;
        invalidate();
    }

    public final vlo d() {
        return vlo.b(this.c, null, 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.b.a(canvas);
        tlo<?> tloVar = this.d;
        if (tloVar != null) {
            tloVar.a(canvas);
        }
    }

    public final <E extends uap> void e(yap<E> yapVar, vap<E, ? extends uap> vapVar) {
        tlo<?> tloVar = this.d;
        if (tloVar != null) {
            tloVar.finish();
        }
        this.d = new k760(yapVar, vapVar, this.b, new a(1, this, DrawingView.class, "addElement", "addElement(Lcom/vk/photo/editor/markup/element/api/Element;)V", 0), this.f);
    }

    public final hr9 getCanvasHolder() {
        return this.b;
    }

    public final tlo<?> getDrawingSession() {
        return this.d;
    }

    public final z860 getDrawingSessionTouchListener() {
        return this.f;
    }

    public final vlo getDrawingState() {
        return this.c;
    }

    public final izs<vlo, s3q0> getOnViewResized() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - i, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4 - i2, Integer.MIN_VALUE);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        izs<? super vlo, s3q0> izsVar;
        this.b.init(i, i2);
        vlo f = xlo.f(this.c, i, i2);
        this.c = f;
        if (!f.a.isEmpty() && (izsVar = this.g) != null) {
            izsVar.invoke(this.c);
        }
        this.b.b(this.c);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            return false;
        }
        tlo<?> tloVar = this.d;
        if (tloVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        tloVar.d(motionEvent);
        invalidate();
        return true;
    }

    public final void setCanvasHolder(hr9 hr9Var) {
        this.b = hr9Var;
    }

    public final void setDrawingSession(tlo<?> tloVar) {
        this.d = tloVar;
    }

    public final void setDrawingSessionTouchListener(z860 z860Var) {
        this.f = z860Var;
    }

    public final void setDrawingState(vlo vloVar) {
        this.c = vloVar;
    }

    public final void setOnViewResized(izs<? super vlo, s3q0> izsVar) {
        this.g = izsVar;
    }

    public final void setTouchesEnabled(boolean z) {
        this.e = z;
    }

    public /* synthetic */ DrawingView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public DrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new fcl();
        this.c = new vlo((kif0) null, 3);
    }
}
