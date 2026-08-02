package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void d(ByteString byteString) {
        copyOnWrite();
        ((i) this.instance).i(byteString);
    }

    public final void h(ByteString byteString) {
        copyOnWrite();
        ((i) this.instance).j(byteString);
    }
}
