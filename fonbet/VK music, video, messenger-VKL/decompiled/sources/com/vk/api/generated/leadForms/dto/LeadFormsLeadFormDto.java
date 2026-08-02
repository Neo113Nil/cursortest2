package com.vk.api.generated.leadForms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: LeadFormsLeadFormDto.kt */
/* loaded from: classes14.dex */
public final class LeadFormsLeadFormDto implements Parcelable {
    public static final Parcelable.Creator<LeadFormsLeadFormDto> CREATOR = new a();

    @pmi0("agreement_url")
    private final String agreementUrl;

    @pmi0("agreement_url_target")
    private final AgreementUrlTargetDto agreementUrlTarget;

    @pmi0("blocks")
    private final List<LeadFormsLeadFormBlockDto> blocks;

    @pmi0("contact_fields")
    private final List<String> contactFields;

    @pmi0("description")
    private final String description;

    @pmi0("form_id")
    private final String formId;

    @pmi0("global_form_id")
    private final String globalFormId;

    @pmi0("is_filled_previously")
    private final boolean isFilledPreviously;

    @pmi0("lead_form_data")
    private final String leadFormData;

    @pmi0("main_image")
    private final LeadFormsLeadFormMainImageDto mainImage;

    @pmi0("required_answers")
    private final boolean requiredAnswers;

    @pmi0("result_info")
    private final LeadFormsLeadFormResultInfoDto resultInfo;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeadFormsLeadFormDto.kt */
    public static final class AgreementUrlTargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AgreementUrlTargetDto[] $VALUES;
        public static final Parcelable.Creator<AgreementUrlTargetDto> CREATOR;

        @pmi0(D1.e)
        public static final AgreementUrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final AgreementUrlTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final AgreementUrlTargetDto INTERNAL_HIDDEN;
        private final String value;

        /* compiled from: LeadFormsLeadFormDto.kt */
        public static final class a implements Parcelable.Creator<AgreementUrlTargetDto> {
            @Override // android.os.Parcelable.Creator
            public final AgreementUrlTargetDto createFromParcel(Parcel parcel) {
                return AgreementUrlTargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AgreementUrlTargetDto[] newArray(int i) {
                return new AgreementUrlTargetDto[i];
            }
        }

        static {
            AgreementUrlTargetDto agreementUrlTargetDto = new AgreementUrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = agreementUrlTargetDto;
            AgreementUrlTargetDto agreementUrlTargetDto2 = new AgreementUrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = agreementUrlTargetDto2;
            AgreementUrlTargetDto agreementUrlTargetDto3 = new AgreementUrlTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = agreementUrlTargetDto3;
            AgreementUrlTargetDto[] agreementUrlTargetDtoArr = {agreementUrlTargetDto, agreementUrlTargetDto2, agreementUrlTargetDto3};
            $VALUES = agreementUrlTargetDtoArr;
            $ENTRIES = new asp(agreementUrlTargetDtoArr);
            CREATOR = new a();
        }

        private AgreementUrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AgreementUrlTargetDto valueOf(String str) {
            return (AgreementUrlTargetDto) Enum.valueOf(AgreementUrlTargetDto.class, str);
        }

