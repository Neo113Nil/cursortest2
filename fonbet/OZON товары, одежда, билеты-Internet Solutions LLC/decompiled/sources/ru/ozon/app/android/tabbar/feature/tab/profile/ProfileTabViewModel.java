package ru.ozon.app.android.tabbar.feature.tab.profile;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileTabViewModel;", "", "", "isTheSameSelect", "", "onProfileTabSelected", "(Z)V", "LAe/h;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "getBadgeState", "()LAe/h;", "badgeState", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProfileTabViewModel {
    @NotNull
    InterfaceC2395h<ProfileViewModelImpl.BadgeVariant> getBadgeState();

    void onProfileTabSelected(boolean isTheSameSelect);
}
