package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a0 extends AbstractC0646 implements Y, View.OnLayoutChangeListener {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f128 = StringFog.decrypt("9eHvuFKhM/3H/8C4dbcL8M7t8w==\n", "ooiB3D3WZZQ=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public Z f129;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f130;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public Class f131;

    public a0(JSONObject jSONObject) {
        super(null);
        this.f130 = new WeakHashMap();
        this.f129 = new Z();
        m87(jSONObject);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            View m81 = m81(view, this.f131);
            if (m81 != null) {
                if (!this.f130.containsKey(m81)) {
                    this.f130.put(m81, Boolean.TRUE);
                    m393(new JSONObject(), (Object) m81, Integer.toHexString(m81.hashCode()));
                }
                view.removeOnLayoutChangeListener(this);
            }
        } catch (Throwable th) {
            AbstractC0356.m204(f128, StringFog.decrypt("lazWqtaYgTjwscqJxcGHI6SdzKTK340=\n", "0N6kxaS46FY=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Y
    /* renamed from: ﾇ */
    public final void mo75(View view) {
        View m81 = m81(view, this.f131);
        if (m81 == null || this.f130.remove(m81) == null) {
            return;
        }
        m390(view);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m87(JSONObject jSONObject) {
        Z z = new Z(jSONObject);
        this.f2185 = z;
        this.f129 = z;
        try {
            this.f131 = Class.forName(z.f117);
            C1064.m629().m631(this);
        } catch (ClassNotFoundException e) {
            AbstractC0420.m244(f128, StringFog.decrypt("BJybXyhDhbwymoxeMw2O9TWByVUsBoehMs6PQjUOyQ==\n", "Qe7pMFpj6dU=\n") + z.f117 + StringFog.decrypt("47s=\n", "2Zv86j23rXc=\n") + e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final View mo83(Object obj) {
        return (View) obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractViewOnLayoutChangeListenerC3987z mo84() {
        return new B();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo85(Object obj, ArrayList arrayList) {
        Z z = this.f129;
        AbstractC3964b.m88((View) obj, WebView.class, z.f116, true, false, null, z.f2190, arrayList);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0881 mo86() {
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Y
    /* renamed from: ﾒ */
    public final void mo76(View view) {
        View m82;
        View m81 = m81(view, this.f131);
        if (m81 != null) {
            if (this.f130.containsKey(m81)) {
                return;
            }
            this.f130.put(m81, Boolean.TRUE);
            m393(new JSONObject(), (Object) m81, Integer.toHexString(m81.hashCode()));
            return;
        }
        if (TextUtils.isEmpty(this.f129.f115) || (m82 = m82(view, this.f129.f115)) == null) {
            return;
        }
        m82.addOnLayoutChangeListener(this);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m81(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View m81 = m81(childAt, cls);
            if (m81 != null) {
                return m81;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m82(View view, String str) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().startsWith(str)) {
                return childAt;
            }
            View m82 = m82(childAt, str);
            if (m82 != null) {
                return m82;
            }
        }
        return null;
    }
}
