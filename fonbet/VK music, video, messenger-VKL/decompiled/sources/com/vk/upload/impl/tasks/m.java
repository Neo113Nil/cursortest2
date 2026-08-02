package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.ai3;
import xsna.c5g;
import xsna.dz2;
import xsna.f9t;
import xsna.fkq0;
import xsna.gzs;
import xsna.j5g;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ozg0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.tuq;
import xsna.yfb;

/* compiled from: MarketAlbumPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class m extends oda0<Photo> {
    public final UserId m;
    public b n;

    /* compiled from: MarketAlbumPhotoUploadTask.kt */
    public static final class a extends k.a<m> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            m mVar = new m(ny90Var.f(DownloadModel.FILE_NAME), new UserId(ny90Var.e("group_id")));
            mVar.d = ny90Var.c("task_id");
            return mVar;
        }

        @Override // xsna.s7x
        public final String getType() {
            return "MarketAlbumPhotoUploadTask";
        }
    }

    /* compiled from: MarketAlbumPhotoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public final UserId a;
        public final int b;
        public final String c;
        public final String d;

        public b(UserId userId, int i, String str, String str2) {
            this.a = userId;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        public final UserId a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }
    }

    public m(String str, UserId userId) {
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
        b bVar = this.n;
        ArrayList arrayList = null;
        if (bVar == null) {
            return null;
        }
        PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) j5g.a0((List) rsg0.a0(yfb.x(f9t.d().w(bVar.d(), bVar.a(), bVar.c(), bVar.b()))).a());
        if (photosPhotoDto == null) {
            return null;
        }
        List<PhotosPhotoSizesDto> R = photosPhotoDto.R();
        if (R != null) {
            List<PhotosPhotoSizesDto> list = R;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (PhotosPhotoSizesDto photosPhotoSizesDto : list) {
                arrayList.add(new ImageSize(photosPhotoSizesDto.getUrl(), photosPhotoSizesDto.getHeight(), photosPhotoSizesDto.getWidth(), Boolean.valueOf(photosPhotoSizesDto.e() == PhotosPhotoSizesTypeDto.BASE), ImageSizeKey.a.e(ImageSizeKey.Companion, photosPhotoSizesDto.e().i()), false, 32, null));
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
        dz2 x = yfb.x(f9t.d().s(fkq0.e(this.m)));
        this.g = x.b;
        return rsg0.a0(x).U(new ai3(new tuq(8), 25));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            long j = jSONObject.getLong("gid");
            gzs<s3q0> gzsVar = fkq0.a;
            this.n = new b(new UserId(j), jSONObject.getInt(Hb.a), jSONObject.getString("photo"), jSONObject.getString("hash"));
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "MarketAlbumPhotoUploadTask";
    }
}
