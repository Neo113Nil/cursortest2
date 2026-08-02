package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity;
import com.bytedance.sdk.openadsdk.common.fum;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tz {
    private boolean atb;
    private final com.bytedance.sdk.component.vy.qf dax;
    private boolean gpj;
    private ImageView hc;
    private boolean jr;
    private final Context kj;
    private View lo;
    private final String lu;
    private qf.pcc nac;
    private TextView of;
    private com.bytedance.sdk.openadsdk.core.wh.wh ork;
    nac pcc;
    private final of qf;
    private lo qy;
    TTAdDislikeToast sf;
    private ImageView tmg;
    private boolean tsz;
    private TextView tz;
    private ImageView vh;
    fum vj;
    private ImageView vy;
    private final RelativeLayout wh;
    private com.bytedance.sdk.openadsdk.core.wh.vj yt;
    final AtomicBoolean gm = new AtomicBoolean(false);
    final AtomicBoolean oo = new AtomicBoolean(false);
    private boolean fum = false;
    private String jsj = "TTTitleNewStyleManager";
    private final String mk = "is_new_style";
    private final int gbb = rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), 44.0f);

    public tz(Context context, RelativeLayout relativeLayout, of ofVar, com.bytedance.sdk.component.vy.qf qfVar, String str, boolean z) {
        boolean z2 = false;
        this.kj = context;
        this.wh = relativeLayout;
        this.qf = ofVar;
        this.dax = qfVar;
        this.lu = str;
        this.gpj = z;
        this.vj = new fum(context, this.gpj);
        this.tsz = str.equals("iab_private_browser") || str.equals("iab_landing_page") || str.equals("iab_history_landing_page");
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false) && str.equals("iab_landing_page")) {
            z2 = true;
        }
        this.atb = z2;
        vh();
        tmg();
    }

    private void gbb() {
        this.sf.show(TTAdDislikeToast.getDislikeTip());
    }

    private void hc() {
        try {
            if (this.pcc == null) {
                nac nacVar = new nac(this.kj, this.qf);
                this.pcc = nacVar;
                nacVar.setDislikeSource("landing_page");
                this.pcc.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.common.tz.3
                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(FilterWord filterWord) {
                        if (tz.this.oo.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        tz.this.oo.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void sf(View view) {
                        tz.this.gm.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(View view) {
                        tz.this.gm.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.wh.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.pcc);
            if (this.sf == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.kj);
                this.sf = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private boolean jr() {
        return this.kj.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void tmg() {
        View view = this.lo;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (tz.this.fum) {
                    tz.this.sf();
                    tz.this.fum = false;
                }
            }
        });
    }

    private void vh() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.wh.getLayoutParams();
        layoutParams.height = this.gbb;
        this.wh.setLayoutParams(layoutParams);
        int sf = rj.sf(this.kj, 8.0f);
        this.wh.setPadding(sf, 0, sf, 0);
        this.vy = (ImageView) this.wh.findViewById(com.bytedance.sdk.openadsdk.utils.nac.bbd);
        this.vh = (ImageView) this.wh.findViewById(com.bytedance.sdk.openadsdk.utils.nac.mua);
        this.tmg = (ImageView) this.wh.findViewById(com.bytedance.sdk.openadsdk.utils.nac.vo);
        this.hc = (ImageView) this.wh.findViewById(520093740);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = (com.bytedance.sdk.openadsdk.core.wh.vj) this.wh.findViewById(com.bytedance.sdk.openadsdk.utils.nac.pv);
        this.yt = vjVar;
        this.tz = (TextView) vjVar.findViewById(com.bytedance.sdk.openadsdk.utils.nac.pcc);
        this.of = (TextView) this.yt.findViewById(com.bytedance.sdk.openadsdk.utils.nac.sf);
        if (jr()) {
            this.tz.setTextDirection(4);
            this.of.setTextDirection(4);
            this.tz.setGravity(8388629);
            this.of.setGravity(8388629);
            this.vh.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.kj, "tt_titlebar_forward"));
            this.tmg.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.kj, "tt_titlebar_backward"));
        }
        boolean z = this.tsz;
        RelativeLayout relativeLayout = this.wh;
        if (z) {
            this.ork = (com.bytedance.sdk.openadsdk.core.wh.wh) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.nac.gqd);
        } else {
            this.ork = (com.bytedance.sdk.openadsdk.core.wh.wh) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.nac.qc);
        }
        this.tmg.setVisibility(0);
        this.vh.setVisibility(0);
        this.vy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (tz.this.dax != null) {
                    boolean z2 = tz.this.atb;
                    tz tzVar = tz.this;
                    if (z2) {
                        Bundle pcc = tzVar.pcc();
                        String vh = tz.this.qf.vh();
                        if (pcc == null || vh == null) {
                            mk.pcc(tz.this.dax);
                        } else {
                            com.bytedance.sdk.openadsdk.utils.fum.pcc(System.identityHashCode(tz.this.qf) + "_" + vh, tz.this.dax, pcc);
                        }
                    } else {
                        tzVar.dax.qf();
                        tz.this.dax.removeAllViews();
                        ViewGroup viewGroup = (ViewGroup) tz.this.dax.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(tz.this.dax);
                        }
                        tz.this.dax.jr();
                    }
                }
                if (tz.this.kj instanceof Activity) {
                    ((Activity) tz.this.kj).finish();
                }
            }
        });
        this.vh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (tz.this.dax == null || !tz.this.dax.kj()) {
                    return;
                }
                if (tz.this.nac != null) {
                    tz.this.nac.pcc();
                }
                tz.this.dax.vy();
            }
        });
        this.tmg.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (tz.this.dax == null || !tz.this.dax.ork()) {
                    return;
                }
                tz.this.dax.vh();
            }
        });
        this.hc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tz tzVar = tz.this;
                tzVar.pcc(tzVar.vj, view);
            }
        });
        pcc(true);
        this.vh.setClickable(false);
        this.tmg.setClickable(false);
        ImageView imageView = this.vh;
        int parseColor = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView.setColorFilter(parseColor, mode);
        this.tmg.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
        this.lo = this.wh;
    }

    public void gm() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.wh.getLayoutParams();
            final com.bytedance.sdk.component.vy.qf qfVar = this.dax;
            if (this.jr) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.gbb;
            if (i == i2) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i2, i2 / 2);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.12
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View view;
                        try {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            layoutParams.height = intValue;
                            tz.this.wh.setLayoutParams(layoutParams);
                            if (tz.this.tsz && (view = qfVar) != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                marginLayoutParams.topMargin = intValue;
                                qfVar.setLayoutParams(marginLayoutParams);
                            }
                            tz.this.wh.requestLayout();
                        } catch (Throwable unused) {
                            String unused2 = tz.this.jsj;
                        }
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        tz.this.jr = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        tz.this.jr = true;
                        tz.this.pcc(8);
                        tz.this.pcc(false);
                        tz.this.fum = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public String kj() {
        return this.of.getText().toString();
    }

    public void oo(final String str) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("iab_more_options", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.common.tz.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            @Nullable
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("iab_more_options").sf(jSONObject.toString());
            }
        });
    }

    public void ork() {
        if (this.oo.get()) {
            gbb();
            return;
        }
        if (this.pcc == null) {
            hc();
        }
        nac nacVar = this.pcc;
        if (nacVar != null) {
            nacVar.pcc();
        }
    }

    public void pcc(boolean z) {
        if (this.tz == null || this.of == null) {
            return;
        }
        String charSequence = wh().getText().toString();
        String replaceAll = TextUtils.isEmpty(charSequence) ? " " : charSequence.replaceAll("[\n\r]+", " ");
        String charSequence2 = vy().getText().toString();
        this.tz.setText(replaceAll);
        this.of.setText(charSequence2);
        TextView textView = this.tz;
        if (z) {
            textView.setVisibility(0);
            com.bytedance.sdk.openadsdk.core.wh.vj vjVar = this.yt;
            if (vjVar != null) {
                ViewGroup.LayoutParams layoutParams = vjVar.getLayoutParams();
                layoutParams.width = -2;
                this.yt.setLayoutParams(layoutParams);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.wh.getLayoutParams();
            layoutParams2.height = this.gbb;
            this.wh.setLayoutParams(layoutParams2);
            return;
        }
        textView.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = this.yt;
        if (vjVar2 != null) {
            ViewGroup.LayoutParams layoutParams3 = vjVar2.getLayoutParams();
            layoutParams3.width = -1;
            this.yt.setLayoutParams(layoutParams3);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.wh.getLayoutParams();
        layoutParams4.height = this.gbb / 2;
        this.wh.setLayoutParams(layoutParams4);
    }

    public String qf() {
        return this.tz.getText().toString();
    }

    public void sf() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.wh.getLayoutParams();
            final com.bytedance.sdk.component.vy.qf qfVar = this.dax;
            if (this.jr) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.gbb;
            if (i == i2 / 2) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i2 / 2, i2);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.10
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        View view;
                        try {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            layoutParams.height = intValue;
                            tz.this.wh.setLayoutParams(layoutParams);
                            if (tz.this.tsz && (view = qfVar) != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                marginLayoutParams.topMargin = intValue;
                                qfVar.setLayoutParams(marginLayoutParams);
                            }
                            tz.this.wh.requestLayout();
                        } catch (Throwable unused) {
                            String unused2 = tz.this.jsj;
                        }
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.tz.11
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NonNull Animator animator) {
                        tz.this.jr = false;
                        tz.this.pcc(0);
                        tz.this.pcc(true);
                        tz.this.fum = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NonNull Animator animator) {
                        tz.this.jr = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NonNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NonNull Animator animator) {
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public ImageView vj() {
        return this.vy;
    }

    public TextView vy() {
        return this.of;
    }

    public TextView wh() {
        return this.tz;
    }

    public com.bytedance.sdk.openadsdk.core.wh.wh oo() {
        return this.ork;
    }

    public String gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void sf(String str) {
        String gm = gm(str);
        TextView textView = this.of;
        if (!TextUtils.isEmpty(gm)) {
            str = gm;
        }
        textView.setText(str);
    }

    public Bundle pcc() {
        if (this.dax == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        WebView webView = this.dax.getWebView();
        if (webView == null) {
            return null;
        }
        bundle.putString("mainTitle", qf());
        bundle.putString("subTitle", kj());
        RelativeLayout relativeLayout = this.wh;
        bundle.putBoolean("titleBarVisible", relativeLayout != null && relativeLayout.getVisibility() == 0);
        bundle.putString("url", webView.getUrl());
        webView.saveState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final fum fumVar, View view) {
        fumVar.setOnMenuItemClickListener(new fum.pcc() { // from class: com.bytedance.sdk.openadsdk.common.tz.9
            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
            public void gm() {
                ClipboardManager clipboardManager;
                if (tz.this.tsz) {
                    String url = tz.this.dax.getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) tz.this.kj.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                    tz.this.oo("onSelectCopyLink");
                    fumVar.pcc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
            public void oo() {
                com.bytedance.sdk.component.vy.qf qfVar;
                if (!tz.this.tsz || (qfVar = tz.this.dax) == null) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = qfVar.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.sf.pcc(tz.this.kj, intent, null);
                }
                tz.this.oo("onSelectOpenInBrowser");
                fumVar.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
            public void pcc() {
                if (tz.this.tsz) {
                    if (tz.this.qf != null) {
                        com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(tz.this.qf);
                    }
                    if (tz.this.kj instanceof Activity) {
                        Intent intent = new Intent(tz.this.kj, (Class<?>) TTHistoryActivity.class);
                        intent.putExtra("meta_index", atb.pcc().pcc(tz.this.qf));
                        intent.putExtra("is_new_style", tz.this.tsz);
                        com.bytedance.sdk.component.utils.sf.pcc(tz.this.kj, intent, null);
                    }
                    tz.this.oo("onSelectHistory");
                    fumVar.pcc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
            public void sf() {
                com.bytedance.sdk.component.vy.qf qfVar;
                if (!tz.this.tsz || (qfVar = tz.this.dax) == null || qfVar.getUrl() == null) {
                    return;
                }
                if (tz.this.ork != null) {
                    tz.this.ork.setVisibility(0);
                    tz.this.ork.setProgress(0);
                }
                qfVar.qf();
                String url = qfVar.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    qfVar.a_(url);
                }
                tz.this.oo("onSelectRetry");
                fumVar.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
            public void vj() {
                boolean z = tz.this.gpj;
                tz tzVar = tz.this;
                if (!z) {
                    tzVar.ork();
                } else if (tzVar.tsz) {
                    if (tz.this.qy == null) {
                        tz.this.qy = new lo(tz.this.kj);
                        tz.this.qy.pcc(tz.this.qf);
                        tz.this.qy.setCanceledOnTouchOutside(false);
                    }
                    tz.this.qy.show();
                }
                tz.this.oo("onSelectReport");
                fumVar.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
            public void wh() {
                if (tz.this.gpj || !com.bytedance.sdk.openadsdk.utils.sf.wh()) {
                    return;
                }
                IABLandingPageActivity.pcc(tz.this.kj, tz.this.qf, kun.pcc(tz.this.qf));
                tz.this.oo("onSelectPrivacy");
                fumVar.pcc();
            }
        });
        fumVar.pcc(view);
    }

    public void pcc(String str) {
        this.tz.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i) {
        ImageView imageView = this.vy;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.vh;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
        ImageView imageView3 = this.tmg;
        if (imageView3 != null) {
            imageView3.setVisibility(i);
        }
        ImageView imageView4 = this.hc;
        if (imageView4 != null) {
            imageView4.setVisibility(i);
        }
    }

    public void pcc(WebView webView, qf.pcc pccVar) {
        this.nac = pccVar;
        try {
            if (this.vh != null) {
                boolean canGoBack = webView.canGoBack();
                ImageView imageView = this.vh;
                if (canGoBack) {
                    imageView.setClickable(true);
                    this.vh.clearColorFilter();
                } else {
                    imageView.setClickable(false);
                    this.vh.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.tmg != null) {
                boolean canGoForward = webView.canGoForward();
                ImageView imageView2 = this.tmg;
                if (canGoForward) {
                    imageView2.setClickable(true);
                    this.tmg.clearColorFilter();
                } else {
                    imageView2.setClickable(false);
                    this.tmg.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
