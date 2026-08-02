package defpackage;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o6l {
    public static final /* synthetic */ o6l a = new o6l();

    @NotNull
    public final KSerializer serializer() {
        fuf fufVar = duf.a;
        return new zvg("com.sofascore.results.widget.WidgetEntityWrapper", fufVar.getOrCreateKotlinClass(v6l.class), new KClass[]{fufVar.getOrCreateKotlinClass(r6l.class), fufVar.getOrCreateKotlinClass(u6l.class)}, new KSerializer[]{p6l.a, s6l.a}, new Annotation[0]);
    }
}
