package com.usercentrics.tcf.core.encoder;

import com.usercentrics.tcf.core.StringOrNumber;
import com.usercentrics.tcf.core.TCFKeys;
import com.usercentrics.tcf.core.TCModel;
import com.usercentrics.tcf.core.TCModelKt;
import com.usercentrics.tcf.core.TCModelPropType;
import com.usercentrics.tcf.core.encoder.field.BooleanEncoder;
import com.usercentrics.tcf.core.encoder.field.DateEncoder;
import com.usercentrics.tcf.core.encoder.field.FixedVectorEncoder;
import com.usercentrics.tcf.core.encoder.field.IntEncoder;
import com.usercentrics.tcf.core.encoder.field.PublisherRestrictionsEncoder;
import com.usercentrics.tcf.core.encoder.sequence.SegmentSequence;
import com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType;
import com.usercentrics.tcf.core.errors.EncodingError;
import com.usercentrics.tcf.core.model.Segment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TCFKeysEncoder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010.2\u0006\u0010+\u001a\u00020,H\u0002R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006/"}, d2 = {"Lcom/usercentrics/tcf/core/encoder/TCFKeysEncoder;", "", "tcModel", "Lcom/usercentrics/tcf/core/TCModel;", "tcString", "", "gdprApplies", "", "(Lcom/usercentrics/tcf/core/TCModel;Ljava/lang/String;I)V", "cmpIdEncoded", "Ljava/lang/Integer;", "cmpVersionEncoded", "consentLanguageEncoded", "consentScreenEncoded", "createdEncoded", "enableAdvertiserConsentMode", "isServiceSpecificEncoded", "lastUpdatedEncoded", "numCustomPurposesEncoded", "policyVersionEncoded", "publisherConsentsEncoded", "publisherCountryCodeEncoded", "publisherCustomConsentsEncoded", "publisherCustomLegitimateInterestsEncoded", "publisherLegitimateInterestsEncoded", "publisherRestrictionsEncoded", "", "purposeConsentsEncoded", "purposeLegitimateInterestsEncoded", "purposeOneTreatmentEncoded", "segmentTypeEncoded", "specialFeatureOptinsEncoded", "useNonStandardStacksEncoded", "vendorConsentsEncoded", "vendorLegitimateInterestsEncoded", "vendorListVersionEncoded", "vendorsAllowedEncoded", "vendorsDisclosedEncoded", "versionEncoded", "encode", "Lcom/usercentrics/tcf/core/TCFKeys;", "encodeSegment", "", "segment", "Lcom/usercentrics/tcf/core/model/Segment;", "getSequenceForSegment", "", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TCFKeysEncoder {
    private Integer cmpIdEncoded;
    private Integer cmpVersionEncoded;
    private String consentLanguageEncoded;
    private String consentScreenEncoded;
    private String createdEncoded;
    private final int enableAdvertiserConsentMode;
    private final int gdprApplies;
    private String isServiceSpecificEncoded;
    private String lastUpdatedEncoded;
    private String numCustomPurposesEncoded;
    private Integer policyVersionEncoded;
    private String publisherConsentsEncoded;
    private String publisherCountryCodeEncoded;
    private String publisherCustomConsentsEncoded;
    private String publisherCustomLegitimateInterestsEncoded;
    private String publisherLegitimateInterestsEncoded;
    private Map<Integer, String> publisherRestrictionsEncoded;
    private String purposeConsentsEncoded;
    private String purposeLegitimateInterestsEncoded;
    private Integer purposeOneTreatmentEncoded;
    private String segmentTypeEncoded;
    private String specialFeatureOptinsEncoded;
    private final TCModel tcModel;
    private final String tcString;
    private Integer useNonStandardStacksEncoded;
    private String vendorConsentsEncoded;
    private String vendorLegitimateInterestsEncoded;
    private String vendorListVersionEncoded;
    private String vendorsAllowedEncoded;
    private String vendorsDisclosedEncoded;
    private Integer versionEncoded;

    public TCFKeysEncoder(TCModel tcModel, String tcString, int i) {
        Intrinsics.checkNotNullParameter(tcModel, "tcModel");
        Intrinsics.checkNotNullParameter(tcString, "tcString");
        this.tcModel = tcModel;
        this.tcString = tcString;
        this.gdprApplies = i;
        this.publisherCountryCodeEncoded = TCModelKt.publisherCountryCodeDefault;
        this.vendorConsentsEncoded = "";
        this.vendorLegitimateInterestsEncoded = "";
        this.purposeConsentsEncoded = "";
        this.purposeLegitimateInterestsEncoded = "";
        this.specialFeatureOptinsEncoded = "";
        this.publisherRestrictionsEncoded = MapsKt.emptyMap();
        this.publisherConsentsEncoded = "";
        this.publisherLegitimateInterestsEncoded = "";
        this.publisherCustomConsentsEncoded = "";
        this.publisherCustomLegitimateInterestsEncoded = "";
        this.enableAdvertiserConsentMode = 1;
        this.numCustomPurposesEncoded = "";
        this.consentScreenEncoded = "";
        this.vendorListVersionEncoded = "";
        this.segmentTypeEncoded = "";
        this.createdEncoded = "";
        this.lastUpdatedEncoded = "";
        this.consentLanguageEncoded = "";
        this.isServiceSpecificEncoded = "";
        this.vendorsDisclosedEncoded = "";
        this.vendorsAllowedEncoded = "";
    }

    public final TCFKeys encode() {
        TCModel process = SemanticPreEncoder.INSTANCE.process(this.tcModel);
        int version_ = process.getVersion_();
        if (version_ != 2) {
            throw new EncodingError("Error encoding TCF String. Invalid version: " + version_);
        }
        SequenceVersionMapType two = new SegmentSequence(process).getTwo();
        Intrinsics.checkNotNull(two, "null cannot be cast to non-null type com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType.List");
        Iterator<T> it = ((SequenceVersionMapType.List) two).getValue().iterator();
        while (it.hasNext()) {
            encodeSegment((Segment) it.next());
        }
        return new TCFKeys(this.cmpIdEncoded, this.cmpVersionEncoded, this.policyVersionEncoded, Integer.valueOf(this.gdprApplies), this.publisherCountryCodeEncoded, this.purposeOneTreatmentEncoded, this.useNonStandardStacksEncoded, this.tcString, this.vendorConsentsEncoded, this.vendorLegitimateInterestsEncoded, this.purposeConsentsEncoded, this.purposeLegitimateInterestsEncoded, this.specialFeatureOptinsEncoded, this.publisherRestrictionsEncoded, this.publisherConsentsEncoded, this.publisherLegitimateInterestsEncoded, this.publisherCustomConsentsEncoded, this.publisherCustomLegitimateInterestsEncoded, this.enableAdvertiserConsentMode, this.vendorsDisclosedEncoded);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02bf A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ce A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0236 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024b A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0268 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x033a A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0348 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0385 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0398 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03ab A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03c7 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e3 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168 A[Catch: all -> 0x044e, TryCatch #4 {all -> 0x044e, blocks: (B:208:0x008e, B:210:0x0096, B:20:0x00ad, B:22:0x00b5, B:51:0x00cc, B:53:0x00d4, B:56:0x00eb, B:61:0x036b, B:63:0x0385, B:64:0x0392, B:66:0x0398, B:67:0x03a5, B:69:0x03ab, B:70:0x03c1, B:72:0x03c7, B:73:0x03dd, B:75:0x03e3, B:79:0x00f3, B:82:0x013e, B:84:0x014c, B:85:0x0162, B:87:0x0168, B:91:0x00fa, B:93:0x0102, B:96:0x0119, B:98:0x0121, B:101:0x0138, B:104:0x017f, B:106:0x0187, B:109:0x019e, B:112:0x02b1, B:114:0x02bf, B:115:0x02c8, B:117:0x02ce, B:121:0x01a6, B:124:0x0228, B:126:0x0236, B:127:0x0245, B:129:0x024b, B:130:0x0262, B:132:0x0268, B:136:0x01ae, B:138:0x01b6, B:141:0x01cd, B:143:0x01d5, B:146:0x01ec, B:150:0x01f3, B:153:0x032c, B:155:0x033a, B:157:0x0348, B:160:0x01fb, B:162:0x0203, B:165:0x021b, B:169:0x0222, B:172:0x0280, B:175:0x028c, B:177:0x0294, B:180:0x02ab, B:183:0x02d8, B:185:0x02e0, B:188:0x02f7, B:190:0x02ff, B:193:0x0317, B:196:0x0324, B:199:0x035f, B:202:0x03f0, B:204:0x03f8, B:26:0x0415), top: B:207:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x040d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void encodeSegment(Segment segment) {
        int integer;
        String str;
        String str2;
        Segment segment2;
        String str3;
        Object obj;
        Object obj2;
        String str4 = "->";
        String str5 = "Error encoding ";
        List<String> sequenceForSegment = getSequenceForSegment(segment);
        if (sequenceForSegment != null) {
            Iterator it = sequenceForSegment.iterator();
            while (it.hasNext()) {
                String str6 = (String) it.next();
                TCModelPropType fieldByName = this.tcModel.getFieldByName(str6);
                BitLength byName = BitLength.INSTANCE.getByName(str6);
                if (byName == null) {
                    if (SegmentEncoder.INSTANCE.isPublisherCustom(str6)) {
                        StringOrNumber numCustomPurposes = this.tcModel.getNumCustomPurposes();
                        integer = numCustomPurposes instanceof StringOrNumber.Int ? ((StringOrNumber.Int) numCustomPurposes).getValue() : 0;
                        if (numCustomPurposes instanceof StringOrNumber.String) {
                            integer = Integer.parseInt(((StringOrNumber.String) numCustomPurposes).getValue());
                        }
                    }
                } else {
                    integer = byName.getInteger();
                }
                try {
                    Iterator it2 = it;
                    String str7 = str4;
                    String str8 = str5;
                    switch (str6.hashCode()) {
                        case -2115730175:
                            if (str6.equals("vendorConsents")) {
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                this.vendorConsentsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                                it = it2;
                                str4 = str7;
                                str5 = str8;
                            } else {
                                str2 = str8;
                                try {
                                    segment2 = segment;
                                    try {
                                        str = str7;
                                        try {
                                            throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                                        } catch (Throwable th) {
                                            th = th;
                                            throw new EncodingError(str2 + segment2 + str + str6 + ": " + th.getMessage());
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str7;
                                        throw new EncodingError(str2 + segment2 + str + str6 + ": " + th.getMessage());
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    segment2 = segment;
                                }
                            }
                        case -2076485454:
                            str3 = "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber";
                            obj = "policyVersion";
                            obj2 = "cmpVersion";
                            if (!str6.equals(obj2)) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, str3);
                            StringOrNumber value = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                            if (Intrinsics.areEqual(str6, "cmpId")) {
                                this.cmpIdEncoded = Integer.valueOf(((StringOrNumber.Int) value).getValue());
                            }
                            if (Intrinsics.areEqual(str6, obj2)) {
                                this.cmpVersionEncoded = Integer.valueOf(((StringOrNumber.Int) value).getValue());
                            }
                            if (Intrinsics.areEqual(str6, "consentScreen")) {
                                this.consentScreenEncoded = IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((StringOrNumber.Int) value).getValue()), integer);
                            }
                            if (Intrinsics.areEqual(str6, "vendorListVersion")) {
                                this.vendorListVersionEncoded = IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((StringOrNumber.Int) value).getValue()), integer);
                            }
                            if (Intrinsics.areEqual(str6, obj)) {
                                this.policyVersionEncoded = Integer.valueOf(((StringOrNumber.Int) value).getValue());
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case -2014745908:
                            if (!str6.equals("numCustomPurposes")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Int");
                            if (Intrinsics.areEqual(str6, "version")) {
                                this.numCustomPurposesEncoded = IntEncoder.INSTANCE.encode(new StringOrNumber.Int(((TCModelPropType.Int) fieldByName).getValue()), integer);
                            } else {
                                this.versionEncoded = Integer.valueOf(((TCModelPropType.Int) fieldByName).getValue());
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case -1710804154:
                            str3 = "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber";
                            obj = "policyVersion";
                            if (!str6.equals(obj)) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            obj2 = "cmpVersion";
                            Intrinsics.checkNotNull(fieldByName, str3);
                            StringOrNumber value2 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                            if (Intrinsics.areEqual(str6, "cmpId")) {
                            }
                            if (Intrinsics.areEqual(str6, obj2)) {
                            }
                            if (Intrinsics.areEqual(str6, "consentScreen")) {
                            }
                            if (Intrinsics.areEqual(str6, "vendorListVersion")) {
                            }
                            if (Intrinsics.areEqual(str6, obj)) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case -952905459:
                            if (!str6.equals("segmentType")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber");
                            this.segmentTypeEncoded = IntEncoder.INSTANCE.encode(((TCModelPropType.StringOrNumber) fieldByName).getValue(), integer);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case -879778089:
                            if (!str6.equals("purposeConsents")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.purposeConsentsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case -740692217:
                            if (!str6.equals("publisherCountryCode")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.String");
                            if (Intrinsics.areEqual(str6, "consentLanguage")) {
                                this.consentLanguageEncoded = ((TCModelPropType.String) fieldByName).getValue();
                            }
                            if (!Intrinsics.areEqual(str6, "publisherCountryCode")) {
                                this.publisherCountryCodeEncoded = ((TCModelPropType.String) fieldByName).getValue();
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case -442009786:
                            if (!str6.equals("publisherCustomConsents")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.publisherCustomConsentsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case -145526490:
                            if (!str6.equals("consentScreen")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            str3 = "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber";
                            obj = "policyVersion";
                            obj2 = "cmpVersion";
                            Intrinsics.checkNotNull(fieldByName, str3);
                            StringOrNumber value22 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                            Intrinsics.checkNotNull(value22, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                            if (Intrinsics.areEqual(str6, "cmpId")) {
                            }
                            if (Intrinsics.areEqual(str6, obj2)) {
                            }
                            if (Intrinsics.areEqual(str6, "consentScreen")) {
                            }
                            if (Intrinsics.areEqual(str6, "vendorListVersion")) {
                            }
                            if (Intrinsics.areEqual(str6, obj)) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case -117505923:
                            if (!str6.equals("isServiceSpecific")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Boolean");
                            if (Intrinsics.areEqual(str6, "isServiceSpecific")) {
                                this.isServiceSpecificEncoded = BooleanEncoder.INSTANCE.encode(((TCModelPropType.Boolean) fieldByName).getValue());
                            }
                            if (Intrinsics.areEqual(str6, "useNonStandardStacks")) {
                                this.useNonStandardStacksEncoded = Integer.valueOf(Integer.parseInt(BooleanEncoder.INSTANCE.encode(((TCModelPropType.Boolean) fieldByName).getValue())));
                            }
                            if (Intrinsics.areEqual(str6, "purposeOneTreatment")) {
                                this.purposeOneTreatmentEncoded = Integer.valueOf(Integer.parseInt(BooleanEncoder.INSTANCE.encode(((TCModelPropType.Boolean) fieldByName).getValue())));
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 94785793:
                            if (!str6.equals("cmpId")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            str3 = "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber";
                            obj = "policyVersion";
                            obj2 = "cmpVersion";
                            Intrinsics.checkNotNull(fieldByName, str3);
                            StringOrNumber value222 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                            Intrinsics.checkNotNull(value222, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                            if (Intrinsics.areEqual(str6, "cmpId")) {
                            }
                            if (Intrinsics.areEqual(str6, obj2)) {
                            }
                            if (Intrinsics.areEqual(str6, "consentScreen")) {
                            }
                            if (Intrinsics.areEqual(str6, "vendorListVersion")) {
                            }
                            if (Intrinsics.areEqual(str6, obj)) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case 204489283:
                            if (!str6.equals("publisherRestrictions")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.PurposeRestrictionVector");
                            this.publisherRestrictionsEncoded = PublisherRestrictionsEncoder.INSTANCE.encode(((TCModelPropType.PurposeRestrictionVector) fieldByName).getValue());
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 351608024:
                            if (!str6.equals("version")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Int");
                            if (Intrinsics.areEqual(str6, "version")) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case 439958894:
                            if (!str6.equals("useNonStandardStacks")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Boolean");
                            if (Intrinsics.areEqual(str6, "isServiceSpecific")) {
                            }
                            if (Intrinsics.areEqual(str6, "useNonStandardStacks")) {
                            }
                            if (Intrinsics.areEqual(str6, "purposeOneTreatment")) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case 501667126:
                            if (!str6.equals("purposeLegitimateInterests")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.purposeLegitimateInterestsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 544050613:
                            if (!str6.equals("publisherConsents")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.publisherConsentsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 568283376:
                            if (!str6.equals("purposeOneTreatment")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Boolean");
                            if (Intrinsics.areEqual(str6, "isServiceSpecific")) {
                            }
                            if (Intrinsics.areEqual(str6, "useNonStandardStacks")) {
                            }
                            if (Intrinsics.areEqual(str6, "purposeOneTreatment")) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case 680983954:
                            if (!str6.equals("consentLanguage")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.String");
                            if (Intrinsics.areEqual(str6, "consentLanguage")) {
                            }
                            if (!Intrinsics.areEqual(str6, "publisherCountryCode")) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case 1000364236:
                            if (!str6.equals("vendorLegitimateInterests")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.vendorLegitimateInterestsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 1028554472:
                            if (!str6.equals("created")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Date");
                            if (Intrinsics.areEqual(str6, "created")) {
                                DateEncoder.Companion companion = DateEncoder.INSTANCE;
                                Long value3 = ((TCModelPropType.Date) fieldByName).getValue();
                                Intrinsics.checkNotNull(value3);
                                this.createdEncoded = companion.encode(value3.longValue(), integer);
                            }
                            if (!Intrinsics.areEqual(str6, "lastUpdated")) {
                                DateEncoder.Companion companion2 = DateEncoder.INSTANCE;
                                Long value4 = ((TCModelPropType.Date) fieldByName).getValue();
                                Intrinsics.checkNotNull(value4);
                                this.lastUpdatedEncoded = companion2.encode(value4.longValue(), integer);
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 1272166759:
                            if (!str6.equals("publisherCustomLegitimateInterests")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.publisherCustomLegitimateInterestsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 1401591704:
                            if (!str6.equals("publisherLegitimateInterests")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.publisherLegitimateInterestsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 1649733957:
                            if (!str6.equals("lastUpdated")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Date");
                            if (Intrinsics.areEqual(str6, "created")) {
                            }
                            if (!Intrinsics.areEqual(str6, "lastUpdated")) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case 1722227698:
                            if (!str6.equals("vendorListVersion")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            str3 = "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.StringOrNumber";
                            obj = "policyVersion";
                            obj2 = "cmpVersion";
                            Intrinsics.checkNotNull(fieldByName, str3);
                            StringOrNumber value2222 = ((TCModelPropType.StringOrNumber) fieldByName).getValue();
                            Intrinsics.checkNotNull(value2222, "null cannot be cast to non-null type com.usercentrics.tcf.core.StringOrNumber.Int");
                            if (Intrinsics.areEqual(str6, "cmpId")) {
                            }
                            if (Intrinsics.areEqual(str6, obj2)) {
                            }
                            if (Intrinsics.areEqual(str6, "consentScreen")) {
                            }
                            if (Intrinsics.areEqual(str6, "vendorListVersion")) {
                            }
                            if (Intrinsics.areEqual(str6, obj)) {
                            }
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                            break;
                        case 1886388920:
                            if (!str6.equals("specialFeatureOptins")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.specialFeatureOptinsEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 1982848911:
                            if (!str6.equals("vendorsDisclosed")) {
                                str2 = str8;
                                segment2 = segment;
                                str = str7;
                                throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                            }
                            Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                            this.vendorsDisclosedEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                            it = it2;
                            str4 = str7;
                            str5 = str8;
                        case 1995874045:
                            try {
                                if (!str6.equals("vendorsAllowed")) {
                                    str2 = str8;
                                    segment2 = segment;
                                    str = str7;
                                    throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                                }
                                Intrinsics.checkNotNull(fieldByName, "null cannot be cast to non-null type com.usercentrics.tcf.core.TCModelPropType.Vector");
                                this.vendorsAllowedEncoded = FixedVectorEncoder.INSTANCE.encode(((TCModelPropType.Vector) fieldByName).getValue(), null);
                                it = it2;
                                str4 = str7;
                                str5 = str8;
                            } catch (Throwable th4) {
                                th = th4;
                                segment2 = segment;
                                str = str7;
                                str2 = str8;
                                throw new EncodingError(str2 + segment2 + str + str6 + ": " + th.getMessage());
                            }
                        default:
                            str2 = str8;
                            segment2 = segment;
                            str = str7;
                            throw new EncodingError(str2 + segment2 + str + str6 + ", value: " + fieldByName);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str = str4;
                    str2 = str5;
                    segment2 = segment;
                }
            }
        }
    }

    private final List<String> getSequenceForSegment(Segment segment) {
        SequenceVersionMapType two = SegmentEncoder.INSTANCE.getFieldSequence().getTwo();
        Intrinsics.checkNotNull(two, "null cannot be cast to non-null type com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType.SVMItemMap");
        return ((SequenceVersionMapType.SVMItemMap) two).getMap().get(segment);
    }
}
