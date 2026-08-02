package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.facebook.internal.n0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e extends FrameLayout {
    public final t0 a;
    public final ImageButton b;
    public Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t0 t0Var, Context context) {
        super(context, null, 0);
        t0Var.getClass();
        context.getClass();
        this.a = t0Var;
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(new FrameLayout.LayoutParams((int) (context.getResources().getDisplayMetrics().density * 12.0f), (int) (12.0f * context.getResources().getDisplayMetrics().density)));
        imageButton.setImageResource(R.drawable.info_badge);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new n0(this, 1));
        this.b = imageButton;
        addView(imageButton);
        imageButton.setContentDescription("Ad Badge");
        imageButton.setTag("Ad Badge");
    }

    @NotNull
    public final ImageButton getAdButton() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float f = getResources().getDisplayMetrics().density;
            ImageButton imageButton = this.b;
            imageButton.getLocationOnScreen(new int[2]);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.g, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(r4[0] / f, r4[1] / f), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(imageButton.getWidth() / f, imageButton.getHeight() / f));
            Function1 function1 = this.c;
            if (function1 != null) {
                function1.invoke(dVar);
            }
        }
    }

    public final void setOnButtonRenderedListener(@NotNull Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    public final void setPrivacyUrl(@NotNull final String str) {
        str.getClass();
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.this.a.a(str);
            }
        });
    }
}
