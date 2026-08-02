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
/* compiled from: DocsGetTypeDto.kt */
/* loaded from: classes14.dex */
public final class DocsGetTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DocsGetTypeDto[] $VALUES;

    @pmi0("0")
    public static final DocsGetTypeDto ALL;

    @pmi0("2")
    public static final DocsGetTypeDto ARCHIVE;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final DocsGetTypeDto AUDIO;
    public static final Parcelable.Creator<DocsGetTypeDto> CREATOR;

    @pmi0("8")
    public static final DocsGetTypeDto DEFAULT;

    @pmi0(Gc.e)
    public static final DocsGetTypeDto EBOOK;

    @pmi0("3")
    public static final DocsGetTypeDto GIF;

    @pmi0("4")
    public static final DocsGetTypeDto IMAGE;

    @pmi0("1")
    public static final DocsGetTypeDto TEXT;

    @pmi0("6")
    public static final DocsGetTypeDto VIDEO;
    private final int value;

    /* compiled from: DocsGetTypeDto.kt */
    public static final class a implements Parcelable.Creator<DocsGetTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsGetTypeDto createFromParcel(Parcel parcel) {
            return DocsGetTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsGetTypeDto[] newArray(int i) {
            return new DocsGetTypeDto[i];
        }
    }

    static {
        DocsGetTypeDto docsGetTypeDto = new DocsGetTypeDto("ALL", 0, 0);
        ALL = docsGetTypeDto;
        DocsGetTypeDto docsGetTypeDto2 = new DocsGetTypeDto("TEXT", 1, 1);
        TEXT = docsGetTypeDto2;
        DocsGetTypeDto docsGetTypeDto3 = new DocsGetTypeDto("ARCHIVE", 2, 2);
        ARCHIVE = docsGetTypeDto3;
        DocsGetTypeDto docsGetTypeDto4 = new DocsGetTypeDto("GIF", 3, 3);
        GIF = docsGetTypeDto4;
        DocsGetTypeDto docsGetTypeDto5 = new DocsGetTypeDto("IMAGE", 4, 4);
        IMAGE = docsGetTypeDto5;
        DocsGetTypeDto docsGetTypeDto6 = new DocsGetTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 5, 5);
        AUDIO = docsGetTypeDto6;
        DocsGetTypeDto docsGetTypeDto7 = new DocsGetTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 6, 6);
        VIDEO = docsGetTypeDto7;
        DocsGetTypeDto docsGetTypeDto8 = new DocsGetTypeDto("EBOOK", 7, 7);
        EBOOK = docsGetTypeDto8;
        DocsGetTypeDto docsGetTypeDto9 = new DocsGetTypeDto("DEFAULT", 8, 8);
        DEFAULT = docsGetTypeDto9;
        DocsGetTypeDto[] docsGetTypeDtoArr = {docsGetTypeDto, docsGetTypeDto2, docsGetTypeDto3, docsGetTypeDto4, docsGetTypeDto5, docsGetTypeDto6, docsGetTypeDto7, docsGetTypeDto8, docsGetTypeDto9};
        $VALUES = docsGetTypeDtoArr;
        $ENTRIES = new asp(docsGetTypeDtoArr);
        CREATOR = new a();
    }

    private DocsGetTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static DocsGetTypeDto valueOf(String str) {
        return (DocsGetTypeDto) Enum.valueOf(DocsGetTypeDto.class, str);
    }

    public static DocsGetTypeDto[] values() {
        return (DocsGetTypeDto[]) $VALUES.clone();
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
