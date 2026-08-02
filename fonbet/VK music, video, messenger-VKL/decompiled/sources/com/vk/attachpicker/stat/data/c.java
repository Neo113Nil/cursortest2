package com.vk.attachpicker.stat.data;

import androidx.room.RoomDatabase;
import com.vk.attachpicker.stat.data.StickerParamsEntity;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.fqa;
import xsna.mu1;
import xsna.qyg0;
import xsna.r5l0;
import xsna.u370;

/* compiled from: StickerParamsDao_Impl.kt */
/* loaded from: classes15.dex */
public final class c implements r5l0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StickerParamsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            StickerParamsEntity stickerParamsEntity = (StickerParamsEntity) obj;
            if (stickerParamsEntity.a == null) {
                qyg0Var.bindNull(1);
            } else {
                qyg0Var.bindLong(1, r0.intValue());
            }
            qyg0Var.bindLong(2, stickerParamsEntity.b);
            switch (b.$EnumSwitchMapping$0[stickerParamsEntity.c.ordinal()]) {
                case 1:
                    str = "Individual";
                    break;
                case 2:
                    str = "FromPack";
                    break;
                case 3:
                    str = "Animated";
                    break;
                case 4:
                    str = "GIF";
                    break;
                case 5:
                    str = "Vimoji";
                    break;
                case 6:
                    str = "Emoji";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            qyg0Var.D3(3, str);
            if (stickerParamsEntity.d == null) {
                qyg0Var.bindNull(4);
            } else {
                qyg0Var.bindLong(4, r0.intValue());
            }
            Long l = stickerParamsEntity.e;
            if (l == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.bindLong(5, l.longValue());
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR ABORT INTO `sticker_params` (`id`,`photoId`,`type`,`stickerId`,`packId`) VALUES (?,?,?,?,?)";
        }
    }

    /* compiled from: StickerParamsDao_Impl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerParamsEntity.Type.values().length];
            try {
                iArr[StickerParamsEntity.Type.Individual.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerParamsEntity.Type.FromPack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerParamsEntity.Type.Animated.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerParamsEntity.Type.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StickerParamsEntity.Type.Vimoji.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StickerParamsEntity.Type.Emoji.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.r5l0
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new mu1(28, this, arrayList));
    }
}
