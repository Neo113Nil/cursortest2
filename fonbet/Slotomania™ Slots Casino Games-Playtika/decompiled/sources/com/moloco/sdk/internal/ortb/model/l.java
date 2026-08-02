package com.moloco.sdk.internal.ortb.model;

import androidx.core.app.FrameMetricsAggregator;
import com.braze.Constants;
import com.moloco.sdk.internal.ortb.model.m;
import com.moloco.sdk.internal.ortb.model.n;
import com.moloco.sdk.internal.ortb.model.p;
import com.moloco.sdk.internal.ortb.model.q;
import com.moloco.sdk.internal.ortb.model.r;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0001\u0018\u0000 >2\u00020\u0001:\u0002\u001e%Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010 \u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010 \u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010 \u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010.\u0012\u0004\b+\u0010$\u001a\u0004\b(\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u00100\u0012\u0004\b3\u0010$\u001a\u0004\b1\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u00104\u0012\u0004\b7\u0010$\u001a\u0004\b5\u00106R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u00108\u0012\u0004\b;\u0010$\u001a\u0004\b9\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010<\u0012\u0004\b%\u0010$\u001a\u0004\b\u001e\u0010=¨\u0006?"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/l;", "", "", "impressionTrackingUrl", "ctaUrl", "ctaTrackingUrl", "skipToDecTrackingUrl", "Lcom/moloco/sdk/internal/ortb/model/r;", "close", "Lcom/moloco/sdk/internal/ortb/model/p;", "decCta", "Lcom/moloco/sdk/internal/ortb/model/m;", "decAppIcon", "Lcom/moloco/sdk/internal/ortb/model/q;", "decRating", "Lcom/moloco/sdk/internal/ortb/model/n;", "appName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/r;Lcom/moloco/sdk/internal/ortb/model/p;Lcom/moloco/sdk/internal/ortb/model/m;Lcom/moloco/sdk/internal/ortb/model/q;Lcom/moloco/sdk/internal/ortb/model/n;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/r;Lcom/moloco/sdk/internal/ortb/model/p;Lcom/moloco/sdk/internal/ortb/model/m;Lcom/moloco/sdk/internal/ortb/model/q;Lcom/moloco/sdk/internal/ortb/model/n;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/l;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "p", "()V", "b", "g", "h", "c", "e", "f", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "q", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Lcom/moloco/sdk/internal/ortb/model/r;", "()Lcom/moloco/sdk/internal/ortb/model/r;", "Lcom/moloco/sdk/internal/ortb/model/p;", "k", "()Lcom/moloco/sdk/internal/ortb/model/p;", "l", "Lcom/moloco/sdk/internal/ortb/model/m;", "i", "()Lcom/moloco/sdk/internal/ortb/model/m;", "j", "Lcom/moloco/sdk/internal/ortb/model/q;", "m", "()Lcom/moloco/sdk/internal/ortb/model/q;", "n", "Lcom/moloco/sdk/internal/ortb/model/n;", "()Lcom/moloco/sdk/internal/ortb/model/n;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int j = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final String impressionTrackingUrl;

    /* renamed from: b, reason: from kotlin metadata */
    public final String ctaUrl;

    /* renamed from: c, reason: from kotlin metadata */
    public final String ctaTrackingUrl;

    /* renamed from: d, reason: from kotlin metadata */
    public final String skipToDecTrackingUrl;

    /* renamed from: e, reason: from kotlin metadata */
    public final r close;

    /* renamed from: f, reason: from kotlin metadata */
    public final p decCta;

    /* renamed from: g, reason: from kotlin metadata */
    public final m decAppIcon;

    /* renamed from: h, reason: from kotlin metadata */
    public final q decRating;

    /* renamed from: i, reason: from kotlin metadata */
    public final n appName;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<l> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DEC", aVar, 9);
            pluginGeneratedSerialDescriptor.addElement("imp_link", true);
            pluginGeneratedSerialDescriptor.addElement("click_through", true);
            pluginGeneratedSerialDescriptor.addElement("click_tracking", true);
            pluginGeneratedSerialDescriptor.addElement("skip_event", true);
            pluginGeneratedSerialDescriptor.addElement("close", true);
            pluginGeneratedSerialDescriptor.addElement("cta", true);
            pluginGeneratedSerialDescriptor.addElement("app_icon", true);
            pluginGeneratedSerialDescriptor.addElement("rating", true);
            pluginGeneratedSerialDescriptor.addElement("app_name", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l deserialize(Decoder decoder) {
            m mVar;
            String str;
            p pVar;
            String str2;
            int i;
            n nVar;
            String str3;
            r rVar;
            String str4;
            q qVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 7;
            String str5 = null;
            if (beginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
                String str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
                String str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                String str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
                r rVar2 = (r) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, r.a.a, null);
                p pVar2 = (p) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, p.a.a, null);
                m mVar2 = (m) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m.a.a, null);
                str2 = str8;
                str = str7;
                qVar = (q) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, q.a.a, null);
                mVar = mVar2;
                pVar = pVar2;
                rVar = rVar2;
                nVar = (n) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, n.a.a, null);
                i = 511;
                str3 = str6;
                str4 = str9;
            } else {
                boolean z = true;
                int i3 = 0;
                q qVar2 = null;
                n nVar2 = null;
                m mVar3 = null;
                p pVar3 = null;
                r rVar3 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 7;
                        case 0:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str5);
                            i3 |= 1;
                            i2 = 7;
                        case 1:
                            str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                            i3 |= 2;
                            i2 = 7;
                        case 2:
                            str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str11);
                            i3 |= 4;
                            i2 = 7;
                        case 3:
                            str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                            i3 |= 8;
                            i2 = 7;
                        case 4:
                            rVar3 = (r) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, r.a.a, rVar3);
                            i3 |= 16;
                            i2 = 7;
                        case 5:
                            pVar3 = (p) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, p.a.a, pVar3);
                            i3 |= 32;
                            i2 = 7;
                        case 6:
                            mVar3 = (m) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m.a.a, mVar3);
                            i3 |= 64;
                        case 7:
                            qVar2 = (q) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, q.a.a, qVar2);
                            i3 |= 128;
                        case 8:
                            nVar2 = (n) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, n.a.a, nVar2);
                            i3 |= 256;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                String str13 = str11;
                mVar = mVar3;
                str = str10;
                pVar = pVar3;
                str2 = str13;
                i = i3;
                nVar = nVar2;
                str3 = str5;
                rVar = rVar3;
                str4 = str12;
                qVar = qVar2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new l(i, str3, str, str2, str4, rVar, pVar, mVar, qVar, nVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(r.a.a), BuiltinSerializersKt.getNullable(p.a.a), BuiltinSerializersKt.getNullable(m.a.a), BuiltinSerializersKt.getNullable(q.a.a), BuiltinSerializersKt.getNullable(n.a.a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, l value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            l.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<l> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l() {
        this((String) null, (String) null, (String) null, (String) null, (r) null, (p) null, (m) null, (q) null, (n) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void a(l self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.impressionTrackingUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.impressionTrackingUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ctaUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.ctaTrackingUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.ctaTrackingUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.skipToDecTrackingUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.skipToDecTrackingUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.close != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, r.a.a, self.close);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.decCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, p.a.a, self.decCta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.decAppIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, m.a.a, self.decAppIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.decRating != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, q.a.a, self.decRating);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.appName == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, n.a.a, self.appName);
    }

    @SerialName("app_name")
    public static /* synthetic */ void b() {
    }

    @SerialName("close")
    public static /* synthetic */ void d() {
    }

    @SerialName("click_tracking")
    public static /* synthetic */ void f() {
    }

    @SerialName("click_through")
    public static /* synthetic */ void h() {
    }

    @SerialName("app_icon")
    public static /* synthetic */ void j() {
    }

    @SerialName("cta")
    public static /* synthetic */ void l() {
    }

    @SerialName("rating")
    public static /* synthetic */ void n() {
    }

    @SerialName("imp_link")
    public static /* synthetic */ void p() {
    }

    @SerialName("skip_event")
    public static /* synthetic */ void r() {
    }

    /* renamed from: c, reason: from getter */
    public final r getClose() {
        return this.close;
    }

    /* renamed from: e, reason: from getter */
    public final String getCtaTrackingUrl() {
        return this.ctaTrackingUrl;
    }

    /* renamed from: g, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* renamed from: i, reason: from getter */
    public final m getDecAppIcon() {
        return this.decAppIcon;
    }

    /* renamed from: k, reason: from getter */
    public final p getDecCta() {
        return this.decCta;
    }

    /* renamed from: m, reason: from getter */
    public final q getDecRating() {
        return this.decRating;
    }

    /* renamed from: o, reason: from getter */
    public final String getImpressionTrackingUrl() {
        return this.impressionTrackingUrl;
    }

    /* renamed from: q, reason: from getter */
    public final String getSkipToDecTrackingUrl() {
        return this.skipToDecTrackingUrl;
    }

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, r rVar, p pVar, m mVar, q qVar, n nVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.impressionTrackingUrl = null;
        } else {
            this.impressionTrackingUrl = str;
        }
        if ((i & 2) == 0) {
            this.ctaUrl = null;
        } else {
            this.ctaUrl = str2;
        }
        if ((i & 4) == 0) {
            this.ctaTrackingUrl = null;
        } else {
            this.ctaTrackingUrl = str3;
        }
        if ((i & 8) == 0) {
            this.skipToDecTrackingUrl = null;
        } else {
            this.skipToDecTrackingUrl = str4;
        }
        if ((i & 16) == 0) {
            this.close = null;
        } else {
            this.close = rVar;
        }
        if ((i & 32) == 0) {
            this.decCta = null;
        } else {
            this.decCta = pVar;
        }
        if ((i & 64) == 0) {
            this.decAppIcon = null;
        } else {
            this.decAppIcon = mVar;
        }
        if ((i & 128) == 0) {
            this.decRating = null;
        } else {
            this.decRating = qVar;
        }
        if ((i & 256) == 0) {
            this.appName = null;
        } else {
            this.appName = nVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final n getAppName() {
        return this.appName;
    }

    public l(String str, String str2, String str3, String str4, r rVar, p pVar, m mVar, q qVar, n nVar) {
        this.impressionTrackingUrl = str;
        this.ctaUrl = str2;
        this.ctaTrackingUrl = str3;
        this.skipToDecTrackingUrl = str4;
        this.close = rVar;
        this.decCta = pVar;
        this.decAppIcon = mVar;
        this.decRating = qVar;
        this.appName = nVar;
    }

    public /* synthetic */ l(String str, String str2, String str3, String str4, r rVar, p pVar, m mVar, q qVar, n nVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : rVar, (i & 32) != 0 ? null : pVar, (i & 64) != 0 ? null : mVar, (i & 128) != 0 ? null : qVar, (i & 256) != 0 ? null : nVar);
    }
}
