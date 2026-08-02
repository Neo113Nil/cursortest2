package com.moloco.sdk.internal.publisher.nativead.ui;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ e(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
