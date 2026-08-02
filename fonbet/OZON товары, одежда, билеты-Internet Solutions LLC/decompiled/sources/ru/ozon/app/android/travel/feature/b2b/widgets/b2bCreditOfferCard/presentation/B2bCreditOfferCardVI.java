package ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation;

import Cm.e;
import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u00014Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b-\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bottomBadgeList", "description", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;", "progressBar", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonList", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getBottomBadgeList", "()Ljava/util/List;", "getDescription", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;", "getProgressBar", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;", "getButtonList", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "ProgressBarVI", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bCreditOfferCardVI implements c {
    private final AtomAction action;

    @NotNull
    private final List<BadgeDTO> bottomBadgeList;

    @NotNull
    private final List<ButtonV3DTO> buttonList;
    private final TextDTO description;
    private final long id;
    private final ProgressBarVI progressBar;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;", "", "", "percent", "", "color", "backgroundColor", "height", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPercent", "Ljava/lang/String;", "getColor", "getBackgroundColor", "Ljava/lang/Integer;", "getHeight", "()Ljava/lang/Integer;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBarVI {
        private final String backgroundColor;
        private final String color;
        private final Integer height;
        private final int percent;

        public ProgressBarVI(int i11, String str, String str2, Integer num) {
            this.percent = i11;
            this.color = str;
            this.backgroundColor = str2;
            this.height = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBarVI)) {
                return false;
            }
            ProgressBarVI progressBarVI = (ProgressBarVI) other;
            return this.percent == progressBarVI.percent && Intrinsics.d(this.color, progressBarVI.color) && Intrinsics.d(this.backgroundColor, progressBarVI.backgroundColor) && Intrinsics.d(this.height, progressBarVI.height);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getColor() {
            return this.color;
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final int getPercent() {
            return this.percent;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.percent) * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.height;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.percent;
            String str = this.color;
            String str2 = this.backgroundColor;
            Integer num = this.height;
            StringBuilder g10 = e.g(i11, "ProgressBarVI(percent=", ", color=", str, ", backgroundColor=");
            g10.append(str2);
            g10.append(", height=");
            g10.append(num);
            g10.append(")");
            return g10.toString();
        }
    }

    public B2bCreditOfferCardVI(long j11, @NotNull TextDTO title, @NotNull List<BadgeDTO> bottomBadgeList, TextDTO textDTO, ProgressBarVI progressBarVI, @NotNull List<ButtonV3DTO> buttonList, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomBadgeList, "bottomBadgeList");
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        this.id = j11;
        this.title = title;
        this.bottomBadgeList = bottomBadgeList;
        this.description = textDTO;
        this.progressBar = progressBarVI;
        this.buttonList = buttonList;
        this.action = atomAction;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bCreditOfferCardVI)) {
            return false;
        }
        B2bCreditOfferCardVI b2bCreditOfferCardVI = (B2bCreditOfferCardVI) other;
        return this.id == b2bCreditOfferCardVI.id && Intrinsics.d(this.title, b2bCreditOfferCardVI.title) && Intrinsics.d(this.bottomBadgeList, b2bCreditOfferCardVI.bottomBadgeList) && Intrinsics.d(this.description, b2bCreditOfferCardVI.description) && Intrinsics.d(this.progressBar, b2bCreditOfferCardVI.progressBar) && Intrinsics.d(this.buttonList, b2bCreditOfferCardVI.buttonList) && Intrinsics.d(this.action, b2bCreditOfferCardVI.action) && Intrinsics.d(this.viewEvent, b2bCreditOfferCardVI.viewEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final List<BadgeDTO> getBottomBadgeList() {
        return this.bottomBadgeList;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtonList() {
        return this.buttonList;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ProgressBarVI getProgressBar() {
        return this.progressBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.bottomBadgeList);
        TextDTO textDTO = this.description;
        int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ProgressBarVI progressBarVI = this.progressBar;
        int b12 = g.b((hashCode + (progressBarVI == null ? 0 : progressBarVI.hashCode())) * 31, 31, this.buttonList);
        AtomAction atomAction = this.action;
        int hashCode2 = (b12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<BadgeDTO> list = this.bottomBadgeList;
        TextDTO textDTO2 = this.description;
        ProgressBarVI progressBarVI = this.progressBar;
        List<ButtonV3DTO> list2 = this.buttonList;
        AtomAction atomAction = this.action;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("B2bCreditOfferCardVI(id=", j11, ", title=", textDTO);
        b11.append(", bottomBadgeList=");
        b11.append(list);
        b11.append(", description=");
        b11.append(textDTO2);
        b11.append(", progressBar=");
        b11.append(progressBarVI);
        b11.append(", buttonList=");
        b11.append(list2);
        Fj.c.e(tVar, ", action=", ", viewEvent=", b11, atomAction);
        b11.append(")");
        return b11.toString();
    }
}
