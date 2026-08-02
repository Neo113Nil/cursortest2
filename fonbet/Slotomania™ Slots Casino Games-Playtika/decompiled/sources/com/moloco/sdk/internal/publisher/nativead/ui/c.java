package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c extends RelativeLayout {
    public static final a a = new a(null);
    public static final int b = 0;
    public static final int c = 16;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ c(Context context, Uri uri, y yVar, Function0 function0, r rVar, h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, yVar, function0, (i & 16) != 0 ? a.h.a.f() : rVar, (i & 32) != 0 ? j.a() : hVar);
    }

    public static final void a(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static final Unit a(h hVar, a.AbstractC0383a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        hVar.a(button);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Uri imageUri, y watermark, final Function0<Unit> function0, r externalLinkHandler, final h buttonTracker) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        ImageView imageView = new ImageView(context);
        imageView.setImageURI(imageUri);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.c$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.a(Function0.this, view);
            }
        });
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b(externalLinkHandler, context, null, 0, 12, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        bVar.setPadding(16, 0, 0, 16);
        bVar.setOnButtonRenderedListener(new Function1() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.c$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a(h.this, (a.AbstractC0383a.c) obj);
            }
        });
        bVar.setLayoutParams(layoutParams);
        watermark.a(imageView);
        addView(imageView);
        addView(bVar);
    }
}
