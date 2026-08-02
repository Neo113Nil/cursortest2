package ru.ozon.uni.ozi.components.text.presets;

import K1.T;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziTheme;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B-\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r\u0082\u0001\u0005\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "", "LK1/T;", "textStyle", "LZ1/u;", "paragraphSpacing", "Lu0/x;", "paddingValues", "expandTextStyle", "<init>", "(LK1/T;JLu0/x;LK1/T;)V", "LK1/T;", "getTextStyle", "()LK1/T;", "J", "getParagraphSpacing-XSAIIZE", "()J", "Lu0/x;", "getPaddingValues", "()Lu0/x;", "getExpandTextStyle", "H2", "H4", "Paragraph", "ParagraphCompact", "UiH2Compact", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$H2;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$H4;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$Paragraph;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$ParagraphCompact;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$UiH2Compact;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziTextPreset {

    @NotNull
    private final T expandTextStyle;

    @NotNull
    private final InterfaceC9914x paddingValues;
    private final long paragraphSpacing;

    @NotNull
    private final T textStyle;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$H2;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class H2 extends OziTextPreset {

        @NotNull
        public static final H2 INSTANCE = new H2();

        private H2() {
            super(OziTheme.INSTANCE.getTypography().getHeadline500(), 0L, androidx.compose.foundation.layout.T.b(0.0f, 24, 0.0f, 8, 5), null, 10, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof H2);
        }

        public int hashCode() {
            return -1494813224;
        }

        @NotNull
        public String toString() {
            return "H2";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$H4;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class H4 extends OziTextPreset {

        @NotNull
        public static final H4 INSTANCE = new H4();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private H4() {
            super(r0.getTypography().getHeadline300Caption(), 0L, androidx.compose.foundation.layout.T.b(0.0f, 13, 0.0f, 3, 5), r0.getTypography().getCompact300(), 2, null);
            OziTheme oziTheme = OziTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof H4);
        }

        public int hashCode() {
            return -1494813222;
        }

        @NotNull
        public String toString() {
            return "H4";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$Paragraph;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paragraph extends OziTextPreset {

        @NotNull
        public static final Paragraph INSTANCE = new Paragraph();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Paragraph() {
            super(r0.getTypography().getBody500(), Hj0.T.d(8), androidx.compose.foundation.layout.T.b(0.0f, r1, 0.0f, r1, 5), r0.getTypography().getCompact300(), null);
            OziTheme oziTheme = OziTheme.INSTANCE;
            float f7 = 8;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Paragraph);
        }

        public int hashCode() {
            return -21941088;
        }

        @NotNull
        public String toString() {
            return "Paragraph";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$ParagraphCompact;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParagraphCompact extends OziTextPreset {

        @NotNull
        public static final ParagraphCompact INSTANCE = new ParagraphCompact();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ParagraphCompact() {
            super(r0.getTypography().getBody500(), Hj0.T.d(8), androidx.compose.foundation.layout.T.b(0.0f, 0, 0.0f, 8, 5), r0.getTypography().getCompact300(), null);
            OziTheme oziTheme = OziTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ParagraphCompact);
        }

        public int hashCode() {
            return -1914164637;
        }

        @NotNull
        public String toString() {
            return "ParagraphCompact";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/text/presets/OziTextPreset$UiH2Compact;", "Lru/ozon/uni/ozi/components/text/presets/OziTextPreset;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UiH2Compact extends OziTextPreset {

        @NotNull
        public static final UiH2Compact INSTANCE = new UiH2Compact();

        private UiH2Compact() {
            super(OziTheme.INSTANCE.getTypography().getHeadline500(), 0L, androidx.compose.foundation.layout.T.b(0.0f, 4, 0.0f, 8, 5), null, 10, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UiH2Compact);
        }

        public int hashCode() {
            return -946713225;
        }

        @NotNull
        public String toString() {
            return "UiH2Compact";
        }
    }

    public /* synthetic */ OziTextPreset(T t2, long j11, InterfaceC9914x interfaceC9914x, T t11, DefaultConstructorMarker defaultConstructorMarker) {
        this(t2, j11, interfaceC9914x, t11);
    }

    @NotNull
    public T getExpandTextStyle() {
        return this.expandTextStyle;
    }

    @NotNull
    public InterfaceC9914x getPaddingValues() {
        return this.paddingValues;
    }

    /* renamed from: getParagraphSpacing-XSAIIZE, reason: not valid java name and from getter */
    public long getParagraphSpacing() {
        return this.paragraphSpacing;
    }

    @NotNull
    public T getTextStyle() {
        return this.textStyle;
    }

    private OziTextPreset(T textStyle, long j11, InterfaceC9914x paddingValues, T expandTextStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(expandTextStyle, "expandTextStyle");
        this.textStyle = textStyle;
        this.paragraphSpacing = j11;
        this.paddingValues = paddingValues;
        this.expandTextStyle = expandTextStyle;
    }

    public /* synthetic */ OziTextPreset(T t2, long j11, InterfaceC9914x interfaceC9914x, T t11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(t2, (i11 & 2) != 0 ? Hj0.T.d(0) : j11, interfaceC9914x, (i11 & 8) != 0 ? OziTheme.INSTANCE.getTypography().getCompact500() : t11, null);
    }
}
