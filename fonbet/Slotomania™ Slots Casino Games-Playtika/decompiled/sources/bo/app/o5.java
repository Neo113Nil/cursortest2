package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¨\u0006\u0010"}, d2 = {"Lbo/app/o5;", "Lcom/braze/models/IPutIntoJson;", "", "toString", "e", "", "hashCode", "", "other", "", "equals", "Ljava/util/UUID;", "sessionIdUuid", "<init>", "(Ljava/util/UUID;)V", Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class o5 implements IPutIntoJson<String> {
    public static final a d = new a(null);
    private final UUID b;
    private final String c;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lbo/app/o5$a;", "", "Lbo/app/o5;", Constants.BRAZE_PUSH_CONTENT_KEY, "", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final o5 a() {
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            return new o5(randomUUID);
        }

        @JvmStatic
        public final o5 a(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            UUID fromString = UUID.fromString(sessionId);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionId)");
            return new o5(fromString);
        }
    }

    public o5(UUID sessionIdUuid) {
        Intrinsics.checkNotNullParameter(sessionIdUuid, "sessionIdUuid");
        this.b = sessionIdUuid;
        String uuid = sessionIdUuid.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "sessionIdUuid.toString()");
        this.c = uuid;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public String getJsonObject() {
        return this.c;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof o5) && Intrinsics.areEqual(this.b, ((o5) other).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.c;
    }
}
