package ru.ozon.app.android.pdp.widgets.translateButton.presentation;

import Ak.C2436a;
import B0.C2454a;
import Bi.b;
import De.C2859b;
import G.g;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.app.android.pdp.widgets.translateButton.data.TranslateButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jv\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b\u0012\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "", "id", "", "tabGroupId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "translateButton", "translatedButton", "Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;", "notifications", "", "attributeKeys", "", "loaderTopPadding", "LWZ/t;", "tokenizedEvent", "", "isLoading", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;Ljava/util/List;ILWZ/t;Z)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;Ljava/util/List;ILWZ/t;Z)Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTranslateButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTranslatedButton", "Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;", "getNotifications", "()Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateButtonDTO$Notification;", "Ljava/util/List;", "getAttributeKeys", "()Ljava/util/List;", "I", "getLoaderTopPadding", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TranslateButtonVO implements TabEmbeddedViewObject {

    @NotNull
    private final List<String> attributeKeys;
    private final long id;
    private final boolean isLoading;
    private final int loaderTopPadding;

    @NotNull
    private final TranslateButtonDTO.Notification notifications;
    private final String tabGroupId;
    private final t tokenizedEvent;
    private final ButtonV3DTO translateButton;

    @NotNull
    private final ButtonV3DTO translatedButton;

    public TranslateButtonVO(long j11, String str, ButtonV3DTO buttonV3DTO, @NotNull ButtonV3DTO translatedButton, @NotNull TranslateButtonDTO.Notification notifications, @NotNull List<String> attributeKeys, int i11, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(translatedButton, "translatedButton");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Intrinsics.checkNotNullParameter(attributeKeys, "attributeKeys");
        this.id = j11;
        this.tabGroupId = str;
        this.translateButton = buttonV3DTO;
        this.translatedButton = translatedButton;
        this.notifications = notifications;
        this.attributeKeys = attributeKeys;
        this.loaderTopPadding = i11;
        this.tokenizedEvent = tVar;
        this.isLoading = z11;
    }

    public static /* synthetic */ TranslateButtonVO copy$default(TranslateButtonVO translateButtonVO, long j11, String str, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, TranslateButtonDTO.Notification notification, List list, int i11, t tVar, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = translateButtonVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = translateButtonVO.tabGroupId;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            buttonV3DTO = translateButtonVO.translateButton;
        }
        return translateButtonVO.copy(j12, str2, buttonV3DTO, (i12 & 8) != 0 ? translateButtonVO.translatedButton : buttonV3DTO2, (i12 & 16) != 0 ? translateButtonVO.notifications : notification, (i12 & 32) != 0 ? translateButtonVO.attributeKeys : list, (i12 & 64) != 0 ? translateButtonVO.loaderTopPadding : i11, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? translateButtonVO.tokenizedEvent : tVar, (i12 & 256) != 0 ? translateButtonVO.isLoading : z11);
    }

    @NotNull
    public final TranslateButtonVO copy(long id2, String tabGroupId, ButtonV3DTO translateButton, @NotNull ButtonV3DTO translatedButton, @NotNull TranslateButtonDTO.Notification notifications, @NotNull List<String> attributeKeys, int loaderTopPadding, t tokenizedEvent, boolean isLoading) {
        Intrinsics.checkNotNullParameter(translatedButton, "translatedButton");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Intrinsics.checkNotNullParameter(attributeKeys, "attributeKeys");
        return new TranslateButtonVO(id2, tabGroupId, translateButton, translatedButton, notifications, attributeKeys, loaderTopPadding, tokenizedEvent, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslateButtonVO)) {
            return false;
        }
        TranslateButtonVO translateButtonVO = (TranslateButtonVO) other;
        return this.id == translateButtonVO.id && Intrinsics.d(this.tabGroupId, translateButtonVO.tabGroupId) && Intrinsics.d(this.translateButton, translateButtonVO.translateButton) && Intrinsics.d(this.translatedButton, translateButtonVO.translatedButton) && Intrinsics.d(this.notifications, translateButtonVO.notifications) && Intrinsics.d(this.attributeKeys, translateButtonVO.attributeKeys) && this.loaderTopPadding == translateButtonVO.loaderTopPadding && Intrinsics.d(this.tokenizedEvent, translateButtonVO.tokenizedEvent) && this.isLoading == translateButtonVO.isLoading;
    }

    @NotNull
    public final List<String> getAttributeKeys() {
        return this.attributeKeys;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLoaderTopPadding() {
        return this.loaderTopPadding;
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

    public final ButtonV3DTO getTranslateButton() {
        return this.translateButton;
    }

    @NotNull
    public final ButtonV3DTO getTranslatedButton() {
        return this.translatedButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.tabGroupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.translateButton;
        int a11 = C2454a.a(this.loaderTopPadding, g.b((this.notifications.hashCode() + C2859b.c(this.translatedButton, (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31)) * 31, 31, this.attributeKeys), 31);
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.isLoading) + ((a11 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.tabGroupId;
        ButtonV3DTO buttonV3DTO = this.translateButton;
        ButtonV3DTO buttonV3DTO2 = this.translatedButton;
        TranslateButtonDTO.Notification notification = this.notifications;
        List<String> list = this.attributeKeys;
        int i11 = this.loaderTopPadding;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.isLoading;
        StringBuilder c11 = C2436a.c(j11, "TranslateButtonVO(id=", ", tabGroupId=", str);
        c11.append(", translateButton=");
        c11.append(buttonV3DTO);
        c11.append(", translatedButton=");
        c11.append(buttonV3DTO2);
        c11.append(", notifications=");
        c11.append(notification);
        c11.append(", attributeKeys=");
        c11.append(list);
        c11.append(", loaderTopPadding=");
        c11.append(i11);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        return b.f(c11, ", isLoading=", z11, ")");
    }

    public /* synthetic */ TranslateButtonVO(long j11, String str, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, TranslateButtonDTO.Notification notification, List list, int i11, t tVar, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, buttonV3DTO, buttonV3DTO2, notification, list, i11, tVar, (i12 & 256) != 0 ? false : z11);
    }
}
