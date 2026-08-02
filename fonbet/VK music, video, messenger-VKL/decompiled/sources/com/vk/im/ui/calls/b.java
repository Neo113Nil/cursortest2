package com.vk.im.ui.calls;

import android.content.Context;
import com.vk.core.voip.VoipCallSource;
import com.vk.im.ui.calls.CallStartAction;
import io.reactivex.rxjava3.disposables.c;
import xsna.aa9;
import xsna.asu0;
import xsna.kyv;
import xsna.pe1;
import xsna.rl3;

/* compiled from: CallStarter.kt */
/* loaded from: classes2.dex */
public final class b {
    public static c a(Context context, kyv kyvVar, VoipCallSource voipCallSource) {
        return io.reactivex.rxjava3.kotlin.c.e(kyvVar.i().m(asu0.a.d()), new pe1(7), new aa9(kyvVar, context, voipCallSource, rl3.y0(new CallStartAction[]{new CallStartAction.b(true), new CallStartAction.a(true)}), 0));
    }
}
