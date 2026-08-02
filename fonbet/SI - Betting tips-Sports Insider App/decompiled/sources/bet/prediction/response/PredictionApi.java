package bet.prediction.response;

import a4.i;
import a4.l;
import bet.prediction.response.PredictionsApi;
import io.sentry.config.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.b;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0017¨\u0006'"}, d2 = {"Lbet/prediction/response/PredictionApi;", "La4/l;", "Lio/sentry/config/a;", "", "Lbet/prediction/response/PredictionsApi$PreviewPrediction;", "data", "Lv3/b;", "httpException", "<init>", "(Lbet/prediction/response/PredictionsApi$PreviewPrediction;Lv3/b;)V", "map", "()La4/l;", "component1", "()Lbet/prediction/response/PredictionsApi$PreviewPrediction;", "component2", "()Lv3/b;", "copy", "(Lbet/prediction/response/PredictionsApi$PreviewPrediction;Lv3/b;)Lbet/prediction/response/PredictionApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbet/prediction/response/PredictionsApi$PreviewPrediction;", "getData", "Lv3/b;", "getHttpException", "", "La4/i;", "getPredictions", "()Ljava/util/List;", "predictions", "getStatusCode", "statusCode", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictionApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionApi.kt\nbet/prediction/response/PredictionApi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class PredictionApi extends a implements l {

    @b("data")
    @Nullable
    private final PredictionsApi.PreviewPrediction data;

    @Nullable
    private final v3.b httpException;

    public PredictionApi(@Nullable PredictionsApi.PreviewPrediction previewPrediction, @Nullable v3.b bVar) {
        this.data = previewPrediction;
        this.httpException = bVar;
    }

    public static /* synthetic */ PredictionApi copy$default(PredictionApi predictionApi, PredictionsApi.PreviewPrediction previewPrediction, v3.b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            previewPrediction = predictionApi.data;
        }
        if ((i5 & 2) != 0) {
            bVar = predictionApi.httpException;
        }
        return predictionApi.copy(previewPrediction, bVar);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PredictionsApi.PreviewPrediction getData() {
        return this.data;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final v3.b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final PredictionApi copy(@Nullable PredictionsApi.PreviewPrediction data, @Nullable v3.b httpException) {
        return new PredictionApi(data, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictionApi)) {
            return false;
        }
        PredictionApi predictionApi = (PredictionApi) other;
        return Intrinsics.areEqual(this.data, predictionApi.data) && Intrinsics.areEqual(this.httpException, predictionApi.httpException);
    }

    @Nullable
    public final PredictionsApi.PreviewPrediction getData() {
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
        i mapper;
        PredictionsApi.PreviewPrediction previewPrediction = this.data;
        if (previewPrediction == null || (mapper = previewPrediction.mapper()) == null) {
            return null;
        }
        return t.c(mapper);
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
        PredictionsApi.PreviewPrediction previewPrediction = this.data;
        int hashCode = (previewPrediction == null ? 0 : previewPrediction.hashCode()) * 31;
        v3.b bVar = this.httpException;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PredictionApi(data=" + this.data + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public l m70map() {
        return new l(this) { // from class: bet.prediction.response.PredictionApi$map$1
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
}
