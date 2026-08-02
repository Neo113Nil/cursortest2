package com.plaid.link.event;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C3783x;
import com.twilio.voice.EventKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u0087\u0002\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0002\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010I\u001a\u00020JHÖ\u0001J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020JHÖ\u0001J\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030QJ\t\u0010R\u001a\u00020\u0003HÖ\u0001J\u0019\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020JHÖ\u0001R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006Y"}, d2 = {"Lcom/plaid/link/event/LinkEventMetadata;", "Landroid/os/Parcelable;", "brandName", "", "errorCode", "errorMessage", "errorType", "exitStatus", "institutionId", "institutionName", "institutionSearchQuery", "issueDescription", "issueDetectedAt", "issueId", "linkSessionId", "mfaType", "requestId", "selection", EventKeys.TIMESTAMP, "viewName", "Lcom/plaid/link/event/LinkEventViewName;", "metadataJson", "routingNumber", "isUpdateMode", "matchReason", "accountNumberMask", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/link/event/LinkEventViewName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumberMask", "()Ljava/lang/String;", "getBrandName", "getErrorCode", "getErrorMessage", "getErrorType", "getExitStatus", "getInstitutionId", "getInstitutionName", "getInstitutionSearchQuery", "getIssueDescription", "getIssueDetectedAt", "getIssueId", "getLinkSessionId", "getMatchReason", "getMetadataJson", "getMfaType", "getRequestId", "getRoutingNumber", "getSelection", "getTimestamp", "getViewName", "()Lcom/plaid/link/event/LinkEventViewName;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkEventMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkEventMetadata.kt\ncom/plaid/link/event/LinkEventMetadata\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,139:1\n551#2:140\n536#2,6:141\n*S KotlinDebug\n*F\n+ 1 LinkEventMetadata.kt\ncom/plaid/link/event/LinkEventMetadata\n*L\n136#1:140\n136#1:141,6\n*E\n"})
/* loaded from: classes4.dex */
public final /* data */ class LinkEventMetadata implements Parcelable {

    @c("account_number_mask")
    @Nullable
    private final String accountNumberMask;

    @c("brand_name")
    @Nullable
    private final String brandName;

    @c(EventKeys.ERROR_CODE_KEY)
    @Nullable
    private final String errorCode;

    @c(EventKeys.ERROR_MESSAGE_KEY)
    @Nullable
    private final String errorMessage;

    @c("error_type")
    @Nullable
    private final String errorType;

    @c("exit_status")
    @Nullable
    private final String exitStatus;

    @c("institution_id")
    @Nullable
    private final String institutionId;

    @c("institution_name")
    @Nullable
    private final String institutionName;

    @c("institution_search_query")
    @Nullable
    private final String institutionSearchQuery;

    @c("is_update_mode")
    @Nullable
    private final String isUpdateMode;

    @c("issue_description")
    @Nullable
    private final String issueDescription;

    @c("issue_detected_at")
    @Nullable
    private final String issueDetectedAt;

    @c("issue_id")
    @Nullable
    private final String issueId;

    @c("link_session_id")
    @NotNull
    private final String linkSessionId;

    @c("match_reason")
    @Nullable
    private final String matchReason;

    @c("metadata_json")
    @Nullable
    private final String metadataJson;

    @c("mfa_type")
    @Nullable
    private final String mfaType;

    @c("request_id")
    @Nullable
    private final String requestId;

    @c("routing_number")
    @Nullable
    private final String routingNumber;

    @c("selection")
    @Nullable
    private final String selection;

    @c(EventKeys.TIMESTAMP)
    @NotNull
    private final String timestamp;

    @c("view_name")
    @Nullable
    private final LinkEventViewName viewName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LinkEventMetadata> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lcom/plaid/link/event/LinkEventMetadata$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/event/LinkEventMetadata;", "linkData", "", "", "linkSessionId", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LinkEventMetadata fromMap(@NotNull Map<String, String> linkData, @Nullable String linkSessionId) {
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            String str = linkData.get(EventKeys.ERROR_CODE_KEY);
            String str2 = linkData.get(EventKeys.ERROR_MESSAGE_KEY);
            String str3 = linkData.get("error_type");
            String str4 = linkData.get("exit_status");
            String str5 = linkData.get("institution_id");
            String str6 = linkData.get("institution_name");
            String str7 = linkData.get("institution_search_query");
            String str8 = linkData.get("issue_description");
            String str9 = linkData.get("issue_detected_at");
            String str10 = linkData.get("issue_id");
            String str11 = linkSessionId == null ? "" : linkSessionId;
            String str12 = linkData.get("mfa_type");
            String str13 = linkData.get("request_id");
            String str14 = str13 == null ? "" : str13;
            String str15 = linkData.containsKey("routing_number") ? linkData.get("routing_number") : null;
            String str16 = linkData.get(EventKeys.TIMESTAMP);
            String str17 = str16 == null ? "" : str16;
            LinkEventViewName fromString$link_sdk_release = LinkEventViewName.INSTANCE.fromString$link_sdk_release(linkData.get("view_name"));
            return new LinkEventMetadata(linkData.containsKey("brand_name") ? linkData.get("brand_name") : null, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str14, linkData.containsKey("selection") ? linkData.get("selection") : null, str17, fromString$link_sdk_release, linkData.get("metadata_json"), str15, linkData.containsKey("is_update_mode") ? linkData.get("is_update_mode") : null, linkData.containsKey("match_reason") ? linkData.get("match_reason") : null, linkData.containsKey("account_number_mask") ? linkData.get("account_number_mask") : null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkEventMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkEventMetadata createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkEventMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LinkEventViewName) parcel.readParcelable(LinkEventMetadata.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LinkEventMetadata[] newArray(int i10) {
            return new LinkEventMetadata[i10];
        }
    }

    public LinkEventMetadata(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @NotNull String linkSessionId, @Nullable String str12, @Nullable String str13, @Nullable String str14, @NotNull String timestamp, @Nullable LinkEventViewName linkEventViewName, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19) {
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.brandName = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.errorType = str4;
        this.exitStatus = str5;
        this.institutionId = str6;
        this.institutionName = str7;
        this.institutionSearchQuery = str8;
        this.issueDescription = str9;
        this.issueDetectedAt = str10;
        this.issueId = str11;
        this.linkSessionId = linkSessionId;
        this.mfaType = str12;
        this.requestId = str13;
        this.selection = str14;
        this.timestamp = timestamp;
        this.viewName = linkEventViewName;
        this.metadataJson = str15;
        this.routingNumber = str16;
        this.isUpdateMode = str17;
        this.matchReason = str18;
        this.accountNumberMask = str19;
    }

    public static /* synthetic */ LinkEventMetadata copy$default(LinkEventMetadata linkEventMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, LinkEventViewName linkEventViewName, String str17, String str18, String str19, String str20, String str21, int i10, Object obj) {
        String str22;
        String str23;
        String str24 = (i10 & 1) != 0 ? linkEventMetadata.brandName : str;
        String str25 = (i10 & 2) != 0 ? linkEventMetadata.errorCode : str2;
        String str26 = (i10 & 4) != 0 ? linkEventMetadata.errorMessage : str3;
        String str27 = (i10 & 8) != 0 ? linkEventMetadata.errorType : str4;
        String str28 = (i10 & 16) != 0 ? linkEventMetadata.exitStatus : str5;
        String str29 = (i10 & 32) != 0 ? linkEventMetadata.institutionId : str6;
        String str30 = (i10 & 64) != 0 ? linkEventMetadata.institutionName : str7;
        String str31 = (i10 & 128) != 0 ? linkEventMetadata.institutionSearchQuery : str8;
        String str32 = (i10 & 256) != 0 ? linkEventMetadata.issueDescription : str9;
        String str33 = (i10 & 512) != 0 ? linkEventMetadata.issueDetectedAt : str10;
        String str34 = (i10 & 1024) != 0 ? linkEventMetadata.issueId : str11;
        String str35 = (i10 & 2048) != 0 ? linkEventMetadata.linkSessionId : str12;
        String str36 = (i10 & 4096) != 0 ? linkEventMetadata.mfaType : str13;
        String str37 = (i10 & 8192) != 0 ? linkEventMetadata.requestId : str14;
        String str38 = str24;
        String str39 = (i10 & 16384) != 0 ? linkEventMetadata.selection : str15;
        String str40 = (i10 & 32768) != 0 ? linkEventMetadata.timestamp : str16;
        LinkEventViewName linkEventViewName2 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? linkEventMetadata.viewName : linkEventViewName;
        String str41 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? linkEventMetadata.metadataJson : str17;
        String str42 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? linkEventMetadata.routingNumber : str18;
        String str43 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? linkEventMetadata.isUpdateMode : str19;
        String str44 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? linkEventMetadata.matchReason : str20;
        if ((i10 & PKIFailureInfo.badSenderNonce) != 0) {
            str23 = str44;
            str22 = linkEventMetadata.accountNumberMask;
        } else {
            str22 = str21;
            str23 = str44;
        }
        return linkEventMetadata.copy(str38, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str39, str40, linkEventViewName2, str41, str42, str43, str23, str22);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getIssueDetectedAt() {
        return this.issueDetectedAt;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getIssueId() {
        return this.issueId;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getMfaType() {
        return this.mfaType;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getSelection() {
        return this.selection;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final LinkEventViewName getViewName() {
        return this.viewName;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getIsUpdateMode() {
        return this.isUpdateMode;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getMatchReason() {
        return this.matchReason;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getAccountNumberMask() {
        return this.accountNumberMask;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getExitStatus() {
        return this.exitStatus;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getInstitutionSearchQuery() {
        return this.institutionSearchQuery;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getIssueDescription() {
        return this.issueDescription;
    }

    @NotNull
    public final LinkEventMetadata copy(@Nullable String brandName, @Nullable String errorCode, @Nullable String errorMessage, @Nullable String errorType, @Nullable String exitStatus, @Nullable String institutionId, @Nullable String institutionName, @Nullable String institutionSearchQuery, @Nullable String issueDescription, @Nullable String issueDetectedAt, @Nullable String issueId, @NotNull String linkSessionId, @Nullable String mfaType, @Nullable String requestId, @Nullable String selection, @NotNull String timestamp, @Nullable LinkEventViewName viewName, @Nullable String metadataJson, @Nullable String routingNumber, @Nullable String isUpdateMode, @Nullable String matchReason, @Nullable String accountNumberMask) {
        Intrinsics.checkNotNullParameter(linkSessionId, "linkSessionId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new LinkEventMetadata(brandName, errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueDescription, issueDetectedAt, issueId, linkSessionId, mfaType, requestId, selection, timestamp, viewName, metadataJson, routingNumber, isUpdateMode, matchReason, accountNumberMask);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkEventMetadata)) {
            return false;
        }
        LinkEventMetadata linkEventMetadata = (LinkEventMetadata) other;
        return Intrinsics.areEqual(this.brandName, linkEventMetadata.brandName) && Intrinsics.areEqual(this.errorCode, linkEventMetadata.errorCode) && Intrinsics.areEqual(this.errorMessage, linkEventMetadata.errorMessage) && Intrinsics.areEqual(this.errorType, linkEventMetadata.errorType) && Intrinsics.areEqual(this.exitStatus, linkEventMetadata.exitStatus) && Intrinsics.areEqual(this.institutionId, linkEventMetadata.institutionId) && Intrinsics.areEqual(this.institutionName, linkEventMetadata.institutionName) && Intrinsics.areEqual(this.institutionSearchQuery, linkEventMetadata.institutionSearchQuery) && Intrinsics.areEqual(this.issueDescription, linkEventMetadata.issueDescription) && Intrinsics.areEqual(this.issueDetectedAt, linkEventMetadata.issueDetectedAt) && Intrinsics.areEqual(this.issueId, linkEventMetadata.issueId) && Intrinsics.areEqual(this.linkSessionId, linkEventMetadata.linkSessionId) && Intrinsics.areEqual(this.mfaType, linkEventMetadata.mfaType) && Intrinsics.areEqual(this.requestId, linkEventMetadata.requestId) && Intrinsics.areEqual(this.selection, linkEventMetadata.selection) && Intrinsics.areEqual(this.timestamp, linkEventMetadata.timestamp) && Intrinsics.areEqual(this.viewName, linkEventMetadata.viewName) && Intrinsics.areEqual(this.metadataJson, linkEventMetadata.metadataJson) && Intrinsics.areEqual(this.routingNumber, linkEventMetadata.routingNumber) && Intrinsics.areEqual(this.isUpdateMode, linkEventMetadata.isUpdateMode) && Intrinsics.areEqual(this.matchReason, linkEventMetadata.matchReason) && Intrinsics.areEqual(this.accountNumberMask, linkEventMetadata.accountNumberMask);
    }

    @Nullable
    public final String getAccountNumberMask() {
        return this.accountNumberMask;
    }

    @Nullable
    public final String getBrandName() {
        return this.brandName;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getExitStatus() {
        return this.exitStatus;
    }

    @Nullable
    public final String getInstitutionId() {
        return this.institutionId;
    }

    @Nullable
    public final String getInstitutionName() {
        return this.institutionName;
    }

    @Nullable
    public final String getInstitutionSearchQuery() {
        return this.institutionSearchQuery;
    }

    @Nullable
    public final String getIssueDescription() {
        return this.issueDescription;
    }

    @Nullable
    public final String getIssueDetectedAt() {
        return this.issueDetectedAt;
    }

    @Nullable
    public final String getIssueId() {
        return this.issueId;
    }

    @NotNull
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    @Nullable
    public final String getMatchReason() {
        return this.matchReason;
    }

    @Nullable
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    @Nullable
    public final String getMfaType() {
        return this.mfaType;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    @Nullable
    public final String getSelection() {
        return this.selection;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final LinkEventViewName getViewName() {
        return this.viewName;
    }

    public int hashCode() {
        String str = this.brandName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exitStatus;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.institutionId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.institutionName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.institutionSearchQuery;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.issueDescription;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.issueDetectedAt;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issueId;
        int a10 = C3783x.a(this.linkSessionId, (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31, 31);
        String str12 = this.mfaType;
        int hashCode11 = (a10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.requestId;
        int hashCode12 = (hashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.selection;
        int a11 = C3783x.a(this.timestamp, (hashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31, 31);
        LinkEventViewName linkEventViewName = this.viewName;
        int hashCode13 = (a11 + (linkEventViewName == null ? 0 : linkEventViewName.hashCode())) * 31;
        String str15 = this.metadataJson;
        int hashCode14 = (hashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.routingNumber;
        int hashCode15 = (hashCode14 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.isUpdateMode;
        int hashCode16 = (hashCode15 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.matchReason;
        int hashCode17 = (hashCode16 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.accountNumberMask;
        return hashCode17 + (str19 != null ? str19.hashCode() : 0);
    }

    @Nullable
    public final String isUpdateMode() {
        return this.isUpdateMode;
    }

    @NotNull
    public final Map<String, String> toMap() {
        Pair pair = TuplesKt.to("brand_name", this.brandName);
        Pair pair2 = TuplesKt.to(EventKeys.ERROR_CODE_KEY, this.errorCode);
        Pair pair3 = TuplesKt.to(EventKeys.ERROR_MESSAGE_KEY, this.errorMessage);
        Pair pair4 = TuplesKt.to("error_type", this.errorType);
        Pair pair5 = TuplesKt.to("exit_status", this.exitStatus);
        Pair pair6 = TuplesKt.to("institution_id", this.institutionId);
        Pair pair7 = TuplesKt.to("institution_name", this.institutionName);
        Pair pair8 = TuplesKt.to("institution_search_query", this.institutionSearchQuery);
        Pair pair9 = TuplesKt.to("issue_description", this.issueDescription);
        Pair pair10 = TuplesKt.to("issue_detected_at", this.issueDetectedAt);
        Pair pair11 = TuplesKt.to("issue_id", this.issueId);
        Pair pair12 = TuplesKt.to("link_session_id", this.linkSessionId);
        Pair pair13 = TuplesKt.to("mfa_type", this.mfaType);
        Pair pair14 = TuplesKt.to("request_id", this.requestId);
        Pair pair15 = TuplesKt.to("routing_number", this.routingNumber);
        Pair pair16 = TuplesKt.to("selection", this.selection);
        Pair pair17 = TuplesKt.to("isUpdateMode", this.isUpdateMode);
        Pair pair18 = TuplesKt.to("matchReason", this.matchReason);
        Pair pair19 = TuplesKt.to("accountNumberMask", this.accountNumberMask);
        Pair pair20 = TuplesKt.to(EventKeys.TIMESTAMP, this.timestamp);
        LinkEventViewName linkEventViewName = this.viewName;
        Map mapOf = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, TuplesKt.to("view_name", linkEventViewName != null ? linkEventViewName.getJsonValue() : null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getValue();
            if (charSequence != null && charSequence.length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "LinkEventMetadata(brandName=" + this.brandName + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", errorType=" + this.errorType + ", exitStatus=" + this.exitStatus + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", institutionSearchQuery=" + this.institutionSearchQuery + ", issueDescription=" + this.issueDescription + ", issueDetectedAt=" + this.issueDetectedAt + ", issueId=" + this.issueId + ", linkSessionId=" + this.linkSessionId + ", mfaType=" + this.mfaType + ", requestId=" + this.requestId + ", selection=" + this.selection + ", timestamp=" + this.timestamp + ", viewName=" + this.viewName + ", metadataJson=" + this.metadataJson + ", routingNumber=" + this.routingNumber + ", isUpdateMode=" + this.isUpdateMode + ", matchReason=" + this.matchReason + ", accountNumberMask=" + this.accountNumberMask + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.brandName);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.errorType);
        parcel.writeString(this.exitStatus);
        parcel.writeString(this.institutionId);
        parcel.writeString(this.institutionName);
        parcel.writeString(this.institutionSearchQuery);
        parcel.writeString(this.issueDescription);
        parcel.writeString(this.issueDetectedAt);
        parcel.writeString(this.issueId);
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.mfaType);
        parcel.writeString(this.requestId);
        parcel.writeString(this.selection);
        parcel.writeString(this.timestamp);
        parcel.writeParcelable(this.viewName, flags);
        parcel.writeString(this.metadataJson);
        parcel.writeString(this.routingNumber);
        parcel.writeString(this.isUpdateMode);
        parcel.writeString(this.matchReason);
        parcel.writeString(this.accountNumberMask);
    }

    public /* synthetic */ LinkEventMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, LinkEventViewName linkEventViewName, String str17, String str18, String str19, String str20, String str21, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, str12, (i10 & 4096) != 0 ? null : str13, (i10 & 8192) != 0 ? null : str14, (i10 & 16384) != 0 ? null : str15, str16, (65536 & i10) != 0 ? null : linkEventViewName, (131072 & i10) != 0 ? null : str17, (262144 & i10) != 0 ? null : str18, (524288 & i10) != 0 ? null : str19, (1048576 & i10) != 0 ? null : str20, (i10 & PKIFailureInfo.badSenderNonce) != 0 ? null : str21);
    }
}
