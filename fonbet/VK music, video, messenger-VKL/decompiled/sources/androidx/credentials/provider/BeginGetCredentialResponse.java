package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.j5g;
import xsna.zcl;

/* compiled from: BeginGetCredentialResponse.kt */
/* loaded from: classes12.dex */
public final class BeginGetCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private final List<Action> actions;
    private final List<AuthenticationAction> authenticationActions;
    private final List<CredentialEntry> credentialEntries;
    private final RemoteEntry remoteEntry;

    /* compiled from: BeginGetCredentialResponse.kt */
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialResponse beginGetCredentialResponse) {
            CredentialEntry.Companion.marshall$credentials_release(beginGetCredentialResponse.getCredentialEntries(), bundle);
            Action.Companion.marshall$credentials_release(beginGetCredentialResponse.getActions(), bundle);
            AuthenticationAction.Companion.marshall$credentials_release(beginGetCredentialResponse.getAuthenticationActions(), bundle);
            RemoteEntry remoteEntry = beginGetCredentialResponse.getRemoteEntry();
            if (remoteEntry != null) {
                RemoteEntry.Companion.marshall$credentials_release(remoteEntry, bundle);
            }
        }

        public static final BeginGetCredentialResponse fromBundle(Bundle bundle) {
            List<CredentialEntry> unmarshallCredentialEntries$credentials_release = CredentialEntry.Companion.unmarshallCredentialEntries$credentials_release(bundle);
            List<Action> unmarshallActionList$credentials_release = Action.Companion.unmarshallActionList$credentials_release(bundle);
            List<AuthenticationAction> unmarshallAuthActionList$credentials_release = AuthenticationAction.Companion.unmarshallAuthActionList$credentials_release(bundle);
            RemoteEntry unmarshallRemoteEntry$credentials_release = RemoteEntry.Companion.unmarshallRemoteEntry$credentials_release(bundle);
            if (unmarshallCredentialEntries$credentials_release.isEmpty() && unmarshallActionList$credentials_release.isEmpty() && unmarshallAuthActionList$credentials_release.isEmpty() && unmarshallRemoteEntry$credentials_release == null) {
                return null;
            }
            return new BeginGetCredentialResponse(unmarshallCredentialEntries$credentials_release, unmarshallActionList$credentials_release, unmarshallAuthActionList$credentials_release, unmarshallRemoteEntry$credentials_release);
        }
    }

    /* compiled from: BeginGetCredentialResponse.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialResponse";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialResponse beginGetCredentialResponse) {
            bundle.putParcelable(REQUEST_KEY, BeginGetCredentialUtil.Companion.convertToFrameworkResponse(beginGetCredentialResponse));
        }

        public static final BeginGetCredentialResponse fromBundle(Bundle bundle) {
            android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponse = (android.service.credentials.BeginGetCredentialResponse) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse != null) {
                return BeginGetCredentialUtil.Companion.convertToJetpackResponse(beginGetCredentialResponse);
            }
            return null;
        }
    }

    /* compiled from: BeginGetCredentialResponse.kt */
    public static final class Builder {
        private RemoteEntry remoteEntry;
        private List<CredentialEntry> credentialEntries = new ArrayList();
        private List<Action> actions = new ArrayList();
        private List<AuthenticationAction> authenticationActions = new ArrayList();

        public final Builder addAction(Action action) {
            this.actions.add(action);
            return this;
        }

        public final Builder addAuthenticationAction(AuthenticationAction authenticationAction) {
            this.authenticationActions.add(authenticationAction);
            return this;
        }

        public final Builder addCredentialEntry(CredentialEntry credentialEntry) {
            this.credentialEntries.add(credentialEntry);
            return this;
        }

        public final BeginGetCredentialResponse build() {
            return new BeginGetCredentialResponse(j5g.O0(this.credentialEntries), j5g.O0(this.actions), j5g.O0(this.authenticationActions), this.remoteEntry);
        }

        public final Builder setActions(List<Action> list) {
            this.actions = new ArrayList(list);
            return this;
        }

        public final Builder setAuthenticationActions(List<AuthenticationAction> list) {
            this.authenticationActions = new ArrayList(list);
            return this;
        }

        public final Builder setCredentialEntries(List<? extends CredentialEntry> list) {
            this.credentialEntries = new ArrayList(list);
            return this;
        }

        public final Builder setRemoteEntry(RemoteEntry remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    /* compiled from: BeginGetCredentialResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(BeginGetCredentialResponse beginGetCredentialResponse) {
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginGetCredentialResponse);
                return bundle;
            }
            Api23Impl.asBundle(bundle, beginGetCredentialResponse);
            return bundle;
        }

        public final BeginGetCredentialResponse fromBundle(Bundle bundle) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api23Impl.fromBundle(bundle);
        }

        private Companion() {
        }
    }

    public BeginGetCredentialResponse() {
        this(null, null, null, null, 15, null);
    }

    public static final Bundle asBundle(BeginGetCredentialResponse beginGetCredentialResponse) {
        return Companion.asBundle(beginGetCredentialResponse);
    }

    public static final BeginGetCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final List<Action> getActions() {
        return this.actions;
    }

    public final List<AuthenticationAction> getAuthenticationActions() {
        return this.authenticationActions;
    }

    public final List<CredentialEntry> getCredentialEntries() {
        return this.credentialEntries;
    }

    public final RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialResponse(List<? extends CredentialEntry> list, List<Action> list2, List<AuthenticationAction> list3, RemoteEntry remoteEntry) {
        this.credentialEntries = list;
        this.actions = list2;
        this.authenticationActions = list3;
        this.remoteEntry = remoteEntry;
    }

    public BeginGetCredentialResponse(List list, List list2, List list3, RemoteEntry remoteEntry, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EmptyList.b : list2, (i & 4) != 0 ? EmptyList.b : list3, (i & 8) != 0 ? null : remoteEntry);
    }
}
