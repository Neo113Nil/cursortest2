package com.RNAppleAuthentication;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.hermes.intl.Constants;
import com.google.crypto.tink.integration.android.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import t3.AbstractC6439f;
import t3.InterfaceC6437d;
import u3.c;

/* loaded from: classes.dex */
public final class SignInWithAppleService {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f28117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28118b;

    /* renamed from: c, reason: collision with root package name */
    public final a f28119c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f28120d;

    public SignInWithAppleService(FragmentManager fragmentManager, String fragmentTag, a configuration, Function1 callback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f28117a = fragmentManager;
        this.f28118b = fragmentTag;
        this.f28119c = configuration;
        this.f28120d = callback;
        Fragment p02 = fragmentManager.p0(fragmentTag);
        c cVar = p02 instanceof c ? (c) p02 : null;
        if (cVar != null) {
            cVar.g0(callback);
        }
    }

    public final void a() {
        c a10 = c.INSTANCE.a(AuthenticationAttempt.INSTANCE.a(this.f28119c), this.f28119c.b());
        a10.g0(this.f28120d);
        a10.show(this.f28117a, this.f28118b);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/RNAppleAuthentication/SignInWithAppleService$AuthenticationAttempt;", "Landroid/os/Parcelable;", "", "authenticationUri", "redirectUri", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", b.f37029b, "c", "CREATOR", "invertase_react-native-apple-authentication_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthenticationAttempt implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String authenticationUri;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String redirectUri;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String state;

        /* renamed from: com.RNAppleAuthentication.SignInWithAppleService$AuthenticationAttempt$a, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AuthenticationAttempt a(a configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Uri.Builder buildUpon = Uri.parse("https://appleid.apple.com/auth/authorize").buildUpon();
                buildUpon.appendQueryParameter("client_id", configuration.a());
                buildUpon.appendQueryParameter("redirect_uri", configuration.e());
                buildUpon.appendQueryParameter("response_type", configuration.f());
                buildUpon.appendQueryParameter("scope", configuration.g());
                buildUpon.appendQueryParameter("response_mode", "form_post");
                buildUpon.appendQueryParameter("state", configuration.h());
                if (!StringsKt.isBlank(configuration.c())) {
                    buildUpon.appendQueryParameter("nonce", configuration.c());
                }
                String uri = buildUpon.build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                return new AuthenticationAttempt(uri, configuration.e(), configuration.h());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AuthenticationAttempt createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuthenticationAttempt(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public AuthenticationAttempt[] newArray(int i10) {
                return new AuthenticationAttempt[i10];
            }

            public Companion() {
            }
        }

        public AuthenticationAttempt(String authenticationUri, String redirectUri, String state) {
            Intrinsics.checkNotNullParameter(authenticationUri, "authenticationUri");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            Intrinsics.checkNotNullParameter(state, "state");
            this.authenticationUri = authenticationUri;
            this.redirectUri = redirectUri;
            this.state = state;
        }

        /* renamed from: a, reason: from getter */
        public final String getAuthenticationUri() {
            return this.authenticationUri;
        }

        /* renamed from: b, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        /* renamed from: c, reason: from getter */
        public final String getState() {
            return this.state;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthenticationAttempt)) {
                return false;
            }
            AuthenticationAttempt authenticationAttempt = (AuthenticationAttempt) other;
            return Intrinsics.areEqual(this.authenticationUri, authenticationAttempt.authenticationUri) && Intrinsics.areEqual(this.redirectUri, authenticationAttempt.redirectUri) && Intrinsics.areEqual(this.state, authenticationAttempt.state);
        }

        public int hashCode() {
            return (((this.authenticationUri.hashCode() * 31) + this.redirectUri.hashCode()) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "AuthenticationAttempt(authenticationUri=" + this.authenticationUri + ", redirectUri=" + this.redirectUri + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.authenticationUri);
            parcel.writeString(this.redirectUri);
            parcel.writeString(this.state);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AuthenticationAttempt(Parcel parcel) {
            this(r0, r2, r4 != null ? r4 : r1);
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String str = Constants.COLLATION_INVALID;
            readString = readString == null ? Constants.COLLATION_INVALID : readString;
            String readString2 = parcel.readString();
            readString2 = readString2 == null ? Constants.COLLATION_INVALID : readString2;
            String readString3 = parcel.readString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignInWithAppleService(FragmentManager fragmentManager, String fragmentTag, a configuration, InterfaceC6437d callback) {
        this(fragmentManager, fragmentTag, configuration, AbstractC6439f.b(callback));
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
