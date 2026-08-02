package com.vk.stat.scheme;

import com.coremedia.iso.boxes.FreeBox;
import com.google.gson.Gson;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.cu20;
import xsna.du20;
import xsna.epx;
import xsna.eu20;
import xsna.fai;
import xsna.fu20;
import xsna.gu20;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tn;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$PhotoParams {
    public final transient String a;

    @pmi0("autocorrection_value")
    private final Integer autocorrectionValue;
    public final transient String b;

    @pmi0("blur_type")
    private final BlurType blurType;

    @pmi0("blur_value")
    private final Integer blurValue;

    @pmi0("collage_border_width")
    private final Integer collageBorderWidth;

    @pmi0("collage_corner_radius")
    private final Integer collageCornerRadius;

    @pmi0("collage_gradient")
    private final Boolean collageGradient;

    @pmi0("color_grading_params")
    private final List<String> colorGradingParams;

    @pmi0("color_grading_values")
    private final List<Float> colorGradingValues;

    @pmi0("filter")
    private final String filter;

    @pmi0("filter_value")
    private final Integer filterValue;

    @pmi0("collage_border_color")
    private final FilteredString filteredCollageBorderColor;

    @pmi0("collage_grid")
    private final FilteredString filteredCollageGrid;

    @pmi0("graffities")
    private final List<MobileOfficialAppsCorePhotoEditorStat$GraffityData> graffities;

    @pmi0("has_filter")
    private final Boolean hasFilter;

    @pmi0("has_graffity")
    private final Boolean hasGraffity;

    @pmi0("has_sticker")
    private final Boolean hasSticker;

    @pmi0("has_text")
    private final Boolean hasText;

    @pmi0("height")
    private final Integer height;

    @pmi0("is_autocorrected")
    private final Boolean isAutocorrected;

    @pmi0("is_cropped")
    private final Boolean isCropped;

    @pmi0("is_rotated")
    private final Boolean isRotated;

    @pmi0("is_upgraded")
    private final Boolean isUpgraded;

    @pmi0("is_zoomed")
    private final Boolean isZoomed;

    @pmi0("parent_filter")
    private final String parentFilter;

    @pmi0("position_in_parent_filter")
    private final Integer positionInParentFilter;

    @pmi0("ratio")
    private final Ratio ratio;

    @pmi0("rotation")
    private final Integer rotation;

    @pmi0("stickers")
    private final List<MobileOfficialAppsCorePhotoEditorStat$StickerData> stickers;

    @pmi0("texts")
    private final List<MobileOfficialAppsCorePhotoEditorStat$TextData> texts;

    @pmi0("width")
    private final Integer width;

    @pmi0("zoom_value")
    private final Long zoomValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
    /* loaded from: classes5.dex */
    public static final class BlurType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlurType[] $VALUES;

        @pmi0("for_all")
        public static final BlurType FOR_ALL;

        @pmi0("only_for_donuts")
        public static final BlurType ONLY_FOR_DONUTS;

        static {
            BlurType blurType = new BlurType("FOR_ALL", 0);
            FOR_ALL = blurType;
            BlurType blurType2 = new BlurType("ONLY_FOR_DONUTS", 1);
            ONLY_FOR_DONUTS = blurType2;
            BlurType[] blurTypeArr = {blurType, blurType2};
            $VALUES = blurTypeArr;
            $ENTRIES = new asp(blurTypeArr);
        }

        private BlurType(String str, int i) {
        }

        public static BlurType valueOf(String str) {
            return (BlurType) Enum.valueOf(BlurType.class, str);
        }

        public static BlurType[] values() {
            return (BlurType[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsCorePhotoEditorStat$PhotoParams>, a9y<MobileOfficialAppsCorePhotoEditorStat$PhotoParams> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Boolean y = fai.y(x9yVar, "is_cropped");
            Boolean y2 = fai.y(x9yVar, "is_rotated");
            Boolean y3 = fai.y(x9yVar, "is_zoomed");
            Long B = fai.B(x9yVar, "zoom_value");
            Integer A = fai.A(x9yVar, "rotation");
            Boolean y4 = fai.y(x9yVar, "is_autocorrected");
            Integer A2 = fai.A(x9yVar, "autocorrection_value");
            Boolean y5 = fai.y(x9yVar, "has_filter");
            String C = fai.C(x9yVar, "filter");
            String C2 = fai.C(x9yVar, "parent_filter");
            Integer A3 = fai.A(x9yVar, "position_in_parent_filter");
            Integer A4 = fai.A(x9yVar, "filter_value");
            Gson a = tru.a();
            b9y q = x9yVar.q("ratio");
            Object obj = null;
            Ratio ratio = (Ratio) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Ratio.class));
            Integer A5 = fai.A(x9yVar, "height");
            Integer A6 = fai.A(x9yVar, "width");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("blur_type");
            BlurType blurType = (BlurType) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), BlurType.class));
            Integer A7 = fai.A(x9yVar, "blur_value");
            String C3 = fai.C(x9yVar, "collage_grid");
            Integer A8 = fai.A(x9yVar, "collage_border_width");
            Integer A9 = fai.A(x9yVar, "collage_corner_radius");
            String C4 = fai.C(x9yVar, "collage_border_color");
            Boolean y6 = fai.y(x9yVar, "collage_gradient");
            Boolean y7 = fai.y(x9yVar, "has_text");
            Boolean y8 = fai.y(x9yVar, "has_sticker");
            Boolean y9 = fai.y(x9yVar, "has_graffity");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("graffities");
            List list = (List) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(x9yVar.q("graffities").k(), new cu20().getType()));
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("texts");
            List list2 = (List) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(x9yVar.q("texts").k(), new du20().getType()));
            Gson a5 = tru.a();
            b9y q5 = x9yVar.q("stickers");
            List list3 = (List) ((q5 == null || (q5 instanceof u9y)) ? null : a5.fromJson(x9yVar.q("stickers").k(), new eu20().getType()));
            Gson a6 = tru.a();
            b9y q6 = x9yVar.q("color_grading_params");
            List list4 = (List) ((q6 == null || (q6 instanceof u9y)) ? null : a6.fromJson(x9yVar.q("color_grading_params").k(), new fu20().getType()));
            Gson a7 = tru.a();
            b9y q7 = x9yVar.q("color_grading_values");
            if (q7 != null && !(q7 instanceof u9y)) {
                obj = a7.fromJson(x9yVar.q("color_grading_values").k(), new gu20().getType());
            }
            return new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(y, y2, y3, B, A, y4, A2, y5, C, C2, A3, A4, ratio, A5, A6, blurType, A7, C3, A8, A9, C4, y6, y7, y8, y9, list, list2, list3, list4, (List) obj, fai.y(x9yVar, "is_upgraded"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsCorePhotoEditorStat$PhotoParams mobileOfficialAppsCorePhotoEditorStat$PhotoParams = (MobileOfficialAppsCorePhotoEditorStat$PhotoParams) obj;
            x9y x9yVar = new x9y();
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.z(), "is_cropped");
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.A(), "is_rotated");
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.C(), "is_zoomed");
            x9yVar.n("zoom_value", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.x());
            x9yVar.n("rotation", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.t());
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.y(), "is_autocorrected");
            x9yVar.n("autocorrection_value", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.a());
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.l(), "has_filter");
            x9yVar.o("filter", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.i());
            x9yVar.o("parent_filter", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.q());
            x9yVar.n("position_in_parent_filter", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.r());
            x9yVar.n("filter_value", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.j());
            x9yVar.o("ratio", tru.a().toJson(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.s()));
            x9yVar.n("height", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.p());
            x9yVar.n("width", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.w());
            x9yVar.o("blur_type", tru.a().toJson(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.b()));
            x9yVar.n("blur_value", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.c());
            x9yVar.o("collage_grid", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.a);
            x9yVar.n("collage_border_width", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.d());
            x9yVar.n("collage_corner_radius", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.e());
            x9yVar.o("collage_border_color", mobileOfficialAppsCorePhotoEditorStat$PhotoParams.b);
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.f(), "collage_gradient");
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.o(), "has_text");
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.n(), "has_sticker");
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.m(), "has_graffity");
            x9yVar.o("graffities", tru.a().toJson(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.k()));
            x9yVar.o("texts", tru.a().toJson(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.v()));
            x9yVar.o("stickers", tru.a().toJson(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.u()));
            x9yVar.o("color_grading_params", tru.a().toJson(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.g()));
            x9yVar.o("color_grading_values", tru.a().toJson(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.h()));
            x9yVar.m(mobileOfficialAppsCorePhotoEditorStat$PhotoParams.B(), "is_upgraded");
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
    /* loaded from: classes5.dex */
    public static final class Ratio {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Ratio[] $VALUES;

        @pmi0("four_to_three")
        public static final Ratio FOUR_TO_THREE;

        @pmi0(FreeBox.TYPE)
        public static final Ratio FREE;

        @pmi0("nine_to_sixteen")
        public static final Ratio NINE_TO_SIXTEEN;

        @pmi0("one_to_one")
        public static final Ratio ONE_TO_ONE;

        @pmi0("original")
        public static final Ratio ORIGINAL;

        @pmi0("sixteen_to_nine")
        public static final Ratio SIXTEEN_TO_NINE;

        @pmi0("three_to_four")
        public static final Ratio THREE_TO_FOUR;

        static {
            Ratio ratio = new Ratio("ORIGINAL", 0);
            ORIGINAL = ratio;
            Ratio ratio2 = new Ratio("FREE", 1);
            FREE = ratio2;
            Ratio ratio3 = new Ratio("SIXTEEN_TO_NINE", 2);
            SIXTEEN_TO_NINE = ratio3;
            Ratio ratio4 = new Ratio("NINE_TO_SIXTEEN", 3);
            NINE_TO_SIXTEEN = ratio4;
            Ratio ratio5 = new Ratio("FOUR_TO_THREE", 4);
            FOUR_TO_THREE = ratio5;
            Ratio ratio6 = new Ratio("THREE_TO_FOUR", 5);
            THREE_TO_FOUR = ratio6;
            Ratio ratio7 = new Ratio("ONE_TO_ONE", 6);
            ONE_TO_ONE = ratio7;
            Ratio[] ratioArr = {ratio, ratio2, ratio3, ratio4, ratio5, ratio6, ratio7};
            $VALUES = ratioArr;
            $ENTRIES = new asp(ratioArr);
        }

        private Ratio(String str, int i) {
        }

        public static Ratio valueOf(String str) {
            return (Ratio) Enum.valueOf(Ratio.class, str);
        }

        public static Ratio[] values() {
            return (Ratio[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePhotoEditorStat$PhotoParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public final Boolean A() {
        return this.isRotated;
    }

    public final Boolean B() {
        return this.isUpgraded;
    }

    public final Boolean C() {
        return this.isZoomed;
    }

    public final Integer a() {
        return this.autocorrectionValue;
    }

    public final BlurType b() {
        return this.blurType;
    }

    public final Integer c() {
        return this.blurValue;
    }

    public final Integer d() {
        return this.collageBorderWidth;
    }

    public final Integer e() {
        return this.collageCornerRadius;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePhotoEditorStat$PhotoParams)) {
            return false;
        }
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams mobileOfficialAppsCorePhotoEditorStat$PhotoParams = (MobileOfficialAppsCorePhotoEditorStat$PhotoParams) obj;
        return epx.f(this.isCropped, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.isCropped) && epx.f(this.isRotated, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.isRotated) && epx.f(this.isZoomed, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.isZoomed) && epx.f(this.zoomValue, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.zoomValue) && epx.f(this.rotation, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.rotation) && epx.f(this.isAutocorrected, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.isAutocorrected) && epx.f(this.autocorrectionValue, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.autocorrectionValue) && epx.f(this.hasFilter, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.hasFilter) && epx.f(this.filter, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.filter) && epx.f(this.parentFilter, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.parentFilter) && epx.f(this.positionInParentFilter, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.positionInParentFilter) && epx.f(this.filterValue, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.filterValue) && this.ratio == mobileOfficialAppsCorePhotoEditorStat$PhotoParams.ratio && epx.f(this.height, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.height) && epx.f(this.width, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.width) && this.blurType == mobileOfficialAppsCorePhotoEditorStat$PhotoParams.blurType && epx.f(this.blurValue, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.blurValue) && epx.f(this.a, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.a) && epx.f(this.collageBorderWidth, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.collageBorderWidth) && epx.f(this.collageCornerRadius, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.collageCornerRadius) && epx.f(this.b, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.b) && epx.f(this.collageGradient, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.collageGradient) && epx.f(this.hasText, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.hasText) && epx.f(this.hasSticker, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.hasSticker) && epx.f(this.hasGraffity, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.hasGraffity) && epx.f(this.graffities, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.graffities) && epx.f(this.texts, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.texts) && epx.f(this.stickers, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.stickers) && epx.f(this.colorGradingParams, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.colorGradingParams) && epx.f(this.colorGradingValues, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.colorGradingValues) && epx.f(this.isUpgraded, mobileOfficialAppsCorePhotoEditorStat$PhotoParams.isUpgraded);
    }

    public final Boolean f() {
        return this.collageGradient;
    }

    public final List<String> g() {
        return this.colorGradingParams;
    }

    public final List<Float> h() {
        return this.colorGradingValues;
    }

    public final int hashCode() {
        Boolean bool = this.isCropped;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isRotated;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isZoomed;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.zoomValue;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.rotation;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.isAutocorrected;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num2 = this.autocorrectionValue;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool5 = this.hasFilter;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.filter;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parentFilter;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.positionInParentFilter;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.filterValue;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Ratio ratio = this.ratio;
        int hashCode13 = (hashCode12 + (ratio == null ? 0 : ratio.hashCode())) * 31;
        Integer num5 = this.height;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.width;
        int hashCode15 = (hashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        BlurType blurType = this.blurType;
        int hashCode16 = (hashCode15 + (blurType == null ? 0 : blurType.hashCode())) * 31;
        Integer num7 = this.blurValue;
        int hashCode17 = (hashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str3 = this.a;
        int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num8 = this.collageBorderWidth;
        int hashCode19 = (hashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.collageCornerRadius;
        int hashCode20 = (hashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str4 = this.b;
        int hashCode21 = (hashCode20 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool6 = this.collageGradient;
        int hashCode22 = (hashCode21 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasText;
        int hashCode23 = (hashCode22 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.hasSticker;
        int hashCode24 = (hashCode23 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.hasGraffity;
        int hashCode25 = (hashCode24 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        List<MobileOfficialAppsCorePhotoEditorStat$GraffityData> list = this.graffities;
        int hashCode26 = (hashCode25 + (list == null ? 0 : list.hashCode())) * 31;
        List<MobileOfficialAppsCorePhotoEditorStat$TextData> list2 = this.texts;
        int hashCode27 = (hashCode26 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MobileOfficialAppsCorePhotoEditorStat$StickerData> list3 = this.stickers;
        int hashCode28 = (hashCode27 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.colorGradingParams;
        int hashCode29 = (hashCode28 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Float> list5 = this.colorGradingValues;
        int hashCode30 = (hashCode29 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool10 = this.isUpgraded;
        return hashCode30 + (bool10 != null ? bool10.hashCode() : 0);
    }

    public final String i() {
        return this.filter;
    }

    public final Integer j() {
        return this.filterValue;
    }

    public final List<MobileOfficialAppsCorePhotoEditorStat$GraffityData> k() {
        return this.graffities;
    }

    public final Boolean l() {
        return this.hasFilter;
    }

    public final Boolean m() {
        return this.hasGraffity;
    }

    public final Boolean n() {
        return this.hasSticker;
    }

    public final Boolean o() {
        return this.hasText;
    }

    public final Integer p() {
        return this.height;
    }

    public final String q() {
        return this.parentFilter;
    }

    public final Integer r() {
        return this.positionInParentFilter;
    }

    public final Ratio s() {
        return this.ratio;
    }

    public final Integer t() {
        return this.rotation;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoParams(isCropped=");
        sb.append(this.isCropped);
        sb.append(", isRotated=");
        sb.append(this.isRotated);
        sb.append(", isZoomed=");
        sb.append(this.isZoomed);
        sb.append(", zoomValue=");
        sb.append(this.zoomValue);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", isAutocorrected=");
        sb.append(this.isAutocorrected);
        sb.append(", autocorrectionValue=");
        sb.append(this.autocorrectionValue);
        sb.append(", hasFilter=");
        sb.append(this.hasFilter);
        sb.append(", filter=");
        sb.append(this.filter);
        sb.append(", parentFilter=");
        sb.append(this.parentFilter);
        sb.append(", positionInParentFilter=");
        sb.append(this.positionInParentFilter);
        sb.append(", filterValue=");
        sb.append(this.filterValue);
        sb.append(", ratio=");
        sb.append(this.ratio);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", blurType=");
        sb.append(this.blurType);
        sb.append(", blurValue=");
        sb.append(this.blurValue);
        sb.append(", collageGrid=");
        sb.append(this.a);
        sb.append(", collageBorderWidth=");
        sb.append(this.collageBorderWidth);
        sb.append(", collageCornerRadius=");
        sb.append(this.collageCornerRadius);
        sb.append(", collageBorderColor=");
        sb.append(this.b);
        sb.append(", collageGradient=");
        sb.append(this.collageGradient);
        sb.append(", hasText=");
        sb.append(this.hasText);
        sb.append(", hasSticker=");
        sb.append(this.hasSticker);
        sb.append(", hasGraffity=");
        sb.append(this.hasGraffity);
        sb.append(", graffities=");
        sb.append(this.graffities);
        sb.append(", texts=");
        sb.append(this.texts);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", colorGradingParams=");
        sb.append(this.colorGradingParams);
        sb.append(", colorGradingValues=");
        sb.append(this.colorGradingValues);
        sb.append(", isUpgraded=");
        return tn.a(sb, this.isUpgraded, ')');
    }

    public final List<MobileOfficialAppsCorePhotoEditorStat$StickerData> u() {
        return this.stickers;
    }

    public final List<MobileOfficialAppsCorePhotoEditorStat$TextData> v() {
        return this.texts;
    }

    public final Integer w() {
        return this.width;
    }

    public final Long x() {
        return this.zoomValue;
    }

    public final Boolean y() {
        return this.isAutocorrected;
    }

    public final Boolean z() {
        return this.isCropped;
    }

    public MobileOfficialAppsCorePhotoEditorStat$PhotoParams(Boolean bool, Boolean bool2, Boolean bool3, Long l, Integer num, Boolean bool4, Integer num2, Boolean bool5, String str, String str2, Integer num3, Integer num4, Ratio ratio, Integer num5, Integer num6, BlurType blurType, Integer num7, String str3, Integer num8, Integer num9, String str4, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, List<MobileOfficialAppsCorePhotoEditorStat$GraffityData> list, List<MobileOfficialAppsCorePhotoEditorStat$TextData> list2, List<MobileOfficialAppsCorePhotoEditorStat$StickerData> list3, List<String> list4, List<Float> list5, Boolean bool10) {
        this.isCropped = bool;
        this.isRotated = bool2;
        this.isZoomed = bool3;
        this.zoomValue = l;
        this.rotation = num;
        this.isAutocorrected = bool4;
        this.autocorrectionValue = num2;
        this.hasFilter = bool5;
        this.filter = str;
        this.parentFilter = str2;
        this.positionInParentFilter = num3;
        this.filterValue = num4;
        this.ratio = ratio;
        this.height = num5;
        this.width = num6;
        this.blurType = blurType;
        this.blurValue = num7;
        this.a = str3;
        this.collageBorderWidth = num8;
        this.collageCornerRadius = num9;
        this.b = str4;
        this.collageGradient = bool6;
        this.hasText = bool7;
        this.hasSticker = bool8;
        this.hasGraffity = bool9;
        this.graffities = list;
        this.texts = list2;
        this.stickers = list3;
        this.colorGradingParams = list4;
        this.colorGradingValues = list5;
        this.isUpgraded = bool10;
        FilteredString filteredString = new FilteredString(lhg.b(32));
        this.filteredCollageGrid = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(32));
        this.filteredCollageBorderColor = filteredString2;
        filteredString.a(str3);
        filteredString2.a(str4);
    }

    public /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$PhotoParams(Boolean bool, Boolean bool2, Boolean bool3, Long l, Integer num, Boolean bool4, Integer num2, Boolean bool5, String str, String str2, Integer num3, Integer num4, Ratio ratio, Integer num5, Integer num6, BlurType blurType, Integer num7, String str3, Integer num8, Integer num9, String str4, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, List list, List list2, List list3, List list4, List list5, Boolean bool10, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : ratio, (i & 8192) != 0 ? null : num5, (i & 16384) != 0 ? null : num6, (i & 32768) != 0 ? null : blurType, (i & 65536) != 0 ? null : num7, (i & 131072) != 0 ? null : str3, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num8, (i & 524288) != 0 ? null : num9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str4, (i & 2097152) != 0 ? null : bool6, (i & 4194304) != 0 ? null : bool7, (i & 8388608) != 0 ? null : bool8, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool9, (i & 33554432) != 0 ? null : list, (i & 67108864) != 0 ? null : list2, (i & 134217728) != 0 ? null : list3, (i & 268435456) != 0 ? null : list4, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list5, (i & 1073741824) != 0 ? null : bool10);
    }
}
