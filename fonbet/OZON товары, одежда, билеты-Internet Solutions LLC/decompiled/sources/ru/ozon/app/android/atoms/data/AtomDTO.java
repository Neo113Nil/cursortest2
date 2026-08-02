package ru.ozon.app.android.atoms.data;

import android.os.Parcelable;
import com.squareup.moshi.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aBA\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/atoms/data/AtomDTO;", "Landroid/os/Parcelable;", "Llk0/a;", "Lru/ozon/app/android/atoms/data/AtomType;", "type", "", "context", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/app/android/atoms/data/AtomType;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "Lru/ozon/app/android/atoms/data/AtomType;", "getType", "()Lru/ozon/app/android/atoms/data/AtomType;", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AtomDTO implements Parcelable, InterfaceC7968a {

    @NotNull
    public static final String CONTEXT_KEY = "context";

    @NotNull
    public static final String TEST_INFO_KEY = "testInfo";

    @NotNull
    public static final String TRACKING_INFO = "trackingInfo";

    @NotNull
    public static final String TYPE_KEY = "type";
    private final String context;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final AtomType type;
    public static final int $stable = 8;

    public AtomDTO(@i(name = "type") @NotNull AtomType type, @i(name = "context") String str, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> map, @i(name = "testInfo") TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public String getContext() {
        return this.context;
    }

    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public AtomType getType() {
        return this.type;
    }

    public /* synthetic */ AtomDTO(AtomType atomType, String str, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomType, str, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : testInfo);
    }
}
