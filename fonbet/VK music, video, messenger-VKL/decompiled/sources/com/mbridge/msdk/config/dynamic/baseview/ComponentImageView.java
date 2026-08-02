package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.config.dynamic.utils.image.b;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.Map;
import xsna.ci0;
import xsna.kft0;

/* loaded from: classes13.dex */
public class ComponentImageView extends ImageView implements a {
    private String a;
    private int b;
    public XMLView xmlView;

    public ComponentImageView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    private void setEffectImage(Bitmap bitmap) {
        for (String str : this.a.split("\\|")) {
            if (str.equals("blur")) {
                b.a(this, bitmap);
            } else if (str.contains("corner")) {
                b.a(this, bitmap, this.b, str);
            } else if (str.equals("circle")) {
                b.b(this, bitmap);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("onAttachedToWindow异常: "), "MBImageView");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setBitmap(Bitmap bitmap) {
        if (TextUtils.isEmpty(this.a)) {
            setImageBitmap(bitmap);
        } else {
            setEffectImage(bitmap);
        }
    }

    public void setImages(Bitmap... bitmapArr) {
        b.a(this, bitmapArr);
    }

    public void setViewClickListener() {
        setOnClickListener(new ci0(this, 4));
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("data"));
            String valueOf2 = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(valueOf2) && valueOf2.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("effect");
            if (obj instanceof String) {
                this.a = obj.toString();
            }
            Object obj2 = map.get("radius");
            if (obj2 instanceof String) {
                this.b = Integer.parseInt(obj2.toString());
            }
            if (TextUtils.isEmpty(valueOf)) {
                return;
            }
            if (valueOf.startsWith("http")) {
                b.a(valueOf, this);
                return;
            }
            BitmapDrawable n = v0.n(valueOf);
            if (n != null) {
                setBackground(n);
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("setXmlData异常: "), "MBImageView");
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                b.a((String) obj, this);
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("updateBindData异常: "), "MBImageView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), null);
    }
}
