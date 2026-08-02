package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.k0;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new CustomTabLoginMethodHandler(parcel);
            case 1:
                parcel.getClass();
                return new DeviceAuthMethodHandler(parcel);
            case 2:
                parcel.getClass();
                return new GetTokenLoginMethodHandler(parcel);
            case 3:
                parcel.getClass();
                return new InstagramAppLoginMethodHandler(parcel);
            case 4:
                parcel.getClass();
                return new KatanaProxyLoginMethodHandler(parcel);
            case 5:
                parcel.getClass();
                LoginClient loginClient = new LoginClient();
                loginClient.b = -1;
                Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
                if (readParcelableArray == null) {
                    readParcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                int length = readParcelableArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        loginClient.a = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
                        loginClient.b = parcel.readInt();
                        loginClient.g = (LoginClient.Request) parcel.readParcelable(LoginClient.Request.class.getClassLoader());
                        HashMap H = k0.H(parcel);
                        loginClient.h = H != null ? new LinkedHashMap(H) : null;
                        HashMap H2 = k0.H(parcel);
                        loginClient.i = H2 != null ? new LinkedHashMap(H2) : null;
                        return loginClient;
                    }
                    Parcelable parcelable = readParcelableArray[i];
                    LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
                    if (loginMethodHandler != null) {
                        loginMethodHandler.b = loginClient;
                    }
                    if (loginMethodHandler != null) {
                        arrayList.add(loginMethodHandler);
                    }
                    i++;
                }
            default:
                parcel.getClass();
                return new WebViewLoginMethodHandler(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CustomTabLoginMethodHandler[i];
            case 1:
                return new DeviceAuthMethodHandler[i];
            case 2:
                return new GetTokenLoginMethodHandler[i];
            case 3:
                return new InstagramAppLoginMethodHandler[i];
            case 4:
                return new KatanaProxyLoginMethodHandler[i];
            case 5:
                return new LoginClient[i];
            default:
                return new WebViewLoginMethodHandler[i];
        }
    }
}
