package com.vk.sdk.api.leadForms.dto;

import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: LeadFormsQuestionItemDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsQuestionItemDto {

    @pmi0("key")
    private final String key;

    @pmi0("label")
    private final String label;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<LeadFormsQuestionItemOptionDto> options;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeadFormsQuestionItemDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("checkbox")
        public static final TypeDto CHECKBOX;

        @pmi0("input")
        public static final TypeDto INPUT;

        @pmi0("radio")
        public static final TypeDto RADIO;

        @pmi0("select")
        public static final TypeDto SELECT;

        @pmi0("textarea")
        public static final TypeDto TEXTAREA;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("INPUT", 0, "input");
            INPUT = typeDto;
            TypeDto typeDto2 = new TypeDto("TEXTAREA", 1, "textarea");
            TEXTAREA = typeDto2;
            TypeDto typeDto3 = new TypeDto("RADIO", 2, "radio");
            RADIO = typeDto3;
            TypeDto typeDto4 = new TypeDto("CHECKBOX", 3, "checkbox");
            CHECKBOX = typeDto4;
            TypeDto typeDto5 = new TypeDto("SELECT", 4, "select");
            SELECT = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    public LeadFormsQuestionItemDto(String str, TypeDto typeDto, String str2, List<LeadFormsQuestionItemOptionDto> list) {
        this.key = str;
        this.type = typeDto;
        this.label = str2;
        this.options = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsQuestionItemDto)) {
            return false;
        }
        LeadFormsQuestionItemDto leadFormsQuestionItemDto = (LeadFormsQuestionItemDto) obj;
        return epx.f(this.key, leadFormsQuestionItemDto.key) && this.type == leadFormsQuestionItemDto.type && epx.f(this.label, leadFormsQuestionItemDto.label) && epx.f(this.options, leadFormsQuestionItemDto.options);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.key.hashCode() * 31)) * 31;
        String str = this.label;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<LeadFormsQuestionItemOptionDto> list = this.options;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "LeadFormsQuestionItemDto(key=" + this.key + ", type=" + this.type + ", label=" + this.label + ", options=" + this.options + ")";
    }

    public /* synthetic */ LeadFormsQuestionItemDto(String str, TypeDto typeDto, String str2, List list, int i, zcl zclVar) {
        this(str, typeDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}
