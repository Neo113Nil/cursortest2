package ru.ozon.app.android.travel.feature.hotels.shared.review.presentation;

import B0.C2454a;
import B6.b;
import B90.C2619v;
import Cm.e;
import Ds.C2880a;
import Ek.a;
import G.g;
import Kk.C3532b;
import Ve.C4636t5;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0001.BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010\u0017R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "", "", "id", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "avatar", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "fullName", "date", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO$ReviewBlockVO;", "reviewBlocks", "backgroundTint", "", "containerHeight", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/String;ILWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFullName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "Ljava/util/List;", "getReviewBlocks", "()Ljava/util/List;", "getBackgroundTint", "I", "getContainerHeight", "LWZ/t;", "getViewEvent", "()LWZ/t;", "ReviewBlockVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewVO {

    @NotNull
    private final Avatar avatar;

    @NotNull
    private final String backgroundTint;
    private final int containerHeight;

    @NotNull
    private final TextAtom date;

    @NotNull
    private final TextAtom fullName;

    @NotNull
    private final String id;

    @NotNull
    private final List<ReviewBlockVO> reviewBlocks;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b!\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO$ReviewBlockVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "text", "", "hasSpan", "spanStartIndex", "spanEndIndex", "Lru/ozon/uni/atoms/af/AtomAction;", "spanAtomAction", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZIILru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getText", "Z", "getHasSpan", "()Z", "getSpanStartIndex", "getSpanEndIndex", "Lru/ozon/uni/atoms/af/AtomAction;", "getSpanAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewBlockVO {
        public static final int $stable = AtomAction.$stable | TextAtom.$stable;
        private final boolean hasSpan;
        private final int id;
        private final AtomAction spanAtomAction;
        private final int spanEndIndex;
        private final int spanStartIndex;

        @NotNull
        private final String text;

        @NotNull
        private final TextAtom title;

        public ReviewBlockVO(int i11, @NotNull TextAtom title, @NotNull String text, boolean z11, int i12, int i13, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.title = title;
            this.text = text;
            this.hasSpan = z11;
            this.spanStartIndex = i12;
            this.spanEndIndex = i13;
            this.spanAtomAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewBlockVO)) {
                return false;
            }
            ReviewBlockVO reviewBlockVO = (ReviewBlockVO) other;
            return this.id == reviewBlockVO.id && Intrinsics.d(this.title, reviewBlockVO.title) && Intrinsics.d(this.text, reviewBlockVO.text) && this.hasSpan == reviewBlockVO.hasSpan && this.spanStartIndex == reviewBlockVO.spanStartIndex && this.spanEndIndex == reviewBlockVO.spanEndIndex && Intrinsics.d(this.spanAtomAction, reviewBlockVO.spanAtomAction);
        }

        public final boolean getHasSpan() {
            return this.hasSpan;
        }

        public final int getId() {
            return this.id;
        }

        public final AtomAction getSpanAtomAction() {
            return this.spanAtomAction;
        }

        public final int getSpanEndIndex() {
            return this.spanEndIndex;
        }

        public final int getSpanStartIndex() {
            return this.spanStartIndex;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.spanEndIndex, C2454a.a(this.spanStartIndex, C3532b.a(g.a(C2619v.b(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.text), 31, this.hasSpan), 31), 31);
            AtomAction atomAction = this.spanAtomAction;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextAtom textAtom = this.title;
            String str = this.text;
            boolean z11 = this.hasSpan;
            int i12 = this.spanStartIndex;
            int i13 = this.spanEndIndex;
            AtomAction atomAction = this.spanAtomAction;
            StringBuilder sb2 = new StringBuilder("ReviewBlockVO(id=");
            sb2.append(i11);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", text=");
            C2880a.c(str, ", hasSpan=", ", spanStartIndex=", sb2, z11);
            a.f(i12, i13, ", spanEndIndex=", ", spanAtomAction=", sb2);
            return b.b(sb2, atomAction, ")");
        }
    }

    public ReviewVO(@NotNull String id2, @NotNull Avatar avatar, @NotNull TextAtom fullName, @NotNull TextAtom date, @NotNull List<ReviewBlockVO> reviewBlocks, @NotNull String backgroundTint, int i11, t tVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(reviewBlocks, "reviewBlocks");
        Intrinsics.checkNotNullParameter(backgroundTint, "backgroundTint");
        this.id = id2;
        this.avatar = avatar;
        this.fullName = fullName;
        this.date = date;
        this.reviewBlocks = reviewBlocks;
        this.backgroundTint = backgroundTint;
        this.containerHeight = i11;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewVO)) {
            return false;
        }
        ReviewVO reviewVO = (ReviewVO) other;
        return Intrinsics.d(this.id, reviewVO.id) && Intrinsics.d(this.avatar, reviewVO.avatar) && Intrinsics.d(this.fullName, reviewVO.fullName) && Intrinsics.d(this.date, reviewVO.date) && Intrinsics.d(this.reviewBlocks, reviewVO.reviewBlocks) && Intrinsics.d(this.backgroundTint, reviewVO.backgroundTint) && this.containerHeight == reviewVO.containerHeight && Intrinsics.d(this.viewEvent, reviewVO.viewEvent);
    }

    @NotNull
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getBackgroundTint() {
        return this.backgroundTint;
    }

    public final int getContainerHeight() {
        return this.containerHeight;
    }

    @NotNull
    public final TextAtom getDate() {
        return this.date;
    }

    @NotNull
    public final TextAtom getFullName() {
        return this.fullName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<ReviewBlockVO> getReviewBlocks() {
        return this.reviewBlocks;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.containerHeight, g.a(g.b(C2619v.b(C2619v.b((this.avatar.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.fullName), 31, this.date), 31, this.reviewBlocks), 31, this.backgroundTint), 31);
        t tVar = this.viewEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Avatar avatar = this.avatar;
        TextAtom textAtom = this.fullName;
        TextAtom textAtom2 = this.date;
        List<ReviewBlockVO> list = this.reviewBlocks;
        String str2 = this.backgroundTint;
        int i11 = this.containerHeight;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("ReviewVO(id=");
        sb2.append(str);
        sb2.append(", avatar=");
        sb2.append(avatar);
        sb2.append(", fullName=");
        C4636t5.c(", date=", ", reviewBlocks=", sb2, textAtom, textAtom2);
        e.i(", backgroundTint=", str2, ", containerHeight=", sb2, list);
        sb2.append(i11);
        sb2.append(", viewEvent=");
        sb2.append(tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
