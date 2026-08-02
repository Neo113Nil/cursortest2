package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzdqz {
    void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(View view);

    void c(View view);

    JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void e(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i);

    void f(Bundle bundle);

    boolean g(Bundle bundle);

    void h(zzboj zzbojVar);

    void i(com.google.android.gms.ads.internal.client.zzdg zzdgVar);

    void j();

    void k(MotionEvent motionEvent, View view);

    JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void m(com.google.android.gms.ads.internal.client.zzdc zzdcVar);

    void n(String str);

    void o(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType);

    void p(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void q(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void u(Bundle bundle);

    void zzA();

    void zzg();

    boolean zzh();

    void zzn();

    void zzq();

    int zzu();

    boolean zzv();
}
