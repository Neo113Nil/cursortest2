package com.vk.sdk.api.groups.dto;

import ru.ok.android.api.core.ApiUris;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.jax0;
import xsna.kh10;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: GroupsCallbackServerDto.kt */
/* loaded from: classes5.dex */
public final class GroupsCallbackServerDto {

    @pmi0("creator_id")
    private final int creatorId;

    @pmi0("id")
    private final int id;

    @pmi0("secret_key")
    private final String secretKey;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsCallbackServerDto.kt */
    public static final class StatusDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("failed")
        public static final StatusDto FAILED;

        @pmi0(ApiUris.SCHEME_OK)
        public static final StatusDto OK;

        @pmi0("unconfigured")
        public static final StatusDto UNCONFIGURED;

        @pmi0("wait")
        public static final StatusDto WAIT;
        private final String value;

        static {
            StatusDto statusDto = new StatusDto("UNCONFIGURED", 0, "unconfigured");
            UNCONFIGURED = statusDto;
            StatusDto statusDto2 = new StatusDto(SignalingProtocol.HUNGUP_REASON_FAILED, 1, "failed");
            FAILED = statusDto2;
            StatusDto statusDto3 = new StatusDto("WAIT", 2, "wait");
            WAIT = statusDto3;
            StatusDto statusDto4 = new StatusDto("OK", 3, ApiUris.SCHEME_OK);
            OK = statusDto4;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }
    }

    public GroupsCallbackServerDto(int i, String str, int i2, String str2, String str3, StatusDto statusDto) {
        this.id = i;
        this.title = str;
        this.creatorId = i2;
        this.url = str2;
        this.secretKey = str3;
        this.status = statusDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCallbackServerDto)) {
            return false;
        }
        GroupsCallbackServerDto groupsCallbackServerDto = (GroupsCallbackServerDto) obj;
        return this.id == groupsCallbackServerDto.id && epx.f(this.title, groupsCallbackServerDto.title) && this.creatorId == groupsCallbackServerDto.creatorId && epx.f(this.url, groupsCallbackServerDto.url) && epx.f(this.secretKey, groupsCallbackServerDto.secretKey) && this.status == groupsCallbackServerDto.status;
    }

    public final int hashCode() {
        return this.status.hashCode() + urd0.a(urd0.a(shy.a(this.creatorId, urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31), 31, this.url), 31, this.secretKey);
    }

    public final String toString() {
        int i = this.id;
        String str = this.title;
        int i2 = this.creatorId;
        String str2 = this.url;
        String str3 = this.secretKey;
        StatusDto statusDto = this.status;
        StringBuilder a = kh10.a(i, "GroupsCallbackServerDto(id=", ", title=", str, ", creatorId=");
        jax0.a(i2, ", url=", str2, ", secretKey=", a);
        a.append(str3);
        a.append(", status=");
        a.append(statusDto);
        a.append(")");
        return a.toString();
    }
}
