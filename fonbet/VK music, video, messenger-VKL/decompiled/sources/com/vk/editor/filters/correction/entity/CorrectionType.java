package com.vk.editor.filters.correction.entity;

import com.vk.dto.clips.filters.CorrectionsInfo;
import com.vkontakte.android.R;
import xsna.ad0;
import xsna.asp;
import xsna.ixd;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CorrectionType.kt */
/* loaded from: classes18.dex */
public abstract class CorrectionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CorrectionType[] $VALUES;
    public static final CorrectionType Blur;
    public static final CorrectionType Brightness;
    public static final CorrectionType Contrast;
    public static final CorrectionType Exposition;
    public static final CorrectionType Grain;
    public static final CorrectionType Heat;
    public static final CorrectionType Highlight;
    public static final CorrectionType Saturation;
    public static final CorrectionType Shadow;
    public static final CorrectionType Sharpness;
    private final boolean hide;
    private final int icon;
    private final IntensityMode intensityMode;
    private final int title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorrectionType.kt */
    public static final class IntensityMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IntensityMode[] $VALUES;
        public static final IntensityMode FromCenter;
        public static final IntensityMode FromZero;

        static {
            IntensityMode intensityMode = new IntensityMode("FromZero", 0);
            FromZero = intensityMode;
            IntensityMode intensityMode2 = new IntensityMode("FromCenter", 1);
            FromCenter = intensityMode2;
            IntensityMode[] intensityModeArr = {intensityMode, intensityMode2};
            $VALUES = intensityModeArr;
            $ENTRIES = new asp(intensityModeArr);
        }

        public IntensityMode() {
            throw null;
        }

        public static IntensityMode valueOf(String str) {
            return (IntensityMode) Enum.valueOf(IntensityMode.class, str);
        }

        public static IntensityMode[] values() {
            return (IntensityMode[]) $VALUES.clone();
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class a extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.k;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class b extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.c;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class c extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.d;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class d extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.b;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class e extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.j;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class f extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.f;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class g extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.h;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class h extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.e;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class i extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.g;
        }
    }

    /* compiled from: CorrectionType.kt */
    public static final class j extends CorrectionType {
        @Override // com.vk.editor.filters.correction.entity.CorrectionType
        public final float k(CorrectionsInfo correctionsInfo) {
            return correctionsInfo.i;
        }
    }

    static {
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        d dVar = new d("Exposition", 0, R.string.correction_exposition, R.drawable.vk_icon_exposition_outline_24, null, 12);
        Exposition = dVar;
        ixd ixdVar2 = ad0.g;
        ixd.b bVar2 = (ixdVar2 == null ? null : ixdVar2).a;
        b bVar3 = new b("Brightness", 1, R.string.correction_brightness, R.drawable.vk_icon_sun_outline_28, null, 12);
        Brightness = bVar3;
        ixd ixdVar3 = ad0.g;
        ixd.b bVar4 = (ixdVar3 == null ? null : ixdVar3).a;
        c cVar = new c("Contrast", 2, R.string.correction_contrast, R.drawable.vk_icon_contrast_outline_24, null, 12);
        Contrast = cVar;
        ixd ixdVar4 = ad0.g;
        ixd.b bVar5 = (ixdVar4 == null ? null : ixdVar4).a;
        h hVar = new h("Saturation", 3, R.string.correction_saturation, R.drawable.vk_icon_water_drop_outline_28, null, 12);
        Saturation = hVar;
        ixd ixdVar5 = ad0.g;
        ixd.b bVar6 = (ixdVar5 == null ? null : ixdVar5).a;
        f fVar = new f("Heat", 4, R.string.correction_heat, R.drawable.vk_icon_thermometer_outline_24, null, 12);
        Heat = fVar;
        ixd ixdVar6 = ad0.g;
        ixd.b bVar7 = (ixdVar6 == null ? null : ixdVar6).a;
        IntensityMode intensityMode = IntensityMode.FromZero;
        i iVar = new i("Shadow", 5, R.string.correction_shadow, R.drawable.vk_icon_shadows_outline_24, intensityMode, 4);
        Shadow = iVar;
        ixd ixdVar7 = ad0.g;
        ixd.b bVar8 = (ixdVar7 == null ? null : ixdVar7).a;
        g gVar = new g("Highlight", 6, R.string.correction_glare, R.drawable.vk_icon_highlights_outline_24, intensityMode, 4);
        Highlight = gVar;
        ixd ixdVar8 = ad0.g;
        ixd.b bVar9 = (ixdVar8 == null ? null : ixdVar8).a;
        j jVar = new j("Sharpness", 7, R.string.correction_sharpness, R.drawable.vk_icon_triangle_outline_24, null, 12);
        Sharpness = jVar;
        ixd ixdVar9 = ad0.g;
        ixd.b bVar10 = (ixdVar9 == null ? null : ixdVar9).a;
        e eVar = new e("Grain", 8, R.string.correction_grain, R.drawable.vk_icon_grain_outline_24, intensityMode, 4);
        Grain = eVar;
        ixd ixdVar10 = ad0.g;
        ixd.b bVar11 = (ixdVar10 != null ? ixdVar10 : null).a;
        a aVar = new a("Blur", 9, R.string.correction_blur, R.drawable.vk_icon_blur_outline_24, intensityMode, 4);
        Blur = aVar;
        CorrectionType[] correctionTypeArr = {dVar, bVar3, cVar, hVar, fVar, iVar, gVar, jVar, eVar, aVar};
        $VALUES = correctionTypeArr;
        $ENTRIES = new asp(correctionTypeArr);
    }

    public CorrectionType() {
        throw null;
    }

    public CorrectionType(String str, int i2, int i3, int i4, IntensityMode intensityMode, int i5) {
        intensityMode = (i5 & 8) != 0 ? IntensityMode.FromCenter : intensityMode;
        this.title = i3;
        this.icon = i4;
        this.hide = false;
        this.intensityMode = intensityMode;
    }

    public static zrp<CorrectionType> h() {
        return $ENTRIES;
    }

    public static CorrectionType valueOf(String str) {
        return (CorrectionType) Enum.valueOf(CorrectionType.class, str);
    }

    public static CorrectionType[] values() {
        return (CorrectionType[]) $VALUES.clone();
    }

    public final boolean i() {
        return this.hide;
    }

    public final int j() {
        return this.icon;
    }

    public abstract float k(CorrectionsInfo correctionsInfo);

    public final IntensityMode l() {
        return this.intensityMode;
    }

    public final int m() {
        return this.title;
    }
}
