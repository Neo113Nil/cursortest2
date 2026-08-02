package com.vk.newsfeed.posting.impl.domain.model.attachment;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.cvz;
import xsna.e43;
import xsna.epx;
import xsna.hg10;
import xsna.kjw;

/* compiled from: LocalPhotoAttachment.kt */
/* loaded from: classes4.dex */
public final class LocalPhotoAttachment extends PhotoAttachment implements cvz {
    public static final Serializer.c<LocalPhotoAttachment> CREATOR = new b();
    public final int A;
    public final LocalMediaEntry y;
    public final int z;

    /* compiled from: LocalPhotoAttachment.kt */
    public static final class a {
        public static LocalPhotoAttachment a(JSONObject jSONObject) {
            try {
                int i = jSONObject.getInt("type");
                int i2 = jSONObject.getInt("local_media_id");
                Uri parse = Uri.parse(jSONObject.getString("local_media_path"));
                long j = jSONObject.getLong("local_media_date_taken");
                int i3 = jSONObject.getInt("local_media_width");
                int i4 = jSONObject.getInt("local_media_height");
                long j2 = jSONObject.getLong("local_media_date_modified");
                long j3 = jSONObject.getLong("local_media_size");
                MediaStoreImageEntry mediaStoreImageEntry = i != 17 ? i != 18 ? null : (MediaStoreImageEntry) new MediaStoreVideoEntry(i2, parse, j, i3, i4, j2, j3, jSONObject.getLong("local_media_duration")) : new MediaStoreImageEntry(i2, parse, j, i3, i4, j2, j3, jSONObject.getInt("local_media_photo_exif_orientation"));
                if (mediaStoreImageEntry == null) {
                    return null;
                }
                return new LocalPhotoAttachment(new LocalMediaEntry.Image(mediaStoreImageEntry));
            } catch (JSONException e) {
                L.g("Can't parse json to LocalPhotoAttachment", e);
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<LocalPhotoAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LocalPhotoAttachment a(Serializer serializer) {
            return new LocalPhotoAttachment((LocalMediaEntry) serializer.A(LocalMediaEntry.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocalPhotoAttachment[i];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalPhotoAttachment(LocalMediaEntry localMediaEntry) {
        super(new Photo(new Image((List<ImageSize>) Collections.singletonList(new ImageSize(localMediaEntry.ba().f().toString(), localMediaEntry.ba().getWidth(), localMediaEntry.ba().getHeight(), null, (char) 0, false, 56, null)))));
        int i;
        Uri parse;
        Context context;
        ParcelFileDescriptor openFileDescriptor;
        this.y = localMediaEntry;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        try {
            parse = Uri.parse(localMediaEntry.ba().f().toString());
            context = e43.a;
            if (context == null) {
                context = null;
            }
            openFileDescriptor = context.getContentResolver().openFileDescriptor(parse, "r");
        } catch (Exception e) {
            L.E(e, new Object[0]);
        }
        if (openFileDescriptor != null) {
            BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), null, options);
            openFileDescriptor.close();
            i = kjw.e(context, parse);
            if (i != 90 && i != 270) {
                z = false;
            }
            int i2 = options.outWidth;
            this.z = i2 != -1 ? 0 : z ? options.outHeight : i2;
            int i3 = options.outHeight;
            this.A = i3 != -1 ? z ? i2 : i3 : 0;
        }
        i = 0;
        if (i != 90) {
            z = false;
        }
        int i22 = options.outWidth;
        this.z = i22 != -1 ? 0 : z ? options.outHeight : i22;
        int i32 = options.outHeight;
        this.A = i32 != -1 ? z ? i22 : i32 : 0;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.dto.common.Attachment
    public final int Bb() {
        return 0;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment
    public final float E0() {
        int i = this.A;
        if (i == 0) {
            return 1.0f;
        }
        return this.z / i;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment
    public final String Ib() {
        return this.y.ba().f().toString();
    }

    @Override // xsna.cvz
    public final LocalMediaEntry M3() {
        return this.y;
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.y);
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, xsna.tec0
    public final JSONObject Q3() {
        return hg10.s(this.y.ba());
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !LocalPhotoAttachment.class.equals(obj.getClass())) {
            return false;
        }
        return epx.f(this.y.ba().f(), ((LocalPhotoAttachment) obj).y.ba().f());
    }

    public final Uri getUri() {
        return this.y.ba().f();
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment
    public final int hashCode() {
        return this.y.ba().f().hashCode();
    }

    @Override // com.vkontakte.android.attachments.PhotoAttachment, com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_photo;
    }
}
