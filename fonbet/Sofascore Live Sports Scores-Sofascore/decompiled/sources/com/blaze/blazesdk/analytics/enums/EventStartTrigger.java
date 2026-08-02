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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001a"}, d2 = {"Lcom/blaze/blazesdk/analytics/enums/EventStartTrigger;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WIDGET", "DEEPLINK", "ENTRYPOINT", "WIDGET_AUTO_PLAY", "NOTIFICATION", "APP_FOREGROUND", "INLINE", "VIEWING_MODE_TRANSITION", "SKIP", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventStartTrigger implements EnumWithValue, Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ EventStartTrigger[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EventStartTrigger> CREATOR;

    @NotNull
    private final String value;
    public static final EventStartTrigger WIDGET = new EventStartTrigger("WIDGET", 0, "Widget");
    public static final EventStartTrigger DEEPLINK = new EventStartTrigger("DEEPLINK", 1, "Deeplink");
    public static final EventStartTrigger ENTRYPOINT = new EventStartTrigger("ENTRYPOINT", 2, "Entry Point");
    public static final EventStartTrigger WIDGET_AUTO_PLAY = new EventStartTrigger("WIDGET_AUTO_PLAY", 3, "Auto Play from Widget");
    public static final EventStartTrigger NOTIFICATION = new EventStartTrigger("NOTIFICATION", 4, "Notification");
    public static final EventStartTrigger APP_FOREGROUND = new EventStartTrigger("APP_FOREGROUND", 5, "App Foreground");
    public static final EventStartTrigger INLINE = new EventStartTrigger("INLINE", 6, "Inline");
    public static final EventStartTrigger VIEWING_MODE_TRANSITION = new EventStartTrigger("VIEWING_MODE_TRANSITION", 7, "Viewing Mode Transition");
    public static final EventStartTrigger SKIP = new EventStartTrigger("SKIP", 8, "Skip");

    private static final /* synthetic */ EventStartTrigger[] $values() {
        return new EventStartTrigger[]{WIDGET, DEEPLINK, ENTRYPOINT, WIDGET_AUTO_PLAY, NOTIFICATION, APP_FOREGROUND, INLINE, VIEWING_MODE_TRANSITION, SKIP};
    }

    static {
        EventStartTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.analytics.enums.EventStartTrigger.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return EventStartTrigger.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EventStartTrigger[i];
            }
        };
    }

    private EventStartTrigger(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static EventStartTrigger valueOf(String str) {
        return (EventStartTrigger) Enum.valueOf(EventStartTrigger.class, str);
    }

    public static EventStartTrigger[] values() {
        return (EventStartTrigger[]) $VALUES.clone();
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
