package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.os.Parcel;
import android.os.Parcelable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        w.b bVar = new w.b(parcel);
        bVar.a = parcel.readFloat();
        return bVar;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new w.b[i];
    }
}
