package bet.prediction.response.support;

import b4.h;
import b4.k;
import bet.prediction.response.support.SupportMessagesApi;
import com.sports.insider.data.repository.room.live.LiveTable;
import io.sentry.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"Lbet/prediction/response/support/SupportMessageApi;", "Lb4/h;", "Lio/sentry/config/a;", "", "Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;", "msg", "Lv3/b;", "httpException", "<init>", "(Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;Lv3/b;)V", "map", "()Lb4/h;", "component1", "()Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;", "component2", "()Lv3/b;", "copy", "(Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;Lv3/b;)Lbet/prediction/response/support/SupportMessageApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;", "getMsg", "Lv3/b;", "getHttpException", "Lb4/k;", "getMessage", "()Lb4/k;", LiveTable.messageColumn, "getStatusCode", "statusCode", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SupportMessageApi extends a implements h {

    @Nullable
    private final b httpException;

    @o9.b("data")
    @Nullable
    private final SupportMessagesApi.SupportMessage msg;

    public SupportMessageApi(@Nullable SupportMessagesApi.SupportMessage supportMessage, @Nullable b bVar) {
        this.msg = supportMessage;
        this.httpException = bVar;
    }

    public static /* synthetic */ SupportMessageApi copy$default(SupportMessageApi supportMessageApi, SupportMessagesApi.SupportMessage supportMessage, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            supportMessage = supportMessageApi.msg;
        }
        if ((i5 & 2) != 0) {
            bVar = supportMessageApi.httpException;
        }
        return supportMessageApi.copy(supportMessage, bVar);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final SupportMessagesApi.SupportMessage getMsg() {
        return this.msg;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final SupportMessageApi copy(@Nullable SupportMessagesApi.SupportMessage msg, @Nullable b httpException) {
        return new SupportMessageApi(msg, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportMessageApi)) {
            return false;
        }
        SupportMessageApi supportMessageApi = (SupportMessageApi) other;
        return Intrinsics.areEqual(this.msg, supportMessageApi.msg) && Intrinsics.areEqual(this.httpException, supportMessageApi.httpException);
    }

    @Override // v3.e
    @Nullable
    public b getHttpException() {
        return this.httpException;
    }

    @Override // b4.h
    @Nullable
    public k getMessage() {
        return SupportMessagesApi.SupportMessage.INSTANCE.mapper(this.msg);
    }

    @Nullable
    public final SupportMessagesApi.SupportMessage getMsg() {
        return this.msg;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        SupportMessagesApi.SupportMessage supportMessage = this.msg;
        int hashCode = (supportMessage == null ? 0 : supportMessage.hashCode()) * 31;
        b bVar = this.httpException;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SupportMessageApi(msg=" + this.msg + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public h m89map() {
        return new h(this) { // from class: bet.prediction.response.support.SupportMessageApi$map$1
            private final b httpException;
            private final k message;
            private final int statusCode;

            {
                this.message = this.getMessage();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public b getHttpException() {
                return this.httpException;
            }

            @Override // b4.h
            public k getMessage() {
                return this.message;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }
}
