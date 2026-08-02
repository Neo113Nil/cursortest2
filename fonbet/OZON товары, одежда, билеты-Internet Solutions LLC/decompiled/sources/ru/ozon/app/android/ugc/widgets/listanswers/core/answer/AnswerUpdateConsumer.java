package ru.ozon.app.android.ugc.widgets.listanswers.core.answer;

import A00.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.VoteUpdateKey;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerHighlightedStateUpdateKey;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerVO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerUpdateConsumer;", "Lkotlin/Function2;", "LA00/a$J$a;", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/UpdateConsumer;", "<init>", "()V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/question/VoteUpdateKey;", "update", "oldVO", "processVoteUpdateKey", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/question/VoteUpdateKey;Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;)Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerHighlightedStateUpdateKey;", "processAnswerHighlightedStateUpdateKey", "(Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerHighlightedStateUpdateKey;Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;)Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;)Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnswerUpdateConsumer implements Function2<a.J.InterfaceC0007a, AnswerVO, AnswerVO> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionType.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final AnswerVO processAnswerHighlightedStateUpdateKey(AnswerHighlightedStateUpdateKey update, AnswerVO oldVO) {
        AnswerVO copy;
        if (update.getAnswerId() != oldVO.getId()) {
            return null;
        }
        copy = oldVO.copy((r37 & 1) != 0 ? oldVO.id : 0L, (r37 & 2) != 0 ? oldVO.name : null, (r37 & 4) != 0 ? oldVO.avatarUrl : null, (r37 & 8) != 0 ? oldVO.date : null, (r37 & 16) != 0 ? oldVO.partner : null, (r37 & 32) != 0 ? oldVO.badge : null, (r37 & 64) != 0 ? oldVO.answerText : null, (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVO.buttonsTitle : null, (r37 & 256) != 0 ? oldVO.like : null, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVO.dislike : null, (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVO.makeBestButton : null, (r37 & 2048) != 0 ? oldVO.menu : null, (r37 & 4096) != 0 ? oldVO.moreAnswers : null, (r37 & 8192) != 0 ? oldVO.isHighlighted : false, (r37 & 16384) != 0 ? oldVO.backgroundColor : UniColors.LAYER_FLOOR_1.getToken(), (r37 & 32768) != 0 ? oldVO.tokenizedEvent : null);
        return copy;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AnswerVO processVoteUpdateKey(VoteUpdateKey update, AnswerVO oldVO) {
        String str;
        AnswerVO copy;
        String count;
        String str2;
        AnswerVO copy2;
        String str3 = null;
        if (update.getId() != oldVO.getId()) {
            return null;
        }
        TagV3Atom.TagAtom like = oldVO.getLike();
        TagV3Atom.TagAtom dislike = oldVO.getDislike();
        String count2 = like.getCount();
        Integer valueOf = count2 != null ? Integer.valueOf(Integer.parseInt(count2)) : null;
        String count3 = dislike.getCount();
        Integer valueOf2 = count3 != null ? Integer.valueOf(Integer.parseInt(count3)) : null;
        int i11 = WhenMappings.$EnumSwitchMapping$0[update.getActionType().ordinal()];
        if (i11 == 1) {
            boolean z11 = !like.isSelected();
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                str = Integer.valueOf(like.isSelected() ? intValue - 1 : intValue + 1).toString();
            } else {
                str = null;
            }
            TagV3Atom.TagAtom copy$default = TagV3Atom.TagAtom.copy$default(like, null, null, null, str, z11, null, null, null, null, null, 999, null);
            if (!dislike.isSelected()) {
                str3 = dislike.getCount();
            } else if (valueOf2 != null) {
                str3 = Integer.valueOf(valueOf2.intValue() - 1).toString();
            }
            copy = oldVO.copy((r37 & 1) != 0 ? oldVO.id : 0L, (r37 & 2) != 0 ? oldVO.name : null, (r37 & 4) != 0 ? oldVO.avatarUrl : null, (r37 & 8) != 0 ? oldVO.date : null, (r37 & 16) != 0 ? oldVO.partner : null, (r37 & 32) != 0 ? oldVO.badge : null, (r37 & 64) != 0 ? oldVO.answerText : null, (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVO.buttonsTitle : null, (r37 & 256) != 0 ? oldVO.like : copy$default, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVO.dislike : TagV3Atom.TagAtom.copy$default(dislike, null, null, null, str3, false, null, null, null, null, null, 999, null), (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVO.makeBestButton : null, (r37 & 2048) != 0 ? oldVO.menu : null, (r37 & 4096) != 0 ? oldVO.moreAnswers : null, (r37 & 8192) != 0 ? oldVO.isHighlighted : false, (r37 & 16384) != 0 ? oldVO.backgroundColor : null, (r37 & 32768) != 0 ? oldVO.tokenizedEvent : null);
            return copy;
        }
        if (i11 != 2) {
            return null;
        }
        if (!like.isSelected()) {
            count = like.getCount();
        } else {
            if (valueOf == null) {
                str2 = null;
                TagV3Atom.TagAtom copy$default2 = TagV3Atom.TagAtom.copy$default(like, null, null, null, str2, false, null, null, null, null, null, 999, null);
                boolean z12 = !dislike.isSelected();
                if (valueOf2 != null) {
                    int intValue2 = valueOf2.intValue();
                    str3 = Integer.valueOf(dislike.isSelected() ? intValue2 - 1 : intValue2 + 1).toString();
                }
                copy2 = oldVO.copy((r37 & 1) != 0 ? oldVO.id : 0L, (r37 & 2) != 0 ? oldVO.name : null, (r37 & 4) != 0 ? oldVO.avatarUrl : null, (r37 & 8) != 0 ? oldVO.date : null, (r37 & 16) != 0 ? oldVO.partner : null, (r37 & 32) != 0 ? oldVO.badge : null, (r37 & 64) != 0 ? oldVO.answerText : null, (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVO.buttonsTitle : null, (r37 & 256) != 0 ? oldVO.like : copy$default2, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVO.dislike : TagV3Atom.TagAtom.copy$default(dislike, null, null, null, str3, z12, null, null, null, null, null, 999, null), (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVO.makeBestButton : null, (r37 & 2048) != 0 ? oldVO.menu : null, (r37 & 4096) != 0 ? oldVO.moreAnswers : null, (r37 & 8192) != 0 ? oldVO.isHighlighted : false, (r37 & 16384) != 0 ? oldVO.backgroundColor : null, (r37 & 32768) != 0 ? oldVO.tokenizedEvent : null);
                return copy2;
            }
            count = Integer.valueOf(valueOf.intValue() - 1).toString();
        }
        str2 = count;
        TagV3Atom.TagAtom copy$default22 = TagV3Atom.TagAtom.copy$default(like, null, null, null, str2, false, null, null, null, null, null, 999, null);
        boolean z122 = !dislike.isSelected();
        if (valueOf2 != null) {
        }
        copy2 = oldVO.copy((r37 & 1) != 0 ? oldVO.id : 0L, (r37 & 2) != 0 ? oldVO.name : null, (r37 & 4) != 0 ? oldVO.avatarUrl : null, (r37 & 8) != 0 ? oldVO.date : null, (r37 & 16) != 0 ? oldVO.partner : null, (r37 & 32) != 0 ? oldVO.badge : null, (r37 & 64) != 0 ? oldVO.answerText : null, (r37 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVO.buttonsTitle : null, (r37 & 256) != 0 ? oldVO.like : copy$default22, (r37 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVO.dislike : TagV3Atom.TagAtom.copy$default(dislike, null, null, null, str3, z122, null, null, null, null, null, 999, null), (r37 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVO.makeBestButton : null, (r37 & 2048) != 0 ? oldVO.menu : null, (r37 & 4096) != 0 ? oldVO.moreAnswers : null, (r37 & 8192) != 0 ? oldVO.isHighlighted : false, (r37 & 16384) != 0 ? oldVO.backgroundColor : null, (r37 & 32768) != 0 ? oldVO.tokenizedEvent : null);
        return copy2;
    }

    @Override // kotlin.jvm.functions.Function2
    public AnswerVO invoke(@NotNull a.J.InterfaceC0007a update, @NotNull AnswerVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof VoteUpdateKey) {
            return processVoteUpdateKey((VoteUpdateKey) update, oldVO);
        }
        if (update instanceof AnswerHighlightedStateUpdateKey) {
            return processAnswerHighlightedStateUpdateKey((AnswerHighlightedStateUpdateKey) update, oldVO);
        }
        return null;
    }
}
