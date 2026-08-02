package com.usercentrics.tcf.core.encoder.field;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.tcf.core.GVL;
import com.usercentrics.tcf.core.StringOrNumber;
import com.usercentrics.tcf.core.encoder.BitLength;
import com.usercentrics.tcf.core.encoder.field.BooleanEncoder;
import com.usercentrics.tcf.core.encoder.field.IntEncoder;
import com.usercentrics.tcf.core.errors.DecodingError;
import com.usercentrics.tcf.core.model.PurposeRestriction;
import com.usercentrics.tcf.core.model.PurposeRestrictionVector;
import com.usercentrics.tcf.core.model.RestrictionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurposeRestrictionVectorEncoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/tcf/core/encoder/field/PurposeRestrictionVectorEncoder;", "", "()V", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PurposeRestrictionVectorEncoder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: PurposeRestrictionVectorEncoder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/usercentrics/tcf/core/encoder/field/PurposeRestrictionVectorEncoder$Companion;", "", "()V", "decode", "Lcom/usercentrics/tcf/core/model/PurposeRestrictionVector;", "encodedString", "", "encode", "prVector", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String encode(PurposeRestrictionVector prVector) {
            Intrinsics.checkNotNullParameter(prVector, "prVector");
            String encode = IntEncoder.INSTANCE.encode(new StringOrNumber.Int(prVector.getNumRestrictions()), BitLength.numRestrictions.getInteger());
            GVL gvl_ = prVector.getGvl_();
            if (!prVector.isEmpty() && gvl_ != null) {
                for (PurposeRestriction purposeRestriction : prVector.getRestrictions(null)) {
                    IntEncoder.Companion companion = IntEncoder.INSTANCE;
                    Integer purposeId_ = purposeRestriction.getPurposeId_();
                    Intrinsics.checkNotNull(purposeId_);
                    String str = ((Object) (((Object) encode) + companion.encode(new StringOrNumber.Int(purposeId_.intValue()), BitLength.purposeId.getInteger()))) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(purposeRestriction.getRestrictionType().getValue()), BitLength.restrictionType.getInteger());
                    List<Integer> vendors = prVector.getVendors(purposeRestriction);
                    int size = vendors.size();
                    String str2 = "";
                    int i = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int intValue = vendors.get(i3).intValue();
                        if (i2 == 0) {
                            i++;
                            i2 = intValue;
                        }
                        int i4 = size - 1;
                        if (i3 == i4 || vendors.get(i3 + 1).intValue() > encode$nextGvlVendor(gvl_, intValue, vendors.get(i4).intValue())) {
                            boolean z = intValue != i2;
                            str2 = (str2 + BooleanEncoder.INSTANCE.encode(z)) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(i2), BitLength.vendorId.getInteger());
                            if (z) {
                                str2 = str2 + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(intValue), BitLength.vendorId.getInteger());
                            }
                            i2 = 0;
                        }
                    }
                    encode = ((Object) (((Object) str) + IntEncoder.INSTANCE.encode(new StringOrNumber.Int(i), BitLength.numEntries.getInteger()))) + str2;
                }
            }
            return encode;
        }

        private static final int encode$nextGvlVendor(GVL gvl, int i, int i2) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                List<Integer> vendorIds = gvl.getVendorIds();
                if (vendorIds != null && vendorIds.contains(Integer.valueOf(i3))) {
                    return i3;
                }
            }
            return i;
        }

        public final PurposeRestrictionVector decode(String encodedString) {
            Intrinsics.checkNotNullParameter(encodedString, "encodedString");
            PurposeRestrictionVector purposeRestrictionVector = new PurposeRestrictionVector(0, null, 3, null);
            IntEncoder.Companion companion = IntEncoder.INSTANCE;
            String substring = encodedString.substring(0, BitLength.numRestrictions.getInteger());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            int decode = (int) companion.decode(substring, BitLength.numRestrictions.getInteger());
            int integer = BitLength.numRestrictions.getInteger();
            for (int i = 0; i < decode; i++) {
                IntEncoder.Companion companion2 = IntEncoder.INSTANCE;
                String substring2 = encodedString.substring(integer, BitLength.purposeId.getInteger() + integer);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                int decode2 = (int) companion2.decode(substring2, BitLength.purposeId.getInteger());
                int integer2 = integer + BitLength.purposeId.getInteger();
                IntEncoder.Companion companion3 = IntEncoder.INSTANCE;
                String substring3 = encodedString.substring(integer2, BitLength.restrictionType.getInteger() + integer2);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                int decode3 = (int) companion3.decode(substring3, BitLength.restrictionType.getInteger());
                int integer3 = integer2 + BitLength.restrictionType.getInteger();
                PurposeRestriction purposeRestriction = new PurposeRestriction(Integer.valueOf(decode2), RestrictionType.INSTANCE.getRestrictionTypeByValue(decode3));
                IntEncoder.Companion companion4 = IntEncoder.INSTANCE;
                String substring4 = encodedString.substring(integer3, BitLength.numEntries.getInteger() + integer3);
                Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                int decode4 = (int) companion4.decode(substring4, BitLength.numEntries.getInteger());
                integer = integer3 + BitLength.numEntries.getInteger();
                for (int i2 = 0; i2 < decode4; i2++) {
                    BooleanEncoder.Companion companion5 = BooleanEncoder.INSTANCE;
                    String substring5 = encodedString.substring(integer, BitLength.anyBoolean.getInteger() + integer);
                    Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
                    boolean decode5 = companion5.decode(substring5);
                    int integer4 = integer + BitLength.anyBoolean.getInteger();
                    IntEncoder.Companion companion6 = IntEncoder.INSTANCE;
                    String substring6 = encodedString.substring(integer4, BitLength.vendorId.getInteger() + integer4);
                    Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
                    int decode6 = (int) companion6.decode(substring6, BitLength.vendorId.getInteger());
                    integer = integer4 + BitLength.vendorId.getInteger();
                    if (decode5) {
                        IntEncoder.Companion companion7 = IntEncoder.INSTANCE;
                        String substring7 = encodedString.substring(integer, BitLength.vendorId.getInteger() + integer);
                        Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
                        int decode7 = (int) companion7.decode(substring7, BitLength.vendorId.getInteger());
                        integer += BitLength.vendorId.getInteger();
                        if (decode7 < decode6) {
                            throw new DecodingError("Invalid RangeEntry: endVendorId " + decode7 + " is less than " + decode6);
                        }
                        if (decode6 <= decode7) {
                            while (true) {
                                purposeRestrictionVector.add(decode6, purposeRestriction);
                                if (decode6 != decode7) {
                                    decode6++;
                                }
                            }
                        }
                    } else {
                        purposeRestrictionVector.add(decode6, purposeRestriction);
                    }
                }
            }
            purposeRestrictionVector.setBitLength(integer);
            return purposeRestrictionVector;
        }
    }
}
