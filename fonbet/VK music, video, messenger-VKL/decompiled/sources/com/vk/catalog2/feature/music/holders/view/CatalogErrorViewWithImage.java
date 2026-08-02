package com.vk.catalog2.feature.music.holders.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.holders.view.a;
import com.vk.core.view.components.button.VkButton;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.android.defaultplayer.control.d;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vkontakte.android.R;
import defpackage.e;
import defpackage.i;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.bpn0;
import xsna.d3m;
import xsna.gzs;
import xsna.jai;
import xsna.nh3;
import xsna.s3q0;
import xsna.wcj;
import xsna.x16;
import xsna.x4a;

/* compiled from: CatalogErrorViewWithImage.kt */
/* loaded from: classes16.dex */
public final class CatalogErrorViewWithImage extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final bpn0 b;
    public final ComposeView c;
    public final LinearLayout d;
    public final VKImageView e;
    public final TextView f;
    public final TextView g;
    public final VkButton h;
    public gzs<s3q0> i;

    public CatalogErrorViewWithImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new bpn0(new e(this, 13));
        LayoutInflater.from(context).inflate(R.layout.vk_catalog_error_with_image_screen, (ViewGroup) this, true);
        this.d = (LinearLayout) findViewById(R.id.error_default_config_container);
        this.e = (VKImageView) findViewById(R.id.error_image);
        this.f = (TextView) findViewById(R.id.error_text);
        TextView textView = (TextView) findViewById(R.id.error_retry);
        this.g = textView;
        this.h = (VkButton) findViewById(R.id.error_action_button);
        this.c = (ComposeView) findViewById(R.id.error_compose_config_container);
        textView.setOnClickListener(new x16(this, 1));
    }

    public static s3q0 a(a aVar, CatalogErrorViewWithImage catalogErrorViewWithImage, androidx.compose.runtime.a aVar2, int i) {
        if (aVar2.t(i & 1, (i & 3) != 2)) {
            if (b.d()) {
                b.f(943970743, i, -1, "com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage.setupErrorView.<anonymous>.<anonymous> (CatalogErrorViewWithImage.kt:77)");
            }
            KidsModeRestrictionRenderer.Source source = KidsModeRestrictionRenderer.Source.ADULT_CONTENT;
            boolean J = aVar2.J(aVar) | aVar2.y(catalogErrorViewWithImage);
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new nh3(2, aVar, catalogErrorViewWithImage);
                aVar2.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean y = aVar2.y(catalogErrorViewWithImage);
            Object x2 = aVar2.x();
            if (y || x2 == c0012a) {
                x2 = new i(catalogErrorViewWithImage, 13);
                aVar2.R(x2);
            }
            KidsModeRestrictionRenderer.b.a(source, gzsVar, (gzs) x2, catalogErrorViewWithImage.getKidsModeRestrictionRenderer(), aVar2, 6);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }

    private final KidsModeRestrictionRenderer getKidsModeRestrictionRenderer() {
        return (KidsModeRestrictionRenderer) this.b.getValue();
    }

    public final void setOnRetryClickListener(gzs<s3q0> gzsVar) {
        this.i = gzsVar;
    }

    public final void setupErrorView(a aVar) {
        boolean z = aVar instanceof a.b;
        awt0.u(this.d, z);
        boolean z2 = aVar instanceof a.C0522a;
        ComposeView composeView = this.c;
        awt0.u(composeView, z2);
        if (!z) {
            if (!z2) {
                throw new NoWhenBranchMatchedException();
            }
            composeView.setContent(new jai(-133132974, new x4a(0, aVar, this), true));
            return;
        }
        a.b bVar = (a.b) aVar;
        this.e.setImageResource(bVar.a);
        d3m.c(this.e, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        TextView textView = this.f;
        textView.setText(textView.getContext().getString(bVar.b));
        d3m.c(this.f, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        TextView textView2 = this.g;
        textView2.setText(textView2.getContext().getString(bVar.c));
        d3m.c(this.g, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Integer num = bVar.d;
        VkButton vkButton = this.h;
        if (num != null) {
            vkButton.setText(num.intValue());
            d3m.c(this.h, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        wcj wcjVar = bVar.e;
        if (wcjVar != null) {
            vkButton.setOnClickListener(new d(1, wcjVar, this));
        }
        d3m.c(this.g, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
