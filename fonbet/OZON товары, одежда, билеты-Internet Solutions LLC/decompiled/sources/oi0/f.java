package oi0;

import android.content.Intent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import oi0.InterfaceC8743a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Gj0.a f78402a;

    public f(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f78402a = new Gj0.a(intent);
    }

    private final InterfaceC8743a.C1330a a(String str) {
        String d11 = this.f78402a.d(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Boolean valueOf = d11 != null ? Boolean.valueOf(Boolean.parseBoolean(d11)) : null;
        if (valueOf == null) {
            return null;
        }
        return new InterfaceC8743a.C1330a(str, valueOf.booleanValue());
    }

    public final InterfaceC8743a b() {
        String str;
        Gj0.a aVar = this.f78402a;
        String c11 = aVar.c();
        if (c11 != null) {
            str = c11.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = "testTrackCampaign".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.d(str, lowerCase)) {
            String d11 = aVar.d("deeplinkURL");
            String d12 = aVar.d("referralURL");
            String d13 = aVar.d("customDimensions");
            if (d11 != null && !h.K(d11)) {
                return new InterfaceC8743a.h(d11, d12, d13);
            }
        } else {
            String lowerCase2 = "testEventV2".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.d(str, lowerCase2)) {
                String d14 = aVar.d("count");
                Integer w02 = d14 != null ? h.w0(d14) : null;
                String d15 = aVar.d("objectType");
                if (w02 != null && d15 != null && !h.K(d15)) {
                    return new d(d15, w02.intValue());
                }
            } else {
                String lowerCase3 = "testTrinityEvent".toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                if (Intrinsics.d(str, lowerCase3)) {
                    String d16 = aVar.d("count");
                    Integer w03 = d16 != null ? h.w0(d16) : null;
                    String d17 = aVar.d("customType");
                    boolean parseBoolean = Boolean.parseBoolean(aVar.d("isFastEvent"));
                    if (w03 != null && d17 != null && !h.K(d17)) {
                        return new c(d17, w03.intValue(), parseBoolean);
                    }
                } else {
                    String lowerCase4 = "testFlexEvent".toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                    if (Intrinsics.d(str, lowerCase4)) {
                        String d18 = aVar.d("count");
                        Integer w04 = d18 != null ? h.w0(d18) : null;
                        String d19 = aVar.d("objectType");
                        if (w04 != null && d19 != null && !h.K(d19)) {
                            return new b(d19, w04.intValue());
                        }
                    } else {
                        String lowerCase5 = "testPageViewEvent".toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                        if (Intrinsics.d(str, lowerCase5)) {
                            String d21 = aVar.d("current");
                            String d22 = aVar.d("currentURL");
                            if (d21 != null && !h.K(d21) && d22 != null && !h.K(d22)) {
                                return new InterfaceC8743a.f(d21, d22);
                            }
                        } else {
                            String lowerCase6 = "dispatchEvents".toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
                            if (Intrinsics.d(str, lowerCase6)) {
                                return InterfaceC8743a.b.f78372a;
                            }
                            String lowerCase7 = "resetConfigs".toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
                            if (Intrinsics.d(str, lowerCase7)) {
                                return InterfaceC8743a.d.f78374a;
                            }
                            String lowerCase8 = "perfEvent".toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase8, "toLowerCase(...)");
                            if (Intrinsics.d(str, lowerCase8)) {
                                String d23 = aVar.d("metricType");
                                String d24 = aVar.d("metricValue");
                                Long y02 = d24 != null ? h.y0(d24) : null;
                                String d25 = aVar.d("count");
                                Integer w05 = d25 != null ? h.w0(d25) : null;
                                if (d23 != null && !h.K(d23) && y02 != null && w05 != null) {
                                    return new InterfaceC8743a.g(w05.intValue(), y02.longValue(), d23);
                                }
                            } else {
                                String lowerCase9 = "dispatchPerfEvents".toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase9, "toLowerCase(...)");
                                if (Intrinsics.d(str, lowerCase9)) {
                                    return InterfaceC8743a.c.f78373a;
                                }
                                String lowerCase10 = "sendFailedRequests".toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase10, "toLowerCase(...)");
                                if (Intrinsics.d(str, lowerCase10)) {
                                    return InterfaceC8743a.e.f78375a;
                                }
                                String lowerCase11 = "force_sending_events_on_minimize".toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase11, "toLowerCase(...)");
                                if (Intrinsics.d(str, lowerCase11)) {
                                    return a("force_sending_events_on_minimize");
                                }
                                String lowerCase12 = "force_sending_traces_on_minimize".toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase12, "toLowerCase(...)");
                                if (Intrinsics.d(str, lowerCase12)) {
                                    return a("force_sending_traces_on_minimize");
                                }
                                String lowerCase13 = "delayed_sending_events".toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase13, "toLowerCase(...)");
                                if (Intrinsics.d(str, lowerCase13)) {
                                    return a("delayed_sending_events");
                                }
                                String lowerCase14 = "delayed_sending_traces".toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(lowerCase14, "toLowerCase(...)");
                                if (Intrinsics.d(str, lowerCase14)) {
                                    return a("delayed_sending_traces");
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
