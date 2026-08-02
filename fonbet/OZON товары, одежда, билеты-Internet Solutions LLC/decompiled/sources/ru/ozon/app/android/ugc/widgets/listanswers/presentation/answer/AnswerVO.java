package ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer;

import G.g;
import Kk.C3532b;
import Ns.b;
import TY.a;
import WZ.t;
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
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0095\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J¾\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010(R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b8\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b?\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b@\u00105R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010N\u001a\u0004\b\u001f\u0010OR\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u00106\u001a\u0004\bP\u0010(R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\bU\u0010(R\u0016\u0010Y\u001a\u0004\u0018\u00010V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\"\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020[\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "Lru/ozon/app/android/ugc/view/sheet/dialog/DialogActionSheetInfo;", "Lru/ozon/app/android/ugc/view/sheet/open/ActionSheetVOInfo;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "avatarUrl", "date", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "partner", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "answerText", "buttonsTitle", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "like", "dislike", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;", "makeBestButton", "Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "menu", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "moreAnswers", "", "isHighlighted", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;Lru/ozon/app/android/ugc/widgets/common/MenuVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;ZLjava/lang/String;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;Lru/ozon/app/android/ugc/widgets/common/MenuVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;ZLjava/lang/String;LWZ/t;)Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getAvatarUrl", "getDate", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "getPartner", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getAnswerText", "getButtonsTitle", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "getLike", "()Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "getDislike", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;", "getMakeBestButton", "()Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;", "Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "getMenu", "()Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getMoreAnswers", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Z", "()Z", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgetName", "getWidgetName", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "getActionSheetVO", "()Lru/ozon/app/android/action/sheet/ActionSheetVO;", "actionSheetVO", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;", "getDialog", "()Ljava/util/Map;", "dialog", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AnswerVO implements c, InterfaceC8039a, m, o, DialogActionSheetInfo, ActionSheetVOInfo {

    @NotNull
    private final TextDTO answerText;
    private final String avatarUrl;

    @NotNull
    private final String backgroundColor;
    private final Badge badge;
    private final TextDTO buttonsTitle;

    @NotNull
    private final String date;

    @NotNull
    private final TagV3Atom.TagAtom dislike;
    private final long id;
    private final boolean isHighlighted;

    @NotNull
    private final TagV3Atom.TagAtom like;
    private final ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton;

    @NotNull
    private final MenuVO menu;
    private final ButtonV3Atom.SmallBorderlessButton moreAnswers;

    @NotNull
    private final TextDTO name;
    private final SingleQuestionDTO.AuthorQuestion.Author.Partner partner;
    private final t tokenizedEvent;

    @NotNull
    private final String widgetName;

    public AnswerVO(long j11, @NotNull TextDTO name, String str, @NotNull String date, SingleQuestionDTO.AuthorQuestion.Author.Partner partner, Badge badge, @NotNull TextDTO answerText, TextDTO textDTO, @NotNull TagV3Atom.TagAtom like, @NotNull TagV3Atom.TagAtom dislike, ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton, @NotNull MenuVO menu, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, boolean z11, @NotNull String backgroundColor, t tVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(answerText, "answerText");
        Intrinsics.checkNotNullParameter(like, "like");
        Intrinsics.checkNotNullParameter(dislike, "dislike");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.name = name;
        this.avatarUrl = str;
        this.date = date;
        this.partner = partner;
        this.badge = badge;
        this.answerText = answerText;
        this.buttonsTitle = textDTO;
        this.like = like;
        this.dislike = dislike;
        this.makeBestButton = makeBestButton;
        this.menu = menu;
        this.moreAnswers = smallBorderlessButton;
        this.isHighlighted = z11;
        this.backgroundColor = backgroundColor;
        this.tokenizedEvent = tVar;
        this.widgetName = "questions";
    }

    @NotNull
    public final AnswerVO copy(long id2, @NotNull TextDTO name, String avatarUrl, @NotNull String date, SingleQuestionDTO.AuthorQuestion.Author.Partner partner, Badge badge, @NotNull TextDTO answerText, TextDTO buttonsTitle, @NotNull TagV3Atom.TagAtom like, @NotNull TagV3Atom.TagAtom dislike, ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton, @NotNull MenuVO menu, ButtonV3Atom.SmallBorderlessButton moreAnswers, boolean isHighlighted, @NotNull String backgroundColor, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(answerText, "answerText");
        Intrinsics.checkNotNullParameter(like, "like");
        Intrinsics.checkNotNullParameter(dislike, "dislike");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new AnswerVO(id2, name, avatarUrl, date, partner, badge, answerText, buttonsTitle, like, dislike, makeBestButton, menu, moreAnswers, isHighlighted, backgroundColor, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerVO)) {
            return false;
        }
        AnswerVO answerVO = (AnswerVO) other;
        return this.id == answerVO.id && Intrinsics.d(this.name, answerVO.name) && Intrinsics.d(this.avatarUrl, answerVO.avatarUrl) && Intrinsics.d(this.date, answerVO.date) && Intrinsics.d(this.partner, answerVO.partner) && Intrinsics.d(this.badge, answerVO.badge) && Intrinsics.d(this.answerText, answerVO.answerText) && Intrinsics.d(this.buttonsTitle, answerVO.buttonsTitle) && Intrinsics.d(this.like, answerVO.like) && Intrinsics.d(this.dislike, answerVO.dislike) && Intrinsics.d(this.makeBestButton, answerVO.makeBestButton) && Intrinsics.d(this.menu, answerVO.menu) && Intrinsics.d(this.moreAnswers, answerVO.moreAnswers) && this.isHighlighted == answerVO.isHighlighted && Intrinsics.d(this.backgroundColor, answerVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, answerVO.tokenizedEvent);
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.open.ActionSheetVOInfo
    public ActionSheetVO getActionSheetVO() {
        return this.menu.getActions();
    }

    @NotNull
    public final TextDTO getAnswerText() {
        return this.answerText;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final TextDTO getButtonsTitle() {
        return this.buttonsTitle;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.dialog.DialogActionSheetInfo
    public Map<String, SubmitDialog> getDialog() {
        return this.menu.getSubmitDialogs();
    }

    @NotNull
    public final TagV3Atom.TagAtom getDislike() {
        return this.dislike;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TagV3Atom.TagAtom getLike() {
        return this.like;
    }

    public final ListAnswersDTO.Answer.AnswerButtons.MakeBestButton getMakeBestButton() {
        return this.makeBestButton;
    }

    @NotNull
    public final MenuVO getMenu() {
        return this.menu;
    }

    public final ButtonV3Atom.SmallBorderlessButton getMoreAnswers() {
        return this.moreAnswers;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    public final SingleQuestionDTO.AuthorQuestion.Author.Partner getPartner() {
        return this.partner;
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
        int a13 = b.a(this.answerText, (hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31);
        TextDTO textDTO = this.buttonsTitle;
        int hashCode2 = (this.dislike.hashCode() + ((this.like.hashCode() + ((a13 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31)) * 31;
        ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton = this.makeBestButton;
        int hashCode3 = (this.menu.hashCode() + ((hashCode2 + (makeBestButton == null ? 0 : makeBestButton.hashCode())) * 31)) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.moreAnswers;
        int a14 = g.a(C3532b.a((hashCode3 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31, 31, this.isHighlighted), 31, this.backgroundColor);
        t tVar = this.tokenizedEvent;
        return a14 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isHighlighted, reason: from getter */
    public final boolean getIsHighlighted() {
        return this.isHighlighted;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.name;
        String str = this.avatarUrl;
        String str2 = this.date;
        SingleQuestionDTO.AuthorQuestion.Author.Partner partner = this.partner;
        Badge badge = this.badge;
        TextDTO textDTO2 = this.answerText;
        TextDTO textDTO3 = this.buttonsTitle;
        TagV3Atom.TagAtom tagAtom = this.like;
        TagV3Atom.TagAtom tagAtom2 = this.dislike;
        ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton = this.makeBestButton;
        MenuVO menuVO = this.menu;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.moreAnswers;
        boolean z11 = this.isHighlighted;
        String str3 = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("AnswerVO(id=", j11, ", name=", textDTO);
        Nh.a.h(b11, ", avatarUrl=", str, ", date=", str2);
        b11.append(", partner=");
        b11.append(partner);
        b11.append(", badge=");
        b11.append(badge);
        D3.g.i(", answerText=", ", buttonsTitle=", b11, textDTO2, textDTO3);
        b11.append(", like=");
        b11.append(tagAtom);
        b11.append(", dislike=");
        b11.append(tagAtom2);
        b11.append(", makeBestButton=");
        b11.append(makeBestButton);
        b11.append(", menu=");
        b11.append(menuVO);
        b11.append(", moreAnswers=");
        b11.append(smallBorderlessButton);
        b11.append(", isHighlighted=");
        b11.append(z11);
        Bi.a.f(b11, ", backgroundColor=", str3, ", tokenizedEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
