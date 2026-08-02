package ru.ozon.app.android.mapcommon.map;

import He0.a;
import Sc.r;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.AbstractC7094b;
import java.util.List;
import je0.C7406a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.SuggestionType;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u000eR6\u0010 \u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/mapcommon/map/OzonSuggestionsController;", "", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "geoProviderConfig", "Lkotlin/Function1;", "", "", "loading", "Lje0/a;", "analyticModule", "Lio/reactivex/b;", "createSuggestionsService", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lkotlin/jvm/functions/Function1;Lje0/a;)Lio/reactivex/b;", "onStart", "()V", "", SearchIntents.EXTRA_QUERY, "Lru/ozon/app/android/mapcommon/map/model/SuggestionType;", "suggestionType", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "boundingBox", "contextLocationUid", "search", "(Ljava/lang/String;Lru/ozon/app/android/mapcommon/map/model/SuggestionType;Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;Ljava/lang/String;)V", "clear", "LSc/r;", "", "LHe0/a;", "getSearchListener", "()Lkotlin/jvm/functions/Function1;", "setSearchListener", "(Lkotlin/jvm/functions/Function1;)V", "searchListener", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OzonSuggestionsController {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ AbstractC7094b createSuggestionsService$default(OzonSuggestionsController ozonSuggestionsController, GeoProviderConfig geoProviderConfig, Function1 function1, C7406a c7406a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSuggestionsService");
            }
            if ((i11 & 4) != 0) {
                c7406a = null;
            }
            return ozonSuggestionsController.createSuggestionsService(geoProviderConfig, function1, c7406a);
        }

        public static /* synthetic */ void search$default(OzonSuggestionsController ozonSuggestionsController, String str, SuggestionType suggestionType, BoundingBoxModel boundingBoxModel, String str2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: search");
            }
            if ((i11 & 2) != 0) {
                suggestionType = SuggestionType.ANY;
            }
            if ((i11 & 4) != 0) {
                boundingBoxModel = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            ozonSuggestionsController.search(str, suggestionType, boundingBoxModel, str2);
        }
    }

    void clear();

    @NotNull
    AbstractC7094b createSuggestionsService(@NotNull GeoProviderConfig geoProviderConfig, Function1<? super Boolean, Unit> loading, C7406a analyticModule);

    void onStart();

    void search(@NotNull String query, @NotNull SuggestionType suggestionType, BoundingBoxModel boundingBox, String contextLocationUid);

    void setSearchListener(Function1<? super r<? extends List<a>>, Unit> function1);
}
