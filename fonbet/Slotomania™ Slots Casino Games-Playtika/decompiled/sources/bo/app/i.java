package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¨\u0006\u000e"}, d2 = {"Lbo/app/i;", "Lcom/braze/models/IPutIntoJson;", "", "toString", "e", "", "hashCode", "", "other", "", "equals", "apiKey", "<init>", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final /* data */ class i implements IPutIntoJson<String> {
    private final String b;

    public i(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.b = apiKey;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public String getJsonKey() {
        return this.b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof i) && Intrinsics.areEqual(this.b, ((i) other).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b;
    }
}
