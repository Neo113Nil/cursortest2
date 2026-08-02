package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import B0.C2454a;
import D3.g;
import D3.h;
import Ek.a;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001eB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", DynamicElementDTO.TABS, "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO$FaqItemVO;", "items", "<init>", "(JLjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "getItems", "FaqItemVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FaqVO implements c {
    private final long id;

    @NotNull
    private final List<FaqItemVO> items;

    @NotNull
    private final List<ChipDTO> tabs;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO$FaqItemVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "question", "answer", "", "collapsedContentHeight", "disclosureAnswerHeight", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IILWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getQuestion", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAnswer", "I", "getCollapsedContentHeight", "getDisclosureAnswerHeight", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FaqItemVO {

        @NotNull
        private final TextDTO answer;
        private final int collapsedContentHeight;
        private final int disclosureAnswerHeight;

        @NotNull
        private final TextDTO question;
        private final t tokenizedEvent;

        public FaqItemVO(@NotNull TextDTO question, @NotNull TextDTO answer, int i11, int i12, t tVar) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.question = question;
            this.answer = answer;
            this.collapsedContentHeight = i11;
            this.disclosureAnswerHeight = i12;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaqItemVO)) {
                return false;
            }
            FaqItemVO faqItemVO = (FaqItemVO) other;
            return Intrinsics.d(this.question, faqItemVO.question) && Intrinsics.d(this.answer, faqItemVO.answer) && this.collapsedContentHeight == faqItemVO.collapsedContentHeight && this.disclosureAnswerHeight == faqItemVO.disclosureAnswerHeight && Intrinsics.d(this.tokenizedEvent, faqItemVO.tokenizedEvent);
        }

        @NotNull
        public final TextDTO getAnswer() {
            return this.answer;
        }

        public final int getCollapsedContentHeight() {
            return this.collapsedContentHeight;
        }

        public final int getDisclosureAnswerHeight() {
            return this.disclosureAnswerHeight;
        }

        @NotNull
        public final TextDTO getQuestion() {
            return this.question;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.disclosureAnswerHeight, C2454a.a(this.collapsedContentHeight, b.a(this.answer, this.question.hashCode() * 31, 31), 31), 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.question;
            TextDTO textDTO2 = this.answer;
            int i11 = this.collapsedContentHeight;
            int i12 = this.disclosureAnswerHeight;
            t tVar = this.tokenizedEvent;
            StringBuilder g10 = g.g("FaqItemVO(question=", textDTO, ", answer=", textDTO2, ", collapsedContentHeight=");
            a.f(i11, i12, ", disclosureAnswerHeight=", ", tokenizedEvent=", g10);
            return Tl.b.d(g10, tVar, ")");
        }
    }

    public FaqVO(long j11, @NotNull List<ChipDTO> tabs, @NotNull List<FaqItemVO> items) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.tabs = tabs;
        this.items = items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaqVO)) {
            return false;
        }
        FaqVO faqVO = (FaqVO) other;
        return this.id == faqVO.id && Intrinsics.d(this.tabs, faqVO.tabs) && Intrinsics.d(this.items, faqVO.items);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<FaqItemVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<ChipDTO> getTabs() {
        return this.tabs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.items.hashCode() + G.g.b(Long.hashCode(this.id) * 31, 31, this.tabs);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ChipDTO> list = this.tabs;
        return h.c(Lh.b.b(j11, "FaqVO(id=", ", tabs=", list), ", items=", this.items, ")");
    }
}
