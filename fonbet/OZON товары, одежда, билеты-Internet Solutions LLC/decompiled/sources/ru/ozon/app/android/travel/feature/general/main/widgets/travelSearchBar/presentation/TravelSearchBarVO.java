package ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation;

import Ak.C2436a;
import An.C2439a;
import G.g;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b\u000b\u0010&R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b\f\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b'\u0010$R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelSearchBar/presentation/TravelSearchBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "inputPlaceholder", "inputValue", "Lru/ozon/uni/atoms/af/AtomAction;", "inputOnChangeAction", "", "isClearButtonVisible", "isEnabled", "tapAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "searchEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;ZZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getInputPlaceholder", "getInputValue", "Lru/ozon/uni/atoms/af/AtomAction;", "getInputOnChangeAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "getTapAction", "LWZ/t;", "getSearchEvent", "()LWZ/t;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelSearchBarVO implements c {
    private final long id;
    private final AtomAction inputOnChangeAction;

    @NotNull
    private final String inputPlaceholder;

    @NotNull
    private final String inputValue;
    private final boolean isClearButtonVisible;
    private final boolean isEnabled;
    private final t searchEvent;
    private final AtomAction tapAction;

    public TravelSearchBarVO(long j11, @NotNull String inputPlaceholder, @NotNull String inputValue, AtomAction atomAction, boolean z11, boolean z12, AtomAction atomAction2, t tVar) {
        Intrinsics.checkNotNullParameter(inputPlaceholder, "inputPlaceholder");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        this.id = j11;
        this.inputPlaceholder = inputPlaceholder;
        this.inputValue = inputValue;
        this.inputOnChangeAction = atomAction;
        this.isClearButtonVisible = z11;
        this.isEnabled = z12;
        this.tapAction = atomAction2;
        this.searchEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSearchBarVO)) {
            return false;
        }
        TravelSearchBarVO travelSearchBarVO = (TravelSearchBarVO) other;
        return this.id == travelSearchBarVO.id && Intrinsics.d(this.inputPlaceholder, travelSearchBarVO.inputPlaceholder) && Intrinsics.d(this.inputValue, travelSearchBarVO.inputValue) && Intrinsics.d(this.inputOnChangeAction, travelSearchBarVO.inputOnChangeAction) && this.isClearButtonVisible == travelSearchBarVO.isClearButtonVisible && this.isEnabled == travelSearchBarVO.isEnabled && Intrinsics.d(this.tapAction, travelSearchBarVO.tapAction) && Intrinsics.d(this.searchEvent, travelSearchBarVO.searchEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final AtomAction getInputOnChangeAction() {
        return this.inputOnChangeAction;
    }

    @NotNull
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    @NotNull
    public final String getInputValue() {
        return this.inputValue;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getSearchEvent() {
        return this.searchEvent;
    }

    public final AtomAction getTapAction() {
        return this.tapAction;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.inputPlaceholder), 31, this.inputValue);
        AtomAction atomAction = this.inputOnChangeAction;
        int a12 = C3532b.a(C3532b.a((a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.isClearButtonVisible), 31, this.isEnabled);
        AtomAction atomAction2 = this.tapAction;
        int hashCode = (a12 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
        t tVar = this.searchEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isClearButtonVisible, reason: from getter */
    public final boolean getIsClearButtonVisible() {
        return this.isClearButtonVisible;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.inputPlaceholder;
        String str2 = this.inputValue;
        AtomAction atomAction = this.inputOnChangeAction;
        boolean z11 = this.isClearButtonVisible;
        boolean z12 = this.isEnabled;
        AtomAction atomAction2 = this.tapAction;
        t tVar = this.searchEvent;
        StringBuilder c11 = C2436a.c(j11, "TravelSearchBarVO(id=", ", inputPlaceholder=", str);
        C2439a.c(", inputValue=", str2, ", inputOnChangeAction=", c11, atomAction);
        C2436a.e(", isClearButtonVisible=", ", isEnabled=", c11, z11, z12);
        Fj.c.e(tVar, ", tapAction=", ", searchEvent=", c11, atomAction2);
        c11.append(")");
        return c11.toString();
    }
}
