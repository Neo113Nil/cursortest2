package ru.ozon.app.android.ugc.widgets.singlequestion.presentation;

import C.o0;
import G.g;
import Ns.b;
import TY.a;
import Tz.C4055a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.ActionSheetVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitDialog;
import ru.ozon.app.android.ugc.view.sheet.dialog.DialogActionSheetInfo;
import ru.ozon.app.android.ugc.view.sheet.open.ActionSheetVOInfo;
import ru.ozon.app.android.ugc.widgets.common.MenuVO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001TBk\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u008a\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\"R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b3\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u0010\"R\u0016\u0010N\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\"\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020P\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "Lru/ozon/app/android/ugc/view/sheet/dialog/DialogActionSheetInfo;", "Lru/ozon/app/android/ugc/view/sheet/open/ActionSheetVOInfo;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "avatarUrl", "date", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "partner", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO$QuestionVO;", "question", "Lru/ozon/uni/atoms/data/AtomDTO;", "answerButton", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "likeButton", "Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "menu", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO$QuestionVO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;Lru/ozon/app/android/ugc/widgets/common/MenuVO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO$QuestionVO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;Lru/ozon/app/android/ugc/widgets/common/MenuVO;LWZ/t;)Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getAvatarUrl", "getDate", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "getPartner", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO$QuestionVO;", "getQuestion", "()Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO$QuestionVO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAnswerButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "getLikeButton", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "getMenu", "()Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgetName", "getWidgetName", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "getActionSheetVO", "()Lru/ozon/app/android/action/sheet/ActionSheetVO;", "actionSheetVO", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;", "getDialog", "()Ljava/util/Map;", "dialog", "QuestionVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleQuestionVO implements c, InterfaceC8039a, m, o, DialogActionSheetInfo, ActionSheetVOInfo {
    private final AtomDTO answerButton;
    private final String avatarUrl;
    private final Badge badge;

    @NotNull
    private final String date;
    private final long id;
    private final SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton;

    @NotNull
    private final MenuVO menu;

    @NotNull
    private final TextDTO name;
    private final SingleQuestionDTO.AuthorQuestion.Author.Partner partner;

    @NotNull
    private final QuestionVO question;
    private final t tokenizedEvent;

    @NotNull
    private final String widgetName;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO$QuestionVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "authorName", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getAuthorName", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuestionVO {
        private final String authorName;
        private final int id;

        @NotNull
        private final TextDTO text;

        public QuestionVO(int i11, @NotNull TextDTO text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.text = text;
            this.authorName = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionVO)) {
                return false;
            }
            QuestionVO questionVO = (QuestionVO) other;
            return this.id == questionVO.id && Intrinsics.d(this.text, questionVO.text) && Intrinsics.d(this.authorName, questionVO.authorName);
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = b.a(this.text, Integer.hashCode(this.id) * 31, 31);
            String str = this.authorName;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.text;
            return o0.c(C4055a.b(textDTO, "QuestionVO(id=", ", text=", ", authorName=", i11), this.authorName, ")");
        }
    }

    public SingleQuestionVO(long j11, @NotNull TextDTO name, String str, @NotNull String date, SingleQuestionDTO.AuthorQuestion.Author.Partner partner, Badge badge, @NotNull QuestionVO question, AtomDTO atomDTO, SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton, @NotNull MenuVO menu, t tVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.id = j11;
        this.name = name;
        this.avatarUrl = str;
        this.date = date;
        this.partner = partner;
        this.badge = badge;
        this.question = question;
        this.answerButton = atomDTO;
        this.likeButton = likeButton;
        this.menu = menu;
        this.tokenizedEvent = tVar;
        this.widgetName = "questions";
    }

    public static /* synthetic */ SingleQuestionVO copy$default(SingleQuestionVO singleQuestionVO, long j11, TextDTO textDTO, String str, String str2, SingleQuestionDTO.AuthorQuestion.Author.Partner partner, Badge badge, QuestionVO questionVO, AtomDTO atomDTO, SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton, MenuVO menuVO, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = singleQuestionVO.id;
        }
        return singleQuestionVO.copy(j11, (i11 & 2) != 0 ? singleQuestionVO.name : textDTO, (i11 & 4) != 0 ? singleQuestionVO.avatarUrl : str, (i11 & 8) != 0 ? singleQuestionVO.date : str2, (i11 & 16) != 0 ? singleQuestionVO.partner : partner, (i11 & 32) != 0 ? singleQuestionVO.badge : badge, (i11 & 64) != 0 ? singleQuestionVO.question : questionVO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? singleQuestionVO.answerButton : atomDTO, (i11 & 256) != 0 ? singleQuestionVO.likeButton : likeButton, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? singleQuestionVO.menu : menuVO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? singleQuestionVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final SingleQuestionVO copy(long id2, @NotNull TextDTO name, String avatarUrl, @NotNull String date, SingleQuestionDTO.AuthorQuestion.Author.Partner partner, Badge badge, @NotNull QuestionVO question, AtomDTO answerButton, SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton, @NotNull MenuVO menu, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(menu, "menu");
        return new SingleQuestionVO(id2, name, avatarUrl, date, partner, badge, question, answerButton, likeButton, menu, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleQuestionVO)) {
            return false;
        }
        SingleQuestionVO singleQuestionVO = (SingleQuestionVO) other;
        return this.id == singleQuestionVO.id && Intrinsics.d(this.name, singleQuestionVO.name) && Intrinsics.d(this.avatarUrl, singleQuestionVO.avatarUrl) && Intrinsics.d(this.date, singleQuestionVO.date) && Intrinsics.d(this.partner, singleQuestionVO.partner) && Intrinsics.d(this.badge, singleQuestionVO.badge) && Intrinsics.d(this.question, singleQuestionVO.question) && Intrinsics.d(this.answerButton, singleQuestionVO.answerButton) && Intrinsics.d(this.likeButton, singleQuestionVO.likeButton) && Intrinsics.d(this.menu, singleQuestionVO.menu) && Intrinsics.d(this.tokenizedEvent, singleQuestionVO.tokenizedEvent);
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.open.ActionSheetVOInfo
    public ActionSheetVO getActionSheetVO() {
        return this.menu.getActions();
    }

    public final AtomDTO getAnswerButton() {
        return this.answerButton;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.dialog.DialogActionSheetInfo
    public Map<String, SubmitDialog> getDialog() {
        return this.menu.getSubmitDialogs();
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton getLikeButton() {
        return this.likeButton;
    }

    @NotNull
    public final MenuVO getMenu() {
        return this.menu;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    public final SingleQuestionDTO.AuthorQuestion.Author.Partner getPartner() {
        return this.partner;
    }

    @NotNull
    public final QuestionVO getQuestion() {
        return this.question;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = b.a(this.name, Long.hashCode(this.id) * 31, 31);
        String str = this.avatarUrl;
        int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.date);
        SingleQuestionDTO.AuthorQuestion.Author.Partner partner = this.partner;
        int hashCode = (a12 + (partner == null ? 0 : partner.hashCode())) * 31;
        Badge badge = this.badge;
        int hashCode2 = (this.question.hashCode() + ((hashCode + (badge == null ? 0 : badge.hashCode())) * 31)) * 31;
        AtomDTO atomDTO = this.answerButton;
        int hashCode3 = (hashCode2 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton = this.likeButton;
        int hashCode4 = (this.menu.hashCode() + ((hashCode3 + (likeButton == null ? 0 : likeButton.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.name;
        String str = this.avatarUrl;
        String str2 = this.date;
        SingleQuestionDTO.AuthorQuestion.Author.Partner partner = this.partner;
        Badge badge = this.badge;
        QuestionVO questionVO = this.question;
        AtomDTO atomDTO = this.answerButton;
        SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton = this.likeButton;
        MenuVO menuVO = this.menu;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("SingleQuestionVO(id=", j11, ", name=", textDTO);
        Nh.a.h(b11, ", avatarUrl=", str, ", date=", str2);
        b11.append(", partner=");
        b11.append(partner);
        b11.append(", badge=");
        b11.append(badge);
        b11.append(", question=");
        b11.append(questionVO);
        b11.append(", answerButton=");
        b11.append(atomDTO);
        b11.append(", likeButton=");
        b11.append(likeButton);
        b11.append(", menu=");
        b11.append(menuVO);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
