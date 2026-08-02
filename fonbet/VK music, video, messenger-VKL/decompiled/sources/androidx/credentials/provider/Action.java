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

/* compiled from: Action.kt */
/* loaded from: classes12.dex */
public final class Action {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ACTION_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.ACTION_PENDING_INTENT_";
    private static final String EXTRA_ACTION_SIZE = "androidx.credentials.provider.extra.ACTION_SIZE";
    private static final String EXTRA_ACTION_SUBTITLE_PREFIX = "androidx.credentials.provider.extra.ACTION_SUBTITLE_";
    private static final String EXTRA_ACTION_TITLE_PREFIX = "androidx.credentials.provider.extra.ACTION_TITLE_";
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_HINT_SUBTITLE = "androidx.credentials.provider.action.HINT_ACTION_SUBTEXT";
    private static final String SLICE_HINT_TITLE = "androidx.credentials.provider.action.HINT_ACTION_TITLE";
    private static final int SLICE_SPEC_REVISION = 0;
    private static final String SLICE_SPEC_TYPE = "Action";
    private static final String TAG = "Action";
    private final PendingIntent pendingIntent;
    private final CharSequence subtitle;
    private final CharSequence title;

    /* compiled from: Action.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final Action fromAction(android.service.credentials.Action action) {
            return Action.Companion.fromSlice(action.getSlice());
        }
    }

    /* compiled from: Action.kt */
    public static final class Builder {
        private final PendingIntent pendingIntent;
        private CharSequence subtitle;
        private final CharSequence title;

        public Builder(CharSequence charSequence, PendingIntent pendingIntent) {
            this.title = charSequence;
            this.pendingIntent = pendingIntent;
        }

        public final Action build() {
            return new Action(this.title, this.pendingIntent, this.subtitle);
        }

        public final Builder setSubtitle(CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }
    }

    /* compiled from: Action.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Action fromAction(android.service.credentials.Action action) {
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromAction(action);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public final Action fromSlice(Slice slice) {
            CharSequence charSequence = "";
            PendingIntent pendingIntent = null;
            CharSequence charSequence2 = null;
            for (SliceItem sliceItem : slice.getItems()) {
                if (sliceItem.hasHint(Action.SLICE_HINT_TITLE)) {
                    charSequence = sliceItem.getText();
                } else if (sliceItem.hasHint(Action.SLICE_HINT_SUBTITLE)) {
                    charSequence2 = sliceItem.getText();
                } else if (sliceItem.hasHint(Action.SLICE_HINT_PENDING_INTENT)) {
                    pendingIntent = sliceItem.getAction();
                }
            }
            try {
                return new Action(charSequence, pendingIntent, charSequence2);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final void marshall$credentials_release(List<Action> list, Bundle bundle) {
            bundle.putInt(Action.EXTRA_ACTION_SIZE, list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bundle.putParcelable(lhg.a(i, Action.EXTRA_ACTION_PENDING_INTENT_PREFIX), list.get(i).getPendingIntent());
                bundle.putCharSequence(Action.EXTRA_ACTION_TITLE_PREFIX + i, list.get(i).getTitle());
                bundle.putCharSequence(Action.EXTRA_ACTION_SUBTITLE_PREFIX + i, list.get(i).getSubtitle());
            }
        }

        public final Slice toSlice(Action action) {
            CharSequence title = action.getTitle();
            CharSequence subtitle = action.getSubtitle();
            PendingIntent pendingIntent = action.getPendingIntent();
            Slice.Builder addText = new Slice.Builder(Uri.EMPTY, new SliceSpec("Action", 0)).addText(title, null, Collections.singletonList(Action.SLICE_HINT_TITLE)).addText(subtitle, null, Collections.singletonList(Action.SLICE_HINT_SUBTITLE));
            addText.addAction(pendingIntent, new Slice.Builder(addText).addHints(Collections.singletonList(Action.SLICE_HINT_PENDING_INTENT)).build(), null);
            return addText.build();
        }

        public final List<Action> unmarshallActionList$credentials_release(Bundle bundle) {
            ArrayList arrayList = new ArrayList();
            int i = bundle.getInt(Action.EXTRA_ACTION_SIZE, 0);
            for (int i2 = 0; i2 < i; i2++) {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(Action.EXTRA_ACTION_PENDING_INTENT_PREFIX + i2);
                CharSequence charSequence = bundle.getCharSequence(Action.EXTRA_ACTION_TITLE_PREFIX + i2);
                CharSequence charSequence2 = bundle.getCharSequence(Action.EXTRA_ACTION_SUBTITLE_PREFIX + i2);
                if (pendingIntent == null || charSequence == null) {
                    return EmptyList.b;
                }
                arrayList.add(new Action(charSequence, pendingIntent, charSequence2));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public Action(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2) {
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        this.subtitle = charSequence2;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    public static final Action fromAction(android.service.credentials.Action action) {
        return Companion.fromAction(action);
    }

    @SuppressLint({"WrongConstant"})
    public static final Action fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(Action action) {
        return Companion.toSlice(action);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return epx.f(this.title, action.title) && epx.f(this.pendingIntent, action.pendingIntent) && epx.f(this.subtitle, action.subtitle);
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.pendingIntent.hashCode() + (this.title.hashCode() * 31)) * 31;
        CharSequence charSequence = this.subtitle;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public /* synthetic */ Action(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, int i, zcl zclVar) {
        this(charSequence, pendingIntent, (i & 4) != 0 ? null : charSequence2);
    }
}
