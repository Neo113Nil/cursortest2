package com.facebook.login;

import Q6.a;
import T7.A;
import T7.C1682w;
import T7.Q;
import T7.Y;
import T7.Z;
import W9.d;
import X9.m;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.material.shape.i;
import com.twilio.voice.EventKeys;
import d8.r;
import g6.AsyncTaskC4337I;
import g6.C4331C;
import g6.C4339K;
import g6.C4357q;
import g6.EnumC4340L;
import g6.EnumC4347g;
import h6.C4470F;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z6.AbstractC6933c;
import z6.AbstractC6934d;
import z6.AbstractC6935e;
import z6.AbstractC6936f;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 m2\u00020\u0001:\u0003nopB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0015¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020#H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0003JC\u0010?\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ;\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u001e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010>\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010cR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006q"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "", "onDismiss", "(Landroid/content/DialogInterface;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "Lcom/facebook/login/LoginClient$Request;", "request", "H0", "(Lcom/facebook/login/LoginClient$Request;)V", "", "", "o0", "()Ljava/util/Map;", "q0", "()Ljava/lang/String;", "", "isSmartLogin", "t0", "(Z)Landroid/view/View;", "", "r0", "(Z)I", "Lg6/q;", "ex", "x0", "(Lg6/q;)V", "w0", "v0", "()Z", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "currentRequestState", "G0", "(Lcom/facebook/login/DeviceAuthDialog$RequestState;)V", "A0", "E0", "userId", "Lcom/facebook/login/DeviceAuthDialog$b;", "permissions", "accessToken", "name", "Ljava/util/Date;", "expirationTime", "dataAccessExpirationTime", "B0", "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "", "expiresIn", "y0", "(Ljava/lang/String;JLjava/lang/Long;)V", "p0", "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", m.f13664a, "Landroid/view/View;", "progressBar", "Landroid/widget/TextView;", "n", "Landroid/widget/TextView;", "confirmationCode", "o", "instructions", "Lcom/facebook/login/DeviceAuthMethodHandler;", "p", "Lcom/facebook/login/DeviceAuthMethodHandler;", "deviceAuthMethodHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "q", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "Lg6/I;", "r", "Lg6/I;", "currentGraphRequestPoll", "Ljava/util/concurrent/ScheduledFuture;", "s", "Ljava/util/concurrent/ScheduledFuture;", "scheduledPoll", "t", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "u", "Z", "isBeingDestroyed", "v", "isRetry", "w", "Lcom/facebook/login/LoginClient$Request;", "Lcom/facebook/GraphRequest;", "s0", "()Lcom/facebook/GraphRequest;", "pollRequest", C5444x.f55808b, "a", com.google.crypto.tink.integration.android.b.f37029b, "RequestState", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class DeviceAuthDialog extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public View progressBar;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public TextView confirmationCode;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public TextView instructions;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public DeviceAuthMethodHandler deviceAuthMethodHandler;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean completed = new AtomicBoolean();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public volatile AsyncTaskC4337I currentGraphRequestPoll;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public volatile ScheduledFuture scheduledPoll;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public volatile RequestState currentRequestState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public boolean isBeingDestroyed;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean isRetry;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public LoginClient.Request request;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    public static final String f30962y = "device/login";

    /* renamed from: z, reason: collision with root package name */
    public static final String f30963z = "device/login_status";

    /* renamed from: A, reason: collision with root package name */
    public static final int f30960A = 1349174;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001 B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\rR\"\u0010'\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b \u0010%\"\u0004\b&\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006("}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", d.f13160a, "()Ljava/lang/String;", "userCode", "", C4527h.f48087o, "(Ljava/lang/String;)V", "", "lastPoll", "f", "(J)V", "", i.f35755A, "()Z", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<set-?>", "a", "Ljava/lang/String;", "authorizationUri", com.google.crypto.tink.integration.android.b.f37029b, "c", "g", "requestCode", "J", "()J", e.f29601m, "interval", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class RequestState implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String authorizationUri;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public String userCode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public String requestCode;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long interval;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long lastPoll;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<RequestState> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i10) {
                return new RequestState[i10];
            }
        }

        public RequestState() {
        }

        /* renamed from: a, reason: from getter */
        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        /* renamed from: b, reason: from getter */
        public final long getInterval() {
            return this.interval;
        }

        /* renamed from: c, reason: from getter */
        public final String getRequestCode() {
            return this.requestCode;
        }

        /* renamed from: d, reason: from getter */
        public final String getUserCode() {
            return this.userCode;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final void e(long j10) {
            this.interval = j10;
        }

        public final void f(long lastPoll) {
            this.lastPoll = lastPoll;
        }

        public final void g(String str) {
            this.requestCode = str;
        }

        public final void h(String userCode) {
            this.userCode = userCode;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{userCode}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            this.authorizationUri = format;
        }

        public final boolean i() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.authorizationUri);
            dest.writeString(this.userCode);
            dest.writeString(this.requestCode);
            dest.writeLong(this.interval);
            dest.writeLong(this.lastPoll);
        }

        public RequestState(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b b(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray(EventKeys.DATA);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    String permission = optJSONObject.optString("permission");
                    Intrinsics.checkNotNullExpressionValue(permission, "permission");
                    if (permission.length() != 0 && !Intrinsics.areEqual(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }

        public Companion() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public List f30981a;

        /* renamed from: b, reason: collision with root package name */
        public List f30982b;

        /* renamed from: c, reason: collision with root package name */
        public List f30983c;

        public b(List grantedPermissions, List declinedPermissions, List expiredPermissions) {
            Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            this.f30981a = grantedPermissions;
            this.f30982b = declinedPermissions;
            this.f30983c = expiredPermissions;
        }

        public final List a() {
            return this.f30982b;
        }

        public final List b() {
            return this.f30983c;
        }

        public final List c() {
            return this.f30981a;
        }
    }

    public static final class c extends Dialog {
        public c(AbstractActivityC2168s abstractActivityC2168s, int i10) {
            super(abstractActivityC2168s, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.v0()) {
                super.onBackPressed();
            }
        }
    }

    public static final void C0(DeviceAuthDialog this$0, String userId, b permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        this$0.p0(userId, permissions, accessToken, date, date2);
    }

    public static final void D0(DeviceAuthDialog this$0, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View t02 = this$0.t0(false);
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.setContentView(t02);
        }
        LoginClient.Request request = this$0.request;
        if (request == null) {
            return;
        }
        this$0.H0(request);
    }

    public static final void F0(DeviceAuthDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A0();
    }

    public static final void I0(DeviceAuthDialog this$0, C4339K response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.isBeingDestroyed) {
            return;
        }
        if (response.b() != null) {
            FacebookRequestError b10 = response.b();
            C4357q exception = b10 == null ? null : b10.getException();
            if (exception == null) {
                exception = new C4357q();
            }
            this$0.x0(exception);
            return;
        }
        JSONObject c10 = response.c();
        if (c10 == null) {
            c10 = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.h(c10.getString("user_code"));
            requestState.g(c10.getString(EventKeys.ERROR_CODE));
            requestState.e(c10.getLong("interval"));
            this$0.G0(requestState);
        } catch (JSONException e10) {
            this$0.x0(new C4357q(e10));
        }
    }

    public static final void n0(DeviceAuthDialog this$0, C4339K response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        FacebookRequestError b10 = response.b();
        if (b10 == null) {
            try {
                JSONObject c10 = response.c();
                if (c10 == null) {
                    c10 = new JSONObject();
                }
                String string = c10.getString("access_token");
                Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                this$0.y0(string, c10.getLong("expires_in"), Long.valueOf(c10.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e10) {
                this$0.x0(new C4357q(e10));
                return;
            }
        }
        int subErrorCode = b10.getSubErrorCode();
        if (subErrorCode == f30960A || subErrorCode == 1349172) {
            this$0.E0();
            return;
        }
        if (subErrorCode != 1349152) {
            if (subErrorCode == 1349173) {
                this$0.w0();
                return;
            }
            FacebookRequestError b11 = response.b();
            C4357q exception = b11 == null ? null : b11.getException();
            if (exception == null) {
                exception = new C4357q();
            }
            this$0.x0(exception);
            return;
        }
        RequestState requestState = this$0.currentRequestState;
        if (requestState != null) {
            a aVar = a.f9517a;
            a.a(requestState.getUserCode());
        }
        LoginClient.Request request = this$0.request;
        if (request != null) {
            this$0.H0(request);
        } else {
            this$0.w0();
        }
    }

    public static final void u0(DeviceAuthDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w0();
    }

    public static final void z0(DeviceAuthDialog this$0, String accessToken, Date date, Date date2, C4339K response) {
        DeviceAuthDialog deviceAuthDialog;
        JSONException jSONException;
        EnumSet o10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        FacebookRequestError b10 = response.b();
        if (b10 != null) {
            C4357q exception = b10.getException();
            if (exception == null) {
                exception = new C4357q();
            }
            this$0.x0(exception);
            return;
        }
        try {
            JSONObject c10 = response.c();
            if (c10 == null) {
                try {
                    c10 = new JSONObject();
                } catch (JSONException e10) {
                    jSONException = e10;
                    deviceAuthDialog = this$0;
                    deviceAuthDialog.x0(new C4357q(jSONException));
                    return;
                }
            }
            String string = c10.getString(StackTraceHelper.ID_KEY);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
            b b11 = INSTANCE.b(c10);
            String string2 = c10.getString("name");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = this$0.currentRequestState;
            if (requestState != null) {
                a aVar = a.f9517a;
                a.a(requestState.getUserCode());
            }
            A a10 = A.f10965a;
            C1682w f10 = A.f(C4331C.m());
            Boolean bool = null;
            if (f10 != null && (o10 = f10.o()) != null) {
                bool = Boolean.valueOf(o10.contains(Q.RequireConfirm));
            }
            if (!Intrinsics.areEqual(bool, Boolean.TRUE) || this$0.isRetry) {
                this$0.p0(string, b11, accessToken, date, date2);
            } else {
                this$0.isRetry = true;
                this$0.B0(string, b11, accessToken, string2, date, date2);
            }
        } catch (JSONException e11) {
            deviceAuthDialog = this$0;
            jSONException = e11;
        }
    }

    public final void A0() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.f(new Date().getTime());
        }
        this.currentGraphRequestPoll = s0().l();
    }

    public final void B0(final String userId, final b permissions, final String accessToken, String name, final Date expirationTime, final Date dataAccessExpirationTime) {
        String string = getResources().getString(AbstractC6935e.f68616g);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(AbstractC6935e.f68615f);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(AbstractC6935e.f68614e);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(string2, Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: d8.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.C0(DeviceAuthDialog.this, userId, permissions, accessToken, expirationTime, dataAccessExpirationTime, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: d8.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.D0(DeviceAuthDialog.this, dialogInterface, i10);
            }
        });
        builder.create().show();
    }

    public final void E0() {
        RequestState requestState = this.currentRequestState;
        Long valueOf = requestState == null ? null : Long.valueOf(requestState.getInterval());
        if (valueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.INSTANCE.a().schedule(new Runnable() { // from class: d8.f
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.F0(DeviceAuthDialog.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    public final void G0(RequestState currentRequestState) {
        this.currentRequestState = currentRequestState;
        TextView textView = this.confirmationCode;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            throw null;
        }
        textView.setText(currentRequestState.getUserCode());
        a aVar = a.f9517a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), a.c(currentRequestState.getAuthorizationUri()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.isRetry && a.f(currentRequestState.getUserCode())) {
            new C4470F(getContext()).f("fb_smart_login_service");
        }
        if (currentRequestState.i()) {
            E0();
        } else {
            A0();
        }
    }

    public void H0(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.getPermissions()));
        Y y10 = Y.f11042a;
        Y.s0(bundle, "redirect_uri", request.getDeviceRedirectUriString());
        Y.s0(bundle, "target_user_id", request.getDeviceAuthTargetUserId());
        bundle.putString("access_token", q0());
        a aVar = a.f9517a;
        Map o02 = o0();
        bundle.putString("device_info", a.d(o02 == null ? null : MapsKt.toMutableMap(o02)));
        GraphRequest.f30314n.B(null, f30962y, bundle, new GraphRequest.b() { // from class: d8.h
            @Override // com.facebook.GraphRequest.b
            public final void a(C4339K c4339k) {
                DeviceAuthDialog.I0(DeviceAuthDialog.this, c4339k);
            }
        }).l();
    }

    public Map o0() {
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        c cVar = new c(requireActivity(), AbstractC6936f.f68618b);
        cVar.setContentView(t0(a.e() && !this.isRetry));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RequestState requestState;
        LoginClient l02;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        r rVar = (r) ((FacebookActivity) requireActivity()).getCurrentFragment();
        LoginMethodHandler loginMethodHandler = null;
        if (rVar != null && (l02 = rVar.l0()) != null) {
            loginMethodHandler = l02.j();
        }
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) loginMethodHandler;
        if (savedInstanceState == null || (requestState = (RequestState) savedInstanceState.getParcelable("request_state")) == null) {
            return onCreateView;
        }
        G0(requestState);
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        AsyncTaskC4337I asyncTaskC4337I = this.currentGraphRequestPoll;
        if (asyncTaskC4337I != null) {
            asyncTaskC4337I.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.scheduledPoll;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.isBeingDestroyed) {
            return;
        }
        w0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.currentRequestState != null) {
            outState.putParcelable("request_state", this.currentRequestState);
        }
    }

    public final void p0(String userId, b permissions, String accessToken, Date expirationTime, Date dataAccessExpirationTime) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.d0(accessToken, C4331C.m(), userId, permissions.c(), permissions.a(), permissions.b(), EnumC4347g.DEVICE_AUTH, expirationTime, null, dataAccessExpirationTime);
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    public String q0() {
        return Z.b() + '|' + Z.c();
    }

    public int r0(boolean isSmartLogin) {
        return isSmartLogin ? AbstractC6934d.f68609d : AbstractC6934d.f68607b;
    }

    public final GraphRequest s0() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString(EventKeys.ERROR_CODE, requestState == null ? null : requestState.getRequestCode());
        bundle.putString("access_token", q0());
        return GraphRequest.f30314n.B(null, f30963z, bundle, new GraphRequest.b() { // from class: d8.g
            @Override // com.facebook.GraphRequest.b
            public final void a(C4339K c4339k) {
                DeviceAuthDialog.n0(DeviceAuthDialog.this, c4339k);
            }
        });
    }

    public View t0(boolean isSmartLogin) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(r0(isSmartLogin), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(AbstractC6933c.f68605f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = findViewById;
        View findViewById2 = inflate.findViewById(AbstractC6933c.f68604e);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.confirmationCode = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(AbstractC6933c.f68600a);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: d8.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.u0(DeviceAuthDialog.this, view);
            }
        });
        View findViewById4 = inflate.findViewById(AbstractC6933c.f68601b);
        if (findViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        this.instructions = textView;
        textView.setText(Html.fromHtml(getString(AbstractC6935e.f68610a)));
        return inflate;
    }

    public boolean v0() {
        return true;
    }

    public void w0() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                a aVar = a.f9517a;
                a.a(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.Z();
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public void x0(C4357q ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                a aVar = a.f9517a;
                a.a(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.a0(ex);
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public final void y0(final String accessToken, long expiresIn, Long dataAccessExpirationTime) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = expiresIn != 0 ? new Date(new Date().getTime() + (expiresIn * 1000)) : null;
        if ((dataAccessExpirationTime == null || dataAccessExpirationTime.longValue() != 0) && dataAccessExpirationTime != null) {
            date = new Date(dataAccessExpirationTime.longValue() * 1000);
        }
        final Date date3 = date;
        final Date date4 = date2;
        GraphRequest x10 = GraphRequest.f30314n.x(new AccessToken(accessToken, C4331C.m(), "0", null, null, null, null, date2, null, date3, null, 1024, null), "me", new GraphRequest.b() { // from class: d8.i
            @Override // com.facebook.GraphRequest.b
            public final void a(C4339K c4339k) {
                DeviceAuthDialog.z0(DeviceAuthDialog.this, accessToken, date4, date3, c4339k);
            }
        });
        x10.I(EnumC4340L.GET);
        x10.J(bundle);
        x10.l();
    }
}
