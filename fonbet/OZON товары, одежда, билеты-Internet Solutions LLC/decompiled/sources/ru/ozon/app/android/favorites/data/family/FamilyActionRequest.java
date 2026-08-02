package ru.ozon.app.android.favorites.data.family;

import C.o0;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/data/family/FamilyActionRequest;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/app/android/favorites/data/family/FamilyActionRequest$ActionType;", "userGuid", "", "inviteId", "<init>", "(Lru/ozon/app/android/favorites/data/family/FamilyActionRequest$ActionType;Ljava/lang/String;Ljava/lang/String;)V", "getActionType", "()Lru/ozon/app/android/favorites/data/family/FamilyActionRequest$ActionType;", "getUserGuid", "()Ljava/lang/String;", "getInviteId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ActionType", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FamilyActionRequest {

    @NotNull
    private final ActionType actionType;
    private final String inviteId;
    private final String userGuid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/data/family/FamilyActionRequest$ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "ADD_USER_BY_INVITE", "DELETE_USER", "DELETE_FAMILY", "ACCEPT_JOIN_REQUEST", "REJECT_JOIN_REQUEST", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType UNDEFINED = new ActionType("UNDEFINED", 0);
        public static final ActionType ADD_USER_BY_INVITE = new ActionType("ADD_USER_BY_INVITE", 1);
        public static final ActionType DELETE_USER = new ActionType("DELETE_USER", 2);
        public static final ActionType DELETE_FAMILY = new ActionType("DELETE_FAMILY", 3);
        public static final ActionType ACCEPT_JOIN_REQUEST = new ActionType("ACCEPT_JOIN_REQUEST", 4);
        public static final ActionType REJECT_JOIN_REQUEST = new ActionType("REJECT_JOIN_REQUEST", 5);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{UNDEFINED, ADD_USER_BY_INVITE, DELETE_USER, DELETE_FAMILY, ACCEPT_JOIN_REQUEST, REJECT_JOIN_REQUEST};
        }

        static {
            ActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ActionType(String str, int i11) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public FamilyActionRequest(@NotNull ActionType actionType, String str, String str2) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.actionType = actionType;
        this.userGuid = str;
        this.inviteId = str2;
    }

    public static /* synthetic */ FamilyActionRequest copy$default(FamilyActionRequest familyActionRequest, ActionType actionType, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actionType = familyActionRequest.actionType;
        }
        if ((i11 & 2) != 0) {
            str = familyActionRequest.userGuid;
        }
        if ((i11 & 4) != 0) {
            str2 = familyActionRequest.inviteId;
        }
        return familyActionRequest.copy(actionType, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserGuid() {
        return this.userGuid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInviteId() {
        return this.inviteId;
    }

    @NotNull
    public final FamilyActionRequest copy(@NotNull ActionType actionType, String userGuid, String inviteId) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return new FamilyActionRequest(actionType, userGuid, inviteId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyActionRequest)) {
            return false;
        }
        FamilyActionRequest familyActionRequest = (FamilyActionRequest) other;
        return this.actionType == familyActionRequest.actionType && Intrinsics.d(this.userGuid, familyActionRequest.userGuid) && Intrinsics.d(this.inviteId, familyActionRequest.inviteId);
    }

    @NotNull
    public final ActionType getActionType() {
        return this.actionType;
    }

    public final String getInviteId() {
        return this.inviteId;
    }

    public final String getUserGuid() {
        return this.userGuid;
    }

    public int hashCode() {
        int hashCode = this.actionType.hashCode() * 31;
        String str = this.userGuid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inviteId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ActionType actionType = this.actionType;
        String str = this.userGuid;
        String str2 = this.inviteId;
        StringBuilder sb2 = new StringBuilder("FamilyActionRequest(actionType=");
        sb2.append(actionType);
        sb2.append(", userGuid=");
        sb2.append(str);
        sb2.append(", inviteId=");
        return o0.c(sb2, str2, ")");
    }
}
