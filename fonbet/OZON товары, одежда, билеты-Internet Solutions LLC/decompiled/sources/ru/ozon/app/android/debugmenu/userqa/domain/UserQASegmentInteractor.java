package ru.ozon.app.android.debugmenu.userqa.domain;

import BO.b;
import Bc.r;
import We.M;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.app.android.debugmenu.userqa.api.UserQASegmentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/debugmenu/userqa/domain/UserQASegmentInteractor;", "", "Lru/ozon/app/android/debugmenu/userqa/api/UserQASegmentApi;", "userQASegmentApi", "<init>", "(Lru/ozon/app/android/debugmenu/userqa/api/UserQASegmentApi;)V", "Lio/reactivex/y;", "Lru/ozon/app/android/debugmenu/userqa/domain/UserQASegmentState;", "addUserToQASegment", "()Lio/reactivex/y;", "Lru/ozon/app/android/debugmenu/userqa/api/UserQASegmentApi;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserQASegmentInteractor {

    @NotNull
    private final UserQASegmentApi userQASegmentApi;

    public UserQASegmentInteractor(@NotNull UserQASegmentApi userQASegmentApi) {
        Intrinsics.checkNotNullParameter(userQASegmentApi, "userQASegmentApi");
        this.userQASegmentApi = userQASegmentApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserQASegmentState addUserToQASegment$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (UserQASegmentState) function1.invoke(p02);
    }

    @NotNull
    public final y<UserQASegmentState> addUserToQASegment() {
        y<Response<M>> addUserToSegment = this.userQASegmentApi.addUserToSegment();
        b bVar = new b(UserQASegmentInteractor$addUserToQASegment$1.INSTANCE, 11);
        addUserToSegment.getClass();
        r rVar = new r(addUserToSegment, bVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
