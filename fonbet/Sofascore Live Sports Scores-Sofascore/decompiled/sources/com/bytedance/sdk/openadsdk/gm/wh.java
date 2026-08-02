package com.bytedance.sdk.openadsdk.gm;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends ScrollView {
    private final ork pcc;
    private final com.bytedance.sdk.openadsdk.core.wh.vj sf;

    public wh(Context context, ork orkVar) {
        super(context);
        this.pcc = orkVar;
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        this.sf = vjVar;
        vjVar.setOrientation(1);
        addView(vjVar, new FrameLayout.LayoutParams(-1, -2));
        if (orkVar.kj() == 0) {
            pcc();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private static List<FilterWord> gm(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).hasSecondOptions()) {
                i2 = i3;
            }
        }
        if (i2 != -1 && i2 <= list.size()) {
            i = i2;
        }
        FilterWord filterWord = list.get(i);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    private void pcc() {
        if (this.pcc.kj() != 0) {
            return;
        }
        this.pcc.pcc(rj.gm(getContext()), rj.vj(getContext()));
    }

    private void sf(List<FilterWord> list) {
        this.sf.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                this.sf.addView(new qf(getContext(), filterWord, this.pcc));
            }
            if (i < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int sf = rj.sf(getContext(), this.pcc.vy() ? 16.0f : 8.0f);
                layoutParams.topMargin = sf;
                layoutParams.bottomMargin = sf;
                this.sf.addView(new vh(getContext()), layoutParams);
            }
        }
    }

    public void pcc(List<FilterWord> list) {
        List<FilterWord> gm = gm(list);
        if (gm == null) {
            return;
        }
        sf(gm);
    }
}
