package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.UpdateFavoriteResponse;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0006"}, d2 = {"toRestriction", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse;", "mapDuration", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse$RestrictionLifeTime;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateFavoriteResponse.RestrictionLifeTime.values().length];
            try {
                iArr[UpdateFavoriteResponse.RestrictionLifeTime.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateFavoriteResponse.RestrictionLifeTime.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpdateFavoriteResponse.RestrictionLifeTime.INFINITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final long mapDuration(UpdateFavoriteResponse.RestrictionLifeTime restrictionLifeTime) {
        int i11 = restrictionLifeTime == null ? -1 : WhenMappings.$EnumSwitchMapping$0[restrictionLifeTime.ordinal()];
        if (i11 == 1) {
            return 3000L;
        }
        if (i11 != 2) {
            return i11 != 3 ? 3000L : 10000L;
        }
        return 6000L;
    }

    @NotNull
    public static final RestrictionModel toRestriction(@NotNull UpdateFavoriteResponse updateFavoriteResponse) {
        Intrinsics.checkNotNullParameter(updateFavoriteResponse, "<this>");
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(updateFavoriteResponse.getMessage());
        long mapDuration = mapDuration(updateFavoriteResponse.getLifetime());
        String title = updateFavoriteResponse.getTitle();
        return new RestrictionModel(ozonSpannableString, mapDuration, title != null ? OzonSpannableStringKt.toOzonSpannableString(title) : null);
    }
}
