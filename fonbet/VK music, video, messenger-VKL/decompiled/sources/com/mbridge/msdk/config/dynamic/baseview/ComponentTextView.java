package com.mbridge.msdk.config.dynamic.baseview;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.inter.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import java.util.HashMap;
import java.util.Map;
import xsna.dd6;
import xsna.kft0;

/* loaded from: classes13.dex */
public class ComponentTextView extends TextView implements a, b {
    private Animator a;
    private String b;
    public XMLView xmlView;

    public ComponentTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
    }

    private void b() {
        Animator animator = this.a;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e) {
                kft0.a(e, new StringBuilder("停止动画失败: "), "MBTextView");
            }
        }
    }

    private Map<String, Object> getDataMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("text", getText().toString());
        return hashMap;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(tag), getDataMap());
        return hashMap;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
            a();
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("onAttachedToWindow异常: "), "MBTextView");
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            b();
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("onDetachedFromWindow异常: "), "MBTextView");
        }
    }

    public void setOutDataScope(String str) {
        this.b = str;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public void setViewClickListener() {
        setOnClickListener(new dd6(this, 1));
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
            Object obj = map.get("data");
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("setXmlData异常: "), "MBTextView");
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("updateBindData异常: "), "MBTextView");
        }
    }

    private void a() {
        Animator animator = this.a;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e) {
                kft0.a(e, new StringBuilder("启动动画失败: "), "MBTextView");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        f.a(this.xmlView, view.getTag(), dataMap);
    }
}
