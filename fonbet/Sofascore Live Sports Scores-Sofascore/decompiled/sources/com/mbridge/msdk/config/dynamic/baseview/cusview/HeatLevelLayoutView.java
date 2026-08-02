package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class HeatLevelLayoutView extends ComponentLinearLayout {
    public HeatLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setHeatCount(int i) {
        try {
            removeAllViews();
            double a = c.a(i, 10000.0d, 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, c.a(getContext(), 30.0f));
            layoutParams.setMargins(15, 0, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setGravity(17);
            textView.setTextColor(Color.parseColor("#FF000000"));
            textView.setTextSize(10.0f);
            Drawable drawable = getResources().getDrawable(i0.a(getContext(), "mbridge_reward_user", "drawable"));
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            textView.setCompoundDrawables(null, null, drawable, null);
            textView.setText(a + getResources().getString(getResources().getIdentifier("mbridge_reward_heat_count_unit", "string", com.mbridge.msdk.foundation.controller.c.n().i())));
            addView(textView, layoutParams);
        } catch (Exception e) {
            q0.b("HeatLevelLayoutView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        super.setXmlData(map);
        String valueOf = String.valueOf(map.get("data"));
        try {
            if (valueOf.equals("null") || TextUtils.isEmpty(valueOf)) {
                return;
            }
            setHeatCount(Integer.parseInt(valueOf));
        } catch (Throwable th) {
            q0.b("HeatLevelLayoutView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(obj);
            if (obj.equals("null")) {
                return;
            }
            setHeatCount(Integer.parseInt(valueOf));
        } catch (Throwable th) {
            q0.b("HeatLevelLayoutView", th.getMessage(), th);
        }
    }
}
