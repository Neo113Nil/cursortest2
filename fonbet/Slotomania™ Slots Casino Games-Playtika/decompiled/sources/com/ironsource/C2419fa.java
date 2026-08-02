package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC2616qa;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2419fa extends WebView implements InterfaceC2633ra {
    private InterfaceC2616qa a;
    private Pc b;

    public /* synthetic */ C2419fa(Context context, InterfaceC2616qa interfaceC2616qa, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC2616qa.a(0, 1, null) : interfaceC2616qa);
    }

    @Override // com.ironsource.InterfaceC2633ra
    public void a(String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC2616qa interfaceC2616qa = this.a;
        InterfaceC2616qa interfaceC2616qa2 = null;
        if (interfaceC2616qa == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC2616qa = null;
        }
        if (!interfaceC2616qa.a()) {
            InterfaceC2616qa interfaceC2616qa3 = this.a;
            if (interfaceC2616qa3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC2616qa3 = null;
            }
            interfaceC2616qa3.a(this);
        }
        InterfaceC2616qa interfaceC2616qa4 = this.a;
        if (interfaceC2616qa4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC2616qa2 = interfaceC2616qa4;
        }
        interfaceC2616qa2.a(script);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent event) {
        Pc pc;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4 && (pc = this.b) != null && pc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2419fa(Context context, InterfaceC2616qa javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.a = javascriptEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419fa(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Pc pc) {
        this.b = pc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419fa(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a() {
        this.b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419fa(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
