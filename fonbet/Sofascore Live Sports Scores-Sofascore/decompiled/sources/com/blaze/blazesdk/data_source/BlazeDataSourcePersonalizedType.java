package com.blaze.blazesdk.data_source;

import androidx.annotation.Keep;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.km5;
import defpackage.ls1;
import defpackage.tub;
import defpackage.zzl;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0003\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;", "", "<init>", "()V", "", "getStringRepresentation$blazesdk_release", "()Ljava/lang/String;", "stringRepresentation", "Companion", "Ids", "Labels", "a", "Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType$Ids;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType$Labels;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeDataSourcePersonalizedType {
    public static final int $stable = 0;

    @NotNull
    public static final String STRING_SEPARATOR = ",";

    public /* synthetic */ BlazeDataSourcePersonalizedType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_stringRepresentation_$lambda$0(Map.Entry entry) {
        entry.getClass();
        return ((Ids.ContentType) entry.getKey()).getRawVal() + C4427z5.U + CollectionsKt.f0((List) entry.getValue(), STRING_SEPARATOR, null, null, null, 62);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_stringRepresentation_$lambda$1(BlazeWidgetLabel blazeWidgetLabel) {
        blazeWidgetLabel.getClass();
        return blazeWidgetLabel.getStringLabelExpression();
    }

    @NotNull
    public final String getStringRepresentation$blazesdk_release() {
        if (this instanceof Ids) {
            return "personalized type: ids= ".concat(CollectionsKt.f0(((Ids) this).getIdsMap().entrySet(), U3.j.c, null, null, new ls1(28), 30));
        }
        if (!(this instanceof Labels)) {
            zzl.b();
            return null;
        }
        Labels labels = (Labels) this;
        return "personalized type: label=" + labels.getLabelsFilter().getStringLabelExpression() + ", priority=" + CollectionsKt.f0(labels.getLabelsPriority(), STRING_SEPARATOR, null, null, new ls1(29), 30);
    }

    private BlazeDataSourcePersonalizedType() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType$Labels;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;", "labelsFilter", "Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "labelsPriority", "", "<init>", "(Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;Ljava/util/List;)V", "getLabelsFilter", "()Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "setLabelsFilter", "(Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;)V", "getLabelsPriority", "()Ljava/util/List;", "setLabelsPriority", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Labels extends BlazeDataSourcePersonalizedType {
        public static final int $stable = 8;

        @NotNull
        private BlazeWidgetLabel labelsFilter;

        @NotNull
        private List<BlazeWidgetLabel> labelsPriority;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Labels(@NotNull BlazeWidgetLabel blazeWidgetLabel, @NotNull List<BlazeWidgetLabel> list) {
            super(null);
            blazeWidgetLabel.getClass();
            list.getClass();
            this.labelsFilter = blazeWidgetLabel;
            this.labelsPriority = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Labels copy$default(Labels labels, BlazeWidgetLabel blazeWidgetLabel, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeWidgetLabel = labels.labelsFilter;
            }
            if ((i & 2) != 0) {
                list = labels.labelsPriority;
            }
            return labels.copy(blazeWidgetLabel, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BlazeWidgetLabel getLabelsFilter() {
            return this.labelsFilter;
        }

        @NotNull
        public final List<BlazeWidgetLabel> component2() {
            return this.labelsPriority;
        }

        @NotNull
        public final Labels copy(@NotNull BlazeWidgetLabel labelsFilter, @NotNull List<BlazeWidgetLabel> labelsPriority) {
            labelsFilter.getClass();
            labelsPriority.getClass();
            return new Labels(labelsFilter, labelsPriority);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Labels)) {
                return false;
            }
            Labels labels = (Labels) other;
            return Intrinsics.c(this.labelsFilter, labels.labelsFilter) && Intrinsics.c(this.labelsPriority, labels.labelsPriority);
        }

        @NotNull
        public final BlazeWidgetLabel getLabelsFilter() {
            return this.labelsFilter;
        }

        @NotNull
        public final List<BlazeWidgetLabel> getLabelsPriority() {
            return this.labelsPriority;
        }

        public int hashCode() {
            return this.labelsPriority.hashCode() + (this.labelsFilter.hashCode() * 31);
        }

        public final void setLabelsFilter(@NotNull BlazeWidgetLabel blazeWidgetLabel) {
            blazeWidgetLabel.getClass();
            this.labelsFilter = blazeWidgetLabel;
        }

        public final void setLabelsPriority(@NotNull List<BlazeWidgetLabel> list) {
            list.getClass();
            this.labelsPriority = list;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Labels(labelsFilter=");
            sb.append(this.labelsFilter);
            sb.append(", labelsPriority=");
            return fc6.p(sb, this.labelsPriority, ')');
        }

        public Labels(BlazeWidgetLabel blazeWidgetLabel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(blazeWidgetLabel, (i & 2) != 0 ? km5.a : list);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R,\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType$Ids;", "Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType;", "idsMap", "", "Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType$Ids$ContentType;", "", "", "<init>", "(Ljava/util/Map;)V", "playerIds", "teamIds", "(Ljava/util/List;Ljava/util/List;)V", "getIdsMap", "()Ljava/util/Map;", "setIdsMap", "getPlayerIds$blazesdk_release", "()Ljava/util/List;", "getTeamIds$blazesdk_release", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ContentType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ids extends BlazeDataSourcePersonalizedType {
        public static final int $stable = 8;

        @NotNull
        private Map<ContentType, ? extends List<String>> idsMap;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDataSourcePersonalizedType$Ids$ContentType;", "", "rawVal", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawVal", "()Ljava/lang/String;", "PLAYERS", "TEAMS", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ContentType {
            private static final /* synthetic */ jp5 $ENTRIES;
            private static final /* synthetic */ ContentType[] $VALUES;
            public static final ContentType PLAYERS = new ContentType("PLAYERS", 0, "players");
            public static final ContentType TEAMS = new ContentType("TEAMS", 1, "teams");

            @NotNull
            private final String rawVal;

            private static final /* synthetic */ ContentType[] $values() {
                return new ContentType[]{PLAYERS, TEAMS};
            }

            static {
                ContentType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = gz8.G($values);
            }

            private ContentType(String str, int i, String str2) {
                this.rawVal = str2;
            }

            @NotNull
            public static jp5 getEntries() {
                return $ENTRIES;
            }

            public static ContentType valueOf(String str) {
                return (ContentType) Enum.valueOf(ContentType.class, str);
            }

            public static ContentType[] values() {
                return (ContentType[]) $VALUES.clone();
            }

            @NotNull
            public final String getRawVal() {
                return this.rawVal;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ids(@NotNull List<String> list, @NotNull List<String> list2) {
            this(tub.h(new Pair(ContentType.PLAYERS, list), new Pair(ContentType.TEAMS, list2)));
            list.getClass();
            list2.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ids copy$default(Ids ids, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = ids.idsMap;
            }
            return ids.copy(map);
        }

        @NotNull
        public final Map<ContentType, List<String>> component1() {
            return this.idsMap;
        }

        @NotNull
        public final Ids copy(@NotNull Map<ContentType, ? extends List<String>> idsMap) {
            idsMap.getClass();
            return new Ids(idsMap);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ids) && Intrinsics.c(this.idsMap, ((Ids) other).idsMap);
        }

        @NotNull
        public final Map<ContentType, List<String>> getIdsMap() {
            return this.idsMap;
        }

        @Nullable
        public final List<String> getPlayerIds$blazesdk_release() {
            return this.idsMap.get(ContentType.PLAYERS);
        }

        @Nullable
        public final List<String> getTeamIds$blazesdk_release() {
            return this.idsMap.get(ContentType.TEAMS);
        }

        public int hashCode() {
            return this.idsMap.hashCode();
        }

        public final void setIdsMap(@NotNull Map<ContentType, ? extends List<String>> map) {
            map.getClass();
            this.idsMap = map;
        }

        @NotNull
        public String toString() {
            return dmi.s(new StringBuilder("Ids(idsMap="), this.idsMap, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ids(@NotNull Map<ContentType, ? extends List<String>> map) {
            super(null);
            map.getClass();
            this.idsMap = map;
        }

        public Ids(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? km5.a : list, (i & 2) != 0 ? km5.a : list2);
        }
    }
}
