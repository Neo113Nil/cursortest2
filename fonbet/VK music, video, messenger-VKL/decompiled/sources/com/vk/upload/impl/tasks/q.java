package com.vk.upload.impl.tasks;

import android.os.Parcelable;
import com.vk.dto.photo.Photo;
import com.vk.upload.impl.c;
import com.vk.upload.impl.tasks.k;
import xsna.aha0;
import xsna.c3v;
import xsna.dz2;
import xsna.ga40;
import xsna.k990;
import xsna.ncq0;
import xsna.oda0;
import xsna.ozg0;
import xsna.rf3;
import xsna.rsg0;
import xsna.sr;
import xsna.tfx;
import xsna.yfb;
import xsna.z250;
import xsna.zq;

/* compiled from: PhotoFlowPhotoUploadTask.kt */
/* loaded from: classes6.dex */
public final class q extends oda0<Photo> {
    public final aha0 m;
    public String n;

    /* compiled from: PhotoFlowPhotoUploadTask.kt */
    public static final class a extends k.a<q> {
        public static final String a = q.class.getSimpleName();
    }

    public q(String str) {
        super(str, null, 6);
        this.m = new aha0();
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
        if (photo != null) {
            c.b.a(photo);
            ozg0.a().s(photo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        String str = this.n;
        if (str == null) {
            return null;
        }
        this.m.getClass();
        tfx tfxVar = new tfx("photos.savePhotoFeedPhoto", new io.reactivex.rxjava3.internal.operators.mixed.n(23), new zq(22));
        tfx.o(tfxVar, "response_json", str, 0, 0, 12);
        return (Photo) rsg0.a0(yfb.x(tfxVar)).U(new ga40(new c3v(9), 6)).a();
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        this.m.getClass();
        dz2 x = yfb.x(new tfx("photos.getPhotoFeedUploadServer", new sr(24), new rf3(24)));
        this.g = x.b;
        return rsg0.a0(x).U(new z250(new k990(2), 4));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.n = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        String str = a.a;
        return a.a;
    }
}
