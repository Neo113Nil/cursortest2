package com.fyber.inneractive.sdk.flow.endcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class a implements n {
    public final String a = IAlog.a(this);
    public final b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public static ViewGroup a(View view) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(view.getContext()).inflate(R.layout.ia_endcard_container, (ViewGroup) null);
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        a();
    }

    public void c() {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
    }
}
