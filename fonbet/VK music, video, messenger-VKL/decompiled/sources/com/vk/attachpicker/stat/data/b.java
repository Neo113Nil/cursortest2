package com.vk.attachpicker.stat.data;

import androidx.room.RoomDatabase;
import com.vk.attachpicker.stat.data.GraffityParamsEntity;
import com.vk.attachpicker.stat.data.PhotoParamsEntity;
import com.vk.attachpicker.stat.data.StickerParamsEntity;
import com.vk.attachpicker.stat.data.TextParamsEntity;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import xsna.az2;
import xsna.bqt;
import xsna.e370;
import xsna.egi;
import xsna.fqa;
import xsna.fto0;
import xsna.fw3;
import xsna.hyg0;
import xsna.iaa0;
import xsna.ij8;
import xsna.ng3;
import xsna.oaa0;
import xsna.qt5;
import xsna.qyg0;
import xsna.r45;
import xsna.r770;
import xsna.u370;
import xsna.x500;

/* compiled from: PhotoParamsDao_Impl.kt */
/* loaded from: classes15.dex */
public final class b implements iaa0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PhotoParamsDao_Impl.kt */
    public static final class a extends fqa {
        /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
        @Override // xsna.fqa
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            String jSONArray;
            List<Float> list;
            PhotoParamsEntity photoParamsEntity = (PhotoParamsEntity) obj;
            if (photoParamsEntity.a == null) {
                qyg0Var.bindNull(1);
            } else {
                qyg0Var.bindLong(1, r0.intValue());
            }
            qyg0Var.D3(2, photoParamsEntity.b);
            qyg0Var.D3(3, photoParamsEntity.c);
            qyg0Var.bindLong(4, photoParamsEntity.d ? 1L : 0L);
            qyg0Var.bindLong(5, photoParamsEntity.e ? 1L : 0L);
            qyg0Var.bindLong(6, photoParamsEntity.f ? 1L : 0L);
            qyg0Var.bindLong(7, photoParamsEntity.g ? 1L : 0L);
            qyg0Var.bindLong(8, photoParamsEntity.h ? 1L : 0L);
            qyg0Var.bindLong(9, photoParamsEntity.i ? 1L : 0L);
            if (photoParamsEntity.j == null) {
                qyg0Var.bindNull(10);
            } else {
                qyg0Var.bindLong(10, r0.intValue());
            }
            if (photoParamsEntity.k == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.bindLong(11, r0.intValue());
            }
            qyg0Var.bindLong(12, photoParamsEntity.l ? 1L : 0L);
            if (photoParamsEntity.m == null) {
                qyg0Var.bindNull(13);
            } else {
                qyg0Var.bindLong(13, r0.intValue());
            }
            qyg0Var.bindLong(14, photoParamsEntity.n ? 1L : 0L);
            String str2 = photoParamsEntity.o;
            if (str2 == null) {
                qyg0Var.bindNull(15);
            } else {
                qyg0Var.D3(15, str2);
            }
            if (photoParamsEntity.p == null) {
                qyg0Var.bindNull(16);
            } else {
                qyg0Var.bindLong(16, r0.intValue());
            }
            PhotoParamsEntity.Ratio ratio = photoParamsEntity.q;
            if (ratio == null) {
                qyg0Var.bindNull(17);
            } else {
                switch (C0393b.$EnumSwitchMapping$0[ratio.ordinal()]) {
                    case 1:
                        str = "CropOriginal";
                        break;
                    case 2:
                        str = "CropFree";
                        break;
                    case 3:
                        str = "CropSquare";
                        break;
                    case 4:
                        str = "Crop3X4";
                        break;
                    case 5:
                        str = "Crop4X3";
                        break;
                    case 6:
                        str = "Crop16X9";
                        break;
                    case 7:
                        str = "Crop9X16";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                qyg0Var.D3(17, str);
            }
            qyg0Var.bindLong(18, photoParamsEntity.r);
            qyg0Var.bindLong(19, photoParamsEntity.s);
            String str3 = photoParamsEntity.t;
            if (str3 == null) {
                qyg0Var.bindNull(20);
            } else {
                qyg0Var.D3(20, str3);
            }
            if (photoParamsEntity.u == null) {
                qyg0Var.bindNull(21);
            } else {
                qyg0Var.bindLong(21, r0.intValue());
            }
            if (photoParamsEntity.v == null) {
                qyg0Var.bindNull(22);
            } else {
                qyg0Var.bindLong(22, r0.intValue());
            }
            String str4 = photoParamsEntity.w;
            if (str4 == null) {
                qyg0Var.bindNull(23);
            } else {
                qyg0Var.D3(23, str4);
            }
            List<String> list2 = photoParamsEntity.x;
            String str5 = null;
            if (list2 != null) {
                try {
                    jSONArray = new JSONArray((Collection) list2).toString();
                } catch (JSONException unused) {
                }
                if (jSONArray != null) {
                    qyg0Var.bindNull(24);
                } else {
                    qyg0Var.D3(24, jSONArray);
                }
                list = photoParamsEntity.y;
                if (list != null) {
                    try {
                        str5 = new JSONArray((Collection) list).toString();
                    } catch (JSONException unused2) {
                    }
                }
                if (str5 != null) {
                    qyg0Var.bindNull(25);
                } else {
                    qyg0Var.D3(25, str5);
                }
                qyg0Var.bindLong(26, photoParamsEntity.z ? 1L : 0L);
            }
            jSONArray = null;
            if (jSONArray != null) {
            }
            list = photoParamsEntity.y;
            if (list != null) {
            }
            if (str5 != null) {
            }
            qyg0Var.bindLong(26, photoParamsEntity.z ? 1L : 0L);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR ABORT INTO `photo_params` (`id`,`media_key`,`create_entry_point`,`isCropped`,`isRotated`,`isZoomed`,`hasGraffity`,`hasSticker`,`hasText`,`zoomValue`,`rotation`,`isAutocorrected`,`autocorrectionValue`,`hasFilter`,`filter`,`filterValue`,`ratio`,`height`,`width`,`collageGrid`,`collageBorderWidth`,`collageCornerRadius`,`collageBorderColor`,`colorGradingParams`,`colorGradingValues`,`isUpgraded`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: PhotoParamsDao_Impl.kt */
    /* renamed from: com.vk.attachpicker.stat.data.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0393b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoParamsEntity.Ratio.values().length];
            try {
                iArr[PhotoParamsEntity.Ratio.CropOriginal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoParamsEntity.Ratio.CropFree.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhotoParamsEntity.Ratio.CropSquare.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhotoParamsEntity.Ratio.Crop3X4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PhotoParamsEntity.Ratio.Crop4X3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PhotoParamsEntity.Ratio.Crop16X9.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PhotoParamsEntity.Ratio.Crop9X16.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static TextParamsEntity.Align d(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 69819) {
            if (hashCode != 80204866) {
                if (hashCode == 2014820469 && str.equals("Center")) {
                    return TextParamsEntity.Align.Center;
                }
            } else if (str.equals("Start")) {
                return TextParamsEntity.Align.Start;
            }
        } else if (str.equals("End")) {
            return TextParamsEntity.Align.End;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static GraffityParamsEntity.BrushType e(String str) {
        switch (str.hashCode()) {
            case -1997438886:
                if (str.equals("Marker")) {
                    return GraffityParamsEntity.BrushType.Marker;
                }
                break;
            case 80121:
                if (str.equals("Pen")) {
                    return GraffityParamsEntity.BrushType.Pen;
                }
                break;
            case 2222509:
                if (str.equals("Glow")) {
                    return GraffityParamsEntity.BrushType.Glow;
                }
                break;
            case 63538153:
                if (str.equals("Arrow")) {
                    return GraffityParamsEntity.BrushType.Arrow;
                }
                break;
            case 2083696300:
                if (str.equals("Eraser")) {
                    return GraffityParamsEntity.BrushType.Eraser;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static PhotoParamsEntity.Ratio f(String str) {
        switch (str.hashCode()) {
            case -2111802762:
                if (str.equals("Crop16X9")) {
                    return PhotoParamsEntity.Ratio.Crop16X9;
                }
                break;
            case -2111532972:
                if (str.equals("Crop9X16")) {
                    return PhotoParamsEntity.Ratio.Crop9X16;
                }
                break;
            case -2111119044:
                if (str.equals("CropFree")) {
                    return PhotoParamsEntity.Ratio.CropFree;
                }
                break;
            case -1592140385:
                if (str.equals("Crop3X4")) {
                    return PhotoParamsEntity.Ratio.Crop3X4;
                }
                break;
            case -1592139425:
                if (str.equals("Crop4X3")) {
                    return PhotoParamsEntity.Ratio.Crop4X3;
                }
                break;
            case -1189105683:
                if (str.equals("CropSquare")) {
                    return PhotoParamsEntity.Ratio.CropSquare;
                }
                break;
            case 1898671265:
                if (str.equals("CropOriginal")) {
                    return PhotoParamsEntity.Ratio.CropOriginal;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static StickerParamsEntity.Type g(String str) {
        switch (str.hashCode()) {
            case -1732533324:
                if (str.equals("Vimoji")) {
                    return StickerParamsEntity.Type.Vimoji;
                }
                break;
            case -1180144381:
                if (str.equals("FromPack")) {
                    return StickerParamsEntity.Type.FromPack;
                }
                break;
            case -730559037:
                if (str.equals("Animated")) {
                    return StickerParamsEntity.Type.Animated;
                }
                break;
            case 70564:
                if (str.equals("GIF")) {
                    return StickerParamsEntity.Type.GIF;
                }
                break;
            case 67080230:
                if (str.equals("Emoji")) {
                    return StickerParamsEntity.Type.Emoji;
                }
                break;
            case 1947172537:
                if (str.equals("Individual")) {
                    return StickerParamsEntity.Type.Individual;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    @Override // xsna.iaa0
    public final void a() {
        u370.f(this.a, false, true, new bqt(17));
    }

    @Override // xsna.iaa0
    public final long b(PhotoParamsEntity photoParamsEntity) {
        return ((Number) u370.f(this.a, false, true, new ng3(29, this, photoParamsEntity))).longValue();
    }

    @Override // xsna.iaa0
    public final oaa0 c(String str) {
        return (oaa0) u370.f(this.a, true, true, new az2(26, str, this));
    }

    public final void h(hyg0 hyg0Var, x500<List<GraffityParamsEntity>> x500Var) {
        if (x500Var.isEmpty()) {
            return;
        }
        if (x500Var.size() > 999) {
            fto0.r(x500Var, new ij8(24, this, hyg0Var));
            return;
        }
        StringBuilder e = fw3.e("SELECT `id`,`photoId`,`size`,`color`,`brushType` FROM `graffity_params` WHERE `photoId` IN (");
        e370.c(x500Var.size(), e);
        e.append(")");
        qyg0 V0 = hyg0Var.V0(e.toString());
        int size = x500Var.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            V0.bindLong(i, x500Var.keyAt(i2));
            i++;
        }
        try {
            int h = egi.h(V0, "photoId");
            if (h == -1) {
                V0.close();
                return;
            }
            while (V0.step()) {
                List<GraffityParamsEntity> list = x500Var.get(V0.getLong(h));
                if (list != null) {
                    list.add(new GraffityParamsEntity(V0.isNull(0) ? null : Integer.valueOf((int) V0.getLong(0)), (int) V0.getLong(1), (int) V0.getLong(2), (int) V0.getLong(3), e(V0.l2(4))));
                }
            }
        } finally {
            V0.close();
        }
    }

    public final void i(hyg0 hyg0Var, x500<List<StickerParamsEntity>> x500Var) {
        if (x500Var.isEmpty()) {
            return;
        }
        if (x500Var.size() > 999) {
            fto0.r(x500Var, new qt5(21, this, hyg0Var));
            return;
        }
        StringBuilder e = fw3.e("SELECT `id`,`photoId`,`type`,`stickerId`,`packId` FROM `sticker_params` WHERE `photoId` IN (");
        e370.c(x500Var.size(), e);
        e.append(")");
        qyg0 V0 = hyg0Var.V0(e.toString());
        int size = x500Var.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            V0.bindLong(i, x500Var.keyAt(i2));
            i++;
        }
        try {
            int h = egi.h(V0, "photoId");
            if (h == -1) {
                V0.close();
                return;
            }
            while (V0.step()) {
                List<StickerParamsEntity> list = x500Var.get(V0.getLong(h));
                if (list != null) {
                    list.add(new StickerParamsEntity(V0.isNull(0) ? null : Integer.valueOf((int) V0.getLong(0)), (int) V0.getLong(1), g(V0.l2(2)), V0.isNull(3) ? null : Integer.valueOf((int) V0.getLong(3)), V0.isNull(4) ? null : Long.valueOf(V0.getLong(4))));
                }
            }
        } finally {
            V0.close();
        }
    }

    public final void j(hyg0 hyg0Var, x500<List<TextParamsEntity>> x500Var) {
        if (x500Var.isEmpty()) {
            return;
        }
        if (x500Var.size() > 999) {
            fto0.r(x500Var, new r770(2, this, hyg0Var));
            return;
        }
        StringBuilder e = fw3.e("SELECT `id`,`photoId`,`size`,`align`,`text`,`font`,`textColor`,`backgroundColor` FROM `text_params` WHERE `photoId` IN (");
        e370.c(x500Var.size(), e);
        e.append(")");
        qyg0 V0 = hyg0Var.V0(e.toString());
        int size = x500Var.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            V0.bindLong(i, x500Var.keyAt(i2));
            i++;
        }
        try {
            int h = egi.h(V0, "photoId");
            if (h == -1) {
                return;
            }
            while (V0.step()) {
                List<TextParamsEntity> list = x500Var.get(V0.getLong(h));
                if (list != null) {
                    list.add(new TextParamsEntity(V0.isNull(0) ? null : Integer.valueOf((int) V0.getLong(0)), (int) V0.getLong(1), (int) V0.getLong(2), d(V0.l2(3)), V0.l2(4), V0.l2(5), (int) V0.getLong(6), (int) V0.getLong(7)));
                }
            }
        } finally {
            V0.close();
        }
    }

    @Override // xsna.iaa0
    public final void remove(String str) {
        u370.f(this.a, false, true, new r45(str, 2));
    }
}
