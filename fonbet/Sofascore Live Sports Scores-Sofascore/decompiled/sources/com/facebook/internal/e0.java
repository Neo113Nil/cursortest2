package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.gl0;
import defpackage.km5;
import defpackage.rm5;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class e0 implements ServiceConnection {
    public final Context a;
    public final gl0 b;
    public com.facebook.login.m c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;

    public e0(Context context, String str, String str2, String str3) {
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.g = 65537;
        this.h = str;
        this.i = str2;
        this.j = 20121101;
        this.k = str3;
        this.b = new gl0(this, 13);
    }

    public final void a(Bundle bundle) {
        if (this.d) {
            this.d = false;
            com.facebook.login.m mVar = this.c;
            if (mVar != null) {
                GetTokenLoginMethodHandler getTokenLoginMethodHandler = (GetTokenLoginMethodHandler) mVar.b;
                LoginClient.Request request = (LoginClient.Request) mVar.c;
                request.getClass();
                com.facebook.login.l lVar = getTokenLoginMethodHandler.c;
                if (lVar != null) {
                    lVar.c = null;
                }
                getTokenLoginMethodHandler.c = null;
                com.facebook.c0 c0Var = getTokenLoginMethodHandler.d().e;
                if (c0Var != null) {
                    View view = ((LoginFragment) c0Var.b).e;
                    if (view == null) {
                        Intrinsics.i("progressBar");
                        throw null;
                    }
                    view.setVisibility(8);
                }
                if (bundle != null) {
                    List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = km5.a;
                    }
                    Set<String> set = request.b;
                    if (set == null) {
                        set = rm5.a;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.length() == 0)) {
                        getTokenLoginMethodHandler.d().k();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            getTokenLoginMethodHandler.n(bundle, request);
                            return;
                        }
                        com.facebook.c0 c0Var2 = getTokenLoginMethodHandler.d().e;
                        if (c0Var2 != null) {
                            View view2 = ((LoginFragment) c0Var2.b).e;
                            if (view2 == null) {
                                Intrinsics.i("progressBar");
                                throw null;
                            }
                            view2.setVisibility(0);
                        }
                        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 != null) {
                            k0.p(new com.facebook.login.n(bundle, getTokenLoginMethodHandler, request), string3);
                            return;
                        } else {
                            a70.r("Required value was null.");
                            return;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        getTokenLoginMethodHandler.a("new_permissions", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, hashSet));
                    }
                    request.b = hashSet;
                }
                getTokenLoginMethodHandler.d().k();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        String str = this.k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        Message obtain = Message.obtain((Handler) null, this.f);
        obtain.arg1 = this.j;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
