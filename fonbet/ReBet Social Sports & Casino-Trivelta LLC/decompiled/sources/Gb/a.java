package Gb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
