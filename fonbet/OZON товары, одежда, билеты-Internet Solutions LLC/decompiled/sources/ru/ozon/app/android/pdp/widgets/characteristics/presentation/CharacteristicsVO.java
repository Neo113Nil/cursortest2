package ru.ozon.app.android.pdp.widgets.characteristics.presentation;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J|\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b\u000e\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "", "id", "", "tabGroupId", "backgroundColor", "", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsItem;", "limitList", "unLimitList", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsButton;", "characteristicsButton", "", "isExpanded", "isExpandedDefault", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsButton;ZZLWZ/t;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsButton;ZZLWZ/t;)Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "getBackgroundColor", "Ljava/util/List;", "getLimitList", "()Ljava/util/List;", "getUnLimitList", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsButton;", "getCharacteristicsButton", "()Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsButton;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CharacteristicsVO implements TabEmbeddedViewObject {

    @NotNull
    private final String backgroundColor;
    private final CharacteristicsButton characteristicsButton;
    private final long id;
    private final boolean isExpanded;
    private final boolean isExpandedDefault;

    @NotNull
    private final List<CharacteristicsItem> limitList;
    private final String tabGroupId;
    private final t tokenizedEvent;

    @NotNull
    private final List<CharacteristicsItem> unLimitList;

    /* JADX WARN: Multi-variable type inference failed */
    public CharacteristicsVO(long j11, String str, @NotNull String backgroundColor, @NotNull List<? extends CharacteristicsItem> limitList, @NotNull List<? extends CharacteristicsItem> unLimitList, CharacteristicsButton characteristicsButton, boolean z11, boolean z12, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(limitList, "limitList");
        Intrinsics.checkNotNullParameter(unLimitList, "unLimitList");
        this.id = j11;
        this.tabGroupId = str;
        this.backgroundColor = backgroundColor;
        this.limitList = limitList;
        this.unLimitList = unLimitList;
        this.characteristicsButton = characteristicsButton;
        this.isExpanded = z11;
        this.isExpandedDefault = z12;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ CharacteristicsVO copy$default(CharacteristicsVO characteristicsVO, long j11, String str, String str2, List list, List list2, CharacteristicsButton characteristicsButton, boolean z11, boolean z12, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = characteristicsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = characteristicsVO.tabGroupId;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = characteristicsVO.backgroundColor;
        }
        return characteristicsVO.copy(j12, str3, str2, (i11 & 8) != 0 ? characteristicsVO.limitList : list, (i11 & 16) != 0 ? characteristicsVO.unLimitList : list2, (i11 & 32) != 0 ? characteristicsVO.characteristicsButton : characteristicsButton, (i11 & 64) != 0 ? characteristicsVO.isExpanded : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? characteristicsVO.isExpandedDefault : z12, (i11 & 256) != 0 ? characteristicsVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final CharacteristicsVO copy(long id2, String tabGroupId, @NotNull String backgroundColor, @NotNull List<? extends CharacteristicsItem> limitList, @NotNull List<? extends CharacteristicsItem> unLimitList, CharacteristicsButton characteristicsButton, boolean isExpanded, boolean isExpandedDefault, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(limitList, "limitList");
        Intrinsics.checkNotNullParameter(unLimitList, "unLimitList");
        return new CharacteristicsVO(id2, tabGroupId, backgroundColor, limitList, unLimitList, characteristicsButton, isExpanded, isExpandedDefault, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacteristicsVO)) {
            return false;
        }
        CharacteristicsVO characteristicsVO = (CharacteristicsVO) other;
        return this.id == characteristicsVO.id && Intrinsics.d(this.tabGroupId, characteristicsVO.tabGroupId) && Intrinsics.d(this.backgroundColor, characteristicsVO.backgroundColor) && Intrinsics.d(this.limitList, characteristicsVO.limitList) && Intrinsics.d(this.unLimitList, characteristicsVO.unLimitList) && Intrinsics.d(this.characteristicsButton, characteristicsVO.characteristicsButton) && this.isExpanded == characteristicsVO.isExpanded && this.isExpandedDefault == characteristicsVO.isExpandedDefault && Intrinsics.d(this.tokenizedEvent, characteristicsVO.tokenizedEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CharacteristicsButton getCharacteristicsButton() {
        return this.characteristicsButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CharacteristicsItem> getLimitList() {
        return this.limitList;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
    public String getTabGroupId() {
        return this.tabGroupId;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final List<CharacteristicsItem> getUnLimitList() {
        return this.unLimitList;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.tabGroupId;
        int b11 = g.b(g.b(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.backgroundColor), 31, this.limitList), 31, this.unLimitList);
        CharacteristicsButton characteristicsButton = this.characteristicsButton;
        int a11 = C3532b.a(C3532b.a((b11 + (characteristicsButton == null ? 0 : characteristicsButton.hashCode())) * 31, 31, this.isExpanded), 31, this.isExpandedDefault);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isExpandedDefault, reason: from getter */
    public final boolean getIsExpandedDefault() {
        return this.isExpandedDefault;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.tabGroupId;
        String str2 = this.backgroundColor;
        List<CharacteristicsItem> list = this.limitList;
        List<CharacteristicsItem> list2 = this.unLimitList;
        CharacteristicsButton characteristicsButton = this.characteristicsButton;
        boolean z11 = this.isExpanded;
        boolean z12 = this.isExpandedDefault;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "CharacteristicsVO(id=", ", tabGroupId=", str);
        a.g(", backgroundColor=", str2, ", limitList=", c11, list);
        c11.append(", unLimitList=");
        c11.append(list2);
        c11.append(", characteristicsButton=");
        c11.append(characteristicsButton);
        C2436a.e(", isExpanded=", ", isExpandedDefault=", c11, z11, z12);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
