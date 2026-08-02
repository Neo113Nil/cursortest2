package com.bytedance.adsdk.sf.gm.gm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.sf.lo;
import com.bytedance.adsdk.sf.ork;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends oo {
    private LinearLayout kj;
    private final List<String> ork;
    private String tmg;
    private final List<TextView> vh;
    private final LinearLayout.LayoutParams vy;

    public gm(com.bytedance.adsdk.sf.vy vyVar, vj vjVar, Context context) {
        super(vyVar, vjVar);
        List<ork.pcc> gm;
        this.vy = new LinearLayout.LayoutParams(-2, -2);
        this.ork = new ArrayList();
        this.vh = new ArrayList();
        com.bytedance.adsdk.sf.ork orkVar = ((oo) this).qf;
        if (orkVar == null || (gm = orkVar.gm()) == null || gm.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.kj = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        sf(gm.get(0).qf);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.kj.addView(linearLayout2);
        List<String> tmg = tmg();
        while (i < gm.size()) {
            ork.pcc pccVar = gm.get(i);
            TextView textView = new TextView(context);
            pcc(textView, pccVar, (tmg == null || i >= tmg.size()) ? "" : tmg.get(i));
            int i2 = pccVar.wh;
            if (i2 != 0) {
                this.vy.bottomMargin = (int) (com.bytedance.adsdk.sf.wh.wh.pcc() * i2);
                linearLayout2.addView(textView, this.vy);
            } else {
                linearLayout2.addView(textView);
            }
            i++;
        }
        float pcc = com.bytedance.adsdk.sf.wh.wh.pcc();
        pcc(this.kj, (int) (((oo) this).qf.pcc() * pcc), (int) (((oo) this).qf.sf() * pcc));
    }

    private void gm(float f) {
        List<ork.pcc> gm;
        com.bytedance.adsdk.sf.ork orkVar = ((oo) this).qf;
        if (orkVar == null || (gm = orkVar.gm()) == null || gm.size() <= 0) {
            return;
        }
        this.kj.setOrientation(0);
        this.kj.setGravity(17);
        if (this.kj.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.kj.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.kj.removeAllViews();
        if (linearLayout.getChildCount() != gm.size()) {
            return;
        }
        List<String> tmg = tmg();
        this.vh.clear();
        int i = 0;
        while (i < gm.size()) {
            ork.pcc pccVar = gm.get(i);
            TextView textView = (TextView) linearLayout.getChildAt(i);
            this.vh.add(textView);
            pcc(textView, pccVar, (tmg == null || i >= tmg.size()) ? "" : tmg.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < gm.size(); i2++) {
            ork.pcc pccVar2 = gm.get(i2);
            TextView textView2 = this.vh.get(i2);
            textView2.setAlpha(f);
            linearLayout.setAlpha(f);
            int i3 = pccVar2.wh;
            if (i3 != 0) {
                this.vy.bottomMargin = (int) (com.bytedance.adsdk.sf.wh.wh.pcc() * i3);
                linearLayout.addView(textView2, this.vy);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.kj.setAlpha(f);
        this.kj.addView(linearLayout);
        float pcc = com.bytedance.adsdk.sf.wh.wh.pcc();
        pcc(this.kj, (int) (((oo) this).qf.pcc() * pcc), (int) (((oo) this).qf.sf() * pcc));
    }

    private void pcc(TextView textView, ork.pcc pccVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(pccVar.gm)) {
            textView.setTextColor(Color.parseColor(pccVar.gm));
        }
        if (!TextUtils.isEmpty(pccVar.oo)) {
            textView.setBackgroundColor(Color.parseColor(pccVar.oo));
        }
        textView.setGravity(17);
        textView.setTextSize(pccVar.vj);
    }

    private void sf(String str) {
        if (TextUtils.isEmpty(str)) {
            this.kj.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals("left")) {
            this.kj.setGravity(3);
        } else if (str.equals("right")) {
            this.kj.setGravity(5);
        } else {
            this.kj.setGravity(17);
        }
    }

    private List<String> tmg() {
        com.bytedance.adsdk.sf.vy vyVar;
        lo yt;
        List<ork.pcc> gm;
        if (((oo) this).qf == null || (vyVar = this.sf) == null || (yt = vyVar.yt()) == null) {
            return null;
        }
        String oo = ((oo) this).qf.oo();
        if ((!TextUtils.isEmpty(oo) || !TextUtils.isEmpty(this.tmg)) && (gm = ((oo) this).qf.gm()) != null) {
            String str = this.tmg;
            if (TextUtils.isEmpty(str)) {
                str = yt.pcc(oo);
            }
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                this.ork.clear();
                for (int i = 0; i < gm.size(); i++) {
                    ork.pcc pccVar = gm.get(i);
                    int i2 = pccVar.pcc;
                    int i3 = pccVar.sf;
                    if (i2 < 0) {
                        i2 = Math.max(i2 + length, 0);
                    }
                    if (i3 < 0) {
                        i3 = Math.max(i3 + length, 0);
                    }
                    if (i2 + i3 > length) {
                        this.ork.add("");
                    } else {
                        if (gm.size() == 1 && i2 == 0 && i3 == 0) {
                            i3 = length;
                        }
                        this.ork.add(str.substring(i2, i3 + i2));
                    }
                }
                return this.ork;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.oo, com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        if (this.kj != null) {
            canvas.save();
            canvas.concat(matrix);
            pcc(i);
            gm(wh());
            this.kj.draw(canvas);
            canvas.restore();
            return;
        }
        super.sf(canvas, matrix, i);
    }

    private static void pcc(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void pcc(String str) {
        this.tmg = str;
    }
}
