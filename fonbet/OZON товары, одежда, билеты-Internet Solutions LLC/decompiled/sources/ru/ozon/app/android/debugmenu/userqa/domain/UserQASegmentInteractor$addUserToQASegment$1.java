package ru.ozon.app.android.debugmenu.userqa.domain;

import We.M;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import ru.ozon.app.android.debugmenu.R$string;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lretrofit2/Response;", "LWe/M;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lru/ozon/app/android/debugmenu/userqa/domain/UserQASegmentState;", "kotlin.jvm.PlatformType", "invoke", "(Lretrofit2/Response;)Lru/ozon/app/android/debugmenu/userqa/domain/UserQASegmentState;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class UserQASegmentInteractor$addUserToQASegment$1 extends AbstractC7737t implements Function1<Response<M>, UserQASegmentState> {
    public static final UserQASegmentInteractor$addUserToQASegment$1 INSTANCE = new UserQASegmentInteractor$addUserToQASegment$1();

    UserQASegmentInteractor$addUserToQASegment$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final UserQASegmentState invoke(Response<M> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isSuccessful() ? new UserQASegmentState(R$string.debugmenu_user_qa_added) : new UserQASegmentState(R$string.error_debugmenu_user_qa_restricted);
    }
}
