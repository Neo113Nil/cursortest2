package com.usercentrics.tcf.core.encoder;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.tcf.core.StringOrNumber;
import com.usercentrics.tcf.core.TCModel;
import com.usercentrics.tcf.core.TCModelPropType;
import com.usercentrics.tcf.core.encoder.field.BooleanEncoder;
import com.usercentrics.tcf.core.encoder.field.DateEncoder;
import com.usercentrics.tcf.core.encoder.field.FixedVectorEncoder;
import com.usercentrics.tcf.core.encoder.field.IntEncoder;
import com.usercentrics.tcf.core.encoder.field.LangEncoder;
import com.usercentrics.tcf.core.encoder.field.PurposeRestrictionVectorEncoder;
import com.usercentrics.tcf.core.encoder.field.VendorVectorEncoder;
import com.usercentrics.tcf.core.encoder.sequence.FieldSequence;
import com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType;
import com.usercentrics.tcf.core.errors.DecodingError;
import com.usercentrics.tcf.core.errors.EncodingError;
import com.usercentrics.tcf.core.model.Segment;
import com.usercentrics.tcf.core.model.SegmentIDs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SegmentEncoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/tcf/core/encoder/SegmentEncoder;", "", "()V", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SegmentEncoder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FieldSequence fieldSequence = new FieldSequence();

    /* compiled from: SegmentEncoder.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/usercentrics/tcf/core/encoder/SegmentEncoder$Companion;", "", "()V", "fieldSequence", "Lcom/usercentrics/tcf/core/encoder/sequence/FieldSequence;", "getFieldSequence", "()Lcom/usercentrics/tcf/core/encoder/sequence/FieldSequence;", "decode", "Lcom/usercentrics/tcf/core/TCModel;", "encodedString", "", "tcModel", "segment", "encode", "Lcom/usercentrics/tcf/core/model/Segment;", "encode$usercentrics_release", "isPublisherCustom", "", "key", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FieldSequence getFieldSequence() {
            return SegmentEncoder.fieldSequence;
        }

        public final String encode$usercentrics_release(TCModel tcModel, Segment segment) {
            String str;
            int integer;
            Intrinsics.checkNotNullParameter(tcModel, "tcModel");
            Intrinsics.checkNotNullParameter(segment, "segment");
            int version_ = tcModel.getVersion_();
            if (version_ != 2) {
                throw new EncodingError("Unsupported TCF version: " + version_);
            }
            SequenceVersionMapType two = getFieldSequence().getTwo();
            Intrinsics.checkNotNull(two, "null cannot be cast to non-null type com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType.SVMItemMap");
            List<String> list = ((SequenceVersionMapType.SVMItemMap) two).getMap().get(segment);
            if (segment != Segment.CORE) {
                Integer num = SegmentIDs.INSTANCE.getKEY_TO_ID().get(segment);
                if (num == null) {
                    throw new EncodingError("Unable to find segment key for " + segment);
                }
                IntEncoder.Companion companion = IntEncoder.INSTANCE;
                StringOrNumber.Int r6 = new StringOrNumber.Int(num.intValue());
                BitLength byName = BitLength.INSTANCE.getByName("segmentType");
                Integer valueOf = byName != null ? Integer.valueOf(byName.getInteger()) : null;
                Intrinsics.checkNotNull(valueOf);
                str = companion.encode(r6, valueOf.intValue());
            } else {
                str = "";
            }
            if (list != null) {
                for (String str2 : list) {
                    TCModelPropType fieldByName = tcModel.getFieldByName(str2);
                    BitLength byName2 = BitLength.INSTANCE.getByName(str2);
                    if (byName2 == null) {
                        if (SegmentEncoder.INSTANCE.isPublisherCustom(str2)) {
                            StringOrNumber numCustomPurposes = tcModel.getNumCustomPurposes();
                            integer = numCustomPurposes instanceof StringOrNumber.Int ? ((StringOrNumber.Int) numCustomPurposes).getValue() : 0;
                            if (numCustomPurposes instanceof StringOrNumber.String) {
                                integer = Integer.parseInt(((StringOrNumber.String) numCustomPurposes).getValue());
                            }
                        }
                    } else {
                        integer = byName2.getInteger();
                    }
                    try {
                        switch (str2.hashCode()) {
                            case -2115730175:
                                if (!str2.equals("vendorConsents")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + VendorVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue());
                            case -2076485454:
                                if (!str2.equals("cmpVersion")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber");
                                StringOrNumber value = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((StringOrNumber.Int) value).getValue()), integer);
                            case -2014745908:
                                if (!str2.equals("numCustomPurposes")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Int");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((TCModelPropType.Int) fieldByName).getValue()), integer);
                            case -1710804154:
                                if (!str2.equals("policyVersion")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber");
                                StringOrNumber value2 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((StringOrNumber.Int) value2).getValue()), integer);
                            case -952905459:
                                if (!str2.equals("segmentType")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(((TCModelPropType.StringOrNumber) fieldByName).getValue(), integer);
                            case -879778089:
                                if (!str2.equals("purposeConsents")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), Integer.valueOf(integer));
                            case -740692217:
                                if (!str2.equals("publisherCountryCode")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.String");
                                str = ((Object) str) + LangEncoder.INSTANCE.encode(((TCModelPropType.String) fieldByName).getValue(), integer);
                            case -442009786:
                                if (!str2.equals("publisherCustomConsents")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), Integer.valueOf(integer));
                            case -145526490:
                                if (!str2.equals("consentScreen")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber");
                                StringOrNumber value22 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                                Intrinsics.checkNotNull(value22, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((StringOrNumber.Int) value22).getValue()), integer);
                            case -117505923:
                                if (!str2.equals("isServiceSpecific")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Boolean");
                                str = ((Object) str) + BooleanEncoder.INSTANCE.encode(((TCModelPropType.Boolean) fieldByName).getValue());
                            case 94785793:
                                if (!str2.equals("cmpId")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber");
                                StringOrNumber value222 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                                Intrinsics.checkNotNull(value222, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((StringOrNumber.Int) value222).getValue()), integer);
                            case 204489283:
                                if (!str2.equals("publisherRestrictions")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.PurposeRestrictionVector");
                                str = ((Object) str) + PurposeRestrictionVectorEncoder.INSTANCE.encode(((TCModelPropType.PurposeRestrictionVector) fieldByName).getValue());
                            case 351608024:
                                if (!str2.equals("version")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Int");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((TCModelPropType.Int) fieldByName).getValue()), integer);
                            case 439958894:
                                if (!str2.equals("useNonStandardStacks")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Boolean");
                                str = ((Object) str) + BooleanEncoder.INSTANCE.encode(((TCModelPropType.Boolean) fieldByName).getValue());
                            case 501667126:
                                if (!str2.equals("purposeLegitimateInterests")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), Integer.valueOf(integer));
                            case 544050613:
                                if (!str2.equals("publisherConsents")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), Integer.valueOf(integer));
                            case 568283376:
                                if (!str2.equals("purposeOneTreatment")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Boolean");
                                str = ((Object) str) + BooleanEncoder.INSTANCE.encode(((TCModelPropType.Boolean) fieldByName).getValue());
                            case 680983954:
                                if (!str2.equals("consentLanguage")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.String");
                                str = ((Object) str) + LangEncoder.INSTANCE.encode(((TCModelPropType.String) fieldByName).getValue(), integer);
                            case 1000364236:
                                if (!str2.equals("vendorLegitimateInterests")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + VendorVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue());
                            case 1028554472:
                                if (!str2.equals("created")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Date");
                                DateEncoder.Companion companion2 = DateEncoder.INSTANCE;
                                Long value3 = ((TCModelPropType.Date) fieldByName).getValue();
                                Intrinsics.checkNotNull(value3);
                                str = ((Object) str) + companion2.encode(value3.longValue(), integer);
                            case 1272166759:
                                if (!str2.equals("publisherCustomLegitimateInterests")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), Integer.valueOf(integer));
                            case 1401591704:
                                if (!str2.equals("publisherLegitimateInterests")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), Integer.valueOf(integer));
                            case 1649733957:
                                if (!str2.equals("lastUpdated")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Date");
                                DateEncoder.Companion companion22 = DateEncoder.INSTANCE;
                                Long value32 = ((TCModelPropType.Date) fieldByName).getValue();
                                Intrinsics.checkNotNull(value32);
                                str = ((Object) str) + companion22.encode(value32.longValue(), integer);
                            case 1722227698:
                                if (!str2.equals("vendorListVersion")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber");
                                StringOrNumber value2222 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                                Intrinsics.checkNotNull(value2222, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                                str = ((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((StringOrNumber.Int) value2222).getValue()), integer);
                            case 1886388920:
                                if (!str2.equals("specialFeatureOptins")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), Integer.valueOf(integer));
                            case 1982848911:
                                if (!str2.equals("vendorsDisclosed")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + VendorVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue());
                            case 1995874045:
                                if (!str2.equals("vendorsAllowed")) {
                                    throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                str = ((Object) str) + VendorVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue());
                            default:
                                throw new EncodingError("Error encoding " + segment + "->" + str2 + ", value: " + fieldByName);
                        }
                    } catch (Throwable th) {
                        throw new EncodingError("Error encoding " + segment + "->" + str2 + ": " + th.getMessage());
                    }
                }
            }
            return Base64Url.INSTANCE.encode(str);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:31:0x03c4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x03cb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TCModel decode(String encodedString, TCModel tcModel, String segment) {
            int bitLength;
            Intrinsics.checkNotNullParameter(encodedString, "encodedString");
            Intrinsics.checkNotNullParameter(tcModel, "tcModel");
            Intrinsics.checkNotNullParameter(segment, "segment");
            String decode = Base64Url.INSTANCE.decode(encodedString);
            if (Intrinsics.areEqual(segment, Segment.CORE.getType())) {
                IntEncoder.Companion companion = IntEncoder.INSTANCE;
                String substring = decode.substring(0, BitLength.version.getInteger());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                tcModel.setVersion(new StringOrNumber.Int((int) companion.decode(substring, BitLength.version.getInteger())));
            }
            int integer = !Intrinsics.areEqual(segment, Segment.CORE.getType()) ? BitLength.segmentType.getInteger() : 0;
            SequenceVersionMapType two = getFieldSequence().getTwo();
            Intrinsics.checkNotNull(two, "null cannot be cast to non-null type com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType.SVMItemMap");
            List<String> list = ((SequenceVersionMapType.SVMItemMap) two).getMap().get(Segment.INSTANCE.getSegmentByType(segment));
            if (list == null) {
                throw new IllegalStateException("Unable to find fieldSequence".toString());
            }
            for (String str : list) {
                BitLength byName = BitLength.INSTANCE.getByName(str);
                Integer valueOf = byName != null ? Integer.valueOf(byName.getInteger()) : null;
                if (valueOf == null && SegmentEncoder.INSTANCE.isPublisherCustom(str)) {
                    StringOrNumber numCustomPurposes = tcModel.getNumCustomPurposes();
                    Intrinsics.checkNotNull(numCustomPurposes, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                    valueOf = Integer.valueOf(((StringOrNumber.Int) numCustomPurposes).getValue());
                }
                if (valueOf == null || valueOf.intValue() != 0) {
                    String substring2 = decode.substring(integer, valueOf == null ? decode.length() : valueOf.intValue() + integer);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    switch (str.hashCode()) {
                        case -2115730175:
                            if (str.equals("vendorConsents")) {
                                tcModel.setVendorConsents(VendorVectorEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                    bitLength = valueOf.intValue();
                                } else {
                                    TCModelPropType fieldByName = tcModel.getFieldByName(str);
                                    if (fieldByName instanceof TCModelPropType.Vector) {
                                        bitLength = ((TCModelPropType.Vector) fieldByName).getValue().getBitLength();
                                    } else {
                                        if (!(fieldByName instanceof TCModelPropType.PurposeRestrictionVector)) {
                                            throw new DecodingError("Unable to increase bitLength for key: " + str);
                                        }
                                        bitLength = ((TCModelPropType.PurposeRestrictionVector) fieldByName).getValue().getBitLength();
                                    }
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                        case -2076485454:
                            if (str.equals("cmpVersion")) {
                                tcModel.setCmpVersion(new StringOrNumber.Int((int) IntEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -2014745908:
                            if (str.equals("numCustomPurposes")) {
                                tcModel.setNumCustomPurposes(new StringOrNumber.Int((int) IntEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -1710804154:
                            if (str.equals("policyVersion")) {
                                tcModel.setPolicyVersion(new StringOrNumber.Int((int) IntEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -879778089:
                            if (str.equals("purposeConsents")) {
                                tcModel.setPurposeConsents(FixedVectorEncoder.INSTANCE.decode(substring2, Integer.valueOf(valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -740692217:
                            if (str.equals("publisherCountryCode")) {
                                tcModel.setPublisherCountryCode(LangEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -442009786:
                            if (str.equals("publisherCustomConsents")) {
                                tcModel.setPublisherCustomConsents(FixedVectorEncoder.INSTANCE.decode(substring2, Integer.valueOf(valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -145526490:
                            if (str.equals("consentScreen")) {
                                tcModel.setConsentScreen(new StringOrNumber.Int((int) IntEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case -117505923:
                            if (str.equals("isServiceSpecific")) {
                                tcModel.setIsServiceSpecific(BooleanEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 94785793:
                            if (str.equals("cmpId")) {
                                tcModel.setCmpId(new StringOrNumber.Int((int) IntEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 204489283:
                            if (str.equals("publisherRestrictions")) {
                                tcModel.setPublisherRestrictions(PurposeRestrictionVectorEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 351608024:
                            if (str.equals("version")) {
                                tcModel.setVersion(new StringOrNumber.Int((int) IntEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 439958894:
                            if (str.equals("useNonStandardStacks")) {
                                tcModel.setUseNonStandardStacks(BooleanEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 501667126:
                            if (str.equals("purposeLegitimateInterests")) {
                                tcModel.setPurposeLegitimateInterests(FixedVectorEncoder.INSTANCE.decode(substring2, Integer.valueOf(valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 544050613:
                            if (str.equals("publisherConsents")) {
                                tcModel.setPublisherConsents(FixedVectorEncoder.INSTANCE.decode(substring2, Integer.valueOf(valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 568283376:
                            if (str.equals("purposeOneTreatment")) {
                                tcModel.setPurposeOneTreatment(BooleanEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 680983954:
                            if (str.equals("consentLanguage")) {
                                tcModel.setConsentLanguage(LangEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1000364236:
                            if (str.equals("vendorLegitimateInterests")) {
                                tcModel.setVendorLegitimateInterests(VendorVectorEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1028554472:
                            if (str.equals("created")) {
                                tcModel.setCreated(Long.valueOf(DateEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1272166759:
                            if (str.equals("publisherCustomLegitimateInterests")) {
                                tcModel.setPublisherCustomLegitimateInterests(FixedVectorEncoder.INSTANCE.decode(substring2, Integer.valueOf(valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1401591704:
                            if (str.equals("publisherLegitimateInterests")) {
                                tcModel.setPublisherLegitimateInterests(FixedVectorEncoder.INSTANCE.decode(substring2, Integer.valueOf(valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1649733957:
                            if (str.equals("lastUpdated")) {
                                tcModel.setLastUpdated(Long.valueOf(DateEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1722227698:
                            if (str.equals("vendorListVersion")) {
                                tcModel.setVendorListVersion(new StringOrNumber.Int((int) IntEncoder.INSTANCE.decode(substring2, valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1886388920:
                            if (str.equals("specialFeatureOptins")) {
                                tcModel.setSpecialFeatureOptins(FixedVectorEncoder.INSTANCE.decode(substring2, Integer.valueOf(valueOf != null ? valueOf.intValue() : 0)));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1982848911:
                            if (str.equals("vendorsDisclosed")) {
                                tcModel.setVendorsDisclosed(VendorVectorEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 1995874045:
                            if (str.equals("vendorsAllowed")) {
                                tcModel.setVendorsAllowed(VendorVectorEncoder.INSTANCE.decode(substring2));
                                if (valueOf == null) {
                                }
                                integer += bitLength;
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                    throw new DecodingError("Unable to set decoded version of the key: " + str);
                }
            }
            return tcModel;
        }

        public final boolean isPublisherCustom(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return StringsKt.indexOf$default((CharSequence) key, "publisherCustom", 0, false, 6, (Object) null) == 0;
        }
    }
}
