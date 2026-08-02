package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m2 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void d(List list) {
        copyOnWrite();
        ((n2) this.instance).addAllTags(list);
    }

    public final void h(int i) {
        copyOnWrite();
        ((n2) this.instance).i(i);
    }

    public final void i(String str) {
        copyOnWrite();
        ((n2) this.instance).j(str);
    }
}
