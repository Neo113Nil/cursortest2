package bet.prediction.response;

import a4.e;
import a4.g;
import a4.h;
import a4.i;
import a4.l;
import androidx.appcompat.widget.c1;
import bet.prediction.response.GamesInfoData;
import bet.prediction.response.Prediction;
import bet.prediction.response.PredictionsApi;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import io.appmetrica.analytics.impl.C0644z2;
import io.sentry.config.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.collections.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.b;
import oi.s0;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0001&B!\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018¨\u0006'"}, d2 = {"Lbet/prediction/response/PredictionsApi;", "La4/l;", "Lio/sentry/config/a;", "", "", "Lbet/prediction/response/PredictionsApi$PreviewPrediction;", "data", "Lv3/b;", "httpException", "<init>", "(Ljava/util/List;Lv3/b;)V", "map", "()La4/l;", "component1", "()Ljava/util/List;", "component2", "()Lv3/b;", "copy", "(Ljava/util/List;Lv3/b;)Lbet/prediction/response/PredictionsApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Lv3/b;", "getHttpException", "La4/i;", "getPredictions", "predictions", "getStatusCode", "statusCode", "PreviewPrediction", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictionsApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionsApi.kt\nbet/prediction/response/PredictionsApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1617#2,9:123\n1869#2:132\n1870#2:134\n1626#2:135\n1#3:133\n*S KotlinDebug\n*F\n+ 1 PredictionsApi.kt\nbet/prediction/response/PredictionsApi\n*L\n18#1:123,9\n18#1:132\n18#1:134\n18#1:135\n18#1:133\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class PredictionsApi extends a implements l {

    @b("data")
    @Nullable
    private final List<PreviewPrediction> data;

    @Nullable
    private final v3.b httpException;

    public PredictionsApi(@Nullable List<PreviewPrediction> list, @Nullable v3.b bVar) {
        this.data = list;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PredictionsApi copy$default(PredictionsApi predictionsApi, List list, v3.b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = predictionsApi.data;
        }
        if ((i5 & 2) != 0) {
            bVar = predictionsApi.httpException;
        }
        return predictionsApi.copy(list, bVar);
    }

    @Nullable
    public final List<PreviewPrediction> component1() {
        return this.data;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final v3.b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final PredictionsApi copy(@Nullable List<PreviewPrediction> data, @Nullable v3.b httpException) {
        return new PredictionsApi(data, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictionsApi)) {
            return false;
        }
        PredictionsApi predictionsApi = (PredictionsApi) other;
        return Intrinsics.areEqual(this.data, predictionsApi.data) && Intrinsics.areEqual(this.httpException, predictionsApi.httpException);
    }

    @Nullable
    public final List<PreviewPrediction> getData() {
        return this.data;
    }

    @Override // v3.e
    @Nullable
    public v3.b getHttpException() {
        return this.httpException;
    }

    @Override // a4.l
    @Nullable
    public List<i> getPredictions() {
        i iVar;
        List<PreviewPrediction> list = this.data;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                iVar = ((PreviewPrediction) it.next()).mapper();
            } catch (Exception unused) {
                iVar = null;
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        v3.b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        List<PreviewPrediction> list = this.data;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        v3.b bVar = this.httpException;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PredictionsApi(data=" + this.data + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public l m71map() {
        return new l(this) { // from class: bet.prediction.response.PredictionsApi$map$1
            private final v3.b httpException;
            private final List<i> predictions;
            private final int statusCode;

            {
                this.predictions = this.getPredictions();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public v3.b getHttpException() {
                return this.httpException;
            }

            @Override // a4.l
            public List<i> getPredictions() {
                return this.predictions;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b2\b\u0080\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b2\u00103JÎ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b6\u0010#J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001eJ\u001a\u0010:\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010?R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010 \"\u0004\bB\u0010CR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010@\u001a\u0004\bD\u0010 \"\u0004\bE\u0010CR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010#\"\u0004\bH\u0010IR$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010F\u001a\u0004\bJ\u0010#\"\u0004\bK\u0010IR$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010F\u001a\u0004\bL\u0010#\"\u0004\bM\u0010IR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010N\u001a\u0004\bO\u0010'\"\u0004\bP\u0010QR$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\bR\u0010#\"\u0004\bS\u0010IR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bT\u0010#\"\u0004\bU\u0010IR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010+\"\u0004\bX\u0010YR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010V\u001a\u0004\bZ\u0010+\"\u0004\b[\u0010YR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\\\u001a\u0004\b]\u0010.\"\u0004\b^\u0010_R$\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\\\u001a\u0004\b`\u0010.\"\u0004\ba\u0010_R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010b\u001a\u0004\bc\u00101\"\u0004\bd\u0010eR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010f\u001a\u0004\bg\u00103\"\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lbet/prediction/response/PredictionsApi$PreviewPrediction;", "Ljava/io/Serializable;", "", "id", "Lbet/prediction/response/GamesInfoData$Team;", "homeTeam", "guestTeam", "", "leagueName", PredictionTable.startTimeColumn, C0644z2.f14985g, "Lbet/prediction/response/Prediction$Forecast;", "ourPredict", "predict", "shortPredict", PredictionTable.statusColumn, "type", "", "purchased", PredictionTable.publicationColumn, "", "kindsOfSport", "", "expressPrediction", "<init>", "(ILbet/prediction/response/GamesInfoData$Team;Lbet/prediction/response/GamesInfoData$Team;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbet/prediction/response/Prediction$Forecast;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;[Ljava/lang/Integer;Ljava/util/List;)V", "La4/i;", "mapper", "()La4/i;", "component1", "()I", "component2", "()Lbet/prediction/response/GamesInfoData$Team;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Lbet/prediction/response/Prediction$Forecast;", "component8", "component9", "component10", "()Ljava/lang/Integer;", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "()[Ljava/lang/Integer;", "component15", "()Ljava/util/List;", "copy", "(ILbet/prediction/response/GamesInfoData$Team;Lbet/prediction/response/GamesInfoData$Team;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbet/prediction/response/Prediction$Forecast;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;[Ljava/lang/Integer;Ljava/util/List;)Lbet/prediction/response/PredictionsApi$PreviewPrediction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Lbet/prediction/response/GamesInfoData$Team;", "getHomeTeam", "setHomeTeam", "(Lbet/prediction/response/GamesInfoData$Team;)V", "getGuestTeam", "setGuestTeam", "Ljava/lang/String;", "getLeagueName", "setLeagueName", "(Ljava/lang/String;)V", "getStartTime", "setStartTime", "getBackground", "setBackground", "Lbet/prediction/response/Prediction$Forecast;", "getOurPredict", "setOurPredict", "(Lbet/prediction/response/Prediction$Forecast;)V", "getPredict", "setPredict", "getShortPredict", "setShortPredict", "Ljava/lang/Integer;", "getStatus", "setStatus", "(Ljava/lang/Integer;)V", "getType", "setType", "Ljava/lang/Boolean;", "getPurchased", "setPurchased", "(Ljava/lang/Boolean;)V", "getPublication", "setPublication", "[Ljava/lang/Integer;", "getKindsOfSport", "setKindsOfSport", "([Ljava/lang/Integer;)V", "Ljava/util/List;", "getExpressPrediction", "setExpressPrediction", "(Ljava/util/List;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreviewPrediction implements Serializable {

        @b(C0644z2.f14985g)
        @Nullable
        private String background;

        @b("express_forecasts")
        @Nullable
        private List<PreviewPrediction> expressPrediction;

        @b("team2")
        @Nullable
        private GamesInfoData.Team guestTeam;

        @b("team1")
        @Nullable
        private GamesInfoData.Team homeTeam;

        @b("id")
        private int id;

        @b("sport_types")
        @Nullable
        private Integer[] kindsOfSport;

        @b(PredictionTable.leagueColumn)
        @Nullable
        private String leagueName;

        @b("our_predict")
        @Nullable
        private Prediction.Forecast ourPredict;

        @b("predict")
        @Nullable
        private String predict;

        @b("need_publication")
        @Nullable
        private Boolean publication;

        @b("purchased")
        @Nullable
        private Boolean purchased;

        @b("short_predict")
        @Nullable
        private String shortPredict;

        @b("start_time")
        @Nullable
        private String startTime;

        @b(PredictionTable.statusColumn)
        @Nullable
        private Integer status;

        @b("type")
        @Nullable
        private Integer type;

        public PreviewPrediction(int i5, @Nullable GamesInfoData.Team team, @Nullable GamesInfoData.Team team2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Prediction.Forecast forecast, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer[] numArr, @Nullable List<PreviewPrediction> list) {
            this.id = i5;
            this.homeTeam = team;
            this.guestTeam = team2;
            this.leagueName = str;
            this.startTime = str2;
            this.background = str3;
            this.ourPredict = forecast;
            this.predict = str4;
            this.shortPredict = str5;
            this.status = num;
            this.type = num2;
            this.purchased = bool;
            this.publication = bool2;
            this.kindsOfSport = numArr;
            this.expressPrediction = list;
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final Boolean getPurchased() {
            return this.purchased;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final Boolean getPublication() {
            return this.publication;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final Integer[] getKindsOfSport() {
            return this.kindsOfSport;
        }

        @Nullable
        public final List<PreviewPrediction> component15() {
            return this.expressPrediction;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final GamesInfoData.Team getHomeTeam() {
            return this.homeTeam;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final GamesInfoData.Team getGuestTeam() {
            return this.guestTeam;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getLeagueName() {
            return this.leagueName;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getStartTime() {
            return this.startTime;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Prediction.Forecast getOurPredict() {
            return this.ourPredict;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final String getPredict() {
            return this.predict;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final String getShortPredict() {
            return this.shortPredict;
        }

        @NotNull
        public final PreviewPrediction copy(int id2, @Nullable GamesInfoData.Team homeTeam, @Nullable GamesInfoData.Team guestTeam, @Nullable String leagueName, @Nullable String startTime, @Nullable String background, @Nullable Prediction.Forecast ourPredict, @Nullable String predict, @Nullable String shortPredict, @Nullable Integer status, @Nullable Integer type, @Nullable Boolean purchased, @Nullable Boolean publication, @Nullable Integer[] kindsOfSport, @Nullable List<PreviewPrediction> expressPrediction) {
            return new PreviewPrediction(id2, homeTeam, guestTeam, leagueName, startTime, background, ourPredict, predict, shortPredict, status, type, purchased, publication, kindsOfSport, expressPrediction);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewPrediction)) {
                return false;
            }
            PreviewPrediction previewPrediction = (PreviewPrediction) other;
            return this.id == previewPrediction.id && Intrinsics.areEqual(this.homeTeam, previewPrediction.homeTeam) && Intrinsics.areEqual(this.guestTeam, previewPrediction.guestTeam) && Intrinsics.areEqual(this.leagueName, previewPrediction.leagueName) && Intrinsics.areEqual(this.startTime, previewPrediction.startTime) && Intrinsics.areEqual(this.background, previewPrediction.background) && Intrinsics.areEqual(this.ourPredict, previewPrediction.ourPredict) && Intrinsics.areEqual(this.predict, previewPrediction.predict) && Intrinsics.areEqual(this.shortPredict, previewPrediction.shortPredict) && Intrinsics.areEqual(this.status, previewPrediction.status) && Intrinsics.areEqual(this.type, previewPrediction.type) && Intrinsics.areEqual(this.purchased, previewPrediction.purchased) && Intrinsics.areEqual(this.publication, previewPrediction.publication) && Intrinsics.areEqual(this.kindsOfSport, previewPrediction.kindsOfSport) && Intrinsics.areEqual(this.expressPrediction, previewPrediction.expressPrediction);
        }

        @Nullable
        public final String getBackground() {
            return this.background;
        }

        @Nullable
        public final List<PreviewPrediction> getExpressPrediction() {
            return this.expressPrediction;
        }

        @Nullable
        public final GamesInfoData.Team getGuestTeam() {
            return this.guestTeam;
        }

        @Nullable
        public final GamesInfoData.Team getHomeTeam() {
            return this.homeTeam;
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final Integer[] getKindsOfSport() {
            return this.kindsOfSport;
        }

        @Nullable
        public final String getLeagueName() {
            return this.leagueName;
        }

        @Nullable
        public final Prediction.Forecast getOurPredict() {
            return this.ourPredict;
        }

        @Nullable
        public final String getPredict() {
            return this.predict;
        }

        @Nullable
        public final Boolean getPublication() {
            return this.publication;
        }

        @Nullable
        public final Boolean getPurchased() {
            return this.purchased;
        }

        @Nullable
        public final String getShortPredict() {
            return this.shortPredict;
        }

        @Nullable
        public final String getStartTime() {
            return this.startTime;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        public int hashCode() {
            int i5 = this.id * 31;
            GamesInfoData.Team team = this.homeTeam;
            int hashCode = (i5 + (team == null ? 0 : team.hashCode())) * 31;
            GamesInfoData.Team team2 = this.guestTeam;
            int hashCode2 = (hashCode + (team2 == null ? 0 : team2.hashCode())) * 31;
            String str = this.leagueName;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.startTime;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.background;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Prediction.Forecast forecast = this.ourPredict;
            int hashCode6 = (hashCode5 + (forecast == null ? 0 : forecast.hashCode())) * 31;
            String str4 = this.predict;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.shortPredict;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.status;
            int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.type;
            int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.purchased;
            int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.publication;
            int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer[] numArr = this.kindsOfSport;
            int hashCode13 = (hashCode12 + (numArr == null ? 0 : Arrays.hashCode(numArr))) * 31;
            List<PreviewPrediction> list = this.expressPrediction;
            return hashCode13 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public final i mapper() {
            return new i(this) { // from class: bet.prediction.response.PredictionsApi$PreviewPrediction$mapper$1
                private g analytics;
                private String background;
                private Long changeDate;
                private Long createDate;
                private String[] existLang;
                private List<? extends i> expressPrediction;
                private List<? extends h> forecasts;
                private e guestTeam;
                private e homeTeam;
                private int id;
                private Integer[] kindsOfSport;
                private String lang;
                private String leagueName;
                private String priceType;
                private Boolean publication;
                private Integer purchaseType;
                private Boolean purchased;
                private Boolean resultsIsViewed;
                private String startTime;
                private String status;
                private int type;

                {
                    this.id = this.getId();
                    Boolean publication = this.getPublication();
                    this.publication = Boolean.valueOf(publication != null ? publication.booleanValue() : false);
                    this.leagueName = this.getLeagueName();
                    this.startTime = this.getStartTime();
                    this.background = this.getBackground();
                    this.analytics = new g(this) { // from class: bet.prediction.response.PredictionsApi$PreviewPrediction$mapper$1$analytics$1
                        private final String full;
                        private final String short;

                        {
                            this.full = this.getPredict();
                            this.short = this.getShortPredict();
                        }

                        @Override // a4.g
                        public String getFull() {
                            return this.full;
                        }

                        @Override // a4.g
                        public String getShort() {
                            return this.short;
                        }
                    };
                    this.purchased = this.getPurchased();
                    Integer type = this.getType();
                    this.type = type != null ? type.intValue() : 1;
                    Integer status = this.getStatus();
                    String str = "unknown";
                    if (status != null) {
                        if (status.intValue() == 0) {
                            str = Prediction.NOT_PASSED;
                        } else if (status.intValue() == 1) {
                            str = "success";
                        } else if (status.intValue() == 2) {
                            str = Prediction.RETURN;
                        }
                    }
                    this.status = str;
                    ArrayList arrayList = null;
                    this.forecasts = this.getOurPredict() == null ? null : t.c(new h(this) { // from class: bet.prediction.response.PredictionsApi$PreviewPrediction$mapper$1$forecasts$1
                        private final String coefficient;
                        private final String forecast;
                        private final int own;

                        {
                            Prediction.Forecast ourPredict = this.getOurPredict();
                            Intrinsics.checkNotNull(ourPredict);
                            this.forecast = ourPredict.getForecast();
                            Prediction.Forecast ourPredict2 = this.getOurPredict();
                            Intrinsics.checkNotNull(ourPredict2);
                            this.coefficient = ourPredict2.getCoefficient();
                            Prediction.Forecast ourPredict3 = this.getOurPredict();
                            Intrinsics.checkNotNull(ourPredict3);
                            this.own = ourPredict3.getOwn() ? 1 : 0;
                        }

                        @Override // a4.h
                        public String getCoefficient() {
                            return this.coefficient;
                        }

                        @Override // a4.h
                        public String getForecast() {
                            return this.forecast;
                        }

                        @Override // a4.h
                        public int getOwn() {
                            return this.own;
                        }
                    });
                    final GamesInfoData.Team homeTeam = this.getHomeTeam();
                    this.homeTeam = homeTeam != null ? new e(homeTeam) { // from class: bet.prediction.response.PredictionsApi$PreviewPrediction$mapper$1$homeTeam$1
                        private final String flag;
                        private final int id;
                        private final String name;
                        private final Integer score;
                        private final Integer scoreExtra;

                        {
                            this.scoreExtra = homeTeam.getScoreExtra();
                            this.score = homeTeam.getScore();
                            this.flag = homeTeam.getFlag();
                            this.id = homeTeam.getId();
                            this.name = homeTeam.getName();
                        }

                        @Override // a4.e
                        public String getFlag() {
                            return this.flag;
                        }

                        @Override // a4.e
                        public int getId() {
                            return this.id;
                        }

                        @Override // a4.e
                        public String getName() {
                            return this.name;
                        }

                        @Override // a4.e
                        public Integer getScore() {
                            return this.score;
                        }

                        @Override // a4.e
                        public Integer getScoreExtra() {
                            return this.scoreExtra;
                        }
                    } : null;
                    final GamesInfoData.Team guestTeam = this.getGuestTeam();
                    this.guestTeam = guestTeam != null ? new e(guestTeam) { // from class: bet.prediction.response.PredictionsApi$PreviewPrediction$mapper$1$guestTeam$1
                        private final String flag;
                        private final int id;
                        private final String name;
                        private final Integer score;
                        private final Integer scoreExtra;

                        {
                            this.scoreExtra = guestTeam.getScoreExtra();
                            this.score = guestTeam.getScore();
                            this.flag = guestTeam.getFlag();
                            this.id = guestTeam.getId();
                            this.name = guestTeam.getName();
                        }

                        @Override // a4.e
                        public String getFlag() {
                            return this.flag;
                        }

                        @Override // a4.e
                        public int getId() {
                            return this.id;
                        }

                        @Override // a4.e
                        public String getName() {
                            return this.name;
                        }

                        @Override // a4.e
                        public Integer getScore() {
                            return this.score;
                        }

                        @Override // a4.e
                        public Integer getScoreExtra() {
                            return this.scoreExtra;
                        }
                    } : null;
                    Integer[] kindsOfSport = this.getKindsOfSport();
                    this.kindsOfSport = kindsOfSport == null ? new Integer[0] : kindsOfSport;
                    List<PredictionsApi.PreviewPrediction> expressPrediction = this.getExpressPrediction();
                    if (expressPrediction != null) {
                        arrayList = new ArrayList(v.k(expressPrediction, 10));
                        Iterator<T> it = expressPrediction.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PredictionsApi.PreviewPrediction) it.next()).mapper());
                        }
                    }
                    this.expressPrediction = arrayList;
                }

                @Override // a4.i
                public g getAnalytics() {
                    return this.analytics;
                }

                @Override // a4.i
                public String getBackground() {
                    return this.background;
                }

                public Long getChangeDate() {
                    return this.changeDate;
                }

                public Long getCreateDate() {
                    return this.createDate;
                }

                public String[] getExistLang() {
                    return this.existLang;
                }

                public List<i> getExpressPrediction() {
                    return this.expressPrediction;
                }

                @Override // a4.i
                public List<h> getForecasts() {
                    return this.forecasts;
                }

                @Override // a4.i
                public e getGuestTeam() {
                    return this.guestTeam;
                }

                @Override // a4.i
                public e getHomeTeam() {
                    return this.homeTeam;
                }

                @Override // a4.i
                public int getId() {
                    return this.id;
                }

                @Override // a4.i
                public Integer[] getKindsOfSport() {
                    return this.kindsOfSport;
                }

                public String getLang() {
                    return this.lang;
                }

                @Override // a4.i
                public String getLeagueName() {
                    return this.leagueName;
                }

                public String getPriceType() {
                    return this.priceType;
                }

                @Override // a4.i
                public Boolean getPublication() {
                    return this.publication;
                }

                public Integer getPurchaseType() {
                    return this.purchaseType;
                }

                @Override // a4.i
                public Boolean getPurchased() {
                    return this.purchased;
                }

                @Override // a4.i
                public Boolean getResultsIsViewed() {
                    return this.resultsIsViewed;
                }

                @Override // a4.i
                public String getStartTime() {
                    return this.startTime;
                }

                @Override // a4.i
                public String getStatus() {
                    return this.status;
                }

                @Override // a4.i
                public int getType() {
                    return this.type;
                }

                public void setAnalytics(g gVar) {
                    this.analytics = gVar;
                }

                public void setBackground(String str) {
                    this.background = str;
                }

                public void setChangeDate(Long l6) {
                    this.changeDate = l6;
                }

                public void setCreateDate(Long l6) {
                    this.createDate = l6;
                }

                public void setExistLang(String[] strArr) {
                    this.existLang = strArr;
                }

                public void setExpressPrediction(List<? extends i> list) {
                    this.expressPrediction = list;
                }

                public void setForecasts(List<? extends h> list) {
                    this.forecasts = list;
                }

                public void setGuestTeam(e eVar) {
                    this.guestTeam = eVar;
                }

                public void setHomeTeam(e eVar) {
                    this.homeTeam = eVar;
                }

                public void setId(int i5) {
                    this.id = i5;
                }

                public void setKindsOfSport(Integer[] numArr) {
                    this.kindsOfSport = numArr;
                }

                public void setLang(String str) {
                    this.lang = str;
                }

                public void setLeagueName(String str) {
                    this.leagueName = str;
                }

                public void setPriceType(String str) {
                    this.priceType = str;
                }

                public void setPublication(Boolean bool) {
                    this.publication = bool;
                }

                public void setPurchaseType(Integer num) {
                    this.purchaseType = num;
                }

                public void setPurchased(Boolean bool) {
                    this.purchased = bool;
                }

                public void setResultsIsViewed(Boolean bool) {
                    this.resultsIsViewed = bool;
                }

                public void setStartTime(String str) {
                    this.startTime = str;
                }

                public void setStatus(String str) {
                    this.status = str;
                }

                public void setType(int i5) {
                    this.type = i5;
                }
            };
        }

        public final void setBackground(@Nullable String str) {
            this.background = str;
        }

        public final void setExpressPrediction(@Nullable List<PreviewPrediction> list) {
            this.expressPrediction = list;
        }

        public final void setGuestTeam(@Nullable GamesInfoData.Team team) {
            this.guestTeam = team;
        }

        public final void setHomeTeam(@Nullable GamesInfoData.Team team) {
            this.homeTeam = team;
        }

        public final void setId(int i5) {
            this.id = i5;
        }

        public final void setKindsOfSport(@Nullable Integer[] numArr) {
            this.kindsOfSport = numArr;
        }

        public final void setLeagueName(@Nullable String str) {
            this.leagueName = str;
        }

        public final void setOurPredict(@Nullable Prediction.Forecast forecast) {
            this.ourPredict = forecast;
        }

        public final void setPredict(@Nullable String str) {
            this.predict = str;
        }

        public final void setPublication(@Nullable Boolean bool) {
            this.publication = bool;
        }

        public final void setPurchased(@Nullable Boolean bool) {
            this.purchased = bool;
        }

        public final void setShortPredict(@Nullable String str) {
            this.shortPredict = str;
        }

        public final void setStartTime(@Nullable String str) {
            this.startTime = str;
        }

        public final void setStatus(@Nullable Integer num) {
            this.status = num;
        }

        public final void setType(@Nullable Integer num) {
            this.type = num;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PreviewPrediction(id=");
            sb2.append(this.id);
            sb2.append(", homeTeam=");
            sb2.append(this.homeTeam);
            sb2.append(", guestTeam=");
            sb2.append(this.guestTeam);
            sb2.append(", leagueName=");
            sb2.append(this.leagueName);
            sb2.append(", startTime=");
            sb2.append(this.startTime);
            sb2.append(", background=");
            sb2.append(this.background);
            sb2.append(", ourPredict=");
            sb2.append(this.ourPredict);
            sb2.append(", predict=");
            sb2.append(this.predict);
            sb2.append(", shortPredict=");
            sb2.append(this.shortPredict);
            sb2.append(", status=");
            sb2.append(this.status);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", purchased=");
            sb2.append(this.purchased);
            sb2.append(", publication=");
            sb2.append(this.publication);
            sb2.append(", kindsOfSport=");
            sb2.append(Arrays.toString(this.kindsOfSport));
            sb2.append(", expressPrediction=");
            return c1.p(sb2, this.expressPrediction, ')');
        }

        public /* synthetic */ PreviewPrediction(int i5, GamesInfoData.Team team, GamesInfoData.Team team2, String str, String str2, String str3, Prediction.Forecast forecast, String str4, String str5, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer[] numArr, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i5, team, team2, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : forecast, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? 1 : num, (i10 & Segment.SHARE_MINIMUM) != 0 ? 1 : num2, (i10 & 2048) != 0 ? Boolean.FALSE : bool, (i10 & 4096) != 0 ? Boolean.FALSE : bool2, (i10 & Segment.SIZE) != 0 ? new Integer[0] : numArr, list);
        }
    }
}
