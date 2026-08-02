package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lo extends ot8 implements Function2 {
    public static final lo b = new lo(2, uzb.class, InneractiveMediationNameConsts.MAX, "max(II)I", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
