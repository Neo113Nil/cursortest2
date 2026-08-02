package com.vk.id.internal.auth.web;

import com.vk.id.internal.auth.web.VersionRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/vk/id/internal/auth/web/VersionedBrowserMatcher;", "Lcom/vk/id/internal/auth/web/BrowserMatcher;", "", "mPackageName", "", "mSignatureHashes", "", "mUsingCustomTab", "Lcom/vk/id/internal/auth/web/VersionRange;", "mVersionRange", "<init>", "(Ljava/lang/String;Ljava/util/Set;ZLcom/vk/id/internal/auth/web/VersionRange;)V", "Lcom/vk/id/internal/auth/web/BrowserDescriptor;", "descriptor", "matches", "(Lcom/vk/id/internal/auth/web/BrowserDescriptor;)Z", "Ljava/lang/String;", "Ljava/util/Set;", "Z", "Lcom/vk/id/internal/auth/web/VersionRange;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VersionedBrowserMatcher implements BrowserMatcher {

    @NotNull
    private static final BrowserMatcher ANY_BROWSER;

    @NotNull
    public static final VersionedBrowserMatcher CHROME_BROWSER;

    @NotNull
    public static final VersionedBrowserMatcher CHROME_CUSTOM_TAB;

    @NotNull
    public static final VersionedBrowserMatcher FIREFOX_BROWSER;

    @NotNull
    public static final VersionedBrowserMatcher FIREFOX_CUSTOM_TAB;

    @NotNull
    public static final VersionedBrowserMatcher SAMSUNG_BROWSER;

    @NotNull
    public static final VersionedBrowserMatcher SAMSUNG_CUSTOM_TAB;

    @NotNull
    private final String mPackageName;

    @NotNull
    private final Set<String> mSignatureHashes;
    private final boolean mUsingCustomTab;

    @NotNull
    private final VersionRange mVersionRange;
    public static final int $stable = 8;

    static {
        Set<String> set = Browsers$Chrome.SIGNATURE_SET;
        VersionRange.Companion companion = VersionRange.INSTANCE;
        CHROME_CUSTOM_TAB = new VersionedBrowserMatcher("com.android.chrome", set, true, companion.atLeast(Browsers$Chrome.MINIMUM_VERSION_FOR_CUSTOM_TAB));
        VersionRange versionRange = VersionRange.ANY_VERSION;
        CHROME_BROWSER = new VersionedBrowserMatcher("com.android.chrome", set, false, versionRange);
        Set<String> set2 = Browsers$Firefox.SIGNATURE_SET;
        FIREFOX_CUSTOM_TAB = new VersionedBrowserMatcher("org.mozilla.firefox", set2, true, companion.atLeast(Browsers$Firefox.MINIMUM_VERSION_FOR_CUSTOM_TAB));
        FIREFOX_BROWSER = new VersionedBrowserMatcher("org.mozilla.firefox", set2, false, versionRange);
        Set<String> set3 = Browsers$SBrowser.SIGNATURE_SET;
        SAMSUNG_BROWSER = new VersionedBrowserMatcher("com.sec.android.app.sbrowser", set3, false, versionRange);
        ANY_BROWSER = new BrowserMatcher() { // from class: com.vk.id.internal.auth.web.VersionedBrowserMatcher$Companion$ANY_BROWSER$1
        };
        SAMSUNG_CUSTOM_TAB = new VersionedBrowserMatcher("com.sec.android.app.sbrowser", set3, true, companion.atLeast(Browsers$SBrowser.MINIMUM_VERSION_FOR_CUSTOM_TAB));
    }

    public VersionedBrowserMatcher(@NotNull String mPackageName, @NotNull Set<String> mSignatureHashes, boolean z11, @NotNull VersionRange mVersionRange) {
        Intrinsics.checkNotNullParameter(mPackageName, "mPackageName");
        Intrinsics.checkNotNullParameter(mSignatureHashes, "mSignatureHashes");
        Intrinsics.checkNotNullParameter(mVersionRange, "mVersionRange");
        this.mPackageName = mPackageName;
        this.mSignatureHashes = mSignatureHashes;
        this.mUsingCustomTab = z11;
        this.mVersionRange = mVersionRange;
    }

    public boolean matches(@NotNull BrowserDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.d(this.mPackageName, descriptor.getPackageName()) && this.mUsingCustomTab == descriptor.getUseCustomTab() && this.mVersionRange.matches(descriptor.getVersion()) && Intrinsics.d(this.mSignatureHashes, descriptor.getSignatureHashes());
    }
}
