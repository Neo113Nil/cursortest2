package com.squareup.wire.internal;

import defpackage.ot8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class Internal__InternalKt$sanitize$2 extends ot8 implements Function1<String, String> {
    public static final Internal__InternalKt$sanitize$2 INSTANCE = new Internal__InternalKt$sanitize$2();

    public Internal__InternalKt$sanitize$2() {
        super(1, Internal__InternalKt.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        str.getClass();
        return Internal.sanitize(str);
    }
}
