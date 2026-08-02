package expo.modules.contacts.next.records;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;

/* compiled from: ContactQueryOptions.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/records/ContactQueryOptions;", "Lexpo/modules/kotlin/records/Record;", "<init>", "()V", "limit", "", "getLimit$annotations", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset$annotations", "getOffset", "name", "", "getName$annotations", "getName", "()Ljava/lang/String;", SDKConstants.PARAM_SORT_ORDER, "Lexpo/modules/contacts/next/records/SortOrder;", "getSortOrder$annotations", "getSortOrder", "()Lexpo/modules/contacts/next/records/SortOrder;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactQueryOptions implements Record {
    private final Integer limit;
    private final String name;
    private final Integer offset;
    private final SortOrder sortOrder;

    @Field
    public static /* synthetic */ void getLimit$annotations() {
    }

    @Field
    public static /* synthetic */ void getName$annotations() {
    }

    @Field
    public static /* synthetic */ void getOffset$annotations() {
    }

    @Field
    public static /* synthetic */ void getSortOrder$annotations() {
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getName() {
        return this.name;
    }

    public final SortOrder getSortOrder() {
        return this.sortOrder;
    }
}
