package com.facebook.login;

import T7.C1667g;
import T7.M;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractActivityC2168s;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.login.LoginClient;
import com.google.crypto.tink.integration.android.b;
import d8.EnumC4025a;
import d8.EnumC4028d;
import g6.C4331C;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", "request", "", "N", "(Lcom/facebook/login/LoginClient$Request;)I", "", "J", "()Z", "describeContents", "()I", "", e.f29601m, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "nameForLogging", b.f37029b, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new KatanaProxyLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int i10) {
            return new KatanaProxyLoginMethodHandler[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "katana_proxy_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean J() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int N(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        boolean z10 = C4331C.f46938r && C1667g.a() != null && request.getLoginBehavior().b();
        String a10 = LoginClient.INSTANCE.a();
        M m10 = M.f11009a;
        AbstractActivityC2168s i10 = d().i();
        String applicationId = request.getApplicationId();
        Set permissions = request.getPermissions();
        boolean isRerequest = request.getIsRerequest();
        boolean O10 = request.O();
        EnumC4028d defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = EnumC4028d.NONE;
        }
        EnumC4028d enumC4028d = defaultAudience;
        String c10 = c(request.getAuthId());
        String authType = request.getAuthType();
        String messengerPageId = request.getMessengerPageId();
        boolean resetMessengerState = request.getResetMessengerState();
        boolean isFamilyLogin = request.getIsFamilyLogin();
        boolean shouldSkipAccountDeduplication = request.getShouldSkipAccountDeduplication();
        String nonce = request.getNonce();
        String codeChallenge = request.getCodeChallenge();
        EnumC4025a codeChallengeMethod = request.getCodeChallengeMethod();
        List o10 = M.o(i10, applicationId, permissions, a10, isRerequest, O10, enumC4028d, c10, authType, z10, messengerPageId, resetMessengerState, isFamilyLogin, shouldSkipAccountDeduplication, nonce, codeChallenge, codeChallengeMethod == null ? null : codeChallengeMethod.name());
        a("e2e", a10);
        Iterator it = o10.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            if (j0((Intent) it.next(), LoginClient.INSTANCE.b())) {
                return i11;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "katana_proxy_auth";
    }
}
