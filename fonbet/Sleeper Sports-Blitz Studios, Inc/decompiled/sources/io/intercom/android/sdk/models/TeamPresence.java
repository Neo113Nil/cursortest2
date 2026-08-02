package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TeamPresence.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0001!B=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\bH×\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/models/TeamPresence;", "", "activeAdmins", "", "Lio/intercom/android/sdk/models/Participant$Builder;", "activeBot", "Lio/intercom/android/sdk/models/ActiveBot;", "expectedResponseDelayShortText", "", "expectedResponseDelayLongText", "<init>", "(Ljava/util/List;Lio/intercom/android/sdk/models/ActiveBot;Ljava/lang/String;Ljava/lang/String;)V", "getActiveAdmins", "()Ljava/util/List;", "getActiveBot", "()Lio/intercom/android/sdk/models/ActiveBot;", "getExpectedResponseDelayShortText", "()Ljava/lang/String;", "getExpectedResponseDelayLongText", "builtActiveAdmins", "Lio/intercom/android/sdk/models/Participant;", "getBuiltActiveAdmins", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TeamPresence {

    @SerializedName("active_admins")
    private final List<Participant.Builder> activeAdmins;

    @SerializedName("active_bot")
    private final ActiveBot activeBot;

    @SerializedName("expected_response_delay_long_text")
    private final String expectedResponseDelayLongText;

    @SerializedName("expected_response_delay_short_text")
    private final String expectedResponseDelayShortText;
    public static final int $stable = 8;
    public static final TeamPresence NULL = new TeamPresence(null, null, null, null, 15, null);

    public TeamPresence() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPresence copy$default(TeamPresence teamPresence, List list, ActiveBot activeBot, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = teamPresence.activeAdmins;
        }
        if ((i & 2) != 0) {
            activeBot = teamPresence.activeBot;
        }
        if ((i & 4) != 0) {
            str = teamPresence.expectedResponseDelayShortText;
        }
        if ((i & 8) != 0) {
            str2 = teamPresence.expectedResponseDelayLongText;
        }
        return teamPresence.copy(list, activeBot, str, str2);
    }

    public final List<Participant.Builder> component1() {
        return this.activeAdmins;
    }

    /* renamed from: component2, reason: from getter */
    public final ActiveBot getActiveBot() {
        return this.activeBot;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpectedResponseDelayShortText() {
        return this.expectedResponseDelayShortText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExpectedResponseDelayLongText() {
        return this.expectedResponseDelayLongText;
    }

    public final TeamPresence copy(List<Participant.Builder> activeAdmins, ActiveBot activeBot, String expectedResponseDelayShortText, String expectedResponseDelayLongText) {
        return new TeamPresence(activeAdmins, activeBot, expectedResponseDelayShortText, expectedResponseDelayLongText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamPresence)) {
            return false;
        }
        TeamPresence teamPresence = (TeamPresence) other;
        return Intrinsics.areEqual(this.activeAdmins, teamPresence.activeAdmins) && Intrinsics.areEqual(this.activeBot, teamPresence.activeBot) && Intrinsics.areEqual(this.expectedResponseDelayShortText, teamPresence.expectedResponseDelayShortText) && Intrinsics.areEqual(this.expectedResponseDelayLongText, teamPresence.expectedResponseDelayLongText);
    }

    public int hashCode() {
        List<Participant.Builder> list = this.activeAdmins;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ActiveBot activeBot = this.activeBot;
        int hashCode2 = (hashCode + (activeBot == null ? 0 : activeBot.hashCode())) * 31;
        String str = this.expectedResponseDelayShortText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expectedResponseDelayLongText;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TeamPresence(activeAdmins=" + this.activeAdmins + ", activeBot=" + this.activeBot + ", expectedResponseDelayShortText=" + this.expectedResponseDelayShortText + ", expectedResponseDelayLongText=" + this.expectedResponseDelayLongText + ')';
    }

    public TeamPresence(List<Participant.Builder> list, ActiveBot activeBot, String str, String str2) {
        this.activeAdmins = list;
        this.activeBot = activeBot;
        this.expectedResponseDelayShortText = str;
        this.expectedResponseDelayLongText = str2;
    }

    public /* synthetic */ TeamPresence(List list, ActiveBot activeBot, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : activeBot, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final List<Participant.Builder> getActiveAdmins() {
        return this.activeAdmins;
    }

    public final ActiveBot getActiveBot() {
        return this.activeBot;
    }

    public final String getExpectedResponseDelayShortText() {
        return this.expectedResponseDelayShortText;
    }

    public final String getExpectedResponseDelayLongText() {
        return this.expectedResponseDelayLongText;
    }

    public final List<Participant> getBuiltActiveAdmins() {
        List<Participant.Builder> list = this.activeAdmins;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List<Participant.Builder> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Participant.Builder) it.next()).build());
        }
        return arrayList;
    }
}
