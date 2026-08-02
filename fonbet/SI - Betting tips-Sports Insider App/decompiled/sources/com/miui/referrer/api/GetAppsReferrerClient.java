package com.miui.referrer.api;

import android.content.Context;
import android.os.RemoteException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&R\u0014\u0010\u0003\u001a\u00020\u00048fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/miui/referrer/api/GetAppsReferrerClient;", "", "()V", "installReferrer", "Lcom/miui/referrer/api/GetAppsReferrerDetails;", "getInstallReferrer", "()Lcom/miui/referrer/api/GetAppsReferrerDetails;", "isReady", "", "()Z", "endConnection", "", "startConnection", "stateListener", "Lcom/miui/referrer/api/GetAppsReferrerStateListener;", "Builder", "Companion", "referrer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class GetAppsReferrerClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/miui/referrer/api/GetAppsReferrerClient$Builder;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "build", "Lcom/miui/referrer/api/GetAppsReferrerClient;", "referrer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Context mContext;

        public Builder(@NotNull Context mContext) {
            Intrinsics.checkNotNullParameter(mContext, "mContext");
            this.mContext = mContext;
        }

        @NotNull
        public final GetAppsReferrerClient build() {
            return new GetAppsReferrerClientImpl(this.mContext);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/miui/referrer/api/GetAppsReferrerClient$Companion;", "", "()V", "newBuilder", "Lcom/miui/referrer/api/GetAppsReferrerClient$Builder;", "context", "Landroid/content/Context;", "referrer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Builder(context);
        }

        private Companion() {
        }
    }

    public abstract void endConnection();

    @NotNull
    public abstract GetAppsReferrerDetails getInstallReferrer() throws RemoteException;

    public abstract boolean isReady();

    public abstract void startConnection(@NotNull GetAppsReferrerStateListener stateListener);
}
