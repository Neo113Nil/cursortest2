package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocsSearchTypeDto.kt */
/* loaded from: classes14.dex */
public final class DocsSearchTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DocsSearchTypeDto[] $VALUES;

    @pmi0("0")
    public static final DocsSearchTypeDto ALL;

    @pmi0("2")
    public static final DocsSearchTypeDto ARCHIVE;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final DocsSearchTypeDto AUDIO;
    public static final Parcelable.Creator<DocsSearchTypeDto> CREATOR;

    @pmi0("8")
    public static final DocsSearchTypeDto DEFAULT;

    @pmi0(Gc.e)
    public static final DocsSearchTypeDto EBOOK;

    @pmi0("3")
    public static final DocsSearchTypeDto GIF;

    @pmi0("4")
    public static final DocsSearchTypeDto IMAGE;

    @pmi0("1")
    public static final DocsSearchTypeDto TEXT;

    @pmi0("6")
    public static final DocsSearchTypeDto VIDEO;
    private final int value;

    /* compiled from: DocsSearchTypeDto.kt */
    public static final class a implements Parcelable.Creator<DocsSearchTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsSearchTypeDto createFromParcel(Parcel parcel) {
            return DocsSearchTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsSearchTypeDto[] newArray(int i) {
            return new DocsSearchTypeDto[i];
        }
    }

    static {
        DocsSearchTypeDto docsSearchTypeDto = new DocsSearchTypeDto("ALL", 0, 0);
        ALL = docsSearchTypeDto;
        DocsSearchTypeDto docsSearchTypeDto2 = new DocsSearchTypeDto("TEXT", 1, 1);
        TEXT = docsSearchTypeDto2;
        DocsSearchTypeDto docsSearchTypeDto3 = new DocsSearchTypeDto("ARCHIVE", 2, 2);
        ARCHIVE = docsSearchTypeDto3;
        DocsSearchTypeDto docsSearchTypeDto4 = new DocsSearchTypeDto("GIF", 3, 3);
        GIF = docsSearchTypeDto4;
        DocsSearchTypeDto docsSearchTypeDto5 = new DocsSearchTypeDto("IMAGE", 4, 4);
        IMAGE = docsSearchTypeDto5;
        DocsSearchTypeDto docsSearchTypeDto6 = new DocsSearchTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 5, 5);
        AUDIO = docsSearchTypeDto6;
        DocsSearchTypeDto docsSearchTypeDto7 = new DocsSearchTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 6, 6);
        VIDEO = docsSearchTypeDto7;
        DocsSearchTypeDto docsSearchTypeDto8 = new DocsSearchTypeDto("EBOOK", 7, 7);
        EBOOK = docsSearchTypeDto8;
        DocsSearchTypeDto docsSearchTypeDto9 = new DocsSearchTypeDto("DEFAULT", 8, 8);
        DEFAULT = docsSearchTypeDto9;
        DocsSearchTypeDto[] docsSearchTypeDtoArr = {docsSearchTypeDto, docsSearchTypeDto2, docsSearchTypeDto3, docsSearchTypeDto4, docsSearchTypeDto5, docsSearchTypeDto6, docsSearchTypeDto7, docsSearchTypeDto8, docsSearchTypeDto9};
        $VALUES = docsSearchTypeDtoArr;
        $ENTRIES = new asp(docsSearchTypeDtoArr);
        CREATOR = new a();
    }

    private DocsSearchTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static DocsSearchTypeDto valueOf(String str) {
        return (DocsSearchTypeDto) Enum.valueOf(DocsSearchTypeDto.class, str);
    }

    public static DocsSearchTypeDto[] values() {
        return (DocsSearchTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
