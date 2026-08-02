package com.vk.sdk.api.photos.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import io.reactivex.rxjava3.subjects.b;
import xsna.bh10;
import xsna.epx;
import xsna.gq;
import xsna.i5s;
import xsna.jax0;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: PhotosPhotoTagDto.kt */
/* loaded from: classes5.dex */
public final class PhotosPhotoTagDto {

    @pmi0("date")
    private final int date;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("placer_id")
    private final int placerId;

    @pmi0("tagged_name")
    private final String taggedName;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("viewed")
    private final BaseBoolIntDto viewed;

    @pmi0("x")
    private final float x;

    @pmi0("x2")
    private final float x2;

    @pmi0("y")
    private final float y;

    @pmi0("y2")
    private final float y2;

    public PhotosPhotoTagDto(int i, int i2, int i3, String str, UserId userId, BaseBoolIntDto baseBoolIntDto, float f, float f2, float f3, float f4, String str2) {
        this.date = i;
        this.id = i2;
        this.placerId = i3;
        this.taggedName = str;
        this.userId = userId;
        this.viewed = baseBoolIntDto;
        this.x = f;
        this.x2 = f2;
        this.y = f3;
        this.y2 = f4;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoTagDto)) {
            return false;
        }
        PhotosPhotoTagDto photosPhotoTagDto = (PhotosPhotoTagDto) obj;
        return this.date == photosPhotoTagDto.date && this.id == photosPhotoTagDto.id && this.placerId == photosPhotoTagDto.placerId && epx.f(this.taggedName, photosPhotoTagDto.taggedName) && epx.f(this.userId, photosPhotoTagDto.userId) && this.viewed == photosPhotoTagDto.viewed && Float.compare(this.x, photosPhotoTagDto.x) == 0 && Float.compare(this.x2, photosPhotoTagDto.x2) == 0 && Float.compare(this.y, photosPhotoTagDto.y) == 0 && Float.compare(this.y2, photosPhotoTagDto.y2) == 0 && epx.f(this.description, photosPhotoTagDto.description);
    }

    public final int hashCode() {
        int a = b.a(this.y2, b.a(this.y, b.a(this.x2, b.a(this.x, vp.a(this.viewed, bh10.a(urd0.a(shy.a(this.placerId, shy.a(this.id, Integer.hashCode(this.date) * 31, 31), 31), 31, this.taggedName), 31, this.userId.b), 31), 31), 31), 31), 31);
        String str = this.description;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.date;
        int i2 = this.id;
        int i3 = this.placerId;
        String str = this.taggedName;
        UserId userId = this.userId;
        BaseBoolIntDto baseBoolIntDto = this.viewed;
        float f = this.x;
        float f2 = this.x2;
        float f3 = this.y;
        float f4 = this.y2;
        String str2 = this.description;
        StringBuilder a = odj.a(i, i2, "PhotosPhotoTagDto(date=", ", id=", ", placerId=");
        jax0.a(i3, ", taggedName=", str, ", userId=", a);
        a.append(userId);
        a.append(", viewed=");
        a.append(baseBoolIntDto);
        a.append(", x=");
        gq.h(a, f, ", x2=", f2, ", y=");
        gq.h(a, f3, ", y2=", f4, ", description=");
        return i5s.a(a, str2, ")");
    }

    public /* synthetic */ PhotosPhotoTagDto(int i, int i2, int i3, String str, UserId userId, BaseBoolIntDto baseBoolIntDto, float f, float f2, float f3, float f4, String str2, int i4, zcl zclVar) {
        this(i, i2, i3, str, userId, baseBoolIntDto, f, f2, f3, f4, (i4 & 1024) != 0 ? null : str2);
    }
}
