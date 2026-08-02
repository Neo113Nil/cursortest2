package ru.ozon.uni.android.cell.text;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/cell/text/TextFieldCellApi;", "", "", "color", "", "alpha", "", "setLabelColor", "(IF)V", "", "isActive", "hidePassword", "inputHasPassword", "(ZZ)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TextFieldCellApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void inputHasPassword$default(TextFieldCellApi textFieldCellApi, boolean z11, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inputHasPassword");
            }
            if ((i11 & 2) != 0) {
                z12 = true;
            }
            textFieldCellApi.inputHasPassword(z11, z12);
        }

        public static /* synthetic */ void setLabelColor$default(TextFieldCellApi textFieldCellApi, int i11, float f7, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLabelColor");
            }
            if ((i12 & 2) != 0) {
                f7 = 1.0f;
            }
            textFieldCellApi.setLabelColor(i11, f7);
        }
    }

    void inputHasPassword(boolean isActive, boolean hidePassword);

    void setLabelColor(int color, float alpha);
}
