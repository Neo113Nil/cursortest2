package ru.ozon.app.android.pdp.widgets.characteristics.presentation;

import D3.g;
import Ns.b;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u0010\u0014¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsValues;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsItem;", "", "id", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;", "viewType", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "copyButtonIndex", "<init>", "(JLru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;", "getViewType", "()Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsType;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getValue", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getCopyButtonIndex", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CharacteristicsValues extends CharacteristicsItem {
    private final AtomAction action;
    private final String copyButtonIndex;
    private final Icon icon;
    private final long id;

    @NotNull
    private final TextDTO name;
    private final t tokenizedEvent;

    @NotNull
    private final TextDTO value;

    @NotNull
    private final CharacteristicsType viewType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicsValues(long j11, @NotNull CharacteristicsType viewType, @NotNull TextDTO name, @NotNull TextDTO value, Icon icon, AtomAction atomAction, t tVar, String str) {
        super(j11, viewType, null);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.id = j11;
        this.viewType = viewType;
        this.name = name;
        this.value = value;
        this.icon = icon;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.copyButtonIndex = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacteristicsValues)) {
            return false;
        }
        CharacteristicsValues characteristicsValues = (CharacteristicsValues) other;
        return this.id == characteristicsValues.id && this.viewType == characteristicsValues.viewType && Intrinsics.d(this.name, characteristicsValues.name) && Intrinsics.d(this.value, characteristicsValues.value) && Intrinsics.d(this.icon, characteristicsValues.icon) && Intrinsics.d(this.action, characteristicsValues.action) && Intrinsics.d(this.tokenizedEvent, characteristicsValues.tokenizedEvent) && Intrinsics.d(this.copyButtonIndex, characteristicsValues.copyButtonIndex);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getCopyButtonIndex() {
        return this.copyButtonIndex;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsItem
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final TextDTO getValue() {
        return this.value;
    }

    @Override // ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsItem
    @NotNull
    public CharacteristicsType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int a11 = b.a(this.value, b.a(this.name, (this.viewType.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31);
        Icon icon = this.icon;
        int hashCode = (a11 + (icon == null ? 0 : icon.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.copyButtonIndex;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CharacteristicsType characteristicsType = this.viewType;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.value;
        Icon icon = this.icon;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        String str = this.copyButtonIndex;
        StringBuilder sb2 = new StringBuilder("CharacteristicsValues(id=");
        sb2.append(j11);
        sb2.append(", viewType=");
        sb2.append(characteristicsType);
        g.i(", name=", ", value=", sb2, textDTO, textDTO2);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", copyButtonIndex=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }
}
