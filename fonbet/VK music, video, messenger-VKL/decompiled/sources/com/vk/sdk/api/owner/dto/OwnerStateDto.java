package com.vk.sdk.api.owner.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OwnerStateDto.kt */
/* loaded from: classes5.dex */
public final class OwnerStateDto {

    @pmi0("description")
    private final String description;

    @pmi0("state")
    private final StateDto state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OwnerStateDto.kt */
    public static final class StateDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @pmi0("2")
        public static final StateDto ADULT;

        @pmi0("1")
        public static final StateDto BANNED;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final StateDto BLACKLISTED;

        @pmi0("4")
        public static final StateDto DELETED;

        @pmi0("3")
        public static final StateDto HIDDEN;
        private final int value;

        static {
            StateDto stateDto = new StateDto("BANNED", 0, 1);
            BANNED = stateDto;
            StateDto stateDto2 = new StateDto("ADULT", 1, 2);
            ADULT = stateDto2;
            StateDto stateDto3 = new StateDto("HIDDEN", 2, 3);
            HIDDEN = stateDto3;
            StateDto stateDto4 = new StateDto("DELETED", 3, 4);
            DELETED = stateDto4;
            StateDto stateDto5 = new StateDto("BLACKLISTED", 4, 5);
            BLACKLISTED = stateDto5;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3, stateDto4, stateDto5};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
        }

        private StateDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnerStateDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerStateDto)) {
            return false;
        }
        OwnerStateDto ownerStateDto = (OwnerStateDto) obj;
        return this.state == ownerStateDto.state && epx.f(this.description, ownerStateDto.description);
    }

    public final int hashCode() {
        StateDto stateDto = this.state;
        int hashCode = (stateDto == null ? 0 : stateDto.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OwnerStateDto(state=" + this.state + ", description=" + this.description + ")";
    }

    public OwnerStateDto(StateDto stateDto, String str) {
        this.state = stateDto;
        this.description = str;
    }

    public /* synthetic */ OwnerStateDto(StateDto stateDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : stateDto, (i & 2) != 0 ? null : str);
    }
}
