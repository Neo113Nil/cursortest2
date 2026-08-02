package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gpj extends lu {
    private TextView pcc;

    public gpj(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.lu
    public void pcc(Context context, View view) {
        addView(view);
        this.pcc = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.lu
    public void setShakeText(String str) {
        if (this.pcc == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.pcc;
        if (!isEmpty) {
            textView.setText(str);
            return;
        }
        try {
            this.pcc.setText(com.bytedance.sdk.component.utils.tz.sf(textView.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
