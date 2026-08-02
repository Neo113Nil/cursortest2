package com.vk.dto.polls;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import com.vk.stickers.api.styles.StickerCommonStyle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PollBackgrounds.kt */
/* loaded from: classes18.dex */
public final class PollContentColor extends PollBackground {
    public static final Serializer.c<PollContentColor> CREATOR = new a();
    public final StickerCommonStyle d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PollContentColor> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PollContentColor a(Serializer serializer) {
            return new PollContentColor(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollContentColor[i];
        }
    }

    public PollContentColor(int i, int i2, StickerCommonStyle stickerCommonStyle) {
        super(i, i2, null);
        this.d = stickerCommonStyle;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.g0(this.d);
    }

    @Override // com.vk.dto.polls.PollBackground, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        try {
            e5.put(TtmlNode.TAG_STYLE, this.d.i());
            return e5;
        } catch (JSONException e) {
            L.i(e);
            return e5;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PollContentColor(int i, int i2, String str) {
        this(i, i2, StickerCommonStyle.a.a(str, r1));
        StickerCommonStyle.a aVar = StickerCommonStyle.Companion;
        StickerCommonStyle stickerCommonStyle = StickerCommonStyle.DARK;
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PollContentColor(Serializer serializer) {
        this(r0, r1, r3 == null ? StickerCommonStyle.DARK : r3);
        int u = serializer.u();
        int u2 = serializer.u();
        StickerCommonStyle stickerCommonStyle = (StickerCommonStyle) serializer.C();
    }
}
