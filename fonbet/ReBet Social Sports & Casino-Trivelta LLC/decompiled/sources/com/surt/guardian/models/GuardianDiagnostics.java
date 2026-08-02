package com.surt.guardian.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JU\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010!J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/surt/guardian/models/GuardianDiagnostics;", "", "location", "", "attestation", "networkIntel", "attestationResult", "networkIntelResult", "warnings", "", "Lcom/surt/guardian/models/GuardianWarning;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAttestation", "()Ljava/lang/String;", "getAttestationResult", "getLocation", "getNetworkIntel", "getNetworkIntelResult", "getWarnings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "securitysdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiagnostics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Diagnostics.kt\ncom/surt/guardian/models/GuardianDiagnostics\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1#2:56\n1549#3:57\n1620#3,3:58\n*S KotlinDebug\n*F\n+ 1 Diagnostics.kt\ncom/surt/guardian/models/GuardianDiagnostics\n*L\n36#1:57\n36#1:58,3\n*E\n"})
/* loaded from: classes4.dex */
public final /* data */ class GuardianDiagnostics {

    @Nullable
    private final String attestation;

    @Nullable
    private final String attestationResult;

    @Nullable
    private final String location;

    @Nullable
    private final String networkIntel;

    @Nullable
    private final String networkIntelResult;

    @NotNull
    private final List<GuardianWarning> warnings;

    public GuardianDiagnostics() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GuardianDiagnostics copy$default(GuardianDiagnostics guardianDiagnostics, String str, String str2, String str3, String str4, String str5, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = guardianDiagnostics.location;
        }
        if ((i10 & 2) != 0) {
            str2 = guardianDiagnostics.attestation;
        }
        if ((i10 & 4) != 0) {
            str3 = guardianDiagnostics.networkIntel;
        }
        if ((i10 & 8) != 0) {
            str4 = guardianDiagnostics.attestationResult;
        }
        if ((i10 & 16) != 0) {
            str5 = guardianDiagnostics.networkIntelResult;
        }
        if ((i10 & 32) != 0) {
            list = guardianDiagnostics.warnings;
        }
        String str6 = str5;
        List list2 = list;
        return guardianDiagnostics.copy(str, str2, str3, str4, str6, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAttestation() {
        return this.attestation;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getNetworkIntel() {
        return this.networkIntel;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAttestationResult() {
        return this.attestationResult;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getNetworkIntelResult() {
        return this.networkIntelResult;
    }

    @NotNull
    public final List<GuardianWarning> component6() {
        return this.warnings;
    }

    @NotNull
    public final GuardianDiagnostics copy(@Nullable String location, @Nullable String attestation, @Nullable String networkIntel, @Nullable String attestationResult, @Nullable String networkIntelResult, @NotNull List<GuardianWarning> warnings) {
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        return new GuardianDiagnostics(location, attestation, networkIntel, attestationResult, networkIntelResult, warnings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuardianDiagnostics)) {
            return false;
        }
        GuardianDiagnostics guardianDiagnostics = (GuardianDiagnostics) other;
        return Intrinsics.areEqual(this.location, guardianDiagnostics.location) && Intrinsics.areEqual(this.attestation, guardianDiagnostics.attestation) && Intrinsics.areEqual(this.networkIntel, guardianDiagnostics.networkIntel) && Intrinsics.areEqual(this.attestationResult, guardianDiagnostics.attestationResult) && Intrinsics.areEqual(this.networkIntelResult, guardianDiagnostics.networkIntelResult) && Intrinsics.areEqual(this.warnings, guardianDiagnostics.warnings);
    }

    @Nullable
    public final String getAttestation() {
        return this.attestation;
    }

    @Nullable
    public final String getAttestationResult() {
        return this.attestationResult;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final String getNetworkIntel() {
        return this.networkIntel;
    }

    @Nullable
    public final String getNetworkIntelResult() {
        return this.networkIntelResult;
    }

    @NotNull
    public final List<GuardianWarning> getWarnings() {
        return this.warnings;
    }

    public int hashCode() {
        String str = this.location;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.attestation;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.networkIntel;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.attestationResult;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.networkIntelResult;
        return this.warnings.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.location;
        if (str != null) {
            linkedHashMap.put("location", str);
        }
        String str2 = this.attestation;
        if (str2 != null) {
            linkedHashMap.put("attestation", str2);
        }
        String str3 = this.networkIntel;
        if (str3 != null) {
            linkedHashMap.put("networkIntel", str3);
        }
        String str4 = this.attestationResult;
        if (str4 != null) {
            linkedHashMap.put("attestationResult", str4);
        }
        String str5 = this.networkIntelResult;
        if (str5 != null) {
            linkedHashMap.put("networkIntelResult", str5);
        }
        List<GuardianWarning> list = this.warnings;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((GuardianWarning) it.next()).toMap());
        }
        linkedHashMap.put("warnings", arrayList);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "GuardianDiagnostics(location=" + this.location + ", attestation=" + this.attestation + ", networkIntel=" + this.networkIntel + ", attestationResult=" + this.attestationResult + ", networkIntelResult=" + this.networkIntelResult + ", warnings=" + this.warnings + ')';
    }

    public GuardianDiagnostics(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull List<GuardianWarning> warnings) {
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        this.location = str;
        this.attestation = str2;
        this.networkIntel = str3;
        this.attestationResult = str4;
        this.networkIntelResult = str5;
        this.warnings = warnings;
    }

    public /* synthetic */ GuardianDiagnostics(String str, String str2, String str3, String str4, String str5, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }
}
