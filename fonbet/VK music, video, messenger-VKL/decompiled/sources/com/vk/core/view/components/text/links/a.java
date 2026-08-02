package com.vk.core.view.components.text.links;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.an10;
import xsna.e3m;
import xsna.hbh0;
import xsna.i0q0;
import xsna.jjc;
import xsna.l2v0;
import xsna.n8g;
import xsna.s3q0;
import xsna.zwt0;

/* compiled from: VkClickableLinksDelegate.kt */
/* loaded from: classes17.dex */
public class a implements GestureDetector.OnGestureListener {
    public final InterfaceC0867a b;
    public final Paint c;
    public final Path d;
    public l2v0 e;
    public GestureDetector f;
    public boolean g;
    public View.OnClickListener h;
    public float i;
    public int j;
    public final Rect k;
    public final RectF l;

    /* compiled from: VkClickableLinksDelegate.kt */
    /* renamed from: com.vk.core.view.components.text.links.a$a, reason: collision with other inner class name */
    public interface InterfaceC0867a {
        void a(RectF rectF, float f);

        Context getContext();

        Layout getLayout();

        int getLineBounds(int i, Rect rect);

        int getPaddingLeft();

        int getPaddingTop();

        CharSequence getText();

        View getView();

        void invalidate();

        void playSoundEffect(int i);
    }

    public a(InterfaceC0867a interfaceC0867a) {
        this.b = interfaceC0867a;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Path();
        this.i = hbh0.a(interfaceC0867a.getContext(), 3.0f);
        this.j = Integer.MAX_VALUE;
        this.k = new Rect();
        this.l = new RectF();
        if (!this.g) {
            this.f = new GestureDetector(interfaceC0867a.getContext(), this, i0q0.a());
        }
        paint.setAntiAlias(true);
        paint.setPathEffect(new CornerPathEffect(this.i));
    }

