package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.inter.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import defpackage.s0;
import defpackage.w1l;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class ComponentButton extends Button implements a, b {
    private String a;
    private boolean b;
    public XMLView xmlView;

    public ComponentButton(Context context, AttributeSet attributeSet) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        this.b = true;
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        f.a(this.xmlView, view.getTag(), dataMap);
    }

    private Map<String, Object> getDataMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("selected", this.b ? "1" : "0");
        hashMap.put("text", getText().toString());
        return hashMap;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.a) || (tag = getTag()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(tag), getDataMap());
        this.b = false;
        return hashMap;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("onAttachedToWindow异常: "), "MBButton");
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOutDataScope(String str) {
        this.a = str;
    }

    public void setViewClickListener() {
        setOnClickListener(new s0(this, 17));
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(valueOf) && valueOf.equals("true")) {
                setViewClickListener();
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("setXmlData异常: "), "MBButton");
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("updateBindData异常: "), "MBButton");
        }
    }
}
