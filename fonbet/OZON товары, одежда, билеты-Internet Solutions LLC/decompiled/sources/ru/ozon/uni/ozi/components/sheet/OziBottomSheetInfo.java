package ru.ozon.uni.ozi.components.sheet;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/uni/ozi/components/sheet/OziBottomSheetInfo;", "", "<init>", "()V", "", "<set-?>", "isKeyboardOpened$delegate", "LS0/p0;", "isKeyboardOpened$uni_release", "()Z", "setKeyboardOpened$uni_release", "(Z)V", "isKeyboardOpened", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziBottomSheetInfo {

    /* renamed from: isKeyboardOpened$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 isKeyboardOpened;

    public OziBottomSheetInfo() {
        C3991w0 f7;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.isKeyboardOpened = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isKeyboardOpened$uni_release() {
        return ((Boolean) this.isKeyboardOpened.getValue()).booleanValue();
    }
}
