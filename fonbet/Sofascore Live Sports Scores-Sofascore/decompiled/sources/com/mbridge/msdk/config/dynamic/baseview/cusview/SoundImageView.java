package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.i0;
import defpackage.cne;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class SoundImageView extends ComponentImageView {
    private boolean c;

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        setSoundStatus(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        boolean z = this.c;
        setSoundStatus(!z);
        HashMap hashMap = new HashMap();
        hashMap.put("soundStatus", !z ? "0" : "1");
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), hashMap);
    }

    public boolean getStatus() {
        return this.c;
    }

    public void setSoundStatus(boolean z) {
        this.c = z;
        if (z) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView
    public void setViewClickListener() {
        setOnClickListener(new cne(this, 26));
    }
}
