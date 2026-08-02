package com.vk.upload.impl.tasks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.photos.dto.PhotosSaveOwnerCoverPhotoResponseDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.instantjobs.InstantJob;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.aha0;
import xsna.an10;
import xsna.c5g;
import xsna.dz2;
import xsna.e43;
import xsna.epx;
import xsna.f9t;
import xsna.hf8;
import xsna.kjw;
import xsna.n2i0;
import xsna.ncq0;
import xsna.ny90;
import xsna.oda0;
import xsna.ozg0;
import xsna.qoy;
import xsna.r2v;
import xsna.rsg0;
import xsna.so;
import xsna.yfb;
import xsna.zga0;
import xsna.zos;

/* compiled from: ProfileCoverUploadTaskGU.kt */
/* loaded from: classes11.dex */
public final class t extends oda0<Photo> {
    public final a m;
    public final aha0 n;
    public c o;
    public PhotosSaveOwnerCoverPhotoResponseDto p;

    /* compiled from: ProfileCoverUploadTaskGU.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final Float d;
        public final Float e;
        public final Float f;
        public final Float g;

        public /* synthetic */ a(String str, Float f, Float f2, Float f3, Float f4) {
            this(str, true, true, f, f2, f3, f4);
        }

        public final Float a() {
            return this.g;
        }

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final Float d() {
            return this.d;
        }

        public final boolean e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final Float f() {
            return this.f;
        }

        public final Float g() {
            return this.e;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            Float f = this.d;
            int hashCode = (b + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.e;
            int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.f;
            int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
            Float f4 = this.g;
            return hashCode3 + (f4 != null ? f4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(file=");
            sb.append(this.a);
            sb.append(", notify=");
            sb.append(this.b);
            sb.append(", errorNotify=");
            sb.append(this.c);
            sb.append(", left=");
            sb.append(this.d);
            sb.append(", top=");
            sb.append(this.e);
            sb.append(", right=");
            sb.append(this.f);
            sb.append(", bottom=");
            return so.b(sb, this.g, ')');
        }

        public a(String str, boolean z, boolean z2, Float f, Float f2, Float f3, Float f4) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = f;
            this.e = f2;
            this.f = f3;
            this.g = f4;
        }
    }

    /* compiled from: ProfileCoverUploadTaskGU.kt */
    public static final class b extends k.a<t> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            String f = ny90Var.f(DownloadModel.FILE_NAME);
            boolean a = ny90Var.a("do_notify");
            boolean a2 = ny90Var.a("do_error_notify");
            float b = (float) ny90Var.b("position_left");
            Float valueOf = Float.valueOf(b);
            if (b == -1.0f) {
                valueOf = null;
            }
            float b2 = (float) ny90Var.b("position_right");
            Float valueOf2 = Float.valueOf(b2);
            if (b2 == -1.0f) {
                valueOf2 = null;
            }
            float b3 = (float) ny90Var.b("position_top");
            Float valueOf3 = Float.valueOf(b3);
            if (b3 == -1.0f) {
                valueOf3 = null;
            }
            float b4 = (float) ny90Var.b("position_bottom");
            t tVar = new t(new a(f, a, a2, valueOf, valueOf2, valueOf3, b4 != -1.0f ? Float.valueOf(b4) : null));
            tVar.d = ny90Var.c("task_id");
            return tVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void b(t tVar, ny90 ny90Var) {
            super.b(tVar, ny90Var);
            a aVar = tVar.m;
            ny90Var.j("do_notify", aVar.e());
            ny90Var.j("do_error_notify", aVar.b());
            ny90Var.k("position_left", aVar.d() != null ? r0.floatValue() : -1.0d);
            ny90Var.k("position_top", aVar.g() != null ? r0.floatValue() : -1.0d);
            ny90Var.k("position_right", aVar.f() != null ? r0.floatValue() : -1.0d);
            ny90Var.k("position_bottom", aVar.a() != null ? r6.floatValue() : -1.0d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ProfilePhotoUploadTaskGU";
        }
    }

    /* compiled from: ProfileCoverUploadTaskGU.kt */
    /* loaded from: classes6.dex */
    public static final class c {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    public t(a aVar) {
        super(aVar.c(), null, 4);
        this.m = aVar;
        this.n = f9t.d();
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean B() {
        return this.m.b();
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        List<BaseImageDto> d;
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
        PhotosSaveOwnerCoverPhotoResponseDto photosSaveOwnerCoverPhotoResponseDto = this.p;
        if (photosSaveOwnerCoverPhotoResponseDto == null || (d = photosSaveOwnerCoverPhotoResponseDto.d()) == null) {
            return;
        }
        Intent intent = new Intent("com.vkontakte.android.USER_COVER_CHANGED");
        List<BaseImageDto> list = d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (BaseImageDto baseImageDto : list) {
            arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
        }
        Intent putExtra = intent.putExtra("image", new Image(arrayList)).putExtra("photo", photo);
        Context context = e43.a;
        n2i0.a(context != null ? context : null, hf8.a, putExtra);
        ozg0.a().j();
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return this.m.e();
    }

    @Override // xsna.sp6
    public final void W(Exception exc) {
        ozg0.a().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        a aVar = this.m;
        c cVar = this.o;
        if (cVar != null) {
            try {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                kjw.a g = kjw.g(context, Uri.parse(this.i), true);
                Float d = aVar.d();
                Integer valueOf = d != null ? Integer.valueOf(an10.b(d.floatValue() * g.b())) : null;
                Float g2 = aVar.g();
                Integer valueOf2 = g2 != null ? Integer.valueOf(an10.b(g2.floatValue() * g.a())) : null;
                Float a2 = aVar.a();
                Integer valueOf3 = a2 != null ? Integer.valueOf(an10.b(a2.floatValue() * g.a())) : null;
                Float f = aVar.f();
                Integer valueOf4 = f != null ? Integer.valueOf(an10.b(f.floatValue() * g.b())) : null;
                this.p = (PhotosSaveOwnerCoverPhotoResponseDto) rsg0.a0(yfb.x(zga0.j(this.n, valueOf, (valueOf2 == null || valueOf3 == null) ? null : Integer.valueOf(valueOf3.intValue() - valueOf2.intValue()), valueOf2, (valueOf == null || valueOf4 == null) ? null : Integer.valueOf(valueOf4.intValue() - valueOf.intValue()), cVar.a()))).a();
            } catch (Exception unused) {
                ozg0.a().e();
            }
        }
        return null;
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
        dz2 x = yfb.x(zga0.m(this.n));
        this.g = x.b;
        return rsg0.a0(x).U(new r2v(new zos(21), 12));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            this.o = new c(str);
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ProfilePhotoUploadTaskGU";
    }
}
