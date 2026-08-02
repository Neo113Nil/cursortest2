package ru.ozon.app.android.fresh.navigation.di.components;

import Pc.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.interceptors.MoveCartItemsPayloadHandler;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/components/FreshNavigationComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepository;", "getFreshTabConfigRepository", "()Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepository;", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "getFreshPdpInBottomSheetHandler", "()Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepository;", "getAvatarProfileRepository", "()Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarRepository;", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel;", "getAvatarProfileViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "getMoveCartItemsPayloadHandler", "()Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FreshNavigationComponentApi extends InterfaceC6958a {
    @NotNull
    AvatarRepository getAvatarProfileRepository();

    @NotNull
    a<AvatarProfileViewModel> getAvatarProfileViewModelProvider();

    @NotNull
    FreshPdpInBottomSheetHandler getFreshPdpInBottomSheetHandler();

    @NotNull
    FreshTabConfigRepository getFreshTabConfigRepository();

    @NotNull
    MoveCartItemsPayloadHandler getMoveCartItemsPayloadHandler();
}
