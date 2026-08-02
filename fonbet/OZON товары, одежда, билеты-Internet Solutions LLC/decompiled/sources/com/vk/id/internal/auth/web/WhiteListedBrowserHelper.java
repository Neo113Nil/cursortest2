package com.vk.id.internal.auth.web;

import android.util.Log;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vk/id/internal/auth/web/WhiteListedBrowserHelper;", "", "<init>", "()V", "WHITE_LIST", "", "Lcom/vk/id/internal/auth/web/VersionedBrowserMatcher;", "selectBestBrowser", "Lcom/vk/id/internal/auth/web/BrowserDescriptor;", "pm", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WhiteListedBrowserHelper {

    @NotNull
    public static final WhiteListedBrowserHelper INSTANCE = new WhiteListedBrowserHelper();

    @NotNull
    private static final List<VersionedBrowserMatcher> WHITE_LIST = C7714v.b0(VersionedBrowserMatcher.CHROME_BROWSER, VersionedBrowserMatcher.CHROME_CUSTOM_TAB, VersionedBrowserMatcher.FIREFOX_CUSTOM_TAB, VersionedBrowserMatcher.FIREFOX_BROWSER, VersionedBrowserMatcher.SAMSUNG_BROWSER, VersionedBrowserMatcher.SAMSUNG_CUSTOM_TAB);
    public static final int $stable = 8;

    private WhiteListedBrowserHelper() {
    }

    public final BrowserDescriptor selectBestBrowser(@NotNull InternalVKIDPackageManager pm) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        try {
            List<BrowserDescriptor> allBrowsers = BrowserSelector.INSTANCE.getAllBrowsers(pm);
            for (BrowserDescriptor browserDescriptor : allBrowsers) {
                Iterator<VersionedBrowserMatcher> it = WHITE_LIST.iterator();
                while (it.hasNext()) {
                    if (it.next().matches(browserDescriptor)) {
                        return browserDescriptor;
                    }
                }
            }
            if (allBrowsers.isEmpty()) {
                return null;
            }
            return allBrowsers.get(0);
        } catch (Exception e11) {
            Log.e("BrowserSelector", "Exception in select browser", e11);
            return null;
        }
    }
}
