package com.sofascore.model.network.response;

import com.ironsource.U3;
import com.sofascore.model.network.response.serializers.TeamAverageRatingVersionSerializer;
import defpackage.egi;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = TeamAverageRatingVersionSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "", "apiValue", "", "<init>", "(Ljava/lang/String;II)V", "getApiValue", "()I", "ORIGINAL", "WEIGHTED", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamAverageRatingVersion {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ TeamAverageRatingVersion[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final TeamAverageRatingVersion ORIGINAL = new TeamAverageRatingVersion("ORIGINAL", 0, 1);
    public static final TeamAverageRatingVersion WEIGHTED = new TeamAverageRatingVersion("WEIGHTED", 1, 2);
    private final int apiValue;

    private static final /* synthetic */ TeamAverageRatingVersion[] $values() {
        return new TeamAverageRatingVersion[]{ORIGINAL, WEIGHTED};
    }

    static {
        TeamAverageRatingVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new egi(21));
    }

    private TeamAverageRatingVersion(String str, int i, int i2) {
        this.apiValue = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new TeamAverageRatingVersionSerializer();
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static TeamAverageRatingVersion valueOf(String str) {
        return (TeamAverageRatingVersion) Enum.valueOf(TeamAverageRatingVersion.class, str);
    }

    public static TeamAverageRatingVersion[] values() {
        return (TeamAverageRatingVersion[]) $VALUES.clone();
    }

    public final int getApiValue() {
        return this.apiValue;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/network/response/TeamAverageRatingVersion$Companion;", "", "<init>", "()V", "fromApiValue", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", U3.i.X, "", "(Ljava/lang/Integer;)Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TeamAverageRatingVersion.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final TeamAverageRatingVersion fromApiValue(@Nullable Integer value) {
            Object obj;
            Iterator<E> it = TeamAverageRatingVersion.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int apiValue = ((TeamAverageRatingVersion) obj).getApiValue();
                if (value != null && apiValue == value.intValue()) {
                    break;
                }
            }
            TeamAverageRatingVersion teamAverageRatingVersion = (TeamAverageRatingVersion) obj;
            return teamAverageRatingVersion == null ? TeamAverageRatingVersion.ORIGINAL : teamAverageRatingVersion;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
