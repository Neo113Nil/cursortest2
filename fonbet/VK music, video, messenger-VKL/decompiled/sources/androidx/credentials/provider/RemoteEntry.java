package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import xsna.epx;
import xsna.zcl;

/* compiled from: RemoteEntry.kt */
/* loaded from: classes12.dex */
public final class RemoteEntry {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_REMOTE_ENTRY_PENDING_INTENT = "androidx.credentials.provider.extra.REMOTE_ENTRY_PENDING_INTENT";
    private static final int REVISION_ID = 1;
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_SPEC_TYPE = "RemoteEntry";
    private static final String TAG = "RemoteEntry";
    private final PendingIntent pendingIntent;

    /* compiled from: RemoteEntry.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
            return RemoteEntry.Companion.fromSlice(remoteEntry.getSlice());
        }
    }

    /* compiled from: RemoteEntry.kt */
    public static final class Builder {
        private final PendingIntent pendingIntent;

        public Builder(PendingIntent pendingIntent) {
            this.pendingIntent = pendingIntent;
        }

        public final RemoteEntry build() {
            return new RemoteEntry(this.pendingIntent);
        }
    }

    /* compiled from: RemoteEntry.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromRemoteEntry(remoteEntry);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public final RemoteEntry fromSlice(Slice slice) {
            PendingIntent pendingIntent = null;
            for (SliceItem sliceItem : slice.getItems()) {
                if (sliceItem.hasHint(RemoteEntry.SLICE_HINT_PENDING_INTENT)) {
                    pendingIntent = sliceItem.getAction();
                }
            }
            try {
                return new RemoteEntry(pendingIntent);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final void marshall$credentials_release(RemoteEntry remoteEntry, Bundle bundle) {
            bundle.putParcelable(RemoteEntry.EXTRA_REMOTE_ENTRY_PENDING_INTENT, remoteEntry.getPendingIntent());
        }

        public final Slice toSlice(RemoteEntry remoteEntry) {
            PendingIntent pendingIntent = remoteEntry.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("RemoteEntry", 1));
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(RemoteEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
            return builder.build();
        }

        public final RemoteEntry unmarshallRemoteEntry$credentials_release(Bundle bundle) {
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(RemoteEntry.EXTRA_REMOTE_ENTRY_PENDING_INTENT);
            if (pendingIntent == null) {
                return null;
            }
            return new RemoteEntry(pendingIntent);
        }

        private Companion() {
        }
    }

    public RemoteEntry(PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }

    public static final RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
        return Companion.fromRemoteEntry(remoteEntry);
    }

    @SuppressLint({"WrongConstant"})
    public static final RemoteEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(RemoteEntry remoteEntry) {
        return Companion.toSlice(remoteEntry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteEntry) {
            return epx.f(this.pendingIntent, ((RemoteEntry) obj).pendingIntent);
        }
        return false;
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public int hashCode() {
        return this.pendingIntent.hashCode();
    }
}
