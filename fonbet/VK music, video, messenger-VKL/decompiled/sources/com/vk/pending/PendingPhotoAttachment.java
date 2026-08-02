package com.vk.pending;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.upload.impl.b;
import com.vk.upload.impl.tasks.o;
import com.vk.upload.impl.tasks.x;
import com.vkontakte.android.attachments.PhotoAttachment;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.e43;
import xsna.eso0;
import xsna.ju90;
import xsna.kjw;
import xsna.tec0;
import xsna.x74;
import xsna.xus;

/* loaded from: classes4.dex */
public class PendingPhotoAttachment extends Attachment implements eso0, ju90, tec0, x74 {
    public static final Serializer.c<PendingPhotoAttachment> CREATOR = new a();
    public final String f;
    public final int g;
    public final int h;
    public int i;
    public UserId j;
    public boolean k;
    public String l;
    public boolean m;

    public class a extends Serializer.c<PendingPhotoAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingPhotoAttachment a(@NonNull Serializer serializer) {
            return new PendingPhotoAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPhotoAttachment[i];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PendingPhotoAttachment(String str) {
        int i;
        Uri parse;
        Context context;
        ParcelFileDescriptor openFileDescriptor;
        this.j = UserId.d;
        this.i = com.vk.upload.impl.a.d.getAndIncrement();
        this.f = str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        try {
            parse = Uri.parse(str);
            context = e43.a;
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
            this.g = i2 != -1 ? 0 : z ? options.outHeight : i2;
            int i3 = options.outHeight;
            this.h = i3 != -1 ? z ? i2 : i3 : 0;
        }
        i = 0;
        if (i != 90) {
            z = false;
        }
        int i22 = options.outWidth;
        this.g = i22 != -1 ? 0 : z ? options.outHeight : i22;
        int i32 = options.outHeight;
        this.h = i32 != -1 ? z ? i22 : i32 : 0;
    }

    @Override // xsna.x74
    public final void A9(boolean z) {
        this.m = z;
    }

    @Override // xsna.x74
    @Nullable
    public final String B1() {
        return this.l;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return 0;
    }

    @Override // xsna.ju90
    public final void O3(int i) {
        this.i = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.j0(this.f);
        serializer.S(this.i);
        serializer.S(this.g);
        serializer.S(this.h);
    }

    @Override // xsna.tec0
    @NonNull
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("file_uri", this.f);
            return e;
        } catch (JSONException e2) {
            L.i(e2);
            return e;
        }
    }

    @Override // xsna.ju90
    public final int S() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) obj;
            String str = this.f;
            if (str != null && str.equals(pendingPhotoAttachment.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ju90
    public final String getUri() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.f;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // xsna.x74
    public final void i5(String str) {
        this.l = str;
    }

    @Override // xsna.x74
    public final boolean o1() {
        return this.m;
    }

    @Override // xsna.ju90
    public final b<PhotoAttachment> y6() {
        b<PhotoAttachment> oVar;
        boolean z = this.k;
        String str = this.f;
        if (z) {
            oVar = new x(str, this.j);
        } else {
            oVar = new o(str);
            oVar.d = this.i;
        }
        this.i = oVar.d;
        return oVar;
    }

    public PendingPhotoAttachment(Serializer serializer) {
        this.j = UserId.d;
        this.f = serializer.H();
        this.i = serializer.u();
        this.g = serializer.u();
        this.h = serializer.u();
    }
}
