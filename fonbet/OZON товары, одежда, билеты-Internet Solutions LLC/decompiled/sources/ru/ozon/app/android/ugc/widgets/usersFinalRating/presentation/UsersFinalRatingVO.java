package ru.ozon.app.android.ugc.widgets.usersFinalRating.presentation;

import Pk0.b;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersFinalRating/presentation/UsersFinalRatingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "showDetailsButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "valueText", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JFLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "F", "getValue", "()F", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getShowDetailsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getValueText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UsersFinalRatingVO implements c {
    private final AtomAction action;
    private final long id;
    private final ButtonV3Atom.SmallIconButton showDetailsButton;
    private final t tokenizedEvent;
    private final float value;

    @NotNull
    private final TextDTO valueText;

    public UsersFinalRatingVO(long j11, float f7, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull TextDTO valueText, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        this.id = j11;
        this.value = f7;
        this.showDetailsButton = smallIconButton;
        this.valueText = valueText;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsersFinalRatingVO)) {
            return false;
        }
        UsersFinalRatingVO usersFinalRatingVO = (UsersFinalRatingVO) other;
        return this.id == usersFinalRatingVO.id && Float.compare(this.value, usersFinalRatingVO.value) == 0 && Intrinsics.d(this.showDetailsButton, usersFinalRatingVO.showDetailsButton) && Intrinsics.d(this.valueText, usersFinalRatingVO.valueText) && Intrinsics.d(this.action, usersFinalRatingVO.action) && Intrinsics.d(this.tokenizedEvent, usersFinalRatingVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3Atom.SmallIconButton getShowDetailsButton() {
        return this.showDetailsButton;
    }

    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final TextDTO getValueText() {
        return this.valueText;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.value, Long.hashCode(this.id) * 31, 31);
        ButtonV3Atom.SmallIconButton smallIconButton = this.showDetailsButton;
        int a12 = Ns.b.a(this.valueText, (a11 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31, 31);
        AtomAction atomAction = this.action;
        int hashCode = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        float f7 = this.value;
        ButtonV3Atom.SmallIconButton smallIconButton = this.showDetailsButton;
        TextDTO textDTO = this.valueText;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("UsersFinalRatingVO(id=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(f7);
        sb2.append(", showDetailsButton=");
        sb2.append(smallIconButton);
        sb2.append(", valueText=");
        sb2.append(textDTO);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", sb2, atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}
