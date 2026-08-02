package com.vk.fullscreenbanners.api.dto.blocks.button;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.fullscreenbanners.api.dto.FullScreenBannerButtonBlock;
import org.json.JSONObject;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: OpenUrlButtonFullScreenBannerBlock.kt */
/* loaded from: classes16.dex */
public final class OpenUrlButtonFullScreenBannerBlock extends FullScreenBannerButtonBlock {
    public static final Serializer.c<OpenUrlButtonFullScreenBannerBlock> CREATOR = new a();
    public final String e;
    public final ActionOpenUrl f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<OpenUrlButtonFullScreenBannerBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OpenUrlButtonFullScreenBannerBlock a(Serializer serializer) {
            return new OpenUrlButtonFullScreenBannerBlock(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenUrlButtonFullScreenBannerBlock[i];
        }
    }

    public OpenUrlButtonFullScreenBannerBlock(String str, ActionOpenUrl actionOpenUrl, String str2) {
        this.e = str;
        this.f = actionOpenUrl;
        this.g = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.e, "title");
        w9yVar.e(ActionOpenUrl.e, "action");
        w9yVar.e(this.g, "consume_reason");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenUrlButtonFullScreenBannerBlock(Serializer serializer) {
        this(r0, r2, r4 != null ? r4 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        ActionOpenUrl actionOpenUrl = (ActionOpenUrl) serializer.G(ActionOpenUrl.class.getClassLoader());
        String H2 = serializer.H();
    }
}
