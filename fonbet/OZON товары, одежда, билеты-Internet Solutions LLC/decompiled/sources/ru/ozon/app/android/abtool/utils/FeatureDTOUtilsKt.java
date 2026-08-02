package ru.ozon.app.android.abtool.utils;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b²\u0006\u000e\u0010\t\u001a\u00060\nj\u0002`\u000bX\u008a\u0084\u0002"}, d2 = {"featureFlagDisplayedName", "", "description", "ticketUrl", "epicUrl", "createTitle", "withBr", "", "abzone-api_release", SelectionItemFormDTO.TITLE_FIELD_NAME, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureDTOUtilsKt {
    private static final String createTitle(String str, boolean z11) {
        String str2;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            int length = str.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (str.charAt(length) == '/') {
                        break;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
            length = -1;
            if (length != -1) {
                str2 = str.substring(length + 1);
                Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
            } else {
                str2 = str;
            }
            String str3 = (z11 ? "<br>" : "") + "<a href='" + str + "'>" + str2 + "</a>";
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    static /* synthetic */ String createTitle$default(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return createTitle(str, z11);
    }

    @NotNull
    public static final String featureFlagDisplayedName(@NotNull String description, String str, String str2) {
        Intrinsics.checkNotNullParameter(description, "description");
        if (str == null && str2 == null) {
            return description;
        }
        InterfaceC4008j a11 = k.a(n.NONE, FeatureDTOUtilsKt$featureFlagDisplayedName$title$2.INSTANCE);
        if (str != null) {
            StringBuilder featureFlagDisplayedName$lambda$0 = featureFlagDisplayedName$lambda$0(a11);
            featureFlagDisplayedName$lambda$0.append(" ");
            featureFlagDisplayedName$lambda$0.append(createTitle(str, true));
            if (str2 != null) {
                featureFlagDisplayedName$lambda$0(a11).append(" / ");
            }
        }
        if (str2 != null) {
            featureFlagDisplayedName$lambda$0(a11).append(createTitle$default(str2, false, 1, null));
        }
        return description + ((Object) featureFlagDisplayedName$lambda$0(a11));
    }

    public static /* synthetic */ String featureFlagDisplayedName$default(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return featureFlagDisplayedName(str, str2, str3);
    }

    private static final StringBuilder featureFlagDisplayedName$lambda$0(InterfaceC4008j<StringBuilder> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }
}
