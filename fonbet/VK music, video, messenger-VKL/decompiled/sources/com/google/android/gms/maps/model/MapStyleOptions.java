package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vkontakte.android.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import xsna.exc0;
import xsna.i5s;
import xsna.ozg0;
import xsna.pd01;
import xsna.unv;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new pd01();
    public final String b;

    public MapStyleOptions(@NonNull String str) {
        exc0.j(str, "json must not be null");
        this.b = str;
    }

    @NonNull
    public static MapStyleOptions b(@NonNull Context context) throws Resources.NotFoundException {
        InputStream openRawResource = context.getResources().openRawResource(R.raw.map_dark_style);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        unv.a(openRawResource);
                        unv.a(byteArrayOutputStream);
                        return new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), C.UTF8_NAME));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    unv.a(openRawResource);
                    unv.a(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
            String obj = e.toString();
            throw new Resources.NotFoundException(i5s.a(new StringBuilder(obj.length() + 37), "Failed to read resource 2131886182: ", obj));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.x(w, parcel);
    }
}
