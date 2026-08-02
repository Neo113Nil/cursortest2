package com.vk.catalog2.common.ui.mvp.holder.placeholder;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vkontakte.android.R;
import org.chromium.base.version_info.VersionConstants;
import xsna.nda;

/* compiled from: ImageWarningPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class ImageWarningPlaceholderVh extends PlaceholderVh {

    /* compiled from: ImageWarningPlaceholderVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.PLACEHOLDER_IMAGE_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageWarningPlaceholderVh(com.vk.catalog2.common.ui.mvp.util.a aVar, nda ndaVar) {
        super(aVar, false, false, null, null, R.layout.catalog_image_warning_placeholder_view, ndaVar, 0, VersionConstants.PRODUCT_MAJOR_VERSION);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh
    public final int b(UIBlockPlaceholder uIBlockPlaceholder) {
        if (a.$EnumSwitchMapping$0[uIBlockPlaceholder.d.ordinal()] == 1) {
            return 100;
        }
        return super.b(uIBlockPlaceholder);
    }
}
