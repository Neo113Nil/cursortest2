package com.plaid.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.plaid.link.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3795y2 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f41199a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final P5 f41200b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f41201c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f41202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3795y2(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41199a = LazyKt.lazy(new C3768v2(this));
        P5 p52 = new P5(context);
        this.f41200b = p52;
        this.f41201c = LazyKt.lazy(new C3786x2(this));
        this.f41202d = LazyKt.lazy(new C3777w2(this));
        if ((getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        View.inflate(context, R.layout.plaid_link_embedded_view, this);
        ((FrameLayout) findViewById(R.id.embedded_webview_container)).addView(p52);
    }

    @NotNull
    public final ProgressBar getProgressBar$link_sdk_release() {
        Object value = this.f41199a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ProgressBar) value;
    }

    @NotNull
    public final View getRetryButton$link_sdk_release() {
        Object value = this.f41202d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    @NotNull
    public final View getRetryContainer$link_sdk_release() {
        Object value = this.f41201c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    @NotNull
    public final P5 getWebView$link_sdk_release() {
        return this.f41200b;
    }
}
