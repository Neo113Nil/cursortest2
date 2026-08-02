package com.vk.upload.impl.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.core.serialize.Serializer;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.alk;
import xsna.bwi;
import xsna.dz2;
import xsna.e43;
import xsna.faw;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.qw80;
import xsna.rsg0;
import xsna.yfb;
import xsna.z4t0;

/* compiled from: VmojiPhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class VmojiPhotoUploadTask extends oda0<UploadResult> {
    public UploadResult m;
    public Integer n;
    public Integer o;

    /* compiled from: VmojiPhotoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class UploadResult extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<UploadResult> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<UploadResult> {
            @Override // com.vk.core.serialize.Serializer.c
            public final UploadResult a(Serializer serializer) {
                return new UploadResult(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UploadResult[i];
            }
        }

        public UploadResult(String str) {
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }
    }

    /* compiled from: VmojiPhotoUploadTask.kt */
    public static final class a extends k.a<VmojiPhotoUploadTask> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            VmojiPhotoUploadTask vmojiPhotoUploadTask = new VmojiPhotoUploadTask(ny90Var.f(DownloadModel.FILE_NAME));
            vmojiPhotoUploadTask.d = ny90Var.c("task_id");
            return vmojiPhotoUploadTask;
        }

        @Override // xsna.s7x
        public final String getType() {
            return "VmojiPhotoUploadTask";
        }
    }

    /* compiled from: VmojiPhotoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class b implements faw.b {
        public b() {
        }

        @Override // xsna.faw.b
        public final int L0() {
            return VmojiPhotoUploadTask.this.o.intValue();
        }

        @Override // xsna.faw.b
        public final boolean a() {
            return false;
        }

        @Override // xsna.faw.b
        public final int getMaxWidth() {
            return VmojiPhotoUploadTask.this.n.intValue();
        }
    }

    public VmojiPhotoUploadTask(String str) {
        super(str, null, 6);
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        return this.m;
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        dz2 x = yfb.x(alk.c().e());
        this.g = x.b;
        return rsg0.a0(x).U(new qw80(new z4t0(this, 7), 18));
    }

    @Override // xsna.oda0, com.vk.upload.impl.tasks.k
    public final String f0() {
        if (this.n == null || this.o == null) {
            return super.f0();
        }
        b bVar = new b();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new bwi(context, false, bVar).a(Uri.parse(this.i));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            if (new JSONObject(str).has(SharedKt.PARAM_ERROR_MSG)) {
                throw new UploadException("Server error: ".concat(str));
            }
            this.m = new UploadResult(str);
        } catch (UploadException e) {
            throw e;
        } catch (Exception e2) {
            throw new UploadException("Fail to parse response: ".concat(str), e2);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "VmojiPhotoUploadTask";
    }
}
