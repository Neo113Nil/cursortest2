package ru.ozon.app.android.mapcommon.map.sdk;

import Bc.f;
import De.s;
import Ge0.b;
import He0.a;
import Sc.r;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.AbstractC7094b;
import io.reactivex.B;
import io.reactivex.z;
import java.util.List;
import je0.C7406a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.mapcommon.map.OzonSuggestionsController;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.SuggestionType;
import ru.ozon.app.android.mapcommon.map.model.SuggestionTypeKt;
import ru.ozon.app.android.mapcommon.map.sdk.SdkSuggestionsController;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import vc.j;
import we0.m;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10720e0;
import xe.C10749t0;
import xe.G;
import xe.L0;
import xe.O;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J3\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRX\u0010%\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062 \u0010 \u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/mapcommon/map/sdk/SdkSuggestionsController;", "Lru/ozon/app/android/mapcommon/map/OzonSuggestionsController;", "<init>", "()V", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "geoProviderConfig", "Lkotlin/Function1;", "", "", "loading", "Lje0/a;", "analyticModule", "Lio/reactivex/b;", "createSuggestionsService", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lkotlin/jvm/functions/Function1;Lje0/a;)Lio/reactivex/b;", "onStart", "", SearchIntents.EXTRA_QUERY, "Lru/ozon/app/android/mapcommon/map/model/SuggestionType;", "suggestionType", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "boundingBox", "contextLocationUid", "search", "(Ljava/lang/String;Lru/ozon/app/android/mapcommon/map/model/SuggestionType;Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;Ljava/lang/String;)V", "clear", "LGe0/b;", "suggestionsService", "LGe0/b;", "LSc/r;", "", "LHe0/a;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getSearchListener", "()Lkotlin/jvm/functions/Function1;", "setSearchListener", "(Lkotlin/jvm/functions/Function1;)V", "searchListener", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SdkSuggestionsController implements OzonSuggestionsController {
    private b suggestionsService;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSuggestionsService$lambda$1(Function1 function1) {
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void clear() {
        b bVar = this.suggestionsService;
        if (bVar != null) {
            bVar.clear();
        } else {
            Intrinsics.n("suggestionsService");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    @NotNull
    public AbstractC7094b createSuggestionsService(@NotNull GeoProviderConfig geoProviderConfig, final Function1<? super Boolean, Unit> loading, C7406a analyticModule) {
        Intrinsics.checkNotNullParameter(geoProviderConfig, "geoProviderConfig");
        C10720e0 c10720e0 = C10720e0.f105451a;
        final L0 l02 = s.f6650a;
        final SdkSuggestionsController$createSuggestionsService$1 sdkSuggestionsController$createSuggestionsService$1 = new SdkSuggestionsController$createSuggestionsService$1(loading, analyticModule, geoProviderConfig, null);
        if (l02.get(B0.f105374o0) == null) {
            j jVar = new j(new f(new Bc.j(new Bc.b(new B() { // from class: Ge.q
                @Override // io.reactivex.B
                public final void b(z zVar) {
                    AbstractC10711a pVar = new p(G.c(C10749t0.f105499a, L0.this), zVar);
                    zVar.a(new g(pVar));
                    pVar.y0(O.DEFAULT, pVar, sdkSuggestionsController$createSuggestionsService$1);
                }
            }), new Gy.b(new SdkSuggestionsController$createSuggestionsService$2(this), 5)), new InterfaceC9019a() { // from class: Zy.c
                @Override // qc.InterfaceC9019a
                public final void run() {
                    SdkSuggestionsController.createSuggestionsService$lambda$1(Function1.this);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(jVar, "ignoreElement(...)");
            return jVar;
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + l02).toString());
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void onStart() {
        if (this.suggestionsService != null) {
            return;
        }
        Intrinsics.n("suggestionsService");
        throw null;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void search(@NotNull String query, @NotNull SuggestionType suggestionType, BoundingBoxModel boundingBox, String contextLocationUid) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(suggestionType, "suggestionType");
        He0.b bVar = boundingBox != null ? new He0.b(new m(boundingBox.getSouthWest().getLatitude(), boundingBox.getSouthWest().getLongitude()), new m(boundingBox.getNorthEast().getLatitude(), boundingBox.getNorthEast().getLongitude())) : null;
        b bVar2 = this.suggestionsService;
        if (bVar2 != null) {
            bVar2.a(query, bVar, SuggestionTypeKt.toSdkSuggestionType(suggestionType), contextLocationUid);
        } else {
            Intrinsics.n("suggestionsService");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void setSearchListener(Function1<? super r<? extends List<a>>, Unit> function1) {
        b bVar = this.suggestionsService;
        if (bVar != null) {
            bVar.setSearchListener(function1);
        } else {
            Intrinsics.n("suggestionsService");
            throw null;
        }
    }
}
