package ru.ozon.app.android.product.labelList.presentation.vo;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/vo/IconDefaultSize;", "", "prefix", "", "valuePx", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "S", "M", "L", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconDefaultSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IconDefaultSize[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: L, reason: collision with root package name */
    public static final IconDefaultSize f93229L;

    /* renamed from: M, reason: collision with root package name */
    public static final IconDefaultSize f93230M;

    /* renamed from: S, reason: collision with root package name */
    public static final IconDefaultSize f93231S;

    @NotNull
    private final String prefix;
    private final int valuePx;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/labelList/presentation/vo/IconDefaultSize$Companion;", "", "<init>", "()V", "getValueFromIconName", "", "icon", "", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getValueFromIconName(@NotNull String icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            IconDefaultSize iconDefaultSize = IconDefaultSize.f93231S;
            if (h.e0(icon, iconDefaultSize.prefix, false)) {
                return iconDefaultSize.valuePx;
            }
            IconDefaultSize iconDefaultSize2 = IconDefaultSize.f93230M;
            if (h.e0(icon, iconDefaultSize2.prefix, false)) {
                return iconDefaultSize2.valuePx;
            }
            IconDefaultSize iconDefaultSize3 = IconDefaultSize.f93229L;
            return h.e0(icon, iconDefaultSize3.prefix, false) ? iconDefaultSize3.valuePx : iconDefaultSize.valuePx;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ IconDefaultSize[] $values() {
        return new IconDefaultSize[]{f93231S, f93230M, f93229L};
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        f93231S = new IconDefaultSize("S", 0, "ic_s_", dimens.getDP_16());
        f93230M = new IconDefaultSize("M", 1, "ic_m_", dimens.getDP_24());
        f93229L = new IconDefaultSize("L", 2, "ic_l_", dimens.getDP_32());
        IconDefaultSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
    }

    private IconDefaultSize(String str, int i11, String str2, int i12) {
        this.prefix = str2;
        this.valuePx = i12;
    }

    public static IconDefaultSize valueOf(String str) {
        return (IconDefaultSize) Enum.valueOf(IconDefaultSize.class, str);
    }

    public static IconDefaultSize[] values() {
        return (IconDefaultSize[]) $VALUES.clone();
    }
}
