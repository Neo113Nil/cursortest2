package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lbo/app/x5;", "", "Lcom/braze/models/IPutIntoJson;", "", "v", "<init>", "(Ljava/lang/String;I)V", "SUBSCRIBED", "UNSUBSCRIBED", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public enum x5 implements IPutIntoJson<String> {
    SUBSCRIBED,
    UNSUBSCRIBED;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x5.values().length];
            iArr[x5.SUBSCRIBED.ordinal()] = 1;
            iArr[x5.UNSUBSCRIBED.ordinal()] = 2;
            a = iArr;
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public String getJsonKey() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return "subscribed";
        }
        if (i == 2) {
            return "unsubscribed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
