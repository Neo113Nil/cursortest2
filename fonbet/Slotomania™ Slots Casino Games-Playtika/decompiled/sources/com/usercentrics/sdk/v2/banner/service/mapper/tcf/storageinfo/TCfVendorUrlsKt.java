package com.usercentrics.sdk.v2.banner.service.mapper.tcf.storageinfo;

import com.usercentrics.sdk.services.tcf.Constants;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.tcf.core.model.gvl.VendorUrl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TCfVendorUrls.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"getVendorUrls", "Lcom/usercentrics/tcf/core/model/gvl/VendorUrl;", "vendor", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "settings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "usercentrics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TCfVendorUrlsKt {
    public static final VendorUrl getVendorUrls(TCFVendor vendor, UsercentricsSettings settings) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Iterator<T> it = vendor.getVendorUrls().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((VendorUrl) obj).getLangId(), settings.getLanguage())) {
                break;
            }
        }
        VendorUrl vendorUrl = (VendorUrl) obj;
        Iterator<T> it2 = vendor.getVendorUrls().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(((VendorUrl) obj2).getLangId(), Constants.FALLBACK_LANGUAGE)) {
                break;
            }
        }
        VendorUrl vendorUrl2 = (VendorUrl) obj2;
        VendorUrl vendorUrl3 = (VendorUrl) CollectionsKt.firstOrNull((List) vendor.getVendorUrls());
        if (vendorUrl != null) {
            return vendorUrl;
        }
        if (vendorUrl2 != null) {
            return vendorUrl2;
        }
        if (vendorUrl3 == null) {
            return null;
        }
        return vendorUrl3;
    }
}
