package com.sofascore.model.newNetwork;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = FilterCategorySerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/model/newNetwork/FilterCategory;", "", "filterCategoryId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFilterCategoryId", "()Ljava/lang/String;", "CATEGORY", "GENDER", "LEVEL", "REGION", "STATUS", "TOURNAMENT", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FilterCategory {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FilterCategory[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String filterCategoryId;

    @q5h("category")
    public static final FilterCategory CATEGORY = new FilterCategory("CATEGORY", 0, "category");

    @q5h(InneractiveMediationDefs.KEY_GENDER)
    public static final FilterCategory GENDER = new FilterCategory("GENDER", 1, InneractiveMediationDefs.KEY_GENDER);

    @q5h("level")
    public static final FilterCategory LEVEL = new FilterCategory("LEVEL", 2, "level");

    @q5h(TtmlNode.TAG_REGION)
    public static final FilterCategory REGION = new FilterCategory("REGION", 3, TtmlNode.TAG_REGION);

    @q5h("status")
    public static final FilterCategory STATUS = new FilterCategory("STATUS", 4, "status");

    @q5h("tournament")
    public static final FilterCategory TOURNAMENT = new FilterCategory("TOURNAMENT", 5, "tournament");

    private static final /* synthetic */ FilterCategory[] $values() {
        return new FilterCategory[]{CATEGORY, GENDER, LEVEL, REGION, STATUS, TOURNAMENT};
    }

    static {
        FilterCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private FilterCategory(String str, int i, String str2) {
        this.filterCategoryId = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FilterCategory valueOf(String str) {
        return (FilterCategory) Enum.valueOf(FilterCategory.class, str);
    }

    public static FilterCategory[] values() {
        return (FilterCategory[]) $VALUES.clone();
    }

    @NotNull
    public final String getFilterCategoryId() {
        return this.filterCategoryId;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FilterCategory$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FilterCategory;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FilterCategorySerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
