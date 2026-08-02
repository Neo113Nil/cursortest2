package ru.ozon.app.android.pikazon.imagePathHandler;

import Sc.InterfaceC3999a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;", "", "", "Lkotlin/text/Regex;", "imageResizeWhiteList", "", "isResizeParamsValidationRequired", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImageResizeWhiteList", "()Ljava/util/List;", "Z", "()Z", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ImagePathHandlerConfig {

    @NotNull
    private final List<Regex> imageResizeWhiteList;
    private final boolean isResizeParamsValidationRequired;

    public ImagePathHandlerConfig(@NotNull List<Regex> imageResizeWhiteList, boolean z11) {
        Intrinsics.checkNotNullParameter(imageResizeWhiteList, "imageResizeWhiteList");
        this.imageResizeWhiteList = imageResizeWhiteList;
        this.isResizeParamsValidationRequired = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImagePathHandlerConfig)) {
            return false;
        }
        ImagePathHandlerConfig imagePathHandlerConfig = (ImagePathHandlerConfig) other;
        return Intrinsics.d(this.imageResizeWhiteList, imagePathHandlerConfig.imageResizeWhiteList) && this.isResizeParamsValidationRequired == imagePathHandlerConfig.isResizeParamsValidationRequired;
    }

    @NotNull
    public final List<Regex> getImageResizeWhiteList() {
        return this.imageResizeWhiteList;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isResizeParamsValidationRequired) + (this.imageResizeWhiteList.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ImagePathHandlerConfig(imageResizeWhiteList=" + this.imageResizeWhiteList + ", isResizeParamsValidationRequired=" + this.isResizeParamsValidationRequired + ")";
    }
}
