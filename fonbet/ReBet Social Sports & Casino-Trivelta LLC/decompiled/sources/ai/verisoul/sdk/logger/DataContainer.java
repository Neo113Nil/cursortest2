package ai.verisoul.sdk.logger;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lai/verisoul/sdk/logger/DataContainer;", "", EventKeys.DATA, "", "Lai/verisoul/sdk/logger/ChildLogData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DataContainer {

    @c(EventKeys.DATA)
    @NotNull
    private final List<ChildLogData> data;

    /* JADX WARN: Multi-variable type inference failed */
    public DataContainer(@NotNull List<? extends ChildLogData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataContainer copy$default(DataContainer dataContainer, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = dataContainer.data;
        }
        return dataContainer.copy(list);
    }

    @NotNull
    public final List<ChildLogData> component1() {
        return this.data;
    }

    @NotNull
    public final DataContainer copy(@NotNull List<? extends ChildLogData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new DataContainer(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DataContainer) && Intrinsics.areEqual(this.data, ((DataContainer) other).data);
    }

    @NotNull
    public final List<ChildLogData> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "DataContainer(data=" + this.data + ")";
    }
}
