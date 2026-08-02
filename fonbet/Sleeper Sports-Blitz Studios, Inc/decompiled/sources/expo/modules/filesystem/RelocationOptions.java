package expo.modules.filesystem;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FileSystemNextRecords.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lexpo/modules/filesystem/RelocationOptions;", "Lexpo/modules/kotlin/records/Record;", "overwrite", "", "<init>", "(Z)V", "getOverwrite$annotations", "()V", "getOverwrite", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RelocationOptions implements Record {
    private final boolean overwrite;

    public RelocationOptions() {
        this(false, 1, null);
    }

    public static /* synthetic */ RelocationOptions copy$default(RelocationOptions relocationOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = relocationOptions.overwrite;
        }
        return relocationOptions.copy(z);
    }

    @Field
    public static /* synthetic */ void getOverwrite$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public final RelocationOptions copy(boolean overwrite) {
        return new RelocationOptions(overwrite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RelocationOptions) && this.overwrite == ((RelocationOptions) other).overwrite;
    }

    public int hashCode() {
        return Boolean.hashCode(this.overwrite);
    }

    public String toString() {
        return "RelocationOptions(overwrite=" + this.overwrite + ")";
    }

    public RelocationOptions(boolean z) {
        this.overwrite = z;
    }

    public /* synthetic */ RelocationOptions(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }
}
