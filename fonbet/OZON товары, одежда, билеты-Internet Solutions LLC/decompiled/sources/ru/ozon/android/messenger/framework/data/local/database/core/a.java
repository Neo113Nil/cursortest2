package ru.ozon.android.messenger.framework.data.local.database.core;

import android.text.Html;
import android.text.Spanned;
import com.squareup.moshi.JsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.json.JSONObject;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* loaded from: classes10.dex */
public final class a {
    private static String a(String str) {
        return h.X(h.X(h.X(str, "\n", "<br />", false), "\r", "<br />", false), " ", "&nbsp;", false);
    }

    public final Object b(JsonAdapter jsonAdapter, String jsonDto) {
        int i11;
        CustomBlockDTO customBlockDTO;
        Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
        Intrinsics.checkNotNullParameter(jsonDto, "jsonDto");
        CustomBlockDTO customBlockDTO2 = (CustomBlockDTO) jsonAdapter.fromJson(jsonDto);
        String string = new JSONObject(jsonDto).getJSONObject(SelectionItemFormDTO.TITLE_FIELD_NAME).getString("text");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String a11 = a(string);
        TextDTO textDTO = null;
        if (customBlockDTO2 != null) {
            TextDTO title = customBlockDTO2.getTitle();
            Spanned fromHtml = Html.fromHtml(a11, 0);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
            TextDTO copy$default = TextDTO.copy$default(title, OzonSpannableStringKt.toOzonSpannableString(fromHtml), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
            i11 = 0;
            customBlockDTO = CustomBlockDTO.copy$default(customBlockDTO2, null, copy$default, null, null, null, null, null, null, 253, null);
        } else {
            i11 = 0;
            customBlockDTO = null;
        }
        if ((customBlockDTO != null ? customBlockDTO.getSubtitle() : null) == null) {
            return customBlockDTO;
        }
        String string2 = new JSONObject(jsonDto).getJSONObject("subtitle").getString("text");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String a12 = a(string2);
        TextDTO subtitle = customBlockDTO.getSubtitle();
        if (subtitle != null) {
            Spanned fromHtml2 = Html.fromHtml(a12, i11);
            Intrinsics.checkNotNullExpressionValue(fromHtml2, "fromHtml(...)");
            textDTO = TextDTO.copy$default(subtitle, OzonSpannableStringKt.toOzonSpannableString(fromHtml2), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        }
        return CustomBlockDTO.copy$default(customBlockDTO, null, null, textDTO, null, null, null, null, null, 251, null);
    }
}
