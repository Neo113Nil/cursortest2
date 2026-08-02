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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/analytics/enums/EventExitTrigger;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SWIPE", "SWIPE_DOWN", "USER_SWIPE_TO_DISMISS", "SKIP", "USER_SKIP_NEXT", "USER_SKIP_PREVIOUS", "VIDEO_FINISHED", "CLOSE_BUTTON", "APP_CLOSE", "BACK_BUTTON", "STORIES_COMPLETED", "ASSETS_EXPIRY", "APP_BACKGROUND", "INLINE", "VIEWING_MODE_TRANSITION", "PIP_DISMISSED", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventExitTrigger implements EnumWithValue, Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ EventExitTrigger[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EventExitTrigger> CREATOR;

    @NotNull
    private final String value;
    public static final EventExitTrigger SWIPE = new EventExitTrigger("SWIPE", 0, "Swipe");
    public static final EventExitTrigger SWIPE_DOWN = new EventExitTrigger("SWIPE_DOWN", 1, "Swipe Down");
    public static final EventExitTrigger USER_SWIPE_TO_DISMISS = new EventExitTrigger("USER_SWIPE_TO_DISMISS", 2, "User Swipe To Dismiss");
    public static final EventExitTrigger SKIP = new EventExitTrigger("SKIP", 3, "Skip");
    public static final EventExitTrigger USER_SKIP_NEXT = new EventExitTrigger("USER_SKIP_NEXT", 4, "User Skip Next");
    public static final EventExitTrigger USER_SKIP_PREVIOUS = new EventExitTrigger("USER_SKIP_PREVIOUS", 5, "User Skip Previous");
    public static final EventExitTrigger VIDEO_FINISHED = new EventExitTrigger("VIDEO_FINISHED", 6, "Video Finished");
    public static final EventExitTrigger CLOSE_BUTTON = new EventExitTrigger("CLOSE_BUTTON", 7, "Close Button");
    public static final EventExitTrigger APP_CLOSE = new EventExitTrigger("APP_CLOSE", 8, "App Close");
    public static final EventExitTrigger BACK_BUTTON = new EventExitTrigger("BACK_BUTTON", 9, "Back Button");
    public static final EventExitTrigger STORIES_COMPLETED = new EventExitTrigger("STORIES_COMPLETED", 10, "Stories completed");
    public static final EventExitTrigger ASSETS_EXPIRY = new EventExitTrigger("ASSETS_EXPIRY", 11, "URL Expiration");
    public static final EventExitTrigger APP_BACKGROUND = new EventExitTrigger("APP_BACKGROUND", 12, "App Background");
    public static final EventExitTrigger INLINE = new EventExitTrigger("INLINE", 13, "Inline");
    public static final EventExitTrigger VIEWING_MODE_TRANSITION = new EventExitTrigger("VIEWING_MODE_TRANSITION", 14, "Viewing Mode Transition");
    public static final EventExitTrigger PIP_DISMISSED = new EventExitTrigger("PIP_DISMISSED", 15, "PIP Dismissed");

    private static final /* synthetic */ EventExitTrigger[] $values() {
        return new EventExitTrigger[]{SWIPE, SWIPE_DOWN, USER_SWIPE_TO_DISMISS, SKIP, USER_SKIP_NEXT, USER_SKIP_PREVIOUS, VIDEO_FINISHED, CLOSE_BUTTON, APP_CLOSE, BACK_BUTTON, STORIES_COMPLETED, ASSETS_EXPIRY, APP_BACKGROUND, INLINE, VIEWING_MODE_TRANSITION, PIP_DISMISSED};
    }

    static {
        EventExitTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.analytics.enums.EventExitTrigger.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return EventExitTrigger.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EventExitTrigger[i];
            }
        };
    }

    private EventExitTrigger(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static EventExitTrigger valueOf(String str) {
        return (EventExitTrigger) Enum.valueOf(EventExitTrigger.class, str);
    }

    public static EventExitTrigger[] values() {
        return (EventExitTrigger[]) $VALUES.clone();
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
