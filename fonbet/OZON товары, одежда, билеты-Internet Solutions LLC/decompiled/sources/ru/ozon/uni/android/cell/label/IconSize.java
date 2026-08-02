package ru.ozon.uni.android.cell.label;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/cell/label/IconSize;", "", "contains", "", "size", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getContains", "()Ljava/lang/String;", "getSize", "()I", "S", "M", "L", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IconSize[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String contains;
    private final int size;

    /* renamed from: S, reason: collision with root package name */
    public static final IconSize f97905S = new IconSize("S", 0, "ic_s_", UiExtKt.toPx(16));

    /* renamed from: M, reason: collision with root package name */
    public static final IconSize f97904M = new IconSize("M", 1, "ic_m_", UiExtKt.toPx(24));

    /* renamed from: L, reason: collision with root package name */
    public static final IconSize f97903L = new IconSize("L", 2, "ic_l_", UiExtKt.toPx(32));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/cell/label/IconSize$Companion;", "", "<init>", "()V", "getSizeIcon", "", "", "getSizeIcon$uni_release", "(Ljava/lang/String;)Ljava/lang/Integer;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer getSizeIcon$uni_release(String str) {
            String k02 = str != null ? h.k0(str, "/", str) : null;
            if (k02 != null) {
                IconSize iconSize = IconSize.f97905S;
                if (h.e0(k02, iconSize.getContains(), false)) {
                    return Integer.valueOf(iconSize.getSize());
                }
            }
            if (k02 != null) {
                IconSize iconSize2 = IconSize.f97904M;
                if (h.e0(k02, iconSize2.getContains(), false)) {
                    return Integer.valueOf(iconSize2.getSize());
                }
            }
            if (k02 != null) {
                IconSize iconSize3 = IconSize.f97903L;
                if (h.e0(k02, iconSize3.getContains(), false)) {
                    return Integer.valueOf(iconSize3.getSize());
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ IconSize[] $values() {
        return new IconSize[]{f97905S, f97904M, f97903L};
    }

    static {
        IconSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
    }

    private IconSize(String str, int i11, String str2, int i12) {
        this.contains = str2;
        this.size = i12;
    }

    public static IconSize valueOf(String str) {
        return (IconSize) Enum.valueOf(IconSize.class, str);
    }

    public static IconSize[] values() {
        return (IconSize[]) $VALUES.clone();
    }

    @NotNull
    public final String getContains() {
        return this.contains;
    }

    public final int getSize() {
        return this.size;
    }
}
