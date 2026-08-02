package ru.ozon.app.android.travel.molecules.view.starsBlock;

import D3.g;
import El.C2971a;
import F3.G;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "titlePrefix", "subtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "settings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitlePrefix", "getSubtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StarsBalanceMoleculeVI {
    public static final int $stable = 8;

    @NotNull
    private final IconDTO icon;
    private final TravelWidgetSettingsVO settings;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final TextDTO titlePrefix;
    private final t tokenizedEvent;

    public StarsBalanceMoleculeVI(@NotNull TextDTO title, TextDTO textDTO, @NotNull TextDTO subtitle, @NotNull IconDTO icon, TravelWidgetSettingsVO travelWidgetSettingsVO, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.title = title;
        this.titlePrefix = textDTO;
        this.subtitle = subtitle;
        this.icon = icon;
        this.settings = travelWidgetSettingsVO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarsBalanceMoleculeVI)) {
            return false;
        }
        StarsBalanceMoleculeVI starsBalanceMoleculeVI = (StarsBalanceMoleculeVI) other;
        return Intrinsics.d(this.title, starsBalanceMoleculeVI.title) && Intrinsics.d(this.titlePrefix, starsBalanceMoleculeVI.titlePrefix) && Intrinsics.d(this.subtitle, starsBalanceMoleculeVI.subtitle) && Intrinsics.d(this.icon, starsBalanceMoleculeVI.icon) && Intrinsics.d(this.settings, starsBalanceMoleculeVI.settings) && Intrinsics.d(this.tokenizedEvent, starsBalanceMoleculeVI.tokenizedEvent);
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TravelWidgetSettingsVO getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final TextDTO getTitlePrefix() {
        return this.titlePrefix;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.titlePrefix;
        int a11 = C2971a.a(this.icon, b.a(this.subtitle, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31);
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.settings;
        int hashCode2 = (a11 + (travelWidgetSettingsVO == null ? 0 : travelWidgetSettingsVO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.titlePrefix;
        TextDTO textDTO3 = this.subtitle;
        IconDTO iconDTO = this.icon;
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.settings;
        t tVar = this.tokenizedEvent;
        StringBuilder g10 = g.g("StarsBalanceMoleculeVI(title=", textDTO, ", titlePrefix=", textDTO2, ", subtitle=");
        G.f(g10, textDTO3, ", icon=", iconDTO, ", settings=");
        g10.append(travelWidgetSettingsVO);
        g10.append(", tokenizedEvent=");
        g10.append(tVar);
        g10.append(")");
        return g10.toString();
    }
}
