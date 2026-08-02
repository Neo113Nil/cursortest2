package com.vk.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.b;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.bpn0;
import xsna.e3m;
import xsna.f2v0;
import xsna.iah0;
import xsna.iut0;
import xsna.jjc;
import xsna.q01;
import xsna.qku0;

@Deprecated
/* loaded from: classes17.dex */
public class VkLinkedTextView extends AppCompatTextView implements b.a {
    public final b b;
    public final f2v0 c;
    public boolean d;

    public VkLinkedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b();
        bVar.g = false;
        bVar.i = iah0.a(3.0f);
        bVar.e = this;
        Paint paint = new Paint();
        bVar.b = paint;
        if (!bVar.g) {
            bVar.f = new GestureDetector(getContext(), bVar);
        }
        paint.setAntiAlias(true);
        paint.setPathEffect(new CornerPathEffect(bVar.i));
        this.b = bVar;
        f2v0 f2v0Var = new f2v0(this);
        this.c = f2v0Var;
        this.d = false;
        setDrawingCacheEnabled(false);
        iut0.q(this, f2v0Var);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.c.d.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(Canvas canvas) {
        try {
            boolean z = this.d;
            b bVar = this.b;
            if (z) {
                bVar.b(canvas);
                super.onDraw(canvas);
            } else {
                super.onDraw(canvas);
                bVar.b(canvas);
            }
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("parent=");
            sb.append(getClass().getSimpleName());
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            View view = (View) getParent();
            sb.append(view == null ? "null" : view.getId() == -1 ? "NO_ID" : view.getContext().getResources().getResourceName(view.getId()));
            sb.append(", view=");
            sb.append(getId() != -1 ? getContext().getResources().getResourceName(getId()) : "NO_ID");
            L.i(new Exception(sb.toString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VkLinkedTextView vkLinkedTextView;
        b bVar = this.b;
        VkLinkedTextView vkLinkedTextView2 = bVar.e;
        GestureDetector gestureDetector = bVar.f;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        int i = 1;
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            Layout layout = vkLinkedTextView2.getLayout();
            if (layout != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= layout.getLineCount()) {
                        i2 = -1;
                        break;
                    }
                    vkLinkedTextView2.getLineBounds(i2, rect);
                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    CharSequence text = vkLinkedTextView2.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        qku0[] qku0VarArr = (qku0[]) spanned.getSpans(0, spanned.length() - 1, qku0.class);
                        if (qku0VarArr.length > 0) {
                            int length = qku0VarArr.length;
                            int i3 = 0;
                            while (i3 < length) {
                                qku0 qku0Var = qku0VarArr[i3];
                                int spanStart = spanned.getSpanStart(qku0Var);
                                int spanEnd = spanned.getSpanEnd(qku0Var);
                                int lineForOffset = layout.getLineForOffset(spanStart);
                                boolean z = i;
                                int lineForOffset2 = layout.getLineForOffset(spanEnd);
                                int lineEnd = layout.getLineEnd(layout.getLineCount() - 1);
                                if (i2 < lineForOffset || i2 > lineForOffset2 || spanStart >= lineEnd) {
                                    vkLinkedTextView = vkLinkedTextView2;
                                } else {
                                    if (i2 == lineForOffset) {
                                        vkLinkedTextView = vkLinkedTextView2;
                                        if ((motionEvent.getX() - vkLinkedTextView2.getPaddingLeft()) - 0 < layout.getPrimaryHorizontal(spanStart)) {
                                            continue;
                                        }
                                    } else {
                                        vkLinkedTextView = vkLinkedTextView2;
                                    }
                                    if (spanEnd >= lineEnd || i2 != lineForOffset2 || (motionEvent.getX() - vkLinkedTextView.getPaddingLeft()) - 0 <= layout.getPrimaryHorizontal(spanEnd)) {
                                        bVar.c = new Path();
                                        bVar.d = qku0Var;
                                        qku0Var.getClass();
                                        bVar.b.setColor((qku0Var.e.intValue() & 16777215) | 855638016);
                                        for (int i4 = lineForOffset; i4 <= lineForOffset2; i4++) {
                                            Rect rect2 = new Rect();
                                            layout.getLineBounds(i4, rect2);
                                            if (i4 == lineForOffset) {
                                                rect2.left = Math.round(layout.getPrimaryHorizontal(spanStart));
                                            } else {
                                                rect2.left = Math.round(layout.getPrimaryHorizontal(layout.getLineStart(i4)));
                                            }
                                            if (i4 == lineForOffset2) {
                                                rect2.right = Math.round(layout.getPrimaryHorizontal(spanEnd));
                                            } else {
                                                rect2.right = Math.round(layout.getPrimaryHorizontal(layout.getLineEnd(i4) - 1));
                                            }
                                            rect2.inset(iah0.a(-2.0f), iah0.a(-2.0f));
                                            bVar.c.addRect(new RectF(rect2), Path.Direction.CW);
                                        }
                                        bVar.c.offset(vkLinkedTextView.getPaddingLeft(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        vkLinkedTextView.invalidate();
                                        return z;
                                    }
                                }
                                i3++;
                                i = z ? 1 : 0;
                                vkLinkedTextView2 = vkLinkedTextView;
                            }
                        }
                    }
                }
            }
            return !super.onTouchEvent(motionEvent);
        }
        VkLinkedTextView vkLinkedTextView3 = vkLinkedTextView2;
        if (motionEvent.getAction() == i && bVar.d != null) {
            if (!jjc.e()) {
                bVar.e.playSoundEffect(0);
                VkLinkedTextView vkLinkedTextView4 = bVar.e;
                if (e3m.h(vkLinkedTextView4.getContext()) == null) {
                    b.a(vkLinkedTextView4.getView());
                }
                bVar.d.a();
                q01 q01Var = bVar.h;
                if (q01Var != null) {
                    q01Var.onClick(vkLinkedTextView4.getView());
                }
                jjc.d().a();
            }
            bVar.c = null;
            bVar.d = null;
            vkLinkedTextView3.invalidate();
        } else if (motionEvent.getAction() == 3) {
            bVar.c = null;
            bVar.d = null;
            vkLinkedTextView3.invalidate();
        }
        if (!super.onTouchEvent(motionEvent)) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (IllegalStateException e) {
            L.i(e);
            return false;
        }
    }

    public void setCanShowMessageOptions(boolean z) {
        b bVar = this.b;
        bVar.g = z;
        if (bVar.f == null) {
            bVar.f = new GestureDetector(bVar.e.getContext(), bVar);
        }
    }

    public void setDrawHighlightInBackground(boolean z) {
        this.d = z;
    }

    public void setHighlightCornerRadius(float f) {
        this.b.i = f;
    }

    public void setOnLinkClickListener(View.OnClickListener onClickListener) {
        bpn0 bpn0Var = jjc.a;
        this.b.h = new q01(onClickListener, 2);
    }

    @Override // com.vk.core.view.b.a
    public View getView() {
        return this;
    }
}
