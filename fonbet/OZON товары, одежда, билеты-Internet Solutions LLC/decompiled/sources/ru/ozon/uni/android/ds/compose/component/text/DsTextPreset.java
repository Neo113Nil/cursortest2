package ru.ozon.uni.android.ds.compose.component.text;

import K1.T;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\n\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "", "LK1/T;", "getTextStyle", "()LK1/T;", "textStyle", "LZ1/u;", "getParagraphSpacing-XSAIIZE", "()J", "paragraphSpacing", "LZ1/h;", "getPaddingTop-D9Ej5fM", "()F", "paddingTop", "getPaddingBottom-D9Ej5fM", "paddingBottom", "", "getAllCaps", "()Z", "allCaps", "H1", "H2", "H3", "H4", "Paragraph", "ParagraphCompact", "UiH1", "UiH2", "UiH2Compact", "Custom", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$Custom;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H1;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H2;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H3;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H4;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$Paragraph;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$ParagraphCompact;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$UiH1;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$UiH2;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$UiH2Compact;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DsTextPreset {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$Custom;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "LK1/T;", "textStyle", "LZ1/u;", "paragraphSpacing", "LZ1/h;", "paddingTop", "paddingBottom", "", "allCaps", "<init>", "(LK1/T;JFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LK1/T;", "getTextStyle", "()LK1/T;", "J", "getParagraphSpacing-XSAIIZE", "()J", "F", "getPaddingTop-D9Ej5fM", "()F", "getPaddingBottom-D9Ej5fM", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Custom implements DsTextPreset {
        private final boolean allCaps;
        private final float paddingBottom;
        private final float paddingTop;
        private final long paragraphSpacing;

        @NotNull
        private final T textStyle;

        public /* synthetic */ Custom(T t2, long j11, float f7, float f11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(t2, j11, f7, f11, z11);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return this.allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM, reason: from getter */
        public float getPaddingBottom() {
            return this.paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM, reason: from getter */
        public float getPaddingTop() {
            return this.paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE, reason: from getter */
        public long getParagraphSpacing() {
            return this.paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return this.textStyle;
        }

        private Custom(T textStyle, long j11, float f7, float f11, boolean z11) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.textStyle = textStyle;
            this.paragraphSpacing = j11;
            this.paddingTop = f7;
            this.paddingBottom = f11;
            this.allCaps = z11;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Custom(T t2, long j11, float f7, float f11, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(r0, r3, r1, (i11 & 8) != 0 ? UniTheme.INSTANCE.getPaddings().getNone() : f11, (i11 & 16) == 0 ? z11 : false, null);
            T body500Medium = (i11 & 1) != 0 ? UniTheme.INSTANCE.getTypography().getBody500Medium() : t2;
            long d11 = (i11 & 2) != 0 ? Hj0.T.d(0) : j11;
            float none = (i11 & 4) != 0 ? UniTheme.INSTANCE.getPaddings().getNone() : f7;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H1;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class H1 implements DsTextPreset {

        @NotNull
        public static final H1 INSTANCE = new H1();
        private static final boolean allCaps;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getHeadline700XLarge();
            paragraphSpacing = Hj0.T.d(0);
            paddingTop = uniTheme.getPaddings().getPadding900();
            paddingBottom = uniTheme.getPaddings().getPadding300();
            allCaps = uniTheme.getTypographyTokens().getHeadline700XLarge().getIsAllCaps();
        }

        private H1() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof H1);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return 504057169;
        }

        @NotNull
        public String toString() {
            return "H1";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H2;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class H2 implements DsTextPreset {

        @NotNull
        public static final H2 INSTANCE = new H2();
        private static final boolean allCaps = false;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getHeadline500Medium();
            paragraphSpacing = Hj0.T.d(0);
            paddingTop = uniTheme.getPaddings().getPadding700();
            paddingBottom = uniTheme.getPaddings().getPadding300();
        }

        private H2() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof H2);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return 504057170;
        }

        @NotNull
        public String toString() {
            return "H2";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H3;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class H3 implements DsTextPreset {

        @NotNull
        public static final H3 INSTANCE = new H3();
        private static final boolean allCaps = false;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getHeadline400Small();
            paragraphSpacing = Hj0.T.d(0);
            paddingTop = uniTheme.getPaddings().getPadding550();
            paddingBottom = uniTheme.getPaddings().getPadding100();
        }

        private H3() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof H3);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return 504057171;
        }

        @NotNull
        public String toString() {
            return "H3";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$H4;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class H4 implements DsTextPreset {
        private static final boolean allCaps;
        private static final float paddingBottom;
        private static final float paddingTop;

        @NotNull
        public static final H4 INSTANCE = new H4();

        @NotNull
        private static final T textStyle = UniTheme.INSTANCE.getTypography().getHeadline300XSmall();
        private static final long paragraphSpacing = Hj0.T.d(0);

        static {
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            paddingTop = dsSpacings.m1843getDp13D9Ej5fM();
            paddingBottom = dsSpacings.m1852getDp3D9Ej5fM();
            allCaps = true;
        }

        private H4() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof H4);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return 504057172;
        }

        @NotNull
        public String toString() {
            return "H4";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$Paragraph;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Paragraph implements DsTextPreset {

        @NotNull
        public static final Paragraph INSTANCE = new Paragraph();
        private static final boolean allCaps = false;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getBody500Medium();
            paragraphSpacing = Hj0.T.d(8);
            paddingTop = uniTheme.getPaddings().getPadding300();
            paddingBottom = uniTheme.getPaddings().getPadding300();
        }

        private Paragraph() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Paragraph);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return -23306266;
        }

        @NotNull
        public String toString() {
            return "Paragraph";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$ParagraphCompact;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class ParagraphCompact implements DsTextPreset {

        @NotNull
        public static final ParagraphCompact INSTANCE = new ParagraphCompact();
        private static final boolean allCaps = false;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getBody500Medium();
            paragraphSpacing = Hj0.T.d(8);
            paddingTop = uniTheme.getPaddings().getNone();
            paddingBottom = uniTheme.getPaddings().getPadding300();
        }

        private ParagraphCompact() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ParagraphCompact);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return 431547485;
        }

        @NotNull
        public String toString() {
            return "ParagraphCompact";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$UiH1;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class UiH1 implements DsTextPreset {

        @NotNull
        public static final UiH1 INSTANCE = new UiH1();
        private static final boolean allCaps = false;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getHeadline700XLarge();
            paragraphSpacing = Hj0.T.d(0);
            paddingTop = DsSpacings.INSTANCE.m1851getDp28D9Ej5fM();
            paddingBottom = uniTheme.getPaddings().getPadding300();
        }

        private UiH1() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UiH1);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return -931921659;
        }

        @NotNull
        public String toString() {
            return "UiH1";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$UiH2;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class UiH2 implements DsTextPreset {

        @NotNull
        public static final UiH2 INSTANCE = new UiH2();
        private static final boolean allCaps = false;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getHeadline500Medium();
            paragraphSpacing = Hj0.T.d(0);
            paddingTop = uniTheme.getPaddings().getPadding600();
            paddingBottom = uniTheme.getPaddings().getPadding300();
        }

        private UiH2() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UiH2);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return -931921658;
        }

        @NotNull
        public String toString() {
            return "UiH2";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset$UiH2Compact;", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "textStyle", "LK1/T;", "getTextStyle", "()LK1/T;", "LZ1/u;", "paragraphSpacing", "J", "getParagraphSpacing-XSAIIZE", "()J", "LZ1/h;", "paddingTop", "F", "getPaddingTop-D9Ej5fM", "()F", "paddingBottom", "getPaddingBottom-D9Ej5fM", "allCaps", "Z", "getAllCaps", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class UiH2Compact implements DsTextPreset {

        @NotNull
        public static final UiH2Compact INSTANCE = new UiH2Compact();
        private static final boolean allCaps = false;
        private static final float paddingBottom;
        private static final float paddingTop;
        private static final long paragraphSpacing;

        @NotNull
        private static final T textStyle;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            textStyle = uniTheme.getTypography().getHeadline500Medium();
            paragraphSpacing = Hj0.T.d(0);
            paddingTop = uniTheme.getPaddings().getNone();
            paddingBottom = uniTheme.getPaddings().getPadding300();
        }

        private UiH2Compact() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UiH2Compact);
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        public boolean getAllCaps() {
            return allCaps;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingBottom-D9Ej5fM */
        public float getPaddingBottom() {
            return paddingBottom;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getPaddingTop-D9Ej5fM */
        public float getPaddingTop() {
            return paddingTop;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        /* renamed from: getParagraphSpacing-XSAIIZE */
        public long getParagraphSpacing() {
            return paragraphSpacing;
        }

        @Override // ru.ozon.uni.android.ds.compose.component.text.DsTextPreset
        @NotNull
        public T getTextStyle() {
            return textStyle;
        }

        public int hashCode() {
            return 2036318013;
        }

        @NotNull
        public String toString() {
            return "UiH2Compact";
        }
    }

    boolean getAllCaps();

    /* renamed from: getPaddingBottom-D9Ej5fM, reason: not valid java name */
    float getPaddingBottom();

    /* renamed from: getPaddingTop-D9Ej5fM, reason: not valid java name */
    float getPaddingTop();

    /* renamed from: getParagraphSpacing-XSAIIZE, reason: not valid java name */
    long getParagraphSpacing();

    @NotNull
    T getTextStyle();
}
