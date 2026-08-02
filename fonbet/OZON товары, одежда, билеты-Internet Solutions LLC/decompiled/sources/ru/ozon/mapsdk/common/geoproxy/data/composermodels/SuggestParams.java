package ru.ozon.mapsdk.common.geoproxy.data.composermodels;

import B0.C2454a;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Pk0.i;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001*BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006+"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/composermodels/SuggestParams;", "", "clientName", "", SearchIntents.EXTRA_QUERY, "count", "", "lang", "preferredProviders", "", "bbox", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/SuggestParams$BBOX;", "requestSessionId", "contextLocationUID", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lru/ozon/mapsdk/common/geoproxy/data/composermodels/SuggestParams$BBOX;Ljava/lang/String;Ljava/lang/String;)V", "getClientName", "()Ljava/lang/String;", "getQuery", "getCount", "()I", "getLang", "getPreferredProviders", "()Ljava/util/List;", "getBbox", "()Lru/ozon/mapsdk/common/geoproxy/data/composermodels/SuggestParams$BBOX;", "getRequestSessionId", "getContextLocationUID", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "BBOX", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SuggestParams {
    private final BBOX bbox;

    @NotNull
    private final String clientName;
    private final String contextLocationUID;
    private final int count;
    private final String lang;
    private final List<String> preferredProviders;

    @NotNull
    private final String query;
    private final String requestSessionId;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/composermodels/SuggestParams$BBOX;", "", "leftLowerCorner", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "rightUpperCorner", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;)V", "getLeftLowerCorner", "()Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "getRightUpperCorner", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class BBOX {

        @NotNull
        private final ComposerLatLng leftLowerCorner;

        @NotNull
        private final ComposerLatLng rightUpperCorner;

        public BBOX(@NotNull ComposerLatLng leftLowerCorner, @NotNull ComposerLatLng rightUpperCorner) {
            Intrinsics.checkNotNullParameter(leftLowerCorner, "leftLowerCorner");
            Intrinsics.checkNotNullParameter(rightUpperCorner, "rightUpperCorner");
            this.leftLowerCorner = leftLowerCorner;
            this.rightUpperCorner = rightUpperCorner;
        }

        public static /* synthetic */ BBOX copy$default(BBOX bbox, ComposerLatLng composerLatLng, ComposerLatLng composerLatLng2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                composerLatLng = bbox.leftLowerCorner;
            }
            if ((i11 & 2) != 0) {
                composerLatLng2 = bbox.rightUpperCorner;
            }
            return bbox.copy(composerLatLng, composerLatLng2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ComposerLatLng getLeftLowerCorner() {
            return this.leftLowerCorner;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ComposerLatLng getRightUpperCorner() {
            return this.rightUpperCorner;
        }

        @NotNull
        public final BBOX copy(@NotNull ComposerLatLng leftLowerCorner, @NotNull ComposerLatLng rightUpperCorner) {
            Intrinsics.checkNotNullParameter(leftLowerCorner, "leftLowerCorner");
            Intrinsics.checkNotNullParameter(rightUpperCorner, "rightUpperCorner");
            return new BBOX(leftLowerCorner, rightUpperCorner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BBOX)) {
                return false;
            }
            BBOX bbox = (BBOX) other;
            return Intrinsics.d(this.leftLowerCorner, bbox.leftLowerCorner) && Intrinsics.d(this.rightUpperCorner, bbox.rightUpperCorner);
        }

        @NotNull
        public final ComposerLatLng getLeftLowerCorner() {
            return this.leftLowerCorner;
        }

        @NotNull
        public final ComposerLatLng getRightUpperCorner() {
            return this.rightUpperCorner;
        }

        public int hashCode() {
            return this.rightUpperCorner.hashCode() + (this.leftLowerCorner.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "BBOX(leftLowerCorner=" + this.leftLowerCorner + ", rightUpperCorner=" + this.rightUpperCorner + ")";
        }
    }

    public SuggestParams(@NotNull String clientName, @NotNull String query, int i11, String str, List<String> list, BBOX bbox, String str2, String str3) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(query, "query");
        this.clientName = clientName;
        this.query = query;
        this.count = i11;
        this.lang = str;
        this.preferredProviders = list;
        this.bbox = bbox;
        this.requestSessionId = str2;
        this.contextLocationUID = str3;
    }

    public static /* synthetic */ SuggestParams copy$default(SuggestParams suggestParams, String str, String str2, int i11, String str3, List list, BBOX bbox, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = suggestParams.clientName;
        }
        if ((i12 & 2) != 0) {
            str2 = suggestParams.query;
        }
        if ((i12 & 4) != 0) {
            i11 = suggestParams.count;
        }
        if ((i12 & 8) != 0) {
            str3 = suggestParams.lang;
        }
        if ((i12 & 16) != 0) {
            list = suggestParams.preferredProviders;
        }
        if ((i12 & 32) != 0) {
            bbox = suggestParams.bbox;
        }
        if ((i12 & 64) != 0) {
            str4 = suggestParams.requestSessionId;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str5 = suggestParams.contextLocationUID;
        }
        String str6 = str4;
        String str7 = str5;
        List list2 = list;
        BBOX bbox2 = bbox;
        return suggestParams.copy(str, str2, i11, str3, list2, bbox2, str6, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    public final List<String> component5() {
        return this.preferredProviders;
    }

    /* renamed from: component6, reason: from getter */
    public final BBOX getBbox() {
        return this.bbox;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRequestSessionId() {
        return this.requestSessionId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContextLocationUID() {
        return this.contextLocationUID;
    }

    @NotNull
    public final SuggestParams copy(@NotNull String clientName, @NotNull String query, int count, String lang, List<String> preferredProviders, BBOX bbox, String requestSessionId, String contextLocationUID) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(query, "query");
        return new SuggestParams(clientName, query, count, lang, preferredProviders, bbox, requestSessionId, contextLocationUID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestParams)) {
            return false;
        }
        SuggestParams suggestParams = (SuggestParams) other;
        return Intrinsics.d(this.clientName, suggestParams.clientName) && Intrinsics.d(this.query, suggestParams.query) && this.count == suggestParams.count && Intrinsics.d(this.lang, suggestParams.lang) && Intrinsics.d(this.preferredProviders, suggestParams.preferredProviders) && Intrinsics.d(this.bbox, suggestParams.bbox) && Intrinsics.d(this.requestSessionId, suggestParams.requestSessionId) && Intrinsics.d(this.contextLocationUID, suggestParams.contextLocationUID);
    }

    public final BBOX getBbox() {
        return this.bbox;
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    public final String getContextLocationUID() {
        return this.contextLocationUID;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getLang() {
        return this.lang;
    }

    public final List<String> getPreferredProviders() {
        return this.preferredProviders;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public final String getRequestSessionId() {
        return this.requestSessionId;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.count, g.a(this.clientName.hashCode() * 31, 31, this.query), 31);
        String str = this.lang;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.preferredProviders;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        BBOX bbox = this.bbox;
        int hashCode3 = (hashCode2 + (bbox == null ? 0 : bbox.hashCode())) * 31;
        String str2 = this.requestSessionId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contextLocationUID;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.clientName;
        String str2 = this.query;
        int i11 = this.count;
        String str3 = this.lang;
        List<String> list = this.preferredProviders;
        BBOX bbox = this.bbox;
        String str4 = this.requestSessionId;
        String str5 = this.contextLocationUID;
        StringBuilder d11 = C3660k.d("SuggestParams(clientName=", str, ", query=", str2, ", count=");
        i.c(i11, ", lang=", str3, ", preferredProviders=", d11);
        d11.append(list);
        d11.append(", bbox=");
        d11.append(bbox);
        d11.append(", requestSessionId=");
        return C3173b.c(d11, str4, ", contextLocationUID=", str5, ")");
    }
}
