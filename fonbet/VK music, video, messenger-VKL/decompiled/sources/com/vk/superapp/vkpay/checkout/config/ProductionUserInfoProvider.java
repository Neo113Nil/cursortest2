package com.vk.superapp.vkpay.checkout.config;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.e370;
import xsna.pgn0;
import xsna.wdx0;

/* compiled from: ProductionUserInfoProvider.kt */
/* loaded from: classes6.dex */
public final class ProductionUserInfoProvider implements UserInfoProvider {
    public static final Serializer.c<ProductionUserInfoProvider> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProductionUserInfoProvider> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProductionUserInfoProvider a(Serializer serializer) {
            return new ProductionUserInfoProvider();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductionUserInfoProvider[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.vkpay.checkout.config.UserInfoProvider
    public final UserId getUserId() {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i = pgn0.a.a;
        return wdx0Var.c().b;
    }

    @Override // com.vk.superapp.vkpay.checkout.config.UserInfoProvider
    public final String qb() {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        return wdx0Var.g();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
