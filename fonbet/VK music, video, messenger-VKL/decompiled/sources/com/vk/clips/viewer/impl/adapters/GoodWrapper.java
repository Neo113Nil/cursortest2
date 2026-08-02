package com.vk.clips.viewer.impl.adapters;

import com.vk.clips.sdk.shared.api.deps.Price;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGood;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.gzs;
import xsna.qcy;
import xsna.xn4;

/* compiled from: GoodAdapter.kt */
/* loaded from: classes17.dex */
final class GoodWrapper extends Serializer.StreamParcelableAdapter implements SdkGood {
    public static final Serializer.c<GoodWrapper> CREATOR;
    public static final /* synthetic */ qcy<Object>[] d;
    public final Good b;
    public final xn4 c = new xn4(new gzs() { // from class: com.vk.clips.viewer.impl.adapters.c
        @Override // xsna.gzs
        public final Object invoke() {
            return GoodWrapper.this.b.h;
        }
    }, new d());

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GoodWrapper> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GoodWrapper a(Serializer serializer) {
            return new GoodWrapper((Good) serializer.G(Good.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GoodWrapper[i];
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GoodWrapper.class, "price", "getPrice()Lcom/vk/clips/sdk/shared/api/deps/Price;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
        CREATOR = new a();
    }

    public GoodWrapper(Good good) {
        this.b = good;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    @Override // com.vk.clips.sdk.shared.api.deps.dtos.SdkGood
    public final boolean P3() {
        return this.b.V;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return this.b.e5();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.dtos.SdkGood
    public final Price getPrice() {
        qcy<Object> qcyVar = d[0];
        return (Price) this.c.b();
    }

    @Override // com.vk.clips.sdk.shared.api.deps.dtos.SdkGood
    public final String getTitle() {
        return this.b.d;
    }
}
