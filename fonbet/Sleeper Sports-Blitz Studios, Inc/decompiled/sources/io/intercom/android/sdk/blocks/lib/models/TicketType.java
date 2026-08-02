package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketType.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0001(B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\b\u0010\u001d\u001a\u00020\u0003H\u0007J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\u0003H×\u0001J\t\u0010\"\u001a\u00020\u0005H×\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "Landroid/os/Parcelable;", "id", "", "name", "", "emoji", "attributes", "", "Lio/intercom/android/sdk/blocks/lib/models/TicketAttribute;", "archived", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getEmoji", "getAttributes", "()Ljava/util/List;", "getArchived", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TicketType implements Parcelable {

    @SerializedName("archived")
    private final boolean archived;

    @SerializedName("attributes")
    private final List<TicketAttribute> attributes;

    @SerializedName("emoji")
    private final String emoji;

    @SerializedName("id")
    private final int id;

    @SerializedName("name")
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TicketType> CREATOR = new Creator();
    private static final TicketType NULL = new TicketType(-1, "", "", CollectionsKt.emptyList(), false);

    /* compiled from: TicketType.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TicketType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(TicketAttribute.CREATOR.createFromParcel(parcel));
            }
            return new TicketType(readInt, readString, readString2, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType[] newArray(int i) {
            return new TicketType[i];
        }
    }

    public static /* synthetic */ TicketType copy$default(TicketType ticketType, int i, String str, String str2, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ticketType.id;
        }
        if ((i2 & 2) != 0) {
            str = ticketType.name;
        }
        if ((i2 & 4) != 0) {
            str2 = ticketType.emoji;
        }
        if ((i2 & 8) != 0) {
            list = ticketType.attributes;
        }
        if ((i2 & 16) != 0) {
            z = ticketType.archived;
        }
        boolean z2 = z;
        String str3 = str2;
        return ticketType.copy(i, str, str3, list, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    public final List<TicketAttribute> component4() {
        return this.attributes;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getArchived() {
        return this.archived;
    }

    public final TicketType copy(int id, String name, String emoji, List<TicketAttribute> attributes, boolean archived) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new TicketType(id, name, emoji, attributes, archived);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketType)) {
            return false;
        }
        TicketType ticketType = (TicketType) other;
        return this.id == ticketType.id && Intrinsics.areEqual(this.name, ticketType.name) && Intrinsics.areEqual(this.emoji, ticketType.emoji) && Intrinsics.areEqual(this.attributes, ticketType.attributes) && this.archived == ticketType.archived;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.emoji.hashCode()) * 31) + this.attributes.hashCode()) * 31) + Boolean.hashCode(this.archived);
    }

    public String toString() {
        return "TicketType(id=" + this.id + ", name=" + this.name + ", emoji=" + this.emoji + ", attributes=" + this.attributes + ", archived=" + this.archived + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.emoji);
        List<TicketAttribute> list = this.attributes;
        dest.writeInt(list.size());
        Iterator<TicketAttribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.archived ? 1 : 0);
    }

    public TicketType(int i, String name, String emoji, List<TicketAttribute> attributes, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.id = i;
        this.name = name;
        this.emoji = emoji;
        this.attributes = attributes;
        this.archived = z;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    /* compiled from: TicketType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/TicketType$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "getNULL", "()Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TicketType getNULL() {
            return TicketType.NULL;
        }
    }
}
