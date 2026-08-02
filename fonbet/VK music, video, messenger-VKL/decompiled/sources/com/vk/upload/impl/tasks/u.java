package com.vk.upload.impl.tasks;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.photos.dto.PhotosGetResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosSaveOwnerPhotoResponseDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.toggle.features.ComFeatures;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.aha0;
import xsna.ahn;
import xsna.baq0;
import xsna.bz2;
import xsna.d0w;
import xsna.dqu;
import xsna.dz2;
import xsna.e1r0;
import xsna.e43;
import xsna.efa0;
import xsna.epx;
import xsna.f9t;
import xsna.fkq0;
import xsna.hf8;
import xsna.ho8;
import xsna.iah0;
import xsna.j5g;
import xsna.ko00;
import xsna.msy;
import xsna.n2i0;
import xsna.ncq0;
import xsna.ny90;
import xsna.o2i;
import xsna.oda0;
import xsna.ozg0;
import xsna.qr;
import xsna.rpu;
import xsna.rsg0;
import xsna.tp1;
import xsna.w8i;
import xsna.wqu;
import xsna.yfb;
import xsna.zga0;
import xsna.zqu;
import xsna.zyx;

/* compiled from: ProfilePhotoUploadTask.kt */
/* loaded from: classes11.dex */
public final class u extends oda0<Photo> implements w8i {
    public int A;
    public int B;
    public PhotosPhotoDto C;
    public a D;
    public final UserId m;
    public final boolean n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final String w;
    public final aha0 x;
    public final Object y;
    public int z;

