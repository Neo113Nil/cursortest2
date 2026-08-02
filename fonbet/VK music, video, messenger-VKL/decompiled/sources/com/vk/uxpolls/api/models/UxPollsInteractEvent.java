package com.vk.uxpolls.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UxPollsModels.kt */
/* loaded from: classes6.dex */
public final class UxPollsInteractEvent implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UxPollsInteractEvent[] $VALUES;
    public static final Parcelable.Creator<UxPollsInteractEvent> CREATOR;

    @pmi0("hide")
    public static final UxPollsInteractEvent HIDE;

    @pmi0("invite_hide")
    public static final UxPollsInteractEvent INVITE_HIDE;

    @pmi0("invite_view")
    public static final UxPollsInteractEvent INVITE_VIEW;

    @pmi0("show")
    public static final UxPollsInteractEvent SHOW;
    private final String value;

    /* compiled from: UxPollsModels.kt */
    public static final class a implements Parcelable.Creator<UxPollsInteractEvent> {
        @Override // android.os.Parcelable.Creator
        public final UxPollsInteractEvent createFromParcel(Parcel parcel) {
            return UxPollsInteractEvent.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollsInteractEvent[] newArray(int i) {
            return new UxPollsInteractEvent[i];
        }
    }

    static {
        UxPollsInteractEvent uxPollsInteractEvent = new UxPollsInteractEvent("SHOW", 0, "show");
        SHOW = uxPollsInteractEvent;
        UxPollsInteractEvent uxPollsInteractEvent2 = new UxPollsInteractEvent("HIDE", 1, "hide");
        HIDE = uxPollsInteractEvent2;
        UxPollsInteractEvent uxPollsInteractEvent3 = new UxPollsInteractEvent("INVITE_VIEW", 2, "invite_view");
        INVITE_VIEW = uxPollsInteractEvent3;
        UxPollsInteractEvent uxPollsInteractEvent4 = new UxPollsInteractEvent("INVITE_HIDE", 3, "invite_hide");
        INVITE_HIDE = uxPollsInteractEvent4;
        UxPollsInteractEvent[] uxPollsInteractEventArr = {uxPollsInteractEvent, uxPollsInteractEvent2, uxPollsInteractEvent3, uxPollsInteractEvent4};
        $VALUES = uxPollsInteractEventArr;
        $ENTRIES = new asp(uxPollsInteractEventArr);
        CREATOR = new a();
    }

    private UxPollsInteractEvent(String str, int i, String str2) {
        this.value = str2;
    }

    public static UxPollsInteractEvent valueOf(String str) {
        return (UxPollsInteractEvent) Enum.valueOf(UxPollsInteractEvent.class, str);
    }

    public static UxPollsInteractEvent[] values() {
        return (UxPollsInteractEvent[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
