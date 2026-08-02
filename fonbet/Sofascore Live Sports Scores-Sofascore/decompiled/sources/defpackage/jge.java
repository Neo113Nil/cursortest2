package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jge extends gfb {
    public static final boolean a;

    static {
        a = !vha.M(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // defpackage.gfb
    public final String a() {
        return "pick_first";
    }

    @Override // defpackage.gfb
    public final ffb b(f6a f6aVar) {
        return a ? new fge(f6aVar) : new ige(f6aVar);
    }

    @Override // defpackage.gfb
    public final j3d c(Map map) {
        try {
            return new j3d(new gge(aik.K("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new j3d(xei.m.g(e).h("Failed parsing configuration for pick_first"));
        }
    }
}
