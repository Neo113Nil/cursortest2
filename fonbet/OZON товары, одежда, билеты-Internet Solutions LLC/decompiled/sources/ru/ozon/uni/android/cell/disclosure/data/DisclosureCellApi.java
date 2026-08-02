package ru.ozon.uni.android.cell.disclosure.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/data/DisclosureCellApi;", "", "", "color", "", "alpha", "", "setDisclosureIconColor", "(IF)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DisclosureCellApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void setDisclosureIconColor$default(DisclosureCellApi disclosureCellApi, int i11, float f7, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDisclosureIconColor");
            }
            if ((i12 & 2) != 0) {
                f7 = 1.0f;
            }
            disclosureCellApi.setDisclosureIconColor(i11, f7);
        }
    }

    void setDisclosureIconColor(int color, float alpha);
}
