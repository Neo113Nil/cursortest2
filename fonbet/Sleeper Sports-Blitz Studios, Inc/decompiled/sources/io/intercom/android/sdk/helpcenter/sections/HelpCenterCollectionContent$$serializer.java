package io.intercom.android.sdk.helpcenter.sections;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* compiled from: HelpCenterCollectionContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes9.dex */
public /* synthetic */ class HelpCenterCollectionContent$$serializer implements GeneratedSerializer<HelpCenterCollectionContent> {
    public static final int $stable;
    public static final HelpCenterCollectionContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private HelpCenterCollectionContent$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HelpCenterCollectionContent$$serializer helpCenterCollectionContent$$serializer = new HelpCenterCollectionContent$$serializer();
        INSTANCE = helpCenterCollectionContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent", helpCenterCollectionContent$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("articles", true);
        pluginGeneratedSerialDescriptor.addElement("sections", true);
        pluginGeneratedSerialDescriptor.addElement("collections", true);
        pluginGeneratedSerialDescriptor.addElement("article_count", false);
        pluginGeneratedSerialDescriptor.addElement("authors", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = HelpCenterCollectionContent.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[3], kSerializerArr[4], kSerializerArr[5], IntSerializer.INSTANCE, kSerializerArr[7]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final HelpCenterCollectionContent deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        List list2;
        List list3;
        List list4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        kSerializerArr = HelpCenterCollectionContent.$childSerializers;
        int i3 = 6;
        int i4 = 4;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            List list5 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list6 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            List list7 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 6);
            list3 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str = decodeStringElement;
            i2 = decodeIntElement;
            str3 = decodeStringElement3;
            i = 255;
            list2 = list7;
            list = list5;
            list4 = list6;
            str2 = decodeStringElement2;
        } else {
            boolean z = true;
            int i5 = 0;
            List list8 = null;
            List list9 = null;
            List list10 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i6 = 0;
            List list11 = null;
            while (z) {
                int i7 = i4;
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 4;
                    case 0:
                        i6 |= 1;
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 6;
                        i4 = 4;
                    case 1:
                        i6 |= 2;
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = 6;
                        i4 = 4;
                    case 2:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i3 = 6;
                        i4 = 4;
                    case 3:
                        list11 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list11);
                        i6 |= 8;
                        i3 = 6;
                        i4 = 4;
                    case 4:
                        list10 = (List) beginStructure.decodeSerializableElement(serialDescriptor, i7, kSerializerArr[i7], list10);
                        i6 |= 16;
                        i4 = i7;
                        i3 = 6;
                    case 5:
                        list8 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list8);
                        i6 |= 32;
                        i4 = i7;
                    case 6:
                        i5 = beginStructure.decodeIntElement(serialDescriptor, i3);
                        i6 |= 64;
                        i4 = i7;
                    case 7:
                        list9 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list9);
                        i6 |= 128;
                        i4 = i7;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            String str7 = str6;
            list = list11;
            i = i6;
            str = str4;
            str2 = str5;
            str3 = str7;
            i2 = i5;
            list2 = list8;
            list3 = list9;
            list4 = list10;
        }
        beginStructure.endStructure(serialDescriptor);
        return new HelpCenterCollectionContent(i, str, str2, str3, list, list4, list2, i2, list3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, HelpCenterCollectionContent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        HelpCenterCollectionContent.write$Self$intercom_sdk_base_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
