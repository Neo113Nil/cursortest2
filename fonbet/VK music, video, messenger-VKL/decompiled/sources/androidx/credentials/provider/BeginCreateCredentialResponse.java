package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.j5g;
import xsna.zcl;

/* compiled from: BeginCreateCredentialResponse.kt */
/* loaded from: classes12.dex */
public final class BeginCreateCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private final List<CreateEntry> createEntries;
    private final RemoteEntry remoteEntry;

    /* compiled from: BeginCreateCredentialResponse.kt */
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialResponse beginCreateCredentialResponse) {
            CreateEntry.Companion.marshall$credentials_release(beginCreateCredentialResponse.getCreateEntries(), bundle);
            RemoteEntry remoteEntry = beginCreateCredentialResponse.getRemoteEntry();
            if (remoteEntry != null) {
                RemoteEntry.Companion.marshall$credentials_release(remoteEntry, bundle);
            }
        }

        public static final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
            List<CreateEntry> unmarshallCreateEntries$credentials_release = CreateEntry.Companion.unmarshallCreateEntries$credentials_release(bundle);
            RemoteEntry unmarshallRemoteEntry$credentials_release = RemoteEntry.Companion.unmarshallRemoteEntry$credentials_release(bundle);
            if (unmarshallCreateEntries$credentials_release.isEmpty() && unmarshallRemoteEntry$credentials_release == null) {
                return null;
            }
            return new BeginCreateCredentialResponse(unmarshallCreateEntries$credentials_release, unmarshallRemoteEntry$credentials_release);
        }
    }

    /* compiled from: BeginCreateCredentialResponse.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialResponse";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialResponse beginCreateCredentialResponse) {
            bundle.putParcelable(REQUEST_KEY, BeginCreateCredentialUtil.Companion.convertToFrameworkResponse(beginCreateCredentialResponse));
        }

        public static final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
            android.service.credentials.BeginCreateCredentialResponse beginCreateCredentialResponse = (android.service.credentials.BeginCreateCredentialResponse) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginCreateCredentialResponse.class);
            if (beginCreateCredentialResponse != null) {
                return BeginCreateCredentialUtil.Companion.convertToJetpackResponse(beginCreateCredentialResponse);
            }
            return null;
        }
    }

    /* compiled from: BeginCreateCredentialResponse.kt */
    public static final class Builder {
        private List<CreateEntry> createEntries = new ArrayList();
        private RemoteEntry remoteEntry;

        public final Builder addCreateEntry(CreateEntry createEntry) {
            this.createEntries.add(createEntry);
            return this;
        }

        public final BeginCreateCredentialResponse build() {
            return new BeginCreateCredentialResponse(j5g.O0(this.createEntries), this.remoteEntry);
        }

        public final Builder setCreateEntries(List<CreateEntry> list) {
            this.createEntries = new ArrayList(list);
            return this;
        }

        public final Builder setRemoteEntry(RemoteEntry remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    /* compiled from: BeginCreateCredentialResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(BeginCreateCredentialResponse beginCreateCredentialResponse) {
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginCreateCredentialResponse);
                return bundle;
            }
            Api23Impl.asBundle(bundle, beginCreateCredentialResponse);
            return bundle;
        }

        public final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api23Impl.fromBundle(bundle);
        }

        private Companion() {
        }
    }

    public BeginCreateCredentialResponse() {
        this(null, null, 3, null);
    }

    public static final Bundle asBundle(BeginCreateCredentialResponse beginCreateCredentialResponse) {
        return Companion.asBundle(beginCreateCredentialResponse);
    }

    public static final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final List<CreateEntry> getCreateEntries() {
        return this.createEntries;
    }

    public final RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    public BeginCreateCredentialResponse(List<CreateEntry> list, RemoteEntry remoteEntry) {
        this.createEntries = list;
        this.remoteEntry = remoteEntry;
    }

    public BeginCreateCredentialResponse(List list, RemoteEntry remoteEntry, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? null : remoteEntry);
    }
}
