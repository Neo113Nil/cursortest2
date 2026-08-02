package ru.ozon.app.android.account.user;

import Sc.r;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserProfileResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "patchUserProfileResponse", "LSc/r;", "", "kotlin.jvm.PlatformType", "invoke-CmtIpJM", "(Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse;)LSc/r;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class UserManagerImpl$mapToResult$1 extends AbstractC7737t implements Function1<PatchUserProfileResponse, r<? extends Unit>> {
    public static final UserManagerImpl$mapToResult$1 INSTANCE = new UserManagerImpl$mapToResult$1();

    UserManagerImpl$mapToResult$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-CmtIpJM, reason: not valid java name and merged with bridge method [inline-methods] */
    public final r<? extends Unit> invoke(PatchUserProfileResponse patchUserProfileResponse) {
        Intrinsics.checkNotNullParameter(patchUserProfileResponse, "patchUserProfileResponse");
        String errorMessage = patchUserProfileResponse.getErrorMessage();
        if (errorMessage != null) {
            r.Companion companion = r.INSTANCE;
            return r.a(s.a(new Throwable(errorMessage)));
        }
        r.Companion companion2 = r.INSTANCE;
        return r.a(Unit.f71690a);
    }
}
