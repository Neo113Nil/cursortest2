package bet.prediction.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oi.q;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.a;
import v3.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbet/prediction/response/MHttpException;", "Lv3/b;", "Loi/q;", "Loi/s0;", "response", "Lv3/a;", "msg4xx", "", "errorBody", "<init>", "(Loi/s0;Lv3/a;Ljava/lang/String;)V", "Loi/s0;", "getResponse", "()Loi/s0;", "Lv3/a;", "getMsg4xx", "()Lv3/a;", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MHttpException extends q implements b {

    @Nullable
    private final String errorBody;

    @Nullable
    private final a msg4xx;

    @NotNull
    private final s0<?> response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHttpException(@NotNull s0<?> response, @Nullable a aVar, @Nullable String str) {
        super(response);
        Intrinsics.checkNotNullParameter(response, "response");
        this.response = response;
        this.msg4xx = aVar;
        this.errorBody = str;
    }

    @Nullable
    public String getErrorBody() {
        return this.errorBody;
    }

    @Override // v3.b
    @Nullable
    public a getMsg4xx() {
        return this.msg4xx;
    }

    @Override // v3.b
    @NotNull
    public s0<?> getResponse() {
        return this.response;
    }

    public /* synthetic */ MHttpException(s0 s0Var, a aVar, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, (i5 & 2) != 0 ? null : aVar, (i5 & 4) != 0 ? null : str);
    }
}
