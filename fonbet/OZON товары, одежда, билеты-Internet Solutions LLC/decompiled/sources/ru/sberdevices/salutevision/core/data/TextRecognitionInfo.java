package ru.sberdevices.salutevision.core.data;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/sberdevices/salutevision/core/data/TextRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "text", "", "backgroundColor", "Landroid/graphics/Color;", "foregroundColor", "(Ljava/lang/String;Landroid/graphics/Color;Landroid/graphics/Color;)V", "getBackgroundColor", "()Landroid/graphics/Color;", "getForegroundColor", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TextRecognitionInfo implements SaluteVisionRecognition.Info {
    private final Color backgroundColor;
    private final Color foregroundColor;
    private final String text;

    public TextRecognitionInfo(String str, Color color, Color color2) {
        this.text = str;
        this.backgroundColor = color;
        this.foregroundColor = color2;
    }

    public static /* synthetic */ TextRecognitionInfo copy$default(TextRecognitionInfo textRecognitionInfo, String str, Color color, Color color2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textRecognitionInfo.text;
        }
        if ((i11 & 2) != 0) {
            color = textRecognitionInfo.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            color2 = textRecognitionInfo.foregroundColor;
        }
        return textRecognitionInfo.copy(str, color, color2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Color getForegroundColor() {
        return this.foregroundColor;
    }

    @NotNull
    public final TextRecognitionInfo copy(String text, Color backgroundColor, Color foregroundColor) {
        return new TextRecognitionInfo(text, backgroundColor, foregroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextRecognitionInfo)) {
            return false;
        }
        TextRecognitionInfo textRecognitionInfo = (TextRecognitionInfo) other;
        return Intrinsics.d(this.text, textRecognitionInfo.text) && Intrinsics.d(this.backgroundColor, textRecognitionInfo.backgroundColor) && Intrinsics.d(this.foregroundColor, textRecognitionInfo.foregroundColor);
    }

    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Color getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Color color = this.backgroundColor;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        Color color2 = this.foregroundColor;
        return hashCode2 + (color2 != null ? color2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextRecognitionInfo(text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ')';
    }

    public /* synthetic */ TextRecognitionInfo(String str, Color color, Color color2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : color, (i11 & 4) != 0 ? null : color2);
    }
}
