package com.moloco.sdk;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p3 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void d(String str) {
        copyOnWrite();
        ((r3) this.instance).i(str);
    }

    public final void i() {
        copyOnWrite();
        ((r3) this.instance).j();
    }

    public final void j() {
        String str = Build.VERSION.RELEASE;
        copyOnWrite();
        ((r3) this.instance).k();
    }

    public final void k(float f) {
        copyOnWrite();
        ((r3) this.instance).l(f);
    }
}
