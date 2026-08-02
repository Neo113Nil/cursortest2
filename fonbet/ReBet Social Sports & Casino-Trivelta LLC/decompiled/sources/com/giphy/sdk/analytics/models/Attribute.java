package com.giphy.sdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.analytics.models.enums.AttributeKey;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/giphy/sdk/analytics/models/Attribute;", "Landroid/os/Parcelable;", "key", "Lcom/giphy/sdk/analytics/models/enums/AttributeKey;", EventKeys.VALUE_KEY, "", "(Lcom/giphy/sdk/analytics/models/enums/AttributeKey;Ljava/lang/String;)V", "getKey", "()Lcom/giphy/sdk/analytics/models/enums/AttributeKey;", "setKey", "(Lcom/giphy/sdk/analytics/models/enums/AttributeKey;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Attribute implements Parcelable {

    @Nullable
    private AttributeKey key;

    @Nullable
    private String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();

    @NotNull
    private static String LAYOUT_TYPE_CAROUSEL = "CAROUSEL";

    @NotNull
    private static String LAYOUT_TYPE_GRID = "GRID";

    @NotNull
    private static String LAYOUT_TYPE_MIXED = "MIXED";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/giphy/sdk/analytics/models/Attribute$Companion;", "", "()V", "LAYOUT_TYPE_CAROUSEL", "", "getLAYOUT_TYPE_CAROUSEL", "()Ljava/lang/String;", "setLAYOUT_TYPE_CAROUSEL", "(Ljava/lang/String;)V", "LAYOUT_TYPE_GRID", "getLAYOUT_TYPE_GRID", "setLAYOUT_TYPE_GRID", "LAYOUT_TYPE_MIXED", "getLAYOUT_TYPE_MIXED", "setLAYOUT_TYPE_MIXED", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getLAYOUT_TYPE_CAROUSEL() {
            return Attribute.LAYOUT_TYPE_CAROUSEL;
        }

        @NotNull
        public final String getLAYOUT_TYPE_GRID() {
            return Attribute.LAYOUT_TYPE_GRID;
        }

        @NotNull
        public final String getLAYOUT_TYPE_MIXED() {
            return Attribute.LAYOUT_TYPE_MIXED;
        }

        public final void setLAYOUT_TYPE_CAROUSEL(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            Attribute.LAYOUT_TYPE_CAROUSEL = str;
        }

        public final void setLAYOUT_TYPE_GRID(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            Attribute.LAYOUT_TYPE_GRID = str;
        }

        public final void setLAYOUT_TYPE_MIXED(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            Attribute.LAYOUT_TYPE_MIXED = str;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Attribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Attribute createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Attribute(parcel.readInt() == 0 ? null : AttributeKey.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Attribute[] newArray(int i10) {
            return new Attribute[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Attribute() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final AttributeKey getKey() {
        return this.key;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setKey(@Nullable AttributeKey attributeKey) {
        this.key = attributeKey;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        AttributeKey attributeKey = this.key;
        if (attributeKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(attributeKey.name());
        }
        parcel.writeString(this.value);
    }

    public Attribute(@Nullable AttributeKey attributeKey, @Nullable String str) {
        this.key = attributeKey;
        this.value = str;
    }

    public /* synthetic */ Attribute(AttributeKey attributeKey, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : attributeKey, (i10 & 2) != 0 ? null : str);
    }
}
