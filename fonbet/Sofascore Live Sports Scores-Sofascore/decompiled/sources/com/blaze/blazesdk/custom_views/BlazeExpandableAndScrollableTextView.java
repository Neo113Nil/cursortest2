package com.blaze.blazesdk.custom_views;

import android.content.Context;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.unity3d.services.UnityAdsConstants;
import defpackage.avl;
import defpackage.hz8;
import defpackage.jtd;
import defpackage.n4m;
import defpackage.osm;
import defpackage.qx1;
import defpackage.r4;
import defpackage.zyl;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/custom_views/BlazeExpandableAndScrollableTextView;", "Lcom/blaze/blazesdk/custom_views/BlazeTextView;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeExpandableAndScrollableTextView extends BlazeTextView implements GestureDetector.OnGestureListener {
    public static final /* synthetic */ int s = 0;
    public SpannableString h;
    public osm i;
    public final int j;
    public final int k;
    public final GestureDetector l;
    public Function1 m;
    public Function0 n;
    public Function0 o;
    public final int p;
    public final int q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlazeExpandableAndScrollableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.j = 2;
        this.k = 10;
        this.p = -1;
        this.q = 1;
        try {
            setMaxLines(2);
            setEllipsize(TextUtils.TruncateAt.END);
            GestureDetector gestureDetector = new GestureDetector(context, this);
            gestureDetector.setIsLongpressEnabled(false);
            this.l = gestureDetector;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void setupView$default(BlazeExpandableAndScrollableTextView blazeExpandableAndScrollableTextView, osm osmVar, String str, Function1 function1, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            function02 = null;
        }
        blazeExpandableAndScrollableTextView.getClass();
        osmVar.getClass();
        str.getClass();
        function1.getClass();
        blazeExpandableAndScrollableTextView.i = osmVar;
        blazeExpandableAndScrollableTextView.h = blazeExpandableAndScrollableTextView.g(str);
        blazeExpandableAndScrollableTextView.m = function1;
        blazeExpandableAndScrollableTextView.n = function0;
        blazeExpandableAndScrollableTextView.o = function02;
        blazeExpandableAndScrollableTextView.h();
    }

    public final SpannableString g(String str) {
        try {
            Spanned fromHtml = Html.fromHtml(URLDecoder.decode(str, StandardCharsets.UTF_8.toString()), 0, new qx1(), null);
            fromHtml.getClass();
            SpannableString spannableString = new SpannableString(fromHtml);
            r4 P = hz8.P((URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class));
            while (P.hasNext()) {
                URLSpan uRLSpan = (URLSpan) P.next();
                spannableString.setSpan(new zyl(this, uRLSpan.getURL()), fromHtml.getSpanStart(uRLSpan), fromHtml.getSpanEnd(uRLSpan), 33);
                spannableString.removeSpan(uRLSpan);
            }
            return spannableString;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new SpannableString("");
        }
    }

    public final void h() {
        osm osmVar = this.i;
        if (osmVar != null) {
            n4m n4mVar = (n4m) osmVar;
            if (n4mVar.v) {
                setMovementMethod(ScrollingMovementMethod.getInstance());
                setMaxLines(this.k);
                setEllipsize(null);
                jtd.a(this, new avl(this, this, n4mVar.w));
            } else {
                setMovementMethod(null);
                setMaxLines(this.j);
                scrollTo(0, 0);
                setEllipsize(TextUtils.TruncateAt.END);
            }
            setText(this.h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (canScrollVertically(r2.q) != false) goto L14;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.r = true;
        try {
            osm osmVar = this.i;
            if (osmVar != null && ((n4m) osmVar).v) {
                if (!canScrollVertically(this.p)) {
                }
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return true;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        motionEvent2.getClass();
        if (this.r) {
            try {
                z = !canScrollVertically(f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.p : this.q);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                z = true;
            }
            if (z) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.r = false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        int max = Math.max(0, layout.getHeight() - getHeight());
        osm osmVar = this.i;
        if (osmVar != null) {
            ((n4m) osmVar).w = max > 0 ? getScrollY() / max : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int action;
        motionEvent.getClass();
        try {
            Layout layout = getLayout();
            if (layout != null) {
                CharSequence text = getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned != null && ((action = motionEvent.getAction()) == 0 || action == 1)) {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY()), (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX());
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    clickableSpanArr.getClass();
                    if (clickableSpanArr.length != 0) {
                        if (action == 1) {
                            clickableSpanArr[0].onClick(this);
                        }
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        osm osmVar = this.i;
        if (osmVar != null) {
            ((n4m) osmVar).v = !r8.v;
        }
        h();
        osm osmVar2 = this.i;
        if (osmVar2 != null) {
            if (((n4m) osmVar2).v) {
                Function0 function0 = this.n;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                Function0 function02 = this.o;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0004, B:5:0x000b, B:8:0x0017, B:10:0x001b, B:11:0x001e, B:13:0x0022, B:15:0x0028, B:20:0x0015), top: B:2:0x0004 }] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        osm osmVar;
        motionEvent.getClass();
        try {
            if (motionEvent.getAction() != 1) {
                if (motionEvent.getAction() == 3) {
                }
                gestureDetector = this.l;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
                osmVar = this.i;
                if (osmVar == null && ((n4m) osmVar).v) {
                    return super.onTouchEvent(motionEvent);
                }
                return true;
            }
            this.r = false;
            gestureDetector = this.l;
            if (gestureDetector != null) {
            }
            osmVar = this.i;
            if (osmVar == null) {
            }
            return true;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeExpandableAndScrollableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BlazeExpandableAndScrollableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeExpandableAndScrollableTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
