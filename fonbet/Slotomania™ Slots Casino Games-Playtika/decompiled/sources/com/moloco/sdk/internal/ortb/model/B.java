package com.moloco.sdk.internal.ortb.model;

import com.braze.Constants;
import com.ironsource.Vf;
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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0001\u0018\u0000 22\u00020\u0001:\u0002\u001a!B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001c\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001c\u0012\u0004\b)\u0010 \u001a\u0004\b(\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u0012\u0004\b+\u0010 \u001a\u0004\b*\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001c\u0012\u0004\b!\u0010 \u001a\u0004\b\u001a\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b'\u0010 \u001a\u0004\b$\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b-\u0010 \u001a\u0004\b,\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001c\u0012\u0004\b/\u0010 \u001a\u0004\b.\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001c\u0012\u0004\b1\u0010 \u001a\u0004\b0\u0010\u001e¨\u00063"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/B;", "", "", "onAdLoadStart", Vf.b, "onAdLoadSuccess", Vf.e, "onAdShowSuccess", Vf.f, "onAdHidden", "onUserRewarded", "onRewardedVideoStarted", "onRewardedVideoCompleted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/B;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "h", "()V", "b", "e", "f", "c", "i", "j", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "k", "l", "m", "n", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, Constants.BRAZE_PUSH_TITLE_KEY, "q", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "o", "p", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes6.dex */
public final class B {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int k = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final String onAdLoadStart;

    /* renamed from: b, reason: from kotlin metadata */
    public final String onAdLoadFailed;

    /* renamed from: c, reason: from kotlin metadata */
    public final String onAdLoadSuccess;

    /* renamed from: d, reason: from kotlin metadata */
    public final String onAdShowFailed;

    /* renamed from: e, reason: from kotlin metadata */
    public final String onAdShowSuccess;

    /* renamed from: f, reason: from kotlin metadata */
    public final String onAdClicked;

    /* renamed from: g, reason: from kotlin metadata */
    public final String onAdHidden;

    /* renamed from: h, reason: from kotlin metadata */
    public final String onUserRewarded;

    /* renamed from: i, reason: from kotlin metadata */
    public final String onRewardedVideoStarted;

    /* renamed from: j, reason: from kotlin metadata */
    public final String onRewardedVideoCompleted;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<B> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.SdkEvents", aVar, 10);
            pluginGeneratedSerialDescriptor.addElement("on_ad_load_start", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_load_failed", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_load_success", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_show_failed", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_show_success", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_clicked", true);
            pluginGeneratedSerialDescriptor.addElement("on_ad_hidden", true);
            pluginGeneratedSerialDescriptor.addElement("on_user_rewarded", true);
            pluginGeneratedSerialDescriptor.addElement("on_rewarded_video_started", true);
            pluginGeneratedSerialDescriptor.addElement("on_rewarded_video_completed", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B deserialize(Decoder decoder) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 9;
            String str11 = null;
            if (beginStructure.decodeSequentially()) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
                String str13 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
                String str14 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                String str15 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
                String str16 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
                String str17 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
                String str18 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
                String str19 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
                String str20 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
                str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
                str8 = str19;
                str2 = str18;
                str10 = str20;
                str7 = str13;
                str = str16;
                str9 = str14;
                str5 = str15;
                str3 = str12;
                str4 = str17;
                i = 1023;
            } else {
                boolean z = true;
                int i3 = 0;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                str = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 9;
                        case 0:
                            str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                            i3 |= 1;
                            i2 = 9;
                        case 1:
                            str27 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str27);
                            i3 |= 2;
                            i2 = 9;
                        case 2:
                            str28 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str28);
                            i3 |= 4;
                            i2 = 9;
                        case 3:
                            str26 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str26);
                            i3 |= 8;
                            i2 = 9;
                        case 4:
                            str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str);
                            i3 |= 16;
                            i2 = 9;
                        case 5:
                            str25 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str25);
                            i3 |= 32;
                            i2 = 9;
                        case 6:
                            str23 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str23);
                            i3 |= 64;
                            i2 = 9;
                        case 7:
                            str24 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str24);
                            i3 |= 128;
                            i2 = 9;
                        case 8:
                            str22 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str22);
                            i3 |= 256;
                        case 9:
                            str21 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str21);
                            i3 |= 512;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                String str29 = str11;
                str2 = str23;
                str3 = str29;
                String str30 = str26;
                str4 = str25;
                str5 = str30;
                str6 = str21;
                str7 = str27;
                str8 = str24;
                str9 = str28;
                str10 = str22;
                i = i3;
            }
            beginStructure.endStructure(serialDescriptor);
            return new B(i, str3, str7, str9, str5, str, str4, str2, str8, str10, str6, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, B value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            B.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.B$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<B> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public B() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void a(B self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.onAdLoadStart != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.onAdLoadStart);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.onAdLoadFailed != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.onAdLoadFailed);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.onAdLoadSuccess != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.onAdLoadSuccess);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.onAdShowFailed != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.onAdShowFailed);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.onAdShowSuccess != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.onAdShowSuccess);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.onAdClicked != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.onAdClicked);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.onAdHidden != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.onAdHidden);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.onUserRewarded != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.onUserRewarded);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.onRewardedVideoStarted != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.onRewardedVideoStarted);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.onRewardedVideoCompleted == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.onRewardedVideoCompleted);
    }

    @SerialName("on_ad_clicked")
    public static /* synthetic */ void b() {
    }

    @SerialName("on_ad_hidden")
    public static /* synthetic */ void d() {
    }

    @SerialName("on_ad_load_failed")
    public static /* synthetic */ void f() {
    }

    @SerialName("on_ad_load_start")
    public static /* synthetic */ void h() {
    }

    @SerialName("on_ad_load_success")
    public static /* synthetic */ void j() {
    }

    @SerialName("on_ad_show_failed")
    public static /* synthetic */ void l() {
    }

    @SerialName("on_ad_show_success")
    public static /* synthetic */ void n() {
    }

    @SerialName("on_rewarded_video_completed")
    public static /* synthetic */ void p() {
    }

    @SerialName("on_rewarded_video_started")
    public static /* synthetic */ void r() {
    }

    @SerialName("on_user_rewarded")
    public static /* synthetic */ void t() {
    }

    /* renamed from: c, reason: from getter */
    public final String getOnAdHidden() {
        return this.onAdHidden;
    }

    /* renamed from: e, reason: from getter */
    public final String getOnAdLoadFailed() {
        return this.onAdLoadFailed;
    }

    /* renamed from: g, reason: from getter */
    public final String getOnAdLoadStart() {
        return this.onAdLoadStart;
    }

    /* renamed from: i, reason: from getter */
    public final String getOnAdLoadSuccess() {
        return this.onAdLoadSuccess;
    }

    /* renamed from: k, reason: from getter */
    public final String getOnAdShowFailed() {
        return this.onAdShowFailed;
    }

    /* renamed from: m, reason: from getter */
    public final String getOnAdShowSuccess() {
        return this.onAdShowSuccess;
    }

    /* renamed from: o, reason: from getter */
    public final String getOnRewardedVideoCompleted() {
        return this.onRewardedVideoCompleted;
    }

    /* renamed from: q, reason: from getter */
    public final String getOnRewardedVideoStarted() {
        return this.onRewardedVideoStarted;
    }

    /* renamed from: s, reason: from getter */
    public final String getOnUserRewarded() {
        return this.onUserRewarded;
    }

    public /* synthetic */ B(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.onAdLoadStart = null;
        } else {
            this.onAdLoadStart = str;
        }
        if ((i & 2) == 0) {
            this.onAdLoadFailed = null;
        } else {
            this.onAdLoadFailed = str2;
        }
        if ((i & 4) == 0) {
            this.onAdLoadSuccess = null;
        } else {
            this.onAdLoadSuccess = str3;
        }
        if ((i & 8) == 0) {
            this.onAdShowFailed = null;
        } else {
            this.onAdShowFailed = str4;
        }
        if ((i & 16) == 0) {
            this.onAdShowSuccess = null;
        } else {
            this.onAdShowSuccess = str5;
        }
        if ((i & 32) == 0) {
            this.onAdClicked = null;
        } else {
            this.onAdClicked = str6;
        }
        if ((i & 64) == 0) {
            this.onAdHidden = null;
        } else {
            this.onAdHidden = str7;
        }
        if ((i & 128) == 0) {
            this.onUserRewarded = null;
        } else {
            this.onUserRewarded = str8;
        }
        if ((i & 256) == 0) {
            this.onRewardedVideoStarted = null;
        } else {
            this.onRewardedVideoStarted = str9;
        }
        if ((i & 512) == 0) {
            this.onRewardedVideoCompleted = null;
        } else {
            this.onRewardedVideoCompleted = str10;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getOnAdClicked() {
        return this.onAdClicked;
    }

    public B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.onAdLoadStart = str;
        this.onAdLoadFailed = str2;
        this.onAdLoadSuccess = str3;
        this.onAdShowFailed = str4;
        this.onAdShowSuccess = str5;
        this.onAdClicked = str6;
        this.onAdHidden = str7;
        this.onUserRewarded = str8;
        this.onRewardedVideoStarted = str9;
        this.onRewardedVideoCompleted = str10;
    }

    public /* synthetic */ B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
