package com.vk.newsfeed.posting.impl.domain.rules;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RuleAttachment.kt */
/* loaded from: classes4.dex */
public final class RuleAttachment implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RuleAttachment[] $VALUES;
    public static final RuleAttachment ActionButton;
    public static final RuleAttachment Article;
    public static final RuleAttachment Audio;
    public static final RuleAttachment AudioPlaylist;
    public static final Parcelable.Creator<RuleAttachment> CREATOR;
    public static final RuleAttachment File;
    public static final RuleAttachment Gif;
    public static final RuleAttachment Link;
    public static final RuleAttachment Market;
    public static final RuleAttachment Photo;
    public static final RuleAttachment Place;
    public static final RuleAttachment Poll;
    public static final RuleAttachment Text;
    public static final RuleAttachment Video;
    private final String stringType;

    /* compiled from: RuleAttachment.kt */
    public static final class a implements Parcelable.Creator<RuleAttachment> {
        @Override // android.os.Parcelable.Creator
        public final RuleAttachment createFromParcel(Parcel parcel) {
            return RuleAttachment.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RuleAttachment[] newArray(int i) {
            return new RuleAttachment[i];
        }
    }

    static {
        RuleAttachment ruleAttachment = new RuleAttachment("Text", 0, "text");
        Text = ruleAttachment;
        RuleAttachment ruleAttachment2 = new RuleAttachment("Video", 1, "video");
        Video = ruleAttachment2;
        RuleAttachment ruleAttachment3 = new RuleAttachment("Gif", 2, "gif");
        Gif = ruleAttachment3;
        RuleAttachment ruleAttachment4 = new RuleAttachment("Photo", 3, "photo");
        Photo = ruleAttachment4;
        RuleAttachment ruleAttachment5 = new RuleAttachment("Link", 4, "link");
        Link = ruleAttachment5;
        RuleAttachment ruleAttachment6 = new RuleAttachment("Article", 5, "article");
        Article = ruleAttachment6;
        RuleAttachment ruleAttachment7 = new RuleAttachment("Place", 6, "place");
        Place = ruleAttachment7;
        RuleAttachment ruleAttachment8 = new RuleAttachment("Audio", 7, "audio");
        Audio = ruleAttachment8;
        RuleAttachment ruleAttachment9 = new RuleAttachment("Poll", 8, "poll");
        Poll = ruleAttachment9;
        RuleAttachment ruleAttachment10 = new RuleAttachment("Market", 9, "market");
        Market = ruleAttachment10;
        RuleAttachment ruleAttachment11 = new RuleAttachment("File", 10, X3.i.b);
        File = ruleAttachment11;
        RuleAttachment ruleAttachment12 = new RuleAttachment("ActionButton", 11, "action_button");
        ActionButton = ruleAttachment12;
        RuleAttachment ruleAttachment13 = new RuleAttachment("AudioPlaylist", 12, "audio_playlist");
        AudioPlaylist = ruleAttachment13;
        RuleAttachment[] ruleAttachmentArr = {ruleAttachment, ruleAttachment2, ruleAttachment3, ruleAttachment4, ruleAttachment5, ruleAttachment6, ruleAttachment7, ruleAttachment8, ruleAttachment9, ruleAttachment10, ruleAttachment11, ruleAttachment12, ruleAttachment13};
        $VALUES = ruleAttachmentArr;
        $ENTRIES = new asp(ruleAttachmentArr);
        CREATOR = new a();
    }

    public RuleAttachment(String str, int i, String str2) {
        this.stringType = str2;
    }

    public static zrp<RuleAttachment> i() {
        return $ENTRIES;
    }

    public static RuleAttachment valueOf(String str) {
        return (RuleAttachment) Enum.valueOf(RuleAttachment.class, str);
    }

    public static RuleAttachment[] values() {
        return (RuleAttachment[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.stringType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
