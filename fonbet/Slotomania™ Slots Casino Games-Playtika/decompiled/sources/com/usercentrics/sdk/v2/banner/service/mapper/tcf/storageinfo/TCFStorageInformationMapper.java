package com.usercentrics.sdk.v2.banner.service.mapper.tcf.storageinfo;

import com.usercentrics.sdk.CommonKt;
import com.usercentrics.sdk.models.settings.PredefinedUIDeviceStorageContent;
import com.usercentrics.sdk.models.settings.PredefinedUIServiceContentSection;
import com.usercentrics.sdk.models.settings.PredefinedUIStorageInformationButtonInfo;
import com.usercentrics.sdk.models.settings.PredefinedUIStorageInformationServiceContent;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosure;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TCFStorageInformationMapper.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0002J\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/usercentrics/sdk/v2/banner/service/mapper/tcf/storageinfo/TCFStorageInformationMapper;", "", "holder", "Lcom/usercentrics/sdk/v2/banner/service/mapper/tcf/storageinfo/TCFStorageInformationHolder;", "showShortDescription", "", "(Lcom/usercentrics/sdk/v2/banner/service/mapper/tcf/storageinfo/TCFStorageInformationHolder;Z)V", "appendCookiesInformation", "", "content", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "map", "Lcom/usercentrics/sdk/models/settings/PredefinedUIServiceContentSection;", "mapDeviceStorageContent", "", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDeviceStorageContent;", "deviceStorage", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;", "storageInformationButtonInfo", "Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TCFStorageInformationMapper {
    private final TCFStorageInformationHolder holder;
    private final boolean showShortDescription;

    public TCFStorageInformationMapper(TCFStorageInformationHolder holder, boolean z) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.holder = holder;
        this.showShortDescription = z;
    }

    public final PredefinedUIServiceContentSection map() {
        StringBuilder sb = new StringBuilder();
        if (this.showShortDescription) {
            sb.append(this.holder.getCookieInformationLabels().getStorageInformationDescription());
            sb.append("\n\n");
        }
        Boolean usesCookies = this.holder.getUsesCookies();
        if (usesCookies != null) {
            sb.append("• " + this.holder.getCookieInformationLabels().getCookieStorage() + ": " + (usesCookies.booleanValue() ? this.holder.getCookieInformationLabels().getYes() : this.holder.getCookieInformationLabels().getNo()) + "\n");
        }
        appendCookiesInformation(sb);
        sb.append("• " + this.holder.getCookieInformationLabels().getNonCookieStorage() + ": " + (Intrinsics.areEqual((Object) this.holder.getUsesNonCookieAccess(), (Object) true) ? this.holder.getCookieInformationLabels().getYes() : this.holder.getCookieInformationLabels().getNo()));
        String title = this.holder.getCookieInformationLabels().getTitle();
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return new PredefinedUIServiceContentSection(title, new PredefinedUIStorageInformationServiceContent(sb2, storageInformationButtonInfo()));
    }

    private final void appendCookiesInformation(StringBuilder content) {
        if (this.holder.getCookieMaxAgeSeconds() != null) {
            content.append("• " + this.holder.getCookieInformationLabels().getMaximumAge() + ": " + this.holder.getCookieInformationLabels().cookieMaxAgeLabel(r0.longValue()));
            content.append("\n");
        }
        Boolean cookieRefresh = this.holder.getCookieRefresh();
        if (cookieRefresh != null) {
            content.append("• " + this.holder.getCookieInformationLabels().getCookieRefresh() + ": " + (cookieRefresh.booleanValue() ? this.holder.getCookieInformationLabels().getYes() : this.holder.getCookieInformationLabels().getNo()));
            content.append("\n");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if ((r4 == null || kotlin.text.StringsKt.isBlank(r4)) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PredefinedUIStorageInformationButtonInfo storageInformationButtonInfo() {
        List<ConsentDisclosure> disclosures;
        ConsentDisclosureObject deviceStorage = this.holder.getDeviceStorage();
        String deviceStorageDisclosureUrl = this.holder.getDeviceStorageDisclosureUrl();
        String forceHttps = deviceStorageDisclosureUrl != null ? CommonKt.forceHttps(deviceStorageDisclosureUrl) : null;
        boolean z = true;
        if ((deviceStorage == null || (disclosures = deviceStorage.getDisclosures()) == null) ? true : disclosures.isEmpty()) {
            String str = forceHttps;
        }
        z = false;
        if (z) {
            return null;
        }
        return new PredefinedUIStorageInformationButtonInfo(this.holder.getCookieInformationLabels().getTitleDetailed(), forceHttps, mapDeviceStorageContent(deviceStorage));
    }

    private final List<PredefinedUIDeviceStorageContent> mapDeviceStorageContent(ConsentDisclosureObject deviceStorage) {
        if (deviceStorage == null) {
            return null;
        }
        return new DeviceStorageMapper(deviceStorage, this.holder.getCookieInformationLabels(), MapsKt.emptyMap()).map();
    }
}
