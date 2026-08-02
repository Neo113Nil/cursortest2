package ru.ozon.app.android.debugmenu.userqa.api;

import We.M;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/debugmenu/userqa/api/UserQASegmentApi;", "", "Lio/reactivex/y;", "Lretrofit2/Response;", "LWe/M;", "addUserToSegment", "()Lio/reactivex/y;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserQASegmentApi {
    @POST("composer-api.bx/_action/addUserQASegment")
    @NotNull
    y<Response<M>> addUserToSegment();
}
