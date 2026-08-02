package ru.ozon.app.android.ugc.view.sheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toActionType", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler$SheetAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExtionSheetExtensionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionSheetHandler.SheetAction.values().length];
            try {
                iArr[AtomActionSheetHandler.SheetAction.VOTE_QUESTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.VOTE_ANSWER_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.VOTE_ANSWER_DISLIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.REPORT_QUESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.REPORT_ANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.MAKE_ANSWER_BEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.MAKE_QUESTION_ANONYMOUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.MAKE_ANSWER_ANONYMOUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.DELETE_QUESTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.DELETE_ANSWER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.DELETE_COMMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.DELETE_REVIEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AtomActionSheetHandler.SheetAction.MAKE_REVIEW_ANONYMOUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ActionType toActionType(@NotNull AtomActionSheetHandler.SheetAction sheetAction) {
        Intrinsics.checkNotNullParameter(sheetAction, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[sheetAction.ordinal()]) {
            case 1:
                return ActionType.VOTE_QUESTION;
            case 2:
                return ActionType.LIKE;
            case 3:
                return ActionType.DISLIKE;
            case 4:
            case 5:
                return ActionType.REPORT;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return ActionType.REFRESH;
            default:
                return ActionType.UNKNOWN;
        }
    }
}
