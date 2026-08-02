package ru.ozon.uni.android.ds;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000b¨\u0006%"}, d2 = {"Lru/ozon/uni/android/ds/UniGlobalConfig;", "", "<init>", "()V", "", "<set-?>", "testTagsAsContentDescription$delegate", "LS0/p0;", "getTestTagsAsContentDescription", "()Z", "setTestTagsAsContentDescription", "(Z)V", "testTagsAsContentDescription", "Lkotlin/Function1;", "", "urlSpanClickHandler", "Lkotlin/jvm/functions/Function1;", "getUrlSpanClickHandler", "()Lkotlin/jvm/functions/Function1;", "setUrlSpanClickHandler", "(Lkotlin/jvm/functions/Function1;)V", "enableTestTags", "Z", "getEnableTestTags", "setEnableTestTags", "enableStrictMode", "getEnableStrictMode", "setEnableStrictMode", "testTagsAsResourceId", "getTestTagsAsResourceId", "setTestTagsAsResourceId", "enablePackageNamePrefixInTestTags", "getEnablePackageNamePrefixInTestTags", "setEnablePackageNamePrefixInTestTags", "removeExtraHtmlParsingNewLines", "getRemoveExtraHtmlParsingNewLines", "setRemoveExtraHtmlParsingNewLines", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniGlobalConfig {
    public static final int $stable;

    @NotNull
    public static final UniGlobalConfig INSTANCE = new UniGlobalConfig();
    private static boolean enablePackageNamePrefixInTestTags;
    private static boolean enableStrictMode;
    private static boolean enableTestTags;
    private static boolean removeExtraHtmlParsingNewLines;

    /* renamed from: testTagsAsContentDescription$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC3978p0 testTagsAsContentDescription;
    private static boolean testTagsAsResourceId;
    private static Function1<? super String, ? extends Object> urlSpanClickHandler;

    static {
        C3991w0 f7;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        testTagsAsContentDescription = f7;
        enableStrictMode = true;
        $stable = 8;
    }

    private UniGlobalConfig() {
    }

    public final boolean getEnablePackageNamePrefixInTestTags() {
        return enablePackageNamePrefixInTestTags;
    }

    public final boolean getEnableStrictMode() {
        return enableStrictMode;
    }

    public final boolean getEnableTestTags() {
        return enableTestTags;
    }

    public final boolean getRemoveExtraHtmlParsingNewLines() {
        return removeExtraHtmlParsingNewLines;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getTestTagsAsContentDescription() {
        return ((Boolean) testTagsAsContentDescription.getValue()).booleanValue();
    }

    public final boolean getTestTagsAsResourceId() {
        return testTagsAsResourceId;
    }

    public final Function1<String, Object> getUrlSpanClickHandler() {
        return urlSpanClickHandler;
    }

    public final void setEnableTestTags(boolean z11) {
        enableTestTags = z11;
    }

    public final void setTestTagsAsContentDescription(boolean z11) {
        testTagsAsContentDescription.setValue(Boolean.valueOf(z11));
    }

    public final void setTestTagsAsResourceId(boolean z11) {
        testTagsAsResourceId = z11;
    }

    public final void setUrlSpanClickHandler(Function1<? super String, ? extends Object> function1) {
        urlSpanClickHandler = function1;
    }
}
