package zendesk.core;

import androidx.annotation.NonNull;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class ZendeskLocaleConverter {
    private static final Map<String, String> forwardLookupMap;

    static {
        HashMap hashMap = new HashMap();
        forwardLookupMap = hashMap;
        hashMap.put("iw", "he");
        hashMap.put("nb", "no");
        hashMap.put("in", StackTraceHelper.ID_KEY);
        hashMap.put("ji", "yi");
    }

    @NonNull
    public String toHelpCenterLocaleString(Locale locale) {
        if (locale == null || !com.zendesk.util.d.a(locale.getLanguage())) {
            locale = Locale.getDefault();
        }
        String str = forwardLookupMap.get(locale.getLanguage());
        if (!com.zendesk.util.d.a(str)) {
            str = locale.getLanguage();
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (com.zendesk.util.d.a(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        return sb2.toString().toLowerCase();
    }
}
