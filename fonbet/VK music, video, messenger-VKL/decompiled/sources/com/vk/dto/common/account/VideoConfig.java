package com.vk.dto.common.account;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;
import xsna.asp;
import xsna.bh10;
import xsna.bxx;
import xsna.f370;
import xsna.lhg;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoConfig.kt */
/* loaded from: classes18.dex */
public final class VideoConfig extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoConfig> CREATOR = new b();
    public final int b;
    public final PlayerType c;
    public final long d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoConfig.kt */
    public static final class PlayerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PlayerType[] $VALUES;
        public static final a Companion;
        public static final PlayerType EXO;
        public static final PlayerType NATIVE;
        public static final PlayerType SYSTEM;
        private static final PlayerType[] VALUES;
        private final int id;

        /* compiled from: VideoConfig.kt */
        public static final class a {
            public static PlayerType a(int i) {
                for (PlayerType playerType : PlayerType.VALUES) {
                    if (playerType.i() == i) {
                        return playerType;
                    }
                }
                return null;
            }
        }

        static {
            PlayerType playerType = new PlayerType("EXO", 0, 0);
            EXO = playerType;
            PlayerType playerType2 = new PlayerType("SYSTEM", 1, 1);
            SYSTEM = playerType2;
            PlayerType playerType3 = new PlayerType("NATIVE", 2, 2);
            NATIVE = playerType3;
            PlayerType[] playerTypeArr = {playerType, playerType2, playerType3};
            $VALUES = playerTypeArr;
            $ENTRIES = new asp(playerTypeArr);
            Companion = new a();
            VALUES = values();
        }

        public PlayerType(String str, int i, int i2) {
            this.id = i2;
        }

        public static PlayerType valueOf(String str) {
            return (PlayerType) Enum.valueOf(PlayerType.class, str);
        }

        public static PlayerType[] values() {
            return (PlayerType[]) $VALUES.clone();
        }

        public final int i() {
            return this.id;
        }
    }

    /* compiled from: VideoConfig.kt */
    public static final class a {
        public static VideoConfig a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new VideoConfig(jSONObject, (zcl) null);
            }
            return new VideoConfig(0, null, 0L, false, false, 31, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoConfig a(Serializer serializer) {
            return new VideoConfig(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoConfig[i];
        }
    }

    public VideoConfig() {
        this(0, null, 0L, false, false, 31, null);
    }

    public final boolean Ab() {
        return this.f;
    }

    public final void Bb(boolean z) {
        this.e = z;
    }

    public final void Cb(boolean z) {
        this.f = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.i());
        serializer.Y(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("player_pool_size", this.b);
        jSONObject.put("playerType", this.c.i());
        jSONObject.put("videoAutoPlayAvailable", this.e);
        jSONObject.put("videoDiscover", this.f);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoConfig)) {
            return false;
        }
        VideoConfig videoConfig = (VideoConfig) obj;
        return this.b == videoConfig.b && this.c == videoConfig.c && this.d == videoConfig.d && this.e == videoConfig.e && this.f == videoConfig.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(bh10.a((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConfig(poolSize=");
        sb.append(this.b);
        sb.append(", playerType=");
        sb.append(this.c);
        sb.append(", playerDecoderConfig=");
        sb.append(this.d);
        sb.append(", mediaAutoPlayAvailable=");
        sb.append(this.e);
        sb.append(", videoDiscover=");
        return q0.a(sb, this.f, ')');
    }

    public final boolean zb() {
        return this.e;
    }

    public /* synthetic */ VideoConfig(int i, PlayerType playerType, long j, boolean z, boolean z2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? PlayerType.EXO : playerType, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2);
    }

    public VideoConfig(int i, PlayerType playerType, long j, boolean z, boolean z2) {
        this.b = i;
        this.c = playerType;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoConfig(Serializer serializer, zcl zclVar) {
        this(r1, r2, serializer.w(), serializer.m(), serializer.m());
        int u = serializer.u();
        PlayerType.a aVar = PlayerType.Companion;
        int u2 = serializer.u();
        aVar.getClass();
        PlayerType a2 = PlayerType.a.a(u2);
        if (a2 != null) {
            return;
        }
        throw new IllegalArgumentException(lhg.a(u2, "Illegal id value: "));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoConfig(JSONObject jSONObject, zcl zclVar) {
        this(r2, r10 == null ? PlayerType.EXO : r10, jSONObject.has("player_decoder_config") ? jSONObject.getLong("player_decoder_config") : 0L, jSONObject.has("videoAutoPlayAvailable") ? jSONObject.getBoolean("videoAutoPlayAvailable") : false, jSONObject.has("videoDiscover") ? jSONObject.getBoolean("videoDiscover") : true);
        int w = f370.w(jSONObject, -1, "player_pool_size");
        PlayerType.a aVar = PlayerType.Companion;
        int i = jSONObject.has("player_type") ? jSONObject.getInt("player_type") : 0;
        aVar.getClass();
        PlayerType a2 = PlayerType.a.a(i);
    }
}
