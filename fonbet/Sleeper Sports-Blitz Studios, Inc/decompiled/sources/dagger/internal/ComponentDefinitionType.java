package dagger.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
/* loaded from: classes8.dex */
public @interface ComponentDefinitionType {
    Class<?> value();
}
