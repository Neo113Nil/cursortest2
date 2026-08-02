package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface r5h {
    Class with() default KSerializer.class;
}
