package ru.ozon.app.android.cabinet.profiledatasettings.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.IProfileDateMapper;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lorg/joda/time/LocalDate;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/storage/user/model/User;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/storage/user/model/User;)Lorg/joda/time/LocalDate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProfileDataSettingsViewModel$getUserBirthday$1 extends AbstractC7737t implements Function1<User, LocalDate> {
    final /* synthetic */ ProfileDataSettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileDataSettingsViewModel$getUserBirthday$1(ProfileDataSettingsViewModel profileDataSettingsViewModel) {
        super(1);
        this.this$0 = profileDataSettingsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LocalDate invoke(User it) {
        IProfileDateMapper iProfileDateMapper;
        Intrinsics.checkNotNullParameter(it, "it");
        iProfileDateMapper = this.this$0.dateMapper;
        return iProfileDateMapper.transformDateToIsoFormat(it.getDateOfBirth());
    }
}
