package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import xsna.dz2;
import xsna.f9t;
import xsna.j5g;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.tuz;
import xsna.yfb;
import xsna.zsw;

/* compiled from: MarketItemReviewsPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class n extends oda0<Photo> {
    public final UserId m;
    public String n;

    /* compiled from: MarketItemReviewsPhotoUploadTask.kt */
    public static final class a extends k.a<n> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            n nVar = new n(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("group_id")));
            nVar.d = ny90Var.c("task_id");
            return nVar;
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MarketItemReviewsPhotoUploadTask";
        }
    }

    public n(String str, UserId userId) {
        super(str, null, 6);
        this.m = userId;
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
        c.b.a(photo);
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        PhotosPhotoDto photosPhotoDto;
        String str = this.n;
        ArrayList arrayList = null;
        if (str == null || (photosPhotoDto = (PhotosPhotoDto) j5g.a0((List) rsg0.a0(yfb.x(f9t.d().v(this.m, str))).a())) == null) {
            return null;
        }
        List<PhotosPhotoSizesDto> R = photosPhotoDto.R();
        if (R != null) {
            List<PhotosPhotoSizesDto> list = R;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (PhotosPhotoSizesDto photosPhotoSizesDto : list) {
                arrayList.add(new ImageSize(photosPhotoSizesDto.getUrl(), photosPhotoSizesDto.getHeight(), photosPhotoSizesDto.getWidth(), null, ImageSizeKey.a.e(ImageSizeKey.Companion, photosPhotoSizesDto.e().i()), false, 40, null));
            }
        }
        Photo photo = new Photo(new Image(arrayList));
        photo.c = photosPhotoDto.getId();
        photo.d = photosPhotoDto.e();
        photo.e = photosPhotoDto.q();
        photo.f = photosPhotoDto.getUserId();
        photo.g = photosPhotoDto.k();
        photo.u = photosPhotoDto.a0();
        photo.v = photosPhotoDto.d();
        photo.v = photosPhotoDto.d();
        return photo;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        dz2 x = yfb.x(f9t.d().r());
        this.g = x.b;
        return rsg0.a0(x).U(new tuz(new zsw(6), 2));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.n = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MarketItemReviewsPhotoUploadTask";
    }
}