        public static AgreementUrlTargetDto[] values() {
            return (AgreementUrlTargetDto[]) $VALUES.clone();
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

    /* compiled from: LeadFormsLeadFormDto.kt */
    public static final class a implements Parcelable.Creator<LeadFormsLeadFormDto> {
        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormDto createFromParcel(Parcel parcel) {
            boolean z;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            LeadFormsLeadFormResultInfoDto createFromParcel = LeadFormsLeadFormResultInfoDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z2 = false;
            int i = 0;
            while (i != readInt) {
                i = en.a(LeadFormsLeadFormBlockDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            LeadFormsLeadFormMainImageDto createFromParcel2 = LeadFormsLeadFormMainImageDto.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            AgreementUrlTargetDto createFromParcel3 = AgreementUrlTargetDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new LeadFormsLeadFormDto(readString, readString2, readString3, readString4, readString5, createStringArrayList, createFromParcel, arrayList, z2, createFromParcel2, readString6, createFromParcel3, z);
        }

        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormDto[] newArray(int i) {
            return new LeadFormsLeadFormDto[i];
        }
    }

    public LeadFormsLeadFormDto(String str, String str2, String str3, String str4, String str5, List<String> list, LeadFormsLeadFormResultInfoDto leadFormsLeadFormResultInfoDto, List<LeadFormsLeadFormBlockDto> list2, boolean z, LeadFormsLeadFormMainImageDto leadFormsLeadFormMainImageDto, String str6, AgreementUrlTargetDto agreementUrlTargetDto, boolean z2) {
        this.leadFormData = str;
        this.formId = str2;
        this.globalFormId = str3;
        this.title = str4;
        this.description = str5;
        this.contactFields = list;
        this.resultInfo = leadFormsLeadFormResultInfoDto;
        this.blocks = list2;
        this.isFilledPreviously = z;
        this.mainImage = leadFormsLeadFormMainImageDto;
        this.agreementUrl = str6;
        this.agreementUrlTarget = agreementUrlTargetDto;
        this.requiredAnswers = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLeadFormDto)) {
            return false;
        }
        LeadFormsLeadFormDto leadFormsLeadFormDto = (LeadFormsLeadFormDto) obj;
        return epx.f(this.leadFormData, leadFormsLeadFormDto.leadFormData) && epx.f(this.formId, leadFormsLeadFormDto.formId) && epx.f(this.globalFormId, leadFormsLeadFormDto.globalFormId) && epx.f(this.title, leadFormsLeadFormDto.title) && epx.f(this.description, leadFormsLeadFormDto.description) && epx.f(this.contactFields, leadFormsLeadFormDto.contactFields) && epx.f(this.resultInfo, leadFormsLeadFormDto.resultInfo) && epx.f(this.blocks, leadFormsLeadFormDto.blocks) && this.isFilledPreviously == leadFormsLeadFormDto.isFilledPreviously && epx.f(this.mainImage, leadFormsLeadFormDto.mainImage) && epx.f(this.agreementUrl, leadFormsLeadFormDto.agreementUrl) && this.agreementUrlTarget == leadFormsLeadFormDto.agreementUrlTarget && this.requiredAnswers == leadFormsLeadFormDto.requiredAnswers;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.requiredAnswers) + ((this.agreementUrlTarget.hashCode() + urd0.a((this.mainImage.hashCode() + qoy.b(fw3.a((this.resultInfo.hashCode() + fw3.a(urd0.a(urd0.a(urd0.a(urd0.a(this.leadFormData.hashCode() * 31, 31, this.formId), 31, this.globalFormId), 31, this.title), 31, this.description), 31, this.contactFields)) * 31, 31, this.blocks), 31, this.isFilledPreviously)) * 31, 31, this.agreementUrl)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadFormsLeadFormDto(leadFormData=");
        sb.append(this.leadFormData);
        sb.append(", formId=");
        sb.append(this.formId);
        sb.append(", globalFormId=");
        sb.append(this.globalFormId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", contactFields=");
        sb.append(this.contactFields);
        sb.append(", resultInfo=");
        sb.append(this.resultInfo);
        sb.append(", blocks=");
        sb.append(this.blocks);
        sb.append(", isFilledPreviously=");
        sb.append(this.isFilledPreviously);
        sb.append(", mainImage=");
        sb.append(this.mainImage);
        sb.append(", agreementUrl=");
        sb.append(this.agreementUrl);
        sb.append(", agreementUrlTarget=");
        sb.append(this.agreementUrlTarget);
        sb.append(", requiredAnswers=");
        return q0.a(sb, this.requiredAnswers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.leadFormData);
        parcel.writeString(this.formId);
        parcel.writeString(this.globalFormId);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeStringList(this.contactFields);
        this.resultInfo.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.blocks);
        while (a2.hasNext()) {
            ((LeadFormsLeadFormBlockDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isFilledPreviously ? 1 : 0);
        this.mainImage.writeToParcel(parcel, i);
        parcel.writeString(this.agreementUrl);
        this.agreementUrlTarget.writeToParcel(parcel, i);
        parcel.writeInt(this.requiredAnswers ? 1 : 0);
    }
}
