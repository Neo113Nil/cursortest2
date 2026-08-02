package com.facebook.login;

import com.facebook.FacebookRequestError;
import com.facebook.g0;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import defpackage.b15;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements com.facebook.z {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeviceAuthDialog b;

    public /* synthetic */ e(DeviceAuthDialog deviceAuthDialog, int i) {
        this.a = i;
        this.b = deviceAuthDialog;
    }

    @Override // com.facebook.z
    public final void a(g0 g0Var) {
        int i = this.a;
        DeviceAuthDialog deviceAuthDialog = this.b;
        switch (i) {
            case 0:
                g0Var.getClass();
                if (!deviceAuthDialog.u.get()) {
                    FacebookRequestError facebookRequestError = g0Var.c;
                    if (facebookRequestError != null) {
                        int i2 = facebookRequestError.c;
                        if (i2 != 1349174 && i2 != 1349172) {
                            if (i2 != 1349152) {
                                if (i2 != 1349173) {
                                    com.facebook.q qVar = facebookRequestError.i;
                                    if (qVar == null) {
                                        qVar = new com.facebook.q();
                                    }
                                    deviceAuthDialog.t(qVar);
                                    break;
                                } else {
                                    deviceAuthDialog.s();
                                    break;
                                }
                            } else {
                                DeviceAuthDialog.RequestState requestState = deviceAuthDialog.x;
                                if (requestState != null) {
                                    b15.a(requestState.b);
                                }
                                LoginClient.Request request = deviceAuthDialog.A;
                                if (request == null) {
                                    deviceAuthDialog.s();
                                    break;
                                } else {
                                    deviceAuthDialog.y(request);
                                    break;
                                }
                            }
                        } else {
                            deviceAuthDialog.w();
                            break;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = g0Var.b;
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            String string = jSONObject.getString("access_token");
                            string.getClass();
                            deviceAuthDialog.u(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                            break;
                        } catch (JSONException e) {
                            deviceAuthDialog.t(new com.facebook.q(e));
                            return;
                        }
                    }
                }
                break;
            default:
                g0Var.getClass();
                if (!deviceAuthDialog.y) {
                    FacebookRequestError facebookRequestError2 = g0Var.c;
                    if (facebookRequestError2 != null) {
                        com.facebook.q qVar2 = facebookRequestError2.i;
                        if (qVar2 == null) {
                            qVar2 = new com.facebook.q();
                        }
                        deviceAuthDialog.t(qVar2);
                        break;
                    } else {
                        JSONObject jSONObject2 = g0Var.b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        DeviceAuthDialog.RequestState requestState2 = new DeviceAuthDialog.RequestState();
                        try {
                            String string2 = jSONObject2.getString("user_code");
                            requestState2.b = string2;
                            requestState2.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                            requestState2.c = jSONObject2.getString("code");
                            requestState2.d = jSONObject2.getLong("interval");
                            deviceAuthDialog.x(requestState2);
                            break;
                        } catch (JSONException e2) {
                            deviceAuthDialog.t(new com.facebook.q(e2));
                        }
                    }
                }
                break;
        }
    }
}
