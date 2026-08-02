package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: UGCStickerModelDto.kt */
/* loaded from: classes5.dex */
public final class UGCStickerModelDto {

    @pmi0("id")
    private final long id;

    @pmi0("images")
    private final ImageListDto images;

    @pmi0("lastSyncTime")
    private final long lastSyncTime;

    @pmi0("ownerId")
    private final long ownerId;

    @pmi0("packId")
    private final long packId;

    @pmi0("status")
    private final UgcStatusDto status;

    public UGCStickerModelDto(long j, long j2, long j3, ImageListDto imageListDto, UgcStatusDto ugcStatusDto, long j4) {
        this.ownerId = j;
        this.id = j2;
        this.packId = j3;
        this.images = imageListDto;
        this.status = ugcStatusDto;
        this.lastSyncTime = j4;
    }

    public final long a() {
        return this.id;
    }

    public final ImageListDto b() {
        return this.images;
    }

    public final long c() {
        return this.lastSyncTime;
    }

    public final long d() {
        return this.ownerId;
    }

    public final long e() {
        return this.packId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UGCStickerModelDto)) {
            return false;
        }
        UGCStickerModelDto uGCStickerModelDto = (UGCStickerModelDto) obj;
        return this.ownerId == uGCStickerModelDto.ownerId && this.id == uGCStickerModelDto.id && this.packId == uGCStickerModelDto.packId && epx.f(this.images, uGCStickerModelDto.images) && this.status == uGCStickerModelDto.status && this.lastSyncTime == uGCStickerModelDto.lastSyncTime;
    }

    public final UgcStatusDto f() {
        return this.status;
    }

    public final int hashCode() {
        return Long.hashCode(this.lastSyncTime) + ((this.status.hashCode() + ((this.images.hashCode() + bh10.a(bh10.a(Long.hashCode(this.ownerId) * 31, 31, this.id), 31, this.packId)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UGCStickerModelDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", packId=");
        sb.append(this.packId);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", lastSyncTime=");
        return vu5.a(')', this.lastSyncTime, sb);
    }
}
