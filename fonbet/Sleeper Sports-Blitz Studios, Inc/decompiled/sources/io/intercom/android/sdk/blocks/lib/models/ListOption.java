package io.intercom.android.sdk.blocks.lib.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketTypeV2.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/ListOption;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "archived", "", "id", "description", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getArchived", "()Z", "getId", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ListOption {
    public static final int $stable = 0;

    @SerializedName("archived")
    private final boolean archived;

    @SerializedName("description")
    private final String description;

    @SerializedName("id")
    private final String id;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;

    public static /* synthetic */ ListOption copy$default(ListOption listOption, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listOption.label;
        }
        if ((i & 2) != 0) {
            z = listOption.archived;
        }
        if ((i & 4) != 0) {
            str2 = listOption.id;
        }
        if ((i & 8) != 0) {
            str3 = listOption.description;
        }
        return listOption.copy(str, z, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getArchived() {
        return this.archived;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ListOption copy(String label, boolean archived, String id, String description) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(id, "id");
        return new ListOption(label, archived, id, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOption)) {
            return false;
        }
        ListOption listOption = (ListOption) other;
        return Intrinsics.areEqual(this.label, listOption.label) && this.archived == listOption.archived && Intrinsics.areEqual(this.id, listOption.id) && Intrinsics.areEqual(this.description, listOption.description);
    }

    public int hashCode() {
        int hashCode = ((((this.label.hashCode() * 31) + Boolean.hashCode(this.archived)) * 31) + this.id.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ListOption(label=" + this.label + ", archived=" + this.archived + ", id=" + this.id + ", description=" + this.description + ')';
    }

    public ListOption(String label, boolean z, String id, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(id, "id");
        this.label = label;
        this.archived = z;
        this.id = id;
        this.description = str;
    }

    public /* synthetic */ ListOption(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i & 8) != 0 ? null : str3);
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDescription() {
        return this.description;
    }
}
