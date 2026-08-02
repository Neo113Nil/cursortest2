package com.squareup.wire;

/* compiled from: KotlinConstructorBuilder.kt */
/* loaded from: classes14.dex */
public final class KotlinConstructorBuilderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMap(WireField wireField) {
        return wireField.keyAdapter().length() > 0;
    }
}
