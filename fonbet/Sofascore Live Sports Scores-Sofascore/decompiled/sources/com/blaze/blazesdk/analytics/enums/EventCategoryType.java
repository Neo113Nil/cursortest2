package com.blaze.blazesdk.analytics.enums;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/analytics/enums/EventCategoryType;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STORY", "WIDGET", "MOMENT", "VIDEO", "AD", "INTERACTION", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventCategoryType implements EnumWithValue, Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ EventCategoryType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EventCategoryType> CREATOR;

    @NotNull
    private final String value;
    public static final EventCategoryType STORY = new EventCategoryType("STORY", 0, "Story");
    public static final EventCategoryType WIDGET = new EventCategoryType("WIDGET", 1, "Widget");
    public static final EventCategoryType MOMENT = new EventCategoryType("MOMENT", 2, "Moment");
    public static final EventCategoryType VIDEO = new EventCategoryType("VIDEO", 3, "Video");
    public static final EventCategoryType AD = new EventCategoryType("AD", 4, "Ad");
    public static final EventCategoryType INTERACTION = new EventCategoryType("INTERACTION", 5, "Interaction");

    private static final /* synthetic */ EventCategoryType[] $values() {
        return new EventCategoryType[]{STORY, WIDGET, MOMENT, VIDEO, AD, INTERACTION};
    }

    static {
        EventCategoryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.analytics.enums.EventCategoryType.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return EventCategoryType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EventCategoryType[i];
            }
        };
    }

    private EventCategoryType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static EventCategoryType valueOf(String str) {
        return (EventCategoryType) Enum.valueOf(EventCategoryType.class, str);
    }

    public static EventCategoryType[] values() {
        return (EventCategoryType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
    @NotNull
    public String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