    /* compiled from: ProfilePhotoUploadTask.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GoUploaderParams(photo=");
            sb.append(this.a);
            sb.append(", fullCrop=");
            sb.append(this.b);
            sb.append(", squareCrop=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ProfilePhotoUploadTask.kt */
    public static final class b extends k.a<u> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            String f = ny90Var.f(DownloadModel.FILE_NAME);
            UserId userId = new UserId(ny90Var.e("owner_id"));
            boolean a = ny90Var.a("do_notify");
            float b = (float) ny90Var.b("position_left");
            float b2 = (float) ny90Var.b("position_top");
            float b3 = (float) ny90Var.b("position_right");
            float b4 = (float) ny90Var.b("position_bottom");
            boolean a2 = ny90Var.a("publish_post");
            boolean a3 = ny90Var.a("publish_story");
            boolean a4 = ny90Var.a("show_success_message");
            String i = ny90Var.i("source", "");
            if (i.length() <= 0) {
                i = null;
            }
            u uVar = new u(f, userId, a, b, b2, b3, b4, a2, a3, a4, i, 2048);
            uVar.d = ny90Var.c("task_id");
            return uVar;
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void b(u uVar, ny90 ny90Var) {
            super.b(uVar, ny90Var);
            ny90Var.n("owner_id", uVar.m.b);
            ny90Var.j("do_notify", uVar.n);
            ny90Var.k("position_left", uVar.o);
            ny90Var.k("position_right", uVar.q);
            ny90Var.k("position_top", uVar.p);
            ny90Var.k("position_bottom", uVar.r);
            ny90Var.j("publish_post", uVar.s);
            ny90Var.j("publish_story", uVar.t);
            ny90Var.j("show_success_message", uVar.u);
            String str = uVar.v;
            if (str != null) {
                ny90Var.o("source", str);
            }
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ProfilePhotoUploadTask";
        }
    }

    public /* synthetic */ u(String str, UserId userId, boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, String str2, int i) {
        this(str, userId, z, f, f2, f3, f4, (i & 128) != 0 ? true : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? true : z4, (i & 1024) != 0 ? null : str2, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Image h0(UserId userId, String[] strArr) {
        Group group;
        GroupsGroupFullDto groupsGroupFullDto;
        ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            return ((Group) rsg0.a0(new rpu(fkq0.e(userId), strArr)).a()).g;
        }
        dz2 x = yfb.x(wqu.a.b(new zqu(), Collections.singletonList(fkq0.a(userId)), Collections.singletonList(GroupsFieldsDto.PHOTO_BASE), null, 4));
        ahn.D(x);
        List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) rsg0.a0(x).a()).d();
        if (d == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) == null) {
            group = null;
        } else {
            new dqu();
            group = dqu.a(groupsGroupFullDto);
        }
        if (group != null) {
            return group.g;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.upload.impl.b, xsna.ye6
    public final void I(zyx zyxVar, Throwable th) {
        boolean d;
        super.I(zyxVar, th);
        d = ((o2i) this.y.getValue()).d(th, true);
        if (d) {
            return;
        }
        ozg0.a().o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // xsna.sp6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(Parcelable parcelable) {
        String str;
        Image image;
        UserId userId = this.m;
        RectF rectF = new RectF(this.o, this.p, this.q, this.r);
        baq0 a2 = ozg0.a();
        PhotosPhotoDto photosPhotoDto = this.C;
        Integer valueOf = photosPhotoDto != null ? Integer.valueOf(photosPhotoDto.getId()) : null;
        String str2 = this.i;
        boolean z = this.s;
        a2.l(str2, rectF, z, valueOf);
        String[] strArr = {"photo_base", "photo_id"};
        try {
            if (fkq0.d(userId)) {
                UserProfile userProfile = (UserProfile) rsg0.a0(new e1r0(userId, strArr)).a();
                str = userProfile.t;
                try {
                    image = userProfile.O;
                } catch (Exception unused) {
                    image = null;
                    if (image != null) {
                    }
                }
            } else {
                image = h0(userId, strArr);
                str = null;
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (image != null) {
            return;
        }
        ImageSize Cb = image.Cb(iah0.f().density > 1.0f ? 100 : 50, true, false);
        String url = Cb != null ? Cb.getUrl() : null;
        if (qr.f(userId) && url != null) {
            ozg0.a().a(url);
        }
        Intent putExtra = new Intent("com.vkontakte.android.USER_PHOTO_CHANGED").putExtra("id", userId).putExtra("image", image).putExtra("ava_photo_id", str).putExtra("photo", url);
        ozg0.a().n(putExtra, z);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        n2i0.a(context, hf8.a, putExtra);
        PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) j5g.a0(((PhotosGetResponseDto) rsg0.a0(yfb.x(zga0.b(this.x, this.m, "-6", Boolean.TRUE, 0, 1, null, 13770))).a()).d());
        ozg0.a().p(photosPhotoDto2 != null ? Integer.valueOf(photosPhotoDto2.getId()) : null, str2);
    }

    @Override // xsna.sp6
    public final void M() {
        if (fkq0.d(this.m)) {
            ozg0.a().r(this.s, this.t, this.u);
        }
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return this.n;
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        a aVar = this.D;
        if (aVar != null) {
            aha0 d = f9t.d();
            UserId userId = this.m;
            this.C = ((PhotosSaveOwnerPhotoResponseDto) bz2.d(zga0.g(d, aVar.b(), fkq0.b(userId) ? userId : null, aVar.a(), aVar.c(), Boolean.valueOf(!this.s), this.v, this.w))).d();
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
        efa0 efa0Var = new efa0(this.m);
        this.g = efa0Var.b;
        return rsg0.a0(efa0Var).U(new tp1(new d0w(this, 20), 27));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        Pair pair;
        try {
            if (!new JSONObject(str).has("hash")) {
                throw new UploadException("can't parse upload response", str);
            }
            if (this.z == 0 && this.A == 0 && this.B == 0) {
                pair = new Pair(null, null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.z);
                sb.append(',');
                sb.append(this.A);
                sb.append(',');
                sb.append(this.B);
                sb.append(',');
                sb.append(this.B);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.z);
                sb3.append(',');
                sb3.append(this.A);
                sb3.append(',');
                sb3.append(this.B);
                pair = new Pair(sb2, sb3.toString());
            }
            this.D = new a(str, (String) pair.d(), (String) pair.g());
        } catch (Exception e) {
            throw new UploadException("can't parse upload response", str, e);
        }
    }

    public final String i0(String str) {
        float f = this.o;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return str;
        }
        try {
            boolean a2 = com.vk.upload.impl.c.a(this.i, new BitmapFactory.Options());
            int i = (int) (f * (a2 ? r0.outHeight : r0.outWidth));
            this.z = i;
            int i2 = (int) (this.p * (a2 ? r0.outWidth : r0.outHeight));
            this.A = i2;
            this.B = Math.min(((int) (this.q * (a2 ? r0.outHeight : r0.outWidth))) - i, ((int) (this.r * (a2 ? r0.outWidth : r0.outHeight))) - i2);
            return str + "&_square_crop=" + this.z + ',' + this.A + ',' + this.B + "&_full=" + this.z + ',' + this.A + ',' + this.B + ',' + this.B;
        } catch (Exception e) {
            L.g("error getting upload server ", e);
            return str;
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ProfilePhotoUploadTask";
    }

    @Override // com.vk.upload.impl.tasks.k, com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        super.u(obj);
        ozg0.a().m();
    }

    public u(String str, UserId userId, boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, String str2, String str3) {
        super(str, null, 4);
        this.m = userId;
        this.n = z;
        this.o = f;
        this.p = f2;
        this.q = f3;
        this.r = f4;
        this.s = z2;
        this.t = z3;
        this.u = z4;
        this.v = str2;
        this.w = str3;
        this.x = f9t.d();
        this.y = msy.a(LazyThreadSafetyMode.NONE, new ko00(this, 28));
    }
}
