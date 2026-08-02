package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class dwh {

    @NotNull
    public static final awh Companion = new awh();
    public static final joa[] b = {ypa.a(ysa.b, zg3.L)};
    public final Map a;

    public /* synthetic */ dwh(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = new LinkedHashMap();
        } else {
            this.a = map;
        }
    }

    public dwh() {
        this.a = new LinkedHashMap();
    }
}
