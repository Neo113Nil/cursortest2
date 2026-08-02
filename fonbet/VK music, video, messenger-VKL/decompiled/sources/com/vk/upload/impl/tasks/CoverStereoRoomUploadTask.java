package com.vk.upload.impl.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import xsna.c7;
import xsna.d0k;
import xsna.dz2;
import xsna.e43;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.pli;
import xsna.rsg0;
import xsna.yfb;

/* compiled from: CoverStereoRoomUploadTask.kt */
/* loaded from: classes11.dex */
public final class CoverStereoRoomUploadTask extends oda0<UploadResult> {
    public final UserId m;
    public final String n;
    public String o;

    /* compiled from: CoverStereoRoomUploadTask.kt */
    public static final class a extends k.a<CoverStereoRoomUploadTask> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            CoverStereoRoomUploadTask coverStereoRoomUploadTask = new CoverStereoRoomUploadTask(new UserId(ny90Var.e("owner_id")), ny90Var.f("room_id"), Uri.parse(ny90Var.f(DownloadModel.FILE_NAME)));
            coverStereoRoomUploadTask.d = ny90Var.c("task_id");
            return coverStereoRoomUploadTask;
        }

        @Override // xsna.s7x
        public final String getType() {
            return "CoverStereoRoomUploadTask";
        }
    }

    public CoverStereoRoomUploadTask(UserId userId, String str, Uri uri) {
        super(uri.toString(), null, 6);
        this.m = userId;
        this.n = str;
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.o;
        if (str != null) {
        }
        return UploadResult.b;
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.uploading_photo);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        dz2 x = yfb.x(pli.i().e(this.m));
        this.g = x.b;
        return rsg0.a0(x).U(new c7(new d0k(1), 23));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        this.o = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "CoverStereoRoomUploadTask";
    }

    /* compiled from: CoverStereoRoomUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class UploadResult extends Serializer.StreamParcelableAdapter {
        public static final UploadResult b = new UploadResult();

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
