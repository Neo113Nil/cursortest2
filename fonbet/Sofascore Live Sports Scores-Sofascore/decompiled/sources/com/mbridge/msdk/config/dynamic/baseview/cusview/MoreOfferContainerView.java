package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.appsflyer.internal.i;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.cd5;
import defpackage.yp8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MoreOfferContainerView extends ComponentHorizontalScrollView {
    private final String a;
    String b;
    com.mbridge.msdk.config.dynamic.binddata.wrapper.a c;
    List<Map<String, Object>> d;
    ViewGroup e;
    private View.OnTouchListener f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ com.mbridge.msdk.config.dynamic.binddata.wrapper.a b;

        public a(List list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
            this.a = list;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MoreOfferContainerView.this.updateMoreOfferData(this.a, this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MoreOfferContainerView.this.a();
            return false;
        }
    }

    public MoreOfferContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "MoreOfferContainerView";
        this.b = "";
        this.f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        String obj = view.getTag().toString();
        int id = view.getId();
        a(String.valueOf(id), obj, this.d.get(id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getVisibleViews, reason: merged with bridge method [inline-methods] */
    public void a() {
        XMLView xMLView;
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.e.getChildCount(); i++) {
            View childAt = this.e.getChildAt(i);
            Rect rect = new Rect();
            boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
            boolean z = rect.width() > childAt.getMeasuredWidth() / 5;
            if (globalVisibleRect && z && (xMLView = this.xmlView) != null && xMLView.getXmlViewActionListener() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("view_tag", childAt.getTag());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("index", String.valueOf(childAt.getId()));
                hashMap.put("property", hashMap2);
                this.xmlView.getXmlViewActionListener().a(hashMap);
            }
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(this);
        }
        HashMap l = i.l("viewTag", str2);
        HashMap l2 = i.l("index", str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        l2.put("selectedContents", arrayList);
        l.put("property", l2);
        f.a(this.xmlView, str2, l);
    }

    public void setData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.c = aVar;
        this.d = list;
        postDelayed(new a(list, aVar), 1000L);
    }

    public void setItemXMLPath(String str) {
        this.b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        com.mbridge.msdk.config.component.common.file.b f;
        if (map == null) {
            return;
        }
        try {
            if (String.valueOf(map.get("clickable")).equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("parentPath");
            String str = "";
            if (obj instanceof String) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf) && (f = com.mbridge.msdk.config.component.common.file.a.f(valueOf)) != null && !TextUtils.isEmpty(f.c())) {
                    str = f.c();
                }
            }
            String valueOf2 = String.valueOf(map.get("parentLayoutFilePath"));
            if (!TextUtils.isEmpty(valueOf2) && !valueOf2.equalsIgnoreCase("null")) {
                str = valueOf2.substring(0, valueOf2.lastIndexOf("/") + 1);
            }
            Object obj2 = map.get("itemXml");
            if (obj2 instanceof String) {
                setItemXMLPath(str.concat(obj2.toString()).concat(".xml"));
            }
            Object obj3 = map.get("globalModel");
            if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.c = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3;
            }
            Object obj4 = map.get("data");
            if (obj4 instanceof List) {
                setData((List) obj4, this.c);
            }
        } catch (Throwable th) {
            q0.b("MoreOfferContainerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof List) {
                setData((List) obj, this.c);
            }
        } catch (Throwable th) {
            q0.b("MoreOfferContainerView", th.getMessage());
        }
    }

    public void updateMoreOfferData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.e = linearLayout;
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = list.get(i);
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
            aVar2.a((Map<? extends String, ?>) map);
            aVar.a("listData", aVar2);
            View a2 = new com.mbridge.msdk.config.dynamic.a().a(this.b, null, aVar);
            if (a2 != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 20, 0);
                a2.setLayoutParams(layoutParams);
                a2.setId(i);
                a2.setOnClickListener(new cd5(this, 22));
                linearLayout.addView(a2);
            }
        }
        if (linearLayout.getChildCount() > 0) {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            addView(linearLayout);
            setOnTouchListener(this.f);
            linearLayout.postDelayed(new yp8(this, 19), 500L);
        }
    }
}
