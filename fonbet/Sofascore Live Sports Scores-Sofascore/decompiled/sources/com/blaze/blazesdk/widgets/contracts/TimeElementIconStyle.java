package com.blaze.blazesdk.widgets.contracts;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\ba\u0018\u00002\u00020\u0001:\u0001\rR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/widgets/contracts/TimeElementIconStyle;", "", "iconResId", "", "getIconResId", "()I", "setIconResId", "(I)V", "iconTint", "getIconTint", "()Ljava/lang/Integer;", "setIconTint", "(Ljava/lang/Integer;)V", "IconPositioning", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TimeElementIconStyle {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/blaze/blazesdk/widgets/contracts/TimeElementIconStyle$IconPositioning;", "", "<init>", "(Ljava/lang/String;I)V", "START", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPositioning {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ IconPositioning[] $VALUES;
        public static final IconPositioning START = new IconPositioning("START", 0);

        private static final /* synthetic */ IconPositioning[] $values() {
            return new IconPositioning[]{START};
        }

        static {
            IconPositioning[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private IconPositioning(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static IconPositioning valueOf(String str) {
            return (IconPositioning) Enum.valueOf(IconPositioning.class, str);
        }

        public static IconPositioning[] values() {
            return (IconPositioning[]) $VALUES.clone();
        }
    }

    int getIconResId();

    @Nullable
    Integer getIconTint();

    void setIconResId(int i);

    void setIconTint(@Nullable Integer num);
}
