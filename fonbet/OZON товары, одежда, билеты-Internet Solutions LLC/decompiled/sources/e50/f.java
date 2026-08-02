package e50;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinImageV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemV20DTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import t40.EnumC9752b;
import u50.InterfaceC9967b;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9967b f62016a;

    public f(@NotNull InterfaceC9967b snackbarDisplay) {
        Intrinsics.checkNotNullParameter(snackbarDisplay, "snackbarDisplay");
        this.f62016a = snackbarDisplay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static Cbottom2SnackDTO a(int i11, @NotNull String text, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String value = StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY.getValue();
        List b02 = C7714v.b0(20, 20, 20, 20);
        List b03 = C7714v.b0(8, 8, 8, 8);
        EnumC9752b enumC9752b = EnumC9752b.CENTER;
        int i12 = 48;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        String str2 = null;
        Map map = null;
        Integer num5 = null;
        List list2 = null;
        F40.a[] aVarArr = {new FinImageV20DTO(null, "FinImageV20DTO", null, bool, bool2, bool3, null, i12, i12, num, null, null, null, C7714v.b0(enumC9752b, enumC9752b), null, list, C7714v.b0(16, 16, 16, 16), StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEGATIVE_PALE.getValue(), null, null, null, num2, num3, num4, null, null, null, null, icon, null, StyleParser.OzColor.OZ_SEMANTIC_TEXT_NEGATIVE.getValue(), null, str, str2, null, map, null, -1342382467, 31, null), new TextItemV20DTO(null, "TextItemV20DTO", null, null == true ? 1 : 0, bool, bool2, bool3, null == true ? 1 : 0, null, num5, num, null == true ? 1 : 0, C7714v.b0(8, 0, 0, 0), C7714v.b0(enumC9752b, enumC9752b), null, null == true ? 1 : 0, list, null, list2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num2, num3, num4, null == true ? 1 : 0, null == true ? 1 : 0, text, StyleParser.TextStyle.BODY_L.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), null == true ? 1 : 0, null, null == true ? 1 : 0, str, str2, null == true ? 1 : 0, map, -939536387, 31, null)};
        List list3 = null;
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        Object[] objArr5 = null == true ? 1 : 0;
        Object[] objArr6 = null == true ? 1 : 0;
        Object[] objArr7 = null == true ? 1 : 0;
        Object[] objArr8 = null == true ? 1 : 0;
        Object[] objArr9 = null == true ? 1 : 0;
        Object[] objArr10 = null == true ? 1 : 0;
        List a02 = C7714v.a0(new RowV20DTO(null, "SHACK_SNACKBAR_ID", null == true ? 1 : 0, objArr, bool, bool2, bool3, -1, -2, num5, num, objArr2, list3, null, null == true ? 1 : 0, b03, b02, value, list2, objArr3, objArr4, objArr5, num2, num3, num4, objArr6, objArr7, C7714v.b0(aVarArr), null, null, objArr8, null == true ? 1 : 0, objArr9, -134447491, 1, objArr10));
        int i13 = 1;
        Integer valueOf = Integer.valueOf(i11);
        String str3 = "SHACK_ID";
        boolean z11 = false;
        boolean z12 = true;
        Object[] objArr11 = null == true ? 1 : 0;
        return new Cbottom2SnackDTO(str3, null == true ? 1 : 0, i13, a02, z11, z12, valueOf, 0, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, true, objArr11, list3, null == true ? 1 : 0, null == true ? 1 : 0, 15362, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static Cbottom2SnackDTO b(int i11, @NotNull String text, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String value = StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY.getValue();
        List b02 = C7714v.b0(20, 20, 20, 20);
        List b03 = C7714v.b0(8, 8, 8, 8);
        EnumC9752b enumC9752b = EnumC9752b.CENTER;
        int i12 = 48;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        Map map = null;
        FinImageV20DTO finImageV20DTO = new FinImageV20DTO(null, "FinImageV20DTO", null, bool, bool2, bool3, null, i12, i12, num, null, null, null, C7714v.b0(enumC9752b, enumC9752b), null, list, C7714v.b0(16, 16, 16, 16), StyleParser.OzColor.OZ_SEMANTIC_CTRL_POSITIVE_PALE.getValue(), null, null, null, null, num2, num3, null, null, null, null, icon, null, StyleParser.OzColor.OZ_SEMANTIC_TEXT_POSITIVE.getValue(), null, str, str2, null, map, null, -1342382467, 31, null);
        List b04 = C7714v.b0(enumC9752b, enumC9752b);
        Integer num4 = null;
        Integer num5 = null;
        Float f7 = null;
        List list2 = null;
        Integer num6 = null;
        F40.a[] aVarArr = {finImageV20DTO, new TextItemV20DTO(null, "TextItemV20DTO", num4, null == true ? 1 : 0, bool, bool2, bool3, null == true ? 1 : 0, null, num5, num, null == true ? 1 : 0, C7714v.b0(8, 0, 0, 0), b04, f7, null == true ? 1 : 0, list, null, list2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num6, num2, num3, null == true ? 1 : 0, null == true ? 1 : 0, text, StyleParser.TextStyle.BODY_L.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), null == true ? 1 : 0, null, null == true ? 1 : 0, str, str2, null == true ? 1 : 0, map, -939536387, 31, null)};
        return new Cbottom2SnackDTO("SHACK_ID", null, 1, C7714v.a0(new RowV20DTO(null, "SHACK_SNACKBAR_ID", num4, null == true ? 1 : 0, bool, bool2, bool3, -1, -2, num5, num, null == true ? 1 : 0, null, null, f7, b03, b02, value, list2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num6, num2, num3, null == true ? 1 : 0, null == true ? 1 : 0, C7714v.b0(aVarArr), null, null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, -134447491, 1, null == true ? 1 : 0)), false, true, Integer.valueOf(i11), 0, 2000, true, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 15362, null == true ? 1 : 0);
    }

    public final void c(Cbottom2SnackDTO cbottom2SnackDTO, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f62016a.d(cbottom2SnackDTO, uuid);
    }
}
