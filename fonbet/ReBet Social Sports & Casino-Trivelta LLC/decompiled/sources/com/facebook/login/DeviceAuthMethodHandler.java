package com.facebook.login;

import W9.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractActivityC2168s;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient;
import com.google.crypto.tink.integration.android.b;
import g6.EnumC4347g;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 12\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0085\u0001\u0010&\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001c2\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001c2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", "request", "", "N", "(Lcom/facebook/login/LoginClient$Request;)I", "Lcom/facebook/login/DeviceAuthDialog;", "Y", "()Lcom/facebook/login/DeviceAuthDialog;", "", "Z", "()V", "Ljava/lang/Exception;", "ex", "a0", "(Ljava/lang/Exception;)V", "", "accessToken", "applicationId", "userId", "", "permissions", "declinedPermissions", "expiredPermissions", "Lg6/g;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "d0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lg6/g;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "describeContents", "()I", "e0", "(Lcom/facebook/login/LoginClient$Request;)V", d.f13160a, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "nameForLogging", e.f29601m, b.f37029b, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* renamed from: f, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f30986f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DeviceAuthMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i10) {
            return new DeviceAuthMethodHandler[i10];
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (DeviceAuthMethodHandler.f30986f == null) {
                    DeviceAuthMethodHandler.f30986f = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f30986f;
                if (scheduledThreadPoolExecutor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backgroundExecutor");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return scheduledThreadPoolExecutor;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int N(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        e0(request);
        return 1;
    }

    public DeviceAuthDialog Y() {
        return new DeviceAuthDialog();
    }

    public void Z() {
        d().g(LoginClient.Result.INSTANCE.a(d().getPendingRequest(), "User canceled log in."));
    }

    public void a0(Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        d().g(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, d().getPendingRequest(), null, ex.getMessage(), null, 8, null));
    }

    public void d0(String accessToken, String applicationId, String userId, Collection permissions, Collection declinedPermissions, Collection expiredPermissions, EnumC4347g accessTokenSource, Date expirationTime, Date lastRefreshTime, Date dataAccessExpirationTime) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        d().g(LoginClient.Result.INSTANCE.e(d().getPendingRequest(), new AccessToken(accessToken, applicationId, userId, permissions, declinedPermissions, expiredPermissions, accessTokenSource, expirationTime, lastRefreshTime, dataAccessExpirationTime, null, 1024, null)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e0(LoginClient.Request request) {
        AbstractActivityC2168s i10 = d().i();
        if (i10 == null || i10.isFinishing()) {
            return;
        }
        DeviceAuthDialog Y10 = Y();
        Y10.show(i10.getSupportFragmentManager(), "login_with_facebook");
        Y10.H0(request);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.nameForLogging = "device_auth";
    }
}
