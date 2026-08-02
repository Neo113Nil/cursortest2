package com.vk.attachpicker.stat.data;

import androidx.room.RoomDatabase;
import com.vk.attachpicker.stat.data.GraffityParamsEntity;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.fdu;
import xsna.fqa;
import xsna.qyg0;
import xsna.u370;
import xsna.z5a;

/* compiled from: GraffityParamsDao_Impl.kt */
/* loaded from: classes15.dex */
public final class a implements fdu {
    public final RoomDatabase a;
    public final C0392a b = new C0392a();

    /* compiled from: GraffityParamsDao_Impl.kt */
    /* renamed from: com.vk.attachpicker.stat.data.a$a, reason: collision with other inner class name */
    public static final class C0392a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            GraffityParamsEntity graffityParamsEntity = (GraffityParamsEntity) obj;
            if (graffityParamsEntity.a == null) {
                qyg0Var.bindNull(1);
            } else {
                qyg0Var.bindLong(1, r0.intValue());
            }
            qyg0Var.bindLong(2, graffityParamsEntity.b);
            qyg0Var.bindLong(3, graffityParamsEntity.c);
            qyg0Var.bindLong(4, graffityParamsEntity.d);
            int i = b.$EnumSwitchMapping$0[graffityParamsEntity.e.ordinal()];
            if (i == 1) {
                str = "Pen";
            } else if (i == 2) {
                str = "Arrow";
            } else if (i == 3) {
                str = "Marker";
            } else if (i == 4) {
                str = "Glow";
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "Eraser";
            }
            qyg0Var.D3(5, str);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR ABORT INTO `graffity_params` (`id`,`photoId`,`size`,`color`,`brushType`) VALUES (?,?,?,?,?)";
        }
    }

    /* compiled from: GraffityParamsDao_Impl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GraffityParamsEntity.BrushType.values().length];
            try {
                iArr[GraffityParamsEntity.BrushType.Pen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraffityParamsEntity.BrushType.Arrow.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraffityParamsEntity.BrushType.Marker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GraffityParamsEntity.BrushType.Glow.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GraffityParamsEntity.BrushType.Eraser.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.fdu
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new z5a(12, this, arrayList));
    }
}
