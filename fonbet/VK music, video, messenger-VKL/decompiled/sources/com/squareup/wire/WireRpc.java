package com.squareup.wire;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WireRpc.kt */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes14.dex */
public @interface WireRpc {
    String path();

    String requestAdapter();

    String responseAdapter();

    String sourceFile() default "";
}
