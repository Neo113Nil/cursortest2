package com.sofascore.model.profile;

import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = UserBadgeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/profile/UserBadge;", "", "badgeName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getBadgeName", "()Ljava/lang/String;", "NO_BADGE", "EDITOR", "CROWDSOURCER", "PREDICTOR", "MODERATOR", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserBadge {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ UserBadge[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String badgeName;

    @q5h("no_badge")
    public static final UserBadge NO_BADGE = new UserBadge("NO_BADGE", 0, "no_badge");

    @q5h("editor")
    public static final UserBadge EDITOR = new UserBadge("EDITOR", 1, "editor");

    @q5h("crowdsourcer")
    public static final UserBadge CROWDSOURCER = new UserBadge("CROWDSOURCER", 2, "crowdsourcer");

    @q5h("predictor")
    public static final UserBadge PREDICTOR = new UserBadge("PREDICTOR", 3, "predictor");

    @q5h("moderator")
    public static final UserBadge MODERATOR = new UserBadge("MODERATOR", 4, "moderator");

    private static final /* synthetic */ UserBadge[] $values() {
        return new UserBadge[]{NO_BADGE, EDITOR, CROWDSOURCER, PREDICTOR, MODERATOR};
    }

    static {
        UserBadge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private UserBadge(String str, int i, String str2) {
        this.badgeName = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static UserBadge valueOf(String str) {
        return (UserBadge) Enum.valueOf(UserBadge.class, str);
    }

    public static UserBadge[] values() {
        return (UserBadge[]) $VALUES.clone();
    }

    @NotNull
    public final String getBadgeName() {
        return this.badgeName;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/profile/UserBadge$Companion;", "", "<init>", "()V", "get", "Lcom/sofascore/model/profile/UserBadge;", U3.i.X, "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final UserBadge get(@Nullable String value) {
            Object obj;
            Iterator<E> it = UserBadge.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                UserBadge userBadge = (UserBadge) obj;
                if (Intrinsics.c(userBadge.name(), value) || Intrinsics.c(userBadge.getBadgeName(), value)) {
                    break;
                }
            }
            return (UserBadge) obj;
        }

        @NotNull
        public final KSerializer serializer() {
            return UserBadgeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
