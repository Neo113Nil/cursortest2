package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/CreateRoleInvitationsResponse;", "", "data", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorData;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorData;)V", "getData", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateRoleInvitationsResponse {
    public static final int $stable = 8;
    private final RoleInvitationCreatorData data;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateRoleInvitationsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CreateRoleInvitationsResponse copy$default(CreateRoleInvitationsResponse createRoleInvitationsResponse, RoleInvitationCreatorData roleInvitationCreatorData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            roleInvitationCreatorData = createRoleInvitationsResponse.data;
        }
        return createRoleInvitationsResponse.copy(roleInvitationCreatorData);
    }

    /* renamed from: component1, reason: from getter */
    public final RoleInvitationCreatorData getData() {
        return this.data;
    }

    @NotNull
    public final CreateRoleInvitationsResponse copy(RoleInvitationCreatorData data) {
        return new CreateRoleInvitationsResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateRoleInvitationsResponse) && Intrinsics.d(this.data, ((CreateRoleInvitationsResponse) other).data);
    }

    public final RoleInvitationCreatorData getData() {
        return this.data;
    }

    public int hashCode() {
        RoleInvitationCreatorData roleInvitationCreatorData = this.data;
        if (roleInvitationCreatorData == null) {
            return 0;
        }
        return roleInvitationCreatorData.hashCode();
    }

    @NotNull
    public String toString() {
        return "CreateRoleInvitationsResponse(data=" + this.data + ")";
    }

    public CreateRoleInvitationsResponse(RoleInvitationCreatorData roleInvitationCreatorData) {
        this.data = roleInvitationCreatorData;
    }

    public /* synthetic */ CreateRoleInvitationsResponse(RoleInvitationCreatorData roleInvitationCreatorData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : roleInvitationCreatorData);
    }
}
