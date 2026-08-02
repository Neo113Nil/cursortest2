package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.presentation;

import De.C2860c;
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
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b(\u0010'R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "amount", "additionalAmount", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeList", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonList", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAmount", "getAdditionalAmount", "Ljava/util/List;", "getBadgeList", "()Ljava/util/List;", "getButtonList", "LWZ/t;", "getViewEvent", "()LWZ/t;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bFinanceCardVI implements c {
    private final TextDTO additionalAmount;

    @NotNull
    private final TextDTO amount;

    @NotNull
    private final List<BadgeDTO> badgeList;

    @NotNull
    private final List<ButtonV3DTO> buttonList;
    private final long id;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    public B2bFinanceCardVI(long j11, @NotNull TextDTO title, @NotNull TextDTO amount, TextDTO textDTO, @NotNull List<BadgeDTO> badgeList, @NotNull List<ButtonV3DTO> buttonList, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        this.id = j11;
        this.title = title;
        this.amount = amount;
        this.additionalAmount = textDTO;
        this.badgeList = badgeList;
        this.buttonList = buttonList;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bFinanceCardVI)) {
            return false;
        }
        B2bFinanceCardVI b2bFinanceCardVI = (B2bFinanceCardVI) other;
        return this.id == b2bFinanceCardVI.id && Intrinsics.d(this.title, b2bFinanceCardVI.title) && Intrinsics.d(this.amount, b2bFinanceCardVI.amount) && Intrinsics.d(this.additionalAmount, b2bFinanceCardVI.additionalAmount) && Intrinsics.d(this.badgeList, b2bFinanceCardVI.badgeList) && Intrinsics.d(this.buttonList, b2bFinanceCardVI.buttonList) && Intrinsics.d(this.viewEvent, b2bFinanceCardVI.viewEvent);
    }

    public final TextDTO getAdditionalAmount() {
        return this.additionalAmount;
    }

    @NotNull
    public final TextDTO getAmount() {
        return this.amount;
    }

    @NotNull
    public final List<BadgeDTO> getBadgeList() {
        return this.badgeList;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtonList() {
        return this.buttonList;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int a11 = b.a(this.amount, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31);
        TextDTO textDTO = this.additionalAmount;
        int b11 = g.b(g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.badgeList), 31, this.buttonList);
        t tVar = this.viewEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.amount;
        TextDTO textDTO3 = this.additionalAmount;
        List<BadgeDTO> list = this.badgeList;
        List<ButtonV3DTO> list2 = this.buttonList;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("B2bFinanceCardVI(id=", j11, ", title=", textDTO);
        D3.g.i(", amount=", ", additionalAmount=", b11, textDTO2, textDTO3);
        C2860c.g(", badgeList=", ", buttonList=", b11, list, list2);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}
