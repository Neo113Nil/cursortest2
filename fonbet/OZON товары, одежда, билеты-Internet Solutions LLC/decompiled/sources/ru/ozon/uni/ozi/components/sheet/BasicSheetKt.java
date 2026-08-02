package ru.ozon.uni.ozi.components.sheet;

import S0.G0;
import S0.O;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\"\"\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000f²\u0006\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LS0/G0;", "Lru/ozon/uni/ozi/components/sheet/OziBottomSheetInfo;", "LocalOziBottomSheetInfo", "LS0/G0;", "getLocalOziBottomSheetInfo", "()LS0/G0;", "LZ1/h;", "SafeArea", "F", "getSafeArea", "()F", "CutoffHeight", "", "", "flexibleHeights", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BasicSheetKt {

    @NotNull
    private static final G0<OziBottomSheetInfo> LocalOziBottomSheetInfo = new O(BasicSheetKt$LocalOziBottomSheetInfo$1.INSTANCE);
    private static final float SafeArea = 15;
    private static final float CutoffHeight = 4;

    @NotNull
    public static final G0<OziBottomSheetInfo> getLocalOziBottomSheetInfo() {
        return LocalOziBottomSheetInfo;
    }
}
