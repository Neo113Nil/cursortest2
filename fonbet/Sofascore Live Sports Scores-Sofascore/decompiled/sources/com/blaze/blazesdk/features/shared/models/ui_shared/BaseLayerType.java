package com.blaze.blazesdk.features.shared.models.ui_shared;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/ui_shared/BaseLayerType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VIDEO", "IMAGE", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseLayerType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BaseLayerType[] $VALUES;

    @NotNull
    private final String value;

    @b6h("Video")
    public static final BaseLayerType VIDEO = new BaseLayerType("VIDEO", 0, "Video");

    @b6h("Image")
    public static final BaseLayerType IMAGE = new BaseLayerType("IMAGE", 1, "Image");

    private static final /* synthetic */ BaseLayerType[] $values() {
        return new BaseLayerType[]{VIDEO, IMAGE};
    }

    static {
        BaseLayerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BaseLayerType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BaseLayerType valueOf(String str) {
        return (BaseLayerType) Enum.valueOf(BaseLayerType.class, str);
    }

    public static BaseLayerType[] values() {
        return (BaseLayerType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
