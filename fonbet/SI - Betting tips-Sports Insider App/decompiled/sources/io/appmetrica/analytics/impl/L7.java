package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12519a;

    /* renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f12520b;

    /* renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f12521c;

    /* renamed from: d, reason: collision with root package name */
    public J7 f12522d;

    public L7(boolean z5) {
        this.f12519a = z5;
    }

    public final void a(int i5) {
        J7 j72 = this.f12522d;
        String str = j72 == null ? null : j72.f12421c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f12520b;
        if (deferredDeeplinkListener != null) {
            if (i5 == 0) {
                throw null;
            }
            int i10 = i5 - 1;
            deferredDeeplinkListener.onError(i10 != 0 ? i10 != 1 ? i10 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f12520b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f12521c;
        if (deferredDeeplinkParametersListener != null) {
            if (i5 == 0) {
                throw null;
            }
            int i11 = i5 - 1;
            deferredDeeplinkParametersListener.onError(i11 != 0 ? i11 != 1 ? i11 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f12521c = null;
        }
    }

    public final void a() {
        J7 j72 = this.f12522d;
        if (j72 != null) {
            String str = j72.f12420b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f12520b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f12520b = null;
                }
                if (!lo.a(this.f12522d.f12419a)) {
                    Map<String, String> map = this.f12522d.f12419a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f12521c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f12521c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f12522d.f12421c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f12521c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f12521c = null;
                    return;
                }
                return;
            }
            if (j72.f12421c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
