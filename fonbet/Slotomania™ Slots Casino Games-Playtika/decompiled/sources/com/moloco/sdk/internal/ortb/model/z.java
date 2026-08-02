package com.moloco.sdk.internal.ortb.model;

import com.braze.Constants;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.C2787a;
import com.moloco.sdk.internal.ortb.model.C2788b;
import com.moloco.sdk.internal.ortb.model.C2789c;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.ortb.model.E;
import com.moloco.sdk.internal.ortb.model.i;
import com.moloco.sdk.internal.ortb.model.k;
import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.v;
import com.moloco.sdk.internal.ortb.model.y;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b6\b\u0001\u0018\u0000 \\2\u00020\u0001:\u0002(/B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u009b\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010*\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010,R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010.\u001a\u0004\b9\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010.\u001a\u0004\bC\u0010DR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010F\u0012\u0004\bA\u0010.\u001a\u0004\b<\u0010GR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010H\u0012\u0004\bK\u0010.\u001a\u0004\bI\u0010JR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010.\u001a\u0004\bN\u0010OR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bQ\u0010.\u001a\u0004\bL\u0010SR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010T\u0012\u0004\b/\u0010.\u001a\u0004\b(\u0010UR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010V\u0012\u0004\b7\u0010.\u001a\u0004\b2\u0010WR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010X\u0012\u0004\b[\u0010.\u001a\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/z;", "", "Lcom/moloco/sdk/internal/ortb/model/D;", "skip", "close", "Lcom/moloco/sdk/internal/ortb/model/A;", "progressBar", "Lcom/moloco/sdk/internal/ortb/model/y;", "mute", "Lcom/moloco/sdk/internal/ortb/model/i;", "cta", "", "isAllAreaClickable", "Lcom/moloco/sdk/internal/ortb/model/c;", "autoStore", "Lcom/moloco/sdk/internal/ortb/model/E;", "vastPrivacyIcon", "Lcom/moloco/sdk/internal/ortb/model/l;", com.safedk.android.analytics.brandsafety.m.Q, "Lcom/moloco/sdk/internal/ortb/model/k;", "countDownTimer", "Lcom/moloco/sdk/internal/ortb/model/a;", "androidInline", "Lcom/moloco/sdk/internal/ortb/model/b;", "autoInline", "Lcom/moloco/sdk/internal/ortb/model/v;", "inlineTextButton", "<init>", "(Lcom/moloco/sdk/internal/ortb/model/D;Lcom/moloco/sdk/internal/ortb/model/D;Lcom/moloco/sdk/internal/ortb/model/A;Lcom/moloco/sdk/internal/ortb/model/y;Lcom/moloco/sdk/internal/ortb/model/i;ZLcom/moloco/sdk/internal/ortb/model/c;Lcom/moloco/sdk/internal/ortb/model/E;Lcom/moloco/sdk/internal/ortb/model/l;Lcom/moloco/sdk/internal/ortb/model/k;Lcom/moloco/sdk/internal/ortb/model/a;Lcom/moloco/sdk/internal/ortb/model/b;Lcom/moloco/sdk/internal/ortb/model/v;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/moloco/sdk/internal/ortb/model/D;Lcom/moloco/sdk/internal/ortb/model/D;Lcom/moloco/sdk/internal/ortb/model/A;Lcom/moloco/sdk/internal/ortb/model/y;Lcom/moloco/sdk/internal/ortb/model/i;ZLcom/moloco/sdk/internal/ortb/model/c;Lcom/moloco/sdk/internal/ortb/model/E;Lcom/moloco/sdk/internal/ortb/model/l;Lcom/moloco/sdk/internal/ortb/model/k;Lcom/moloco/sdk/internal/ortb/model/a;Lcom/moloco/sdk/internal/ortb/model/b;Lcom/moloco/sdk/internal/ortb/model/v;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/moloco/sdk/internal/ortb/model/z;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/moloco/sdk/internal/ortb/model/D;", "u", "()Lcom/moloco/sdk/internal/ortb/model/D;", "v", "()V", "b", "g", "h", "c", "Lcom/moloco/sdk/internal/ortb/model/A;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "()Lcom/moloco/sdk/internal/ortb/model/A;", Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lcom/moloco/sdk/internal/ortb/model/y;", "q", "()Lcom/moloco/sdk/internal/ortb/model/y;", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "e", "Lcom/moloco/sdk/internal/ortb/model/i;", "k", "()Lcom/moloco/sdk/internal/ortb/model/i;", "l", "f", "Z", "y", "()Z", "z", "Lcom/moloco/sdk/internal/ortb/model/c;", "()Lcom/moloco/sdk/internal/ortb/model/c;", "Lcom/moloco/sdk/internal/ortb/model/E;", "w", "()Lcom/moloco/sdk/internal/ortb/model/E;", "x", "i", "Lcom/moloco/sdk/internal/ortb/model/l;", "m", "()Lcom/moloco/sdk/internal/ortb/model/l;", "n", "j", "Lcom/moloco/sdk/internal/ortb/model/k;", "()Lcom/moloco/sdk/internal/ortb/model/k;", "Lcom/moloco/sdk/internal/ortb/model/a;", "()Lcom/moloco/sdk/internal/ortb/model/a;", "Lcom/moloco/sdk/internal/ortb/model/b;", "()Lcom/moloco/sdk/internal/ortb/model/b;", "Lcom/moloco/sdk/internal/ortb/model/v;", "o", "()Lcom/moloco/sdk/internal/ortb/model/v;", "p", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class z {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int n = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final D skip;

    /* renamed from: b, reason: from kotlin metadata */
    public final D close;

    /* renamed from: c, reason: from kotlin metadata */
    public final A progressBar;

    /* renamed from: d, reason: from kotlin metadata */
    public final y mute;

    /* renamed from: e, reason: from kotlin metadata */
    public final i cta;

    /* renamed from: f, reason: from kotlin metadata */
    public final boolean isAllAreaClickable;

    /* renamed from: g, reason: from kotlin metadata */
    public final C2789c autoStore;

    /* renamed from: h, reason: from kotlin metadata */
    public final E vastPrivacyIcon;

    /* renamed from: i, reason: from kotlin metadata */
    public final l dec;

    /* renamed from: j, reason: from kotlin metadata */
    public final k countDownTimer;

    /* renamed from: k, reason: from kotlin metadata */
    public final C2787a androidInline;

    /* renamed from: l, reason: from kotlin metadata */
    public final C2788b autoInline;

    /* renamed from: m, reason: from kotlin metadata */
    public final v inlineTextButton;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<z> {
        public static final a a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Player", aVar, 13);
            pluginGeneratedSerialDescriptor.addElement("skip", true);
            pluginGeneratedSerialDescriptor.addElement("close", false);
            pluginGeneratedSerialDescriptor.addElement("progress_bar", true);
            pluginGeneratedSerialDescriptor.addElement("mute", false);
            pluginGeneratedSerialDescriptor.addElement("cta", true);
            pluginGeneratedSerialDescriptor.addElement("is_all_area_clickable", false);
            pluginGeneratedSerialDescriptor.addElement("auto_store", true);
            pluginGeneratedSerialDescriptor.addElement("vast_privacy_icon", true);
            pluginGeneratedSerialDescriptor.addElement(com.safedk.android.analytics.brandsafety.m.Q, true);
            pluginGeneratedSerialDescriptor.addElement("countdown_timer", true);
            pluginGeneratedSerialDescriptor.addElement("android_inline", true);
            pluginGeneratedSerialDescriptor.addElement("auto_inline", true);
            pluginGeneratedSerialDescriptor.addElement("inline_button", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z deserialize(Decoder decoder) {
            D d;
            D d2;
            v vVar;
            C2788b c2788b;
            k kVar;
            E e;
            i iVar;
            C2787a c2787a;
            C2789c c2789c;
            y yVar;
            int i;
            boolean z;
            l lVar;
            A a2;
            D d3;
            int i2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            D d4 = null;
            if (beginStructure.decodeSequentially()) {
                D.a aVar = D.a.a;
                D d5 = (D) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, aVar, null);
                d = (D) beginStructure.decodeSerializableElement(serialDescriptor, 1, aVar, null);
                A a3 = (A) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, A.a.a, null);
                y yVar2 = (y) beginStructure.decodeSerializableElement(serialDescriptor, 3, y.a.a, null);
                i iVar2 = (i) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i.a.a, null);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 5);
                C2789c c2789c2 = (C2789c) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, C2789c.a.a, null);
                E e2 = (E) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, E.a.a, null);
                l lVar2 = (l) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, l.a.a, null);
                k kVar2 = (k) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, k.a.a, null);
                C2787a c2787a2 = (C2787a) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, C2787a.C0243a.a, null);
                C2788b c2788b2 = (C2788b) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, C2788b.a.a, null);
                vVar = (v) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, v.a.a, null);
                c2788b = c2788b2;
                c2787a = c2787a2;
                kVar = kVar2;
                e = e2;
                c2789c = c2789c2;
                z = decodeBooleanElement;
                yVar = yVar2;
                lVar = lVar2;
                iVar = iVar2;
                a2 = a3;
                i = 8191;
                d2 = d5;
            } else {
                int i3 = 0;
                boolean z2 = false;
                d = null;
                v vVar2 = null;
                C2788b c2788b3 = null;
                k kVar3 = null;
                l lVar3 = null;
                E e3 = null;
                i iVar3 = null;
                C2787a c2787a3 = null;
                C2789c c2789c3 = null;
                y yVar3 = null;
                boolean z3 = true;
                A a4 = null;
                while (z3) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z3 = false;
                            i3 = i3;
                        case 0:
                            d4 = (D) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, D.a.a, d4);
                            i3 |= 1;
                        case 1:
                            d3 = d4;
                            d = (D) beginStructure.decodeSerializableElement(serialDescriptor, 1, D.a.a, d);
                            i2 = i3 | 2;
                            i3 = i2;
                            d4 = d3;
                        case 2:
                            d3 = d4;
                            a4 = (A) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, A.a.a, a4);
                            i2 = i3 | 4;
                            i3 = i2;
                            d4 = d3;
                        case 3:
                            d3 = d4;
                            yVar3 = (y) beginStructure.decodeSerializableElement(serialDescriptor, 3, y.a.a, yVar3);
                            i2 = i3 | 8;
                            i3 = i2;
                            d4 = d3;
                        case 4:
                            d3 = d4;
                            iVar3 = (i) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i.a.a, iVar3);
                            i2 = i3 | 16;
                            i3 = i2;
                            d4 = d3;
                        case 5:
                            d3 = d4;
                            z2 = beginStructure.decodeBooleanElement(serialDescriptor, 5);
                            i3 |= 32;
                            d4 = d3;
                        case 6:
                            d3 = d4;
                            c2789c3 = (C2789c) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, C2789c.a.a, c2789c3);
                            i3 |= 64;
                            d4 = d3;
                        case 7:
                            d3 = d4;
                            e3 = (E) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, E.a.a, e3);
                            i3 |= 128;
                            d4 = d3;
                        case 8:
                            d3 = d4;
                            lVar3 = (l) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, l.a.a, lVar3);
                            i3 |= 256;
                            d4 = d3;
                        case 9:
                            d3 = d4;
                            kVar3 = (k) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, k.a.a, kVar3);
                            i3 |= 512;
                            d4 = d3;
                        case 10:
                            d3 = d4;
                            c2787a3 = (C2787a) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, C2787a.C0243a.a, c2787a3);
                            i3 |= 1024;
                            d4 = d3;
                        case 11:
                            d3 = d4;
                            c2788b3 = (C2788b) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, C2788b.a.a, c2788b3);
                            i3 |= 2048;
                            d4 = d3;
                        case 12:
                            vVar2 = (v) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, v.a.a, vVar2);
                            i3 |= 4096;
                            d4 = d4;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                d2 = d4;
                vVar = vVar2;
                c2788b = c2788b3;
                kVar = kVar3;
                e = e3;
                iVar = iVar3;
                c2787a = c2787a3;
                c2789c = c2789c3;
                yVar = yVar3;
                i = i3;
                z = z2;
                lVar = lVar3;
                a2 = a4;
            }
            D d6 = d;
            beginStructure.endStructure(serialDescriptor);
            return new z(i, d2, d6, a2, yVar, iVar, z, c2789c, e, lVar, kVar, c2787a, c2788b, vVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            D.a aVar = D.a.a;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(aVar), aVar, BuiltinSerializersKt.getNullable(A.a.a), y.a.a, BuiltinSerializersKt.getNullable(i.a.a), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(C2789c.a.a), BuiltinSerializersKt.getNullable(E.a.a), BuiltinSerializersKt.getNullable(l.a.a), BuiltinSerializersKt.getNullable(k.a.a), BuiltinSerializersKt.getNullable(C2787a.C0243a.a), BuiltinSerializersKt.getNullable(C2788b.a.a), BuiltinSerializersKt.getNullable(v.a.a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, z value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            z.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.z$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<z> serializer() {
            return a.a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ z(int i, D d, D d2, A a2, y yVar, i iVar, boolean z, C2789c c2789c, E e, l lVar, k kVar, C2787a c2787a, C2788b c2788b, v vVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (42 != (i & 42)) {
            PluginExceptionsKt.throwMissingFieldException(i, 42, a.a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.skip = null;
        } else {
            this.skip = d;
        }
        this.close = d2;
        if ((i & 4) == 0) {
            this.progressBar = null;
        } else {
            this.progressBar = a2;
        }
        this.mute = yVar;
        if ((i & 16) == 0) {
            this.cta = null;
        } else {
            this.cta = iVar;
        }
        this.isAllAreaClickable = z;
        if ((i & 64) == 0) {
            this.autoStore = null;
        } else {
            this.autoStore = c2789c;
        }
        if ((i & 128) == 0) {
            this.vastPrivacyIcon = null;
        } else {
            this.vastPrivacyIcon = e;
        }
        if ((i & 256) == 0) {
            this.dec = null;
        } else {
            this.dec = lVar;
        }
        if ((i & 512) == 0) {
            this.countDownTimer = null;
        } else {
            this.countDownTimer = kVar;
        }
        if ((i & 1024) == 0) {
            this.androidInline = null;
        } else {
            this.androidInline = c2787a;
        }
        if ((i & 2048) == 0) {
            this.autoInline = null;
        } else {
            this.autoInline = c2788b;
        }
        if ((i & 4096) == 0) {
            this.inlineTextButton = null;
        } else {
            this.inlineTextButton = vVar;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void a(z self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.skip != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, D.a.a, self.skip);
        }
        output.encodeSerializableElement(serialDesc, 1, D.a.a, self.close);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.progressBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, A.a.a, self.progressBar);
        }
        output.encodeSerializableElement(serialDesc, 3, y.a.a, self.mute);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.cta != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, i.a.a, self.cta);
        }
        output.encodeBooleanElement(serialDesc, 5, self.isAllAreaClickable);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.autoStore != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, C2789c.a.a, self.autoStore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.vastPrivacyIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, E.a.a, self.vastPrivacyIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.dec != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, l.a.a, self.dec);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.countDownTimer != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, k.a.a, self.countDownTimer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.androidInline != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, C2787a.C0243a.a, self.androidInline);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.autoInline != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, C2788b.a.a, self.autoInline);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.inlineTextButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, v.a.a, self.inlineTextButton);
    }

    @SerialName("android_inline")
    public static /* synthetic */ void b() {
    }

    @SerialName("auto_inline")
    public static /* synthetic */ void d() {
    }

    @SerialName("auto_store")
    public static /* synthetic */ void f() {
    }

    @SerialName("close")
    public static /* synthetic */ void h() {
    }

    @SerialName("countdown_timer")
    public static /* synthetic */ void j() {
    }

    @SerialName("cta")
    public static /* synthetic */ void l() {
    }

    @SerialName(com.safedk.android.analytics.brandsafety.m.Q)
    public static /* synthetic */ void n() {
    }

    @SerialName("inline_button")
    public static /* synthetic */ void p() {
    }

    @SerialName("mute")
    public static /* synthetic */ void r() {
    }

    @SerialName("progress_bar")
    public static /* synthetic */ void t() {
    }

    @SerialName("skip")
    public static /* synthetic */ void v() {
    }

    @SerialName("vast_privacy_icon")
    public static /* synthetic */ void x() {
    }

    @SerialName("is_all_area_clickable")
    public static /* synthetic */ void z() {
    }

    /* renamed from: c, reason: from getter */
    public final C2788b getAutoInline() {
        return this.autoInline;
    }

    /* renamed from: e, reason: from getter */
    public final C2789c getAutoStore() {
        return this.autoStore;
    }

    /* renamed from: g, reason: from getter */
    public final D getClose() {
        return this.close;
    }

    /* renamed from: i, reason: from getter */
    public final k getCountDownTimer() {
        return this.countDownTimer;
    }

    /* renamed from: k, reason: from getter */
    public final i getCta() {
        return this.cta;
    }

    /* renamed from: m, reason: from getter */
    public final l getDec() {
        return this.dec;
    }

    /* renamed from: o, reason: from getter */
    public final v getInlineTextButton() {
        return this.inlineTextButton;
    }

    /* renamed from: q, reason: from getter */
    public final y getMute() {
        return this.mute;
    }

    /* renamed from: s, reason: from getter */
    public final A getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: u, reason: from getter */
    public final D getSkip() {
        return this.skip;
    }

    /* renamed from: w, reason: from getter */
    public final E getVastPrivacyIcon() {
        return this.vastPrivacyIcon;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getIsAllAreaClickable() {
        return this.isAllAreaClickable;
    }

    /* renamed from: a, reason: from getter */
    public final C2787a getAndroidInline() {
        return this.androidInline;
    }

    public z(D d, D close, A a2, y mute, i iVar, boolean z, C2789c c2789c, E e, l lVar, k kVar, C2787a c2787a, C2788b c2788b, v vVar) {
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(mute, "mute");
        this.skip = d;
        this.close = close;
        this.progressBar = a2;
        this.mute = mute;
        this.cta = iVar;
        this.isAllAreaClickable = z;
        this.autoStore = c2789c;
        this.vastPrivacyIcon = e;
        this.dec = lVar;
        this.countDownTimer = kVar;
        this.androidInline = c2787a;
        this.autoInline = c2788b;
        this.inlineTextButton = vVar;
    }

    public /* synthetic */ z(D d, D d2, A a2, y yVar, i iVar, boolean z, C2789c c2789c, E e, l lVar, k kVar, C2787a c2787a, C2788b c2788b, v vVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, d2, (i & 4) != 0 ? null : a2, yVar, (i & 16) != 0 ? null : iVar, z, (i & 64) != 0 ? null : c2789c, (i & 128) != 0 ? null : e, (i & 256) != 0 ? null : lVar, (i & 512) != 0 ? null : kVar, (i & 1024) != 0 ? null : c2787a, (i & 2048) != 0 ? null : c2788b, (i & 4096) != 0 ? null : vVar);
    }
}
