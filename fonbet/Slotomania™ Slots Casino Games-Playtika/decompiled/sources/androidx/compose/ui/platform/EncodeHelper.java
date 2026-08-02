package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.safedk.android.analytics.brandsafety.m;
import io.sentry.profilemeasurements.ProfileMeasurement;
import kotlin.Metadata;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", ProfileMeasurement.UNIT_BYTES, "", TypedValues.Custom.S_FLOAT, "", m.w, "", "string", "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void encode(SpanStyle spanStyle) {
        if (!Color.m2113equalsimpl0(spanStyle.m3898getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m3711encode8_81llA(spanStyle.m3898getColor0d7_KjU());
        }
        if (!TextUnit.m4628equalsimpl0(spanStyle.getFontSize(), TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m3708encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int m4051unboximpl = fontStyle.m4051unboximpl();
            encode((byte) 4);
            m3713encodenzbMABs(m4051unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m3710encode6p3vJLY(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m4628equalsimpl0(spanStyle.getLetterSpacing(), TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m3708encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float m4222unboximpl = baselineShift.m4222unboximpl();
            encode((byte) 8);
            m3709encode4Dl_Bck(m4222unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m2113equalsimpl0(spanStyle.getBackground(), Color.INSTANCE.m2148getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m3711encode8_81llA(spanStyle.getBackground());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode(Ascii.VT);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode(Ascii.FF);
            encode(shadow);
        }
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m3711encode8_81llA(long color) {
        m3712encodeVKZWuLQ(color);
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m3708encodeR2X_6o(long textUnit) {
        long m4630getTypeUIouoOA = TextUnit.m4630getTypeUIouoOA(textUnit);
        byte b = 0;
        if (!TextUnitType.m4659equalsimpl0(m4630getTypeUIouoOA, TextUnitType.INSTANCE.m4665getUnspecifiedUIouoOA())) {
            if (TextUnitType.m4659equalsimpl0(m4630getTypeUIouoOA, TextUnitType.INSTANCE.m4664getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m4659equalsimpl0(m4630getTypeUIouoOA, TextUnitType.INSTANCE.m4663getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (TextUnitType.m4659equalsimpl0(TextUnit.m4630getTypeUIouoOA(textUnit), TextUnitType.INSTANCE.m4665getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m4631getValueimpl(textUnit));
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m3713encodenzbMABs(int fontStyle) {
        byte b = 0;
        if (!FontStyle.m4048equalsimpl0(fontStyle, FontStyle.INSTANCE.m4055getNormal_LCdwA()) && FontStyle.m4048equalsimpl0(fontStyle, FontStyle.INSTANCE.m4054getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m3710encode6p3vJLY(int fontSynthesis) {
        byte b = 0;
        if (!FontSynthesis.m4059equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4066getNoneGVVA2EU())) {
            if (FontSynthesis.m4059equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4065getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m4059equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4068getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m4059equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m4067getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m3709encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m3711encode8_81llA(shadow.getColor());
        encode(Offset.m1871getXimpl(shadow.getOffset()));
        encode(Offset.m1872getYimpl(shadow.getOffset()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte r2) {
        this.parcel.writeByte(r2);
    }

    public final void encode(int r2) {
        this.parcel.writeInt(r2);
    }

    public final void encode(float r2) {
        this.parcel.writeFloat(r2);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m3712encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void encode(String string) {
        this.parcel.writeString(string);
    }
}
