package ru.ozon.uni.android.cell;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/cell/SubviewMetadata;", "", "initBlock", "Lkotlin/Function0;", "Landroid/view/View;", "position", "", "locatorTag", "", "<init>", "(Lkotlin/jvm/functions/Function0;ILjava/lang/String;)V", "getInitBlock", "()Lkotlin/jvm/functions/Function0;", "getPosition", "()I", "getLocatorTag", "()Ljava/lang/String;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SubviewMetadata {

    @NotNull
    private final Function0<View> initBlock;

    @NotNull
    private final String locatorTag;
    private final int position;

    /* JADX WARN: Multi-variable type inference failed */
    public SubviewMetadata(@NotNull Function0<? extends View> initBlock, int i11, @NotNull String locatorTag) {
        Intrinsics.checkNotNullParameter(initBlock, "initBlock");
        Intrinsics.checkNotNullParameter(locatorTag, "locatorTag");
        this.initBlock = initBlock;
        this.position = i11;
        this.locatorTag = locatorTag;
    }

    @NotNull
    public final Function0<View> getInitBlock() {
        return this.initBlock;
    }

    @NotNull
    public final String getLocatorTag() {
        return this.locatorTag;
    }

    public final int getPosition() {
        return this.position;
    }
}
