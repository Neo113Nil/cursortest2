package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾐ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1185 extends WeakHashMap implements InterfaceC0873 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1181 f3761;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0683 f3762;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185(C1181 c1181, WeakHashMap weakHashMap, C0683 c0683) {
        super(weakHashMap);
        this.f3761 = c1181;
        this.f3762 = c0683;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        View view = (View) obj;
        WeakReference weakReference = (WeakReference) obj2;
        this.f3761.m270(this, this.f3762, StringFog.decrypt("Ub2oFA0VTRlIub0WMxF/FVK9rFMLBXg=\n", "H9zcfXtwDH0=\n"), view, weakReference);
        return (WeakReference) super.put(view, weakReference);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this;
    }
}
