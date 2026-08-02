package com.vk.attachpicker.stat.data;

import androidx.room.RoomDatabase;
import com.vk.attachpicker.stat.data.TextParamsEntity;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.fqa;
import xsna.gko0;
import xsna.jp5;
import xsna.qyg0;
import xsna.u370;

/* compiled from: TextParamsDao_Impl.kt */
/* loaded from: classes15.dex */
public final class d implements gko0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: TextParamsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            TextParamsEntity textParamsEntity = (TextParamsEntity) obj;
            if (textParamsEntity.a == null) {
                qyg0Var.bindNull(1);
            } else {
                qyg0Var.bindLong(1, r0.intValue());
            }
            qyg0Var.bindLong(2, textParamsEntity.b);
            qyg0Var.bindLong(3, textParamsEntity.c);
            int i = b.$EnumSwitchMapping$0[textParamsEntity.d.ordinal()];
            if (i == 1) {
                str = "Start";
            } else if (i == 2) {
                str = "Center";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "End";
            }
            qyg0Var.D3(4, str);
            qyg0Var.D3(5, textParamsEntity.e);
            qyg0Var.D3(6, textParamsEntity.f);
            qyg0Var.bindLong(7, textParamsEntity.g);
            qyg0Var.bindLong(8, textParamsEntity.h);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR ABORT INTO `text_params` (`id`,`photoId`,`size`,`align`,`text`,`font`,`textColor`,`backgroundColor`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: TextParamsDao_Impl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextParamsEntity.Align.values().length];
            try {
                iArr[TextParamsEntity.Align.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextParamsEntity.Align.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextParamsEntity.Align.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.gko0
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new jp5(25, this, arrayList));
    }
}
