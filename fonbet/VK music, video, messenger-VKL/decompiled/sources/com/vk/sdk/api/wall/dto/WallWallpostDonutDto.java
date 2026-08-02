package com.vk.sdk.api.wall.dto;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallWallpostDonutDto.kt */
/* loaded from: classes5.dex */
public final class WallWallpostDonutDto {

    @pmi0("can_publish_free_copy")
    private final Boolean canPublishFreeCopy;

    @pmi0("edit_mode")
    private final EditModeDto editMode;

    @pmi0("is_donut")
    private final boolean isDonut;

    @pmi0("paid_duration")
    private final Integer paidDuration;

    @pmi0("placeholder")
    private final WallWallpostDonutPlaceholderDto placeholder;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallWallpostDonutDto.kt */
    public static final class EditModeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EditModeDto[] $VALUES;

        @pmi0("all")
        public static final EditModeDto ALL;

        @pmi0("duration")
        public static final EditModeDto DURATION;
        private final String value;

        static {
            EditModeDto editModeDto = new EditModeDto("ALL", 0, "all");
            ALL = editModeDto;
            EditModeDto editModeDto2 = new EditModeDto("DURATION", 1, "duration");
            DURATION = editModeDto2;
            EditModeDto[] editModeDtoArr = {editModeDto, editModeDto2};
            $VALUES = editModeDtoArr;
            $ENTRIES = new asp(editModeDtoArr);
        }

        private EditModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static EditModeDto valueOf(String str) {
            return (EditModeDto) Enum.valueOf(EditModeDto.class, str);
        }

        public static EditModeDto[] values() {
            return (EditModeDto[]) $VALUES.clone();
        }
    }

    public WallWallpostDonutDto(boolean z, Integer num, WallWallpostDonutPlaceholderDto wallWallpostDonutPlaceholderDto, Boolean bool, EditModeDto editModeDto) {
        this.isDonut = z;
        this.paidDuration = num;
        this.placeholder = wallWallpostDonutPlaceholderDto;
        this.canPublishFreeCopy = bool;
        this.editMode = editModeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostDonutDto)) {
            return false;
        }
        WallWallpostDonutDto wallWallpostDonutDto = (WallWallpostDonutDto) obj;
        return this.isDonut == wallWallpostDonutDto.isDonut && epx.f(this.paidDuration, wallWallpostDonutDto.paidDuration) && epx.f(this.placeholder, wallWallpostDonutDto.placeholder) && epx.f(this.canPublishFreeCopy, wallWallpostDonutDto.canPublishFreeCopy) && this.editMode == wallWallpostDonutDto.editMode;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isDonut) * 31;
        Integer num = this.paidDuration;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        WallWallpostDonutPlaceholderDto wallWallpostDonutPlaceholderDto = this.placeholder;
        int hashCode3 = (hashCode2 + (wallWallpostDonutPlaceholderDto == null ? 0 : wallWallpostDonutPlaceholderDto.hashCode())) * 31;
        Boolean bool = this.canPublishFreeCopy;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        EditModeDto editModeDto = this.editMode;
        return hashCode4 + (editModeDto != null ? editModeDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallWallpostDonutDto(isDonut=" + this.isDonut + ", paidDuration=" + this.paidDuration + ", placeholder=" + this.placeholder + ", canPublishFreeCopy=" + this.canPublishFreeCopy + ", editMode=" + this.editMode + ")";
    }

    public /* synthetic */ WallWallpostDonutDto(boolean z, Integer num, WallWallpostDonutPlaceholderDto wallWallpostDonutPlaceholderDto, Boolean bool, EditModeDto editModeDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : wallWallpostDonutPlaceholderDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : editModeDto);
    }
}
