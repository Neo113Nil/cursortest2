package ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/ProfileUserViewMapper;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileUserViewMapper;", "<init>", "()V", "transformSex", "", "sex", "", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileUserViewMapper implements IProfileUserViewMapper {
    @Override // ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.IProfileUserViewMapper
    public int transformSex(@NotNull String sex) {
        Intrinsics.checkNotNullParameter(sex, "sex");
        return !Intrinsics.d(sex, StringProvider.getString(R$string.gender_dialog_male_android)) ? 1 : 0;
    }
}