    public final void a(Canvas canvas) {
        l2v0 l2v0Var;
        Path path = this.d;
        if (path.isEmpty() || (l2v0Var = this.e) == null || !l2v0Var.e()) {
            return;
        }
        float paddingTop = this.b.getPaddingTop();
        int save = canvas.save();
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paddingTop);
        try {
            canvas.drawPath(path, this.c);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (((r2.getX() - r6.getPaddingLeft()) - 0) < r7.getPrimaryHorizontal(r13)) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent) {
        int i;
        l2v0 l2v0Var;
        int spanStart;
        int spanEnd;
        int lineForOffset;
        int lineForOffset2;
        Spanned spanned;
        GestureDetector gestureDetector = this.f;
        MotionEvent motionEvent2 = motionEvent;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent2);
        }
        int action = motionEvent2.getAction();
        Path path = this.d;
        boolean z = true;
        InterfaceC0867a interfaceC0867a = this.b;
        if (action == 0) {
            Rect rect = this.k;
            rect.setEmpty();
            Layout layout = interfaceC0867a.getLayout();
            if (layout != null) {
                int i2 = 0;
                while (i2 < layout.getLineCount() && i2 < this.j) {
                    interfaceC0867a.getLineBounds(i2, rect);
                    if (rect.contains((int) motionEvent2.getX(), (int) motionEvent2.getY())) {
                        break;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 != -1) {
                    CharSequence text = interfaceC0867a.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        int length = spanned2.length();
                        if (spanned2.nextSpanTransition(-1, length, l2v0.class) < length) {
                            l2v0[] l2v0VarArr = (l2v0[]) spanned2.getSpans(0, spanned2.length() - 1, l2v0.class);
                            int length2 = l2v0VarArr.length - 1;
                            if (length2 >= 0) {
                                while (true) {
                                    int i3 = length2 - 1;
                                    l2v0Var = l2v0VarArr[length2];
                                    spanStart = spanned2.getSpanStart(l2v0Var);
                                    spanEnd = spanned2.getSpanEnd(l2v0Var);
                                    lineForOffset = layout.getLineForOffset(spanStart);
                                    i = z;
                                    lineForOffset2 = layout.getLineForOffset(spanEnd);
                                    int lineEnd = layout.getLineEnd(layout.getLineCount() - 1);
                                    if (i2 >= lineForOffset && i2 <= lineForOffset2 && spanStart < lineEnd) {
                                        if (i2 == lineForOffset) {
                                            spanned = spanned2;
                                        } else {
                                            spanned = spanned2;
                                        }
                                        if (spanEnd >= lineEnd || i2 != lineForOffset2 || (motionEvent.getX() - interfaceC0867a.getPaddingLeft()) - 0 <= layout.getPrimaryHorizontal(spanEnd)) {
                                            break;
                                        }
                                    } else {
                                        spanned = spanned2;
                                    }
                                    if (i3 < 0) {
                                        break;
                                    }
                                    motionEvent2 = motionEvent;
                                    length2 = i3;
                                    z = i == true ? 1 : 0;
                                    spanned2 = spanned;
                                }
                                path.reset();
                                this.e = l2v0Var;
                                this.c.setColor(n8g.l(l2v0Var.getColor(), 51));
                                if (lineForOffset <= lineForOffset2) {
                                    int i4 = lineForOffset;
                                    while (true) {
                                        rect.setEmpty();
                                        layout.getLineBounds(i4, rect);
                                        if (i4 == lineForOffset) {
                                            rect.left = an10.b(layout.getPrimaryHorizontal(spanStart));
                                        } else {
                                            rect.left = an10.b(layout.getPrimaryHorizontal(layout.getLineStart(i4)));
                                        }
                                        if (i4 == lineForOffset2) {
                                            rect.right = an10.b(layout.getPrimaryHorizontal(spanEnd));
                                        } else {
                                            rect.right = an10.b(layout.getPrimaryHorizontal(layout.getLineEnd(i4) - 1));
                                        }
                                        float a = hbh0.a(interfaceC0867a.getContext(), -2.0f);
                                        RectF rectF = this.l;
                                        rectF.set(rect);
                                        rectF.inset(a, a);
                                        interfaceC0867a.a(rectF, a);
                                        path.addRect(rectF, Path.Direction.CW);
                                        if (i4 == lineForOffset2) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                path.offset(interfaceC0867a.getPaddingLeft(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                interfaceC0867a.invalidate();
                                return i;
                            }
                        }
                    }
                }
            }
            return false;
        }
        i = 1;
        if (motionEvent.getAction() != i || this.e == null) {
            if (motionEvent.getAction() != 3) {
                return false;
            }
            path.reset();
            this.e = null;
            interfaceC0867a.invalidate();
            return false;
        }
        if (!jjc.e()) {
            interfaceC0867a.playSoundEffect(0);
            Activity h = e3m.h(interfaceC0867a.getContext());
            if (h == null) {
                View view = interfaceC0867a.getView();
                h = view != null ? zwt0.a(view) : null;
            }
            l2v0 l2v0Var2 = this.e;
            if (l2v0Var2 != null) {
                l2v0Var2.f(h, interfaceC0867a.getView());
            }
            View.OnClickListener onClickListener = this.h;
            if (onClickListener != null) {
                onClickListener.onClick(interfaceC0867a.getView());
            }
            s3q0 s3q0Var = s3q0.a;
            jjc.d().a();
        }
        path.reset();
        this.e = null;
        interfaceC0867a.invalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        l2v0 l2v0Var = this.e;
        String i = l2v0Var == null ? null : l2v0Var.i();
        if (!this.g || TextUtils.isEmpty(i)) {
            return;
        }
        l2v0 l2v0Var2 = this.e;
        InterfaceC0867a interfaceC0867a = this.b;
        l2v0Var2.a(interfaceC0867a.getContext(), interfaceC0867a.getView());
        this.d.reset();
        this.e = null;
        interfaceC0867a.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* compiled from: VkClickableLinksDelegate.kt */
    public static abstract class b implements InterfaceC0867a {
        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final int getPaddingLeft() {
            return 0;
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final int getPaddingTop() {
            return 0;
        }

        @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
        public final void a(RectF rectF, float f) {
        }
    }
}
