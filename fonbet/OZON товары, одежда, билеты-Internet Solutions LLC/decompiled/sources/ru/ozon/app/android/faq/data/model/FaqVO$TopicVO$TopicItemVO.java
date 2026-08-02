package ru.ozon.app.android.faq.data.model;

import Bi.b;
import G.g;
import Kk.C3532b;
import T7.P;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u001d\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO", "Ll20/c;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "topicTitle", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;LWZ/t;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTopicTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "AccordionVO", "LinkItemVO", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$AccordionVO;", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$LinkItemVO;", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FaqVO$TopicVO$TopicItemVO implements c {
    private final t tokenizedEvent;
    private final OzonSpannableString topicTitle;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010)\"\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b\u000e\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$AccordionVO;", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO;", "", "id", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "topicTitle", "question", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "answer", "LWZ/t;", "tokenizedEvent", "", "isDisclosureOpen", "isShowSeparator", "<init>", "(JLru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;LWZ/t;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTopicTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getQuestion", "Ljava/util/List;", "getAnswer", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "setDisclosureOpen", "(Z)V", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccordionVO extends FaqVO$TopicVO$TopicItemVO {

        @NotNull
        private final List<AtomDTO> answer;
        private final long id;
        private boolean isDisclosureOpen;
        private final boolean isShowSeparator;

        @NotNull
        private final OzonSpannableString question;
        private final t tokenizedEvent;
        private final OzonSpannableString topicTitle;

        public /* synthetic */ AccordionVO(long j11, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, List list, t tVar, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, ozonSpannableString, ozonSpannableString2, list, tVar, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? true : z12);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccordionVO)) {
                return false;
            }
            AccordionVO accordionVO = (AccordionVO) other;
            return this.id == accordionVO.id && Intrinsics.d(this.topicTitle, accordionVO.topicTitle) && Intrinsics.d(this.question, accordionVO.question) && Intrinsics.d(this.answer, accordionVO.answer) && Intrinsics.d(this.tokenizedEvent, accordionVO.tokenizedEvent) && this.isDisclosureOpen == accordionVO.isDisclosureOpen && this.isShowSeparator == accordionVO.isShowSeparator;
        }

        @NotNull
        public final List<AtomDTO> getAnswer() {
            return this.answer;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final OzonSpannableString getQuestion() {
            return this.question;
        }

        @Override // ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO
        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO
        public OzonSpannableString getTopicTitle() {
            return this.topicTitle;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            OzonSpannableString ozonSpannableString = this.topicTitle;
            int b11 = g.b(P.c(this.question, (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31), 31, this.answer);
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.isShowSeparator) + C3532b.a((b11 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.isDisclosureOpen);
        }

        /* renamed from: isDisclosureOpen, reason: from getter */
        public final boolean getIsDisclosureOpen() {
            return this.isDisclosureOpen;
        }

        /* renamed from: isShowSeparator, reason: from getter */
        public final boolean getIsShowSeparator() {
            return this.isShowSeparator;
        }

        public final void setDisclosureOpen(boolean z11) {
            this.isDisclosureOpen = z11;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            OzonSpannableString ozonSpannableString = this.topicTitle;
            OzonSpannableString ozonSpannableString2 = this.question;
            List<AtomDTO> list = this.answer;
            t tVar = this.tokenizedEvent;
            boolean z11 = this.isDisclosureOpen;
            boolean z12 = this.isShowSeparator;
            StringBuilder sb2 = new StringBuilder("AccordionVO(id=");
            sb2.append(j11);
            sb2.append(", topicTitle=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", question=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", answer=");
            sb2.append(list);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", isDisclosureOpen=");
            sb2.append(z11);
            return b.f(sb2, ", isShowSeparator=", z12, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AccordionVO(long j11, OzonSpannableString ozonSpannableString, @NotNull OzonSpannableString question, @NotNull List<? extends AtomDTO> answer, t tVar, boolean z11, boolean z12) {
            super(ozonSpannableString, tVar, null);
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.id = j11;
            this.topicTitle = ozonSpannableString;
            this.question = question;
            this.answer = answer;
            this.tokenizedEvent = tVar;
            this.isDisclosureOpen = z11;
            this.isShowSeparator = z12;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b\f\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO$LinkItemVO;", "Lru/ozon/app/android/faq/data/model/FaqVO$TopicVO$TopicItemVO;", "", "id", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "topicTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "isShowSeparator", "<init>", "(JLru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTopicTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LinkItemVO extends FaqVO$TopicVO$TopicItemVO {
        private final AtomAction action;
        private final long id;
        private final boolean isShowSeparator;
        private final OzonSpannableString title;
        private final t tokenizedEvent;
        private final OzonSpannableString topicTitle;

        public LinkItemVO(long j11, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, AtomAction atomAction, t tVar, boolean z11) {
            super(ozonSpannableString, tVar, null);
            this.id = j11;
            this.topicTitle = ozonSpannableString;
            this.title = ozonSpannableString2;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.isShowSeparator = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkItemVO)) {
                return false;
            }
            LinkItemVO linkItemVO = (LinkItemVO) other;
            return this.id == linkItemVO.id && Intrinsics.d(this.topicTitle, linkItemVO.topicTitle) && Intrinsics.d(this.title, linkItemVO.title) && Intrinsics.d(this.action, linkItemVO.action) && Intrinsics.d(this.tokenizedEvent, linkItemVO.tokenizedEvent) && this.isShowSeparator == linkItemVO.isShowSeparator;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO
        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO
        public OzonSpannableString getTopicTitle() {
            return this.topicTitle;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            OzonSpannableString ozonSpannableString = this.topicTitle;
            int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            OzonSpannableString ozonSpannableString2 = this.title;
            int hashCode3 = (hashCode2 + (ozonSpannableString2 == null ? 0 : ozonSpannableString2.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.isShowSeparator) + ((hashCode4 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        /* renamed from: isShowSeparator, reason: from getter */
        public final boolean getIsShowSeparator() {
            return this.isShowSeparator;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            OzonSpannableString ozonSpannableString = this.topicTitle;
            OzonSpannableString ozonSpannableString2 = this.title;
            return "LinkItemVO(id=" + j11 + ", topicTitle=" + ((Object) ozonSpannableString) + ", title=" + ((Object) ozonSpannableString2) + ", action=" + this.action + ", tokenizedEvent=" + this.tokenizedEvent + ", isShowSeparator=" + this.isShowSeparator + ")";
        }
    }

    public /* synthetic */ FaqVO$TopicVO$TopicItemVO(OzonSpannableString ozonSpannableString, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, tVar);
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public OzonSpannableString getTopicTitle() {
        return this.topicTitle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    private FaqVO$TopicVO$TopicItemVO(OzonSpannableString ozonSpannableString, t tVar) {
        this.topicTitle = ozonSpannableString;
        this.tokenizedEvent = tVar;
    }
}
