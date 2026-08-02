package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.d0;
import com.facebook.e0;
import com.facebook.g0;
import com.facebook.k0;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.ironsource.L6;
import com.ironsource.U3;
import com.moloco.sdk.internal.publisher.h0;
import com.sofascore.results.R;
import defpackage.b15;
import defpackage.bf3;
import defpackage.cn5;
import defpackage.cw3;
import defpackage.iml;
import defpackage.lw1;
import defpackage.wxf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "com/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s", "com/facebook/login/i", "RequestState", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class DeviceAuthDialog extends DialogFragment {
    public LoginClient.Request A;
    public View q;
    public TextView r;
    public TextView s;
    public DeviceAuthMethodHandler t;
    public final AtomicBoolean u = new AtomicBoolean();
    public volatile e0 v;
    public volatile ScheduledFuture w;
    public volatile RequestState x;
    public boolean y;
    public boolean z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RequestState> CREATOR = new j();
        public String a;
        public String b;
        public String c;
        public long d;
        public long e;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        k kVar = new k(requireActivity(), R.style.com_facebook_auth_dialog);
        kVar.setContentView(r(b15.b() && !this.z));
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        layoutInflater.getClass();
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity).h;
        this.t = (DeviceAuthMethodHandler) (loginFragment != null ? loginFragment.j().g() : null);
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            x(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.y = true;
        this.u.set(true);
        super.onDestroyView();
        e0 e0Var = this.v;
        if (e0Var != null) {
            e0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.y) {
            return;
        }
        s();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.x != null) {
            bundle.putParcelable("request_state", this.x);
        }
    }

    public final void q(String str, i iVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.t;
        if (deviceAuthMethodHandler != null) {
            String b = com.facebook.w.b();
            ArrayList arrayList = (ArrayList) iVar.b;
            ArrayList arrayList2 = (ArrayList) iVar.c;
            ArrayList arrayList3 = (ArrayList) iVar.d;
            str2.getClass();
            str.getClass();
            deviceAuthMethodHandler.d().d(new LoginClient.Result(deviceAuthMethodHandler.d().g, 1, new AccessToken(str2, b, str, arrayList, arrayList2, arrayList3, com.facebook.j.DEVICE_AUTH, date, null, date2, Payload.SOURCE_FACEBOOK), null, null, null));
        }
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View r(boolean z) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        inflate.getClass();
        View findViewById = inflate.findViewById(R.id.progress_bar);
        findViewById.getClass();
        this.q = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        findViewById2.getClass();
        this.r = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cancel_button);
        findViewById3.getClass();
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.this.s();
            }
        });
        View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        findViewById4.getClass();
        TextView textView = (TextView) findViewById4;
        this.s = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public final void s() {
        if (this.u.compareAndSet(false, true)) {
            RequestState requestState = this.x;
            if (requestState != null) {
                b15.a(requestState.b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.t;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.d().d(new LoginClient.Result(deviceAuthMethodHandler.d().g, 2, null, null, "User canceled log in.", null));
            }
            Dialog dialog = this.l;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void t(com.facebook.q qVar) {
        if (this.u.compareAndSet(false, true)) {
            RequestState requestState = this.x;
            if (requestState != null) {
                b15.a(requestState.b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.t;
            if (deviceAuthMethodHandler != null) {
                LoginClient.Request request = deviceAuthMethodHandler.d().g;
                String message = qVar.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                deviceAuthMethodHandler.d().d(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = this.l;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void u(final String str, long j, Long l) {
        Bundle f = bf3.f("fields", "id,permissions,name");
        Date date = j != 0 ? new Date((j * 1000) + new Date().getTime()) : null;
        final Date date2 = l.longValue() != 0 ? new Date(l.longValue() * 1000) : null;
        AccessToken accessToken = new AccessToken(str, com.facebook.w.b(), "0", null, null, null, null, date, null, date2);
        final Date date3 = date;
        String str2 = d0.j;
        d0 B = h0.B(accessToken, "me", new com.facebook.z() { // from class: com.facebook.login.f
            @Override // com.facebook.z
            public final void a(g0 g0Var) {
                final DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                final String str3 = str;
                final Date date4 = date3;
                final Date date5 = date2;
                str3.getClass();
                g0Var.getClass();
                if (deviceAuthDialog.u.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = g0Var.c;
                if (facebookRequestError != null) {
                    com.facebook.q qVar = facebookRequestError.i;
                    if (qVar == null) {
                        qVar = new com.facebook.q();
                    }
                    deviceAuthDialog.t(qVar);
                    return;
                }
                try {
                    JSONObject jSONObject = g0Var.b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String string = jSONObject.getString("id");
                    string.getClass();
                    final i s = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.s(jSONObject);
                    String string2 = jSONObject.getString("name");
                    string2.getClass();
                    DeviceAuthDialog.RequestState requestState = deviceAuthDialog.x;
                    if (requestState != null) {
                        b15.a(requestState.b);
                    }
                    com.facebook.internal.u b = com.facebook.internal.x.b(com.facebook.w.b());
                    if (!Intrinsics.c(b != null ? Boolean.valueOf(b.c.contains(com.facebook.internal.g0.d)) : null, Boolean.TRUE) || deviceAuthDialog.z) {
                        deviceAuthDialog.q(string, s, str3, date4, date5);
                        return;
                    }
                    deviceAuthDialog.z = true;
                    String string3 = deviceAuthDialog.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                    string3.getClass();
                    String string4 = deviceAuthDialog.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                    string4.getClass();
                    String string5 = deviceAuthDialog.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                    string5.getClass();
                    String format = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                    AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.getContext());
                    builder.setMessage(string3).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.g
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            String str4 = string;
                            str4.getClass();
                            String str5 = str3;
                            str5.getClass();
                            DeviceAuthDialog.this.q(str4, s, str5, date4, date5);
                        }
                    }).setPositiveButton(string5, new DialogInterface.OnClickListener() { // from class: com.facebook.login.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            DeviceAuthDialog deviceAuthDialog2 = DeviceAuthDialog.this;
                            View r = deviceAuthDialog2.r(false);
                            Dialog dialog = deviceAuthDialog2.l;
                            if (dialog != null) {
                                dialog.setContentView(r);
                            }
                            LoginClient.Request request = deviceAuthDialog2.A;
                            if (request != null) {
                                deviceAuthDialog2.y(request);
                            }
                        }
                    });
                    builder.create().show();
                } catch (JSONException e) {
                    deviceAuthDialog.t(new com.facebook.q(e));
                }
            }
        });
        B.h = com.facebook.h0.a;
        B.d = f;
        B.d();
    }

    public final void v() {
        RequestState requestState = this.x;
        if (requestState != null) {
            requestState.e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.x;
        bundle.putString("code", requestState2 != null ? requestState2.c : null);
        StringBuilder sb = new StringBuilder(com.facebook.w.b());
        sb.append('|');
        com.facebook.internal.h.k();
        String str = com.facebook.w.h;
        if (str == null) {
            com.facebook.t.a("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            return;
        }
        sb.append(str);
        bundle.putString("access_token", sb.toString());
        this.v = new d0(null, "device/login_status", bundle, com.facebook.h0.b, new e(this, 0)).d();
    }

    public final void w() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.x;
        Long valueOf = requestState != null ? Long.valueOf(requestState.d) : null;
        if (valueOf != null) {
            synchronized (DeviceAuthMethodHandler.d) {
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.e;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    DeviceAuthMethodHandler.e = scheduledThreadPoolExecutor;
                }
            }
            this.w = scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: com.facebook.login.d
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.this.v();
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(RequestState requestState) {
        Bitmap createBitmap;
        TextView textView;
        this.x = requestState;
        TextView textView2 = this.r;
        if (textView2 == null) {
            Intrinsics.i("confirmationCode");
            throw null;
        }
        textView2.setText(requestState.b);
        String str = requestState.a;
        b15 b15Var = b15.a;
        boolean z = false;
        if (!cw3.a.contains(b15.class)) {
            try {
                EnumMap enumMap = new EnumMap(cn5.class);
                enumMap.put((EnumMap) cn5.f, (cn5) 2);
                try {
                    lw1 k = new wxf(28).k(str, 12, enumMap);
                    int i = k.b;
                    int i2 = k.a;
                    int[] iArr = new int[i * i2];
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = i3 * i2;
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i4 + i5] = k.a(i5, i3) ? -16777216 : -1;
                        }
                    }
                    createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    try {
                        createBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    } catch (iml unused) {
                    }
                } catch (iml unused2) {
                }
            } catch (Throwable th) {
                cw3.a(b15.class, th);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
            textView = this.s;
            if (textView != null) {
                Intrinsics.i("instructions");
                throw null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
            TextView textView3 = this.r;
            if (textView3 == null) {
                Intrinsics.i("confirmationCode");
                throw null;
            }
            textView3.setVisibility(0);
            View view = this.q;
            if (view == null) {
                Intrinsics.i("progressBar");
                throw null;
            }
            view.setVisibility(8);
            if (!this.z) {
                String str2 = requestState.b;
                if (!cw3.a.contains(b15.class)) {
                    try {
                        if (b15.b()) {
                            z = b15.a.c(str2);
                        }
                    } catch (Throwable th2) {
                        cw3.a(b15.class, th2);
                    }
                }
                if (z) {
                    com.facebook.appevents.l lVar = new com.facebook.appevents.l(getContext(), (String) null);
                    com.facebook.w wVar = com.facebook.w.a;
                    if (k0.c()) {
                        lVar.g(null, "fb_smart_login_service");
                    }
                }
            }
            if (requestState.e != 0 && (new Date().getTime() - requestState.e) - (requestState.d * 1000) < 0) {
                w();
                return;
            } else {
                v();
                return;
            }
        }
        createBitmap = null;
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getResources(), createBitmap);
        textView = this.s;
        if (textView != null) {
        }
    }

    public final void y(LoginClient.Request request) {
        request.getClass();
        this.A = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, request.b));
        String str = request.i;
        if (!com.facebook.internal.k0.A(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.k;
        if (!com.facebook.internal.k0.A(str2)) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder(com.facebook.w.b());
        sb.append('|');
        com.facebook.internal.h.k();
        String str3 = com.facebook.w.h;
        if (str3 == null) {
            com.facebook.t.a("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            return;
        }
        sb.append(str3);
        bundle.putString("access_token", sb.toString());
        b15 b15Var = b15.a;
        String str4 = null;
        if (!cw3.a.contains(b15.class)) {
            try {
                HashMap hashMap = new HashMap();
                String str5 = Build.DEVICE;
                str5.getClass();
                hashMap.put(U3.i.G, str5);
                String str6 = Build.MODEL;
                str6.getClass();
                hashMap.put(L6.B, str6);
                String jSONObject = new JSONObject(hashMap).toString();
                jSONObject.getClass();
                str4 = jSONObject;
            } catch (Throwable th) {
                cw3.a(b15.class, th);
            }
        }
        bundle.putString("device_info", str4);
        new d0(null, "device/login", bundle, com.facebook.h0.b, new e(this, 1)).d();
    }
}
