package com.moloco.sdk.internal.ortb.model;

import androidx.compose.material.OutlinedTextFieldKt;
import com.braze.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.moloco.sdk.internal.ortb.model.o;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0002\u0018\u001bB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJd\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0018\u0010#J\u0010\u0010$\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010+\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010+\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010/\u0012\u0004\b:\u0010.\u001a\u0004\b9\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010/\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010\u001c¨\u0006>"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/p;", "", "", "verticalSpacing", "", "ctaText", "buttonWidth", TtmlNode.ATTR_TTS_FONT_SIZE, "Lcom/moloco/sdk/internal/ortb/model/o;", OutlinedTextFieldKt.BorderId, "foregroundColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/o;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/o;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/p;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "c", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "e", "()Lcom/moloco/sdk/internal/ortb/model/o;", "f", "g", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/moloco/sdk/internal/ortb/model/o;Ljava/lang/String;Ljava/lang/String;)Lcom/moloco/sdk/internal/ortb/model/p;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", Constants.BRAZE_PUSH_TITLE_KEY, "u", "()V", "Ljava/lang/String;", "n", "o", "l", "m", "p", "q", "Lcom/moloco/sdk/internal/ortb/model/o;", "j", "k", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "h", "i", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class p {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final Integer verticalSpacing;

    /* renamed from: b, reason: from kotlin metadata */
    public final String ctaText;

    /* renamed from: c, reason: from kotlin metadata */
    public final Integer buttonWidth;

    /* renamed from: d, reason: from kotlin metadata */
    public final Integer fontSize;

    /* renamed from: e, reason: from kotlin metadata */
    public final o border;

    /* renamed from: f, reason: from kotlin metadata */
    public final String foregroundColor;

    /* renamed from: g, reason: from kotlin metadata */
    public final String backgroundColor;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<p> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECCtaSerializable", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("vertical_spacing", true);
            pluginGeneratedSerialDescriptor.addElement("text", true);
            pluginGeneratedSerialDescriptor.addElement("button_width", true);
            pluginGeneratedSerialDescriptor.addElement(ViewHierarchyConstants.TEXT_SIZE, true);
            pluginGeneratedSerialDescriptor.addElement(OutlinedTextFieldKt.BorderId, true);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", true);
            pluginGeneratedSerialDescriptor.addElement("background_color", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p deserialize(Decoder decoder) {
            String str;
            String str2;
            o oVar;
            Integer num;
            Integer num2;
            String str3;
            Integer num3;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 6;
            Integer num4 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
                Integer num6 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
                Integer num7 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
                o oVar2 = (o) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, o.a.a, null);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
                num = num7;
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
                str2 = str5;
                oVar = oVar2;
                i = 127;
                num2 = num6;
                str3 = str4;
                num3 = num5;
            } else {
                boolean z = true;
                int i3 = 0;
                String str6 = null;
                String str7 = null;
                Integer num8 = null;
                Integer num9 = null;
                o oVar3 = null;
                String str8 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 6;
                        case 0:
                            num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num4);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                            i3 |= 2;
                            i2 = 6;
                        case 2:
                            num8 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num8);
                            i3 |= 4;
                        case 3:
                            num9 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num9);
                            i3 |= 8;
                        case 4:
                            oVar3 = (o) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, o.a.a, oVar3);
                            i3 |= 16;
                        case 5:
                            str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str8);
                            i3 |= 32;
                        case 6:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str6);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                str = str6;
                str2 = str8;
                oVar = oVar3;
                num = num9;
                num2 = num8;
                str3 = str7;
                num3 = num4;
                i = i3;
            }
            beginStructure.endStructure(serialDescriptor);
            return new p(i, num3, str3, num2, num, oVar, str2, str, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(intSerializer);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(o.a.a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, p value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            p.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.p$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<p> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public p() {
        this((Integer) null, (String) null, (Integer) null, (Integer) null, (o) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    @SerialName("background_color")
    public static /* synthetic */ void i() {
    }

    @SerialName(OutlinedTextFieldKt.BorderId)
    public static /* synthetic */ void k() {
    }

    @SerialName("button_width")
    public static /* synthetic */ void m() {
    }

    @SerialName("text")
    public static /* synthetic */ void o() {
    }

    @SerialName(ViewHierarchyConstants.TEXT_SIZE)
    public static /* synthetic */ void q() {
    }

    @SerialName("foreground_color")
    public static /* synthetic */ void s() {
    }

    @SerialName("vertical_spacing")
    public static /* synthetic */ void u() {
    }

    /* renamed from: a, reason: from getter */
    public final Integer getVerticalSpacing() {
        return this.verticalSpacing;
    }

    /* renamed from: b, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getButtonWidth() {
        return this.buttonWidth;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* renamed from: e, reason: from getter */
    public final o getBorder() {
        return this.border;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return Intrinsics.areEqual(this.verticalSpacing, pVar.verticalSpacing) && Intrinsics.areEqual(this.ctaText, pVar.ctaText) && Intrinsics.areEqual(this.buttonWidth, pVar.buttonWidth) && Intrinsics.areEqual(this.fontSize, pVar.fontSize) && Intrinsics.areEqual(this.border, pVar.border) && Intrinsics.areEqual(this.foregroundColor, pVar.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, pVar.backgroundColor);
    }

    /* renamed from: f, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: g, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String h() {
        return this.backgroundColor;
    }

    public int hashCode() {
        Integer num = this.verticalSpacing;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ctaText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.buttonWidth;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fontSize;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        o oVar = this.border;
        int hashCode5 = (hashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str2 = this.foregroundColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final o j() {
        return this.border;
    }

    public final Integer l() {
        return this.buttonWidth;
    }

    public final String n() {
        return this.ctaText;
    }

    public final Integer p() {
        return this.fontSize;
    }

    public final String r() {
        return this.foregroundColor;
    }

    public final Integer t() {
        return this.verticalSpacing;
    }

    public String toString() {
        return "DECCtaSerializable(verticalSpacing=" + this.verticalSpacing + ", ctaText=" + this.ctaText + ", buttonWidth=" + this.buttonWidth + ", fontSize=" + this.fontSize + ", border=" + this.border + ", foregroundColor=" + this.foregroundColor + ", backgroundColor=" + this.backgroundColor + ')';
    }

    public /* synthetic */ p(int i, Integer num, String str, Integer num2, Integer num3, o oVar, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.verticalSpacing = null;
        } else {
            this.verticalSpacing = num;
        }
        if ((i & 2) == 0) {
            this.ctaText = null;
        } else {
            this.ctaText = str;
        }
        if ((i & 4) == 0) {
            this.buttonWidth = null;
        } else {
            this.buttonWidth = num2;
        }
        if ((i & 8) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num3;
        }
        if ((i & 16) == 0) {
            this.border = null;
        } else {
            this.border = oVar;
        }
        if ((i & 32) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = str2;
        }
        if ((i & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str3;
        }
    }

    public final p a(Integer verticalSpacing, String ctaText, Integer buttonWidth, Integer fontSize, o border, String foregroundColor, String backgroundColor) {
        return new p(verticalSpacing, ctaText, buttonWidth, fontSize, border, foregroundColor, backgroundColor);
    }

    public static /* synthetic */ p a(p pVar, Integer num, String str, Integer num2, Integer num3, o oVar, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pVar.verticalSpacing;
        }
        if ((i & 2) != 0) {
            str = pVar.ctaText;
        }
        if ((i & 4) != 0) {
            num2 = pVar.buttonWidth;
        }
        if ((i & 8) != 0) {
            num3 = pVar.fontSize;
        }
        if ((i & 16) != 0) {
            oVar = pVar.border;
        }
        if ((i & 32) != 0) {
            str2 = pVar.foregroundColor;
        }
        if ((i & 64) != 0) {
            str3 = pVar.backgroundColor;
        }
        String str4 = str2;
        String str5 = str3;
        o oVar2 = oVar;
        Integer num4 = num2;
        return pVar.a(num, str, num4, num3, oVar2, str4, str5);
    }

    @JvmStatic
    public static final /* synthetic */ void a(p self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.verticalSpacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.verticalSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaText != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ctaText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.buttonWidth != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.buttonWidth);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.fontSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.fontSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.border != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, o.a.a, self.border);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.foregroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.foregroundColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.backgroundColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.backgroundColor);
    }

    public p(Integer num, String str, Integer num2, Integer num3, o oVar, String str2, String str3) {
        this.verticalSpacing = num;
        this.ctaText = str;
        this.buttonWidth = num2;
        this.fontSize = num3;
        this.border = oVar;
        this.foregroundColor = str2;
        this.backgroundColor = str3;
    }

    public /* synthetic */ p(Integer num, String str, Integer num2, Integer num3, o oVar, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : oVar, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }
}
