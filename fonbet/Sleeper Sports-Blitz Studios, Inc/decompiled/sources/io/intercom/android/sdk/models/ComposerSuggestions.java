package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposerSuggestions.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/models/ComposerSuggestions;", "", ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "", "Lio/intercom/android/sdk/models/ComposerSuggestions$Suggestion;", "isComposerDisabled", "", "snapshotId", "", "<init>", "(Ljava/util/List;ZLjava/lang/Long;)V", "getSuggestions", "()Ljava/util/List;", "()Z", "getSnapshotId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/util/List;ZLjava/lang/Long;)Lio/intercom/android/sdk/models/ComposerSuggestions;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Suggestion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ComposerSuggestions {
    public static final int $stable = 8;

    @SerializedName("composer_disabled")
    private final boolean isComposerDisabled;

    @SerializedName("snapshot_id")
    private final Long snapshotId;

    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS)
    private final List<Suggestion> suggestions;

    public ComposerSuggestions() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerSuggestions copy$default(ComposerSuggestions composerSuggestions, List list, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = composerSuggestions.suggestions;
        }
        if ((i & 2) != 0) {
            z = composerSuggestions.isComposerDisabled;
        }
        if ((i & 4) != 0) {
            l = composerSuggestions.snapshotId;
        }
        return composerSuggestions.copy(list, z, l);
    }

    public final List<Suggestion> component1() {
        return this.suggestions;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsComposerDisabled() {
        return this.isComposerDisabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSnapshotId() {
        return this.snapshotId;
    }

    public final ComposerSuggestions copy(List<Suggestion> suggestions, boolean isComposerDisabled, Long snapshotId) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new ComposerSuggestions(suggestions, isComposerDisabled, snapshotId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposerSuggestions)) {
            return false;
        }
        ComposerSuggestions composerSuggestions = (ComposerSuggestions) other;
        return Intrinsics.areEqual(this.suggestions, composerSuggestions.suggestions) && this.isComposerDisabled == composerSuggestions.isComposerDisabled && Intrinsics.areEqual(this.snapshotId, composerSuggestions.snapshotId);
    }

    public int hashCode() {
        int hashCode = ((this.suggestions.hashCode() * 31) + Boolean.hashCode(this.isComposerDisabled)) * 31;
        Long l = this.snapshotId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "ComposerSuggestions(suggestions=" + this.suggestions + ", isComposerDisabled=" + this.isComposerDisabled + ", snapshotId=" + this.snapshotId + ')';
    }

    public ComposerSuggestions(List<Suggestion> suggestions, boolean z, Long l) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.suggestions = suggestions;
        this.isComposerDisabled = z;
        this.snapshotId = l;
    }

    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public /* synthetic */ ComposerSuggestions(List list, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : l);
    }

    public final boolean isComposerDisabled() {
        return this.isComposerDisabled;
    }

    public final Long getSnapshotId() {
        return this.snapshotId;
    }

    /* compiled from: ComposerSuggestions.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/models/ComposerSuggestions$Suggestion;", "", "text", "", "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getUuid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Suggestion {
        public static final int $stable = 0;

        @SerializedName("text")
        private final String text;

        @SerializedName("uuid")
        private final String uuid;

        /* JADX WARN: Multi-variable type inference failed */
        public Suggestion() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = suggestion.text;
            }
            if ((i & 2) != 0) {
                str2 = suggestion.uuid;
            }
            return suggestion.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        public final Suggestion copy(String text, String uuid) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new Suggestion(text, uuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) other;
            return Intrinsics.areEqual(this.text, suggestion.text) && Intrinsics.areEqual(this.uuid, suggestion.uuid);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.uuid.hashCode();
        }

        public String toString() {
            return "Suggestion(text=" + this.text + ", uuid=" + this.uuid + ')';
        }

        public Suggestion(String text, String uuid) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.text = text;
            this.uuid = uuid;
        }

        public /* synthetic */ Suggestion(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        public final String getText() {
            return this.text;
        }

        public final String getUuid() {
            return this.uuid;
        }
    }
}
