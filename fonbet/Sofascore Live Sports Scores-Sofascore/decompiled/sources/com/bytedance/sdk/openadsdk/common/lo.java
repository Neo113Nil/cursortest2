package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo extends Dialog {
    private static final String[] sf = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private String gm;
    private TextView oo;
    private final Handler pcc;
    private Button vj;
    private ImageView wh;

    public lo(@NonNull Context context) {
        super(context, com.bytedance.sdk.component.utils.tz.wh(context, "tt_privacy_dialog_theme_ad_report"));
        this.pcc = new Handler(Looper.getMainLooper());
        this.gm = "";
    }

    private View pcc(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        vjVar.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_ad_report_info_bg"));
        vjVar.setOrientation(1);
        vjVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(context);
        qfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, pcc(44.0f)));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(pcc(191.0f), pcc(24.0f));
        layoutParams2.addRule(13);
        kjVar.setGravity(17);
        kjVar.setText("Ad Report");
        kjVar.setTextColor(Color.parseColor("#161823"));
        kjVar.setTextSize(1, 17.0f);
        kjVar.setLayoutParams(layoutParams2);
        this.wh = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(pcc(40.0f), pcc(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = pcc(8.0f);
        this.wh.setPadding(pcc(12.0f), pcc(14.0f), pcc(12.0f), pcc(14.0f));
        this.wh.setImageResource(com.bytedance.sdk.component.utils.tz.oo(context, "tt_ad_xmark"));
        this.wh.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, pcc(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = pcc(16.0f);
        layoutParams5.rightMargin = pcc(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(pcc(16.0f));
        layoutParams5.setMarginEnd(pcc(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        vjVar2.setOrientation(1);
        vjVar2.setLayoutParams(layoutParams6);
        String wh = kun.wh();
        String kj = kun.kj();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.wh.vj pcc = pcc(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.wh.vj pcc2 = pcc(context, "App", wh);
        com.bytedance.sdk.openadsdk.core.wh.vj pcc3 = pcc(context, "App version", kj);
        com.bytedance.sdk.openadsdk.core.wh.vj pcc4 = pcc(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.wh.vj pcc5 = pcc(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.wh.vj pcc6 = pcc(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, pcc(76.0f));
        vjVar3.setBackgroundColor(-1);
        vjVar3.setLayoutParams(layoutParams7);
        this.vj = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int pcc7 = pcc(16.0f);
        layoutParams8.setMargins(pcc7, pcc7, pcc7, pcc7);
        this.vj.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_ad_report_info_button_bg"));
        this.vj.setText("copy all");
        this.vj.setTextColor(Color.parseColor("#333333"));
        this.vj.setTextSize(14.0f);
        this.vj.setLayoutParams(layoutParams8);
        vjVar.addView(qfVar);
        qfVar.addView(kjVar);
        qfVar.addView(this.wh);
        vjVar.addView(view);
        vjVar.addView(scrollView);
        scrollView.addView(vjVar2);
        vjVar2.addView(pcc);
        vjVar2.addView(pcc2);
        vjVar2.addView(pcc3);
        vjVar2.addView(pcc4);
        vjVar2.addView(pcc5);
        vjVar2.addView(pcc6);
        vjVar.addView(vjVar3);
        vjVar3.addView(this.vj);
        return vjVar;
    }

    private void sf() {
        final String wh = kun.wh();
        final String kj = kun.kj();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.lo.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) lo.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, wh, kj, str, str2, lo.this.gm};
                    for (int i = 0; i < lo.sf.length; i++) {
                        sb.append(lo.sf[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.wh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.lo.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                lo.this.oo.setText("loading ...");
                lo.this.cancel();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pcc(getContext()), new ViewGroup.LayoutParams(rj.gm(getContext()), (int) (rj.vj(getContext()) * 0.9d)));
        sf();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.pcc.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lo.3
                @Override // java.lang.Runnable
                public void run() {
                    boolean isEmpty = TextUtils.isEmpty(lo.this.gm);
                    lo loVar = lo.this;
                    if (isEmpty) {
                        loVar.oo.setText("");
                    } else {
                        lo.this.oo.setText(lo.this.gm.substring(0, Math.min(loVar.gm.length(), 100)));
                    }
                }
            }, 1000L);
        } catch (Exception e) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    public void pcc(of ofVar) {
        try {
            this.gm = com.bytedance.sdk.component.utils.pcc.pcc(ofVar.fgl()).toString();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTPrivacyAdReportDialog", th.getMessage());
        }
    }

    private com.bytedance.sdk.openadsdk.core.wh.vj pcc(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : pcc(74.0f));
        vjVar.setOrientation(1);
        vjVar.setPadding(0, pcc(16.0f), 0, pcc(16.0f));
        vjVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = pcc(7.0f);
        kjVar.setIncludeFontPadding(false);
        kjVar.setText(str);
        kjVar.setTextColor(Color.parseColor("#333333"));
        kjVar.setTextSize(16.0f);
        kjVar.setTypeface(Typeface.defaultFromStyle(1));
        kjVar.setLayoutParams(layoutParams2);
        vjVar.addView(kjVar);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        if (str.equals("Creative info")) {
            this.oo = kjVar2;
            kjVar2.setMaxLines(2);
            kjVar2.setEllipsize(TextUtils.TruncateAt.END);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        kjVar2.setIncludeFontPadding(false);
        kjVar2.setTextColor(Color.parseColor("#666666"));
        kjVar2.setText(str2);
        kjVar2.setTextSize(14.0f);
        kjVar2.setLayoutParams(layoutParams3);
        vjVar.addView(kjVar2);
        return vjVar;
    }

    private int pcc(float f) {
        return rj.sf(getContext(), f);
    }
}
