package com.usercentrics.sdk.v2.banner.service.mapper.tcf.storageinfo;

import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIDeviceStorageContent;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosure;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureType;
import com.usercentrics.tcf.core.model.gvl.Purpose;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceStorageMapper.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/usercentrics/sdk/v2/banner/service/mapper/tcf/storageinfo/DeviceStorageMapper;", "", "deviceStorage", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;", "cookieInformationLabels", "Lcom/usercentrics/sdk/models/settings/PredefinedUICookieInformationLabels;", "purposes", "", "", "Lcom/usercentrics/tcf/core/model/gvl/Purpose;", "(Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Lcom/usercentrics/sdk/models/settings/PredefinedUICookieInformationLabels;Ljava/util/Map;)V", "map", "", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDeviceStorageContent;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceStorageMapper {
    private final PredefinedUICookieInformationLabels cookieInformationLabels;
    private final ConsentDisclosureObject deviceStorage;
    private final Map<String, Purpose> purposes;

    public DeviceStorageMapper(ConsentDisclosureObject deviceStorage, PredefinedUICookieInformationLabels cookieInformationLabels, Map<String, Purpose> purposes) {
        Intrinsics.checkNotNullParameter(deviceStorage, "deviceStorage");
        Intrinsics.checkNotNullParameter(cookieInformationLabels, "cookieInformationLabels");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.deviceStorage = deviceStorage;
        this.cookieInformationLabels = cookieInformationLabels;
        this.purposes = purposes;
    }

    public final List<PredefinedUIDeviceStorageContent> map() {
        String str;
        List<ConsentDisclosure> disclosures = this.deviceStorage.getDisclosures();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(disclosures, 10));
        for (ConsentDisclosure consentDisclosure : disclosures) {
            ArrayList arrayList2 = new ArrayList();
            ConsentDisclosureType type = consentDisclosure.getType();
            if (type != null) {
                String type2 = this.cookieInformationLabels.getType();
                String lowerCase = type.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList2.add(type2 + ": " + lowerCase);
            }
            if (consentDisclosure.getType() == ConsentDisclosureType.COOKIE) {
                Long maxAgeSeconds = consentDisclosure.getMaxAgeSeconds();
                long longValue = maxAgeSeconds != null ? maxAgeSeconds.longValue() : 0L;
                if (longValue > 0) {
                    str = this.cookieInformationLabels.cookieMaxAgeLabel(longValue);
                } else {
                    str = "-";
                }
                arrayList2.add(this.cookieInformationLabels.getDuration() + ": " + str);
                arrayList2.add(this.cookieInformationLabels.getCookieRefresh() + ": " + (consentDisclosure.getCookieRefresh() ? this.cookieInformationLabels.getYes() : this.cookieInformationLabels.getNo()));
            }
            String domain = consentDisclosure.getDomain();
            String str2 = "";
            if (domain == null) {
                domain = "";
            }
            String str3 = domain;
            if (!StringsKt.isBlank(str3)) {
                if (Intrinsics.areEqual(consentDisclosure.getDomain(), "*")) {
                    domain = this.cookieInformationLabels.getAnyDomain();
                } else if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "*", false, 2, (Object) null)) {
                    domain = this.cookieInformationLabels.getMultipleDomains();
                }
                arrayList2.add(this.cookieInformationLabels.getDomain() + ": " + domain);
            }
            List<Integer> purposes = consentDisclosure.getPurposes();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = purposes.iterator();
            while (it.hasNext()) {
                Purpose purpose = this.purposes.get(String.valueOf(((Number) it.next()).intValue()));
                String name = purpose != null ? purpose.getName() : null;
                if (name != null) {
                    arrayList3.add(name);
                }
            }
            String joinToString$default = CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.usercentrics.sdk.v2.banner.service.mapper.tcf.storageinfo.DeviceStorageMapper$map$1$purposes$2
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(String it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return it2;
                }
            }, 31, null);
            if (!StringsKt.isBlank(joinToString$default)) {
                arrayList2.add(this.cookieInformationLabels.getPurposes() + ": " + joinToString$default);
            }
            String identifier = consentDisclosure.getIdentifier();
            if (identifier == null || StringsKt.isBlank(identifier)) {
                String name2 = consentDisclosure.getName();
                if (name2 != null) {
                    str2 = name2;
                }
            } else {
                str2 = consentDisclosure.getIdentifier();
            }
            arrayList.add(new PredefinedUIDeviceStorageContent(this.cookieInformationLabels.getIdentifier() + ": " + str2, arrayList2));
        }
        return arrayList;
    }
}
