package com.zoho.livechat.android.utils;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.graphics.AbstractC2074d;
import kotlin.jvm.functions.Function1;

/* renamed from: com.zoho.livechat.android.utils.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3937f extends LinkMovementMethod {

    /* renamed from: i, reason: collision with root package name */
    public static C3937f f44522i;

    /* renamed from: a, reason: collision with root package name */
    public int f44523a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f44524b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public ClickableSpan f44525c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44526d;

    /* renamed from: e, reason: collision with root package name */
    public d f44527e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44528f;

    /* renamed from: g, reason: collision with root package name */
    public e f44529g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0647f f44530h;

    /* renamed from: com.zoho.livechat.android.utils.f$a */
    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f44531a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClickableSpan f44532b;

        public a(TextView textView, ClickableSpan clickableSpan) {
            this.f44531a = textView;
            this.f44532b = clickableSpan;
        }

        @Override // com.zoho.livechat.android.utils.C3937f.d.a
        public void a() {
            C3937f.this.f44528f = true;
            this.f44531a.performHapticFeedback(0);
            C3937f.this.i(this.f44531a);
            C3937f.this.d(this.f44531a, this.f44532b);
        }
    }

    /* renamed from: com.zoho.livechat.android.utils.f$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public ClickableSpan f44534a;

        /* renamed from: b, reason: collision with root package name */
        public String f44535b;

        public b(ClickableSpan clickableSpan, String str) {
            this.f44534a = clickableSpan;
            this.f44535b = str;
        }

        public static b a(TextView textView, ClickableSpan clickableSpan) {
            String charSequence;
            Spanned spanned = (Spanned) textView.getText();
            if (clickableSpan instanceof URLSpan) {
                charSequence = ((URLSpan) clickableSpan).getURL();
            } else if (clickableSpan instanceof c) {
                charSequence = ((c) clickableSpan).a();
            } else {
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                charSequence = (spanStart < 0 || spanEnd < 0 || spanStart >= spanned.length() || spanEnd >= spanned.length()) ? "" : spanned.subSequence(spanStart, spanEnd).toString();
            }
            return new b(clickableSpan, charSequence);
        }

        public ClickableSpan b() {
            return this.f44534a;
        }

        public String c() {
            return this.f44535b;
        }
    }

    /* renamed from: com.zoho.livechat.android.utils.f$c */
    public static class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        public String f44536a;

        public c(String str) {
            this.f44536a = str;
        }

        public String a() {
            return this.f44536a;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }
    }

    /* renamed from: com.zoho.livechat.android.utils.f$d */
    public static final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public a f44537a;

        /* renamed from: com.zoho.livechat.android.utils.f$d$a */
        public interface a {
            void a();
        }

        public void a(a aVar) {
            this.f44537a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44537a.a();
        }
    }

    /* renamed from: com.zoho.livechat.android.utils.f$e */
    public interface e {
        boolean a(TextView textView, String str);
    }

    /* renamed from: com.zoho.livechat.android.utils.f$f, reason: collision with other inner class name */
    public interface InterfaceC0647f {
        boolean a(TextView textView, String str);
    }

    /* renamed from: com.zoho.livechat.android.utils.f$g */
    public static class g extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        public a f44538a;

        /* renamed from: b, reason: collision with root package name */
        public Function1 f44539b;

        /* renamed from: com.zoho.livechat.android.utils.f$g$a */
        public enum a {
            MORE,
            LESS
        }

        public g(a aVar, Function1 function1) {
            this.f44538a = aVar;
            this.f44539b = function1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            a aVar = this.f44538a;
            a aVar2 = a.MORE;
            if (aVar == aVar2) {
                this.f44539b.invoke(Boolean.TRUE);
                this.f44538a = a.LESS;
            } else {
                this.f44539b.invoke(Boolean.FALSE);
                this.f44538a = aVar2;
            }
        }
    }

    public static C3937f f() {
        if (f44522i == null) {
            f44522i = new C3937f();
        }
        return f44522i;
    }

    public final void b(TextView textView) {
        this.f44528f = false;
        this.f44525c = null;
        i(textView);
        h(textView);
    }

    public void c(TextView textView, ClickableSpan clickableSpan) {
        if (clickableSpan instanceof g) {
            clickableSpan.onClick(textView);
            return;
        }
        b a10 = b.a(textView, clickableSpan);
        e eVar = this.f44529g;
        if (eVar == null || !eVar.a(textView, a10.c())) {
            a10.b().onClick(textView);
        }
    }

    public void d(TextView textView, ClickableSpan clickableSpan) {
        b a10 = b.a(textView, clickableSpan);
        InterfaceC0647f interfaceC0647f = this.f44530h;
        if (interfaceC0647f == null || !interfaceC0647f.a(textView, a10.c())) {
            a10.b().onClick(textView);
        }
    }

    public ClickableSpan e(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y10 - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f10 = scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        this.f44524b.left = layout.getLineLeft(lineForVertical);
        this.f44524b.top = layout.getLineTop(lineForVertical);
        RectF rectF = this.f44524b;
        float lineWidth = layout.getLineWidth(lineForVertical);
        RectF rectF2 = this.f44524b;
        rectF.right = lineWidth + rectF2.left;
        rectF2.bottom = layout.getLineBottom(lineForVertical);
        if (this.f44524b.contains(f10, scrollY)) {
            for (Object obj : spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) {
                if (obj instanceof ClickableSpan) {
                    return (ClickableSpan) obj;
                }
            }
        }
        return null;
    }

    public void g(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        if (this.f44526d) {
            return;
        }
        this.f44526d = true;
        int spanStart = spannable.getSpanStart(clickableSpan);
        int spanEnd = spannable.getSpanEnd(clickableSpan);
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(AbstractC2074d.k(textView.getLinkTextColors().getDefaultColor(), 40));
        spannable.setSpan(backgroundColorSpan, spanStart, spanEnd, 18);
        textView.setTag(od.t.f61094p5, backgroundColorSpan);
        Selection.setSelection(spannable, spanStart, spanEnd);
    }

    public void h(TextView textView) {
        d dVar = this.f44527e;
        if (dVar != null) {
            textView.removeCallbacks(dVar);
            this.f44527e = null;
        }
    }

    public void i(TextView textView) {
        if (this.f44526d) {
            this.f44526d = false;
            Spannable spannable = (Spannable) textView.getText();
            spannable.removeSpan((BackgroundColorSpan) textView.getTag(od.t.f61094p5));
            Selection.removeSelection(spannable);
        }
    }

    public void j(e eVar) {
        this.f44529g = eVar;
    }

    public void k(InterfaceC0647f interfaceC0647f) {
        this.f44530h = interfaceC0647f;
    }

    public void l(TextView textView, d.a aVar) {
        d dVar = new d();
        this.f44527e = dVar;
        dVar.a(aVar);
        textView.postDelayed(this.f44527e, ViewConfiguration.getLongPressTimeout());
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (this.f44523a != textView.hashCode()) {
            this.f44523a = textView.hashCode();
            textView.setAutoLinkMask(0);
        }
        ClickableSpan e10 = e(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f44525c = e10;
        }
        boolean z10 = this.f44525c != null;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (e10 != null) {
                g(textView, e10, spannable);
            }
            if (z10 && this.f44530h != null) {
                l(textView, new a(textView, e10));
            }
        } else {
            if (action == 1) {
                if (!this.f44528f && z10 && e10 == this.f44525c) {
                    c(textView, e10);
                }
                b(textView);
                return z10;
            }
            if (action != 2) {
                if (action != 3) {
                    return false;
                }
                b(textView);
                return false;
            }
            if (e10 != this.f44525c) {
                h(textView);
            }
            if (!this.f44528f) {
                if (e10 != null) {
                    g(textView, e10, spannable);
                    return z10;
                }
                i(textView);
                return z10;
            }
        }
        return z10;
    }
}
