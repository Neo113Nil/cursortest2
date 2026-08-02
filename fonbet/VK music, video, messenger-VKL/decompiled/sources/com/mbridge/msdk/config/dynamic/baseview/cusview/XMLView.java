package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.config.component.style.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.util.HashMap;
import java.util.Map;
import xsna.kft0;

/* loaded from: classes13.dex */
public class XMLView extends ComponentRelativeLayout {
    private Map<String, View> a;
    private a b;
    private String c;
    protected com.mbridge.msdk.config.dynamic.baseview.touch.a d;

    public XMLView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new HashMap();
        this.c = "";
        this.d = new com.mbridge.msdk.config.dynamic.baseview.touch.a();
        a();
    }

    private void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.d.c();
                this.d.d(motionEvent);
            } else if (action == 1) {
                this.d.f(motionEvent);
            } else if (action == 2) {
                this.d.e(motionEvent);
            } else if (action == 3) {
                this.d.c(motionEvent);
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("处理触摸事件异常: "), "RenderView");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Map<String, View> getRenderMap() {
        return this.a;
    }

    public String getSelfTag() {
        return this.c;
    }

    public com.mbridge.msdk.config.dynamic.baseview.touch.a getTouchEventData() {
        return this.d;
    }

    public a getXmlViewActionListener() {
        return this.b;
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c = SameMD5.getMD5(str);
    }

    public void setXmlViewActionListener(a aVar) {
        this.b = aVar;
    }

    public void updateTouchView(View view) {
        com.mbridge.msdk.config.dynamic.baseview.touch.a aVar = this.d;
        if (aVar != null) {
            aVar.c(view);
        }
    }
}
