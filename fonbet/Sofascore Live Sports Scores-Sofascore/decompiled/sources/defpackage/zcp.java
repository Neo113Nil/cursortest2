package defpackage;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zcp extends fdp {
    @Override // defpackage.fdp
    public final Object a(Class cls) {
        String valueOf = String.valueOf(cls);
        throw new UnsupportedOperationException(wt3.m("Cannot allocate ", valueOf, new StringBuilder(valueOf.length() + Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE), ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."));
    }
}
