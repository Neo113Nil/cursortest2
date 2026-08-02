package ru.ozon.app.android.pdp.ui.configurators.ugc;

import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/ActionName;", "", "action", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "CREATE_QUESTION", "CREATE_ANSWER", "COMMENT_ANSWER", "COMMENT_REPORT", "REVIEW_COMMENT_V4", "CREATE_COMMENT_V2", "CREATE_COMMENT_V3", "CREATE_COMMENT_V4", "REMOVE_COMMENT_V2", "DELETE_COMMENT", "REVIEW_COMMENTS_V2", "VOTE_ACTION_NAME", "GET_COMMENTS_LIST_V2", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionName {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ ActionName[] $VALUES;

    @NotNull
    private final String action;
    public static final ActionName CREATE_QUESTION = new ActionName("CREATE_QUESTION", 0, "createQuestion");
    public static final ActionName CREATE_ANSWER = new ActionName("CREATE_ANSWER", 1, "createAnswer");
    public static final ActionName COMMENT_ANSWER = new ActionName("COMMENT_ANSWER", 2, "commentAnswer");
    public static final ActionName COMMENT_REPORT = new ActionName("COMMENT_REPORT", 3, "commentReport");
    public static final ActionName REVIEW_COMMENT_V4 = new ActionName("REVIEW_COMMENT_V4", 4, "reviewCommentsV4");
    public static final ActionName CREATE_COMMENT_V2 = new ActionName("CREATE_COMMENT_V2", 5, "createCommentV2");
    public static final ActionName CREATE_COMMENT_V3 = new ActionName("CREATE_COMMENT_V3", 6, "createCommentV3");
    public static final ActionName CREATE_COMMENT_V4 = new ActionName("CREATE_COMMENT_V4", 7, "createCommentV4");
    public static final ActionName REMOVE_COMMENT_V2 = new ActionName("REMOVE_COMMENT_V2", 8, "removeCommentV2");
    public static final ActionName DELETE_COMMENT = new ActionName("DELETE_COMMENT", 9, "deleteComment");
    public static final ActionName REVIEW_COMMENTS_V2 = new ActionName("REVIEW_COMMENTS_V2", 10, "reviewCommentsV2");
    public static final ActionName VOTE_ACTION_NAME = new ActionName("VOTE_ACTION_NAME", 11, "rpSetOpinionUsefulnessV2");
    public static final ActionName GET_COMMENTS_LIST_V2 = new ActionName("GET_COMMENTS_LIST_V2", 12, "getCommentsListV2");

    private static final /* synthetic */ ActionName[] $values() {
        return new ActionName[]{CREATE_QUESTION, CREATE_ANSWER, COMMENT_ANSWER, COMMENT_REPORT, REVIEW_COMMENT_V4, CREATE_COMMENT_V2, CREATE_COMMENT_V3, CREATE_COMMENT_V4, REMOVE_COMMENT_V2, DELETE_COMMENT, REVIEW_COMMENTS_V2, VOTE_ACTION_NAME, GET_COMMENTS_LIST_V2};
    }

    static {
        ActionName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ActionName(String str, int i11, String str2) {
        this.action = str2;
    }

    public static ActionName valueOf(String str) {
        return (ActionName) Enum.valueOf(ActionName.class, str);
    }

    public static ActionName[] values() {
        return (ActionName[]) $VALUES.clone();
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }
}
