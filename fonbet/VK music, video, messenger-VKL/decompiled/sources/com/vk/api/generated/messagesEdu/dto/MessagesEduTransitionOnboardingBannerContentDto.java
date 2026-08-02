package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesEduTransitionOnboardingBannerContentDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduTransitionOnboardingBannerContentDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduTransitionOnboardingBannerContentDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("link")
    private final String link;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesEduTransitionOnboardingBannerContentDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;

        @pmi0("button")
        public static final KindDto BUTTON;
        public static final Parcelable.Creator<KindDto> CREATOR;

        @pmi0("text")
        public static final KindDto TEXT;
        private final String value;

        /* compiled from: MessagesEduTransitionOnboardingBannerContentDto.kt */
        public static final class a implements Parcelable.Creator<KindDto> {
            @Override // android.os.Parcelable.Creator
            public final KindDto createFromParcel(Parcel parcel) {
                return KindDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final KindDto[] newArray(int i) {
                return new KindDto[i];
            }
        }

        static {
            KindDto kindDto = new KindDto("BUTTON", 0, "button");
            BUTTON = kindDto;
            KindDto kindDto2 = new KindDto("TEXT", 1, "text");
            TEXT = kindDto2;
            KindDto[] kindDtoArr = {kindDto, kindDto2};
            $VALUES = kindDtoArr;
            $ENTRIES = new asp(kindDtoArr);
            CREATOR = new a();
        }

        private KindDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static KindDto valueOf(String str) {
            return (KindDto) Enum.valueOf(KindDto.class, str);
        }

        public static KindDto[] values() {
            return (KindDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesEduTransitionOnboardingBannerContentDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("bullet_point")
        public static final StyleDto BULLET_POINT;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("note")
        public static final StyleDto NOTE;

        @pmi0("primary")
        public static final StyleDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final StyleDto SECONDARY;

        @pmi0("subtitle")
        public static final StyleDto SUBTITLE;

        @pmi0("title")
        public static final StyleDto TITLE;
        private final String value;

        /* compiled from: MessagesEduTransitionOnboardingBannerContentDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("PRIMARY", 0, "primary");
            PRIMARY = styleDto;
            StyleDto styleDto2 = new StyleDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = styleDto2;
            StyleDto styleDto3 = new StyleDto(NativeAdContent.ViewTag.AD_TITLE, 2, "title");
            TITLE = styleDto3;
            StyleDto styleDto4 = new StyleDto("SUBTITLE", 3, "subtitle");
            SUBTITLE = styleDto4;
            StyleDto styleDto5 = new StyleDto("BULLET_POINT", 4, "bullet_point");
            BULLET_POINT = styleDto5;
            StyleDto styleDto6 = new StyleDto("NOTE", 5, "note");
            NOTE = styleDto6;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3, styleDto4, styleDto5, styleDto6};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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

    /* compiled from: MessagesEduTransitionOnboardingBannerContentDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduTransitionOnboardingBannerContentDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduTransitionOnboardingBannerContentDto createFromParcel(Parcel parcel) {
            return new MessagesEduTransitionOnboardingBannerContentDto(KindDto.CREATOR.createFromParcel(parcel), StyleDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduTransitionOnboardingBannerContentDto[] newArray(int i) {
            return new MessagesEduTransitionOnboardingBannerContentDto[i];
        }
    }

    public MessagesEduTransitionOnboardingBannerContentDto(KindDto kindDto, StyleDto styleDto, String str, String str2) {
        this.kind = kindDto;
        this.style = styleDto;
        this.text = str;
        this.link = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduTransitionOnboardingBannerContentDto)) {
            return false;
        }
        MessagesEduTransitionOnboardingBannerContentDto messagesEduTransitionOnboardingBannerContentDto = (MessagesEduTransitionOnboardingBannerContentDto) obj;
        return this.kind == messagesEduTransitionOnboardingBannerContentDto.kind && this.style == messagesEduTransitionOnboardingBannerContentDto.style && epx.f(this.text, messagesEduTransitionOnboardingBannerContentDto.text) && epx.f(this.link, messagesEduTransitionOnboardingBannerContentDto.link);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.style.hashCode() + (this.kind.hashCode() * 31)) * 31, 31, this.text);
        String str = this.link;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduTransitionOnboardingBannerContentDto(kind=");
        sb.append(this.kind);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", link=");
        return ho8.a(sb, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.kind.writeToParcel(parcel, i);
        this.style.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeString(this.link);
    }

    public /* synthetic */ MessagesEduTransitionOnboardingBannerContentDto(KindDto kindDto, StyleDto styleDto, String str, String str2, int i, zcl zclVar) {
        this(kindDto, styleDto, str, (i & 8) != 0 ? null : str2);
    }
}
