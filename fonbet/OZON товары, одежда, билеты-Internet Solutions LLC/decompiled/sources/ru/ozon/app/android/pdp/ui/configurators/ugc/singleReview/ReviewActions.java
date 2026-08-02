package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewActions;", "", "action", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "LIKE", "DISLIKE", "COMMENT", "COMMENT_MODAL", "EDIT", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewActions {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReviewActions[] $VALUES;

    @NotNull
    private final String action;
    public static final ReviewActions LIKE = new ReviewActions("LIKE", 0, "like");
    public static final ReviewActions DISLIKE = new ReviewActions("DISLIKE", 1, "dislike");
    public static final ReviewActions COMMENT = new ReviewActions("COMMENT", 2, "comment");
    public static final ReviewActions COMMENT_MODAL = new ReviewActions("COMMENT_MODAL", 3, "commentModal");
    public static final ReviewActions EDIT = new ReviewActions("EDIT", 4, "update");

    private static final /* synthetic */ ReviewActions[] $values() {
        return new ReviewActions[]{LIKE, DISLIKE, COMMENT, COMMENT_MODAL, EDIT};
    }

    static {
        ReviewActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ReviewActions(String str, int i11, String str2) {
        this.action = str2;
    }

    public static ReviewActions valueOf(String str) {
        return (ReviewActions) Enum.valueOf(ReviewActions.class, str);
    }

    public static ReviewActions[] values() {
        return (ReviewActions[]) $VALUES.clone();
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }
}
