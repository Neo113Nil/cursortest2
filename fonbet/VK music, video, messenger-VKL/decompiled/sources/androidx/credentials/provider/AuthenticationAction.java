package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.lhg;
import xsna.zcl;

/* compiled from: AuthenticationAction.kt */
/* loaded from: classes12.dex */
public final class AuthenticationAction {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.AUTH_ACTION_PENDING_INTENT_";
    private static final String EXTRA_AUTH_ACTION_SIZE = "androidx.credentials.provider.extra.AUTH_ACTION_SIZE";
    private static final String EXTRA_AUTH_ACTION_TITLE_PREFIX = "androidx.credentials.provider.extra.AUTH_ACTION_TITLE_";
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_HINT_TITLE = "androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE";
    private static final int SLICE_SPEC_REVISION = 0;
    private static final String SLICE_SPEC_TYPE = "AuthenticationAction";
    private static final String TAG = "AuthenticationAction";
    private final PendingIntent pendingIntent;
    private final CharSequence title;

    /* compiled from: AuthenticationAction.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final AuthenticationAction fromAction(android.service.credentials.Action action) {
            return AuthenticationAction.Companion.fromSlice(action.getSlice());
        }
    }

    /* compiled from: AuthenticationAction.kt */
    public static final class Builder {
        private final PendingIntent pendingIntent;
        private final CharSequence title;

        public Builder(CharSequence charSequence, PendingIntent pendingIntent) {
            this.title = charSequence;
            this.pendingIntent = pendingIntent;
        }

        public final AuthenticationAction build() {
            return new AuthenticationAction(this.title, this.pendingIntent);
        }
    }

    /* compiled from: AuthenticationAction.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AuthenticationAction fromAction(android.service.credentials.Action action) {
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromAction(action);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public final AuthenticationAction fromSlice(Slice slice) {
            CharSequence charSequence = null;
            PendingIntent pendingIntent = null;
            for (SliceItem sliceItem : slice.getItems()) {
                if (sliceItem.hasHint(AuthenticationAction.SLICE_HINT_PENDING_INTENT)) {
                    pendingIntent = sliceItem.getAction();
                } else if (sliceItem.hasHint(AuthenticationAction.SLICE_HINT_TITLE)) {
                    charSequence = sliceItem.getText();
                }
            }
            try {
                return new AuthenticationAction(charSequence, pendingIntent);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final void marshall$credentials_release(List<AuthenticationAction> list, Bundle bundle) {
            bundle.putInt(AuthenticationAction.EXTRA_AUTH_ACTION_SIZE, list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bundle.putParcelable(lhg.a(i, AuthenticationAction.EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX), list.get(i).getPendingIntent());
                bundle.putCharSequence(AuthenticationAction.EXTRA_AUTH_ACTION_TITLE_PREFIX + i, list.get(i).getTitle());
            }
        }

        public final Slice toSlice(AuthenticationAction authenticationAction) {
            CharSequence title = authenticationAction.getTitle();
            PendingIntent pendingIntent = authenticationAction.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("AuthenticationAction", 0));
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(AuthenticationAction.SLICE_HINT_PENDING_INTENT)).build(), null).addText(title, null, Collections.singletonList(AuthenticationAction.SLICE_HINT_TITLE));
            return builder.build();
        }

        public final List<AuthenticationAction> unmarshallAuthActionList$credentials_release(Bundle bundle) {
            ArrayList arrayList = new ArrayList();
            int i = bundle.getInt(AuthenticationAction.EXTRA_AUTH_ACTION_SIZE, 0);
            for (int i2 = 0; i2 < i; i2++) {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(AuthenticationAction.EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX + i2);
                CharSequence charSequence = bundle.getCharSequence(AuthenticationAction.EXTRA_AUTH_ACTION_TITLE_PREFIX + i2);
                if (pendingIntent == null || charSequence == null) {
                    return EmptyList.b;
                }
                arrayList.add(new AuthenticationAction(charSequence, pendingIntent));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public AuthenticationAction(CharSequence charSequence, PendingIntent pendingIntent) {
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    public static final AuthenticationAction fromAction(android.service.credentials.Action action) {
        return Companion.fromAction(action);
    }

    @SuppressLint({"WrongConstant"})
    public static final AuthenticationAction fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(AuthenticationAction authenticationAction) {
        return Companion.toSlice(authenticationAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationAction)) {
            return false;
        }
        AuthenticationAction authenticationAction = (AuthenticationAction) obj;
        return epx.f(this.title, authenticationAction.title) && epx.f(this.pendingIntent, authenticationAction.pendingIntent);
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.pendingIntent.hashCode() + (this.title.hashCode() * 31);
    }
}
