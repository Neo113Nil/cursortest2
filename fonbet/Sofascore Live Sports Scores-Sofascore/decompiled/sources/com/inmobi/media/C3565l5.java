package com.inmobi.media;

import android.os.Bundle;
import defpackage.t94;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3565l5 extends t94 {
    public final /* synthetic */ C3591m5 a;

    public C3565l5(C3591m5 c3591m5) {
        this.a = c3591m5;
    }

    @Override // defpackage.t94
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        bundle.getClass();
        Y2 y2 = this.a.c;
        if (y2 != null) {
            y2.a(i, i2, i3, i4, i5);
        }
    }

    @Override // defpackage.t94
    public final void onNavigationEvent(int i, Bundle bundle) {
        Boolean bool;
        Y2 y2 = this.a.c;
        if (y2 != null) {
            C3617n5 c3617n5 = y2.g;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6 && c3617n5.c == null) {
                            if (c3617n5.d == 4) {
                                bool = Boolean.TRUE;
                                c3617n5.c = bool;
                            } else {
                                bool = Boolean.FALSE;
                                c3617n5.c = bool;
                            }
                            boolean c = Intrinsics.c(bool, Boolean.TRUE);
                            WeakReference weakReference = c3617n5.e;
                            if (c) {
                                C3500ii c3500ii = (C3500ii) weakReference.get();
                                if (c3500ii != null) {
                                    Za za = Za.LPCompleteSuccess;
                                    C3571lb c3571lb = c3617n5.a;
                                    za.getClass();
                                    c3500ii.a.getLandingPageHandler().a(za, c3571lb, (Integer) 8003);
                                }
                                C3500ii c3500ii2 = (C3500ii) c3617n5.e.get();
                                if (c3500ii2 != null) {
                                    InterfaceC3880x9 interfaceC3880x9 = c3500ii2.a.i;
                                    if (interfaceC3880x9 != null) {
                                        String str = GestureDetectorOnGestureListenerC3889xi.i1;
                                        str.getClass();
                                        ((C3906y9) interfaceC3880x9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    c3500ii2.a.D();
                                }
                            } else {
                                C3500ii c3500ii3 = (C3500ii) weakReference.get();
                                if (c3500ii3 != null) {
                                    Za za2 = Za.LPCompleteFailed;
                                    C3571lb c3571lb2 = c3617n5.a;
                                    za2.getClass();
                                    c3500ii3.a.getLandingPageHandler().a(za2, c3571lb2, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c3617n5.c == null) {
                        c3617n5.c = Boolean.FALSE;
                        C3500ii c3500ii4 = (C3500ii) c3617n5.e.get();
                        if (c3500ii4 != null) {
                            Za za3 = Za.LPCompleteFailed;
                            C3571lb c3571lb3 = c3617n5.a;
                            za3.getClass();
                            c3500ii4.a.getLandingPageHandler().a(za3, c3571lb3, (Integer) 8004);
                        }
                    }
                } else if (c3617n5.c == null) {
                    c3617n5.c = Boolean.TRUE;
                    C3500ii c3500ii5 = (C3500ii) c3617n5.e.get();
                    if (c3500ii5 != null) {
                        O2.a(c3500ii5, Za.LPCompleteSuccess, c3617n5.a);
                    }
                    C3500ii c3500ii6 = (C3500ii) c3617n5.e.get();
                    if (c3500ii6 != null) {
                        InterfaceC3880x9 interfaceC3880x92 = c3500ii6.a.i;
                        if (interfaceC3880x92 != null) {
                            String str2 = GestureDetectorOnGestureListenerC3889xi.i1;
                            str2.getClass();
                            ((C3906y9) interfaceC3880x92).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        c3500ii6.a.D();
                    }
                }
            } else if (!c3617n5.b) {
                c3617n5.b = true;
                C3500ii c3500ii7 = (C3500ii) c3617n5.e.get();
                if (c3500ii7 != null) {
                    O2.a(c3500ii7, Za.LPPageStart, c3617n5.a);
                }
            }
            c3617n5.d = i;
            if (i == 1) {
                C3500ii c3500ii8 = (C3500ii) y2.i.get();
                if (c3500ii8 != null) {
                    GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                    c3500ii8.a(C3372di.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i == 4) {
                C3500ii c3500ii9 = (C3500ii) y2.i.get();
                if (c3500ii9 != null) {
                    GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                    c3500ii9.a(C3372di.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i == 5) {
                C3500ii c3500ii10 = (C3500ii) y2.i.get();
                if (c3500ii10 != null) {
                    GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                    c3500ii10.a(C3372di.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                C3500ii c3500ii11 = (C3500ii) y2.i.get();
                if (c3500ii11 != null) {
                    InterfaceC3880x9 interfaceC3880x93 = c3500ii11.a.i;
                    if (interfaceC3880x93 != null) {
                        String str3 = GestureDetectorOnGestureListenerC3889xi.i1;
                        str3.getClass();
                        ((C3906y9) interfaceC3880x93).a(str3, "onCCTScreenDisplayed");
                    }
                    c3500ii11.a.getListener().f(c3500ii11.a);
                    c3500ii11.a.b((String) null, (String) null, (String) null);
                    return;
                }
                return;
            }
            if (i != 6) {
                return;
            }
            C3500ii c3500ii12 = (C3500ii) y2.i.get();
            if (c3500ii12 != null) {
                GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                c3500ii12.a(C3372di.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            C3500ii c3500ii13 = (C3500ii) y2.i.get();
            if (c3500ii13 != null) {
                InterfaceC3880x9 interfaceC3880x94 = c3500ii13.a.i;
                if (interfaceC3880x94 != null) {
                    String str4 = GestureDetectorOnGestureListenerC3889xi.i1;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x94).a(str4, "onCCTScreenDismissed");
                }
                c3500ii13.a.W();
            }
        }
    }
}
