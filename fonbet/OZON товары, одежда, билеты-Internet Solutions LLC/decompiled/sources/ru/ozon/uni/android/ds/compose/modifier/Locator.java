package ru.ozon.uni.android.ds.compose.modifier;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "locatorTag", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Locator implements AtomLocatableView {

    @NotNull
    private String locatorTag;

    public Locator(TestInfo testInfo, @NotNull String defaultTag) {
        String automatizationId;
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        if (testInfo != null && (automatizationId = testInfo.getAutomatizationId()) != null) {
            defaultTag = automatizationId;
        }
        this.locatorTag = defaultTag;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locatorTag = str;
    }
}
