package com.vk.superapp.vibration.js.bridge.impl;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnsupportedPlatform;
import com.vk.superapp.base.js.bridge.b;
import com.vk.superapp.vibration.js.bridge.api.events.TapticImpactOccurred$Parameters;
import com.vk.superapp.vibration.js.bridge.api.events.TapticImpactOccurred$Response;
import com.vk.superapp.vibration.js.bridge.api.events.TapticNotificationOccurred$Parameters;
import com.vk.superapp.vibration.js.bridge.api.events.TapticNotificationOccurred$Response;
import com.vk.superapp.vibration.js.bridge.api.events.TapticSelectionChanged$Parameters;
import com.vk.superapp.vibration.js.bridge.api.events.TapticSelectionChanged$Response;
import com.vk.superapp.vibration.js.bridge.impl.VibrationUtils;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.c5f;
import xsna.jrh;
import xsna.l6y;
import xsna.ovp;
import xsna.p2y;
import xsna.qfj;
import xsna.r6y;
import xsna.sf3;
import xsna.t1n0;
import xsna.x0;
import xsna.xwv0;

/* compiled from: JsVibrationDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class a implements l6y {
    public final b b;
    public xwv0 c;
    public final qfj d;
    public final bpn0 e = new bpn0(new c5f(this, 29));
    public final bpn0 f = new bpn0(new jrh(this, 21));
    public final bpn0 g = new bpn0(new x0(19));

    /* compiled from: JsVibrationDelegateImpl.kt */
    /* renamed from: com.vk.superapp.vibration.js.bridge.impl.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1913a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TapticNotificationOccurred$Parameters.Type.values().length];
            try {
                iArr[TapticNotificationOccurred$Parameters.Type.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TapticNotificationOccurred$Parameters.Type.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TapticNotificationOccurred$Parameters.Type.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TapticImpactOccurred$Parameters.Style.values().length];
            try {
                iArr2[TapticImpactOccurred$Parameters.Style.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TapticImpactOccurred$Parameters.Style.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TapticImpactOccurred$Parameters.Style.HEAVY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a(b bVar, xwv0 xwv0Var, qfj qfjVar) {
        this.b = bVar;
        this.c = xwv0Var;
        this.d = qfjVar;
    }

    @Override // xsna.k6y
    public final void L0(p2y<TapticImpactOccurred$Parameters> p2yVar) {
        VibrationUtils.VibrationPattern vibrationPattern;
        String b = p2yVar.b();
        sf3.b("VKWebAppTapticImpactOccurred", this.b, b);
        xwv0 xwv0Var = this.c;
        if (xwv0Var != null && xwv0Var.q()) {
            c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), b, 1, null));
            return;
        }
        Context context = ((r6y) this.d.c).l;
        if (context == null) {
            c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        TapticImpactOccurred$Parameters a = p2yVar.a();
        Boolean c = a.c();
        boolean booleanValue = c != null ? c.booleanValue() : false;
        int i = C1913a.$EnumSwitchMapping$1[a.d().ordinal()];
        if (i == 1) {
            vibrationPattern = VibrationUtils.VibrationPattern.Light;
        } else if (i == 2) {
            vibrationPattern = VibrationUtils.VibrationPattern.Medium;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            vibrationPattern = VibrationUtils.VibrationPattern.Heavy;
        }
        ((VibrationUtils) this.g.getValue()).getClass();
        if (VibrationUtils.a(context, vibrationPattern, booleanValue)) {
            b.p(((t1n0) this.f.getValue()).a, new JsMethod("VKWebAppTapticImpactOccurred"), new TapticImpactOccurred$Response(null, new TapticImpactOccurred$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
        } else {
            c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b, 1, null));
        }
    }

    @Override // xsna.l6y, xsna.k6y
    @JavascriptInterface
    public void VKWebAppTapticImpactOccurred(String str) {
        l6y.a.VKWebAppTapticImpactOccurred(this, str);
    }

    @Override // xsna.l6y, xsna.k6y
    @JavascriptInterface
    public void VKWebAppTapticNotificationOccurred(String str) {
        l6y.a.VKWebAppTapticNotificationOccurred(this, str);
    }

    @Override // xsna.l6y, xsna.k6y
    @JavascriptInterface
    public void VKWebAppTapticSelectionChanged(String str) {
        l6y.a.VKWebAppTapticSelectionChanged(this, str);
    }

    @Override // xsna.k6y
    public final void X0(p2y<TapticNotificationOccurred$Parameters> p2yVar) {
        VibrationUtils.VibrationPattern vibrationPattern;
        String b = p2yVar.b();
        sf3.b("VKWebAppTapticNotificationOccurred", this.b, b);
        Context context = ((r6y) this.d.c).l;
        if (context == null) {
            c().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            c().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        TapticNotificationOccurred$Parameters a = p2yVar.a();
        Boolean c = a.c();
        boolean booleanValue = c != null ? c.booleanValue() : false;
        int i = C1913a.$EnumSwitchMapping$0[a.d().ordinal()];
        if (i == 1) {
            vibrationPattern = VibrationUtils.VibrationPattern.Error;
        } else if (i == 2) {
            vibrationPattern = VibrationUtils.VibrationPattern.Success;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            vibrationPattern = VibrationUtils.VibrationPattern.Warning;
        }
        ((VibrationUtils) this.g.getValue()).getClass();
        if (VibrationUtils.a(context, vibrationPattern, booleanValue)) {
            b.p(((t1n0) this.f.getValue()).a, new JsMethod("VKWebAppTapticNotificationOccurred"), new TapticNotificationOccurred$Response(null, new TapticNotificationOccurred$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
        } else {
            c().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b, 1, null));
        }
    }

    public final ovp c() {
        return (ovp) this.e.getValue();
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.c = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.c = null;
    }

    @Override // xsna.k6y
    public final void x(p2y<TapticSelectionChanged$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppTapticSelectionChanged", this.b, b);
        Context context = ((r6y) this.d.c).l;
        if (context == null) {
            c().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), b, 1, null));
            return;
        }
        if (p2yVar.a instanceof p2y.a) {
            c().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        Boolean c = p2yVar.a().c();
        boolean booleanValue = c != null ? c.booleanValue() : false;
        VibrationUtils.VibrationPattern vibrationPattern = VibrationUtils.VibrationPattern.Selection;
        ((VibrationUtils) this.g.getValue()).getClass();
        if (VibrationUtils.a(context, vibrationPattern, booleanValue)) {
            b.p(((t1n0) this.f.getValue()).a, new JsMethod("VKWebAppTapticSelectionChanged"), new TapticSelectionChanged$Response(null, new TapticSelectionChanged$Response.Data(true, b), b, 1, null), null, null, false, null, 60);
        } else {
            c().c(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, null, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b, 1, null));
        }
    }
}
