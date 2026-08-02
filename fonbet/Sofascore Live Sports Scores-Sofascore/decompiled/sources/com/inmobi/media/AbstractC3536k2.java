package com.inmobi.media;

import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3536k2 implements G2 {
    public final Function0 a;

    public AbstractC3536k2(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    public final void a(H2 h2) {
        h2.getClass();
        if (((Boolean) this.a.invoke()).booleanValue()) {
            Objects.toString(h2);
            b(h2);
        }
    }

    public abstract void b(H2 h2);
}
