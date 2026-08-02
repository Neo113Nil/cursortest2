package com.vk.newsfeed.common.recycler.holders.attachments;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.ad.BaseAdsDataProvider;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.hd60;

/* compiled from: ShittyAdsDtoProvider.kt */
/* loaded from: classes4.dex */
public final class ShittyAdsDtoProvider extends BaseAdsDataProvider {
    private static final Parcelable.Creator<ShittyAdsDtoProvider> CREATOR = new a();
    public final ShitAttachment b;
    public final Owner c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;

    /* compiled from: ShittyAdsDtoProvider.kt */
    public static final class a extends Serializer.c<ShittyAdsDtoProvider> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ShittyAdsDtoProvider a(Serializer serializer) {
            return new ShittyAdsDtoProvider(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShittyAdsDtoProvider[i];
        }
    }

    public ShittyAdsDtoProvider(ShitAttachment shitAttachment, Owner owner, String str, int i, String str2, String str3, int i2) {
        this.b = shitAttachment;
        this.c = owner;
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = str3;
        this.h = i2;
    }

    @Override // com.vk.libvideo.api.ad.AdsDataProvider
    public final void Da(FragmentActivity fragmentActivity) {
        hd60.a().r0(fragmentActivity, this.b, this.e, AdClickContext.HEADER);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.S(this.h);
    }

    @Override // com.vk.libvideo.api.ad.AdsDataProvider
    public final String S1() {
        return this.g;
    }

    @Override // com.vk.libvideo.api.ad.AdsDataProvider
    public final void a8(Context context) {
        hd60.a().O(context, this.b, this.e, true);
    }

    @Override // com.vk.libvideo.api.ad.AdsDataProvider
    public final String getDescription() {
        return this.d;
    }

    @Override // com.vk.libvideo.api.ad.AdsDataProvider
    public final int getDuration() {
        return this.h;
    }

    @Override // com.vk.libvideo.api.ad.AdsDataProvider
    public final String getMessage() {
        return this.f;
    }

    @Override // com.vk.libvideo.api.ad.AdsDataProvider
    public final Owner s() {
        return this.c;
    }

    public ShittyAdsDtoProvider(Serializer serializer) {
        this.b = (ShitAttachment) serializer.G(ShitAttachment.class.getClassLoader());
        this.c = (Owner) serializer.G(Owner.class.getClassLoader());
        this.d = serializer.H();
        this.e = serializer.u();
        this.f = serializer.H();
        this.g = serializer.H();
        this.h = serializer.u();
    }
}
