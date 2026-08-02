package com.vk.id.analytics.param;

import android.content.Context;
import com.vk.id.analytics.VKIDAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"vkidInternalLanguageParam", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "context", "Landroid/content/Context;", "analytics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LanguageParamKt {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r7.equals("ru") == false) goto L45;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final VKIDAnalytics.EventParam vkidInternalLanguageParam(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = 0;
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        if (language != null) {
            int hashCode = language.hashCode();
            if (hashCode != 3201) {
                if (hashCode == 3241) {
                    language.equals("en");
                } else if (hashCode != 3246) {
                    if (hashCode != 3276) {
                        if (hashCode != 3580) {
                            if (hashCode != 3651) {
                                if (hashCode != 3710) {
                                    if (hashCode == 3734 && language.equals("uk")) {
                                        i11 = 1;
                                    }
                                } else if (language.equals("tr")) {
                                    i11 = 82;
                                }
                            }
                        } else if (language.equals("pl")) {
                            i11 = 15;
                        }
                    } else if (language.equals("fr")) {
                        i11 = 16;
                    }
                } else if (language.equals("es")) {
                    i11 = 4;
                }
            } else if (language.equals("de")) {
                i11 = 6;
            }
            return new VKIDAnalytics.EventParam("language", String.valueOf(i11), null, 4, null);
        }
        i11 = 3;
        return new VKIDAnalytics.EventParam("language", String.valueOf(i11), null, 4, null);
    }
}
