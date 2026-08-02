package com.usercentrics.sdk.mediation.data;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TCFConsentPayload.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u001c\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\f2\n\u0010\u001b\u001a\u00020\u001c\"\u00020\u000bH\u0002J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006$"}, d2 = {"Lcom/usercentrics/sdk/mediation/data/TCFConsentPayload;", "", "eea", "", "purposes", "", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "vendors", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "(ZLjava/util/List;Ljava/util/List;)V", "", "", "Lcom/usercentrics/sdk/mediation/data/TCFConsentValue;", "(ZLjava/util/Map;Ljava/util/Map;)V", "getEea", "()Z", "getPurposes", "()Ljava/util/Map;", "getVendors", "buildGranularConsent", "Lcom/usercentrics/sdk/mediation/data/MediationGranularConsent;", "vendorId", "component1", "component2", "component3", "consentForPurposes", "vendorConsentValue", "purposeIds", "", "copy", "equals", "other", "hashCode", "toString", "", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TCFConsentPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean eea;
    private final Map<Integer, TCFConsentValue> purposes;
    private final Map<Integer, TCFConsentValue> vendors;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TCFConsentPayload copy$default(TCFConsentPayload tCFConsentPayload, boolean z, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tCFConsentPayload.eea;
        }
        if ((i & 2) != 0) {
            map = tCFConsentPayload.purposes;
        }
        if ((i & 4) != 0) {
            map2 = tCFConsentPayload.vendors;
        }
        return tCFConsentPayload.copy(z, map, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEea() {
        return this.eea;
    }

    public final Map<Integer, TCFConsentValue> component2() {
        return this.purposes;
    }

    public final Map<Integer, TCFConsentValue> component3() {
        return this.vendors;
    }

    public final TCFConsentPayload copy(boolean eea, Map<Integer, TCFConsentValue> purposes, Map<Integer, TCFConsentValue> vendors) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(vendors, "vendors");
        return new TCFConsentPayload(eea, purposes, vendors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TCFConsentPayload)) {
            return false;
        }
        TCFConsentPayload tCFConsentPayload = (TCFConsentPayload) other;
        return this.eea == tCFConsentPayload.eea && Intrinsics.areEqual(this.purposes, tCFConsentPayload.purposes) && Intrinsics.areEqual(this.vendors, tCFConsentPayload.vendors);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.eea) * 31) + this.purposes.hashCode()) * 31) + this.vendors.hashCode();
    }

    public String toString() {
        return "TCFConsentPayload(eea=" + this.eea + ", purposes=" + this.purposes + ", vendors=" + this.vendors + ")";
    }

    public TCFConsentPayload(boolean z, Map<Integer, TCFConsentValue> purposes, Map<Integer, TCFConsentValue> vendors) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(vendors, "vendors");
        this.eea = z;
        this.purposes = purposes;
        this.vendors = vendors;
    }

    public final boolean getEea() {
        return this.eea;
    }

    public final Map<Integer, TCFConsentValue> getPurposes() {
        return this.purposes;
    }

    public final Map<Integer, TCFConsentValue> getVendors() {
        return this.vendors;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TCFConsentPayload(boolean z, List<TCFPurpose> purposes, List<TCFVendor> vendors) {
        this(z, r3, r0);
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(vendors, "vendors");
        List<TCFPurpose> list = purposes;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (TCFPurpose tCFPurpose : list) {
            Integer valueOf = Integer.valueOf(tCFPurpose.getId());
            Companion companion = INSTANCE;
            Pair pair = TuplesKt.to(valueOf, new TCFConsentValue(companion.valueAwareOfToggleVisibility(tCFPurpose.getConsent(), tCFPurpose.getShowConsentToggle()), companion.valueAwareOfToggleVisibility(tCFPurpose.getLegitimateInterestConsent(), tCFPurpose.getShowLegitimateInterestToggle())));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        List<TCFVendor> list2 = vendors;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (TCFVendor tCFVendor : list2) {
            Integer valueOf2 = Integer.valueOf(tCFVendor.getId());
            Companion companion2 = INSTANCE;
            Pair pair2 = TuplesKt.to(valueOf2, new TCFConsentValue(companion2.valueAwareOfToggleVisibility(tCFVendor.getConsent(), tCFVendor.getShowConsentToggle()), companion2.valueAwareOfToggleVisibility(tCFVendor.getLegitimateInterestConsent(), tCFVendor.getShowLegitimateInterestToggle())));
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
    }

    public final MediationGranularConsent buildGranularConsent(int vendorId) {
        TCFConsentValue tCFConsentValue = this.vendors.get(Integer.valueOf(vendorId));
        if (tCFConsentValue == null) {
            return null;
        }
        return new MediationGranularConsent(this.eea, consentForPurposes(tCFConsentValue, 9, 10), consentForPurposes(tCFConsentValue, 1), consentForPurposes(tCFConsentValue, 1, 7), consentForPurposes(tCFConsentValue, 3, 4));
    }

    /* compiled from: TCFConsentPayload.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/usercentrics/sdk/mediation/data/TCFConsentPayload$Companion;", "", "()V", "valueAwareOfToggleVisibility", "", "consent", "showToggle", "(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Boolean valueAwareOfToggleVisibility(Boolean consent, boolean showToggle) {
            if (showToggle) {
                return consent;
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r6.getLegitimateInterest().booleanValue() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r6.getConsent().booleanValue() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        if (r6.getLegitimateInterest().booleanValue() != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e5 A[LOOP:0: B:2:0x0007->B:8:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean consentForPurposes(TCFConsentValue vendorConsentValue, int... purposeIds) {
        int length = purposeIds.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            int i2 = purposeIds[i];
            TCFConsentValue tCFConsentValue = this.purposes.get(Integer.valueOf(i2));
            if (tCFConsentValue != null) {
                if (!SetsKt.setOf((Object[]) new Integer[]{1, 3, 4, 5, 6}).contains(Integer.valueOf(i2)) && Intrinsics.areEqual((Object) tCFConsentValue.getConsent(), (Object) false) && Intrinsics.areEqual((Object) vendorConsentValue.getConsent(), (Object) false) && tCFConsentValue.getLegitimateInterest() != null) {
                    if (vendorConsentValue.getLegitimateInterest() != null) {
                        if (vendorConsentValue.getLegitimateInterest().booleanValue()) {
                        }
                    } else {
                        return tCFConsentValue.getLegitimateInterest().booleanValue();
                    }
                } else if (tCFConsentValue.getConsent() != null) {
                    if (vendorConsentValue.getConsent() != null) {
                        if (vendorConsentValue.getConsent().booleanValue()) {
                        }
                    } else {
                        z = tCFConsentValue.getConsent().booleanValue();
                    }
                    if (z) {
                        return false;
                    }
                    i++;
                } else if (tCFConsentValue.getLegitimateInterest() != null) {
                    if (vendorConsentValue.getLegitimateInterest() != null) {
                        if (vendorConsentValue.getLegitimateInterest().booleanValue()) {
                        }
                    } else {
                        return tCFConsentValue.getLegitimateInterest().booleanValue();
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }
}
