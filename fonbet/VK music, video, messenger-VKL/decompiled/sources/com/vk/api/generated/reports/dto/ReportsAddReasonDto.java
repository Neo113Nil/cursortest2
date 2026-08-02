package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.Gc;
import com.ironsource.InterfaceC4413l1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportsAddReasonDto.kt */
/* loaded from: classes15.dex */
public final class ReportsAddReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReportsAddReasonDto[] $VALUES;

    @pmi0("47")
    public static final ReportsAddReasonDto ADS_COMM_CHANNEL;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final ReportsAddReasonDto ADULT_MATERIAL;

    @pmi0("44")
    public static final ReportsAddReasonDto ADULT_VIDEO;

    @pmi0("20")
    public static final ReportsAddReasonDto ADVERTISING_PAGE;

    @pmi0("204")
    public static final ReportsAddReasonDto AD_AGE_UNAPPROPRIATE;

    @pmi0(Gc.e)
    public static final ReportsAddReasonDto AD_FRAUD;

    @pmi0("201")
    public static final ReportsAddReasonDto AD_LAW_VIOLATION;

    @pmi0("203")
    public static final ReportsAddReasonDto AD_OFFENSIVE_CONTENT;

    @pmi0("100")
    public static final ReportsAddReasonDto AD_OTHER;

    @pmi0("200")
    public static final ReportsAddReasonDto AD_SEXUAL_OVERTONES;

    @pmi0("41")
    public static final ReportsAddReasonDto ALCOHOL;

    @pmi0("13")
    public static final ReportsAddReasonDto ANIMAL_ABUSE;

    @pmi0("25")
    public static final ReportsAddReasonDto APP_BROKEN;

    @pmi0("30")
    public static final ReportsAddReasonDto APP_FUNCTIONS_BROKEN;

    @pmi0("46")
    public static final ReportsAddReasonDto BLACKMAIL;

    @pmi0("10")
    public static final ReportsAddReasonDto BULLYING_CALLS;

    @pmi0("14")
    public static final ReportsAddReasonDto CHANGE_OF_SUBJECT;

    @pmi0("1")
    public static final ReportsAddReasonDto CHILD_PORN;

    @pmi0("9")
    public static final ReportsAddReasonDto CLICKBAIT;

    @pmi0("21")
    public static final ReportsAddReasonDto CLONE_PAGE;

    @pmi0("18")
    public static final ReportsAddReasonDto COMMUNITY_HACKED;

    @pmi0("48")
    public static final ReportsAddReasonDto COMM_CHANNEL_HACKED;

    @pmi0("407")
    public static final ReportsAddReasonDto CONTENT_AUTHOR;

    @pmi0("405")
    public static final ReportsAddReasonDto CONTENT_BAD_HUMOR;

    @pmi0("404")
    public static final ReportsAddReasonDto CONTENT_BAD_WORDS;

    @pmi0("403")
    public static final ReportsAddReasonDto CONTENT_EXPLICIT;

    @pmi0("401")
    public static final ReportsAddReasonDto CONTENT_LOW_QUALITY;

    @pmi0("402")
    public static final ReportsAddReasonDto CONTENT_NOT_INTERESTING;

    @pmi0("406")
    public static final ReportsAddReasonDto CONTENT_OFTEN_VIEW;

    @pmi0("408")
    public static final ReportsAddReasonDto CONTENT_PERSON;

    @pmi0("45")
    public static final ReportsAddReasonDto CP_VIDEO;
    public static final Parcelable.Creator<ReportsAddReasonDto> CREATOR;

    @pmi0("34")
    public static final ReportsAddReasonDto CREDENTIALS_REQUEST;

    @pmi0("16")
    public static final ReportsAddReasonDto CYBERCRIME;

    @pmi0("33")
    public static final ReportsAddReasonDto DATA_LEAK;

    @pmi0("32")
    public static final ReportsAddReasonDto DATA_THEFT;

    @pmi0("4")
    public static final ReportsAddReasonDto DRUGS;

    @pmi0("2")
    public static final ReportsAddReasonDto EXTREMISM;

    @pmi0("24")
    public static final ReportsAddReasonDto FAKE_APPS;

    @pmi0("43")
    public static final ReportsAddReasonDto FAKE_DOCUMENTS;

    @pmi0("37")
    public static final ReportsAddReasonDto FORBIDDEN_ADS;

    @pmi0("12")
    public static final ReportsAddReasonDto FRAUD;

    @pmi0("39")
    public static final ReportsAddReasonDto GAME_BROKEN;

    @pmi0("29")
    public static final ReportsAddReasonDto HARMFUL_LINKS;

    @pmi0("6")
    public static final ReportsAddReasonDto INSULT;

    @pmi0("42")
    public static final ReportsAddReasonDto NICOTINE;

    @pmi0("27")
    public static final ReportsAddReasonDto OFFENSIVE_SPEECH;

    @pmi0("26")
    public static final ReportsAddReasonDto OLD_PAGE;

    @pmi0("101")
    public static final ReportsAddReasonDto OTHER;

    @pmi0("15")
    public static final ReportsAddReasonDto PROSTITUTION;

    @pmi0("31")
    public static final ReportsAddReasonDto PUBLICATION_WITHOUT_AN_APPROVAL;

    @pmi0("22")
    public static final ReportsAddReasonDto RESTORE_PAGE;

    @pmi0("0")
    public static final ReportsAddReasonDto SPAM;

    @pmi0("8")
    public static final ReportsAddReasonDto SUICIDE_CALLS;

    @pmi0("35")
    public static final ReportsAddReasonDto SUSPICIOUS_FUNCTIONS;

    @pmi0("38")
    public static final ReportsAddReasonDto TOO_MUCH_ADS;

    @pmi0("36")
    public static final ReportsAddReasonDto UNEXPECTED_ADS;

    @pmi0("11")
    public static final ReportsAddReasonDto WEAPONS_SELLING;
    private final int value;

    /* compiled from: ReportsAddReasonDto.kt */
    public static final class a implements Parcelable.Creator<ReportsAddReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsAddReasonDto createFromParcel(Parcel parcel) {
            return ReportsAddReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsAddReasonDto[] newArray(int i) {
            return new ReportsAddReasonDto[i];
        }
    }

    static {
        ReportsAddReasonDto reportsAddReasonDto = new ReportsAddReasonDto("SPAM", 0, 0);
        SPAM = reportsAddReasonDto;
        ReportsAddReasonDto reportsAddReasonDto2 = new ReportsAddReasonDto("CHILD_PORN", 1, 1);
        CHILD_PORN = reportsAddReasonDto2;
        ReportsAddReasonDto reportsAddReasonDto3 = new ReportsAddReasonDto("EXTREMISM", 2, 2);
        EXTREMISM = reportsAddReasonDto3;
        ReportsAddReasonDto reportsAddReasonDto4 = new ReportsAddReasonDto("DRUGS", 3, 4);
        DRUGS = reportsAddReasonDto4;
        ReportsAddReasonDto reportsAddReasonDto5 = new ReportsAddReasonDto("ADULT_MATERIAL", 4, 5);
        ADULT_MATERIAL = reportsAddReasonDto5;
        ReportsAddReasonDto reportsAddReasonDto6 = new ReportsAddReasonDto("INSULT", 5, 6);
        INSULT = reportsAddReasonDto6;
        ReportsAddReasonDto reportsAddReasonDto7 = new ReportsAddReasonDto("AD_FRAUD", 6, 7);
        AD_FRAUD = reportsAddReasonDto7;
        ReportsAddReasonDto reportsAddReasonDto8 = new ReportsAddReasonDto("SUICIDE_CALLS", 7, 8);
        SUICIDE_CALLS = reportsAddReasonDto8;
        ReportsAddReasonDto reportsAddReasonDto9 = new ReportsAddReasonDto("CLICKBAIT", 8, 9);
        CLICKBAIT = reportsAddReasonDto9;
        ReportsAddReasonDto reportsAddReasonDto10 = new ReportsAddReasonDto("BULLYING_CALLS", 9, 10);
        BULLYING_CALLS = reportsAddReasonDto10;
        ReportsAddReasonDto reportsAddReasonDto11 = new ReportsAddReasonDto("WEAPONS_SELLING", 10, 11);
        WEAPONS_SELLING = reportsAddReasonDto11;
        ReportsAddReasonDto reportsAddReasonDto12 = new ReportsAddReasonDto("FRAUD", 11, 12);
        FRAUD = reportsAddReasonDto12;
        ReportsAddReasonDto reportsAddReasonDto13 = new ReportsAddReasonDto("ANIMAL_ABUSE", 12, 13);
        ANIMAL_ABUSE = reportsAddReasonDto13;
        ReportsAddReasonDto reportsAddReasonDto14 = new ReportsAddReasonDto("CHANGE_OF_SUBJECT", 13, 14);
        CHANGE_OF_SUBJECT = reportsAddReasonDto14;
        ReportsAddReasonDto reportsAddReasonDto15 = new ReportsAddReasonDto("PROSTITUTION", 14, 15);
        PROSTITUTION = reportsAddReasonDto15;
        ReportsAddReasonDto reportsAddReasonDto16 = new ReportsAddReasonDto("CYBERCRIME", 15, 16);
        CYBERCRIME = reportsAddReasonDto16;
        ReportsAddReasonDto reportsAddReasonDto17 = new ReportsAddReasonDto("COMMUNITY_HACKED", 16, 18);
        COMMUNITY_HACKED = reportsAddReasonDto17;
        ReportsAddReasonDto reportsAddReasonDto18 = new ReportsAddReasonDto("ADVERTISING_PAGE", 17, 20);
        ADVERTISING_PAGE = reportsAddReasonDto18;
        ReportsAddReasonDto reportsAddReasonDto19 = new ReportsAddReasonDto("CLONE_PAGE", 18, 21);
        CLONE_PAGE = reportsAddReasonDto19;
        ReportsAddReasonDto reportsAddReasonDto20 = new ReportsAddReasonDto("RESTORE_PAGE", 19, 22);
        RESTORE_PAGE = reportsAddReasonDto20;
        ReportsAddReasonDto reportsAddReasonDto21 = new ReportsAddReasonDto("FAKE_APPS", 20, 24);
        FAKE_APPS = reportsAddReasonDto21;
        ReportsAddReasonDto reportsAddReasonDto22 = new ReportsAddReasonDto("APP_BROKEN", 21, 25);
        APP_BROKEN = reportsAddReasonDto22;
        ReportsAddReasonDto reportsAddReasonDto23 = new ReportsAddReasonDto("OLD_PAGE", 22, 26);
        OLD_PAGE = reportsAddReasonDto23;
        ReportsAddReasonDto reportsAddReasonDto24 = new ReportsAddReasonDto("OFFENSIVE_SPEECH", 23, 27);
        OFFENSIVE_SPEECH = reportsAddReasonDto24;
        ReportsAddReasonDto reportsAddReasonDto25 = new ReportsAddReasonDto("HARMFUL_LINKS", 24, 29);
        HARMFUL_LINKS = reportsAddReasonDto25;
        ReportsAddReasonDto reportsAddReasonDto26 = new ReportsAddReasonDto("APP_FUNCTIONS_BROKEN", 25, 30);
        APP_FUNCTIONS_BROKEN = reportsAddReasonDto26;
        ReportsAddReasonDto reportsAddReasonDto27 = new ReportsAddReasonDto("PUBLICATION_WITHOUT_AN_APPROVAL", 26, 31);
        PUBLICATION_WITHOUT_AN_APPROVAL = reportsAddReasonDto27;
        ReportsAddReasonDto reportsAddReasonDto28 = new ReportsAddReasonDto("DATA_THEFT", 27, 32);
        DATA_THEFT = reportsAddReasonDto28;
        ReportsAddReasonDto reportsAddReasonDto29 = new ReportsAddReasonDto("DATA_LEAK", 28, 33);
        DATA_LEAK = reportsAddReasonDto29;
        ReportsAddReasonDto reportsAddReasonDto30 = new ReportsAddReasonDto("CREDENTIALS_REQUEST", 29, 34);
        CREDENTIALS_REQUEST = reportsAddReasonDto30;
        ReportsAddReasonDto reportsAddReasonDto31 = new ReportsAddReasonDto("SUSPICIOUS_FUNCTIONS", 30, 35);
        SUSPICIOUS_FUNCTIONS = reportsAddReasonDto31;
        ReportsAddReasonDto reportsAddReasonDto32 = new ReportsAddReasonDto("UNEXPECTED_ADS", 31, 36);
        UNEXPECTED_ADS = reportsAddReasonDto32;
        ReportsAddReasonDto reportsAddReasonDto33 = new ReportsAddReasonDto("FORBIDDEN_ADS", 32, 37);
        FORBIDDEN_ADS = reportsAddReasonDto33;
        ReportsAddReasonDto reportsAddReasonDto34 = new ReportsAddReasonDto("TOO_MUCH_ADS", 33, 38);
        TOO_MUCH_ADS = reportsAddReasonDto34;
        ReportsAddReasonDto reportsAddReasonDto35 = new ReportsAddReasonDto("GAME_BROKEN", 34, 39);
        GAME_BROKEN = reportsAddReasonDto35;
        ReportsAddReasonDto reportsAddReasonDto36 = new ReportsAddReasonDto("ALCOHOL", 35, 41);
        ALCOHOL = reportsAddReasonDto36;
        ReportsAddReasonDto reportsAddReasonDto37 = new ReportsAddReasonDto("NICOTINE", 36, 42);
        NICOTINE = reportsAddReasonDto37;
        ReportsAddReasonDto reportsAddReasonDto38 = new ReportsAddReasonDto("FAKE_DOCUMENTS", 37, 43);
        FAKE_DOCUMENTS = reportsAddReasonDto38;
        ReportsAddReasonDto reportsAddReasonDto39 = new ReportsAddReasonDto("ADULT_VIDEO", 38, 44);
        ADULT_VIDEO = reportsAddReasonDto39;
        ReportsAddReasonDto reportsAddReasonDto40 = new ReportsAddReasonDto("CP_VIDEO", 39, 45);
        CP_VIDEO = reportsAddReasonDto40;
        ReportsAddReasonDto reportsAddReasonDto41 = new ReportsAddReasonDto("BLACKMAIL", 40, 46);
        BLACKMAIL = reportsAddReasonDto41;
        ReportsAddReasonDto reportsAddReasonDto42 = new ReportsAddReasonDto("ADS_COMM_CHANNEL", 41, 47);
        ADS_COMM_CHANNEL = reportsAddReasonDto42;
        ReportsAddReasonDto reportsAddReasonDto43 = new ReportsAddReasonDto("COMM_CHANNEL_HACKED", 42, 48);
        COMM_CHANNEL_HACKED = reportsAddReasonDto43;
        ReportsAddReasonDto reportsAddReasonDto44 = new ReportsAddReasonDto("AD_OTHER", 43, 100);
        AD_OTHER = reportsAddReasonDto44;
        ReportsAddReasonDto reportsAddReasonDto45 = new ReportsAddReasonDto(NativeAdContent.ViewTag.OTHER, 44, 101);
        OTHER = reportsAddReasonDto45;
        ReportsAddReasonDto reportsAddReasonDto46 = new ReportsAddReasonDto("AD_SEXUAL_OVERTONES", 45, 200);
        AD_SEXUAL_OVERTONES = reportsAddReasonDto46;
        ReportsAddReasonDto reportsAddReasonDto47 = new ReportsAddReasonDto("AD_LAW_VIOLATION", 46, 201);
        AD_LAW_VIOLATION = reportsAddReasonDto47;
        ReportsAddReasonDto reportsAddReasonDto48 = new ReportsAddReasonDto("AD_OFFENSIVE_CONTENT", 47, 203);
        AD_OFFENSIVE_CONTENT = reportsAddReasonDto48;
        ReportsAddReasonDto reportsAddReasonDto49 = new ReportsAddReasonDto("AD_AGE_UNAPPROPRIATE", 48, 204);
        AD_AGE_UNAPPROPRIATE = reportsAddReasonDto49;
        ReportsAddReasonDto reportsAddReasonDto50 = new ReportsAddReasonDto("CONTENT_LOW_QUALITY", 49, 401);
        CONTENT_LOW_QUALITY = reportsAddReasonDto50;
        ReportsAddReasonDto reportsAddReasonDto51 = new ReportsAddReasonDto("CONTENT_NOT_INTERESTING", 50, 402);
        CONTENT_NOT_INTERESTING = reportsAddReasonDto51;
        ReportsAddReasonDto reportsAddReasonDto52 = new ReportsAddReasonDto("CONTENT_EXPLICIT", 51, 403);
        CONTENT_EXPLICIT = reportsAddReasonDto52;
        ReportsAddReasonDto reportsAddReasonDto53 = new ReportsAddReasonDto("CONTENT_BAD_WORDS", 52, 404);
        CONTENT_BAD_WORDS = reportsAddReasonDto53;
        ReportsAddReasonDto reportsAddReasonDto54 = new ReportsAddReasonDto("CONTENT_BAD_HUMOR", 53, InterfaceC4413l1.a.b.e);
        CONTENT_BAD_HUMOR = reportsAddReasonDto54;
        ReportsAddReasonDto reportsAddReasonDto55 = new ReportsAddReasonDto("CONTENT_OFTEN_VIEW", 54, InterfaceC4413l1.a.b.f);
        CONTENT_OFTEN_VIEW = reportsAddReasonDto55;
        ReportsAddReasonDto reportsAddReasonDto56 = new ReportsAddReasonDto("CONTENT_AUTHOR", 55, InterfaceC4413l1.a.b.g);
        CONTENT_AUTHOR = reportsAddReasonDto56;
        ReportsAddReasonDto reportsAddReasonDto57 = new ReportsAddReasonDto("CONTENT_PERSON", 56, InterfaceC4413l1.a.b.h);
        CONTENT_PERSON = reportsAddReasonDto57;
        ReportsAddReasonDto[] reportsAddReasonDtoArr = {reportsAddReasonDto, reportsAddReasonDto2, reportsAddReasonDto3, reportsAddReasonDto4, reportsAddReasonDto5, reportsAddReasonDto6, reportsAddReasonDto7, reportsAddReasonDto8, reportsAddReasonDto9, reportsAddReasonDto10, reportsAddReasonDto11, reportsAddReasonDto12, reportsAddReasonDto13, reportsAddReasonDto14, reportsAddReasonDto15, reportsAddReasonDto16, reportsAddReasonDto17, reportsAddReasonDto18, reportsAddReasonDto19, reportsAddReasonDto20, reportsAddReasonDto21, reportsAddReasonDto22, reportsAddReasonDto23, reportsAddReasonDto24, reportsAddReasonDto25, reportsAddReasonDto26, reportsAddReasonDto27, reportsAddReasonDto28, reportsAddReasonDto29, reportsAddReasonDto30, reportsAddReasonDto31, reportsAddReasonDto32, reportsAddReasonDto33, reportsAddReasonDto34, reportsAddReasonDto35, reportsAddReasonDto36, reportsAddReasonDto37, reportsAddReasonDto38, reportsAddReasonDto39, reportsAddReasonDto40, reportsAddReasonDto41, reportsAddReasonDto42, reportsAddReasonDto43, reportsAddReasonDto44, reportsAddReasonDto45, reportsAddReasonDto46, reportsAddReasonDto47, reportsAddReasonDto48, reportsAddReasonDto49, reportsAddReasonDto50, reportsAddReasonDto51, reportsAddReasonDto52, reportsAddReasonDto53, reportsAddReasonDto54, reportsAddReasonDto55, reportsAddReasonDto56, reportsAddReasonDto57};
        $VALUES = reportsAddReasonDtoArr;
        $ENTRIES = new asp(reportsAddReasonDtoArr);
        CREATOR = new a();
    }

    private ReportsAddReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<ReportsAddReasonDto> i() {
        return $ENTRIES;
    }

    public static ReportsAddReasonDto valueOf(String str) {
        return (ReportsAddReasonDto) Enum.valueOf(ReportsAddReasonDto.class, str);
    }

    public static ReportsAddReasonDto[] values() {
        return (ReportsAddReasonDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
