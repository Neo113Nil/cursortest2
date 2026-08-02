package com.vk.dto.stickers.ugc;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ugc.UgcStatus;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.n1l0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: UGCStickerModel.kt */
/* loaded from: classes18.dex */
public final class UGCStickerModel extends Serializer.StreamParcelableAdapter implements n1l0 {
    public static final Serializer.c<UGCStickerModel> CREATOR = new b();
    public final UserId b;
    public final long c;
    public final long d;
    public final ImageList e;
    public final UgcStatus f;
    public final long g;

    /* compiled from: UGCStickerModel.kt */
    public static final class a {
        public static UGCStickerModel a(JSONObject jSONObject) {
            Object obj;
            UgcStatus ugcStatus;
            UserId userId = new UserId(jSONObject.getLong("owner_id"));
            long optLong = jSONObject.optLong("id");
            long optLong2 = jSONObject.optLong("pack_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            ImageList d = ImageList.a.d(optJSONArray);
            if (jSONObject.optBoolean("is_deleted")) {
                ugcStatus = UgcStatus.DELETED;
            } else if (jSONObject.optBoolean("is_claimed")) {
                ugcStatus = UgcStatus.CLAIMED;
            } else if (epx.f(jSONObject.optString("active_restriction"), "age_18")) {
                ugcStatus = UgcStatus.AGE_RESTRICTED;
            } else {
                UgcStatus.a aVar = UgcStatus.Companion;
                String optString = jSONObject.optString("status");
                aVar.getClass();
                Iterator<E> it = UgcStatus.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((UgcStatus) obj).j(), optString)) {
                        break;
                    }
                }
                ugcStatus = (UgcStatus) obj;
                if (ugcStatus == null) {
                    ugcStatus = UgcStatus.OK;
                }
            }
            return new UGCStickerModel(userId, optLong, optLong2, d, ugcStatus, 0L, 32, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UGCStickerModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UGCStickerModel a(Serializer serializer) {
            return new UGCStickerModel((UserId) serializer.A(UserId.class.getClassLoader()), serializer.w(), serializer.w(), (ImageList) serializer.G(ImageList.class.getClassLoader()), (UgcStatus) serializer.A(UgcStatus.class.getClassLoader()), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UGCStickerModel[i];
        }
    }

    public UGCStickerModel() {
        this(null, 0L, 0L, null, null, 0L, 63, null);
    }

    @Override // xsna.n1l0
    public final boolean B() {
        return this.f != UgcStatus.OK;
    }

    @Override // xsna.n1l0
    public final UgcStatus O() {
        return this.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.Y(this.c);
        serializer.Y(this.d);
        serializer.i0(this.e);
        serializer.e0(this.f);
        serializer.Y(this.g);
    }

    @Override // xsna.n1l0, xsna.zk2
    public final boolean V0() {
        return false;
    }

    @Override // xsna.n1l0
    public final ImageList Z() {
        return this.e;
    }

    @Override // xsna.n1l0, xsna.zk2
    public final String a(boolean z) {
        return "";
    }

    @Override // xsna.n1l0, xsna.zk2
    public final String b(boolean z) {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UGCStickerModel)) {
            return false;
        }
        UGCStickerModel uGCStickerModel = (UGCStickerModel) obj;
        return epx.f(this.b, uGCStickerModel.b) && this.c == uGCStickerModel.c && this.d == uGCStickerModel.d && epx.f(this.e, uGCStickerModel.e) && this.f == uGCStickerModel.f && this.g == uGCStickerModel.g;
    }

    @Override // xsna.n1l0
    public final long getProductId() {
        return this.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ((this.f.hashCode() + fw3.a(bh10.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e.b)) * 31);
    }

    @Override // xsna.n1l0
    public final int o2() {
        return (int) this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UGCStickerModel(ownerId=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", packId=");
        sb.append(this.d);
        sb.append(", images=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", lastSyncTime=");
        return vu5.a(')', this.g, sb);
    }

    @Override // xsna.n1l0
    public final boolean z9() {
        return false;
    }

    public /* synthetic */ UGCStickerModel(UserId userId, long j, long j2, ImageList imageList, UgcStatus ugcStatus, long j3, int i, zcl zclVar) {
        this((i & 1) != 0 ? UserId.d : userId, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? -1L : j2, (i & 8) != 0 ? new ImageList(null, 1, null) : imageList, (i & 16) != 0 ? UgcStatus.OK : ugcStatus, (i & 32) != 0 ? System.currentTimeMillis() : j3);
    }

    public UGCStickerModel(UserId userId, long j, long j2, ImageList imageList, UgcStatus ugcStatus, long j3) {
        this.b = userId;
        this.c = j;
        this.d = j2;
        this.e = imageList;
        this.f = ugcStatus;
        this.g = j3;
    }
}
