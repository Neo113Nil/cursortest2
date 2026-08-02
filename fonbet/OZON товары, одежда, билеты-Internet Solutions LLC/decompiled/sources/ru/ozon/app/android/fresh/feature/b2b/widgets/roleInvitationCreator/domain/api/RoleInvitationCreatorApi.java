package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorApi;", "", "", "actionName", "", "params", "Lretrofit2/Response;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/CreateRoleInvitationsResponse;", "createRoleInvitations", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface RoleInvitationCreatorApi {
    @POST("composer-api.bx/_action/v2/{actionName}")
    Object createRoleInvitations(@Path("actionName") @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<? super Response<CreateRoleInvitationsResponse>> dVar);
}
