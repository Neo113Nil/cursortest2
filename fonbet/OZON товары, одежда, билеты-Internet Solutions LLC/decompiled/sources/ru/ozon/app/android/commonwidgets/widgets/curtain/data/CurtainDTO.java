package ru.ozon.app.android.commonwidgets.widgets.curtain.data;

import Sh.b;
import T7.E;
import T7.P;
import Xc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO;", "", "showCondition", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getShowCondition", "()Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ShowCondition", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CurtainDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final ShowCondition showCondition;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition;", "", "type", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Type;", "viewport", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$ViewPort;", "pageLoaded", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$PageLoaded;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Timer;", "offset", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Offset;", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Type;Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$ViewPort;Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$PageLoaded;Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Timer;Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Offset;)V", "getType", "()Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Type;", "getViewport", "()Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$ViewPort;", "getPageLoaded", "()Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$PageLoaded;", "getTimer", "()Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Timer;", "getOffset", "()Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Offset;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Condition", "Type", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ShowCondition {
        private final Condition.Offset offset;
        private final Condition.PageLoaded pageLoaded;
        private final Condition.Timer timer;

        @NotNull
        private final Type type;
        private final Condition.ViewPort viewport;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition;", "", "<init>", "()V", "ViewPort", "PageLoaded", "Timer", "Offset", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Offset;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$PageLoaded;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Timer;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$ViewPort;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Condition {

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Offset;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition;", "offset", "", "<init>", "(I)V", "getOffset", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Offset extends Condition {
                private final int offset;

                public Offset(int i11) {
                    super(null);
                    this.offset = i11;
                }

                public static /* synthetic */ Offset copy$default(Offset offset, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i11 = offset.offset;
                    }
                    return offset.copy(i11);
                }

                /* renamed from: component1, reason: from getter */
                public final int getOffset() {
                    return this.offset;
                }

                @NotNull
                public final Offset copy(int offset) {
                    return new Offset(offset);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Offset) && this.offset == ((Offset) other).offset;
                }

                public final int getOffset() {
                    return this.offset;
                }

                public int hashCode() {
                    return Integer.hashCode(this.offset);
                }

                @NotNull
                public String toString() {
                    return E.a(this.offset, "Offset(offset=", ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$PageLoaded;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition;", "<init>", "()V", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class PageLoaded extends Condition {
                public PageLoaded() {
                    super(null);
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Timer;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition;", "time", "", "<init>", "(J)V", "getTime", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Timer extends Condition {
                private final long time;

                public Timer(long j11) {
                    super(null);
                    this.time = j11;
                }

                public static /* synthetic */ Timer copy$default(Timer timer, long j11, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        j11 = timer.time;
                    }
                    return timer.copy(j11);
                }

                /* renamed from: component1, reason: from getter */
                public final long getTime() {
                    return this.time;
                }

                @NotNull
                public final Timer copy(long time) {
                    return new Timer(time);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Timer) && this.time == ((Timer) other).time;
                }

                public final long getTime() {
                    return this.time;
                }

                public int hashCode() {
                    return Long.hashCode(this.time);
                }

                @NotNull
                public String toString() {
                    return b.b(this.time, "Timer(time=", ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$ViewPort;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition;", "<init>", "()V", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ViewPort extends Condition {
                public ViewPort() {
                    super(null);
                }
            }

            public /* synthetic */ Condition(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Condition() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Type;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "VIEW_PORT", "PAGE_LOADED", "TIMER", "OFFSET", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @NotNull
            private final String value;

            @i(name = "viewport")
            public static final Type VIEW_PORT = new Type("VIEW_PORT", 0, "viewport");

            @i(name = "pageLoaded")
            public static final Type PAGE_LOADED = new Type("PAGE_LOADED", 1, "pageLoaded");

            @i(name = DynamicElementDTO.TIMER)
            public static final Type TIMER = new Type("TIMER", 2, DynamicElementDTO.TIMER);

            @i(name = "offset")
            public static final Type OFFSET = new Type("OFFSET", 3, "offset");

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{VIEW_PORT, PAGE_LOADED, TIMER, OFFSET};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private Type(String str, int i11, String str2) {
                this.value = str2;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public ShowCondition(@NotNull Type type, Condition.ViewPort viewPort, Condition.PageLoaded pageLoaded, Condition.Timer timer, Condition.Offset offset) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.viewport = viewPort;
            this.pageLoaded = pageLoaded;
            this.timer = timer;
            this.offset = offset;
        }

        public static /* synthetic */ ShowCondition copy$default(ShowCondition showCondition, Type type, Condition.ViewPort viewPort, Condition.PageLoaded pageLoaded, Condition.Timer timer, Condition.Offset offset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                type = showCondition.type;
            }
            if ((i11 & 2) != 0) {
                viewPort = showCondition.viewport;
            }
            if ((i11 & 4) != 0) {
                pageLoaded = showCondition.pageLoaded;
            }
            if ((i11 & 8) != 0) {
                timer = showCondition.timer;
            }
            if ((i11 & 16) != 0) {
                offset = showCondition.offset;
            }
            Condition.Offset offset2 = offset;
            Condition.PageLoaded pageLoaded2 = pageLoaded;
            return showCondition.copy(type, viewPort, pageLoaded2, timer, offset2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Condition.ViewPort getViewport() {
            return this.viewport;
        }

        /* renamed from: component3, reason: from getter */
        public final Condition.PageLoaded getPageLoaded() {
            return this.pageLoaded;
        }

        /* renamed from: component4, reason: from getter */
        public final Condition.Timer getTimer() {
            return this.timer;
        }

        /* renamed from: component5, reason: from getter */
        public final Condition.Offset getOffset() {
            return this.offset;
        }

        @NotNull
        public final ShowCondition copy(@NotNull Type type, Condition.ViewPort viewport, Condition.PageLoaded pageLoaded, Condition.Timer timer, Condition.Offset offset) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new ShowCondition(type, viewport, pageLoaded, timer, offset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowCondition)) {
                return false;
            }
            ShowCondition showCondition = (ShowCondition) other;
            return this.type == showCondition.type && Intrinsics.d(this.viewport, showCondition.viewport) && Intrinsics.d(this.pageLoaded, showCondition.pageLoaded) && Intrinsics.d(this.timer, showCondition.timer) && Intrinsics.d(this.offset, showCondition.offset);
        }

        public final Condition.Offset getOffset() {
            return this.offset;
        }

        public final Condition.PageLoaded getPageLoaded() {
            return this.pageLoaded;
        }

        public final Condition.Timer getTimer() {
            return this.timer;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public final Condition.ViewPort getViewport() {
            return this.viewport;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Condition.ViewPort viewPort = this.viewport;
            int hashCode2 = (hashCode + (viewPort == null ? 0 : viewPort.hashCode())) * 31;
            Condition.PageLoaded pageLoaded = this.pageLoaded;
            int hashCode3 = (hashCode2 + (pageLoaded == null ? 0 : pageLoaded.hashCode())) * 31;
            Condition.Timer timer = this.timer;
            int hashCode4 = (hashCode3 + (timer == null ? 0 : timer.hashCode())) * 31;
            Condition.Offset offset = this.offset;
            return hashCode4 + (offset != null ? offset.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ShowCondition(type=" + this.type + ", viewport=" + this.viewport + ", pageLoaded=" + this.pageLoaded + ", timer=" + this.timer + ", offset=" + this.offset + ")";
        }
    }

    public CurtainDTO(@NotNull ShowCondition showCondition, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(showCondition, "showCondition");
        Intrinsics.checkNotNullParameter(action, "action");
        this.showCondition = showCondition;
        this.action = action;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurtainDTO copy$default(CurtainDTO curtainDTO, ShowCondition showCondition, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            showCondition = curtainDTO.showCondition;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = curtainDTO.action;
        }
        if ((i11 & 4) != 0) {
            map = curtainDTO.trackingInfo;
        }
        return curtainDTO.copy(showCondition, atomActionDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ShowCondition getShowCondition() {
        return this.showCondition;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final CurtainDTO copy(@NotNull ShowCondition showCondition, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(showCondition, "showCondition");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CurtainDTO(showCondition, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainDTO)) {
            return false;
        }
        CurtainDTO curtainDTO = (CurtainDTO) other;
        return Intrinsics.d(this.showCondition, curtainDTO.showCondition) && Intrinsics.d(this.action, curtainDTO.action) && Intrinsics.d(this.trackingInfo, curtainDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ShowCondition getShowCondition() {
        return this.showCondition;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = Ih.a.b(this.action, this.showCondition.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        ShowCondition showCondition = this.showCondition;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CurtainDTO(showCondition=");
        sb2.append(showCondition);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ CurtainDTO(ShowCondition showCondition, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(showCondition, atomActionDTO, (i11 & 4) != 0 ? null : map);
    }
}
